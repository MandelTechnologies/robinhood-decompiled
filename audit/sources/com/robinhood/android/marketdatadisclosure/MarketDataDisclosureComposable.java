package com.robinhood.android.marketdatadisclosure;

import android.content.Context;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarketDataDisclosureComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"MarketDataDisclosureComposable", "", "state", "Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureViewState;", "onDismissClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/marketdatadisclosure/MarketDataDisclosureViewState;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-market-data-disclosure_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarketDataDisclosureComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MarketDataDisclosureComposable$lambda$10(MarketDataDisclosureViewState marketDataDisclosureViewState, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MarketDataDisclosureComposable(marketDataDisclosureViewState, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0607  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x043a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0494  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x05fc  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MarketDataDisclosureComposable(final MarketDataDisclosureViewState state, final Function0<Unit> onDismissClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i4;
        BentoTheme bentoTheme;
        int i5;
        FontWeight.Companion companion;
        Modifier modifier3;
        int i6;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        Modifier.Companion companion2;
        int i7;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onDismissClick, "onDismissClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1930875027);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissClick) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1930875027, i3, -1, "com.robinhood.android.marketdatadisclosure.MarketDataDisclosureComposable (MarketDataDisclosureComposable.kt:38)");
                }
                Alignment.Companion companion3 = Alignment.INSTANCE;
                Alignment.Horizontal centerHorizontally = companion3.getCenterHorizontally();
                Arrangement arrangement = Arrangement.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                StringResource dialogTitle = state.getDialogTitle();
                i4 = StringResource.$stable;
                String string2 = StringResource2.getString(dialogTitle, composerStartRestartGroup, i4);
                bentoTheme = BentoTheme.INSTANCE;
                i5 = BentoTheme.$stable;
                TextStyle textM = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                companion = FontWeight.INSTANCE;
                modifier3 = modifier5;
                i6 = i3;
                BentoText2.m20747BentoText38GnDrw(string2, null, null, null, companion.getBold(), null, null, 0, false, 0, 0, null, 0, textM, composerStartRestartGroup, 24576, 0, 8174);
                Modifier.Companion companion5 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(companion5, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                String string3 = StringResource2.getString(state.getHeaderText(), composerStartRestartGroup, i4);
                TextAlign.Companion companion6 = TextAlign.INSTANCE;
                BentoText2.m20747BentoText38GnDrw(string3, SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 48, 0, 16312);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1213234029);
                AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                composerStartRestartGroup.startReplaceGroup(1213235344);
                int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                try {
                    builder.append(new AnnotatedString(StringResource2.getString(state.getLastPriceLabelText(), composerStartRestartGroup, i4), null, 2, null));
                    Unit unit = Unit.INSTANCE;
                    builder.pop(iPushStyle);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowState.Meta.SingleLine singleLine = new BentoBaseRowState.Meta.SingleLine(StringResource2.getString(state.getLastPriceValueText(), composerStartRestartGroup, i4));
                    int i9 = BentoBaseRowState.Meta.SingleLine.$stable;
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString, null, null, singleLine, null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i9 << 15) | 805306368, 0, 15835);
                    composerStartRestartGroup.startReplaceGroup(1213255121);
                    builder = new AnnotatedString.Builder(0, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1213256436);
                    iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    try {
                        builder.append(new AnnotatedString(StringResource2.getString(state.getMarketDataBidLabelText(), composerStartRestartGroup, i4), null, 2, null));
                        builder.pop(iPushStyle);
                        composerStartRestartGroup.endReplaceGroup();
                        AnnotatedString annotatedString2 = builder.toAnnotatedString();
                        composerStartRestartGroup.endReplaceGroup();
                        BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString2, null, null, new BentoBaseRowState.Meta.SingleLine(StringResource2.getString(state.getMarketDataBidValueText(), composerStartRestartGroup, i4)), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i9 << 15) | 805306368, 0, 15835);
                        composerStartRestartGroup.startReplaceGroup(1213276241);
                        builder = new AnnotatedString.Builder(0, 1, null);
                        composerStartRestartGroup.startReplaceGroup(1213277556);
                        iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                        try {
                            builder.append(new AnnotatedString(StringResource2.getString(state.getMarketDataAskLabelText(), composerStartRestartGroup, i4), null, 2, null));
                            builder.pop(iPushStyle);
                            composerStartRestartGroup.endReplaceGroup();
                            AnnotatedString annotatedString3 = builder.toAnnotatedString();
                            composerStartRestartGroup.endReplaceGroup();
                            BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString3, null, null, new BentoBaseRowState.Meta.SingleLine(StringResource2.getString(state.getMarketDataAskValueText(), composerStartRestartGroup, i4)), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i9 << 15) | 805306368, 0, 15835);
                            Composer composer2 = composerStartRestartGroup;
                            if (state.getMarketDataFooterMarkdown() == null) {
                                composer2.startReplaceGroup(-1042457804);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                                BentoMarkdownText2.BentoMarkdownText(state.getMarketDataFooterMarkdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, i5).getTextS(), companion6.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU(), bentoTheme.getColors(composer2, i5).m21368getAccent0d7_KjU(), false, composer2, BentoMarkdownText.$stable << 15, 16), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                                composer2.endReplaceGroup();
                                companion2 = companion5;
                            } else if (state.getMarketDataFooterText() != null) {
                                composer2.startReplaceGroup(-1041797070);
                                String string4 = StringResource2.getString(state.getMarketDataFooterText(), composer2, i4);
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion5, bentoTheme.getSpacing(composer2, i5).m21590getDefaultD9Ej5fM()), composer2, 0);
                                final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                StringResource marketDataFooterLinkText = state.getMarketDataFooterLinkText();
                                composer2.startReplaceGroup(1213327154);
                                String string5 = marketDataFooterLinkText == null ? null : StringResource2.getString(marketDataFooterLinkText, composer2, i4);
                                composer2.endReplaceGroup();
                                if (string5 != null) {
                                    composer2.startReplaceGroup(-1041489364);
                                    long jM21426getFg20d7_KjU = bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU();
                                    long jM21368getAccent0d7_KjU = bentoTheme.getColors(composer2, i5).m21368getAccent0d7_KjU();
                                    TextStyle textS = bentoTheme.getTypography(composer2, i5).getTextS();
                                    int iM7919getCentere0LSkKk = companion6.m7919getCentere0LSkKk();
                                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion5, 0.0f, 1, null);
                                    composer2.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer2.changedInstance(context);
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureComposableKt$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return MarketDataDisclosureComposable.m2164xff4ad21e(context);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    companion2 = companion5;
                                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(string4, string5, (Function0) objRememberedValue, modifierFillMaxWidth$default, jM21426getFg20d7_KjU, jM21368getAccent0d7_KjU, textS, iM7919getCentere0LSkKk, composer2, 3072, 0);
                                    composer2 = composer2;
                                    composer2.endReplaceGroup();
                                } else {
                                    companion2 = companion5;
                                    composer2.startReplaceGroup(-1040811642);
                                    BentoText2.m20747BentoText38GnDrw(string4, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion6.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i5).getTextS(), composer2, 48, 0, 8120);
                                    composer2 = composer2;
                                    composer2.endReplaceGroup();
                                }
                                composer2.endReplaceGroup();
                            } else {
                                companion2 = companion5;
                                composer2.startReplaceGroup(-1040394630);
                                composer2.endReplaceGroup();
                                i7 = 1;
                                CrashReporter.INSTANCE.reportNonFatal(new IllegalStateException("MarketDataDisclosureComposable: No footer text or markdown provided."), true, new EventMetadata(SentryTeam.EQUITIES, null, null, 6, null));
                                composer2.endNode();
                                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                                Composer composer3 = composer2;
                                BentoButtonKt.m20586BentoButtonEikTQX8(onDismissClick, StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer2, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, i7, null), null, null, false, false, null, null, null, null, false, null, composer3, ((i6 >> 3) & 14) | 384, 0, 8184);
                                composerStartRestartGroup = composer3;
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier4 = modifier3;
                            }
                            i7 = 1;
                            composer2.endNode();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i5).m21592getMediumD9Ej5fM()), composer2, 0);
                            Composer composer32 = composer2;
                            BentoButtonKt.m20586BentoButtonEikTQX8(onDismissClick, StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer2, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, i7, null), null, null, false, false, null, null, null, null, false, null, composer32, ((i6 >> 3) & 14) | 384, 0, 8184);
                            composerStartRestartGroup = composer32;
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier4 = modifier3;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.marketdatadisclosure.MarketDataDisclosureComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MarketDataDisclosureComposable.MarketDataDisclosureComposable$lambda$10(state, onDismissClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i8 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Alignment.Companion companion32 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally2 = companion32.getCenterHorizontally();
            Arrangement arrangement2 = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(arrangement2.getTop(), centerHorizontally2, composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion42.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion42.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                StringResource dialogTitle2 = state.getDialogTitle();
                i4 = StringResource.$stable;
                String string22 = StringResource2.getString(dialogTitle2, composerStartRestartGroup, i4);
                bentoTheme = BentoTheme.INSTANCE;
                i5 = BentoTheme.$stable;
                TextStyle textM2 = bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM();
                companion = FontWeight.INSTANCE;
                modifier3 = modifier5;
                i6 = i3;
                BentoText2.m20747BentoText38GnDrw(string22, null, null, null, companion.getBold(), null, null, 0, false, 0, 0, null, 0, textM2, composerStartRestartGroup, 24576, 0, 8174);
                Modifier.Companion companion52 = Modifier.INSTANCE;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion52, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(companion52, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
                Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                    String string32 = StringResource2.getString(state.getHeaderText(), composerStartRestartGroup, i4);
                    TextAlign.Companion companion62 = TextAlign.INSTANCE;
                    BentoText2.m20747BentoText38GnDrw(string32, SizeKt.fillMaxWidth$default(companion52, 0.0f, 1, null), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion62.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 48, 0, 16312);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion52, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1213234029);
                    AnnotatedString.Builder builder2 = new AnnotatedString.Builder(0, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1213235344);
                    int iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    builder2.append(new AnnotatedString(StringResource2.getString(state.getLastPriceLabelText(), composerStartRestartGroup, i4), null, 2, null));
                    Unit unit2 = Unit.INSTANCE;
                    builder2.pop(iPushStyle2);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString4 = builder2.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowState.Meta.SingleLine singleLine2 = new BentoBaseRowState.Meta.SingleLine(StringResource2.getString(state.getLastPriceValueText(), composerStartRestartGroup, i4));
                    int i92 = BentoBaseRowState.Meta.SingleLine.$stable;
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString4, null, null, singleLine2, null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i92 << 15) | 805306368, 0, 15835);
                    composerStartRestartGroup.startReplaceGroup(1213255121);
                    builder2 = new AnnotatedString.Builder(0, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1213256436);
                    iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    builder2.append(new AnnotatedString(StringResource2.getString(state.getMarketDataBidLabelText(), composerStartRestartGroup, i4), null, 2, null));
                    builder2.pop(iPushStyle2);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString22 = builder2.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString22, null, null, new BentoBaseRowState.Meta.SingleLine(StringResource2.getString(state.getMarketDataBidValueText(), composerStartRestartGroup, i4)), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i92 << 15) | 805306368, 0, 15835);
                    composerStartRestartGroup.startReplaceGroup(1213276241);
                    builder2 = new AnnotatedString.Builder(0, 1, null);
                    composerStartRestartGroup.startReplaceGroup(1213277556);
                    iPushStyle2 = builder2.pushStyle(new SpanStyle(bentoTheme.getColors(composerStartRestartGroup, i5).m21426getFg20d7_KjU(), 0L, companion.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65530, (DefaultConstructorMarker) null));
                    builder2.append(new AnnotatedString(StringResource2.getString(state.getMarketDataAskLabelText(), composerStartRestartGroup, i4), null, 2, null));
                    builder2.pop(iPushStyle2);
                    composerStartRestartGroup.endReplaceGroup();
                    AnnotatedString annotatedString32 = builder2.toAnnotatedString();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(null, null, annotatedString32, null, null, new BentoBaseRowState.Meta.SingleLine(StringResource2.getString(state.getMarketDataAskValueText(), composerStartRestartGroup, i4)), null, false, false, true, false, false, 0L, null, composerStartRestartGroup, (i92 << 15) | 805306368, 0, 15835);
                    Composer composer22 = composerStartRestartGroup;
                    if (state.getMarketDataFooterMarkdown() == null) {
                    }
                    i7 = 1;
                    composer22.endNode();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer22, i5).m21592getMediumD9Ej5fM()), composer22, 0);
                    Composer composer322 = composer22;
                    BentoButtonKt.m20586BentoButtonEikTQX8(onDismissClick, StringResources_androidKt.stringResource(C11048R.string.general_label_dismiss, composer22, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, i7, null), null, null, false, false, null, null, null, null, false, null, composer322, ((i6 >> 3) & 14) | 384, 0, 8184);
                    composerStartRestartGroup = composer322;
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
    /* renamed from: MarketDataDisclosureComposable$lambda$9$lambda$8$lambda$7$lambda$6 */
    public static final Unit m2164xff4ad21e(Context context) {
        WebUtils.viewUrl$default(context, MarketDataDisclosureViewState.FOOTER_URL, 0, 4, (Object) null);
        return Unit.INSTANCE;
    }
}
