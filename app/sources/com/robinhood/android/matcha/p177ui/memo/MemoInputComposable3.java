package com.robinhood.android.matcha.p177ui.memo;

import androidx.compose.foundation.Background3;
import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.selection.SelectionColors;
import androidx.compose.foundation.text.selection.TextSelectionColors2;
import androidx.compose.material.CardKt;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.material.TextKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Brush;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.SoftwareKeyboardController;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextLayoutResult;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.input.ImeAction;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.text.input.VisualTransformation;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocal6;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.matcha.C21284R;
import com.robinhood.android.matcha.p177ui.amount.ProfileBubbles;
import com.robinhood.android.matcha.p177ui.memo.MemoInputComposable3;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoPogSize;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.compose.bento.component.BentoProgressIndicator3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.p2p.common.ProfileAvatar3;
import com.robinhood.p2p.common.ProfileAvatarState;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MemoInputComposable.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\b\u0002\u001a\u0089\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00102\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\u0013\u001aw\u0010\u0014\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000b2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0007¢\u0006\u0002\u0010\u001b\u001a!\u0010\u001c\u001a\u00020\u00012\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010\u001d\u001a1\u0010\u001e\u001a\u00020\u00012\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u001f\u001a\u00020\t2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u000bH\u0003¢\u0006\u0002\u0010!\"\u0016\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00060#X\u0082\u0004¢\u0006\u0004\n\u0002\u0010$¨\u0006%"}, m3636d2 = {"MemoInputScreen", "", "profileAvatarStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/p2p/common/ProfileAvatarState;", "transactionTitle", "", "transactionSubtitle", "textFieldValue", "Landroidx/compose/ui/text/input/TextFieldValue;", "onMemoChange", "Lkotlin/Function1;", "isDoneButtonEnabled", "", "isDoneButtonLoading", "onDoneClick", "Lkotlin/Function0;", "onCloseClick", "onEmojiClick", "(Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;ZZLkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MemoInput", "modifier", "Landroidx/compose/ui/Modifier;", "focusRequester", "Landroidx/compose/ui/focus/FocusRequester;", "keyboardController", "Landroidx/compose/ui/platform/SoftwareKeyboardController;", "(Landroidx/compose/ui/Modifier;Lkotlinx/collections/immutable/ImmutableList;Ljava/lang/String;Ljava/lang/String;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/focus/FocusRequester;Landroidx/compose/ui/platform/SoftwareKeyboardController;Landroidx/compose/runtime/Composer;I)V", "EmojiRow", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "MemoInputTextField", "value", "onValueChange", "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/text/input/TextFieldValue;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "Emojis", "", "[Ljava/lang/String;", "feature-p2p_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class MemoInputComposable3 {
    private static final String[] Emojis = {"☕️", "🍴", "🍻", "🙌", "❤️", "🔥"};

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiRow$lambda$10(Function1 function1, int i, Composer composer, int i2) {
        EmojiRow(function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoInput$lambda$5(Modifier modifier, ImmutableList immutableList, String str, String str2, TextFieldValue textFieldValue, Function1 function1, Function1 function12, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, int i, Composer composer, int i2) {
        MemoInput(modifier, immutableList, str, str2, textFieldValue, function1, function12, focusRequester, softwareKeyboardController, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoInputScreen$lambda$1(ImmutableList immutableList, String str, String str2, TextFieldValue textFieldValue, Function1 function1, boolean z, boolean z2, Function0 function0, Function0 function02, Function1 function12, int i, Composer composer, int i2) {
        MemoInputScreen(immutableList, str, str2, textFieldValue, function1, z, z2, function0, function02, function12, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MemoInputTextField$lambda$11(Modifier modifier, TextFieldValue textFieldValue, Function1 function1, int i, Composer composer, int i2) {
        MemoInputTextField(modifier, textFieldValue, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void MemoInputScreen(final ImmutableList<? extends ProfileAvatarState> profileAvatarStates, final String transactionTitle, final String str, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> onMemoChange, final boolean z, final boolean z2, final Function0<Unit> onDoneClick, final Function0<Unit> onCloseClick, final Function1<? super String, Unit> onEmojiClick, Composer composer, final int i) {
        int i2;
        boolean z3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(profileAvatarStates, "profileAvatarStates");
        Intrinsics.checkNotNullParameter(transactionTitle, "transactionTitle");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(onMemoChange, "onMemoChange");
        Intrinsics.checkNotNullParameter(onDoneClick, "onDoneClick");
        Intrinsics.checkNotNullParameter(onCloseClick, "onCloseClick");
        Intrinsics.checkNotNullParameter(onEmojiClick, "onEmojiClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(184840617);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(profileAvatarStates) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(transactionTitle) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMemoChange) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            z3 = z2;
            i2 |= composerStartRestartGroup.changed(z3) ? 1048576 : 524288;
        } else {
            z3 = z2;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onDoneClick) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onCloseClick) ? 67108864 : 33554432;
        }
        if ((805306368 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEmojiClick) ? 536870912 : 268435456;
        }
        if ((306783379 & i2) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(184840617, i2, -1, "com.robinhood.android.matcha.ui.memo.MemoInputScreen (MemoInputComposable.kt:72)");
            }
            final SoftwareKeyboardController softwareKeyboardController = (SoftwareKeyboardController) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalSoftwareKeyboardController());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new FocusRequester();
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            final boolean z4 = z3;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(null, null, ComposableLambda3.rememberComposableLambda(-870512060, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt.MemoInputScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i4) {
                    if ((i4 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-870512060, i4, -1, "com.robinhood.android.matcha.ui.memo.MemoInputScreen.<anonymous> (MemoInputComposable.kt:79)");
                    }
                    Function2<Composer, Integer, Unit> function2M16364getLambda$587725001$feature_p2p_externalDebug = MemoInputComposable.INSTANCE.m16364getLambda$587725001$feature_p2p_externalDebug();
                    final Function0<Unit> function0 = onCloseClick;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(function2M16364getLambda$587725001$feature_p2p_externalDebug, null, ComposableLambda3.rememberComposableLambda(-1808599197, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt.MemoInputScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i5) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i5 & 6) == 0) {
                                i5 |= (i5 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1808599197, i5, -1, "com.robinhood.android.matcha.ui.memo.MemoInputScreen.<anonymous>.<anonymous> (MemoInputComposable.kt:81)");
                            }
                            BentoAppBar.m20576BentoCloseButtoncf5BqRc(null, false, 0L, function0, composer4, (BentoAppBarScope.$stable << 12) | ((i5 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), ComposableLambda3.rememberComposableLambda(1330344034, true, new AnonymousClass2(z4, softwareKeyboardController, onDoneClick, z, focusRequester), composer3, 54), null, false, false, null, null, 0L, null, composer3, 3462, 0, 2034);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: MemoInputComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$MemoInputScreen$1$2, reason: invalid class name */
                static final class AnonymousClass2 implements Function3<Row5, Composer, Integer, Unit> {
                    final /* synthetic */ FocusRequester $focusRequester;
                    final /* synthetic */ boolean $isDoneButtonEnabled;
                    final /* synthetic */ boolean $isDoneButtonLoading;
                    final /* synthetic */ SoftwareKeyboardController $keyboardController;
                    final /* synthetic */ Function0<Unit> $onDoneClick;

                    AnonymousClass2(boolean z, SoftwareKeyboardController softwareKeyboardController, Function0<Unit> function0, boolean z2, FocusRequester focusRequester) {
                        this.$isDoneButtonLoading = z;
                        this.$keyboardController = softwareKeyboardController;
                        this.$onDoneClick = function0;
                        this.$isDoneButtonEnabled = z2;
                        this.$focusRequester = focusRequester;
                    }

                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(Row5 row5, Composer composer, Integer num) {
                        invoke(row5, composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Row5 BentoAppBar, Composer composer, int i) {
                        int i2;
                        Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                        if ((i & 6) == 0) {
                            i2 = i | (composer.changed(BentoAppBar) ? 4 : 2);
                        } else {
                            i2 = i;
                        }
                        if ((i2 & 19) == 18 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1330344034, i2, -1, "com.robinhood.android.matcha.ui.memo.MemoInputScreen.<anonymous>.<anonymous> (MemoInputComposable.kt:90)");
                        }
                        composer.startReplaceGroup(-1439636537);
                        if (this.$isDoneButtonLoading) {
                            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(BentoAppBar.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically()), BentoProgressIndicator3.f5153XS, 0L, composer, 48, 4);
                        }
                        composer.endReplaceGroup();
                        Modifier modifierAlign = BentoAppBar.align(Modifier.INSTANCE, Alignment.INSTANCE.getCenterVertically());
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i3 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierAlign, bentoTheme.getSpacing(composer, i3).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composer, i3).m21592getMediumD9Ej5fM(), 0.0f, 10, null);
                        String strStringResource = StringResources_androidKt.stringResource(C11048R.string.general_label_done, composer, 0);
                        composer.startReplaceGroup(-1746271574);
                        boolean zChanged = composer.changed(this.$keyboardController) | composer.changed(this.$onDoneClick);
                        final FocusRequester focusRequester = this.$focusRequester;
                        final SoftwareKeyboardController softwareKeyboardController = this.$keyboardController;
                        final Function0<Unit> function0 = this.$onDoneClick;
                        Object objRememberedValue = composer.rememberedValue();
                        if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$MemoInputScreen$1$2$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MemoInputComposable3.C213981.AnonymousClass2.invoke$lambda$1$lambda$0(focusRequester, softwareKeyboardController, function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource, modifierM5146paddingqDBjuR0$default, null, null, this.$isDoneButtonEnabled, null, composer, 0, 88);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$1$lambda$0(FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Function0 function0) {
                        focusRequester.freeFocus();
                        if (softwareKeyboardController != null) {
                            softwareKeyboardController.hide();
                        }
                        function0.invoke();
                        return Unit.INSTANCE;
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, bentoTheme.getColors(composerStartRestartGroup, i3).m21371getBg0d7_KjU(), bentoTheme.getColors(composerStartRestartGroup, i3).m21425getFg0d7_KjU(), ComposableLambda3.rememberComposableLambda(907230507, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt.MemoInputScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i4) {
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    if ((i4 & 6) == 0) {
                        i4 |= composer3.changed(paddingValues) ? 4 : 2;
                    }
                    if ((i4 & 19) == 18 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(907230507, i4, -1, "com.robinhood.android.matcha.ui.memo.MemoInputScreen.<anonymous> (MemoInputComposable.kt:115)");
                    }
                    MemoInputComposable3.MemoInput(PaddingKt.padding(Modifier.INSTANCE, paddingValues), profileAvatarStates, transactionTitle, str, textFieldValue, onMemoChange, onEmojiClick, focusRequester, softwareKeyboardController, composer3, 12582912);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, 384, 12582912, 32763);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoInputComposable3.MemoInputScreen$lambda$1(profileAvatarStates, transactionTitle, str, textFieldValue, onMemoChange, z, z2, onDoneClick, onCloseClick, onEmojiClick, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final void MemoInput(final Modifier modifier, final ImmutableList<? extends ProfileAvatarState> profileAvatarStates, final String transactionTitle, final String str, TextFieldValue textFieldValue, Function1<? super TextFieldValue, Unit> onMemoChange, Function1<? super String, Unit> onEmojiClick, FocusRequester focusRequester, SoftwareKeyboardController softwareKeyboardController, Composer composer, final int i) {
        int i2;
        int i3;
        BentoTheme bentoTheme;
        int i4;
        final FocusRequester focusRequester2;
        final TextFieldValue textFieldValue2;
        final Function1<? super TextFieldValue, Unit> function1;
        Function1<? super String, Unit> function12;
        final SoftwareKeyboardController softwareKeyboardController2;
        Intrinsics.checkNotNullParameter(modifier, "modifier");
        Intrinsics.checkNotNullParameter(profileAvatarStates, "profileAvatarStates");
        Intrinsics.checkNotNullParameter(transactionTitle, "transactionTitle");
        Intrinsics.checkNotNullParameter(textFieldValue, "textFieldValue");
        Intrinsics.checkNotNullParameter(onMemoChange, "onMemoChange");
        Intrinsics.checkNotNullParameter(onEmojiClick, "onEmojiClick");
        Intrinsics.checkNotNullParameter(focusRequester, "focusRequester");
        Composer composerStartRestartGroup = composer.startRestartGroup(-416687852);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(profileAvatarStates) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changed(transactionTitle) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(str) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onMemoChange) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onEmojiClick) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(focusRequester) ? 8388608 : 4194304;
        }
        if ((100663296 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(softwareKeyboardController) ? 67108864 : 33554432;
        }
        if ((38347923 & i2) == 38347922 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            textFieldValue2 = textFieldValue;
            function1 = onMemoChange;
            function12 = onEmojiClick;
            focusRequester2 = focusRequester;
            softwareKeyboardController2 = softwareKeyboardController;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-416687852, i2, -1, "com.robinhood.android.matcha.ui.memo.MemoInput (MemoInputComposable.kt:141)");
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i5 = BentoTheme.$stable;
            Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(PaddingKt.m5144paddingVpY3zN4$default(modifier, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            if (profileAvatarStates.size() == 1) {
                composerStartRestartGroup.startReplaceGroup(-781114730);
                ProfileAvatar3.ProfileAvatar((ProfileAvatarState) CollectionsKt.first((List) profileAvatarStates), PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 5, null), BentoPogSize.Hero, null, composerStartRestartGroup, 384, 8);
                composerStartRestartGroup.endReplaceGroup();
                bentoTheme = bentoTheme2;
                i4 = i2;
                i3 = i5;
            } else {
                composerStartRestartGroup.startReplaceGroup(-780790439);
                i3 = i5;
                bentoTheme = bentoTheme2;
                i4 = i2;
                ProfileBubbles.ProfileBubbles(profileAvatarStates, PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 5, null), null, false, null, composerStartRestartGroup, (i2 >> 3) & 14, 28);
                composerStartRestartGroup.endReplaceGroup();
            }
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i3).getDisplayCapsuleMedium();
            TextAlign.Companion companion2 = TextAlign.INSTANCE;
            BentoTheme bentoTheme3 = bentoTheme;
            int i6 = i3;
            BentoText2.m20747BentoText38GnDrw(transactionTitle, null, null, null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, (i4 >> 6) & 14, 0, 8126);
            composerStartRestartGroup = composerStartRestartGroup;
            composerStartRestartGroup.startReplaceGroup(1498849451);
            if (str != null) {
                BentoText2.m20747BentoText38GnDrw(str, null, Color.m6701boximpl(bentoTheme3.getColors(composerStartRestartGroup, i6).m21426getFg20d7_KjU()), null, null, null, TextAlign.m7912boximpl(companion2.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composerStartRestartGroup, i6).getTextM(), composerStartRestartGroup, 0, 0, 8122);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            focusRequester2 = focusRequester;
            textFieldValue2 = textFieldValue;
            boolean z = true;
            function1 = onMemoChange;
            MemoInputTextField(PaddingKt.m5144paddingVpY3zN4$default(FocusRequesterModifier3.focusRequester(companion3, focusRequester2), 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM(), 1, null), textFieldValue2, function1, composerStartRestartGroup, (i4 >> 9) & 1008);
            function12 = onEmojiClick;
            EmojiRow(function12, composerStartRestartGroup, (i4 >> 18) & 14);
            Spacer2.Spacer(Column5.weight$default(column6, companion3, 1.0f, false, 2, null), composerStartRestartGroup, 0);
            Unit unit = Unit.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z2 = (i4 & 29360128) == 8388608;
            if ((i4 & 234881024) != 67108864) {
                z = false;
            }
            boolean z3 = z2 | z;
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                softwareKeyboardController2 = softwareKeyboardController;
                objRememberedValue = new MemoInputComposable5(focusRequester2, softwareKeyboardController2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            } else {
                softwareKeyboardController2 = softwareKeyboardController;
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 6);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super String, Unit> function13 = function12;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoInputComposable3.MemoInput$lambda$5(modifier, profileAvatarStates, transactionTitle, str, textFieldValue2, function1, function13, focusRequester2, softwareKeyboardController2, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0 */
    /* JADX WARN: Type inference failed for: r10v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r21v1 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.robinhood.compose.bento.theme.BentoTheme] */
    private static final void EmojiRow(final Function1<? super String, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(141501608);
        int i3 = 4;
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(141501608, i2, -1, "com.robinhood.android.matcha.ui.memo.EmojiRow (MemoInputComposable.kt:200)");
            }
            Arrangement arrangement = Arrangement.INSTANCE;
            ?? r4 = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            float fM21593getSmallD9Ej5fM = r4.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM();
            Alignment.Companion companion = Alignment.INSTANCE;
            Arrangement.Horizontal horizontalM5090spacedByD5KLDUw = arrangement.m5090spacedByD5KLDUw(fM21593getSmallD9Ej5fM, companion.getCenterHorizontally());
            ?? r10 = 1;
            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, r4.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 1, null);
            int i5 = 0;
            Modifier modifierHorizontalScroll$default = ScrollKt.horizontalScroll$default(modifierM5144paddingVpY3zN4$default, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalM5090spacedByD5KLDUw, companion.getTop(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierHorizontalScroll$default);
            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
            Row6 row6 = Row6.INSTANCE;
            composerStartRestartGroup.startReplaceGroup(-2024290570);
            String[] strArr = Emojis;
            int length = strArr.length;
            int i6 = 0;
            while (i6 < length) {
                final String str = strArr[i6];
                composerStartRestartGroup.startReplaceGroup(-1633490746);
                int i7 = ((i2 & 14) == i3 ? r10 : i5) | (composerStartRestartGroup.changed(str) ? 1 : 0);
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (i7 != 0 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MemoInputComposable3.EmojiRow$lambda$9$lambda$8$lambda$7$lambda$6(function1, str);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i8 = length;
                RoundedCornerShape circleShape = RoundedCornerShape2.getCircleShape();
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i9 = BentoTheme.$stable;
                CardKt.m5549CardLPr_se0((Function0) objRememberedValue, null, false, circleShape, bentoTheme.getColors(composerStartRestartGroup, i9).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(C2002Dp.m7995constructorimpl((float) r10), bentoTheme.getColors(composerStartRestartGroup, i9).m21427getFg30d7_KjU()), C2002Dp.m7995constructorimpl(i5), null, ComposableLambda3.rememberComposableLambda(-1405766566, r10, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$EmojiRow$1$1$2
                    public final void invoke(Composer composer2, int i10) {
                        if ((i10 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1405766566, i10, -1, "com.robinhood.android.matcha.ui.memo.EmojiRow.<anonymous>.<anonymous>.<anonymous> (MemoInputComposable.kt:219)");
                        }
                        Alignment center = Alignment.INSTANCE.getCenter();
                        Modifier modifierM5169size3ABfNKs = SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(48));
                        String str2 = str;
                        MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(center, false);
                        int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5169size3ABfNKs);
                        ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
                        if (composer2.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer2.startReusableNode();
                        if (composer2.getInserting()) {
                            composer2.createNode(constructor2);
                        } else {
                            composer2.useNode();
                        }
                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                        Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                            composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                            composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                        BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                        TextKt.m5665Text4IGK_g(str2, null, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, composer2, 0, 0, 131070);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, 817889280, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_ONLY_VALUE);
                i6++;
                i3 = i3;
                length = i8;
                i5 = 0;
                i2 = i2;
                r10 = r10;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoInputComposable3.EmojiRow$lambda$10(function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmojiRow$lambda$9$lambda$8$lambda$7$lambda$6(Function1 function1, String str) {
        function1.invoke(str);
        return Unit.INSTANCE;
    }

    private static final void MemoInputTextField(final Modifier modifier, final TextFieldValue textFieldValue, final Function1<? super TextFieldValue, Unit> function1, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1609372194);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changed(textFieldValue) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function1) ? 256 : 128;
        }
        if ((i2 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1609372194, i2, -1, "com.robinhood.android.matcha.ui.memo.MemoInputTextField (MemoInputComposable.kt:235)");
            }
            CompositionLocal6<SelectionColors> localTextSelectionColors = TextSelectionColors2.getLocalTextSelectionColors();
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i3 = BentoTheme.$stable;
            CompositionLocal3.CompositionLocalProvider(localTextSelectionColors.provides(new SelectionColors(bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU(), Color.m6705copywmQWz5c$default(bentoTheme.getColors(composerStartRestartGroup, i3).m21368getAccent0d7_KjU(), 0.4f, 0.0f, 0.0f, 0.0f, 14, null), null)), ComposableLambda3.rememberComposableLambda(-1882631906, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt.MemoInputTextField.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i4) {
                    if ((i4 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1882631906, i4, -1, "com.robinhood.android.matcha.ui.memo.MemoInputTextField.<anonymous> (MemoInputComposable.kt:242)");
                    }
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    SolidColor solidColor = new SolidColor(bentoTheme2.getColors(composer2, i5).m21368getAccent0d7_KjU(), null);
                    KeyboardOptions keyboardOptionsM5353copyINvB4aQ$default = KeyboardOptions.m5353copyINvB4aQ$default(KeyboardOptions.INSTANCE.getDefault(), 0, null, 0, ImeAction.INSTANCE.m7747getDoneeUduSuo(), null, null, null, 119, null);
                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer2, i5).getTextM(), bentoTheme2.getColors(composer2, i5).m21425getFg0d7_KjU(), 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                    final TextFieldValue textFieldValue2 = textFieldValue;
                    BasicTextFieldKt.BasicTextField(textFieldValue2, (Function1<? super TextFieldValue, Unit>) function1, modifier, false, false, textStyleM7655copyp1EtxEg$default, keyboardOptionsM5353copyINvB4aQ$default, (KeyboardActions) null, false, 0, 0, (VisualTransformation) null, (Function1<? super TextLayoutResult, Unit>) null, (InteractionSource3) null, (Brush) solidColor, (Function3<? super Function2<? super Composer, ? super Integer, Unit>, ? super Composer, ? super Integer, Unit>) ComposableLambda3.rememberComposableLambda(-833999231, true, new Function3<Function2<? super Composer, ? super Integer, ? extends Unit>, Composer, Integer, Unit>() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt.MemoInputTextField.1.1
                        public final void invoke(Function2<? super Composer, ? super Integer, Unit> innerTextField, Composer composer3, int i6) {
                            int i7;
                            int i8;
                            Intrinsics.checkNotNullParameter(innerTextField, "innerTextField");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer3.changedInstance(innerTextField) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-833999231, i7, -1, "com.robinhood.android.matcha.ui.memo.MemoInputTextField.<anonymous>.<anonymous> (MemoInputComposable.kt:250)");
                            }
                            Arrangement arrangement = Arrangement.INSTANCE;
                            BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                            int i9 = BentoTheme.$stable;
                            Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme3.getSpacing(composer3, i9).m21593getSmallD9Ej5fM());
                            Alignment.Companion companion = Alignment.INSTANCE;
                            Alignment.Horizontal start = companion.getStart();
                            TextFieldValue textFieldValue3 = textFieldValue2;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, start, composer3, 48);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, companion2);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            float f = 4;
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(SizeKt.m5155defaultMinSizeVpY3zN4$default(Background3.m4871backgroundbw27NRU(BorderKt.m4876borderxT4_qwU(companion2, C2002Dp.m7995constructorimpl(2), bentoTheme3.getColors(composer3, i9).m21425getFg0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), Color.INSTANCE.m6725getTransparent0d7_KjU(), RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(f))), 0.0f, C2002Dp.m7995constructorimpl(44), 1, null), bentoTheme3.getSpacing(composer3, i9).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getCenterVertically(), composer3, 48);
                            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default);
                            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(Row5.weight$default(Row6.INSTANCE, companion2, 1.0f, false, 2, null), 0.0f, bentoTheme3.getSpacing(composer3, i9).m21593getSmallD9Ej5fM(), 1, null);
                            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                            int currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap3 = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composer3, modifierM5144paddingVpY3zN4$default2);
                            Function0<ComposeUiNode> constructor3 = companion3.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor3);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl3 = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3 = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                                composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                                composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion3.getSetModifier());
                            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                            composer3.startReplaceGroup(76181512);
                            if (textFieldValue3.getText().length() == 0) {
                                i8 = i7;
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C21284R.string.matcha_add_memo, composer3, 0), null, Color.m6701boximpl(bentoTheme3.getColors(composer3, i9).m21426getFg20d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme3.getTypography(composer3, i9).getTextM(), composer3, 0, 0, 8186);
                            } else {
                                i8 = i7;
                            }
                            composer3.endReplaceGroup();
                            innerTextField.invoke(composer3, Integer.valueOf(i8 & 14));
                            composer3.endNode();
                            composer3.endNode();
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super Composer, ? super Integer, ? extends Unit> function2, Composer composer3, Integer num) {
                            invoke((Function2<? super Composer, ? super Integer, Unit>) function2, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }
                    }, composer2, 54), composer2, 0, 196608, 16280);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.matcha.ui.memo.MemoInputComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MemoInputComposable3.MemoInputTextField$lambda$11(modifier, textFieldValue, function1, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
