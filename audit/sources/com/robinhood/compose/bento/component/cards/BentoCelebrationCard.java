package com.robinhood.compose.bento.component.cards;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.material3.Divider5;
import androidx.compose.material3.IconKt;
import androidx.compose.material3.SurfaceKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.PainterResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoColor;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BentoCelebrationCard.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0093\u0001\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0014\b\u0002\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u00062\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\n2\b\b\u0002\u0010\u0013\u001a\u00020\nH\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u000f\u0010\u0017\u001a\u00020\u000bH\u0001¢\u0006\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "", "eyebrow", "Landroidx/compose/ui/text/AnnotatedString;", "title", "Lkotlinx/collections/immutable/ImmutableMap;", "Landroidx/compose/foundation/text/InlineTextContent;", "inlineTitleContent", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/Color;", "", "header", "primaryText", "metadataPrimaryText", "description", "Lcom/robinhood/compose/bento/component/cards/SecondaryRow;", "secondaryRow", "backgroundColor", "colorOnPrimary", "BentoCelebrationCard-jY6E1Zs", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/ui/text/AnnotatedString;Lkotlinx/collections/immutable/ImmutableMap;Lkotlin/jvm/functions/Function3;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/cards/SecondaryRow;JJLandroidx/compose/runtime/Composer;III)V", "BentoCelebrationCard", "BentoCelebrationCardPreviews", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.cards.BentoCelebrationCardKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoCelebrationCard {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCelebrationCardPreviews$lambda$1(int i, Composer composer, int i2) {
        BentoCelebrationCardPreviews(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoCelebrationCard_jY6E1Zs$lambda$0(Modifier modifier, String str, AnnotatedString annotatedString, ImmutableMap immutableMap, Function3 function3, String str2, String str3, String str4, SecondaryRow secondaryRow, long j, long j2, int i, int i2, int i3, Composer composer, int i4) {
        m20873BentoCelebrationCardjY6E1Zs(modifier, str, annotatedString, immutableMap, function3, str2, str3, str4, secondaryRow, j, j2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0177  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x01a4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01a8  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:157:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /* renamed from: BentoCelebrationCard-jY6E1Zs, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m20873BentoCelebrationCardjY6E1Zs(Modifier modifier, final String eyebrow, final AnnotatedString title, ImmutableMap<String, InlineTextContent> immutableMap, Function3<? super Color, ? super Composer, ? super Integer, Unit> function3, final String primaryText, final String metadataPrimaryText, String str, SecondaryRow secondaryRow, long j, long j2, Composer composer, final int i, final int i2, final int i3) {
        Modifier modifier2;
        int i4;
        ImmutableMap<String, InlineTextContent> immutableMap2;
        int i5;
        Function3<? super Color, ? super Composer, ? super Integer, Unit> function32;
        int i6;
        String str2;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        Composer composer2;
        final Function3<? super Color, ? super Composer, ? super Integer, Unit> function33;
        final long j3;
        final ImmutableMap<String, InlineTextContent> immutableMap3;
        final SecondaryRow secondaryRow2;
        final Modifier modifier3;
        final long j4;
        final String str3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(eyebrow, "eyebrow");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(primaryText, "primaryText");
        Intrinsics.checkNotNullParameter(metadataPrimaryText, "metadataPrimaryText");
        Composer composerStartRestartGroup = composer.startRestartGroup(2075783063);
        int i15 = i3 & 1;
        if (i15 != 0) {
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
            i4 |= composerStartRestartGroup.changed(eyebrow) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(title) ? 256 : 128;
        }
        int i16 = i3 & 8;
        if (i16 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                immutableMap2 = immutableMap;
                i4 |= composerStartRestartGroup.changed(immutableMap2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    function32 = function3;
                    i4 |= composerStartRestartGroup.changedInstance(function32) ? 16384 : 8192;
                }
                if ((i3 & 32) != 0) {
                    i4 |= 196608;
                } else if ((i & 196608) == 0) {
                    i4 |= composerStartRestartGroup.changed(primaryText) ? 131072 : 65536;
                }
                if ((i3 & 64) != 0) {
                    i4 |= 1572864;
                } else if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(metadataPrimaryText) ? 1048576 : 524288;
                }
                i6 = i3 & 128;
                if (i6 != 0) {
                    i4 |= 12582912;
                    str2 = str;
                } else {
                    str2 = str;
                    if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(str2) ? 8388608 : 4194304;
                    }
                }
                i7 = i3 & 256;
                if (i7 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i8 = i7;
                        i4 |= composerStartRestartGroup.changed(secondaryRow) ? 67108864 : 33554432;
                    }
                    i9 = i3 & 512;
                    if (i9 != 0) {
                        i10 = i9;
                        if ((i & 805306368) == 0) {
                            i11 = i15;
                            i4 |= composerStartRestartGroup.changed(j) ? 536870912 : 268435456;
                        }
                        i12 = i3 & 1024;
                        if (i12 != 0) {
                            i13 = i12;
                            i14 = i2 | 6;
                        } else {
                            i13 = i12;
                            if ((i2 & 6) == 0) {
                                i14 = i2 | (composerStartRestartGroup.changed(j2) ? 4 : 2);
                            } else {
                                i14 = i2;
                            }
                        }
                        if ((306783379 & i4) != 306783378 || (i14 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                            ImmutableMap<String, InlineTextContent> immutableMapPersistentMapOf = i16 == 0 ? extensions2.persistentMapOf() : immutableMap2;
                            if (i5 != 0) {
                                function32 = null;
                            }
                            if (i6 != 0) {
                                str2 = null;
                            }
                            final SecondaryRow secondaryRow3 = i8 == 0 ? null : secondaryRow;
                            long jM21354getNightXrayLight0d7_KjU = i10 == 0 ? BentoColor.INSTANCE.m21354getNightXrayLight0d7_KjU() : j;
                            long jM21319getNightJet0d7_KjU = i13 == 0 ? BentoColor.INSTANCE.m21319getNightJet0d7_KjU() : j2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(2075783063, i4, i14, "com.robinhood.compose.bento.component.cards.BentoCelebrationCard (BentoCelebrationCard.kt:51)");
                            }
                            int i17 = i4;
                            final String str4 = str2;
                            final ImmutableMap<String, InlineTextContent> immutableMap4 = immutableMapPersistentMapOf;
                            final Function3<? super Color, ? super Composer, ? super Integer, Unit> function34 = function32;
                            final long j5 = jM21319getNightJet0d7_KjU;
                            Modifier modifier5 = modifier4;
                            long j6 = jM21354getNightXrayLight0d7_KjU;
                            composer2 = composerStartRestartGroup;
                            SurfaceKt.m5967SurfaceT9BRK9s(modifier5, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), j6, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1234892622, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCelebrationCardKt$BentoCelebrationCard$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i18) {
                                    long j7;
                                    AnnotatedString annotatedString;
                                    ImmutableMap<String, InlineTextContent> immutableMap5;
                                    String str5;
                                    String str6;
                                    Modifier.Companion companion;
                                    Object obj;
                                    if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1234892622, i18, -1, "com.robinhood.compose.bento.component.cards.BentoCelebrationCard.<anonymous> (BentoCelebrationCard.kt:57)");
                                    }
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.Vertical top = arrangement.getTop();
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 5, null);
                                    Function3<Color, Composer, Integer, Unit> function35 = function34;
                                    long j8 = j5;
                                    String str7 = eyebrow;
                                    AnnotatedString annotatedString2 = title;
                                    ImmutableMap<String, InlineTextContent> immutableMap6 = immutableMap4;
                                    String str8 = str4;
                                    SecondaryRow secondaryRow4 = secondaryRow3;
                                    String str9 = primaryText;
                                    String str10 = metadataPrimaryText;
                                    Alignment.Companion companion3 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 6);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    if (function35 != null) {
                                        composer3.startReplaceGroup(-1945125680);
                                        function35.invoke(Color.m6701boximpl(j8), composer3, 0);
                                        composer3.endReplaceGroup();
                                        j7 = j8;
                                        str6 = str7;
                                        annotatedString = annotatedString2;
                                        immutableMap5 = immutableMap6;
                                        str5 = str8;
                                        obj = null;
                                        companion = companion2;
                                    } else {
                                        composer3.startReplaceGroup(-1945052830);
                                        j7 = j8;
                                        annotatedString = annotatedString2;
                                        immutableMap5 = immutableMap6;
                                        str5 = str8;
                                        str6 = str7;
                                        companion = companion2;
                                        obj = null;
                                        IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_robinhood_24dp, composer3, 0), (String) null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion3.getEnd()), C2002Dp.m7995constructorimpl(24)), false, 1, null), j7, composer3, 48, 0);
                                        composer3.endReplaceGroup();
                                    }
                                    TextStyle textS = bentoTheme.getTypography(composer3, 6).getTextS();
                                    FontWeight.Companion companion5 = FontWeight.INSTANCE;
                                    Modifier.Companion companion6 = companion;
                                    BentoText2.m20747BentoText38GnDrw(str6, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(j7), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8168);
                                    BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, immutableMap5, null, bentoTheme.getTypography(composer3, 6).getDisplayCapsuleSmall(), composer3, 0, 0, 6136);
                                    composer3.startReplaceGroup(-339801950);
                                    if (str5 != null) {
                                        BentoText2.m20747BentoText38GnDrw(str5, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextM(), composer3, 0, 0, 8184);
                                        Unit unit = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceGroup();
                                    Divider5.m5851HorizontalDivider9IZ8Weo(PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(1), j7, composer3, 48, 0);
                                    Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                    Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                    Row6 row6 = Row6.INSTANCE;
                                    BentoText2.m20747BentoText38GnDrw(str9, null, Color.m6701boximpl(j7), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextL(), composer3, 24576, 0, 8170);
                                    BentoText2.m20747BentoText38GnDrw(str10, null, Color.m6701boximpl(j7), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextL(), composer3, 24576, 0, 8170);
                                    composer3.endNode();
                                    composer3.startReplaceGroup(-339757887);
                                    if (secondaryRow4 != null) {
                                        Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                                        Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                        MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(spaceBetween2, centerVertically2, composer3, 54);
                                        int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                        CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default2);
                                        Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                        if (composer3.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer3.startReusableNode();
                                        if (composer3.getInserting()) {
                                            composer3.createNode(constructor3);
                                        } else {
                                            composer3.useNode();
                                        }
                                        Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                        Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                            composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                            composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                        BentoText2.m20747BentoText38GnDrw(secondaryRow4.getInfo(), null, Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextS(), composer3, 0, 0, 8186);
                                        BentoText2.m20747BentoText38GnDrw(secondaryRow4.getMetadata(), null, Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextS(), composer3, 0, 0, 8186);
                                        composer3.endNode();
                                        Unit unit2 = Unit.INSTANCE;
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composer2, (i17 & 14) | 12582912 | ((i17 >> 21) & 896), 120);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            function33 = function34;
                            j3 = j5;
                            immutableMap3 = immutableMap4;
                            secondaryRow2 = secondaryRow3;
                            modifier3 = modifier5;
                            j4 = j6;
                            str3 = str4;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            secondaryRow2 = secondaryRow;
                            j4 = j;
                            modifier3 = modifier2;
                            composer2 = composerStartRestartGroup;
                            str3 = str2;
                            function33 = function32;
                            immutableMap3 = immutableMap2;
                            j3 = j2;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.cards.BentoCelebrationCardKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoCelebrationCard.BentoCelebrationCard_jY6E1Zs$lambda$0(modifier3, eyebrow, title, immutableMap3, function33, primaryText, metadataPrimaryText, str3, secondaryRow2, j4, j3, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 805306368;
                    i10 = i9;
                    i11 = i15;
                    i12 = i3 & 1024;
                    if (i12 != 0) {
                    }
                    if ((306783379 & i4) != 306783378) {
                        if (i11 == 0) {
                        }
                        if (i16 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i8 == 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i13 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        int i172 = i4;
                        final String str42 = str2;
                        final ImmutableMap<String, InlineTextContent> immutableMap42 = immutableMapPersistentMapOf;
                        final Function3<? super Color, ? super Composer, ? super Integer, Unit> function342 = function32;
                        final long j52 = jM21319getNightJet0d7_KjU;
                        Modifier modifier52 = modifier4;
                        long j62 = jM21354getNightXrayLight0d7_KjU;
                        composer2 = composerStartRestartGroup;
                        SurfaceKt.m5967SurfaceT9BRK9s(modifier52, RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8)), j62, 0L, 0.0f, 0.0f, null, ComposableLambda3.rememberComposableLambda(-1234892622, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.cards.BentoCelebrationCardKt$BentoCelebrationCard$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i18) {
                                long j7;
                                AnnotatedString annotatedString;
                                ImmutableMap<String, InlineTextContent> immutableMap5;
                                String str5;
                                String str6;
                                Modifier.Companion companion;
                                Object obj;
                                if ((i18 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1234892622, i18, -1, "com.robinhood.compose.bento.component.cards.BentoCelebrationCard.<anonymous> (BentoCelebrationCard.kt:57)");
                                }
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.Vertical top = arrangement.getTop();
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 5, null);
                                Function3<Color, Composer, Integer, Unit> function35 = function342;
                                long j8 = j52;
                                String str7 = eyebrow;
                                AnnotatedString annotatedString2 = title;
                                ImmutableMap<String, InlineTextContent> immutableMap6 = immutableMap42;
                                String str8 = str42;
                                SecondaryRow secondaryRow4 = secondaryRow3;
                                String str9 = primaryText;
                                String str10 = metadataPrimaryText;
                                Alignment.Companion companion3 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composer3, 6);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5146paddingqDBjuR0$default);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                if (function35 != null) {
                                    composer3.startReplaceGroup(-1945125680);
                                    function35.invoke(Color.m6701boximpl(j8), composer3, 0);
                                    composer3.endReplaceGroup();
                                    j7 = j8;
                                    str6 = str7;
                                    annotatedString = annotatedString2;
                                    immutableMap5 = immutableMap6;
                                    str5 = str8;
                                    obj = null;
                                    companion = companion2;
                                } else {
                                    composer3.startReplaceGroup(-1945052830);
                                    j7 = j8;
                                    annotatedString = annotatedString2;
                                    immutableMap5 = immutableMap6;
                                    str5 = str8;
                                    str6 = str7;
                                    companion = companion2;
                                    obj = null;
                                    IconKt.m5871Iconww6aTOc(PainterResources_androidKt.painterResource(C20690R.drawable.ic_rds_robinhood_24dp, composer3, 0), (String) null, LocalShowPlaceholder.withBentoCirclePlaceholder$default(SizeKt.m5169size3ABfNKs(column6.align(PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), companion3.getEnd()), C2002Dp.m7995constructorimpl(24)), false, 1, null), j7, composer3, 48, 0);
                                    composer3.endReplaceGroup();
                                }
                                TextStyle textS = bentoTheme.getTypography(composer3, 6).getTextS();
                                FontWeight.Companion companion5 = FontWeight.INSTANCE;
                                Modifier.Companion companion6 = companion;
                                BentoText2.m20747BentoText38GnDrw(str6, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(j7), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, textS, composer3, 24576, 0, 8168);
                                BentoText2.m20748BentoTextQnj7Zds(annotatedString, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, immutableMap5, null, bentoTheme.getTypography(composer3, 6).getDisplayCapsuleSmall(), composer3, 0, 0, 6136);
                                composer3.startReplaceGroup(-339801950);
                                if (str5 != null) {
                                    BentoText2.m20747BentoText38GnDrw(str5, PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21593getSmallD9Ej5fM(), 0.0f, 0.0f, 13, null), Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextM(), composer3, 0, 0, 8184);
                                    Unit unit = Unit.INSTANCE;
                                }
                                composer3.endReplaceGroup();
                                Divider5.m5851HorizontalDivider9IZ8Weo(PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), C2002Dp.m7995constructorimpl(1), j7, composer3, 48, 0);
                                Arrangement.HorizontalOrVertical spaceBetween = arrangement.getSpaceBetween();
                                Alignment.Vertical centerVertically = companion3.getCenterVertically();
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(PaddingKt.m5146paddingqDBjuR0$default(companion6, 0.0f, bentoTheme.getSpacing(composer3, 6).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null), 0.0f, 1, null);
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(spaceBetween, centerVertically, composer3, 54);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default);
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                BentoText2.m20747BentoText38GnDrw(str9, null, Color.m6701boximpl(j7), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextL(), composer3, 24576, 0, 8170);
                                BentoText2.m20747BentoText38GnDrw(str10, null, Color.m6701boximpl(j7), null, companion5.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextL(), composer3, 24576, 0, 8170);
                                composer3.endNode();
                                composer3.startReplaceGroup(-339757887);
                                if (secondaryRow4 != null) {
                                    Arrangement.HorizontalOrVertical spaceBetween2 = arrangement.getSpaceBetween();
                                    Alignment.Vertical centerVertically2 = companion3.getCenterVertically();
                                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion6, 0.0f, 1, null);
                                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(spaceBetween2, centerVertically2, composer3, 54);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierFillMaxWidth$default2);
                                    Function0<ComposeUiNode> constructor3 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor3);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion4.getSetModifier());
                                    BentoText2.m20747BentoText38GnDrw(secondaryRow4.getInfo(), null, Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextS(), composer3, 0, 0, 8186);
                                    BentoText2.m20747BentoText38GnDrw(secondaryRow4.getMetadata(), null, Color.m6701boximpl(j7), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, 6).getTextS(), composer3, 0, 0, 8186);
                                    composer3.endNode();
                                    Unit unit2 = Unit.INSTANCE;
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composer2, (i172 & 14) | 12582912 | ((i172 >> 21) & 896), 120);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function33 = function342;
                        j3 = j52;
                        immutableMap3 = immutableMap42;
                        secondaryRow2 = secondaryRow3;
                        modifier3 = modifier52;
                        j4 = j62;
                        str3 = str42;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i8 = i7;
                i9 = i3 & 512;
                if (i9 != 0) {
                }
                i11 = i15;
                i12 = i3 & 1024;
                if (i12 != 0) {
                }
                if ((306783379 & i4) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            function32 = function3;
            if ((i3 & 32) != 0) {
            }
            if ((i3 & 64) != 0) {
            }
            i6 = i3 & 128;
            if (i6 != 0) {
            }
            i7 = i3 & 256;
            if (i7 != 0) {
            }
            i8 = i7;
            i9 = i3 & 512;
            if (i9 != 0) {
            }
            i11 = i15;
            i12 = i3 & 1024;
            if (i12 != 0) {
            }
            if ((306783379 & i4) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        immutableMap2 = immutableMap;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        function32 = function3;
        if ((i3 & 32) != 0) {
        }
        if ((i3 & 64) != 0) {
        }
        i6 = i3 & 128;
        if (i6 != 0) {
        }
        i7 = i3 & 256;
        if (i7 != 0) {
        }
        i8 = i7;
        i9 = i3 & 512;
        if (i9 != 0) {
        }
        i11 = i15;
        i12 = i3 & 1024;
        if (i12 != 0) {
        }
        if ((306783379 & i4) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    public static final void BentoCelebrationCardPreviews(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1778781158);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1778781158, i, -1, "com.robinhood.compose.bento.component.cards.BentoCelebrationCardPreviews (BentoCelebrationCard.kt:154)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, BentoCelebrationCard3.INSTANCE.getLambda$909181342$lib_compose_bento_externalRelease(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.cards.BentoCelebrationCardKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoCelebrationCard.BentoCelebrationCardPreviews$lambda$1(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
