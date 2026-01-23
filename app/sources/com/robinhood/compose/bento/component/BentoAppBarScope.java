package com.robinhood.compose.bento.component;

import androidx.compose.foundation.Background3;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.Icons2;
import androidx.compose.material.icons.automirrored.filled.ArrowBack;
import androidx.compose.material.icons.filled.Close2;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.IconKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.vector.ImageVector;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.compose.C11917R;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoAppBar.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J=\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ;\u0010\u0010\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0007¢\u0006\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/compose/bento/component/BentoAppBarScope;", "", "<init>", "()V", "BentoBackButton", "", "modifier", "Landroidx/compose/ui/Modifier;", "isBackgroundTransparent", "", "tint", "Landroidx/compose/ui/graphics/Color;", "onBackClick", "Lkotlin/Function0;", "BentoBackButton-drOMvmE", "(Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/graphics/Color;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "BentoCloseButton", "onCloseClick", "BentoCloseButton-cf5BqRc", "(Landroidx/compose/ui/Modifier;ZJLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes20.dex */
public final class BentoAppBarScope {
    public static final int $stable = 0;
    public static final BentoAppBarScope INSTANCE = new BentoAppBarScope();

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBackButton_drOMvmE$lambda$0(BentoAppBarScope bentoAppBarScope, Modifier modifier, boolean z, Color color, Function0 function0, int i, int i2, Composer composer, int i3) {
        bentoAppBarScope.m20575BentoBackButtondrOMvmE(modifier, z, color, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCloseButton_cf5BqRc$lambda$1(BentoAppBarScope bentoAppBarScope, Modifier modifier, boolean z, long j, Function0 function0, int i, int i2, Composer composer, int i3) {
        bentoAppBarScope.m20576BentoCloseButtoncf5BqRc(modifier, z, j, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private BentoAppBarScope() {
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:78:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoBackButton-drOMvmE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20575BentoBackButtondrOMvmE(Modifier modifier, boolean z, Color color, final Function0<Unit> onBackClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        int i4;
        Color color2;
        boolean z3;
        long jM21684getBackgroundColor0d7_KjU;
        final Modifier modifier3;
        final Color color3;
        final boolean z4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1999972843);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            modifier2 = modifier;
        } else if ((i & 6) == 0) {
            modifier2 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier2) ? 4 : 2) | i;
        } else {
            modifier2 = modifier;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    color2 = color;
                    i3 |= composerStartRestartGroup.changed(color2) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    z3 = i6 == 0 ? true : z2;
                    final Color color4 = i4 == 0 ? null : color2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1999972843, i3, -1, "com.robinhood.compose.bento.component.BentoAppBarScope.BentoBackButton (BentoAppBar.kt:193)");
                    }
                    composerStartRestartGroup.startReplaceGroup(-2123513622);
                    if (!z3) {
                        jM21684getBackgroundColor0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                    } else {
                        jM21684getBackgroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getAppBar(composerStartRestartGroup, 0).getColors().m21684getBackgroundColor0d7_KjU();
                    }
                    long j = jM21684getBackgroundColor0d7_KjU;
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifier5 = modifier4;
                    Color color5 = color4;
                    IconButton5.IconButton(onBackClick, LocalShowPlaceholder.withBentoPlaceholder$default(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(modifier5, j, null, 2, null), BentoAppBarDefaults.NavIconTestTag), false, null, 3, null), false, null, null, ComposableLambda3.rememberComposableLambda(977120472, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarScope$BentoBackButton$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i7) {
                            if ((i7 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(977120472, i7, -1, "com.robinhood.compose.bento.component.BentoAppBarScope.BentoBackButton.<anonymous> (BentoAppBar.kt:206)");
                            }
                            ImageVector arrowBack = ArrowBack.getArrowBack(Icons2.INSTANCE);
                            String strStringResource = StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer2, 0);
                            Color color6 = color4;
                            composer2.startReplaceGroup(-1585057935);
                            long jM21685getForegroundColor0d7_KjU = color6 == null ? ((Styles) composer2.consume(Styles2.getLocalStyles())).getAppBar(composer2, 0).getColors().m21685getForegroundColor0d7_KjU() : color6.getValue();
                            composer2.endReplaceGroup();
                            IconKt.m5872Iconww6aTOc(arrowBack, strStringResource, (Modifier) null, jM21685getForegroundColor0d7_KjU, composer2, 0, 4);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 196608, 28);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    color3 = color5;
                    z4 = z3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z4 = z2;
                    color3 = color2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarScope$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BentoAppBarScope.BentoBackButton_drOMvmE$lambda$0(this.f$0, modifier3, z4, color3, onBackClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            color2 = color;
            if ((i2 & 8) != 0) {
            }
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(-2123513622);
                if (!z3) {
                }
                long j2 = jM21684getBackgroundColor0d7_KjU;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier52 = modifier4;
                Color color52 = color4;
                IconButton5.IconButton(onBackClick, LocalShowPlaceholder.withBentoPlaceholder$default(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(modifier52, j2, null, 2, null), BentoAppBarDefaults.NavIconTestTag), false, null, 3, null), false, null, null, ComposableLambda3.rememberComposableLambda(977120472, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarScope$BentoBackButton$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(977120472, i7, -1, "com.robinhood.compose.bento.component.BentoAppBarScope.BentoBackButton.<anonymous> (BentoAppBar.kt:206)");
                        }
                        ImageVector arrowBack = ArrowBack.getArrowBack(Icons2.INSTANCE);
                        String strStringResource = StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer2, 0);
                        Color color6 = color4;
                        composer2.startReplaceGroup(-1585057935);
                        long jM21685getForegroundColor0d7_KjU = color6 == null ? ((Styles) composer2.consume(Styles2.getLocalStyles())).getAppBar(composer2, 0).getColors().m21685getForegroundColor0d7_KjU() : color6.getValue();
                        composer2.endReplaceGroup();
                        IconKt.m5872Iconww6aTOc(arrowBack, strStringResource, (Modifier) null, jM21685getForegroundColor0d7_KjU, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 9) & 14) | 196608, 28);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                color3 = color52;
                z4 = z3;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        color2 = color;
        if ((i2 & 8) != 0) {
        }
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* renamed from: BentoCloseButton-cf5BqRc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void m20576BentoCloseButtoncf5BqRc(Modifier modifier, boolean z, long j, final Function0<Unit> onCloseClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        boolean z2;
        long jM21685getForegroundColor0d7_KjU;
        Modifier modifier3;
        boolean z3;
        long jM21684getBackgroundColor0d7_KjU;
        final boolean z4;
        final long j2;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(854918932);
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
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                jM21685getForegroundColor0d7_KjU = j;
                i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(jM21685getForegroundColor0d7_KjU)) ? 256 : 128;
            } else {
                jM21685getForegroundColor0d7_KjU = j;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i5 != 0) {
                        z2 = true;
                    }
                    if ((i2 & 4) != 0) {
                        jM21685getForegroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getAppBar(composerStartRestartGroup, 0).getColors().m21685getForegroundColor0d7_KjU();
                        i3 &= -897;
                    }
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    modifier3 = modifier2;
                }
                final long j3 = jM21685getForegroundColor0d7_KjU;
                z3 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(854918932, i3, -1, "com.robinhood.compose.bento.component.BentoAppBarScope.BentoCloseButton (BentoAppBar.kt:220)");
                }
                composerStartRestartGroup.startReplaceGroup(1238348777);
                if (!z3) {
                    jM21684getBackgroundColor0d7_KjU = Color.INSTANCE.m6725getTransparent0d7_KjU();
                } else {
                    jM21684getBackgroundColor0d7_KjU = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getAppBar(composerStartRestartGroup, 0).getColors().m21684getBackgroundColor0d7_KjU();
                }
                long j4 = jM21684getBackgroundColor0d7_KjU;
                composerStartRestartGroup.endReplaceGroup();
                IconButton5.IconButton(onCloseClick, LocalShowPlaceholder.withBentoPlaceholder$default(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(modifier3, j4, null, 2, null), BentoAppBarDefaults.NavIconTestTag), false, null, 3, null), false, null, null, ComposableLambda3.rememberComposableLambda(-1344468815, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarScope$BentoCloseButton$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1344468815, i6, -1, "com.robinhood.compose.bento.component.BentoAppBarScope.BentoCloseButton.<anonymous> (BentoAppBar.kt:233)");
                        }
                        IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer2, 0), (Modifier) null, j3, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608 | ((i3 >> 9) & 14), 28);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z4 = z3;
                j2 = j3;
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
                z4 = z2;
                j2 = jM21685getForegroundColor0d7_KjU;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.BentoAppBarScope$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoAppBarScope.BentoCloseButton_cf5BqRc$lambda$1(this.f$0, modifier4, z4, j2, onCloseClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        z2 = z;
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) == 0) {
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
                modifier3 = modifier5;
                final long j32 = jM21685getForegroundColor0d7_KjU;
                z3 = z2;
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1238348777);
                if (!z3) {
                }
                long j42 = jM21684getBackgroundColor0d7_KjU;
                composerStartRestartGroup.endReplaceGroup();
                IconButton5.IconButton(onCloseClick, LocalShowPlaceholder.withBentoPlaceholder$default(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(modifier3, j42, null, 2, null), BentoAppBarDefaults.NavIconTestTag), false, null, 3, null), false, null, null, ComposableLambda3.rememberComposableLambda(-1344468815, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.BentoAppBarScope$BentoCloseButton$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1344468815, i6, -1, "com.robinhood.compose.bento.component.BentoAppBarScope.BentoCloseButton.<anonymous> (BentoAppBar.kt:233)");
                        }
                        IconKt.m5872Iconww6aTOc(Close2.getClose(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C11917R.string.app_bar_navigate_back, composer2, 0), (Modifier) null, j32, composer2, 0, 4);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608 | ((i3 >> 9) & 14), 28);
                if (ComposerKt.isTraceInProgress()) {
                }
                z4 = z3;
                j2 = j32;
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
