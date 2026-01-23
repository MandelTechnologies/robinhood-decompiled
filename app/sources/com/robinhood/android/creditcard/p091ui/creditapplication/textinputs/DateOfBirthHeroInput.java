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
import kotlin.ranges.PrimitiveRanges2;
import kotlin.text.StringsKt;
import p479j$.time.LocalDate;
import p479j$.time.chrono.ChronoLocalDate;
import p479j$.time.format.DateTimeFormatter;
import p479j$.time.format.DateTimeParseException;
import p479j$.time.format.ResolverStyle;

/* compiled from: DateOfBirthHeroInput.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001an\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\r2\u0014\b\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u000f\u001a\f\u0010\u0010\u001a\u00020\u000b*\u00020\u0003H\u0001\u001a\f\u0010\u0011\u001a\u00020\u000b*\u00020\u0003H\u0001¨\u0006\u0012²\u0006\n\u0010\u0013\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"DateOfBirthHeroInput", "", "value", "", "onValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "trailingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "onError", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "isUnder18", "isValidDate", "feature-credit-card_externalDebug", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class DateOfBirthHeroInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateOfBirthHeroInput$lambda$11(String str, Function1 function1, Modifier modifier, boolean z, BentoTextInput8.Icon.Size24 size24, Function1 function12, int i, int i2, Composer composer, int i3) {
        DateOfBirthHeroInput(str, function1, modifier, z, size24, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateOfBirthHeroInput$lambda$1$lambda$0(boolean z) {
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0217  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0283  */
    /* JADX WARN: Removed duplicated region for block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x012f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void DateOfBirthHeroInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, BentoTextInput8.Icon.Size24 size24, Function1<? super Boolean, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Function1<? super Boolean, Unit> function12;
        int i7;
        Function1<? super Boolean, Unit> function13;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean z3;
        boolean zChanged;
        Object objRememberedValue2;
        String strStringResource;
        boolean z4;
        Object objRememberedValue3;
        final BentoTextInput8.Icon.Size24 size242;
        final boolean z5;
        final Modifier modifier3;
        final Function1<? super Boolean, Unit> function14;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        BentoTextInput8.Icon.Size24 size243 = size24;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-171213433);
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
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(size243) : composerStartRestartGroup.changedInstance(size243) ? 16384 : 8192;
                }
                i6 = i2 & 32;
                if (i6 == 0) {
                    if ((196608 & i) == 0) {
                        function12 = function1;
                        i3 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                    }
                    i7 = i3;
                    if ((74899 & i7) == 74898 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i8 == 0 ? Modifier.INSTANCE : modifier2;
                        boolean z6 = i4 == 0 ? true : z2;
                        BentoTextInput8.Message.Error error = null;
                        if (i5 != 0) {
                            size243 = null;
                        }
                        if (i6 == 0) {
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue4 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return DateOfBirthHeroInput.DateOfBirthHeroInput$lambda$1$lambda$0(((Boolean) obj).booleanValue());
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            function13 = (Function1) objRememberedValue4;
                        } else {
                            function13 = function12;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-171213433, i7, -1, "com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInput (DateOfBirthHeroInput.kt:33)");
                        }
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return DateOfBirthHeroInput.DateOfBirthHeroInput$lambda$3$lambda$2();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        z3 = !(value.length() <= 0) && ((!DateOfBirthHeroInput$lambda$4(snapshotState) && value.length() < 8) || !isValidDate(value) || isUnder18(value));
                        function13.invoke(Boolean.valueOf(z3));
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(snapshotState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DateOfBirthHeroInput.DateOfBirthHeroInput$lambda$7$lambda$6(snapshotState, (FocusState) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                        if (DateOfBirthHeroInput$lambda$4(snapshotState)) {
                            composerStartRestartGroup.startReplaceGroup(1802661822);
                            strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_dob_input_placeholder, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            composerStartRestartGroup.startReplaceGroup(1802569411);
                            strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_dob_input_format_placeholder, composerStartRestartGroup, 0);
                            composerStartRestartGroup.endReplaceGroup();
                        }
                        KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                        DateOfBirthHeroInput2 dateOfBirthHeroInput2 = new DateOfBirthHeroInput2();
                        composerStartRestartGroup.startReplaceGroup(-1327315249);
                        if (z3) {
                            error = isUnder18(value) ? new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C12201R.string.credit_app_dob_input_age_error, composerStartRestartGroup, 0)) : new BentoTextInput8.Message.Error("");
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        z4 = (i7 & 112) == 32;
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (!z4 || objRememberedValue3 == companion.getEmpty()) {
                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt$$ExternalSyntheticLambda3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DateOfBirthHeroInput.DateOfBirthHeroInput$lambda$10$lambda$9(onValueChange, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier5 = modifier4;
                        boolean z7 = z6;
                        BentoTextInput8.Icon.Size24 size244 = size243;
                        Function1<? super Boolean, Unit> function15 = function13;
                        BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged, null, strStringResource, null, size244, error, null, keyboardOptions, null, dateOfBirthHeroInput2, z7, false, composerStartRestartGroup, (i7 & 14) | 805306368 | (BentoTextInput8.Icon.Size24.$stable << 18) | (3670016 & (i7 << 6)) | (BentoTextInput8.Message.Error.$stable << 21), (i7 >> 3) & 896, 9512);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                        size242 = size244;
                        z5 = z7;
                        modifier3 = modifier5;
                        function14 = function15;
                    } else {
                        composerStartRestartGroup.skipToGroupEnd();
                        size242 = size243;
                        modifier3 = modifier2;
                        z5 = z2;
                        function14 = function12;
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return DateOfBirthHeroInput.DateOfBirthHeroInput$lambda$11(value, onValueChange, modifier3, z5, size242, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                            }
                        });
                        return;
                    }
                    return;
                }
                i3 |= 196608;
                function12 = function1;
                i7 = i3;
                if ((74899 & i7) == 74898) {
                    if (i8 == 0) {
                    }
                    if (i4 == 0) {
                    }
                    BentoTextInput8.Message.Error error2 = null;
                    if (i5 != 0) {
                    }
                    if (i6 == 0) {
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
                    if (value.length() <= 0) {
                        function13.invoke(Boolean.valueOf(z3));
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(snapshotState);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt$$ExternalSyntheticLambda2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return DateOfBirthHeroInput.DateOfBirthHeroInput$lambda$7$lambda$6(snapshotState, (FocusState) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                            if (DateOfBirthHeroInput$lambda$4(snapshotState)) {
                            }
                            KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                            DateOfBirthHeroInput2 dateOfBirthHeroInput22 = new DateOfBirthHeroInput2();
                            composerStartRestartGroup.startReplaceGroup(-1327315249);
                            if (z3) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            if ((i7 & 112) == 32) {
                            }
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!z4) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.DateOfBirthHeroInputKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return DateOfBirthHeroInput.DateOfBirthHeroInput$lambda$10$lambda$9(onValueChange, (String) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifier52 = modifier4;
                                boolean z72 = z6;
                                BentoTextInput8.Icon.Size24 size2442 = size243;
                                Function1<? super Boolean, Unit> function152 = function13;
                                BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged2, null, strStringResource, null, size2442, error2, null, keyboardOptions2, null, dateOfBirthHeroInput22, z72, false, composerStartRestartGroup, (i7 & 14) | 805306368 | (BentoTextInput8.Icon.Size24.$stable << 18) | (3670016 & (i7 << 6)) | (BentoTextInput8.Message.Error.$stable << 21), (i7 >> 3) & 896, 9512);
                                composerStartRestartGroup = composerStartRestartGroup;
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                size242 = size2442;
                                z5 = z72;
                                modifier3 = modifier52;
                                function14 = function152;
                            }
                        }
                    }
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            function12 = function1;
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
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        function12 = function1;
        i7 = i3;
        if ((74899 & i7) == 74898) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState DateOfBirthHeroInput$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void DateOfBirthHeroInput$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateOfBirthHeroInput$lambda$7$lambda$6(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        DateOfBirthHeroInput$lambda$5(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DateOfBirthHeroInput$lambda$10$lambda$9(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 8) {
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

    public static final boolean isUnder18(String str) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (str.length() == 8 && isValidDate(str)) {
            if (LocalDate.parse(str, DateTimeFormatter.ofPattern("MMdduuuu")).compareTo((ChronoLocalDate) LocalDate.now().minusYears(18L)) > 0) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isValidDate$tryParse(String str) {
        try {
            LocalDate.parse(str, DateTimeFormatter.ofPattern("MMdduuuu").withResolverStyle(ResolverStyle.STRICT));
            return true;
        } catch (DateTimeParseException unused) {
            return false;
        }
    }

    private static final boolean DateOfBirthHeroInput$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    public static final boolean isValidDate(String str) throws NumberFormatException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (StringsKt.toIntOrNull(str) == null || str.length() > 8) {
            return false;
        }
        if (str.length() == 8) {
            return isValidDate$tryParse(str);
        }
        if (str.length() >= 4) {
            return isValidDate$tryParse(StringsKt.slice(str, new PrimitiveRanges2(0, 3)) + "2000");
        }
        if (str.length() < 2) {
            return true;
        }
        int i = Integer.parseInt(StringsKt.slice(str, new PrimitiveRanges2(0, 1)));
        return 1 <= i && i < 13;
    }
}
