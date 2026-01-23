package com.robinhood.compose.bento.component.numpad;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
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
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BentoAccentNumpadOverlay.kt */
@Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a(\u0010\u0005\u001a\u00020\u00022\u0017\u0010\u0004\u001a\u0013\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000¢\u0006\u0002\b\u0003H\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m3636d2 = {"Lkotlin/Function1;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScope;", "", "Lkotlin/ExtensionFunctionType;", "numpad", "BentoAccentNumpadOverlay", "(Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlayKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoAccentNumpadOverlay {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoAccentNumpadOverlay$lambda$0(Function3 function3, int i, Composer composer, int i2) {
        BentoAccentNumpadOverlay(function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void BentoAccentNumpadOverlay(final Function3<? super BentoNumpad4, ? super Composer, ? super Integer, Unit> numpad, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(numpad, "numpad");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1064191549);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(numpad) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1064191549, i2, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay (BentoAccentNumpadOverlay.kt:15)");
            }
            final Styles styles = (Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles());
            CompositionLocal3.CompositionLocalProvider(Styles2.getLocalStyles().provides(new Styles() { // from class: com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlayKt$BentoAccentNumpadOverlay$overrideStyles$1
                private final /* synthetic */ Styles $$delegate_0;

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public AppBarStyle getAppBar(Composer composer2, int i3) {
                    composer2.startReplaceGroup(396831615);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(396831615, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-appBar> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    AppBarStyle appBar = this.$$delegate_0.getAppBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return appBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonStyle getButton(Composer composer2, int i3) {
                    composer2.startReplaceGroup(255404159);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(255404159, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-button> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    ButtonStyle button = this.$$delegate_0.getButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return button;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ButtonBarStyle getButtonBar(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1137910368);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1137910368, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-buttonBar> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    ButtonBarStyle buttonBar = this.$$delegate_0.getButtonBar(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return buttonBar;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CardStackStyle getCardStackStyle(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-620984601);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-620984601, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-cardStackStyle> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    CardStackStyle cardStackStyle = this.$$delegate_0.getCardStackStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return cardStackStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ChartStyle getChart(Composer composer2, int i3) {
                    composer2.startReplaceGroup(191405571);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(191405571, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-chart> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    ChartStyle chart = this.$$delegate_0.getChart(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return chart;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CheckboxStyle getCheckBox(Composer composer2, int i3) {
                    composer2.startReplaceGroup(947198192);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(947198192, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-checkBox> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    CheckboxStyle checkBox = this.$$delegate_0.getCheckBox(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return checkBox;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CircularProgressIndicatorStyle getCircularProgressIndicator(Composer composer2, int i3) {
                    composer2.startReplaceGroup(1168526622);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1168526622, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-circularProgressIndicator> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    CircularProgressIndicatorStyle circularProgressIndicator = this.$$delegate_0.getCircularProgressIndicator(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return circularProgressIndicator;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public CommunicationCardStyle getCommunicationCard(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1236495909);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1236495909, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-communicationCard> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    CommunicationCardStyle communicationCard = this.$$delegate_0.getCommunicationCard(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return communicationCard;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ExpandableButtonTrayStyle getExpandableButtonTray(Composer composer2, int i3) {
                    composer2.startReplaceGroup(125056425);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(125056425, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-expandableButtonTray> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    ExpandableButtonTrayStyle expandableButtonTray = this.$$delegate_0.getExpandableButtonTray(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return expandableButtonTray;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public IconButtonStyle getIconButton(Composer composer2, int i3) {
                    composer2.startReplaceGroup(1971533432);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1971533432, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-iconButton> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    IconButtonStyle iconButton = this.$$delegate_0.getIconButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return iconButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public InfoBannerStyle getInfoBanner(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-2019664441);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2019664441, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-infoBanner> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    InfoBannerStyle infoBanner = this.$$delegate_0.getInfoBanner(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return infoBanner;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public LoadingPlaceholderStyle getLoadingPlaceholderStyle(Composer composer2, int i3) {
                    composer2.startReplaceGroup(930275642);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(930275642, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-loadingPlaceholderStyle> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    LoadingPlaceholderStyle loadingPlaceholderStyle = this.$$delegate_0.getLoadingPlaceholderStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return loadingPlaceholderStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public MarkdownSpannedTextStyle getMarkdownSpannedText(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1148056064);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1148056064, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-markdownSpannedText> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    MarkdownSpannedTextStyle markdownSpannedText = this.$$delegate_0.getMarkdownSpannedText(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return markdownSpannedText;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NavigationBarStyle getNavigationBarStyle(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-2074673632);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2074673632, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-navigationBarStyle> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    NavigationBarStyle navigationBarStyle = this.$$delegate_0.getNavigationBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return navigationBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PlaceholderStyle getPlaceholder(Composer composer2, int i3) {
                    composer2.startReplaceGroup(1609668078);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1609668078, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-placeholder> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    PlaceholderStyle placeholder = this.$$delegate_0.getPlaceholder(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return placeholder;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public PogStyle getPog(Composer composer2, int i3) {
                    composer2.startReplaceGroup(1734005657);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1734005657, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-pog> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    PogStyle pog = this.$$delegate_0.getPog(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return pog;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ProgressBarStyle getProgressBarStyle(Composer composer2, int i3) {
                    composer2.startReplaceGroup(1983079449);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1983079449, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-progressBarStyle> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    ProgressBarStyle progressBarStyle = this.$$delegate_0.getProgressBarStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return progressBarStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RadioButtonStyle getRadioButton(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-2081727148);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2081727148, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-radioButton> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    RadioButtonStyle radioButton = this.$$delegate_0.getRadioButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return radioButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public RowStyle getRow(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1780833529);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1780833529, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-row> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    RowStyle row = this.$$delegate_0.getRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return row;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public BentoSelectionRowStyle getSelectionRowStyle(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1563207699);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1563207699, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-selectionRowStyle> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    BentoSelectionRowStyle selectionRowStyle = this.$$delegate_0.getSelectionRowStyle(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return selectionRowStyle;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public SpanButtonStyle getSpanButton(Composer composer2, int i3) {
                    composer2.startReplaceGroup(1053998505);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1053998505, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-spanButton> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    SpanButtonStyle spanButton = this.$$delegate_0.getSpanButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return spanButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextStyle getText(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-2041678950);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2041678950, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-text> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    TextStyle text = this.$$delegate_0.getText(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return text;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextButtonStyle getTextButton(Composer composer2, int i3) {
                    composer2.startReplaceGroup(462265004);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(462265004, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-textButton> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    TextButtonStyle textButton = this.$$delegate_0.getTextButton(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textButton;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public TextInputStyle getTextInput(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-1948737660);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1948737660, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-textInput> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    TextInputStyle textInput = this.$$delegate_0.getTextInput(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return textInput;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public ToggleRowStyle getToggleRow(Composer composer2, int i3) {
                    composer2.startReplaceGroup(-325385221);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-325385221, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-toggleRow> (BentoAccentNumpadOverlay.kt:0)");
                    }
                    ToggleRowStyle toggleRow = this.$$delegate_0.getToggleRow(composer2, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return toggleRow;
                }

                {
                    this.$$delegate_0 = this.$localStyles;
                }

                @Override // com.robinhood.compose.theme.Styles
                @JvmName
                public NumpadStyle getNumpad(Composer composer2, int i3) {
                    composer2.startReplaceGroup(122595194);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(122595194, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<no name provided>.<get-numpad> (BentoAccentNumpadOverlay.kt:19)");
                    }
                    NumpadStyle numpadStyleCopy$default = NumpadStyle.copy$default(this.$localStyles.getNumpad(composer2, 0), NumpadStyle.Colors.m21868copyysEtTa8$default(this.$localStyles.getNumpad(composer2, 0).getColors(), 0L, BentoTheme.INSTANCE.getColors(composer2, 6).m21368getAccent0d7_KjU(), 0L, 5, null), null, null, 6, null);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2.endReplaceGroup();
                    return numpadStyleCopy$default;
                }
            }), ComposableLambda3.rememberComposableLambda(-1885905277, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlayKt.BentoAccentNumpadOverlay.1
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
                        ComposerKt.traceEventStart(-1885905277, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay.<anonymous> (BentoAccentNumpadOverlay.kt:26)");
                    }
                    numpad.invoke(BentoNumpad4.INSTANCE, composer2, 6);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlayKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoAccentNumpadOverlay.BentoAccentNumpadOverlay$lambda$0(numpad, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
