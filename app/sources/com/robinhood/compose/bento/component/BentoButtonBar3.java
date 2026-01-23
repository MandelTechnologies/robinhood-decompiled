package com.robinhood.compose.bento.component;

import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.compose.bento.component.BentoButtons;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoButtonBar.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JW\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0012\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoButtonBarScope;", "", "<init>", "()V", "PrimaryButtonOnly", "", "modifier", "Landroidx/compose/ui/Modifier;", "orientation", "Landroidx/compose/foundation/gestures/Orientation;", "primaryButtonOnClick", "Lkotlin/Function0;", "primaryButtonText", "", "primaryButtonLoading", "", "primaryButtonIcon", "Lcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;", "primaryButtonEnabled", "(Landroidx/compose/ui/Modifier;Landroidx/compose/foundation/gestures/Orientation;Lkotlin/jvm/functions/Function0;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoButtons$Icon$Size16;ZLandroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.BentoButtonBarScope, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoButtonBar3 {
    public static final int $stable = 0;
    public static final BentoButtonBar3 INSTANCE = new BentoButtonBar3();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PrimaryButtonOnly$lambda$0(BentoButtonBar3 bentoButtonBar3, Modifier modifier, Orientation orientation, Function0 function0, String str, boolean z, BentoButtons.Icon.Size16 size16, boolean z2, int i, int i2, Composer composer, int i3) {
        bentoButtonBar3.PrimaryButtonOnly(modifier, orientation, function0, str, z, size16, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private BentoButtonBar3() {
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:111:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0112  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void PrimaryButtonOnly(Modifier modifier, Orientation orientation, final Function0<Unit> primaryButtonOnClick, final String primaryButtonText, boolean z, BentoButtons.Icon.Size16 size16, boolean z2, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z3;
        int i4;
        BentoButtons.Icon.Size16 size162;
        int i5;
        boolean z4;
        Composer composer2;
        final Modifier modifier3;
        final Orientation orientation2;
        final boolean z5;
        final BentoButtons.Icon.Size16 size163;
        final boolean z6;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryButtonOnClick, "primaryButtonOnClick");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Composer composerStartRestartGroup = composer.startRestartGroup(127139894);
        int i6 = i2 & 1;
        if (i6 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i7 = i2 & 2;
        if (i7 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(orientation == null ? -1 : orientation.ordinal()) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(primaryButtonOnClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryButtonText) ? 2048 : 1024;
        }
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    size162 = size16;
                    i3 |= composerStartRestartGroup.changed(size162) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        z4 = z2;
                        i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                    }
                    if ((i3 & 599187) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        Orientation orientation3 = i7 == 0 ? Orientation.Vertical : orientation;
                        boolean z7 = i8 == 0 ? false : z3;
                        BentoButtons.Icon.Size16 size164 = i4 == 0 ? null : size162;
                        boolean z8 = i5 == 0 ? true : z4;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(127139894, i3, -1, "com.robinhood.compose.bento.component.BentoButtonBarScope.PrimaryButtonOnly (BentoButtonBar.kt:267)");
                        }
                        int i9 = i3 << 12;
                        Modifier modifier5 = modifier4;
                        composer2 = composerStartRestartGroup;
                        Orientation orientation4 = orientation3;
                        BentoButtonBar2.BentoButtonBar(modifier5, null, null, false, null, orientation4, primaryButtonOnClick, primaryButtonText, z7, size164, z8, null, null, false, null, false, composer2, (i3 & 14) | (458752 & i9) | (3670016 & i9) | (29360128 & i9) | (234881024 & i9) | (i9 & 1879048192), (i3 >> 18) & 14, 63518);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier5;
                        orientation2 = orientation4;
                        z5 = z7;
                        size163 = size164;
                        z6 = z8;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        orientation2 = orientation;
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        z5 = z3;
                        size163 = size162;
                        z6 = z4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoButtonBarScope$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BentoButtonBar3.PrimaryButtonOnly$lambda$0(this.f$0, modifier3, orientation2, primaryButtonOnClick, primaryButtonText, z5, size163, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                z4 = z2;
                if ((i3 & 599187) == 599186) {
                    if (i6 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    int i92 = i3 << 12;
                    Modifier modifier52 = modifier4;
                    composer2 = composerStartRestartGroup;
                    Orientation orientation42 = orientation3;
                    BentoButtonBar2.BentoButtonBar(modifier52, null, null, false, null, orientation42, primaryButtonOnClick, primaryButtonText, z7, size164, z8, null, null, false, null, false, composer2, (i3 & 14) | (458752 & i92) | (3670016 & i92) | (29360128 & i92) | (234881024 & i92) | (i92 & 1879048192), (i3 >> 18) & 14, 63518);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    orientation2 = orientation42;
                    z5 = z7;
                    size163 = size164;
                    z6 = z8;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            size162 = size16;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            z4 = z2;
            if ((i3 & 599187) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        z3 = z;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        size162 = size16;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        z4 = z2;
        if ((i3 & 599187) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
