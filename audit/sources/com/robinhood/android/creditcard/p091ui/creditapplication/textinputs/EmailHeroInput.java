package com.robinhood.android.creditcard.p091ui.creditapplication.textinputs;

import android.util.Patterns;
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

/* compiled from: EmailHeroInput.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aX\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032!\u0010\u0004\u001a\u001d\u0012\u0013\u0012\u00110\u0003¢\u0006\f\b\u0006\u0012\b\b\u0007\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\rH\u0001¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u000bX\u008a\u008e\u0002"}, m3636d2 = {"EmailHeroInput", "", "value", "", "onValueChange", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "modifier", "Landroidx/compose/ui/Modifier;", "enabled", "", "trailingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;Landroidx/compose/runtime/Composer;II)V", "feature-credit-card_externalDebug", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInputKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class EmailHeroInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailHeroInput$lambda$8(String str, Function1 function1, Modifier modifier, boolean z, BentoTextInput8.Icon.Size24 size24, int i, int i2, Composer composer, int i3) {
        EmailHeroInput(str, function1, modifier, z, size24, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x018b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00aa  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x017e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EmailHeroInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, boolean z, BentoTextInput8.Icon.Size24 size24, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int i5;
        int i6;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue2;
        boolean z3;
        Object objRememberedValue3;
        final BentoTextInput8.Icon.Size24 size242;
        final boolean z4;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        BentoTextInput8.Icon.Size24 size243 = size24;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(931609268);
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
        int i7 = i2 & 4;
        if (i7 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
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
                i6 = i3;
                if ((i6 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i7 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z5 = i4 == 0 ? true : z2;
                    BentoTextInput8.Message.Error error = null;
                    if (i5 != 0) {
                        size243 = null;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(931609268, i6, -1, "com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInput (EmailHeroInput.kt:24)");
                    }
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInputKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return EmailHeroInput.EmailHeroInput$lambda$1$lambda$0();
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
                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInputKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EmailHeroInput.EmailHeroInput$lambda$5$lambda$4(snapshotState, (FocusState) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                    String strStringResource = StringResources_androidKt.stringResource(C12201R.string.credit_app_email_input_placeholder, composerStartRestartGroup, 0);
                    KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7780getEmailPjHm6EE(), 0, null, null, null, 123, null);
                    if (!EmailHeroInput$lambda$2(snapshotState)) {
                        if ((value.length() > 0) && !Patterns.EMAIL_ADDRESS.matcher(value).matches()) {
                            error = new BentoTextInput8.Message.Error("");
                        }
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    z3 = (i6 & 112) == 32;
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInputKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EmailHeroInput.EmailHeroInput$lambda$7$lambda$6(onValueChange, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextInput8.Icon.Size24 size244 = size243;
                    boolean z6 = z5;
                    Modifier modifier5 = modifier4;
                    BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged, null, strStringResource, null, size244, error, null, keyboardOptions, null, null, z6, false, composerStartRestartGroup, (i6 & 14) | 805306368 | (BentoTextInput8.Icon.Size24.$stable << 18) | (3670016 & (i6 << 6)) | (BentoTextInput8.Message.Error.$stable << 21), (i6 >> 3) & 896, 11560);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    size242 = size244;
                    z4 = z6;
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    size242 = size243;
                    modifier3 = modifier2;
                    z4 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInputKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return EmailHeroInput.EmailHeroInput$lambda$8(value, onValueChange, modifier3, z4, size242, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            z2 = z;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            i6 = i3;
            if ((i6 & 9363) != 9362) {
                if (i7 == 0) {
                }
                if (i4 == 0) {
                }
                BentoTextInput8.Message.Error error2 = null;
                if (i5 != 0) {
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
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInputKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return EmailHeroInput.EmailHeroInput$lambda$5$lambda$4(snapshotState, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue2);
                    String strStringResource2 = StringResources_androidKt.stringResource(C12201R.string.credit_app_email_input_placeholder, composerStartRestartGroup, 0);
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7780getEmailPjHm6EE(), 0, null, null, null, 123, null);
                    if (!EmailHeroInput$lambda$2(snapshotState)) {
                    }
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i6 & 112) == 32) {
                    }
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue3 = new Function1() { // from class: com.robinhood.android.creditcard.ui.creditapplication.textinputs.EmailHeroInputKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return EmailHeroInput.EmailHeroInput$lambda$7$lambda$6(onValueChange, (String) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoTextInput8.Icon.Size24 size2442 = size243;
                        boolean z62 = z5;
                        Modifier modifier52 = modifier4;
                        BentoTextInput4.BentoHeroTextInput(value, (Function1) objRememberedValue3, modifierOnFocusChanged2, null, strStringResource2, null, size2442, error2, null, keyboardOptions2, null, null, z62, false, composerStartRestartGroup, (i6 & 14) | 805306368 | (BentoTextInput8.Icon.Size24.$stable << 18) | (3670016 & (i6 << 6)) | (BentoTextInput8.Message.Error.$stable << 21), (i6 >> 3) & 896, 11560);
                        composerStartRestartGroup = composerStartRestartGroup;
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        size242 = size2442;
                        z4 = z62;
                        modifier3 = modifier52;
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        z2 = z;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        i6 = i3;
        if ((i6 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState EmailHeroInput$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void EmailHeroInput$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailHeroInput$lambda$5$lambda$4(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        EmailHeroInput$lambda$3(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailHeroInput$lambda$7$lambda$6(Function1 function1, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(it);
        return Unit.INSTANCE;
    }

    private static final boolean EmailHeroInput$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
