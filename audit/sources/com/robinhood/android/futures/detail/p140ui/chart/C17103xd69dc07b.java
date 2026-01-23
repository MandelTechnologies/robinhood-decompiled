package com.robinhood.android.futures.detail.p140ui.chart;

import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositManualSetupComposable;
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

/* compiled from: FuturesDetailChartSection.kt */
@Metadata(m3635d1 = {"\u0000Û\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u0002038WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0002078WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020C8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020G8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020K8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020O8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020S8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020W8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020[8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020_8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020c8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020g8WX\u0096\u0005¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006j"}, m3636d2 = {"com/robinhood/android/futures/detail/ui/chart/FuturesDetailChartSectionKt$DefaultChartHeader$1$boldTextStyles$1", "Lcom/robinhood/compose/theme/Styles;", "text", "Lcom/robinhood/compose/theme/style/TextStyle;", "getText", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextStyle;", "appBar", "Lcom/robinhood/compose/theme/style/AppBarStyle;", "getAppBar", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/AppBarStyle;", "button", "Lcom/robinhood/compose/theme/style/ButtonStyle;", "getButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ButtonStyle;", DirectDepositManualSetupComposable.BUTTON_BAR_TAG, "Lcom/robinhood/compose/theme/style/ButtonBarStyle;", "getButtonBar", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ButtonBarStyle;", "cardStackStyle", "Lcom/robinhood/compose/theme/style/CardStackStyle;", "getCardStackStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CardStackStyle;", "chart", "Lcom/robinhood/compose/theme/style/ChartStyle;", "getChart", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ChartStyle;", "checkBox", "Lcom/robinhood/compose/theme/style/CheckboxStyle;", "getCheckBox", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CheckboxStyle;", "circularProgressIndicator", "Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "getCircularProgressIndicator", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "communicationCard", "Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "getCommunicationCard", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "expandableButtonTray", "Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "getExpandableButtonTray", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "iconButton", "Lcom/robinhood/compose/theme/style/IconButtonStyle;", "getIconButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/IconButtonStyle;", "infoBanner", "Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "getInfoBanner", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "loadingPlaceholderStyle", "Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "getLoadingPlaceholderStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "markdownSpannedText", "Lcom/robinhood/compose/theme/style/MarkdownSpannedTextStyle;", "getMarkdownSpannedText", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/MarkdownSpannedTextStyle;", "navigationBarStyle", "Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "getNavigationBarStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "numpad", "Lcom/robinhood/compose/theme/style/NumpadStyle;", "getNumpad", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NumpadStyle;", "placeholder", "Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "getPlaceholder", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "pog", "Lcom/robinhood/compose/theme/style/PogStyle;", "getPog", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PogStyle;", "progressBarStyle", "Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "getProgressBarStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "radioButton", "Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "getRadioButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "row", "Lcom/robinhood/compose/theme/style/RowStyle;", "getRow", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RowStyle;", "selectionRowStyle", "Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle;", "getSelectionRowStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle;", "spanButton", "Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "getSpanButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "textButton", "Lcom/robinhood/compose/theme/style/TextButtonStyle;", "getTextButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextButtonStyle;", "textInput", "Lcom/robinhood/compose/theme/style/TextInputStyle;", "getTextInput", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle;", "toggleRow", "Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "getToggleRow", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "feature-futures-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.futures.detail.ui.chart.FuturesDetailChartSectionKt$DefaultChartHeader$1$boldTextStyles$1 */
/* loaded from: classes3.dex */
public final class C17103xd69dc07b implements Styles {
    private final /* synthetic */ Styles $$delegate_0;
    final /* synthetic */ Styles $currentStyles;

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public AppBarStyle getAppBar(Composer composer, int i) {
        composer.startReplaceGroup(-374487918);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-374487918, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-appBar> (FuturesDetailChartSection.kt:0)");
        }
        AppBarStyle appBar = this.$$delegate_0.getAppBar(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return appBar;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ButtonStyle getButton(Composer composer, int i) {
        composer.startReplaceGroup(897935250);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(897935250, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-button> (FuturesDetailChartSection.kt:0)");
        }
        ButtonStyle button = this.$$delegate_0.getButton(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return button;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ButtonBarStyle getButtonBar(Composer composer, int i) {
        composer.startReplaceGroup(1121028241);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1121028241, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-buttonBar> (FuturesDetailChartSection.kt:0)");
        }
        ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return buttonBar;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CardStackStyle getCardStackStyle(Composer composer, int i) {
        composer.startReplaceGroup(1810638378);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1810638378, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-cardStackStyle> (FuturesDetailChartSection.kt:0)");
        }
        CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return cardStackStyle;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ChartStyle getChart(Composer composer, int i) {
        composer.startReplaceGroup(379284110);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(379284110, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-chart> (FuturesDetailChartSection.kt:0)");
        }
        ChartStyle chart = this.$$delegate_0.getChart(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return chart;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CheckboxStyle getCheckBox(Composer composer, int i) {
        composer.startReplaceGroup(1956796225);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1956796225, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-checkBox> (FuturesDetailChartSection.kt:0)");
        }
        CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return checkBox;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer, int i) {
        composer.startReplaceGroup(-1161091885);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1161091885, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-circularProgressIndicator> (FuturesDetailChartSection.kt:0)");
        }
        CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return circularProgressIndicator;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public CommunicationCardStyle getCommunicationCard(Composer composer, int i) {
        composer.startReplaceGroup(-1372053066);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1372053066, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-communicationCard> (FuturesDetailChartSection.kt:0)");
        }
        CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return communicationCard;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer, int i) {
        composer.startReplaceGroup(-289557592);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-289557592, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-expandableButtonTray> (FuturesDetailChartSection.kt:0)");
        }
        ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return expandableButtonTray;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public IconButtonStyle getIconButton(Composer composer, int i) {
        composer.startReplaceGroup(-1916634439);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1916634439, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-iconButton> (FuturesDetailChartSection.kt:0)");
        }
        IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return iconButton;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public InfoBannerStyle getInfoBanner(Composer composer, int i) {
        composer.startReplaceGroup(782560074);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(782560074, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-infoBanner> (FuturesDetailChartSection.kt:0)");
        }
        InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return infoBanner;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer, int i) {
        composer.startReplaceGroup(1448315959);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1448315959, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-loadingPlaceholderStyle> (FuturesDetailChartSection.kt:0)");
        }
        LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return loadingPlaceholderStyle;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer, int i) {
        composer.startReplaceGroup(231547953);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(231547953, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-markdownSpannedText> (FuturesDetailChartSection.kt:0)");
        }
        MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return markdownSpannedText;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public NavigationBarStyle getNavigationBarStyle(Composer composer, int i) {
        composer.startReplaceGroup(-1700497391);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1700497391, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-navigationBarStyle> (FuturesDetailChartSection.kt:0)");
        }
        NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return navigationBarStyle;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public NumpadStyle getNumpad(Composer composer, int i) {
        composer.startReplaceGroup(-950465033);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-950465033, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-numpad> (FuturesDetailChartSection.kt:0)");
        }
        NumpadStyle numpad = this.$$delegate_0.getNumpad(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return numpad;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public PlaceholderStyle getPlaceholder(Composer composer, int i) {
        composer.startReplaceGroup(-1984063997);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1984063997, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-placeholder> (FuturesDetailChartSection.kt:0)");
        }
        PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return placeholder;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public PogStyle getPog(Composer composer, int i) {
        composer.startReplaceGroup(-470305864);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-470305864, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-pog> (FuturesDetailChartSection.kt:0)");
        }
        PogStyle pog = this.$$delegate_0.getPog(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return pog;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ProgressBarStyle getProgressBarStyle(Composer composer, int i) {
        composer.startReplaceGroup(-1328925896);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1328925896, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-progressBarStyle> (FuturesDetailChartSection.kt:0)");
        }
        ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return progressBarStyle;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public RadioButtonStyle getRadioButton(Composer composer, int i) {
        composer.startReplaceGroup(1020995421);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1020995421, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-radioButton> (FuturesDetailChartSection.kt:0)");
        }
        RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return radioButton;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public RowStyle getRow(Composer composer, int i) {
        composer.startReplaceGroup(-714617334);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-714617334, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-row> (FuturesDetailChartSection.kt:0)");
        }
        RowStyle row = this.$$delegate_0.getRow(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return row;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public BentoSelectionRowStyle getSelectionRowStyle(Composer composer, int i) {
        composer.startReplaceGroup(1407656420);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1407656420, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-selectionRowStyle> (FuturesDetailChartSection.kt:0)");
        }
        BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return selectionRowStyle;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public SpanButtonStyle getSpanButton(Composer composer, int i) {
        composer.startReplaceGroup(2143300520);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2143300520, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-spanButton> (FuturesDetailChartSection.kt:0)");
        }
        SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return spanButton;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public TextButtonStyle getTextButton(Composer composer, int i) {
        composer.startReplaceGroup(-1191328507);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1191328507, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-textButton> (FuturesDetailChartSection.kt:0)");
        }
        TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textButton;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public TextInputStyle getTextInput(Composer composer, int i) {
        composer.startReplaceGroup(908561197);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(908561197, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-textInput> (FuturesDetailChartSection.kt:0)");
        }
        TextInputStyle textInput = this.$$delegate_0.getTextInput(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textInput;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public ToggleRowStyle getToggleRow(Composer composer, int i) {
        composer.startReplaceGroup(-1684393066);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1684393066, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-toggleRow> (FuturesDetailChartSection.kt:0)");
        }
        ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return toggleRow;
    }

    C17103xd69dc07b(Styles styles) {
        this.$currentStyles = styles;
        this.$$delegate_0 = styles;
    }

    @Override // com.robinhood.compose.theme.Styles
    @JvmName
    public TextStyle getText(Composer composer, int i) {
        composer.startReplaceGroup(-917961257);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-917961257, i, -1, "com.robinhood.android.futures.detail.ui.chart.DefaultChartHeader.<anonymous>.<no name provided>.<get-text> (FuturesDetailChartSection.kt:314)");
        }
        TextStyle textStyleM22028copyDxMtmZc$default = TextStyle.m22028copyDxMtmZc$default(this.$currentStyles.getText(composer, 0), 0L, androidx.compose.p011ui.text.TextStyle.m7655copyp1EtxEg$default(this.$currentStyles.getText(composer, 0).getStyle(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), 1, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return textStyleM22028copyDxMtmZc$default;
    }
}
