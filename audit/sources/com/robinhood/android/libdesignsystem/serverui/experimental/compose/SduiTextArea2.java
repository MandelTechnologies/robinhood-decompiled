package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.models.serverdriven.experimental.api.LengthValidator;
import com.robinhood.models.serverdriven.experimental.api.NonEmptyValidator;
import com.robinhood.models.serverdriven.experimental.api.RegexValidator;
import com.robinhood.models.serverdriven.experimental.api.TextArea;
import com.robinhood.models.serverdriven.experimental.api.TextAreaState;
import com.robinhood.models.serverdriven.experimental.api.TextAreaValidators;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: SduiTextArea.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"SduiTextArea", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/TextArea;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/TextArea;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "text", "", "message", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "visited", "", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTextArea2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextArea$lambda$34(TextArea textArea, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTextArea(textArea, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:110:0x0286  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x02cf  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x034c  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0108  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiTextArea(final TextArea<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Modifier modifier3;
        final SduiStateHandler3 sduiStateHandler3;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        Object objRememberedValue2;
        final SnapshotState snapshotState2;
        Object objRememberedValue3;
        final SnapshotState snapshotState3;
        Object objRememberedValue4;
        final SnapshotState snapshotState4;
        final LinkedHashMap linkedHashMap;
        NonEmptyValidator non_empty_validator;
        final LengthValidator min_length_validator;
        Composer.Companion companion2;
        final LengthValidator max_length_validator;
        List<RegexValidator> regex_validators;
        boolean zChanged;
        Object objRememberedValue5;
        boolean zChanged2;
        Object objRememberedValue6;
        Composer composer2;
        boolean zChanged3;
        Object obj;
        final Modifier modifier4;
        Iterator it;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1837855180);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1837855180, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextArea (SduiTextArea.kt:20)");
                }
                sduiStateHandler3 = (SduiStateHandler3) composerStartRestartGroup.consume(SduiStateHandler2.getLocalStateHandler());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(component.getState().getText(), null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                snapshotState2 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                snapshotState3 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                snapshotState4 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                linkedHashMap = new LinkedHashMap();
                TextAreaValidators validators = component.getValidators();
                non_empty_validator = validators == null ? validators.getNon_empty_validator() : null;
                composerStartRestartGroup.startReplaceGroup(-947247753);
                if (non_empty_validator == null) {
                    String state_id = non_empty_validator.getState_id();
                    String error_message = non_empty_validator.getError_message();
                    SduiStateHandler4 validationType = SduiStateHandler2.toValidationType(non_empty_validator.getValidation_type());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SduiTextArea2.SduiTextArea$lambda$14$lambda$13$lambda$12(snapshotState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    linkedHashMap.put(state_id, new Validator(error_message, validationType, (Function0) objRememberedValue7));
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                TextAreaValidators validators2 = component.getValidators();
                min_length_validator = validators2 == null ? validators2.getMin_length_validator() : null;
                composerStartRestartGroup.startReplaceGroup(-947238914);
                if (min_length_validator != null) {
                    companion2 = companion;
                } else {
                    String state_id2 = min_length_validator.getState_id();
                    String error_message2 = min_length_validator.getError_message();
                    SduiStateHandler4 validationType2 = SduiStateHandler2.toValidationType(min_length_validator.getValidation_type());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(min_length_validator);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance) {
                        companion2 = companion;
                    } else {
                        companion2 = companion;
                        if (objRememberedValue8 == companion2.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        linkedHashMap.put(state_id2, new Validator(error_message2, validationType2, (Function0) objRememberedValue8));
                        Unit unit2 = Unit.INSTANCE;
                    }
                    objRememberedValue8 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(SduiTextArea2.SduiTextArea$lambda$17$lambda$16$lambda$15(min_length_validator, snapshotState));
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    composerStartRestartGroup.endReplaceGroup();
                    linkedHashMap.put(state_id2, new Validator(error_message2, validationType2, (Function0) objRememberedValue8));
                    Unit unit22 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                TextAreaValidators validators3 = component.getValidators();
                max_length_validator = validators3 == null ? validators3.getMax_length_validator() : null;
                composerStartRestartGroup.startReplaceGroup(-947229858);
                if (max_length_validator != null) {
                    String state_id3 = max_length_validator.getState_id();
                    String error_message3 = max_length_validator.getError_message();
                    SduiStateHandler4 validationType3 = SduiStateHandler2.toValidationType(max_length_validator.getValidation_type());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(max_length_validator);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue9 == companion2.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SduiTextArea2.SduiTextArea$lambda$20$lambda$19$lambda$18(max_length_validator, snapshotState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    linkedHashMap.put(state_id3, new Validator(error_message3, validationType3, (Function0) objRememberedValue9));
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                TextAreaValidators validators4 = component.getValidators();
                regex_validators = validators4 == null ? validators4.getRegex_validators() : null;
                composerStartRestartGroup.startReplaceGroup(-947220918);
                if (regex_validators != null) {
                    Iterator it2 = regex_validators.iterator();
                    while (it2.hasNext()) {
                        final RegexValidator regexValidator = (RegexValidator) it2.next();
                        String state_id4 = regexValidator.getState_id();
                        String error_message4 = regexValidator.getError_message();
                        SduiStateHandler4 validationType4 = SduiStateHandler2.toValidationType(regexValidator.getValidation_type());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(regexValidator);
                        Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3) {
                            it = it2;
                        } else {
                            it = it2;
                            if (objRememberedValue10 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            linkedHashMap.put(state_id4, new Validator(error_message4, validationType4, (Function0) objRememberedValue10));
                            it2 = it;
                        }
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SduiTextArea2.SduiTextArea$lambda$23$lambda$22$lambda$21(regexValidator, snapshotState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                        composerStartRestartGroup.endReplaceGroup();
                        linkedHashMap.put(state_id4, new Validator(error_message4, validationType4, (Function0) objRememberedValue10));
                        it2 = it;
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiTextArea2.SduiTextArea$lambda$25$lambda$24(sduiStateHandler3, component, snapshotState, snapshotState3, (String) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiTextArea2.SduiTextArea$lambda$27$lambda$26(sduiStateHandler3, component, snapshotState4, snapshotState3, (FocusState) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifier3, (Function1) objRememberedValue6);
                String strSduiTextArea$lambda$1 = SduiTextArea$lambda$1(snapshotState);
                String label = component.getLabel();
                if (component.getHide_label()) {
                    label = null;
                }
                BentoTextInput4.BentoTextArea(strSduiTextArea$lambda$1, function1, modifierOnFocusChanged, label, component.getPlaceholder_text(), null, SduiTextArea$lambda$4(snapshotState2), null, null, null, component.is_enabled(), false, null, composerStartRestartGroup, BentoTextInput8.Message.$stable << 18, 0, 7072);
                composer2 = composerStartRestartGroup;
                Unit unit5 = Unit.INSTANCE;
                composer2.startReplaceGroup(-1224400529);
                zChanged3 = composer2.changed(sduiStateHandler3) | composer2.changedInstance(component) | composer2.changedInstance(linkedHashMap);
                Object objRememberedValue11 = composer2.rememberedValue();
                if (!zChanged3 || objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                    modifier4 = modifier3;
                    obj = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiTextArea2.SduiTextArea$lambda$33$lambda$32(sduiStateHandler3, component, linkedHashMap, snapshotState, snapshotState2, snapshotState4, (DisposableEffectScope) obj2);
                        }
                    };
                    composer2.updateRememberedValue(obj);
                } else {
                    obj = objRememberedValue11;
                    modifier4 = modifier3;
                }
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(unit5, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return SduiTextArea2.SduiTextArea$lambda$34(component, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            sduiStateHandler3 = (SduiStateHandler3) composerStartRestartGroup.consume(SduiStateHandler2.getLocalStateHandler());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            snapshotState3 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            snapshotState4 = (SnapshotState) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            linkedHashMap = new LinkedHashMap();
            TextAreaValidators validators5 = component.getValidators();
            if (validators5 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-947247753);
            if (non_empty_validator == null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            TextAreaValidators validators22 = component.getValidators();
            if (validators22 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-947238914);
            if (min_length_validator != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            TextAreaValidators validators32 = component.getValidators();
            if (validators32 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-947229858);
            if (max_length_validator != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            TextAreaValidators validators42 = component.getValidators();
            if (validators42 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(-947220918);
            if (regex_validators != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChanged = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return SduiTextArea2.SduiTextArea$lambda$25$lambda$24(sduiStateHandler3, component, snapshotState, snapshotState3, (String) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                Function1 function12 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj2) {
                            return SduiTextArea2.SduiTextArea$lambda$27$lambda$26(sduiStateHandler3, component, snapshotState4, snapshotState3, (FocusState) obj2);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifier3, (Function1) objRememberedValue6);
                    String strSduiTextArea$lambda$12 = SduiTextArea$lambda$1(snapshotState);
                    String label2 = component.getLabel();
                    if (component.getHide_label()) {
                    }
                    BentoTextInput4.BentoTextArea(strSduiTextArea$lambda$12, function12, modifierOnFocusChanged2, label2, component.getPlaceholder_text(), null, SduiTextArea$lambda$4(snapshotState2), null, null, null, component.is_enabled(), false, null, composerStartRestartGroup, BentoTextInput8.Message.$stable << 18, 0, 7072);
                    composer2 = composerStartRestartGroup;
                    Unit unit52 = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1224400529);
                    zChanged3 = composer2.changed(sduiStateHandler3) | composer2.changedInstance(component) | composer2.changedInstance(linkedHashMap);
                    Object objRememberedValue112 = composer2.rememberedValue();
                    if (zChanged3) {
                        modifier4 = modifier3;
                        obj = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return SduiTextArea2.SduiTextArea$lambda$33$lambda$32(sduiStateHandler3, component, linkedHashMap, snapshotState, snapshotState2, snapshotState4, (DisposableEffectScope) obj2);
                            }
                        };
                        composer2.updateRememberedValue(obj);
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(unit52, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) obj, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiTextArea$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void SduiTextArea$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextArea$lambda$14$lambda$13$lambda$12(SnapshotState snapshotState) {
        return SduiTextArea$lambda$1(snapshotState).length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextArea$lambda$17$lambda$16$lambda$15(LengthValidator lengthValidator, SnapshotState snapshotState) {
        return SduiTextArea$lambda$1(snapshotState).length() >= lengthValidator.getLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextArea$lambda$20$lambda$19$lambda$18(LengthValidator lengthValidator, SnapshotState snapshotState) {
        return SduiTextArea$lambda$1(snapshotState).length() <= lengthValidator.getLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextArea$lambda$23$lambda$22$lambda$21(RegexValidator regexValidator, SnapshotState snapshotState) {
        return new Regex(regexValidator.getRegex()).matches(SduiTextArea$lambda$1(snapshotState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextArea$lambda$25$lambda$24(SduiStateHandler3 sduiStateHandler3, TextArea textArea, SnapshotState snapshotState, SnapshotState snapshotState2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        snapshotState.setValue(value);
        SduiStateHandler3.validateComponent$default(sduiStateHandler3, textArea.getIdentifier(), false, 2, null);
        sduiStateHandler3.setState(textArea.getIdentifier(), new TextAreaState(value));
        SduiTextArea$lambda$8(snapshotState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextArea$lambda$27$lambda$26(SduiStateHandler3 sduiStateHandler3, TextArea textArea, SnapshotState snapshotState, SnapshotState snapshotState2, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SduiTextArea$lambda$11(snapshotState, it.isFocused());
        if (!SduiTextArea$lambda$10(snapshotState) && SduiTextArea$lambda$7(snapshotState2)) {
            SduiStateHandler3.validateComponent$default(sduiStateHandler3, textArea.getIdentifier(), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    private static final String SduiTextArea$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SduiTextArea$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SduiTextArea$lambda$33$lambda$32(final SduiStateHandler3 sduiStateHandler3, final TextArea textArea, Map map, SnapshotState snapshotState, final SnapshotState snapshotState2, final SnapshotState snapshotState3, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        sduiStateHandler3.register(textArea.getIdentifier(), new TextAreaState(SduiTextArea$lambda$1(snapshotState)), new ComponentValidation(map, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SduiTextArea2.SduiTextArea$lambda$33$lambda$32$lambda$29(snapshotState2);
            }
        }, new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SduiTextArea2.SduiTextArea$lambda$33$lambda$32$lambda$30(snapshotState3, snapshotState2, (Validator) obj, ((Boolean) obj2).booleanValue());
            }
        }));
        return new DisposableEffectResult() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextAreaKt$SduiTextArea$lambda$33$lambda$32$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                sduiStateHandler3.remove(textArea.getIdentifier());
            }
        };
    }

    private static final BentoTextInput8.Message SduiTextArea$lambda$4(SnapshotState<BentoTextInput8.Message> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SduiTextArea$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextArea$lambda$33$lambda$32$lambda$29(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextArea$lambda$33$lambda$32$lambda$30(SnapshotState snapshotState, SnapshotState snapshotState2, Validator validator, boolean z) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        if (validator.getValidationType() == SduiStateHandler4.Delayed && SduiTextArea$lambda$10(snapshotState) && !z) {
            return Unit.INSTANCE;
        }
        snapshotState2.setValue(new BentoTextInput8.Message.Error(validator.getErrorMessage()));
        return Unit.INSTANCE;
    }
}
