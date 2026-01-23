package com.robinhood.android.equities.equityscreener.crud.create;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.ImageLoader;
import coil.compose.AsyncImagePainter4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equities.equityscreener.C14668R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.CoilUtils2;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.equityscreener.models.p294db.Screener;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PresetScreenerCard.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\u001aS\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\r\u001a\u0017\u0010\u000e\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001a\r\u0010\u0016\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015\u001a\u001d\u0010\u0017\u001a\u00020\u00012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\fH\u0001¢\u0006\u0002\u0010\u0018\"\u001a\u0010\u0010\u001a\u0004\u0018\u00010\u0005*\u00020\u00118@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0019"}, m3636d2 = {"PresetScreenerCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "displayName", "", "displayDescription", MarkdownText4.TagImageUrl, "isSelected", "", "isPlaceholder", "onClick", "Lkotlin/Function0;", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "PlaceholderPresetCard", "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "cardAssetUrl", "Lcom/robinhood/equityscreener/models/db/Screener;", "getCardAssetUrl", "(Lcom/robinhood/equityscreener/models/db/Screener;)Ljava/lang/String;", "PlaceholderPreview", "(Landroidx/compose/runtime/Composer;I)V", "SelectedPreview", "UnselectedPreview", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "lib-equity-screener_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class PresetScreenerCard4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderPresetCard$lambda$4(Modifier modifier, int i, int i2, Composer composer, int i3) {
        PlaceholderPresetCard(modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PlaceholderPreview$lambda$5(int i, Composer composer, int i2) {
        PlaceholderPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PresetScreenerCard$lambda$1(Modifier modifier, String str, String str2, String str3, boolean z, boolean z2, Function0 function0, int i, int i2, Composer composer, int i3) {
        PresetScreenerCard(modifier, str, str2, str3, z, z2, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SelectedPreview$lambda$6(int i, Composer composer, int i2) {
        SelectedPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UnselectedPreview$lambda$9(Function0 function0, int i, int i2, Composer composer, int i3) {
        UnselectedPreview(function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0193  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PresetScreenerCard(Modifier modifier, final String displayName, final String str, final String str2, final boolean z, boolean z2, final Function0<Unit> onClick, Composer composer, final int i, final int i2) {
        Modifier modifier2;
        int i3;
        String str3;
        int i4;
        boolean z3;
        boolean z4;
        Composer composer2;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(displayName, "displayName");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-826228075);
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
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(displayName) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            str3 = str;
        } else {
            str3 = str;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    z3 = z2;
                    i3 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onClick) ? 1048576 : 524288;
                }
                if ((599187 & i3) == 599186 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z3;
                    composer2 = composerStartRestartGroup;
                } else {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    z4 = i4 == 0 ? false : z3;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-826228075, i3, -1, "com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCard (PresetScreenerCard.kt:51)");
                    }
                    Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(TestTag3.testTag(modifier4, TestTags.PresetCard), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE));
                    if (z4 && !z) {
                        modifierM5174width3ABfNKs = ClickableKt.m4893clickableXHw0xAI$default(modifierM5174width3ABfNKs, false, null, null, onClick, 7, null);
                    }
                    Modifier modifier5 = modifierM5174width3ABfNKs;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i6 = BentoTheme.$stable;
                    final String str4 = str3;
                    Modifier modifier6 = modifier4;
                    final boolean z6 = z4;
                    composer2 = composerStartRestartGroup;
                    CardKt.m5548CardFjzlyU(modifier5, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme.getColors(composerStartRestartGroup, i6).m21373getBg30d7_KjU()), C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(-1569547694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt.PresetScreenerCard.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            String str5;
                            int i8;
                            Modifier.Companion companion;
                            BentoTheme bentoTheme2;
                            String str6;
                            int i9;
                            Modifier.Companion companion2;
                            boolean z7;
                            BentoTheme bentoTheme3;
                            int i10;
                            String strStringResource;
                            long jM21427getFg30d7_KjU;
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1569547694, i7, -1, "com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCard.<anonymous> (PresetScreenerCard.kt:65)");
                            }
                            boolean z8 = z6;
                            String str7 = str2;
                            String str8 = displayName;
                            String str9 = str4;
                            boolean z9 = z;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion3);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composer3, 0, 3);
                            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion3, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE), C2002Dp.m7995constructorimpl(100));
                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            Painter painterM9105rememberAsyncImagePainter0YpotYA = null;
                            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Background3.m4872backgroundbw27NRU$default(modifierM5171sizeVpY3zN4, bentoTheme4.getColors(composer3, i11).m21427getFg30d7_KjU(), null, 2, null), z8, null, 2, null);
                            composer3.startReplaceGroup(-1456293372);
                            if (str7 == null) {
                                bentoTheme2 = bentoTheme4;
                                i8 = i11;
                                str5 = str8;
                                str6 = str9;
                                companion = companion3;
                                i9 = 0;
                            } else {
                                str5 = str8;
                                i8 = i11;
                                companion = companion3;
                                bentoTheme2 = bentoTheme4;
                                str6 = str9;
                                i9 = 0;
                                painterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(str7, imageLoaderRememberImageLoader, null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1456293613);
                            if (painterM9105rememberAsyncImagePainter0YpotYA == null) {
                                painterM9105rememberAsyncImagePainter0YpotYA = PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.PLUS_24.getResourceId(), composer3, i9);
                            }
                            composer3.endReplaceGroup();
                            ImageKt.Image(painterM9105rememberAsyncImagePainter0YpotYA, (String) null, modifierBentoPlaceholder$default, (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(104)), ScrollKt.rememberScrollState(i9, composer3, i9, 1), false, null, false, 14, null), bentoTheme2.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, i9);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i9);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                            BentoTheme bentoTheme5 = bentoTheme2;
                            Modifier.Companion companion6 = companion;
                            int i12 = i8;
                            BentoText2.m20747BentoText38GnDrw(str5, ModifiersKt.bentoPlaceholder$default(companion, z8, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i8).getTextM(), composer3, 24576, 0, 8172);
                            Composer composer4 = composer3;
                            composer4.startReplaceGroup(-182055527);
                            if (str6 == null) {
                                z7 = z8;
                                i10 = i12;
                                companion2 = companion6;
                                bentoTheme3 = bentoTheme5;
                            } else {
                                String str10 = str6;
                                companion2 = companion6;
                                z7 = z8;
                                bentoTheme3 = bentoTheme5;
                                i10 = i12;
                                BentoText2.m20747BentoText38GnDrw(str10, ModifiersKt.bentoPlaceholder$default(companion6, z8, null, 2, null), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme5.getTypography(composer4, i12).getTextS(), composer3, 12582912, 0, 8060);
                                composer4 = composer3;
                                Unit unit = Unit.INSTANCE;
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            int i13 = i10;
                            Modifier.Companion companion7 = companion2;
                            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion7, bentoTheme3.getSpacing(composer4, i13).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5142padding3ABfNKs2);
                            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor3);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = z9 ? ServerToBentoAssetMapper2.BUBBLE_CHECKED_24 : ServerToBentoAssetMapper2.BUBBLE_EMPTY_24;
                            if (z9) {
                                composer4.startReplaceGroup(1691772395);
                                strStringResource = StringResources_androidKt.stringResource(C14668R.string.screener_preset_selected, composer4, 0);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(1691874509);
                                strStringResource = StringResources_androidKt.stringResource(C14668R.string.screener_preset_select, composer4, 0);
                                composer4.endReplaceGroup();
                            }
                            if (z9) {
                                composer4.startReplaceGroup(54581816);
                                jM21427getFg30d7_KjU = bentoTheme3.getColors(composer4, i13).m21425getFg0d7_KjU();
                            } else {
                                composer4.startReplaceGroup(54582649);
                                jM21427getFg30d7_KjU = bentoTheme3.getColors(composer4, i13).m21427getFg30d7_KjU();
                            }
                            composer4.endReplaceGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(serverToBentoAssetMapper2.getResourceId(), composer4, 0), strStringResource, ModifiersKt.bentoPlaceholder$default(companion7, z7, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, jM21427getFg30d7_KjU, 0, 2, null), composer4, 0, 56);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 1769472, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    z5 = z6;
                    modifier3 = modifier6;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PresetScreenerCard4.PresetScreenerCard$lambda$1(modifier3, displayName, str, str2, z, z5, onClick, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            z3 = z2;
            if ((i2 & 64) != 0) {
            }
            if ((599187 & i3) == 599186) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierM5174width3ABfNKs2 = SizeKt.m5174width3ABfNKs(TestTag3.testTag(modifier4, TestTags.PresetCard), C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE));
                if (z4) {
                    if (z4 && !z) {
                    }
                    Modifier modifier52 = modifierM5174width3ABfNKs2;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i62 = BentoTheme.$stable;
                    final String str42 = str3;
                    Modifier modifier62 = modifier4;
                    final boolean z62 = z4;
                    composer2 = composerStartRestartGroup;
                    CardKt.m5548CardFjzlyU(modifier52, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl(1), bentoTheme2.getColors(composerStartRestartGroup, i62).m21373getBg30d7_KjU()), C2002Dp.m7995constructorimpl(0), ComposableLambda3.rememberComposableLambda(-1569547694, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt.PresetScreenerCard.2
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i7) {
                            String str5;
                            int i8;
                            Modifier.Companion companion;
                            BentoTheme bentoTheme22;
                            String str6;
                            int i9;
                            Modifier.Companion companion2;
                            boolean z7;
                            BentoTheme bentoTheme3;
                            int i10;
                            String strStringResource;
                            long jM21427getFg30d7_KjU;
                            if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1569547694, i7, -1, "com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCard.<anonymous> (PresetScreenerCard.kt:65)");
                            }
                            boolean z8 = z62;
                            String str7 = str2;
                            String str8 = displayName;
                            String str9 = str42;
                            boolean z9 = z;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion4 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion4.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion3);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion5.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            ImageLoader imageLoaderRememberImageLoader = CoilUtils2.rememberImageLoader(0.0d, null, composer3, 0, 3);
                            Modifier modifierM5171sizeVpY3zN4 = SizeKt.m5171sizeVpY3zN4(companion3, C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE), C2002Dp.m7995constructorimpl(100));
                            BentoTheme bentoTheme4 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            Painter painterM9105rememberAsyncImagePainter0YpotYA = null;
                            Modifier modifierBentoPlaceholder$default = ModifiersKt.bentoPlaceholder$default(Background3.m4872backgroundbw27NRU$default(modifierM5171sizeVpY3zN4, bentoTheme4.getColors(composer3, i11).m21427getFg30d7_KjU(), null, 2, null), z8, null, 2, null);
                            composer3.startReplaceGroup(-1456293372);
                            if (str7 == null) {
                                bentoTheme22 = bentoTheme4;
                                i8 = i11;
                                str5 = str8;
                                str6 = str9;
                                companion = companion3;
                                i9 = 0;
                            } else {
                                str5 = str8;
                                i8 = i11;
                                companion = companion3;
                                bentoTheme22 = bentoTheme4;
                                str6 = str9;
                                i9 = 0;
                                painterM9105rememberAsyncImagePainter0YpotYA = AsyncImagePainter4.m9105rememberAsyncImagePainter0YpotYA(str7, imageLoaderRememberImageLoader, null, null, null, 0, null, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            }
                            composer3.endReplaceGroup();
                            composer3.startReplaceGroup(-1456293613);
                            if (painterM9105rememberAsyncImagePainter0YpotYA == null) {
                                painterM9105rememberAsyncImagePainter0YpotYA = PainterResources_androidKt.painterResource(ServerToBentoAssetMapper2.PLUS_24.getResourceId(), composer3, i9);
                            }
                            composer3.endReplaceGroup();
                            ImageKt.Image(painterM9105rememberAsyncImagePainter0YpotYA, (String) null, modifierBentoPlaceholder$default, (Alignment) null, ContentScale.INSTANCE.getInside(), 0.0f, (ColorFilter) null, composer3, 24624, 104);
                            Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(ScrollKt.verticalScroll$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(104)), ScrollKt.rememberScrollState(i9, composer3, i9, 1), false, null, false, 14, null), bentoTheme22.getSpacing(composer3, i8).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, i9);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, i9);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor2);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                            BentoTheme bentoTheme5 = bentoTheme22;
                            Modifier.Companion companion6 = companion;
                            int i12 = i8;
                            BentoText2.m20747BentoText38GnDrw(str5, ModifiersKt.bentoPlaceholder$default(companion, z8, null, 2, null), null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i8).getTextM(), composer3, 24576, 0, 8172);
                            Composer composer4 = composer3;
                            composer4.startReplaceGroup(-182055527);
                            if (str6 == null) {
                                z7 = z8;
                                i10 = i12;
                                companion2 = companion6;
                                bentoTheme3 = bentoTheme5;
                            } else {
                                String str10 = str6;
                                companion2 = companion6;
                                z7 = z8;
                                bentoTheme3 = bentoTheme5;
                                i10 = i12;
                                BentoText2.m20747BentoText38GnDrw(str10, ModifiersKt.bentoPlaceholder$default(companion6, z8, null, 2, null), null, null, null, null, null, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, 0, bentoTheme5.getTypography(composer4, i12).getTextS(), composer3, 12582912, 0, 8060);
                                composer4 = composer3;
                                Unit unit = Unit.INSTANCE;
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            int i13 = i10;
                            Modifier.Companion companion7 = companion2;
                            Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(companion7, bentoTheme3.getSpacing(composer4, i13).m21590getDefaultD9Ej5fM());
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5142padding3ABfNKs2);
                            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor3);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = z9 ? ServerToBentoAssetMapper2.BUBBLE_CHECKED_24 : ServerToBentoAssetMapper2.BUBBLE_EMPTY_24;
                            if (z9) {
                                composer4.startReplaceGroup(1691772395);
                                strStringResource = StringResources_androidKt.stringResource(C14668R.string.screener_preset_selected, composer4, 0);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(1691874509);
                                strStringResource = StringResources_androidKt.stringResource(C14668R.string.screener_preset_select, composer4, 0);
                                composer4.endReplaceGroup();
                            }
                            if (z9) {
                                composer4.startReplaceGroup(54581816);
                                jM21427getFg30d7_KjU = bentoTheme3.getColors(composer4, i13).m21425getFg0d7_KjU();
                            } else {
                                composer4.startReplaceGroup(54582649);
                                jM21427getFg30d7_KjU = bentoTheme3.getColors(composer4, i13).m21427getFg30d7_KjU();
                            }
                            composer4.endReplaceGroup();
                            ImageKt.Image(PainterResources_androidKt.painterResource(serverToBentoAssetMapper2.getResourceId(), composer4, 0), strStringResource, ModifiersKt.bentoPlaceholder$default(companion7, z7, null, 2, null), (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, jM21427getFg30d7_KjU, 0, 2, null), composer4, 0, 56);
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composer2, 1769472, 0);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    z5 = z62;
                    modifier3 = modifier62;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        z3 = z2;
        if ((i2 & 64) != 0) {
        }
        if ((599187 & i3) == 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void PlaceholderPresetCard(final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(2088637960);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i3 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            Modifier modifier2 = modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2088637960, i3, -1, "com.robinhood.android.equities.equityscreener.crud.create.PlaceholderPresetCard (PresetScreenerCard.kt:126)");
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            PresetScreenerCard(modifier2, "Placeholder card", "If you are reading this, please look away", null, false, true, (Function0) objRememberedValue, composerStartRestartGroup, (i3 & 14) | 1797552, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PresetScreenerCard4.PlaceholderPresetCard$lambda$4(modifier, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final String getCardAssetUrl(Screener screener) {
        Map<String, String> map;
        Intrinsics.checkNotNullParameter(screener, "<this>");
        Map<String, Map<String, String>> assetUrls = screener.getAssetUrls();
        if (assetUrls == null || (map = assetUrls.get("180x100")) == null) {
            return null;
        }
        return map.get("svg");
    }

    public static final void PlaceholderPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1466597346);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1466597346, i, -1, "com.robinhood.android.equities.equityscreener.crud.create.PlaceholderPreview (PresetScreenerCard.kt:144)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, PresetScreenerCard.INSTANCE.m13539getLambda$995170406$lib_equity_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PresetScreenerCard4.PlaceholderPreview$lambda$5(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void SelectedPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(671994406);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(671994406, i, -1, "com.robinhood.android.equities.equityscreener.crud.create.SelectedPreview (PresetScreenerCard.kt:152)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, PresetScreenerCard.INSTANCE.m13538getLambda$464435858$lib_equity_screener_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PresetScreenerCard4.SelectedPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void UnselectedPreview(Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Function0<Unit> function02;
        int i3;
        final Function0<Unit> function03;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1356158413);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            function02 = function0;
        } else if ((i & 6) == 0) {
            function02 = function0;
            i3 = (composerStartRestartGroup.changedInstance(function02) ? 4 : 2) | i;
        } else {
            function02 = function0;
            i3 = i;
        }
        if ((i3 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                composerStartRestartGroup.startReplaceGroup(1849434622);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                function03 = (Function0) objRememberedValue;
            } else {
                function03 = function02;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1356158413, i3, -1, "com.robinhood.android.equities.equityscreener.crud.create.UnselectedPreview (PresetScreenerCard.kt:166)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-1303914005, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt.UnselectedPreview.2
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    if ((i5 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1303914005, i5, -1, "com.robinhood.android.equities.equityscreener.crud.create.UnselectedPreview.<anonymous> (PresetScreenerCard.kt:168)");
                    }
                    PresetScreenerCard4.PresetScreenerCard(null, "New 420-week highs and highers", "Stonks that mooned", null, false, false, function03, composer2, 28080, 33);
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
            function03 = function02;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equities.equityscreener.crud.create.PresetScreenerCardKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PresetScreenerCard4.UnselectedPreview$lambda$9(function03, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
