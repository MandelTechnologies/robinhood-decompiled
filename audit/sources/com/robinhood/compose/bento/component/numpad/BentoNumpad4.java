package com.robinhood.compose.bento.component.numpad;

import android.view.KeyEvent;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.plaid.internal.EnumC7081g;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BentoNumpad.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JY\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00050\t2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0002\u0010\u0012J\u0097\u0001\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00050\t2\u0006\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u00172\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\r2\b\b\u0002\u0010\u001a\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u001b\u001a\u00020\rH\u0007¢\u0006\u0002\u0010\u001cJE\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u001e2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\u0010\b\u001a\u0012\u0012\b\u0012\u00060\nj\u0002`\u000b\u0012\u0004\u0012\u00020\u00050\t2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00050\u0017H\u0007¢\u0006\u0002\u0010\u001f¨\u0006 "}, m3636d2 = {"Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScope;", "", "<init>", "()V", "BentoNumpadOnly", "", "modifier", "Landroidx/compose/ui/Modifier;", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "isNumpadEnabled", "", "showDelimiter", "delimiterLocalized", "backspaceOverride", "Lcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;ZZZLcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;Landroidx/compose/runtime/Composer;II)V", "BentoNumpadWithButton", "buttonText", "", "buttonOnClick", "Lkotlin/Function0;", "isButtonEnabled", "isButtonVisible", "isButtonLoading", "buttonPositionTop", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZZZZZZLcom/robinhood/compose/bento/component/numpad/CustomKeyConfig;ZLandroidx/compose/runtime/Composer;III)V", "state", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadState;", "(Lcom/robinhood/compose/bento/component/numpad/BentoNumpadState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadScope, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoNumpad4 {
    public static final int $stable = 0;
    public static final BentoNumpad4 INSTANCE = new BentoNumpad4();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadOnly$lambda$0(BentoNumpad4 bentoNumpad4, Modifier modifier, Function1 function1, boolean z, boolean z2, boolean z3, CustomKeyConfig customKeyConfig, int i, int i2, Composer composer, int i3) {
        bentoNumpad4.BentoNumpadOnly(modifier, function1, z, z2, z3, customKeyConfig, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadWithButton$lambda$1(BentoNumpad4 bentoNumpad4, Modifier modifier, Function1 function1, String str, Function0 function0, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CustomKeyConfig customKeyConfig, boolean z7, int i, int i2, int i3, Composer composer, int i4) {
        bentoNumpad4.BentoNumpadWithButton(modifier, function1, str, function0, z, z2, z3, z4, z5, z6, customKeyConfig, z7, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadWithButton$lambda$2(BentoNumpad4 bentoNumpad4, BentoNumpadState bentoNumpadState, Modifier modifier, Function1 function1, Function0 function0, int i, int i2, Composer composer, int i3) {
        bentoNumpad4.BentoNumpadWithButton(bentoNumpadState, modifier, function1, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private BentoNumpad4() {
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:99:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void BentoNumpadOnly(Modifier modifier, final Function1<? super KeyEvent, Unit> onKeyPress, boolean z, boolean z2, boolean z3, CustomKeyConfig customKeyConfig, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z4;
        int i4;
        boolean z5;
        int i5;
        boolean z6;
        int i6;
        CustomKeyConfig customKeyConfig2;
        final Modifier modifier3;
        Composer composer2;
        final boolean z7;
        final boolean z8;
        final boolean z9;
        final CustomKeyConfig customKeyConfig3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-292212478);
        int i7 = i2 & 1;
        if (i7 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                z4 = z;
                i3 |= composerStartRestartGroup.changed(z4) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    z5 = z2;
                    i3 |= composerStartRestartGroup.changed(z5) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        z6 = z3;
                        i3 |= composerStartRestartGroup.changed(z6) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            customKeyConfig2 = customKeyConfig;
                            i3 |= composerStartRestartGroup.changed(customKeyConfig2) ? 131072 : 65536;
                        }
                        if ((74899 & i3) == 74898 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            z8 = z4;
                            z9 = z5;
                            z7 = z6;
                            customKeyConfig3 = customKeyConfig2;
                        } else {
                            Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                            boolean z10 = i8 == 0 ? true : z4;
                            boolean z11 = i4 == 0 ? z5 : true;
                            if (i5 != 0) {
                                z6 = false;
                            }
                            CustomKeyConfig customKeyConfig4 = i6 == 0 ? null : customKeyConfig2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-292212478, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadScope.BentoNumpadOnly (BentoNumpad.kt:383)");
                            }
                            int i9 = (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168) | (57344 & i3) | ((i3 << 9) & 458752);
                            boolean z12 = z6;
                            BentoNumpad3.BentoNumpad(modifier4, onKeyPress, z11, customKeyConfig4, z12, z10, composerStartRestartGroup, i9, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            boolean z13 = z11;
                            modifier3 = modifier4;
                            composer2 = composerStartRestartGroup;
                            z7 = z12;
                            z8 = z10;
                            z9 = z13;
                            customKeyConfig3 = customKeyConfig4;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadScope$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoNumpad4.BentoNumpadOnly$lambda$0(this.f$0, modifier3, onKeyPress, z8, z9, z7, customKeyConfig3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    customKeyConfig2 = customKeyConfig;
                    if ((74899 & i3) == 74898) {
                        if (i7 == 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i92 = (i3 & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | ((i3 >> 3) & 896) | ((i3 >> 6) & 7168) | (57344 & i3) | ((i3 << 9) & 458752);
                        boolean z122 = z6;
                        BentoNumpad3.BentoNumpad(modifier4, onKeyPress, z11, customKeyConfig4, z122, z10, composerStartRestartGroup, i92, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        boolean z132 = z11;
                        modifier3 = modifier4;
                        composer2 = composerStartRestartGroup;
                        z7 = z122;
                        z8 = z10;
                        z9 = z132;
                        customKeyConfig3 = customKeyConfig4;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z6 = z3;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                customKeyConfig2 = customKeyConfig;
                if ((74899 & i3) == 74898) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            z5 = z2;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            z6 = z3;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            customKeyConfig2 = customKeyConfig;
            if ((74899 & i3) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z4 = z;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        z5 = z2;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        z6 = z3;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        customKeyConfig2 = customKeyConfig;
        if ((74899 & i3) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x022e  */
    /* JADX WARN: Removed duplicated region for block: B:173:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void BentoNumpadWithButton(Modifier modifier, final Function1<? super KeyEvent, Unit> onKeyPress, final String buttonText, final Function0<Unit> buttonOnClick, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, boolean z6, CustomKeyConfig customKeyConfig, boolean z7, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        boolean z8;
        int i5;
        final boolean z9;
        int i6;
        final boolean z10;
        int i7;
        boolean z11;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        final Modifier modifier3;
        final boolean z12;
        Composer composer2;
        final CustomKeyConfig customKeyConfig2;
        final boolean z13;
        final boolean z14;
        final boolean z15;
        final boolean z16;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(buttonText, "buttonText");
        Intrinsics.checkNotNullParameter(buttonOnClick, "buttonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1025891763);
        int i17 = i3 & 1;
        if (i17 != 0) {
            i4 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i4 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(buttonText) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(buttonOnClick) ? 2048 : 1024;
        }
        int i18 = i3 & 16;
        if (i18 != 0) {
            i4 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                z8 = z;
                i4 |= composerStartRestartGroup.changed(z8) ? 16384 : 8192;
            }
            i5 = i3 & 32;
            if (i5 == 0) {
                i4 |= 196608;
                z9 = z2;
            } else {
                z9 = z2;
                if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(z9) ? 131072 : 65536;
                }
            }
            i6 = i3 & 64;
            if (i6 == 0) {
                i4 |= 1572864;
                z10 = z3;
            } else {
                z10 = z3;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(z10) ? 1048576 : 524288;
                }
            }
            i7 = i3 & 128;
            if (i7 == 0) {
                i4 |= 12582912;
                z11 = z4;
            } else {
                z11 = z4;
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(z11) ? 8388608 : 4194304;
                }
            }
            i8 = i3 & 256;
            if (i8 == 0) {
                i4 |= 100663296;
            } else if ((i & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changed(z5) ? 67108864 : 33554432;
            }
            i9 = i3 & 512;
            if (i9 != 0) {
                if ((i & 805306368) == 0) {
                    i10 = i9;
                    i4 |= composerStartRestartGroup.changed(z6) ? 536870912 : 268435456;
                }
                i11 = i3 & 1024;
                if (i11 != 0) {
                    i13 = i2 | 6;
                    i12 = i11;
                } else if ((i2 & 6) == 0) {
                    i12 = i11;
                    i13 = i2 | (composerStartRestartGroup.changed(customKeyConfig) ? 4 : 2);
                } else {
                    i12 = i11;
                    i13 = i2;
                }
                i14 = i3 & 2048;
                if (i14 != 0) {
                    i13 |= 48;
                    i15 = i14;
                } else if ((i2 & 48) == 0) {
                    i15 = i14;
                    i13 |= composerStartRestartGroup.changed(z7) ? 32 : 16;
                } else {
                    i15 = i14;
                }
                i16 = i13;
                if ((i4 & 306783379) == 306783378 && (i16 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z15 = z5;
                    z14 = z6;
                    z12 = z7;
                    modifier3 = modifier2;
                    composer2 = composerStartRestartGroup;
                    z16 = z11;
                    z13 = z8;
                    customKeyConfig2 = customKeyConfig;
                } else {
                    Modifier modifier4 = i17 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i18 != 0) {
                        z8 = true;
                    }
                    if (i5 != 0) {
                        z9 = true;
                    }
                    boolean z17 = i6 == 0 ? true : z10;
                    if (i7 != 0) {
                        z11 = false;
                    }
                    boolean z18 = i8 == 0 ? true : z5;
                    boolean z19 = i10 == 0 ? z6 : false;
                    CustomKeyConfig customKeyConfig3 = i12 == 0 ? null : customKeyConfig;
                    boolean z20 = i15 == 0 ? z7 : true;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1025891763, i4, i16, "com.robinhood.compose.bento.component.numpad.BentoNumpadScope.BentoNumpadWithButton (BentoNumpad.kt:409)");
                    }
                    int i19 = ((i4 << 3) & 1879048192) | (33554430 & i4) | ((i16 << 21) & 234881024);
                    int i20 = ((i16 << 3) & 112) | ((i4 >> 27) & 14);
                    boolean z21 = z8;
                    boolean z22 = z9;
                    boolean z23 = z19;
                    boolean z24 = z11;
                    Modifier modifier5 = modifier4;
                    boolean z25 = z20;
                    BentoNumpad3.BentoNumpad(modifier5, onKeyPress, buttonText, buttonOnClick, z21, z22, z17, z24, z25, z18, z23, customKeyConfig3, composerStartRestartGroup, i19, i20, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    z12 = z25;
                    composer2 = composerStartRestartGroup;
                    z10 = z17;
                    customKeyConfig2 = customKeyConfig3;
                    z13 = z21;
                    z14 = z23;
                    z15 = z18;
                    z16 = z24;
                    z9 = z22;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadScope$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoNumpad4.BentoNumpadWithButton$lambda$1(this.f$0, modifier3, onKeyPress, buttonText, buttonOnClick, z13, z9, z10, z16, z15, z14, customKeyConfig2, z12, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 805306368;
            i10 = i9;
            i11 = i3 & 1024;
            if (i11 != 0) {
            }
            i14 = i3 & 2048;
            if (i14 != 0) {
            }
            i16 = i13;
            if ((i4 & 306783379) == 306783378) {
                if (i17 == 0) {
                }
                if (i18 != 0) {
                }
                if (i5 != 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                if (i8 == 0) {
                }
                if (i10 == 0) {
                }
                if (i12 == 0) {
                }
                if (i15 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                int i192 = ((i4 << 3) & 1879048192) | (33554430 & i4) | ((i16 << 21) & 234881024);
                int i202 = ((i16 << 3) & 112) | ((i4 >> 27) & 14);
                boolean z212 = z8;
                boolean z222 = z9;
                boolean z232 = z19;
                boolean z242 = z11;
                Modifier modifier52 = modifier4;
                boolean z252 = z20;
                BentoNumpad3.BentoNumpad(modifier52, onKeyPress, buttonText, buttonOnClick, z212, z222, z17, z242, z252, z18, z232, customKeyConfig3, composerStartRestartGroup, i192, i202, 0);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                z12 = z252;
                composer2 = composerStartRestartGroup;
                z10 = z17;
                customKeyConfig2 = customKeyConfig3;
                z13 = z212;
                z14 = z232;
                z15 = z18;
                z16 = z242;
                z9 = z222;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z8 = z;
        i5 = i3 & 32;
        if (i5 == 0) {
        }
        i6 = i3 & 64;
        if (i6 == 0) {
        }
        i7 = i3 & 128;
        if (i7 == 0) {
        }
        i8 = i3 & 256;
        if (i8 == 0) {
        }
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i3 & 1024;
        if (i11 != 0) {
        }
        i14 = i3 & 2048;
        if (i14 != 0) {
        }
        i16 = i13;
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void BentoNumpadWithButton(final BentoNumpadState state, Modifier modifier, final Function1<? super KeyEvent, Unit> onKeyPress, final Function0<Unit> buttonOnClick, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(buttonOnClick, "buttonOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(157340226);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(buttonOnClick) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(157340226, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadScope.BentoNumpadWithButton (BentoNumpad.kt:430)");
                }
                String string2 = StringResources6.getText(state.getButtonText(), composerStartRestartGroup, StringResource.$stable).toString();
                boolean zIsNumpadEnabled = state.isNumpadEnabled();
                boolean zIsButtonEnabled = state.isButtonEnabled();
                boolean zIsButtonVisible = state.isButtonVisible();
                boolean zIsButtonLoading = state.isButtonLoading();
                boolean showDelimiter = state.getShowDelimiter();
                boolean delimiterLocalized = state.getDelimiterLocalized();
                CustomKeyConfig backspaceOverride = state.getBackspaceOverride();
                boolean buttonPositionTop = state.getButtonPositionTop();
                int i5 = ((i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i3 & 7168);
                modifier3 = modifier4;
                BentoNumpad3.BentoNumpad(modifier3, onKeyPress, string2, buttonOnClick, zIsNumpadEnabled, zIsButtonEnabled, zIsButtonVisible, zIsButtonLoading, buttonPositionTop, showDelimiter, delimiterLocalized, backspaceOverride, composerStartRestartGroup, i5, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadScope$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoNumpad4.BentoNumpadWithButton$lambda$2(this.f$0, state, modifier3, onKeyPress, buttonOnClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i2 & 4) == 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String string22 = StringResources6.getText(state.getButtonText(), composerStartRestartGroup, StringResource.$stable).toString();
            boolean zIsNumpadEnabled2 = state.isNumpadEnabled();
            boolean zIsButtonEnabled2 = state.isButtonEnabled();
            boolean zIsButtonVisible2 = state.isButtonVisible();
            boolean zIsButtonLoading2 = state.isButtonLoading();
            boolean showDelimiter2 = state.getShowDelimiter();
            boolean delimiterLocalized2 = state.getDelimiterLocalized();
            CustomKeyConfig backspaceOverride2 = state.getBackspaceOverride();
            boolean buttonPositionTop2 = state.getButtonPositionTop();
            int i52 = ((i3 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE) | (i3 & 7168);
            modifier3 = modifier4;
            BentoNumpad3.BentoNumpad(modifier3, onKeyPress, string22, buttonOnClick, zIsNumpadEnabled2, zIsButtonEnabled2, zIsButtonVisible2, zIsButtonLoading2, buttonPositionTop2, showDelimiter2, delimiterLocalized2, backspaceOverride2, composerStartRestartGroup, i52, 0, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
