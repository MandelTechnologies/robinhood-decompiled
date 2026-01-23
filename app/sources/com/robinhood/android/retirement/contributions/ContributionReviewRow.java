package com.robinhood.android.retirement.contributions;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: ContributionReviewRow.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001aU\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n2\b\b\u0002\u0010\u000b\u001a\u00020\b2\b\b\u0002\u0010\f\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"ContributionReviewRow", "", "modifier", "Landroidx/compose/ui/Modifier;", AnnotatedPrivateKey.LABEL, "", "value", "enabled", "", "onClick", "Lkotlin/Function0;", "locked", "showBottomDivider", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;ZZLandroidx/compose/runtime/Composer;II)V", "lib-retirement-contributions_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.retirement.contributions.ContributionReviewRowKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ContributionReviewRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ContributionReviewRow$lambda$0(Modifier modifier, String str, String str2, boolean z, Function0 function0, boolean z2, boolean z3, int i, int i2, Composer composer, int i3) {
        ContributionReviewRow(modifier, str, str2, z, function0, z2, z3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:114:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ContributionReviewRow(Modifier modifier, final String label, final String value, final boolean z, Function0<Unit> function0, boolean z2, boolean z3, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        Function0<Unit> function02;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        Function0<Unit> function03;
        boolean z6;
        final long jM21427getFg30d7_KjU;
        Function0<Unit> function04;
        Modifier modifierM4893clickableXHw0xAI$default;
        Composer composer2;
        final Modifier modifier3;
        final boolean z7;
        final Function0<Unit> function05;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(label, "label");
        Intrinsics.checkNotNullParameter(value, "value");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2142213081);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(label) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(value) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 == 0) {
                    if ((1572864 & i) == 0) {
                        z5 = z3;
                        i3 |= composerStartRestartGroup.changed(z5) ? 1048576 : 524288;
                    }
                    if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        function03 = i7 == 0 ? null : function02;
                        z6 = i4 == 0 ? false : z4;
                        if (i5 != 0) {
                            z5 = true;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-2142213081, i3, -1, "com.robinhood.android.retirement.contributions.ContributionReviewRow (ContributionReviewRow.kt:21)");
                        }
                        final ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = !z6 ? ServerToBentoAssetMapper2.LOCK_12 : ServerToBentoAssetMapper2.CARET_RIGHT_12;
                        if (z6) {
                            composerStartRestartGroup.startReplaceGroup(-1377422998);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21427getFg30d7_KjU();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(-1377423831);
                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21425getFg0d7_KjU();
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        if (function03 == null) {
                            modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(Modifier.INSTANCE, false, null, null, function03, 7, null);
                            function04 = function03;
                        } else {
                            function04 = function03;
                            modifierM4893clickableXHw0xAI$default = Modifier.INSTANCE;
                        }
                        boolean z9 = z6;
                        boolean z10 = z5;
                        composer2 = composerStartRestartGroup;
                        BentoBaseRowLayout.BentoBaseRowLayout(modifier2.then(modifierM4893clickableXHw0xAI$default), null, null, ComposableLambda3.rememberComposableLambda(37150218, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewRowKt.ContributionReviewRow.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                long jM21427getFg30d7_KjU2;
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(37150218, i8, -1, "com.robinhood.android.retirement.contributions.ContributionReviewRow.<anonymous> (ContributionReviewRow.kt:34)");
                                }
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i9 = BentoTheme.$stable;
                                TextStyle textS = bentoTheme.getTypography(composer3, i9).getTextS();
                                if (z) {
                                    composer3.startReplaceGroup(1341626349);
                                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer3, i9).m21426getFg20d7_KjU();
                                } else {
                                    composer3.startReplaceGroup(1341627213);
                                    jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer3, i9).m21427getFg30d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(label, null, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2147125719, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewRowKt.ContributionReviewRow.2
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                long jM21427getFg30d7_KjU2;
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2147125719, i8, -1, "com.robinhood.android.retirement.contributions.ContributionReviewRow.<anonymous> (ContributionReviewRow.kt:41)");
                                }
                                String str = value;
                                if (z) {
                                    composer3.startReplaceGroup(-1803510357);
                                    jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                                } else {
                                    composer3.startReplaceGroup(-1803509524);
                                    jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(2074256999, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewRowKt.ContributionReviewRow.3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i8) {
                                if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2074256999, i8, -1, "com.robinhood.android.retirement.contributions.ContributionReviewRow.<anonymous> (ContributionReviewRow.kt:47)");
                                }
                                BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                                composer3.startReplaceGroup(496155456);
                                long jM21427getFg30d7_KjU2 = z ? jM21427getFg30d7_KjU : BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                                composer3.endReplaceGroup();
                                BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21427getFg30d7_KjU2, null, null, false, composer3, BentoIcon4.Size12.$stable | 48, 56);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), z10, false, false, null, composer2, ((i3 << 3) & 29360128) | 1600512, 0, 1830);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        modifier3 = modifier2;
                        z7 = z10;
                        function05 = function04;
                        z8 = z9;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        modifier3 = modifier2;
                        function05 = function02;
                        z8 = z4;
                        z7 = z5;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewRowKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ContributionReviewRow.ContributionReviewRow$lambda$0(modifier3, label, value, z, function05, z8, z7, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 1572864;
                z5 = z3;
                if ((599187 & i3) == 599186) {
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (!z6) {
                    }
                    if (z6) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    if (function03 == null) {
                    }
                    boolean z92 = z6;
                    boolean z102 = z5;
                    composer2 = composerStartRestartGroup;
                    BentoBaseRowLayout.BentoBaseRowLayout(modifier2.then(modifierM4893clickableXHw0xAI$default), null, null, ComposableLambda3.rememberComposableLambda(37150218, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewRowKt.ContributionReviewRow.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            long jM21427getFg30d7_KjU2;
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(37150218, i8, -1, "com.robinhood.android.retirement.contributions.ContributionReviewRow.<anonymous> (ContributionReviewRow.kt:34)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            TextStyle textS = bentoTheme.getTypography(composer3, i9).getTextS();
                            if (z) {
                                composer3.startReplaceGroup(1341626349);
                                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer3, i9).m21426getFg20d7_KjU();
                            } else {
                                composer3.startReplaceGroup(1341627213);
                                jM21427getFg30d7_KjU2 = bentoTheme.getColors(composer3, i9).m21427getFg30d7_KjU();
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(label, null, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, textS, composer3, 0, 0, 8186);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-2147125719, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewRowKt.ContributionReviewRow.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            long jM21427getFg30d7_KjU2;
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2147125719, i8, -1, "com.robinhood.android.retirement.contributions.ContributionReviewRow.<anonymous> (ContributionReviewRow.kt:41)");
                            }
                            String str = value;
                            if (z) {
                                composer3.startReplaceGroup(-1803510357);
                                jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21425getFg0d7_KjU();
                            } else {
                                composer3.startReplaceGroup(-1803509524);
                                jM21427getFg30d7_KjU2 = BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                            }
                            composer3.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(jM21427getFg30d7_KjU2), null, null, null, null, 0, false, 0, 0, null, 0, null, composer3, 0, 0, 16378);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), null, ComposableLambda3.rememberComposableLambda(2074256999, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.retirement.contributions.ContributionReviewRowKt.ContributionReviewRow.3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2074256999, i8, -1, "com.robinhood.android.retirement.contributions.ContributionReviewRow.<anonymous> (ContributionReviewRow.kt:47)");
                            }
                            BentoIcon4.Size12 size12 = new BentoIcon4.Size12(serverToBentoAssetMapper2);
                            composer3.startReplaceGroup(496155456);
                            long jM21427getFg30d7_KjU2 = z ? jM21427getFg30d7_KjU : BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21427getFg30d7_KjU();
                            composer3.endReplaceGroup();
                            BentoIcon2.m20644BentoIconFU0evQE(size12, null, jM21427getFg30d7_KjU2, null, null, false, composer3, BentoIcon4.Size12.$stable | 48, 56);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), z102, false, false, null, composer2, ((i3 << 3) & 29360128) | 1600512, 0, 1830);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier2;
                    z7 = z102;
                    function05 = function04;
                    z8 = z92;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z4 = z2;
            i5 = i2 & 64;
            if (i5 == 0) {
            }
            z5 = z3;
            if ((599187 & i3) == 599186) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function02 = function0;
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        z4 = z2;
        i5 = i2 & 64;
        if (i5 == 0) {
        }
        z5 = z3;
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
