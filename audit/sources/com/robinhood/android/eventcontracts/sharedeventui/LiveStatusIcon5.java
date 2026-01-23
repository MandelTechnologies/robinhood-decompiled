package com.robinhood.android.eventcontracts.sharedeventui;

import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.Easing3;
import androidx.compose.animation.core.InfiniteRepeatableSpec;
import androidx.compose.animation.core.InfiniteTransition;
import androidx.compose.animation.core.InfiniteTransition4;
import androidx.compose.foundation.Canvas2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.drawscope.DrawScope;
import androidx.compose.p011ui.graphics.drawscope.DrawScope3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.Range2;
import kotlin.ranges.RangesKt;

/* compiled from: LiveStatusIcon.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\f\u001a=\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000e2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0017\u001a\u00020\u0002H\u0007¢\u0006\u0002\u0010\u0018\u001a\r\u0010\u0019\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u001a\"\u001d\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u000e\n\u0000\u0012\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006\"\u0010\u0010\u0014\u001a\u00020\fX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0015\"\u000e\u0010\u0016\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010\u001d\u001a\u00020\u0011X\u008a\u0084\u0002"}, m3636d2 = {"LocalLiveStatusIconAnimation", "Landroidx/compose/runtime/ProvidableCompositionLocal;", "Lcom/robinhood/android/eventcontracts/sharedeventui/LiveStatusIconAnimation;", "getLocalLiveStatusIconAnimation$annotations", "()V", "getLocalLiveStatusIconAnimation", "()Landroidx/compose/runtime/ProvidableCompositionLocal;", "LiveStatusIcon", "", "modifier", "Landroidx/compose/ui/Modifier;", "iconSize", "Landroidx/compose/ui/unit/Dp;", ResourceTypes.COLOR, "Landroidx/compose/ui/graphics/Color;", "soothingAlphaRange", "Lkotlin/ranges/ClosedRange;", "", "LiveStatusIcon-PZ-HvWI", "(Landroidx/compose/ui/Modifier;FJLkotlin/ranges/ClosedRange;Landroidx/compose/runtime/Composer;II)V", "StatusIconSize", "F", "DefaultSoothingAlpha", "rememberLiveStatusIconAnimation", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/eventcontracts/sharedeventui/LiveStatusIconAnimation;", "PreviewLiveStatusIcon", "(Landroidx/compose/runtime/Composer;I)V", "lib-shared-event-ui_externalDebug", "radius", "alpha"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class LiveStatusIcon5 {
    private static final float DefaultSoothingAlpha = 0.5f;
    private static final CompositionLocal6<LiveStatusIconAnimation> LocalLiveStatusIconAnimation = CompositionLocal3.compositionLocalOf$default(null, new Function0() { // from class: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconKt$$ExternalSyntheticLambda2
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            return LiveStatusIcon5.LocalLiveStatusIconAnimation$lambda$0();
        }
    }, 1, null);
    private static final float StatusIconSize = C2002Dp.m7995constructorimpl(12);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveStatusIcon_PZ_HvWI$lambda$5(Modifier modifier, float f, long j, Range2 range2, int i, int i2, Composer composer, int i3) {
        m14380LiveStatusIconPZHvWI(modifier, f, j, range2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewLiveStatusIcon$lambda$7(int i, Composer composer, int i2) {
        PreviewLiveStatusIcon(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getLocalLiveStatusIconAnimation$annotations() {
    }

    public static final CompositionLocal6<LiveStatusIconAnimation> getLocalLiveStatusIconAnimation() {
        return LocalLiveStatusIconAnimation;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LiveStatusIconAnimation LocalLiveStatusIconAnimation$lambda$0() {
        return new LiveStatusIconAnimation(SnapshotFloatState3.mutableFloatStateOf(1.0f));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0129  */
    /* renamed from: LiveStatusIcon-PZ-HvWI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m14380LiveStatusIconPZHvWI(Modifier modifier, float f, long j, Range2<Float> range2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        float f2;
        long prime;
        Range2<Float> range2RangeTo;
        Modifier modifier3;
        final LiveStatusIconAnimation liveStatusIconAnimation;
        boolean z;
        boolean z2;
        Object objRememberedValue;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-394516309);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                f2 = f;
                i3 |= composerStartRestartGroup.changed(f2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                prime = j;
                i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(prime)) ? 256 : 128;
            } else {
                prime = j;
            }
            if ((i & 3072) != 0) {
                if ((i2 & 8) == 0) {
                    range2RangeTo = range2;
                    int i6 = composerStartRestartGroup.changed(range2RangeTo) ? 2048 : 1024;
                    i3 |= i6;
                } else {
                    range2RangeTo = range2;
                }
                i3 |= i6;
            } else {
                range2RangeTo = range2;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i5 != 0) {
                        f2 = StatusIconSize;
                    }
                    if ((i2 & 4) != 0) {
                        prime = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getPrime();
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                        range2RangeTo = RangesKt.rangeTo(0.5f, 0.0f);
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    if ((i2 & 8) != 0) {
                        i3 &= -7169;
                    }
                    modifier3 = modifier2;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-394516309, i3, -1, "com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIcon (LiveStatusIcon.kt:57)");
                }
                liveStatusIconAnimation = (LiveStatusIconAnimation) composerStartRestartGroup.consume(LocalLiveStatusIconAnimation);
                Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(modifier3, f2);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z = true;
                boolean zChanged = ((i3 & 112) != 32) | composerStartRestartGroup.changed(liveStatusIconAnimation) | ((((i3 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(range2RangeTo)) || (i3 & 3072) == 2048);
                if ((((i3 & 896) ^ 384) <= 256 || !composerStartRestartGroup.changed(prime)) && (i3 & 384) != 256) {
                    z = false;
                }
                z2 = zChanged | z;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    final float f3 = f2;
                    final Range2<Float> range22 = range2RangeTo;
                    final long j2 = prime;
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return LiveStatusIcon5.LiveStatusIcon_PZ_HvWI$lambda$4$lambda$3(f3, liveStatusIconAnimation, range22, j2, (DrawScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Canvas2.Canvas(modifierM5169size3ABfNKs, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            final Range2<Float> range23 = range2RangeTo;
            final long j3 = prime;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier4 = modifier3;
                final float f4 = f2;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return LiveStatusIcon5.LiveStatusIcon_PZ_HvWI$lambda$5(modifier4, f4, j3, range23, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        f2 = f;
        if ((i & 384) != 0) {
        }
        if ((i & 3072) != 0) {
        }
        if ((i3 & 1171) == 1170) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if ((i2 & 4) != 0) {
                }
                if ((i2 & 8) != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                liveStatusIconAnimation = (LiveStatusIconAnimation) composerStartRestartGroup.consume(LocalLiveStatusIconAnimation);
                Modifier modifierM5169size3ABfNKs2 = SizeKt.m5169size3ABfNKs(modifier3, f2);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                z = true;
                if (((i3 & 7168) ^ 3072) <= 2048) {
                    boolean zChanged2 = ((i3 & 112) != 32) | composerStartRestartGroup.changed(liveStatusIconAnimation) | ((((i3 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(range2RangeTo)) || (i3 & 3072) == 2048);
                    if (((i3 & 896) ^ 384) <= 256) {
                        z = false;
                        z2 = zChanged2 | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                            final float f32 = f2;
                            final Range2 range222 = range2RangeTo;
                            final long j22 = prime;
                            objRememberedValue = new Function1() { // from class: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return LiveStatusIcon5.LiveStatusIcon_PZ_HvWI$lambda$4$lambda$3(f32, liveStatusIconAnimation, range222, j22, (DrawScope) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            Canvas2.Canvas(modifierM5169size3ABfNKs2, (Function1) objRememberedValue, composerStartRestartGroup, 0);
                            if (ComposerKt.isTraceInProgress()) {
                            }
                        }
                    } else {
                        z = false;
                        z2 = zChanged2 | z;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (z2) {
                        }
                    }
                } else {
                    boolean zChanged22 = ((i3 & 112) != 32) | composerStartRestartGroup.changed(liveStatusIconAnimation) | ((((i3 & 7168) ^ 3072) <= 2048 && composerStartRestartGroup.changed(range2RangeTo)) || (i3 & 3072) == 2048);
                    if (((i3 & 896) ^ 384) <= 256) {
                    }
                }
            }
        }
        final Range2 range232 = range2RangeTo;
        final long j32 = prime;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LiveStatusIcon_PZ_HvWI$lambda$4$lambda$3(float f, LiveStatusIconAnimation liveStatusIconAnimation, Range2 range2, long j, DrawScope Canvas) {
        Intrinsics.checkNotNullParameter(Canvas, "$this$Canvas");
        float fMo5016toPx0680j_4 = Canvas.mo5016toPx0680j_4(f) / 5;
        SnapshotState4<Float> snapshotState4SoothingRadius = liveStatusIconAnimation.soothingRadius(RangesKt.rangeTo(fMo5016toPx0680j_4, Canvas.mo5016toPx0680j_4(f)));
        long jM6705copywmQWz5c$default = Color.m6705copywmQWz5c$default(j, LiveStatusIcon_PZ_HvWI$lambda$4$lambda$3$lambda$2(liveStatusIconAnimation.soothingAlpha(range2)), 0.0f, 0.0f, 0.0f, 14, null);
        float fLiveStatusIcon_PZ_HvWI$lambda$4$lambda$3$lambda$1 = LiveStatusIcon_PZ_HvWI$lambda$4$lambda$3$lambda$1(snapshotState4SoothingRadius);
        long jMo6962getCenterF1C5BW0 = Canvas.mo6962getCenterF1C5BW0();
        DrawScope3 drawScope3 = DrawScope3.INSTANCE;
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, jM6705copywmQWz5c$default, fLiveStatusIcon_PZ_HvWI$lambda$4$lambda$3$lambda$1, jMo6962getCenterF1C5BW0, 0.0f, drawScope3, null, 0, 104, null);
        DrawScope.m6947drawCircleVaOC9Bg$default(Canvas, j, fMo5016toPx0680j_4, Canvas.mo6962getCenterF1C5BW0(), 0.0f, drawScope3, null, 0, 104, null);
        return Unit.INSTANCE;
    }

    private static final float LiveStatusIcon_PZ_HvWI$lambda$4$lambda$3$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float LiveStatusIcon_PZ_HvWI$lambda$4$lambda$3$lambda$2(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    public static final LiveStatusIconAnimation rememberLiveStatusIconAnimation(Composer composer, int i) {
        composer.startReplaceGroup(139968786);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(139968786, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.rememberLiveStatusIconAnimation (LiveStatusIcon.kt:87)");
        }
        SnapshotState4<Float> snapshotState4AnimateFloat = InfiniteTransition4.animateFloat(InfiniteTransition4.rememberInfiniteTransition(null, composer, 0, 1), 0.0f, 1.0f, AnimationSpecKt.m4815infiniteRepeatable9IiC70o$default(AnimationSpecKt.tween(1000, 250, Easing3.getLinearEasing()), null, 0L, 6, null), null, composer, InfiniteTransition.$stable | 432 | (InfiniteRepeatableSpec.$stable << 9), 8);
        composer.startReplaceGroup(5004770);
        boolean zChanged = composer.changed(snapshotState4AnimateFloat);
        Object objRememberedValue = composer.rememberedValue();
        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LiveStatusIconAnimation(snapshotState4AnimateFloat);
            composer.updateRememberedValue(objRememberedValue);
        }
        LiveStatusIconAnimation liveStatusIconAnimation = (LiveStatusIconAnimation) objRememberedValue;
        composer.endReplaceGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return liveStatusIconAnimation;
    }

    private static final void PreviewLiveStatusIcon(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-731836562);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-731836562, i, -1, "com.robinhood.android.eventcontracts.sharedeventui.PreviewLiveStatusIcon (LiveStatusIcon.kt:107)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, LiveStatusIcon.INSTANCE.getLambda$42250022$lib_shared_event_ui_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.eventcontracts.sharedeventui.LiveStatusIconKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return LiveStatusIcon5.PreviewLiveStatusIcon$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
