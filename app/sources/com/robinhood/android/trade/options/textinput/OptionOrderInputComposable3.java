package com.robinhood.android.trade.options.textinput;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.interaction.InteractionSource3;
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
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.input.key.KeyEvent;
import androidx.compose.p011ui.input.key.KeyInputModifier2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextRange;
import androidx.compose.p011ui.text.TextRange2;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.trade.options.textinput.OptionOrderInputComposable3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import java.io.IOException;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: OptionOrderInputComposable.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aa\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u00062\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"OptionOrderInputComposable", "", "rawValue", "", "rawHint", "enabled", "", "inputType", "Lcom/robinhood/android/trade/options/textinput/InputType;", "shouldRequestFocus", "onInputFocused", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onValueChange", "Lkotlin/Function1;", "(Ljava/lang/String;Ljava/lang/String;ZLcom/robinhood/android/trade/options/textinput/InputType;ZLkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-trade-options_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class OptionOrderInputComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit OptionOrderInputComposable$lambda$2(String str, String str2, boolean z, OptionOrderInputComposable2 optionOrderInputComposable2, boolean z2, Function0 function0, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) throws Resources.NotFoundException, IOException {
        OptionOrderInputComposable(str, str2, z, optionOrderInputComposable2, z2, function0, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x01f7  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0161  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void OptionOrderInputComposable(final String rawValue, final String rawHint, final boolean z, final OptionOrderInputComposable2 inputType, final boolean z2, final Function0<Unit> onInputFocused, Modifier modifier, final Function1<? super String, Unit> onValueChange, Composer composer, final int i, final int i2) throws Resources.NotFoundException, IOException {
        int i3;
        final boolean z3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final FocusRequester focusRequester;
        boolean z4;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rawValue, "rawValue");
        Intrinsics.checkNotNullParameter(rawHint, "rawHint");
        Intrinsics.checkNotNullParameter(inputType, "inputType");
        Intrinsics.checkNotNullParameter(onInputFocused, "onInputFocused");
        Intrinsics.checkNotNullParameter(onValueChange, "onValueChange");
        Composer composerStartRestartGroup = composer.startRestartGroup(1830935951);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(rawValue) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(rawHint) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
            z3 = z;
        } else {
            z3 = z;
            if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changed(z3) ? 256 : 128;
            }
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changed(inputType.ordinal()) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInputFocused) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((i2 & 128) == 0) {
                i3 |= 12582912;
            } else if ((i & 12582912) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(onValueChange) ? 8388608 : 4194304;
            }
            if ((4793491 & i3) == 4793490 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1830935951, i3, -1, "com.robinhood.android.trade.options.textinput.OptionOrderInputComposable (OptionOrderInputComposable.kt:42)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                SelectionColors selectionColors = new SelectionColors(bentoTheme.getColors(composerStartRestartGroup, i5).m21368getAccent0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i5).m21368getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new FocusRequester();
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                focusRequester = (FocusRequester) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                int i6 = i3;
                String strValidate = TextInputHelper.validate(rawValue, inputType);
                Intrinsics.checkNotNull(resources);
                final String str = TextInputHelper.format(strValidate, resources, inputType);
                final String str2 = TextInputHelper.format(TextInputHelper.validate(rawHint, inputType), resources, inputType);
                final Modifier modifier4 = modifier2;
                CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors), CompositionLocalsKt.getLocalTextToolbar().provides(OptionOrderInputComposable.INSTANCE)}, ComposableLambda3.rememberComposableLambda(-1404800433, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt.OptionOrderInputComposable.1

                    /* compiled from: OptionOrderInputComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ boolean $enabled;
                        final /* synthetic */ FocusRequester $focusRequester;
                        final /* synthetic */ OptionOrderInputComposable2 $inputType;
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function1<String, Unit> $onValueChange;
                        final /* synthetic */ String $rawValue;
                        final /* synthetic */ String $validFormattedHint;
                        final /* synthetic */ String $validFormattedValue;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(String str, Modifier modifier, Function1<? super String, Unit> function1, String str2, OptionOrderInputComposable2 optionOrderInputComposable2, FocusRequester focusRequester, boolean z, String str3) {
                            this.$validFormattedValue = str;
                            this.$modifier = modifier;
                            this.$onValueChange = function1;
                            this.$rawValue = str2;
                            this.$inputType = optionOrderInputComposable2;
                            this.$focusRequester = focusRequester;
                            this.$enabled = z;
                            this.$validFormattedHint = str3;
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
                                ComposerKt.traceEventStart(478291580, i, -1, "com.robinhood.android.trade.options.textinput.OptionOrderInputComposable.<anonymous>.<anonymous> (OptionOrderInputComposable.kt:60)");
                            }
                            String str = this.$validFormattedValue;
                            TextFieldValue textFieldValue = new TextFieldValue(str, TextRange2.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
                            Modifier modifier = this.$modifier;
                            composer.startReplaceGroup(-1746271574);
                            boolean zChanged = composer.changed(this.$onValueChange) | composer.changed(this.$rawValue) | composer.changed(this.$inputType.ordinal());
                            final Function1<String, Unit> function1 = this.$onValueChange;
                            final String str2 = this.$rawValue;
                            final OptionOrderInputComposable2 optionOrderInputComposable2 = this.$inputType;
                            Object objRememberedValue = composer.rememberedValue();
                            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1<KeyEvent, Boolean>() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$1$1$1$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                        return m19484invokeZmokQxo(keyEvent.getNativeKeyEvent());
                                    }

                                    /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                    public final Boolean m19484invokeZmokQxo(android.view.KeyEvent event) {
                                        boolean z;
                                        Intrinsics.checkNotNullParameter(event, "event");
                                        if (event.getKeyCode() == 4) {
                                            z = false;
                                        } else {
                                            function1.invoke(TextInputHelper.validate(str2 + TextInputHelper.m19485getNumpadStringZmokQxo(event), optionOrderInputComposable2));
                                            z = true;
                                        }
                                        return Boolean.valueOf(z);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue);
                            }
                            composer.endReplaceGroup();
                            Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(KeyInputModifier2.onKeyEvent(modifier, (Function1) objRememberedValue), this.$focusRequester);
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i2 = BentoTheme.$stable;
                            SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU(), null);
                            TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged2 = composer.changed(this.$onValueChange) | composer.changed(this.$inputType.ordinal());
                            final Function1<String, Unit> function12 = this.$onValueChange;
                            final OptionOrderInputComposable2 optionOrderInputComposable22 = this.$inputType;
                            Object objRememberedValue2 = composer.rememberedValue();
                            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function1() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$1$1$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return OptionOrderInputComposable3.C298851.AnonymousClass1.invoke$lambda$2$lambda$1(function12, optionOrderInputComposable22, (TextFieldValue) obj);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue2);
                            }
                            composer.endReplaceGroup();
                            boolean z = this.$enabled;
                            final String str3 = this.$rawValue;
                            final String str4 = this.$validFormattedHint;
                            BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue2, modifierFocusRequester, z, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, false, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1197406687, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt.OptionOrderInputComposable.1.1.3
                                public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i3) {
                                    int i4;
                                    int i5;
                                    int i6;
                                    Modifier.Companion companion;
                                    Composer composer3 = composer2;
                                    Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                    if ((i3 & 6) == 0) {
                                        i4 = i3 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                                    } else {
                                        i4 = i3;
                                    }
                                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(1197406687, i4, -1, "com.robinhood.android.trade.options.textinput.OptionOrderInputComposable.<anonymous>.<anonymous>.<anonymous> (OptionOrderInputComposable.kt:91)");
                                    }
                                    Alignment.Companion companion2 = Alignment.INSTANCE;
                                    Alignment centerEnd = companion2.getCenterEnd();
                                    String str5 = str3;
                                    String str6 = str4;
                                    Modifier.Companion companion3 = Modifier.INSTANCE;
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion3);
                                    ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                    Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                    BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                    composer3.startReplaceGroup(1181539470);
                                    if (str5.length() == 0) {
                                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                        int i7 = BentoTheme.$stable;
                                        long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU();
                                        i5 = i4;
                                        i6 = 2;
                                        companion = companion3;
                                        BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextM(), composer2, 24576, 0, 8170);
                                        composer3 = composer2;
                                    } else {
                                        i5 = i4;
                                        i6 = 2;
                                        companion = companion3;
                                    }
                                    composer3.endReplaceGroup();
                                    Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(Intrinsic3.width(companion, Intrinsic4.Min), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 0.0f, i6, null);
                                    MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterEnd(), false);
                                    int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                    CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                    Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5155defaultMinSizeVpY3zN4$default);
                                    Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                    if (composer3.getApplier() == null) {
                                        Composables.invalidApplier();
                                    }
                                    composer3.startReusableNode();
                                    if (composer3.getInserting()) {
                                        composer3.createNode(constructor2);
                                    } else {
                                        composer3.useNode();
                                    }
                                    Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                    Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                    Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                    if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                        composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                        composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                    }
                                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                    innerTextField.invoke(composer3, Integer.valueOf(i5 & 14));
                                    composer3.endNode();
                                    composer3.endNode();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }

                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                    invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                                    return Unit.INSTANCE;
                                }
                            }, composer, 54), composer, 905969664, 196608, 15568);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1(Function1 function1, OptionOrderInputComposable2 optionOrderInputComposable2, TextFieldValue newTextFieldValue) {
                            Intrinsics.checkNotNullParameter(newTextFieldValue, "newTextFieldValue");
                            function1.invoke(TextInputHelper.validate(newTextFieldValue.getText(), optionOrderInputComposable2));
                            return Unit.INSTANCE;
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i7) {
                        if ((i7 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1404800433, i7, -1, "com.robinhood.android.trade.options.textinput.OptionOrderInputComposable.<anonymous> (OptionOrderInputComposable.kt:59)");
                        }
                        DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(478291580, true, new AnonymousClass1(str, modifier4, onValueChange, rawValue, inputType, focusRequester, z3, str2), composer2, 54), composer2, 48, 1);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
                Boolean boolValueOf = Boolean.valueOf(z2);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                z4 = ((i6 & 57344) != 16384) | ((i6 & 458752) == 131072);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z4 || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new OptionOrderInputComposable5(z2, focusRequester, onInputFocused, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i6 >> 12) & 14);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return OptionOrderInputComposable3.OptionOrderInputComposable$lambda$2(rawValue, rawHint, z, inputType, z2, onInputFocused, modifier3, onValueChange, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((i2 & 128) == 0) {
        }
        if ((4793491 & i3) == 4793490) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            SelectionColors selectionColors2 = new SelectionColors(bentoTheme2.getColors(composerStartRestartGroup, i52).m21368getAccent0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme2.getColors(composerStartRestartGroup, i52).m21368getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            focusRequester = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            int i62 = i3;
            String strValidate2 = TextInputHelper.validate(rawValue, inputType);
            Intrinsics.checkNotNull(resources2);
            final String str3 = TextInputHelper.format(strValidate2, resources2, inputType);
            final String str22 = TextInputHelper.format(TextInputHelper.validate(rawHint, inputType), resources2, inputType);
            final Modifier modifier42 = modifier2;
            CompositionLocal3.CompositionLocalProvider((ProvidedValue<?>[]) new ProvidedValue[]{TextSelectionColors2.getLocalTextSelectionColors().provides(selectionColors2), CompositionLocalsKt.getLocalTextToolbar().provides(OptionOrderInputComposable.INSTANCE)}, ComposableLambda3.rememberComposableLambda(-1404800433, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt.OptionOrderInputComposable.1

                /* compiled from: OptionOrderInputComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ boolean $enabled;
                    final /* synthetic */ FocusRequester $focusRequester;
                    final /* synthetic */ OptionOrderInputComposable2 $inputType;
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Function1<String, Unit> $onValueChange;
                    final /* synthetic */ String $rawValue;
                    final /* synthetic */ String $validFormattedHint;
                    final /* synthetic */ String $validFormattedValue;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(String str, Modifier modifier, Function1<? super String, Unit> function1, String str2, OptionOrderInputComposable2 optionOrderInputComposable2, FocusRequester focusRequester, boolean z, String str3) {
                        this.$validFormattedValue = str;
                        this.$modifier = modifier;
                        this.$onValueChange = function1;
                        this.$rawValue = str2;
                        this.$inputType = optionOrderInputComposable2;
                        this.$focusRequester = focusRequester;
                        this.$enabled = z;
                        this.$validFormattedHint = str3;
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
                            ComposerKt.traceEventStart(478291580, i, -1, "com.robinhood.android.trade.options.textinput.OptionOrderInputComposable.<anonymous>.<anonymous> (OptionOrderInputComposable.kt:60)");
                        }
                        String str = this.$validFormattedValue;
                        TextFieldValue textFieldValue = new TextFieldValue(str, TextRange2.TextRange(str.length()), (TextRange) null, 4, (DefaultConstructorMarker) null);
                        Modifier modifier = this.$modifier;
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(this.$onValueChange) | composer.changed(this.$rawValue) | composer.changed(this.$inputType.ordinal());
                        final Function1<? super String, Unit> function1 = this.$onValueChange;
                        final String str2 = this.$rawValue;
                        final OptionOrderInputComposable2 optionOrderInputComposable2 = this.$inputType;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function1<KeyEvent, Boolean>() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$1$1$1$1
                                @Override // kotlin.jvm.functions.Function1
                                public /* bridge */ /* synthetic */ Boolean invoke(KeyEvent keyEvent) {
                                    return m19484invokeZmokQxo(keyEvent.getNativeKeyEvent());
                                }

                                /* renamed from: invoke-ZmokQxo, reason: not valid java name */
                                public final Boolean m19484invokeZmokQxo(android.view.KeyEvent event) {
                                    boolean z;
                                    Intrinsics.checkNotNullParameter(event, "event");
                                    if (event.getKeyCode() == 4) {
                                        z = false;
                                    } else {
                                        function1.invoke(TextInputHelper.validate(str2 + TextInputHelper.m19485getNumpadStringZmokQxo(event), optionOrderInputComposable2));
                                        z = true;
                                    }
                                    return Boolean.valueOf(z);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(KeyInputModifier2.onKeyEvent(modifier, (Function1) objRememberedValue), this.$focusRequester);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i2 = BentoTheme.$stable;
                        SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21368getAccent0d7_KjU(), null);
                        TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer, i2).getTextM(), bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777210, null);
                        composer.startReplaceGroup(-1633490746);
                        boolean zChanged2 = composer.changed(this.$onValueChange) | composer.changed(this.$inputType.ordinal());
                        final Function1 function12 = this.$onValueChange;
                        final OptionOrderInputComposable2 optionOrderInputComposable22 = this.$inputType;
                        Object objRememberedValue2 = composer.rememberedValue();
                        if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt$OptionOrderInputComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return OptionOrderInputComposable3.C298851.AnonymousClass1.invoke$lambda$2$lambda$1(function12, optionOrderInputComposable22, (TextFieldValue) obj);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue2);
                        }
                        composer.endReplaceGroup();
                        boolean z = this.$enabled;
                        final String str3 = this.$rawValue;
                        final String str4 = this.$validFormattedHint;
                        BasicTextFieldKt.BasicTextField(textFieldValue, (Function1<? super TextFieldValue, Unit>) objRememberedValue2, modifierFocusRequester, z, false, textStyleM7655copyp1EtxEg$default, (KeyboardOptions) null, (KeyboardActions) null, false, 1, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(1197406687, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.trade.options.textinput.OptionOrderInputComposableKt.OptionOrderInputComposable.1.1.3
                            public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer2, int i3) {
                                int i4;
                                int i5;
                                int i6;
                                Modifier.Companion companion;
                                Composer composer3 = composer2;
                                Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                                if ((i3 & 6) == 0) {
                                    i4 = i3 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                                } else {
                                    i4 = i3;
                                }
                                if ((i4 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(1197406687, i4, -1, "com.robinhood.android.trade.options.textinput.OptionOrderInputComposable.<anonymous>.<anonymous>.<anonymous> (OptionOrderInputComposable.kt:91)");
                                }
                                Alignment.Companion companion2 = Alignment.INSTANCE;
                                Alignment centerEnd = companion2.getCenterEnd();
                                String str5 = str3;
                                String str6 = str4;
                                Modifier.Companion companion3 = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(centerEnd, false);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion3);
                                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
                                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                                composer3.startReplaceGroup(1181539470);
                                if (str5.length() == 0) {
                                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                                    int i7 = BentoTheme.$stable;
                                    long jM21426getFg20d7_KjU = bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU();
                                    i5 = i4;
                                    i6 = 2;
                                    companion = companion3;
                                    BentoText2.m20747BentoText38GnDrw(str6, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextM(), composer2, 24576, 0, 8170);
                                    composer3 = composer2;
                                } else {
                                    i5 = i4;
                                    i6 = 2;
                                    companion = companion3;
                                }
                                composer3.endReplaceGroup();
                                Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(Intrinsic3.width(companion, Intrinsic4.Min), BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21597getXxsmallD9Ej5fM(), 0.0f, i6, null);
                                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(companion2.getCenterEnd(), false);
                                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                                CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5155defaultMinSizeVpY3zN4$default);
                                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                                if (composer3.getApplier() == null) {
                                    Composables.invalidApplier();
                                }
                                composer3.startReusableNode();
                                if (composer3.getInserting()) {
                                    composer3.createNode(constructor2);
                                } else {
                                    composer3.useNode();
                                }
                                Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer3);
                                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy2, companion4.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion4.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion4.getSetModifier());
                                innerTextField.invoke(composer3, Integer.valueOf(i5 & 14));
                                composer3.endNode();
                                composer3.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }

                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer2, Integer num) {
                                invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer2, num.intValue());
                                return Unit.INSTANCE;
                            }
                        }, composer, 54), composer, 905969664, 196608, 15568);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1(Function1 function1, OptionOrderInputComposable2 optionOrderInputComposable2, TextFieldValue newTextFieldValue) {
                        Intrinsics.checkNotNullParameter(newTextFieldValue, "newTextFieldValue");
                        function1.invoke(TextInputHelper.validate(newTextFieldValue.getText(), optionOrderInputComposable2));
                        return Unit.INSTANCE;
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i7) {
                    if ((i7 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1404800433, i7, -1, "com.robinhood.android.trade.options.textinput.OptionOrderInputComposable.<anonymous> (OptionOrderInputComposable.kt:59)");
                    }
                    DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(478291580, true, new AnonymousClass1(str3, modifier42, onValueChange, rawValue, inputType, focusRequester, z3, str22), composer2, 54), composer2, 48, 1);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            Boolean boolValueOf2 = Boolean.valueOf(z2);
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            z4 = ((i62 & 57344) != 16384) | ((i62 & 458752) == 131072);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!z4) {
                objRememberedValue2 = new OptionOrderInputComposable5(z2, focusRequester, onInputFocused, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                EffectsKt.LaunchedEffect(boolValueOf2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, (i62 >> 12) & 14);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier42;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
