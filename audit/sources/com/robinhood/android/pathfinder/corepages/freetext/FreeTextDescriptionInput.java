package com.robinhood.android.pathfinder.corepages.freetext;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.interaction.FocusInteraction3;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextOverflow;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInput;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.rosetta.converters.platform.Booleans2;
import com.robinhood.rosetta.eventlogging.CXIssue;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.shared.pathfinder.corepages.C39352R;
import com.robinhood.staticcontent.model.p402cx.CxVoiceContent;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FreeTextDescriptionInput.kt */
@Metadata(m3635d1 = {"\u0000\u0086\u0001\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00010\u0010H\u0001¢\u0006\u0002\u0010\u0011\u001aB\u0010\u0012\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0017\u001a\u00020\u0005H\u0002\u001a)\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00192\u0006\u0010\u0015\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0003¢\u0006\u0002\u0010\u001a\u001a\u0018\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u001d\u001a\u00020\rH\u0002\"\u0014\u0010\u001e\u001a\u00020\u001f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b \u0010!\"\u0014\u0010\"\u001a\u00020#8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%\"\u0014\u0010&\u001a\u00020'8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)\"\u0014\u0010*\u001a\u00020'8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)\"\u0014\u0010,\u001a\u00020-8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u0010/\"\u000e\u00100\u001a\u000201X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00102\u001a\u000203X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u00104\u001a\u000205X\u0082\u0004¢\u0006\u0002\n\u0000\"\u0014\u00106\u001a\u0002078CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b8\u00109\"\u0010\u0010:\u001a\u00020;X\u0082\u0004¢\u0006\u0004\n\u0002\u0010<\"\u000e\u0010=\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006?²\u0006\n\u0010@\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010A\u001a\u00020\rX\u008a\u008e\u0002²\u0006\n\u0010B\u001a\u00020\rX\u008a\u0084\u0002²\u0006\n\u0010&\u001a\u00020\u001fX\u008a\u0084\u0002"}, m3636d2 = {"FreeTextDescriptionInput", "", "inquiryId", "Ljava/util/UUID;", "value", "", "placeholder", "copies", "Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;", "maxCharacterLimit", "", "warningCharacterLimit", "showMinLengthError", "", "enabled", "onValueChange", "Lkotlin/Function1;", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/staticcontent/model/cx/CxVoiceContent;IIZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "generateCounterText", "isAboveLimit", "shouldShowWarning", "remainingCharacters", "fallbackWarningMessage", "fallbackErrorMessage", "getFallbackLimitMessages", "Lkotlin/Pair;", "(IILandroidx/compose/runtime/Composer;I)Lkotlin/Pair;", "getInputFocusEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "isFocused", "cursorColor", "Landroidx/compose/ui/graphics/Color;", "getCursorColor", "(Landroidx/compose/runtime/Composer;I)J", "borderColor", "Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;", "getBorderColor", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle$BorderColor;", "valueColor", "Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;", "getValueColor", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle$StateColor;", "characterLimitColor", "getCharacterLimitColor", "placeholderColor", "Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;", "getPlaceholderColor", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle$PlaceholderColor;", "spacing", "Lcom/robinhood/compose/theme/style/TextInputStyle$Spacing;", "containerShape", "Landroidx/compose/foundation/shape/RoundedCornerShape;", "containerBorderSize", "Lcom/robinhood/compose/theme/style/TextInputStyle$BorderSize;", "valueTextStyle", "Landroidx/compose/ui/text/TextStyle;", "getValueTextStyle", "(Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/text/TextStyle;", "FreeTextInputHeight", "Landroidx/compose/ui/unit/Dp;", "F", "CharLimitErrorMaxTextCount", "CharLimitWarningRemainingTextCount", "feature-pathfinder-core-pages_externalDebug", "hasFocus", "isCounterTextVisible", "focused"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class FreeTextDescriptionInput {
    private static final String CharLimitErrorMaxTextCount = "{{max_text_count}}";
    private static final String CharLimitWarningRemainingTextCount = "{{remaining_text_count}}";
    private static final RoundedCornerShape containerShape;
    private static final TextInputStyle.Spacing spacing;
    private static final TextInputStyle.BorderSize containerBorderSize = new TextInputStyle.BorderSize(C2002Dp.m7995constructorimpl(1), C2002Dp.m7995constructorimpl(2), null);
    private static final float FreeTextInputHeight = C2002Dp.m7995constructorimpl(EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit FreeTextDescriptionInput$lambda$10(UUID uuid, String str, String str2, CxVoiceContent cxVoiceContent, int i, int i2, boolean z, boolean z2, Function1 function1, int i3, Composer composer, int i4) {
        FreeTextDescriptionInput(uuid, str, str2, cxVoiceContent, i, i2, z, z2, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1));
        return Unit.INSTANCE;
    }

    public static final void FreeTextDescriptionInput(final UUID inquiryId, final String value, final String str, final CxVoiceContent cxVoiceContent, final int i, final int i2, final boolean z, final boolean z2, final Function1<? super String, Unit> onValueChange, Composer composer, final int i3) {
        int i4;
        CxVoiceContent cxVoiceContent2;
        Composer composer2;
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1608700091);
        if ((i3 & 6) == 0) {
            i4 = (composerStartRestartGroup.changedInstance(inquiryId) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(value) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            cxVoiceContent2 = cxVoiceContent;
            i4 |= composerStartRestartGroup.changedInstance(cxVoiceContent2) ? 2048 : 1024;
        } else {
            cxVoiceContent2 = cxVoiceContent;
        }
        if ((i3 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(i2) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(z) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= composerStartRestartGroup.changed(z2) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 67108864 : 33554432;
        }
        if ((38347923 & i4) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1608700091, i4, -1, "com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInput (FreeTextDescriptionInput.kt:77)");
            }
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                SnapshotState snapshotStateMutableStateOf$default = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(snapshotStateMutableStateOf$default);
                objRememberedValue = snapshotStateMutableStateOf$default;
            }
            SnapshotState snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            FocusRequester focusRequester = (FocusRequester) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            int length = value.length();
            boolean z3 = length > i2;
            boolean z4 = length > i;
            FreeTextDescriptionInput$lambda$5(snapshotState2, z4 || z3);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = InteractionSource2.MutableInteractionSource();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
            }
            InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue4;
            composerStartRestartGroup.endReplaceGroup();
            SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState = FocusInteraction3.collectIsFocusedAsState(interactionSource3, composerStartRestartGroup, 6);
            TextInputStyle.InputState inputState = !z2 ? TextInputStyle.InputState.Disabled : z ? TextInputStyle.InputState.Error : FreeTextDescriptionInput$lambda$8(snapshotState4CollectIsFocusedAsState) ? TextInputStyle.InputState.Focused : TextInputStyle.InputState.Enabled;
            SelectionColors selectionColors = new SelectionColors(getCursorColor(composerStartRestartGroup, 0), Color.m6705copywmQWz5c$default(getCursorColor(composerStartRestartGroup, 0), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            SnapshotState4<Color> snapshotState4 = getValueColor(composerStartRestartGroup, 0).get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
            ProvidedValue<SelectionColors> providedValueProvides = TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors);
            C253061 c253061 = new C253061(value, onValueChange, focusRequester, z2, interactionSource3, z, userInteractionEventDescriptor, inquiryId, current, z4, snapshotState, snapshotState4, inputState, snapshotState4CollectIsFocusedAsState, str, i, length, z3, cxVoiceContent2, snapshotState2);
            composer2 = composerStartRestartGroup;
            CompositionLocal3.CompositionLocalProvider(providedValueProvides, ComposableLambda3.rememberComposableLambda(1162687109, true, c253061, composer2, 54), composer2, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$10(inquiryId, value, str, cxVoiceContent, i, i2, z, z2, onValueChange, i3, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void FreeTextDescriptionInput$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void FreeTextDescriptionInput$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FreeTextDescriptionInput$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FreeTextDescriptionInput$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean FreeTextDescriptionInput$lambda$8(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long FreeTextDescriptionInput$lambda$9(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* compiled from: FreeTextDescriptionInput.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt$FreeTextDescriptionInput$1 */
    static final class C253061 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ CxVoiceContent $copies;
        final /* synthetic */ int $currentLength;
        final /* synthetic */ UserInteractionEventDescriptor $descriptor;
        final /* synthetic */ boolean $enabled;
        final /* synthetic */ EventLogger $eventLogger;
        final /* synthetic */ FocusRequester $focusRequester;
        final /* synthetic */ SnapshotState4<Boolean> $focused$delegate;
        final /* synthetic */ SnapshotState<Boolean> $hasFocus$delegate;
        final /* synthetic */ TextInputStyle.InputState $inputState;
        final /* synthetic */ UUID $inquiryId;
        final /* synthetic */ InteractionSource3 $interactionSource;
        final /* synthetic */ boolean $isAboveLimit;
        final /* synthetic */ SnapshotState<Boolean> $isCounterTextVisible$delegate;
        final /* synthetic */ int $maxCharacterLimit;
        final /* synthetic */ Function1<String, Unit> $onValueChange;
        final /* synthetic */ String $placeholder;
        final /* synthetic */ boolean $shouldShowWarning;
        final /* synthetic */ boolean $showMinLengthError;
        final /* synthetic */ String $value;
        final /* synthetic */ SnapshotState4<Color> $valueColor$delegate;

        /* JADX WARN: Multi-variable type inference failed */
        C253061(String str, Function1<? super String, Unit> function1, FocusRequester focusRequester, boolean z, InteractionSource3 interactionSource3, boolean z2, UserInteractionEventDescriptor userInteractionEventDescriptor, UUID uuid, EventLogger eventLogger, boolean z3, SnapshotState<Boolean> snapshotState, SnapshotState4<Color> snapshotState4, TextInputStyle.InputState inputState, SnapshotState4<Boolean> snapshotState42, String str2, int i, int i2, boolean z4, CxVoiceContent cxVoiceContent, SnapshotState<Boolean> snapshotState2) {
            this.$value = str;
            this.$onValueChange = function1;
            this.$focusRequester = focusRequester;
            this.$enabled = z;
            this.$interactionSource = interactionSource3;
            this.$showMinLengthError = z2;
            this.$descriptor = userInteractionEventDescriptor;
            this.$inquiryId = uuid;
            this.$eventLogger = eventLogger;
            this.$isAboveLimit = z3;
            this.$hasFocus$delegate = snapshotState;
            this.$valueColor$delegate = snapshotState4;
            this.$inputState = inputState;
            this.$focused$delegate = snapshotState42;
            this.$placeholder = str2;
            this.$maxCharacterLimit = i;
            this.$currentLength = i2;
            this.$shouldShowWarning = z4;
            this.$copies = cxVoiceContent;
            this.$isCounterTextVisible$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, FocusState it) {
            Intrinsics.checkNotNullParameter(it, "it");
            FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$2(snapshotState, it.getHasFocus());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) {
            if ((i & 3) == 2 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1162687109, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInput.<anonymous> (FreeTextDescriptionInput.kt:109)");
            }
            String str = this.$value;
            Function1<String, Unit> function1 = this.$onValueChange;
            Modifier modifierWrapContentHeight$default = SizeKt.wrapContentHeight$default(SizeKt.fillMaxWidth$default(FocusRequesterModifier3.focusRequester(Modifier.INSTANCE, this.$focusRequester), 0.0f, 1, null), null, false, 3, null);
            composer.startReplaceGroup(5004770);
            final SnapshotState<Boolean> snapshotState = this.$hasFocus$delegate;
            Object objRememberedValue = composer.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt$FreeTextDescriptionInput$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return FreeTextDescriptionInput.C253061.invoke$lambda$1$lambda$0(snapshotState, (FocusState) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierTestTag = TestTag3.testTag(FocusChangedModifier2.onFocusChanged(modifierWrapContentHeight$default, (Function1) objRememberedValue), SupportTextDescriptionComposable.FreeTextTestTagInput);
            boolean z = this.$enabled;
            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(FreeTextDescriptionInput.getValueTextStyle(composer, 0), FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$9(this.$valueColor$delegate), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
            KeyboardOptions keyboardOptions = KeyboardOptions.INSTANCE.getDefault();
            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
            InteractionSource3 interactionSource3 = this.$interactionSource;
            SolidColor solidColor = new SolidColor(FreeTextDescriptionInput.getCursorColor(composer, 0), null);
            final TextInputStyle.InputState inputState = this.$inputState;
            final SnapshotState4<Boolean> snapshotState4 = this.$focused$delegate;
            final String str2 = this.$placeholder;
            final String str3 = this.$value;
            final int i2 = this.$maxCharacterLimit;
            final int i3 = this.$currentLength;
            final boolean z2 = this.$isAboveLimit;
            final boolean z3 = this.$shouldShowWarning;
            final CxVoiceContent cxVoiceContent = this.$copies;
            final boolean z4 = this.$showMinLengthError;
            final SnapshotState<Boolean> snapshotState2 = this.$isCounterTextVisible$delegate;
            BasicTextFieldKt.BasicTextField(str, (Function1<? super String, Unit>) function1, modifierTestTag, z, false, textStyleM7655copyp1EtxEg$default, keyboardOptions, (KeyboardActions) null, false, 0, 0, none, (Function1<? super TextLayoutResult, Unit>) null, interactionSource3, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1792647528, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInputKt.FreeTextDescriptionInput.1.2
                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i4) {
                    int i5;
                    Arrangement arrangement;
                    TextInputStyle.InputState inputState2;
                    int i6;
                    int i7;
                    int i8;
                    boolean z5;
                    boolean z6;
                    CxVoiceContent cxVoiceContent2;
                    boolean z7;
                    Modifier.Companion companion2;
                    SnapshotState<Boolean> snapshotState3;
                    int i9;
                    Composer composer3;
                    TextInputStyle.InputState inputState3;
                    Composer composer4 = composer2;
                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                    if ((i4 & 6) == 0) {
                        i5 = i4 | (composer4.changedInstance(innerTextField) ? 4 : 2);
                    } else {
                        i5 = i4;
                    }
                    if ((i5 & 19) == 18 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1792647528, i5, -1, "com.robinhood.android.pathfinder.corepages.freetext.FreeTextDescriptionInput.<anonymous>.<anonymous> (FreeTextDescriptionInput.kt:126)");
                    }
                    Arrangement arrangement2 = Arrangement.INSTANCE;
                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement2.m5089spacedBy0680j_4(FreeTextDescriptionInput.spacing.m22021getVerticalSpacingD9Ej5fM());
                    Alignment.Companion companion3 = Alignment.INSTANCE;
                    Alignment.Horizontal start = companion3.getStart();
                    TextInputStyle.InputState inputState4 = inputState;
                    SnapshotState4<Boolean> snapshotState42 = snapshotState4;
                    int i10 = i5;
                    String str4 = str2;
                    String str5 = str3;
                    int i11 = i2;
                    int i12 = i3;
                    boolean z8 = z2;
                    boolean z9 = z3;
                    CxVoiceContent cxVoiceContent3 = cxVoiceContent;
                    boolean z10 = z4;
                    SnapshotState<Boolean> snapshotState5 = snapshotState2;
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, start, composer4, 48);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, companion4);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion5.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    float value = FreeTextDescriptionInput.containerBorderSize.get(FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$8(snapshotState42), composer4, TextInputStyle.BorderSize.$stable << 3).getValue().getValue();
                    TextInputStyle.BorderColor borderColor = FreeTextDescriptionInput.getBorderColor(composer4, 0);
                    int i13 = TextInputStyle.BorderColor.$stable;
                    Modifier modifierWeight = column6.weight(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5156height3ABfNKs(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion4, value, borderColor.get(inputState4, composer4, i13 << 3).getValue().getValue(), FreeTextDescriptionInput.containerShape), Color.INSTANCE.m6725getTransparent0d7_KjU(), FreeTextDescriptionInput.containerShape), 0.0f, FreeTextDescriptionInput.FreeTextInputHeight, 1, null), FreeTextDescriptionInput.FreeTextInputHeight), FreeTextDescriptionInput.spacing.getContainerHorizontalPadding().m21998getPaddingD9Ej5fM(), 0.0f, 2, null), 1.0f, false);
                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement2.getStart(), companion3.getTop(), composer4, 0);
                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap2 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer4, modifierWeight);
                    Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor2);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                    Row6 row6 = Row6.INSTANCE;
                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), 0.0f, FreeTextDescriptionInput.spacing.m22019getContainerVerticalPaddingD9Ej5fM(), 1, null);
                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion3.getTopStart(), false);
                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap3 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer4, modifierM5144paddingVpY3zN4$default);
                    Function0<ComposeUiNode> constructor3 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor3);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion5.getSetModifier());
                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                    composer4.startReplaceGroup(746134262);
                    if (str4 == null || StringsKt.isBlank(str4) || str5.length() != 0) {
                        arrangement = arrangement2;
                        inputState2 = inputState4;
                        i6 = i10;
                        i7 = i11;
                        i8 = i12;
                        z5 = z8;
                        z6 = z9;
                        cxVoiceContent2 = cxVoiceContent3;
                        z7 = z10;
                        companion2 = companion4;
                        snapshotState3 = snapshotState5;
                        i9 = 0;
                    } else {
                        i8 = i12;
                        z5 = z8;
                        z6 = z9;
                        snapshotState3 = snapshotState5;
                        z7 = z10;
                        companion2 = companion4;
                        i6 = i10;
                        arrangement = arrangement2;
                        inputState2 = inputState4;
                        i7 = i11;
                        cxVoiceContent2 = cxVoiceContent3;
                        i9 = 0;
                        TextKt.m5665Text4IGK_g(str4, null, FreeTextDescriptionInput.getPlaceholderColor(composer4, 0).get(inputState4, composer4, TextInputStyle.PlaceholderColor.$stable << 3).getValue().getValue(), 0L, null, null, null, 0L, null, null, 0L, TextOverflow.INSTANCE.m7959getEllipsisgIe3tQ8(), false, 0, 0, null, FreeTextDescriptionInput.getValueTextStyle(composer4, 0), composer2, 0, 48, 63482);
                        composer4 = composer2;
                    }
                    composer4.endReplaceGroup();
                    innerTextField.invoke(composer4, Integer.valueOf(i6 & 14));
                    composer4.endNode();
                    composer4.endNode();
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion3.getTop(), composer4, i9);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer4, i9);
                    CompositionLocalMap currentCompositionLocalMap4 = composer4.getCurrentCompositionLocalMap();
                    Modifier.Companion companion6 = companion2;
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer4, companion6);
                    Function0<ComposeUiNode> constructor4 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor4);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion5.getSetModifier());
                    Modifier modifierWeight$default = Row5.weight$default(row6, companion6, 1.0f, false, 2, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion3.getStart(), composer4, i9);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composer4, i9);
                    CompositionLocalMap currentCompositionLocalMap5 = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composer4, modifierWeight$default);
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor5);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyColumnMeasurePolicy2, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
                    composer4.startReplaceGroup(1245744869);
                    if (z7) {
                        MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(arrangement.m5089spacedBy0680j_4(FreeTextDescriptionInput.spacing.m22020getMessageIconSpacingD9Ej5fM()), companion3.getCenterVertically(), composer4, 48);
                        int currentCompositeKeyHash6 = Composables.getCurrentCompositeKeyHash(composer4, i9);
                        CompositionLocalMap currentCompositionLocalMap6 = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composer4, companion6);
                        Function0<ComposeUiNode> constructor6 = companion5.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor6);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl6 = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl6, measurePolicyRowMeasurePolicy3, companion5.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl6, currentCompositionLocalMap6, companion5.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash6 = companion5.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl6.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl6.rememberedValue(), Integer.valueOf(currentCompositeKeyHash6))) {
                            composerM6388constructorimpl6.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash6));
                            composerM6388constructorimpl6.apply(Integer.valueOf(currentCompositeKeyHash6), setCompositeKeyHash6);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl6, modifierMaterializeModifier6, companion5.getSetModifier());
                        TextInputStyle.InputState inputState5 = inputState2;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size16(ServerToBentoAssetMapper2.TRIANGLE_ALERT_16), null, FreeTextDescriptionInput.getBorderColor(composer4, i9).get(inputState5, composer4, i13 << 3).getValue().getValue(), null, null, false, composer4, BentoIcon4.Size16.$stable | 48, 56);
                        inputState3 = inputState5;
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C39352R.string.support_text_desc_char_minimum_error, composer4, i9), null, FreeTextDescriptionInput.getBorderColor(composer4, i9).get(inputState5, composer4, i13 << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(BentoTheme.INSTANCE.getTypography(composer4, BentoTheme.$stable).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composer4, 0, 0, 8186);
                        composer3 = composer4;
                        composer3.endNode();
                    } else {
                        composer3 = composer4;
                        inputState3 = inputState2;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    composer3.startReplaceGroup(-1742268379);
                    if (FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$4(snapshotState3)) {
                        int i14 = i7;
                        int i15 = i14 - i8;
                        Tuples2 fallbackLimitMessages = FreeTextDescriptionInput.getFallbackLimitMessages(i15, i14, composer3, i9);
                        BentoText2.m20747BentoText38GnDrw(FreeTextDescriptionInput.generateCounterText(z5, z6, i15, i14, cxVoiceContent2, (String) fallbackLimitMessages.component1(), (String) fallbackLimitMessages.component2()), null, FreeTextDescriptionInput.getCharacterLimitColor(composer3, i9).get(inputState3, composer3, TextInputStyle.StateColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, BentoTheme.INSTANCE.getTypography(composer3, BentoTheme.$stable).getTextM(), composer2, 0, 0, 8186);
                    }
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composer, 54), composer, 102236160, 199728, 5776);
            Boolean boolValueOf = Boolean.valueOf(this.$showMinLengthError);
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$showMinLengthError);
            boolean z5 = this.$showMinLengthError;
            FocusRequester focusRequester = this.$focusRequester;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new FreeTextDescriptionInput2(z5, focusRequester, null);
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer, 0);
            Boolean boolValueOf2 = Boolean.valueOf(FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$1(this.$hasFocus$delegate));
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$descriptor) | composer.changedInstance(this.$inquiryId) | composer.changedInstance(this.$eventLogger);
            UserInteractionEventDescriptor userInteractionEventDescriptor = this.$descriptor;
            UUID uuid = this.$inquiryId;
            EventLogger eventLogger = this.$eventLogger;
            SnapshotState<Boolean> snapshotState3 = this.$hasFocus$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new FreeTextDescriptionInput3(userInteractionEventDescriptor, uuid, eventLogger, snapshotState3, null);
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composer, 0);
            Boolean boolValueOf3 = Boolean.valueOf(FreeTextDescriptionInput.FreeTextDescriptionInput$lambda$4(this.$isCounterTextVisible$delegate));
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance2 = composer.changedInstance(this.$descriptor) | composer.changedInstance(this.$inquiryId) | composer.changed(this.$isAboveLimit) | composer.changedInstance(this.$eventLogger);
            UserInteractionEventDescriptor userInteractionEventDescriptor2 = this.$descriptor;
            UUID uuid2 = this.$inquiryId;
            boolean z6 = this.$isAboveLimit;
            EventLogger eventLogger2 = this.$eventLogger;
            SnapshotState<Boolean> snapshotState5 = this.$isCounterTextVisible$delegate;
            Object objRememberedValue4 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue4 == companion.getEmpty()) {
                objRememberedValue4 = new FreeTextDescriptionInput4(userInteractionEventDescriptor2, uuid2, z6, eventLogger2, snapshotState5, null);
                composer.updateRememberedValue(objRememberedValue4);
            }
            composer.endReplaceGroup();
            EffectsKt.LaunchedEffect(boolValueOf3, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue4, composer, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String generateCounterText(boolean z, boolean z2, int i, int i2, CxVoiceContent cxVoiceContent, String str, String str2) {
        String textDescriptionTextFormLimitWarningMessage;
        String textDescriptionTextFormLimitExceededMessage;
        String strReplace$default = null;
        if (z) {
            if (cxVoiceContent != null && (textDescriptionTextFormLimitExceededMessage = cxVoiceContent.getTextDescriptionTextFormLimitExceededMessage()) != null) {
                strReplace$default = StringsKt.replace$default(textDescriptionTextFormLimitExceededMessage, CharLimitErrorMaxTextCount, String.valueOf(i2), false, 4, (Object) null);
            }
            return strReplace$default == null ? str2 : strReplace$default;
        }
        if (!z2) {
            return "";
        }
        if (cxVoiceContent != null && (textDescriptionTextFormLimitWarningMessage = cxVoiceContent.getTextDescriptionTextFormLimitWarningMessage()) != null) {
            strReplace$default = StringsKt.replace$default(textDescriptionTextFormLimitWarningMessage, CharLimitWarningRemainingTextCount, String.valueOf(i), false, 4, (Object) null);
        }
        return strReplace$default == null ? str : strReplace$default;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2<String, String> getFallbackLimitMessages(int i, int i2, Composer composer, int i3) {
        composer.startReplaceGroup(-1530558127);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1530558127, i3, -1, "com.robinhood.android.pathfinder.corepages.freetext.getFallbackLimitMessages (FreeTextDescriptionInput.kt:305)");
        }
        Tuples2<String, String> tuples2M3642to = Tuples4.m3642to(StringResources_androidKt.pluralStringResource(C39352R.plurals.support_call_text_desc_char_limit_warning, i, new Object[]{Integer.valueOf(i)}, composer, (i3 << 3) & 112), StringResources_androidKt.pluralStringResource(C39352R.plurals.support_call_text_desc_char_limit_error, i2, new Object[]{Integer.valueOf(i2)}, composer, i3 & 112));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return tuples2M3642to;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor getInputFocusEventDescriptor(UUID uuid, boolean z) {
        Component component = new Component(Component.ComponentType.TEXT_FIELD, null, null, 6, null);
        String string2 = uuid.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new UserInteractionEventDescriptor(null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, new CXIssue(string2, null, null, null, null, Booleans2.toProtobuf(Boolean.valueOf(z)), null, null, null, 0, null, null, null, null, null, null, null, 0, null, false, null, false, null, 8388574, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -262145, -1, -1, -1, -1, -1, 16383, null), component, null, 39, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final long getCursorColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1208266390, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.<get-cursorColor> (FreeTextDescriptionInput.kt:331)");
        }
        long jM21368getAccent0d7_KjU = BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21368getAccent0d7_KjU();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return jM21368getAccent0d7_KjU;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final TextInputStyle.BorderColor getBorderColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-663956658, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.<get-borderColor> (FreeTextDescriptionInput.kt:335)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextInputStyle.BorderColor borderColor = new TextInputStyle.BorderColor(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU(), bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return borderColor;
    }

    @JvmName
    private static final TextInputStyle.StateColor getValueColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-584739649, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.<get-valueColor> (FreeTextDescriptionInput.kt:345)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextInputStyle.StateColor stateColor = new TextInputStyle.StateColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final TextInputStyle.StateColor getCharacterLimitColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1319452451, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.<get-characterLimitColor> (FreeTextDescriptionInput.kt:352)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextInputStyle.StateColor stateColor = new TextInputStyle.StateColor(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return stateColor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final TextInputStyle.PlaceholderColor getPlaceholderColor(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1007656479, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.<get-placeholderColor> (FreeTextDescriptionInput.kt:359)");
        }
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextInputStyle.PlaceholderColor placeholderColor = new TextInputStyle.PlaceholderColor(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return placeholderColor;
    }

    static {
        float f = 16;
        float f2 = 4;
        spacing = new TextInputStyle.Spacing(new TextInputStyle.HorizontalPadding(C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(f), null), C2002Dp.m7995constructorimpl(10), C2002Dp.m7995constructorimpl(0), C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(8), null);
        containerShape = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final TextStyle getValueTextStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(414578117, i, -1, "com.robinhood.android.pathfinder.corepages.freetext.<get-valueTextStyle> (FreeTextDescriptionInput.kt:384)");
        }
        TextStyle textM = BentoTheme.INSTANCE.getTypography(composer, BentoTheme.$stable).getTextM();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return textM;
    }
}
