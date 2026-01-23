package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.annotation.SuppressLint;
import android.os.Parcelable;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.Shadow;
import androidx.compose.p011ui.graphics.drawscope.DrawScope2;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.text.PlatformSpanStyle;
import androidx.compose.p011ui.text.SpanStyle;
import androidx.compose.p011ui.text.font.FontFamily;
import androidx.compose.p011ui.text.font.FontStyle;
import androidx.compose.p011ui.text.font.FontSynthesis;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.intl.LocaleList;
import androidx.compose.p011ui.text.style.BaselineShift;
import androidx.compose.p011ui.text.style.TextDecoration;
import androidx.compose.p011ui.text.style.TextGeometricTransform;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoPogBackgroundOverride;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.models.serverdriven.experimental.api.NavigationRow;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithEndText;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithIcon;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithIconAndEndText;
import com.robinhood.models.serverdriven.experimental.api.NavigationRowWithPhotoAndEndText;
import com.robinhood.models.serverdriven.experimental.api.RichText;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.MetaElementDto;
import rh_server_driven_ui.p531v1.NavigationRowDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.StartElementDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiNavigationRow.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a9\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n\u001aG\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\u000b2\u0016\u0010\f\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0007¢\u0006\u0002\u0010\u000f\u001a9\u0010\u0010\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00112\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0012\u001a9\u0010\u0013\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00142\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0015\u001a9\u0010\u0016\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00172\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u0018\u001a9\u0010\u0019\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u001a2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\u001b\u001a\u001b\u0010\u001c\u001a\u00020\u0007*\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eH\u0003¢\u0006\u0002\u0010\u001f¨\u0006 "}, m3636d2 = {"SduiNavigationRow", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/NavigationRow;", "modifier", "Landroidx/compose/ui/Modifier;", "horizontalPadding", "Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;", "(Lcom/robinhood/models/serverdriven/experimental/api/NavigationRow;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/NavigationRowDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "(Lrh_server_driven_ui/v1/NavigationRowDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiNavigationRowWithIcon", "Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithIcon;", "(Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithIcon;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiNavigationRowWithEndText", "Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithEndText;", "(Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithEndText;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiNavigationRowWithIconAndEndText", "Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithIconAndEndText;", "(Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithIconAndEndText;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "SduiNavigationRowWithPhotoAndEndText", "Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithPhotoAndEndText;", "(Lcom/robinhood/models/serverdriven/experimental/api/NavigationRowWithPhotoAndEndText;Landroidx/compose/ui/Modifier;Lcom/robinhood/models/serverdriven/experimental/ui/HorizontalPadding;Landroidx/compose/runtime/Composer;II)V", "autoLogEvents", "identifier", "", "(Landroidx/compose/ui/Modifier;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiNavigationRow2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNavigationRow$lambda$0(NavigationRow navigationRow, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiNavigationRow(navigationRow, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNavigationRow$lambda$7(NavigationRowDto navigationRowDto, Function1 function1, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiNavigationRow(navigationRowDto, function1, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNavigationRowWithEndText$lambda$9(NavigationRowWithEndText navigationRowWithEndText, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiNavigationRowWithEndText(navigationRowWithEndText, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNavigationRowWithIcon$lambda$8(NavigationRowWithIcon navigationRowWithIcon, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiNavigationRowWithIcon(navigationRowWithIcon, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNavigationRowWithIconAndEndText$lambda$10(NavigationRowWithIconAndEndText navigationRowWithIconAndEndText, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiNavigationRowWithIconAndEndText(navigationRowWithIconAndEndText, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiNavigationRowWithPhotoAndEndText$lambda$11(NavigationRowWithPhotoAndEndText navigationRowWithPhotoAndEndText, Modifier modifier, HorizontalPadding horizontalPadding, int i, int i2, Composer composer, int i3) {
        SduiNavigationRowWithPhotoAndEndText(navigationRowWithPhotoAndEndText, modifier, horizontalPadding, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final <ActionT extends Parcelable> void SduiNavigationRow(final NavigationRow<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-763797131);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-763797131, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRow (SduiNavigationRow.kt:34)");
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(760564433, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt.SduiNavigationRow.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(760564433, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRow.<anonymous> (SduiNavigationRow.kt:36)");
                    }
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(SduiNavigationRow2.autoLogEvents(modifier, component.getLogging_identifier(), composer2, 0), null, component.getTitle(), component.getSubtitle(), null, null, null, false, component.is_enabled(), false, 0L, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), component.getAction()), composer2, 0, 0, 1778);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiNavigationRow2.SduiNavigationRow$lambda$0(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0256  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x013f  */
    /* JADX WARN: Type inference failed for: r5v8, types: [com.robinhood.compose.bento.component.rows.BentoBaseRowState$Meta] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiNavigationRow(final NavigationRowDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        int i5;
        RenderableTextDto.ConcreteDto concrete;
        BentoBaseRowState.Text plain;
        RenderableTextDto.ConcreteDto concrete2;
        BentoBaseRowState.Text markdownV2;
        StartElementDto.ConcreteDto concrete3;
        StartElementDto.ConcreteDto.TextPog textPog;
        Color color;
        BentoPogBackgroundOverride.ColorOverride colorOverride;
        BentoBaseRowState.Start textPog2;
        Color color2;
        BentoBaseRowState.Start start;
        Color color3;
        Object concrete4;
        String text;
        Object icon;
        Object singleLine;
        final Modifier modifier3;
        final HorizontalPadding horizontalPadding2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(1386391999);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(parseAction) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 2048 : 1024;
            }
            i5 = i3;
            if ((i5 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                HorizontalPadding horizontalPadding3 = i4 == 0 ? HorizontalPadding.Default : horizontalPadding;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1386391999, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRow (SduiNavigationRow.kt:52)");
                }
                RenderableTextDto title = component.getTitle();
                concrete = title == null ? title.getConcrete() : null;
                if (!(concrete instanceof RenderableTextDto.ConcreteDto.PlainText)) {
                    plain = new BentoBaseRowState.Text.Plain(((RenderableTextDto.ConcreteDto.PlainText) concrete).getValue().getText());
                } else if (concrete instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                    plain = new BentoBaseRowState.Text.MarkdownV2(((RenderableTextDto.ConcreteDto.MarkdownText) concrete).getValue().getText());
                } else {
                    if (concrete != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    plain = new BentoBaseRowState.Text.Plain("");
                }
                RenderableTextDto subtitle = component.getSubtitle();
                concrete2 = subtitle == null ? subtitle.getConcrete() : null;
                if (!(concrete2 instanceof RenderableTextDto.ConcreteDto.PlainText)) {
                    markdownV2 = new BentoBaseRowState.Text.Plain(((RenderableTextDto.ConcreteDto.PlainText) concrete2).getValue().getText());
                } else if (concrete2 instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                    markdownV2 = new BentoBaseRowState.Text.MarkdownV2(((RenderableTextDto.ConcreteDto.MarkdownText) concrete2).getValue().getText());
                } else {
                    if (concrete2 != null) {
                        throw new NoWhenBranchMatchedException();
                    }
                    markdownV2 = null;
                }
                StartElementDto start2 = component.getStart();
                concrete3 = start2 == null ? start2.getConcrete() : null;
                composerStartRestartGroup.startReplaceGroup(882883408);
                if (concrete3 != null) {
                    color3 = null;
                    start = null;
                } else {
                    if (concrete3 instanceof StartElementDto.ConcreteDto.Icon) {
                        composerStartRestartGroup.startReplaceGroup(-1791189525);
                        composerStartRestartGroup.endReplaceGroup();
                        ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(((StartElementDto.ConcreteDto.Icon) concrete3).getValue());
                        textPog2 = bentoAsset != null ? new BentoBaseRowState.Start.Icon(bentoAsset, null, null, 6, null) : null;
                    } else if (concrete3 instanceof StartElementDto.ConcreteDto.NumberPog) {
                        composerStartRestartGroup.startReplaceGroup(-1858889863);
                        composerStartRestartGroup.endReplaceGroup();
                        textPog2 = new BentoBaseRowState.Start.NumberPog(((StartElementDto.ConcreteDto.NumberPog) concrete3).getValue().getNumber());
                    } else if (concrete3 instanceof StartElementDto.ConcreteDto.PictogramPog) {
                        composerStartRestartGroup.startReplaceGroup(-1858885674);
                        StartElementDto.ConcreteDto.PictogramPog pictogramPog = (StartElementDto.ConcreteDto.PictogramPog) concrete3;
                        ServerToBentoAssetMapper3 pictogramAsset = SduiPictogram2.toPictogramAsset(pictogramPog.getValue().getPictogram());
                        ThemedColorDto foreground_color_override = pictogramPog.getValue().getForeground_color_override();
                        composerStartRestartGroup.startReplaceGroup(-1858880797);
                        Color composeColor = foreground_color_override == null ? null : SduiColors2.toComposeColor(foreground_color_override, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        ThemedColorDto background_color_override = pictogramPog.getValue().getBackground_color_override();
                        textPog2 = new BentoBaseRowState.Start.PictogramPog(pictogramAsset, composeColor, background_color_override == null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0), null);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(concrete3 instanceof StartElementDto.ConcreteDto.TextPog)) {
                            composerStartRestartGroup.startReplaceGroup(-1858897529);
                            composerStartRestartGroup.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composerStartRestartGroup.startReplaceGroup(-1858873669);
                        StartElementDto.ConcreteDto.TextPog textPog3 = (StartElementDto.ConcreteDto.TextPog) concrete3;
                        String text2 = textPog3.getValue().getText();
                        ThemedColorDto foreground_color_override2 = textPog3.getValue().getForeground_color_override();
                        composerStartRestartGroup.startReplaceGroup(-1858869885);
                        Color composeColor2 = foreground_color_override2 == null ? null : SduiColors2.toComposeColor(foreground_color_override2, composerStartRestartGroup, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        ThemedColorDto background_color_override2 = textPog3.getValue().getBackground_color_override();
                        Color composeColor3 = background_color_override2 == null ? null : SduiColors2.toComposeColor(background_color_override2, composerStartRestartGroup, 0);
                        if (composeColor3 != null) {
                            textPog = textPog3;
                            color = null;
                            colorOverride = new BentoPogBackgroundOverride.ColorOverride(composeColor3.getValue(), null);
                        } else {
                            textPog = textPog3;
                            color = null;
                            colorOverride = null;
                        }
                        textPog2 = new BentoBaseRowState.Start.TextPog(text2, composeColor2, colorOverride, SduiPog.toBentoPogSize(textPog.getValue().getSize()), null);
                        composerStartRestartGroup.endReplaceGroup();
                        color2 = color;
                        start = textPog2;
                        color3 = color2;
                    }
                    color2 = null;
                    start = textPog2;
                    color3 = color2;
                }
                composerStartRestartGroup.endReplaceGroup();
                MetaElementDto meta = component.getMeta();
                concrete4 = meta == null ? meta.getConcrete() : color3;
                composerStartRestartGroup.startReplaceGroup(882924129);
                if (concrete4 != null) {
                    icon = color3;
                } else {
                    composerStartRestartGroup.startReplaceGroup(882924805);
                    if (concrete4 instanceof MetaElementDto.ConcreteDto.Icon) {
                        MetaElementDto.ConcreteDto.Icon icon2 = (MetaElementDto.ConcreteDto.Icon) concrete4;
                        ServerToBentoAssetMapper2 bentoAsset2 = SduiIcon2.toBentoAsset(icon2.getValue().getIcon());
                        singleLine = color3;
                        if (bentoAsset2 != null) {
                            ThemedColorDto tint = icon2.getValue().getTint();
                            composerStartRestartGroup.startReplaceGroup(-746713665);
                            Color composeColor4 = color3;
                            if (tint != null) {
                                composeColor4 = SduiColors2.toComposeColor(tint, composerStartRestartGroup, 0);
                            }
                            Color color4 = composeColor4;
                            composerStartRestartGroup.endReplaceGroup();
                            String accessibilty_label = icon2.getValue().getAccessibilty_label();
                            icon = new BentoBaseRowState.Meta.Icon(bentoAsset2, accessibilty_label == null ? "" : accessibilty_label, color4, (Function0) null, 8, (DefaultConstructorMarker) null);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        if (!(concrete4 instanceof MetaElementDto.ConcreteDto.Text)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        RenderableTextDto text3 = ((MetaElementDto.ConcreteDto.Text) concrete4).getValue().getText();
                        singleLine = color3;
                        if (text3 != null) {
                            RenderableTextDto.ConcreteDto concrete5 = text3.getConcrete();
                            singleLine = color3;
                            if (concrete5 != null) {
                                if (concrete5 instanceof RenderableTextDto.ConcreteDto.MarkdownText) {
                                    text = ((RenderableTextDto.ConcreteDto.MarkdownText) concrete5).getValue().getText();
                                } else {
                                    if (!(concrete5 instanceof RenderableTextDto.ConcreteDto.PlainText)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    text = ((RenderableTextDto.ConcreteDto.PlainText) concrete5).getValue().getText();
                                }
                                singleLine = new BentoBaseRowState.Meta.SingleLine(text);
                            }
                        }
                    }
                    icon = singleLine;
                    composerStartRestartGroup.endReplaceGroup();
                }
                composerStartRestartGroup.endReplaceGroup();
                final Modifier modifier5 = modifier4;
                final BentoBaseRowState.Text text4 = plain;
                final ?? r5 = icon;
                final BentoBaseRowState.Text text5 = markdownV2;
                final BentoBaseRowState.Start start3 = start;
                UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-1143089693, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt.SduiNavigationRow.3
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
                            ComposerKt.traceEventStart(-1143089693, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRow.<anonymous> (SduiNavigationRow.kt:119)");
                        }
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SduiNavigationRow2.autoLogEvents(modifier5, component.getLogging_identifier(), composer2, 0), new BentoBaseRowState(start3, text4, text5, r5, null, !component.is_disabled(), false, 80, null), false, false, false, 0L, SduiActionHandler3.handling(parseAction.invoke(component.getAction()), SduiActionHandler3.currentActionHandler(composer2, 0), DtoActionHandler2.currentDtoActionHandler(composer2, 0)), composer2, BentoBaseRowState.$stable << 3, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 9) & 14) | 48);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
                horizontalPadding2 = horizontalPadding3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                horizontalPadding2 = horizontalPadding;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiNavigationRow2.SduiNavigationRow$lambda$7(component, parseAction, modifier3, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
        i5 = i3;
        if ((i5 & 1171) == 1170) {
            if (i6 == 0) {
            }
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RenderableTextDto title2 = component.getTitle();
            if (title2 == null) {
            }
            if (!(concrete instanceof RenderableTextDto.ConcreteDto.PlainText)) {
            }
            RenderableTextDto subtitle2 = component.getSubtitle();
            if (subtitle2 == null) {
            }
            if (!(concrete2 instanceof RenderableTextDto.ConcreteDto.PlainText)) {
            }
            StartElementDto start22 = component.getStart();
            if (start22 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(882883408);
            if (concrete3 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            MetaElementDto meta2 = component.getMeta();
            if (meta2 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(882924129);
            if (concrete4 != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            final Modifier modifier52 = modifier4;
            final BentoBaseRowState.Text text42 = plain;
            final BentoBaseRowState.Meta r52 = icon;
            final BentoBaseRowState.Text text52 = markdownV2;
            final BentoBaseRowState.Start start32 = start;
            UtilKt.SduiHorizontalPadding(horizontalPadding3, ComposableLambda3.rememberComposableLambda(-1143089693, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt.SduiNavigationRow.3
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
                        ComposerKt.traceEventStart(-1143089693, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRow.<anonymous> (SduiNavigationRow.kt:119)");
                    }
                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(SduiNavigationRow2.autoLogEvents(modifier52, component.getLogging_identifier(), composer2, 0), new BentoBaseRowState(start32, text42, text52, r52, null, !component.is_disabled(), false, 80, null), false, false, false, 0L, SduiActionHandler3.handling(parseAction.invoke(component.getAction()), SduiActionHandler3.currentActionHandler(composer2, 0), DtoActionHandler2.currentDtoActionHandler(composer2, 0)), composer2, BentoBaseRowState.$stable << 3, 60);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i5 >> 9) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
            horizontalPadding2 = horizontalPadding3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    public static final <ActionT extends Parcelable> void SduiNavigationRowWithIcon(final NavigationRowWithIcon<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1715457613);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1715457613, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithIcon (SduiNavigationRow.kt:138)");
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(1991631631, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt.SduiNavigationRowWithIcon.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1991631631, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithIcon.<anonymous> (SduiNavigationRow.kt:140)");
                    }
                    Modifier modifierAutoLogEvents = SduiNavigationRow2.autoLogEvents(modifier, component.getLogging_identifier(), composer2, 0);
                    String title = component.getTitle();
                    String subtitle = component.getSubtitle();
                    ServerToBentoAssetMapper2 bentoAsset = SduiIcon2.toBentoAsset(component.getIcon());
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents, bentoAsset != null ? new BentoBaseRowState.Start.Icon(bentoAsset, null, null, 6, null) : null, title, subtitle, null, null, null, false, component.is_enabled(), false, 0L, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), component.getAction()), composer2, BentoBaseRowState.Start.Icon.$stable << 3, 0, 1776);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiNavigationRow2.SduiNavigationRowWithIcon$lambda$8(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT extends Parcelable> void SduiNavigationRowWithEndText(final NavigationRowWithEndText<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1660163079);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1660163079, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithEndText (SduiNavigationRow.kt:156)");
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(1609967701, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt.SduiNavigationRowWithEndText.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1609967701, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithEndText.<anonymous> (SduiNavigationRow.kt:158)");
                    }
                    Modifier modifierAutoLogEvents = SduiNavigationRow2.autoLogEvents(modifier, component.getLogging_identifier(), composer2, 0);
                    String title = component.getTitle();
                    String subtitle = component.getSubtitle();
                    String markdown_subtitle = component.getMarkdown_subtitle();
                    composer2.startReplaceGroup(990744815);
                    NavigationRowWithEndText<ActionT> navigationRowWithEndText = component;
                    AnnotatedString.Builder builder = new AnnotatedString.Builder(0, 1, null);
                    ThemedColor metadata_text_color = navigationRowWithEndText.getMetadata_text_color();
                    composer2.startReplaceGroup(990746949);
                    Color composeColor = metadata_text_color != null ? SduiColors2.toComposeColor(metadata_text_color, composer2, 0) : null;
                    composer2.endReplaceGroup();
                    if (composeColor != null) {
                        builder.pushStyle(new SpanStyle(composeColor.getValue(), 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, (PlatformSpanStyle) null, (DrawScope2) null, 65534, (DefaultConstructorMarker) null));
                    }
                    builder.append(navigationRowWithEndText.getMetadata_text());
                    Unit unit = Unit.INSTANCE;
                    AnnotatedString annotatedString = builder.toAnnotatedString();
                    composer2.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents, null, title, subtitle, markdown_subtitle, new BentoBaseRowState.Meta.SingleLine(annotatedString), null, false, component.is_enabled(), false, 0L, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), component.getAction()), composer2, BentoBaseRowState.Meta.SingleLine.$stable << 15, 0, 1730);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiNavigationRow2.SduiNavigationRowWithEndText$lambda$9(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT extends Parcelable> void SduiNavigationRowWithIconAndEndText(final NavigationRowWithIconAndEndText<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(244559317);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(244559317, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithIconAndEndText (SduiNavigationRow.kt:182)");
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(666835249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt.SduiNavigationRowWithIconAndEndText.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(666835249, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithIconAndEndText.<anonymous> (SduiNavigationRow.kt:184)");
                    }
                    Modifier modifierAutoLogEvents = SduiNavigationRow2.autoLogEvents(modifier, component.getLogging_identifier(), composer2, 0);
                    String title = component.getTitle();
                    String subtitle = component.getSubtitle();
                    ServerToBentoAssetMapper2 iconAsset = UtilKt.getIconAsset(component.getIcon());
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents, iconAsset != null ? new BentoBaseRowState.Start.Icon(iconAsset, null, null, 6, null) : null, title, subtitle, null, new BentoBaseRowState.Meta.SingleLine(component.getMetadata_text()), null, false, component.is_enabled(), false, 0L, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer2, 0), component.getAction()), composer2, (BentoBaseRowState.Start.Icon.$stable << 3) | (BentoBaseRowState.Meta.SingleLine.$stable << 15), 0, 1744);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiNavigationRow2.SduiNavigationRowWithIconAndEndText$lambda$10(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final <ActionT extends Parcelable> void SduiNavigationRowWithPhotoAndEndText(final NavigationRowWithPhotoAndEndText<? extends ActionT> component, final Modifier modifier, HorizontalPadding horizontalPadding, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(2073753945);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(horizontalPadding == null ? -1 : horizontalPadding.ordinal()) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (i5 != 0) {
                horizontalPadding = HorizontalPadding.Default;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2073753945, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithPhotoAndEndText (SduiNavigationRow.kt:201)");
            }
            UtilKt.SduiHorizontalPadding(horizontalPadding, ComposableLambda3.rememberComposableLambda(-140968523, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt.SduiNavigationRowWithPhotoAndEndText.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    BentoBaseRowState.Start textPog;
                    Composer composer3 = composer2;
                    if ((i6 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-140968523, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowWithPhotoAndEndText.<anonymous> (SduiNavigationRow.kt:203)");
                    }
                    Modifier modifierAutoLogEvents = SduiNavigationRow2.autoLogEvents(modifier, component.getLogging_identifier(), composer3, 0);
                    AnnotatedString annotatedStringM15957toAnnotatedStringiJQMabo = RichTexts2.m15957toAnnotatedStringiJQMabo(component.getTitle(), 0L, composer3, 0, 1);
                    RichText subtitle = component.getSubtitle();
                    composer3.startReplaceGroup(1968209672);
                    BentoBaseRowState.Meta singleLine = null;
                    AnnotatedString annotatedStringM15957toAnnotatedStringiJQMabo2 = subtitle == null ? null : RichTexts2.m15957toAnnotatedStringiJQMabo(subtitle, 0L, composer3, 0, 1);
                    composer3.endReplaceGroup();
                    String photo_url = component.getPhoto_url();
                    if (photo_url != null) {
                        textPog = new BentoBaseRowState.Start.Image(photo_url, "", BentoBaseRowState.Start.Image.ImageSize.Standard, ContentScale.INSTANCE.getCrop(), RoundedCornerShape2.getCircleShape(), component.getBackup_photo_text());
                    } else {
                        String backup_photo_text = component.getBackup_photo_text();
                        textPog = backup_photo_text != null ? new BentoBaseRowState.Start.TextPog(backup_photo_text, null, null, null, 14, null) : null;
                    }
                    RichText metadata_subtitle = component.getMetadata_subtitle();
                    String text = metadata_subtitle != null ? metadata_subtitle.getText() : null;
                    if (text != null && !StringsKt.isBlank(text)) {
                        composer3.startReplaceGroup(1968231700);
                        AnnotatedString annotatedStringM15957toAnnotatedStringiJQMabo3 = RichTexts2.m15957toAnnotatedStringiJQMabo(component.getMetadata_title(), 0L, composer3, 0, 1);
                        RichText metadata_subtitle2 = component.getMetadata_subtitle();
                        Intrinsics.checkNotNull(metadata_subtitle2);
                        composer3 = composer2;
                        singleLine = new BentoBaseRowState.Meta.TwoLine(annotatedStringM15957toAnnotatedStringiJQMabo3, RichTexts2.m15957toAnnotatedStringiJQMabo(metadata_subtitle2, 0L, composer3, 0, 1));
                        composer3.endReplaceGroup();
                    } else if (StringsKt.isBlank(component.getMetadata_title().getText())) {
                        composer3.startReplaceGroup(886065288);
                        composer3.endReplaceGroup();
                    } else {
                        composer3.startReplaceGroup(1968241155);
                        singleLine = new BentoBaseRowState.Meta.SingleLine(RichTexts2.m15957toAnnotatedStringiJQMabo(component.getMetadata_title(), 0L, composer3, 0, 1));
                        composer3.endReplaceGroup();
                    }
                    BentoBaseRowKt.m20914BentoBaseRowbcLT7KE(modifierAutoLogEvents, textPog, annotatedStringM15957toAnnotatedStringiJQMabo, annotatedStringM15957toAnnotatedStringiJQMabo2, null, singleLine, null, false, false, false, component.is_enabled(), false, 0L, SduiActionHandler3.handling(SduiActionHandler3.currentActionHandler(composer3, 0), component.getAction()), composer2, (BentoBaseRowState.Start.$stable << 3) | (BentoBaseRowState.Meta.$stable << 15), 0, 7120);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 6) & 14) | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        final HorizontalPadding horizontalPadding2 = horizontalPadding;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiNavigationRowKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SduiNavigationRow2.SduiNavigationRowWithPhotoAndEndText$lambda$11(component, modifier2, horizontalPadding2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    @SuppressLint({"ComposableModifierFactory"})
    public static final Modifier autoLogEvents(Modifier modifier, String str, Composer composer, int i) {
        composer.startReplaceGroup(-331810393);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-331810393, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.autoLogEvents (SduiNavigationRow.kt:241)");
        }
        Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(modifier, Component.ComponentType.ROW, str, false, composer, (i & 14) | 48 | ((i << 3) & 896), 4);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return modifierAutoLogEvents;
    }
}
