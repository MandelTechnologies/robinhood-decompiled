package com.robinhood.android.screener.p248ui.composables;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ScreenerRowComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\u001aY\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\b\b\u0002\u0010\u000f\u001a\u00020\u000bH\u0001¢\u0006\u0002\u0010\u0010\u001a-\u0010\u0014\u001a\u00020\u00052\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\r2\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00050\rH\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0018\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u0019\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u001a\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u001b\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0017\u001a\r\u0010\u001c\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0017\"\u0010\u0010\u0000\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u0010\u0010\u0003\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0002\"\u000e\u0010\u0011\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"iconHeight", "Landroidx/compose/ui/unit/Dp;", "F", "iconWidth", "ScreenerRowComposable", "", "displayName", "", "subtitleText", "iconString", "isPreset", "", "onClick", "Lkotlin/Function0;", "onAppear", "loading", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/runtime/Composer;II)V", "DEFAULT_EMOJI", "DEFAULT_DISPLAY_NAME", "DEFAULT_SUBTITLE", "ScreenerRowStandardPreview", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "ScreenerRowLongPreview", "(Landroidx/compose/runtime/Composer;I)V", "ScreenerRowLongTitlePreview", "ScreenerRowLongTextPreview", "ScreenerRowNoEmojiPreview", "ScreenerRowNoSubtitlePreview", "ScreenerRowNoSubtitleOrEmojiPreview", "feature-lib-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class ScreenerRowComposable8 {
    private static final String DEFAULT_DISPLAY_NAME = "Top 100 best";
    private static final String DEFAULT_EMOJI = "💡";
    private static final String DEFAULT_SUBTITLE = "The best stocks that the stock market has is stock";
    private static final float iconHeight = C2002Dp.m7995constructorimpl(64);
    private static final float iconWidth = C2002Dp.m7995constructorimpl(48);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowComposable$lambda$4(String str, String str2, String str3, boolean z, Function0 function0, Function0 function02, boolean z2, int i, int i2, Composer composer, int i3) {
        ScreenerRowComposable(str, str2, str3, z, function0, function02, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowLongPreview$lambda$10(int i, Composer composer, int i2) {
        ScreenerRowLongPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowLongTextPreview$lambda$12(int i, Composer composer, int i2) {
        ScreenerRowLongTextPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowLongTitlePreview$lambda$11(int i, Composer composer, int i2) {
        ScreenerRowLongTitlePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowNoEmojiPreview$lambda$13(int i, Composer composer, int i2) {
        ScreenerRowNoEmojiPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowNoSubtitleOrEmojiPreview$lambda$15(int i, Composer composer, int i2) {
        ScreenerRowNoSubtitleOrEmojiPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowNoSubtitlePreview$lambda$14(int i, Composer composer, int i2) {
        ScreenerRowNoSubtitlePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ScreenerRowStandardPreview$lambda$9(Function0 function0, Function0 function02, int i, int i2, Composer composer, int i3) {
        ScreenerRowStandardPreview(function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e4  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0350  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037d  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x03e7  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0455  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x04b3  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04b6  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x04ca  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e4  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0163  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenerRowComposable(final String displayName, final String str, final String str2, boolean z, final Function0<Unit> onClick, Function0<Unit> onAppear, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        boolean z3;
        int i4;
        boolean z4;
        int i5;
        boolean z5;
        Modifier.Companion companion;
        boolean z6;
        BentoTheme bentoTheme;
        int i6;
        Alignment.Companion companion2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        BoxScopeInstance boxScopeInstance;
        BentoTheme bentoTheme2;
        int i7;
        int i8;
        Composer composer2;
        int i9;
        char c;
        Modifier.Companion companion3;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        boolean z7;
        boolean z8;
        Modifier.Companion companion4;
        BentoTheme bentoTheme3;
        int i10;
        Composer composer3;
        boolean z9;
        Object objRememberedValue;
        final Function0<Unit> function0;
        Composer composer4;
        final boolean z10;
        final boolean z11;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onAppear, "onAppear");
        Composer composerStartRestartGroup = composer.startRestartGroup(502960268);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(displayName) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                z3 = z;
                i3 |= composerStartRestartGroup.changed(z3) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onClick) ? 16384 : 8192;
            }
            if ((i2 & 32) == 0) {
                i3 |= 196608;
            } else if ((i & 196608) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onAppear) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    z4 = z2;
                    i3 |= composerStartRestartGroup.changed(z4) ? 1048576 : 524288;
                }
                i5 = i3;
                if ((599187 & i5) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    z11 = z3;
                    z10 = z4;
                    function0 = onAppear;
                    composer4 = composerStartRestartGroup;
                } else {
                    z5 = i11 == 0 ? false : z3;
                    if (i4 != 0) {
                        z4 = false;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(502960268, i5, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowComposable (ScreenerRowComposable.kt:44)");
                    }
                    companion = Modifier.INSTANCE;
                    z6 = z4;
                    Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, onClick, 7, null);
                    bentoTheme = BentoTheme.INSTANCE;
                    i6 = BentoTheme.$stable;
                    Modifier modifierTestTag = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0), "screener-row");
                    companion2 = Alignment.INSTANCE;
                    Alignment.Vertical centerVertically = companion2.getCenterVertically();
                    Arrangement arrangement = Arrangement.INSTANCE;
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), centerVertically, composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierM4871backgroundbw27NRU = Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion, iconWidth, iconHeight), bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU);
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
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    boxScopeInstance = BoxScopeInstance.INSTANCE;
                    if (z5 || str2 == null) {
                        bentoTheme2 = bentoTheme;
                        i7 = i6;
                        i8 = i5;
                        composer2 = composerStartRestartGroup;
                        i9 = 0;
                        c = 0;
                        composer2.startReplaceGroup(-1851401806);
                        companion3 = companion;
                        BentoText2.m20747BentoText38GnDrw(str2 != null ? "💡" : str2, ModifiersKt.bentoPillPlaceholder(boxScopeInstance.align(companion3, companion2.getCenter()), z6), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getDisplayNibSmall(), composer2, 0, 0, 8124);
                        composer2.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(-1851937455);
                        ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composerStartRestartGroup, 0, 3);
                        Modifier modifierBentoPillPlaceholder = ModifiersKt.bentoPillPlaceholder(boxScopeInstance.align(companion, companion2.getCenter()), z6);
                        i8 = i5;
                        composer2 = composerStartRestartGroup;
                        i7 = i6;
                        i9 = 0;
                        bentoTheme2 = bentoTheme;
                        c = 0;
                        ImageKt.Image(AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(str2, imageLoaderRememberImageLoader, null, null, null, 0, null, composerStartRestartGroup, (i5 >> 6) & 14, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE), (String) null, modifierBentoPillPlaceholder, (Alignment) null, ContentScale.INSTANCE.getFillHeight(), 0.0f, (ColorFilter) null, composer2, 24624, 104);
                        composer2.endReplaceGroup();
                        companion3 = companion;
                    }
                    composer2.endNode();
                    Modifier modifierWeight$default = Row5.weight$default(row6, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composer2, 48);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i9);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.useNode();
                    } else {
                        composer2.createNode(constructor3);
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierBentoPillPlaceholder2 = ModifiersKt.bentoPillPlaceholder(companion3, z6);
                    TextOverflow.Companion companion6 = TextOverflow.INSTANCE;
                    Composer composer5 = composer2;
                    BentoTheme bentoTheme4 = bentoTheme2;
                    int i12 = i7;
                    Modifier.Companion companion7 = companion3;
                    BentoText2.m20747BentoText38GnDrw(displayName, modifierBentoPillPlaceholder2, null, null, null, null, null, companion6.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextM(), composer5, (i8 & 14) | 817889280, 0, 7548);
                    Composer composer6 = composer5;
                    composer6.startReplaceGroup(137392882);
                    if (str == null) {
                        z8 = z6;
                        z7 = true;
                        bentoTheme3 = bentoTheme4;
                        i10 = i12;
                        companion4 = companion7;
                        BentoText2.m20747BentoText38GnDrw(str, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(ModifiersKt.bentoPillPlaceholder(companion7, z6), 0.0f, 1, null), 0.0f, 0.0f, bentoTheme4.getSpacing(composer6, i12).m21593getSmallD9Ej5fM(), 0.0f, 11, null), Color.m6701boximpl(bentoTheme4.getColors(composer6, i12).m21426getFg20d7_KjU()), null, null, null, null, companion6.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, bentoTheme4.getTypography(composer6, i12).getTextS(), composer6, ((i8 >> 3) & 14) | 817889280, 0, 7544);
                        composer6 = composer6;
                    } else {
                        z7 = true;
                        z8 = z6;
                        companion4 = companion7;
                        bentoTheme3 = bentoTheme4;
                        i10 = i12;
                    }
                    composer6.endReplaceGroup();
                    composer6.endNode();
                    BentoTheme bentoTheme5 = bentoTheme3;
                    int i13 = i10;
                    composer3 = composer6;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme5.getColors(composer6, i13).m21427getFg30d7_KjU(), row6.align(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme5.getSpacing(composer6, i13).m21593getSmallD9Ej5fM()), companion2.getCenterVertically()), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                    composer3.endNode();
                    Unit unit = Unit.INSTANCE;
                    composer3.startReplaceGroup(5004770);
                    z9 = (i8 & 458752) != 131072 ? z7 : false;
                    objRememberedValue = composer3.rememberedValue();
                    if (!z9 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function0 = onAppear;
                        objRememberedValue = new ScreenerRowComposable9(function0, null);
                        composer3.updateRememberedValue(objRememberedValue);
                    } else {
                        function0 = onAppear;
                    }
                    composer3.endReplaceGroup();
                    EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer4 = composer3;
                    z10 = z8;
                    z11 = z5;
                }
                scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ScreenerRowComposable8.ScreenerRowComposable$lambda$4(displayName, str, str2, z11, onClick, function0, z10, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            z4 = z2;
            i5 = i3;
            if ((599187 & i5) == 599186) {
                if (i11 == 0) {
                }
                if (i4 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                companion = Modifier.INSTANCE;
                z6 = z4;
                Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(companion, false, null, null, onClick, 7, null);
                bentoTheme = BentoTheme.INSTANCE;
                i6 = BentoTheme.$stable;
                Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(modifierM4893clickableXHw0xAI$default2, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), composerStartRestartGroup, 0, 0), "screener-row");
                companion2 = Alignment.INSTANCE;
                Alignment.Vertical centerVertically2 = companion2.getCenterVertically();
                Arrangement arrangement2 = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement2.getStart(), centerVertically2, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierTestTag2);
                ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor4 = companion52.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion52.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion52.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion52.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion52.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    Modifier modifierM4871backgroundbw27NRU2 = Background3.m4871backgroundbw27NRU(SizeKt.m5171sizeVpY3zN4(companion, iconWidth, iconHeight), bentoTheme.getColors(composerStartRestartGroup, i6).m21372getBg20d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getTopStart(), false);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4871backgroundbw27NRU2);
                    Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion52.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                        boxScopeInstance = BoxScopeInstance.INSTANCE;
                        if (z5) {
                            bentoTheme2 = bentoTheme;
                            i7 = i6;
                            i8 = i5;
                            composer2 = composerStartRestartGroup;
                            i9 = 0;
                            c = 0;
                            composer2.startReplaceGroup(-1851401806);
                            companion3 = companion;
                            if (str2 != null) {
                            }
                            BentoText2.m20747BentoText38GnDrw(str2 != null ? "💡" : str2, ModifiersKt.bentoPillPlaceholder(boxScopeInstance.align(companion3, companion2.getCenter()), z6), null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getDisplayNibSmall(), composer2, 0, 0, 8124);
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            Modifier modifierWeight$default2 = Row5.weight$default(row62, androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme2.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM()), 1.0f, false, 2, null);
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion2.getStart(), composer2, 48);
                            currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, i9);
                            CompositionLocalMap currentCompositionLocalMap32 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composer2, modifierWeight$default2);
                            Function0<ComposeUiNode> constructor32 = companion52.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion52.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion52.getSetResolvedCompositionLocals());
                            setCompositeKeyHash3 = companion52.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl3.getInserting()) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion52.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                Modifier modifierBentoPillPlaceholder22 = ModifiersKt.bentoPillPlaceholder(companion3, z6);
                                TextOverflow.Companion companion62 = TextOverflow.INSTANCE;
                                Composer composer52 = composer2;
                                BentoTheme bentoTheme42 = bentoTheme2;
                                int i122 = i7;
                                Modifier.Companion companion72 = companion3;
                                BentoText2.m20747BentoText38GnDrw(displayName, modifierBentoPillPlaceholder22, null, null, null, null, null, companion62.m7959getEllipsisgIe3tQ8(), false, 1, 0, null, 0, bentoTheme2.getTypography(composer2, i7).getTextM(), composer52, (i8 & 14) | 817889280, 0, 7548);
                                Composer composer62 = composer52;
                                composer62.startReplaceGroup(137392882);
                                if (str == null) {
                                }
                                composer62.endReplaceGroup();
                                composer62.endNode();
                                BentoTheme bentoTheme52 = bentoTheme3;
                                int i132 = i10;
                                composer3 = composer62;
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.CARET_RIGHT_16), "", bentoTheme52.getColors(composer62, i132).m21427getFg30d7_KjU(), row62.align(androidx.compose.foundation.layout.PaddingKt.m5142padding3ABfNKs(companion4, bentoTheme52.getSpacing(composer62, i132).m21593getSmallD9Ej5fM()), companion2.getCenterVertically()), null, false, composer3, BentoIcon4.Size16.$stable | 48, 48);
                                composer3.endNode();
                                Unit unit2 = Unit.INSTANCE;
                                composer3.startReplaceGroup(5004770);
                                if ((i8 & 458752) != 131072) {
                                }
                                objRememberedValue = composer3.rememberedValue();
                                if (z9) {
                                    function0 = onAppear;
                                    objRememberedValue = new ScreenerRowComposable9(function0, null);
                                    composer3.updateRememberedValue(objRememberedValue);
                                    composer3.endReplaceGroup();
                                    EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer4 = composer3;
                                    z10 = z8;
                                    z11 = z5;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z3 = z;
        if ((i2 & 16) == 0) {
        }
        if ((i2 & 32) == 0) {
        }
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        z4 = z2;
        i5 = i3;
        if ((599187 & i5) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer4.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:53:? A[RETURN, SYNTHETIC] */
    @DayNightPreview
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ScreenerRowStandardPreview(Function0<Unit> function0, Function0<Unit> function02, Composer composer, final int i, final int i2) {
        Function0<Unit> function03;
        int i3;
        Function0<Unit> function04;
        final Function0<Unit> function05;
        final Function0<Unit> function06;
        final Function0<Unit> function07;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-156907039);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function03 = function0;
        } else if ((i & 6) == 0) {
            function03 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function03) ? 4 : 2) | i;
        } else {
            function03 = function0;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                function04 = function02;
                i3 |= composerStartRestartGroup.changedInstance(function04) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                if (i4 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function05 = (Function0) objRememberedValue;
                } else {
                    function05 = function03;
                }
                if (i5 == 0) {
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.INSTANCE;
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    function06 = (Function0) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    function06 = function04;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-156907039, i3, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowStandardPreview (ScreenerRowComposable.kt:136)");
                }
                function07 = function06;
                BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2058662809, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt.ScreenerRowStandardPreview.3
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
                            ComposerKt.traceEventStart(2058662809, i6, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowStandardPreview.<anonymous> (ScreenerRowComposable.kt:138)");
                        }
                        ScreenerRowComposable8.ScreenerRowComposable(ScreenerRowComposable8.DEFAULT_DISPLAY_NAME, ScreenerRowComposable8.DEFAULT_SUBTITLE, "💡", false, function05, function06, false, composer2, 438, 72);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function05 = function03;
                function07 = function04;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ScreenerRowComposable8.ScreenerRowStandardPreview$lambda$9(function05, function07, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function04 = function02;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            function07 = function06;
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(2058662809, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt.ScreenerRowStandardPreview.3
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
                        ComposerKt.traceEventStart(2058662809, i6, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowStandardPreview.<anonymous> (ScreenerRowComposable.kt:138)");
                    }
                    ScreenerRowComposable8.ScreenerRowComposable(ScreenerRowComposable8.DEFAULT_DISPLAY_NAME, ScreenerRowComposable8.DEFAULT_SUBTITLE, "💡", false, function05, function06, false, composer2, 438, 72);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    @DayNightPreview
    public static final void ScreenerRowLongPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(602502246);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(602502246, i, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowLongPreview (ScreenerRowComposable.kt:150)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerRowComposable.INSTANCE.getLambda$1736513966$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerRowComposable8.ScreenerRowLongPreview$lambda$10(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void ScreenerRowLongTitlePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(732089452);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(732089452, i, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowLongTitlePreview (ScreenerRowComposable.kt:164)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerRowComposable.INSTANCE.m18488getLambda$1729678300$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerRowComposable8.ScreenerRowLongTitlePreview$lambda$11(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void ScreenerRowLongTextPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1205641657);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1205641657, i, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowLongTextPreview (ScreenerRowComposable.kt:178)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerRowComposable.INSTANCE.getLambda$17851137$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerRowComposable8.ScreenerRowLongTextPreview$lambda$12(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void ScreenerRowNoEmojiPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-2061739005);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2061739005, i, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowNoEmojiPreview (ScreenerRowComposable.kt:192)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerRowComposable.INSTANCE.getLambda$1363628475$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerRowComposable8.ScreenerRowNoEmojiPreview$lambda$13(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void ScreenerRowNoSubtitlePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1319030089);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1319030089, i, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowNoSubtitlePreview (ScreenerRowComposable.kt:206)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerRowComposable.INSTANCE.m18489getLambda$1981326191$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerRowComposable8.ScreenerRowNoSubtitlePreview$lambda$14(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void ScreenerRowNoSubtitleOrEmojiPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(807088254);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(807088254, i, -1, "com.robinhood.android.screener.ui.composables.ScreenerRowNoSubtitleOrEmojiPreview (ScreenerRowComposable.kt:220)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ScreenerRowComposable.INSTANCE.getLambda$859332662$feature_lib_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.screener.ui.composables.ScreenerRowComposableKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ScreenerRowComposable8.ScreenerRowNoSubtitleOrEmojiPreview$lambda$15(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
