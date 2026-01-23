package androidx.compose.foundation.pager;

import androidx.compose.foundation.Overscroll;
import androidx.compose.foundation.ScrollingContainer2;
import androidx.compose.foundation.gestures.BringIntoViewSpec;
import androidx.compose.foundation.gestures.BringIntoViewSpec_androidKt;
import androidx.compose.foundation.gestures.ForEachGesture;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.TapGestureDetector4;
import androidx.compose.foundation.gestures.TargetedFlingBehavior;
import androidx.compose.foundation.gestures.snapping.SnapPosition;
import androidx.compose.foundation.internal.InlineClassHelper;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.layout.LazyLayout2;
import androidx.compose.foundation.lazy.layout.LazyLayoutBeyondBoundsModifierLocal2;
import androidx.compose.foundation.lazy.layout.LazyLayoutKeyIndexMap2;
import androidx.compose.foundation.lazy.layout.LazyLayoutMeasureScope;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics;
import androidx.compose.foundation.lazy.layout.LazyLayoutSemantics2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier;
import androidx.compose.p011ui.input.nestedscroll.NestedScrollModifier7;
import androidx.compose.p011ui.input.pointer.AwaitPointerEventScope;
import androidx.compose.p011ui.input.pointer.PointerEvent;
import androidx.compose.p011ui.input.pointer.PointerEventKt;
import androidx.compose.p011ui.input.pointer.PointerEventPass;
import androidx.compose.p011ui.input.pointer.PointerInputChange;
import androidx.compose.p011ui.input.pointer.PointerInputEventHandler;
import androidx.compose.p011ui.input.pointer.PointerInputScope;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.PropertyReference0Impl;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty6;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: LazyLayoutPager.kt */
@Metadata(m3635d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001aã\u0001\u0010+\u001a\u00020&2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u00062\b\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u00152#\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00172\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010\"\u001a\u00020!2,\u0010(\u001a(\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b'H\u0001ø\u0001\u0000¢\u0006\u0004\b)\u0010*\u001a~\u0010/\u001a\b\u0012\u0004\u0012\u00020.0,2\u0006\u0010\u0003\u001a\u00020\u00022,\u0010(\u001a(\u0012\u0004\u0012\u00020$\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(%\u0012\u0004\u0012\u00020&0#¢\u0006\u0002\b'2#\u0010\u001c\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0018\u0012\b\b\u0019\u0012\u0004\b\b(\u001a\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00172\f\u0010-\u001a\b\u0012\u0004\u0012\u00020\u000f0,H\u0003¢\u0006\u0004\b/\u00100\u001a\u001b\u00101\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b1\u00102\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00063"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Landroidx/compose/foundation/pager/PagerState;", "state", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "", "reverseLayout", "Landroidx/compose/foundation/gestures/Orientation;", "orientation", "Landroidx/compose/foundation/gestures/TargetedFlingBehavior;", "flingBehavior", "userScrollEnabled", "Landroidx/compose/foundation/OverscrollEffect;", "overscrollEffect", "", "beyondViewportPageCount", "Landroidx/compose/ui/unit/Dp;", "pageSpacing", "Landroidx/compose/foundation/pager/PageSize;", "pageSize", "Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;", "pageNestedScrollConnection", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "", "key", "Landroidx/compose/ui/Alignment$Horizontal;", "horizontalAlignment", "Landroidx/compose/ui/Alignment$Vertical;", "verticalAlignment", "Landroidx/compose/foundation/gestures/snapping/SnapPosition;", "snapPosition", "Lkotlin/Function2;", "Landroidx/compose/foundation/pager/PagerScope;", "page", "", "Lkotlin/ExtensionFunctionType;", "pageContent", "Pager-eLwUrMk", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;Landroidx/compose/foundation/layout/PaddingValues;ZLandroidx/compose/foundation/gestures/Orientation;Landroidx/compose/foundation/gestures/TargetedFlingBehavior;ZLandroidx/compose/foundation/OverscrollEffect;IFLandroidx/compose/foundation/pager/PageSize;Landroidx/compose/ui/input/nestedscroll/NestedScrollConnection;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Alignment$Horizontal;Landroidx/compose/ui/Alignment$Vertical;Landroidx/compose/foundation/gestures/snapping/SnapPosition;Lkotlin/jvm/functions/Function4;Landroidx/compose/runtime/Composer;III)V", "Pager", "Lkotlin/Function0;", "pageCount", "Landroidx/compose/foundation/pager/PagerLazyLayoutItemProvider;", "rememberPagerItemProviderLambda", "(Landroidx/compose/foundation/pager/PagerState;Lkotlin/jvm/functions/Function4;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Lkotlin/jvm/functions/Function0;", "dragDirectionDetector", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/pager/PagerState;)Landroidx/compose/ui/Modifier;", "foundation_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes4.dex */
public final class LazyLayoutPagerKt {
    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0173  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x044c  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:268:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011c  */
    /* renamed from: Pager-eLwUrMk, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m5299PagereLwUrMk(final Modifier modifier, final PagerState pagerState, final PaddingValues paddingValues, final boolean z, final Orientation orientation, final TargetedFlingBehavior targetedFlingBehavior, final boolean z2, final Overscroll overscroll, int i, float f, final PageSize pageSize, NestedScrollModifier nestedScrollModifier, final Function1<? super Integer, ? extends Object> function1, final Alignment.Horizontal horizontal, final Alignment.Vertical vertical, final SnapPosition snapPosition, final Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Composer composer, final int i2, final int i3, final int i4) {
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        Composer composer2;
        final float f2;
        final int i12;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        boolean z3;
        float fM7995constructorimpl;
        Modifier modifierLazyLayoutBeyondBoundsModifier;
        final PagerState pagerState2 = pagerState;
        NestedScrollModifier nestedScrollModifier2 = nestedScrollModifier;
        Composer composerStartRestartGroup = composer.startRestartGroup(1125194810);
        if ((i4 & 1) != 0) {
            i5 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i5 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i2;
        } else {
            i5 = i2;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i2 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(pagerState2) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
        } else {
            if ((i2 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(paddingValues) ? 256 : 128;
            }
            if ((i4 & 8) == 0) {
                i5 |= 3072;
            } else if ((i2 & 3072) == 0) {
                i5 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
            }
            if ((i4 & 16) == 0) {
                i5 |= 24576;
            } else if ((i2 & 24576) == 0) {
                i5 |= composerStartRestartGroup.changed(orientation) ? 16384 : 8192;
            }
            if ((i4 & 32) == 0) {
                i5 |= 196608;
            } else if ((i2 & 196608) == 0) {
                i5 |= composerStartRestartGroup.changed(targetedFlingBehavior) ? 131072 : 65536;
            }
            if ((i4 & 64) == 0) {
                i5 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i5 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
            }
            if ((i4 & 128) == 0) {
                i5 |= 12582912;
            } else {
                if ((12582912 & i2) == 0) {
                    i5 |= composerStartRestartGroup.changed(overscroll) ? 8388608 : 4194304;
                }
                i6 = i4 & 256;
                if (i6 != 0) {
                    i5 |= 100663296;
                    i7 = i;
                } else {
                    i7 = i;
                    if ((i2 & 100663296) == 0) {
                        i5 |= composerStartRestartGroup.changed(i7) ? 67108864 : 33554432;
                    }
                }
                i8 = i4 & 512;
                if (i8 != 0) {
                    i5 |= 805306368;
                } else if ((i2 & 805306368) == 0) {
                    i5 |= composerStartRestartGroup.changed(f) ? 536870912 : 268435456;
                }
                if ((i4 & 1024) != 0) {
                    i9 = i3 | 6;
                } else if ((i3 & 6) == 0) {
                    i9 = i3 | (composerStartRestartGroup.changed(pageSize) ? 4 : 2);
                } else {
                    i9 = i3;
                }
                if ((i4 & 2048) != 0) {
                    i9 |= 48;
                } else if ((i3 & 48) == 0) {
                    i9 |= composerStartRestartGroup.changedInstance(nestedScrollModifier2) ? 32 : 16;
                }
                int i13 = i9;
                if ((i4 & 4096) != 0) {
                    i13 |= 384;
                } else {
                    if ((i3 & 384) == 0) {
                        i13 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
                    }
                    if ((i4 & 8192) == 0) {
                        i13 |= 3072;
                    } else {
                        if ((i3 & 3072) == 0) {
                            i13 |= composerStartRestartGroup.changed(horizontal) ? 2048 : 1024;
                        }
                        if ((i4 & 16384) == 0) {
                            if ((i3 & 24576) == 0) {
                                i13 |= composerStartRestartGroup.changed(vertical) ? 16384 : 8192;
                            }
                            if ((i4 & 32768) == 0) {
                                i10 = i13 | 196608;
                            } else {
                                int i14 = i13;
                                if ((i3 & 196608) == 0) {
                                    i10 = i14 | (composerStartRestartGroup.changed(snapPosition) ? 131072 : 65536);
                                } else {
                                    i10 = i14;
                                }
                            }
                            if ((i4 & 65536) == 0) {
                                i10 |= 1572864;
                            } else if ((i3 & 1572864) == 0) {
                                i10 |= composerStartRestartGroup.changedInstance(function4) ? 1048576 : 524288;
                            }
                            i11 = i10;
                            if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i11) != 599186, i5 & 1)) {
                                composer2 = composerStartRestartGroup;
                                composer2.skipToGroupEnd();
                                f2 = f;
                                i12 = i7;
                            } else {
                                int i15 = i6 != 0 ? 0 : i7;
                                if (i8 != 0) {
                                    z3 = false;
                                    fM7995constructorimpl = C2002Dp.m7995constructorimpl(0);
                                } else {
                                    z3 = false;
                                    fM7995constructorimpl = f;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1125194810, i5, i11, "androidx.compose.foundation.pager.Pager (LazyLayoutPager.kt:103)");
                                }
                                if (!(i15 >= 0 ? true : z3)) {
                                    InlineClassHelper.throwIllegalArgumentException("beyondViewportPageCount should be greater than or equal to 0, you selected " + i15);
                                }
                                int i16 = i5 & 112;
                                boolean z4 = i16 == 32 ? true : z3;
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0<Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$pagerItemProvider$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Integer invoke() {
                                            return Integer.valueOf(pagerState2.getPageCount());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                Function0 function0 = (Function0) objRememberedValue;
                                int i17 = i5 >> 3;
                                int i18 = i15;
                                int i19 = i17 & 14;
                                int i20 = i11 >> 15;
                                int i21 = i5;
                                Function0<PagerLazyLayoutItemProvider> function0RememberPagerItemProviderLambda = rememberPagerItemProviderLambda(pagerState, function4, function1, function0, composerStartRestartGroup, i19 | (i20 & 112) | (i11 & 896));
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                CoroutineScope coroutineScope = (CoroutineScope) objRememberedValue2;
                                boolean z5 = i16 == 32 ? true : z3;
                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (z5 || objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = new Function0<Integer>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$measurePolicy$1$1
                                        {
                                            super(0);
                                        }

                                        /* JADX WARN: Can't rename method to resolve collision */
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Integer invoke() {
                                            return Integer.valueOf(pagerState.getPageCount());
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                int i22 = i21 >> 9;
                                int i23 = (i21 & 65520) | (i22 & 458752) | (i22 & 3670016) | ((i11 << 21) & 29360128);
                                int i24 = i11 << 15;
                                boolean z6 = z3;
                                Function2<LazyLayoutMeasureScope, Constraints, MeasureResult> function2M5306rememberPagerMeasurePolicy8u0NR3k = PagerMeasurePolicy.m5306rememberPagerMeasurePolicy8u0NR3k(function0RememberPagerItemProviderLambda, pagerState, paddingValues, z, orientation, i18, fM7995constructorimpl, pageSize, horizontal, vertical, snapPosition, coroutineScope, (Function0) objRememberedValue3, composerStartRestartGroup, i23 | (i24 & 234881024) | (i24 & 1879048192), i20 & 14);
                                float f3 = fM7995constructorimpl;
                                Orientation orientation2 = Orientation.Vertical;
                                LazyLayoutSemantics lazyLayoutSemanticsRememberPagerSemanticState = PagerSemantics.rememberPagerSemanticState(pagerState, orientation == orientation2 ? true : z6, composerStartRestartGroup, i19);
                                boolean z7 = ((i21 & 458752) == 131072 ? true : z6) | (i16 == 32 ? true : z6);
                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (z7 || objRememberedValue4 == companion.getEmpty()) {
                                    objRememberedValue4 = new PagerWrapperFlingBehavior(targetedFlingBehavior, pagerState);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                }
                                PagerWrapperFlingBehavior pagerWrapperFlingBehavior = (PagerWrapperFlingBehavior) objRememberedValue4;
                                BringIntoViewSpec bringIntoViewSpec = (BringIntoViewSpec) composerStartRestartGroup.consume(BringIntoViewSpec_androidKt.getLocalBringIntoViewSpec());
                                boolean zChanged = (i16 == 32 ? true : z6) | composerStartRestartGroup.changed(bringIntoViewSpec);
                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (zChanged || objRememberedValue5 == companion.getEmpty()) {
                                    objRememberedValue5 = new PagerBringIntoViewSpec(pagerState, bringIntoViewSpec);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                }
                                PagerBringIntoViewSpec pagerBringIntoViewSpec = (PagerBringIntoViewSpec) objRememberedValue5;
                                if (z2) {
                                    composerStartRestartGroup.startReplaceGroup(1935359245);
                                    modifierLazyLayoutBeyondBoundsModifier = LazyLayoutBeyondBoundsModifierLocal2.lazyLayoutBeyondBoundsModifier(Modifier.INSTANCE, PagerBeyondBoundsModifier.rememberPagerBeyondBoundsState(pagerState, i18, composerStartRestartGroup, i19 | ((i21 >> 21) & 112)), pagerState.getBeyondBoundsInfo(), z, orientation);
                                    composerStartRestartGroup.endReplaceGroup();
                                } else {
                                    composerStartRestartGroup.startReplaceGroup(1935788068);
                                    composerStartRestartGroup.endReplaceGroup();
                                    modifierLazyLayoutBeyondBoundsModifier = Modifier.INSTANCE;
                                }
                                pagerState2 = pagerState;
                                nestedScrollModifier2 = nestedScrollModifier;
                                LazyLayout2.LazyLayout(function0RememberPagerItemProviderLambda, NestedScrollModifier7.nestedScroll$default(dragDirectionDetector(ScrollingContainer2.scrollingContainer(PagerKt.pagerSemantics(LazyLayoutSemantics2.lazyLayoutSemantics(modifier.then(pagerState.getRemeasurementModifier()).then(pagerState.getAwaitLayoutModifier()), function0RememberPagerItemProviderLambda, lazyLayoutSemanticsRememberPagerSemanticState, orientation, z2, z, composerStartRestartGroup, (i17 & 7168) | ((i21 >> 6) & 57344) | ((i21 << 6) & 458752)), pagerState, orientation == orientation2 ? true : z6, coroutineScope, z2).then(modifierLazyLayoutBeyondBoundsModifier), pagerState, orientation, z2, z, pagerWrapperFlingBehavior, pagerState.getInternalInteractionSource(), false, overscroll, pagerBringIntoViewSpec), pagerState2), nestedScrollModifier2, null, 2, null), pagerState2.getPrefetchState(), function2M5306rememberPagerMeasurePolicy8u0NR3k, composerStartRestartGroup, 0, 0);
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                i12 = i18;
                                f2 = f3;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                final NestedScrollModifier nestedScrollModifier3 = nestedScrollModifier2;
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$Pager$2
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i25) {
                                        LazyLayoutPagerKt.m5299PagereLwUrMk(modifier, pagerState2, paddingValues, z, orientation, targetedFlingBehavior, z2, overscroll, i12, f2, pageSize, nestedScrollModifier3, function1, horizontal, vertical, snapPosition, function4, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), RecomposeScopeImpl4.updateChangedFlags(i3), i4);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i13 |= 24576;
                        if ((i4 & 32768) == 0) {
                        }
                        if ((i4 & 65536) == 0) {
                        }
                        i11 = i10;
                        if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i11) != 599186, i5 & 1)) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i4 & 16384) == 0) {
                    }
                    if ((i4 & 32768) == 0) {
                    }
                    if ((i4 & 65536) == 0) {
                    }
                    i11 = i10;
                    if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i11) != 599186, i5 & 1)) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i4 & 8192) == 0) {
                }
                if ((i4 & 16384) == 0) {
                }
                if ((i4 & 32768) == 0) {
                }
                if ((i4 & 65536) == 0) {
                }
                i11 = i10;
                if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i11) != 599186, i5 & 1)) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            i6 = i4 & 256;
            if (i6 != 0) {
            }
            i8 = i4 & 512;
            if (i8 != 0) {
            }
            if ((i4 & 1024) != 0) {
            }
            if ((i4 & 2048) != 0) {
            }
            int i132 = i9;
            if ((i4 & 4096) != 0) {
            }
            if ((i4 & 8192) == 0) {
            }
            if ((i4 & 16384) == 0) {
            }
            if ((i4 & 32768) == 0) {
            }
            if ((i4 & 65536) == 0) {
            }
            i11 = i10;
            if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i11) != 599186, i5 & 1)) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i4 & 8) == 0) {
        }
        if ((i4 & 16) == 0) {
        }
        if ((i4 & 32) == 0) {
        }
        if ((i4 & 64) == 0) {
        }
        if ((i4 & 128) == 0) {
        }
        i6 = i4 & 256;
        if (i6 != 0) {
        }
        i8 = i4 & 512;
        if (i8 != 0) {
        }
        if ((i4 & 1024) != 0) {
        }
        if ((i4 & 2048) != 0) {
        }
        int i1322 = i9;
        if ((i4 & 4096) != 0) {
        }
        if ((i4 & 8192) == 0) {
        }
        if ((i4 & 16384) == 0) {
        }
        if ((i4 & 32768) == 0) {
        }
        if ((i4 & 65536) == 0) {
        }
        i11 = i10;
        if (composerStartRestartGroup.shouldExecute((i5 & 306783379) == 306783378 || (599187 & i11) != 599186, i5 & 1)) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final Function0<PagerLazyLayoutItemProvider> rememberPagerItemProviderLambda(final PagerState pagerState, Function4<? super PagerScope, ? super Integer, ? super Composer, ? super Integer, Unit> function4, Function1<? super Integer, ? extends Object> function1, final Function0<Integer> function0, Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372505274, i, -1, "androidx.compose.foundation.pager.rememberPagerItemProviderLambda (LazyLayoutPager.kt:259)");
        }
        final SnapshotState4 snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(function4, composer, (i >> 3) & 14);
        final SnapshotState4 snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(function1, composer, (i >> 6) & 14);
        boolean zChanged = ((((i & 14) ^ 6) > 4 && composer.changed(pagerState)) || (i & 6) == 4) | composer.changed(snapshotState4RememberUpdatedState) | composer.changed(snapshotState4RememberUpdatedState2) | ((((i & 7168) ^ 3072) > 2048 && composer.changed(function0)) || (i & 3072) == 2048);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            final SnapshotState4 snapshotState4DerivedStateOf = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new Function0<PagerLayoutIntervalContent>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$intervalContentState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PagerLayoutIntervalContent invoke() {
                    return new PagerLayoutIntervalContent(snapshotState4RememberUpdatedState.getValue(), snapshotState4RememberUpdatedState2.getValue(), function0.invoke().intValue());
                }
            });
            final SnapshotState4 snapshotState4DerivedStateOf2 = SnapshotStateKt.derivedStateOf(SnapshotStateKt.referentialEqualityPolicy(), new Function0<PagerLazyLayoutItemProvider>() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$itemProviderState$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final PagerLazyLayoutItemProvider invoke() {
                    PagerLayoutIntervalContent value = snapshotState4DerivedStateOf.getValue();
                    return new PagerLazyLayoutItemProvider(pagerState, value, new LazyLayoutKeyIndexMap2(pagerState.getNearestRange$foundation_release(), value));
                }
            });
            objRememberedValue = new PropertyReference0Impl(snapshotState4DerivedStateOf2) { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt$rememberPagerItemProviderLambda$1$1
                @Override // kotlin.jvm.internal.PropertyReference0Impl, kotlin.reflect.KProperty6
                public Object get() {
                    return ((SnapshotState4) this.receiver).getValue();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        KProperty6 kProperty6 = (KProperty6) objRememberedValue;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return kProperty6;
    }

    private static final Modifier dragDirectionDetector(Modifier modifier, final PagerState pagerState) {
        return modifier.then(SuspendingPointerInputFilterKt.pointerInput(Modifier.INSTANCE, pagerState, new PointerInputEventHandler() { // from class: androidx.compose.foundation.pager.LazyLayoutPagerKt.dragDirectionDetector.1

            /* compiled from: LazyLayoutPager.kt */
            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1", m3645f = "LazyLayoutPager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CURSOR_POINTER_VALUE}, m3647m = "invokeSuspend")
            /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1, reason: invalid class name */
            static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                final /* synthetic */ PagerState $state;
                final /* synthetic */ PointerInputScope $this_pointerInput;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                AnonymousClass1(PointerInputScope pointerInputScope, PagerState pagerState, Continuation<? super AnonymousClass1> continuation) {
                    super(2, continuation);
                    this.$this_pointerInput = pointerInputScope;
                    this.$state = pagerState;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new AnonymousClass1(this.$this_pointerInput, this.$state, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                    return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                /* compiled from: LazyLayoutPager.kt */
                @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Landroidx/compose/ui/input/pointer/AwaitPointerEventScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
                @DebugMetadata(m3644c = "androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1", m3645f = "LazyLayoutPager.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_EXIT_BRUSHSTROKE_VALUE}, m3647m = "invokeSuspend")
                @SourceDebugExtension
                /* renamed from: androidx.compose.foundation.pager.LazyLayoutPagerKt$dragDirectionDetector$1$1$1, reason: invalid class name and collision with other inner class name */
                static final class C494621 extends ContinuationImpl5 implements Function2<AwaitPointerEventScope, Continuation<? super Unit>, Object> {
                    final /* synthetic */ PagerState $state;
                    private /* synthetic */ Object L$0;
                    Object L$1;
                    Object L$2;
                    int label;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    C494621(PagerState pagerState, Continuation<? super C494621> continuation) {
                        super(2, continuation);
                        this.$state = pagerState;
                    }

                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                        C494621 c494621 = new C494621(this.$state, continuation);
                        c494621.L$0 = obj;
                        return c494621;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(AwaitPointerEventScope awaitPointerEventScope, Continuation<? super Unit> continuation) {
                        return ((C494621) create(awaitPointerEventScope, continuation)).invokeSuspend(Unit.INSTANCE);
                    }

                    /* JADX WARN: Code restructure failed: missing block: B:11:0x0041, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:16:0x0065, code lost:
                    
                        if (r11 == r0) goto L17;
                     */
                    /* JADX WARN: Code restructure failed: missing block: B:17:0x0067, code lost:
                    
                        return r0;
                     */
                    /* JADX WARN: Removed duplicated region for block: B:15:0x0057  */
                    /* JADX WARN: Removed duplicated region for block: B:25:0x0094  */
                    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0065 -> B:18:0x0068). Please report as a decompilation issue!!! */
                    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                    */
                    public final Object invokeSuspend(Object obj) {
                        AwaitPointerEventScope awaitPointerEventScope;
                        AwaitPointerEventScope awaitPointerEventScope2;
                        PointerInputChange pointerInputChange;
                        PointerInputChange pointerInputChange2;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i = this.label;
                        if (i == 0) {
                            ResultKt.throwOnFailure(obj);
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            PointerEventPass pointerEventPass = PointerEventPass.Initial;
                            this.L$0 = awaitPointerEventScope;
                            this.label = 1;
                            obj = TapGestureDetector4.awaitFirstDown(awaitPointerEventScope, false, pointerEventPass, this);
                        } else if (i == 1) {
                            awaitPointerEventScope = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                        } else {
                            if (i != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            pointerInputChange = (PointerInputChange) this.L$2;
                            pointerInputChange2 = (PointerInputChange) this.L$1;
                            awaitPointerEventScope2 = (AwaitPointerEventScope) this.L$0;
                            ResultKt.throwOnFailure(obj);
                            PointerEvent pointerEvent = (PointerEvent) obj;
                            List<PointerInputChange> changes = pointerEvent.getChanges();
                            int size = changes.size();
                            int i2 = 0;
                            while (true) {
                                if (i2 < size) {
                                    if (!PointerEventKt.changedToUp(changes.get(i2))) {
                                        break;
                                    }
                                    i2++;
                                } else {
                                    pointerInputChange = pointerEvent.getChanges().get(0);
                                    break;
                                }
                            }
                            if (pointerInputChange != null) {
                                PointerEventPass pointerEventPass2 = PointerEventPass.Initial;
                                this.L$0 = awaitPointerEventScope2;
                                this.L$1 = pointerInputChange2;
                                this.L$2 = pointerInputChange;
                                this.label = 2;
                                obj = awaitPointerEventScope2.awaitPointerEvent(pointerEventPass2, this);
                            } else {
                                this.$state.m5312setUpDownDifferencek4lQ0M$foundation_release(Offset.m6546minusMKHz9U(pointerInputChange.getPosition(), pointerInputChange2.getPosition()));
                                return Unit.INSTANCE;
                            }
                        }
                        this.$state.m5312setUpDownDifferencek4lQ0M$foundation_release(Offset.INSTANCE.m6553getZeroF1C5BW0());
                        awaitPointerEventScope2 = awaitPointerEventScope;
                        pointerInputChange = null;
                        pointerInputChange2 = (PointerInputChange) obj;
                        if (pointerInputChange != null) {
                        }
                    }
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i = this.label;
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        PointerInputScope pointerInputScope = this.$this_pointerInput;
                        C494621 c494621 = new C494621(this.$state, null);
                        this.label = 1;
                        if (ForEachGesture.awaitEachGesture(pointerInputScope, c494621, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                }
            }

            @Override // androidx.compose.p011ui.input.pointer.PointerInputEventHandler
            public final Object invoke(PointerInputScope pointerInputScope, Continuation<? super Unit> continuation) {
                Object objCoroutineScope = CoroutineScope2.coroutineScope(new AnonymousClass1(pointerInputScope, pagerState, null), continuation);
                return objCoroutineScope == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCoroutineScope : Unit.INSTANCE;
            }
        }));
    }
}
