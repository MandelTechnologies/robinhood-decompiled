package com.robinhood.compose.bento.component.cards;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.CardDefaults;
import androidx.compose.material3.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.painter.Painter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoCard.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001ao\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0015\"\u000e\u0010\u0016\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"BentoCard", "", "modifier", "Landroidx/compose/ui/Modifier;", "onClick", "Lkotlin/Function0;", "title", "", "subtitle", PlaceTypes.PAINTER, "Landroidx/compose/ui/graphics/painter/Painter;", "imageModifier", "badge", "Lcom/robinhood/compose/bento/component/cards/CardBadge;", "backgroundColor", "Landroidx/compose/ui/graphics/Color;", "enabled", "", "BentoCard-lmFMXvc", "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/graphics/painter/Painter;Landroidx/compose/ui/Modifier;Lcom/robinhood/compose/bento/component/cards/CardBadge;JZLandroidx/compose/runtime/Composer;II)V", "BentoCardPreviews", "(Landroidx/compose/runtime/Composer;I)V", "loremIpsum", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCardKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCard {
    private static final String loremIpsum = "Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCardPreviews$lambda$3(int i, Composer composer, int i2) {
        BentoCardPreviews(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCard_lmFMXvc$lambda$2(Modifier modifier, Function0 function0, String str, String str2, Painter painter, Modifier modifier2, CardBadge cardBadge, long j, boolean z, int i, int i2, Composer composer, int i3) {
        m20870BentoCardlmFMXvc(modifier, function0, str, str2, painter, modifier2, cardBadge, j, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016d  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0171  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0179  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fe  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0102  */
    /* renamed from: BentoCard-lmFMXvc, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20870BentoCardlmFMXvc(Modifier modifier, Function0<Unit> function0, final String title, String str, final Painter painter, Modifier modifier2, CardBadge cardBadge, final long j, boolean z, Composer composer, final int i, final int i2) {
        Modifier modifier3;
        int i3;
        Function0<Unit> function02;
        int i4;
        String str2;
        int i5;
        Modifier modifier4;
        int i6;
        int i7;
        int i8;
        Function0<Unit> function03;
        Composer composer2;
        final Modifier modifier5;
        final String str3;
        final CardBadge cardBadge2;
        final Modifier modifier6;
        final Function0<Unit> function04;
        final boolean z2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(painter, "painter");
        Composer composerStartRestartGroup = composer.startRestartGroup(-479464098);
        int i9 = i2 & 1;
        if (i9 != 0) {
            i3 = i | 6;
            modifier3 = modifier;
        } else if ((i & 6) == 0) {
            modifier3 = modifier;
            i3 = (composerStartRestartGroup.changed(modifier3) ? 4 : 2) | i;
        } else {
            modifier3 = modifier;
            i3 = i;
        }
        int i10 = i2 & 2;
        if (i10 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(title) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(painter) ? 16384 : 8192;
                }
                i5 = i2 & 32;
                if (i5 != 0) {
                    i3 |= 196608;
                } else {
                    if ((196608 & i) == 0) {
                        modifier4 = modifier2;
                        i3 |= composerStartRestartGroup.changed(modifier4) ? 131072 : 65536;
                    }
                    i6 = i2 & 64;
                    if (i6 == 0) {
                        i3 |= 1572864;
                    } else if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(cardBadge) ? 1048576 : 524288;
                    }
                    if ((i2 & 128) == 0) {
                        i3 |= 12582912;
                        i7 = i9;
                    } else {
                        i7 = i9;
                        if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changed(j) ? 8388608 : 4194304;
                        }
                        i8 = i2 & 256;
                        if (i8 == 0) {
                            if ((100663296 & i) == 0) {
                                i3 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                            }
                            if ((i3 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier7 = i7 == 0 ? Modifier.INSTANCE : modifier3;
                                if (i10 == 0) {
                                    composerStartRestartGroup.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.compose.bento.component.cards.BentoCardKt$$ExternalSyntheticLambda0
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
                                if (i4 != 0) {
                                    str2 = null;
                                }
                                final Modifier modifier8 = i5 == 0 ? null : modifier4;
                                CardBadge cardBadge3 = i6 == 0 ? cardBadge : null;
                                boolean z3 = i8 == 0 ? true : z;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-479464098, i3, -1, "com.robinhood.compose.bento.component.cards.BentoCard (BentoCard.kt:42)");
                                }
                                Modifier modifierM4893clickableXHw0xAI$default = ClickableKt.m4893clickableXHw0xAI$default(modifier7, z3, null, null, function03, 6, null);
                                Modifier modifier9 = modifier7;
                                boolean z4 = z3;
                                Function0<Unit> function05 = function03;
                                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM());
                                CardDefaults cardDefaults = CardDefaults.INSTANCE;
                                int i11 = (i3 >> 21) & 14;
                                int i12 = CardDefaults.$stable;
                                final CardBadge cardBadge4 = cardBadge3;
                                final String str4 = str2;
                                Modifier modifier10 = modifier8;
                                CardKt.Card(modifierM4893clickableXHw0xAI$default, roundedCornerShapeM5327RoundedCornerShape0680j_4, cardDefaults.m5729cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i11 | (i12 << 12), 14), cardDefaults.m5730cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i12 << 18, 63), null, ComposableLambda3.rememberComposableLambda(573999404, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCardKt$BentoCard$2
                                    @Override // kotlin.jvm.functions.Function3
                                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                        invoke(column5, composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Column5 Card, Composer composer3, int i13) {
                                        Column6 column6;
                                        String str5;
                                        int i14;
                                        String str6;
                                        Modifier.Companion companion;
                                        boolean z5;
                                        Modifier.Companion companion2;
                                        Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                        if ((i13 & 17) == 16 && composer3.getSkipping()) {
                                            composer3.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(573999404, i13, -1, "com.robinhood.compose.bento.component.cards.BentoCard.<anonymous> (BentoCard.kt:52)");
                                        }
                                        Modifier.Companion companion3 = Modifier.INSTANCE;
                                        Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Intrinsic4.Min);
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierHeight, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                        Modifier modifier11 = modifier8;
                                        Painter painter2 = painter;
                                        CardBadge cardBadge5 = cardBadge4;
                                        String str7 = title;
                                        String str8 = str4;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        Arrangement.Horizontal start = arrangement.getStart();
                                        Alignment.Companion companion4 = Alignment.INSTANCE;
                                        MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion4.getTop(), composer3, 0);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                        Row6 row6 = Row6.INSTANCE;
                                        Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 1, null), 1.0f, false, 2, null);
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, 0);
                                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
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
                                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                        Column6 column62 = Column6.INSTANCE;
                                        if (cardBadge5 == null) {
                                            composer3.startReplaceGroup(234049282);
                                            str5 = str8;
                                            column6 = column62;
                                            Spacer2.Spacer(Column5.weight$default(column62, companion3, 1.0f, false, 2, null), composer3, 0);
                                            composer3.endReplaceGroup();
                                            companion = companion3;
                                            str6 = str7;
                                            i14 = 6;
                                            z5 = false;
                                        } else {
                                            column6 = column62;
                                            str5 = str8;
                                            composer3.startReplaceGroup(234136578);
                                            i14 = 6;
                                            str6 = str7;
                                            companion = companion3;
                                            z5 = false;
                                            BentoCardBadge.BentoCardBadge(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 7, null), cardBadge5, composer3, 0, 0);
                                            composer3.endReplaceGroup();
                                        }
                                        long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i14).m21425getFg0d7_KjU();
                                        TextStyle textL = bentoTheme.getTypography(composer3, i14).getTextL();
                                        String str9 = str6;
                                        Modifier.Companion companion6 = companion;
                                        BentoText2.m20747BentoText38GnDrw(str9, companion6, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textL, composer3, 48, 0, 8184);
                                        composer3.startReplaceGroup(-823716374);
                                        if (str5 == null) {
                                            companion2 = companion6;
                                        } else {
                                            companion2 = companion6;
                                            BentoText2.m20747BentoText38GnDrw(str5, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composer3, 6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextS(), composer3, 0, 0, 8184);
                                        }
                                        composer3.endReplaceGroup();
                                        Modifier.Companion companion7 = companion2;
                                        Spacer2.Spacer(Column5.weight$default(column6, companion7, 1.0f, false, 2, null), composer3, 0);
                                        composer3.endNode();
                                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion7, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM()), composer3, 0);
                                        ImageKt.Image(painter2, (String) null, row6.align(companion7.then(modifier11 == null ? SizeKt.m5175widthInVpY3zN4(companion7, C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(64)) : modifier11), companion4.getCenterVertically()), companion4.getCenterEnd(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 27696, 96);
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
                                composer2 = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier5 = modifier10;
                                str3 = str4;
                                cardBadge2 = cardBadge4;
                                modifier6 = modifier9;
                                function04 = function05;
                                z2 = z4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier6 = modifier3;
                                composer2 = composerStartRestartGroup;
                                function04 = function02;
                                str3 = str2;
                                modifier5 = modifier4;
                                cardBadge2 = cardBadge;
                                z2 = z;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.cards.BentoCardKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return BentoCard.BentoCard_lmFMXvc$lambda$2(modifier6, function04, title, str3, painter, modifier5, cardBadge2, j, z2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i3 |= 100663296;
                        if ((i3 & 38347923) == 38347922) {
                            if (i7 == 0) {
                            }
                            if (i10 == 0) {
                            }
                            if (i4 != 0) {
                            }
                            if (i5 == 0) {
                            }
                            if (i6 == 0) {
                            }
                            if (i8 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            Modifier modifierM4893clickableXHw0xAI$default2 = ClickableKt.m4893clickableXHw0xAI$default(modifier7, z3, null, null, function03, 6, null);
                            Modifier modifier92 = modifier7;
                            boolean z42 = z3;
                            Function0<Unit> function052 = function03;
                            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, 6).m21593getSmallD9Ej5fM());
                            CardDefaults cardDefaults2 = CardDefaults.INSTANCE;
                            int i112 = (i3 >> 21) & 14;
                            int i122 = CardDefaults.$stable;
                            final CardBadge cardBadge42 = cardBadge3;
                            final String str42 = str2;
                            Modifier modifier102 = modifier8;
                            CardKt.Card(modifierM4893clickableXHw0xAI$default2, roundedCornerShapeM5327RoundedCornerShape0680j_42, cardDefaults2.m5729cardColorsro_MJ88(j, 0L, 0L, 0L, composerStartRestartGroup, i112 | (i122 << 12), 14), cardDefaults2.m5730cardElevationaqJV_2Y(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, composerStartRestartGroup, i122 << 18, 63), null, ComposableLambda3.rememberComposableLambda(573999404, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCardKt$BentoCard$2
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                                    invoke(column5, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Column5 Card, Composer composer3, int i13) {
                                    Column6 column6;
                                    String str5;
                                    int i14;
                                    String str6;
                                    Modifier.Companion companion;
                                    boolean z5;
                                    Modifier.Companion companion2;
                                    Intrinsics.checkNotNullParameter(Card, "$this$Card");
                                    if ((i13 & 17) == 16 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(573999404, i13, -1, "com.robinhood.compose.bento.component.cards.BentoCard.<anonymous> (BentoCard.kt:52)");
                                    }
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    Modifier modifierHeight = Intrinsic3.height(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), Intrinsic4.Min);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierHeight, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                                    Modifier modifier11 = modifier8;
                                    Painter painter2 = painter;
                                    CardBadge cardBadge5 = cardBadge42;
                                    String str7 = title;
                                    String str8 = str42;
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Horizontal start = arrangement.getStart();
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion4.getTop(), composer3, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    Modifier modifierWeight$default = Row5.weight$default(row6, PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxHeight$default(companion3, 0.0f, 1, null), 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 1, null), 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composer3, 0);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierWeight$default);
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
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                                    Column6 column62 = Column6.INSTANCE;
                                    if (cardBadge5 == null) {
                                        composer3.startReplaceGroup(234049282);
                                        str5 = str8;
                                        column6 = column62;
                                        Spacer2.Spacer(Column5.weight$default(column62, companion3, 1.0f, false, 2, null), composer3, 0);
                                        composer3.endReplaceGroup();
                                        companion = companion3;
                                        str6 = str7;
                                        i14 = 6;
                                        z5 = false;
                                    } else {
                                        column6 = column62;
                                        str5 = str8;
                                        composer3.startReplaceGroup(234136578);
                                        i14 = 6;
                                        str6 = str7;
                                        companion = companion3;
                                        z5 = false;
                                        BentoCardBadge.BentoCardBadge(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 7, null), cardBadge5, composer3, 0, 0);
                                        composer3.endReplaceGroup();
                                    }
                                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composer3, i14).m21425getFg0d7_KjU();
                                    TextStyle textL = bentoTheme.getTypography(composer3, i14).getTextL();
                                    String str9 = str6;
                                    Modifier.Companion companion6 = companion;
                                    BentoText2.m20747BentoText38GnDrw(str9, companion6, Color.m6701boximpl(jM21425getFg0d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textL, composer3, 48, 0, 8184);
                                    composer3.startReplaceGroup(-823716374);
                                    if (str5 == null) {
                                        companion2 = companion6;
                                    } else {
                                        companion2 = companion6;
                                        BentoText2.m20747BentoText38GnDrw(str5, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(bentoTheme.getColors(composer3, 6).m21425getFg0d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextS(), composer3, 0, 0, 8184);
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier.Companion companion7 = companion2;
                                    Spacer2.Spacer(Column5.weight$default(column6, companion7, 1.0f, false, 2, null), composer3, 0);
                                    composer3.endNode();
                                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion7, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM()), composer3, 0);
                                    ImageKt.Image(painter2, (String) null, row6.align(companion7.then(modifier11 == null ? SizeKt.m5175widthInVpY3zN4(companion7, C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(64)) : modifier11), companion4.getCenterVertically()), companion4.getCenterEnd(), ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 27696, 96);
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 196608, 16);
                            composer2 = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier5 = modifier102;
                            str3 = str42;
                            cardBadge2 = cardBadge42;
                            modifier6 = modifier92;
                            function04 = function052;
                            z2 = z42;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i8 = i2 & 256;
                    if (i8 == 0) {
                    }
                    if ((i3 & 38347923) == 38347922) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                modifier4 = modifier2;
                i6 = i2 & 64;
                if (i6 == 0) {
                }
                if ((i2 & 128) == 0) {
                }
                i8 = i2 & 256;
                if (i8 == 0) {
                }
                if ((i3 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            if ((i2 & 16) != 0) {
            }
            i5 = i2 & 32;
            if (i5 != 0) {
            }
            modifier4 = modifier2;
            i6 = i2 & 64;
            if (i6 == 0) {
            }
            if ((i2 & 128) == 0) {
            }
            i8 = i2 & 256;
            if (i8 == 0) {
            }
            if ((i3 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function02 = function0;
        if ((i2 & 4) == 0) {
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        if ((i2 & 16) != 0) {
        }
        i5 = i2 & 32;
        if (i5 != 0) {
        }
        modifier4 = modifier2;
        i6 = i2 & 64;
        if (i6 == 0) {
        }
        if ((i2 & 128) == 0) {
        }
        i8 = i2 & 256;
        if (i8 == 0) {
        }
        if ((i3 & 38347923) == 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final void BentoCardPreviews(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1965696668);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1965696668, i, -1, "com.robinhood.compose.bento.component.cards.BentoCardPreviews (BentoCard.kt:104)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoCard3.INSTANCE.getLambda$517990684$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.cards.BentoCardKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoCard.BentoCardPreviews$lambda$3(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
