package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.net.Uri;
import android.os.Parcelable;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.UriHandler;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRow;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.TextStyle;
import com.robinhood.models.serverdriven.experimental.api.TextWithAction;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithIcon;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithNumber;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithPictogram;
import com.robinhood.models.serverdriven.experimental.api.ValuePropWithPictogramAndRichText;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: SduiValuePropRow.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a;\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\n\u001a;\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\r\u001a;\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00028\u00000\u000e2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\u0010\u001a;\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00028\u00000\u00112\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006H\u0001¢\u0006\u0004\b\t\u0010\u0013\u001ai\u0010\t\u001a\u00020\b\"\b\b\u0000\u0010\u0001*\u00020\u00002\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u00162\f\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\b0\u00182\u000e\u0010\u001b\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u001a2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0003¢\u0006\u0004\b\t\u0010\u001e¨\u0006\u001f"}, m3636d2 = {"Landroid/os/Parcelable;", "ActionT", "Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithPictogram;", "markdownComponent", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "horizontalPadding", "", "SduiValueProp", "(Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithPictogram;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithPictogramAndRichText;", "richTextComponent", "(Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithPictogramAndRichText;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithIcon;", "valuePropWithIcon", "(Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithIcon;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithNumber;", "valuePropWithNumber", "(Lcom/robinhood/models/serverdriven/experimental/api/ValuePropWithNumber;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "", "title", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "bullet", "Lkotlin/Function0;", "bodyContent", "Lcom/robinhood/models/serverdriven/experimental/api/TextWithAction;", "button", "Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;", "titleColor", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;Lkotlin/jvm/functions/Function2;Lcom/robinhood/models/serverdriven/experimental/api/TextWithAction;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Lcom/robinhood/models/serverdriven/experimental/api/ThemedColor;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiValuePropRow {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$0(ValuePropWithPictogram valuePropWithPictogram, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiValueProp(valuePropWithPictogram, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$1(ValuePropWithPictogramAndRichText valuePropWithPictogramAndRichText, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiValueProp(valuePropWithPictogramAndRichText, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$2(ValuePropWithIcon valuePropWithIcon, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiValueProp(valuePropWithIcon, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$3(ValuePropWithNumber valuePropWithNumber, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiValueProp(valuePropWithNumber, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$5(String str, BentoValuePropRow2 bentoValuePropRow2, Function2 function2, TextWithAction textWithAction, Modifier modifier, HorizontalPadding horizontalPadding, ThemedColor themedColor, int i, int i2, Composer composer, int i3) {
        SduiValueProp(str, bentoValuePropRow2, function2, textWithAction, modifier, horizontalPadding, themedColor, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiValueProp(final ValuePropWithPictogram<? extends ActionT> markdownComponent, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(markdownComponent, "markdownComponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(2036103957);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(markdownComponent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2036103957, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRow.kt:33)");
                }
                String title = markdownComponent.getTitle();
                serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(markdownComponent.getPictogram().getServerValue());
                if (serverToBentoAssetMapper3FromServerValue == null) {
                    serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.UNKNOWN;
                }
                int i6 = i3 << 9;
                SduiValueProp(title, new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue), ComposableLambda3.rememberComposableLambda(934671479, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(934671479, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:40)");
                        }
                        String content_markdown = markdownComponent.getContent_markdown();
                        BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                        TextStyle text_style_override = markdownComponent.getText_style_override();
                        composer2.startReplaceGroup(571133287);
                        androidx.compose.p011ui.text.TextStyle composeTextStyle = text_style_override == null ? null : UtilKt.getComposeTextStyle(text_style_override, composer2, 0);
                        composer2.endReplaceGroup();
                        composer2.startReplaceGroup(571132129);
                        if (composeTextStyle == null) {
                            composeTextStyle = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM();
                        }
                        composer2.endReplaceGroup();
                        BentoMarkdownText2.BentoMarkdownText(content_markdown, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(composeTextStyle, 0, 0L, 0L, false, composer2, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), markdownComponent.getSupplemental_action(), modifier4, horizontalPadding3, null, composerStartRestartGroup, (BentoValuePropRow2.Pog.$stable << 3) | 384 | (57344 & i6) | (i6 & 458752), 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                horizontalPadding2 = horizontalPadding3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                horizontalPadding2 = horizontalPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiValuePropRow.SduiValueProp$lambda$0(markdownComponent, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String title2 = markdownComponent.getTitle();
            serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(markdownComponent.getPictogram().getServerValue());
            if (serverToBentoAssetMapper3FromServerValue == null) {
            }
            int i62 = i3 << 9;
            SduiValueProp(title2, new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue), ComposableLambda3.rememberComposableLambda(934671479, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(934671479, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:40)");
                    }
                    String content_markdown = markdownComponent.getContent_markdown();
                    BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                    TextStyle text_style_override = markdownComponent.getText_style_override();
                    composer2.startReplaceGroup(571133287);
                    androidx.compose.p011ui.text.TextStyle composeTextStyle = text_style_override == null ? null : UtilKt.getComposeTextStyle(text_style_override, composer2, 0);
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(571132129);
                    if (composeTextStyle == null) {
                        composeTextStyle = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM();
                    }
                    composer2.endReplaceGroup();
                    BentoMarkdownText2.BentoMarkdownText(content_markdown, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(composeTextStyle, 0, 0L, 0L, false, composer2, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), markdownComponent.getSupplemental_action(), modifier4, horizontalPadding3, null, composerStartRestartGroup, (BentoValuePropRow2.Pog.$stable << 3) | 384 | (57344 & i62) | (i62 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            horizontalPadding2 = horizontalPadding3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiValueProp(final ValuePropWithPictogramAndRichText<? extends ActionT> richTextComponent, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(richTextComponent, "richTextComponent");
        Composer composerStartRestartGroup = composer.startRestartGroup(1790481223);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(richTextComponent) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1790481223, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRow.kt:61)");
                }
                String title = richTextComponent.getTitle();
                serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(richTextComponent.getPictogram().getServerValue());
                if (serverToBentoAssetMapper3FromServerValue == null) {
                    serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.UNKNOWN;
                }
                int i6 = i3 << 9;
                SduiValueProp(title, new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue), ComposableLambda3.rememberComposableLambda(1407895717, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.3
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1407895717, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:67)");
                        }
                        BentoRichText.m15949BentoRichText0sCZWFg(richTextComponent.getContent_rich_text(), (Modifier) null, (androidx.compose.p011ui.text.TextStyle) null, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer2, 0, 1022);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), richTextComponent.getSupplemental_action(), modifier4, horizontalPadding3, null, composerStartRestartGroup, (BentoValuePropRow2.Pog.$stable << 3) | 384 | (57344 & i6) | (i6 & 458752), 64);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                horizontalPadding2 = horizontalPadding3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                horizontalPadding2 = horizontalPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiValuePropRow.SduiValueProp$lambda$1(richTextComponent, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String title2 = richTextComponent.getTitle();
            serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(richTextComponent.getPictogram().getServerValue());
            if (serverToBentoAssetMapper3FromServerValue == null) {
            }
            int i62 = i3 << 9;
            SduiValueProp(title2, new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue), ComposableLambda3.rememberComposableLambda(1407895717, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.3
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1407895717, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:67)");
                    }
                    BentoRichText.m15949BentoRichText0sCZWFg(richTextComponent.getContent_rich_text(), (Modifier) null, (androidx.compose.p011ui.text.TextStyle) null, 0L, 0L, false, 0, 0, (Function1<? super TextLayoutResult, Unit>) null, (Function1<? super Uri, Unit>) null, composer2, 0, 1022);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), richTextComponent.getSupplemental_action(), modifier4, horizontalPadding3, null, composerStartRestartGroup, (BentoValuePropRow2.Pog.$stable << 3) | 384 | (57344 & i62) | (i62 & 458752), 64);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            horizontalPadding2 = horizontalPadding3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiValueProp(final ValuePropWithIcon<? extends ActionT> valuePropWithIcon, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(valuePropWithIcon, "valuePropWithIcon");
        Composer composerStartRestartGroup = composer.startRestartGroup(-153286766);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(valuePropWithIcon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-153286766, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRow.kt:78)");
                }
                String title = valuePropWithIcon.getTitle();
                serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(valuePropWithIcon.getIcon().getServerValue());
                if (serverToBentoAssetMapper2FromServerValue == null) {
                    serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.UNKNOWN;
                }
                ThemedColor icon_color_override = valuePropWithIcon.getIcon_color_override();
                composerStartRestartGroup.startReplaceGroup(-1279679038);
                Color composeColor = icon_color_override != null ? null : SduiColors2.toComposeColor(icon_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                int i6 = i3 << 9;
                SduiValueProp(title, new BentoValuePropRow2.Icon(serverToBentoAssetMapper2FromServerValue, composeColor, null), ComposableLambda3.rememberComposableLambda(-147736336, true, new C207815(valuePropWithIcon), composerStartRestartGroup, 54), valuePropWithIcon.getSupplemental_action(), modifier4, horizontalPadding3, valuePropWithIcon.getTitle_text_color_override(), composerStartRestartGroup, (BentoValuePropRow2.Icon.$stable << 3) | 384 | (57344 & i6) | (i6 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                horizontalPadding2 = horizontalPadding3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                horizontalPadding2 = horizontalPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiValuePropRow.SduiValueProp$lambda$2(valuePropWithIcon, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            String title2 = valuePropWithIcon.getTitle();
            serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(valuePropWithIcon.getIcon().getServerValue());
            if (serverToBentoAssetMapper2FromServerValue == null) {
            }
            ThemedColor icon_color_override2 = valuePropWithIcon.getIcon_color_override();
            composerStartRestartGroup.startReplaceGroup(-1279679038);
            if (icon_color_override2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            int i62 = i3 << 9;
            SduiValueProp(title2, new BentoValuePropRow2.Icon(serverToBentoAssetMapper2FromServerValue, composeColor, null), ComposableLambda3.rememberComposableLambda(-147736336, true, new C207815(valuePropWithIcon), composerStartRestartGroup, 54), valuePropWithIcon.getSupplemental_action(), modifier4, horizontalPadding3, valuePropWithIcon.getTitle_text_color_override(), composerStartRestartGroup, (BentoValuePropRow2.Icon.$stable << 3) | 384 | (57344 & i62) | (i62 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            horizontalPadding2 = horizontalPadding3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: SduiValuePropRow.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$SduiValueProp$5 */
    static final class C207815 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ValuePropWithIcon<ActionT> $valuePropWithIcon;

        /* JADX WARN: Multi-variable type inference failed */
        C207815(ValuePropWithIcon<? extends ActionT> valuePropWithIcon) {
            this.$valuePropWithIcon = valuePropWithIcon;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-147736336, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:85)");
            }
            final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
            ThemedColor content_text_color_override = this.$valuePropWithIcon.getContent_text_color_override();
            composer.startReplaceGroup(-240693952);
            Color composeColor = content_text_color_override == null ? null : SduiColors2.toComposeColor(content_text_color_override, composer, 0);
            composer.endReplaceGroup();
            TextStyle text_style_override = this.$valuePropWithIcon.getText_style_override();
            composer.startReplaceGroup(-240691392);
            androidx.compose.p011ui.text.TextStyle composeTextStyle = text_style_override != null ? UtilKt.getComposeTextStyle(text_style_override, composer, 0) : null;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-240692570);
            if (composeTextStyle == null) {
                composeTextStyle = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
            }
            androidx.compose.p011ui.text.TextStyle textStyle = composeTextStyle;
            composer.endReplaceGroup();
            String content_markdown = this.$valuePropWithIcon.getContent_markdown();
            if (composeColor != null) {
                composer.startReplaceGroup(1128690077);
                markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(textStyle, 0, composeColor.getValue(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26);
                composer.endReplaceGroup();
            } else {
                composer.startReplaceGroup(1128874000);
                markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(textStyle, 0, 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 30);
                composer.endReplaceGroup();
            }
            MarkdownStyle markdownStyle = markdownStyleM21100withTextStylesYhh7B2I;
            composer.startReplaceGroup(5004770);
            boolean zChangedInstance = composer.changedInstance(uriHandler);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$SduiValueProp$5$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiValuePropRow.C207815.invoke$lambda$1$lambda$0(uriHandler, (String) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            BentoMarkdownText2.BentoMarkdownText(content_markdown, (Modifier) null, markdownStyle, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(UriHandler uriHandler, String uri) {
            Intrinsics.checkNotNullParameter(uri, "uri");
            uriHandler.openUri(uri);
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:60:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiValueProp(final ValuePropWithNumber<? extends ActionT> valuePropWithNumber, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(valuePropWithNumber, "valuePropWithNumber");
        Composer composerStartRestartGroup = composer.startRestartGroup(1864135554);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(valuePropWithNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1864135554, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRow.kt:116)");
                }
                int i6 = i3 << 9;
                SduiValueProp(valuePropWithNumber.getTitle(), new BentoValuePropRow2.Number(valuePropWithNumber.getNumber()), ComposableLambda3.rememberComposableLambda(-1391835808, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.7
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1391835808, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:120)");
                        }
                        ThemedColor content_text_color_override = valuePropWithNumber.getContent_text_color_override();
                        composer2.startReplaceGroup(-1819379760);
                        Color composeColor = content_text_color_override == null ? null : SduiColors2.toComposeColor(content_text_color_override, composer2, 0);
                        composer2.endReplaceGroup();
                        if (composeColor != null) {
                            composer2.startReplaceGroup(-566134811);
                            BentoMarkdownText2.BentoMarkdownText(valuePropWithNumber.getContent_markdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, composeColor.getValue(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 27), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-565881975);
                            BentoMarkdownText2.BentoMarkdownText(valuePropWithNumber.getContent_markdown(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), valuePropWithNumber.getSupplemental_action(), modifier4, horizontalPadding3, valuePropWithNumber.getTitle_text_color_override(), composerStartRestartGroup, (BentoValuePropRow2.Number.$stable << 3) | 384 | (57344 & i6) | (i6 & 458752), 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
                horizontalPadding2 = horizontalPadding3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                horizontalPadding2 = horizontalPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiValuePropRow.SduiValueProp$lambda$3(valuePropWithNumber, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i62 = i3 << 9;
            SduiValueProp(valuePropWithNumber.getTitle(), new BentoValuePropRow2.Number(valuePropWithNumber.getNumber()), ComposableLambda3.rememberComposableLambda(-1391835808, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.7
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1391835808, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:120)");
                    }
                    ThemedColor content_text_color_override = valuePropWithNumber.getContent_text_color_override();
                    composer2.startReplaceGroup(-1819379760);
                    Color composeColor = content_text_color_override == null ? null : SduiColors2.toComposeColor(content_text_color_override, composer2, 0);
                    composer2.endReplaceGroup();
                    if (composeColor != null) {
                        composer2.startReplaceGroup(-566134811);
                        BentoMarkdownText2.BentoMarkdownText(valuePropWithNumber.getContent_markdown(), (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, composeColor.getValue(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 27), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-565881975);
                        BentoMarkdownText2.BentoMarkdownText(valuePropWithNumber.getContent_markdown(), (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), valuePropWithNumber.getSupplemental_action(), modifier4, horizontalPadding3, valuePropWithNumber.getTitle_text_color_override(), composerStartRestartGroup, (BentoValuePropRow2.Number.$stable << 3) | 384 | (57344 & i62) | (i62 & 458752), 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier4;
            horizontalPadding2 = horizontalPadding3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0127  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0097 A[PHI: r9
      0x0097: PHI (r9v11 int) = (r9v0 int), (r9v5 int), (r9v6 int) binds: [B:55:0x0095, B:65:0x00ad, B:64:0x00aa] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <ActionT extends Parcelable> void SduiValueProp(final String str, final BentoValuePropRow2 bentoValuePropRow2, final Function2<? super Composer, ? super Integer, Unit> function2, final TextWithAction<? extends ActionT> textWithAction, Modifier modifier, HorizontalPadding horizontalPadding, ThemedColor themedColor, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        final BentoValuePropRow2 bentoValuePropRow22;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        final Modifier modifier2;
        int i4;
        int i5;
        final ThemedColor themedColor2;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1438177064);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str2 = str;
        } else {
            str2 = str;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(str2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            bentoValuePropRow22 = bentoValuePropRow2;
        } else {
            bentoValuePropRow22 = bentoValuePropRow2;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(bentoValuePropRow22) ? 32 : 16;
            }
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            function22 = function2;
        } else {
            function22 = function2;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(textWithAction) ? 2048 : 1024;
        }
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            int i7 = 196608;
            if (i4 != 0) {
                i3 |= i7;
            } else if ((196608 & i) == 0) {
                i7 = composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 131072 : 65536;
                i3 |= i7;
            }
            i5 = i2 & 64;
            if (i5 != 0) {
                if ((1572864 & i) == 0) {
                    themedColor2 = themedColor;
                    i3 |= composerStartRestartGroup.changedInstance(themedColor2) ? 1048576 : 524288;
                }
                if ((599187 & i3) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                    if (i5 != 0) {
                        themedColor2 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1438177064, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRow.kt:149)");
                    }
                    ThemedColor text_color_override = textWithAction == null ? textWithAction.getText_color_override() : null;
                    composerStartRestartGroup.startReplaceGroup(891323656);
                    final Color composeColor = text_color_override != null ? null : SduiColors2.toComposeColor(text_color_override, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(891326252);
                    final ComposableLambda composableLambdaRememberComposableLambda = textWithAction != null ? ComposableLambda3.rememberComposableLambda(709530332, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$SduiValueProp$textButton$1$1
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
                                ComposerKt.traceEventStart(709530332, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRow.kt:154)");
                            }
                            BentoTextButton2.m20715BentoTextButtonPIknLig(SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), textWithAction.getAction()), textWithAction.getText(), null, null, null, false, composeColor, composer2, 0, 60);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(393184252, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.9
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
                                ComposerKt.traceEventStart(393184252, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:163)");
                            }
                            BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                            ThemedColor themedColor3 = themedColor2;
                            composer2.startReplaceGroup(-107044308);
                            Color composeColor2 = themedColor3 == null ? null : SduiColors2.toComposeColor(themedColor3, composer2, 0);
                            composer2.endReplaceGroup();
                            String str3 = str2;
                            final Function2<Composer, Integer, Unit> function23 = function22;
                            final Function2<Composer, Integer, Unit> function24 = composableLambdaRememberComposableLambda;
                            BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(str3, ComposableLambda3.rememberComposableLambda(-1391097091, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.9.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                    invoke(composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer3, int i9) {
                                    if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1391097091, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRow.kt:166)");
                                    }
                                    Function2<Composer, Integer, Unit> function25 = function23;
                                    Function2<Composer, Integer, Unit> function26 = function24;
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
                                    function25.invoke(composer3, 0);
                                    composer3.startReplaceGroup(1423281807);
                                    if (function26 != null) {
                                        function26.invoke(composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), bentoValuePropRow22, bentoValuePropRow, modifier3, composeColor2, composer2, 3120, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 15) & 14) | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    horizontalPadding2 = horizontalPadding3;
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    horizontalPadding2 = horizontalPadding;
                }
                final ThemedColor themedColor3 = themedColor2;
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return SduiValuePropRow.SduiValueProp$lambda$5(str, bentoValuePropRow2, function2, textWithAction, modifier2, horizontalPadding2, themedColor3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            themedColor2 = themedColor;
            if ((599187 & i3) != 599186) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 != 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                if (textWithAction == null) {
                }
                composerStartRestartGroup.startReplaceGroup(891323656);
                if (text_color_override != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(891326252);
                final Function2<? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda2 = textWithAction != null ? ComposableLambda3.rememberComposableLambda(709530332, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt$SduiValueProp$textButton$1$1
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
                            ComposerKt.traceEventStart(709530332, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRow.kt:154)");
                        }
                        BentoTextButton2.m20715BentoTextButtonPIknLig(SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), textWithAction.getAction()), textWithAction.getText(), null, null, null, false, composeColor, composer2, 0, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54) : null;
                composerStartRestartGroup.endReplaceGroup();
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(393184252, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.9
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
                            ComposerKt.traceEventStart(393184252, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRow.kt:163)");
                        }
                        BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                        ThemedColor themedColor32 = themedColor2;
                        composer2.startReplaceGroup(-107044308);
                        Color composeColor2 = themedColor32 == null ? null : SduiColors2.toComposeColor(themedColor32, composer2, 0);
                        composer2.endReplaceGroup();
                        String str3 = str2;
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                        final Function2<? super Composer, ? super Integer, Unit> function24 = composableLambdaRememberComposableLambda2;
                        BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(str3, ComposableLambda3.rememberComposableLambda(-1391097091, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowKt.SduiValueProp.9.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer3, int i9) {
                                if ((i9 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1391097091, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRow.kt:166)");
                                }
                                Function2<Composer, Integer, Unit> function25 = function23;
                                Function2<Composer, Integer, Unit> function26 = function24;
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
                                function25.invoke(composer3, 0);
                                composer3.startReplaceGroup(1423281807);
                                if (function26 != null) {
                                    function26.invoke(composer3, 0);
                                }
                                composer3.endReplaceGroup();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), bentoValuePropRow22, bentoValuePropRow, modifier3, composeColor2, composer2, 3120, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 15) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                horizontalPadding2 = horizontalPadding3;
                modifier2 = modifier3;
            }
            final ThemedColor themedColor32 = themedColor2;
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        int i72 = 196608;
        if (i4 != 0) {
        }
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        themedColor2 = themedColor;
        if ((599187 & i3) != 599186) {
        }
        final ThemedColor themedColor322 = themedColor2;
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
