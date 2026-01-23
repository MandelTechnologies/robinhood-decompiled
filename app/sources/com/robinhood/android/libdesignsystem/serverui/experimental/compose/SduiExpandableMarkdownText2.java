package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

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
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.text.BentoSpannedText;
import com.robinhood.compose.bento.component.text.Markdown3;
import com.robinhood.models.serverdriven.experimental.api.ExpandableMarkdownText;
import com.robinhood.models.serverdriven.experimental.api.MarkdownText;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.utils.text.Spans;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiExpandableMarkdownText.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"SduiExpandableMarkdownText", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/ExpandableMarkdownText;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/ExpandableMarkdownText;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "expanded", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownTextKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiExpandableMarkdownText2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiExpandableMarkdownText$lambda$9(ExpandableMarkdownText expandableMarkdownText, Modifier modifier, int i, int i2, Composer composer, int i3) throws IOException {
        SduiExpandableMarkdownText(expandableMarkdownText, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ea  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    @SuppressLint({"UnusedContentLambdaTargetStateParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiExpandableMarkdownText(final ExpandableMarkdownText<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) throws IOException {
        int i3;
        Modifier modifier2;
        final Modifier modifier3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        SpannableString spannableString;
        int i4;
        Color composeColor;
        Color composeColor2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(991672446);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(991672446, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownText (SduiExpandableMarkdownText.kt:30)");
                }
                MarkdownText<ActionT> preview_text_markdown = component.getPreview_text_markdown();
                MarkdownText<ActionT> full_text_markdown = component.getFull_text_markdown();
                Spanned spannedRememberMarkdown = Markdown3.rememberMarkdown(preview_text_markdown.getText(), composerStartRestartGroup, 0);
                Spanned spannedRememberMarkdown2 = Markdown3.rememberMarkdown(full_text_markdown.getText(), composerStartRestartGroup, 0);
                String expand_button_text = component.getExpand_button_text();
                String collapse_button_text = component.getCollapse_button_text();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final boolean z = true;
                if (SduiExpandableMarkdownText$lambda$1(snapshotState)) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                    spannableStringBuilder.append((CharSequence) spannedRememberMarkdown);
                    spannableStringBuilder.append('\n');
                    spannableStringBuilder.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    Spans spans = Spans.INSTANCE;
                    ClickableSpan clickableSpan = new ClickableSpan() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownTextKt$SduiExpandableMarkdownText$lambda$6$$inlined$appendClickableSpan$default$1
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
                            SduiExpandableMarkdownText2.SduiExpandableMarkdownText$lambda$2(snapshotState, !SduiExpandableMarkdownText2.SduiExpandableMarkdownText$lambda$1(r2));
                        }
                    };
                    int length = spannableStringBuilder.length();
                    spannableStringBuilder.append((CharSequence) expand_button_text);
                    spannableStringBuilder.setSpan(clickableSpan, length, spannableStringBuilder.length(), 17);
                    spannableString = new SpannableString(new SpannedString(spannableStringBuilder));
                } else {
                    SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                    spannableStringBuilder2.append((CharSequence) spannedRememberMarkdown2);
                    spannableStringBuilder2.append(' ');
                    spannableStringBuilder2.append('\n');
                    spannableStringBuilder2.append((CharSequence) PlaceholderUtils.XXShortPlaceholderText);
                    Spans spans2 = Spans.INSTANCE;
                    ClickableSpan clickableSpan2 = new ClickableSpan() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownTextKt$SduiExpandableMarkdownText$lambda$4$$inlined$appendClickableSpan$default$1
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
                            SduiExpandableMarkdownText2.SduiExpandableMarkdownText$lambda$2(snapshotState, !SduiExpandableMarkdownText2.SduiExpandableMarkdownText$lambda$1(r2));
                        }
                    };
                    int length2 = spannableStringBuilder2.length();
                    spannableStringBuilder2.append((CharSequence) collapse_button_text);
                    spannableStringBuilder2.setSpan(clickableSpan2, length2, spannableStringBuilder2.length(), 17);
                    spannableString = new SpannableString(new SpannedString(spannableStringBuilder2));
                }
                int resourceId = !SduiExpandableMarkdownText$lambda$1(snapshotState) ? UtilKt.toResourceId(full_text_markdown.getStyle()) : UtilKt.toResourceId(preview_text_markdown.getStyle());
                if (SduiExpandableMarkdownText$lambda$1(snapshotState)) {
                    i4 = 0;
                    composerStartRestartGroup.startReplaceGroup(2130705162);
                    composeColor = SduiColors2.toComposeColor(preview_text_markdown.getColor(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2130644557);
                    i4 = 0;
                    composeColor = SduiColors2.toComposeColor(full_text_markdown.getColor(), composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (SduiExpandableMarkdownText$lambda$1(snapshotState)) {
                    composerStartRestartGroup.startReplaceGroup(2130873275);
                    ThemedColor link_color_override = preview_text_markdown.getLink_color_override();
                    composeColor2 = link_color_override == null ? null : SduiColors2.toComposeColor(link_color_override, composerStartRestartGroup, i4);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(2130797790);
                    ThemedColor link_color_override2 = full_text_markdown.getLink_color_override();
                    composeColor2 = link_color_override2 == null ? null : SduiColors2.toComposeColor(link_color_override2, composerStartRestartGroup, i4);
                    composerStartRestartGroup.endReplaceGroup();
                }
                Boolean boolValueOf = Boolean.valueOf(SduiExpandableMarkdownText$lambda$1(snapshotState));
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownTextKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiExpandableMarkdownText2.SduiExpandableMarkdownText$lambda$8$lambda$7((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                final SpannableString spannableString2 = spannableString;
                final int i6 = resourceId;
                final Color color = composeColor;
                final Color color2 = composeColor2;
                AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue2, null, "SduiExpandableMarkdownText", null, ComposableLambda3.rememberComposableLambda(-1645631717, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownTextKt.SduiExpandableMarkdownText.2
                    @Override // kotlin.jvm.functions.Function4
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                        invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedContentScope AnimatedContent, boolean z2, Composer composer2, int i7) {
                        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1645631717, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownText.<anonymous> (SduiExpandableMarkdownText.kt:95)");
                        }
                        BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString2, modifier3, color, color2, i6, null, 0, 0, null, composer2, 0, 480);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597824, 42);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownTextKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiExpandableMarkdownText2.SduiExpandableMarkdownText$lambda$9(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MarkdownText<ActionT> preview_text_markdown2 = component.getPreview_text_markdown();
            MarkdownText<ActionT> full_text_markdown2 = component.getFull_text_markdown();
            Spanned spannedRememberMarkdown3 = Markdown3.rememberMarkdown(preview_text_markdown2.getText(), composerStartRestartGroup, 0);
            Spanned spannedRememberMarkdown22 = Markdown3.rememberMarkdown(full_text_markdown2.getText(), composerStartRestartGroup, 0);
            String expand_button_text2 = component.getExpand_button_text();
            String collapse_button_text2 = component.getCollapse_button_text();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            final boolean z2 = true;
            if (SduiExpandableMarkdownText$lambda$1(snapshotState)) {
            }
            if (!SduiExpandableMarkdownText$lambda$1(snapshotState)) {
            }
            if (SduiExpandableMarkdownText$lambda$1(snapshotState)) {
            }
            if (SduiExpandableMarkdownText$lambda$1(snapshotState)) {
            }
            Boolean boolValueOf2 = Boolean.valueOf(SduiExpandableMarkdownText$lambda$1(snapshotState));
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final SpannableString spannableString22 = spannableString;
            final int i62 = resourceId;
            final Color color3 = composeColor;
            final Color color22 = composeColor2;
            AnimatedContentKt.AnimatedContent(boolValueOf2, null, (Function1) objRememberedValue2, null, "SduiExpandableMarkdownText", null, ComposableLambda3.rememberComposableLambda(-1645631717, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownTextKt.SduiExpandableMarkdownText.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z22, Composer composer2, int i7) {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1645631717, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiExpandableMarkdownText.<anonymous> (SduiExpandableMarkdownText.kt:95)");
                    }
                    BentoSpannedText.m21106BentoSpannedTextTHkziT8(spannableString22, modifier3, color3, color22, i62, null, 0, 0, null, composer2, 0, 480);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SduiExpandableMarkdownText$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiExpandableMarkdownText$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform SduiExpandableMarkdownText$lambda$8$lambda$7(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
    }
}
