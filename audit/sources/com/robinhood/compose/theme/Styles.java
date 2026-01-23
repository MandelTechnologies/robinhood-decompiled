package com.robinhood.compose.theme;

import androidx.compose.runtime.Composer;
import com.robinhood.android.directdeposit.p101ui.p102v3.DirectDepositManualSetupComposable;
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

/* compiled from: Styles.kt */
@Metadata(m3635d1 = {"\u0000Ú\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00078gX¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u000b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u000f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u00138gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00178gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\u001b8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001e\u001a\u00020\u001f8gX¦\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010\"\u001a\u00020#8gX¦\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020'8gX¦\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8gX¦\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0014\u0010.\u001a\u00020/8gX¦\u0004¢\u0006\u0006\u001a\u0004\b0\u00101R\u0014\u00102\u001a\u0002038gX¦\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0002078gX¦\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010:\u001a\u00020;8gX¦\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010>\u001a\u00020?8gX¦\u0004¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0014\u0010B\u001a\u00020C8gX¦\u0004¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020G8gX¦\u0004¢\u0006\u0006\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020K8gX¦\u0004¢\u0006\u0006\u001a\u0004\bL\u0010MR\u0014\u0010N\u001a\u00020O8gX¦\u0004¢\u0006\u0006\u001a\u0004\bP\u0010QR\u0014\u0010R\u001a\u00020S8gX¦\u0004¢\u0006\u0006\u001a\u0004\bT\u0010UR\u0014\u0010V\u001a\u00020W8gX¦\u0004¢\u0006\u0006\u001a\u0004\bX\u0010YR\u0014\u0010Z\u001a\u00020[8gX¦\u0004¢\u0006\u0006\u001a\u0004\b\\\u0010]R\u0014\u0010^\u001a\u00020_8gX¦\u0004¢\u0006\u0006\u001a\u0004\b`\u0010aR\u0014\u0010b\u001a\u00020c8gX¦\u0004¢\u0006\u0006\u001a\u0004\bd\u0010eR\u0014\u0010f\u001a\u00020g8gX¦\u0004¢\u0006\u0006\u001a\u0004\bh\u0010i¨\u0006j"}, m3636d2 = {"Lcom/robinhood/compose/theme/Styles;", "", "appBar", "Lcom/robinhood/compose/theme/style/AppBarStyle;", "getAppBar", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/AppBarStyle;", "button", "Lcom/robinhood/compose/theme/style/ButtonStyle;", "getButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ButtonStyle;", DirectDepositManualSetupComposable.BUTTON_BAR_TAG, "Lcom/robinhood/compose/theme/style/ButtonBarStyle;", "getButtonBar", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ButtonBarStyle;", "chart", "Lcom/robinhood/compose/theme/style/ChartStyle;", "getChart", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ChartStyle;", "checkBox", "Lcom/robinhood/compose/theme/style/CheckboxStyle;", "getCheckBox", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CheckboxStyle;", "circularProgressIndicator", "Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "getCircularProgressIndicator", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CircularProgressIndicatorStyle;", "communicationCard", "Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "getCommunicationCard", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CommunicationCardStyle;", "expandableButtonTray", "Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "getExpandableButtonTray", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ExpandableButtonTrayStyle;", "iconButton", "Lcom/robinhood/compose/theme/style/IconButtonStyle;", "getIconButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/IconButtonStyle;", "infoBanner", "Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "getInfoBanner", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/InfoBannerStyle;", "markdownSpannedText", "Lcom/robinhood/compose/theme/style/MarkdownSpannedTextStyle;", "getMarkdownSpannedText", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/MarkdownSpannedTextStyle;", "numpad", "Lcom/robinhood/compose/theme/style/NumpadStyle;", "getNumpad", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NumpadStyle;", "placeholder", "Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "getPlaceholder", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PlaceholderStyle;", "pog", "Lcom/robinhood/compose/theme/style/PogStyle;", "getPog", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/PogStyle;", "radioButton", "Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "getRadioButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RadioButtonStyle;", "row", "Lcom/robinhood/compose/theme/style/RowStyle;", "getRow", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/RowStyle;", "spanButton", "Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "getSpanButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/SpanButtonStyle;", "text", "Lcom/robinhood/compose/theme/style/TextStyle;", "getText", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextStyle;", "textButton", "Lcom/robinhood/compose/theme/style/TextButtonStyle;", "getTextButton", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextButtonStyle;", "textInput", "Lcom/robinhood/compose/theme/style/TextInputStyle;", "getTextInput", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle;", "toggleRow", "Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "getToggleRow", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ToggleRowStyle;", "progressBarStyle", "Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "getProgressBarStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/ProgressBarStyle;", "navigationBarStyle", "Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "getNavigationBarStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/NavigationBarStyle;", "cardStackStyle", "Lcom/robinhood/compose/theme/style/CardStackStyle;", "getCardStackStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/CardStackStyle;", "selectionRowStyle", "Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle;", "getSelectionRowStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/BentoSelectionRowStyle;", "loadingPlaceholderStyle", "Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "getLoadingPlaceholderStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/LoadingPlaceholderStyle;", "lib-compose-theme_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public interface Styles {
    @JvmName
    AppBarStyle getAppBar(Composer composer, int i);

    @JvmName
    ButtonStyle getButton(Composer composer, int i);

    @JvmName
    ButtonBarStyle getButtonBar(Composer composer, int i);

    @JvmName
    CardStackStyle getCardStackStyle(Composer composer, int i);

    @JvmName
    ChartStyle getChart(Composer composer, int i);

    @JvmName
    CheckboxStyle getCheckBox(Composer composer, int i);

    @JvmName
    CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer, int i);

    @JvmName
    CommunicationCardStyle getCommunicationCard(Composer composer, int i);

    @JvmName
    ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer, int i);

    @JvmName
    IconButtonStyle getIconButton(Composer composer, int i);

    @JvmName
    InfoBannerStyle getInfoBanner(Composer composer, int i);

    @JvmName
    LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer, int i);

    @JvmName
    MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer, int i);

    @JvmName
    NavigationBarStyle getNavigationBarStyle(Composer composer, int i);

    @JvmName
    NumpadStyle getNumpad(Composer composer, int i);

    @JvmName
    PlaceholderStyle getPlaceholder(Composer composer, int i);

    @JvmName
    PogStyle getPog(Composer composer, int i);

    @JvmName
    ProgressBarStyle getProgressBarStyle(Composer composer, int i);

    @JvmName
    RadioButtonStyle getRadioButton(Composer composer, int i);

    @JvmName
    RowStyle getRow(Composer composer, int i);

    @JvmName
    BentoSelectionRowStyle getSelectionRowStyle(Composer composer, int i);

    @JvmName
    SpanButtonStyle getSpanButton(Composer composer, int i);

    @JvmName
    TextStyle getText(Composer composer, int i);

    @JvmName
    TextButtonStyle getTextButton(Composer composer, int i);

    @JvmName
    TextInputStyle getTextInput(Composer composer, int i);

    @JvmName
    ToggleRowStyle getToggleRow(Composer composer, int i);
}
