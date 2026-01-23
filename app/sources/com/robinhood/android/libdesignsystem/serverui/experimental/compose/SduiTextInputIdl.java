package com.robinhood.android.libdesignsystem.serverui.experimental.compose;

import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.text.input.KeyboardType;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.IconKt;
import com.robinhood.compose.bento.component.BentoTextInput4;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.common.visualtransformation.CurrencyVisualTransformation;
import com.robinhood.compose.common.visualtransformation.PlaceholderVisualTransformation;
import com.robinhood.models.serverdriven.experimental.api.TextInputState;
import com.robinhood.utils.compose.focus.Focusable6;
import java.util.Currency;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import rh_server_driven_ui.p531v1.IconDto;
import rh_server_driven_ui.p531v1.TextInputDto;

/* compiled from: SduiTextInputIdl.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005H\u0001¢\u0006\u0002\u0010\u0006\u001a\u0016\u0010\u0007\u001a\u00020\b*\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0001\u001a\u000e\u0010\f\u001a\u00020\r*\u0004\u0018\u00010\u000bH\u0001¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\tX\u008a\u008e\u0002²\u0006\f\u0010\u0010\u001a\u0004\u0018\u00010\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\bX\u008a\u008e\u0002²\u0006\n\u0010\u0013\u001a\u00020\bX\u008a\u008e\u0002"}, m3636d2 = {"SduiTextInput", "", "component", "Lrh_server_driven_ui/v1/TextInputDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lrh_server_driven_ui/v1/TextInputDto;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "respects", "", "", "formatter", "Lrh_server_driven_ui/v1/TextInputDto$FormatterDto;", "toVisualTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "lib-sdui_externalRelease", "text", "message", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Message;", "visited", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class SduiTextInputIdl {

    /* compiled from: SduiTextInputIdl.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[IconDto.values().length];
            try {
                iArr[IconDto.ICON_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TextInputDto.KeyboardTypeDto.values().length];
            try {
                iArr2[TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr2[TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_NATIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_EMAIL.ordinal()] = 3;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[TextInputDto.KeyboardTypeDto.KEYBOARD_TYPE_DECIMAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[TextInputDto.SizeDto.values().length];
            try {
                iArr3[TextInputDto.SizeDto.SIZE_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr3[TextInputDto.SizeDto.SIZE_REGULAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[TextInputDto.SizeDto.SIZE_HERO.ordinal()] = 3;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[TextInputDto.ValidCharactersDto.values().length];
            try {
                iArr4[TextInputDto.ValidCharactersDto.VALID_CHARACTERS_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr4[TextInputDto.ValidCharactersDto.VALID_CHARACTERS_ALPHANUMERIC.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr4[TextInputDto.ValidCharactersDto.VALID_CHARACTERS_NUMERIC.ordinal()] = 3;
            } catch (NoSuchFieldError unused11) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$23(TextInputDto textInputDto, Modifier modifier, int i, int i2, Composer composer, int i3) {
        SduiTextInput(textInputDto, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x029c  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0164  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0251  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SduiTextInput(final TextInputDto component, Modifier modifier, Composer composer, final int i, final int i2) {
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
        boolean zChangedInstance;
        Object objRememberedValue5;
        Function1 function1;
        boolean zChanged;
        Object objRememberedValue6;
        Modifier modifierOnFocusChanged;
        String label;
        VisualTransformation visualTransformation;
        int i4;
        SnapshotState snapshotState5;
        Modifier modifier4;
        SnapshotState snapshotState6;
        ServerToBentoAssetMapper2 serverToBentoAssetMapper2FromServerValue;
        int i5;
        int iM7786getUnspecifiedPjHm6EE;
        Composer composer2;
        boolean zChanged2;
        Object objRememberedValue7;
        int iM7786getUnspecifiedPjHm6EE2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(component, "component");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1247752177);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(component) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i6 = i2 & 2;
        if (i6 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i3 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1247752177, i3, -1, "com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInput (SduiTextInputIdl.kt:32)");
                }
                FocusRequester focusRequester = (FocusRequester) composerStartRestartGroup.consume(Focusable6.getLocalFocusRequester());
                sduiStateHandler3 = (SduiStateHandler3) composerStartRestartGroup.consume(SduiStateHandler2.getLocalStateHandler());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    TextInputDto.StateDto state = component.getState();
                    String text = state != null ? state.getText() : null;
                    if (text == null) {
                        text = "";
                    }
                    objRememberedValue = SnapshotState3.mutableStateOf$default(text, null, 2, null);
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
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChangedInstance = composerStartRestartGroup.changedInstance(component) | composerStartRestartGroup.changed(sduiStateHandler3);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue5 == companion.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInputIdl.SduiTextInput$lambda$13$lambda$12(component, sduiStateHandler3, snapshotState, snapshotState3, (String) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                }
                function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(modifier3, focusRequester);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged || objRememberedValue6 == companion.getEmpty()) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInputIdl.SduiTextInput$lambda$15$lambda$14(sduiStateHandler3, component, snapshotState4, snapshotState3, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                }
                composerStartRestartGroup.endReplaceGroup();
                modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester, (Function1) objRememberedValue6);
                label = component.getLabel();
                if (component.getHide_label()) {
                    label = null;
                }
                visualTransformation = toVisualTransformation(component.getFormatter());
                i4 = WhenMappings.$EnumSwitchMapping$2[component.getSize().ordinal()];
                if (i4 != 1 || i4 == 2) {
                    snapshotState5 = snapshotState;
                    modifier4 = modifier3;
                    snapshotState6 = snapshotState4;
                    String str = label;
                    composerStartRestartGroup.startReplaceGroup(-793876607);
                    String strSduiTextInput$lambda$1 = SduiTextInput$lambda$1(snapshotState5);
                    String placeholder_text = component.getPlaceholder_text();
                    BentoTextInput8.Message messageSduiTextInput$lambda$4 = SduiTextInput$lambda$4(snapshotState2);
                    IconDto leading_icon = component.getLeading_icon();
                    BentoTextInput8.Icon.Size24 size24 = (WhenMappings.$EnumSwitchMapping$0[leading_icon.ordinal()] == 1 || (serverToBentoAssetMapper2FromServerValue = ServerToBentoAssetMapper2.INSTANCE.fromServerValue(IconKt.getServerValue(leading_icon))) == null) ? null : new BentoTextInput8.Icon.Size24(serverToBentoAssetMapper2FromServerValue, null, null, 6, null);
                    i5 = WhenMappings.$EnumSwitchMapping$1[component.getKeyboard_type().ordinal()];
                    if (i5 != 1 || i5 == 2) {
                        iM7786getUnspecifiedPjHm6EE = KeyboardType.INSTANCE.m7786getUnspecifiedPjHm6EE();
                    } else if (i5 == 3) {
                        iM7786getUnspecifiedPjHm6EE = KeyboardType.INSTANCE.m7780getEmailPjHm6EE();
                    } else {
                        if (i5 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iM7786getUnspecifiedPjHm6EE = KeyboardType.INSTANCE.m7779getDecimalPjHm6EE();
                    }
                    BentoTextInput4.BentoTextInput(strSduiTextInput$lambda$1, function1, modifierOnFocusChanged, str, placeholder_text, null, messageSduiTextInput$lambda$4, size24, null, null, new KeyboardOptions(0, null, iM7786getUnspecifiedPjHm6EE, 0, null, null, null, 123, null), null, visualTransformation, !component.is_disabled(), false, composerStartRestartGroup, (BentoTextInput8.Message.$stable << 18) | (BentoTextInput8.Icon.Size24.$stable << 21), 0, 19232);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                } else {
                    if (i4 != 3) {
                        composerStartRestartGroup.startReplaceGroup(-793879488);
                        composerStartRestartGroup.endReplaceGroup();
                        throw new NoWhenBranchMatchedException();
                    }
                    composerStartRestartGroup.startReplaceGroup(-793831041);
                    Modifier modifier5 = modifier3;
                    String strSduiTextInput$lambda$12 = SduiTextInput$lambda$1(snapshotState);
                    String str2 = label;
                    String placeholder_text2 = component.getPlaceholder_text();
                    BentoTextInput8.Message messageSduiTextInput$lambda$42 = SduiTextInput$lambda$4(snapshotState2);
                    int i7 = WhenMappings.$EnumSwitchMapping$1[component.getKeyboard_type().ordinal()];
                    if (i7 == 1 || i7 == 2) {
                        iM7786getUnspecifiedPjHm6EE2 = KeyboardType.INSTANCE.m7786getUnspecifiedPjHm6EE();
                    } else if (i7 == 3) {
                        iM7786getUnspecifiedPjHm6EE2 = KeyboardType.INSTANCE.m7780getEmailPjHm6EE();
                    } else {
                        if (i7 != 4) {
                            throw new NoWhenBranchMatchedException();
                        }
                        iM7786getUnspecifiedPjHm6EE2 = KeyboardType.INSTANCE.m7779getDecimalPjHm6EE();
                    }
                    snapshotState5 = snapshotState;
                    snapshotState6 = snapshotState4;
                    modifier4 = modifier5;
                    BentoTextInput4.BentoHeroTextInput(strSduiTextInput$lambda$12, function1, modifierOnFocusChanged, str2, placeholder_text2, null, null, messageSduiTextInput$lambda$42, null, new KeyboardOptions(0, null, iM7786getUnspecifiedPjHm6EE2, 0, null, null, null, 123, null), null, visualTransformation, !component.is_disabled(), false, composerStartRestartGroup, BentoTextInput8.Message.$stable << 21, 0, 9568);
                    composer2 = composerStartRestartGroup;
                    composer2.endReplaceGroup();
                }
                Unit unit = Unit.INSTANCE;
                composer2.startReplaceGroup(-1224400529);
                zChanged2 = composer2.changed(sduiStateHandler3) | composer2.changedInstance(component);
                objRememberedValue7 = composer2.rememberedValue();
                if (!zChanged2 || objRememberedValue7 == companion.getEmpty()) {
                    final SnapshotState snapshotState7 = snapshotState5;
                    final SnapshotState snapshotState8 = snapshotState6;
                    Function1 function12 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInputIdl.SduiTextInput$lambda$22$lambda$21(sduiStateHandler3, component, snapshotState7, snapshotState2, snapshotState8, (DisposableEffectScope) obj);
                        }
                    };
                    composer2.updateRememberedValue(function12);
                    objRememberedValue7 = function12;
                }
                composer2.endReplaceGroup();
                EffectsKt.DisposableEffect(unit, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer2, 6);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return SduiTextInputIdl.SduiTextInput$lambda$23(component, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        if ((i3 & 19) == 18) {
            if (i6 == 0) {
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
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            zChangedInstance = composerStartRestartGroup.changedInstance(component) | composerStartRestartGroup.changed(sduiStateHandler3);
            objRememberedValue5 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue5 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return SduiTextInputIdl.SduiTextInput$lambda$13$lambda$12(component, sduiStateHandler3, snapshotState, snapshotState3, (String) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                function1 = (Function1) objRememberedValue5;
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifierFocusRequester2 = FocusRequesterModifier3.focusRequester(modifier3, focusRequester2);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                zChanged = composerStartRestartGroup.changed(sduiStateHandler3) | composerStartRestartGroup.changedInstance(component);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!zChanged) {
                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return SduiTextInputIdl.SduiTextInput$lambda$15$lambda$14(sduiStateHandler3, component, snapshotState4, snapshotState3, (FocusState) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    composerStartRestartGroup.endReplaceGroup();
                    modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierFocusRequester2, (Function1) objRememberedValue6);
                    label = component.getLabel();
                    if (component.getHide_label()) {
                    }
                    visualTransformation = toVisualTransformation(component.getFormatter());
                    i4 = WhenMappings.$EnumSwitchMapping$2[component.getSize().ordinal()];
                    if (i4 != 1) {
                        snapshotState5 = snapshotState;
                        modifier4 = modifier3;
                        snapshotState6 = snapshotState4;
                        String str3 = label;
                        composerStartRestartGroup.startReplaceGroup(-793876607);
                        String strSduiTextInput$lambda$13 = SduiTextInput$lambda$1(snapshotState5);
                        String placeholder_text3 = component.getPlaceholder_text();
                        BentoTextInput8.Message messageSduiTextInput$lambda$43 = SduiTextInput$lambda$4(snapshotState2);
                        IconDto leading_icon2 = component.getLeading_icon();
                        if (WhenMappings.$EnumSwitchMapping$0[leading_icon2.ordinal()] == 1) {
                            i5 = WhenMappings.$EnumSwitchMapping$1[component.getKeyboard_type().ordinal()];
                            if (i5 != 1) {
                                iM7786getUnspecifiedPjHm6EE = KeyboardType.INSTANCE.m7786getUnspecifiedPjHm6EE();
                                BentoTextInput4.BentoTextInput(strSduiTextInput$lambda$13, function1, modifierOnFocusChanged, str3, placeholder_text3, null, messageSduiTextInput$lambda$43, size24, null, null, new KeyboardOptions(0, null, iM7786getUnspecifiedPjHm6EE, 0, null, null, null, 123, null), null, visualTransformation, !component.is_disabled(), false, composerStartRestartGroup, (BentoTextInput8.Message.$stable << 18) | (BentoTextInput8.Icon.Size24.$stable << 21), 0, 19232);
                                composer2 = composerStartRestartGroup;
                                composer2.endReplaceGroup();
                                Unit unit2 = Unit.INSTANCE;
                                composer2.startReplaceGroup(-1224400529);
                                zChanged2 = composer2.changed(sduiStateHandler3) | composer2.changedInstance(component);
                                objRememberedValue7 = composer2.rememberedValue();
                                if (!zChanged2) {
                                    final SnapshotState snapshotState72 = snapshotState5;
                                    final SnapshotState snapshotState82 = snapshotState6;
                                    Function1 function122 = new Function1() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return SduiTextInputIdl.SduiTextInput$lambda$22$lambda$21(sduiStateHandler3, component, snapshotState72, snapshotState2, snapshotState82, (DisposableEffectScope) obj);
                                        }
                                    };
                                    composer2.updateRememberedValue(function122);
                                    objRememberedValue7 = function122;
                                    composer2.endReplaceGroup();
                                    EffectsKt.DisposableEffect(unit2, (Function1<? super DisposableEffectScope, ? extends DisposableEffectResult>) objRememberedValue7, composer2, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    modifier2 = modifier4;
                                }
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

    private static final void SduiTextInput$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void SduiTextInput$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$13$lambda$12(TextInputDto textInputDto, SduiStateHandler3 sduiStateHandler3, SnapshotState snapshotState, SnapshotState snapshotState2, String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (!respects(value, textInputDto.getFormatter())) {
            value = SduiTextInput$lambda$1(snapshotState);
        }
        snapshotState.setValue(value);
        SduiStateHandler3.validateComponent$default(sduiStateHandler3, textInputDto.getIdentifier(), false, 2, null);
        sduiStateHandler3.setState(textInputDto.getIdentifier(), new TextInputState(SduiTextInput$lambda$1(snapshotState)));
        SduiTextInput$lambda$8(snapshotState2, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$15$lambda$14(SduiStateHandler3 sduiStateHandler3, TextInputDto textInputDto, SnapshotState snapshotState, SnapshotState snapshotState2, FocusState it) {
        Intrinsics.checkNotNullParameter(it, "it");
        SduiTextInput$lambda$11(snapshotState, it.isFocused());
        if (!SduiTextInput$lambda$10(snapshotState) && SduiTextInput$lambda$7(snapshotState2)) {
            SduiStateHandler3.validateComponent$default(sduiStateHandler3, textInputDto.getIdentifier(), false, 2, null);
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
    public static final DisposableEffectResult SduiTextInput$lambda$22$lambda$21(final SduiStateHandler3 sduiStateHandler3, final TextInputDto textInputDto, SnapshotState snapshotState, final SnapshotState snapshotState2, final SnapshotState snapshotState3, DisposableEffectScope DisposableEffect) {
        Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
        sduiStateHandler3.register(textInputDto.getIdentifier(), new TextInputState(SduiTextInput$lambda$1(snapshotState)), new ComponentValidation(MapsKt.emptyMap(), new Function0() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return SduiTextInputIdl.SduiTextInput$lambda$22$lambda$21$lambda$18(snapshotState2);
            }
        }, new Function2() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return SduiTextInputIdl.SduiTextInput$lambda$22$lambda$21$lambda$19(snapshotState3, snapshotState2, (Validator) obj, ((Boolean) obj2).booleanValue());
            }
        }));
        return new DisposableEffectResult() { // from class: com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiTextInputIdlKt$SduiTextInput$lambda$22$lambda$21$$inlined$onDispose$1
            @Override // androidx.compose.runtime.DisposableEffectResult
            public void dispose() {
                sduiStateHandler3.remove(textInputDto.getIdentifier());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$22$lambda$21$lambda$18(SnapshotState snapshotState) {
        snapshotState.setValue(null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit SduiTextInput$lambda$22$lambda$21$lambda$19(SnapshotState snapshotState, SnapshotState snapshotState2, Validator validator, boolean z) {
        Intrinsics.checkNotNullParameter(validator, "validator");
        if (validator.getValidationType() != SduiStateHandler4.Delayed || !SduiTextInput$lambda$10(snapshotState) || z) {
            snapshotState2.setValue(new BentoTextInput8.Message.Error(validator.getErrorMessage()));
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }

    public static final boolean respects(String str, TextInputDto.FormatterDto formatterDto) {
        Intrinsics.checkNotNullParameter(str, "<this>");
        if (formatterDto instanceof TextInputDto.FormatterDto.CurrencyFormatter) {
            return new Regex("^$|^\\d*(\\.\\d{0,2})?$").matches(str);
        }
        if (!(formatterDto instanceof TextInputDto.FormatterDto.PlaceholderFormatter)) {
            if (formatterDto == null) {
                return true;
            }
            throw new NoWhenBranchMatchedException();
        }
        TextInputDto.FormatterDto.PlaceholderFormatter placeholderFormatter = (TextInputDto.FormatterDto.PlaceholderFormatter) formatterDto;
        if (str.length() > placeholderFormatter.getValue().getMax_length()) {
            return false;
        }
        int i = WhenMappings.$EnumSwitchMapping$3[placeholderFormatter.getValue().getValid_characters().ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                for (int i2 = 0; i2 < str.length(); i2++) {
                    if (!Character.isDigit(str.charAt(i2))) {
                        return false;
                    }
                }
                return true;
            }
            for (int i3 = 0; i3 < str.length(); i3++) {
                if (!Character.isLetterOrDigit(str.charAt(i3))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final VisualTransformation toVisualTransformation(TextInputDto.FormatterDto formatterDto) {
        if (formatterDto instanceof TextInputDto.FormatterDto.CurrencyFormatter) {
            Currency currency = Currency.getInstance(((TextInputDto.FormatterDto.CurrencyFormatter) formatterDto).getValue().getCurrency_code());
            Intrinsics.checkNotNullExpressionValue(currency, "getInstance(...)");
            return new CurrencyVisualTransformation(currency);
        }
        if (!(formatterDto instanceof TextInputDto.FormatterDto.PlaceholderFormatter)) {
            if (formatterDto != null) {
                throw new NoWhenBranchMatchedException();
            }
            return VisualTransformation.INSTANCE.getNone();
        }
        TextInputDto.FormatterDto.PlaceholderFormatter placeholderFormatter = (TextInputDto.FormatterDto.PlaceholderFormatter) formatterDto;
        placeholderFormatter.getValue().getPlaceholder_character().length();
        char cFirst = StringsKt.first(placeholderFormatter.getValue().getPlaceholder_character());
        placeholderFormatter.getValue().getMax_length();
        String format2 = placeholderFormatter.getValue().getFormat();
        for (int i = 0; i < format2.length(); i++) {
            format2.charAt(i);
        }
        return new PlaceholderVisualTransformation(placeholderFormatter.getValue().getFormat(), cFirst);
    }
}
