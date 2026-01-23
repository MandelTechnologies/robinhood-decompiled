package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

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
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdl;
import com.robinhood.android.libdesignsystem.serverui.experimental.extensions.PictogramDtos;
import com.robinhood.android.markdown.compose.MarkdownStyle;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow2;
import com.robinhood.compose.bento.component.rows.BentoValuePropRow3;
import com.robinhood.compose.bento.component.text.BentoMarkdownText;
import com.robinhood.compose.bento.component.text.BentoMarkdownText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.TextStyleDto;
import rh_server_driven_ui.p531v1.TextWithActionDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;
import rh_server_driven_ui.p531v1.ValuePropContentDto;
import rh_server_driven_ui.p531v1.ValuePropWithIconDto;
import rh_server_driven_ui.p531v1.ValuePropWithNumberDto;
import rh_server_driven_ui.p531v1.ValuePropWithPictogramDto;

/* compiled from: SduiValuePropRowIdl.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aE\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\f\u001aE\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\u000f\u001aE\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0011\u001a\u00020\u00102\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0001¢\u0006\u0004\b\u000b\u0010\u0012\u001as\u0010\u000b\u001a\u00020\n\"\u0004\b\u0000\u0010\u00002\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00172\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00028\u00000\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0003¢\u0006\u0004\b\u000b\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"ActionT", "Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;", "valuePropWithPictogram", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "parseAction", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "horizontalPadding", "", "SduiValueProp", "(Lrh_server_driven_ui/v1/ValuePropWithPictogramDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/ValuePropWithIconDto;", "valuePropWithIcon", "(Lrh_server_driven_ui/v1/ValuePropWithIconDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/ValuePropWithNumberDto;", "valuePropWithNumber", "(Lrh_server_driven_ui/v1/ValuePropWithNumberDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "", "title", "Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;", "bullet", "Lkotlin/Function0;", "bodyContent", "Lrh_server_driven_ui/v1/TextWithActionDto;", "button", "Lrh_server_driven_ui/v1/ThemedColorDto;", "titleColor", "(Ljava/lang/String;Lcom/robinhood/compose/bento/component/rows/BentoValuePropRowBulletType;Lkotlin/jvm/functions/Function2;Lrh_server_driven_ui/v1/TextWithActionDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Lrh_server_driven_ui/v1/ThemedColorDto;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiValuePropRowIdl {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$0(ValuePropWithPictogramDto valuePropWithPictogramDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiValueProp(valuePropWithPictogramDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$1(ValuePropWithIconDto valuePropWithIconDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiValueProp(valuePropWithIconDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$2(ValuePropWithNumberDto valuePropWithNumberDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiValueProp(valuePropWithNumberDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiValueProp$lambda$4(String str, BentoValuePropRow2 bentoValuePropRow2, Function2 function2, TextWithActionDto textWithActionDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, ThemedColorDto themedColorDto, int i, int i2, Composer composer, int i3) {
        SduiValueProp(str, bentoValuePropRow2, function2, textWithActionDto, function1, modifier, horizontalPadding, themedColorDto, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT> void SduiValueProp(final ValuePropWithPictogramDto valuePropWithPictogram, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        final HorizontalPadding horizontalPadding2;
        Intrinsics.checkNotNullParameter(valuePropWithPictogram, "valuePropWithPictogram");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(328157058);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(valuePropWithPictogram) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
        }
        if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            horizontalPadding2 = horizontalPadding;
        } else {
            Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            HorizontalPadding horizontalPadding3 = i5 != 0 ? HorizontalPadding.Default : horizontalPadding;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(328157058, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRowIdl.kt:37)");
            }
            ValuePropContentDto content = valuePropWithPictogram.getContent();
            String title = content != null ? content.getTitle() : null;
            int i6 = i3;
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.INSTANCE.fromServerValue(PictogramDtos.getServerValue(valuePropWithPictogram.getPictogram()));
            if (serverToBentoAssetMapper3FromServerValue == null) {
                serverToBentoAssetMapper3FromServerValue = ServerToBentoAssetMapper3.UNKNOWN;
            }
            BentoValuePropRow2.Pog pog = new BentoValuePropRow2.Pog(serverToBentoAssetMapper3FromServerValue);
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(719174884, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt.SduiValueProp.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                /* JADX WARN: Removed duplicated region for block: B:28:0x0058  */
                /* JADX WARN: Removed duplicated region for block: B:42:0x00b5  */
                /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                */
                public final void invoke(Composer composer2, int i7) {
                    String str;
                    String text;
                    RenderableTextDto content2;
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(719174884, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRowIdl.kt:44)");
                    }
                    ValuePropContentDto content3 = valuePropWithPictogram.getContent();
                    RenderableTextDto.ConcreteDto concrete = (content3 == null || (content2 = content3.getContent()) == null) ? null : content2.getConcrete();
                    if (concrete instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                        text = ((RenderableTextDto.ConcreteDto.MarkdownText) concrete).getValue().getText();
                    } else {
                        if (!(concrete instanceof RenderableTextDto.ConcreteDto.PlainText)) {
                            if (concrete != null) {
                                throw new NoWhenBranchMatchedException();
                            }
                            str = null;
                            if (str != null) {
                                BentoMarkdownText bentoMarkdownText = BentoMarkdownText.INSTANCE;
                                ValuePropContentDto content4 = valuePropWithPictogram.getContent();
                                TextStyleDto text_style_override = content4 != null ? content4.getText_style_override() : null;
                                composer2.startReplaceGroup(-362654316);
                                TextStyle composeTextStyle = text_style_override != null ? UtilKt.getComposeTextStyle(text_style_override, composer2, 0) : null;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-362655904);
                                if (composeTextStyle == null) {
                                    composeTextStyle = BentoTheme.INSTANCE.getTypography(composer2, BentoTheme.$stable).getTextM();
                                }
                                composer2.endReplaceGroup();
                                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, bentoMarkdownText.m21100withTextStylesYhh7B2I(composeTextStyle, 0, 0L, 0L, false, composer2, BentoMarkdownText.$stable << 15, 30), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                return;
                            }
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        text = ((RenderableTextDto.ConcreteDto.PlainText) concrete).getValue().getText();
                    }
                    str = text;
                    if (str != null) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                }
            }, composerStartRestartGroup, 54);
            ValuePropContentDto content2 = valuePropWithPictogram.getContent();
            TextWithActionDto supplemental_action = content2 != null ? content2.getSupplemental_action() : null;
            int i7 = i6 << 9;
            int i8 = (BentoValuePropRow2.Pog.$stable << 3) | 384 | (57344 & i7) | (458752 & i7) | (i7 & 3670016);
            TextWithActionDto textWithActionDto = supplemental_action;
            Modifier modifier4 = modifier3;
            HorizontalPadding horizontalPadding4 = horizontalPadding3;
            SduiValueProp(title, pog, composableLambdaRememberComposableLambda, textWithActionDto, parseAction, modifier4, horizontalPadding4, null, composerStartRestartGroup, i8, 128);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier4;
            horizontalPadding2 = horizontalPadding4;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiValuePropRowIdl.SduiValueProp$lambda$0(valuePropWithPictogram, parseAction, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:89:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiValueProp(final ValuePropWithIconDto valuePropWithIcon, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(valuePropWithIcon, "valuePropWithIcon");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-647415297);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(valuePropWithIcon) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-647415297, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRowIdl.kt:71)");
                }
                ValuePropContentDto content = valuePropWithIcon.getContent();
                String title = content == null ? content.getTitle() : null;
                int i6 = i3;
                serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(IconKt.getServerValue(valuePropWithIcon.getIcon()));
                if (serverToBentoAssetMapper2FromServerValue == null) {
                    serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.UNKNOWN;
                }
                ThemedColorDto icon_color_override = valuePropWithIcon.getIcon_color_override();
                composerStartRestartGroup.startReplaceGroup(604173519);
                Color composeColor = icon_color_override != null ? null : SduiColors2.toComposeColor(icon_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                BentoValuePropRow2.Icon icon = new BentoValuePropRow2.Icon(serverToBentoAssetMapper2FromServerValue, composeColor, null);
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1030000803, true, new C207763(valuePropWithIcon), composerStartRestartGroup, 54);
                ValuePropContentDto content2 = valuePropWithIcon.getContent();
                TextWithActionDto supplemental_action = content2 == null ? content2.getSupplemental_action() : null;
                ValuePropContentDto content3 = valuePropWithIcon.getContent();
                ThemedColorDto title_text_color_override = content3 != null ? content3.getTitle_text_color_override() : null;
                int i7 = i6 << 9;
                int i8 = (i7 & 3670016) | (BentoValuePropRow2.Icon.$stable << 3) | 384 | (57344 & i7) | (458752 & i7);
                ThemedColorDto themedColorDto = title_text_color_override;
                Modifier modifier5 = modifier4;
                HorizontalPadding horizontalPadding4 = horizontalPadding3;
                SduiValueProp(title, icon, composableLambdaRememberComposableLambda, supplemental_action, parseAction, modifier5, horizontalPadding4, themedColorDto, composerStartRestartGroup, i8, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                horizontalPadding2 = horizontalPadding4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                horizontalPadding2 = horizontalPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiValuePropRowIdl.SduiValueProp$lambda$1(valuePropWithIcon, parseAction, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ValuePropContentDto content4 = valuePropWithIcon.getContent();
            if (content4 == null) {
            }
            int i62 = i3;
            serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(IconKt.getServerValue(valuePropWithIcon.getIcon()));
            if (serverToBentoAssetMapper2FromServerValue == null) {
            }
            ThemedColorDto icon_color_override2 = valuePropWithIcon.getIcon_color_override();
            composerStartRestartGroup.startReplaceGroup(604173519);
            if (icon_color_override2 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoValuePropRow2.Icon icon2 = new BentoValuePropRow2.Icon(serverToBentoAssetMapper2FromServerValue, composeColor, null);
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-1030000803, true, new C207763(valuePropWithIcon), composerStartRestartGroup, 54);
            ValuePropContentDto content22 = valuePropWithIcon.getContent();
            if (content22 == null) {
            }
            ValuePropContentDto content32 = valuePropWithIcon.getContent();
            if (content32 != null) {
            }
            int i72 = i62 << 9;
            int i82 = (i72 & 3670016) | (BentoValuePropRow2.Icon.$stable << 3) | 384 | (57344 & i72) | (458752 & i72);
            ThemedColorDto themedColorDto2 = title_text_color_override;
            Modifier modifier52 = modifier4;
            HorizontalPadding horizontalPadding42 = horizontalPadding3;
            SduiValueProp(title, icon2, composableLambdaRememberComposableLambda2, supplemental_action, parseAction, modifier52, horizontalPadding42, themedColorDto2, composerStartRestartGroup, i82, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            horizontalPadding2 = horizontalPadding42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: SduiValuePropRowIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$SduiValueProp$3 */
    static final class C207763 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ ValuePropWithIconDto $valuePropWithIcon;

        C207763(ValuePropWithIconDto valuePropWithIconDto) {
            this.$valuePropWithIcon = valuePropWithIconDto;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            MarkdownStyle markdownStyleM21100withTextStylesYhh7B2I;
            RenderableTextDto content;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1030000803, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRowIdl.kt:78)");
            }
            final UriHandler uriHandler = (UriHandler) composer.consume(CompositionLocalsKt.getLocalUriHandler());
            ValuePropContentDto content2 = this.$valuePropWithIcon.getContent();
            String text = null;
            ThemedColorDto title_text_color_override = content2 != null ? content2.getTitle_text_color_override() : null;
            composer.startReplaceGroup(-1988289203);
            Color composeColor = title_text_color_override == null ? null : SduiColors2.toComposeColor(title_text_color_override, composer, 0);
            composer.endReplaceGroup();
            ValuePropContentDto content3 = this.$valuePropWithIcon.getContent();
            TextStyleDto text_style_override = content3 != null ? content3.getText_style_override() : null;
            composer.startReplaceGroup(-1988286355);
            TextStyle composeTextStyle = text_style_override == null ? null : UtilKt.getComposeTextStyle(text_style_override, composer, 0);
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1988287812);
            if (composeTextStyle == null) {
                composeTextStyle = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
            }
            composer.endReplaceGroup();
            ValuePropContentDto content4 = this.$valuePropWithIcon.getContent();
            RenderableTextDto.ConcreteDto concrete = (content4 == null || (content = content4.getContent()) == null) ? null : content.getConcrete();
            if (concrete instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                text = ((RenderableTextDto.ConcreteDto.MarkdownText) concrete).getValue().getText();
            } else if (concrete instanceof RenderableTextDto.ConcreteDto.PlainText) {
                text = ((RenderableTextDto.ConcreteDto.PlainText) concrete).getValue().getText();
            } else if (concrete != null) {
                throw new NoWhenBranchMatchedException();
            }
            String str = text;
            if (str != null) {
                if (composeColor != null) {
                    composer.startReplaceGroup(-1506858916);
                    markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(composeTextStyle, 0, composeColor.getValue(), 0L, false, composer, BentoMarkdownText.$stable << 15, 26);
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-1506655277);
                    markdownStyleM21100withTextStylesYhh7B2I = BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(composeTextStyle, 0, 0L, 0L, false, composer, BentoMarkdownText.$stable << 15, 30);
                    composer.endReplaceGroup();
                }
                MarkdownStyle markdownStyle = markdownStyleM21100withTextStylesYhh7B2I;
                composer.startReplaceGroup(5004770);
                boolean zChangedInstance = composer.changedInstance(uriHandler);
                Object objRememberedValue = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$SduiValueProp$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiValuePropRowIdl.C207763.invoke$lambda$1$lambda$0(uriHandler, (String) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, markdownStyle, (Function0<Unit>) null, (Function1<? super String, Unit>) objRememberedValue, composer, MarkdownStyle.$stable << 6, 10);
            }
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

    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:82:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiValueProp(final ValuePropWithNumberDto valuePropWithNumber, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(valuePropWithNumber, "valuePropWithNumber");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1833777681);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(valuePropWithNumber) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1833777681, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRowIdl.kt:118)");
                }
                ValuePropContentDto content = valuePropWithNumber.getContent();
                String title = content == null ? content.getTitle() : null;
                int i6 = i3;
                BentoValuePropRow2.Number number = new BentoValuePropRow2.Number(valuePropWithNumber.getNumber());
                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-131261491, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt.SduiValueProp.5
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        RenderableTextDto content2;
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-131261491, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRowIdl.kt:122)");
                        }
                        ValuePropContentDto content3 = valuePropWithNumber.getContent();
                        String text = null;
                        ThemedColorDto content_text_color_override = content3 != null ? content3.getContent_text_color_override() : null;
                        composer2.startReplaceGroup(-1588238307);
                        Color composeColor = content_text_color_override == null ? null : SduiColors2.toComposeColor(content_text_color_override, composer2, 0);
                        composer2.endReplaceGroup();
                        ValuePropContentDto content4 = valuePropWithNumber.getContent();
                        RenderableTextDto.ConcreteDto concrete = (content4 == null || (content2 = content4.getContent()) == null) ? null : content2.getConcrete();
                        if (concrete instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                            text = ((RenderableTextDto.ConcreteDto.MarkdownText) concrete).getValue().getText();
                        } else if (concrete instanceof RenderableTextDto.ConcreteDto.PlainText) {
                            text = ((RenderableTextDto.ConcreteDto.PlainText) concrete).getValue().getText();
                        } else if (concrete != null) {
                            throw new NoWhenBranchMatchedException();
                        }
                        String str = text;
                        if (str != null) {
                            if (composeColor != null) {
                                composer2.startReplaceGroup(-1990373988);
                                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, composeColor.getValue(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 27), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                                composer2.endReplaceGroup();
                            } else {
                                composer2.startReplaceGroup(-1990125492);
                                BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                                composer2.endReplaceGroup();
                            }
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54);
                ValuePropContentDto content2 = valuePropWithNumber.getContent();
                TextWithActionDto supplemental_action = content2 == null ? content2.getSupplemental_action() : null;
                ValuePropContentDto content3 = valuePropWithNumber.getContent();
                ThemedColorDto title_text_color_override = content3 != null ? content3.getTitle_text_color_override() : null;
                int i7 = i6 << 9;
                int i8 = (i7 & 3670016) | (BentoValuePropRow2.Number.$stable << 3) | 384 | (57344 & i7) | (458752 & i7);
                ThemedColorDto themedColorDto = title_text_color_override;
                Modifier modifier5 = modifier4;
                HorizontalPadding horizontalPadding4 = horizontalPadding3;
                SduiValueProp(title, number, composableLambdaRememberComposableLambda, supplemental_action, parseAction, modifier5, horizontalPadding4, themedColorDto, composerStartRestartGroup, i8, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                horizontalPadding2 = horizontalPadding4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
                horizontalPadding2 = horizontalPadding;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiValuePropRowIdl.SduiValueProp$lambda$2(valuePropWithNumber, parseAction, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            ValuePropContentDto content4 = valuePropWithNumber.getContent();
            if (content4 == null) {
            }
            int i62 = i3;
            BentoValuePropRow2.Number number2 = new BentoValuePropRow2.Number(valuePropWithNumber.getNumber());
            ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-131261491, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt.SduiValueProp.5
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i72) {
                    RenderableTextDto content22;
                    if ((i72 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-131261491, i72, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRowIdl.kt:122)");
                    }
                    ValuePropContentDto content32 = valuePropWithNumber.getContent();
                    String text = null;
                    ThemedColorDto content_text_color_override = content32 != null ? content32.getContent_text_color_override() : null;
                    composer2.startReplaceGroup(-1588238307);
                    Color composeColor = content_text_color_override == null ? null : SduiColors2.toComposeColor(content_text_color_override, composer2, 0);
                    composer2.endReplaceGroup();
                    ValuePropContentDto content42 = valuePropWithNumber.getContent();
                    RenderableTextDto.ConcreteDto concrete = (content42 == null || (content22 = content42.getContent()) == null) ? null : content22.getConcrete();
                    if (concrete instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                        text = ((RenderableTextDto.ConcreteDto.MarkdownText) concrete).getValue().getText();
                    } else if (concrete instanceof RenderableTextDto.ConcreteDto.PlainText) {
                        text = ((RenderableTextDto.ConcreteDto.PlainText) concrete).getValue().getText();
                    } else if (concrete != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    String str = text;
                    if (str != null) {
                        if (composeColor != null) {
                            composer2.startReplaceGroup(-1990373988);
                            BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, BentoMarkdownText.INSTANCE.m21100withTextStylesYhh7B2I(null, 0, composeColor.getValue(), 0L, false, composer2, BentoMarkdownText.$stable << 15, 27), (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, MarkdownStyle.$stable << 6, 26);
                            composer2.endReplaceGroup();
                        } else {
                            composer2.startReplaceGroup(-1990125492);
                            BentoMarkdownText2.BentoMarkdownText(str, (Modifier) null, (MarkdownStyle) null, (Function0<Unit>) null, (Function1<? super String, Unit>) null, composer2, 0, 30);
                            composer2.endReplaceGroup();
                        }
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54);
            ValuePropContentDto content22 = valuePropWithNumber.getContent();
            if (content22 == null) {
            }
            ValuePropContentDto content32 = valuePropWithNumber.getContent();
            if (content32 != null) {
            }
            int i72 = i62 << 9;
            int i82 = (i72 & 3670016) | (BentoValuePropRow2.Number.$stable << 3) | 384 | (57344 & i72) | (458752 & i72);
            ThemedColorDto themedColorDto2 = title_text_color_override;
            Modifier modifier52 = modifier4;
            HorizontalPadding horizontalPadding42 = horizontalPadding3;
            SduiValueProp(title, number2, composableLambdaRememberComposableLambda2, supplemental_action, parseAction, modifier52, horizontalPadding42, themedColorDto2, composerStartRestartGroup, i82, 0);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            horizontalPadding2 = horizontalPadding42;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00b1 A[PHI: r12
      0x00b1: PHI (r12v12 int) = (r12v0 int), (r12v5 int), (r12v6 int) binds: [B:66:0x00af, B:76:0x00c7, B:75:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final <ActionT> void SduiValueProp(final String str, final BentoValuePropRow2 bentoValuePropRow2, final Function2<? super Composer, ? super Integer, Unit> function2, final TextWithActionDto textWithActionDto, final Function1<? super ActionDto, ? extends ActionT> function1, Modifier modifier, HorizontalPadding horizontalPadding, ThemedColorDto themedColorDto, Composer composer, final int i, final int i2) {
        final String str2;
        int i3;
        final BentoValuePropRow2 bentoValuePropRow22;
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i4;
        Modifier modifier2;
        int i5;
        int i6;
        ThemedColorDto themedColorDto2;
        final HorizontalPadding horizontalPadding2;
        final ThemedColorDto themedColorDto3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-358241126);
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
        } else {
            if ((i & 384) == 0) {
                function22 = function2;
                i3 |= composerStartRestartGroup.changedInstance(function22) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(textWithActionDto) ? 2048 : 1024;
            }
            if ((i2 & 16) == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 == 0) {
                i3 |= 196608;
            } else {
                if ((196608 & i) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                int i7 = 1572864;
                if (i5 != 0) {
                    i3 |= i7;
                } else if ((1572864 & i) == 0) {
                    i7 = composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 1048576 : 524288;
                    i3 |= i7;
                }
                i6 = i2 & 128;
                if (i6 == 0) {
                    if ((12582912 & i) == 0) {
                        themedColorDto2 = themedColorDto;
                        i3 |= composerStartRestartGroup.changedInstance(themedColorDto2) ? 8388608 : 4194304;
                    }
                    if ((i3 & 4793491) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                        if (i4 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        HorizontalPadding horizontalPadding3 = i5 == 0 ? HorizontalPadding.Default : horizontalPadding;
                        final ThemedColorDto themedColorDto4 = i6 == 0 ? null : themedColorDto2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-358241126, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp (SduiValuePropRowIdl.kt:160)");
                        }
                        composerStartRestartGroup.startReplaceGroup(-672324360);
                        final ComposableLambda composableLambdaRememberComposableLambda = textWithActionDto != null ? ComposableLambda3.rememberComposableLambda(-400890061, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$SduiValueProp$textButton$1$1
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
                                    ComposerKt.traceEventStart(-400890061, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRowIdl.kt:163)");
                                }
                                ActionDto action = textWithActionDto.getAction();
                                BentoTextButton2.m20715BentoTextButtonPIknLig(SduiActionHandler3.handling(action != null ? function1.invoke(action) : null, SduiActionHandler3.currentActionHandler(composer2, 0), DtoActionHandler2.currentDtoActionHandler(composer2, 0)), textWithActionDto.getText(), null, null, null, false, null, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54) : null;
                        composerStartRestartGroup.endReplaceGroup();
                        final Function2<? super Composer, ? super Integer, Unit> function23 = function22;
                        final Modifier modifier4 = modifier2;
                        UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-160196874, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt.SduiValueProp.7
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
                                    ComposerKt.traceEventStart(-160196874, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRowIdl.kt:172)");
                                }
                                BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                                ThemedColorDto themedColorDto5 = themedColorDto4;
                                composer2.startReplaceGroup(669638310);
                                Color composeColor = themedColorDto5 == null ? null : SduiColors2.toComposeColor(themedColorDto5, composer2, 0);
                                composer2.endReplaceGroup();
                                String str3 = str2;
                                final Function2<Composer, Integer, Unit> function24 = function23;
                                final Function2<Composer, Integer, Unit> function25 = composableLambdaRememberComposableLambda;
                                BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(str3, ComposableLambda3.rememberComposableLambda(-1752431019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt.SduiValueProp.7.1
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
                                            ComposerKt.traceEventStart(-1752431019, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRowIdl.kt:175)");
                                        }
                                        Function2<Composer, Integer, Unit> function26 = function24;
                                        Function2<Composer, Integer, Unit> function27 = function25;
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
                                        function26.invoke(composer3, 0);
                                        composer3.startReplaceGroup(-1367130349);
                                        if (function27 != null) {
                                            function27.invoke(composer3, 0);
                                        }
                                        composer3.endReplaceGroup();
                                        composer3.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer2, 54), bentoValuePropRow22, bentoValuePropRow, modifier4, composeColor, composer2, 3120, 0);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 18) & 14) | 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        horizontalPadding2 = horizontalPadding3;
                        themedColorDto3 = themedColorDto4;
                        modifier3 = modifier4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        modifier3 = modifier2;
                        themedColorDto3 = themedColorDto2;
                        horizontalPadding2 = horizontalPadding;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return SduiValuePropRowIdl.SduiValueProp$lambda$4(str, bentoValuePropRow2, function2, textWithActionDto, function1, modifier3, horizontalPadding2, themedColorDto3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 12582912;
                themedColorDto2 = themedColorDto;
                if ((i3 & 4793491) == 4793490) {
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    composerStartRestartGroup.startReplaceGroup(-672324360);
                    final Function2<? super Composer, ? super Integer, Unit> composableLambdaRememberComposableLambda2 = textWithActionDto != null ? ComposableLambda3.rememberComposableLambda(-400890061, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt$SduiValueProp$textButton$1$1
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
                                ComposerKt.traceEventStart(-400890061, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRowIdl.kt:163)");
                            }
                            ActionDto action = textWithActionDto.getAction();
                            BentoTextButton2.m20715BentoTextButtonPIknLig(SduiActionHandler3.handling(action != null ? function1.invoke(action) : null, SduiActionHandler3.currentActionHandler(composer2, 0), DtoActionHandler2.currentDtoActionHandler(composer2, 0)), textWithActionDto.getText(), null, null, null, false, null, composer2, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54) : null;
                    composerStartRestartGroup.endReplaceGroup();
                    final Function2<? super Composer, ? super Integer, Unit> function232 = function22;
                    final Modifier modifier42 = modifier2;
                    UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-160196874, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt.SduiValueProp.7
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
                                ComposerKt.traceEventStart(-160196874, i8, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous> (SduiValuePropRowIdl.kt:172)");
                            }
                            BentoValuePropRow bentoValuePropRow = BentoValuePropRow.Top;
                            ThemedColorDto themedColorDto5 = themedColorDto4;
                            composer2.startReplaceGroup(669638310);
                            Color composeColor = themedColorDto5 == null ? null : SduiColors2.toComposeColor(themedColorDto5, composer2, 0);
                            composer2.endReplaceGroup();
                            String str3 = str2;
                            final Function2<? super Composer, ? super Integer, Unit> function24 = function232;
                            final Function2<? super Composer, ? super Integer, Unit> function25 = composableLambdaRememberComposableLambda2;
                            BentoValuePropRow3.m21026BentoValuePropRowWithMarkdownOrRichtextFV1VA1c(str3, ComposableLambda3.rememberComposableLambda(-1752431019, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValuePropRowIdlKt.SduiValueProp.7.1
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
                                        ComposerKt.traceEventStart(-1752431019, i9, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiValueProp.<anonymous>.<anonymous> (SduiValuePropRowIdl.kt:175)");
                                    }
                                    Function2<Composer, Integer, Unit> function26 = function24;
                                    Function2<Composer, Integer, Unit> function27 = function25;
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
                                    function26.invoke(composer3, 0);
                                    composer3.startReplaceGroup(-1367130349);
                                    if (function27 != null) {
                                        function27.invoke(composer3, 0);
                                    }
                                    composer3.endReplaceGroup();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), bentoValuePropRow22, bentoValuePropRow, modifier42, composeColor, composer2, 3120, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 18) & 14) | 48);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    horizontalPadding2 = horizontalPadding3;
                    themedColorDto3 = themedColorDto4;
                    modifier3 = modifier42;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            modifier2 = modifier;
            i5 = i2 & 64;
            int i72 = 1572864;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 == 0) {
            }
            themedColorDto2 = themedColorDto;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function22 = function2;
        if ((i2 & 8) == 0) {
        }
        if ((i2 & 16) == 0) {
        }
        i4 = i2 & 32;
        if (i4 == 0) {
        }
        modifier2 = modifier;
        i5 = i2 & 64;
        int i722 = 1572864;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 == 0) {
        }
        themedColorDto2 = themedColorDto;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
