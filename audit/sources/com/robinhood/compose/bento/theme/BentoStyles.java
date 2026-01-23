package com.robinhood.compose.bento.theme;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositManualSetupComposable;
import com.robinhood.compose.bento.component.BentoAppBarDefaults;
import com.robinhood.compose.bento.component.BentoButtonBar;
import com.robinhood.compose.bento.component.BentoButtonDefaults;
import com.robinhood.compose.bento.component.BentoCheckbox;
import com.robinhood.compose.bento.component.BentoIconButton;
import com.robinhood.compose.bento.component.BentoInfoBanner;
import com.robinhood.compose.bento.component.BentoPogDefaults;
import com.robinhood.compose.bento.component.BentoProgressBar;
import com.robinhood.compose.bento.component.BentoProgressIndicator;
import com.robinhood.compose.bento.component.BentoRadioButton;
import com.robinhood.compose.bento.component.BentoTabBar;
import com.robinhood.compose.bento.component.BentoText;
import com.robinhood.compose.bento.component.BentoTextButton;
import com.robinhood.compose.bento.component.BentoTextInput3;
import com.robinhood.compose.bento.component.cards.BentoCommunicationCard7;
import com.robinhood.compose.bento.component.numpad.BentoNumpad2;
import com.robinhood.compose.bento.component.rows.BentoRowDefaults;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow;
import com.robinhood.compose.bento.component.rows.BentoToggleRow2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText;
import com.robinhood.compose.bento.util.BentoPlaceholderDefaults;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.style.AppBarStyle;
import com.robinhood.compose.theme.style.BentoSelectionRowStyle;
import com.robinhood.compose.theme.style.ButtonBarStyle;
import com.robinhood.compose.theme.style.ButtonStyle;
import com.robinhood.compose.theme.style.CardStackStyle;
import com.robinhood.compose.theme.style.ChartStyle;
import com.robinhood.compose.theme.style.CheckboxStyle;
import com.robinhood.compose.theme.style.CircularProgressIndicatorStyle;
import com.robinhood.compose.theme.style.CommunicationCardStyle;
import com.robinhood.compose.theme.style.ExpandableButtonTrayStyle;
import com.robinhood.compose.theme.style.IconButtonStyle;
import com.robinhood.compose.theme.style.InfoBannerStyle;
import com.robinhood.compose.theme.style.LoadingPlaceholderStyle;
import com.robinhood.compose.theme.style.MarkdownSpannedTextStyle;
import com.robinhood.compose.theme.style.NavigationBarStyle;
import com.robinhood.compose.theme.style.NumpadStyle;
import com.robinhood.compose.theme.style.PlaceholderStyle;
import com.robinhood.compose.theme.style.PogStyle;
import com.robinhood.compose.theme.style.ProgressBarStyle;
import com.robinhood.compose.theme.style.RadioButtonStyle;
import com.robinhood.compose.theme.style.RowStyle;
import com.robinhood.compose.theme.style.SpanButtonStyle;
import com.robinhood.compose.theme.style.TextButtonStyle;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.compose.theme.style.TextStyle;
import com.robinhood.compose.theme.style.ToggleRowStyle;
import kotlin.Metadata;
import kotlin.jvm.JvmName;

/* compiled from: BentoStyles.kt */
@Metadata(m3635d1 = {"\u0000Ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0004\u001a\u00020\u00058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020-8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/R\u0014\u00100\u001a\u0002018WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103R\u0014\u00104\u001a\u0002058WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u0014\u00108\u001a\u0002098WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020=8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020A8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bB\u0010CR\u0014\u0010D\u001a\u00020E8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020I8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010KR\u0014\u0010L\u001a\u00020M8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bN\u0010OR\u0014\u0010P\u001a\u00020Q8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bR\u0010SR\u0014\u0010T\u001a\u00020U8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bV\u0010WR\u0014\u0010X\u001a\u00020Y8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[R\u0014\u0010\\\u001a\u00020]8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b^\u0010_R\u0014\u0010`\u001a\u00020a8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bb\u0010cR\u0014\u0010d\u001a\u00020e8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bf\u0010gR\u0014\u0010h\u001a\u00020i8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\bj\u0010k¨\u0006l"}, m3636d2 = {"Lcom/robinhood/compose/bento/theme/BentoStyles;", "Lcom/robinhood/compose/theme/Styles;", "<init>", "()V", "appBar", "Lcom/robinhood/compose/theme/style/AppBarStyle;", "getAppBar", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/AppBarStyle;", "button", "Lcom/robinhood/compose/theme/style/ButtonStyle;", "getButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ButtonStyle;", DirectDepositManualSetupComposable.BUTTON_BAR_TAG, "Lcom/robinhood/compose/theme/style/ButtonBarStyle;", "getButtonBar", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ButtonBarStyle;", "chart", "Lcom/robinhood/compose/theme/style/ChartStyle;", "getChart", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ChartStyle;", "checkBox", "Lcom/robinhood/compose/theme/style/CheckboxStyle;", "getCheckBox", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CheckboxStyle;", "circularProgressIndicator", "Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "getCircularProgressIndicator", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "communicationCard", "Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "getCommunicationCard", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "expandableButtonTray", "Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "getExpandableButtonTray", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "iconButton", "Lcom/robinhood/compose/theme/style/IconButtonStyle;", "getIconButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/IconButtonStyle;", "infoBanner", "Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "getInfoBanner", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "markdownSpannedText", "Lcom/robinhood/compose/theme/style/MarkdownSpannedTextStyle;", "getMarkdownSpannedText", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/MarkdownSpannedTextStyle;", "numpad", "Lcom/robinhood/compose/theme/style/NumpadStyle;", "getNumpad", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NumpadStyle;", "placeholder", "Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "getPlaceholder", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "pog", "Lcom/robinhood/compose/theme/style/PogStyle;", "getPog", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PogStyle;", "radioButton", "Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "getRadioButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "row", "Lcom/robinhood/compose/theme/style/RowStyle;", "getRow", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RowStyle;", "spanButton", "Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "getSpanButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "text", "Lcom/robinhood/compose/theme/style/TextStyle;", "getText", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextStyle;", "textButton", "Lcom/robinhood/compose/theme/style/TextButtonStyle;", "getTextButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextButtonStyle;", "textInput", "Lcom/robinhood/compose/theme/style/TextInputStyle;", "getTextInput", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle;", "toggleRow", "Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "getToggleRow", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "progressBarStyle", "Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "getProgressBarStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "navigationBarStyle", "Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "getNavigationBarStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "cardStackStyle", "Lcom/robinhood/compose/theme/style/CardStackStyle;", "getCardStackStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CardStackStyle;", "selectionRowStyle", "Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle;", "getSelectionRowStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle;", "loadingPlaceholderStyle", "Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "getLoadingPlaceholderStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "lib-compose-bento_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final class BentoStyles implements Styles {
    public static final int $stable = 0;
    public static final BentoStyles INSTANCE = new BentoStyles();

    private BentoStyles() {
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public AppBarStyle getAppBar(Composer composer, int i) {
        composer.startReplaceGroup(1334813922);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1334813922, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-appBar> (BentoStyles.kt:59)");
        }
        AppBarStyle style = BentoAppBarDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ButtonStyle getButton(Composer composer, int i) {
        composer.startReplaceGroup(-1928683038);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1928683038, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-button> (BentoStyles.kt:63)");
        }
        ButtonStyle style = BentoButtonDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ButtonBarStyle getButtonBar(Composer composer, int i) {
        composer.startReplaceGroup(1932284931);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1932284931, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-buttonBar> (BentoStyles.kt:67)");
        }
        ButtonBarStyle style = BentoButtonBar.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ChartStyle getChart(Composer composer, int i) {
        composer.startReplaceGroup(1768885094);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1768885094, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-chart> (BentoStyles.kt:71)");
        }
        ChartStyle style = BentoChartDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CheckboxStyle getCheckBox(Composer composer, int i) {
        composer.startReplaceGroup(743481171);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(743481171, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-checkBox> (BentoStyles.kt:75)");
        }
        CheckboxStyle style = BentoCheckbox.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer, int i) {
        composer.startReplaceGroup(1126467969);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1126467969, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-circularProgressIndicator> (BentoStyles.kt:79)");
        }
        CircularProgressIndicatorStyle style = BentoProgressIndicator.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CommunicationCardStyle getCommunicationCard(Composer composer, int i) {
        composer.startReplaceGroup(-708806850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-708806850, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-communicationCard> (BentoStyles.kt:83)");
        }
        CommunicationCardStyle style = BentoCommunicationCard7.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer, int i) {
        composer.startReplaceGroup(-289935092);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-289935092, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-expandableButtonTray> (BentoStyles.kt:87)");
        }
        ExpandableButtonTrayStyle style = BentoExpandableButtonTrayDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public IconButtonStyle getIconButton(Composer composer, int i) {
        composer.startReplaceGroup(564208859);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(564208859, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-iconButton> (BentoStyles.kt:91)");
        }
        IconButtonStyle style = BentoIconButton.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public InfoBannerStyle getInfoBanner(Composer composer, int i) {
        composer.startReplaceGroup(-1458372822);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1458372822, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-infoBanner> (BentoStyles.kt:95)");
        }
        InfoBannerStyle style = BentoInfoBanner.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer, int i) {
        composer.startReplaceGroup(-1652267933);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1652267933, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-markdownSpannedText> (BentoStyles.kt:99)");
        }
        MarkdownSpannedTextStyle style = BentoMarkdownSpannedText.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public NumpadStyle getNumpad(Composer composer, int i) {
        composer.startReplaceGroup(-218345507);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-218345507, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-numpad> (BentoStyles.kt:103)");
        }
        NumpadStyle style = BentoNumpad2.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public PlaceholderStyle getPlaceholder(Composer composer, int i) {
        composer.startReplaceGroup(-1548524975);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1548524975, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-placeholder> (BentoStyles.kt:107)");
        }
        PlaceholderStyle style = BentoPlaceholderDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public PogStyle getPog(Composer composer, int i) {
        composer.startReplaceGroup(-1130756);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1130756, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-pog> (BentoStyles.kt:111)");
        }
        PogStyle style = BentoPogDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public RadioButtonStyle getRadioButton(Composer composer, int i) {
        composer.startReplaceGroup(939734967);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(939734967, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-radioButton> (BentoStyles.kt:115)");
        }
        RadioButtonStyle style = BentoRadioButton.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public RowStyle getRow(Composer composer, int i) {
        composer.startReplaceGroup(-239631254);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-239631254, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-row> (BentoStyles.kt:119)");
        }
        RowStyle style = BentoRowDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public SpanButtonStyle getSpanButton(Composer composer, int i) {
        composer.startReplaceGroup(92174604);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(92174604, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-spanButton> (BentoStyles.kt:123)");
        }
        SpanButtonStyle style = BentoSpanButtonDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public TextStyle getText(Composer composer, int i) {
        composer.startReplaceGroup(-1824277507);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1824277507, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-text> (BentoStyles.kt:127)");
        }
        TextStyle style = BentoText.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public TextButtonStyle getTextButton(Composer composer, int i) {
        composer.startReplaceGroup(-616141553);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-616141553, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-textButton> (BentoStyles.kt:131)");
        }
        TextButtonStyle style = BentoTextButton.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public TextInputStyle getTextInput(Composer composer, int i) {
        composer.startReplaceGroup(-819205657);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-819205657, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-textInput> (BentoStyles.kt:135)");
        }
        TextInputStyle style = BentoTextInput3.INSTANCE.getStyle(composer, TextInputStyle.BorderSize.$stable);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ToggleRowStyle getToggleRow(Composer composer, int i) {
        composer.startReplaceGroup(-442201762);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-442201762, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-toggleRow> (BentoStyles.kt:139)");
        }
        ToggleRowStyle style = BentoToggleRow2.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ProgressBarStyle getProgressBarStyle(Composer composer, int i) {
        composer.startReplaceGroup(-339357828);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-339357828, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-progressBarStyle> (BentoStyles.kt:143)");
        }
        ProgressBarStyle style = BentoProgressBar.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public NavigationBarStyle getNavigationBarStyle(Composer composer, int i) {
        composer.startReplaceGroup(1235547267);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1235547267, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-navigationBarStyle> (BentoStyles.kt:147)");
        }
        NavigationBarStyle style = BentoTabBar.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CardStackStyle getCardStackStyle(Composer composer, int i) {
        composer.startReplaceGroup(42059850);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(42059850, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-cardStackStyle> (BentoStyles.kt:151)");
        }
        CardStackStyle style = BentoCardStackDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public BentoSelectionRowStyle getSelectionRowStyle(Composer composer, int i) {
        composer.startReplaceGroup(-657602736);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-657602736, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-selectionRowStyle> (BentoStyles.kt:155)");
        }
        BentoSelectionRowStyle style = BentoSelectionRow.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer, int i) {
        composer.startReplaceGroup(903563677);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(903563677, i, -1, "com.robinhood.compose.bento.theme.BentoStyles.<get-loadingPlaceholderStyle> (BentoStyles.kt:159)");
        }
        LoadingPlaceholderStyle style = BentoLoadingPlaceholderDefaults.INSTANCE.getStyle(composer, 6);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return style;
    }
}
