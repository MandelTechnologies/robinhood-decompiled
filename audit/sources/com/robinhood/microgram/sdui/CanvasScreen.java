package com.robinhood.microgram.sdui;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.LayoutCoordinates;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.layout.OnGloballyPositionedModifier3;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.unit.IntSize;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumnsIdl;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler2;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiStateHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.LocalDimensionTracker2;
import com.robinhood.android.libdesignsystem.serverui.experimental.position.ModifiersKt;
import com.robinhood.android.microgramsdui.Colors4;
import com.robinhood.android.shared.serverui.utils.UiObject;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.microgram.sdui.CanvasScreen;
import com.robinhood.microgram.sdui.MicrogramScreenDuxo2;
import com.robinhood.microgram.sdui.NavigationBarConfiguration;
import com.robinhood.models.serverdriven.experimental.api.ComponentState;
import com.robinhood.models.serverdriven.experimental.api.ThemedColor;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.HtmlCanvasScreenContentDto;
import microgram.p507ui.p508v1.NavigationBarConfigurationDto;
import microgram.p507ui.p508v1.screen_events.HtmlCanvasAvailableAreaMessageDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: CanvasScreen.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a¡\u0001\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0014\b\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0014\b\u0002\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u00102\u001e\u0010\u0014\u001a\u001a\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00160\u0015\u0012\u0004\u0012\u00020\u00010\u0010H\u0007¢\u0006\u0002\u0010\u0017\u001ak\u0010\u0018\u001a\u00020\u00012\u0016\u0010\u0002\u001a\u0012\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003j\u0002`\u00062\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0013\u0012\u0004\u0012\u00020\u00010\u0010H\u0003¢\u0006\u0002\u0010\u001b\"\u000e\u0010\u001c\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001d\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u001e\u001a\u00020\u0011X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u001f²\u0006\f\u0010\u0019\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\f\u0010 \u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002²\u0006\f\u0010!\u001a\u0004\u0018\u00010\u001aX\u008a\u008e\u0002"}, m3636d2 = {"CanvasScreen", "", "screen", "Lcom/robinhood/android/shared/serverui/utils/UiObject;", "Lcom/robinhood/microgram/sdui/HtmlCanvasScreen;", "Lmicrogram/ui/v1/HtmlCanvasScreenContentDto;", "Lcom/robinhood/microgram/sdui/AnyHtmlCanvasScreen;", "onBackClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "invokeJavascriptRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;", "shareScreenshotRequest", "Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;", "onHtmlCanvasCustomMessage", "Lkotlin/Function1;", "", "onHtmlCanvasAvailableAreaMessage", "Lmicrogram/ui/v1/screen_events/HtmlCanvasAvailableAreaMessageDto;", "onStateChange", "", "Lcom/robinhood/models/serverdriven/experimental/api/ComponentState;", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "Content", "navigationBarArea", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$PositionData;", "(Lcom/robinhood/android/shared/serverui/utils/UiObject;Lcom/robinhood/microgram/sdui/ScreenEvent$InvokeJavascript;Lcom/robinhood/microgram/sdui/ScreenEvent$ShareScreenshotRequest;Lcom/robinhood/android/libdesignsystem/serverui/experimental/position/DimensionTracker$PositionData;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "NAV_BAR_CONTAINER_VIEW_ID", "MAIN_CONTAINER_VIEW_ID", "FOOTER_CONTAINER_VIEW_ID", "feature-microgram-sdui_externalDebug", "availableContentArea", "clientWindowArea"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.microgram.sdui.CanvasScreenKt, reason: use source file name */
/* loaded from: classes13.dex */
public final class CanvasScreen {
    private static final String FOOTER_CONTAINER_VIEW_ID = "_canvas_content_screen_footer";
    private static final String MAIN_CONTAINER_VIEW_ID = "_canvas_content_screen_column";
    private static final String NAV_BAR_CONTAINER_VIEW_ID = "_canvas_content_screen_nav_bar";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CanvasScreen$lambda$4(UiObject uiObject, Function0 function0, Modifier modifier, MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, Function1 function1, Function1 function12, Function1 function13, int i, int i2, Composer composer, int i3) {
        CanvasScreen(uiObject, function0, modifier, invokeJavascript, shareScreenshotRequest, function1, function12, function13, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$21(UiObject uiObject, MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, LocalDimensionTracker.PositionData positionData, Function1 function1, Function1 function12, int i, Composer composer, int i2) {
        Content(uiObject, invokeJavascript, shareScreenshotRequest, positionData, function1, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CanvasScreen$lambda$1$lambda$0(String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CanvasScreen$lambda$3$lambda$2(HtmlCanvasAvailableAreaMessageDto it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01d4  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01e2  */
    /* JADX WARN: Removed duplicated region for block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CanvasScreen(final UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> screen, final Function0<Unit> onBackClick, Modifier modifier, MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, Function1<? super String, Unit> function1, Function1<? super HtmlCanvasAvailableAreaMessageDto, Unit> function12, final Function1<? super Map<String, ? extends ComponentState>, Unit> onStateChange, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        MicrogramScreenDuxo2.InvokeJavascript invokeJavascript2;
        int i5;
        MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest2;
        int i6;
        Function1<? super String, Unit> function13;
        int i7;
        Function1<? super String, Unit> function14;
        Function1<? super HtmlCanvasAvailableAreaMessageDto, Unit> function15;
        final Modifier modifier3;
        final MicrogramScreenDuxo2.InvokeJavascript invokeJavascript3;
        final MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest3;
        final Function1<? super String, Unit> function16;
        final Function1<? super HtmlCanvasAvailableAreaMessageDto, Unit> function17;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onStateChange, "onStateChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2074953465);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    invokeJavascript2 = invokeJavascript;
                    i3 |= composerStartRestartGroup.changedInstance(invokeJavascript2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        shareScreenshotRequest2 = shareScreenshotRequest;
                        i3 |= composerStartRestartGroup.changedInstance(shareScreenshotRequest2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 != 0) {
                        if ((196608 & i) == 0) {
                            function13 = function1;
                            i3 |= composerStartRestartGroup.changedInstance(function13) ? 131072 : 65536;
                        }
                        i7 = i2 & 64;
                        if (i7 != 0) {
                            i3 |= 1572864;
                        } else if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(function12) ? 1048576 : 524288;
                        }
                        if ((i2 & 128) != 0) {
                            i3 |= 12582912;
                        } else if ((i & 12582912) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(onStateChange) ? 8388608 : 4194304;
                        }
                        if ((4793491 & i3) != 4793490 || !composerStartRestartGroup.getSkipping()) {
                            Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                            MicrogramScreenDuxo2.InvokeJavascript invokeJavascript4 = i4 == 0 ? null : invokeJavascript2;
                            MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest4 = i5 == 0 ? null : shareScreenshotRequest2;
                            if (i6 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CanvasScreen.CanvasScreen$lambda$1$lambda$0((String) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function14 = (Function1) objRememberedValue;
                            } else {
                                function14 = function13;
                            }
                            if (i7 == 0) {
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return CanvasScreen.CanvasScreen$lambda$3$lambda$2((HtmlCanvasAvailableAreaMessageDto) obj);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                function15 = (Function1) objRememberedValue2;
                            } else {
                                function15 = function12;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2074953465, i3, -1, "com.robinhood.microgram.sdui.CanvasScreen (CanvasScreen.kt:44)");
                            }
                            UiObject<ThemedColor, ThemedColorDto> backgroundColor = HtmlCanvasScreen2.getBackgroundColor(screen);
                            composerStartRestartGroup.startReplaceGroup(-1165437801);
                            Color composeColor = backgroundColor != null ? Colors4.toComposeColor(backgroundColor, composerStartRestartGroup, 0) : null;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(-1165438521);
                            long jM21371getBg0d7_KjU = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier5 = modifier4;
                            CompositionLocal3.CompositionLocalProvider(SduiStateHandler2.getLocalStateHandler().provides(new SduiStateHandler3(onStateChange)), ComposableLambda3.rememberComposableLambda(1186385351, true, new C349843(screen, modifier5, jM21371getBg0d7_KjU, onBackClick, invokeJavascript4, shareScreenshotRequest4, function14, function15), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                            invokeJavascript3 = invokeJavascript4;
                            shareScreenshotRequest3 = shareScreenshotRequest4;
                            function16 = function14;
                            function17 = function15;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                            invokeJavascript3 = invokeJavascript2;
                            shareScreenshotRequest3 = shareScreenshotRequest2;
                            function16 = function13;
                            function17 = function12;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CanvasScreen.CanvasScreen$lambda$4(screen, onBackClick, modifier3, invokeJavascript3, shareScreenshotRequest3, function16, function17, onStateChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 196608;
                    function13 = function1;
                    i7 = i2 & 64;
                    if (i7 != 0) {
                    }
                    if ((i2 & 128) != 0) {
                    }
                    if ((4793491 & i3) != 4793490) {
                        if (i8 == 0) {
                        }
                        if (i4 == 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        UiObject<ThemedColor, ThemedColorDto> backgroundColor2 = HtmlCanvasScreen2.getBackgroundColor(screen);
                        composerStartRestartGroup.startReplaceGroup(-1165437801);
                        if (backgroundColor2 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1165438521);
                        long jM21371getBg0d7_KjU2 = composeColor != null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        CompositionLocal3.CompositionLocalProvider(SduiStateHandler2.getLocalStateHandler().provides(new SduiStateHandler3(onStateChange)), ComposableLambda3.rememberComposableLambda(1186385351, true, new C349843(screen, modifier52, jM21371getBg0d7_KjU2, onBackClick, invokeJavascript4, shareScreenshotRequest4, function14, function15), composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                        invokeJavascript3 = invokeJavascript4;
                        shareScreenshotRequest3 = shareScreenshotRequest4;
                        function16 = function14;
                        function17 = function15;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                shareScreenshotRequest2 = shareScreenshotRequest;
                i6 = i2 & 32;
                if (i6 != 0) {
                }
                function13 = function1;
                i7 = i2 & 64;
                if (i7 != 0) {
                }
                if ((i2 & 128) != 0) {
                }
                if ((4793491 & i3) != 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            invokeJavascript2 = invokeJavascript;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            shareScreenshotRequest2 = shareScreenshotRequest;
            i6 = i2 & 32;
            if (i6 != 0) {
            }
            function13 = function1;
            i7 = i2 & 64;
            if (i7 != 0) {
            }
            if ((i2 & 128) != 0) {
            }
            if ((4793491 & i3) != 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        invokeJavascript2 = invokeJavascript;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        shareScreenshotRequest2 = shareScreenshotRequest;
        i6 = i2 & 32;
        if (i6 != 0) {
        }
        function13 = function1;
        i7 = i2 & 64;
        if (i7 != 0) {
        }
        if ((i2 & 128) != 0) {
        }
        if ((4793491 & i3) != 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* compiled from: CanvasScreen.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.microgram.sdui.CanvasScreenKt$CanvasScreen$3 */
    static final class C349843 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ long $backgroundColor;
        final /* synthetic */ MicrogramScreenDuxo2.InvokeJavascript $invokeJavascriptRequest;
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onBackClick;
        final /* synthetic */ Function1<HtmlCanvasAvailableAreaMessageDto, Unit> $onHtmlCanvasAvailableAreaMessage;
        final /* synthetic */ Function1<String, Unit> $onHtmlCanvasCustomMessage;
        final /* synthetic */ UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> $screen;
        final /* synthetic */ MicrogramScreenDuxo2.ShareScreenshotRequest $shareScreenshotRequest;

        /* compiled from: CanvasScreen.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.microgram.sdui.CanvasScreenKt$CanvasScreen$3$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[NavigationBarConfiguration.Style.values().length];
                try {
                    iArr[NavigationBarConfiguration.Style.STANDARD.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[NavigationBarConfiguration.Style.TRANSPARENT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C349843(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject, Modifier modifier, long j, Function0<Unit> function0, MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, Function1<? super String, Unit> function1, Function1<? super HtmlCanvasAvailableAreaMessageDto, Unit> function12) {
            this.$screen = uiObject;
            this.$modifier = modifier;
            this.$backgroundColor = j;
            this.$onBackClick = function0;
            this.$invokeJavascriptRequest = invokeJavascript;
            this.$shareScreenshotRequest = shareScreenshotRequest;
            this.$onHtmlCanvasCustomMessage = function1;
            this.$onHtmlCanvasAvailableAreaMessage = function12;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            NavigationBarConfiguration.Style style;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1186385351, i, -1, "com.robinhood.microgram.sdui.CanvasScreen.<anonymous> (CanvasScreen.kt:49)");
            }
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composer.updateRememberedValue(objRememberedValue);
            }
            final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composer.endReplaceGroup();
            final LocalDimensionTracker localDimensionTracker = (LocalDimensionTracker) composer.consume(LocalDimensionTracker2.getLocalDimensionTracker());
            UiObject<NavigationBarConfiguration, NavigationBarConfigurationDto> navConfig = HtmlCanvasScreen2.getNavConfig(this.$screen);
            if (navConfig == null || (style = StandardScreen4.getStyle(navConfig)) == null) {
                style = NavigationBarConfiguration.Style.STANDARD;
            }
            int i2 = WhenMappings.$EnumSwitchMapping$0[style.ordinal()];
            if (i2 == 1) {
                composer.startReplaceGroup(320390030);
                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(this.$modifier, this.$backgroundColor, null, 2, null);
                UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject = this.$screen;
                Function0<Unit> function0 = this.$onBackClick;
                MicrogramScreenDuxo2.InvokeJavascript invokeJavascript = this.$invokeJavascriptRequest;
                MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest = this.$shareScreenshotRequest;
                Function1<String, Unit> function1 = this.$onHtmlCanvasCustomMessage;
                Function1<HtmlCanvasAvailableAreaMessageDto, Unit> function12 = this.$onHtmlCanvasAvailableAreaMessage;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                Modifier modifierTrackPosition = ModifiersKt.trackPosition(Modifier.INSTANCE, CanvasScreen.NAV_BAR_CONTAINER_VIEW_ID);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance = composer.changedInstance(localDimensionTracker);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$CanvasScreen$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CanvasScreen.C349843.invoke$lambda$5$lambda$4$lambda$3(localDimensionTracker, snapshotState, (LayoutCoordinates) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                NavigationBarKt.NavigationBar(uiObject, function0, false, HtmlCanvasScreen2.getNavConfig(uiObject), OnGloballyPositionedModifier3.onGloballyPositioned(modifierTrackPosition, (Function1) objRememberedValue2), composer, 384, 0);
                CanvasScreen.Content(uiObject, invokeJavascript, shareScreenshotRequest, invoke$lambda$1(snapshotState), function1, function12, composer, LocalDimensionTracker.PositionData.$stable << 9);
                composer.endNode();
                composer.endReplaceGroup();
            } else {
                if (i2 != 2) {
                    composer.startReplaceGroup(1949996874);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(321575346);
                Modifier modifierM4872backgroundbw27NRU$default2 = Background3.m4872backgroundbw27NRU$default(this.$modifier, this.$backgroundColor, null, 2, null);
                UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject2 = this.$screen;
                MicrogramScreenDuxo2.InvokeJavascript invokeJavascript2 = this.$invokeJavascriptRequest;
                MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest2 = this.$shareScreenshotRequest;
                Function1<String, Unit> function13 = this.$onHtmlCanvasCustomMessage;
                Function1<HtmlCanvasAvailableAreaMessageDto, Unit> function14 = this.$onHtmlCanvasAvailableAreaMessage;
                Function0<Unit> function02 = this.$onBackClick;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composer.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer, modifierM4872backgroundbw27NRU$default2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                if (composer.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composer.startReusableNode();
                if (composer.getInserting()) {
                    composer.createNode(constructor2);
                } else {
                    composer.useNode();
                }
                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                CanvasScreen.Content(uiObject2, invokeJavascript2, shareScreenshotRequest2, invoke$lambda$1(snapshotState), function13, function14, composer, LocalDimensionTracker.PositionData.$stable << 9);
                Modifier modifierTrackPosition2 = ModifiersKt.trackPosition(Modifier.INSTANCE, CanvasScreen.NAV_BAR_CONTAINER_VIEW_ID);
                composer.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = composer.changedInstance(localDimensionTracker);
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChangedInstance2 || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$CanvasScreen$3$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CanvasScreen.C349843.invoke$lambda$8$lambda$7$lambda$6(localDimensionTracker, snapshotState, (LayoutCoordinates) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                NavigationBarKt.NavigationBar(uiObject2, function02, true, HtmlCanvasScreen2.getNavConfig(uiObject2), OnGloballyPositionedModifier3.onGloballyPositioned(modifierTrackPosition2, (Function1) objRememberedValue3), composer, 384, 0);
                composer.endNode();
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(LocalDimensionTracker localDimensionTracker, SnapshotState snapshotState, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(localDimensionTracker.getPositionData(CanvasScreen.NAV_BAR_CONTAINER_VIEW_ID));
            return Unit.INSTANCE;
        }

        private static final LocalDimensionTracker.PositionData invoke$lambda$1(SnapshotState<LocalDimensionTracker.PositionData> snapshotState) {
            return snapshotState.getValue();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$8$lambda$7$lambda$6(LocalDimensionTracker localDimensionTracker, SnapshotState snapshotState, LayoutCoordinates it) {
            Intrinsics.checkNotNullParameter(it, "it");
            snapshotState.setValue(localDimensionTracker.getPositionData(CanvasScreen.NAV_BAR_CONTAINER_VIEW_ID));
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDimensionTracker.PositionData Content$lambda$6(SnapshotState<LocalDimensionTracker.PositionData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocalDimensionTracker.PositionData Content$lambda$9(SnapshotState<LocalDimensionTracker.PositionData> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content(UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject, final MicrogramScreenDuxo2.InvokeJavascript invokeJavascript, final MicrogramScreenDuxo2.ShareScreenshotRequest shareScreenshotRequest, LocalDimensionTracker.PositionData positionData, final Function1<? super String, Unit> function1, final Function1<? super HtmlCanvasAvailableAreaMessageDto, Unit> function12, Composer composer, final int i) {
        int i2;
        int i3;
        Object obj;
        LocalDimensionTracker localDimensionTracker;
        final LocalDimensionTracker.PositionData positionData2;
        final LocalDimensionTracker localDimensionTracker2;
        Modifier.Companion companion;
        final SnapshotState snapshotState;
        SnapshotState snapshotState2;
        Object obj2;
        int i4;
        float f;
        final SnapshotState snapshotState3;
        UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2146821411);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(uiObject) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(invokeJavascript) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(shareScreenshotRequest) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(positionData) : composerStartRestartGroup.changedInstance(positionData) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
        }
        int i5 = i2;
        if ((74899 & i5) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            uiObject2 = uiObject;
            positionData2 = positionData;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-2146821411, i5, -1, "com.robinhood.microgram.sdui.Content (CanvasScreen.kt:111)");
            }
            UiObject<ThemedColor, ThemedColorDto> backgroundColor = HtmlCanvasScreen2.getBackgroundColor(uiObject);
            composerStartRestartGroup.startReplaceGroup(-1511060051);
            Color composeColor = backgroundColor == null ? null : Colors4.toComposeColor(backgroundColor, composerStartRestartGroup, 0);
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1511060771);
            long jM21371getBg0d7_KjU = composeColor == null ? BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21371getBg0d7_KjU() : composeColor.getValue();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion2 = Composer.INSTANCE;
            if (objRememberedValue == companion2.getEmpty()) {
                objRememberedValue = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            SnapshotState snapshotState4 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion2.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState5 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            LocalDimensionTracker localDimensionTracker3 = (LocalDimensionTracker) composerStartRestartGroup.consume(LocalDimensionTracker2.getLocalDimensionTracker());
            int i6 = i5 >> 6;
            ScreenshotUtils2.RegisterScreenshotRequests(shareScreenshotRequest, composerStartRestartGroup, i6 & 14);
            Tuples2 tuples2M3642to = Tuples4.m3642to(Content$lambda$9(snapshotState5), Content$lambda$6(snapshotState4));
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z = (458752 & i5) == 131072;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == companion2.getEmpty()) {
                objRememberedValue3 = new CanvasScreen2(function12, snapshotState5, snapshotState4, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            int i7 = LocalDimensionTracker.PositionData.$stable;
            EffectsKt.LaunchedEffect(tuples2M3642to, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, i7);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i8 = i5 & 7168;
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(localDimensionTracker3) | (i8 == 2048 || ((i5 & 4096) != 0 && composerStartRestartGroup.changedInstance(positionData)));
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue4 == companion2.getEmpty()) {
                i3 = i7;
                obj = null;
                CanvasScreen3 canvasScreen3 = new CanvasScreen3(localDimensionTracker3, positionData, snapshotState5, snapshotState4, null);
                localDimensionTracker = localDimensionTracker3;
                positionData2 = positionData;
                composerStartRestartGroup.updateRememberedValue(canvasScreen3);
                objRememberedValue4 = canvasScreen3;
            } else {
                localDimensionTracker = localDimensionTracker3;
                i3 = i7;
                obj = null;
                positionData2 = positionData;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(positionData2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composerStartRestartGroup, i3 | ((i5 >> 9) & 14));
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion3, 0.0f, 1, obj);
            Alignment.Companion companion4 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            LocalDimensionTracker localDimensionTracker4 = localDimensionTracker;
            String canvasUrl = HtmlCanvasScreen2.getCanvasUrl(uiObject);
            composerStartRestartGroup.startReplaceGroup(-1041944397);
            if (canvasUrl == null) {
                localDimensionTracker2 = localDimensionTracker4;
                companion = companion3;
                snapshotState = snapshotState5;
                snapshotState2 = snapshotState4;
                obj2 = null;
                i4 = 1;
                f = 0.0f;
            } else {
                if (StringsKt.isBlank(canvasUrl)) {
                    localDimensionTracker2 = localDimensionTracker4;
                    companion = companion3;
                    snapshotState = snapshotState5;
                    snapshotState2 = snapshotState4;
                    obj2 = null;
                    i4 = 1;
                    f = 0.0f;
                } else {
                    companion = companion3;
                    Modifier modifierFillMaxSize$default2 = SizeKt.fillMaxSize$default(Background3.m4872backgroundbw27NRU$default(companion3, jM21371getBg0d7_KjU, null, 2, null), 0.0f, 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), false);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default2);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor2);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    int i9 = (i5 & 112) | (i6 & 896);
                    snapshotState = snapshotState5;
                    snapshotState2 = snapshotState4;
                    localDimensionTracker2 = localDimensionTracker4;
                    i4 = 1;
                    f = 0.0f;
                    obj2 = null;
                    CanvasContent.CanvasContent(canvasUrl, invokeJavascript, function1, null, composerStartRestartGroup, i9, 8);
                    composerStartRestartGroup.endNode();
                }
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierTrackPosition = ModifiersKt.trackPosition(SizeKt.fillMaxSize$default(companion, f, i4, obj2), MAIN_CONTAINER_VIEW_ID);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            int i10 = (composerStartRestartGroup.changedInstance(localDimensionTracker2) ? 1 : 0) | ((i8 == 2048 || ((i5 & 4096) != 0 && composerStartRestartGroup.changedInstance(positionData2))) ? i4 : 0);
            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (i10 != 0 || objRememberedValue5 == companion2.getEmpty()) {
                snapshotState3 = snapshotState2;
                objRememberedValue5 = new Function1() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj3) {
                        return CanvasScreen.Content$lambda$20$lambda$16$lambda$15(localDimensionTracker2, positionData2, snapshotState, snapshotState3, (LayoutCoordinates) obj3);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
            } else {
                snapshotState3 = snapshotState2;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierOnGloballyPositioned = OnGloballyPositionedModifier3.onGloballyPositioned(modifierTrackPosition, (Function1) objRememberedValue5);
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), companion4.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierOnGloballyPositioned);
            Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor3);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
            }
            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
            Modifier.Companion companion6 = companion;
            Spacer2.Spacer(Column5.weight$default(Column6.INSTANCE, companion6, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(2069617616);
            if (HtmlCanvasScreen2.getHasFooter(uiObject)) {
                uiObject2 = uiObject;
                if (uiObject2 instanceof UiObject.Legacy) {
                    composerStartRestartGroup.startReplaceGroup(2069626205);
                    ImmutableList immutableList = extensions2.toImmutableList(((HtmlCanvasScreen) ((UiObject.Legacy) uiObject2).getValue()).getFooter());
                    Modifier modifierContent$lambda$20$lambda$19$trackFooterPosition = Content$lambda$20$lambda$19$trackFooterPosition(PaddingKt.m5144paddingVpY3zN4$default(companion6, f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), i4, obj2), localDimensionTracker2, positionData2, snapshotState, snapshotState3);
                    composerStartRestartGroup.startReplaceGroup(-1772220517);
                    SduiColumns.SduiColumn(immutableList, MicrogramAction.class, modifierContent$lambda$20$lambda$19$trackFooterPosition, null, null, HorizontalPadding.Default, arrangement.getTop(), companion4.getStart(), true, composerStartRestartGroup, 100663296, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                } else {
                    if (!(uiObject2 instanceof UiObject.Idl)) {
                        composerStartRestartGroup.startReplaceGroup(2069624887);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(2069638726);
                    ImmutableList immutableList2 = extensions2.toImmutableList(((HtmlCanvasScreenContentDto) ((UiObject.Idl) uiObject2).getValue()).getFooter());
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion2.getEmpty()) {
                        objRememberedValue6 = CanvasScreen4.INSTANCE;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierContent$lambda$20$lambda$19$trackFooterPosition2 = Content$lambda$20$lambda$19$trackFooterPosition(PaddingKt.m5144paddingVpY3zN4$default(companion6, f, BentoTheme.INSTANCE.getSpacing(composerStartRestartGroup, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), i4, obj2), localDimensionTracker2, positionData2, snapshotState, snapshotState3);
                    composerStartRestartGroup.startReplaceGroup(40010095);
                    SduiColumnsIdl.SduiColumnIdl(immutableList2, (Function1) ((KFunction) objRememberedValue6), MicrogramAction.class, modifierContent$lambda$20$lambda$19$trackFooterPosition2, null, null, HorizontalPadding.Default, arrangement.getTop(), companion4.getStart(), true, composerStartRestartGroup, 805306416, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endReplaceGroup();
                }
            } else {
                uiObject2 = uiObject;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final UiObject<HtmlCanvasScreen, HtmlCanvasScreenContentDto> uiObject3 = uiObject2;
            final LocalDimensionTracker.PositionData positionData3 = positionData2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj3, Object obj4) {
                    return CanvasScreen.Content$lambda$21(uiObject3, invokeJavascript, shareScreenshotRequest, positionData3, function1, function12, i, (Composer) obj3, ((Integer) obj4).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Content$updateContentArea(LocalDimensionTracker localDimensionTracker, LocalDimensionTracker.PositionData positionData, SnapshotState<LocalDimensionTracker.PositionData> snapshotState, SnapshotState<LocalDimensionTracker.PositionData> snapshotState2) {
        LocalDimensionTracker.PositionData positionData2;
        LocalDimensionTracker.PositionData positionData3 = localDimensionTracker.getPositionData(MAIN_CONTAINER_VIEW_ID);
        LocalDimensionTracker.PositionData positionData4 = localDimensionTracker.getPositionData(FOOTER_CONTAINER_VIEW_ID);
        snapshotState.setValue(positionData3);
        if (positionData3 == null || positionData4 == null || positionData == null) {
            positionData2 = null;
        } else {
            positionData2 = new LocalDimensionTracker.PositionData(Offset.m6537copydBAh8RU$default(positionData3.m16064getPositionF1C5BW0(), 0.0f, Float.intBitsToFloat((int) (positionData3.m16064getPositionF1C5BW0() & 4294967295L)) + ((int) (positionData.m16065getSizeYbymL2g() & 4294967295L)), 1, null), IntSize.m8056constructorimpl((((int) (positionData3.m16065getSizeYbymL2g() >> 32)) << 32) | (((((int) (positionData3.m16065getSizeYbymL2g() & 4294967295L)) - ((int) (positionData4.m16065getSizeYbymL2g() & 4294967295L))) - ((int) (positionData.m16065getSizeYbymL2g() & 4294967295L))) & 4294967295L)), null);
        }
        snapshotState2.setValue(positionData2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$20$lambda$16$lambda$15(LocalDimensionTracker localDimensionTracker, LocalDimensionTracker.PositionData positionData, SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Content$updateContentArea(localDimensionTracker, positionData, snapshotState, snapshotState2);
        return Unit.INSTANCE;
    }

    private static final Modifier Content$lambda$20$lambda$19$trackFooterPosition(Modifier modifier, final LocalDimensionTracker localDimensionTracker, final LocalDimensionTracker.PositionData positionData, final SnapshotState<LocalDimensionTracker.PositionData> snapshotState, final SnapshotState<LocalDimensionTracker.PositionData> snapshotState2) {
        return OnGloballyPositionedModifier3.onGloballyPositioned(ModifiersKt.trackPosition(modifier, FOOTER_CONTAINER_VIEW_ID), new Function1() { // from class: com.robinhood.microgram.sdui.CanvasScreenKt$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CanvasScreen.Content$lambda$20$lambda$19$trackFooterPosition$lambda$17(localDimensionTracker, positionData, snapshotState, snapshotState2, (LayoutCoordinates) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Content$lambda$20$lambda$19$trackFooterPosition$lambda$17(LocalDimensionTracker localDimensionTracker, LocalDimensionTracker.PositionData positionData, SnapshotState snapshotState, SnapshotState snapshotState2, LayoutCoordinates it) {
        Intrinsics.checkNotNullParameter(it, "it");
        Content$updateContentArea(localDimensionTracker, positionData, snapshotState, snapshotState2);
        return Unit.INSTANCE;
    }
}
