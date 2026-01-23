package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import android.os.Parcelable;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
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
import com.robinhood.models.serverdriven.experimental.api.TextInput;
import com.robinhood.models.serverdriven.experimental.api.TextInputSize;
import com.robinhood.models.serverdriven.experimental.api.TextInputState;
import com.robinhood.models.serverdriven.experimental.api.TextInputValidators;
import com.robinhood.utils.compose.focus.Focusable6;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;

/* compiled from: SduiTextInput.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u001a/\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t²\u0006\n\u0010\n\u001a\u00020\u000bX\u008a\u008e\u0002²\u0006\f\u0010\f\u001a\u0004\u0018\u00010\rX\u008a\u008e\u0002²\u0006\n\u0010\u000e\u001a\u00020\u000fX\u008a\u008e\u0002²\u0006\n\u0010\u0010\u001a\u00020\u000fX\u008a\u008e\u0002"}, m3636d2 = {"SduiTextInput", "", "ActionT", "Landroid/os/Parcelable;", "component", "Lcom/robinhood/models/serverdriven/experimental/api/TextInput;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/models/serverdriven/experimental/api/TextInput;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "lib-sdui_externalRelease", "text", "", "message", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "visited", "", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt, reason: use source file name */
/* loaded from: classes17.dex */
public final class SduiTextInput2 {

    /* compiled from: SduiTextInput.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[TextInputSize.values().length];
            try {
                iArr[TextInputSize.HERO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TextInputSize.REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$34(TextInput textInput, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTextInput(textInput, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x028b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x02d1  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x02e3  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03aa  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x03b4  */
    /* JADX WARN: Removed duplicated region for block: B:145:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <ActionT extends Parcelable> void SduiTextInput(final TextInput<? extends ActionT> component, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
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
        NonEmptyValidator non_empty_validator;
        Composer.Companion companion2;
        final LengthValidator min_length_validator;
        final LengthValidator max_length_validator;
        List<RegexValidator> regex_validators;
        boolean zChanged;
        Object objRememberedValue5;
        boolean zChanged2;
        Object objRememberedValue6;
        int i4;
        SnapshotState snapshotState5;
        LinkedHashMap linkedHashMap;
        Composer composer2;
        boolean zChanged3;
        Object objRememberedValue7;
        Modifier modifier4;
        Iterator it;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-2045596307);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = i | (composerStartRestartGroup.changedInstance(component) ? 4 : 2);
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2045596307, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInput (SduiTextInput.kt:24)");
                }
                FocusRequester focusRequester = (FocusRequester) composerStartRestartGroup.consume(Focusable6.getLocalFocusRequester());
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
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                TextInputValidators validators = component.getValidators();
                non_empty_validator = validators == null ? validators.getNon_empty_validator() : null;
                composerStartRestartGroup.startReplaceGroup(1276993872);
                if (non_empty_validator != null) {
                    companion2 = companion;
                } else {
                    String state_id = non_empty_validator.getState_id();
                    String error_message = non_empty_validator.getError_message();
                    SduiStateHandler4 validationType = SduiStateHandler2.toValidationType(non_empty_validator.getValidation_type());
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                    companion2 = companion;
                    if (objRememberedValue8 == companion2.getEmpty()) {
                        objRememberedValue8 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SduiTextInput2.SduiTextInput$lambda$14$lambda$13$lambda$12(snapshotState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    linkedHashMap2.put(state_id, new Validator(error_message, validationType, (Function0) objRememberedValue8));
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                TextInputValidators validators2 = component.getValidators();
                min_length_validator = validators2 == null ? validators2.getMin_length_validator() : null;
                composerStartRestartGroup.startReplaceGroup(1277002711);
                if (min_length_validator != null) {
                    String state_id2 = min_length_validator.getState_id();
                    String error_message2 = min_length_validator.getError_message();
                    SduiStateHandler4 validationType2 = SduiStateHandler2.toValidationType(min_length_validator.getValidation_type());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(min_length_validator);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue9 == companion2.getEmpty()) {
                        objRememberedValue9 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SduiTextInput2.SduiTextInput$lambda$17$lambda$16$lambda$15(min_length_validator, snapshotState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue9);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    linkedHashMap2.put(state_id2, new Validator(error_message2, validationType2, (Function0) objRememberedValue9));
                    Unit unit2 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                TextInputValidators validators3 = component.getValidators();
                max_length_validator = validators3 == null ? validators3.getMax_length_validator() : null;
                composerStartRestartGroup.startReplaceGroup(1277011767);
                if (max_length_validator != null) {
                    String state_id3 = max_length_validator.getState_id();
                    String error_message3 = max_length_validator.getError_message();
                    SduiStateHandler4 validationType3 = SduiStateHandler2.toValidationType(max_length_validator.getValidation_type());
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(max_length_validator);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue10 == companion2.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SduiTextInput2.SduiTextInput$lambda$20$lambda$19$lambda$18(max_length_validator, snapshotState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    linkedHashMap2.put(state_id3, new Validator(error_message3, validationType3, (Function0) objRememberedValue10));
                    Unit unit3 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                TextInputValidators validators4 = component.getValidators();
                regex_validators = validators4 == null ? validators4.getRegex_validators() : null;
                composerStartRestartGroup.startReplaceGroup(1277020707);
                if (regex_validators != null) {
                    Iterator it2 = regex_validators.iterator();
                    while (it2.hasNext()) {
                        final RegexValidator regexValidator = (RegexValidator) it2.next();
                        String state_id4 = regexValidator.getState_id();
                        String error_message4 = regexValidator.getError_message();
                        SduiStateHandler4 validationType4 = SduiStateHandler2.toValidationType(regexValidator.getValidation_type());
                        composerStartRestartGroup.startReplaceGroup(-1633490746);
                        boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(regexValidator);
                        Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                        if (zChangedInstance3) {
                            it = it2;
                        } else {
                            it = it2;
                            if (objRememberedValue11 == Composer.INSTANCE.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            linkedHashMap2.put(state_id4, new Validator(error_message4, validationType4, (Function0) objRememberedValue11));
                            it2 = it;
                        }
                        objRememberedValue11 = new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(SduiTextInput2.SduiTextInput$lambda$23$lambda$22$lambda$21(regexValidator, snapshotState));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                        composerStartRestartGroup.endReplaceGroup();
                        linkedHashMap2.put(state_id4, new Validator(error_message4, validationType4, (Function0) objRememberedValue11));
                        it2 = it;
                    }
                    Unit unit4 = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda6
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInput2.SduiTextInput$lambda$25$lambda$24(sduiStateHandler3, component, snapshotState, snapshotState3, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                Function1 function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(modifier3, focusRequester);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInput2.SduiTextInput$lambda$27$lambda$26(sduiStateHandler3, component, snapshotState4, snapshotState3, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue6);
                String label = component.getHide_label() ? component.getLabel() : null;
                i4 = WhenMappings.$EnumSwitchMapping$0[component.getSize().ordinal()];
                if (i4 != 1) {
                    snapshotState5 = snapshotState;
                    linkedHashMap = linkedHashMap2;
                    composerStartRestartGroup.startReplaceGroup(933834201);
                    BentoTextInput4.BentoHeroTextInput(SduiTextInput$lambda$1(snapshotState5), function1, modifierOnFocusChanged, label, component.getPlaceholder_text(), null, null, SduiTextInput$lambda$4(snapshotState2), null, null, null, null, component.is_enabled(), false, composerStartRestartGroup, BentoTextInput8.Message.$stable << 21, 0, 12128);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                    Unit unit5 = Unit.INSTANCE;
                } else {
                    if (i4 != 2) {
                        composerStartRestartGroup.startReplaceGroup(1277048384);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(934214013);
                    snapshotState5 = snapshotState;
                    linkedHashMap = linkedHashMap2;
                    BentoTextInput4.BentoTextInput(SduiTextInput$lambda$1(snapshotState5), function1, modifierOnFocusChanged, label, component.getPlaceholder_text(), null, SduiTextInput$lambda$4(snapshotState2), null, null, null, null, null, null, component.is_enabled(), false, composerStartRestartGroup, BentoTextInput8.Message.$stable << 18, 0, 24480);
                    composerStartRestartGroup.endReplaceGroup();
                    Unit unit6 = Unit.INSTANCE;
                    composer2 = composerStartRestartGroup;
                }
                Unit unit7 = Unit.INSTANCE;
                composer2.startReplaceGroup(-1224400529);
                zChanged3 = composer2.changed(sduiStateHandler3) | composer2.changedInstance(component) | composer2.changedInstance(linkedHashMap);
                objRememberedValue7 = composer2.rememberedValue();
                if (!zChanged3 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                    final SnapshotState snapshotState6 = snapshotState5;
                    final LinkedHashMap linkedHashMap3 = linkedHashMap;
                    modifier4 = modifier3;
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInput2.SduiTextInput$lambda$33$lambda$32(sduiStateHandler3, component, linkedHashMap3, snapshotState6, snapshotState2, snapshotState4, (DisposableEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(function12);
                    objRememberedValue7 = function12;
                } else {
                    modifier4 = modifier3;
                }
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(unit7, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiTextInput2.SduiTextInput$lambda$34(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            FocusRequester focusRequester2 = (FocusRequester) composerStartRestartGroup.consume(Focusable6.getLocalFocusRequester());
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
            LinkedHashMap linkedHashMap22 = new LinkedHashMap();
            TextInputValidators validators5 = component.getValidators();
            if (validators5 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1276993872);
            if (non_empty_validator != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            TextInputValidators validators22 = component.getValidators();
            if (validators22 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1277002711);
            if (min_length_validator != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            TextInputValidators validators32 = component.getValidators();
            if (validators32 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1277011767);
            if (max_length_validator != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            TextInputValidators validators42 = component.getValidators();
            if (validators42 == null) {
            }
            composerStartRestartGroup.startReplaceGroup(1277020707);
            if (regex_validators != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChanged = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!zChanged) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiTextInput2.SduiTextInput$lambda$25$lambda$24(sduiStateHandler3, component, snapshotState, snapshotState3, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                Function1 function13 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(modifier3, focusRequester2);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged2 = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged2) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInput2.SduiTextInput$lambda$27$lambda$26(sduiStateHandler3, component, snapshotState4, snapshotState3, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    composerStartRestartGroup.endReplaceGroup();
                    Modifier modifierOnFocusChanged2 = FocusChangedModifier2.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue6);
                    if (component.getHide_label()) {
                    }
                    i4 = WhenMappings.$EnumSwitchMapping$0[component.getSize().ordinal()];
                    if (i4 != 1) {
                    }
                    Unit unit72 = Unit.INSTANCE;
                    composer2.startReplaceGroup(-1224400529);
                    zChanged3 = composer2.changed(sduiStateHandler3) | composer2.changedInstance(component) | composer2.changedInstance(linkedHashMap);
                    objRememberedValue7 = composer2.rememberedValue();
                    if (zChanged3) {
                        final SnapshotState snapshotState62 = snapshotState5;
                        final Map linkedHashMap32 = linkedHashMap;
                        modifier4 = modifier3;
                        Function1 function122 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return SduiTextInput2.SduiTextInput$lambda$33$lambda$32(sduiStateHandler3, component, linkedHashMap32, snapshotState62, snapshotState2, snapshotState4, (DisposableEffectScope) obj);
                            }
                        };
                        composer2.updateRememberedValue(function122);
                        objRememberedValue7 = function122;
                        composer2.endReplaceGroup();
                        EffectsKt.DisposableEffect(unit72, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void SduiTextInput$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void SduiTextInput$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextInput$lambda$14$lambda$13$lambda$12(SnapshotState snapshotState) {
        return SduiTextInput$lambda$1(snapshotState).length() > 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextInput$lambda$17$lambda$16$lambda$15(LengthValidator lengthValidator, SnapshotState snapshotState) {
        return SduiTextInput$lambda$1(snapshotState).length() >= lengthValidator.getLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextInput$lambda$20$lambda$19$lambda$18(LengthValidator lengthValidator, SnapshotState snapshotState) {
        return SduiTextInput$lambda$1(snapshotState).length() <= lengthValidator.getLength();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean SduiTextInput$lambda$23$lambda$22$lambda$21(RegexValidator regexValidator, SnapshotState snapshotState) {
        return new Regex(regexValidator.getRegex()).matches(SduiTextInput$lambda$1(snapshotState));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$25$lambda$24(SduiStateHandler3 sduiStateHandler3, TextInput textInput, SnapshotState snapshotState, SnapshotState snapshotState2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        snapshotState.setValue(value);
        SduiStateHandler3.validateComponent$default(sduiStateHandler3, textInput.getIdentifier(), false, 2, null);
        sduiStateHandler3.setState(textInput.getIdentifier(), new TextInputState(SduiTextInput$lambda$1(snapshotState)));
        SduiTextInput$lambda$8(snapshotState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$27$lambda$26(SduiStateHandler3 sduiStateHandler3, TextInput textInput, SnapshotState snapshotState, SnapshotState snapshotState2, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SduiTextInput$lambda$11(snapshotState, it.isFocused());
        if (!SduiTextInput$lambda$10(snapshotState) && SduiTextInput$lambda$7(snapshotState2)) {
            SduiStateHandler3.validateComponent$default(sduiStateHandler3, textInput.getIdentifier(), false, 2, null);
        }
        return Unit.INSTANCE;
    }

    private static final String SduiTextInput$lambda$1(SnapshotState<String> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SduiTextInput$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final BentoTextInput8.Message SduiTextInput$lambda$4(SnapshotState<BentoTextInput8.Message> snapshotState) {
        return snapshotState.getValue();
    }

    private static final boolean SduiTextInput$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DisposableEffectResult SduiTextInput$lambda$33$lambda$32(final SduiStateHandler3 sduiStateHandler3, final TextInput textInput, Map map, SnapshotState snapshotState, final SnapshotState snapshotState2, final SnapshotState snapshotState3, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        sduiStateHandler3.register(textInput.getIdentifier(), new TextInputState(SduiTextInput$lambda$1(snapshotState)), new ComponentValidation(map, new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SduiTextInput2.SduiTextInput$lambda$33$lambda$32$lambda$29(snapshotState2);
            }
        }, new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SduiTextInput2.SduiTextInput$lambda$33$lambda$32$lambda$30(snapshotState3, snapshotState2, (Validator) obj, ((Boolean) obj2).booleanValue());
            }
        }));
        return new DisposableEffectResult() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputKt$SduiTextInput$lambda$33$lambda$32$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                sduiStateHandler3.remove(textInput.getIdentifier());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$33$lambda$32$lambda$29(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$33$lambda$32$lambda$30(SnapshotState snapshotState, SnapshotState snapshotState2, Validator validator, boolean z) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        if (validator.getValidationType() != SduiStateHandler4.Delayed || !SduiTextInput$lambda$10(snapshotState) || z) {
            snapshotState2.setValue(new BentoTextInput8.Message.Error(validator.getErrorMessage()));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
