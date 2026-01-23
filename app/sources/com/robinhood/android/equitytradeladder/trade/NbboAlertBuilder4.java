package com.robinhood.android.equitytradeladder.trade;

import androidx.compose.foundation.text.InlineTextContent;
import androidx.compose.foundation.text.InlineTextContent2;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.LinkAnnotation;
import androidx.compose.p011ui.text.LinkInteractionListener;
import androidx.compose.p011ui.text.Placeholder;
import androidx.compose.p011ui.text.PlaceholderVerticalAlign;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.TextLinkStyles;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.p011ui.unit.TextUnit2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equitytradeladder.C15889R;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.util.Money;
import com.robinhood.models.util.Money3;
import com.robinhood.nbbo.models.p359db.NbboSummary;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.collections.immutable.ImmutableMap3;
import kotlinx.collections.immutable.extensions2;
import p479j$.time.Instant;

/* compiled from: NbboAlertBuilder.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\u001a%\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a%\u0010\b\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005H\u0001¢\u0006\u0002\u0010\u0007\u001a!\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0011\u001a\r\u0010\u0012\u001a\u00020\u0006H\u0001¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"nbboAlertContent", "Landroidx/compose/ui/text/AnnotatedString;", "nbboSummary", "Lcom/robinhood/nbbo/models/db/NbboSummary;", "onNbboRefreshClick", "Lkotlin/Function0;", "", "(Lcom/robinhood/nbbo/models/db/NbboSummary;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/AnnotatedString;", "nbboFlattenAlertContent", "nbboInlineContent", "Lkotlinx/collections/immutable/ImmutableMap;", "", "Landroidx/compose/foundation/text/InlineTextContent;", "nbboLoading", "", "(ZLandroidx/compose/runtime/Composer;I)Lkotlinx/collections/immutable/ImmutableMap;", "NbboAlertPreview", "(Landroidx/compose/runtime/Composer;I)V", "NbboFlattenAlertPreview", "feature-equity-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equitytradeladder.trade.NbboAlertBuilderKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class NbboAlertBuilder4 {
    private static final NbboSummary nbboSummary;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NbboAlertPreview$lambda$6(int i, Composer composer, int i2) {
        NbboAlertPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit NbboFlattenAlertPreview$lambda$7(int i, Composer composer, int i2) {
        NbboFlattenAlertPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final ImmutableMap<String, InlineTextContent> nbboInlineContent(final boolean z, Composer composer, int i) {
        composer.startReplaceGroup(-518622960);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-518622960, i, -1, "com.robinhood.android.equitytradeladder.trade.nbboInlineContent (NbboAlertBuilder.kt:109)");
        }
        ImmutableMap3 immutableMap3PersistentMapOf = extensions2.persistentMapOf(Tuples4.m3642to("loading_indicator", new InlineTextContent(new Placeholder(TextUnit2.getSp(16), TextUnit2.getSp(16), PlaceholderVerticalAlign.INSTANCE.m7577getCenterJ6kI3mc(), null), ComposableLambda3.rememberComposableLambda(172908663, true, new Function3<String, Composer, Integer, Unit>() { // from class: com.robinhood.android.equitytradeladder.trade.NbboAlertBuilderKt.nbboInlineContent.1
            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(String str, Composer composer2, Integer num) {
                invoke(str, composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(String it, Composer composer2, int i2) {
                Intrinsics.checkNotNullParameter(it, "it");
                if ((i2 & 17) == 16 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(172908663, i2, -1, "com.robinhood.android.equitytradeladder.trade.nbboInlineContent.<anonymous> (NbboAlertBuilder.kt:114)");
                }
                if (z) {
                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, BentoProgressIndicator3.f5153XS, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21425getFg0d7_KjU(), composer2, 48, 1);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }, composer, 54))));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return immutableMap3PersistentMapOf;
    }

    static {
        UUID uuidRandomUUID = UUID.randomUUID();
        Intrinsics.checkNotNullExpressionValue(uuidRandomUUID, "randomUUID(...)");
        Instant instant = Instant.parse("2023-10-01T12:00:00Z");
        Intrinsics.checkNotNullExpressionValue(instant, "parse(...)");
        BigDecimal bigDecimalValueOf = BigDecimal.valueOf(100);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf, "valueOf(...)");
        Money money$default = Money3.toMoney$default(bigDecimalValueOf, null, 1, null);
        BigDecimal bigDecimalValueOf2 = BigDecimal.valueOf(101);
        Intrinsics.checkNotNullExpressionValue(bigDecimalValueOf2, "valueOf(...)");
        nbboSummary = new NbboSummary(uuidRandomUUID, "Bid 126.00 x 350 Q * Ask 126.00 x 158 P \n Last sale 126.00 x 193 X * 9:57AM PT", "", "Refresh", instant, "100.00", "101.00", money$default, Money3.toMoney$default(bigDecimalValueOf2, null, 1, null), new NbboSummary.NbboSummaryMarketDialog("Last Sale: $100.50", "Last Sale Size: 100", "Best Bid: $100.00", "Best Bid Size: 200", "Best Ask: $101.00", "Best Ask Size: 150", "Market Summary", "This is a summary of the market data."));
    }

    public static final void NbboAlertPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1554186494);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1554186494, i, -1, "com.robinhood.android.equitytradeladder.trade.NbboAlertPreview (NbboAlertBuilder.kt:150)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, NbboAlertBuilder.INSTANCE.getLambda$555210426$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.trade.NbboAlertBuilderKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NbboAlertBuilder4.NbboAlertPreview$lambda$6(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void NbboFlattenAlertPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1246800668);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1246800668, i, -1, "com.robinhood.android.equitytradeladder.trade.NbboFlattenAlertPreview (NbboAlertBuilder.kt:168)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, NbboAlertBuilder.INSTANCE.m14095getLambda$1914817436$feature_equity_trade_ladder_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equitytradeladder.trade.NbboAlertBuilderKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return NbboAlertBuilder4.NbboFlattenAlertPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final AnnotatedString nbboAlertContent(NbboSummary nbboSummary2, final Function0<Unit> onNbboRefreshClick, Composer composer, int i) {
        String nbboPricesCopy;
        String nbboRefreshCopy;
        String nbboRefreshActionCopy;
        Intrinsics.checkNotNullParameter(onNbboRefreshClick, "onNbboRefreshClick");
        composer.startReplaceGroup(1358885485);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1358885485, i, -1, "com.robinhood.android.equitytradeladder.trade.nbboAlertContent (NbboAlertBuilder.kt:50)");
        }
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        int iPushStyle = builder.pushStyle(new SpanStyle(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
        if (nbboSummary2 == null) {
            nbboPricesCopy = "";
        } else {
            try {
                nbboPricesCopy = nbboSummary2.getNbboPricesCopy();
                if (nbboPricesCopy == null) {
                    nbboPricesCopy = "";
                }
            } catch (Throwable th) {
                builder.pop(iPushStyle);
                throw th;
            }
        }
        builder.append(nbboPricesCopy);
        builder.append(PlaceholderUtils.XXShortPlaceholderText);
        if (nbboSummary2 == null || (nbboRefreshCopy = nbboSummary2.getNbboRefreshCopy()) == null) {
            nbboRefreshCopy = "";
        }
        builder.append(nbboRefreshCopy);
        builder.append(PlaceholderUtils.XXShortPlaceholderText);
        Unit unit = Unit.INSTANCE;
        builder.pop(iPushStyle);
        TextLinkStyles textLinkStyles = new TextLinkStyles(new SpanStyle(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, TextDecoration.INSTANCE.getUnderline(), (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 61434, (DefaultConstructorMarker) null), null, null, null, 14, null);
        composer.startReplaceGroup(5004770);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(onNbboRefreshClick)) || (i & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new LinkInteractionListener() { // from class: com.robinhood.android.equitytradeladder.trade.NbboAlertBuilderKt$nbboAlertContent$1$2$1
                @Override // androidx.compose.p011ui.text.LinkInteractionListener
                public final void onClick(LinkAnnotation it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    onNbboRefreshClick.invoke();
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        int iPushLink = builder.pushLink(new LinkAnnotation.Clickable("", textLinkStyles, (LinkInteractionListener) objRememberedValue));
        if (nbboSummary2 != null) {
            try {
                nbboRefreshActionCopy = nbboSummary2.getNbboRefreshActionCopy();
            } catch (Throwable th2) {
                builder.pop(iPushLink);
                throw th2;
            }
        } else {
            nbboRefreshActionCopy = null;
        }
        builder.append((CharSequence) nbboRefreshActionCopy);
        builder.pop(iPushLink);
        InlineTextContent2.appendInlineContent$default(builder, "loading_indicator", null, 2, null);
        AnnotatedString annotatedString = builder.toAnnotatedString();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return annotatedString;
    }

    public static final AnnotatedString nbboFlattenAlertContent(NbboSummary nbboSummary2, Function0<Unit> onNbboRefreshClick, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(onNbboRefreshClick, "onNbboRefreshClick");
        composer.startReplaceGroup(1020613191);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1020613191, i, -1, "com.robinhood.android.equitytradeladder.trade.nbboFlattenAlertContent (NbboAlertBuilder.kt:87)");
        }
        composer.startReplaceGroup(1556738158);
        AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
        composer.startReplaceGroup(1556739113);
        int iPushStyle = builder.pushStyle(new SpanStyle(BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21425getFg0d7_KjU(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
        try {
            builder.append(StringResources_androidKt.stringResource(C15889R.string.equities_ladder_flatten_dialog_desc, composer, 0));
            builder.append('\n');
            builder.append('\n');
            Unit unit = Unit.INSTANCE;
            builder.pop(iPushStyle);
            composer.endReplaceGroup();
            AnnotatedString annotatedString = builder.toAnnotatedString();
            composer.endReplaceGroup();
            AnnotatedString annotatedStringPlus = annotatedString.plus(nbboAlertContent(nbboSummary2, onNbboRefreshClick, composer, i & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            composer.endReplaceGroup();
            return annotatedStringPlus;
        } catch (Throwable th) {
            builder.pop(iPushStyle);
            throw th;
        }
    }
}
