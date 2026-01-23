package com.robinhood.shared.crypto.p375ui.textinput;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import androidx.compose.animation.core.AnimateAsState;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.KeyframesSpec;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardActions2;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.semantics.SemanticsModifier6;
import androidx.compose.p011ui.semantics.SemanticsPropertiesKt;
import androidx.compose.p011ui.semantics.SemanticsPropertyReceiver;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotIntState3;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.common.AnimateShake;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.shared.crypto.p375ui.C38572R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* compiled from: CryptoAddressTextInput.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001ag\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0012\u0010\u0013\u001au\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\t2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\r2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00162\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u0007¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b²\u0006\n\u0010\u001c\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u001d\u001a\u00020\u001eX\u008a\u0084\u0002²\u0006\n\u0010\u001f\u001a\u00020\u0005X\u008a\u008e\u0002²\u0006\n\u0010 \u001a\u00020!X\u008a\u008e\u0002²\u0006\n\u0010\"\u001a\u00020\u0011X\u008a\u0084\u0002²\u0006\n\u0010#\u001a\u00020\tX\u008a\u0084\u0002"}, m3636d2 = {"CryptoAddressTextInput", "", PlaceTypes.ADDRESS, "", "maxLimit", "", "textStyle", "Landroidx/compose/ui/text/TextStyle;", "textColor", "Landroidx/compose/ui/graphics/Color;", "cursorBrushColor", "visualTransformationColor", "onAddressChange", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "requestFocus", "", "CryptoAddressTextInput-TtFQ49E", "(Ljava/lang/String;ILandroidx/compose/ui/text/TextStyle;JJJLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "CryptoAddressTextInputCondensed", "showPasteLimitToast", "Lkotlin/Function0;", AnnotatedPrivateKey.LABEL, "placeholder", "CryptoAddressTextInputCondensed-IkByU14", "(Ljava/lang/String;IJLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLandroidx/compose/runtime/Composer;II)V", "lib-crypto-ui_externalDebug", "shake", "xOffset", "", "shakeKey", "internalTextField", "Landroidx/compose/ui/text/input/TextFieldValue;", "focused", "valueColor"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoAddressTextInput2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddressTextInputCondensed_IkByU14$lambda$36(String str, int i, long j, Function1 function1, Function0 function0, Modifier modifier, String str2, String str3, boolean z, int i2, int i3, Composer composer, int i4) {
        m25245CryptoAddressTextInputCondensedIkByU14(str, i, j, function1, function0, modifier, str2, str3, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddressTextInput_TtFQ49E$lambda$17(String str, int i, TextStyle textStyle, long j, long j2, long j3, Function1 function1, Modifier modifier, boolean z, int i2, int i3, Composer composer, int i4) {
        m25244CryptoAddressTextInputTtFQ49E(str, i, textStyle, j, j2, j3, function1, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextFieldValue CryptoAddressTextInputCondensed_IkByU14$lambda$24(SnapshotState<TextFieldValue> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean CryptoAddressTextInputCondensed_IkByU14$lambda$32(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long CryptoAddressTextInputCondensed_IkByU14$lambda$33(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    private static final boolean CryptoAddressTextInput_TtFQ49E$lambda$2(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final float CryptoAddressTextInput_TtFQ49E$lambda$8(SnapshotState4<Float> snapshotState4) {
        return snapshotState4.getValue().floatValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0128  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x012f  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x017a  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0188  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01d6  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0215  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0340  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x03ad  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x03e4  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x03f0  */
    /* JADX WARN: Removed duplicated region for block: B:175:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fb  */
    /* renamed from: CryptoAddressTextInput-TtFQ49E, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25244CryptoAddressTextInputTtFQ49E(final String address, final int i, final TextStyle textStyle, final long j, final long j2, final long j3, final Function1<? super String, Unit> onAddressChange, Modifier modifier, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        boolean z2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        boolean zChanged;
        Object objRememberedValue3;
        Object objRememberedValue4;
        FocusRequester focusRequester;
        final SoftwareKeyboardController softwareKeyboardController;
        final String strStringResource;
        boolean zChanged2;
        Object objRememberedValue5;
        boolean z3;
        boolean zChanged3;
        Object objRememberedValue6;
        final FocusRequester focusRequester2;
        boolean zChanged4;
        Object objRememberedValue7;
        FocusRequester focusRequester3;
        boolean zChanged5;
        Object objRememberedValue8;
        boolean z4;
        final boolean z5;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(textStyle, "textStyle");
        Intrinsics.checkNotNullParameter(onAddressChange, "onAddressChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1534303781);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(address) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(textStyle) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changed(j) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(j2) ? 16384 : 8192;
        }
        if ((i3 & 32) == 0) {
            if ((i2 & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(j3) ? 131072 : 65536;
            }
            if ((i3 & 64) == 0) {
                i4 |= 1572864;
            } else if ((i2 & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(onAddressChange) ? 1048576 : 524288;
            }
            i5 = i3 & 128;
            if (i5 == 0) {
                i4 |= 12582912;
                modifier2 = modifier;
            } else {
                modifier2 = modifier;
                if ((i2 & 12582912) == 0) {
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                }
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i4 |= 100663296;
                z2 = z;
            } else {
                z2 = z;
                if ((i2 & 100663296) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 67108864 : 33554432;
                }
            }
            if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (i6 != 0) {
                    z2 = false;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1534303781, i4, -1, "com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInput (CryptoAddressTextInput.kt:91)");
                }
                int i7 = i4;
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$1$lambda$0();
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                float f = !CryptoAddressTextInput_TtFQ49E$lambda$2(snapshotState) ? 0.1f : 0.0f;
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$5$lambda$4((KeyframesSpec.KeyframesSpecConfig) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                KeyframesSpec keyframesSpecKeyframes = AnimationSpecKt.keyframes((Function1) objRememberedValue2);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged = composerStartRestartGroup.changed(snapshotState);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$7$lambda$6(snapshotState, ((Float) obj).floatValue());
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState = AnimateAsState.animateFloatAsState(f, keyframesSpecKeyframes, 0.0f, null, (Function1) objRememberedValue3, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                focusRequester = (FocusRequester) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                strStringResource = StringResources_androidKt.stringResource(C38572R.string.crypto_address_text_input_content_description, composerStartRestartGroup, 0);
                Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), focusRequester);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(strStringResource);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$11$lambda$10(strStringResource, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierM5124offsetVpY3zN4 = OffsetKt.m5124offsetVpY3zN4(SemanticsModifier6.semantics$default(modifierFocusRequester, false, (Function1) objRememberedValue5, 1, null), C2002Dp.m7995constructorimpl(CryptoAddressTextInput_TtFQ49E$lambda$8(snapshotState4AnimateFloatAsState)), C2002Dp.m7995constructorimpl(0));
                z3 = z2;
                Modifier modifier5 = modifier4;
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textStyle, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                SolidColor solidColor = new SolidColor(j2, null);
                CryptoAddressTextInput cryptoAddressTextInput = new CryptoAddressTextInput(0, j3, 1, null);
                KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7767getNoneIUNYP9k(), Boolean.FALSE, KeyboardType.INSTANCE.m7783getPasswordPjHm6EE(), ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 112, null);
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                zChanged3 = composerStartRestartGroup.changed(softwareKeyboardController);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged3 || objRememberedValue6 == companion.getEmpty()) {
                    focusRequester2 = focusRequester;
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$13$lambda$12(focusRequester2, softwareKeyboardController, (KeyboardActions2) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                } else {
                    focusRequester2 = focusRequester;
                }
                composerStartRestartGroup.endReplaceGroup();
                KeyboardActions keyboardActions = new KeyboardActions(null, null, (Function1) objRememberedValue6, null, null, null, 59, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged4 = ((i7 & 112) != 32) | composerStartRestartGroup.changed(snapshotState) | ((i7 & 3670016) != 1048576);
                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                if (!zChanged4 || objRememberedValue7 == companion.getEmpty()) {
                    objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$15$lambda$14(i, onAddressChange, snapshotState, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                }
                composerStartRestartGroup.endReplaceGroup();
                focusRequester3 = focusRequester2;
                BasicTextFieldKt.BasicTextField(address, (Function1<? super String, Unit>) objRememberedValue7, modifierM5124offsetVpY3zN4, false, false, textStyleM7655copyp1EtxEg$default, keyboardOptions, keyboardActions, false, 0, 0, (VisualTransformation) cryptoAddressTextInput, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composerStartRestartGroup, (i7 & 14) | 102236160, 0, 46616);
                composerStartRestartGroup = composerStartRestartGroup;
                Boolean boolValueOf = Boolean.valueOf(z3);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChanged5 = composerStartRestartGroup.changed(softwareKeyboardController) | ((i7 & 234881024) != 67108864);
                objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                if (!zChanged5 || objRememberedValue8 == companion.getEmpty()) {
                    z4 = z3;
                    objRememberedValue8 = new CryptoAddressTextInput3(z4, focusRequester3, softwareKeyboardController, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                } else {
                    z4 = z3;
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, (i7 >> 24) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                z5 = z4;
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z5 = z2;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$17(address, i, textStyle, j, j2, j3, onAddressChange, modifier3, z5, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 196608;
        if ((i3 & 64) == 0) {
        }
        i5 = i3 & 128;
        if (i5 == 0) {
        }
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        if ((i4 & 38347923) == 38347922) {
            if (i5 == 0) {
            }
            if (i6 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            int i72 = i4;
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
            if (!CryptoAddressTextInput_TtFQ49E$lambda$2(snapshotState)) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            KeyframesSpec keyframesSpecKeyframes2 = AnimationSpecKt.keyframes((Function1) objRememberedValue2);
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChanged = composerStartRestartGroup.changed(snapshotState);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$7$lambda$6(snapshotState, ((Float) obj).floatValue());
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState4<Float> snapshotState4AnimateFloatAsState2 = AnimateAsState.animateFloatAsState(f, keyframesSpecKeyframes2, 0.0f, null, (Function1) objRememberedValue3, composerStartRestartGroup, 48, 12);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                focusRequester = (FocusRequester) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                strStringResource = StringResources_androidKt.stringResource(C38572R.string.crypto_address_text_input_content_description, composerStartRestartGroup, 0);
                Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null), focusRequester);
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChanged2 = composerStartRestartGroup.changed(strStringResource);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$11$lambda$10(strStringResource, (SemanticsPropertyReceiver) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierM5124offsetVpY3zN42 = OffsetKt.m5124offsetVpY3zN4(SemanticsModifier6.semantics$default(modifierFocusRequester2, false, (Function1) objRememberedValue5, 1, null), C2002Dp.m7995constructorimpl(CryptoAddressTextInput_TtFQ49E$lambda$8(snapshotState4AnimateFloatAsState2)), C2002Dp.m7995constructorimpl(0));
                    z3 = z2;
                    Modifier modifier52 = modifier4;
                    TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(textStyle, j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    SolidColor solidColor2 = new SolidColor(j2, null);
                    CryptoAddressTextInput cryptoAddressTextInput2 = new CryptoAddressTextInput(0, j3, 1, null);
                    KeyboardOptions keyboardOptions2 = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7767getNoneIUNYP9k(), Boolean.FALSE, KeyboardType.INSTANCE.m7783getPasswordPjHm6EE(), ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 112, null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    zChanged3 = composerStartRestartGroup.changed(softwareKeyboardController);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChanged3) {
                        focusRequester2 = focusRequester;
                        objRememberedValue6 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$13$lambda$12(focusRequester2, softwareKeyboardController, (KeyboardActions2) obj);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        composerStartRestartGroup.endReplaceGroup();
                        KeyboardActions keyboardActions2 = new KeyboardActions(null, null, (Function1) objRememberedValue6, null, null, null, 59, null);
                        composerStartRestartGroup.startReplaceGroup(-1746271574);
                        zChanged4 = ((i72 & 112) != 32) | composerStartRestartGroup.changed(snapshotState) | ((i72 & 3670016) != 1048576);
                        objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged4) {
                            objRememberedValue7 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoAddressTextInput2.CryptoAddressTextInput_TtFQ49E$lambda$15$lambda$14(i, onAddressChange, snapshotState, (String) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                            composerStartRestartGroup.endReplaceGroup();
                            focusRequester3 = focusRequester2;
                            BasicTextFieldKt.BasicTextField(address, (Function1<? super String, Unit>) objRememberedValue7, modifierM5124offsetVpY3zN42, false, false, textStyleM7655copyp1EtxEg$default2, keyboardOptions2, keyboardActions2, false, 0, 0, (VisualTransformation) cryptoAddressTextInput2, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor2, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) null, composerStartRestartGroup, (i72 & 14) | 102236160, 0, 46616);
                            composerStartRestartGroup = composerStartRestartGroup;
                            Boolean boolValueOf2 = Boolean.valueOf(z3);
                            composerStartRestartGroup.startReplaceGroup(-1746271574);
                            zChanged5 = composerStartRestartGroup.changed(softwareKeyboardController) | ((i72 & 234881024) != 67108864);
                            objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                            if (zChanged5) {
                                z4 = z3;
                                objRememberedValue8 = new CryptoAddressTextInput3(z4, focusRequester3, softwareKeyboardController, null);
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                                composerStartRestartGroup.endReplaceGroup();
                                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composerStartRestartGroup, (i72 >> 24) & 14);
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                z5 = z4;
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoAddressTextInput_TtFQ49E$lambda$1$lambda$0() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    private static final void CryptoAddressTextInput_TtFQ49E$lambda$3(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddressTextInput_TtFQ49E$lambda$5$lambda$4(KeyframesSpec.KeyframesSpecConfig keyframes) {
        Intrinsics.checkNotNullParameter(keyframes, "$this$keyframes");
        keyframes.setDurationMillis(100);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(0.0f), 0);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(-10.0f), 33);
        keyframes.mo91at((KeyframesSpec.KeyframesSpecConfig) Float.valueOf(10.0f), 66);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddressTextInput_TtFQ49E$lambda$7$lambda$6(SnapshotState snapshotState, float f) {
        CryptoAddressTextInput_TtFQ49E$lambda$3(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddressTextInput_TtFQ49E$lambda$11$lambda$10(String str, SemanticsPropertyReceiver semantics) {
        Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
        SemanticsPropertiesKt.setContentDescription(semantics, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddressTextInput_TtFQ49E$lambda$15$lambda$14(int i, Function1 function1, SnapshotState snapshotState, String changedText) {
        Intrinsics.checkNotNullParameter(changedText, "changedText");
        if (changedText.length() > i) {
            CryptoAddressTextInput_TtFQ49E$lambda$3(snapshotState, true);
        } else {
            function1.invoke(changedText);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoAddressTextInput_TtFQ49E$lambda$13$lambda$12(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, KeyboardActions2 KeyboardActions) {
        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
        focusRequester.freeFocus();
        if (softwareKeyboardController != null) {
            softwareKeyboardController.hide();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0174  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x0276  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x029b  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x029d  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02c1  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x040e  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0428  */
    /* JADX WARN: Removed duplicated region for block: B:176:0x044b  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x046f  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x047e  */
    /* JADX WARN: Removed duplicated region for block: B:190:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0104  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0123  */
    /* renamed from: CryptoAddressTextInputCondensed-IkByU14, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m25245CryptoAddressTextInputCondensedIkByU14(final String address, final int i, final long j, final Function1<? super String, Unit> onAddressChange, final Function0<Unit> showPasteLimitToast, Modifier modifier, String str, String str2, boolean z, Composer composer, final int i2, final int i3) {
        int i4;
        int i5;
        Modifier modifier2;
        int i6;
        String str3;
        int i7;
        String str4;
        int i8;
        int i9;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        final FocusRequester focusRequester;
        final SoftwareKeyboardController softwareKeyboardController;
        final String strStringResource;
        Object objRememberedValue3;
        ClipboardManager clipboardManager;
        int i10;
        Modifier modifier3;
        boolean z2;
        DefaultConstructorMarker defaultConstructorMarker;
        int i11;
        final SnapshotState snapshotState;
        boolean zChanged;
        Object objRememberedValue4;
        final ClipboardManager clipboardManager2;
        boolean z3;
        Object objRememberedValue5;
        Object objRememberedValue6;
        final String str5;
        Composer composer2;
        boolean zChanged2;
        Object objRememberedValue7;
        boolean z4;
        Continuation continuation;
        boolean z5;
        Object objRememberedValue8;
        final boolean z6;
        final String str6;
        final String str7;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(onAddressChange, "onAddressChange");
        Intrinsics.checkNotNullParameter(showPasteLimitToast, "showPasteLimitToast");
        Composer composerStartRestartGroup = composer.startRestartGroup(-202765910);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(address) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else {
            if ((i2 & 48) == 0) {
                i4 |= composerStartRestartGroup.changed(i) ? 32 : 16;
            }
            if ((i3 & 4) == 0) {
                i4 |= 384;
            } else {
                if ((i2 & 384) == 0) {
                    i4 |= composerStartRestartGroup.changed(j) ? 256 : 128;
                }
                if ((i3 & 8) != 0) {
                    i4 |= 3072;
                } else if ((i2 & 3072) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(onAddressChange) ? 2048 : 1024;
                }
                if ((i3 & 16) != 0) {
                    i4 |= 24576;
                } else if ((i2 & 24576) == 0) {
                    i4 |= composerStartRestartGroup.changedInstance(showPasteLimitToast) ? 16384 : 8192;
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                    i4 |= 196608;
                    modifier2 = modifier;
                } else {
                    modifier2 = modifier;
                    if ((i2 & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
                    }
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                    i4 |= 1572864;
                    str3 = str;
                } else {
                    str3 = str;
                    if ((i2 & 1572864) == 0) {
                        i4 |= composerStartRestartGroup.changed(str3) ? 1048576 : 524288;
                    }
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                    i4 |= 12582912;
                    str4 = str2;
                } else {
                    str4 = str2;
                    if ((i2 & 12582912) == 0) {
                        i4 |= composerStartRestartGroup.changed(str4) ? 8388608 : 4194304;
                    }
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                    if ((i2 & 100663296) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changed(z) ? 67108864 : 33554432;
                    }
                    if ((i4 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                        if (i5 != 0) {
                            modifier2 = Modifier.INSTANCE;
                        }
                        String str8 = i6 == 0 ? null : str3;
                        String str9 = i7 == 0 ? null : str4;
                        boolean z7 = i9 == 0 ? false : z;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-202765910, i4, -1, "com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputCondensed (CryptoAddressTextInput.kt:172)");
                        }
                        Object[] objArr = new Object[0];
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$19$lambda$18();
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final SnapshotIntState2 snapshotIntState2 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        focusRequester = (FocusRequester) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                        strStringResource = StringResources_androidKt.stringResource(C38572R.string.crypto_address_text_input_content_description, composerStartRestartGroup, 0);
                        Object systemService = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("clipboard");
                        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ClipboardManager clipboardManager3 = (ClipboardManager) systemService;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                            z2 = z7;
                            defaultConstructorMarker = null;
                            i11 = 1849434622;
                            clipboardManager = clipboardManager3;
                            i10 = i4;
                            modifier3 = modifier2;
                            objRememberedValue3 = SnapshotState3.mutableStateOf$default(new TextFieldValue(address, TextRange2.TextRange(address.length()), (TextRange) null, 4, (DefaultConstructorMarker) null), null, 2, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                        } else {
                            clipboardManager = clipboardManager3;
                            i10 = i4;
                            modifier3 = modifier2;
                            z2 = z7;
                            defaultConstructorMarker = null;
                            i11 = 1849434622;
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, defaultConstructorMarker), focusRequester);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(strStringResource);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged || objRememberedValue4 == companion.getEmpty()) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$27$lambda$26(strStringResource, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        final Modifier modifierSemantics$default = SemanticsModifier6.semantics$default(modifierFocusRequester, false, (Function1) objRememberedValue4, 1, defaultConstructorMarker);
                        composerStartRestartGroup.startReplaceGroup(-1584473081);
                        final BentoTextInput8.Icon.Size24 size24 = (clipboardManager.hasPrimaryClip() || !StringsKt.isBlank(address)) ? defaultConstructorMarker : new BentoTextInput8.Icon.Size24(ServerToBentoAssetMapper2.CLIPBOARD_24, StringResources_androidKt.stringResource(C38572R.string.saved_addresses_clipboard_icon_address_entry_content_description, composerStartRestartGroup, 0), null, 4, null);
                        composerStartRestartGroup.endReplaceGroup();
                        final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        clipboardManager2 = clipboardManager;
                        boolean zChangedInstance = composerStartRestartGroup.changedInstance(clipboardManager2);
                        int i12 = i10;
                        z3 = zChangedInstance | ((i12 & 112) != 32) | ((57344 & i12) != 16384) | ((i12 & 7168) != 2048);
                        objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                        if (!z3 || objRememberedValue5 == companion.getEmpty()) {
                            Function0 function0 = new Function0() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$30$lambda$29(clipboardManager2, i, showPasteLimitToast, onAddressChange, snapshotState);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(function0);
                            objRememberedValue5 = function0;
                        }
                        final Function0 function02 = (Function0) objRememberedValue5;
                        composerStartRestartGroup.endReplaceGroup();
                        composerStartRestartGroup.startReplaceGroup(i11);
                        objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue6 == companion.getEmpty()) {
                            objRememberedValue6 = InteractionSource2.MutableInteractionSource();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                        }
                        final InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue6;
                        composerStartRestartGroup.endReplaceGroup();
                        TextInputStyle.InputState inputState = !CryptoAddressTextInputCondensed_IkByU14$lambda$32(FocusInteraction3.collectIsFocusedAsState(interactionSource3, composerStartRestartGroup, 6)) ? TextInputStyle.InputState.Focused : TextInputStyle.InputState.Enabled;
                        float f = 0;
                        float f2 = 8;
                        final TextInputStyle.Style styleCopy$default = TextInputStyle.Style.copy$default(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getStandard(), null, new TextInputStyle.Spacing(new TextInputStyle.HorizontalPadding(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), defaultConstructorMarker), C2002Dp.m7995constructorimpl(10), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(4), C2002Dp.m7995constructorimpl(f2), null), TextInputStyle.Typography.copy$default(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getStandard().getTypography(), null, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextL(), null, null, null, 29, null), null, null, 25, null);
                        SelectionColors selectionColors = new SelectionColors(styleCopy$default.getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(styleCopy$default.getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                        final SnapshotState4<Color> snapshotState4 = styleCopy$default.getColors().getValueColor().get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
                        ProvidedValue<SelectionColors> providedValueProvides = TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors);
                        final TextInputStyle.InputState inputState2 = inputState;
                        final String str10 = str8;
                        final String str11 = str9;
                        Modifier modifier5 = modifier3;
                        Function2<Composer, Integer, Unit> function2 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: CryptoAddressTextInput.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1$1 */
                            static final class C386271 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ String $address;
                                final /* synthetic */ FocusRequester $focusRequester;
                                final /* synthetic */ TextInputStyle.InputState $inputState;
                                final /* synthetic */ InteractionSource3 $interactionSource;
                                final /* synthetic */ Modifier $internalModifier;
                                final /* synthetic */ SnapshotState<TextFieldValue> $internalTextField$delegate;
                                final /* synthetic */ SoftwareKeyboardController $keyboardController;
                                final /* synthetic */ String $label;
                                final /* synthetic */ int $maxLimit;
                                final /* synthetic */ Function1<String, Unit> $onAddressChange;
                                final /* synthetic */ Function0<Unit> $onTrailingIconClick;
                                final /* synthetic */ String $placeholder;
                                final /* synthetic */ SnapshotIntState2 $shakeKey$delegate;
                                final /* synthetic */ Function0<Unit> $showPasteLimitToast;
                                final /* synthetic */ boolean $singleLine;
                                final /* synthetic */ TextInputStyle.Style $style;
                                final /* synthetic */ BentoTextInput8.Icon.Size24 $trailingIcon;
                                final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventData;
                                final /* synthetic */ SnapshotState4<Color> $valueColor$delegate;
                                final /* synthetic */ long $visualTransformationColor;

                                /* JADX WARN: Multi-variable type inference failed */
                                C386271(Modifier modifier, TextInputStyle.Style style, SoftwareKeyboardController softwareKeyboardController, long j, int i, SnapshotIntState2 snapshotIntState2, Function0<Unit> function0, Function1<? super String, Unit> function1, boolean z, InteractionSource3 interactionSource3, SnapshotState<TextFieldValue> snapshotState, SnapshotState4<Color> snapshotState4, FocusRequester focusRequester, String str, TextInputStyle.InputState inputState, BentoTextInput8.Icon.Size24 size24, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0<Unit> function02, String str2, String str3) {
                                    this.$internalModifier = modifier;
                                    this.$style = style;
                                    this.$keyboardController = softwareKeyboardController;
                                    this.$visualTransformationColor = j;
                                    this.$maxLimit = i;
                                    this.$shakeKey$delegate = snapshotIntState2;
                                    this.$showPasteLimitToast = function0;
                                    this.$onAddressChange = function1;
                                    this.$singleLine = z;
                                    this.$interactionSource = interactionSource3;
                                    this.$internalTextField$delegate = snapshotState;
                                    this.$valueColor$delegate = snapshotState4;
                                    this.$focusRequester = focusRequester;
                                    this.$label = str;
                                    this.$inputState = inputState;
                                    this.$trailingIcon = size24;
                                    this.$userInteractionEventData = userInteractionEventDescriptor;
                                    this.$onTrailingIconClick = function02;
                                    this.$placeholder = str2;
                                    this.$address = str3;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1522735434, i, -1, "com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputCondensed.<anonymous>.<anonymous> (CryptoAddressTextInput.kt:258)");
                                    }
                                    TextFieldValue textFieldValueCryptoAddressTextInputCondensed_IkByU14$lambda$24 = CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$24(this.$internalTextField$delegate);
                                    Modifier modifierWithBentoPlaceholder$default = LocalShowPlaceholder.withBentoPlaceholder$default(this.$internalModifier, false, null, 3, null);
                                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(this.$style.getTypography().getValueTextStyle(), CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$33(this.$valueColor$delegate), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                    KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7767getNoneIUNYP9k(), Boolean.FALSE, KeyboardType.INSTANCE.m7783getPasswordPjHm6EE(), ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 112, null);
                                    composer.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer.changed(this.$keyboardController);
                                    final FocusRequester focusRequester = this.$focusRequester;
                                    final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b3: CONSTRUCTOR (r10v2 'objRememberedValue' java.lang.Object) = 
                                              (r8v1 'focusRequester' androidx.compose.ui.focus.FocusRequester A[DONT_INLINE])
                                              (r9v2 'softwareKeyboardController' androidx.compose.ui.platform.SoftwareKeyboardController A[DONT_INLINE])
                                             A[MD:(androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.platform.SoftwareKeyboardController):void (m)] (LINE:290) call: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.platform.SoftwareKeyboardController):void type: CONSTRUCTOR in method: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes6.dex
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                            	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                            	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                            	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                            	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                            	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                            	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                            	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                            	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                            	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                            	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                            	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:183)
                                            	at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
                                            	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                            	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:258)
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 25 more
                                            */
                                        /*
                                            Method dump skipped, instructions count: 409
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.p375ui.textinput.CryptoAddressTextInput4.C386271.invoke(androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$3$lambda$2(int i, Function0 function0, Function1 function1, SnapshotState snapshotState, SnapshotIntState2 snapshotIntState2, TextFieldValue newInternalTextField) {
                                        Intrinsics.checkNotNullParameter(newInternalTextField, "newInternalTextField");
                                        String text = CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$24(snapshotState).getText();
                                        String text2 = newInternalTextField.getText();
                                        if (text2.length() - text.length() == 1 && text2.length() > i) {
                                            snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + 1);
                                        } else if (text2.length() <= i) {
                                            snapshotState.setValue(newInternalTextField);
                                            function1.invoke(text2);
                                        } else {
                                            function0.invoke();
                                        }
                                        return Unit.INSTANCE;
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, KeyboardActions2 KeyboardActions) {
                                        Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
                                        focusRequester.freeFocus();
                                        if (softwareKeyboardController != null) {
                                            softwareKeyboardController.hide();
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(Composer composer3, int i13) {
                                    if ((i13 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(825064682, i13, -1, "com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputCondensed.<anonymous> (CryptoAddressTextInput.kt:256)");
                                    }
                                    AnimateShake.AnimateShake(null, snapshotIntState2.getIntValue(), ComposableLambda3.rememberComposableLambda(-1522735434, true, new C386271(modifierSemantics$default, styleCopy$default, softwareKeyboardController, j, i, snapshotIntState2, showPasteLimitToast, onAddressChange, false, interactionSource3, snapshotState, snapshotState4, focusRequester, str10, inputState2, size24, userInteractionEventDescriptor, function02, str11, address), composer3, 54), composer3, 384, 1);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            };
                            str5 = address;
                            composer2 = composerStartRestartGroup;
                            CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(825064682, true, function2, composer2, 54), composer2, ProvidedValue.$stable | 48);
                            Boolean boolValueOf = Boolean.valueOf(z2);
                            composer2.startReplaceGroup(-1746271574);
                            zChanged2 = ((i12 & 234881024) != 67108864) | composer2.changed(softwareKeyboardController);
                            objRememberedValue7 = composer2.rememberedValue();
                            if (!zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                                z4 = z2;
                                continuation = null;
                                objRememberedValue7 = new CryptoAddressTextInput5(z4, focusRequester, softwareKeyboardController, null);
                                composer2.updateRememberedValue(objRememberedValue7);
                            } else {
                                z4 = z2;
                                continuation = null;
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, (i12 >> 24) & 14);
                            composer2.startReplaceGroup(-1633490746);
                            int i13 = i12 & 14;
                            z5 = i13 == 4;
                            objRememberedValue8 = composer2.rememberedValue();
                            if (!z5 || objRememberedValue8 == companion.getEmpty()) {
                                objRememberedValue8 = new CryptoAddressTextInput6(str5, snapshotState, continuation);
                                composer2.updateRememberedValue(objRememberedValue8);
                            }
                            composer2.endReplaceGroup();
                            EffectsKt.LaunchedEffect(str5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, i13);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            z6 = z4;
                            str6 = str10;
                            str7 = str11;
                            modifier4 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            str5 = address;
                            z6 = z;
                            modifier4 = modifier2;
                            str6 = str3;
                            str7 = str4;
                            composer2 = composerStartRestartGroup;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$36(str5, i, j, onAddressChange, showPasteLimitToast, modifier4, str6, str7, z6, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i4 |= 100663296;
                    i9 = i8;
                    if ((i4 & 38347923) == 38347922) {
                        if (i5 != 0) {
                        }
                        if (i6 == 0) {
                        }
                        if (i7 == 0) {
                        }
                        if (i9 == 0) {
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
                        final SnapshotIntState2 snapshotIntState22 = (SnapshotIntState2) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        focusRequester = (FocusRequester) objRememberedValue2;
                        composerStartRestartGroup.endReplaceGroup();
                        softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
                        strStringResource = StringResources_androidKt.stringResource(C38572R.string.crypto_address_text_input_content_description, composerStartRestartGroup, 0);
                        Object systemService2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getSystemService("clipboard");
                        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.content.ClipboardManager");
                        ClipboardManager clipboardManager32 = (ClipboardManager) systemService2;
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue3 != companion.getEmpty()) {
                        }
                        snapshotState = (SnapshotState) objRememberedValue3;
                        composerStartRestartGroup.endReplaceGroup();
                        Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(SizeKt.fillMaxWidth$default(modifier3, 0.0f, 1, defaultConstructorMarker), focusRequester);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        zChanged = composerStartRestartGroup.changed(strStringResource);
                        objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                        if (!zChanged) {
                            objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda8
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$27$lambda$26(strStringResource, (SemanticsPropertyReceiver) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                            composerStartRestartGroup.endReplaceGroup();
                            final Modifier modifierSemantics$default2 = SemanticsModifier6.semantics$default(modifierFocusRequester2, false, (Function1) objRememberedValue4, 1, defaultConstructorMarker);
                            composerStartRestartGroup.startReplaceGroup(-1584473081);
                            if (clipboardManager.hasPrimaryClip()) {
                                composerStartRestartGroup.endReplaceGroup();
                                final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                clipboardManager2 = clipboardManager;
                                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(clipboardManager2);
                                int i122 = i10;
                                z3 = zChangedInstance2 | ((i122 & 112) != 32) | ((57344 & i122) != 16384) | ((i122 & 7168) != 2048);
                                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                if (!z3) {
                                    Function0 function03 = new Function0() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$$ExternalSyntheticLambda9
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$30$lambda$29(clipboardManager2, i, showPasteLimitToast, onAddressChange, snapshotState);
                                        }
                                    };
                                    composerStartRestartGroup.updateRememberedValue(function03);
                                    objRememberedValue5 = function03;
                                    final Function0<Unit> function022 = (Function0) objRememberedValue5;
                                    composerStartRestartGroup.endReplaceGroup();
                                    composerStartRestartGroup.startReplaceGroup(i11);
                                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                    if (objRememberedValue6 == companion.getEmpty()) {
                                    }
                                    final InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue6;
                                    composerStartRestartGroup.endReplaceGroup();
                                    if (!CryptoAddressTextInputCondensed_IkByU14$lambda$32(FocusInteraction3.collectIsFocusedAsState(interactionSource32, composerStartRestartGroup, 6))) {
                                    }
                                    float f3 = 0;
                                    float f22 = 8;
                                    final TextInputStyle.Style styleCopy$default2 = TextInputStyle.Style.copy$default(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getStandard(), null, new TextInputStyle.Spacing(new TextInputStyle.HorizontalPadding(C2002Dp.m7995constructorimpl(f3), C2002Dp.m7995constructorimpl(f3), defaultConstructorMarker), C2002Dp.m7995constructorimpl(10), C2002Dp.m7995constructorimpl(f22), C2002Dp.m7995constructorimpl(4), C2002Dp.m7995constructorimpl(f22), null), TextInputStyle.Typography.copy$default(((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getTextInput(composerStartRestartGroup, 0).getStandard().getTypography(), null, BentoTheme.INSTANCE.getTypography(composerStartRestartGroup, BentoTheme.$stable).getTextL(), null, null, null, 29, null), null, null, 25, null);
                                    SelectionColors selectionColors2 = new SelectionColors(styleCopy$default2.getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(styleCopy$default2.getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                                    final SnapshotState4<Color> snapshotState42 = styleCopy$default2.getColors().getValueColor().get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
                                    ProvidedValue<SelectionColors> providedValueProvides2 = TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors2);
                                    final TextInputStyle.InputState inputState22 = inputState;
                                    final String str102 = str8;
                                    final String str112 = str9;
                                    Modifier modifier52 = modifier3;
                                    Function2<Composer, Integer, Unit> function22 = new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1
                                        @Override // kotlin.jvm.functions.Function2
                                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                            invoke(composer3, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        /* compiled from: CryptoAddressTextInput.kt */
                                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                        @SourceDebugExtension
                                        /* renamed from: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1$1 */
                                        static final class C386271 implements Function2<Composer, Integer, Unit> {
                                            final /* synthetic */ String $address;
                                            final /* synthetic */ FocusRequester $focusRequester;
                                            final /* synthetic */ TextInputStyle.InputState $inputState;
                                            final /* synthetic */ InteractionSource3 $interactionSource;
                                            final /* synthetic */ Modifier $internalModifier;
                                            final /* synthetic */ SnapshotState<TextFieldValue> $internalTextField$delegate;
                                            final /* synthetic */ SoftwareKeyboardController $keyboardController;
                                            final /* synthetic */ String $label;
                                            final /* synthetic */ int $maxLimit;
                                            final /* synthetic */ Function1<String, Unit> $onAddressChange;
                                            final /* synthetic */ Function0<Unit> $onTrailingIconClick;
                                            final /* synthetic */ String $placeholder;
                                            final /* synthetic */ SnapshotIntState2 $shakeKey$delegate;
                                            final /* synthetic */ Function0<Unit> $showPasteLimitToast;
                                            final /* synthetic */ boolean $singleLine;
                                            final /* synthetic */ TextInputStyle.Style $style;
                                            final /* synthetic */ BentoTextInput8.Icon.Size24 $trailingIcon;
                                            final /* synthetic */ UserInteractionEventDescriptor $userInteractionEventData;
                                            final /* synthetic */ SnapshotState4<Color> $valueColor$delegate;
                                            final /* synthetic */ long $visualTransformationColor;

                                            /* JADX WARN: Multi-variable type inference failed */
                                            C386271(Modifier modifier, TextInputStyle.Style style, SoftwareKeyboardController softwareKeyboardController, long j, int i, SnapshotIntState2 snapshotIntState2, Function0<Unit> function0, Function1<? super String, Unit> function1, boolean z, InteractionSource3 interactionSource3, SnapshotState<TextFieldValue> snapshotState, SnapshotState4<Color> snapshotState4, FocusRequester focusRequester, String str, TextInputStyle.InputState inputState, BentoTextInput8.Icon.Size24 size24, UserInteractionEventDescriptor userInteractionEventDescriptor, Function0<Unit> function02, String str2, String str3) {
                                                this.$internalModifier = modifier;
                                                this.$style = style;
                                                this.$keyboardController = softwareKeyboardController;
                                                this.$visualTransformationColor = j;
                                                this.$maxLimit = i;
                                                this.$shakeKey$delegate = snapshotIntState2;
                                                this.$showPasteLimitToast = function0;
                                                this.$onAddressChange = function1;
                                                this.$singleLine = z;
                                                this.$interactionSource = interactionSource3;
                                                this.$internalTextField$delegate = snapshotState;
                                                this.$valueColor$delegate = snapshotState4;
                                                this.$focusRequester = focusRequester;
                                                this.$label = str;
                                                this.$inputState = inputState;
                                                this.$trailingIcon = size24;
                                                this.$userInteractionEventData = userInteractionEventDescriptor;
                                                this.$onTrailingIconClick = function02;
                                                this.$placeholder = str2;
                                                this.$address = str3;
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                                invoke(composer, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            /*  JADX ERROR: Method code generation error
                                                jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00b3: CONSTRUCTOR (r10v2 'objRememberedValue' java.lang.Object) = 
                                                  (r8v1 'focusRequester' androidx.compose.ui.focus.FocusRequester A[DONT_INLINE])
                                                  (r9v2 'softwareKeyboardController' androidx.compose.ui.platform.SoftwareKeyboardController A[DONT_INLINE])
                                                 A[MD:(androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.platform.SoftwareKeyboardController):void (m)] (LINE:290) call: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1$1$$ExternalSyntheticLambda0.<init>(androidx.compose.ui.focus.FocusRequester, androidx.compose.ui.platform.SoftwareKeyboardController):void type: CONSTRUCTOR in method: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes6.dex
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                                                	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                                                	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:298)
                                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:277)
                                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:410)
                                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                                Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputKt$CryptoAddressTextInputCondensed$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                                	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                                	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                                	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                                	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                                	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                                	... 20 more
                                                */
                                            public final void invoke(androidx.compose.runtime.Composer r39, int r40) {
                                                /*
                                                    Method dump skipped, instructions count: 409
                                                    To view this dump add '--comments-level debug' option
                                                */
                                                throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.crypto.p375ui.textinput.CryptoAddressTextInput4.C386271.invoke(androidx.compose.runtime.Composer, int):void");
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$3$lambda$2(int i, Function0 function0, Function1 function1, SnapshotState snapshotState, SnapshotIntState2 snapshotIntState2, TextFieldValue newInternalTextField) {
                                                Intrinsics.checkNotNullParameter(newInternalTextField, "newInternalTextField");
                                                String text = CryptoAddressTextInput2.CryptoAddressTextInputCondensed_IkByU14$lambda$24(snapshotState).getText();
                                                String text2 = newInternalTextField.getText();
                                                if (text2.length() - text.length() == 1 && text2.length() > i) {
                                                    snapshotIntState2.setIntValue(snapshotIntState2.getIntValue() + 1);
                                                } else if (text2.length() <= i) {
                                                    snapshotState.setValue(newInternalTextField);
                                                    function1.invoke(text2);
                                                } else {
                                                    function0.invoke();
                                                }
                                                return Unit.INSTANCE;
                                            }

                                            /* JADX INFO: Access modifiers changed from: private */
                                            public static final Unit invoke$lambda$1$lambda$0(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, KeyboardActions2 KeyboardActions) {
                                                Intrinsics.checkNotNullParameter(KeyboardActions, "$this$KeyboardActions");
                                                focusRequester.freeFocus();
                                                if (softwareKeyboardController != null) {
                                                    softwareKeyboardController.hide();
                                                }
                                                return Unit.INSTANCE;
                                            }
                                        }

                                        public final void invoke(Composer composer3, int i132) {
                                            if ((i132 & 3) == 2 && composer3.getSkipping()) {
                                                composer3.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(825064682, i132, -1, "com.robinhood.shared.crypto.ui.textinput.CryptoAddressTextInputCondensed.<anonymous> (CryptoAddressTextInput.kt:256)");
                                            }
                                            AnimateShake.AnimateShake(null, snapshotIntState22.getIntValue(), ComposableLambda3.rememberComposableLambda(-1522735434, true, new C386271(modifierSemantics$default2, styleCopy$default2, softwareKeyboardController, j, i, snapshotIntState22, showPasteLimitToast, onAddressChange, false, interactionSource32, snapshotState, snapshotState42, focusRequester, str102, inputState22, size24, userInteractionEventDescriptor2, function022, str112, address), composer3, 54), composer3, 384, 1);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    };
                                    str5 = address;
                                    composer2 = composerStartRestartGroup;
                                    CompositionLocal3.CompositionLocalProvider(providedValueProvides2, ComposableLambda3.rememberComposableLambda(825064682, true, function22, composer2, 54), composer2, ProvidedValue.$stable | 48);
                                    Boolean boolValueOf2 = Boolean.valueOf(z2);
                                    composer2.startReplaceGroup(-1746271574);
                                    zChanged2 = ((i122 & 234881024) != 67108864) | composer2.changed(softwareKeyboardController);
                                    objRememberedValue7 = composer2.rememberedValue();
                                    if (zChanged2) {
                                        z4 = z2;
                                        continuation = null;
                                        objRememberedValue7 = new CryptoAddressTextInput5(z4, focusRequester, softwareKeyboardController, null);
                                        composer2.updateRememberedValue(objRememberedValue7);
                                        composer2.endReplaceGroup();
                                        EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue7, composer2, (i122 >> 24) & 14);
                                        composer2.startReplaceGroup(-1633490746);
                                        int i132 = i122 & 14;
                                        if (i132 == 4) {
                                        }
                                        objRememberedValue8 = composer2.rememberedValue();
                                        if (!z5) {
                                            objRememberedValue8 = new CryptoAddressTextInput6(str5, snapshotState, continuation);
                                            composer2.updateRememberedValue(objRememberedValue8);
                                            composer2.endReplaceGroup();
                                            EffectsKt.LaunchedEffect(str5, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue8, composer2, i132);
                                            if (ComposerKt.isTraceInProgress()) {
                                            }
                                            z6 = z4;
                                            str6 = str102;
                                            str7 = str112;
                                            modifier4 = modifier52;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                if ((i3 & 8) != 0) {
                }
                if ((i3 & 16) != 0) {
                }
                i5 = i3 & 32;
                if (i5 != 0) {
                }
                i6 = i3 & 64;
                if (i6 != 0) {
                }
                i7 = i3 & 128;
                if (i7 != 0) {
                }
                i8 = i3 & 256;
                if (i8 == 0) {
                }
                i9 = i8;
                if ((i4 & 38347923) == 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 4) == 0) {
            }
            if ((i3 & 8) != 0) {
            }
            if ((i3 & 16) != 0) {
            }
            i5 = i3 & 32;
            if (i5 != 0) {
            }
            i6 = i3 & 64;
            if (i6 != 0) {
            }
            i7 = i3 & 128;
            if (i7 != 0) {
            }
            i8 = i3 & 256;
            if (i8 == 0) {
            }
            i9 = i8;
            if ((i4 & 38347923) == 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final SnapshotIntState2 CryptoAddressTextInputCondensed_IkByU14$lambda$19$lambda$18() {
            return SnapshotIntState3.mutableIntStateOf(0);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit CryptoAddressTextInputCondensed_IkByU14$lambda$27$lambda$26(String str, SemanticsPropertyReceiver semantics) {
            Intrinsics.checkNotNullParameter(semantics, "$this$semantics");
            SemanticsPropertiesKt.setContentDescription(semantics, str);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit CryptoAddressTextInputCondensed_IkByU14$lambda$30$lambda$29(ClipboardManager clipboardManager, int i, Function0 function0, Function1 function1, SnapshotState snapshotState) {
            ClipData.Item itemAt;
            CharSequence text;
            ClipData primaryClip = clipboardManager.getPrimaryClip();
            if (primaryClip != null && (itemAt = primaryClip.getItemAt(0)) != null && (text = itemAt.getText()) != null) {
                String string2 = text.toString();
                if (string2.length() <= i) {
                    snapshotState.setValue(new TextFieldValue(string2, TextRange2.TextRange(string2.length()), (TextRange) null, 4, (DefaultConstructorMarker) null));
                    function1.invoke(string2);
                } else {
                    function0.invoke();
                }
            }
            return Unit.INSTANCE;
        }
    }
