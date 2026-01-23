package com.robinhood.android.common.portfolio.positionsList;

import android.content.Context;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
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
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandler;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.action.GenericActionHandlerKt;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.android.models.portfolio.api.PositionsLocation;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlerts2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.AccountPositionAction;
import com.robinhood.models.serverdriven.experimental.api.AssetHomeAssetType;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.models.serverdriven.experimental.api.Pictogram;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountPositionActionHandler.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ai\u0010\f\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0005\u0018\u00010\b2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\f\u0010\r\"\u0014\u0010\u000f\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015²\u0006\u0016\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002²\u0006\u0016\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\n@\nX\u008a\u008e\u0002"}, m3636d2 = {"", "allowSortOptionsSelection", "Lcom/robinhood/android/models/portfolio/api/PositionsLocation;", "positionsLocation", "Lkotlin/Function0;", "", "onDismiss", "onSortOptionsFragmentShown", "Lkotlin/Function1;", "Lcom/robinhood/models/serverdriven/experimental/api/AssetHomeAssetType;", "onAssetHomeOpened", "content", "AccountPositionActionHandler", "(ZLcom/robinhood/android/models/portfolio/api/PositionsLocation;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;II)V", "", "PositionsSortOptionsDialogTag", "Ljava/lang/String;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/AccountPositionAction;", "dialogContent", "bottomSheetContent", "feature-lib-portfolio_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class AccountPositionActionHandler {
    public static final String PositionsSortOptionsDialogTag = "positions_sort_options";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountPositionActionHandler$lambda$7(boolean z, PositionsLocation positionsLocation, Function0 function0, Function0 function02, Function1 function1, Function2 function2, int i, int i2, Composer composer, int i3) {
        AccountPositionActionHandler(z, positionsLocation, function0, function02, function1, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01ca  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0186  */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v24 */
    /* JADX WARN: Type inference failed for: r1v3, types: [androidx.compose.runtime.SnapshotMutationPolicy, java.lang.Object, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AccountPositionActionHandler(final boolean z, final PositionsLocation positionsLocation, Function0<Unit> function0, Function0<Unit> function02, Function1<? super AssetHomeAssetType, Unit> function1, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Function0<Unit> function03;
        int i4;
        Function0<Unit> function04;
        int i5;
        Function1<? super AssetHomeAssetType, Unit> function12;
        Function1<? super AssetHomeAssetType, Unit> function13;
        Context context;
        Navigator navigator;
        FragmentManager supportFragmentManager;
        Object objRememberedValue;
        Composer.Companion companion;
        CoroutineScope coroutineScope;
        Screen screen;
        Object objRememberedValue2;
        ?? r1;
        SnapshotState snapshotState;
        SheetState sheetStateRememberModalBottomSheetState;
        Object objRememberedValue3;
        SnapshotState snapshotState2;
        boolean zChangedInstance;
        Object objRememberedValue4;
        Function0<Unit> function05;
        SheetState sheetState;
        SnapshotState snapshotState3;
        Function0<Unit> function06;
        SnapshotState snapshotState4;
        Composer composer2;
        final Function1<? super AssetHomeAssetType, Unit> function14;
        final Function0<Unit> function07;
        final Function0<Unit> function08;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(positionsLocation, "positionsLocation");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1028454114);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            z2 = z;
        } else {
            z2 = z;
            if ((i & 6) == 0) {
                i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
            } else {
                i3 = i;
            }
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(positionsLocation.ordinal()) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                function03 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function03) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function04 = function02;
                    i3 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 16384 : 8192;
                    }
                    if ((i2 & 32) == 0) {
                        i3 |= 196608;
                    } else if ((i & 196608) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(content) ? 131072 : 65536;
                    }
                    if ((i3 & 74899) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        if (i6 != 0) {
                            function03 = null;
                        }
                        if (i4 != 0) {
                            function04 = null;
                        }
                        function13 = i5 == 0 ? null : function12;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1028454114, i3, -1, "com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandler (AccountPositionActionHandler.kt:50)");
                        }
                        context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                        navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                        AppCompatActivity appCompatActivityFindActivityBaseContext = BaseContexts.findActivityBaseContext(context);
                        supportFragmentManager = appCompatActivityFindActivityBaseContext == null ? appCompatActivityFindActivityBaseContext.getSupportFragmentManager() : null;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        coroutineScope = (CoroutineScope) objRememberedValue;
                        screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 != companion.getEmpty()) {
                            r1 = 0;
                            objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        } else {
                            r1 = 0;
                        }
                        snapshotState = (SnapshotState) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, r1, composerStartRestartGroup, 6, 2);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(r1, r1, 2, r1);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        snapshotState2 = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(coroutineScope) | ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(supportFragmentManager) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | ((i3 & 896) != 256);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChangedInstance || objRememberedValue4 == companion.getEmpty()) {
                            function05 = function04;
                            sheetState = sheetStateRememberModalBottomSheetState;
                            snapshotState3 = snapshotState2;
                            function06 = function03;
                            AccountPositionActionHandler4 accountPositionActionHandler4 = new AccountPositionActionHandler4(function13, navigator, context, screen, coroutineScope, z2, supportFragmentManager, positionsLocation, function06, function05, sheetState, snapshotState3, snapshotState);
                            snapshotState4 = snapshotState;
                            composerStartRestartGroup.updateRememberedValue(accountPositionActionHandler4);
                            objRememberedValue4 = accountPositionActionHandler4;
                        } else {
                            sheetState = sheetStateRememberModalBottomSheetState;
                            snapshotState3 = snapshotState2;
                            function06 = function03;
                            function05 = function04;
                            snapshotState4 = snapshotState;
                        }
                        SduiActionHandler sduiActionHandler = (SduiActionHandler) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler, ComposableLambda3.rememberComposableLambda(308357247, true, new C115711(content, snapshotState4, sduiActionHandler, snapshotState3, coroutineScope, sheetState), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function14 = function13;
                        function07 = function06;
                        function08 = function05;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        composer2 = composerStartRestartGroup;
                        function07 = function03;
                        function14 = function12;
                        function08 = function04;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return AccountPositionActionHandler.AccountPositionActionHandler$lambda$7(z, positionsLocation, function07, function08, function14, content, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                function12 = function1;
                if ((i2 & 32) == 0) {
                }
                if ((i3 & 74899) == 74898) {
                    if (i6 != 0) {
                    }
                    if (i4 != 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                    navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                    AppCompatActivity appCompatActivityFindActivityBaseContext2 = BaseContexts.findActivityBaseContext(context);
                    if (appCompatActivityFindActivityBaseContext2 == null) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    coroutineScope = (CoroutineScope) objRememberedValue;
                    screen = ((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor())).getScreen();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 != companion.getEmpty()) {
                    }
                    snapshotState = (SnapshotState) objRememberedValue2;
                    composerStartRestartGroup.endReplaceGroup();
                    sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, r1, composerStartRestartGroup, 6, 2);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                    }
                    snapshotState2 = (SnapshotState) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChangedInstance = ((57344 & i3) != 16384) | composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changedInstance(screen) | composerStartRestartGroup.changedInstance(coroutineScope) | ((i3 & 14) != 4) | composerStartRestartGroup.changedInstance(supportFragmentManager) | ((i3 & 112) != 32) | ((i3 & 7168) != 2048) | composerStartRestartGroup.changed(sheetStateRememberModalBottomSheetState) | ((i3 & 896) != 256);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        function05 = function04;
                        sheetState = sheetStateRememberModalBottomSheetState;
                        snapshotState3 = snapshotState2;
                        function06 = function03;
                        AccountPositionActionHandler4 accountPositionActionHandler42 = new AccountPositionActionHandler4(function13, navigator, context, screen, coroutineScope, z2, supportFragmentManager, positionsLocation, function06, function05, sheetState, snapshotState3, snapshotState);
                        snapshotState4 = snapshotState;
                        composerStartRestartGroup.updateRememberedValue(accountPositionActionHandler42);
                        objRememberedValue4 = accountPositionActionHandler42;
                        SduiActionHandler sduiActionHandler2 = (SduiActionHandler) objRememberedValue4;
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler2, ComposableLambda3.rememberComposableLambda(308357247, true, new C115711(content, snapshotState4, sduiActionHandler2, snapshotState3, coroutineScope, sheetState), composer2, 54), composer2, 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function14 = function13;
                        function07 = function06;
                        function08 = function05;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function04 = function02;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            function12 = function1;
            if ((i2 & 32) == 0) {
            }
            if ((i3 & 74899) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function03 = function0;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        function04 = function02;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        function12 = function1;
        if ((i2 & 32) == 0) {
        }
        if ((i3 & 74899) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAlertContent<AccountPositionAction> AccountPositionActionHandler$lambda$1(SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GenericAlertContent<AccountPositionAction> AccountPositionActionHandler$lambda$4(SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void AccountPositionActionHandler$lambda$2(SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState, GenericAlertContent<? extends AccountPositionAction> genericAlertContent) {
        snapshotState.setValue(genericAlertContent);
    }

    /* compiled from: AccountPositionActionHandler.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$1 */
    static final class C115711 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<GenericAlertContent<AccountPositionAction>> $bottomSheetContent$delegate;
        final /* synthetic */ SheetState $bottomSheetState;
        final /* synthetic */ Function2<Composer, Integer, Unit> $content;
        final /* synthetic */ CoroutineScope $coroutineScope;
        final /* synthetic */ SnapshotState<GenericAlertContent<AccountPositionAction>> $dialogContent$delegate;
        final /* synthetic */ SduiActionHandler<AccountPositionAction> $handler;

        /* JADX WARN: Multi-variable type inference failed */
        C115711(Function2<? super Composer, ? super Integer, Unit> function2, SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState, SduiActionHandler<? super AccountPositionAction> sduiActionHandler, SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState2, CoroutineScope coroutineScope, SheetState sheetState) {
            this.$content = function2;
            this.$dialogContent$delegate = snapshotState;
            this.$handler = sduiActionHandler;
            this.$bottomSheetContent$delegate = snapshotState2;
            this.$coroutineScope = coroutineScope;
            this.$bottomSheetState = sheetState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$2$lambda$1$lambda$0(SnapshotState snapshotState) {
            AccountPositionActionHandler.AccountPositionActionHandler$lambda$2(snapshotState, null);
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(308357247, i, -1, "com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandler.<anonymous> (AccountPositionActionHandler.kt:196)");
            }
            this.$content.invoke(composer, 0);
            GenericAlertContent genericAlertContentAccountPositionActionHandler$lambda$1 = AccountPositionActionHandler.AccountPositionActionHandler$lambda$1(this.$dialogContent$delegate);
            composer.startReplaceGroup(-21427439);
            if (genericAlertContentAccountPositionActionHandler$lambda$1 != null) {
                SduiActionHandler<AccountPositionAction> sduiActionHandler = this.$handler;
                final SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState = this.$dialogContent$delegate;
                SduiAlert sduiAlert = SduiAlert.INSTANCE;
                composer.startReplaceGroup(5004770);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountPositionActionHandler.C115711.invoke$lambda$2$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                sduiAlert.Dialog(genericAlertContentAccountPositionActionHandler$lambda$1, sduiActionHandler, null, (Function0) objRememberedValue, composer, (SduiAlert.$stable << 12) | 3072, 4);
                Unit unit = Unit.INSTANCE;
            }
            composer.endReplaceGroup();
            final GenericAlertContent genericAlertContentAccountPositionActionHandler$lambda$4 = AccountPositionActionHandler.AccountPositionActionHandler$lambda$4(this.$bottomSheetContent$delegate);
            if (genericAlertContentAccountPositionActionHandler$lambda$4 != null) {
                final CoroutineScope coroutineScope = this.$coroutineScope;
                final SheetState sheetState = this.$bottomSheetState;
                final SnapshotState<GenericAlertContent<AccountPositionAction>> snapshotState2 = this.$bottomSheetContent$delegate;
                final SduiActionHandler<AccountPositionAction> sduiActionHandler2 = this.$handler;
                composer.startReplaceGroup(-1746271574);
                boolean zChangedInstance = composer.changedInstance(coroutineScope) | composer.changed(sheetState);
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AccountPositionActionHandler.C115711.invoke$lambda$5$lambda$4$lambda$3(coroutineScope, sheetState, snapshotState2);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                GenericActionHandlerKt.SduiModalBottomSheet((Function0) objRememberedValue2, sheetState, null, ComposableLambda3.rememberComposableLambda(-1771639183, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$1$2$2
                    public final void invoke(Column5 SduiModalBottomSheet, Composer composer2, int i2) {
                        Intrinsics.checkNotNullParameter(SduiModalBottomSheet, "$this$SduiModalBottomSheet");
                        if ((i2 & 17) == 16 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1771639183, i2, -1, "com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandler.<anonymous>.<anonymous>.<anonymous> (AccountPositionActionHandler.kt:216)");
                        }
                        SduiAlert sduiAlert2 = SduiAlert.INSTANCE;
                        final GenericAlertContent<AccountPositionAction> genericAlertContent = genericAlertContentAccountPositionActionHandler$lambda$4;
                        SduiActionHandler<AccountPositionAction> sduiActionHandler3 = sduiActionHandler2;
                        int i3 = SduiAlert.$stable << 6;
                        composer2.startReplaceGroup(1847729312);
                        final Button button = (Button) genericAlertContent.getAction_buttons().get(0);
                        final Button button2 = (Button) CollectionsKt.getOrNull(genericAlertContent.getAction_buttons(), 1);
                        SduiActionHandler3.ProvideActionHandler(sduiActionHandler3, ComposableLambda3.rememberComposableLambda(925557249, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$1$2$2$invoke$$inlined$AlertSheet$1
                            public final void invoke(Composer composer3, int i4) {
                                long jM21372getBg20d7_KjU;
                                String serverValue;
                                if ((i4 & 3) == 2 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(925557249, i4, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiAlert.AlertSheet.<anonymous> (SduiAlert.kt:186)");
                                }
                                Pictogram pog = genericAlertContent.getPog();
                                ServerToBentoAssetMapper3 serverToBentoAssetMapper3FromServerValue = (pog == null || (serverValue = pog.getServerValue()) == null) ? null : ServerToBentoAssetMapper3.INSTANCE.fromServerValue(serverValue);
                                String title = genericAlertContent.getTitle();
                                final String body_markdown = genericAlertContent.getBody_markdown();
                                final List body_components = genericAlertContent.getBody_components();
                                SduiAlert sduiAlert3 = SduiAlert.INSTANCE;
                                BentoAlertButton alertButton = sduiAlert3.toAlertButton(button, null, composer3, 0, 1);
                                Button button3 = button2;
                                composer3.startReplaceGroup(402298512);
                                BentoAlertButton alertButton2 = button3 == null ? null : sduiAlert3.toAlertButton(button3, null, composer3, 0, 1);
                                composer3.endReplaceGroup();
                                int i5 = BentoAlertButton.$stable;
                                int i6 = (i5 << 9) | (i5 << 12);
                                composer3.startReplaceGroup(221388998);
                                final int iM7919getCentere0LSkKk = TextAlign.INSTANCE.m7919getCentere0LSkKk();
                                ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1694075195, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.portfolio.positionsList.AccountPositionActionHandlerKt$AccountPositionActionHandler$1$2$2$invoke$$inlined$AlertSheet$1.1
                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                        invoke(composer4, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer4, int i7) {
                                        if ((i7 & 3) == 2 && composer4.getSkipping()) {
                                            composer4.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-1694075195, i7, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.alerts.BentoSduiAlertSheet.<anonymous> (BentoSduiAlertSheet.kt:38)");
                                        }
                                        Alignment.Companion companion = Alignment.INSTANCE;
                                        Alignment.Horizontal centerHorizontally = companion.getCenterHorizontally();
                                        String str = body_markdown;
                                        int i8 = iM7919getCentere0LSkKk;
                                        List list = body_components;
                                        Modifier.Companion companion2 = Modifier.INSTANCE;
                                        Arrangement arrangement = Arrangement.INSTANCE;
                                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composer4, 48);
                                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion2);
                                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                        Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                        }
                                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                        Column6 column6 = Column6.INSTANCE;
                                        composer4.startReplaceGroup(1390346787);
                                        if (str.length() > 0) {
                                            BentoAlerts2.m20854AlertBodyText5stqomU(str, i8, composer4, 0, 0);
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.startReplaceGroup(1390351170);
                                        if (list != null) {
                                            ImmutableList3 persistentList = extensions2.toPersistentList(list);
                                            HorizontalPadding horizontalPadding = HorizontalPadding.None;
                                            composer4.startReplaceGroup(-1772220517);
                                            SduiColumns.SduiColumn(persistentList, AccountPositionAction.class, companion2, null, null, horizontalPadding, arrangement.getTop(), companion.getStart(), true, composer4, 100859904, 0);
                                            composer4.endReplaceGroup();
                                        }
                                        composer4.endReplaceGroup();
                                        composer4.endNode();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }
                                }, composer3, 54);
                                Modifier.Companion companion = Modifier.INSTANCE;
                                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                int i7 = BentoTheme.$stable;
                                Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(companion, bentoTheme.getColors(composer3, i7).m21371getBg0d7_KjU(), null, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getTopStart(), false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM4872backgroundbw27NRU$default);
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
                                if (bentoTheme.getColors(composer3, i7).getIsDay()) {
                                    composer3.startReplaceGroup(-2071673393);
                                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i7).getJet();
                                } else {
                                    composer3.startReplaceGroup(-2071672529);
                                    jM21372getBg20d7_KjU = bentoTheme.getColors(composer3, i7).m21372getBg20d7_KjU();
                                }
                                composer3.endReplaceGroup();
                                BoxKt.Box(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, jM21372getBg20d7_KjU, null, 2, null), composer3, 0);
                                BentoAlerts2.AlertContent(null, serverToBentoAssetMapper3FromServerValue, title, null, CollectionsKt.listOfNotNull((Object[]) new BentoAlertButton[]{alertButton, alertButton2}), false, composableLambdaRememberComposableLambda, composer3, ((i6 >> 12) & 112) | 1572864 | ((i6 << 6) & 896) | (i5 << 12), 41);
                                composer3.endNode();
                                composer3.endReplaceGroup();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer2, 54), composer2, ((i3 >> 3) & 14) | 48);
                        composer2.endReplaceGroup();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer2, Integer num) {
                        invoke(column5, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composer, 54), composer, 3072, 4);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(CoroutineScope coroutineScope, SheetState sheetState, SnapshotState snapshotState) {
            BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AccountPositionActionHandler2(sheetState, snapshotState, null), 3, null);
            return Unit.INSTANCE;
        }
    }
}
