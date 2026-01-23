package com.robinhood.shared.support.supportchat.p396ui;

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
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.KeyboardCapitalization;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextInput8;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.theme.style.TextInputStyle;
import com.robinhood.utils.extensions.ResourceTypes;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.JvmName;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: ChatTextInput.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\u001aw\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00030\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00012\u0006\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\f\u001a\u00020\t2\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\t2\b\b\u0002\u0010\u0012\u001a\u00020\u0013H\u0007¢\u0006\u0002\u0010\u0014\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000\"\u0014\u0010\u0015\u001a\u00020\u00168CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\tX\u008a\u0084\u0002²\u0006\n\u0010\u001b\u001a\u00020\u001cX\u008a\u0084\u0002"}, m3636d2 = {"ChatTextInputTrailingButtonTestTag", "", "ChatTextInput", "", "value", "onValueChange", "Lkotlin/Function1;", "placeholder", "isLoading", "", "trailingIcon", "Lcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;", "trailingIconEnabled", "onTrailingIconClick", "Lkotlin/Function0;", "maxLines", "", "enabled", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Ljava/lang/String;ZLcom/robinhood/compose/bento/component/BentoTextInputs$Icon$Size24;ZLkotlin/jvm/functions/Function0;IZLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", ResourceTypes.STYLE, "Lcom/robinhood/compose/theme/style/TextInputStyle$Style;", "getStyle", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/compose/theme/style/TextInputStyle$Style;", "lib-support-chat_externalDebug", "focused", "valueColor", "Landroidx/compose/ui/graphics/Color;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.support.supportchat.ui.ChatTextInputKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class ChatTextInput {
    public static final String ChatTextInputTrailingButtonTestTag = "ChatTextInputTrailingButton";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ChatTextInput$lambda$3(String str, Function1 function1, String str2, boolean z, BentoTextInput8.Icon.Size24 size24, boolean z2, Function0 function0, int i, boolean z3, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        ChatTextInput(str, function1, str2, z, size24, z2, function0, i, z3, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0144  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x0151  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x016c  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x017f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0182  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x00ff  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0117  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void ChatTextInput(final String value, final Function1<? super String, Unit> onValueChange, final String str, final boolean z, final BentoTextInput8.Icon.Size24 size24, final boolean z2, final Function0<Unit> function0, final int i, final boolean z3, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        final String str2;
        final boolean z4;
        final boolean z5;
        final Function0<Unit> function02;
        int i5;
        int i6;
        final Modifier modifier2;
        Object objRememberedValue;
        TextInputStyle.InputState inputState;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1428161720);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(value) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(onValueChange) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            str2 = str;
        } else {
            str2 = str;
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
            z4 = z;
        } else {
            z4 = z;
            if ((i2 & 3072) == 0) {
                i4 |= composerStartRestartGroup.changed(z4) ? 2048 : 1024;
            }
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= (32768 & i2) == 0 ? composerStartRestartGroup.changed(size24) : composerStartRestartGroup.changedInstance(size24) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
            z5 = z2;
        } else {
            z5 = z2;
            if ((i2 & 196608) == 0) {
                i4 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
            }
        }
        if ((i3 & 64) != 0) {
            i4 |= 1572864;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 1572864) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
            }
        }
        if ((i3 & 128) != 0) {
            i4 |= 12582912;
        } else {
            if ((i2 & 12582912) == 0) {
                i5 = i;
                i4 |= composerStartRestartGroup.changed(i5) ? 8388608 : 4194304;
            }
            if ((i3 & 256) == 0) {
                i4 |= 100663296;
            } else if ((i2 & 100663296) == 0) {
                i4 |= composerStartRestartGroup.changed(z3) ? 67108864 : 33554432;
            }
            i6 = i3 & 512;
            if (i6 != 0) {
                if ((805306368 & i2) == 0) {
                    modifier2 = modifier;
                    i4 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
                }
                if ((i4 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
                    final Modifier modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1428161720, i4, -1, "com.robinhood.shared.support.supportchat.ui.ChatTextInput (ChatTextInput.kt:54)");
                    }
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = InteractionSource2.MutableInteractionSource();
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    final InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                    composerStartRestartGroup.endReplaceGroup();
                    final SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState = FocusInteraction3.collectIsFocusedAsState(interactionSource3, composerStartRestartGroup, 6);
                    if (z3) {
                        inputState = TextInputStyle.InputState.Disabled;
                    } else {
                        inputState = ChatTextInput$lambda$1(snapshotState4CollectIsFocusedAsState) ? TextInputStyle.InputState.Focused : TextInputStyle.InputState.Enabled;
                    }
                    SelectionColors selectionColors = new SelectionColors(getStyle(composerStartRestartGroup, 0).getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(getStyle(composerStartRestartGroup, 0).getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                    final SnapshotState4<Color> snapshotState4 = getStyle(composerStartRestartGroup, 0).getColors().getValueColor().get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
                    composer2 = composerStartRestartGroup;
                    final int i7 = i5;
                    final TextInputStyle.InputState inputState2 = inputState;
                    CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors), ComposableLambda3.rememberComposableLambda(1161961096, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatTextInputKt.ChatTextInput.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i8) {
                            if ((i8 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1161961096, i8, -1, "com.robinhood.shared.support.supportchat.ui.ChatTextInput.<anonymous> (ChatTextInput.kt:73)");
                            }
                            String str3 = value;
                            Function1<String, Unit> function1 = onValueChange;
                            Modifier modifier4 = modifier3;
                            boolean z6 = z3;
                            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(ChatTextInput.getStyle(composer3, 0).getTypography().getValueTextStyle(), ChatTextInput.ChatTextInput$lambda$2(snapshotState4), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                            KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7768getSentencesIUNYP9k(), null, 0, 0, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                            int i9 = i7;
                            VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                            InteractionSource3 interactionSource32 = interactionSource3;
                            SolidColor solidColor = new SolidColor(ChatTextInput.getStyle(composer3, 0).getColors().m21993getCursorColor0d7_KjU(), null);
                            final TextInputStyle.InputState inputState3 = inputState2;
                            final BentoTextInput8.Icon.Size24 size242 = size24;
                            final SnapshotState4<Boolean> snapshotState42 = snapshotState4CollectIsFocusedAsState;
                            final boolean z7 = z4;
                            final boolean z8 = z5;
                            final Function0<Unit> function03 = function02;
                            final String str4 = str2;
                            final String str5 = value;
                            BasicTextFieldKt.BasicTextField(str3, (Function1<? super String, Unit>) function1, modifier4, z6, false, textStyleM7655copyp1EtxEg$default, keyboardOptions, (KeyboardActions) null, false, i9, 0, none, (Function1<? super TextLayoutResult, Unit>) null, interactionSource32, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-1429037845, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatTextInputKt.ChatTextInput.1.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* JADX WARN: Type inference failed for: r1v1 */
                                /* JADX WARN: Type inference failed for: r1v13 */
                                /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer4, int i10) {
                                    int i11;
                                    BentoTextInput8.Icon.Size24 size243;
                                    boolean z9;
                                    boolean z10;
                                    Function0<Unit> function04;
                                    int i12;
                                    Row6 row6;
                                    Modifier.Companion companion;
                                    ?? r1;
                                    long jM21427getFg30d7_KjU;
                                    Composer composer5 = composer4;
                                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                    if ((i10 & 6) == 0) {
                                        i11 = i10 | (composer5.changedInstance(innerTextField) ? 4 : 2);
                                    } else {
                                        i11 = i10;
                                    }
                                    if ((i11 & 19) == 18 && composer5.getSkipping()) {
                                        composer5.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-1429037845, i11, -1, "com.robinhood.shared.support.supportchat.ui.ChatTextInput.<anonymous>.<anonymous> (ChatTextInput.kt:86)");
                                    }
                                    Arrangement arrangement = Arrangement.INSTANCE;
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(ChatTextInput.getStyle(composer5, 0).getSpacing().m22021getVerticalSpacingD9Ej5fM());
                                    Alignment.Horizontal horizontalAlignment = ChatTextInput.getStyle(composer5, 0).getHorizontalAlignment();
                                    TextInputStyle.InputState inputState4 = inputState3;
                                    BentoTextInput8.Icon.Size24 size244 = size242;
                                    SnapshotState4<Boolean> snapshotState43 = snapshotState42;
                                    boolean z11 = z7;
                                    boolean z12 = z8;
                                    Function0<Unit> function05 = function03;
                                    int i13 = i11;
                                    String str6 = str4;
                                    String str7 = str5;
                                    Modifier.Companion companion2 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, horizontalAlignment, composer5, 0);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion2);
                                    ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                    Column6 column6 = Column6.INSTANCE;
                                    Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion2, ChatTextInput.getStyle(composer5, 0).getSizing().getBorderSize().get(ChatTextInput.ChatTextInput$lambda$1(snapshotState43), composer5, TextInputStyle.BorderSize.$stable << 3).getValue().getValue(), ChatTextInput.getStyle(composer5, 0).getColors().getBorderColor().get(inputState4, composer5, TextInputStyle.BorderColor.$stable << 3).getValue().getValue(), ChatTextInput.getStyle(composer5, 0).getSizing().getShape()), ChatTextInput.getStyle(composer5, 0).getColors().m21992getBackgroundColor0d7_KjU(), ChatTextInput.getStyle(composer5, 0).getSizing().getShape()), 0.0f, ChatTextInput.getStyle(composer5, 0).getSizing().m22011getMinHeightD9Ej5fM(), 1, null), ChatTextInput.getStyle(composer5, 0).getSpacing().getContainerHorizontalPadding().get(size244 != null, composer5, TextInputStyle.HorizontalPadding.$stable << 3).getValue().getValue(), 0.0f, 2, null);
                                    Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(ChatTextInput.getStyle(composer5, 0).getSpacing().m22018getContainerIconSpacingD9Ej5fM());
                                    Alignment.Companion companion4 = Alignment.INSTANCE;
                                    MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion4.getCenterVertically(), composer5, 48);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default);
                                    Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor2);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                    Row6 row62 = Row6.INSTANCE;
                                    Modifier modifierWeight$default = Row5.weight$default(row62, companion2, 1.0f, false, 2, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenterStart(), false);
                                    int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                    CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, modifierWeight$default);
                                    Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor3);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer5.startReplaceGroup(-1005334122);
                                    if (str6 == null || StringsKt.isBlank(str6) || str7.length() != 0) {
                                        size243 = size244;
                                        z9 = z11;
                                        z10 = z12;
                                        function04 = function05;
                                        i12 = i13;
                                        row6 = row62;
                                        companion = companion2;
                                        r1 = 0;
                                    } else {
                                        size243 = size244;
                                        z9 = z11;
                                        z10 = z12;
                                        function04 = function05;
                                        i12 = i13;
                                        r1 = 0;
                                        row6 = row62;
                                        companion = companion2;
                                        BentoText2.m20747BentoText38GnDrw(str6, null, ChatTextInput.getStyle(composer5, 0).getColors().getPlaceholderColor().get(inputState4, composer5, TextInputStyle.PlaceholderColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, ChatTextInput.getStyle(composer5, 0).getTypography().getValueTextStyle(), composer4, 0, 0, 8186);
                                        composer5 = composer4;
                                    }
                                    composer5.endReplaceGroup();
                                    Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, ChatTextInput.getStyle(composer5, r1).getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), r1);
                                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer5, r1);
                                    CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default2);
                                    Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                    if (composer5.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer5.startReusableNode();
                                    if (composer5.getInserting()) {
                                        composer5.createNode(constructor4);
                                    } else {
                                        composer5.useNode();
                                    }
                                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer5);
                                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                                    innerTextField.invoke(composer5, Integer.valueOf(i12 & 14));
                                    composer5.endNode();
                                    composer5.endNode();
                                    if (z9) {
                                        composer5.startReplaceGroup(-455613341);
                                        BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(row6.align(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, ChatTextInput.getStyle(composer5, r1).getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null), companion4.getBottom()), BentoProgressIndicator3.f5151S, 0L, composer5, 48, 4);
                                        composer5.endReplaceGroup();
                                    } else {
                                        Row6 row63 = row6;
                                        if (size243 != null) {
                                            composer5.startReplaceGroup(-455108630);
                                            Modifier modifierAlign = row63.align(PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion, ChatTextInput.ChatTextInputTrailingButtonTestTag), 0.0f, ChatTextInput.getStyle(composer5, r1).getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null), companion4.getBottom());
                                            BentoIcon4.Size24 size245 = new BentoIcon4.Size24(size243.getAsset());
                                            if (z10) {
                                                composer5.startReplaceGroup(-454553358);
                                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).getPrime();
                                                composer5.endReplaceGroup();
                                            } else {
                                                composer5.startReplaceGroup(-454453228);
                                                jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21427getFg30d7_KjU();
                                                composer5.endReplaceGroup();
                                            }
                                            Composer composer6 = composer5;
                                            BentoIcon2.m20644BentoIconFU0evQE(size245, null, jM21427getFg30d7_KjU, modifierAlign, z10 ? function04 : null, false, composer6, BentoIcon4.Size24.$stable | 48, 32);
                                            composer5 = composer6;
                                            composer5.endReplaceGroup();
                                        } else {
                                            composer5.startReplaceGroup(-454210095);
                                            composer5.endReplaceGroup();
                                        }
                                    }
                                    composer5.endNode();
                                    composer5.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer3, 54), composer3, 102236160, 199728, 5264);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier2 = modifier3;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.support.supportchat.ui.ChatTextInputKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ChatTextInput.ChatTextInput$lambda$3(value, onValueChange, str, z, size24, z2, function0, i, z3, modifier2, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i4 |= 805306368;
            modifier2 = modifier;
            if ((i4 & 306783379) != 306783378) {
                if (i6 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                }
                final InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                final SnapshotState4<Boolean> snapshotState4CollectIsFocusedAsState2 = FocusInteraction3.collectIsFocusedAsState(interactionSource32, composerStartRestartGroup, 6);
                if (z3) {
                }
                SelectionColors selectionColors2 = new SelectionColors(getStyle(composerStartRestartGroup, 0).getColors().m21993getCursorColor0d7_KjU(), Color.m6705copywmQWz5c$default(getStyle(composerStartRestartGroup, 0).getColors().m21993getCursorColor0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                final SnapshotState4<Color> snapshotState42 = getStyle(composerStartRestartGroup, 0).getColors().getValueColor().get(inputState, composerStartRestartGroup, TextInputStyle.StateColor.$stable << 3);
                composer2 = composerStartRestartGroup;
                final int i72 = i5;
                final TextInputStyle.InputState inputState22 = inputState;
                CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors2), ComposableLambda3.rememberComposableLambda(1161961096, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatTextInputKt.ChatTextInput.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1161961096, i8, -1, "com.robinhood.shared.support.supportchat.ui.ChatTextInput.<anonymous> (ChatTextInput.kt:73)");
                        }
                        String str3 = value;
                        Function1<String, Unit> function1 = onValueChange;
                        Modifier modifier4 = modifier3;
                        boolean z6 = z3;
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(ChatTextInput.getStyle(composer3, 0).getTypography().getValueTextStyle(), ChatTextInput.ChatTextInput$lambda$2(snapshotState42), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                        KeyboardOptions keyboardOptions = new KeyboardOptions(KeyboardCapitalization.INSTANCE.m7768getSentencesIUNYP9k(), null, 0, 0, null, null, null, EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, null);
                        int i9 = i72;
                        VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                        InteractionSource3 interactionSource322 = interactionSource32;
                        SolidColor solidColor = new SolidColor(ChatTextInput.getStyle(composer3, 0).getColors().m21993getCursorColor0d7_KjU(), null);
                        final TextInputStyle.InputState inputState3 = inputState22;
                        final BentoTextInput8.Icon.Size24 size242 = size24;
                        final SnapshotState4<Boolean> snapshotState422 = snapshotState4CollectIsFocusedAsState2;
                        final boolean z7 = z4;
                        final boolean z8 = z5;
                        final Function0<Unit> function03 = function02;
                        final String str4 = str2;
                        final String str5 = value;
                        BasicTextFieldKt.BasicTextField(str3, (Function1<? super String, Unit>) function1, modifier4, z6, false, textStyleM7655copyp1EtxEg$default, keyboardOptions, (KeyboardActions) null, false, i9, 0, none, (Function1<? super TextLayoutResult, Unit>) null, interactionSource322, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-1429037845, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.shared.support.supportchat.ui.ChatTextInputKt.ChatTextInput.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer4, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* JADX WARN: Type inference failed for: r1v1 */
                            /* JADX WARN: Type inference failed for: r1v13 */
                            /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer4, int i10) {
                                int i11;
                                BentoTextInput8.Icon.Size24 size243;
                                boolean z9;
                                boolean z10;
                                Function0<Unit> function04;
                                int i12;
                                Row6 row6;
                                Modifier.Companion companion;
                                ?? r1;
                                long jM21427getFg30d7_KjU;
                                Composer composer5 = composer4;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                if ((i10 & 6) == 0) {
                                    i11 = i10 | (composer5.changedInstance(innerTextField) ? 4 : 2);
                                } else {
                                    i11 = i10;
                                }
                                if ((i11 & 19) == 18 && composer5.getSkipping()) {
                                    composer5.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-1429037845, i11, -1, "com.robinhood.shared.support.supportchat.ui.ChatTextInput.<anonymous>.<anonymous> (ChatTextInput.kt:86)");
                                }
                                Arrangement arrangement = Arrangement.INSTANCE;
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(ChatTextInput.getStyle(composer5, 0).getSpacing().m22021getVerticalSpacingD9Ej5fM());
                                Alignment.Horizontal horizontalAlignment = ChatTextInput.getStyle(composer5, 0).getHorizontalAlignment();
                                TextInputStyle.InputState inputState4 = inputState3;
                                BentoTextInput8.Icon.Size24 size244 = size242;
                                SnapshotState4<Boolean> snapshotState43 = snapshotState422;
                                boolean z11 = z7;
                                boolean z12 = z8;
                                Function0<Unit> function05 = function03;
                                int i13 = i11;
                                String str6 = str4;
                                String str7 = str5;
                                Modifier.Companion companion2 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, horizontalAlignment, composer5, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer5, companion2);
                                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion3.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion2, ChatTextInput.getStyle(composer5, 0).getSizing().getBorderSize().get(ChatTextInput.ChatTextInput$lambda$1(snapshotState43), composer5, TextInputStyle.BorderSize.$stable << 3).getValue().getValue(), ChatTextInput.getStyle(composer5, 0).getColors().getBorderColor().get(inputState4, composer5, TextInputStyle.BorderColor.$stable << 3).getValue().getValue(), ChatTextInput.getStyle(composer5, 0).getSizing().getShape()), ChatTextInput.getStyle(composer5, 0).getColors().m21992getBackgroundColor0d7_KjU(), ChatTextInput.getStyle(composer5, 0).getSizing().getShape()), 0.0f, ChatTextInput.getStyle(composer5, 0).getSizing().m22011getMinHeightD9Ej5fM(), 1, null), ChatTextInput.getStyle(composer5, 0).getSpacing().getContainerHorizontalPadding().get(size244 != null, composer5, TextInputStyle.HorizontalPadding.$stable << 3).getValue().getValue(), 0.0f, 2, null);
                                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_42 = arrangement.m5089spacedBy0680j_4(ChatTextInput.getStyle(composer5, 0).getSpacing().m22018getContainerIconSpacingD9Ej5fM());
                                Alignment.Companion companion4 = Alignment.INSTANCE;
                                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_42, companion4.getCenterVertically(), composer5, 48);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default);
                                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor2);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                Modifier modifierWeight$default = Row5.weight$default(row62, companion2, 1.0f, false, 2, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getCenterStart(), false);
                                int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer5, 0);
                                CompositionLocalMap currentCompositionLocalMap3 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer5, modifierWeight$default);
                                Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor3);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer5.startReplaceGroup(-1005334122);
                                if (str6 == null || StringsKt.isBlank(str6) || str7.length() != 0) {
                                    size243 = size244;
                                    z9 = z11;
                                    z10 = z12;
                                    function04 = function05;
                                    i12 = i13;
                                    row6 = row62;
                                    companion = companion2;
                                    r1 = 0;
                                } else {
                                    size243 = size244;
                                    z9 = z11;
                                    z10 = z12;
                                    function04 = function05;
                                    i12 = i13;
                                    r1 = 0;
                                    row6 = row62;
                                    companion = companion2;
                                    BentoText2.m20747BentoText38GnDrw(str6, null, ChatTextInput.getStyle(composer5, 0).getColors().getPlaceholderColor().get(inputState4, composer5, TextInputStyle.PlaceholderColor.$stable << 3).getValue(), null, null, null, null, 0, false, 0, 0, null, 0, ChatTextInput.getStyle(composer5, 0).getTypography().getValueTextStyle(), composer4, 0, 0, 8186);
                                    composer5 = composer4;
                                }
                                composer5.endReplaceGroup();
                                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, ChatTextInput.getStyle(composer5, r1).getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion4.getTopStart(), r1);
                                int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composer5, r1);
                                CompositionLocalMap currentCompositionLocalMap4 = composer5.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composer5, modifierM5144paddingVpY3zN4$default2);
                                Function0<ComposeUiNode> constructor4 = companion3.getConstructor();
                                if (composer5.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer5.startReusableNode();
                                if (composer5.getInserting()) {
                                    composer5.createNode(constructor4);
                                } else {
                                    composer5.useNode();
                                }
                                Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composer5);
                                Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyMaybeCachedBoxMeasurePolicy2, companion3.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion3.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion3.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                                    composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                                    composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion3.getSetModifier());
                                innerTextField.invoke(composer5, Integer.valueOf(i12 & 14));
                                composer5.endNode();
                                composer5.endNode();
                                if (z9) {
                                    composer5.startReplaceGroup(-455613341);
                                    BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(row6.align(PaddingKt.m5144paddingVpY3zN4$default(companion, 0.0f, ChatTextInput.getStyle(composer5, r1).getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null), companion4.getBottom()), BentoProgressIndicator3.f5151S, 0L, composer5, 48, 4);
                                    composer5.endReplaceGroup();
                                } else {
                                    Row6 row63 = row6;
                                    if (size243 != null) {
                                        composer5.startReplaceGroup(-455108630);
                                        Modifier modifierAlign = row63.align(PaddingKt.m5144paddingVpY3zN4$default(TestTag3.testTag(companion, ChatTextInput.ChatTextInputTrailingButtonTestTag), 0.0f, ChatTextInput.getStyle(composer5, r1).getSpacing().m22019getContainerVerticalPaddingD9Ej5fM(), 1, null), companion4.getBottom());
                                        BentoIcon4.Size24 size245 = new BentoIcon4.Size24(size243.getAsset());
                                        if (z10) {
                                            composer5.startReplaceGroup(-454553358);
                                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).getPrime();
                                            composer5.endReplaceGroup();
                                        } else {
                                            composer5.startReplaceGroup(-454453228);
                                            jM21427getFg30d7_KjU = BentoTheme.INSTANCE.getColors(composer5, BentoTheme.$stable).m21427getFg30d7_KjU();
                                            composer5.endReplaceGroup();
                                        }
                                        Composer composer6 = composer5;
                                        BentoIcon2.m20644BentoIconFU0evQE(size245, null, jM21427getFg30d7_KjU, modifierAlign, z10 ? function04 : null, false, composer6, BentoIcon4.Size24.$stable | 48, 32);
                                        composer5 = composer6;
                                        composer5.endReplaceGroup();
                                    } else {
                                        composer5.startReplaceGroup(-454210095);
                                        composer5.endReplaceGroup();
                                    }
                                }
                                composer5.endNode();
                                composer5.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), composer3, 102236160, 199728, 5264);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54), composer2, ProvidedValue.$stable | 48);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier2 = modifier3;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i5 = i;
        if ((i3 & 256) == 0) {
        }
        i6 = i3 & 512;
        if (i6 != 0) {
        }
        modifier2 = modifier;
        if ((i4 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean ChatTextInput$lambda$1(SnapshotState4<Boolean> snapshotState4) {
        return snapshotState4.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long ChatTextInput$lambda$2(SnapshotState4<Color> snapshotState4) {
        return snapshotState4.getValue().getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    @JvmName
    public static final TextInputStyle.Style getStyle(Composer composer, int i) {
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1483970049, i, -1, "com.robinhood.shared.support.supportchat.ui.<get-style> (ChatTextInput.kt:165)");
        }
        float f = 8;
        TextInputStyle.Sizing sizing = new TextInputStyle.Sizing(RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f)), new TextInputStyle.BorderSize(C2002Dp.m7995constructorimpl(1), C2002Dp.m7995constructorimpl(2), null), C2002Dp.m7995constructorimpl(44), null);
        float f2 = 16;
        TextInputStyle.Spacing spacing = new TextInputStyle.Spacing(new TextInputStyle.HorizontalPadding(C2002Dp.m7995constructorimpl(f2), C2002Dp.m7995constructorimpl(f2), null), C2002Dp.m7995constructorimpl(10), C2002Dp.m7995constructorimpl(f), C2002Dp.m7995constructorimpl(4), C2002Dp.m7995constructorimpl(f), null);
        BentoTheme bentoTheme = BentoTheme.INSTANCE;
        int i2 = BentoTheme.$stable;
        TextStyle textM = bentoTheme.getTypography(composer, i2).getTextM();
        FontWeight.Companion companion = FontWeight.INSTANCE;
        TextInputStyle.Style style = new TextInputStyle.Style(sizing, spacing, new TextInputStyle.Typography(TextStyle.m7655copyp1EtxEg$default(textM, 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, i2).getTextM(), TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), 0L, 0L, companion.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), bentoTheme.getTypography(composer, i2).getTextM(), bentoTheme.getTypography(composer, i2).getTextM()), new TextInputStyle.Colors(new TextInputStyle.StateColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null), new TextInputStyle.BorderColor(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21456getPositive0d7_KjU(), bentoTheme.getColors(composer, i2).m21452getNegative0d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null), new TextInputStyle.PlaceholderColor(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21373getBg30d7_KjU(), null), new TextInputStyle.StateColor(bentoTheme.getColors(composer, i2).m21426getFg20d7_KjU(), bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU(), null), Color.INSTANCE.m6725getTransparent0d7_KjU(), bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU(), null), Alignment.INSTANCE.getStart());
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        return style;
    }
}
