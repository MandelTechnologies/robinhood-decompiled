package com.robinhood.shared.trading.tradeflow;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.foundation.gestures.AnchoredDraggableDefaults;
import androidx.compose.foundation.gestures.AnchoredDraggableKt;
import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.foundation.gestures.DraggableAnchorsConfig;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsKt;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextMeasurer;
import androidx.compose.p011ui.text.TextMeasurerHelper;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.IntOffset;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.math.MathKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: SwipeToTrade.kt */
@Metadata(m3635d1 = {"\u0000P\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u000e\u001aÊ\u0001\u0010\u001c\u001a\u00020\u0004\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00018\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2O\b\u0002\u0010\u0018\u001aI\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0014\u0012\u0013\u0012\u00110\u0006¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0015\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0012\u0012\b\b\u0013\u0012\u0004\b\b(\u0017\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00102\u0012\u0010\u0019\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u0003H\u0001¢\u0006\u0004\b\u001a\u0010\u001b\u001a/\u0010 \u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\bH\u0003¢\u0006\u0004\b\u001e\u0010\u001f\u001a\u000f\u0010\"\u001a\u00020!H\u0007¢\u0006\u0004\b\"\u0010#\"\u0014\u0010$\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b&\u0010'\"\u0014\u0010(\u001a\u00020\u00068\u0000X\u0080T¢\u0006\u0006\n\u0004\b(\u0010'¨\u0006/²\u0006\u0018\u0010)\u001a\u0004\u0018\u00018\u0000\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010*\u001a\u00020\u00118\n@\nX\u008a\u008e\u0002²\u0006\"\u0010+\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00040\u0003\"\b\b\u0000\u0010\u0001*\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010,\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010-\u001a\u00020!8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010.\u001a\u00020!8\nX\u008a\u0084\u0002"}, m3636d2 = {"", "OrderData", "orderData", "Lkotlin/Function1;", "", "onSwiped", "", "swipeIndicatorAnimationDelay", "", "swipeText", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/shared/trading/tradeflow/ReviewingState;", "reviewingState", "Landroidx/compose/ui/graphics/Color;", "foregroundColor", "Lkotlin/Function3;", "", "Lkotlin/ParameterName;", "name", "isReviewing", "swipeCardHeight", "", "yOffset", "background", "foregroundContent", "SwipeToTrade-mwpFuRA", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;ILjava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/shared/trading/tradeflow/ReviewingState;JLkotlin/jvm/functions/Function5;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "SwipeToTrade", "delay", "SwipeUpIndicator-3IgeMak", "(Lcom/robinhood/shared/trading/tradeflow/ReviewingState;JILjava/lang/String;Landroidx/compose/runtime/Composer;I)V", "SwipeUpIndicator", "Landroidx/compose/ui/unit/Dp;", "safeBottomPadding", "(Landroidx/compose/runtime/Composer;I)F", "velocityThreshold", "F", "SwipeToTradeSectionAppearSpeedMillis", "I", "NumpadSlideOutDurationMillis", "savedOrderData", "isOnSwipedCalled", "updatedOnSwiped", "swipeCardHeightInPx", "targetHeight", "containerHeight", "lib-trade-flow-compose_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class SwipeToTrade4 {
    public static final int NumpadSlideOutDurationMillis = 150;
    public static final int SwipeToTradeSectionAppearSpeedMillis = 300;
    private static final float velocityThreshold = C2002Dp.m7995constructorimpl(125);

    /* JADX INFO: Access modifiers changed from: private */
    public static final float SwipeToTrade_mwpFuRA$lambda$20$lambda$16$lambda$15(float f) {
        return 0.5f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToTrade_mwpFuRA$lambda$21(Object obj, Function1 function1, int i, String str, Modifier modifier, SwipeToTrade2 swipeToTrade2, long j, Function5 function5, Function3 function3, int i2, int i3, Composer composer, int i4) {
        m26350SwipeToTrademwpFuRA(obj, function1, i, str, modifier, swipeToTrade2, j, function5, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeUpIndicator_3IgeMak$lambda$29(SwipeToTrade2 swipeToTrade2, long j, int i, String str, int i2, Composer composer, int i3) {
        m26351SwipeUpIndicator3IgeMak(swipeToTrade2, j, i, str, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SwipeToTrade_mwpFuRA$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function1 SwipeToTrade_mwpFuRA$lambda$5(SnapshotState4 snapshotState4) {
        return (Function1) snapshotState4.getValue();
    }

    private static final float SwipeUpIndicator_3IgeMak$lambda$24(SnapshotState<C2002Dp> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    private static final float SwipeUpIndicator_3IgeMak$lambda$27(SnapshotState4<C2002Dp> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02b7  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e6  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x03df  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0415  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0421  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0452  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x04a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x04b2  */
    /* JADX WARN: Removed duplicated region for block: B:203:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00af A[PHI: r14
      0x00af: PHI (r14v42 int) = (r14v0 int), (r14v5 int), (r14v6 int) binds: [B:58:0x00ad, B:68:0x00c5, B:67:0x00c2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010e  */
    /* renamed from: SwipeToTrade-mwpFuRA, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <OrderData> void m26350SwipeToTrademwpFuRA(final OrderData orderdata, final Function1<? super OrderData, Unit> onSwiped, final int i, final String swipeText, Modifier modifier, SwipeToTrade2 swipeToTrade2, long j, Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function5, final Function3<? super Modifier, ? super Composer, ? super Integer, Unit> foregroundContent, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        long nova;
        int i7;
        Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function52;
        int i8;
        int i9;
        long j2;
        SwipeToTrade2 swipeToTrade22;
        Modifier modifier3;
        Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function53;
        SnapshotState4 snapshotState4RememberUpdatedState;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        SnapshotState4 snapshotState4RememberUpdatedState2;
        Object objRememberedValue2;
        Object objRememberedValue3;
        AnchoredDraggableState anchoredDraggableState;
        boolean zChanged;
        Object objRememberedValue4;
        SnapshotState4 snapshotState4;
        Composer composer2;
        final AnchoredDraggableState anchoredDraggableState2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue5;
        Object objRememberedValue6;
        Object objRememberedValue7;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final SwipeToTrade2 swipeToTrade23;
        Composer composer3;
        final long j3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onSwiped, "onSwiped");
        Intrinsics.checkNotNullParameter(swipeText, "swipeText");
        Intrinsics.checkNotNullParameter(foregroundContent, "foregroundContent");
        Composer composerStartRestartGroup = composer.startRestartGroup(100404457);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(orderdata) : composerStartRestartGroup.changedInstance(orderdata) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onSwiped) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            i5 = i;
        } else {
            i5 = i;
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(i5) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(swipeText) ? 2048 : 1024;
        }
        int i10 = i3 & 16;
        if (i10 == 0) {
            if ((i2 & 24576) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i6 = i3 & 32;
            int i11 = 196608;
            if (i6 != 0) {
                i4 |= i11;
            } else if ((196608 & i2) == 0) {
                i11 = composerStartRestartGroup.changed(swipeToTrade2 == null ? -1 : swipeToTrade2.ordinal()) ? 131072 : 65536;
                i4 |= i11;
            }
            if ((1572864 & i2) != 0) {
                if ((i3 & 64) == 0) {
                    nova = j;
                    int i12 = composerStartRestartGroup.changed(nova) ? 1048576 : 524288;
                    i4 |= i12;
                } else {
                    nova = j;
                }
                i4 |= i12;
            } else {
                nova = j;
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                function52 = function5;
            } else {
                function52 = function5;
                if ((i2 & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function52) ? 8388608 : 4194304;
                }
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(foregroundContent) ? 67108864 : 33554432;
            }
            int i13 = i4;
            if ((38347923 & i4) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i2 & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i10 != 0) {
                        modifier2 = Modifier.INSTANCE;
                    }
                    SwipeToTrade2 swipeToTrade24 = i6 == 0 ? SwipeToTrade2.EDITING : swipeToTrade2;
                    if ((i3 & 64) == 0) {
                        nova = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova();
                        i8 = i13 & (-3670017);
                    } else {
                        i8 = i13;
                    }
                    i9 = i8;
                    j2 = nova;
                    swipeToTrade22 = swipeToTrade24;
                    modifier3 = modifier2;
                    function53 = i7 == 0 ? null : function52;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i3 & 64) != 0) {
                        swipeToTrade22 = swipeToTrade2;
                        i9 = i13 & (-3670017);
                        modifier3 = modifier2;
                        function53 = function52;
                        j2 = nova;
                    } else {
                        swipeToTrade22 = swipeToTrade2;
                        modifier3 = modifier2;
                        function53 = function52;
                        j2 = nova;
                        i9 = i13;
                    }
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(100404457, i9, -1, "com.robinhood.shared.trading.tradeflow.SwipeToTrade (SwipeToTrade.kt:86)");
                }
                snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(orderdata, composerStartRestartGroup, i9 & 14);
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$2$lambda$1();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onSwiped, composerStartRestartGroup, (i9 >> 3) & 14);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotIntState3.mutableIntStateOf(0);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new AnchoredDraggableState(SwipeToTrade3.START, AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$10$lambda$9(snapshotIntState2, (DraggableAnchorsConfig) obj);
                        }
                    }));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState2);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                    snapshotState4 = snapshotState4RememberUpdatedState;
                    composer2 = composerStartRestartGroup;
                    anchoredDraggableState2 = anchoredDraggableState;
                    SwipeToTrade5 swipeToTrade5 = new SwipeToTrade5(anchoredDraggableState2, snapshotState, snapshotState4, snapshotState4RememberUpdatedState2, null);
                    composer2.updateRememberedValue(swipeToTrade5);
                    objRememberedValue4 = swipeToTrade5;
                } else {
                    snapshotState4 = snapshotState4RememberUpdatedState;
                    composer2 = composerStartRestartGroup;
                    anchoredDraggableState2 = anchoredDraggableState;
                }
                composer2.endReplaceGroup();
                EffectsKt.LaunchedEffect(anchoredDraggableState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 6);
                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor);
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                Modifier modifier5 = modifier3;
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierNavigationBarsPadding = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.systemGesturesPadding(SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null)));
                composer2.startReplaceGroup(-1633490746);
                objRememberedValue5 = composer2.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$20$lambda$14$lambda$13(anchoredDraggableState2, snapshotIntState2, (LayoutCoordinates) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue5);
                }
                composer2.endReplaceGroup();
                Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierNavigationBarsPadding, (Function1) objRememberedValue5);
                Orientation orientation = Orientation.Vertical;
                boolean z = snapshotState4.getValue() == null && swipeToTrade22 == SwipeToTrade2.REVIEWING;
                AnchoredDraggableDefaults anchoredDraggableDefaults = AnchoredDraggableDefaults.INSTANCE;
                composer2.startReplaceGroup(1849434622);
                objRememberedValue6 = composer2.rememberedValue();
                if (objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return Float.valueOf(SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$20$lambda$16$lambda$15(((Float) obj).floatValue()));
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue6);
                }
                composer2.endReplaceGroup();
                final AnchoredDraggableState anchoredDraggableState3 = anchoredDraggableState2;
                BoxKt.Box(AnchoredDraggableKt.anchoredDraggable$default(modifierOnGloballyPositioned, anchoredDraggableState3, orientation, z, null, null, anchoredDraggableDefaults.flingBehavior(anchoredDraggableState3, (Function1) objRememberedValue6, AnimationSpecKt.tween$default(0, 0, null, 7, null), composer2, (AnchoredDraggableDefaults.$stable << 9) | 438, 0), 24, null), composer2, 0);
                composer2.startReplaceGroup(357170840);
                if (function53 != null) {
                    function52 = function53;
                } else {
                    function52 = function53;
                    function52.invoke(Boolean.valueOf(swipeToTrade22 == SwipeToTrade2.REVIEWING), Integer.valueOf(snapshotIntState2.getIntValue()), Float.valueOf(anchoredDraggableState3.getOffset()), composer2, Integer.valueOf((i9 >> 12) & 7168));
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion4, 0.0f, 1, null);
                composer2.startReplaceGroup(5004770);
                objRememberedValue7 = composer2.rememberedValue();
                if (objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$20$lambda$18$lambda$17(anchoredDraggableState3, (Density) obj);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue7);
                }
                composer2.endReplaceGroup();
                Modifier modifierOffset = OffsetKt.offset(modifierFillMaxSize$default2, (Function1) objRememberedValue7);
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion2.getStart(), composer2, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierOffset);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer2.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer2.startReusableNode();
                if (composer2.getInserting()) {
                    composer2.useNode();
                } else {
                    composer2.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                foregroundContent.invoke(Column5.weight$default(Column6.INSTANCE, companion4, 1.0f, false, 2, null), composer2, Integer.valueOf((i9 >> 21) & 112));
                SwipeToTrade2 swipeToTrade25 = swipeToTrade22;
                long j4 = j2;
                m26351SwipeUpIndicator3IgeMak(swipeToTrade25, j4, i5, swipeText, composer2, ((i9 >> 15) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i9 & 896) | (i9 & 7168));
                composer2.endNode();
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                swipeToTrade23 = swipeToTrade25;
                composer3 = composer2;
                j3 = j4;
                modifier4 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                swipeToTrade23 = swipeToTrade2;
                modifier4 = modifier2;
                composer3 = composerStartRestartGroup;
                j3 = nova;
            }
            final Function5<? super Boolean, ? super Integer, ? super Float, ? super Composer, ? super Integer, Unit> function54 = function52;
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$21(orderdata, onSwiped, i, swipeText, modifier4, swipeToTrade23, j3, function54, foregroundContent, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 24576;
        modifier2 = modifier;
        i6 = i3 & 32;
        int i112 = 196608;
        if (i6 != 0) {
        }
        if ((1572864 & i2) != 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        if ((i3 & 256) == 0) {
        }
        int i132 = i4;
        if ((38347923 & i4) == 38347922) {
            composerStartRestartGroup.startDefaults();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                }
                if (i6 == 0) {
                }
                if ((i3 & 64) == 0) {
                }
                i9 = i8;
                j2 = nova;
                swipeToTrade22 = swipeToTrade24;
                modifier3 = modifier2;
                if (i7 == 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                snapshotState4RememberUpdatedState = SnapshotStateKt.rememberUpdatedState(orderdata, composerStartRestartGroup, i9 & 14);
                Object[] objArr2 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                snapshotState4RememberUpdatedState2 = SnapshotStateKt.rememberUpdatedState(onSwiped, composerStartRestartGroup, (i9 >> 3) & 14);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                anchoredDraggableState = (AnchoredDraggableState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState) | composerStartRestartGroup.changed(snapshotState4RememberUpdatedState2);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (zChanged) {
                    snapshotState4 = snapshotState4RememberUpdatedState;
                    composer2 = composerStartRestartGroup;
                    anchoredDraggableState2 = anchoredDraggableState;
                    SwipeToTrade5 swipeToTrade52 = new SwipeToTrade5(anchoredDraggableState2, snapshotState, snapshotState4, snapshotState4RememberUpdatedState2, null);
                    composer2.updateRememberedValue(swipeToTrade52);
                    objRememberedValue4 = swipeToTrade52;
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect(anchoredDraggableState2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer2, 6);
                    Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null);
                    Alignment.Companion companion22 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion22.getTopStart(), false);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxSize$default3);
                    ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor3 = companion32.getConstructor();
                    if (composer2.getApplier() == null) {
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                    Modifier modifier52 = modifier3;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy2, companion32.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion32.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion32.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion32.getSetModifier());
                        BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                        Modifier.Companion companion42 = Modifier.INSTANCE;
                        Modifier modifierNavigationBarsPadding2 = WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.systemGesturesPadding(SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null)));
                        composer2.startReplaceGroup(-1633490746);
                        objRememberedValue5 = composer2.rememberedValue();
                        if (objRememberedValue5 == companion.getEmpty()) {
                        }
                        composer2.endReplaceGroup();
                        Modifier modifierOnGloballyPositioned2 = OnGloballyPositionedModifier3.onGloballyPositioned(modifierNavigationBarsPadding2, (Function1) objRememberedValue5);
                        Orientation orientation2 = Orientation.Vertical;
                        if (snapshotState4.getValue() == null) {
                            AnchoredDraggableDefaults anchoredDraggableDefaults2 = AnchoredDraggableDefaults.INSTANCE;
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue6 = composer2.rememberedValue();
                            if (objRememberedValue6 == companion.getEmpty()) {
                            }
                            composer2.endReplaceGroup();
                            final AnchoredDraggableState anchoredDraggableState32 = anchoredDraggableState2;
                            BoxKt.Box(AnchoredDraggableKt.anchoredDraggable$default(modifierOnGloballyPositioned2, anchoredDraggableState32, orientation2, z, null, null, anchoredDraggableDefaults2.flingBehavior(anchoredDraggableState32, (Function1) objRememberedValue6, AnimationSpecKt.tween$default(0, 0, null, 7, null), composer2, (AnchoredDraggableDefaults.$stable << 9) | 438, 0), 24, null), composer2, 0);
                            composer2.startReplaceGroup(357170840);
                            if (function53 != null) {
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(companion42, 0.0f, 1, null);
                            composer2.startReplaceGroup(5004770);
                            objRememberedValue7 = composer2.rememberedValue();
                            if (objRememberedValue7 == companion.getEmpty()) {
                            }
                            composer2.endReplaceGroup();
                            Modifier modifierOffset2 = OffsetKt.offset(modifierFillMaxSize$default22, (Function1) objRememberedValue7);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion22.getStart(), composer2, 0);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierOffset2);
                            Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion32.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                                foregroundContent.invoke(Column5.weight$default(Column6.INSTANCE, companion42, 1.0f, false, 2, null), composer2, Integer.valueOf((i9 >> 21) & 112));
                                SwipeToTrade2 swipeToTrade252 = swipeToTrade22;
                                long j42 = j2;
                                m26351SwipeUpIndicator3IgeMak(swipeToTrade252, j42, i5, swipeText, composer2, ((i9 >> 15) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i9 & 896) | (i9 & 7168));
                                composer2.endNode();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                swipeToTrade23 = swipeToTrade252;
                                composer3 = composer2;
                                j3 = j42;
                                modifier4 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        final Function5 function542 = function52;
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwipeToTrade_mwpFuRA$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SwipeToTrade_mwpFuRA$lambda$2$lambda$1() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToTrade_mwpFuRA$lambda$10$lambda$9(SnapshotIntState2 snapshotIntState2, DraggableAnchorsConfig DraggableAnchors) {
        Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.m99at(SwipeToTrade3.START, 0.0f);
        DraggableAnchors.m99at(SwipeToTrade3.END, snapshotIntState2.getIntValue() * (-1.0f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToTrade_mwpFuRA$lambda$20$lambda$14$lambda$13(AnchoredDraggableState anchoredDraggableState, SnapshotIntState2 snapshotIntState2, final LayoutCoordinates lc) {
        Intrinsics.checkNotNullParameter(lc, "lc");
        snapshotIntState2.setIntValue((int) (lc.mo7241getSizeYbymL2g() & 4294967295L));
        AnchoredDraggableState.updateAnchors$default(anchoredDraggableState, AnchoredDraggableKt.DraggableAnchors(new Function1() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SwipeToTrade4.SwipeToTrade_mwpFuRA$lambda$20$lambda$14$lambda$13$lambda$12(lc, (DraggableAnchorsConfig) obj);
            }
        }), null, 2, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SwipeToTrade_mwpFuRA$lambda$20$lambda$14$lambda$13$lambda$12(LayoutCoordinates layoutCoordinates, DraggableAnchorsConfig DraggableAnchors) {
        Intrinsics.checkNotNullParameter(DraggableAnchors, "$this$DraggableAnchors");
        DraggableAnchors.m99at(SwipeToTrade3.START, 0.0f);
        DraggableAnchors.m99at(SwipeToTrade3.END, ((int) (layoutCoordinates.mo7241getSizeYbymL2g() & 4294967295L)) * (-1.0f));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final IntOffset SwipeToTrade_mwpFuRA$lambda$20$lambda$18$lambda$17(AnchoredDraggableState anchoredDraggableState, Density offset) {
        Intrinsics.checkNotNullParameter(offset, "$this$offset");
        return IntOffset.m8030boximpl(IntOffset.m8033constructorimpl(((Float.isNaN(anchoredDraggableState.getOffset()) ? 0 : MathKt.roundToInt(anchoredDraggableState.getOffset())) & 4294967295L) | (0 << 32)));
    }

    /* renamed from: SwipeUpIndicator-3IgeMak, reason: not valid java name */
    private static final void m26351SwipeUpIndicator3IgeMak(final SwipeToTrade2 swipeToTrade2, final long j, final int i, final String str, Composer composer, final int i2) {
        int i3;
        Object swipeToTrade6;
        int i4;
        TextStyle textStyle;
        Composer composerStartRestartGroup = composer.startRestartGroup(261658678);
        if ((i2 & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(swipeToTrade2.ordinal()) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(261658678, i3, -1, "com.robinhood.shared.trading.tradeflow.SwipeUpIndicator (SwipeToTrade.kt:187)");
            }
            float fSafeBottomPadding = safeBottomPadding(composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            float fM21591getLargeD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i5).m21591getLargeD9Ej5fM();
            BentoIcon4.Size16 size16 = new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_UP_16);
            TextStyle textL = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextL();
            float fMo5013toDpu2uoSUM = ((Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity())).mo5013toDpu2uoSUM((int) (TextMeasurer.m7623measurewNUYSr0$default(TextMeasurerHelper.rememberTextMeasurer(0, composerStartRestartGroup, 0, 1), str, textL, 0, false, 0, 0L, null, null, null, false, 1020, null).getSize() & 4294967295L));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(C2002Dp.m7993boximpl(C2002Dp.m7995constructorimpl(0)), null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i6 = i3 & 14;
            boolean zChanged = (i6 == 4) | composerStartRestartGroup.changed(fM21591getLargeD9Ej5fM) | composerStartRestartGroup.changed(fSafeBottomPadding) | composerStartRestartGroup.changed(fMo5013toDpu2uoSUM) | composerStartRestartGroup.changedInstance(size16);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                i4 = i6;
                textStyle = textL;
                swipeToTrade6 = new SwipeToTrade6(swipeToTrade2, fM21591getLargeD9Ej5fM, fSafeBottomPadding, fMo5013toDpu2uoSUM, size16, snapshotState, null);
                composerStartRestartGroup.updateRememberedValue(swipeToTrade6);
            } else {
                i4 = i6;
                swipeToTrade6 = objRememberedValue2;
                textStyle = textL;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(swipeToTrade2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) swipeToTrade6, composerStartRestartGroup, i4);
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, SwipeUpIndicator_3IgeMak$lambda$27(AnimateAsState.m4812animateDpAsStateAjpBEmI(SwipeUpIndicator_3IgeMak$lambda$24(snapshotState), AnimationSpecKt.tween$default(300, i, null, 4, null), "trayHeightAnimation", null, composerStartRestartGroup, 384, 8))), 0.0f, 0.0f, 0.0f, fSafeBottomPadding, 7, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getCenter(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            final TextStyle textStyle2 = textStyle;
            BentoIcon2.m20644BentoIconFU0evQE(size16, null, j, null, null, false, composerStartRestartGroup, BentoIcon4.Size16.$stable | 48 | ((i3 << 3) & 896), 56);
            AnimatedContentKt.AnimatedContent(str, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(370462166, true, new Function4<AnimatedContentScope, String, Composer, Integer, Unit>() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$SwipeUpIndicator$2$1
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, String str2, Composer composer2, Integer num) {
                    invoke(animatedContentScope, str2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, String swipeText, Composer composer2, int i7) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    Intrinsics.checkNotNullParameter(swipeText, "swipeText");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(370462166, i7, -1, "com.robinhood.shared.trading.tradeflow.SwipeUpIndicator.<anonymous>.<anonymous> (SwipeToTrade.kt:237)");
                    }
                    BentoText2.m20747BentoText38GnDrw(swipeText, AutomationTestTagModifierExt.automationTestTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), SwipeToTrade.SWIPE_TO_SUBMIT_TEXT), Color.m6701boximpl(j), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, textStyle2, composer2, ((i7 >> 3) & 14) | 24576, 0, 8104);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 1572864, 62);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trading.tradeflow.SwipeToTradeKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SwipeToTrade4.SwipeUpIndicator_3IgeMak$lambda$29(swipeToTrade2, j, i, str, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SwipeUpIndicator_3IgeMak$lambda$25(SnapshotState<C2002Dp> snapshotState, float f) {
        snapshotState.setValue(C2002Dp.m7993boximpl(f));
    }

    public static final float safeBottomPadding(Composer composer, int i) {
        composer.startReplaceGroup(-1153552003);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1153552003, i, -1, "com.robinhood.shared.trading.tradeflow.safeBottomPadding (SwipeToTrade.kt:256)");
        }
        WindowInsets.Companion companion = WindowInsets.INSTANCE;
        float bottom = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getNavigationBars(companion, composer, 6), composer, 0).getBottom();
        float bottom2 = WindowInsetsKt.asPaddingValues(WindowInsets_androidKt.getSystemGestures(companion, composer, 6), composer, 0).getBottom();
        if (C2002Dp.m7994compareTo0680j_4(bottom, bottom2) <= 0) {
            bottom = bottom2;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return bottom;
    }
}
