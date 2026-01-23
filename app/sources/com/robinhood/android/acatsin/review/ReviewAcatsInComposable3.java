package com.robinhood.android.acatsin.review;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxScope;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.draw.Clip;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.acats.p057ui.C7686R;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonBarScreenLayout;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoImage;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowLayout;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.HttpUrl;

/* compiled from: ReviewAcatsInComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aI\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\b2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0007¢\u0006\u0002\u0010\r\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"BROKERAGE_ROW_TEST_TAG", "", "ASSETS_ROW_TEST_TAG", "ReviewAcatsInComposable", "", "viewState", "Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;", "onPrimaryCtaClick", "Lkotlin/Function0;", "onSecondaryCtaClick", "onAssetsToTransferClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/acatsin/review/ReviewAcatsInViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-acats-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt, reason: use source file name */
/* loaded from: classes24.dex */
public final class ReviewAcatsInComposable3 {
    public static final String ASSETS_ROW_TEST_TAG = "assets_row";
    public static final String BROKERAGE_ROW_TEST_TAG = "brokerage_row";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ReviewAcatsInComposable$lambda$0(ReviewAcatsInViewState reviewAcatsInViewState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, int i, int i2, Composer composer, int i3) {
        ReviewAcatsInComposable(reviewAcatsInViewState, function0, function02, function03, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x00b5  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ReviewAcatsInComposable(final ReviewAcatsInViewState viewState, final Function0<Unit> onPrimaryCtaClick, final Function0<Unit> onSecondaryCtaClick, final Function0<Unit> onAssetsToTransferClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onPrimaryCtaClick, "onPrimaryCtaClick");
        Intrinsics.checkNotNullParameter(onSecondaryCtaClick, "onSecondaryCtaClick");
        Intrinsics.checkNotNullParameter(onAssetsToTransferClick, "onAssetsToTransferClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1866473445);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryCtaClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onSecondaryCtaClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onAssetsToTransferClick) ? 2048 : 1024;
        }
        int i4 = i2 & 16;
        if (i4 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1866473445, i3, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable (ReviewAcatsInComposable.kt:56)");
                }
                BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-201951482, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt.ReviewAcatsInComposable.1
                    public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        int i6;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 6) == 0) {
                            i6 = i5 | ((i5 & 8) == 0 ? composer2.changed(BentoButtonBarScreenLayout) : composer2.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                        if ((i6 & 19) == 18 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-201951482, i6, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous> (ReviewAcatsInComposable.kt:211)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                        ReviewAcatsInViewState reviewAcatsInViewState = viewState;
                        Function0<Unit> function0 = onPrimaryCtaClick;
                        Function0<Unit> function02 = onSecondaryCtaClick;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i7 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                        StringResource infoText = reviewAcatsInViewState.getInfoText();
                        int i8 = StringResource.$stable;
                        int i9 = i6;
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(infoText, composer2, i8), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8120);
                        if (reviewAcatsInViewState.getSecondaryCtaText() != null) {
                            composer2.startReplaceGroup(1176084669);
                            BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, StringResources6.getTextAsString(reviewAcatsInViewState.getPrimaryCtaText(), composer2, i8), false, null, false, function02, StringResources6.getTextAsString(reviewAcatsInViewState.getSecondaryCtaText(), composer2, i8), false, null, false, composer2, 0, 0, 59199);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(1176475548);
                            BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, function0, StringResources6.getTextAsString(reviewAcatsInViewState.getPrimaryCtaText(), composer2, i8), false, null, false, composer2, (BentoButtonBar3.$stable << 21) | (29360128 & (i9 << 21)), 115);
                            composer2.endReplaceGroup();
                        }
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                        invoke(bentoButtonBar3, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-545918413, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt.ReviewAcatsInComposable.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                        invoke(boxScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                        BentoTheme bentoTheme;
                        boolean z;
                        Modifier.Companion companion;
                        int i6;
                        int i7;
                        Composer composer3;
                        Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                        if ((i5 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-545918413, i5, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous> (ReviewAcatsInComposable.kt:60)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i8 = BentoTheme.$stable;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme2.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                        final ReviewAcatsInViewState reviewAcatsInViewState = viewState;
                        Function0<Unit> function0 = onAssetsToTransferClick;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
                        StringResource title = reviewAcatsInViewState.getTitle();
                        int i9 = StringResource.$stable;
                        BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(title, composer2, i9), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i8).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                        Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme2.getSpacing(composer2, i8).m21591getLargeD9Ej5fM(), bentoTheme2.getSpacing(composer2, i8).m21593getSmallD9Ej5fM());
                        String strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_review_external_account_header, composer2, 0);
                        FontWeight.Companion companion4 = FontWeight.INSTANCE;
                        BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16364);
                        BentoBaseRowLayout.BentoBaseRowLayout(TestTag3.testTag(companion2, ReviewAcatsInComposable3.BROKERAGE_ROW_TEST_TAG), null, null, ReviewAcatsInComposable.INSTANCE.getLambda$1435422176$lib_acats_ui_externalDebug(), null, ComposableLambda3.rememberComposableLambda(472202270, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt$ReviewAcatsInComposable$2$1$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i10) {
                                if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(472202270, i10, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous>.<anonymous>.<anonymous> (ReviewAcatsInComposable.kt:91)");
                                }
                                Arrangement arrangement = Arrangement.INSTANCE;
                                BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                                int i11 = BentoTheme.$stable;
                                float fM21593getSmallD9Ej5fM = bentoTheme3.getSpacing(composer4, i11).m21593getSmallD9Ej5fM();
                                Alignment.Companion companion5 = Alignment.INSTANCE;
                                Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = arrangement.m5090spacedByD5KLDUw(fM21593getSmallD9Ej5fM, companion5.getEnd());
                                Alignment.Vertical centerVertically = companion5.getCenterVertically();
                                ReviewAcatsInViewState reviewAcatsInViewState2 = reviewAcatsInViewState;
                                Modifier.Companion companion6 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw, centerVertically, composer4, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion6);
                                ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor2);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
                                Row6 row6 = Row6.INSTANCE;
                                if (reviewAcatsInViewState2.getContraBrokerageLogoUrl() != null) {
                                    composer4.startReplaceGroup(-731598744);
                                    Modifier modifierClip = Clip.clip(SizeKt.m5156height3ABfNKs(companion6, C2002Dp.m7995constructorimpl(24)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                                    BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(HttpUrl.INSTANCE.get(reviewAcatsInViewState2.getContraBrokerageLogoUrl()), null, null, null, 0, null, composer4, 0, 62), reviewAcatsInViewState2.getContraBrokerageName() + " image logo", modifierClip, null, ContentScale.INSTANCE.getFit(), 0.0f, null, composer4, 24576, 104);
                                    composer4.endReplaceGroup();
                                } else {
                                    composer4.startReplaceGroup(-730936770);
                                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BANKING_24), "banking icon", bentoTheme3.getColors(composer4, i11).m21425getFg0d7_KjU(), null, null, false, composer4, BentoIcon4.Size24.$stable | 48, 56);
                                    composer4.endReplaceGroup();
                                }
                                BentoText2.m20747BentoText38GnDrw(reviewAcatsInViewState2.getContraBrokerageName(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, null, composer4, 805306368, 0, 15870);
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, false, false, false, null, composer2, 199686, 0, 2006);
                        BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C7686R.string.acats_in_review_account_number_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(reviewAcatsInViewState.getContraAccountNumber(), null, 2, null), null, null, null, null, false, false, 4061, null);
                        int i10 = BentoDataRowState.$stable;
                        BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, null, null, null, null, composer2, i10, 30);
                        int i11 = i8;
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), bentoTheme2.getColors(composer2, i11).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                        StringResource assetsValue = reviewAcatsInViewState.getAssetsValue();
                        composer2.startReplaceGroup(48977696);
                        if (assetsValue == null) {
                            companion = companion2;
                            bentoTheme = bentoTheme2;
                            composer3 = composer2;
                            i7 = i10;
                            i6 = i9;
                            z = true;
                        } else {
                            bentoTheme = bentoTheme2;
                            z = true;
                            companion = companion2;
                            Modifier modifierTestTag = TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, function0, 7, null), ReviewAcatsInComposable3.ASSETS_ROW_TEST_TAG);
                            composer2.startReplaceGroup(48987363);
                            AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                            composer2.startReplaceGroup(48989038);
                            int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i11).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                            try {
                                builder.append(StringResources_androidKt.stringResource(C7686R.string.assets_label, composer2, 0));
                                Unit unit = Unit.INSTANCE;
                                builder.pop(iPushStyle);
                                composer2.endReplaceGroup();
                                AnnotatedString annotatedString = builder.toAnnotatedString();
                                composer2.endReplaceGroup();
                                BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(StringResources6.getTextAsString(assetsValue, composer2, i9), null, 2, null), null, null, BentoIcon4.INSTANCE.toBentoIcon(ServerToBentoAssetMapper2.CARET_RIGHT_16), Color.m6701boximpl(bentoTheme.getColors(composer2, i11).m21427getFg30d7_KjU()), false, false, 3293, null);
                                i6 = i9;
                                i11 = i11;
                                BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState2, modifierTestTag, null, null, null, composer2, i10, 28);
                                i7 = i10;
                                BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer2, i11).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                                composer3 = composer2;
                            } catch (Throwable th) {
                                builder.pop(iPushStyle);
                                throw th;
                            }
                        }
                        composer3.endReplaceGroup();
                        int i12 = i6;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_review_robinhood_account_header, composer3, 0), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer3, i11).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer3, i11).m21593getSmallD9Ej5fM()), null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16364);
                        BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C7686R.string.acats_in_review_account_name_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getTextAsString(reviewAcatsInViewState.getRhAccountName(), composer2, i12), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, null, null, composer2, i7, 30);
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer2, i11).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                        BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(-1821487991, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt$ReviewAcatsInComposable$2$1$3
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer4, int i13) {
                                if ((i13 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1821487991, i13, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous>.<anonymous>.<anonymous> (ReviewAcatsInComposable.kt:183)");
                                }
                                BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(reviewAcatsInViewState.getRhAccountOwnerLabel(), composer4, StringResource.$stable), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16378);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(237118279, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt$ReviewAcatsInComposable$2$1$4
                            public final void invoke(Composer composer4, int i13) {
                                Composer composer5 = composer4;
                                if ((i13 & 3) == 2 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(237118279, i13, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous>.<anonymous>.<anonymous> (ReviewAcatsInComposable.kt:189)");
                                }
                                Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                                ReviewAcatsInViewState reviewAcatsInViewState2 = reviewAcatsInViewState;
                                Modifier.Companion companion5 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer5, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, companion5);
                                ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor2);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                                Column6 column62 = Column6.INSTANCE;
                                composer5.startReplaceGroup(1924769215);
                                Iterator<String> it = reviewAcatsInViewState2.getRhAccountOwnerNames().iterator();
                                while (it.hasNext()) {
                                    BentoText2.m20747BentoText38GnDrw(it.next(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16318);
                                    composer5 = composer4;
                                }
                                composer4.endReplaceGroup();
                                composer4.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), null, false, false, false, null, composer2, 199680, 0, 2007);
                        composer2.startReplaceGroup(49066664);
                        if (reviewAcatsInViewState.getMatchLabel() != null && reviewAcatsInViewState.getMatchValue() != null) {
                            BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getTextAsString(reviewAcatsInViewState.getMatchLabel(), composer2, i12), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getTextAsString(reviewAcatsInViewState.getMatchValue(), composer2, i12), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, null, null, composer2, i7, 30);
                        }
                        composer2.endReplaceGroup();
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ReviewAcatsInComposable3.ReviewAcatsInComposable$lambda$0(viewState, onPrimaryCtaClick, onSecondaryCtaClick, onAssetsToTransferClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoButtonBarScreenLayout.BentoButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier3, 0.0f, 1, null), false, ComposableLambda3.rememberComposableLambda(-201951482, true, new Function3<BentoButtonBar3, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt.ReviewAcatsInComposable.1
                public final void invoke(BentoButtonBar3 BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 6) == 0) {
                        i6 = i5 | ((i5 & 8) == 0 ? composer2.changed(BentoButtonBarScreenLayout) : composer2.changedInstance(BentoButtonBarScreenLayout) ? 4 : 2);
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-201951482, i6, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous> (ReviewAcatsInComposable.kt:211)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                    ReviewAcatsInViewState reviewAcatsInViewState = viewState;
                    Function0<Unit> function0 = onPrimaryCtaClick;
                    Function0<Unit> function02 = onSecondaryCtaClick;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default = androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i7).m21590getDefaultD9Ej5fM(), 0.0f, 0.0f, 13, null);
                    StringResource infoText = reviewAcatsInViewState.getInfoText();
                    int i8 = StringResource.$stable;
                    int i9 = i6;
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(infoText, composer2, i8), modifierM5146paddingqDBjuR0$default, Color.m6701boximpl(bentoTheme.getColors(composer2, i7).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i7).getTextS(), composer2, 0, 0, 8120);
                    if (reviewAcatsInViewState.getSecondaryCtaText() != null) {
                        composer2.startReplaceGroup(1176084669);
                        BentoButtonBar2.BentoButtonBar(null, null, null, false, null, null, function0, StringResources6.getTextAsString(reviewAcatsInViewState.getPrimaryCtaText(), composer2, i8), false, null, false, function02, StringResources6.getTextAsString(reviewAcatsInViewState.getSecondaryCtaText(), composer2, i8), false, null, false, composer2, 0, 0, 59199);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(1176475548);
                        BentoButtonBarScreenLayout.PrimaryButtonOnly(null, null, function0, StringResources6.getTextAsString(reviewAcatsInViewState.getPrimaryCtaText(), composer2, i8), false, null, false, composer2, (BentoButtonBar3.$stable << 21) | (29360128 & (i9 << 21)), 115);
                        composer2.endReplaceGroup();
                    }
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer2, Integer num) {
                    invoke(bentoButtonBar3, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-545918413, true, new Function3<BoxScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt.ReviewAcatsInComposable.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(BoxScope boxScope, Composer composer2, Integer num) {
                    invoke(boxScope, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(BoxScope BentoButtonBarScreenLayout, Composer composer2, int i5) {
                    BentoTheme bentoTheme;
                    boolean z;
                    Modifier.Companion companion;
                    int i6;
                    int i7;
                    Composer composer3;
                    Intrinsics.checkNotNullParameter(BentoButtonBarScreenLayout, "$this$BentoButtonBarScreenLayout");
                    if ((i5 & 17) == 16 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-545918413, i5, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous> (ReviewAcatsInComposable.kt:60)");
                    }
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme2.getSpacing(composer2, i8).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null), ScrollKt.rememberScrollState(0, composer2, 0, 1), false, null, false, 14, null);
                    final ReviewAcatsInViewState reviewAcatsInViewState = viewState;
                    Function0<Unit> function0 = onAssetsToTransferClick;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null);
                    StringResource title = reviewAcatsInViewState.getTitle();
                    int i9 = StringResource.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(title, composer2, i9), modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer2, i8).getDisplayCapsuleMedium(), composer2, 0, 0, 8124);
                    Modifier modifierM21620defaultFillMaxWidthPaddingVpY3zN4 = PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion2, bentoTheme2.getSpacing(composer2, i8).m21591getLargeD9Ej5fM(), bentoTheme2.getSpacing(composer2, i8).m21593getSmallD9Ej5fM());
                    String strStringResource = StringResources_androidKt.stringResource(C7686R.string.acats_in_review_external_account_header, composer2, 0);
                    FontWeight.Companion companion4 = FontWeight.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM21620defaultFillMaxWidthPaddingVpY3zN4, null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16364);
                    BentoBaseRowLayout.BentoBaseRowLayout(TestTag3.testTag(companion2, ReviewAcatsInComposable3.BROKERAGE_ROW_TEST_TAG), null, null, ReviewAcatsInComposable.INSTANCE.getLambda$1435422176$lib_acats_ui_externalDebug(), null, ComposableLambda3.rememberComposableLambda(472202270, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt$ReviewAcatsInComposable$2$1$1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i10) {
                            if ((i10 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(472202270, i10, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous>.<anonymous>.<anonymous> (ReviewAcatsInComposable.kt:91)");
                            }
                            Arrangement arrangement = Arrangement.INSTANCE;
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i11 = BentoTheme.$stable;
                            float fM21593getSmallD9Ej5fM = bentoTheme3.getSpacing(composer4, i11).m21593getSmallD9Ej5fM();
                            Alignment.Companion companion5 = Alignment.INSTANCE;
                            Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = arrangement.m5090spacedByD5KLDUw(fM21593getSmallD9Ej5fM, companion5.getEnd());
                            Alignment.Vertical centerVertically = companion5.getCenterVertically();
                            ReviewAcatsInViewState reviewAcatsInViewState2 = reviewAcatsInViewState;
                            Modifier.Companion companion6 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw, centerVertically, composer4, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, companion6);
                            ComposeUiNode.Companion companion7 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion7.getConstructor();
                            if (composer4.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer4.startReusableNode();
                            if (composer4.getInserting()) {
                                composer4.createNode(constructor2);
                            } else {
                                composer4.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion7.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion7.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion7.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion7.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            if (reviewAcatsInViewState2.getContraBrokerageLogoUrl() != null) {
                                composer4.startReplaceGroup(-731598744);
                                Modifier modifierClip = Clip.clip(SizeKt.m5156height3ABfNKs(companion6, C2002Dp.m7995constructorimpl(24)), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(4)));
                                BentoImage.BentoImage(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(HttpUrl.INSTANCE.get(reviewAcatsInViewState2.getContraBrokerageLogoUrl()), null, null, null, 0, null, composer4, 0, 62), reviewAcatsInViewState2.getContraBrokerageName() + " image logo", modifierClip, null, ContentScale.INSTANCE.getFit(), 0.0f, null, composer4, 24576, 104);
                                composer4.endReplaceGroup();
                            } else {
                                composer4.startReplaceGroup(-730936770);
                                BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(ServerToBentoAssetMapper2.BANKING_24), "banking icon", bentoTheme3.getColors(composer4, i11).m21425getFg0d7_KjU(), null, null, false, composer4, BentoIcon4.Size24.$stable | 48, 56);
                                composer4.endReplaceGroup();
                            }
                            BentoText2.m20747BentoText38GnDrw(reviewAcatsInViewState2.getContraBrokerageName(), null, null, null, null, null, null, 0, false, 1, 0, null, 0, null, composer4, 805306368, 0, 15870);
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, false, false, false, null, composer2, 199686, 0, 2006);
                    BentoDataRowState bentoDataRowState = new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C7686R.string.acats_in_review_account_number_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(reviewAcatsInViewState.getContraAccountNumber(), null, 2, null), null, null, null, null, false, false, 4061, null);
                    int i10 = BentoDataRowState.$stable;
                    BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState, null, null, null, null, composer2, i10, 30);
                    int i11 = i8;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), bentoTheme2.getColors(composer2, i11).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                    StringResource assetsValue = reviewAcatsInViewState.getAssetsValue();
                    composer2.startReplaceGroup(48977696);
                    if (assetsValue == null) {
                        companion = companion2;
                        bentoTheme = bentoTheme2;
                        composer3 = composer2;
                        i7 = i10;
                        i6 = i9;
                        z = true;
                    } else {
                        bentoTheme = bentoTheme2;
                        z = true;
                        companion = companion2;
                        Modifier modifierTestTag = TestTag3.testTag(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, function0, 7, null), ReviewAcatsInComposable3.ASSETS_ROW_TEST_TAG);
                        composer2.startReplaceGroup(48987363);
                        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                        composer2.startReplaceGroup(48989038);
                        int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer2, i11).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                        try {
                            builder.append(StringResources_androidKt.stringResource(C7686R.string.assets_label, composer2, 0));
                            Unit unit = Unit.INSTANCE;
                            builder.pop(iPushStyle);
                            composer2.endReplaceGroup();
                            AnnotatedString annotatedString = builder.toAnnotatedString();
                            composer2.endReplaceGroup();
                            BentoDataRowState bentoDataRowState2 = new BentoDataRowState(null, annotatedString, null, null, null, new AnnotatedString(StringResources6.getTextAsString(assetsValue, composer2, i9), null, 2, null), null, null, BentoIcon4.INSTANCE.toBentoIcon(ServerToBentoAssetMapper2.CARET_RIGHT_16), Color.m6701boximpl(bentoTheme.getColors(composer2, i11).m21427getFg30d7_KjU()), false, false, 3293, null);
                            i6 = i9;
                            i11 = i11;
                            BentoDataRowKt.BentoCondensedDataRow(bentoDataRowState2, modifierTestTag, null, null, null, composer2, i10, 28);
                            i7 = i10;
                            BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer2, i11).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                            composer3 = composer2;
                        } catch (Throwable th) {
                            builder.pop(iPushStyle);
                            throw th;
                        }
                    }
                    composer3.endReplaceGroup();
                    int i12 = i6;
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C7686R.string.acats_in_review_robinhood_account_header, composer3, 0), PaddingKt.m21620defaultFillMaxWidthPaddingVpY3zN4(companion, bentoTheme.getSpacing(composer3, i11).m21591getLargeD9Ej5fM(), bentoTheme.getSpacing(composer3, i11).m21593getSmallD9Ej5fM()), null, null, companion4.getBold(), null, null, 0, false, 0, 0, null, 0, null, composer2, 24576, 0, 16364);
                    BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C7686R.string.acats_in_review_account_name_label, composer2, 0), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getTextAsString(reviewAcatsInViewState.getRhAccountName(), composer2, i12), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, null, null, composer2, i7, 30);
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null), bentoTheme.getColors(composer2, i11).m21373getBg30d7_KjU(), 0.0f, composer2, 0, 4);
                    BentoBaseRowLayout.BentoBaseRowLayout(null, null, null, ComposableLambda3.rememberComposableLambda(-1821487991, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt$ReviewAcatsInComposable$2$1$3
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer4, int i13) {
                            if ((i13 & 3) == 2 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1821487991, i13, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous>.<anonymous>.<anonymous> (ReviewAcatsInComposable.kt:183)");
                            }
                            BentoText2.m20747BentoText38GnDrw(StringResources6.getTextAsString(reviewAcatsInViewState.getRhAccountOwnerLabel(), composer4, StringResource.$stable), null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, null, composer4, 0, 0, 16378);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), null, ComposableLambda3.rememberComposableLambda(237118279, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.acatsin.review.ReviewAcatsInComposableKt$ReviewAcatsInComposable$2$1$4
                        public final void invoke(Composer composer4, int i13) {
                            Composer composer5 = composer4;
                            if ((i13 & 3) == 2 && composer5.getSkipping()) {
                                composer5.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(237118279, i13, -1, "com.robinhood.android.acatsin.review.ReviewAcatsInComposable.<anonymous>.<anonymous>.<anonymous> (ReviewAcatsInComposable.kt:189)");
                            }
                            Alignment.Horizontal end = Alignment.INSTANCE.getEnd();
                            ReviewAcatsInViewState reviewAcatsInViewState2 = reviewAcatsInViewState;
                            Modifier.Companion companion5 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), end, composer5, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, companion5);
                            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion6.getConstructor();
                            if (composer5.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer5.startReusableNode();
                            if (composer5.getInserting()) {
                                composer5.createNode(constructor2);
                            } else {
                                composer5.useNode();
                            }
                            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion6.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion6.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion6.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion6.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            composer5.startReplaceGroup(1924769215);
                            Iterator<String> it = reviewAcatsInViewState2.getRhAccountOwnerNames().iterator();
                            while (it.hasNext()) {
                                BentoText2.m20747BentoText38GnDrw(it.next(), null, null, null, null, null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7920getEnde0LSkKk()), 0, false, 0, 0, null, 0, null, composer5, 0, 0, 16318);
                                composer5 = composer4;
                            }
                            composer4.endReplaceGroup();
                            composer4.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                            invoke(composer4, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), null, false, false, false, null, composer2, 199680, 0, 2007);
                    composer2.startReplaceGroup(49066664);
                    if (reviewAcatsInViewState.getMatchLabel() != null && reviewAcatsInViewState.getMatchValue() != null) {
                        BentoDataRowKt.BentoCondensedDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources6.getTextAsString(reviewAcatsInViewState.getMatchLabel(), composer2, i12), null, 2, null), null, null, null, new AnnotatedString(StringResources6.getTextAsString(reviewAcatsInViewState.getMatchValue(), composer2, i12), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, null, null, composer2, i7, 30);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 3456, 2);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
