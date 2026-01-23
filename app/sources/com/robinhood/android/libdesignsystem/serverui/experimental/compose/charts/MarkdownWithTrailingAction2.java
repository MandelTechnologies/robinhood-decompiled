package com.robinhood.android.libdesignsystem.serverui.experimental.compose.charts;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextPaint;
import android.text.style.ClickableSpan;
import android.view.View;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.UtilKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.MarkdownWithTrailingAction;
import com.robinhood.models.serverdriven.experimental.api.TextWithAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.utils.text.Spans;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: MarkdownWithTrailingAction.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"SduiMarkdownWithTrailingAction", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/MarkdownWithTrailingAction;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/MarkdownWithTrailingAction;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.charts.MarkdownWithTrailingActionKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MarkdownWithTrailingAction2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiMarkdownWithTrailingAction$lambda$2(MarkdownWithTrailingAction markdownWithTrailingAction, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiMarkdownWithTrailingAction(markdownWithTrailingAction, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0168  */
    @SuppressLint({"ModifierParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiMarkdownWithTrailingAction(final MarkdownWithTrailingAction<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ;
        TextWithAction<ActionT> trailing_action;
        final Function0<Unit> function0Handling;
        Spanned spannedRememberMarkdown;
        boolean zChanged;
        Object objRememberedValue;
        Color composeColor;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1736172115);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                modifierM21623defaultHorizontalPaddingrAjV9yQ = modifier;
                int i4 = composerStartRestartGroup.changed(modifierM21623defaultHorizontalPaddingrAjV9yQ) ? 32 : 16;
                i3 |= i4;
            } else {
                modifierM21623defaultHorizontalPaddingrAjV9yQ = modifier;
            }
            i3 |= i4;
        } else {
            modifierM21623defaultHorizontalPaddingrAjV9yQ = modifier;
        }
        if ((i3 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.startDefaults();
            final boolean z = true;
            if ((i & 1) != 0 && !composerStartRestartGroup.getDefaultsInvalid()) {
                composerStartRestartGroup.skipToGroupEnd();
                if ((i2 & 2) != 0) {
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                MarkdownText<ActionT> markdown_text = component.getMarkdown_text();
                trailing_action = component.getTrailing_action();
                function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getTrailing_action().getAction());
                spannedRememberMarkdown = Markdown3.rememberMarkdown(markdown_text.getText(), composerStartRestartGroup, 0);
                String text = trailing_action.getText();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(text) | composerStartRestartGroup.changed(markdown_text);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) spannedRememberMarkdown);
                    String text2 = trailing_action.getText();
                    spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    Spans spans = Spans.INSTANCE;
                    ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.charts.MarkdownWithTrailingActionKt$SduiMarkdownWithTrailingAction$lambda$1$lambda$0$$inlined$appendClickableSpan$default$1
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                            textPaint.setColor(textPaint.linkColor);
                            textPaint.setUnderlineText(z);
                            if (z) {
                                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                            }
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View widget) {
                            Intrinsics.checkNotNullParameter(widget, "widget");
                            function0Handling.invoke();
                        }
                    };
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) text2);
                    spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 17);
                    objRememberedValue = new SpannableString(new SpannedString(spannableStringBuilder));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    SpannableString spannableString = (SpannableString) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    int resourceId = UtilKt.toResourceId(markdown_text.getStyle());
                    Color composeColor2 = SduiColors2.toComposeColor(markdown_text.getColor(), composerStartRestartGroup, 0);
                    ThemedColor link_color_override = markdown_text.getLink_color_override();
                    composerStartRestartGroup.startReplaceGroup(-2014049859);
                    if (link_color_override != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-2014050848);
                    if (composeColor == null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString, modifierM21623defaultHorizontalPaddingrAjV9yQ, composeColor2, composeColor, resourceId, UtilKt.getGravity(markdown_text.getAlignment()), 0, 0, null, composerStartRestartGroup, i3 & 112, 448);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            } else {
                if ((i2 & 2) != 0) {
                    modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(Modifier.INSTANCE, 0.0f, composerStartRestartGroup, 6, 1);
                    i3 &= -113;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1736172115, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.charts.SduiMarkdownWithTrailingAction (MarkdownWithTrailingAction.kt:26)");
                }
                MarkdownText<ActionT> markdown_text2 = component.getMarkdown_text();
                trailing_action = component.getTrailing_action();
                function0Handling = SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), component.getTrailing_action().getAction());
                spannedRememberMarkdown = Markdown3.rememberMarkdown(markdown_text2.getText(), composerStartRestartGroup, 0);
                String text3 = trailing_action.getText();
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged = composerStartRestartGroup.changed(text3) | composerStartRestartGroup.changed(markdown_text2);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) spannedRememberMarkdown);
                    String text22 = trailing_action.getText();
                    spannableStringBuilder2.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    Spans spans2 = Spans.INSTANCE;
                    ClickableSpan clickableSpan2 = new ClickableSpan() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.charts.MarkdownWithTrailingActionKt$SduiMarkdownWithTrailingAction$lambda$1$lambda$0$$inlined$appendClickableSpan$default$1
                        @Override // android.text.style.ClickableSpan, android.text.style.CharacterStyle
                        public void updateDrawState(TextPaint textPaint) {
                            Intrinsics.checkNotNullParameter(textPaint, "textPaint");
                            textPaint.setColor(textPaint.linkColor);
                            textPaint.setUnderlineText(z);
                            if (z) {
                                textPaint.setTypeface(Typeface.DEFAULT_BOLD);
                            }
                        }

                        @Override // android.text.style.ClickableSpan
                        public void onClick(View widget) {
                            Intrinsics.checkNotNullParameter(widget, "widget");
                            function0Handling.invoke();
                        }
                    };
                    int length2 = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) text22);
                    spannableStringBuilder2.setSpan(clickableSpan2, length2, spannableStringBuilder2.length(), 17);
                    objRememberedValue = new SpannableString(new SpannedString(spannableStringBuilder2));
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                SpannableString spannableString2 = (SpannableString) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                int resourceId2 = UtilKt.toResourceId(markdown_text2.getStyle());
                Color composeColor22 = SduiColors2.toComposeColor(markdown_text2.getColor(), composerStartRestartGroup, 0);
                ThemedColor link_color_override2 = markdown_text2.getLink_color_override();
                composerStartRestartGroup.startReplaceGroup(-2014049859);
                composeColor = link_color_override2 != null ? null : SduiColors2.toComposeColor(link_color_override2, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-2014050848);
                if (composeColor == null) {
                    composeColor = ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getMarkdownSpannedText(composerStartRestartGroup, 0).m21807getLinkColorQN2ZGVo();
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString2, modifierM21623defaultHorizontalPaddingrAjV9yQ, composeColor22, composeColor, resourceId2, UtilKt.getGravity(markdown_text2.getAlignment()), 0, 0, null, composerStartRestartGroup, i3 & 112, 448);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.charts.MarkdownWithTrailingActionKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarkdownWithTrailingAction2.SduiMarkdownWithTrailingAction$lambda$2(component, modifierM21623defaultHorizontalPaddingrAjV9yQ, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
