package com.robinhood.shared.crypto.p375ui.trade.view;

import androidx.compose.foundation.Background3;
import androidx.compose.material3.AndroidMenu_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.p011ui.unit.Dp3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.CryptoOrderType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderTypeDropdownSelector.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aU\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"CryptoOrderTypeDropdownSelector", "", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;", "expanded", "", "onTypeSelected", "Lkotlin/Function1;", "Lcom/robinhood/models/api/CryptoOrderType;", "onClose", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "offset", "Landroidx/compose/ui/unit/DpOffset;", "CryptoOrderTypeDropdownSelector-EZyisMU", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderTypeDropdownSelectorState;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelectorKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderTypeDropdownSelector {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderTypeDropdownSelector_EZyisMU$lambda$0(CryptoOrderTypeDropdownSelectorState cryptoOrderTypeDropdownSelectorState, boolean z, Function1 function1, Function0 function0, Modifier modifier, long j, int i, int i2, Composer composer, int i3) {
        m25297CryptoOrderTypeDropdownSelectorEZyisMU(cryptoOrderTypeDropdownSelectorState, z, function1, function0, modifier, j, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /* renamed from: CryptoOrderTypeDropdownSelector-EZyisMU, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25297CryptoOrderTypeDropdownSelectorEZyisMU(final CryptoOrderTypeDropdownSelectorState state, final boolean z, final Function1<? super CryptoOrderType, Unit> onTypeSelected, final Function0<Unit> onClose, Modifier modifier, long j, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int i5;
        long j2;
        long jM8009constructorimpl;
        Composer composer2;
        final long j3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTypeSelected, "onTypeSelected");
        Intrinsics.checkNotNullParameter(onClose, "onClose");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1377412839);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onTypeSelected) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClose) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 == 0) {
                    if ((196608 & i) == 0) {
                        j2 = j;
                        i3 |= composerStartRestartGroup.changed(j2) ? 131072 : 65536;
                    }
                    if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 == 0) {
                            float f = 0;
                            jM8009constructorimpl = Dp3.m8009constructorimpl((Float.floatToRawIntBits(C2002Dp.m7995constructorimpl(f)) << 32) | (Float.floatToRawIntBits(C2002Dp.m7995constructorimpl(f)) & 4294967295L));
                        } else {
                            jM8009constructorimpl = j2;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1377412839, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelector (CryptoOrderTypeDropdownSelector.kt:38)");
                        }
                        Modifier modifier5 = modifier4;
                        int i6 = (i3 >> 3) & 14;
                        int i7 = i3 >> 6;
                        long j4 = jM8009constructorimpl;
                        composer2 = composerStartRestartGroup;
                        AndroidMenu_androidKt.m5699DropdownMenuIlH_yew(z, onClose, Background3.m4872backgroundbw27NRU$default(modifier5, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null), j4, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1084043970, true, new CryptoOrderTypeDropdownSelector2(state, onTypeSelected), composerStartRestartGroup, 54), composer2, i6 | (i7 & 112) | (i7 & 7168), 48, 2032);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        j3 = j4;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        j3 = j2;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderTypeDropdownSelectorKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CryptoOrderTypeDropdownSelector.CryptoOrderTypeDropdownSelector_EZyisMU$lambda$0(state, z, onTypeSelected, onClose, modifier3, j3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                j2 = j;
                if ((74899 & i3) == 74898) {
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifier52 = modifier4;
                    int i62 = (i3 >> 3) & 14;
                    int i72 = i3 >> 6;
                    long j42 = jM8009constructorimpl;
                    composer2 = composerStartRestartGroup;
                    AndroidMenu_androidKt.m5699DropdownMenuIlH_yew(z, onClose, Background3.m4872backgroundbw27NRU$default(modifier52, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21373getBg30d7_KjU(), null, 2, null), j42, null, null, null, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1084043970, true, new CryptoOrderTypeDropdownSelector2(state, onTypeSelected), composerStartRestartGroup, 54), composer2, i62 | (i72 & 112) | (i72 & 7168), 48, 2032);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    j3 = j42;
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 32;
            if (i5 == 0) {
            }
            j2 = j;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 32;
        if (i5 == 0) {
        }
        j2 = j;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
