package com.robinhood.android.creditcard.p091ui.creditapplication.textinputs;

import android.text.TextUtils;
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

/* compiled from: SsnHeroInput.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aB\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tH\u0001¢\u0006\u0002\u0010\n¨\u0006\u000b²\u0006\n\u0010\f\u001a\u00020\rX\u008a\u008e\u0002"}, m3636d2 = {"SsnHeroInput", "", "value", "", "onValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug", "focused", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInputKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class SsnHeroInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SsnHeroInput$lambda$9(String str, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SsnHeroInput(str, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SsnHeroInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean z;
        Object objRememberedValue3;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1000761907);
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
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i3;
            if ((i4 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1000761907, i4, -1, "com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInput (SsnHeroInput.kt:26)");
                }
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInputKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return SsnHeroInput.SsnHeroInput$lambda$1$lambda$0();
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
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInputKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SsnHeroInput.SsnHeroInput$lambda$5$lambda$4(snapshotState, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_ssn_input_placeholder, composerStartRestartGroup, 0);
                KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                SsnHeroInput2 ssnHeroInput2 = new SsnHeroInput2(SsnHeroInput$lambda$2(snapshotState));
                composerStartRestartGroup.startReplaceGroup(340505906);
                BentoTextInput8.Message.Error error = (!SsnHeroInput$lambda$2(snapshotState) || value.length() <= 0 || (value.length() >= 9 && TextUtils.isDigitsOnly(value))) ? null : new BentoTextInput8.Message.Error(StringResources_androidKt.stringResource(C12201R.string.credit_app_ssn_error, composerStartRestartGroup, 0));
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(5004770);
                z = (i4 & 112) == 32;
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInputKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SsnHeroInput.SsnHeroInput$lambda$8$lambda$7(onValueChange, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged, null, strStringResource, null, null, error, null, keyboardOptions, null, ssnHeroInput2, false, false, composerStartRestartGroup, (i4 & 14) | 805306368 | (BentoTextInput8.Message.Error.$stable << 21), 0, 13672);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInputKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SsnHeroInput.SsnHeroInput$lambda$9(value, onValueChange, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 147) == 146) {
            if (i5 == 0) {
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
                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInputKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SsnHeroInput.SsnHeroInput$lambda$5$lambda$4(snapshotState, (FocusState) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_ssn_input_placeholder, composerStartRestartGroup, 0);
                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7782getNumberPasswordPjHm6EE(), 0, null, null, null, 123, null);
                SsnHeroInput2 ssnHeroInput22 = new SsnHeroInput2(SsnHeroInput$lambda$2(snapshotState));
                composerStartRestartGroup.startReplaceGroup(340505906);
                if (SsnHeroInput$lambda$2(snapshotState)) {
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i4 & 112) == 32) {
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.SsnHeroInputKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SsnHeroInput.SsnHeroInput$lambda$8$lambda$7(onValueChange, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifier52 = modifier4;
                        BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged2, null, strStringResource2, null, null, error, null, keyboardOptions2, null, ssnHeroInput22, false, false, composerStartRestartGroup, (i4 & 14) | 805306368 | (BentoTextInput8.Message.Error.$stable << 21), 0, 13672);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState SsnHeroInput$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void SsnHeroInput$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SsnHeroInput$lambda$5$lambda$4(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SsnHeroInput$lambda$3(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SsnHeroInput$lambda$8$lambda$7(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.length() <= 9) {
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

    private static final boolean SsnHeroInput$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
