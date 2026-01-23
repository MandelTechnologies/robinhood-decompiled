package com.robinhood.compose.bento.component.text;

import androidx.compose.foundation.DarkTheme;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.instant.p160ui.InstantRetirementAgreementComponents;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.markdown.compose.MarkdownStyle2;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.DayNightPreview;
import com.robinhood.utils.extensions.ResourceTypes;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.commonmark.node.Node;
import org.commonmark.parser.Parser;

/* compiled from: BentoMarkdownText.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b!\u001aU\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\f\u001aU\u0010\u000b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\r2\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tH\u0007¢\u0006\u0004\b\u000b\u0010\u000e\u001a;\u0010\u0010\u001a\u00020\u00072\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0001¢\u0006\u0004\b\u0010\u0010\u0011\u001a\u0019\u0010\u0013\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0013\u0010\u0014\u001a\u0019\u0010\u0015\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0015\u0010\u0014\u001a\u0019\u0010\u0016\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0016\u0010\u0014\u001a\u0019\u0010\u0017\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0017\u0010\u0014\u001a\u0019\u0010\u0018\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0018\u0010\u0014\u001a\u0019\u0010\u0019\u001a\u00020\u00072\b\b\u0001\u0010\u0012\u001a\u00020\u0000H\u0001¢\u0006\u0004\b\u0019\u0010\u0014\"\u001a\u0010\u001a\u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u0012\u0004\b\u001c\u0010\u001d\"\u001a\u0010\u001e\u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u0012\u0004\b\u001f\u0010\u001d\"\u001a\u0010 \u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b \u0010\u001b\u0012\u0004\b!\u0010\u001d\"\u001a\u0010\"\u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b\"\u0010\u001b\u0012\u0004\b#\u0010\u001d\"\u001d\u0010$\u001a\u00020\r8\u0006¢\u0006\u0012\n\u0004\b$\u0010%\u0012\u0004\b(\u0010\u001d\u001a\u0004\b&\u0010'\"\u001a\u0010)\u001a\u00020\u00008\u0006X\u0087T¢\u0006\f\n\u0004\b)\u0010\u001b\u0012\u0004\b*\u0010\u001d\"\u001d\u0010+\u001a\u00020\r8\u0006¢\u0006\u0012\n\u0004\b+\u0010%\u0012\u0004\b-\u0010\u001d\u001a\u0004\b,\u0010'¨\u0006.²\u0006\u000e\u0010\u000f\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u000f\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", InstantRetirementAgreementComponents.MarkdownTag, "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/android/markdown/compose/MarkdownStyle;", ResourceTypes.STYLE, "Lkotlin/Function0;", "", "onTextClick", "Lkotlin/Function1;", "onClickUri", "BentoMarkdownText", "(Ljava/lang/String;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Lorg/commonmark/node/Node;", "(Lorg/commonmark/node/Node;Landroidx/compose/ui/Modifier;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "markdownText", "BentoBaseMarkdownText", "(Lkotlin/jvm/functions/Function1;Lcom/robinhood/android/markdown/compose/MarkdownStyle;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;I)V", WebsocketGatewayConstants.DATA_KEY, "PreviewMarkdownText", "(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "PreviewMarkdownTextLoading", "PreviewMarkdownTextWithTextStyles", "PreviewMarkdownTextWithNoHeaderNewlines", "PreviewMarkdownTextWithEmptyLinkHandler", "PreviewMarkdownTextWithTextStylesEmptyLinkHandler", "SimpleMarkdown", "Ljava/lang/String;", "getSimpleMarkdown$annotations", "()V", "SimpleMarkdownWithInlines", "getSimpleMarkdownWithInlines$annotations", "SimpleMarkdownWithColoredLinks", "getSimpleMarkdownWithColoredLinks$annotations", "SimpleMarkdownWithHeaders", "getSimpleMarkdownWithHeaders$annotations", "SimpleMarkdownNode", "Lorg/commonmark/node/Node;", "getSimpleMarkdownNode", "()Lorg/commonmark/node/Node;", "getSimpleMarkdownNode$annotations", "SupportedMarkdown", "getSupportedMarkdown$annotations", "SupportedMarkdownNode", "getSupportedMarkdownNode", "getSupportedMarkdownNode$annotations", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt, reason: use source file name */
/* loaded from: classes20.dex */
public final class BentoMarkdownText2 {
    public static final String SimpleMarkdown = "\nThis is simple markdown text render\n";
    private static final Node SimpleMarkdownNode;
    public static final String SimpleMarkdownWithColoredLinks = "\nThis is simple markdown text with [*Robinhood*-flavored](color://?light=COLOR_PRIME&dark=COLOR_PRIME) markdown with [custom colors](color://?light=COLOR_HYDRO&dark=COLOR_RESIN_LIGHT).\n";
    public static final String SimpleMarkdownWithHeaders = "\n# Header 1\nParagraph 1\n## Header 2\nParagraph 2\n### Header 3\nParagraph 3\n";
    public static final String SimpleMarkdownWithInlines = "\nThis is simple markdown text render **bold** text and *italic* text. It also supports [links](https://robinhood.com) and `inline code`.\n";
    public static final String SupportedMarkdown = "\n### Markdown Header\nThis is regular text without formatting in a single paragraph.\n![Serious](https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Markdown-mark.svg/208px-Markdown-mark.svg.png)\nImages can also be inline: ![Serious](https://upload.wikimedia.org/wikipedia/commons/thumb/4/48/Markdown-mark.svg/208px-Markdown-mark.svg.png). [Links](http://hellsoft.se) and `inline code` also work. This *is* text __with__ inline styles for *__bold and italic__*. Those can be nested.\nHere is a code block:\n```javascript\nfunction codeBlock() {\n    return true;\n}\n```\n+ Bullet\n+ __Lists__\n+ Are\n+ *Cool*\n1. **First**\n2. *Second*\n3. Third\n4. [Fourth is clickable](https://robinhood.com)  \n   1. And\n   2. Sublists\n5. Mixed\n   - With\n   - Bullet\n   - Lists\n\n101) Lists\n102) Can\n103) Have\n104) *Custom*\n105) __Start__\n106) Numbers\n- List\n- Of\n- Items\n  - With\n  - Sublist\n> A blockquote is useful for quotes!\n\nHere is some [*Robinhood*-flavored](color://?light=COLOR_PRIME&dark=COLOR_PRIME) markdown with [custom colors](color://?light=COLOR_HYDRO&dark=COLOR_RESIN_LIGHT).\n";
    private static final Node SupportedMarkdownNode;

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoBaseMarkdownText$lambda$2(Function1 function1, MarkdownStyle markdownStyle, Function2 function2, int i, Composer composer, int i2) {
        BentoBaseMarkdownText(function1, markdownStyle, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoMarkdownText$lambda$0(String str, Modifier modifier, MarkdownStyle markdownStyle, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        BentoMarkdownText(str, modifier, markdownStyle, (Function0<Unit>) function0, (Function1<? super String, Unit>) function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoMarkdownText$lambda$1(Node node, Modifier modifier, MarkdownStyle markdownStyle, Function0 function0, Function1 function1, int i, int i2, Composer composer, int i3) {
        BentoMarkdownText(node, modifier, markdownStyle, (Function0<Unit>) function0, (Function1<? super String, Unit>) function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarkdownText$lambda$3(String str, int i, Composer composer, int i2) {
        PreviewMarkdownText(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarkdownTextLoading$lambda$4(String str, int i, Composer composer, int i2) {
        PreviewMarkdownTextLoading(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarkdownTextWithEmptyLinkHandler$lambda$7(String str, int i, Composer composer, int i2) {
        PreviewMarkdownTextWithEmptyLinkHandler(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarkdownTextWithNoHeaderNewlines$lambda$6(String str, int i, Composer composer, int i2) {
        PreviewMarkdownTextWithNoHeaderNewlines(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarkdownTextWithTextStyles$lambda$5(String str, int i, Composer composer, int i2) {
        PreviewMarkdownTextWithTextStyles(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewMarkdownTextWithTextStylesEmptyLinkHandler$lambda$8(String str, int i, Composer composer, int i2) {
        PreviewMarkdownTextWithTextStylesEmptyLinkHandler(str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getSimpleMarkdown$annotations() {
    }

    public static /* synthetic */ void getSimpleMarkdownNode$annotations() {
    }

    public static /* synthetic */ void getSimpleMarkdownWithColoredLinks$annotations() {
    }

    public static /* synthetic */ void getSimpleMarkdownWithHeaders$annotations() {
    }

    public static /* synthetic */ void getSimpleMarkdownWithInlines$annotations() {
    }

    public static /* synthetic */ void getSupportedMarkdown$annotations() {
    }

    public static /* synthetic */ void getSupportedMarkdownNode$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoMarkdownText(final String markdown, final Modifier modifier, MarkdownStyle markdownStyle, Function0<Unit> function0, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        MarkdownStyle style;
        final Function0<Unit> function02;
        final MarkdownStyle markdownStyle2;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Composer composerStartRestartGroup = composer.startRestartGroup(1971574718);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(markdown) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i4 = 128;
                i3 |= i4;
            } else {
                if ((i & 512) == 0 ? composerStartRestartGroup.changed(markdownStyle) : composerStartRestartGroup.changedInstance(markdownStyle)) {
                    i4 = 256;
                }
                i3 |= i4;
            }
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) == 0) {
                        style = BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, 6);
                        i3 &= -897;
                    } else {
                        style = markdownStyle;
                    }
                    function02 = i6 == 0 ? null : function0;
                    if (i7 != 0) {
                        function12 = null;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    style = markdownStyle;
                    function02 = function0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1971574718, i3, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownText (BentoMarkdownText.kt:56)");
                }
                BentoBaseMarkdownText(function12, style, ComposableLambda3.rememberComposableLambda(-193798044, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.BentoMarkdownText.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-193798044, i8, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownText.<anonymous> (BentoMarkdownText.kt:60)");
                        }
                        MarkdownText4.MarkdownText(markdown, LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), function02, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 12) & 14) | 384 | (MarkdownStyle.$stable << 3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                markdownStyle2 = style;
                function03 = function02;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                markdownStyle2 = markdownStyle;
                function03 = function0;
            }
            final Function1<? super String, Unit> function13 = function12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier2 = modifier;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoMarkdownText2.BentoMarkdownText$lambda$0(markdown, modifier2, markdownStyle2, function03, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        function12 = function1;
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoBaseMarkdownText(function12, style, ComposableLambda3.rememberComposableLambda(-193798044, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.BentoMarkdownText.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-193798044, i8, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownText.<anonymous> (BentoMarkdownText.kt:60)");
                        }
                        MarkdownText4.MarkdownText(markdown, LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), function02, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 12) & 14) | 384 | (MarkdownStyle.$stable << 3));
                if (ComposerKt.isTraceInProgress()) {
                }
                markdownStyle2 = style;
                function03 = function02;
            }
        }
        final Function1 function132 = function12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00d2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:95:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoMarkdownText(final Node markdown, final Modifier modifier, MarkdownStyle markdownStyle, Function0<Unit> function0, Function1<? super String, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super String, Unit> function12;
        MarkdownStyle style;
        final Function0<Unit> function02;
        final MarkdownStyle markdownStyle2;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i4;
        Intrinsics.checkNotNullParameter(markdown, "markdown");
        Composer composerStartRestartGroup = composer.startRestartGroup(1351614957);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(markdown) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) != 0) {
                i4 = 128;
                i3 |= i4;
            } else {
                if ((i & 512) == 0 ? composerStartRestartGroup.changed(markdownStyle) : composerStartRestartGroup.changedInstance(markdownStyle)) {
                    i4 = 256;
                }
                i3 |= i4;
            }
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
        }
        int i7 = i2 & 16;
        if (i7 == 0) {
            if ((i & 24576) == 0) {
                function12 = function1;
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                    if (i5 != 0) {
                        modifier = Modifier.INSTANCE;
                    }
                    if ((i2 & 4) == 0) {
                        style = BentoMarkdownText.INSTANCE.getStyle(composerStartRestartGroup, 6);
                        i3 &= -897;
                    } else {
                        style = markdownStyle;
                    }
                    function02 = i6 == 0 ? null : function0;
                    if (i7 != 0) {
                        function12 = null;
                    }
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    if ((i2 & 4) != 0) {
                        i3 &= -897;
                    }
                    style = markdownStyle;
                    function02 = function0;
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1351614957, i3, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownText (BentoMarkdownText.kt:82)");
                }
                BentoBaseMarkdownText(function12, style, ComposableLambda3.rememberComposableLambda(-858457069, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.BentoMarkdownText.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-858457069, i8, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownText.<anonymous> (BentoMarkdownText.kt:84)");
                        }
                        MarkdownText4.MarkdownText(markdown, LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), function02, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 12) & 14) | 384 | (MarkdownStyle.$stable << 3));
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                markdownStyle2 = style;
                function03 = function02;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                markdownStyle2 = markdownStyle;
                function03 = function0;
            }
            final Function1<? super String, Unit> function13 = function12;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier2 = modifier;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BentoMarkdownText2.BentoMarkdownText$lambda$1(markdown, modifier2, markdownStyle2, function03, function13, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        function12 = function1;
        if ((i3 & 9363) == 9362) {
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
                if (i5 != 0) {
                }
                if ((i2 & 4) == 0) {
                }
                if (i6 == 0) {
                }
                if (i7 != 0) {
                }
                composerStartRestartGroup.endDefaults();
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoBaseMarkdownText(function12, style, ComposableLambda3.rememberComposableLambda(-858457069, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.BentoMarkdownText.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i8) {
                        if ((i8 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-858457069, i8, -1, "com.robinhood.compose.bento.component.text.BentoMarkdownText.<anonymous> (BentoMarkdownText.kt:84)");
                        }
                        MarkdownText4.MarkdownText(markdown, LocalShowPlaceholder.withBentoPlaceholder$default(modifier, false, null, 3, null), function02, composer2, 0, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | ((i3 >> 12) & 14) | 384 | (MarkdownStyle.$stable << 3));
                if (ComposerKt.isTraceInProgress()) {
                }
                markdownStyle2 = style;
                function03 = function02;
            }
        }
        final Function1 function132 = function12;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: BentoMarkdownText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$PreviewMarkdownTextWithEmptyLinkHandler$1 */
    /* loaded from: classes15.dex */
    static final class C326421 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $data;

        C326421(String str) {
            this.$data = str;
        }

        private static final String invoke$lambda$1(SnapshotState<String> snapshotState) {
            return snapshotState.getValue();
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-883776717, i, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithEmptyLinkHandler.<anonymous> (BentoMarkdownText.kt:239)");
            }
            final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
            composer.startReplaceGroup(1849434622);
            String str = this.$data;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(str + " [Empty link]()", null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strInvoke$lambda$1 = invoke$lambda$1(snapshotState);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(uriHandler);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$PreviewMarkdownTextWithEmptyLinkHandler$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoMarkdownText2.C326421.invoke$lambda$5$lambda$4$lambda$3(uriHandler, snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(strInvoke$lambda$1, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue2, composer, 0, 14);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(UriHandler uriHandler, SnapshotState snapshotState, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (uri.length() == 0) {
                snapshotState.setValue("hi mom");
            } else {
                uriHandler.openUri(uri);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BentoMarkdownText.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$PreviewMarkdownTextWithTextStylesEmptyLinkHandler$1 */
    /* loaded from: classes15.dex */
    static final class C326451 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ String $data;

        C326451(String str) {
            this.$data = str;
        }

        private static final String invoke$lambda$1(SnapshotState<String> snapshotState) {
            return snapshotState.getValue();
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(467204, i, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithTextStylesEmptyLinkHandler.<anonymous> (BentoMarkdownText.kt:260)");
            }
            final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
            composer.startReplaceGroup(1849434622);
            String str = this.$data;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(str + " [Empty link]()", null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            Modifier.Companion companion2 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, companion2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion3.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            String strInvoke$lambda$1 = invoke$lambda$1(snapshotState);
            BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I = bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer, 6).getDisplayNibLarge(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer, 6).getSolLight(), 0L, false, composer, 196608, 24);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(uriHandler);
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function1() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$PreviewMarkdownTextWithTextStylesEmptyLinkHandler$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return BentoMarkdownText2.C326451.invoke$lambda$5$lambda$4$lambda$3(uriHandler, snapshotState, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(strInvoke$lambda$1, (Modifier) null, markdownStyleM21100withTextStylesYhh7B2I, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue2, composer, MarkdownStyle.$stable << 6, 10);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(UriHandler uriHandler, SnapshotState snapshotState, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            if (uri.length() == 0) {
                snapshotState.setValue("hi mom");
            } else {
                uriHandler.openUri(uri);
            }
            return Unit.INSTANCE;
        }
    }

    public static final void BentoBaseMarkdownText(final Function1<? super String, Unit> function1, final MarkdownStyle style, final Function2<? super Composer, ? super Integer, Unit> markdownText, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(style, "style");
        Intrinsics.checkNotNullParameter(markdownText, "markdownText");
        Composer composerStartRestartGroup = composer.startRestartGroup(1551148668);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(style) : composerStartRestartGroup.changedInstance(style) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(markdownText) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1551148668, i2, -1, "com.robinhood.compose.bento.component.text.BentoBaseMarkdownText (BentoMarkdownText.kt:97)");
            }
            List listMutableListOf = CollectionsKt.mutableListOf(MarkdownStyle2.getLocalMarkdownStyle().provides(style));
            if (function1 != null) {
                listMutableListOf.add(CompositionLocalsKt.getLocalUriHandler().provides(new UriHandler() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$BentoBaseMarkdownText$uriHandler$1
                    @Override // androidx.compose.p011ui.platform.UriHandler
                    public void openUri(String uri) {
                        Intrinsics.checkNotNullParameter(uri, "uri");
                        function1.invoke(uri);
                    }
                }));
            }
            ProvidedValue[] providedValueArr = (ProvidedValue[]) listMutableListOf.toArray(new ProvidedValue[0]);
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) Arrays.copyOf(providedValueArr, providedValueArr.length), ComposableLambda3.rememberComposableLambda(-1637274820, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.BentoBaseMarkdownText.1
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
                        ComposerKt.traceEventStart(-1637274820, i3, -1, "com.robinhood.compose.bento.component.text.BentoBaseMarkdownText.<anonymous> (BentoMarkdownText.kt:110)");
                    }
                    markdownText.invoke(composer2, 0);
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
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoMarkdownText2.BentoBaseMarkdownText$lambda$2(function1, style, markdownText, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void PreviewMarkdownText(final String data, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1059302732);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1059302732, i2, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownText (BentoMarkdownText.kt:183)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(74046460, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.PreviewMarkdownText.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(74046460, i3, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownText.<anonymous> (BentoMarkdownText.kt:185)");
                    }
                    String str = data;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoMarkdownText2.PreviewMarkdownText$lambda$3(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void PreviewMarkdownTextLoading(final String data, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1781097788);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1781097788, i2, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextLoading (BentoMarkdownText.kt:193)");
            }
            BentoTheme2.BentoTheme(Boolean.TRUE, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1644269692, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.PreviewMarkdownTextLoading.1
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
                        ComposerKt.traceEventStart(1644269692, i3, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextLoading.<anonymous> (BentoMarkdownText.kt:195)");
                    }
                    final String str = data;
                    LocalShowPlaceholder.Loadable(true, null, null, ComposableLambda3.rememberComposableLambda(-712375796, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.PreviewMarkdownTextLoading.1.1
                        public final void invoke(Composer composer3, int i4) {
                            if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-712375796, i4, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextLoading.<anonymous>.<anonymous> (BentoMarkdownText.kt:196)");
                            }
                            String str2 = str;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            BentoMarkdownText2.BentoMarkdownText(str2, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer3, 0, 30);
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 3078, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663302, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoMarkdownText2.PreviewMarkdownTextLoading$lambda$4(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void PreviewMarkdownTextWithTextStyles(final String data, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1014132319);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1014132319, i2, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithTextStyles (BentoMarkdownText.kt:205)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(1993480615, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.PreviewMarkdownTextWithTextStyles.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1993480615, i3, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithTextStyles.<anonymous> (BentoMarkdownText.kt:207)");
                    }
                    String str = data;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(bentoTheme.getTypography(composer2, 6).getDisplayNibLarge(), TextAlign.INSTANCE.m7919getCentere0LSkKk(), bentoTheme.getColors(composer2, 6).getSolLight(), 0L, false, composer2, 196608, 24), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoMarkdownText2.PreviewMarkdownTextWithTextStyles$lambda$5(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void PreviewMarkdownTextWithNoHeaderNewlines(final String data, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(-962704543);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-962704543, i2, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithNoHeaderNewlines (BentoMarkdownText.kt:222)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(672293033, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt.PreviewMarkdownTextWithNoHeaderNewlines.1
                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(672293033, i3, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithNoHeaderNewlines.<anonymous> (BentoMarkdownText.kt:224)");
                    }
                    String str = data;
                    Modifier.Companion companion = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
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
                    BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, 0L, 0L, false, composer2, 221184, 15), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoMarkdownText2.PreviewMarkdownTextWithNoHeaderNewlines$lambda$6(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void PreviewMarkdownTextWithEmptyLinkHandler(final String data, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1776193003);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1776193003, i2, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithEmptyLinkHandler (BentoMarkdownText.kt:237)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-883776717, true, new C326421(data), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoMarkdownText2.PreviewMarkdownTextWithEmptyLinkHandler$lambda$7(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @DayNightPreview
    public static final void PreviewMarkdownTextWithTextStylesEmptyLinkHandler(final String data, Composer composer, final int i) {
        int i2;
        Intrinsics.checkNotNullParameter(data, "data");
        Composer composerStartRestartGroup = composer.startRestartGroup(1016530364);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(data) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1016530364, i2, -1, "com.robinhood.compose.bento.component.text.PreviewMarkdownTextWithTextStylesEmptyLinkHandler (BentoMarkdownText.kt:258)");
            }
            BentoTheme2.BentoTheme(Boolean.valueOf(!DarkTheme.isSystemInDarkTheme(composerStartRestartGroup, 0)), null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(467204, true, new C326451(data), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.text.BentoMarkdownTextKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BentoMarkdownText2.PreviewMarkdownTextWithTextStylesEmptyLinkHandler$lambda$8(data, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final Node getSimpleMarkdownNode() {
        return SimpleMarkdownNode;
    }

    static {
        Node node = Parser.builder().build().parse(SimpleMarkdown);
        Intrinsics.checkNotNullExpressionValue(node, "parse(...)");
        SimpleMarkdownNode = node;
        Node node2 = Parser.builder().build().parse(SupportedMarkdown);
        Intrinsics.checkNotNullExpressionValue(node2, "parse(...)");
        SupportedMarkdownNode = node2;
    }

    public static final Node getSupportedMarkdownNode() {
        return SupportedMarkdownNode;
    }
}
