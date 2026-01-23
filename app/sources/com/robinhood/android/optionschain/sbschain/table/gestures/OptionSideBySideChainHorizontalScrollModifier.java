package com.robinhood.android.optionschain.sbschain.table.gestures;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.p011ui.unit.Density;
import com.robinhood.android.optionschain.sbschain.OptionSideBySideChainDataState2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionSideBySideChainHorizontalScrollModifier.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u001am\u0010\u0000\u001a\u00020\u0001*\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0011\u001a\u00020\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0000¢\u0006\u0004\b\u0016\u0010\u0017\"\u000e\u0010\u0018\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0019\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001a\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001b\u001a\u00020\u000fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001c"}, m3636d2 = {"optionSideBySideChainHorizontalScroll", "Landroidx/compose/ui/Modifier;", "metricSize", "", "cellWidth", "Landroidx/compose/ui/unit/Dp;", "numOfCellsCanHoldOneSide", "callPutSwitcherState", "Lcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;", "density", "Landroidx/compose/ui/unit/Density;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "sharedScrollValue", "Landroidx/compose/animation/core/Animatable;", "", "Landroidx/compose/animation/core/AnimationVector1D;", "isEnabled", "", "logHorizontalScrollStart", "Lkotlin/Function0;", "", "optionSideBySideChainHorizontalScroll-AFY4PWA", "(Landroidx/compose/ui/Modifier;IFILcom/robinhood/android/optionschain/sbschain/CallPutSwitcherState;Landroidx/compose/ui/unit/Density;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/animation/core/Animatable;ZLkotlin/jvm/functions/Function0;)Landroidx/compose/ui/Modifier;", "HORIZONTAL_SCROLL_STIFFNESS", "OVERSCROLL_MAX", "OVERSCROLL_RESISTANCE", "FLOAT_ERROR", "feature-options-chain_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.optionschain.sbschain.table.gestures.OptionSideBySideChainHorizontalScrollModifierKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class OptionSideBySideChainHorizontalScrollModifier {
    private static final float FLOAT_ERROR = 0.001f;
    private static final float HORIZONTAL_SCROLL_STIFFNESS = 20000.0f;
    private static final float OVERSCROLL_MAX = 100.0f;
    private static final float OVERSCROLL_RESISTANCE = 2.0f;

    /* renamed from: optionSideBySideChainHorizontalScroll-AFY4PWA, reason: not valid java name */
    public static final Modifier m17306optionSideBySideChainHorizontalScrollAFY4PWA(Modifier optionSideBySideChainHorizontalScroll, int i, float f, int i2, OptionSideBySideChainDataState2 callPutSwitcherState, Density density, CoroutineScope coroutineScope, Animatable<Float, AnimationVectors2> sharedScrollValue, boolean z, Function0<Unit> logHorizontalScrollStart) {
        Intrinsics.checkNotNullParameter(optionSideBySideChainHorizontalScroll, "$this$optionSideBySideChainHorizontalScroll");
        Intrinsics.checkNotNullParameter(callPutSwitcherState, "callPutSwitcherState");
        Intrinsics.checkNotNullParameter(density, "density");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(sharedScrollValue, "sharedScrollValue");
        Intrinsics.checkNotNullParameter(logHorizontalScrollStart, "logHorizontalScrollStart");
        if (!z) {
            return optionSideBySideChainHorizontalScroll;
        }
        return SuspendingPointerInputFilterKt.pointerInput(optionSideBySideChainHorizontalScroll, Integer.valueOf(i), callPutSwitcherState, new OptionSideBySideChainHorizontalScrollModifier2(density, callPutSwitcherState, i2, f, coroutineScope, sharedScrollValue, new Ref.FloatRef(), i, logHorizontalScrollStart));
    }
}
