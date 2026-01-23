package com.robinhood.shared.crypto.p375ui.trade.review;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.crypto.p375ui.trade.review.CryptoReviewComposable;
import com.robinhood.shared.crypto.p375ui.trade.review.CryptoReviewState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresComposable3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewMessageAndDisclosuresState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import com.robinhood.utils.resource.StringResource;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.extensions2;

/* compiled from: CryptoReviewComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aC\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b\u001a\u0017\u0010\f\u001a\u00020\u00012\b\b\u0001\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, m3636d2 = {"CryptoReviewComposable", "", "state", "Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState;", "onRowTap", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "onSubtitleIconClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/ui/trade/review/CryptoReviewState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Preview", AnalyticsStrings.BUTTON_EARNINGS_PREVIEW, "Lcom/robinhood/shared/crypto/ui/trade/review/ReviewScreenPreview;", "(Lcom/robinhood/shared/crypto/ui/trade/review/ReviewScreenPreview;Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoReviewComposable {

    /* compiled from: CryptoReviewComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CryptoReviewState.TitleContentDisplay.values().length];
            try {
                iArr[CryptoReviewState.TitleContentDisplay.NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CryptoReviewState.TitleContentDisplay.LARGE_CENTERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoReviewComposable$lambda$9(CryptoReviewState cryptoReviewState, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoReviewComposable(cryptoReviewState, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Preview$lambda$10(ReviewScreenPreview reviewScreenPreview, int i, Composer composer, int i2) {
        Preview(reviewScreenPreview, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0454  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0483 A[LOOP:0: B:144:0x047d->B:146:0x0483, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:149:0x04d6  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x04e1  */
    /* JADX WARN: Removed duplicated region for block: B:156:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0273  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoReviewComposable(final CryptoReviewState state, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> onRowTap, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i4;
        Modifier modifier3;
        int i5;
        Object obj;
        char c;
        Composer composer2;
        Modifier modifierAutomationTestTag;
        Modifier.Companion companion;
        int i6;
        int i7;
        Iterator<CryptoOrderReviewRowState> it;
        final Modifier modifier4;
        int i8;
        Arrangement.Horizontal start;
        Modifier modifierAutomationTestTag2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onRowTap, "onRowTap");
        Composer composerStartRestartGroup = composer.startRestartGroup(1346982357);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRowTap) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i9 = i2 & 8;
        if (i9 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i9 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1346982357, i3, -1, "com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposable (CryptoReviewComposable.kt:47)");
                }
                Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null);
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion2 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier.Companion companion4 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(Column5.weight$default(column6, companion4, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                CryptoReviewState.TitleContentDisplay titleContentDisplay = state.getTitleContentDisplay();
                int[] iArr = WhenMappings.$EnumSwitchMapping$0;
                i4 = iArr[titleContentDisplay.ordinal()];
                if (i4 != 1) {
                    modifier3 = modifier5;
                    i5 = 1;
                    obj = null;
                    c = 3;
                    composerStartRestartGroup.startReplaceGroup(1391886826);
                    String string2 = StringResource2.getString(state.getTitle(), composerStartRestartGroup, StringResource.$stable);
                    TextStyle displayCapsuleMedium = BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getDisplayCapsuleMedium();
                    Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, 0.0f, 3, null);
                    String titleAutomationTestTag = state.getTitleAutomationTestTag();
                    if (titleAutomationTestTag != null && (modifierAutomationTestTag = AutomationTestTagModifierExt.automationTestTag(modifierM5144paddingVpY3zN4$default, titleAutomationTestTag)) != null) {
                        modifierM5144paddingVpY3zN4$default = modifierAutomationTestTag;
                    }
                    BentoText2.m20747BentoText38GnDrw(string2, modifierM5144paddingVpY3zN4$default, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    Unit unit = Unit.INSTANCE;
                } else {
                    if (i4 != 2) {
                        composerStartRestartGroup.startReplaceGroup(1153276374);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1392382330);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme.getSpacing(composerStartRestartGroup, i10).m21596getXxlargeD9Ej5fM()), composerStartRestartGroup, 0);
                    String string3 = StringResource2.getString(state.getTitle(), composerStartRestartGroup, StringResource.$stable);
                    TextStyle bookCoverCapsuleLarge = bentoTheme.getTypography(composerStartRestartGroup, i10).getBookCoverCapsuleLarge();
                    int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion4, 0.0f, 1, null);
                    String titleAutomationTestTag2 = state.getTitleAutomationTestTag();
                    if (titleAutomationTestTag2 != null && (modifierAutomationTestTag2 = AutomationTestTagModifierExt.automationTestTag(modifierFillMaxWidth$default, titleAutomationTestTag2)) != null) {
                        modifierFillMaxWidth$default = modifierAutomationTestTag2;
                    }
                    i5 = 1;
                    modifier3 = modifier5;
                    c = 3;
                    obj = null;
                    BentoText2.m20747BentoText38GnDrw(string3, modifierFillMaxWidth$default, null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, bookCoverCapsuleLarge, composerStartRestartGroup, 0, 0, 8124);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    Unit unit2 = Unit.INSTANCE;
                }
                composer2.startReplaceGroup(1153314421);
                if (state.getSubtitle() == null) {
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion4, 0.0f, i5, obj);
                    int i11 = iArr[state.getTitleContentDisplay().ordinal()];
                    if (i11 != i5) {
                        i8 = 2;
                        if (i11 != 2) {
                            throw new NoWhenBranchMatchedException();
                        }
                        start = arrangement.getCenter();
                    } else {
                        i8 = 2;
                        start = arrangement.getStart();
                    }
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(start, companion2.getCenterVertically(), composer2, 48);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer2, modifierFillMaxWidth$default2);
                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                    if (composer2.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer2.startReusableNode();
                    if (composer2.getInserting()) {
                        composer2.createNode(constructor3);
                    } else {
                        composer2.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer2);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    String string4 = StringResource2.getString(state.getSubtitle(), composer2, StringResource.$stable);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i12 = BentoTheme.$stable;
                    Composer composer3 = composer2;
                    i7 = i8;
                    i6 = 0;
                    BentoText2.m20747BentoText38GnDrw(string4, null, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i12).getTextM(), composer3, 0, 0, 8190);
                    composer2 = composer3;
                    BentoIcon4 subtitleTrailingIcon = state.getSubtitleTrailingIcon();
                    composer2.startReplaceGroup(-1436963404);
                    if (subtitleTrailingIcon == null) {
                        companion = companion4;
                    } else {
                        long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer2, i12).m21426getFg20d7_KjU();
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion4, bentoTheme2.getSpacing(composer2, i12).m21595getXsmallD9Ej5fM(), 0.0f, 0.0f, 0.0f, 14, null);
                        companion = companion4;
                        boolean z = function0 != null;
                        composer2.startReplaceGroup(5004770);
                        boolean z2 = (i3 & 896) == 256;
                        Object objRememberedValue = composer2.rememberedValue();
                        if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoReviewComposable.m2801xdf398363(function0);
                                }
                            };
                            composer2.updateRememberedValue(objRememberedValue);
                        }
                        composer2.endReplaceGroup();
                        BentoIcon2.m20644BentoIconFU0evQE(subtitleTrailingIcon, null, jM21426getFg20d7_KjU, ClickableKt.m4893clickableXHw0xAI$default(modifierM5146paddingqDBjuR0$default, z, null, null, (Function0) objRememberedValue, 6, null), null, false, composer2, BentoIcon4.$stable | 48, 48);
                        composer2 = composer2;
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                } else {
                    companion = companion4;
                    i6 = 0;
                    i7 = 2;
                }
                composer2.endReplaceGroup();
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, i6);
                composer2.startReplaceGroup(1153357032);
                it = state.getRows().iterator();
                while (it.hasNext()) {
                    int i13 = i7;
                    Composer composer4 = composer2;
                    CryptoOrderReviewRow3.CryptoOrderReviewRow(it.next(), null, onRowTap, composer4, (i3 << 3) & 896, 2);
                    i3 = i3;
                    i6 = i6;
                    composer2 = composer4;
                    i7 = i13;
                }
                int i14 = i7;
                composerStartRestartGroup = composer2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                CryptoOrderReviewMessageAndDisclosuresComposable3.CryptoOrderReviewMessageAndDisclosuresComposable(state.getMessageAndDisclosuresState(), null, composerStartRestartGroup, StringResource.$stable, i14);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, i6);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CryptoReviewComposable.CryptoReviewComposable$lambda$9(state, onRowTap, function0, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i9 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(modifier5, 0.0f, 1, null);
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion22 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion22.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2);
            ComposeUiNode.Companion companion32 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor4 = companion32.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion32.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap4, companion32.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion32.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier4, companion32.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion42 = Modifier.INSTANCE;
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(Column5.weight$default(column62, companion42, 1.0f, false, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion22.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion32.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion32.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion32.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion32.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion32.getSetModifier());
                    CryptoReviewState.TitleContentDisplay titleContentDisplay2 = state.getTitleContentDisplay();
                    int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
                    i4 = iArr2[titleContentDisplay2.ordinal()];
                    if (i4 != 1) {
                    }
                    composer2.startReplaceGroup(1153314421);
                    if (state.getSubtitle() == null) {
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer2, i6);
                    composer2.startReplaceGroup(1153357032);
                    it = state.getRows().iterator();
                    while (it.hasNext()) {
                    }
                    int i142 = i7;
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    CryptoOrderReviewMessageAndDisclosuresComposable3.CryptoOrderReviewMessageAndDisclosuresComposable(state.getMessageAndDisclosuresState(), null, composerStartRestartGroup, StringResource.$stable, i142);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composerStartRestartGroup, i6);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier4 = modifier3;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoReviewComposable$lambda$8$lambda$7$lambda$5$lambda$4$lambda$3$lambda$2 */
    public static final Unit m2801xdf398363(Function0 function0) {
        if (function0 != null) {
            function0.invoke();
            return Unit.INSTANCE;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private static final void Preview(final ReviewScreenPreview reviewScreenPreview, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1466283227);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(reviewScreenPreview) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1466283227, i2, -1, "com.robinhood.shared.crypto.ui.trade.review.Preview (CryptoReviewComposable.kt:159)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), ComposableLambda3.rememberComposableLambda(-405680155, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt.Preview.1

                /* compiled from: CryptoReviewComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt$Preview$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ ReviewScreenPreview $preview;

                    AnonymousClass1(ReviewScreenPreview reviewScreenPreview) {
                        this.$preview = reviewScreenPreview;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1260105629, i, -1, "com.robinhood.shared.crypto.ui.trade.review.Preview.<anonymous>.<anonymous> (CryptoReviewComposable.kt:164)");
                        }
                        Modifier modifierM5156height3ABfNKs = SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(500));
                        StringResource.Companion companion = StringResource.INSTANCE;
                        CryptoReviewState cryptoReviewState = new CryptoReviewState(companion.invoke("Title"), this.$preview.getTitleContentDisplay(), companion.invoke("Subtitle"), new BentoIcon4.Size16(ServerToBentoAssetMapper2.QUESTION_FILLED_16), extensions2.persistentListOf(new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("Order size"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("$5,642.16"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, null, null, false, null, false, null, null, 1020, null), new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("Quantity"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("0.0156"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, null, null, false, null, false, null, null, 1020, null), new CryptoOrderReviewRowState(new CryptoOrderReviewRowState.TextContent(companion.invoke("Leverage"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), new CryptoOrderReviewRowState.TextContent(companion.invoke("Cross 2x"), null, null, null, null, null, false, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null), null, null, null, false, null, false, null, null, 988, null)), new CryptoOrderReviewMessageAndDisclosuresState(null, companion.invoke("Cryptocurrency trading is offered through an account with Robinhood Crypto. Robinhood Crypto is not a broker-dealer or FINRA member. Cryptocurrencies offered by Robinhood Crypto, LLC are not securities and are not FDIC insured or protected by SIPC. Disclosures"), new CryptoOrderReviewMessageAndDisclosuresState.DisclosuresContent(companion.invoke("Disclosures"), companion.invoke("")), false, 1, null), null, 64, null);
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        Composer.Companion companion2 = Composer.INSTANCE;
                        if (objRememberedValue == companion2.getEmpty()) {
                            objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt$Preview$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoReviewComposable.C386401.AnonymousClass1.invoke$lambda$1$lambda$0((CryptoOrderReviewRowState.TapAction) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        Function1 function1 = (Function1) objRememberedValue;
                        composer.endReplaceGroup();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (objRememberedValue2 == companion2.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt$Preview$1$1$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        CryptoReviewComposable.CryptoReviewComposable(cryptoReviewState, function1, (Function0) objRememberedValue2, modifierM5156height3ABfNKs, composer, 3504, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(CryptoOrderReviewRowState.TapAction it) {
                        Intrinsics.checkNotNullParameter(it, "it");
                        return Unit.INSTANCE;
                    }
                }

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
                        ComposerKt.traceEventStart(-405680155, i3, -1, "com.robinhood.shared.crypto.ui.trade.review.Preview.<anonymous> (CryptoReviewComposable.kt:163)");
                    }
                    BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1260105629, true, new AnonymousClass1(reviewScreenPreview), composer2, 54), composer2, 100663296, 255);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.review.CryptoReviewComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoReviewComposable.Preview$lambda$10(reviewScreenPreview, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
