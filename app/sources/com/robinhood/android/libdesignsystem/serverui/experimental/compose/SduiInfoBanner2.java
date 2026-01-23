package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoInfoBanner2;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.models.serverdriven.experimental.api.Icon;
import com.robinhood.models.serverdriven.experimental.api.InfoBanner;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.InfoBannerDto;
import rh_server_driven_ui.p531v1.PlainTextDto;
import rh_server_driven_ui.p531v1.RenderableTextDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: SduiInfoBanner.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a;\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u00022\u0006\u0010\u0004\u001a\u00020\t2\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0006\u0012\u0004\u0018\u0001H\u00020\u000b2\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"SduiInfoBanner", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/InfoBanner;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/InfoBannerDto;", "parseAction", "Lkotlin/Function1;", "Lrh_server_driven_ui/v1/ActionDto;", "(Lrh_server_driven_ui/v1/InfoBannerDto;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "dismissed", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBannerKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiInfoBanner2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInfoBanner$lambda$5(InfoBanner infoBanner, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiInfoBanner(infoBanner, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInfoBanner$lambda$8(InfoBannerDto infoBannerDto, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiInfoBanner(infoBannerDto, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiInfoBanner(final InfoBanner<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Function0<Unit> function0Handling;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Function0 function0;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-421346220);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-421346220, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBanner (SduiInfoBanner.kt:23)");
                }
                composerStartRestartGroup.startReplaceGroup(-1186785888);
                if (component.getCta_action() == null) {
                    SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0);
                    Parcelable cta_action = component.getCta_action();
                    if (cta_action == null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    function0Handling = SduiActionHandler3.handling(sduiActionHandlerCurrentActionHandler, cta_action);
                } else {
                    function0Handling = null;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1186778109);
                if (component.getCan_dismiss()) {
                    function0 = null;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBannerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return SduiInfoBanner2.SduiInfoBanner$lambda$4$lambda$3(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    function0 = (Function0) objRememberedValue2;
                }
                composerStartRestartGroup.endReplaceGroup();
                Color composeColor = SduiColors2.toComposeColor(component.getStyle().getText_color(), composerStartRestartGroup, 0);
                Intrinsics.checkNotNull(composeColor);
                long value = composeColor.getValue();
                Color composeColor2 = SduiColors2.toComposeColor(component.getStyle().getBackground_color(), composerStartRestartGroup, 0);
                Intrinsics.checkNotNull(composeColor2);
                long value2 = composeColor2.getValue();
                if (SduiInfoBanner$lambda$1(snapshotState)) {
                    int i5 = i3;
                    Modifier modifier5 = modifier4;
                    Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(modifier5, Component.ComponentType.INFO_BANNER, component.getLogging_identifier(), false, composerStartRestartGroup, ((i5 >> 3) & 14) | 48, 4);
                    modifier3 = modifier5;
                    AnnotatedString annotatedStringM15957toAnnotatedStringiJQMabo = RichTexts2.m15957toAnnotatedStringiJQMabo(component.getText(), 0L, composerStartRestartGroup, 0, 1);
                    Icon icon = component.getIcon();
                    BentoInfoBanner2.m20654BentoInfoBannernjYn8yo(annotatedStringM15957toAnnotatedStringiJQMabo, component.getCta_text(), value, value2, modifierAutoLogEvents, icon != null ? SduiIcon2.toBentoIcon(icon) : null, function0Handling, function0, composerStartRestartGroup, BentoIcon4.$stable << 15, 0);
                } else {
                    modifier3 = modifier4;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBannerKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiInfoBanner2.SduiInfoBanner$lambda$5(component, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(-1186785888);
            if (component.getCta_action() == null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1186778109);
            if (component.getCan_dismiss()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Color composeColor3 = SduiColors2.toComposeColor(component.getStyle().getText_color(), composerStartRestartGroup, 0);
            Intrinsics.checkNotNull(composeColor3);
            long value3 = composeColor3.getValue();
            Color composeColor22 = SduiColors2.toComposeColor(component.getStyle().getBackground_color(), composerStartRestartGroup, 0);
            Intrinsics.checkNotNull(composeColor22);
            long value22 = composeColor22.getValue();
            if (SduiInfoBanner$lambda$1(snapshotState)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiInfoBanner$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiInfoBanner$lambda$4$lambda$3(SnapshotState snapshotState) {
        SduiInfoBanner$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0155  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT> void SduiInfoBanner(final InfoBannerDto component, final Function1<? super ActionDto, ? extends ActionT> parseAction, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        Function0<Unit> function0Handling;
        long jM21797getDefaultForeground0d7_KjU;
        long jM21796getDefaultBackground0d7_KjU;
        RenderableTextDto.ConcreteDto concrete;
        Modifier modifier4;
        String text;
        PlainTextDto value;
        final Modifier modifier5;
        ActionDto action;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Intrinsics.checkNotNullParameter(parseAction, "parseAction");
        Composer composerStartRestartGroup = composer.startRestartGroup(777426);
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
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(777426, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBanner (SduiInfoBanner.kt:59)");
                }
                InfoBannerDto.CtaDto cta = component.getCta();
                ActionT actiontInvoke = (cta != null || (action = cta.getAction()) == null) ? null : parseAction.invoke(action);
                composerStartRestartGroup.startReplaceGroup(747114329);
                function0Handling = actiontInvoke != null ? null : SduiActionHandler3.handling(actiontInvoke, SduiActionHandler3.currentActionHandler(composerStartRestartGroup, 0), DtoActionHandler2.currentDtoActionHandler(composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                InfoBannerDto.StyleDto style = component.getStyle();
                ThemedColorDto text_color_override = style == null ? style.getText_color_override() : null;
                composerStartRestartGroup.startReplaceGroup(747118626);
                Color composeColor = text_color_override != null ? null : SduiColors2.toComposeColor(text_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(747117515);
                jM21797getDefaultForeground0d7_KjU = composeColor != null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                InfoBannerDto.StyleDto style2 = component.getStyle();
                ThemedColorDto background_color_override = style2 == null ? style2.getBackground_color_override() : null;
                composerStartRestartGroup.startReplaceGroup(747123554);
                Color composeColor2 = background_color_override != null ? null : SduiColors2.toComposeColor(background_color_override, composerStartRestartGroup, 0);
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(747122257);
                jM21796getDefaultBackground0d7_KjU = composeColor2 != null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU() : composeColor2.getValue();
                composerStartRestartGroup.endReplaceGroup();
                RenderableTextDto text2 = component.getText();
                concrete = text2 == null ? text2.getConcrete() : null;
                if (concrete != null || (concrete instanceof RenderableTextDto.ConcreteDto.PlainText)) {
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(1686234194);
                    Modifier modifierAutoLogEvents = UtilKt.autoLogEvents(modifier4, Component.ComponentType.INFO_BANNER, component.getLogging_identifier(), false, composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 4);
                    RenderableTextDto.ConcreteDto.PlainText plainText = (RenderableTextDto.ConcreteDto.PlainText) concrete;
                    text = (plainText != null || (value = plainText.getValue()) == null) ? null : value.getText();
                    if (text == null) {
                        text = "";
                    }
                    String str = text;
                    IconDto icon = component.getIcon();
                    BentoIcon4 bentoIcon = icon == null ? SduiIcon2.toBentoIcon(icon) : null;
                    InfoBannerDto.CtaDto cta2 = component.getCta();
                    BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutoLogEvents, str, bentoIcon, cta2 != null ? cta2.getText() : null, function0Handling, null, jM21797getDefaultForeground0d7_KjU, jM21796getDefaultBackground0d7_KjU, composerStartRestartGroup, (BentoIcon4.$stable << 6) | 196608, 0);
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(concrete instanceof RenderableTextDto.ConcreteDto.MarkdownText)) {
                        composerStartRestartGroup.startReplaceGroup(747127809);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(1686924006);
                    Modifier modifierAutoLogEvents2 = UtilKt.autoLogEvents(modifier3, Component.ComponentType.INFO_BANNER, component.getLogging_identifier(), false, composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 4);
                    modifier4 = modifier3;
                    String text3 = ((RenderableTextDto.ConcreteDto.MarkdownText) concrete).getValue().getText();
                    IconDto icon2 = component.getIcon();
                    BentoInfoBanner2.m20652BentoInfoBannerRakH_j8(text3, jM21797getDefaultForeground0d7_KjU, jM21796getDefaultBackground0d7_KjU, modifierAutoLogEvents2, icon2 != null ? SduiIcon2.toBentoIcon(icon2) : null, null, function0Handling, null, composerStartRestartGroup, (BentoIcon4.$stable << 12) | 196608, 128);
                    composerStartRestartGroup.endReplaceGroup();
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier5 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier5 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiInfoBannerKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiInfoBanner2.SduiInfoBanner$lambda$8(component, parseAction, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            InfoBannerDto.CtaDto cta3 = component.getCta();
            if (cta3 != null) {
                composerStartRestartGroup.startReplaceGroup(747114329);
                if (actiontInvoke != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                InfoBannerDto.StyleDto style3 = component.getStyle();
                if (style3 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(747118626);
                if (text_color_override != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(747117515);
                jM21797getDefaultForeground0d7_KjU = composeColor != null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21797getDefaultForeground0d7_KjU() : composeColor.getValue();
                composerStartRestartGroup.endReplaceGroup();
                InfoBannerDto.StyleDto style22 = component.getStyle();
                if (style22 == null) {
                }
                composerStartRestartGroup.startReplaceGroup(747123554);
                if (background_color_override != null) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(747122257);
                jM21796getDefaultBackground0d7_KjU = composeColor2 != null ? ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getInfoBanner(composerStartRestartGroup, 0).getColors().m21796getDefaultBackground0d7_KjU() : composeColor2.getValue();
                composerStartRestartGroup.endReplaceGroup();
                RenderableTextDto text22 = component.getText();
                if (text22 == null) {
                }
                if (concrete != null) {
                    modifier4 = modifier3;
                    composerStartRestartGroup.startReplaceGroup(1686234194);
                    Modifier modifierAutoLogEvents3 = UtilKt.autoLogEvents(modifier4, Component.ComponentType.INFO_BANNER, component.getLogging_identifier(), false, composerStartRestartGroup, ((i3 >> 6) & 14) | 48, 4);
                    RenderableTextDto.ConcreteDto.PlainText plainText2 = (RenderableTextDto.ConcreteDto.PlainText) concrete;
                    if (plainText2 != null) {
                        if (text == null) {
                        }
                        String str2 = text;
                        IconDto icon3 = component.getIcon();
                        if (icon3 == null) {
                        }
                        InfoBannerDto.CtaDto cta22 = component.getCta();
                        BentoInfoBanner2.m20653BentoInfoBannerSxpAMN0(modifierAutoLogEvents3, str2, bentoIcon, cta22 != null ? cta22.getText() : null, function0Handling, null, jM21797getDefaultForeground0d7_KjU, jM21796getDefaultBackground0d7_KjU, composerStartRestartGroup, (BentoIcon4.$stable << 6) | 196608, 0);
                        composerStartRestartGroup.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier5 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final boolean SduiInfoBanner$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
