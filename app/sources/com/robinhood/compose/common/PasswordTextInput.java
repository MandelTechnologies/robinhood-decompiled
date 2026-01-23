package com.robinhood.compose.common;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.input.VisualTransformation2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: PasswordTextInput.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0083\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u00102\b\b\u0002\u0010\u0011\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0012\u001a\f\u0010\u0013\u001a\u00020\u000e*\u00020\u0010H\u0002\u001a\f\u0010\u0014\u001a\u00020\u0015*\u00020\u0010H\u0002¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0010X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0010X\u008a\u008e\u0002"}, m3636d2 = {"PasswordTextInput", "", "value", "", "onValueChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", AnnotatedPrivateKey.LABEL, "placeholder", "hint", "message", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "leadingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "enabled", "", "initialPasswordVisibility", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;ZZLandroidx/compose/runtime/Composer;II)V", "toTrailingIcon", "toVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "lib-compose-common_externalDebug", "passwordVisible", "passwordControlVisible"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.compose.common.PasswordTextInputKt, reason: use source file name */
/* loaded from: classes15.dex */
public final class PasswordTextInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordTextInput$lambda$12(String str, Function1 function1, Modifier modifier, String str2, String str3, String str4, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 size24, boolean z, boolean z2, int i, int i2, Composer composer, int i3) {
        PasswordTextInput(str, function1, modifier, str2, str3, str4, message, size24, z, z2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0167  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x017b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0180  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01a7  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:156:0x0235  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x025a  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0270  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c2 A[PHI: r18
      0x00c2: PHI (r18v24 int) = (r18v0 int), (r18v6 int), (r18v7 int) binds: [B:67:0x00c0, B:77:0x00dd, B:76:0x00da] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e6 A[PHI: r18
      0x00e6: PHI (r18v23 int) = (r18v9 int), (r18v15 int), (r18v16 int) binds: [B:79:0x00e4, B:89:0x0101, B:88:0x00fe] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0113  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PasswordTextInput(final String value, final Function1<? super String, Unit> onValueChange, Modifier modifier, String str, String str2, String str3, BentoTextInput8.Message message, BentoTextInput8.Icon.Size24 size24, boolean z, boolean z2, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        String str4;
        int i5;
        String str5;
        int i6;
        final String str6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        final boolean z3;
        boolean z4;
        Object objRememberedValue;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        Composer.Companion companion;
        final SnapshotState snapshotState2;
        boolean zChanged;
        Object objRememberedValue3;
        boolean zChanged2;
        Object objRememberedValue4;
        final BentoTextInput8.Icon.Size24 size242;
        final boolean z5;
        final boolean z6;
        final BentoTextInput8.Message message2;
        final String str7;
        final String str8;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        BentoTextInput8.Message message3 = message;
        BentoTextInput8.Icon.Size24 size243 = size24;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1704591402);
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
        int i12 = i2 & 4;
        if (i12 != 0) {
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
                    str4 = str;
                    i3 |= composerStartRestartGroup.changed(str4) ? 2048 : 1024;
                }
                i5 = i2 & 16;
                if (i5 != 0) {
                    i3 |= 24576;
                } else {
                    if ((i & 24576) == 0) {
                        str5 = str2;
                        i3 |= composerStartRestartGroup.changed(str5) ? 16384 : 8192;
                    }
                    i6 = i2 & 32;
                    if (i6 == 0) {
                        i3 |= 196608;
                        str6 = str3;
                    } else {
                        str6 = str3;
                        if ((i & 196608) == 0) {
                            i3 |= composerStartRestartGroup.changed(str6) ? 131072 : 65536;
                        }
                    }
                    i7 = i2 & 64;
                    int i13 = 1572864;
                    if (i7 != 0) {
                        i3 |= i13;
                    } else if ((i & 1572864) == 0) {
                        i13 = (i & 2097152) == 0 ? composerStartRestartGroup.changed(message3) : composerStartRestartGroup.changedInstance(message3) ? 1048576 : 524288;
                        i3 |= i13;
                    }
                    i8 = i2 & 128;
                    int i14 = 12582912;
                    if (i8 != 0) {
                        i3 |= i14;
                    } else if ((i & 12582912) == 0) {
                        i14 = (i & 16777216) == 0 ? composerStartRestartGroup.changed(size243) : composerStartRestartGroup.changedInstance(size243) ? 8388608 : 4194304;
                        i3 |= i14;
                    }
                    i9 = i2 & 256;
                    if (i9 != 0) {
                        if ((i & 100663296) == 0) {
                            i10 = i9;
                            i3 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                        }
                        i11 = i2 & 512;
                        if (i11 != 0) {
                            i3 |= 805306368;
                        } else if ((i & 805306368) == 0) {
                            i3 |= composerStartRestartGroup.changed(z2) ? 536870912 : 268435456;
                        }
                        if ((i3 & 306783379) == 306783378 && composerStartRestartGroup.getSkipping()) {
                            composerStartRestartGroup.skipToGroupEnd();
                            z6 = z2;
                            message2 = message3;
                            size242 = size243;
                            modifier3 = modifier2;
                            str8 = str4;
                            str7 = str5;
                            z5 = z;
                        } else {
                            Modifier modifier4 = i12 == 0 ? Modifier.INSTANCE : modifier2;
                            if (i4 != 0) {
                                str4 = null;
                            }
                            if (i5 != 0) {
                                str5 = null;
                            }
                            if (i6 != 0) {
                                str6 = null;
                            }
                            if (i7 != 0) {
                                message3 = null;
                            }
                            if (i8 != 0) {
                                size243 = null;
                            }
                            boolean z7 = i10 == 0 ? true : z;
                            z3 = i11 == 0 ? false : z2;
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1704591402, i3, -1, "com.robinhood.compose.common.PasswordTextInput (PasswordTextInput.kt:34)");
                            }
                            Object[] objArr = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            z4 = (1879048192 & i3) != 536870912;
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z4 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PasswordTextInput.PasswordTextInput$lambda$1$lambda$0(z3);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                            Object[] objArr2 = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            BentoTextInput8.Message message4 = message3;
                            if (objRememberedValue2 == companion.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PasswordTextInput.PasswordTextInput$lambda$5$lambda$4();
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged = composerStartRestartGroup.changed(snapshotState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return PasswordTextInput.PasswordTextInput$lambda$9$lambda$8(snapshotState2, (FocusState) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue3);
                            BentoTextInput8.Icon.Size24 trailingIcon = !PasswordTextInput$lambda$6(snapshotState2) ? toTrailingIcon(PasswordTextInput$lambda$2(snapshotState)) : null;
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged2 = composerStartRestartGroup.changed(snapshotState);
                            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged2 || objRememberedValue4 == companion.getEmpty()) {
                                objRememberedValue4 = new Function0() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return PasswordTextInput.PasswordTextInput$lambda$11$lambda$10(snapshotState);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            KeyboardOptions keyboardOptions = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7783getPasswordPjHm6EE(), 0, null, null, null, 123, null);
                            VisualTransformation visualTransformation = toVisualTransformation(PasswordTextInput$lambda$2(snapshotState));
                            int i15 = (523390 & i3) | (BentoTextInput8.Message.$stable << 18) | (3670016 & i3);
                            int i16 = BentoTextInput8.Icon.Size24.$stable;
                            int i17 = i15 | (i16 << 21) | (i3 & 29360128) | (i16 << 24);
                            int i18 = ((i3 >> 15) & 7168) | 6;
                            String str9 = str5;
                            boolean z8 = z7;
                            BentoTextInput8.Icon.Size24 size244 = size243;
                            String str10 = str4;
                            Modifier modifier5 = modifier4;
                            String str11 = str6;
                            boolean z9 = z3;
                            BentoTextInput4.BentoTextInput(value, onValueChange, modifierOnFocusChanged, str10, str9, str11, message4, size244, trailingIcon, (Function0) objRememberedValue4, keyboardOptions, null, visualTransformation, z8, false, composerStartRestartGroup, i17, i18, 18432);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            size242 = size244;
                            z5 = z8;
                            z6 = z9;
                            message2 = message4;
                            str6 = str11;
                            str7 = str9;
                            str8 = str10;
                            modifier3 = modifier5;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PasswordTextInput.PasswordTextInput$lambda$12(value, onValueChange, modifier3, str8, str7, str6, message2, size242, z5, z6, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 100663296;
                    i10 = i9;
                    i11 = i2 & 512;
                    if (i11 != 0) {
                    }
                    if ((i3 & 306783379) == 306783378) {
                        if (i12 == 0) {
                        }
                        if (i4 != 0) {
                        }
                        if (i5 != 0) {
                        }
                        if (i6 != 0) {
                        }
                        if (i7 != 0) {
                        }
                        if (i8 != 0) {
                        }
                        if (i10 == 0) {
                        }
                        if (i11 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        Object[] objArr3 = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if ((1879048192 & i3) != 536870912) {
                        }
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return PasswordTextInput.PasswordTextInput$lambda$1$lambda$0(z3);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 0, 6);
                            Object[] objArr22 = new Object[0];
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            BentoTextInput8.Message message42 = message3;
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                            composerStartRestartGroup.startReplaceGroup(5004770);
                            zChanged = composerStartRestartGroup.changed(snapshotState2);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (!zChanged) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return PasswordTextInput.PasswordTextInput$lambda$9$lambda$8(snapshotState2, (FocusState) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                composerStartRestartGroup.endReplaceGroup();
                                Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifier4, (Function1) objRememberedValue3);
                                if (!PasswordTextInput$lambda$6(snapshotState2)) {
                                }
                                composerStartRestartGroup.startReplaceGroup(5004770);
                                zChanged2 = composerStartRestartGroup.changed(snapshotState);
                                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                if (!zChanged2) {
                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.compose.common.PasswordTextInputKt$$ExternalSyntheticLambda3
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return PasswordTextInput.PasswordTextInput$lambda$11$lambda$10(snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                    composerStartRestartGroup.endReplaceGroup();
                                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, null, KeyboardType.INSTANCE.m7783getPasswordPjHm6EE(), 0, null, null, null, 123, null);
                                    VisualTransformation visualTransformation2 = toVisualTransformation(PasswordTextInput$lambda$2(snapshotState));
                                    int i152 = (523390 & i3) | (BentoTextInput8.Message.$stable << 18) | (3670016 & i3);
                                    int i162 = BentoTextInput8.Icon.Size24.$stable;
                                    int i172 = i152 | (i162 << 21) | (i3 & 29360128) | (i162 << 24);
                                    int i182 = ((i3 >> 15) & 7168) | 6;
                                    String str92 = str5;
                                    boolean z82 = z7;
                                    BentoTextInput8.Icon.Size24 size2442 = size243;
                                    String str102 = str4;
                                    Modifier modifier52 = modifier4;
                                    String str112 = str6;
                                    boolean z92 = z3;
                                    BentoTextInput4.BentoTextInput(value, onValueChange, modifierOnFocusChanged2, str102, str92, str112, message42, size2442, trailingIcon, (Function0) objRememberedValue4, keyboardOptions2, null, visualTransformation2, z82, false, composerStartRestartGroup, i172, i182, 18432);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    size242 = size2442;
                                    z5 = z82;
                                    z6 = z92;
                                    message2 = message42;
                                    str6 = str112;
                                    str7 = str92;
                                    str8 = str102;
                                    modifier3 = modifier52;
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                str5 = str2;
                i6 = i2 & 32;
                if (i6 == 0) {
                }
                i7 = i2 & 64;
                int i132 = 1572864;
                if (i7 != 0) {
                }
                i8 = i2 & 128;
                int i142 = 12582912;
                if (i8 != 0) {
                }
                i9 = i2 & 256;
                if (i9 != 0) {
                }
                i10 = i9;
                i11 = i2 & 512;
                if (i11 != 0) {
                }
                if ((i3 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str4 = str;
            i5 = i2 & 16;
            if (i5 != 0) {
            }
            str5 = str2;
            i6 = i2 & 32;
            if (i6 == 0) {
            }
            i7 = i2 & 64;
            int i1322 = 1572864;
            if (i7 != 0) {
            }
            i8 = i2 & 128;
            int i1422 = 12582912;
            if (i8 != 0) {
            }
            i9 = i2 & 256;
            if (i9 != 0) {
            }
            i10 = i9;
            i11 = i2 & 512;
            if (i11 != 0) {
            }
            if ((i3 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        str4 = str;
        i5 = i2 & 16;
        if (i5 != 0) {
        }
        str5 = str2;
        i6 = i2 & 32;
        if (i6 == 0) {
        }
        i7 = i2 & 64;
        int i13222 = 1572864;
        if (i7 != 0) {
        }
        i8 = i2 & 128;
        int i14222 = 12582912;
        if (i8 != 0) {
        }
        i9 = i2 & 256;
        if (i9 != 0) {
        }
        i10 = i9;
        i11 = i2 & 512;
        if (i11 != 0) {
        }
        if ((i3 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState PasswordTextInput$lambda$1$lambda$0(boolean z) {
        return SnapshotState3.mutableStateOf$default(Boolean.valueOf(z), null, 2, null);
    }

    private static final void PasswordTextInput$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState PasswordTextInput$lambda$5$lambda$4() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void PasswordTextInput$lambda$7(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordTextInput$lambda$9$lambda$8(SnapshotState snapshotState, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        PasswordTextInput$lambda$7(snapshotState, it.isFocused());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PasswordTextInput$lambda$11$lambda$10(SnapshotState snapshotState) {
        PasswordTextInput$lambda$3(snapshotState, !PasswordTextInput$lambda$2(snapshotState));
        return Unit.INSTANCE;
    }

    private static final BentoTextInput8.Icon.Size24 toTrailingIcon(boolean z) {
        return new BentoTextInput8.Icon.Size24(z ? ServerToBentoAssetMapper2.EYE_24 : ServerToBentoAssetMapper2.EYE_CLOSED_24, null, null, 6, null);
    }

    private static final VisualTransformation toVisualTransformation(boolean z) {
        return z ? VisualTransformation.INSTANCE.getNone() : new VisualTransformation2((char) 0, 1, null);
    }

    private static final boolean PasswordTextInput$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean PasswordTextInput$lambda$6(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
