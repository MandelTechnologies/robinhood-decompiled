package com.robinhood.android.supportchat.thread.compose.dialog;

import android.content.Context;
import android.net.Uri;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.supportchat.thread.compose.CxChatDialogData;
import com.robinhood.models.p355ui.p356v2.UpdateSupportChatError;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CxChatDialog.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a¯\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00072\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"CxChatDialog", "", "dialogData", "Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;", "modifier", "Landroidx/compose/ui/Modifier;", "startImageUploadFlow", "Lkotlin/Function0;", "openImagePicker", "startCamera", "openPermissionSetting", "endChat", "escalateToAgent", "showPushSettings", "dismissDialog", "navigateBack", "(Lcom/robinhood/android/supportchat/thread/compose/CxChatDialogData;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;III)V", "feature-support-chat_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class CxChatDialog {

    /* compiled from: CxChatDialog.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CxChatDialogData.ImageSizeLimit.Source.values().length];
            try {
                iArr[CxChatDialogData.ImageSizeLimit.Source.IMAGE_PICKER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CxChatDialogData.ImageSizeLimit.Source.CAMERA.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$38(CxChatDialogData cxChatDialogData, Modifier modifier, Function0 function0, Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function0 function06, Function0 function07, Function0 function08, Function0 function09, int i, int i2, int i3, Composer composer, int i4) {
        CxChatDialog(cxChatDialogData, modifier, function0, function02, function03, function04, function05, function06, function07, function08, function09, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$19$lambda$18(Navigator navigator, Context context, Function0 function0, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(deeplink), Boolean.TRUE, null, false, null, 40, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a6  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x0260  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:336:0x06e1  */
    /* JADX WARN: Removed duplicated region for block: B:340:0x06f7  */
    /* JADX WARN: Removed duplicated region for block: B:344:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CxChatDialog(final CxChatDialogData dialogData, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03, Function0<Unit> function04, Function0<Unit> function05, Function0<Unit> function06, Function0<Unit> function07, Function0<Unit> function08, Function0<Unit> function09, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        Function0<Unit> function010;
        int i5;
        Function0<Unit> function011;
        int i6;
        Function0<Unit> function012;
        int i7;
        final Function0<Unit> function013;
        int i8;
        final Function0<Unit> function014;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        final Function0<Unit> function015;
        final Function0<Unit> function016;
        final Function0<Unit> function017;
        final Function0<Unit> function018;
        final Function0<Unit> function019;
        final Function0<Unit> function020;
        Modifier modifier2;
        final Function0<Unit> function021;
        Composer composer2;
        Function0<Unit> function022;
        Function0<Unit> function023;
        final Function0<Unit> function024;
        final Function0<Unit> function025;
        final Function0<Unit> function026;
        final Function0<Unit> function027;
        final Function0<Unit> function028;
        final Function0<Unit> function029;
        final Function0<Unit> function030;
        final Modifier modifier3;
        final Function0<Unit> function031;
        final Function0<Unit> function032;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(dialogData, "dialogData");
        Composer composerStartRestartGroup = composer.startRestartGroup(663805121);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = ((i & 8) == 0 ? composerStartRestartGroup.changed(dialogData) : composerStartRestartGroup.changedInstance(dialogData) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i15 = i3 & 4;
        if (i15 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                function010 = function0;
                i4 |= composerStartRestartGroup.changedInstance(function010) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function011 = function02;
                    i4 |= composerStartRestartGroup.changedInstance(function011) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 == 0) {
                    if ((i & 24576) == 0) {
                        function012 = function03;
                        i4 |= composerStartRestartGroup.changedInstance(function012) ? 16384 : 8192;
                    }
                    i7 = i3 & 32;
                    if (i7 == 0) {
                        i4 |= 196608;
                        function013 = function04;
                    } else {
                        function013 = function04;
                        if ((i & 196608) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function013) ? 131072 : 65536;
                        }
                    }
                    i8 = i3 & 64;
                    if (i8 == 0) {
                        i4 |= 1572864;
                        function014 = function05;
                    } else {
                        function014 = function05;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changedInstance(function014) ? 1048576 : 524288;
                        }
                    }
                    i9 = i3 & 128;
                    if (i9 == 0) {
                        i4 |= 12582912;
                    } else if ((i & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function06) ? 8388608 : 4194304;
                    }
                    i10 = i3 & 256;
                    if (i10 == 0) {
                        i4 |= 100663296;
                    } else if ((i & 100663296) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function07) ? 67108864 : 33554432;
                    }
                    i11 = i3 & 512;
                    if (i11 == 0) {
                        i4 |= 805306368;
                    } else if ((i & 805306368) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function08) ? 536870912 : 268435456;
                    }
                    i12 = i3 & 1024;
                    if (i12 == 0) {
                        i13 = i12;
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i13 = i12;
                        i14 = i2 | (composerStartRestartGroup.changedInstance(function09) ? 4 : 2);
                    } else {
                        i13 = i12;
                        i14 = i2;
                    }
                    if ((i4 & 306783363) != 306783362 && (i14 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.skipToGroupEnd();
                        function030 = function07;
                        composer2 = composerStartRestartGroup;
                        function026 = function013;
                        function025 = function010;
                        function031 = function014;
                        function027 = function011;
                        function028 = function012;
                        modifier3 = modifier;
                        function029 = function06;
                        function024 = function08;
                        function032 = function09;
                    } else {
                        Modifier modifier4 = (i3 & 2) == 0 ? Modifier.INSTANCE : modifier;
                        if (i15 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            function015 = (Function0) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function015 = function010;
                        }
                        if (i5 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda11
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            function016 = (Function0) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function016 = function011;
                        }
                        if (i6 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            function017 = (Function0) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function017 = function012;
                        }
                        if (i7 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda13
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            function013 = (Function0) objRememberedValue4;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (i8 != 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue5 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda14
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                            }
                            function014 = (Function0) objRememberedValue5;
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        if (i9 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue6 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda15
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                            }
                            function018 = (Function0) objRememberedValue6;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function018 = function06;
                        }
                        if (i10 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda16
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            }
                            function019 = (Function0) objRememberedValue7;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function019 = function07;
                        }
                        if (i11 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue8 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda17
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                            }
                            function020 = (Function0) objRememberedValue8;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            function020 = function08;
                        }
                        if (i13 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                            modifier2 = modifier4;
                            if (objRememberedValue9 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue9 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda18
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.INSTANCE;
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                            }
                            function021 = (Function0) objRememberedValue9;
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            modifier2 = modifier4;
                            function021 = function09;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(663805121, i4, i14, "com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialog (CxChatDialog.kt:29)");
                        }
                        if (dialogData instanceof CxChatDialogData.CxChatExistingLiveCase) {
                            composer2 = composerStartRestartGroup;
                            if (Intrinsics.areEqual(dialogData, CxChatDialogData.EndChat.INSTANCE)) {
                                composer2.startReplaceGroup(1390236385);
                                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer2, AutoLoggingCompositionLocals4.$stable);
                                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                composer2.startReplaceGroup(-1224400529);
                                function022 = function021;
                                boolean zChangedInstance = ((3670016 & i4) == 1048576) | composer2.changedInstance(userInteractionEventDescriptor) | composer2.changedInstance(current) | ((i4 & 1879048192) == 536870912);
                                Object objRememberedValue10 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue10 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda2
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CxChatDialog.CxChatDialog$lambda$23$lambda$22(userInteractionEventDescriptor, current, function014, function020);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue10);
                                }
                                composer2.endReplaceGroup();
                                CxChatEndConfirmationDialog.CxChatEndConfirmationDialog((Function0) objRememberedValue10, function020, null, composer2, (i4 >> 24) & 112, 4);
                                composer2.endReplaceGroup();
                            } else {
                                function022 = function021;
                                if (Intrinsics.areEqual(dialogData, CxChatDialogData.EndChatError.INSTANCE)) {
                                    composer2.startReplaceGroup(1391085692);
                                    composer2.startReplaceGroup(-1633490746);
                                    boolean z = ((3670016 & i4) == 1048576) | ((i4 & 1879048192) == 536870912);
                                    Object objRememberedValue11 = composer2.rememberedValue();
                                    if (z || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue11 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda3
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return CxChatDialog.CxChatDialog$lambda$25$lambda$24(function014, function020);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue11);
                                    }
                                    composer2.endReplaceGroup();
                                    CxChatEndChatErrorDialog.CxChatEndChatErrorDialog((Function0) objRememberedValue11, function020, null, composer2, (i4 >> 24) & 112, 4);
                                    composer2.endReplaceGroup();
                                } else {
                                    if (dialogData instanceof CxChatDialogData.UpdateChatError) {
                                        composer2.startReplaceGroup(1391370582);
                                        final Navigator navigator = (Navigator) composer2.consume(LocalNavigator.getLocalNavigator());
                                        final Context context = (Context) composer2.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                        UpdateSupportChatError errorInfo = ((CxChatDialogData.UpdateChatError) dialogData).getErrorInfo();
                                        composer2.startReplaceGroup(-1746271574);
                                        function023 = function014;
                                        boolean zChangedInstance2 = composer2.changedInstance(navigator) | composer2.changedInstance(context) | ((i4 & 1879048192) == 536870912);
                                        Object objRememberedValue12 = composer2.rememberedValue();
                                        if (zChangedInstance2 || objRememberedValue12 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue12 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda4
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return CxChatDialog.CxChatDialog$lambda$27$lambda$26(navigator, context, function020, (String) obj);
                                                }
                                            };
                                            composer2.updateRememberedValue(objRememberedValue12);
                                        }
                                        composer2.endReplaceGroup();
                                        CxChatUpdateErrorDialog.CxChatUpdateErrorDialog(errorInfo, (Function1) objRememberedValue12, function020, null, composer2, (i4 >> 21) & 896, 8);
                                        composer2.endReplaceGroup();
                                    } else {
                                        function023 = function014;
                                        if (Intrinsics.areEqual(dialogData, CxChatDialogData.CharacterLimit.INSTANCE)) {
                                            composer2.startReplaceGroup(1391921390);
                                            CxChatCharacterLimitDialog.CxChatCharacterLimitDialog(function020, null, composer2, (i4 >> 27) & 14, 2);
                                            composer2.endReplaceGroup();
                                        } else if (dialogData instanceof CxChatDialogData.ImageSizeLimit) {
                                            composer2.startReplaceGroup(1392093750);
                                            composer2.startReplaceGroup(-1224400529);
                                            boolean z2 = ((i4 & 14) == 4 || ((i4 & 8) != 0 && composer2.changedInstance(dialogData))) | ((i4 & 7168) == 2048) | ((57344 & i4) == 16384) | ((i4 & 1879048192) == 536870912);
                                            Object objRememberedValue13 = composer2.rememberedValue();
                                            if (z2 || objRememberedValue13 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue13 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda5
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CxChatDialog.CxChatDialog$lambda$29$lambda$28(dialogData, function016, function017, function020);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue13);
                                            }
                                            composer2.endReplaceGroup();
                                            CxChatImageSizeLimitDialog.CxChatImageSizeLimitDialog((Function0) objRememberedValue13, function020, null, composer2, (i4 >> 24) & 112, 4);
                                            composer2.endReplaceGroup();
                                        } else if (Intrinsics.areEqual(dialogData, CxChatDialogData.CameraPermission.INSTANCE)) {
                                            composer2.startReplaceGroup(1392589564);
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean z3 = ((458752 & i4) == 131072) | ((i4 & 1879048192) == 536870912);
                                            Object objRememberedValue14 = composer2.rememberedValue();
                                            if (z3 || objRememberedValue14 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue14 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda6
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CxChatDialog.CxChatDialog$lambda$31$lambda$30(function013, function020);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue14);
                                            }
                                            composer2.endReplaceGroup();
                                            CxChatCameraPermissionDialog.CxChatCameraPermissionDialog((Function0) objRememberedValue14, function020, null, composer2, (i4 >> 24) & 112, 4);
                                            composer2.endReplaceGroup();
                                        } else if (Intrinsics.areEqual(dialogData, CxChatDialogData.ImageError.INSTANCE)) {
                                            composer2.startReplaceGroup(1392888404);
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean z4 = ((i4 & 896) == 256) | ((i4 & 1879048192) == 536870912);
                                            Object objRememberedValue15 = composer2.rememberedValue();
                                            if (z4 || objRememberedValue15 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue15 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda7
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CxChatDialog.CxChatDialog$lambda$33$lambda$32(function015, function020);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue15);
                                            }
                                            composer2.endReplaceGroup();
                                            CxChatImageErrorDialog.CxChatImageErrorDialog((Function0) objRememberedValue15, function020, null, composer2, (i4 >> 24) & 112, 4);
                                            composer2.endReplaceGroup();
                                        } else if (Intrinsics.areEqual(dialogData, CxChatDialogData.PushPrompt.INSTANCE)) {
                                            composer2.startReplaceGroup(1393164552);
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean z5 = ((234881024 & i4) == 67108864) | ((i4 & 1879048192) == 536870912);
                                            Object objRememberedValue16 = composer2.rememberedValue();
                                            if (z5 || objRememberedValue16 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue16 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda8
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CxChatDialog.CxChatDialog$lambda$35$lambda$34(function019, function020);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue16);
                                            }
                                            composer2.endReplaceGroup();
                                            CxChatPushPromptDialog.CxChatPushPromptDialog((Function0) objRememberedValue16, function020, null, composer2, (i4 >> 24) & 112, 4);
                                            composer2.endReplaceGroup();
                                        } else if (Intrinsics.areEqual(dialogData, CxChatDialogData.UnrecoverableChatbotError.INSTANCE)) {
                                            composer2.startReplaceGroup(1393467298);
                                            composer2.startReplaceGroup(-1633490746);
                                            boolean z6 = ((29360128 & i4) == 8388608) | ((i4 & 1879048192) == 536870912);
                                            Object objRememberedValue17 = composer2.rememberedValue();
                                            if (z6 || objRememberedValue17 == Composer.INSTANCE.getEmpty()) {
                                                objRememberedValue17 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda9
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final Object invoke() {
                                                        return CxChatDialog.CxChatDialog$lambda$37$lambda$36(function018, function020);
                                                    }
                                                };
                                                composer2.updateRememberedValue(objRememberedValue17);
                                            }
                                            composer2.endReplaceGroup();
                                            CxChatUnrecoverableChatbotErrorDialog.CxChatUnrecoverableChatbotErrorDialog((Function0) objRememberedValue17, function020, null, composer2, (i4 >> 24) & 112, 4);
                                            composer2.endReplaceGroup();
                                        } else {
                                            if (!Intrinsics.areEqual(dialogData, CxChatDialogData.None.INSTANCE)) {
                                                composer2.startReplaceGroup(-2033386264);
                                                composer2.endReplaceGroup();
                                                throw new NoWhenBranchMatchedException();
                                            }
                                            composer2.startReplaceGroup(1393747135);
                                            composer2.endReplaceGroup();
                                        }
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    function024 = function020;
                                    function025 = function015;
                                    function026 = function013;
                                    function027 = function016;
                                    function028 = function017;
                                    function029 = function018;
                                    function030 = function019;
                                    modifier3 = modifier2;
                                    function031 = function023;
                                    function032 = function022;
                                }
                            }
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1389494462);
                            final Navigator navigator2 = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                            final Context context2 = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                            CxChatDialogData.CxChatExistingLiveCase cxChatExistingLiveCase = (CxChatDialogData.CxChatExistingLiveCase) dialogData;
                            int i16 = i14;
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(navigator2) | composerStartRestartGroup.changedInstance(context2) | ((i4 & 1879048192) == 536870912);
                            Object objRememberedValue18 = composerStartRestartGroup.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue18 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue18 = new Function1() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda19
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CxChatDialog.CxChatDialog$lambda$19$lambda$18(navigator2, context2, function020, (String) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue18);
                            }
                            Function1 function1 = (Function1) objRememberedValue18;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            boolean z7 = (i16 & 14) == 4;
                            Object objRememberedValue19 = composerStartRestartGroup.rememberedValue();
                            if (z7 || objRememberedValue19 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue19 = new Function0() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CxChatDialog.CxChatDialog$lambda$21$lambda$20(function021);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue19);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            CxChatExistingLiveCaseDialog.CxChatLiveExistingCaseDialog(cxChatExistingLiveCase, function1, (Function0) objRememberedValue19, function020, composerStartRestartGroup, (i4 >> 18) & 7168);
                            composer2 = composerStartRestartGroup;
                            composer2.endReplaceGroup();
                            function022 = function021;
                        }
                        function023 = function014;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        function024 = function020;
                        function025 = function015;
                        function026 = function013;
                        function027 = function016;
                        function028 = function017;
                        function029 = function018;
                        function030 = function019;
                        modifier3 = modifier2;
                        function031 = function023;
                        function032 = function022;
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.supportchat.thread.compose.dialog.CxChatDialogKt$$ExternalSyntheticLambda10
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return CxChatDialog.CxChatDialog$lambda$38(dialogData, modifier3, function025, function027, function028, function026, function031, function029, function030, function024, function032, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 24576;
                function012 = function03;
                i7 = i3 & 32;
                if (i7 == 0) {
                }
                i8 = i3 & 64;
                if (i8 == 0) {
                }
                i9 = i3 & 128;
                if (i9 == 0) {
                }
                i10 = i3 & 256;
                if (i10 == 0) {
                }
                i11 = i3 & 512;
                if (i11 == 0) {
                }
                i12 = i3 & 1024;
                if (i12 == 0) {
                }
                if ((i4 & 306783363) != 306783362) {
                    if ((i3 & 2) == 0) {
                    }
                    if (i15 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i6 == 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i8 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    if (i10 == 0) {
                    }
                    if (i11 == 0) {
                    }
                    if (i13 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    if (dialogData instanceof CxChatDialogData.CxChatExistingLiveCase) {
                    }
                    function023 = function014;
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    function024 = function020;
                    function025 = function015;
                    function026 = function013;
                    function027 = function016;
                    function028 = function017;
                    function029 = function018;
                    function030 = function019;
                    modifier3 = modifier2;
                    function031 = function023;
                    function032 = function022;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function011 = function02;
            i6 = i3 & 16;
            if (i6 == 0) {
            }
            function012 = function03;
            i7 = i3 & 32;
            if (i7 == 0) {
            }
            i8 = i3 & 64;
            if (i8 == 0) {
            }
            i9 = i3 & 128;
            if (i9 == 0) {
            }
            i10 = i3 & 256;
            if (i10 == 0) {
            }
            i11 = i3 & 512;
            if (i11 == 0) {
            }
            i12 = i3 & 1024;
            if (i12 == 0) {
            }
            if ((i4 & 306783363) != 306783362) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        function010 = function0;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function011 = function02;
        i6 = i3 & 16;
        if (i6 == 0) {
        }
        function012 = function03;
        i7 = i3 & 32;
        if (i7 == 0) {
        }
        i8 = i3 & 64;
        if (i8 == 0) {
        }
        i9 = i3 & 128;
        if (i9 == 0) {
        }
        i10 = i3 & 256;
        if (i10 == 0) {
        }
        i11 = i3 & 512;
        if (i11 == 0) {
        }
        i12 = i3 & 1024;
        if (i12 == 0) {
        }
        if ((i4 & 306783363) != 306783362) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$21$lambda$20(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$23$lambda$22(UserInteractionEventDescriptor userInteractionEventDescriptor, EventLogger eventLogger, Function0 function0, Function0 function02) {
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.END_CX_CHAT_CONFIRM, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$25$lambda$24(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$27$lambda$26(Navigator navigator, Context context, Function0 function0, String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, context, Uri.parse(deeplink), null, null, false, null, 60, null);
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$29$lambda$28(CxChatDialogData cxChatDialogData, Function0 function0, Function0 function02, Function0 function03) {
        int i = WhenMappings.$EnumSwitchMapping$0[((CxChatDialogData.ImageSizeLimit) cxChatDialogData).getSource().ordinal()];
        if (i == 1) {
            function0.invoke();
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            function02.invoke();
        }
        function03.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$31$lambda$30(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$33$lambda$32(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$35$lambda$34(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CxChatDialog$lambda$37$lambda$36(Function0 function0, Function0 function02) {
        function0.invoke();
        function02.invoke();
        return Unit.INSTANCE;
    }
}
