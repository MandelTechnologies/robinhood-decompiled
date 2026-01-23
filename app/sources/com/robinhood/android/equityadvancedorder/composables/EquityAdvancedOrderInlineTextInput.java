package com.robinhood.android.equityadvancedorder.composables;

import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.interaction.PressInteraction2;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.TextFieldValue;
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
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInput;
import com.robinhood.compose.bento.component.numpad.BentoNumpadTextInputFormatter;
import com.robinhood.compose.bento.theme.BentoTheme;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function5;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.StringsKt;

/* compiled from: EquityAdvancedOrderInlineTextInput.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\u0006\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0005\u001a\u00020\u0003H\u0003¢\u0006\u0004\b\u0006\u0010\u0007\u001as\u0010\u0016\u001a\u00020\u00012\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\b\u001a\u0004\u0018\u00010\u00032\b\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0014\u0010\u0015\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0014\u0012\u0004\u0012\u00020\u00010\u0013H\u0001¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m3636d2 = {"Lkotlin/Function0;", "", "innerTextField", "", "placeholder", "value", "DecorationBox", "(Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "initialValue", "textFieldId", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "bentoNumpadScopeV2", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;", "numberDisplayFormatter", "onClick", "", "error", "Landroidx/compose/ui/Modifier;", "modifier", "Lkotlin/Function1;", "Ljava/math/BigDecimal;", "onNumberChange", "EquityAdvancedOrderInlineTextInput", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadTextInputFormatter;Lkotlin/jvm/functions/Function0;ZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class EquityAdvancedOrderInlineTextInput {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$2(Function2 function2, String str, String str2, int i, Composer composer, int i2) {
        DecorationBox(function2, str, str2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EquityAdvancedOrderInlineTextInput$lambda$3(String str, String str2, String str3, BentoNumpadScopeV2 bentoNumpadScopeV2, BentoNumpadTextInputFormatter bentoNumpadTextInputFormatter, Function0 function0, boolean z, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        EquityAdvancedOrderInlineTextInput(str, str2, str3, bentoNumpadScopeV2, bentoNumpadTextInputFormatter, function0, z, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void DecorationBox(Function2<? super Composer, ? super Integer, Unit> function2, final String str, final String str2, Composer composer, final int i) {
        int i2;
        int i3;
        Modifier.Companion companion;
        final Function2<? super Composer, ? super Integer, Unit> function22;
        Composer composerStartRestartGroup = composer.startRestartGroup(1635463328);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1635463328, i2, -1, "com.robinhood.android.equityadvancedorder.composables.DecorationBox (EquityAdvancedOrderInlineTextInput.kt:31)");
            }
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment centerEnd = companion2.getCenterEnd();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion3);
            ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion4.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1126400682);
            if (str == null || StringsKt.isBlank(str) || !StringsKt.isBlank(str2)) {
                i3 = i2;
                companion = companion3;
            } else {
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i4 = BentoTheme.$stable;
                i3 = i2;
                companion = companion3;
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21427getFg30d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), composerStartRestartGroup, (i2 >> 3) & 14, 0, 8186);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(Intrinsic3.width(companion, Intrinsic4.Min), C2002Dp.m7995constructorimpl(2), 0.0f, 2, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterEnd(), false);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5155defaultMinSizeVpY3zN4$default);
            Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor2);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
            function22 = function2;
            function22.invoke(composerStartRestartGroup, Integer.valueOf(i3 & 14));
            composerStartRestartGroup.endNode();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            function22 = function2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EquityAdvancedOrderInlineTextInput.DecorationBox$lambda$2(function22, str, str2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x012b  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0134  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00e9  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EquityAdvancedOrderInlineTextInput(final String str, final String str2, final String str3, final BentoNumpadScopeV2 bentoNumpadScopeV2, final BentoNumpadTextInputFormatter numberDisplayFormatter, final Function0<Unit> onClick, final boolean z, Modifier modifier, final Function1<? super BigDecimal, Unit> onNumberChange, Composer composer, final int i, final int i2) {
        String str4;
        int i3;
        String str5;
        String str6;
        boolean z2;
        int i4;
        Modifier modifier2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(bentoNumpadScopeV2, "bentoNumpadScopeV2");
        Intrinsics.checkNotNullParameter(numberDisplayFormatter, "numberDisplayFormatter");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(onNumberChange, "onNumberChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1018542967);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            str4 = str;
        } else if ((i & 6) == 0) {
            str4 = str;
            i3 = (composerStartRestartGroup.changed(str4) ? 4 : 2) | i;
        } else {
            str4 = str;
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                str5 = str2;
                i3 |= composerStartRestartGroup.changed(str5) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else {
                if ((i & 384) == 0) {
                    str6 = str3;
                    i3 |= composerStartRestartGroup.changed(str6) ? 256 : 128;
                }
                if ((i2 & 8) != 0) {
                    i3 |= 3072;
                } else if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(bentoNumpadScopeV2) ? 2048 : 1024;
                }
                if ((i2 & 16) != 0) {
                    i3 |= 24576;
                } else if ((i & 24576) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(numberDisplayFormatter) ? 16384 : 8192;
                }
                if ((i2 & 32) != 0) {
                    i3 |= 196608;
                } else if ((i & 196608) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(onClick) ? 131072 : 65536;
                }
                if ((i2 & 64) != 0) {
                    i3 |= 1572864;
                } else {
                    if ((i & 1572864) == 0) {
                        z2 = z;
                        i3 |= composerStartRestartGroup.changed(z2) ? 1048576 : 524288;
                    }
                    i4 = i2 & 128;
                    if (i4 != 0) {
                        if ((12582912 & i) == 0) {
                            modifier2 = modifier;
                            i3 |= composerStartRestartGroup.changed(modifier2) ? 8388608 : 4194304;
                        }
                        if ((i2 & 256) != 0) {
                            i3 |= 100663296;
                        } else if ((i & 100663296) == 0) {
                            i3 |= composerStartRestartGroup.changedInstance(onNumberChange) ? 67108864 : 33554432;
                        }
                        if ((38347923 & i3) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                            if (i4 != 0) {
                                modifier2 = Modifier.INSTANCE;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1018542967, i3, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput (EquityAdvancedOrderInlineTextInput.kt:63)");
                            }
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i5 = BentoTheme.$stable;
                            final String str7 = str4;
                            final String str8 = str5;
                            final String str9 = str6;
                            final boolean z3 = z2;
                            modifier3 = modifier2;
                            CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(bentoTheme.getColors(composerStartRestartGroup, i5).m21368getAccent0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i5).m21368getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null)), ComposableLambda3.rememberComposableLambda(-150664887, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt.EquityAdvancedOrderInlineTextInput.1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                    invoke(composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer2, int i6) {
                                    if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                        composer2.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-150664887, i6, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput.<anonymous> (EquityAdvancedOrderInlineTextInput.kt:71)");
                                    }
                                    BentoNumpadTextInput.BentoNumpadTextInput(bentoNumpadScopeV2, onNumberChange, str9, str8, false, numberDisplayFormatter, true, ComposableLambda3.rememberComposableLambda(-327785152, true, new AnonymousClass1(onClick, z3, modifier3, str7), composer2, 54), composer2, 14155776, 8);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* compiled from: EquityAdvancedOrderInlineTextInput.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt$EquityAdvancedOrderInlineTextInput$1$1, reason: invalid class name */
                                static final class AnonymousClass1 implements Function5<TextFieldValue, InteractionSource3, Function1<? super TextFieldValue, ? extends Unit>, Composer, Integer, Unit> {
                                    final /* synthetic */ boolean $error;
                                    final /* synthetic */ Modifier $modifier;
                                    final /* synthetic */ Function0<Unit> $onClick;
                                    final /* synthetic */ String $placeholder;

                                    AnonymousClass1(Function0<Unit> function0, boolean z, Modifier modifier, String str) {
                                        this.$onClick = function0;
                                        this.$error = z;
                                        this.$modifier = modifier;
                                        this.$placeholder = str;
                                    }

                                    @Override // kotlin.jvm.functions.Function5
                                    public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue, InteractionSource3 interactionSource3, Function1<? super TextFieldValue, ? extends Unit> function1, Composer composer, Integer num) {
                                        invoke(textFieldValue, interactionSource3, (Function1<? super TextFieldValue, Unit>) function1, composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(final TextFieldValue value, InteractionSource3 interactionSource, final Function1<? super TextFieldValue, Unit> onValueChange, Composer composer, int i) {
                                        int i2;
                                        long jM21425getFg0d7_KjU;
                                        Intrinsics.checkNotNullParameter(value, "value");
                                        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
                                        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
                                        if ((i & 6) == 0) {
                                            i2 = (composer.changed(value) ? 4 : 2) | i;
                                        } else {
                                            i2 = i;
                                        }
                                        if ((i & 48) == 0) {
                                            i2 |= composer.changed(interactionSource) ? 32 : 16;
                                        }
                                        if ((i & 384) == 0) {
                                            i2 |= composer.changedInstance(onValueChange) ? 256 : 128;
                                        }
                                        if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                                            composer.skipToGroupEnd();
                                            return;
                                        }
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(-327785152, i2, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput.<anonymous>.<anonymous> (EquityAdvancedOrderInlineTextInput.kt:78)");
                                        }
                                        if (PressInteraction2.collectIsPressedAsState(interactionSource, composer, (i2 >> 3) & 14).getValue().booleanValue()) {
                                            this.$onClick.invoke();
                                        }
                                        KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), 0, null, 0, ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 119, null);
                                        VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                        int i3 = BentoTheme.$stable;
                                        SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i3).m21368getAccent0d7_KjU(), null);
                                        TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
                                        if (this.$error) {
                                            composer.startReplaceGroup(1709182256);
                                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21452getNegative0d7_KjU();
                                            composer.endReplaceGroup();
                                        } else {
                                            composer.startReplaceGroup(1709269366);
                                            jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                                            composer.endReplaceGroup();
                                        }
                                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, jM21425getFg0d7_KjU, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
                                        composer.startReplaceGroup(5004770);
                                        boolean z = (i2 & 896) == 256;
                                        Object objRememberedValue = composer.rememberedValue();
                                        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt$EquityAdvancedOrderInlineTextInput$1$1$$ExternalSyntheticLambda0
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return EquityAdvancedOrderInlineTextInput.C153021.AnonymousClass1.invoke$lambda$1$lambda$0(onValueChange, (TextFieldValue) obj);
                                                }
                                            };
                                            composer.updateRememberedValue(objRememberedValue);
                                        }
                                        composer.endReplaceGroup();
                                        Modifier modifier = this.$modifier;
                                        final String str = this.$placeholder;
                                        BasicTextFieldKt.BasicTextField(value, (Function1<? super TextFieldValue, Unit>) objRememberedValue, modifier, true, false, textStyleM7655copyp1EtxEg$default, keyboardOptionsM5353copyINvB4aQ$default, (KeyboardActions) null, false, 1, 0, none, (Function1<? super TextLayoutResult, Unit>) null, interactionSource, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-1057280349, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt.EquityAdvancedOrderInlineTextInput.1.1.2
                                            @Override // kotlin.jvm.functions.Function3
                                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i4) {
                                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                                if ((i4 & 6) == 0) {
                                                    i4 |= composer2.changedInstance(innerTextField) ? 4 : 2;
                                                }
                                                if ((i4 & 19) == 18 && composer2.getSkipping()) {
                                                    composer2.skipToGroupEnd();
                                                    return;
                                                }
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventStart(-1057280349, i4, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput.<anonymous>.<anonymous>.<anonymous> (EquityAdvancedOrderInlineTextInput.kt:104)");
                                                }
                                                EquityAdvancedOrderInlineTextInput.DecorationBox(innerTextField, str, value.getText(), composer2, i4 & 14);
                                                if (ComposerKt.isTraceInProgress()) {
                                                    ComposerKt.traceEventEnd();
                                                }
                                            }
                                        }, composer, 54), composer, (i2 & 14) | 905972736, ((i2 << 6) & 7168) | 196656, 5264);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(Function1 function1, TextFieldValue newValue) {
                                        Intrinsics.checkNotNullParameter(newValue, "newValue");
                                        function1.invoke(newValue);
                                        return Unit.INSTANCE;
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return EquityAdvancedOrderInlineTextInput.EquityAdvancedOrderInlineTextInput$lambda$3(str, str2, str3, bentoNumpadScopeV2, numberDisplayFormatter, onClick, z, modifier3, onNumberChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 12582912;
                    modifier2 = modifier;
                    if ((i2 & 256) != 0) {
                    }
                    if ((38347923 & i3) != 38347922) {
                        if (i4 != 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i52 = BentoTheme.$stable;
                        final String str72 = str4;
                        final String str82 = str5;
                        final String str92 = str6;
                        final boolean z32 = z2;
                        modifier3 = modifier2;
                        CompositionLocal3.CompositionLocalProvider(TextSelectionColors2.getLocalTextSelectionColors().provides(new SelectionColors(bentoTheme2.getColors(composerStartRestartGroup, i52).m21368getAccent0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i52).m21368getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null)), ComposableLambda3.rememberComposableLambda(-150664887, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt.EquityAdvancedOrderInlineTextInput.1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                                invoke(composer2, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(Composer composer2, int i6) {
                                if ((i6 & 3) == 2 && composer2.getSkipping()) {
                                    composer2.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-150664887, i6, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput.<anonymous> (EquityAdvancedOrderInlineTextInput.kt:71)");
                                }
                                BentoNumpadTextInput.BentoNumpadTextInput(bentoNumpadScopeV2, onNumberChange, str92, str82, false, numberDisplayFormatter, true, ComposableLambda3.rememberComposableLambda(-327785152, true, new AnonymousClass1(onClick, z32, modifier3, str72), composer2, 54), composer2, 14155776, 8);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            /* compiled from: EquityAdvancedOrderInlineTextInput.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt$EquityAdvancedOrderInlineTextInput$1$1, reason: invalid class name */
                            static final class AnonymousClass1 implements Function5<TextFieldValue, InteractionSource3, Function1<? super TextFieldValue, ? extends Unit>, Composer, Integer, Unit> {
                                final /* synthetic */ boolean $error;
                                final /* synthetic */ Modifier $modifier;
                                final /* synthetic */ Function0<Unit> $onClick;
                                final /* synthetic */ String $placeholder;

                                AnonymousClass1(Function0<Unit> function0, boolean z, Modifier modifier, String str) {
                                    this.$onClick = function0;
                                    this.$error = z;
                                    this.$modifier = modifier;
                                    this.$placeholder = str;
                                }

                                @Override // kotlin.jvm.functions.Function5
                                public /* bridge */ /* synthetic */ Unit invoke(TextFieldValue textFieldValue, InteractionSource3 interactionSource3, Function1<? super TextFieldValue, ? extends Unit> function1, Composer composer, Integer num) {
                                    invoke(textFieldValue, interactionSource3, (Function1<? super TextFieldValue, Unit>) function1, composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(final TextFieldValue value, InteractionSource3 interactionSource, final Function1 onValueChange, Composer composer, int i) {
                                    int i2;
                                    long jM21425getFg0d7_KjU;
                                    Intrinsics.checkNotNullParameter(value, "value");
                                    Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
                                    Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
                                    if ((i & 6) == 0) {
                                        i2 = (composer.changed(value) ? 4 : 2) | i;
                                    } else {
                                        i2 = i;
                                    }
                                    if ((i & 48) == 0) {
                                        i2 |= composer.changed(interactionSource) ? 32 : 16;
                                    }
                                    if ((i & 384) == 0) {
                                        i2 |= composer.changedInstance(onValueChange) ? 256 : 128;
                                    }
                                    if ((i2 & 1171) == 1170 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-327785152, i2, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput.<anonymous>.<anonymous> (EquityAdvancedOrderInlineTextInput.kt:78)");
                                    }
                                    if (PressInteraction2.collectIsPressedAsState(interactionSource, composer, (i2 >> 3) & 14).getValue().booleanValue()) {
                                        this.$onClick.invoke();
                                    }
                                    KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), 0, null, 0, ImeAction.INSTANCE.m7749getNexteUduSuo(), null, null, null, 119, null);
                                    VisualTransformation none = VisualTransformation.INSTANCE.getNone();
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i3 = BentoTheme.$stable;
                                    SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i3).m21368getAccent0d7_KjU(), null);
                                    TextStyle textM = bentoTheme.getTypography(composer, i3).getTextM();
                                    if (this.$error) {
                                        composer.startReplaceGroup(1709182256);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21452getNegative0d7_KjU();
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(1709269366);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i3).m21425getFg0d7_KjU();
                                        composer.endReplaceGroup();
                                    }
                                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(textM, jM21425getFg0d7_KjU, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
                                    composer.startReplaceGroup(5004770);
                                    boolean z = (i2 & 896) == 256;
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt$EquityAdvancedOrderInlineTextInput$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return EquityAdvancedOrderInlineTextInput.C153021.AnonymousClass1.invoke$lambda$1$lambda$0(onValueChange, (TextFieldValue) obj);
                                            }
                                        };
                                        composer.updateRememberedValue(objRememberedValue);
                                    }
                                    composer.endReplaceGroup();
                                    Modifier modifier = this.$modifier;
                                    final String str = this.$placeholder;
                                    BasicTextFieldKt.BasicTextField(value, (Function1<? super TextFieldValue, Unit>) objRememberedValue, modifier, true, false, textStyleM7655copyp1EtxEg$default, keyboardOptionsM5353copyINvB4aQ$default, (KeyboardActions) null, false, 1, 0, none, (Function1<? super TextLayoutResult, Unit>) null, interactionSource, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-1057280349, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInputKt.EquityAdvancedOrderInlineTextInput.1.1.2
                                        @Override // kotlin.jvm.functions.Function3
                                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                                            return Unit.INSTANCE;
                                        }

                                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i4) {
                                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                            if ((i4 & 6) == 0) {
                                                i4 |= composer2.changedInstance(innerTextField) ? 4 : 2;
                                            }
                                            if ((i4 & 19) == 18 && composer2.getSkipping()) {
                                                composer2.skipToGroupEnd();
                                                return;
                                            }
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventStart(-1057280349, i4, -1, "com.robinhood.android.equityadvancedorder.composables.EquityAdvancedOrderInlineTextInput.<anonymous>.<anonymous>.<anonymous> (EquityAdvancedOrderInlineTextInput.kt:104)");
                                            }
                                            EquityAdvancedOrderInlineTextInput.DecorationBox(innerTextField, str, value.getText(), composer2, i4 & 14);
                                            if (ComposerKt.isTraceInProgress()) {
                                                ComposerKt.traceEventEnd();
                                            }
                                        }
                                    }, composer, 54), composer, (i2 & 14) | 905972736, ((i2 << 6) & 7168) | 196656, 5264);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                /* JADX INFO: Access modifiers changed from: private */
                                public static final Unit invoke$lambda$1$lambda$0(Function1 function1, TextFieldValue newValue) {
                                    Intrinsics.checkNotNullParameter(newValue, "newValue");
                                    function1.invoke(newValue);
                                    return Unit.INSTANCE;
                                }
                            }
                        }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                        if (ComposerKt.isTraceInProgress()) {
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                z2 = z;
                i4 = i2 & 128;
                if (i4 != 0) {
                }
                modifier2 = modifier;
                if ((i2 & 256) != 0) {
                }
                if ((38347923 & i3) != 38347922) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            str6 = str3;
            if ((i2 & 8) != 0) {
            }
            if ((i2 & 16) != 0) {
            }
            if ((i2 & 32) != 0) {
            }
            if ((i2 & 64) != 0) {
            }
            z2 = z;
            i4 = i2 & 128;
            if (i4 != 0) {
            }
            modifier2 = modifier;
            if ((i2 & 256) != 0) {
            }
            if ((38347923 & i3) != 38347922) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str5 = str2;
        if ((i2 & 4) == 0) {
        }
        str6 = str3;
        if ((i2 & 8) != 0) {
        }
        if ((i2 & 16) != 0) {
        }
        if ((i2 & 32) != 0) {
        }
        if ((i2 & 64) != 0) {
        }
        z2 = z;
        i4 = i2 & 128;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i2 & 256) != 0) {
        }
        if ((38347923 & i3) != 38347922) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
