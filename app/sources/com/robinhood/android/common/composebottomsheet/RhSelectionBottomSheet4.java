package com.robinhood.android.common.composebottomsheet;

import androidx.compose.foundation.ScrollKt;
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
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheet4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: RhSelectionBottomSheet.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u001a\u0089\u0001\u0010\u0013\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\f\u001a\u00020\t2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014\u001ai\u0010\u0016\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u000f\u0010\u0018\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, m3636d2 = {"", "title", "Lkotlin/Function0;", "", "onDismissRequest", "content", "Landroidx/compose/ui/Modifier;", "modifier", "subtitle", "", "verticallyScrollable", "overrideButtonText", "showDragHandle", "Landroidx/compose/material3/SheetState;", "sheetState", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "rhModalBottomSheetScope", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "buttonEventDescriptor", "RhSelectionBottomSheet", "(Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLandroidx/compose/material3/SheetState;Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/runtime/Composer;III)V", "onButtonPressed", "RhSelectionBottomSheetLayout", "(ZLjava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;Landroidx/compose/runtime/Composer;II)V", "RhSelectionBottomSheetPreview", "(Landroidx/compose/runtime/Composer;I)V", "lib-compose-bottom-sheet_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhSelectionBottomSheet4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhSelectionBottomSheet$lambda$0(String str, Function0 function0, Function2 function2, Modifier modifier, String str2, boolean z, String str3, boolean z2, SheetState sheetState, RhModalBottomSheet5 rhModalBottomSheet5, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, int i2, int i3, Composer composer, int i4) {
        RhSelectionBottomSheet(str, function0, function2, modifier, str2, z, str3, z2, sheetState, rhModalBottomSheet5, userInteractionEventDescriptor, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhSelectionBottomSheetLayout$lambda$7(boolean z, String str, Function0 function0, Function2 function2, Modifier modifier, String str2, String str3, UserInteractionEventDescriptor userInteractionEventDescriptor, int i, int i2, Composer composer, int i3) {
        RhSelectionBottomSheetLayout(z, str, function0, function2, modifier, str2, str3, userInteractionEventDescriptor, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhSelectionBottomSheetPreview$lambda$8(int i, Composer composer, int i2) {
        RhSelectionBottomSheetPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0133  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:153:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01dc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:177:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0113  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhSelectionBottomSheet(final String title, final Function0<Unit> onDismissRequest, final Function2<? super Composer, ? super Integer, Unit> content, Modifier modifier, String str, boolean z, String str2, boolean z2, SheetState sheetState, RhModalBottomSheet5 rhModalBottomSheet5, UserInteractionEventDescriptor userInteractionEventDescriptor, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        final Modifier modifier2;
        int i5;
        String str3;
        int i6;
        boolean z3;
        int i7;
        String str4;
        int i8;
        boolean z4;
        int i9;
        int i10;
        int i11;
        int i12;
        SheetState sheetStateRememberModalBottomSheetState;
        RhModalBottomSheet5 rhModalBottomSheet52;
        final boolean z5;
        final SheetState sheetState2;
        final String str5;
        int i13;
        final String str6;
        final RhModalBottomSheet5 rhModalBottomSheet53;
        final boolean z6;
        final UserInteractionEventDescriptor userInteractionEventDescriptor2;
        final boolean z7;
        final String str7;
        final String str8;
        final SheetState sheetState3;
        final RhModalBottomSheet5 rhModalBottomSheet54;
        final Modifier modifier3;
        final boolean z8;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1046169593);
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
            i4 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(content) ? 256 : 128;
        }
        int i14 = i3 & 8;
        if (i14 != 0) {
            i4 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i5 = i3 & 16;
            if (i5 == 0) {
                i4 |= 24576;
            } else {
                if ((i & 24576) == 0) {
                    str3 = str;
                    i4 |= composerStartRestartGroup.changed(str3) ? 16384 : 8192;
                }
                i6 = i3 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        z3 = z;
                        i4 |= composerStartRestartGroup.changed(z3) ? 131072 : 65536;
                    }
                    i7 = i3 & 64;
                    if (i7 == 0) {
                        i4 |= 1572864;
                        str4 = str2;
                    } else {
                        str4 = str2;
                        if ((i & 1572864) == 0) {
                            i4 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
                        }
                    }
                    i8 = i3 & 128;
                    if (i8 == 0) {
                        i4 |= 12582912;
                        z4 = z2;
                    } else {
                        z4 = z2;
                        if ((i & 12582912) == 0) {
                            i4 |= composerStartRestartGroup.changed(z4) ? 8388608 : 4194304;
                        }
                    }
                    if ((i & 100663296) != 0) {
                        i9 = i8;
                        i4 |= ((i3 & 256) == 0 && composerStartRestartGroup.changed(sheetState)) ? 67108864 : 33554432;
                    } else {
                        i9 = i8;
                    }
                    if ((i & 805306368) == 0) {
                        i4 |= ((i3 & 512) == 0 && composerStartRestartGroup.changedInstance(rhModalBottomSheet5)) ? 536870912 : 268435456;
                    }
                    i10 = i3 & 1024;
                    if (i10 == 0) {
                        i11 = i10;
                        i12 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i11 = i10;
                        i12 = i2 | (composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) ? 4 : 2);
                    } else {
                        i11 = i10;
                        i12 = i2;
                    }
                    if ((i4 & 306783379) == 306783378 || (i12 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                            Modifier modifier4 = i14 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i5 != 0) {
                                str3 = null;
                            }
                            if (i6 != 0) {
                                z3 = true;
                            }
                            if (i7 != 0) {
                                str4 = null;
                            }
                            if (i9 != 0) {
                                z4 = false;
                            }
                            if ((i3 & 256) == 0) {
                                sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
                                i4 &= -234881025;
                            } else {
                                sheetStateRememberModalBottomSheetState = sheetState;
                            }
                            if ((i3 & 512) == 0) {
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                rhModalBottomSheet52 = new RhModalBottomSheet5(sheetStateRememberModalBottomSheetState, (CoroutineScope) objRememberedValue, onDismissRequest);
                                i4 = (-1879048193) & i4;
                            } else {
                                rhModalBottomSheet52 = rhModalBottomSheet5;
                            }
                            z5 = z4;
                            sheetState2 = sheetStateRememberModalBottomSheetState;
                            str5 = str3;
                            modifier2 = modifier4;
                            i13 = i4;
                            str6 = str4;
                            rhModalBottomSheet53 = rhModalBottomSheet52;
                            z6 = z3;
                            userInteractionEventDescriptor2 = i11 == 0 ? null : userInteractionEventDescriptor;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            if ((i3 & 256) != 0) {
                                i4 &= -234881025;
                            }
                            if ((i3 & 512) != 0) {
                                i4 &= -1879048193;
                            }
                            sheetState2 = sheetState;
                            userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                            i13 = i4;
                            z5 = z4;
                            str5 = str3;
                            rhModalBottomSheet53 = rhModalBottomSheet5;
                            str6 = str4;
                            z6 = z3;
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1046169593, i13, i12, "com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheet (RhSelectionBottomSheet.kt:56)");
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-688667698, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt.RhSelectionBottomSheet.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-688667698, i15, -1, "com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheet.<anonymous> (RhSelectionBottomSheet.kt:58)");
                                }
                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, null, z5, sheetState2, rhModalBottomSheet53, 0L, ComposableLambda3.rememberComposableLambda(1672796437, true, new AnonymousClass1(z6, title, content, modifier2, str5, str6, userInteractionEventDescriptor2), composer2, 54), composer2, 1572864, 34);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: RhSelectionBottomSheet.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$RhSelectionBottomSheet$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                                final /* synthetic */ UserInteractionEventDescriptor $buttonEventDescriptor;
                                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ String $overrideButtonText;
                                final /* synthetic */ String $subtitle;
                                final /* synthetic */ String $title;
                                final /* synthetic */ boolean $verticallyScrollable;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(boolean z, String str, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, String str2, String str3, UserInteractionEventDescriptor userInteractionEventDescriptor) {
                                    this.$verticallyScrollable = z;
                                    this.$title = str;
                                    this.$content = function2;
                                    this.$modifier = modifier;
                                    this.$subtitle = str2;
                                    this.$overrideButtonText = str3;
                                    this.$buttonEventDescriptor = userInteractionEventDescriptor;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                    invoke(rhModalBottomSheet5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1672796437, i, -1, "com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheet.<anonymous>.<anonymous> (RhSelectionBottomSheet.kt:64)");
                                    }
                                    boolean z = this.$verticallyScrollable;
                                    String str = this.$title;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(RhModalBottomSheet);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$RhSelectionBottomSheet$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhSelectionBottomSheet4.C110851.AnonymousClass1.invoke$lambda$1$lambda$0(RhModalBottomSheet);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    RhSelectionBottomSheet4.RhSelectionBottomSheetLayout(z, str, (Function0) objRememberedValue, this.$content, this.$modifier, this.$subtitle, this.$overrideButtonText, this.$buttonEventDescriptor, composer, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                                    RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z7 = z6;
                        str7 = str5;
                        str8 = str6;
                        sheetState3 = sheetState2;
                        rhModalBottomSheet54 = rhModalBottomSheet53;
                        modifier3 = modifier2;
                        z8 = z5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        sheetState3 = sheetState;
                        userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                        str8 = str4;
                        modifier3 = modifier2;
                        str7 = str3;
                        rhModalBottomSheet54 = rhModalBottomSheet5;
                        z8 = z4;
                        z7 = z3;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return RhSelectionBottomSheet4.RhSelectionBottomSheet$lambda$0(title, onDismissRequest, content, modifier3, str7, z7, str8, z8, sheetState3, rhModalBottomSheet54, userInteractionEventDescriptor2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i4 |= 196608;
                z3 = z;
                i7 = i3 & 64;
                if (i7 == 0) {
                }
                i8 = i3 & 128;
                if (i8 == 0) {
                }
                if ((i & 100663296) != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i10 = i3 & 1024;
                if (i10 == 0) {
                }
                if ((i4 & 306783379) == 306783378) {
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                        if (i14 == 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i9 != 0) {
                        }
                        if ((i3 & 256) == 0) {
                        }
                        if ((i3 & 512) == 0) {
                        }
                        z5 = z4;
                        sheetState2 = sheetStateRememberModalBottomSheetState;
                        str5 = str3;
                        modifier2 = modifier4;
                        i13 = i4;
                        str6 = str4;
                        rhModalBottomSheet53 = rhModalBottomSheet52;
                        z6 = z3;
                        if (i11 == 0) {
                        }
                        composerStartRestartGroup.endDefaults();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-688667698, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt.RhSelectionBottomSheet.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i15) {
                                if ((i15 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-688667698, i15, -1, "com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheet.<anonymous> (RhSelectionBottomSheet.kt:58)");
                                }
                                RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(onDismissRequest, null, z5, sheetState2, rhModalBottomSheet53, 0L, ComposableLambda3.rememberComposableLambda(1672796437, true, new AnonymousClass1(z6, title, content, modifier2, str5, str6, userInteractionEventDescriptor2), composer2, 54), composer2, 1572864, 34);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: RhSelectionBottomSheet.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$RhSelectionBottomSheet$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
                                final /* synthetic */ UserInteractionEventDescriptor $buttonEventDescriptor;
                                final /* synthetic */ Function2<Composer, Integer, Unit> $content;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ String $overrideButtonText;
                                final /* synthetic */ String $subtitle;
                                final /* synthetic */ String $title;
                                final /* synthetic */ boolean $verticallyScrollable;

                                /* JADX WARN: Multi-variable type inference failed */
                                AnonymousClass1(boolean z, String str, Function2<? super Composer, ? super Integer, Unit> function2, Modifier modifier, String str2, String str3, UserInteractionEventDescriptor userInteractionEventDescriptor) {
                                    this.$verticallyScrollable = z;
                                    this.$title = str;
                                    this.$content = function2;
                                    this.$modifier = modifier;
                                    this.$subtitle = str2;
                                    this.$overrideButtonText = str3;
                                    this.$buttonEventDescriptor = userInteractionEventDescriptor;
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                                    invoke(rhModalBottomSheet5, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                                    Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1672796437, i, -1, "com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheet.<anonymous>.<anonymous> (RhSelectionBottomSheet.kt:64)");
                                    }
                                    boolean z = this.$verticallyScrollable;
                                    String str = this.$title;
                                    composer.startReplaceGroup(5004770);
                                    boolean zChangedInstance = composer.changedInstance(RhModalBottomSheet);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$RhSelectionBottomSheet$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return RhSelectionBottomSheet4.C110851.AnonymousClass1.invoke$lambda$1$lambda$0(RhModalBottomSheet);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    RhSelectionBottomSheet4.RhSelectionBottomSheetLayout(z, str, (Function0) objRememberedValue, this.$content, this.$modifier, this.$subtitle, this.$overrideButtonText, this.$buttonEventDescriptor, composer, 0, 0);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                                    RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        z7 = z6;
                        str7 = str5;
                        str8 = str6;
                        sheetState3 = sheetState2;
                        rhModalBottomSheet54 = rhModalBottomSheet53;
                        modifier3 = modifier2;
                        z8 = z5;
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str3 = str;
            i6 = i3 & 32;
            if (i6 == 0) {
            }
            z3 = z;
            i7 = i3 & 64;
            if (i7 == 0) {
            }
            i8 = i3 & 128;
            if (i8 == 0) {
            }
            if ((i & 100663296) != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i10 = i3 & 1024;
            if (i10 == 0) {
            }
            if ((i4 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i5 = i3 & 16;
        if (i5 == 0) {
        }
        str3 = str;
        i6 = i3 & 32;
        if (i6 == 0) {
        }
        z3 = z;
        i7 = i3 & 64;
        if (i7 == 0) {
        }
        i8 = i3 & 128;
        if (i8 == 0) {
        }
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i10 = i3 & 1024;
        if (i10 == 0) {
        }
        if ((i4 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0125  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x016e  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0228  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x02ca  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03fd  */
    /* JADX WARN: Removed duplicated region for block: B:168:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00da  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhSelectionBottomSheetLayout(final boolean z, final String title, Function0<Unit> onButtonPressed, final Function2<? super Composer, ? super Integer, Unit> content, Modifier modifier, String str, String str2, UserInteractionEventDescriptor userInteractionEventDescriptor, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str3;
        int i5;
        String str4;
        int i6;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        String str5;
        String str6;
        UserInteractionEventDescriptor userInteractionEventDescriptor3;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Modifier.Companion companion;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int i7;
        Composer composer2;
        String str7;
        Modifier.Companion companion2;
        int i8;
        float f;
        Object obj;
        int i9;
        Modifier modifierM5146paddingqDBjuR0$default;
        int i10;
        String strStringResource;
        int i11;
        Object objRememberedValue;
        final Function0<Unit> function0;
        Composer composer3;
        final String str8;
        final String str9;
        final UserInteractionEventDescriptor userInteractionEventDescriptor4;
        final Modifier modifier3;
        Modifier modifierAutoLogEvents$default;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onButtonPressed, "onButtonPressed");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(1061684390);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(z) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(title) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onButtonPressed) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(content) ? 2048 : 1024;
        }
        int i12 = i2 & 16;
        if (i12 != 0) {
            i3 |= 24576;
        } else {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            i4 = i2 & 32;
            if (i4 != 0) {
                if ((196608 & i) == 0) {
                    str3 = str;
                    i3 |= composerStartRestartGroup.changed(str3) ? 131072 : 65536;
                }
                i5 = i2 & 64;
                if (i5 != 0) {
                    i3 |= 1572864;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i & 1572864) == 0) {
                        i3 |= composerStartRestartGroup.changed(str4) ? 1048576 : 524288;
                    }
                }
                i6 = i2 & 128;
                if (i6 != 0) {
                    i3 |= 12582912;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                } else {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    if ((i & 12582912) == 0) {
                        i3 |= composerStartRestartGroup.changedInstance(userInteractionEventDescriptor2) ? 8388608 : 4194304;
                    }
                }
                if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    function0 = onButtonPressed;
                    userInteractionEventDescriptor4 = userInteractionEventDescriptor2;
                    composer3 = composerStartRestartGroup;
                    str9 = str4;
                    modifier3 = modifier2;
                    str8 = str3;
                } else {
                    Modifier modifier4 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                    str5 = i4 == 0 ? null : str3;
                    str6 = i5 == 0 ? null : str4;
                    userInteractionEventDescriptor3 = i6 == 0 ? null : userInteractionEventDescriptor2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1061684390, i3, -1, "com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetLayout (RhSelectionBottomSheet.kt:90)");
                    }
                    Arrangement arrangement = Arrangement.INSTANCE;
                    Arrangement.Vertical top = arrangement.getTop();
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion3.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor);
                    }
                    composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-990114939);
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i13 = BentoTheme.$stable;
                    Modifier modifier5 = modifier4;
                    Modifier modifierWeight = column6.weight(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i13).m21592getMediumD9Ej5fM(), 1, null), 1.0f, false);
                    if (z) {
                        modifierWeight = ScrollKt.verticalScroll$default(modifierWeight, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight);
                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.useNode();
                    } else {
                        composerStartRestartGroup.createNode(constructor2);
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                    Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i13).getDisplayCapsuleSmall();
                    TextAlign.Companion companion5 = TextAlign.INSTANCE;
                    i7 = i3;
                    BentoText2.m20747BentoText38GnDrw(title, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default, null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, (i3 >> 3) & 14, 0, 8124);
                    composerStartRestartGroup.startReplaceGroup(-871800103);
                    if (str5 != null || str5.length() == 0) {
                        composer2 = composerStartRestartGroup;
                        str7 = str5;
                        companion2 = companion;
                        i8 = i7;
                        f = 0.0f;
                        obj = null;
                        i9 = 1;
                    } else {
                        float fM21590getDefaultD9Ej5fM = bentoTheme.getSpacing(composerStartRestartGroup, i13).m21590getDefaultD9Ej5fM();
                        companion2 = companion;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, fM21590getDefaultD9Ej5fM), composerStartRestartGroup, 0);
                        f = 0.0f;
                        obj = null;
                        i9 = 1;
                        String str10 = str5;
                        i8 = i7;
                        BentoText2.m20747BentoText38GnDrw(str10, com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion2, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion5.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, (i7 >> 15) & 14, 0, 16316);
                        str7 = str10;
                        composer2 = composerStartRestartGroup;
                    }
                    composer2.endReplaceGroup();
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i13).m21590getDefaultD9Ej5fM()), composer2, 0);
                    content.invoke(composer2, Integer.valueOf((i8 >> 9) & 14));
                    composer2.endNode();
                    modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, f, i9, obj), bentoTheme.getSpacing(composer2, i13).m21590getDefaultD9Ej5fM(), f, 2, obj), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i13).m21592getMediumD9Ej5fM(), 7, null);
                    if (userInteractionEventDescriptor3 != null && (modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifierM5146paddingqDBjuR0$default, userInteractionEventDescriptor3, true, false, false, true, false, null, 108, null)) != null) {
                        modifierM5146paddingqDBjuR0$default = modifierAutoLogEvents$default;
                    }
                    BentoButtons.Type type2 = BentoButtons.Type.Primary;
                    composer2.startReplaceGroup(-990065859);
                    if (str6 != null) {
                        i10 = 0;
                        strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer2, 0);
                    } else {
                        i10 = 0;
                        strStringResource = str6;
                    }
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(5004770);
                    i11 = (i8 & 896) != 256 ? i9 : i10;
                    objRememberedValue = composer2.rememberedValue();
                    if (i11 == 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        function0 = onButtonPressed;
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return RhSelectionBottomSheet4.RhSelectionBottomSheetLayout$lambda$6$lambda$5$lambda$4(function0);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue);
                    } else {
                        function0 = onButtonPressed;
                    }
                    composer2.endReplaceGroup();
                    Composer composer4 = composer2;
                    BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, type2, false, false, null, null, null, null, false, null, composer4, 24576, 0, 8168);
                    composer3 = composer4;
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    str8 = str7;
                    str9 = str6;
                    userInteractionEventDescriptor4 = userInteractionEventDescriptor3;
                    modifier3 = modifier5;
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj2, Object obj3) {
                            return RhSelectionBottomSheet4.RhSelectionBottomSheetLayout$lambda$7(z, title, function0, content, modifier3, str8, str9, userInteractionEventDescriptor4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 196608;
            str3 = str;
            i5 = i2 & 64;
            if (i5 != 0) {
            }
            i6 = i2 & 128;
            if (i6 != 0) {
            }
            if ((i3 & 4793491) == 4793490) {
                if (i12 == 0) {
                }
                if (i4 == 0) {
                }
                if (i5 == 0) {
                }
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Arrangement arrangement2 = Arrangement.INSTANCE;
                Arrangement.Vertical top2 = arrangement2.getTop();
                Alignment.Companion companion32 = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion32.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
                ComposeUiNode.Companion companion42 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor3 = companion42.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion42.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion42.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion42.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion42.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    composerStartRestartGroup.startReplaceGroup(-990114939);
                    companion = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null);
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i132 = BentoTheme.$stable;
                    Modifier modifier52 = modifier4;
                    Modifier modifierWeight2 = column62.weight(PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default2, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i132).m21592getMediumD9Ej5fM(), 1, null), 1.0f, false);
                    if (z) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion32.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight2);
                    Function0<ComposeUiNode> constructor22 = companion42.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy22, companion42.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion42.getSetResolvedCompositionLocals());
                    setCompositeKeyHash2 = companion42.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl2.getInserting()) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion42.getSetModifier());
                        Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2 = com.robinhood.compose.bento.util.PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(companion, 0.0f, 1, null);
                        TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i132).getDisplayCapsuleSmall();
                        TextAlign.Companion companion52 = TextAlign.INSTANCE;
                        i7 = i3;
                        BentoText2.m20747BentoText38GnDrw(title, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default2, null, null, null, null, TextAlign.m7912boximpl(companion52.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, (i3 >> 3) & 14, 0, 8124);
                        composerStartRestartGroup.startReplaceGroup(-871800103);
                        if (str5 != null) {
                            composer2 = composerStartRestartGroup;
                            str7 = str5;
                            companion2 = companion;
                            i8 = i7;
                            f = 0.0f;
                            obj = null;
                            i9 = 1;
                            composer2.endReplaceGroup();
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme2.getSpacing(composer2, i132).m21590getDefaultD9Ej5fM()), composer2, 0);
                            content.invoke(composer2, Integer.valueOf((i8 >> 9) & 14));
                            composer2.endNode();
                            modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, f, i9, obj), bentoTheme2.getSpacing(composer2, i132).m21590getDefaultD9Ej5fM(), f, 2, obj), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer2, i132).m21592getMediumD9Ej5fM(), 7, null);
                            if (userInteractionEventDescriptor3 != null) {
                                modifierM5146paddingqDBjuR0$default = modifierAutoLogEvents$default;
                            }
                            BentoButtons.Type type22 = BentoButtons.Type.Primary;
                            composer2.startReplaceGroup(-990065859);
                            if (str6 != null) {
                            }
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(5004770);
                            if ((i8 & 896) != 256) {
                            }
                            objRememberedValue = composer2.rememberedValue();
                            if (i11 == 0) {
                                function0 = onButtonPressed;
                                objRememberedValue = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return RhSelectionBottomSheet4.RhSelectionBottomSheetLayout$lambda$6$lambda$5$lambda$4(function0);
                                    }
                                };
                                composer2.updateRememberedValue(objRememberedValue);
                                composer2.endReplaceGroup();
                                Composer composer42 = composer2;
                                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, type22, false, false, null, null, null, null, false, null, composer42, 24576, 0, 8168);
                                composer3 = composer42;
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                str8 = str7;
                                str9 = str6;
                                userInteractionEventDescriptor4 = userInteractionEventDescriptor3;
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 32;
        if (i4 != 0) {
        }
        str3 = str;
        i5 = i2 & 64;
        if (i5 != 0) {
        }
        i6 = i2 & 128;
        if (i6 != 0) {
        }
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhSelectionBottomSheetLayout$lambda$6$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    private static final void RhSelectionBottomSheetPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-674278027);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-674278027, i, -1, "com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetPreview (RhSelectionBottomSheet.kt:146)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, RhSelectionBottomSheet.INSTANCE.getLambda$305070269$lib_compose_bottom_sheet_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.common.composebottomsheet.RhSelectionBottomSheetKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhSelectionBottomSheet4.RhSelectionBottomSheetPreview$lambda$8(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
