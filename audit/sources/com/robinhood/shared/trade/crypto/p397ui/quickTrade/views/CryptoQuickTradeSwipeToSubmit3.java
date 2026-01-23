package com.robinhood.shared.trade.crypto.p397ui.quickTrade.views;

import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.Animatable2;
import androidx.compose.foundation.layout.BoxWithConstraints;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.ApiOptionLevelChange;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoQuickTradeSwipeToSubmit.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001a\r\u0010\r\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\n\u0010\u0014\u001a\u00020\u0011X\u008a\u008e\u0002"}, m3636d2 = {"CryptoQuickTradeSwipeToSubmit", "", "trackText", "", "modifier", "Landroidx/compose/ui/Modifier;", "trackHeight", "Landroidx/compose/ui/unit/Dp;", "knobSize", "onSubmit", "Lkotlin/Function0;", "CryptoQuickTradeSwipeToSubmit-vz2T9sI", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;FFLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SlideToSubmitDemo", "(Landroidx/compose/runtime/Composer;I)V", "feature-trade-crypto_externalDebug", ApiOptionLevelChange.STATE_SUBMITTED, "", "knobOffsetPx", "", "isDragging"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class CryptoQuickTradeSwipeToSubmit3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$12(String str, Modifier modifier, float f, float f2, Function0 function0, int i, int i2, Composer composer, int i3) {
        m25973CryptoQuickTradeSwipeToSubmitvz2T9sI(str, modifier, f, f2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SlideToSubmitDemo$lambda$13(int i, Composer composer, int i2) {
        SlideToSubmitDemo(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /* renamed from: CryptoQuickTradeSwipeToSubmit-vz2T9sI, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25973CryptoQuickTradeSwipeToSubmitvz2T9sI(final String trackText, Modifier modifier, float f, float f2, final Function0<Unit> onSubmit, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        float f3;
        int i5;
        float f4;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Composer composer2;
        final float f5;
        final float f6;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(trackText, "trackText");
        Intrinsics.checkNotNullParameter(onSubmit, "onSubmit");
        Composer composerStartRestartGroup = composer.startRestartGroup(1066907558);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(trackText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    f3 = f;
                    i3 |= composerStartRestartGroup.changed(f3) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        f4 = f2;
                        i3 |= composerStartRestartGroup.changed(f4) ? 2048 : 1024;
                    }
                    if ((i2 & 16) == 0) {
                        i3 |= 24576;
                    } else if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(onSubmit) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        float fM7995constructorimpl = i4 == 0 ? C2002Dp.m7995constructorimpl(52) : f3;
                        float fM7995constructorimpl2 = i5 == 0 ? C2002Dp.m7995constructorimpl(44) : f4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1066907558, i3, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmit (CryptoQuickTradeSwipeToSubmit.kt:48)");
                        }
                        Density density = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = SnapshotFloatState3.mutableFloatStateOf(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(fM7995constructorimpl - fM7995constructorimpl2)) / 2);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = Animatable2.Animatable$default(density.mo5016toPx0680j_4(C2002Dp.m7995constructorimpl(fM7995constructorimpl - fM7995constructorimpl2)) / 2, 0.0f, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(modifier4, fM7995constructorimpl);
                        CryptoQuickTradeSwipeToSubmit4 cryptoQuickTradeSwipeToSubmit4 = new CryptoQuickTradeSwipeToSubmit4(density, (Animatable) objRememberedValue4, fM7995constructorimpl2, onSubmit, fM7995constructorimpl, snapshotState, snapshotState2, snapshotFloatState2, trackText);
                        float f7 = fM7995constructorimpl2;
                        float f8 = fM7995constructorimpl;
                        composer2 = composerStartRestartGroup;
                        BoxWithConstraints.BoxWithConstraints(modifierM5156height3ABfNKs, null, false, ComposableLambda3.rememberComposableLambda(1931424784, true, cryptoQuickTradeSwipeToSubmit4, composerStartRestartGroup, 54), composer2, 3072, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        f5 = f8;
                        f6 = f7;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        f5 = f3;
                        composer2 = composerStartRestartGroup;
                        f6 = f4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoQuickTradeSwipeToSubmit3.CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$12(trackText, modifier3, f5, f6, onSubmit, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                f4 = f2;
                if ((i2 & 16) == 0) {
                }
                if ((i3 & 9363) == 9362) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Density density2 = (Density) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalDensity());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState3 = (SnapshotState) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    SnapshotFloatState2 snapshotFloatState22 = (SnapshotFloatState2) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(modifier4, fM7995constructorimpl);
                    CryptoQuickTradeSwipeToSubmit4 cryptoQuickTradeSwipeToSubmit42 = new CryptoQuickTradeSwipeToSubmit4(density2, (Animatable) objRememberedValue4, fM7995constructorimpl2, onSubmit, fM7995constructorimpl, snapshotState3, snapshotState22, snapshotFloatState22, trackText);
                    float f72 = fM7995constructorimpl2;
                    float f82 = fM7995constructorimpl;
                    composer2 = composerStartRestartGroup;
                    BoxWithConstraints.BoxWithConstraints(modifierM5156height3ABfNKs2, null, false, ComposableLambda3.rememberComposableLambda(1931424784, true, cryptoQuickTradeSwipeToSubmit42, composerStartRestartGroup, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    f5 = f82;
                    f6 = f72;
                    modifier3 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f3 = f;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            f4 = f2;
            if ((i2 & 16) == 0) {
            }
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        f3 = f;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        f4 = f2;
        if ((i2 & 16) == 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$9(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoQuickTradeSwipeToSubmit_vz2T9sI$lambda$8(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final void SlideToSubmitDemo(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(705059860);
        if (i == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(705059860, i, -1, "com.robinhood.shared.trade.crypto.ui.quickTrade.views.SlideToSubmitDemo (CryptoQuickTradeSwipeToSubmit.kt:167)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoQuickTradeSwipeToSubmit.INSTANCE.getLambda$1000085964$feature_trade_crypto_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.trade.crypto.ui.quickTrade.views.CryptoQuickTradeSwipeToSubmitKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoQuickTradeSwipeToSubmit3.SlideToSubmitDemo$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
