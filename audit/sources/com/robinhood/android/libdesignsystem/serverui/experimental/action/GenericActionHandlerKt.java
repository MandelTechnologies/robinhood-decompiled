package com.robinhood.android.libdesignsystem.serverui.experimental.action;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.foundation.layout.WindowInsetsSize4;
import androidx.compose.foundation.layout.WindowInsets_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.deeplink.DeepLinkPath;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.serverdriven.experimental.api.AlertAction;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.DeeplinkAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertMobilePresentationStyle;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.squareup.wire.AnyMessage;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlin.text.StringsKt;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import rh_server_driven_ui.p531v1.ActionDto;
import rh_server_driven_ui.p531v1.AlertActionDto;
import rh_server_driven_ui.p531v1.AlertDto;
import rh_server_driven_ui.p531v1.DeepLinkActionDto;
import rh_server_driven_ui.p531v1.GenericActionDto;

/* compiled from: GenericActionHandler.kt */
@Metadata(m3635d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a-\u0010\u0007\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\b\u001a-\u0010\n\u001a\u00020\u0005*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\t2\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000b\u001a-\u0010\u0012\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\r0\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\r0\u000e2\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013\u001aH\u0010\u001f\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u001a\u001a\u00020\u00192\u0017\u0010\u001e\u001a\u0013\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u00150\u001b¢\u0006\u0002\b\u001dH\u0007¢\u0006\u0004\b\u001f\u0010 \u001aO\u0010%\u001a\u00020\u00152\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\"\u001a\u00020\u00052\u0010\b\u0002\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00142\b\b\u0002\u0010$\u001a\u00020\u00002\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014H\u0007¢\u0006\u0004\b%\u0010&\u001a\u0019\u0010*\u001a\u0004\u0018\u00010)2\b\u0010(\u001a\u0004\u0018\u00010'¢\u0006\u0004\b*\u0010+\"\u0018\u0010,\u001a\u00020\u0005*\u00020\u00038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-\"\u0018\u0010,\u001a\u00020\u0005*\u00020\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b,\u0010.¨\u00066²\u0006\u0016\u0010/\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0016\u00100\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u000e8\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00102\u001a\u0004\u0018\u0001018\n@\nX\u008a\u008e\u0002²\u0006\u0010\u00103\u001a\u0004\u0018\u0001018\n@\nX\u008a\u008e\u0002²\u0006\u000e\u00105\u001a\u0002048\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"Lcom/robinhood/android/navigation/Navigator;", "Landroid/content/Context;", "context", "Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;", "action", "", "shouldClearTop", "handleDeeplinkAction", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;Ljava/lang/Boolean;)Z", "Lrh_server_driven_ui/v1/DeepLinkActionDto;", "handleDeeplinkActionDto", "(Lcom/robinhood/android/navigation/Navigator;Landroid/content/Context;Lrh_server_driven_ui/v1/DeepLinkActionDto;Ljava/lang/Boolean;)Z", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "alert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;", "mobilePresentationStyle", "handleAlert", "(Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertMobilePresentationStyle;)Z", "Lkotlin/Function0;", "", "onDismissRequest", "Landroidx/compose/material3/SheetState;", "sheetState", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Landroidx/compose/foundation/layout/ColumnScope;", "Lkotlin/ExtensionFunctionType;", "content", "SduiModalBottomSheet", "(Lkotlin/jvm/functions/Function0;Landroidx/compose/material3/SheetState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V", "deeplinksShouldClearTop", "optInDto", "onDismiss", "navigator", "GenericActionHandler", "(Ljava/lang/Boolean;ZLkotlin/jvm/functions/Function0;Lcom/robinhood/android/navigation/Navigator;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "Lrh_server_driven_ui/v1/ActionDto;", "actionDto", "Lrh_server_driven_ui/v1/GenericActionDto;", "unpackGenericActionDto", "(Lrh_server_driven_ui/v1/ActionDto;)Lrh_server_driven_ui/v1/GenericActionDto;", "isInternalDeeplink", "(Lcom/robinhood/models/serverdriven/experimental/api/DeeplinkAction;)Z", "(Lrh_server_driven_ui/v1/DeepLinkActionDto;)Z", "dialogContent", "bottomSheetContent", "Lrh_server_driven_ui/v1/AlertDto;", "dialogAlert", "sheetDto", "Landroidx/compose/ui/text/style/TextAlign;", "align", "lib-sdui_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class GenericActionHandlerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit GenericActionHandler$lambda$21(Boolean bool, boolean z, Function0 function0, Navigator navigator, Function2 function2, int i, int i2, Composer composer, int i3) {
        GenericActionHandler(bool, z, function0, navigator, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiModalBottomSheet$lambda$0(Function0 function0, SheetState sheetState, Modifier modifier, Function3 function3, int i, int i2, Composer composer, int i3) {
        SduiModalBottomSheet(function0, sheetState, modifier, function3, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    private static final boolean isInternalDeeplink(DeeplinkAction deeplinkAction) {
        return StringsKt.startsWith$default(deeplinkAction.getUri(), DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), false, 2, (Object) null);
    }

    private static final boolean isInternalDeeplink(DeepLinkActionDto deepLinkActionDto) {
        return StringsKt.startsWith$default(deepLinkActionDto.getUrl(), DeepLinkPath.INSTANCE.getSCHEME_ROBINHOOD(), false, 2, (Object) null);
    }

    public static /* synthetic */ boolean handleDeeplinkAction$default(Navigator navigator, Context context, DeeplinkAction deeplinkAction, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return handleDeeplinkAction(navigator, context, deeplinkAction, bool);
    }

    public static final boolean handleDeeplinkAction(Navigator navigator, Context context, DeeplinkAction action, Boolean bool) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Uri uri = Uri.parse(action.getUri());
        Intrinsics.checkNotNull(uri);
        if (navigator.isDeepLinkSupported(uri) || isInternalDeeplink(action)) {
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, bool, null, false, null, 56, null);
        }
        return WebUtils.viewUrl$default(context, uri.toString(), 0, 4, (Object) null);
    }

    public static /* synthetic */ boolean handleDeeplinkActionDto$default(Navigator navigator, Context context, DeepLinkActionDto deepLinkActionDto, Boolean bool, int i, Object obj) {
        if ((i & 4) != 0) {
            bool = null;
        }
        return handleDeeplinkActionDto(navigator, context, deepLinkActionDto, bool);
    }

    public static final boolean handleDeeplinkActionDto(Navigator navigator, Context context, DeepLinkActionDto action, Boolean bool) {
        Intrinsics.checkNotNullParameter(navigator, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(action, "action");
        Uri uri = Uri.parse(action.getUrl());
        if (navigator.isDeepLinkSupported(uri) || isInternalDeeplink(action)) {
            return Navigator.DefaultImpls.handleDeepLink$default(navigator, context, uri, bool, null, false, null, 56, null);
        }
        return WebUtils.viewUrl$default(context, uri.toString(), 0, 4, (Object) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDto GenericActionHandler$lambda$11(SnapshotState<AlertDto> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int GenericActionHandler$lambda$14(SnapshotState<TextAlign> snapshotState) {
        return snapshotState.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAlertContent<GenericAction> GenericActionHandler$lambda$2(SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAlertContent<GenericAction> GenericActionHandler$lambda$5(SnapshotState<GenericAlertContent<GenericAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AlertDto GenericActionHandler$lambda$8(SnapshotState<AlertDto> snapshotState) {
        return snapshotState.getValue();
    }

    public static final boolean handleAlert(SduiActionHandler<? super GenericAction> sduiActionHandler, GenericAlertContent<? extends GenericAction> alert, GenericAlertMobilePresentationStyle mobilePresentationStyle) {
        Intrinsics.checkNotNullParameter(sduiActionHandler, "<this>");
        Intrinsics.checkNotNullParameter(alert, "alert");
        Intrinsics.checkNotNullParameter(mobilePresentationStyle, "mobilePresentationStyle");
        return sduiActionHandler.mo15941handle(new GenericAction.InfoAlert(new AlertAction(alert, mobilePresentationStyle)));
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiModalBottomSheet(final Function0<Unit> onDismissRequest, final SheetState sheetState, Modifier modifier, final Function3<? super Column5, ? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(954276145);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onDismissRequest) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(sheetState) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(954276145, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.SduiModalBottomSheet (GenericActionHandler.kt:109)");
                }
                composer2 = composerStartRestartGroup;
                Modifier modifier5 = modifier4;
                ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(onDismissRequest, modifier5, sheetState, 0.0f, RectangleShape2.getRectangleShape(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), 0L, 0.0f, 0L, null, null, null, ComposableLambda3.rememberComposableLambda(24694606, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt.SduiModalBottomSheet.1
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i5) {
                        Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                        if ((i5 & 6) == 0) {
                            i5 |= composer3.changed(ModalBottomSheet) ? 4 : 2;
                        }
                        if ((i5 & 19) == 18 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(24694606, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.SduiModalBottomSheet.<anonymous> (GenericActionHandler.kt:121)");
                        }
                        BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getJet(), 0.0f, composer3, 0, 5);
                        content.invoke(ModalBottomSheet, composer3, Integer.valueOf(i5 & 14));
                        Spacer2.Spacer(WindowInsetsSize4.windowInsetsBottomHeight(Modifier.INSTANCE, WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer3, 6)), composer3, 0);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, (i3 & 14) | 805330944 | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 384, 3528);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return GenericActionHandlerKt.SduiModalBottomSheet$lambda$0(onDismissRequest, sheetState, modifier3, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i2 & 8) == 0) {
        }
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            Modifier modifier52 = modifier4;
            ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(onDismissRequest, modifier52, sheetState, 0.0f, RectangleShape2.getRectangleShape(), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getJet(), 0L, 0.0f, 0L, null, null, null, ComposableLambda3.rememberComposableLambda(24694606, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt.SduiModalBottomSheet.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((i5 & 6) == 0) {
                        i5 |= composer3.changed(ModalBottomSheet) ? 4 : 2;
                    }
                    if ((i5 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(24694606, i5, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.SduiModalBottomSheet.<anonymous> (GenericActionHandler.kt:121)");
                    }
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(null, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getJet(), 0.0f, composer3, 0, 5);
                    content.invoke(ModalBottomSheet, composer3, Integer.valueOf(i5 & 14));
                    Spacer2.Spacer(WindowInsetsSize4.windowInsetsBottomHeight(Modifier.INSTANCE, WindowInsets_androidKt.getSystemBars(WindowInsets.INSTANCE, composer3, 6)), composer3, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i3 & 14) | 805330944 | ((i3 >> 3) & 112) | ((i3 << 3) & 896), 384, 3528);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void GenericActionHandler$lambda$3(SnapshotState<GenericAlertContent<GenericAction>> snapshotState, GenericAlertContent<? extends GenericAction> genericAlertContent) {
        snapshotState.setValue(genericAlertContent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void GenericActionHandler$lambda$9(SnapshotState<AlertDto> snapshotState, AlertDto alertDto) {
        snapshotState.setValue(alertDto);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x026b  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x027d  */
    /* JADX WARN: Removed duplicated region for block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GenericActionHandler(Boolean bool, boolean z, Function0<Unit> function0, Navigator navigator, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        Boolean bool2;
        int i3;
        boolean z2;
        int i4;
        Function0<Unit> function02;
        Navigator navigator2;
        final Boolean bool3;
        boolean z3;
        Function0<Unit> function03;
        Context context;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        SheetState sheetStateRememberModalBottomSheetState;
        Object objRememberedValue2;
        final SnapshotState snapshotState;
        Object objRememberedValue3;
        final SnapshotState snapshotState2;
        Object objRememberedValue4;
        Object objRememberedValue5;
        Object objRememberedValue6;
        boolean zChangedInstance;
        Object objRememberedValue7;
        final Context context2;
        final CoroutineScope coroutineScope2;
        final SheetState sheetState;
        final Function0<Unit> function04;
        final Navigator navigator3;
        SnapshotState snapshotState3;
        SnapshotState snapshotState4;
        SnapshotState snapshotState5;
        final SnapshotState snapshotState6;
        DtoActionHandler<GenericActionDto> dtoActionHandler;
        Composer composer2;
        final Navigator navigator4;
        final Function0<Unit> function05;
        final Boolean bool4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(295368579);
        int i5 = i2 & 1;
        if (i5 != 0) {
            i3 = i | 6;
            bool2 = bool;
        } else if ((i & 6) == 0) {
            bool2 = bool;
            i3 = (composerStartRestartGroup.changed(bool2) ? 4 : 2) | i;
        } else {
            bool2 = bool;
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                z2 = z;
                i3 |= composerStartRestartGroup.changed(z2) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
                }
                if ((i & 3072) == 0) {
                    if ((i2 & 8) == 0) {
                        navigator2 = navigator;
                        int i7 = composerStartRestartGroup.changedInstance(navigator2) ? 2048 : 1024;
                        i3 |= i7;
                    } else {
                        navigator2 = navigator;
                    }
                    i3 |= i7;
                } else {
                    navigator2 = navigator;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(content) ? 16384 : 8192;
                }
                if ((i3 & 9363) == 9362 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    bool4 = bool2;
                    composer2 = composerStartRestartGroup;
                    function05 = function02;
                    navigator4 = navigator2;
                } else {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        if (i5 != 0) {
                            bool2 = null;
                        }
                        if (i6 != 0) {
                            z2 = true;
                        }
                        if (i4 != 0) {
                            function02 = null;
                        }
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                            navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        }
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i2 & 8) != 0) {
                            i3 &= -7169;
                        }
                    }
                    bool3 = bool2;
                    z3 = z2;
                    function03 = function02;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(295368579, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandler (GenericActionHandler.kt:147)");
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    final SnapshotState snapshotState7 = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    final SnapshotState snapshotState8 = (SnapshotState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = SnapshotState3.mutableStateOf$default(TextAlign.m7912boximpl(TextAlign.INSTANCE.m7924getStarte0LSkKk()), null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    SnapshotState snapshotState9 = (SnapshotState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(navigator2) | composerStartRestartGroup.changedInstance(context) | ((i3 & 14) != 4) | ((i3 & 896) == 256);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance || objRememberedValue7 == companion.getEmpty()) {
                        context2 = context;
                        coroutineScope2 = coroutineScope;
                        sheetState = sheetStateRememberModalBottomSheetState;
                        function04 = function03;
                        navigator3 = navigator2;
                        objRememberedValue7 = new SduiActionHandler() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
                                    try {
                                        iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$1", m3645f = "GenericActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$1 */
                            static final class C207001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
                                final /* synthetic */ SheetState $bottomSheetState;
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $dialogContent$delegate;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C207001(SheetState sheetState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState2, Continuation<? super C207001> continuation) {
                                    super(2, continuation);
                                    this.$bottomSheetState = sheetState;
                                    this.$bottomSheetContent$delegate = snapshotState;
                                    this.$dialogContent$delegate = snapshotState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C207001(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C207001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SheetState sheetState = this.$bottomSheetState;
                                        this.label = 1;
                                        if (sheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$bottomSheetContent$delegate.setValue(null);
                                    GenericActionHandlerKt.GenericActionHandler$lambda$3(this.$dialogContent$delegate, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                            public final boolean mo15941handle(GenericAction action) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                if (action instanceof GenericAction.Deeplink) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C207001(sheetState, snapshotState2, snapshotState, null), 3, null);
                                    return GenericActionHandlerKt.handleDeeplinkAction(navigator3, context2, ((GenericAction.Deeplink) action).getValue2(), bool3);
                                }
                                if (action instanceof GenericAction.Dismiss) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C207012(sheetState, snapshotState2, snapshotState, null), 3, null);
                                    Function0<Unit> function06 = function04;
                                    if (function06 != null) {
                                        function06.invoke();
                                    }
                                    return true;
                                }
                                if (!(action instanceof GenericAction.InfoAlert)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
                                int i8 = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                                if (i8 == 1) {
                                    GenericActionHandlerKt.GenericActionHandler$lambda$3(snapshotState, infoAlert.getValue2().getAlert());
                                    return true;
                                }
                                if (i8 == 2) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C207023(action, sheetState, snapshotState2, null), 3, null);
                                    return true;
                                }
                                throw new NoWhenBranchMatchedException();
                            }

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$2", m3645f = "GenericActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$2 */
                            static final class C207012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
                                final /* synthetic */ SheetState $bottomSheetState;
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $dialogContent$delegate;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C207012(SheetState sheetState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState2, Continuation<? super C207012> continuation) {
                                    super(2, continuation);
                                    this.$bottomSheetState = sheetState;
                                    this.$bottomSheetContent$delegate = snapshotState;
                                    this.$dialogContent$delegate = snapshotState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C207012(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C207012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SheetState sheetState = this.$bottomSheetState;
                                        this.label = 1;
                                        if (sheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$bottomSheetContent$delegate.setValue(null);
                                    GenericActionHandlerKt.GenericActionHandler$lambda$3(this.$dialogContent$delegate, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$3", m3645f = "GenericActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$3 */
                            static final class C207023 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ GenericAction $action;
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
                                final /* synthetic */ SheetState $bottomSheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C207023(GenericAction genericAction, SheetState sheetState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, Continuation<? super C207023> continuation) {
                                    super(2, continuation);
                                    this.$action = genericAction;
                                    this.$bottomSheetState = sheetState;
                                    this.$bottomSheetContent$delegate = snapshotState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C207023(this.$action, this.$bottomSheetState, this.$bottomSheetContent$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C207023) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.$bottomSheetContent$delegate.setValue(((GenericAction.InfoAlert) this.$action).getValue2().getAlert());
                                        SheetState sheetState = this.$bottomSheetState;
                                        this.label = 1;
                                        if (sheetState.show(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        };
                        snapshotState3 = snapshotState2;
                        snapshotState4 = snapshotState;
                        bool3 = bool3;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    } else {
                        context2 = context;
                        coroutineScope2 = coroutineScope;
                        sheetState = sheetStateRememberModalBottomSheetState;
                        snapshotState3 = snapshotState2;
                        function04 = function03;
                        snapshotState4 = snapshotState;
                        navigator3 = navigator2;
                    }
                    SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue7;
                    composerStartRestartGroup.endReplaceGroup();
                    if (z3) {
                        snapshotState5 = snapshotState8;
                        snapshotState6 = snapshotState9;
                        dtoActionHandler = null;
                    } else {
                        final Function0<Unit> function06 = function04;
                        final Navigator navigator5 = navigator3;
                        final SheetState sheetState2 = sheetState;
                        final Context context3 = context2;
                        snapshotState6 = snapshotState9;
                        DtoActionHandler<GenericActionDto> dtoActionHandler2 = new DtoActionHandler<GenericActionDto>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$dtoHandler$1
                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                            /* renamed from: handle-RsTtcXE, reason: avoid collision after fix types in other method and not valid java name and merged with bridge method [inline-methods] */
                            public boolean mo10782handleRsTtcXE(GenericActionDto action, GenericAlertMobilePresentationStyle alertType, int textAlign) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                Intrinsics.checkNotNullParameter(alertType, "alertType");
                                return GenericActionHandlerKt.GenericActionHandler$handleDtoAction(coroutineScope2, function06, sheetState2, snapshotState8, navigator5, context3, bool3, snapshotState6, snapshotState7, action, alertType, textAlign);
                            }

                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.action.dto.DtoActionHandler
                            public GenericActionDto convertAlertToAction(AlertDto alert) {
                                Intrinsics.checkNotNullParameter(alert, "alert");
                                return new GenericActionDto(new GenericActionDto.ActionDto.Alert(new AlertActionDto(alert)));
                            }
                        };
                        function04 = function06;
                        navigator3 = navigator5;
                        sheetState = sheetState2;
                        snapshotState5 = snapshotState8;
                        dtoActionHandler = dtoActionHandler2;
                    }
                    C206991 c206991 = new C206991(content, z3, snapshotState4, sduiActionHandler, snapshotState3, coroutineScope2, sheetState, snapshotState5, snapshotState6, snapshotState7);
                    z2 = z3;
                    SduiActionHandler3.ProvideActionHandler(sduiActionHandler, dtoActionHandler, ComposableLambda3.rememberComposableLambda(1100100389, true, c206991, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    composer2 = composerStartRestartGroup;
                    navigator4 = navigator3;
                    function05 = function04;
                    bool4 = bool3;
                }
                final boolean z4 = z2;
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return GenericActionHandlerKt.GenericActionHandler$lambda$21(bool4, z4, function05, navigator4, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            function02 = function0;
            if ((i & 3072) == 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i3 & 9363) == 9362) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if ((i2 & 8) != 0) {
                    }
                    bool3 = bool2;
                    z3 = z2;
                    function03 = function02;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                    }
                    final SnapshotState<AlertDto> snapshotState72 = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                    }
                    final SnapshotState<AlertDto> snapshotState82 = (SnapshotState) objRememberedValue5;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue6 == companion.getEmpty()) {
                    }
                    SnapshotState snapshotState92 = (SnapshotState) objRememberedValue6;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = composerStartRestartGroup.changedInstance(coroutineScope) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | composerStartRestartGroup.changedInstance(navigator2) | composerStartRestartGroup.changedInstance(context) | ((i3 & 14) != 4) | ((i3 & 896) == 256);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        context2 = context;
                        coroutineScope2 = coroutineScope;
                        sheetState = sheetStateRememberModalBottomSheetState;
                        function04 = function03;
                        navigator3 = navigator2;
                        objRememberedValue7 = new SduiActionHandler() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            public /* synthetic */ class WhenMappings {
                                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                                static {
                                    int[] iArr = new int[GenericAlertMobilePresentationStyle.values().length];
                                    try {
                                        iArr[GenericAlertMobilePresentationStyle.MODAL.ordinal()] = 1;
                                    } catch (NoSuchFieldError unused) {
                                    }
                                    try {
                                        iArr[GenericAlertMobilePresentationStyle.BOTTOM_SHEET.ordinal()] = 2;
                                    } catch (NoSuchFieldError unused2) {
                                    }
                                    $EnumSwitchMapping$0 = iArr;
                                }
                            }

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$1", m3645f = "GenericActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ETH_WITH_PLAID_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$1 */
                            static final class C207001 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
                                final /* synthetic */ SheetState $bottomSheetState;
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $dialogContent$delegate;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C207001(SheetState sheetState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState2, Continuation<? super C207001> continuation) {
                                    super(2, continuation);
                                    this.$bottomSheetState = sheetState;
                                    this.$bottomSheetContent$delegate = snapshotState;
                                    this.$dialogContent$delegate = snapshotState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C207001(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C207001) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SheetState sheetState = this.$bottomSheetState;
                                        this.label = 1;
                                        if (sheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$bottomSheetContent$delegate.setValue(null);
                                    GenericActionHandlerKt.GenericActionHandler$lambda$3(this.$dialogContent$delegate, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            @Override // com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler
                            /* renamed from: handle, reason: merged with bridge method [inline-methods] */
                            public final boolean mo15941handle(GenericAction action) {
                                Intrinsics.checkNotNullParameter(action, "action");
                                if (action instanceof GenericAction.Deeplink) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C207001(sheetState, snapshotState2, snapshotState, null), 3, null);
                                    return GenericActionHandlerKt.handleDeeplinkAction(navigator3, context2, ((GenericAction.Deeplink) action).getValue2(), bool3);
                                }
                                if (action instanceof GenericAction.Dismiss) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C207012(sheetState, snapshotState2, snapshotState, null), 3, null);
                                    Function0<Unit> function062 = function04;
                                    if (function062 != null) {
                                        function062.invoke();
                                    }
                                    return true;
                                }
                                if (!(action instanceof GenericAction.InfoAlert)) {
                                    throw new NoWhenBranchMatchedException();
                                }
                                GenericAction.InfoAlert infoAlert = (GenericAction.InfoAlert) action;
                                int i8 = WhenMappings.$EnumSwitchMapping$0[infoAlert.getValue2().getMobile_presentation_style().ordinal()];
                                if (i8 == 1) {
                                    GenericActionHandlerKt.GenericActionHandler$lambda$3(snapshotState, infoAlert.getValue2().getAlert());
                                    return true;
                                }
                                if (i8 == 2) {
                                    BuildersKt__Builders_commonKt.launch$default(coroutineScope2, null, null, new C207023(action, sheetState, snapshotState2, null), 3, null);
                                    return true;
                                }
                                throw new NoWhenBranchMatchedException();
                            }

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$2", m3645f = "GenericActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$2 */
                            static final class C207012 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
                                final /* synthetic */ SheetState $bottomSheetState;
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $dialogContent$delegate;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C207012(SheetState sheetState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState2, Continuation<? super C207012> continuation) {
                                    super(2, continuation);
                                    this.$bottomSheetState = sheetState;
                                    this.$bottomSheetContent$delegate = snapshotState;
                                    this.$dialogContent$delegate = snapshotState2;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C207012(this.$bottomSheetState, this.$bottomSheetContent$delegate, this.$dialogContent$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C207012) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        SheetState sheetState = this.$bottomSheetState;
                                        this.label = 1;
                                        if (sheetState.hide(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    this.$bottomSheetContent$delegate.setValue(null);
                                    GenericActionHandlerKt.GenericActionHandler$lambda$3(this.$dialogContent$delegate, null);
                                    return Unit.INSTANCE;
                                }
                            }

                            /* compiled from: GenericActionHandler.kt */
                            @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$3", m3645f = "GenericActionHandler.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_ARROW_UP_VALUE}, m3647m = "invokeSuspend")
                            /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$handler$1$1$3 */
                            static final class C207023 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
                                final /* synthetic */ GenericAction $action;
                                final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
                                final /* synthetic */ SheetState $bottomSheetState;
                                int label;

                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                C207023(GenericAction genericAction, SheetState sheetState, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, Continuation<? super C207023> continuation) {
                                    super(2, continuation);
                                    this.$action = genericAction;
                                    this.$bottomSheetState = sheetState;
                                    this.$bottomSheetContent$delegate = snapshotState;
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                                    return new C207023(this.$action, this.$bottomSheetState, this.$bottomSheetContent$delegate, continuation);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                                    return ((C207023) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                    int i = this.label;
                                    if (i == 0) {
                                        ResultKt.throwOnFailure(obj);
                                        this.$bottomSheetContent$delegate.setValue(((GenericAction.InfoAlert) this.$action).getValue2().getAlert());
                                        SheetState sheetState = this.$bottomSheetState;
                                        this.label = 1;
                                        if (sheetState.show(this) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    } else {
                                        if (i != 1) {
                                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                        }
                                        ResultKt.throwOnFailure(obj);
                                    }
                                    return Unit.INSTANCE;
                                }
                            }
                        };
                        snapshotState3 = snapshotState2;
                        snapshotState4 = snapshotState;
                        bool3 = bool3;
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                        SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue7;
                        composerStartRestartGroup.endReplaceGroup();
                        if (z3) {
                        }
                        C206991 c2069912 = new C206991(content, z3, snapshotState4, sduiActionHandler2, snapshotState3, coroutineScope2, sheetState, snapshotState5, snapshotState6, snapshotState72);
                        z2 = z3;
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, dtoActionHandler, ComposableLambda3.rememberComposableLambda(1100100389, true, c2069912, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 0);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composer2 = composerStartRestartGroup;
                        navigator4 = navigator3;
                        function05 = function04;
                        bool4 = bool3;
                    }
                }
            }
            final boolean z42 = z2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        z2 = z;
        i4 = i2 & 4;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i & 3072) == 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i3 & 9363) == 9362) {
        }
        final boolean z422 = z2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void GenericActionHandler$lambda$15(SnapshotState<TextAlign> snapshotState, int i) {
        snapshotState.setValue(TextAlign.m7912boximpl(i));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean GenericActionHandler$handleDtoAction(CoroutineScope coroutineScope, Function0<Unit> function0, SheetState sheetState, SnapshotState<AlertDto> snapshotState, Navigator navigator, Context context, Boolean bool, SnapshotState<TextAlign> snapshotState2, SnapshotState<AlertDto> snapshotState3, GenericActionDto genericActionDto, GenericAlertMobilePresentationStyle genericAlertMobilePresentationStyle, int i) {
        AlertActionDto alert;
        AlertDto alert2;
        AlertActionDto alert3;
        AlertDto alert4;
        if (genericAlertMobilePresentationStyle == GenericAlertMobilePresentationStyle.BOTTOM_SHEET) {
            if (genericActionDto.getDismiss() != null) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GenericActionHandlerKt$GenericActionHandler$handleDtoAction$1(sheetState, snapshotState, null), 3, null);
                if (function0 == null) {
                    return true;
                }
                function0.invoke();
                return true;
            }
            if (genericActionDto.getDeeplink() != null) {
                DeepLinkActionDto deeplink = genericActionDto.getDeeplink();
                if (deeplink == null) {
                    return true;
                }
                handleDeeplinkActionDto(navigator, context, deeplink, bool);
                return true;
            }
            if (genericActionDto.getAlert() == null || (alert3 = genericActionDto.getAlert()) == null || (alert4 = alert3.getAlert()) == null) {
                return true;
            }
            GenericActionHandler$lambda$15(snapshotState2, i);
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GenericActionHandlerKt$GenericActionHandler$handleDtoAction$3$1(alert4, sheetState, snapshotState, null), 3, null);
            return true;
        }
        if (genericAlertMobilePresentationStyle != GenericAlertMobilePresentationStyle.MODAL) {
            return true;
        }
        if (genericActionDto.getDismiss() != null) {
            snapshotState3.setValue(null);
            if (function0 == null) {
                return true;
            }
            function0.invoke();
            return true;
        }
        if (genericActionDto.getDeeplink() != null) {
            DeepLinkActionDto deeplink2 = genericActionDto.getDeeplink();
            if (deeplink2 == null) {
                return true;
            }
            handleDeeplinkActionDto(navigator, context, deeplink2, bool);
            return true;
        }
        if (genericActionDto.getAlert() == null || (alert = genericActionDto.getAlert()) == null || (alert2 = alert.getAlert()) == null) {
            return true;
        }
        snapshotState3.setValue(alert2);
        return true;
    }

    /* compiled from: GenericActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1 */
    static final class C206991 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<TextAlign> $align$delegate;
        final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $bottomSheetContent$delegate;
        final /* synthetic */ SheetState $bottomSheetState;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ SnapshotState<AlertDto> $dialogAlert$delegate;
        final /* synthetic */ SnapshotState<GenericAlertContent<GenericAction>> $dialogContent$delegate;
        final /* synthetic */ SduiActionHandler<GenericAction> $handler;
        final /* synthetic */ boolean $optInDto;
        final /* synthetic */ SnapshotState<AlertDto> $sheetDto$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C206991(Function2<? super Composer, ? super Integer, Unit> function2, boolean z, SnapshotState<GenericAlertContent<GenericAction>> snapshotState, SduiActionHandler<? super GenericAction> sduiActionHandler, SnapshotState<GenericAlertContent<GenericAction>> snapshotState2, CoroutineScope coroutineScope, SheetState sheetState, SnapshotState<AlertDto> snapshotState3, SnapshotState<TextAlign> snapshotState4, SnapshotState<AlertDto> snapshotState5) {
            this.$content = function2;
            this.$optInDto = z;
            this.$dialogContent$delegate = snapshotState;
            this.$handler = sduiActionHandler;
            this.$bottomSheetContent$delegate = snapshotState2;
            this.$coroutineScope = coroutineScope;
            this.$bottomSheetState = sheetState;
            this.$sheetDto$delegate = snapshotState3;
            this.$align$delegate = snapshotState4;
            this.$dialogAlert$delegate = snapshotState5;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            GenericActionHandlerKt.GenericActionHandler$lambda$3(snapshotState, null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(CoroutineScope coroutineScope, SheetState sheetState, SnapshotState snapshotState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GenericActionHandlerKt$GenericActionHandler$1$2$1$1$1(sheetState, snapshotState, null), 3, null);
            return Unit.INSTANCE;
        }

        /* compiled from: GenericActionHandler.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$3, reason: invalid class name */
        static final class AnonymousClass3 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ SnapshotState<TextAlign> $align$delegate;
            final /* synthetic */ SheetState $bottomSheetState;
            final /* synthetic */ CoroutineScope $coroutineScope;
            final /* synthetic */ SnapshotState<AlertDto> $dialogAlert$delegate;
            final /* synthetic */ SnapshotState<AlertDto> $sheetDto$delegate;

            AnonymousClass3(SnapshotState<AlertDto> snapshotState, CoroutineScope coroutineScope, SheetState sheetState, SnapshotState<TextAlign> snapshotState2, SnapshotState<AlertDto> snapshotState3) {
                this.$sheetDto$delegate = snapshotState;
                this.$coroutineScope = coroutineScope;
                this.$bottomSheetState = sheetState;
                this.$align$delegate = snapshotState2;
                this.$dialogAlert$delegate = snapshotState3;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                invoke(composer, num.intValue());
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$2$lambda$1$lambda$0(CoroutineScope coroutineScope, SheetState sheetState, SnapshotState snapshotState) {
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new GenericActionHandlerKt$GenericActionHandler$1$3$1$1$1$1(sheetState, snapshotState, null), 3, null);
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer, int i) {
                if ((i & 3) == 2 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1401338659, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandler.<anonymous>.<anonymous> (GenericActionHandler.kt:331)");
                }
                final AlertDto alertDtoGenericActionHandler$lambda$11 = GenericActionHandlerKt.GenericActionHandler$lambda$11(this.$sheetDto$delegate);
                composer.startReplaceGroup(1933282026);
                if (alertDtoGenericActionHandler$lambda$11 != null) {
                    final CoroutineScope coroutineScope = this.$coroutineScope;
                    final SheetState sheetState = this.$bottomSheetState;
                    final SnapshotState<AlertDto> snapshotState = this.$sheetDto$delegate;
                    final SnapshotState<TextAlign> snapshotState2 = this.$align$delegate;
                    composer.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(sheetState);
                    Object objRememberedValue = composer.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$3$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GenericActionHandlerKt.C206991.AnonymousClass3.invoke$lambda$2$lambda$1$lambda$0(coroutineScope, sheetState, snapshotState);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue);
                    }
                    composer.endReplaceGroup();
                    GenericActionHandlerKt.SduiModalBottomSheet((Function0) objRememberedValue, sheetState, null, ComposableLambda3.rememberComposableLambda(1217045061, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$3$1$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                            invoke(column5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Column5 SduiModalBottomSheet, Composer composer2, int i2) {
                            Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                            if ((i2 & 17) == 16 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1217045061, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandler.<anonymous>.<anonymous>.<anonymous>.<anonymous> (GenericActionHandler.kt:341)");
                            }
                            SduiAlert sduiAlert = SduiAlert.INSTANCE;
                            AlertDto alertDto = alertDtoGenericActionHandler$lambda$11;
                            composer2.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composer2.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = GenericActionHandlerKt$GenericActionHandler$1$3$1$2$1$1.INSTANCE;
                                composer2.updateRememberedValue(objRememberedValue2);
                            }
                            composer2.endReplaceGroup();
                            sduiAlert.m15974AlertSheetoTYcxuw(alertDto, (Function1) ((KFunction) objRememberedValue2), GenericActionHandlerKt.GenericActionHandler$lambda$14(snapshotState2), null, composer2, 48, 8);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer, 54), composer, 3072, 4);
                    Unit unit = Unit.INSTANCE;
                }
                composer.endReplaceGroup();
                AlertDto alertDtoGenericActionHandler$lambda$8 = GenericActionHandlerKt.GenericActionHandler$lambda$8(this.$dialogAlert$delegate);
                if (alertDtoGenericActionHandler$lambda$8 != null) {
                    final SnapshotState<AlertDto> snapshotState3 = this.$dialogAlert$delegate;
                    SduiAlert sduiAlert = SduiAlert.INSTANCE;
                    composer.startReplaceGroup(1849434622);
                    Object objRememberedValue2 = composer.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = GenericActionHandlerKt$GenericActionHandler$1$3$2$1$1.INSTANCE;
                        composer.updateRememberedValue(objRememberedValue2);
                    }
                    composer.endReplaceGroup();
                    Function1 function1 = (Function1) ((KFunction) objRememberedValue2);
                    composer.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composer.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$3$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return GenericActionHandlerKt.C206991.AnonymousClass3.invoke$lambda$6$lambda$5$lambda$4(snapshotState3);
                            }
                        };
                        composer.updateRememberedValue(objRememberedValue3);
                    }
                    composer.endReplaceGroup();
                    sduiAlert.Dialog(alertDtoGenericActionHandler$lambda$8, function1, (DtoActionHandler) null, (Function1<? super String, Unit>) null, (Function0<Unit>) objRememberedValue3, composer, 24624, 12);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$6$lambda$5$lambda$4(SnapshotState snapshotState) {
                GenericActionHandlerKt.GenericActionHandler$lambda$9(snapshotState, null);
                return Unit.INSTANCE;
            }
        }

        public final void invoke(Composer composer, int i) {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1100100389, i, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandler.<anonymous> (GenericActionHandler.kt:297)");
            }
            this.$content.invoke(composer2, 0);
            GenericAlertContent genericAlertContentGenericActionHandler$lambda$2 = GenericActionHandlerKt.GenericActionHandler$lambda$2(this.$dialogContent$delegate);
            composer2.startReplaceGroup(634521367);
            if (genericAlertContentGenericActionHandler$lambda$2 != null) {
                SduiActionHandler<GenericAction> sduiActionHandler = this.$handler;
                final SnapshotState<GenericAlertContent<GenericAction>> snapshotState = this.$dialogContent$delegate;
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composer2.startReplaceGroup(5004770);
                Object objRememberedValue = composer2.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GenericActionHandlerKt.C206991.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContentGenericActionHandler$lambda$2, sduiActionHandler, null, (Function0) objRememberedValue, composer2, 3072, 4);
                composer2 = composer2;
                Unit unit = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            final GenericAlertContent genericAlertContentGenericActionHandler$lambda$5 = GenericActionHandlerKt.GenericActionHandler$lambda$5(this.$bottomSheetContent$delegate);
            composer2.startReplaceGroup(634530272);
            if (genericAlertContentGenericActionHandler$lambda$5 != null) {
                final CoroutineScope coroutineScope = this.$coroutineScope;
                final SheetState sheetState = this.$bottomSheetState;
                final SnapshotState<GenericAlertContent<GenericAction>> snapshotState2 = this.$bottomSheetContent$delegate;
                final SduiActionHandler<GenericAction> sduiActionHandler2 = this.$handler;
                composer2.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer2.changedInstance(coroutineScope) | composer2.changed(sheetState);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return GenericActionHandlerKt.C206991.invoke$lambda$5$lambda$4$lambda$3(coroutineScope, sheetState, snapshotState2);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                GenericActionHandlerKt.SduiModalBottomSheet((Function0) objRememberedValue2, sheetState, null, ComposableLambda3.rememberComposableLambda(-69141865, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$2$2
                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer3, int i2) {
                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                        if ((i2 & 17) == 16 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-69141865, i2, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandler.<anonymous>.<anonymous>.<anonymous> (GenericActionHandler.kt:319)");
                        }
                        SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                        final GenericAlertContent<GenericAction> genericAlertContent = genericAlertContentGenericActionHandler$lambda$5;
                        SduiActionHandler<GenericAction> sduiActionHandler3 = sduiActionHandler2;
                        composer3.startReplaceGroup(1847729312);
                        final Button button = (Button) genericAlertContent.getAction_buttons().get(0);
                        final Button button2 = (Button) CollectionsKt.getOrNull(genericAlertContent.getAction_buttons(), 1);
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler3, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$2$2$invoke$$inlined$AlertSheet$1
                            public final void invoke(Composer composer4, int i3) {
                                long jM21372getBg20d7_KjU;
                                String serverValue;
                                if ((i3 & 3) == 2 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(925557249, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                                }
                                Pictogram pog = genericAlertContent.getPog();
                                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                                String title = genericAlertContent.getTitle();
                                final String body_markdown = genericAlertContent.getBody_markdown();
                                final List body_components = genericAlertContent.getBody_components();
                                SduiAlert sduiAlert3 = SduiAlert.INSTANCE;
                                BentoAlertButton alertButton = sduiAlert3.toAlertButton(button, null, composer4, 0, 1);
                                Button button3 = button2;
                                composer4.startReplaceGroup(402298512);
                                BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert3.toAlertButton(button3, null, composer4, 0, 1);
                                composer4.endReplaceGroup();
                                int i4 = BentoAlertButton.$stable;
                                int i5 = (i4 << 9) | (i4 << 12);
                                composer4.startReplaceGroup(221388998);
                                final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt$GenericActionHandler$1$2$2$invoke$$inlined$AlertSheet$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer5, Integer num) {
                                        invoke(composer5, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer5, int i6) {
                                        if ((i6 & 3) == 2 && composer5.getSkipping()) {
                                            composer5.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1694075195, i6, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                                        }
                                        Alignment.Companion companion = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                        String str = body_markdown;
                                        int i7 = iM7919getCentere0LSkKk;
                                        List list = body_components;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer5, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion2);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                        if (composer5.getApplier() == null) {
                                            Composables.invalidApplier();
                                        }
                                        composer5.startReusableNode();
                                        if (composer5.getInserting()) {
                                            composer5.createNode(constructor);
                                        } else {
                                            composer5.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer5.startReplaceGroup(1390346787);
                                        if (str.length() > 0) {
                                            BentoAlerts2.m20854AlertBodyText5stqomU(str, i7, composer5, 0, 0);
                                        }
                                        composer5.endReplaceGroup();
                                        composer5.startReplaceGroup(1390351170);
                                        if (list != null) {
                                            ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                            composer5.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(persistentList, GenericAction.class, companion2, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer5, 100859904, 0);
                                            composer5.endReplaceGroup();
                                        }
                                        composer5.endReplaceGroup();
                                        composer5.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer4, 54);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i6 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer4, i6).m21371getBg0d7_KjU(), null, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierM4872backgroundbw27NRU$default);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
                                if (composer4.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer4.startReusableNode();
                                if (composer4.getInserting()) {
                                    composer4.createNode(constructor);
                                } else {
                                    composer4.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(1)), 0.0f, 1, null);
                                if (bentoTheme.getColors(composer4, i6).getIsDay()) {
                                    composer4.startReplaceGroup(-2071673393);
                                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer4, i6).getJet();
                                } else {
                                    composer4.startReplaceGroup(-2071672529);
                                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer4, i6).m21372getBg20d7_KjU();
                                }
                                composer4.endReplaceGroup();
                                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer4, 0);
                                BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer4, ((i5 >> 12) & 112) | 1572864 | ((i5 << 6) & 896) | (i4 << 12), 41);
                                composer4.endNode();
                                composer4.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                invoke(composer4, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer3, 54), composer3, 48);
                        composer3.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                        invoke(column5, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer2, 54), composer2, 3072, 4);
                Unit unit2 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            if (!this.$optInDto) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                BentoTheme2.BentoTheme(null, null, null, null, null, Boolean.TRUE, null, null, ComposableLambda3.rememberComposableLambda(-1401338659, true, new AnonymousClass3(this.$sheetDto$delegate, this.$coroutineScope, this.$bottomSheetState, this.$align$delegate, this.$dialogAlert$delegate), composer2, 54), composer, 100859904, EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }
    }

    public static final GenericActionDto unpackGenericActionDto(ActionDto actionDto) {
        AnyMessage concrete;
        if (actionDto == null || (concrete = actionDto.getConcrete()) == null) {
            return null;
        }
        GenericActionDto.Companion companion = GenericActionDto.INSTANCE;
        rh_server_driven_ui.p531v1.GenericAction genericAction = (rh_server_driven_ui.p531v1.GenericAction) concrete.unpack(companion.getProtoAdapter());
        if (genericAction != null) {
            return companion.fromProto(genericAction);
        }
        return null;
    }
}
