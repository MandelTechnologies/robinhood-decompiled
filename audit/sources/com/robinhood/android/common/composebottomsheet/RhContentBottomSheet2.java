package com.robinhood.android.common.composebottomsheet;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhContentBottomSheet2;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhContentBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000J\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\u001a©\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\u0017\u0010\u0006\u001a\u0013\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u0007¢\u0006\u0002\b\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u001b\b\u0002\u0010\u0010\u001a\u0015\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0007¢\u0006\u0002\b\t2\b\b\u0002\u0010\u0011\u001a\u00020\u00122\b\b\u0002\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0015\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\u0016\u001a{\u0010\u0017\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u000e\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u000b2\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019H\u0007¢\u0006\u0002\u0010\u001b\u001a\u0017\u0010\u001c\u001a\u00020\u00012\b\b\u0001\u0010\u001d\u001a\u00020\u001eH\u0003¢\u0006\u0002\u0010\u001f\"\u0016\u0010 \u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b!\u0010\"\"\u0016\u0010#\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b$\u0010\"\"\u0016\u0010%\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b&\u0010\"\"\u0016\u0010'\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b(\u0010\"\"\u0016\u0010)\u001a\u00020\u00038\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b*\u0010\"¨\u0006+"}, m3636d2 = {"RhContentBottomSheet", "", "title", "", "description", "primaryButtonText", "onPrimaryButtonClick", "Lkotlin/Function1;", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "Lkotlin/ExtensionFunctionType;", "onDismissRequest", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "subtitle", "secondaryButtonText", "onSecondaryButtonClick", "showDragHandle", "", "sheetState", "Landroidx/compose/material3/SheetState;", "rhModalBottomSheetScope", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLandroidx/compose/material3/SheetState;Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Landroidx/compose/runtime/Composer;III)V", "RhContentBottomSheetLayout", "primaryButtonEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "secondaryButtonEventDescriptor", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/runtime/Composer;II)V", "RhContentBottomSheetLayoutPreview", "previewState", "Lcom/robinhood/android/common/composebottomsheet/PreviewState;", "(Lcom/robinhood/android/common/composebottomsheet/PreviewState;Landroidx/compose/runtime/Composer;I)V", RhContentBottomSheet2.TestTagTitle, "getTestTagTitle$annotations", "()V", RhContentBottomSheet2.TestTagSubtitle, "getTestTagSubtitle$annotations", RhContentBottomSheet2.TestTagDescription, "getTestTagDescription$annotations", "TestTagPrimaryButtonText", "getTestTagPrimaryButtonText$annotations", "TestTagSecondaryButtonText", "getTestTagSecondaryButtonText$annotations", "lib-compose-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhContentBottomSheet2 {
    public static final String TestTagDescription = "TestTagDescription";
    public static final String TestTagPrimaryButtonText = "primary_button";
    public static final String TestTagSecondaryButtonText = "secondary_button";
    public static final String TestTagSubtitle = "TestTagSubtitle";
    public static final String TestTagTitle = "TestTagTitle";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhContentBottomSheet$lambda$0(String str, String str2, String str3, Function1 function1, Function0 function0, Modifier modifier, String str4, String str5, Function1 function12, boolean z, SheetState sheetState, RhModalBottomSheet5 rhModalBottomSheet5, int i, int i2, int i3, Composer composer, int i4) {
        RhContentBottomSheet(str, str2, str3, function1, function0, modifier, str4, str5, function12, z, sheetState, rhModalBottomSheet5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhContentBottomSheetLayout$lambda$4(String str, String str2, String str3, String str4, String str5, Function0 function0, Modifier modifier, Function0 function02, UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventDescriptor userInteractionEventDescriptor2, int i, int i2, Composer composer, int i3) {
        RhContentBottomSheetLayout(str, str2, str3, str4, str5, function0, modifier, function02, userInteractionEventDescriptor, userInteractionEventDescriptor2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhContentBottomSheetLayoutPreview$lambda$5(PreviewState previewState, int i, Composer composer, int i2) {
        RhContentBottomSheetLayoutPreview(previewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getTestTagDescription$annotations() {
    }

    public static /* synthetic */ void getTestTagPrimaryButtonText$annotations() {
    }

    public static /* synthetic */ void getTestTagSecondaryButtonText$annotations() {
    }

    public static /* synthetic */ void getTestTagSubtitle$annotations() {
    }

    public static /* synthetic */ void getTestTagTitle$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01d8  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01da  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x01f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x024f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x025e  */
    /* JADX WARN: Removed duplicated region for block: B:184:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0128  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhContentBottomSheet(final String title, final String description, final String primaryButtonText, final Function1<? super RhModalBottomSheet5, Unit> onPrimaryButtonClick, final Function0<Unit> onDismissRequest, Modifier modifier, String str, String str2, Function1<? super RhModalBottomSheet5, Unit> function1, boolean z, SheetState sheetState, RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        int i5;
        final String str3;
        int i6;
        String str4;
        int i7;
        Function1<? super RhModalBottomSheet5, Unit> function12;
        int i8;
        int i9;
        int i10;
        SheetState sheetStateRememberModalBottomSheetState;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        final Function1<? super RhModalBottomSheet5, Unit> function13;
        final SheetState sheetState2;
        final boolean z2;
        final SheetState sheetState3;
        final Function1<? super RhModalBottomSheet5, Unit> function14;
        final String str5;
        final Modifier modifier3;
        final boolean z3;
        final RhModalBottomSheet5 rhModalBottomSheet53;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Composer composerStartRestartGroup = composer.startRestartGroup(378817990);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(description) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(primaryButtonText) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i & 24576) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 16384 : 8192;
        }
        int i11 = i3 & 32;
        if (i11 != 0) {
            i4 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i5 = i3 & 64;
            if (i5 == 0) {
                i4 |= 1572864;
                str3 = str;
            } else {
                str3 = str;
                if ((i & 1572864) == 0) {
                    i4 |= composerStartRestartGroup.changed(str3) ? 1048576 : 524288;
                }
            }
            i6 = i3 & 128;
            if (i6 == 0) {
                i4 |= 12582912;
                str4 = str2;
            } else {
                str4 = str2;
                if ((i & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(str4) ? 8388608 : 4194304;
                }
            }
            i7 = i3 & 256;
            if (i7 == 0) {
                i4 |= 100663296;
                function12 = function1;
            } else {
                function12 = function1;
                if ((i & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(function12) ? 67108864 : 33554432;
                }
            }
            i8 = i3 & 512;
            if (i8 != 0) {
                if ((i & 805306368) == 0) {
                    i9 = i8;
                    i4 |= composerStartRestartGroup.changed(z) ? 536870912 : 268435456;
                }
                if ((i2 & 6) == 0) {
                    i10 = i2 | (((i3 & 1024) == 0 && composerStartRestartGroup.changed(sheetState)) ? 4 : 2);
                } else {
                    i10 = i2;
                }
                if ((i2 & 48) == 0) {
                    i10 |= ((i3 & 2048) == 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5)) ? 32 : 16;
                }
                if ((i4 & 306783379) != 306783378 || (i10 & 19) != 18 || !composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                        Modifier modifier4 = i11 == 0 ? Modifier.INSTANCE : modifier2;
                        if (i5 != 0) {
                            str3 = null;
                        }
                        if (i6 != 0) {
                            str4 = null;
                        }
                        if (i7 != 0) {
                            function12 = null;
                        }
                        boolean z4 = i9 == 0 ? false : z;
                        Modifier modifier5 = modifier4;
                        if ((i3 & 1024) == 0) {
                            sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                            i10 &= -15;
                        } else {
                            sheetStateRememberModalBottomSheetState = sheetState;
                        }
                        if ((i3 & 2048) == 0) {
                            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            RhModalBottomSheet5 rhModalBottomSheet54 = new RhModalBottomSheet5(sheetStateRememberModalBottomSheetState, (CoroutineScope) objRememberedValue, onDismissRequest);
                            i10 &= -113;
                            modifier2 = modifier5;
                            rhModalBottomSheet52 = rhModalBottomSheet54;
                        } else {
                            modifier2 = modifier5;
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                        }
                        function13 = function12;
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        z2 = z4;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        if ((i3 & 1024) != 0) {
                            i10 &= -15;
                        }
                        if ((i3 & 2048) != 0) {
                            i10 &= -113;
                        }
                        z2 = z;
                        sheetState2 = sheetState;
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                        function13 = function12;
                    }
                    final String str6 = str4;
                    int i12 = i10;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(378817990, i4, i12, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheet (RhContentBottomSheet.kt:58)");
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1435611601, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt.RhContentBottomSheet.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i13) {
                            if ((i13 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1435611601, i13, -1, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheet.<anonymous> (RhContentBottomSheet.kt:60)");
                            }
                            Function0<Unit> function0 = onDismissRequest;
                            boolean z5 = z2;
                            SheetState sheetState4 = sheetState2;
                            RhModalBottomSheet5 rhModalBottomSheet55 = rhModalBottomSheet52;
                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, z5, sheetState4, rhModalBottomSheet55, 0L, ComposableLambda3.rememberComposableLambda(-1091541206, true, new AnonymousClass1(function13, rhModalBottomSheet55, title, str3, description, primaryButtonText, str6, onPrimaryButtonClick, modifier2), composer2, 54), composer2, 1572864, 34);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RhContentBottomSheet.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheet$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                            final /* synthetic */ String $description;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ Function1<RhModalBottomSheet5, Unit> $onPrimaryButtonClick;
                            final /* synthetic */ Function1<RhModalBottomSheet5, Unit> $onSecondaryButtonClick;
                            final /* synthetic */ String $primaryButtonText;
                            final /* synthetic */ RhModalBottomSheet5 $rhModalBottomSheetScope;
                            final /* synthetic */ String $secondaryButtonText;
                            final /* synthetic */ String $subtitle;
                            final /* synthetic */ String $title;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Function1<? super RhModalBottomSheet5, Unit> function1, RhModalBottomSheet5 rhModalBottomSheet5, String str, String str2, String str3, String str4, String str5, Function1<? super RhModalBottomSheet5, Unit> function12, Modifier modifier) {
                                this.$onSecondaryButtonClick = function1;
                                this.$rhModalBottomSheetScope = rhModalBottomSheet5;
                                this.$title = str;
                                this.$subtitle = str2;
                                this.$description = str3;
                                this.$primaryButtonText = str4;
                                this.$secondaryButtonText = str5;
                                this.$onPrimaryButtonClick = function12;
                                this.$modifier = modifier;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                invoke(rhModalBottomSheet5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5) {
                                function1.invoke(rhModalBottomSheet5);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                Function0 function0;
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1091541206, i, -1, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheet.<anonymous>.<anonymous> (RhContentBottomSheet.kt:66)");
                                }
                                composer.startReplaceGroup(-999064638);
                                if (this.$onSecondaryButtonClick != null) {
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(this.$onSecondaryButtonClick) | composer.changedInstance(this.$rhModalBottomSheetScope);
                                    final Function1<RhModalBottomSheet5, Unit> function1 = this.$onSecondaryButtonClick;
                                    final RhModalBottomSheet5 rhModalBottomSheet5 = this.$rhModalBottomSheetScope;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheet$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhContentBottomSheet2.C110791.AnonymousClass1.invoke$lambda$1$lambda$0(function1, rhModalBottomSheet5);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    function0 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                } else {
                                    function0 = null;
                                }
                                Function0 function02 = function0;
                                composer.endReplaceGroup();
                                String str = this.$title;
                                String str2 = this.$subtitle;
                                String str3 = this.$description;
                                String str4 = this.$primaryButtonText;
                                String str5 = this.$secondaryButtonText;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged2 = composer.changed(this.$onPrimaryButtonClick) | composer.changedInstance(this.$rhModalBottomSheetScope);
                                final Function1<RhModalBottomSheet5, Unit> function12 = this.$onPrimaryButtonClick;
                                final RhModalBottomSheet5 rhModalBottomSheet52 = this.$rhModalBottomSheetScope;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheet$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RhContentBottomSheet2.C110791.AnonymousClass1.invoke$lambda$3$lambda$2(function12, rhModalBottomSheet52);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                RhContentBottomSheet2.RhContentBottomSheetLayout(str, str2, str3, str4, str5, (Function0) objRememberedValue2, this.$modifier, function02, null, null, composer, 0, 768);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5) {
                                function1.invoke(rhModalBottomSheet5);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    sheetState3 = sheetState2;
                    function14 = function13;
                    str5 = str6;
                    modifier3 = modifier2;
                    z3 = z2;
                    rhModalBottomSheet53 = rhModalBottomSheet52;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    z3 = z;
                    function14 = function12;
                    str5 = str4;
                    modifier3 = modifier2;
                    sheetState3 = sheetState;
                    rhModalBottomSheet53 = rhModalBottomSheet5;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhContentBottomSheet2.RhContentBottomSheet$lambda$0(title, description, primaryButtonText, onPrimaryButtonClick, onDismissRequest, modifier3, str3, str5, function14, z3, sheetState3, rhModalBottomSheet53, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 805306368;
            i9 = i8;
            if ((i2 & 6) == 0) {
            }
            if ((i2 & 48) == 0) {
            }
            if ((i4 & 306783379) != 306783378) {
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                    if (i11 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (i7 != 0) {
                    }
                    if (i9 == 0) {
                    }
                    Modifier modifier52 = modifier4;
                    if ((i3 & 1024) == 0) {
                    }
                    if ((i3 & 2048) == 0) {
                    }
                    function13 = function12;
                    sheetState2 = sheetStateRememberModalBottomSheetState;
                    z2 = z4;
                    final String str62 = str4;
                    int i122 = i10;
                    composerStartRestartGroup.endDefaults();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(1435611601, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt.RhContentBottomSheet.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                            invoke(composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer2, int i13) {
                            if ((i13 & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1435611601, i13, -1, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheet.<anonymous> (RhContentBottomSheet.kt:60)");
                            }
                            Function0<Unit> function0 = onDismissRequest;
                            boolean z5 = z2;
                            SheetState sheetState4 = sheetState2;
                            RhModalBottomSheet5 rhModalBottomSheet55 = rhModalBottomSheet52;
                            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, z5, sheetState4, rhModalBottomSheet55, 0L, ComposableLambda3.rememberComposableLambda(-1091541206, true, new AnonymousClass1(function13, rhModalBottomSheet55, title, str3, description, primaryButtonText, str62, onPrimaryButtonClick, modifier2), composer2, 54), composer2, 1572864, 34);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* compiled from: RhContentBottomSheet.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheet$1$1, reason: invalid class name */
                        static final class AnonymousClass1 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                            final /* synthetic */ String $description;
                            final /* synthetic */ Modifier $modifier;
                            final /* synthetic */ Function1<RhModalBottomSheet5, Unit> $onPrimaryButtonClick;
                            final /* synthetic */ Function1<RhModalBottomSheet5, Unit> $onSecondaryButtonClick;
                            final /* synthetic */ String $primaryButtonText;
                            final /* synthetic */ RhModalBottomSheet5 $rhModalBottomSheetScope;
                            final /* synthetic */ String $secondaryButtonText;
                            final /* synthetic */ String $subtitle;
                            final /* synthetic */ String $title;

                            /* JADX WARN: Multi-variable type inference failed */
                            AnonymousClass1(Function1<? super RhModalBottomSheet5, Unit> function1, RhModalBottomSheet5 rhModalBottomSheet5, String str, String str2, String str3, String str4, String str5, Function1<? super RhModalBottomSheet5, Unit> function12, Modifier modifier) {
                                this.$onSecondaryButtonClick = function1;
                                this.$rhModalBottomSheetScope = rhModalBottomSheet5;
                                this.$title = str;
                                this.$subtitle = str2;
                                this.$description = str3;
                                this.$primaryButtonText = str4;
                                this.$secondaryButtonText = str5;
                                this.$onPrimaryButtonClick = function12;
                                this.$modifier = modifier;
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                invoke(rhModalBottomSheet5, composer, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$3$lambda$2(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5) {
                                function1.invoke(rhModalBottomSheet5);
                                return Unit.INSTANCE;
                            }

                            public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                Function0 function0;
                                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1091541206, i, -1, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheet.<anonymous>.<anonymous> (RhContentBottomSheet.kt:66)");
                                }
                                composer.startReplaceGroup(-999064638);
                                if (this.$onSecondaryButtonClick != null) {
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(this.$onSecondaryButtonClick) | composer.changedInstance(this.$rhModalBottomSheetScope);
                                    final Function1 function1 = this.$onSecondaryButtonClick;
                                    final RhModalBottomSheet5 rhModalBottomSheet5 = this.$rhModalBottomSheetScope;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheet$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhContentBottomSheet2.C110791.AnonymousClass1.invoke$lambda$1$lambda$0(function1, rhModalBottomSheet5);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    function0 = (Function0) objRememberedValue;
                                    composer.endReplaceGroup();
                                } else {
                                    function0 = null;
                                }
                                Function0 function02 = function0;
                                composer.endReplaceGroup();
                                String str = this.$title;
                                String str2 = this.$subtitle;
                                String str3 = this.$description;
                                String str4 = this.$primaryButtonText;
                                String str5 = this.$secondaryButtonText;
                                composer.startReplaceGroup(-1633490746);
                                boolean zChanged2 = composer.changed(this.$onPrimaryButtonClick) | composer.changedInstance(this.$rhModalBottomSheetScope);
                                final Function1 function12 = this.$onPrimaryButtonClick;
                                final RhModalBottomSheet5 rhModalBottomSheet52 = this.$rhModalBottomSheetScope;
                                Object objRememberedValue2 = composer.rememberedValue();
                                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheet$1$1$$ExternalSyntheticLambda1
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return RhContentBottomSheet2.C110791.AnonymousClass1.invoke$lambda$3$lambda$2(function12, rhModalBottomSheet52);
                                        }
                                    };
                                    composer.updateRememberedValue(objRememberedValue2);
                                }
                                composer.endReplaceGroup();
                                RhContentBottomSheet2.RhContentBottomSheetLayout(str, str2, str3, str4, str5, (Function0) objRememberedValue2, this.$modifier, function02, null, null, composer, 0, 768);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* JADX INFO: Access modifiers changed from: private */
                            public static final Unit invoke$lambda$1$lambda$0(Function1 function1, RhModalBottomSheet5 rhModalBottomSheet5) {
                                function1.invoke(rhModalBottomSheet5);
                                return Unit.INSTANCE;
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    sheetState3 = sheetState2;
                    function14 = function13;
                    str5 = str62;
                    modifier3 = modifier2;
                    z3 = z2;
                    rhModalBottomSheet53 = rhModalBottomSheet52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 64;
        if (i5 == 0) {
        }
        i6 = i3 & 128;
        if (i6 == 0) {
        }
        i7 = i3 & 256;
        if (i7 == 0) {
        }
        i8 = i3 & 512;
        if (i8 != 0) {
        }
        i9 = i8;
        if ((i2 & 6) == 0) {
        }
        if ((i2 & 48) == 0) {
        }
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:108:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01d5  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x0285  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0451  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0461  */
    /* JADX WARN: Removed duplicated region for block: B:172:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0119  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhContentBottomSheetLayout(final String title, final String str, final String description, final String primaryButtonText, final String str2, final Function0<Unit> onPrimaryButtonClick, Modifier modifier, Function0<Unit> function0, UserInteractionEventDescriptor userInteractionEventDescriptor, UserInteractionEventDescriptor userInteractionEventDescriptor2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        int i5;
        UserInteractionEventDescriptor userInteractionEventDescriptor3;
        int i6;
        int i7;
        Function0<Unit> function03;
        UserInteractionEventDescriptor userInteractionEventDescriptor4;
        UserInteractionEventDescriptor userInteractionEventDescriptor5;
        BentoTheme bentoTheme;
        int i8;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Column6 column6;
        Modifier.Companion companion;
        BentoTheme bentoTheme2;
        int i9;
        Column6 column62;
        Modifier.Companion companion2;
        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default;
        Function0<Unit> function04;
        UserInteractionEventDescriptor userInteractionEventDescriptor6;
        final Function0<Unit> function05;
        final UserInteractionEventDescriptor userInteractionEventDescriptor7;
        final UserInteractionEventDescriptor userInteractionEventDescriptor8;
        final Modifier modifier3;
        Modifier modifierAutoLogEvents$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(description, "description");
        Intrinsics.checkNotNullParameter(primaryButtonText, "primaryButtonText");
        Intrinsics.checkNotNullParameter(onPrimaryButtonClick, "onPrimaryButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-641101239);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(title) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(description) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(primaryButtonText) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(str2) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onPrimaryButtonClick) ? 131072 : 65536;
        }
        int i10 = i2 & 64;
        if (i10 != 0) {
            i3 |= 1572864;
        } else {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            i4 = i2 & 128;
            if (i4 == 0) {
                i3 |= 12582912;
            } else {
                if ((12582912 & i) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 8388608 : 4194304;
                }
                i5 = i2 & 256;
                if (i5 != 0) {
                    i3 |= 100663296;
                    userInteractionEventDescriptor3 = userInteractionEventDescriptor;
                } else {
                    userInteractionEventDescriptor3 = userInteractionEventDescriptor;
                    if ((i & 100663296) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor3) ? 67108864 : 33554432;
                    }
                }
                i6 = i2 & 512;
                if (i6 == 0) {
                    if ((i & 805306368) == 0) {
                        i7 = i6;
                        i3 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) ? 536870912 : 268435456;
                    }
                    if ((i3 & 306783379) == 306783378 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                        function03 = i4 == 0 ? null : function02;
                        userInteractionEventDescriptor4 = i5 == 0 ? null : userInteractionEventDescriptor3;
                        userInteractionEventDescriptor5 = i7 == 0 ? null : userInteractionEventDescriptor2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-641101239, i3, -1, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheetLayout (RhContentBottomSheet.kt:96)");
                        }
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        bentoTheme = BentoTheme.INSTANCE;
                        i8 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 5, null);
                        Alignment.Companion companion3 = Alignment.INSTANCE;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion4.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (!composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.createNode(constructor);
                        } else {
                            composerStartRestartGroup.useNode();
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Modifier modifier5 = modifier4;
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                        column6 = Column6.INSTANCE;
                        companion = Modifier.INSTANCE;
                        Modifier modifierTestTag = TestTag3.testTag(column6.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), companion3.getCenterHorizontally()), TestTagTitle);
                        TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleSmall();
                        TextAlign.Companion companion5 = TextAlign.INSTANCE;
                        int i11 = i3;
                        BentoText2.m20747BentoText38GnDrw(title, modifierTestTag, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, i3 & 14, 0, 8124);
                        composerStartRestartGroup.startReplaceGroup(-858395397);
                        if (str != null || str.length() == 0) {
                            bentoTheme2 = bentoTheme;
                            i9 = i8;
                            column62 = column6;
                            companion2 = companion;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                            bentoTheme2 = bentoTheme;
                            i9 = i8;
                            column62 = column6;
                            companion2 = companion;
                            BentoText2.m20747BentoText38GnDrw(str, TestTag3.testTag(column6.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), companion3.getCenterHorizontally()), TestTagSubtitle), Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i8).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i11 >> 3) & 14, 0, 16312);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTheme bentoTheme3 = bentoTheme2;
                        int i12 = i9;
                        Modifier.Companion companion6 = companion2;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                        int i13 = i11 >> 6;
                        BentoText2.m20747BentoText38GnDrw(description, TestTag3.testTag(column62.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion6, 0.0f, composerStartRestartGroup, 6, 1), companion3.getCenterHorizontally()), TestTagDescription), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i13 & 14, 0, 16316);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composerStartRestartGroup, i12).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                        modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion6, 0.0f, 1, null);
                        if (userInteractionEventDescriptor4 != null || (modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, userInteractionEventDescriptor4, true, false, false, true, false, null, 108, null)) == null) {
                            Modifier modifierAutoLogEvents$default2 = modifierM21619defaultFillMaxWidthPadding3ABfNKs$default;
                        }
                        BentoButtonKt.m20586BentoButtonEikTQX8(onPrimaryButtonClick, primaryButtonText, AutomationTestTagModifierExt.automationTestTag(modifierAutoLogEvents$default2, TestTagPrimaryButtonText), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i11 >> 15) & 14) | 24576 | (i13 & 112), 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-858348675);
                        if (str2 != null || str2.length() == 0 || function03 == null) {
                            function04 = function03;
                            userInteractionEventDescriptor6 = userInteractionEventDescriptor5;
                        } else {
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion6, bentoTheme3.getSpacing(composerStartRestartGroup, i12).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion6, 0.0f, 1, null);
                            userInteractionEventDescriptor6 = userInteractionEventDescriptor5;
                            if (userInteractionEventDescriptor5 == null || (modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, userInteractionEventDescriptor6, true, false, false, true, false, null, 108, null)) == null) {
                                modifierAutoLogEvents$default = modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2;
                            }
                            function04 = function03;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function04, str2, AutomationTestTagModifierExt.automationTestTag(modifierAutoLogEvents$default, TestTagSecondaryButtonText), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i11 >> 21) & 14) | 24576 | ((i11 >> 9) & 112), 0, 8168);
                            composerStartRestartGroup = composerStartRestartGroup;
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        function05 = function04;
                        userInteractionEventDescriptor7 = userInteractionEventDescriptor4;
                        userInteractionEventDescriptor8 = userInteractionEventDescriptor6;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        userInteractionEventDescriptor8 = userInteractionEventDescriptor2;
                        userInteractionEventDescriptor7 = userInteractionEventDescriptor3;
                        modifier3 = modifier2;
                        function05 = function02;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RhContentBottomSheet2.RhContentBottomSheetLayout$lambda$4(title, str, description, primaryButtonText, str2, onPrimaryButtonClick, modifier3, function05, userInteractionEventDescriptor7, userInteractionEventDescriptor8, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 805306368;
                i7 = i6;
                if ((i3 & 306783379) == 306783378) {
                    if (i10 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    if (i5 == 0) {
                    }
                    if (i7 == 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                    bentoTheme = BentoTheme.INSTANCE;
                    i8 = BentoTheme.$stable;
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM(), 5, null);
                    Alignment.Companion companion32 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion32.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor2 = companion42.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (!composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Modifier modifier52 = modifier4;
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion42.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting()) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion42.getSetModifier());
                        column6 = Column6.INSTANCE;
                        companion = Modifier.INSTANCE;
                        Modifier modifierTestTag2 = TestTag3.testTag(column6.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion, 0.0f, composerStartRestartGroup, 6, 1), companion32.getCenterHorizontally()), TestTagTitle);
                        TextStyle displayCapsuleSmall2 = bentoTheme.getTypography(composerStartRestartGroup, i8).getDisplayCapsuleSmall();
                        TextAlign.Companion companion52 = TextAlign.INSTANCE;
                        int i112 = i3;
                        BentoText2.m20747BentoText38GnDrw(title, modifierTestTag2, null, null, null, null, TextAlign.m7912boximpl(companion52.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, i3 & 14, 0, 8124);
                        composerStartRestartGroup.startReplaceGroup(-858395397);
                        if (str != null) {
                            bentoTheme2 = bentoTheme;
                            i9 = i8;
                            column62 = column6;
                            companion2 = companion;
                            composerStartRestartGroup.endReplaceGroup();
                            BentoTheme bentoTheme32 = bentoTheme2;
                            int i122 = i9;
                            Modifier.Companion companion62 = companion2;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion62, bentoTheme32.getSpacing(composerStartRestartGroup, i122).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                            int i132 = i112 >> 6;
                            BentoText2.m20747BentoText38GnDrw(description, TestTag3.testTag(column62.align(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion62, 0.0f, composerStartRestartGroup, 6, 1), companion32.getCenterHorizontally()), TestTagDescription), null, null, null, null, TextAlign.m7912boximpl(companion52.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, i132 & 14, 0, 16316);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion62, bentoTheme32.getSpacing(composerStartRestartGroup, i122).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                            modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion62, 0.0f, 1, null);
                            if (userInteractionEventDescriptor4 != null) {
                                Modifier modifierAutoLogEvents$default22 = modifierM21619defaultFillMaxWidthPadding3ABfNKs$default;
                                BentoButtonKt.m20586BentoButtonEikTQX8(onPrimaryButtonClick, primaryButtonText, AutomationTestTagModifierExt.automationTestTag(modifierAutoLogEvents$default22, TestTagPrimaryButtonText), null, BentoButtons.Type.Primary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i112 >> 15) & 14) | 24576 | (i132 & 112), 0, 8168);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.startReplaceGroup(-858348675);
                                if (str2 != null) {
                                    function04 = function03;
                                    userInteractionEventDescriptor6 = userInteractionEventDescriptor5;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function05 = function04;
                                    userInteractionEventDescriptor7 = userInteractionEventDescriptor4;
                                    userInteractionEventDescriptor8 = userInteractionEventDescriptor6;
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function02 = function0;
            i5 = i2 & 256;
            if (i5 != 0) {
            }
            i6 = i2 & 512;
            if (i6 == 0) {
            }
            i7 = i6;
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 128;
        if (i4 == 0) {
        }
        function02 = function0;
        i5 = i2 & 256;
        if (i5 != 0) {
        }
        i6 = i2 & 512;
        if (i6 == 0) {
        }
        i7 = i6;
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: RhContentBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheetLayoutPreview$1 */
    static final class C110801 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ PreviewState $previewState;

        C110801(PreviewState previewState) {
            this.$previewState = previewState;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            Function0 function0;
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-230187216, i, -1, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheetLayoutPreview.<anonymous> (RhContentBottomSheet.kt:180)");
            }
            Modifier modifierM4872backgroundbw27NRU$default = Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null);
            String title = this.$previewState.getTitle();
            String subtitle = this.$previewState.getSubtitle();
            String description = this.$previewState.getDescription();
            String primaryButtonText = this.$previewState.getPrimaryButtonText();
            String secondaryButtonText = this.$previewState.getSecondaryButtonText();
            composer.startReplaceGroup(2128399338);
            if (this.$previewState.getSecondaryButtonText() != null) {
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheetLayoutPreview$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                function0 = (Function0) objRememberedValue;
                composer.endReplaceGroup();
            } else {
                function0 = null;
            }
            composer.endReplaceGroup();
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composer.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$RhContentBottomSheetLayoutPreview$1$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.INSTANCE;
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            RhContentBottomSheet2.RhContentBottomSheetLayout(title, subtitle, description, primaryButtonText, secondaryButtonText, (Function0) objRememberedValue2, modifierM4872backgroundbw27NRU$default, function0, null, null, composer, 196608, 768);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    private static final void RhContentBottomSheetLayoutPreview(final PreviewState previewState, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-193375768);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(previewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-193375768, i2, -1, "com.robinhood.android.common.composebottomsheet.RhContentBottomSheetLayoutPreview (RhContentBottomSheet.kt:178)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-230187216, true, new C110801(previewState), composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.composebottomsheet.RhContentBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhContentBottomSheet2.RhContentBottomSheetLayoutPreview$lambda$5(previewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
