package com.robinhood.android.gold.lib.sage;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.gold.sparkle.bento.BentoSparkleButton2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import rh_server_driven_ui.p531v1.Icon;

/* compiled from: GoldSageBottomBar.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\u001am\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00052\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"GoldSageBottomBar", "", "primaryCtaText", "", "onClickPrimaryCta", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "primaryCtaTrailingIcon", "Lrh_server_driven_ui/v1/Icon;", "disclosureMarkdownText", "secondaryCtaText", "onClickSecondaryCta", "isCtaLoading", "", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lrh_server_driven_ui/v1/Icon;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "BottomBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-gold-sage_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.gold.lib.sage.GoldSageBottomBarKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class GoldSageBottomBar3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BottomBarPreview$lambda$1(int i, Composer composer, int i2) {
        BottomBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GoldSageBottomBar$lambda$0(String str, Function0 function0, Modifier modifier, Icon icon, String str2, String str3, Function0 function02, boolean z, int i, int i2, Composer composer, int i3) {
        GoldSageBottomBar(str, function0, modifier, icon, str2, str3, function02, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x013a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoldSageBottomBar(final String primaryCtaText, final Function0<Unit> onClickPrimaryCta, Modifier modifier, Icon icon, String str, String str2, Function0<Unit> function0, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        String str3;
        int i6;
        String str4;
        int i7;
        int i8;
        final boolean z2;
        final String str5;
        final Function0<Unit> function02;
        final String str6;
        final Icon icon2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(primaryCtaText, "primaryCtaText");
        Intrinsics.checkNotNullParameter(onClickPrimaryCta, "onClickPrimaryCta");
        Composer composerStartRestartGroup = composer.startRestartGroup(-764463544);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(primaryCtaText) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickPrimaryCta) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(icon == null ? -1 : icon.ordinal()) ? 2048 : 1024;
            }
            i5 = i2 & 16;
            if (i5 == 0) {
                i3 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    str3 = str;
                    i3 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        str4 = str2;
                        i3 |= composerStartRestartGroup.changed(str4) ? 131072 : 65536;
                    }
                    i7 = i2 & 64;
                    if (i7 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                    }
                    i8 = i2 & 128;
                    if (i8 == 0) {
                        i3 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                        final Icon icon3 = i4 == 0 ? null : icon;
                        if (i5 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        final Function0<Unit> function03 = i7 == 0 ? null : function0;
                        final boolean z3 = i8 == 0 ? false : z;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-764463544, i3, -1, "com.robinhood.android.gold.lib.sage.GoldSageBottomBar (GoldSageBottomBar.kt:33)");
                        }
                        final Modifier modifier5 = modifier4;
                        final String str7 = str3;
                        final String str8 = str4;
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1820896595, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.lib.sage.GoldSageBottomBarKt.GoldSageBottomBar.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i10) {
                                Function0<Unit> function04;
                                String str9;
                                Function0<Unit> function05;
                                Icon icon4;
                                String str10;
                                boolean z4;
                                Composer composer3;
                                if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1820896595, i10, -1, "com.robinhood.android.gold.lib.sage.GoldSageBottomBar.<anonymous> (GoldSageBottomBar.kt:35)");
                                }
                                Modifier modifier6 = modifier5;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier6, bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), composer2, 0, 0);
                                Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                                String str11 = str7;
                                Icon icon5 = icon3;
                                Function0<Unit> function06 = onClickPrimaryCta;
                                String str12 = primaryCtaText;
                                boolean z5 = z3;
                                String str13 = str8;
                                Function0<Unit> function07 = function03;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion.getConstructor();
                                if (composer2.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer2.startReusableNode();
                                if (composer2.getInserting()) {
                                    composer2.createNode(constructor);
                                } else {
                                    composer2.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                composer2.startReplaceGroup(-1279393851);
                                if (str11 == null) {
                                    function04 = function06;
                                    str10 = str12;
                                    z4 = z5;
                                    str9 = str13;
                                    function05 = function07;
                                    composer3 = composer2;
                                    icon4 = icon5;
                                } else {
                                    function04 = function06;
                                    str9 = str13;
                                    function05 = function07;
                                    icon4 = icon5;
                                    str10 = str12;
                                    z4 = z5;
                                    composer3 = composer2;
                                    BentoMarkdownText2.BentoMarkdownText(str11, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i11).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i11).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i11).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM()), composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                                ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon4 != null ? IconKt.getServerValue(icon4) : null);
                                Composer composer4 = composer3;
                                BentoSparkleButton2.BentoSparkleButton(function04, str10, modifierFillMaxWidth$default, serverToBentoAssetMapper2FromServerValue != null ? new BentoButtons.Icon.Size16(serverToBentoAssetMapper2FromServerValue, BentoButtons.Icon.Position.Trailing) : null, false, z4, false, composer4, (BentoButtons.Icon.Size16.$stable << 9) | 384, 80);
                                composer4.startReplaceGroup(-1279360307);
                                if (str9 != null && function05 != null) {
                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i11).m21593getSmallD9Ej5fM()), composer4, 0);
                                    BentoButtonKt.m20586BentoButtonEikTQX8(function05, str9, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, z4, null, null, null, null, false, null, composer2, 24960, 0, 8104);
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        Function0<Unit> function04 = function03;
                        z2 = z3;
                        str5 = str8;
                        function02 = function04;
                        str6 = str7;
                        icon2 = icon3;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        function02 = function0;
                        z2 = z;
                        modifier3 = modifier2;
                        str6 = str3;
                        str5 = str4;
                        icon2 = icon;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.lib.sage.GoldSageBottomBarKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return GoldSageBottomBar3.GoldSageBottomBar$lambda$0(primaryCtaText, onClickPrimaryCta, modifier3, icon2, str6, str5, function02, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                str4 = str2;
                i7 = i2 & 64;
                if (i7 == 0) {
                }
                i8 = i2 & 128;
                if (i8 == 0) {
                }
                if ((i3 & 4793491) == 4793490) {
                    if (i9 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (i8 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    final Modifier modifier52 = modifier4;
                    final String str72 = str3;
                    final String str82 = str4;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1820896595, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.gold.lib.sage.GoldSageBottomBarKt.GoldSageBottomBar.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i10) {
                            Function0<Unit> function042;
                            String str9;
                            Function0<Unit> function05;
                            Icon icon4;
                            String str10;
                            boolean z4;
                            Composer composer3;
                            if ((i10 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1820896595, i10, -1, "com.robinhood.android.gold.lib.sage.GoldSageBottomBar.<anonymous> (GoldSageBottomBar.kt:35)");
                            }
                            Modifier modifier6 = modifier52;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifier6, bentoTheme.getSpacing(composer2, i11).m21590getDefaultD9Ej5fM(), composer2, 0, 0);
                            Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
                            String str11 = str72;
                            Icon icon5 = icon3;
                            Function0<Unit> function06 = onClickPrimaryCta;
                            String str12 = primaryCtaText;
                            boolean z5 = z3;
                            String str13 = str82;
                            Function0<Unit> function07 = function03;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composer2, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21623defaultHorizontalPaddingrAjV9yQ);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.createNode(constructor);
                            } else {
                                composer2.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            composer2.startReplaceGroup(-1279393851);
                            if (str11 == null) {
                                function042 = function06;
                                str10 = str12;
                                z4 = z5;
                                str9 = str13;
                                function05 = function07;
                                composer3 = composer2;
                                icon4 = icon5;
                            } else {
                                function042 = function06;
                                str9 = str13;
                                function05 = function07;
                                icon4 = icon5;
                                str10 = str12;
                                z4 = z5;
                                composer3 = composer2;
                                BentoMarkdownText2.BentoMarkdownText(str11, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i11).getTextS(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i11).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i11).m21426getFg20d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, MarkdownStyle.$stable << 6, 26);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, bentoTheme.getSpacing(composer3, i11).m21590getDefaultD9Ej5fM()), composer3, 0);
                            }
                            composer3.endReplaceGroup();
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(icon4 != null ? IconKt.getServerValue(icon4) : null);
                            Composer composer4 = composer3;
                            BentoSparkleButton2.BentoSparkleButton(function042, str10, modifierFillMaxWidth$default, serverToBentoAssetMapper2FromServerValue != null ? new BentoButtons.Icon.Size16(serverToBentoAssetMapper2FromServerValue, BentoButtons.Icon.Position.Trailing) : null, false, z4, false, composer4, (BentoButtons.Icon.Size16.$stable << 9) | 384, 80);
                            composer4.startReplaceGroup(-1279360307);
                            if (str9 != null && function05 != null) {
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer4, i11).m21593getSmallD9Ej5fM()), composer4, 0);
                                BentoButtonKt.m20586BentoButtonEikTQX8(function05, str9, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, BentoButtons.Type.Secondary, false, z4, null, null, null, null, false, null, composer2, 24960, 0, 8104);
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Function0<Unit> function042 = function03;
                    z2 = z3;
                    str5 = str82;
                    function02 = function042;
                    str6 = str72;
                    icon2 = icon3;
                    modifier3 = modifier52;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str3 = str;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            str4 = str2;
            i7 = i2 & 64;
            if (i7 == 0) {
            }
            i8 = i2 & 128;
            if (i8 == 0) {
            }
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        str3 = str;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        str4 = str2;
        i7 = i2 & 64;
        if (i7 == 0) {
        }
        i8 = i2 & 128;
        if (i8 == 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void BottomBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-41983377);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-41983377, i, -1, "com.robinhood.android.gold.lib.sage.BottomBarPreview (GoldSageBottomBar.kt:79)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, GoldSageBottomBar.INSTANCE.getLambda$1285061559$lib_gold_sage_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.lib.sage.GoldSageBottomBarKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldSageBottomBar3.BottomBarPreview$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
