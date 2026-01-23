package com.truelayer.payments.p419ui.components.inputs;

import android.content.Context;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxWithConstraints4;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.icons.Icons;
import androidx.compose.material.icons.filled.Visibility2;
import androidx.compose.material.icons.filled.VisibilityOff;
import androidx.compose.material3.IconButton5;
import androidx.compose.material3.MaterialTheme;
import androidx.compose.material3.OutlinedTextField;
import androidx.compose.material3.TextFieldColors;
import androidx.compose.material3.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusChangedModifier2;
import androidx.compose.p011ui.focus.FocusState;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.graphics.Shape;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.LayoutKt;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.input.VisualTransformation2;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SkippableUpdater;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.truelayer.payments.p419ui.C42830R;
import com.truelayer.payments.p419ui.components.ResponsiveContainer;
import com.truelayer.payments.p419ui.components.inputs.form.models.FieldState;
import com.truelayer.payments.p419ui.components.inputs.form.models.Fields5;
import com.truelayer.payments.p419ui.components.inputs.form.models.ValidationError2;
import com.truelayer.payments.p419ui.theme.Spacing;
import com.truelayer.payments.p419ui.utils.StringExtensions;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.PrimitiveRanges2;

/* compiled from: TextInput.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u001d\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001a'\u0010\u0007\u001a\u00020\u00012\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000fH\u0003¢\u0006\u0002\u0010\u0010\u001aq\u0010\u0011\u001a\u00020\u00012\b\b\u0002\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u000e\u001a\u00020\u000f2!\u0010\u0014\u001a\u001d\u0012\u0013\u0012\u00110\u0016¢\u0006\f\b\u0017\u0012\b\b\u0018\u0012\u0004\b\b(\u0002\u0012\u0004\u0012\u00020\u00010\u00152\b\b\u0002\u0010\u0019\u001a\u00020\u001a2\b\b\u0002\u0010\u001b\u001a\u00020\u001c2\b\b\u0002\u0010\u001d\u001a\u00020\u001e2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010 H\u0001ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a/\u0010#\u001a\u00020\u00012\u0006\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010%\u001a\u001e\u0010&\u001a\u00020\u0003*\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH\u0002ø\u0001\u0000¢\u0006\u0004\b'\u0010(\u001a\u0014\u0010)\u001a\u00020**\u00020+2\u0006\u0010,\u001a\u00020\tH\u0002\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006-²\u0006\n\u0010\b\u001a\u00020\tX\u008a\u008e\u0002²\u0006\n\u0010.\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"Countable", "", "value", "", "maxLength", "", "(Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)V", "SensitiveIcon", "sensitive", "", "onToggle", "Lkotlin/Function0;", "(ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "SupportingText", "field", "Lcom/truelayer/payments/ui/components/inputs/form/models/TextField;", "(Lcom/truelayer/payments/ui/components/inputs/form/models/TextField;Landroidx/compose/runtime/Composer;I)V", "TextInput", "modifier", "Landroidx/compose/ui/Modifier;", "onChange", "Lkotlin/Function1;", "Lcom/truelayer/payments/ui/components/inputs/form/models/FieldState;", "Lkotlin/ParameterName;", "name", "keyboardActions", "Landroidx/compose/foundation/text/KeyboardActions;", "keyboardCapitalization", "Landroidx/compose/ui/text/input/KeyboardCapitalization;", "imeAction", "Landroidx/compose/ui/text/input/ImeAction;", "boxWithConstraintsScope", "Landroidx/compose/foundation/layout/BoxWithConstraintsScope;", "TextInput-9ApJK6A", "(Landroidx/compose/ui/Modifier;Lcom/truelayer/payments/ui/components/inputs/form/models/TextField;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/text/KeyboardActions;IILandroidx/compose/foundation/layout/BoxWithConstraintsScope;Landroidx/compose/runtime/Composer;II)V", "TrailingIcon", "toggleSensitive", "(Lcom/truelayer/payments/ui/components/inputs/form/models/TextField;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "autoFormat", "autoFormat-jVJ6Wsc", "(Ljava/lang/String;I)Ljava/lang/String;", "fieldTransformation", "Landroidx/compose/ui/text/input/VisualTransformation;", "Landroidx/compose/ui/text/input/VisualTransformation$Companion;", "isSensitive", "payments-ui_release", "focus"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes12.dex */
public final class TextInputKt {
    /* renamed from: TextInput-9ApJK6A, reason: not valid java name */
    public static final void m27056TextInput9ApJK6A(Modifier modifier, final Fields5 field, final Function1<? super FieldState, Unit> onChange, KeyboardActions keyboardActions, int i, int i2, BoxWithConstraints4 boxWithConstraints4, Composer composer, final int i3, final int i4) {
        Intrinsics.checkNotNullParameter(field, "field");
        Intrinsics.checkNotNullParameter(onChange, "onChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-328476940);
        Modifier modifier2 = (i4 & 1) != 0 ? Modifier.INSTANCE : modifier;
        KeyboardActions keyboardActions2 = (i4 & 8) != 0 ? KeyboardActions.INSTANCE.getDefault() : keyboardActions;
        int iM7767getNoneIUNYP9k = (i4 & 16) != 0 ? KeyboardCapitalization.INSTANCE.m7767getNoneIUNYP9k() : i;
        int iM7746getDefaulteUduSuo = (i4 & 32) != 0 ? ImeAction.INSTANCE.m7746getDefaulteUduSuo() : i2;
        BoxWithConstraints4 boxWithConstraints42 = (i4 & 64) != 0 ? null : boxWithConstraints4;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-328476940, i3, -1, "com.truelayer.payments.ui.components.inputs.TextInput (TextInput.kt:51)");
        }
        composerStartRestartGroup.startReplaceableGroup(1049911303);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.valueOf(field.getIsSensitive()), null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.startReplaceableGroup(1049911367);
        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
        }
        final SnapshotState snapshotState2 = (SnapshotState) objRememberedValue2;
        composerStartRestartGroup.endReplaceableGroup();
        Modifier.Companion companion2 = Modifier.INSTANCE;
        final int i5 = iM7746getDefaulteUduSuo;
        Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), 0.0f, Spacing.INSTANCE.m27175getMEDIUMD9Ej5fM(), 1, null);
        composerStartRestartGroup.startReplaceableGroup(1049911521);
        Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1<FocusState, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt$TextInput$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(1);
                }

                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Unit invoke(FocusState focusState) {
                    invoke2(focusState);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(FocusState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    TextInputKt.TextInput_9ApJK6A$lambda$5(snapshotState2, it.isFocused() || it.getHasFocus());
                }
            };
            composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
        }
        composerStartRestartGroup.endReplaceableGroup();
        Modifier modifierOnFocusChanged = FocusChangedModifier2.onFocusChanged(modifierM5144paddingVpY3zN4$default, (Function1) objRememberedValue3);
        Alignment.Horizontal centerHorizontally = Alignment.INSTANCE.getCenterHorizontally();
        composerStartRestartGroup.startReplaceableGroup(-483455358);
        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
        composerStartRestartGroup.startReplaceableGroup(-1323940314);
        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
        Function0<ComposeUiNode> constructor = companion3.getConstructor();
        Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierOnFocusChanged);
        if (composerStartRestartGroup.getApplier() == null) {
            Composables.invalidApplier();
        }
        composerStartRestartGroup.startReusableNode();
        if (composerStartRestartGroup.getInserting()) {
            composerStartRestartGroup.createNode(constructor);
        } else {
            composerStartRestartGroup.useNode();
        }
        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
        }
        function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
        composerStartRestartGroup.startReplaceableGroup(2058660585);
        Column6 column6 = Column6.INSTANCE;
        final Modifier modifier3 = modifier2;
        final int i6 = iM7767getNoneIUNYP9k;
        OutlinedTextField.OutlinedTextField(m27058autoFormatjVJ6Wsc(field.getValue(), iM7767getNoneIUNYP9k), (Function1<? super String, Unit>) new Function1<String, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt$TextInput$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(String str) {
                invoke2(str);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(String value) {
                Intrinsics.checkNotNullParameter(value, "value");
                onChange.invoke(field.validateOnChange(TextInputKt.m27058autoFormatjVJ6Wsc(value, i6)));
            }
        }, TestTag3.testTag(ResponsiveContainer.widthBreakpoints(modifier2, boxWithConstraints42, ResponsiveContainer.formBreakpoints(companion2)), field.getId()), false, false, (TextStyle) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambda3.composableLambda(composerStartRestartGroup, 2133925476, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt$TextInput$2$2
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(2133925476, i7, -1, "com.truelayer.payments.ui.components.inputs.TextInput.<anonymous>.<anonymous> (TextInput.kt:70)");
                }
                TextKt.m6028Text4IGK_g(StringExtensions.capitalise$default(field.getLabel(), null, 1, null), null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambda3.composableLambda(composerStartRestartGroup, -39489497, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt$TextInput$2$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) != 2 || !composer2.getSkipping()) {
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-39489497, i7, -1, "com.truelayer.payments.ui.components.inputs.TextInput.<anonymous>.<anonymous> (TextInput.kt:81)");
                    }
                    Fields5 fields5 = field;
                    boolean zTextInput_9ApJK6A$lambda$1 = TextInputKt.TextInput_9ApJK6A$lambda$1(snapshotState);
                    composer2.startReplaceableGroup(-1893831303);
                    final SnapshotState<Boolean> snapshotState3 = snapshotState;
                    Object objRememberedValue4 = composer2.rememberedValue();
                    if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue4 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt$TextInput$2$3$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            {
                                super(0);
                            }

                            @Override // kotlin.jvm.functions.Function0
                            public /* bridge */ /* synthetic */ Unit invoke() {
                                invoke2();
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2() {
                                TextInputKt.TextInput_9ApJK6A$lambda$2(snapshotState3, !TextInputKt.TextInput_9ApJK6A$lambda$1(r0));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue4);
                    }
                    composer2.endReplaceableGroup();
                    TextInputKt.TrailingIcon(fields5, zTextInput_9ApJK6A$lambda$1, (Function0) objRememberedValue4, composer2, 392, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                        return;
                    }
                    return;
                }
                composer2.skipToGroupEnd();
            }
        }), (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) null, (Function2<? super Composer, ? super Integer, Unit>) ComposableLambda3.composableLambda(composerStartRestartGroup, 735507575, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt$TextInput$2$4
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i7) {
                if ((i7 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(735507575, i7, -1, "com.truelayer.payments.ui.components.inputs.TextInput.<anonymous>.<anonymous> (TextInput.kt:71)");
                }
                TextInputKt.SupportingText(field, composer2, 8);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), field.getState() instanceof FieldState.Invalid, fieldTransformation(VisualTransformation.INSTANCE, TextInput_9ApJK6A$lambda$1(snapshotState)), KeyboardOptions.m5354copyij11fho$default(KeyboardOptions.INSTANCE.getDefault(), iM7767getNoneIUNYP9k, false, field.m27065getKeyboardTypePjHm6EE(), i5, null, 18, null), keyboardActions2, false, 0, 0, (InteractionSource3) null, (Shape) null, (TextFieldColors) null, composerStartRestartGroup, 806879232, ((i3 << 9) & 3670016) | 384, 0, 8261048);
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endNode();
        composerStartRestartGroup.endReplaceableGroup();
        composerStartRestartGroup.endReplaceableGroup();
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final BoxWithConstraints4 boxWithConstraints43 = boxWithConstraints42;
            final KeyboardActions keyboardActions3 = keyboardActions2;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt$TextInput$3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    TextInputKt.m27056TextInput9ApJK6A(modifier3, field, onChange, keyboardActions3, i6, i5, boxWithConstraints43, composer2, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextInput_9ApJK6A$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TextInput_9ApJK6A$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void SupportingText(final Fields5 fields5, Composer composer, final int i) {
        String hint;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1237277770);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1237277770, i, -1, "com.truelayer.payments.ui.components.inputs.SupportingText (TextInput.kt:92)");
        }
        composerStartRestartGroup.startReplaceableGroup(706942928);
        if (fields5.getState() instanceof FieldState.Invalid) {
            hint = ValidationError2.intoDisplayString(((FieldState.Invalid) fields5.getState()).getError(), fields5.getLabel(), (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()));
        } else {
            hint = fields5.getHint();
            if (hint == null) {
                hint = "";
            }
        }
        composerStartRestartGroup.endReplaceableGroup();
        TextKt.m6028Text4IGK_g(hint, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, MaterialTheme.INSTANCE.getTypography(composerStartRestartGroup, MaterialTheme.$stable).getBodySmall(), composerStartRestartGroup, 0, 0, 65534);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.SupportingText.1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    TextInputKt.SupportingText(fields5, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void TrailingIcon(final Fields5 fields5, boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-682769223);
        final boolean z2 = (i2 & 2) != 0 ? false : z;
        if ((i2 & 4) != 0) {
            function0 = new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.TrailingIcon.1
                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }

                @Override // kotlin.jvm.functions.Function0
                public /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }
            };
        }
        final Function0<Unit> function02 = function0;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-682769223, i, -1, "com.truelayer.payments.ui.components.inputs.TrailingIcon (TextInput.kt:107)");
        }
        if (fields5.getIsSensitive()) {
            composerStartRestartGroup.startReplaceableGroup(-1365817520);
            SensitiveIcon(z2, function02, composerStartRestartGroup, (i >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
            composerStartRestartGroup.endReplaceableGroup();
        } else {
            composerStartRestartGroup.startReplaceableGroup(-1365817336);
            PrimitiveRanges2 range = fields5.getValidation().getRange();
            if (range != null) {
                composerStartRestartGroup.startReplaceableGroup(-1365817309);
                if (range.getFirst() == range.getLast()) {
                    Countable(fields5.getValue(), range.getLast(), composerStartRestartGroup, 0);
                }
                composerStartRestartGroup.endReplaceableGroup();
            }
            composerStartRestartGroup.endReplaceableGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.TrailingIcon.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    TextInputKt.TrailingIcon(fields5, z2, function02, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void SensitiveIcon(boolean z, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        boolean z2;
        int i3;
        Function0<Unit> function02;
        final boolean z3;
        final Function0<Unit> function03;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-229109828);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            z2 = z;
        } else if ((i & 14) == 0) {
            z2 = z;
            i3 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 112) == 0) {
                function02 = function0;
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
            if ((i3 & 91) == 18 || !composerStartRestartGroup.getSkipping()) {
                z3 = i4 == 0 ? false : z2;
                function03 = i5 == 0 ? new Function0<Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.SensitiveIcon.1
                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }
                } : function02;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-229109828, i3, -1, "com.truelayer.payments.ui.components.inputs.SensitiveIcon (TextInput.kt:124)");
                }
                IconButton5.IconButton(function03, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Spacing.INSTANCE.m27178getSMALLD9Ej5fM(), 0.0f, 11, null), false, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1368617985, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.SensitiveIcon.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1368617985, i6, -1, "com.truelayer.payments.ui.components.inputs.SensitiveIcon.<anonymous> (TextInput.kt:128)");
                            }
                            ImageKt.Image(z3 ? Visibility2.getVisibility(Icons.Filled.INSTANCE) : VisibilityOff.getVisibilityOff(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.password_toggle, composer2, 0), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnBackground(), 0, 2, null), composer2, 0, 60);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                                return;
                            }
                            return;
                        }
                        composer2.skipToGroupEnd();
                    }
                }), composerStartRestartGroup, ((i3 >> 3) & 14) | 196656, 28);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                z3 = z2;
                function03 = function02;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.SensitiveIcon.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(2);
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i6) {
                        TextInputKt.SensitiveIcon(z3, function03, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        function02 = function0;
        if ((i3 & 91) == 18) {
            if (i4 == 0) {
            }
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            IconButton5.IconButton(function03, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Spacing.INSTANCE.m27178getSMALLD9Ej5fM(), 0.0f, 11, null), false, null, null, ComposableLambda3.composableLambda(composerStartRestartGroup, -1368617985, true, new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.SensitiveIcon.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i6) {
                    if ((i6 & 11) != 2 || !composer2.getSkipping()) {
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1368617985, i6, -1, "com.truelayer.payments.ui.components.inputs.SensitiveIcon.<anonymous> (TextInput.kt:128)");
                        }
                        ImageKt.Image(z3 ? Visibility2.getVisibility(Icons.Filled.INSTANCE) : VisibilityOff.getVisibilityOff(Icons.Filled.INSTANCE), StringResources_androidKt.stringResource(C42830R.string.password_toggle, composer2, 0), (Modifier) null, (Alignment) null, (ContentScale) null, 0.0f, ColorFilter.Companion.m6729tintxETnrds$default(ColorFilter.INSTANCE, MaterialTheme.INSTANCE.getColorScheme(composer2, MaterialTheme.$stable).getOnBackground(), 0, 2, null), composer2, 0, 60);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                            return;
                        }
                        return;
                    }
                    composer2.skipToGroupEnd();
                }
            }), composerStartRestartGroup, ((i3 >> 3) & 14) | 196656, 28);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Countable(final String str, final int i, Composer composer, final int i2) {
        int i3;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(145294216);
        if ((i2 & 14) == 0) {
            i3 = (composerStartRestartGroup.changed(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 112) == 0) {
            i3 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i3 & 91) != 18 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(145294216, i3, -1, "com.truelayer.payments.ui.components.inputs.Countable (TextInput.kt:136)");
            }
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, 0.0f, Spacing.INSTANCE.m27177getREGULARD9Ej5fM(), 0.0f, 11, null);
            composerStartRestartGroup.startReplaceableGroup(693286680);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(-1323940314);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            Function3<SkippableUpdater<ComposeUiNode>, Composer, Integer, Unit> function3ModifierMaterializerOf = LayoutKt.modifierMaterializerOf(modifierM5146paddingqDBjuR0$default);
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            function3ModifierMaterializerOf.invoke(SkippableUpdater.m6370boximpl(SkippableUpdater.m6371constructorimpl(composerStartRestartGroup)), composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceableGroup(2058660585);
            Row6 row6 = Row6.INSTANCE;
            composer2 = composerStartRestartGroup;
            TextKt.m6028Text4IGK_g(str.length() + "/" + i, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
            composer2.endReplaceableGroup();
            composer2.endNode();
            composer2.endReplaceableGroup();
            composer2.endReplaceableGroup();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.truelayer.payments.ui.components.inputs.TextInputKt.Countable.2
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    TextInputKt.Countable(str, i, composer3, RecomposeScopeImpl4.updateChangedFlags(i2 | 1));
                }
            });
        }
    }

    private static final VisualTransformation fieldTransformation(VisualTransformation.Companion companion, boolean z) {
        return z ? new VisualTransformation2((char) 0, 1, null) : companion.getNone();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: autoFormat-jVJ6Wsc, reason: not valid java name */
    public static final String m27058autoFormatjVJ6Wsc(String str, int i) {
        if (!KeyboardCapitalization.m7762equalsimpl0(i, KeyboardCapitalization.INSTANCE.m7766getCharactersIUNYP9k())) {
            return str;
        }
        String upperCase = str.toUpperCase(Locale.ROOT);
        Intrinsics.checkNotNullExpressionValue(upperCase, "toUpperCase(...)");
        return upperCase;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean TextInput_9ApJK6A$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }
}
