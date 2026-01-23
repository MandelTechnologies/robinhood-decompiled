package com.robinhood.compose.bento.component.numpad;

import android.view.KeyEvent;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: BentoNumpadTextInput.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a'\u0010\u0006\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a1\u0010\u000b\u001a\u00020\u00002\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\n\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0001¢\u0006\u0004\b\u000b\u0010\f\u001a¸\u0001\u0010\u001e\u001a\u00020\u0010*\u00020\r2\u0014\u0010\u0011\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u00100\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00122\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00042W\u0010\u001d\u001aS\u0012\u0013\u0012\u00110\u0000¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0019\u0012\u0013\u0012\u00110\u001a¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001b\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00100\u000e¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u001c\u0012\u0004\u0012\u00020\u00100\u0016H\u0007¢\u0006\u0004\b\u001e\u0010\u001f¨\u0006$²\u0006\u000e\u0010 \u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\n\u001a\u00020\u00128\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\"\u001a\u00020!8\n@\nX\u008a\u008e\u0002²\u0006\f\u0010#\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, m3636d2 = {"Landroidx/compose/ui/text/input/TextFieldValue;", "newValue", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "numberDisplayFormatter", "", "allowNegative", "handleIncomingTextFieldValue", "(Landroidx/compose/ui/text/input/TextFieldValue;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;Z)Landroidx/compose/ui/text/input/TextFieldValue;", "Landroid/view/KeyEvent;", "keyEvent", "internalValue", "handleIncomingKeyEvent", "(Landroid/view/KeyEvent;Landroidx/compose/ui/text/input/TextFieldValue;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;Z)Landroidx/compose/ui/text/input/TextFieldValue;", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "", "onNumberChange", "", "textFieldId", "initialValue", "forceCursorEnd", "Lkotlin/Function3;", "Lkotlin/ParameterName;", "name", "textFieldValue", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "interactionSource", "onValueChange", "textInput", "BentoNumpadTextInput", "(Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;Lkotlin/jvm/functions/Function1;Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;ZLkotlin/jvm/functions/Function5;Landroidx/compose/runtime/Composer;II)V", "internalForceCursorEnd", "Landroidx/compose/ui/text/TextRange;", "internalSelection", "focused", "lib-compose-bento_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class BentoNumpadTextInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadTextInput$lambda$17(BentoNumpadScopeV2 bentoNumpadScopeV2, Function1 function1, String str, String str2, boolean z, BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter, boolean z2, Function5 function5, int i, int i2, Composer composer, int i3) {
        BentoNumpadTextInput(bentoNumpadScopeV2, function1, str, str2, z, bentoNumpadTextInputFormatter, z2, function5, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final TextFieldValue handleIncomingTextFieldValue(TextFieldValue newValue, BentoNumpadTextInputFormatter numberDisplayFormatter, boolean z) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        Intrinsics.checkNotNullParameter(numberDisplayFormatter, "numberDisplayFormatter");
        return numberDisplayFormatter.format(TextFieldValue.m7789copy3r_uNRQ$default(newValue, StringsKt.filterToNumpadChars(newValue.getText(), z), 0L, (TextRange) null, 6, (Object) null));
    }

    public static final TextFieldValue handleIncomingKeyEvent(KeyEvent keyEvent, TextFieldValue internalValue, BentoNumpadTextInputFormatter numberDisplayFormatter, boolean z) {
        Intrinsics.checkNotNullParameter(internalValue, "internalValue");
        Intrinsics.checkNotNullParameter(numberDisplayFormatter, "numberDisplayFormatter");
        return keyEvent == null ? internalValue : numberDisplayFormatter.format(StringsKt.m20904modifyValueForKeyEventYmzfRxQ(internalValue, keyEvent, internalValue.getSelection(), z));
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0138  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01a2  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x01bc  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x024b  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0263  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0282  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x0293  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0327  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x0337  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0374  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x0384  */
    /* JADX WARN: Removed duplicated region for block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00ba A[PHI: r20
      0x00ba: PHI (r20v12 int) = (r20v0 int), (r20v5 int), (r20v6 int) binds: [B:60:0x00b8, B:70:0x00d3, B:69:0x00d0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BentoNumpadTextInput(final BentoNumpadScopeV2 bentoNumpadScopeV2, final Function1<? super BigDecimal, Unit> onNumberChange, String str, String str2, boolean z, BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter, boolean z2, final Function5<? super TextFieldValue, ? super InteractionSource3, ? super Function1<? super TextFieldValue, Unit>, ? super Composer, ? super Integer, Unit> textInput, Composer composer, final int i, final int i2) {
        int i3;
        String str3;
        int i4;
        final String str4;
        int i5;
        int i6;
        int i7;
        boolean z3;
        final String str5;
        boolean z4;
        boolean z5;
        Object objRememberedValue;
        Composer.Companion companion;
        SnapshotState snapshotState;
        boolean z6;
        Object objRememberedValue2;
        Composer composer2;
        SnapshotState snapshotState2;
        Object objRememberedValue3;
        SnapshotState snapshotState3;
        Object objRememberedValue4;
        InteractionSource3 interactionSource3;
        SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState;
        Boolean boolValueOf;
        int i8;
        int i9;
        int i10;
        BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter2;
        boolean zChanged;
        Object objRememberedValue5;
        InteractionSource3 interactionSource32;
        Boolean bool;
        int i11;
        String str6;
        int i12;
        final SnapshotState snapshotState4;
        BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter3;
        int i13;
        int i14;
        int i15;
        String str7;
        boolean z7;
        final SnapshotState snapshotState5;
        final SnapshotState snapshotState6;
        boolean z8;
        int i16;
        Object objRememberedValue6;
        final String str8;
        final BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter4;
        final boolean z9;
        final boolean z10;
        final String str9;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i17;
        BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter5 = bentoNumpadTextInputFormatter;
        Intrinsics.checkNotNullParameter(bentoNumpadScopeV2, "<this>");
        Intrinsics.checkNotNullParameter(onNumberChange, "onNumberChange");
        Intrinsics.checkNotNullParameter(textInput, "textInput");
        Composer composerStartRestartGroup = composer.startRestartGroup(-614786651);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(bentoNumpadScopeV2) : composerStartRestartGroup.changedInstance(bentoNumpadScopeV2) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNumberChange) ? 32 : 16;
        }
        int i18 = i2 & 2;
        if (i18 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                str3 = str;
                i3 |= composerStartRestartGroup.changed(str3) ? 256 : 128;
            }
            i4 = i2 & 4;
            if (i4 == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    str4 = str2;
                    i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
                i5 = i2 & 8;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        i3 |= composerStartRestartGroup.changed(z) ? 16384 : 8192;
                    }
                    i6 = i2 & 16;
                    int i19 = 196608;
                    if (i6 != 0) {
                        i3 |= i19;
                    } else if ((i & 196608) == 0) {
                        i19 = (i & 262144) == 0 ? composerStartRestartGroup.changed(bentoNumpadTextInputFormatter5) : composerStartRestartGroup.changedInstance(bentoNumpadTextInputFormatter5) ? 131072 : 65536;
                        i3 |= i19;
                    }
                    i7 = i2 & 32;
                    if (i7 == 0) {
                        i3 |= 1572864;
                        z3 = z2;
                    } else {
                        z3 = z2;
                        if ((i & 1572864) == 0) {
                            i3 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
                        }
                    }
                    if ((i2 & 64) != 0) {
                        i17 = (i & 12582912) == 0 ? composerStartRestartGroup.changedInstance(textInput) ? 8388608 : 4194304 : 12582912;
                        if ((i3 & 4793491) == 4793490 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z9 = z;
                            bentoNumpadTextInputFormatter4 = bentoNumpadTextInputFormatter5;
                            str8 = str3;
                            z10 = z3;
                            composer2 = composerStartRestartGroup;
                            str9 = str4;
                        } else {
                            str5 = i18 == 0 ? null : str3;
                            if (i4 != 0) {
                                str4 = null;
                            }
                            z4 = i5 == 0 ? false : z;
                            if (i6 != 0) {
                                bentoNumpadTextInputFormatter5 = BentoNumpadTextInputFormatter2.INSTANCE;
                            }
                            z5 = i7 == 0 ? false : z3;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-614786651, i3, -1, "com.robinhood.compose.bento.component.numpad.BentoNumpadTextInput (BentoNumpadTextInput.kt:80)");
                            }
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                                objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(z5), null, 2, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            snapshotState = (SnapshotState) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            Object[] objArr = {str5};
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            int i20 = i3 & 14;
                            z6 = ((i3 & 7168) != 2048) | (i20 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(bentoNumpadScopeV2))) | ((i3 & 896) != 256);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z6 || objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return BentoNumpadTextInput.BentoNumpadTextInput$lambda$6$lambda$5(bentoNumpadScopeV2, str5, str4);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue3 = composer2.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = SnapshotState3.mutableStateOf$default(TextRange.m7634boximpl(TextRange2.TextRange(0, 0)), null, 2, null);
                                composer2.updateRememberedValue(objRememberedValue3);
                            }
                            snapshotState3 = (SnapshotState) objRememberedValue3;
                            composer2.endReplaceGroup();
                            composer2.startReplaceGroup(1849434622);
                            objRememberedValue4 = composer2.rememberedValue();
                            if (objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                                composer2.updateRememberedValue(objRememberedValue4);
                            }
                            interactionSource3 = (InteractionSource3) objRememberedValue4;
                            composer2.endReplaceGroup();
                            snapshotState4CollectIsFocusedAsState = FocusInteraction3.collectIsFocusedAsState(interactionSource3, composer2, 6);
                            boolValueOf = Boolean.valueOf(BentoNumpadTextInput$lambda$13(snapshotState4CollectIsFocusedAsState));
                            composer2.startReplaceGroup(-1224400529);
                            i8 = 458752 & i3;
                            i9 = i3 & 57344;
                            i10 = i3 & 112;
                            bentoNumpadTextInputFormatter2 = bentoNumpadTextInputFormatter5;
                            zChanged = ((i3 & 3670016) != 1048576) | (i20 != 4 || ((i3 & 8) != 0 && composer2.changedInstance(bentoNumpadScopeV2))) | composer2.changed(snapshotState4CollectIsFocusedAsState) | composer2.changed(snapshotState2) | (i8 != 131072 || ((i3 & 262144) != 0 && composer2.changedInstance(bentoNumpadTextInputFormatter5))) | (i9 != 16384) | (i10 != 32);
                            objRememberedValue5 = composer2.rememberedValue();
                            if (!zChanged || objRememberedValue5 == companion.getEmpty()) {
                                interactionSource32 = interactionSource3;
                                bool = boolValueOf;
                                i11 = i3;
                                str6 = str5;
                                i12 = i10;
                                snapshotState4 = snapshotState3;
                                bentoNumpadTextInputFormatter3 = bentoNumpadTextInputFormatter2;
                                i13 = 0;
                                i14 = i9;
                                i15 = i8;
                                str7 = str4;
                                boolean z11 = z5;
                                z7 = z4;
                                BentoNumpadTextInput2 bentoNumpadTextInput2 = new BentoNumpadTextInput2(bentoNumpadScopeV2, z11, snapshotState4CollectIsFocusedAsState, snapshotState, snapshotState2, snapshotState4, bentoNumpadTextInputFormatter3, z7, onNumberChange, null);
                                snapshotState5 = snapshotState;
                                snapshotState6 = snapshotState2;
                                z8 = z11;
                                composer2.updateRememberedValue(bentoNumpadTextInput2);
                                objRememberedValue5 = bentoNumpadTextInput2;
                            } else {
                                i15 = i8;
                                snapshotState6 = snapshotState2;
                                interactionSource32 = interactionSource3;
                                bool = boolValueOf;
                                i11 = i3;
                                str6 = str5;
                                i12 = i10;
                                snapshotState4 = snapshotState3;
                                bentoNumpadTextInputFormatter3 = bentoNumpadTextInputFormatter2;
                                z8 = z5;
                                snapshotState5 = snapshotState;
                                i13 = 0;
                                str7 = str4;
                                i14 = i9;
                                z7 = z4;
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, i13);
                            TextFieldValue textFieldValue = bentoNumpadTextInputFormatter3.format(new TextFieldValue(BentoNumpadTextInput$lambda$7(snapshotState6), BentoNumpadTextInput$lambda$10(snapshotState4), (TextRange) null, 4, (DefaultConstructorMarker) null));
                            composer2.startReplaceGroup(-1224400529);
                            i16 = (i14 != 16384 ? 1 : i13) | ((i15 != 131072 || ((i11 & 262144) != 0 && composer2.changedInstance(bentoNumpadTextInputFormatter3))) ? 1 : i13) | (composer2.changed(snapshotState6) ? 1 : 0) | (i12 != 32 ? 1 : i13);
                            objRememberedValue6 = composer2.rememberedValue();
                            if (i16 == 0 || objRememberedValue6 == companion.getEmpty()) {
                                final BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter6 = bentoNumpadTextInputFormatter3;
                                final boolean z12 = z7;
                                Function1 function1 = new Function1() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return BentoNumpadTextInput.BentoNumpadTextInput$lambda$16$lambda$15(bentoNumpadTextInputFormatter6, z12, onNumberChange, snapshotState6, snapshotState5, snapshotState4, (TextFieldValue) obj);
                                    }
                                };
                                composer2.updateRememberedValue(function1);
                                objRememberedValue6 = function1;
                            }
                            composer2.endReplaceGroup();
                            textInput.invoke(textFieldValue, interactionSource32, (Function1) objRememberedValue6, composer2, Integer.valueOf(((i11 >> 12) & 7168) | 48));
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            str8 = str6;
                            bentoNumpadTextInputFormatter4 = bentoNumpadTextInputFormatter3;
                            z9 = z7;
                            z10 = z8;
                            str9 = str7;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return BentoNumpadTextInput.BentoNumpadTextInput$lambda$17(bentoNumpadScopeV2, onNumberChange, str8, str9, z9, bentoNumpadTextInputFormatter4, z10, textInput, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= i17;
                    if ((i3 & 4793491) == 4793490) {
                        if (i18 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 == 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Object[] objArr2 = {str5};
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        int i202 = i3 & 14;
                        if (i202 != 4) {
                            z6 = ((i3 & 7168) != 2048) | (i202 != 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(bentoNumpadScopeV2))) | ((i3 & 896) != 256);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            if (!z6) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return BentoNumpadTextInput.BentoNumpadTextInput$lambda$6$lambda$5(bentoNumpadScopeV2, str5, str4);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                composerStartRestartGroup.endReplaceGroup();
                                composer2 = composerStartRestartGroup;
                                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue3 = composer2.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                }
                                snapshotState3 = (SnapshotState) objRememberedValue3;
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(1849434622);
                                objRememberedValue4 = composer2.rememberedValue();
                                if (objRememberedValue4 == companion.getEmpty()) {
                                }
                                interactionSource3 = (InteractionSource3) objRememberedValue4;
                                composer2.endReplaceGroup();
                                snapshotState4CollectIsFocusedAsState = FocusInteraction3.collectIsFocusedAsState(interactionSource3, composer2, 6);
                                boolValueOf = Boolean.valueOf(BentoNumpadTextInput$lambda$13(snapshotState4CollectIsFocusedAsState));
                                composer2.startReplaceGroup(-1224400529);
                                if (i202 != 4) {
                                    i8 = 458752 & i3;
                                    if (i8 != 131072) {
                                        i9 = i3 & 57344;
                                        i10 = i3 & 112;
                                        bentoNumpadTextInputFormatter2 = bentoNumpadTextInputFormatter5;
                                        zChanged = ((i3 & 3670016) != 1048576) | (i202 != 4 || ((i3 & 8) != 0 && composer2.changedInstance(bentoNumpadScopeV2))) | composer2.changed(snapshotState4CollectIsFocusedAsState) | composer2.changed(snapshotState2) | (i8 != 131072 || ((i3 & 262144) != 0 && composer2.changedInstance(bentoNumpadTextInputFormatter5))) | (i9 != 16384) | (i10 != 32);
                                        objRememberedValue5 = composer2.rememberedValue();
                                        if (zChanged) {
                                            interactionSource32 = interactionSource3;
                                            bool = boolValueOf;
                                            i11 = i3;
                                            str6 = str5;
                                            i12 = i10;
                                            snapshotState4 = snapshotState3;
                                            bentoNumpadTextInputFormatter3 = bentoNumpadTextInputFormatter2;
                                            i13 = 0;
                                            i14 = i9;
                                            i15 = i8;
                                            str7 = str4;
                                            boolean z112 = z5;
                                            z7 = z4;
                                            BentoNumpadTextInput2 bentoNumpadTextInput22 = new BentoNumpadTextInput2(bentoNumpadScopeV2, z112, snapshotState4CollectIsFocusedAsState, snapshotState, snapshotState2, snapshotState4, bentoNumpadTextInputFormatter3, z7, onNumberChange, null);
                                            snapshotState5 = snapshotState;
                                            snapshotState6 = snapshotState2;
                                            z8 = z112;
                                            composer2.updateRememberedValue(bentoNumpadTextInput22);
                                            objRememberedValue5 = bentoNumpadTextInput22;
                                            composer2.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(bool, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue5, composer2, i13);
                                            TextFieldValue textFieldValue2 = bentoNumpadTextInputFormatter3.format(new TextFieldValue(BentoNumpadTextInput$lambda$7(snapshotState6), BentoNumpadTextInput$lambda$10(snapshotState4), (TextRange) null, 4, (DefaultConstructorMarker) null));
                                            composer2.startReplaceGroup(-1224400529);
                                            if (i15 != 131072) {
                                                i16 = (i14 != 16384 ? 1 : i13) | ((i15 != 131072 || ((i11 & 262144) != 0 && composer2.changedInstance(bentoNumpadTextInputFormatter3))) ? 1 : i13) | (composer2.changed(snapshotState6) ? 1 : 0) | (i12 != 32 ? 1 : i13);
                                                objRememberedValue6 = composer2.rememberedValue();
                                                if (i16 == 0) {
                                                    final BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter62 = bentoNumpadTextInputFormatter3;
                                                    final boolean z122 = z7;
                                                    Function1 function12 = new Function1() { // from class: com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputKt$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return BentoNumpadTextInput.BentoNumpadTextInput$lambda$16$lambda$15(bentoNumpadTextInputFormatter62, z122, onNumberChange, snapshotState6, snapshotState5, snapshotState4, (TextFieldValue) obj);
                                                        }
                                                    };
                                                    composer2.updateRememberedValue(function12);
                                                    objRememberedValue6 = function12;
                                                    composer2.endReplaceGroup();
                                                    textInput.invoke(textFieldValue2, interactionSource32, (Function1) objRememberedValue6, composer2, Integer.valueOf(((i11 >> 12) & 7168) | 48));
                                                    if (ComposerKt.isTraceInProgress()) {
                                                    }
                                                    str8 = str6;
                                                    bentoNumpadTextInputFormatter4 = bentoNumpadTextInputFormatter3;
                                                    z9 = z7;
                                                    z10 = z8;
                                                    str9 = str7;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i6 = i2 & 16;
                int i192 = 196608;
                if (i6 != 0) {
                }
                i7 = i2 & 32;
                if (i7 == 0) {
                }
                if ((i2 & 64) != 0) {
                }
                i3 |= i17;
                if ((i3 & 4793491) == 4793490) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str2;
            i5 = i2 & 8;
            if (i5 != 0) {
            }
            i6 = i2 & 16;
            int i1922 = 196608;
            if (i6 != 0) {
            }
            i7 = i2 & 32;
            if (i7 == 0) {
            }
            if ((i2 & 64) != 0) {
            }
            i3 |= i17;
            if ((i3 & 4793491) == 4793490) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str3 = str;
        i4 = i2 & 4;
        if (i4 == 0) {
        }
        str4 = str2;
        i5 = i2 & 8;
        if (i5 != 0) {
        }
        i6 = i2 & 16;
        int i19222 = 196608;
        if (i6 != 0) {
        }
        i7 = i2 & 32;
        if (i7 == 0) {
        }
        if ((i2 & 64) != 0) {
        }
        i3 |= i17;
        if ((i3 & 4793491) == 4793490) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BentoNumpadTextInput$lambda$4(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long BentoNumpadTextInput$lambda$10(SnapshotState<TextRange> snapshotState) {
        return snapshotState.getValue().getPackedValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoNumpadTextInput$lambda$13(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean BentoNumpadTextInput$lambda$3(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String BentoNumpadTextInput$lambda$7(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState BentoNumpadTextInput$lambda$6$lambda$5(BentoNumpadScopeV2 bentoNumpadScopeV2, String str, String str2) {
        if (str2 == null) {
            str2 = "";
        }
        return bentoNumpadScopeV2.getInternalValue(str, str2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void BentoNumpadTextInput$lambda$11(SnapshotState<TextRange> snapshotState, long j) {
        snapshotState.setValue(TextRange.m7634boximpl(j));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BentoNumpadTextInput$lambda$16$lambda$15(BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter, boolean z, Function1 function1, SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, TextFieldValue newValue) {
        Intrinsics.checkNotNullParameter(newValue, "newValue");
        TextFieldValue textFieldValueHandleIncomingTextFieldValue = handleIncomingTextFieldValue(newValue, bentoNumpadTextInputFormatter, z);
        if (!Intrinsics.areEqual(BentoNumpadTextInput$lambda$7(snapshotState), textFieldValueHandleIncomingTextFieldValue.getText())) {
            snapshotState.setValue(textFieldValueHandleIncomingTextFieldValue.getText());
            BentoNumpadTextInput$lambda$11(snapshotState3, textFieldValueHandleIncomingTextFieldValue.getSelection());
        } else if (BentoNumpadTextInput$lambda$3(snapshotState2)) {
            BentoNumpadTextInput$lambda$4(snapshotState2, false);
            BentoNumpadTextInput$lambda$11(snapshotState3, TextRange2.TextRange(textFieldValueHandleIncomingTextFieldValue.getText().length()));
        } else {
            BentoNumpadTextInput$lambda$11(snapshotState3, newValue.getSelection());
        }
        function1.invoke(bentoNumpadTextInputFormatter.parse(textFieldValueHandleIncomingTextFieldValue.getText()));
        return Unit.INSTANCE;
    }
}
