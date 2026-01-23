package com.robinhood.android.equityscreener.intro;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.AspectRatio3;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsPadding6;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.material3.ContentColor3;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiController3;
import com.robinhood.android.equityscreener.C15652R;
import com.robinhood.android.responsive.AspectRatio;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.TopBarScrollState3;
import com.robinhood.compose.bento.theme.BentoColor2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.theme.Spacing2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ScreenerIntroComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\u001a)\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0001¢\u0006\u0002\u0010\u0005\u001a]\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\b\b\u0002\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\r2\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u0003H\u0003¢\u0006\u0004\b\u0010\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0015\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0013¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0018X\u008a\u0084\u0002"}, m3636d2 = {"ScreenerIntroComposable", "", "onCtaClick", "Lkotlin/Function0;", "onBackClick", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "BasicIntroScreen", "headerPainter", "Landroidx/compose/ui/graphics/painter/Painter;", "headerBackgroundColor", "Landroidx/compose/ui/graphics/Color;", "backButtonColor", "titleText", "", "descriptionText", "ctaText", "BasicIntroScreen-RakH_j8", "(Landroidx/compose/ui/graphics/painter/Painter;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ScreenerIntroPreview", "(Landroidx/compose/runtime/Composer;I)V", "ScreenerIntroPreviewFoldable", "ScreenerIntroPreviewTablet", "feature-equity-screener_externalDebug", "showFooterDivider", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class ScreenerIntroComposable6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BasicIntroScreen_RakH_j8$lambda$12(Painter painter, long j, long j2, String str, String str2, String str3, Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        m13994BasicIntroScreenRakH_j8(painter, j, j2, str, str2, str3, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerIntroComposable$lambda$0(Function0 function0, Function0 function02, int i, Composer composer, int i2) {
        ScreenerIntroComposable(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerIntroPreview$lambda$13(int i, Composer composer, int i2) {
        ScreenerIntroPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerIntroPreviewFoldable$lambda$14(int i, Composer composer, int i2) {
        ScreenerIntroPreviewFoldable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerIntroPreviewTablet$lambda$15(int i, Composer composer, int i2) {
        ScreenerIntroPreviewTablet(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ScreenerIntroComposable(final Function0<Unit> onCtaClick, final Function0<Unit> onBackClick, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(onCtaClick, "onCtaClick");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-470065254);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(onCtaClick) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-470065254, i2, -1, "com.robinhood.android.equityscreener.intro.ScreenerIntroComposable (ScreenerIntroComposable.kt:52)");
            }
            BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-570849371, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt.ScreenerIntroComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-570849371, i3, -1, "com.robinhood.android.equityscreener.intro.ScreenerIntroComposable.<anonymous> (ScreenerIntroComposable.kt:54)");
                    }
                    ScreenerIntroComposable6.m13994BasicIntroScreenRakH_j8(PainterResources_androidKt.painterResource(C15652R.drawable.screener_intro_header, composer2, 0), BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).getStratos(), 0L, StringResources_androidKt.stringResource(C15652R.string.screener_intro_title, composer2, 0), StringResources_androidKt.stringResource(C15652R.string.screener_intro_description, composer2, 0), StringResources_androidKt.stringResource(C15652R.string.screener_intro_cta, composer2, 0), onCtaClick, onBackClick, composer2, 0, 4);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerIntroComposable6.ScreenerIntroComposable$lambda$0(onCtaClick, onBackClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:104:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0453  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x045f  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0463  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0490  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x04b8  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x056d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0579  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x057d  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0623  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x0636  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0658  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0662  */
    /* JADX WARN: Removed duplicated region for block: B:193:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0100  */
    /* renamed from: BasicIntroScreen-RakH_j8, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m13994BasicIntroScreenRakH_j8(final Painter painter, final long j, long j2, final String str, final String str2, final String str3, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i, final int i2) {
        int i3;
        long j3;
        int i4;
        final long j4;
        Object objRememberedValue;
        Composer.Companion companion;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        int currentCompositeKeyHash4;
        Composer composerM6388constructorimpl4;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4;
        int currentCompositeKeyHash5;
        Composer composerM6388constructorimpl5;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5;
        final SystemUiController systemUiControllerRememberSystemUiController;
        final long jM21371getBg0d7_KjU;
        boolean zChanged;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1074052968);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(painter) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(j) ? 32 : 16;
            }
            if ((i & 384) != 0) {
                j3 = j2;
                i3 |= ((i2 & 4) == 0 && composerStartRestartGroup.changed(j3)) ? 256 : 128;
            } else {
                j3 = j2;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
                    }
                    if ((i2 & 32) != 0) {
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
                        }
                        if ((i2 & 64) != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function0) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                        }
                        i4 = i3;
                        if ((4793491 & i4) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                        } else {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                if ((i2 & 4) == 0) {
                                    long jM21356contrastColorRGew2ao = BentoColor2.m21356contrastColorRGew2ao(j, 0L, 0L, composerStartRestartGroup, (i4 >> 3) & 14, 3);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    i4 &= -897;
                                    j4 = jM21356contrastColorRGew2ao;
                                }
                                int i5 = i4;
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1074052968, i5, -1, "com.robinhood.android.equityscreener.intro.BasicIntroScreen (ScreenerIntroComposable.kt:77)");
                                }
                                final LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = SnapshotStateKt.derivedStateOf(new Function0() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return Boolean.valueOf(ScreenerIntroComposable6.BasicIntroScreen_RakH_j8$lambda$2$lambda$1(lazyListStateRememberLazyListState));
                                        }
                                    });
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                SnapshotState4 snapshotState4 = (SnapshotState4) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                WindowInsets.Companion companion3 = WindowInsets.INSTANCE;
                                Modifier modifierWindowInsetsPadding = WindowInsetsPadding6.windowInsetsPadding(modifierFillMaxSize$default, WindowInsets_androidKt.getNavigationBars(companion3, composerStartRestartGroup, 6));
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding);
                                ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.createNode(constructor);
                                } else {
                                    composerStartRestartGroup.useNode();
                                }
                                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                Arrangement arrangement = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                                Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor2);
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), AspectRatio.INSTANCE.getHeroImage(composerStartRestartGroup, AspectRatio.$stable), false, 2, null), j, null, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenter(), false);
                                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default);
                                Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor3);
                                }
                                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                                setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                                Modifier modifierFillMaxSize$default3 = SizeKt.fillMaxSize$default(companion2, 0.0f, 1, null);
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                Composer composer2 = composerStartRestartGroup;
                                ImageKt.Image(painter, (String) null, PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer2, (i5 & 14) | 24624, 104);
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance.align(companion2, companion4.getBottomCenter()), 0L, 0.0f, composer2, 0, 6);
                                composer2.endNode();
                                BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getBookCoverCapsuleSmall(), composer2, (i5 >> 9) & 14, 0, 8188);
                                int i7 = i5 >> 12;
                                BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21595getXsmallD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getTextM(), composer2, i7 & 14, 0, 8188);
                                composerStartRestartGroup = composer2;
                                Spacer2.Spacer(Column5.weight$default(column6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), companion4.getCenterHorizontally(), composerStartRestartGroup, 48);
                                currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                                Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor4);
                                }
                                composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                                setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU(), !BasicIntroScreen_RakH_j8$lambda$3(snapshotState4) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, str3, WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 10, null), WindowInsets_androidKt.getNavigationBars(companion3, composerStartRestartGroup, 6)), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i5 >> 18) & 14) | (i7 & 112), 0, 8184);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                Modifier modifierWindowInsetsPadding2 = WindowInsetsPadding6.windowInsetsPadding(boxScopeInstance.align(companion2, companion4.getTopCenter()), WindowInsets_androidKt.getStatusBars(companion3, composerStartRestartGroup, 6));
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                                currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding2);
                                Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                    composerStartRestartGroup.useNode();
                                } else {
                                    composerStartRestartGroup.createNode(constructor5);
                                }
                                composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy3, companion5.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                                setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                                    composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                    composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ScreenerIntroComposable.INSTANCE.m13987getLambda$175820847$feature_equity_screener_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-2092904923, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$BasicIntroScreen$1$2$1
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                        if ((i8 & 6) == 0) {
                                            i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                        }
                                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-2092904923, i8, -1, "com.robinhood.android.equityscreener.intro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous> (ScreenerIntroComposable.kt:169)");
                                        }
                                        ProvidedValue<Color> providedValueProvides = ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j4));
                                        final Function0<Unit> function03 = function02;
                                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-385535259, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$BasicIntroScreen$1$2$1.1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                invoke(composer4, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer4, int i9) {
                                                if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                                    composer4.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-385535259, i9, -1, "com.robinhood.android.equityscreener.intro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenerIntroComposable.kt:170)");
                                                }
                                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "screener_intro_back_button"), false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | 6, 6);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2010);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                                jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU();
                                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiControllerRememberSystemUiController, j, false, null, 6, null);
                                Color colorM6701boximpl = Color.m6701boximpl(j);
                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((i5 & 112) == 32) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda5
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ScreenerIntroComposable6.BasicIntroScreen_RakH_j8$lambda$11$lambda$10(systemUiControllerRememberSystemUiController, j, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.DisposableEffect(colorM6701boximpl, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, (i5 >> 3) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                j3 = j4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                if ((i2 & 4) != 0) {
                                    i4 &= -897;
                                }
                            }
                            j4 = j3;
                            int i52 = i4;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final LazyListState lazyListStateRememberLazyListState2 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            SnapshotState4 snapshotState42 = (SnapshotState4) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion22 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default4 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                            WindowInsets.Companion companion32 = WindowInsets.INSTANCE;
                            Modifier modifierWindowInsetsPadding3 = WindowInsetsPadding6.windowInsetsPadding(modifierFillMaxSize$default4, WindowInsets_androidKt.getNavigationBars(companion32, composerStartRestartGroup, 6));
                            Alignment.Companion companion42 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy4 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding3);
                            ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor6 = companion52.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy4, companion52.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion52.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion52.getSetModifier());
                                BoxScopeInstance boxScopeInstance2 = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxSize$default22 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                                Arrangement arrangement2 = Arrangement.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion42.getStart(), composerStartRestartGroup, 0);
                                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default22);
                                Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                                if (composerStartRestartGroup.getApplier() == null) {
                                }
                                composerStartRestartGroup.startReusableNode();
                                if (composerStartRestartGroup.getInserting()) {
                                }
                                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy3, companion52.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                                setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                                if (!composerM6388constructorimpl2.getInserting()) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(AspectRatio3.aspectRatio$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), AspectRatio.INSTANCE.getHeroImage(composerStartRestartGroup, AspectRatio.$stable), false, 2, null), j, null, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy22 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getCenter(), false);
                                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4872backgroundbw27NRU$default2);
                                    Function0<ComposeUiNode> constructor32 = companion52.getConstructor();
                                    if (composerStartRestartGroup.getApplier() == null) {
                                    }
                                    composerStartRestartGroup.startReusableNode();
                                    if (composerStartRestartGroup.getInserting()) {
                                    }
                                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy22, companion52.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion52.getSetResolvedCompositionLocals());
                                    setCompositeKeyHash3 = companion52.getSetCompositeKeyHash();
                                    if (!composerM6388constructorimpl3.getInserting()) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion52.getSetModifier());
                                        Modifier modifierFillMaxSize$default32 = SizeKt.fillMaxSize$default(companion22, 0.0f, 1, null);
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i62 = BentoTheme.$stable;
                                        Composer composer22 = composerStartRestartGroup;
                                        ImageKt.Image(painter, (String) null, PaddingKt.m5142padding3ABfNKs(modifierFillMaxSize$default32, bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer22, (i52 & 14) | 24624, 104);
                                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(boxScopeInstance2.align(companion22, companion42.getBottomCenter()), 0L, 0.0f, composer22, 0, 6);
                                        composer22.endNode();
                                        BentoText2.m20747BentoText38GnDrw(str, PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composer22, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer22, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer22, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer22, i62).m21593getSmallD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer22, i62).getBookCoverCapsuleSmall(), composer22, (i52 >> 9) & 14, 0, 8188);
                                        int i72 = i52 >> 12;
                                        BentoText2.m20747BentoText38GnDrw(str2, PaddingKt.m5145paddingqDBjuR0(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), bentoTheme2.getSpacing(composer22, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer22, i62).m21595getXsmallD9Ej5fM(), bentoTheme2.getSpacing(composer22, i62).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composer22, i62).m21592getMediumD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer22, i62).getTextM(), composer22, i72 & 14, 0, 8188);
                                        composerStartRestartGroup = composer22;
                                        Spacer2.Spacer(Column5.weight$default(column62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), companion42.getCenterHorizontally(), composerStartRestartGroup, 48);
                                        currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                        CompositionLocalMap currentCompositionLocalMap42 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier42 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion22);
                                        Function0<ComposeUiNode> constructor42 = companion52.getConstructor();
                                        if (composerStartRestartGroup.getApplier() == null) {
                                        }
                                        composerStartRestartGroup.startReusableNode();
                                        if (composerStartRestartGroup.getInserting()) {
                                        }
                                        composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy22, companion52.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap42, companion52.getSetResolvedCompositionLocals());
                                        setCompositeKeyHash4 = companion52.getSetCompositeKeyHash();
                                        if (!composerM6388constructorimpl4.getInserting()) {
                                            composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                            composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier42, companion52.getSetModifier());
                                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU(), !BasicIntroScreen_RakH_j8$lambda$3(snapshotState42) ? 1.0f : 0.0f, 0.0f, 0.0f, 0.0f, 14, null), 0.0f, composerStartRestartGroup, 0, 5);
                                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, str3, WindowInsetsPadding6.windowInsetsPadding(PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, ((C2002Dp) composerStartRestartGroup.consume(Spacing2.getLocalHorizontalPadding())).getValue(), 0.0f, 10, null), WindowInsets_androidKt.getNavigationBars(companion32, composerStartRestartGroup, 6)), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i52 >> 18) & 14) | (i72 & 112), 0, 8184);
                                            composerStartRestartGroup.endNode();
                                            composerStartRestartGroup.endNode();
                                            Modifier modifierWindowInsetsPadding22 = WindowInsetsPadding6.windowInsetsPadding(boxScopeInstance2.align(companion22, companion42.getTopCenter()), WindowInsets_androidKt.getStatusBars(companion32, composerStartRestartGroup, 6));
                                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy32 = BoxKt.maybeCachedBoxMeasurePolicy(companion42.getTopStart(), false);
                                            currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                                            CompositionLocalMap currentCompositionLocalMap52 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                                            Modifier modifierMaterializeModifier52 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding22);
                                            Function0<ComposeUiNode> constructor52 = companion52.getConstructor();
                                            if (composerStartRestartGroup.getApplier() == null) {
                                            }
                                            composerStartRestartGroup.startReusableNode();
                                            if (composerStartRestartGroup.getInserting()) {
                                            }
                                            composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                            Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyMaybeCachedBoxMeasurePolicy32, companion52.getSetMeasurePolicy());
                                            Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap52, companion52.getSetResolvedCompositionLocals());
                                            setCompositeKeyHash5 = companion52.getSetCompositeKeyHash();
                                            if (!composerM6388constructorimpl5.getInserting()) {
                                                composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                                                composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                                                Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier52, companion52.getSetModifier());
                                                BentoAppBarKt.m20573BentoAppBarSGdaT3c(ScreenerIntroComposable.INSTANCE.m13987getLambda$175820847$feature_equity_screener_externalDebug(), null, ComposableLambda3.rememberComposableLambda(-2092904923, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$BasicIntroScreen$1$2$1
                                                    @Override // kotlin.jvm.functions.Function3
                                                    public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer3, Integer num) {
                                                        invoke(bentoAppBarScope, composer3, num.intValue());
                                                        return Unit.INSTANCE;
                                                    }

                                                    public final void invoke(final BentoAppBarScope BentoAppBar, Composer composer3, int i8) {
                                                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                                        if ((i8 & 6) == 0) {
                                                            i8 |= (i8 & 8) == 0 ? composer3.changed(BentoAppBar) : composer3.changedInstance(BentoAppBar) ? 4 : 2;
                                                        }
                                                        if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                                            composer3.skipToGroupEnd();
                                                            return;
                                                        }
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventStart(-2092904923, i8, -1, "com.robinhood.android.equityscreener.intro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous> (ScreenerIntroComposable.kt:169)");
                                                        }
                                                        ProvidedValue<Color> providedValueProvides = ContentColor3.getLocalContentColor().provides(Color.m6701boximpl(j4));
                                                        final Function0<Unit> function03 = function02;
                                                        CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(-385535259, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$BasicIntroScreen$1$2$1.1
                                                            @Override // kotlin.jvm.functions.Function2
                                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                                invoke(composer4, num.intValue());
                                                                return Unit.INSTANCE;
                                                            }

                                                            public final void invoke(Composer composer4, int i9) {
                                                                if ((i9 & 3) == 2 && composer4.getSkipping()) {
                                                                    composer4.skipToGroupEnd();
                                                                    return;
                                                                }
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventStart(-385535259, i9, -1, "com.robinhood.android.equityscreener.intro.BasicIntroScreen.<anonymous>.<anonymous>.<anonymous>.<anonymous> (ScreenerIntroComposable.kt:170)");
                                                                }
                                                                BentoAppBar.m20575BentoBackButtondrOMvmE(TestTag3.testTag(Modifier.INSTANCE, "screener_intro_back_button"), false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | 6, 6);
                                                                if (ComposerKt.isTraceInProgress()) {
                                                                    ComposerKt.traceEventEnd();
                                                                }
                                                            }
                                                        }, composer3, 54), composer3, ProvidedValue.$stable | 48);
                                                        if (ComposerKt.isTraceInProgress()) {
                                                            ComposerKt.traceEventEnd();
                                                        }
                                                    }
                                                }, composerStartRestartGroup, 54), null, null, true, false, null, null, 0L, null, composerStartRestartGroup, 196998, 0, 2010);
                                                composerStartRestartGroup.endNode();
                                                composerStartRestartGroup.endNode();
                                                systemUiControllerRememberSystemUiController = SystemUiController3.rememberSystemUiController(null, composerStartRestartGroup, 0, 1);
                                                jM21371getBg0d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU();
                                                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiControllerRememberSystemUiController, j, false, null, 6, null);
                                                Color colorM6701boximpl2 = Color.m6701boximpl(j);
                                                composerStartRestartGroup.startReplaceGroup(-1746271574);
                                                zChanged = composerStartRestartGroup.changed(systemUiControllerRememberSystemUiController) | ((i52 & 112) == 32) | composerStartRestartGroup.changed(jM21371getBg0d7_KjU);
                                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (!zChanged) {
                                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return ScreenerIntroComposable6.BasicIntroScreen_RakH_j8$lambda$11$lambda$10(systemUiControllerRememberSystemUiController, j, jM21371getBg0d7_KjU, (DisposableEffectScope) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                    composerStartRestartGroup.endReplaceGroup();
                                                    EffectsKt.DisposableEffect(colorM6701boximpl2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue2, composerStartRestartGroup, (i52 >> 3) & 14);
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    j3 = j4;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            final long j5 = j3;
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda6
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ScreenerIntroComposable6.BasicIntroScreen_RakH_j8$lambda$12(painter, j, j5, str, str2, str3, function0, function02, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    if ((i2 & 64) != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    i4 = i3;
                    if ((4793491 & i4) == 4793490) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                            if ((i2 & 4) == 0) {
                                j4 = j3;
                            }
                            int i522 = i4;
                            composerStartRestartGroup.endDefaults();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            final LazyListState lazyListStateRememberLazyListState22 = LazyListStateKt.rememberLazyListState(0, 0, composerStartRestartGroup, 0, 3);
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            SnapshotState4 snapshotState422 = (SnapshotState4) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier.Companion companion222 = Modifier.INSTANCE;
                            Modifier modifierFillMaxSize$default42 = SizeKt.fillMaxSize$default(companion222, 0.0f, 1, null);
                            WindowInsets.Companion companion322 = WindowInsets.INSTANCE;
                            Modifier modifierWindowInsetsPadding32 = WindowInsetsPadding6.windowInsetsPadding(modifierFillMaxSize$default42, WindowInsets_androidKt.getNavigationBars(companion322, composerStartRestartGroup, 6));
                            Alignment.Companion companion422 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy42 = BoxKt.maybeCachedBoxMeasurePolicy(companion422.getTopStart(), false);
                            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap62 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier62 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWindowInsetsPadding32);
                            ComposeUiNode.Companion companion522 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor62 = companion522.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                            }
                            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy42, companion522.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap62, companion522.getSetResolvedCompositionLocals());
                            setCompositeKeyHash = companion522.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting()) {
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                if ((i2 & 32) != 0) {
                }
                if ((i2 & 64) != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                i4 = i3;
                if ((4793491 & i4) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            i4 = i3;
            if ((4793491 & i4) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i & 384) != 0) {
        }
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        i4 = i3;
        if ((4793491 & i4) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BasicIntroScreen_RakH_j8$lambda$2$lambda$1(LazyListState lazyListState) {
        return !TopBarScrollState3.isScrolledToTheEnd(lazyListState) && TopBarScrollState3.getCanBeScrolled(lazyListState);
    }

    private static final boolean BasicIntroScreen_RakH_j8$lambda$3(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult BasicIntroScreen_RakH_j8$lambda$11$lambda$10(final SystemUiController systemUiController, long j, final long j2, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j, false, null, 6, null);
        return new DisposableEffectResult() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$BasicIntroScreen_RakH_j8$lambda$11$lambda$10$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                SystemUiController.m9212setStatusBarColorek8zF_U$default(systemUiController, j2, false, null, 6, null);
            }
        };
    }

    private static final void ScreenerIntroPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-148581359);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-148581359, i, -1, "com.robinhood.android.equityscreener.intro.ScreenerIntroPreview (ScreenerIntroComposable.kt:194)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerIntroComposable.INSTANCE.getLambda$625505225$feature_equity_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerIntroComposable6.ScreenerIntroPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ScreenerIntroPreviewFoldable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1082490102);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1082490102, i, -1, "com.robinhood.android.equityscreener.intro.ScreenerIntroPreviewFoldable (ScreenerIntroComposable.kt:205)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerIntroComposable.INSTANCE.m13986getLambda$1379277650$feature_equity_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerIntroComposable6.ScreenerIntroPreviewFoldable$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final void ScreenerIntroPreviewTablet(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1970358155);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1970358155, i, -1, "com.robinhood.android.equityscreener.intro.ScreenerIntroPreviewTablet (ScreenerIntroComposable.kt:216)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerIntroComposable.INSTANCE.getLambda$1100758339$feature_equity_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityscreener.intro.ScreenerIntroComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerIntroComposable6.ScreenerIntroPreviewTablet$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
