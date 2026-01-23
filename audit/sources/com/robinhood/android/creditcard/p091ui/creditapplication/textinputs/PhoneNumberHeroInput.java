package com.robinhood.android.creditcard.p091ui.creditapplication.textinputs;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.creditcard.C12201R;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PhoneNumberHeroInput.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001ad\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000b\u001a\u00020\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\fX\u008a\u008e\u0002"}, m3636d2 = {"PhoneNumberHeroInput", "", "value", "", "onValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "modifier", "Landroidx/compose/ui/Modifier;", "placeholder", "enabled", "", "trailingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInputKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class PhoneNumberHeroInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberHeroInput$lambda$9(String str, Function1 function1, Modifier modifier, String str2, boolean z, BentoTextInput8.Icon.Size24 size24, int i, int i2, Composer composer, int i3) {
        PhoneNumberHeroInput(str, function1, modifier, str2, z, size24, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0198  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x019b  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x019e  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0218  */
    /* JADX WARN: Removed duplicated region for block: B:129:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a0 A[PHI: r15
      0x00a0: PHI (r15v11 int) = (r15v0 int), (r15v6 int), (r15v7 int) binds: [B:57:0x009e, B:68:0x00b9, B:67:0x00b6] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e0  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00ed  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x013f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PhoneNumberHeroInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, String str, boolean z, BentoTextInput8.Icon.Size24 size24, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str2;
        int i5;
        boolean z2;
        int i6;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        final BentoTextInput8.Icon.Size24 size242;
        final boolean z4;
        final String str3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        BentoTextInput8.Icon.Size24 size243 = size24;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(711397225);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
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
                    str2 = str;
                    i3 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 == 0) {
                    if ((i & 24576) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    int i9 = 196608;
                    if (i6 != 0) {
                        i3 |= i9;
                    } else if ((196608 & i) == 0) {
                        i9 = (262144 & i) == 0 ? composerStartRestartGroup.changed(size243) : composerStartRestartGroup.changedInstance(size243) ? 131072 : 65536;
                        i3 |= i9;
                    }
                    i7 = i3;
                    if ((74899 & i7) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        BentoTextInput8.Message.Error error = null;
                        String str4 = i4 == 0 ? null : str2;
                        if (i5 != 0) {
                            z2 = true;
                        }
                        if (i6 != 0) {
                            size243 = null;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(711397225, i7, -1, "com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInput (PhoneNumberHeroInput.kt:28)");
                        }
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInputKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PhoneNumberHeroInput.PhoneNumberHeroInput$lambda$1$lambda$0();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(snapshotState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInputKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PhoneNumberHeroInput.PhoneNumberHeroInput$lambda$5$lambda$4(snapshotState, (FocusState) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                        composerStartRestartGroup.startReplaceGroup(752953658);
                        String strStringResource = str4 != null ? StringResources_androidKt.stringResource(C12201R.string.credit_app_phone_number_input_placeholder, composerStartRestartGroup, 0) : str4;
                        composerStartRestartGroup.endReplaceGroup();
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                        PhoneNumberHeroInput2 phoneNumberHeroInput2 = new PhoneNumberHeroInput2();
                        if (!PhoneNumberHeroInput$lambda$2(snapshotState) && value.length() < 10) {
                            if (value.length() <= 0) {
                                error = new BentoTextInput8.Message.Error("");
                            }
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z3 = (i7 & 112) == 32;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInputKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PhoneNumberHeroInput.PhoneNumberHeroInput$lambda$8$lambda$7(onValueChange, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        boolean z5 = z2;
                        size242 = size243;
                        BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged, null, strStringResource, null, size242, error, null, keyboardOptions, null, phoneNumberHeroInput2, z5, false, composerStartRestartGroup, (i7 & 14) | 805306368 | (BentoTextInput8.Icon.Size24.$stable << 18) | ((i7 << 3) & 3670016) | (BentoTextInput8.Message.Error.$stable << 21), (i7 >> 6) & 896, 9512);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        z4 = z5;
                        str3 = str4;
                        modifier3 = modifier5;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        size242 = size243;
                        modifier3 = modifier2;
                        str3 = str2;
                        z4 = z2;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInputKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PhoneNumberHeroInput.PhoneNumberHeroInput$lambda$9(value, onValueChange, modifier3, str3, z4, size242, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 24576;
                z2 = z;
                i6 = i2 & 32;
                int i92 = 196608;
                if (i6 != 0) {
                }
                i7 = i3;
                if ((74899 & i7) == 74898) {
                    if (i8 == 0) {
                    }
                    BentoTextInput8.Message.Error error2 = null;
                    if (i4 == 0) {
                    }
                    if (i5 != 0) {
                    }
                    if (i6 != 0) {
                    }
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    zChanged = composerStartRestartGroup.changed(snapshotState);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged) {
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInputKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return PhoneNumberHeroInput.PhoneNumberHeroInput$lambda$5$lambda$4(snapshotState, (FocusState) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                        composerStartRestartGroup.startReplaceGroup(752953658);
                        if (str4 != null) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                        PhoneNumberHeroInput2 phoneNumberHeroInput22 = new PhoneNumberHeroInput2();
                        if (!PhoneNumberHeroInput$lambda$2(snapshotState)) {
                            if (value.length() <= 0) {
                            }
                        }
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((i7 & 112) == 32) {
                        }
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z3) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.PhoneNumberHeroInputKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return PhoneNumberHeroInput.PhoneNumberHeroInput$lambda$8$lambda$7(onValueChange, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifier52 = modifier4;
                            boolean z52 = z2;
                            size242 = size243;
                            BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged2, null, strStringResource, null, size242, error2, null, keyboardOptions2, null, phoneNumberHeroInput22, z52, false, composerStartRestartGroup, (i7 & 14) | 805306368 | (BentoTextInput8.Icon.Size24.$stable << 18) | ((i7 << 3) & 3670016) | (BentoTextInput8.Message.Error.$stable << 21), (i7 >> 6) & 896, 9512);
                            composerStartRestartGroup = composerStartRestartGroup;
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            z4 = z52;
                            str3 = str4;
                            modifier3 = modifier52;
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i5 = i2 & 16;
            if (i5 == 0) {
            }
            z2 = z;
            i6 = i2 & 32;
            int i922 = 196608;
            if (i6 != 0) {
            }
            i7 = i3;
            if ((74899 & i7) == 74898) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str2 = str;
        i5 = i2 & 16;
        if (i5 == 0) {
        }
        z2 = z;
        i6 = i2 & 32;
        int i9222 = 196608;
        if (i6 != 0) {
        }
        i7 = i3;
        if ((74899 & i7) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState PhoneNumberHeroInput$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void PhoneNumberHeroInput$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberHeroInput$lambda$5$lambda$4(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PhoneNumberHeroInput$lambda$3(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PhoneNumberHeroInput$lambda$8$lambda$7(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 10) {
            if (it.length() == 0) {
                function1.invoke(it);
            } else {
                for (int i = 0; i < it.length(); i++) {
                    if (!Character.isDigit(it.charAt(i))) {
                        break;
                    }
                }
                function1.invoke(it);
            }
        }
        return Unit.INSTANCE;
    }

    private static final boolean PhoneNumberHeroInput$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
