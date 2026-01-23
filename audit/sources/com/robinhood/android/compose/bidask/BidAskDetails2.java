package com.robinhood.android.compose.bidask;

import android.content.res.Resources;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.AlignmentLineKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.Measured;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import com.robinhood.android.lib.formats.Formats;
import com.robinhood.android.lib.formats.NumberFormatter;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.compose.extensions.ModifiersKt;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;

/* compiled from: BidAskDetails.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a9\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tH\u0007¢\u0006\u0004\b\n\u0010\u000b\"\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0010X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015²\u0006\n\u0010\u0016\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010\u0017\u001a\u00020\rX\u008a\u0084\u0002"}, m3636d2 = {"BidAskDetails", "", "bidAsk", "Lcom/robinhood/android/compose/bidask/BidAsk;", "modifier", "Landroidx/compose/ui/Modifier;", "inBidAskSdpStatsExperiment", "", "spacing", "Landroidx/compose/ui/unit/Dp;", "BidAskDetails-IColEu4", "(Lcom/robinhood/android/compose/bidask/BidAsk;Landroidx/compose/ui/Modifier;ZLandroidx/compose/ui/unit/Dp;Landroidx/compose/runtime/Composer;II)V", "BID_ASK_BAR_MAX_HEIGHT", "", "BID_ASK_BAR_MIN_HEIGHT", "PLACEHOLDER_BID_PRICE", "", "PLACEHOLDER_ASK_PRICE", "PLACEHOLDER_BID_SIZE", "Ljava/math/BigDecimal;", "PLACEHOLDER_ASK_SIZE", "lib-compose-bid-ask_externalDebug", "bidRectPercent", "askRectPercent"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.compose.bidask.BidAskDetailsKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class BidAskDetails2 {
    private static final float BID_ASK_BAR_MAX_HEIGHT = 48.0f;
    private static final float BID_ASK_BAR_MIN_HEIGHT = 2.0f;
    private static final String PLACEHOLDER_ASK_PRICE = "$00.00";
    private static final String PLACEHOLDER_BID_PRICE = "$00.00";
    private static final BigDecimal PLACEHOLDER_BID_SIZE = new BigDecimal("100");
    private static final BigDecimal PLACEHOLDER_ASK_SIZE = new BigDecimal("100");

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BidAskDetails_IColEu4$lambda$9(BidAsk bidAsk, Modifier modifier, boolean z, C2002Dp c2002Dp, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException {
        m12533BidAskDetailsIColEu4(bidAsk, modifier, z, c2002Dp, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:223:0x076b  */
    /* JADX WARN: Removed duplicated region for block: B:225:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x011c  */
    /* renamed from: BidAskDetails-IColEu4, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m12533BidAskDetailsIColEu4(final BidAsk bidAsk, Modifier modifier, boolean z, C2002Dp c2002Dp, Composer composer, final int i, final int i2) throws Resources.NotFoundException {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        C2002Dp c2002Dp2;
        C2002Dp c2002Dp3;
        String bidPrice;
        TextStyle textM;
        BigDecimal bidSize;
        Modifier modifierAlignBy;
        TextStyle textM2;
        BigDecimal askSize;
        Composer composer2;
        final boolean z3;
        final C2002Dp c2002Dp4;
        final Modifier modifier3;
        String askPrice;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1564587815);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(bidAsk) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 256 : 128;
                }
                i5 = i2 & 8;
                if (i5 == 0) {
                    if ((i & 3072) == 0) {
                        c2002Dp2 = c2002Dp;
                        i3 |= composerStartRestartGroup.changed(c2002Dp2) ? 2048 : 1024;
                    }
                    if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z4 = i4 == 0 ? false : z2;
                        c2002Dp3 = i5 == 0 ? null : c2002Dp2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1564587815, i3, -1, "com.robinhood.android.compose.bidask.BidAskDetails (BidAskDetails.kt:37)");
                        }
                        SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(bidAsk == null ? bidAsk.getBidSize().floatValue() / (bidAsk.getBidSize().floatValue() + bidAsk.getAskSize().floatValue()) : 0.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                        SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(bidAsk != null ? bidAsk.getAskSize().floatValue() / (bidAsk.getBidSize().floatValue() + bidAsk.getAskSize().floatValue()) : 0.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                        Alignment.Companion companion = Alignment.INSTANCE;
                        Alignment.Vertical bottom = companion.getBottom();
                        if (c2002Dp3 == null) {
                            c2002Dp3.getValue();
                            Arrangement.Horizontal start = Arrangement.INSTANCE.m5089spacedBy0680j_4(c2002Dp3.getValue());
                            if (start == null) {
                                start = Arrangement.INSTANCE.getStart();
                            }
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, bottom, composerStartRestartGroup, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Modifier.Companion companion3 = Modifier.INSTANCE;
                            Modifier modifierThen = Row5.weight$default(row6, companion3, 0.33333334f, false, 2, null).then(z4 ? row6.alignBy(companion3, AlignmentLineKt.getLastBaseline()) : companion3);
                            Arrangement arrangement = Arrangement.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                            Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor2);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            String strStringResource = StringResources_androidKt.stringResource(C11932R.string.detail_page_stats_bid, composerStartRestartGroup, 0);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            long jM21426getFg20d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU();
                            TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS();
                            TextOverflow.Companion companion4 = TextOverflow.INSTANCE;
                            Modifier modifier5 = modifier4;
                            BentoText2.m20747BentoText38GnDrw(strStringResource, TestTag3.testTag(companion3, BidAskDetails3.BID_TITLE), Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textS, composerStartRestartGroup, 817889328, 0, 7544);
                            if (bidAsk == null || (bidPrice = bidAsk.getBidPrice()) == null) {
                                bidPrice = "$00.00";
                            }
                            long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                            if (z4) {
                                composerStartRestartGroup.startReplaceGroup(-1497237742);
                                textM = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextL();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-1497236686);
                                textM = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            TextStyle textStyle = textM;
                            FontWeight.Companion companion5 = FontWeight.INSTANCE;
                            BentoText2.m20747BentoText38GnDrw(bidPrice, ModifiersKt.setContentDescriptionIf$default(TestTag3.testTag(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion3, bidAsk == null, null, 2, null), BidAskDetails3.BID_PRICE), bidAsk == null, StringResources_androidKt.stringResource(C11932R.string.loading_content_description, composerStartRestartGroup, 0), false, 4, null), Color.m6701boximpl(jM21425getFg0d7_KjU), null, companion5.getBold(), null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textStyle, composerStartRestartGroup, 817913856, 0, 7528);
                            int i8 = C11932R.string.detail_page_stats_quote_size;
                            NumberFormatter shareQuantityFormat = Formats.getShareQuantityFormat();
                            if (bidAsk == null || (bidSize = bidAsk.getBidSize()) == null) {
                                bidSize = PLACEHOLDER_BID_SIZE;
                            }
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i8, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(shareQuantityFormat, bidSize, null, 2, null)}, composerStartRestartGroup, 0), ModifiersKt.setContentDescriptionIf$default(TestTag3.testTag(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion3, bidAsk == null, null, 2, null), BidAskDetails3.BID_SIZE), bidAsk == null, StringResources_androidKt.stringResource(C11932R.string.loading_content_description, composerStartRestartGroup, 0), false, 4, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composerStartRestartGroup, 817889280, 0, 7544);
                            composerStartRestartGroup.endNode();
                            Alignment.Vertical bottom2 = companion.getBottom();
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM());
                            Modifier modifierWeight$default = Row5.weight$default(row6, companion3, 0.33333334f, false, 2, null);
                            composerStartRestartGroup.startReplaceGroup(823472951);
                            if (z4) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.android.compose.bidask.BidAskDetailsKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return Integer.valueOf(BidAskDetails2.BidAskDetails_IColEu4$lambda$8$lambda$5$lambda$4((Measured) obj));
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                modifierAlignBy = row6.alignBy(companion3, (Function1<? super Measured, Integer>) objRememberedValue);
                            } else {
                                modifierAlignBy = companion3;
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierThen2 = modifierWeight$default.then(modifierAlignBy);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, bottom2, composerStartRestartGroup, 48);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen2);
                            Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor3);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                            Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(RangesKt.coerceAtLeast(BidAskDetails_IColEu4$lambda$0(snapshotState4AnimateFloatAsState) * BID_ASK_BAR_MAX_HEIGHT, 2.0f)));
                            composerStartRestartGroup.startReplaceGroup(-1555058078);
                            float fM7995constructorimpl = z4 ? C2002Dp.m7995constructorimpl(0) : bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM();
                            composerStartRestartGroup.endReplaceGroup();
                            float f = 1;
                            BoxKt.Box(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(BorderKt.m4877borderxT4_qwU$default(Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(modifierM5156height3ABfNKs, fM7995constructorimpl, 0.0f, 0.0f, 0.0f, 14, null), 0.5f, false, 2, null), C2002Dp.m7995constructorimpl(f), bentoTheme.getColors(composerStartRestartGroup, i7).m21456getPositive0d7_KjU(), null, 4, null), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i7).m21456getPositive0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), BidAskDetails3.BID_BAR), composerStartRestartGroup, 0);
                            Modifier modifierM5156height3ABfNKs2 = SizeKt.m5156height3ABfNKs(companion3, C2002Dp.m7995constructorimpl(RangesKt.coerceAtLeast(BidAskDetails_IColEu4$lambda$1(snapshotState4AnimateFloatAsState2) * BID_ASK_BAR_MAX_HEIGHT, 2.0f)));
                            composerStartRestartGroup.startReplaceGroup(-1555039038);
                            float fM7995constructorimpl2 = z4 ? C2002Dp.m7995constructorimpl(0) : bentoTheme.getSpacing(composerStartRestartGroup, i7).m21595getXsmallD9Ej5fM();
                            composerStartRestartGroup.endReplaceGroup();
                            BoxKt.Box(TestTag3.testTag(Background3.m4872backgroundbw27NRU$default(BorderKt.m4877borderxT4_qwU$default(Row5.weight$default(row6, PaddingKt.m5146paddingqDBjuR0$default(modifierM5156height3ABfNKs2, 0.0f, 0.0f, fM7995constructorimpl2, 0.0f, 11, null), 0.5f, false, 2, null), C2002Dp.m7995constructorimpl(f), bentoTheme.getColors(composerStartRestartGroup, i7).m21452getNegative0d7_KjU(), null, 4, null), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i7).m21452getNegative0d7_KjU(), 0.1f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null), BidAskDetails3.ASK_BAR), composerStartRestartGroup, 0);
                            composerStartRestartGroup.endNode();
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getEnd(), composerStartRestartGroup, 48);
                            int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierThen);
                            Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                            if (composerStartRestartGroup.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composerStartRestartGroup.startReusableNode();
                            if (composerStartRestartGroup.getInserting()) {
                                composerStartRestartGroup.createNode(constructor4);
                            } else {
                                composerStartRestartGroup.useNode();
                            }
                            Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                            Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C11932R.string.detail_page_stats_ask, composerStartRestartGroup, 0), TestTag3.testTag(companion3, BidAskDetails3.ASK_TITLE), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21426getFg20d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextS(), composerStartRestartGroup, 817889328, 0, 7544);
                            String str = (bidAsk == null || (askPrice = bidAsk.getAskPrice()) == null) ? "$00.00" : askPrice;
                            long jM21425getFg0d7_KjU2 = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                            if (z4) {
                                composerStartRestartGroup.startReplaceGroup(-2066978821);
                                textM2 = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextL();
                            } else {
                                composerStartRestartGroup.startReplaceGroup(-2066977765);
                                textM2 = bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM();
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoText2.m20747BentoText38GnDrw(str, ModifiersKt.setContentDescriptionIf$default(TestTag3.testTag(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion3, bidAsk == null, null, 2, null), BidAskDetails3.ASK_PRICE), bidAsk == null, StringResources_androidKt.stringResource(C11932R.string.loading_content_description, composerStartRestartGroup, 0), false, 4, null), Color.m6701boximpl(jM21425getFg0d7_KjU2), null, companion5.getBold(), null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, textM2, composerStartRestartGroup, 817913856, 0, 7528);
                            int i9 = C11932R.string.detail_page_stats_quote_size;
                            NumberFormatter shareQuantityFormat2 = Formats.getShareQuantityFormat();
                            if (bidAsk == null || (askSize = bidAsk.getAskSize()) == null) {
                                askSize = PLACEHOLDER_ASK_SIZE;
                            }
                            composer2 = composerStartRestartGroup;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i9, new Object[]{NumberFormatter.DefaultImpls.formatNullable$default(shareQuantityFormat2, askSize, null, 2, null)}, composerStartRestartGroup, 0), ModifiersKt.setContentDescriptionIf$default(TestTag3.testTag(com.robinhood.compose.bento.util.ModifiersKt.bentoPlaceholder$default(companion3, bidAsk == null, null, 2, null), BidAskDetails3.ASK_SIZE), bidAsk == null, StringResources_androidKt.stringResource(C11932R.string.loading_content_description, composerStartRestartGroup, 0), false, 4, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU()), null, null, null, null, companion4.m7959getEllipsisgIe3tQ8(), false, 2, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), composer2, 817889280, 0, 7544);
                            composer2.endNode();
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z3 = z4;
                            c2002Dp4 = c2002Dp3;
                            modifier3 = modifier5;
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        z3 = z2;
                        c2002Dp4 = c2002Dp2;
                        composer2 = composerStartRestartGroup;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.compose.bidask.BidAskDetailsKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return BidAskDetails2.BidAskDetails_IColEu4$lambda$9(bidAsk, modifier3, z3, c2002Dp4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 3072;
                c2002Dp2 = c2002Dp;
                if ((i3 & 1171) == 1170) {
                    if (i6 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    SnapshotState4<Float> snapshotState4AnimateFloatAsState3 = AnimateAsState.animateFloatAsState(bidAsk == null ? bidAsk.getBidSize().floatValue() / (bidAsk.getBidSize().floatValue() + bidAsk.getAskSize().floatValue()) : 0.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                    SnapshotState4<Float> snapshotState4AnimateFloatAsState22 = AnimateAsState.animateFloatAsState(bidAsk != null ? bidAsk.getAskSize().floatValue() / (bidAsk.getBidSize().floatValue() + bidAsk.getAskSize().floatValue()) : 0.0f, null, 0.0f, null, null, composerStartRestartGroup, 0, 30);
                    Alignment.Companion companion6 = Alignment.INSTANCE;
                    Alignment.Vertical bottom3 = companion6.getBottom();
                    if (c2002Dp3 == null) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 8;
            if (i5 == 0) {
            }
            c2002Dp2 = c2002Dp;
            if ((i3 & 1171) == 1170) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        z2 = z;
        i5 = i2 & 8;
        if (i5 == 0) {
        }
        c2002Dp2 = c2002Dp;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final float BidAskDetails_IColEu4$lambda$0(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    private static final float BidAskDetails_IColEu4$lambda$1(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int BidAskDetails_IColEu4$lambda$8$lambda$5$lambda$4(Measured it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.getMeasuredHeight();
    }
}
