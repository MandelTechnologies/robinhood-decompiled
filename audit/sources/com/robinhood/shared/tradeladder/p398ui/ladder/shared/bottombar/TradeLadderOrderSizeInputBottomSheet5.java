package com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.Intrinsic3;
import androidx.compose.foundation.layout.Intrinsic4;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusRequester;
import androidx.compose.p011ui.focus.FocusRequesterModifier3;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.SolidColor;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.input.TextFieldValue;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoSegmentedControl2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.Segment;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.common.AnimateShake;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.shared.tradeladder.C40888R;
import com.robinhood.shared.tradeladder.api.models.LadderInputMode;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.OrderSizeInputBottomSheetState;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheet3;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheet5;
import com.robinhood.shared.tradeladder.p398ui.ladder.shared.style.PreviewLadderBentoTheme2;
import com.robinhood.utils.compose.keyboard.DisableKeyboard;
import com.robinhood.utils.resource.StringResource;
import java.util.ArrayList;
import java.util.Iterator;
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

/* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ai\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00022\b\b\u0002\u0010\r\u001a\u00020\fH\u0007¢\u0006\u0004\b\u000e\u0010\u000f\u001a[\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0016\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0003j\u0002`\u0004\u0012\u0004\u0012\u00020\u00050\u00022\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\r\u001a\u00020\fH\u0003¢\u0006\u0004\b\u0011\u0010\u0012\u001a-\u0010\u0018\u001a\u00020\u00052\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u0016H\u0003¢\u0006\u0004\b\u0018\u0010\u0019\u001a\u0019\u0010\u001c\u001a\u00020\u00052\b\b\u0001\u0010\u001b\u001a\u00020\u001aH\u0001¢\u0006\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState;", "state", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "", "onKeyPress", "Lkotlin/Function0;", "onResetValue", "onDismissRequest", "Lcom/robinhood/shared/tradeladder/api/models/LadderInputMode;", "onInputModeSelected", "Landroidx/compose/ui/Modifier;", "modifier", "TradeLadderOrderSizeInputBottomSheet", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "onDone", "MainContent", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "textField", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputValue;", "inputValue", "", "placeholderText", "DecorationBox", "(Lkotlin/jvm/functions/Function2;Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetState$InputValue;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V", "Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetPreviewParameterProvider$Parameters;", "parameters", "PreviewTradeLadderOrderSizeInputBottomSheet", "(Lcom/robinhood/shared/tradeladder/ui/ladder/shared/bottombar/OrderSizeInputBottomSheetPreviewParameterProvider$Parameters;Landroidx/compose/runtime/Composer;I)V", "lib-trade-ladder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class TradeLadderOrderSizeInputBottomSheet5 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit DecorationBox$lambda$16(Function2 function2, OrderSizeInputBottomSheetState.InputValue inputValue, String str, int i, Composer composer, int i2) {
        DecorationBox(function2, inputValue, str, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainContent$lambda$12(OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, Function1 function1, Function1 function12, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainContent(orderSizeInputBottomSheetState, function1, function12, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTradeLadderOrderSizeInputBottomSheet$lambda$17(TradeLadderOrderSizeInputBottomSheet3.Parameters parameters, int i, Composer composer, int i2) {
        PreviewTradeLadderOrderSizeInputBottomSheet(parameters, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TradeLadderOrderSizeInputBottomSheet$lambda$0(OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, Function1 function1, Function0 function0, Function0 function02, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TradeLadderOrderSizeInputBottomSheet(orderSizeInputBottomSheetState, function1, function0, function02, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$TradeLadderOrderSizeInputBottomSheet$1 */
    static final class C409901 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onDismissRequest;
        final /* synthetic */ Function1<LadderInputMode, Unit> $onInputModeSelected;
        final /* synthetic */ Function1<KeyEvent, Unit> $onKeyPress;
        final /* synthetic */ Function0<Unit> $onResetValue;
        final /* synthetic */ OrderSizeInputBottomSheetState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C409901(OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, Function0<Unit> function0, Function0<Unit> function02, Function1<? super KeyEvent, Unit> function1, Function1<? super LadderInputMode, Unit> function12, Modifier modifier) {
            this.$state = orderSizeInputBottomSheetState;
            this.$onResetValue = function0;
            this.$onDismissRequest = function02;
            this.$onKeyPress = function1;
            this.$onInputModeSelected = function12;
            this.$modifier = modifier;
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
                ComposerKt.traceEventStart(-893232483, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheet.<anonymous> (TradeLadderOrderSizeInputBottomSheet.kt:71)");
            }
            Modifier modifierStatusBarsPadding = WindowInsetsPadding_androidKt.statusBarsPadding(Modifier.INSTANCE);
            SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composer, 6, 2);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance = composer.changedInstance(this.$state) | composer.changed(this.$onResetValue) | composer.changed(this.$onDismissRequest);
            final OrderSizeInputBottomSheetState orderSizeInputBottomSheetState = this.$state;
            final Function0<Unit> function0 = this.$onResetValue;
            final Function0<Unit> function02 = this.$onDismissRequest;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$TradeLadderOrderSizeInputBottomSheet$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return TradeLadderOrderSizeInputBottomSheet5.C409901.invoke$lambda$1$lambda$0(orderSizeInputBottomSheetState, function0, function02);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI((Function0) objRememberedValue, modifierStatusBarsPadding, false, sheetStateRememberModalBottomSheetState, null, 0L, ComposableLambda3.rememberComposableLambda(1352973174, true, new AnonymousClass2(this.$state, this.$onKeyPress, this.$onInputModeSelected, this.$modifier), composer, 54), composer, 1572864, 52);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, Function0 function0, Function0 function02) {
            if (Intrinsics.areEqual(orderSizeInputBottomSheetState.getInputValue().getDisplayValue().getText(), "")) {
                function0.invoke();
            }
            function02.invoke();
            return Unit.INSTANCE;
        }

        /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$TradeLadderOrderSizeInputBottomSheet$1$2, reason: invalid class name */
        static final class AnonymousClass2 implements Function3<RhModalBottomSheet5, Composer, Integer, Unit> {
            final /* synthetic */ Modifier $modifier;
            final /* synthetic */ Function1<LadderInputMode, Unit> $onInputModeSelected;
            final /* synthetic */ Function1<KeyEvent, Unit> $onKeyPress;
            final /* synthetic */ OrderSizeInputBottomSheetState $state;

            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, Function1<? super KeyEvent, Unit> function1, Function1<? super LadderInputMode, Unit> function12, Modifier modifier) {
                this.$state = orderSizeInputBottomSheetState;
                this.$onKeyPress = function1;
                this.$onInputModeSelected = function12;
                this.$modifier = modifier;
            }

            @Override // kotlin.jvm.functions.Function3
            public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer, Integer num) {
                invoke(rhModalBottomSheet5, composer, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(final RhModalBottomSheet5 RhModalBottomSheet, Composer composer, int i) {
                Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                if ((i & 6) == 0) {
                    i |= (i & 8) == 0 ? composer.changed(RhModalBottomSheet) : composer.changedInstance(RhModalBottomSheet) ? 4 : 2;
                }
                if ((i & 19) == 18 && composer.getSkipping()) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1352973174, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheet.<anonymous>.<anonymous> (TradeLadderOrderSizeInputBottomSheet.kt:83)");
                }
                OrderSizeInputBottomSheetState orderSizeInputBottomSheetState = this.$state;
                Function1<KeyEvent, Unit> function1 = this.$onKeyPress;
                Function1<LadderInputMode, Unit> function12 = this.$onInputModeSelected;
                composer.startReplaceGroup(5004770);
                boolean z = (i & 14) == 4 || ((i & 8) != 0 && composer.changedInstance(RhModalBottomSheet));
                Object objRememberedValue = composer.rememberedValue();
                if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$TradeLadderOrderSizeInputBottomSheet$1$2$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TradeLadderOrderSizeInputBottomSheet5.C409901.AnonymousClass2.invoke$lambda$1$lambda$0(RhModalBottomSheet);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                TradeLadderOrderSizeInputBottomSheet5.MainContent(orderSizeInputBottomSheetState, function1, function12, (Function0) objRememberedValue, this.$modifier, composer, 0, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(RhModalBottomSheet5 rhModalBottomSheet5) {
                RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
                return Unit.INSTANCE;
            }
        }
    }

    public static final void TradeLadderOrderSizeInputBottomSheet(final OrderSizeInputBottomSheetState state, final Function1<? super KeyEvent, Unit> onKeyPress, final Function0<Unit> onResetValue, final Function0<Unit> onDismissRequest, final Function1<? super LadderInputMode, Unit> onInputModeSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Intrinsics.checkNotNullParameter(onResetValue, "onResetValue");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        Intrinsics.checkNotNullParameter(onInputModeSelected, "onInputModeSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1882346474);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onResetValue) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDismissRequest) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInputModeSelected) ? 16384 : 8192;
        }
        int i4 = i2 & 32;
        if (i4 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 131072 : 65536;
        }
        if ((74899 & i3) != 74898 || !composerStartRestartGroup.getSkipping()) {
            modifier2 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1882346474, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheet (TradeLadderOrderSizeInputBottomSheet.kt:69)");
            }
            DisableKeyboard.DisableSoftKeyboard(false, ComposableLambda3.rememberComposableLambda(-893232483, true, new C409901(state, onResetValue, onDismissRequest, onKeyPress, onInputModeSelected, modifier2), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TradeLadderOrderSizeInputBottomSheet5.TradeLadderOrderSizeInputBottomSheet$lambda$0(state, onKeyPress, onResetValue, onDismissRequest, onInputModeSelected, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0398  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x03a8  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x03d5  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x04a9  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x04b4  */
    /* JADX WARN: Removed duplicated region for block: B:139:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0249  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MainContent(final OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, final Function1<? super KeyEvent, Unit> function1, final Function1<? super LadderInputMode, Unit> function12, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Object objRememberedValue3;
        Composer composer2;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        final Modifier modifier3;
        int i5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(1724263495);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(orderSizeInputBottomSheetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
            }
            if ((i2 & 4) == 0) {
                i3 |= 384;
            } else if ((i & 384) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function12) ? 256 : 128;
            }
            if ((i2 & 8) == 0) {
                i3 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 2048 : 1024;
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                    if ((i & 24576) == 0) {
                        modifier2 = modifier;
                        i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
                    }
                    if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                        Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1724263495, i3, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.MainContent (TradeLadderOrderSizeInputBottomSheet.kt:101)");
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                            objRememberedValue = new FocusRequester();
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        final FocusRequester focusRequester = (FocusRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                            objRememberedValue2 = new TradeLadderOrderSizeInputBottomSheet6(focusRequester, null);
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21593getSmallD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                            composerStartRestartGroup.useNode();
                        } else {
                            composerStartRestartGroup.createNode(constructor);
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        Modifier.Companion companion3 = Modifier.INSTANCE;
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                        Modifier modifier5 = modifier4;
                        AnimateShake.AnimateShake(null, orderSizeInputBottomSheetState.getShakeInputKey(), ComposableLambda3.rememberComposableLambda(2015609585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1
                            @Override // kotlin.jvm.functions.Function2
                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                invoke(composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @SourceDebugExtension
                            /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1$1 */
                            static final class C409881 implements Function2<Composer, Integer, Unit> {
                                final /* synthetic */ FocusRequester $focusRequester;
                                final /* synthetic */ OrderSizeInputBottomSheetState $state;

                                C409881(FocusRequester focusRequester, OrderSizeInputBottomSheetState orderSizeInputBottomSheetState) {
                                    this.$focusRequester = focusRequester;
                                    this.$state = orderSizeInputBottomSheetState;
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                    invoke(composer, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(Composer composer, int i) {
                                    long jM21425getFg0d7_KjU;
                                    if ((i & 3) == 2 && composer.getSkipping()) {
                                        composer.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(504344513, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.MainContent.<anonymous>.<anonymous>.<anonymous> (TradeLadderOrderSizeInputBottomSheet.kt:119)");
                                    }
                                    Modifier modifierWidth = Intrinsic3.width(Modifier.INSTANCE, Intrinsic4.Min);
                                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                                    int i2 = BentoTheme.$stable;
                                    Modifier modifierFocusRequester = FocusRequesterModifier3.focusRequester(SizeKt.m5176widthInVpY3zN4$default(modifierWidth, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 2, null), this.$focusRequester);
                                    TextFieldValue displayValue = this.$state.getInputValue().getDisplayValue();
                                    SolidColor solidColor = new SolidColor(bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU(), null);
                                    TextStyle displayCapsuleSmall = bentoTheme.getTypography(composer, i2).getDisplayCapsuleSmall();
                                    if (this.$state.getInputValue().isPlaceholder()) {
                                        composer.startReplaceGroup(1132386188);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21427getFg30d7_KjU();
                                        composer.endReplaceGroup();
                                    } else {
                                        composer.startReplaceGroup(1132476429);
                                        jM21425getFg0d7_KjU = bentoTheme.getColors(composer, i2).m21425getFg0d7_KjU();
                                        composer.endReplaceGroup();
                                    }
                                    TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(displayCapsuleSmall, jM21425getFg0d7_KjU, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777214, null);
                                    composer.startReplaceGroup(1849434622);
                                    Object objRememberedValue = composer.rememberedValue();
                                    if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = 
                                        /*  JADX ERROR: Method code generation error
                                            jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e1: CONSTRUCTOR (r3v10 'objRememberedValue' java.lang.Object) =  A[MD:():void (m)] (LINE:1249) call: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1$1$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR in method: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes12.dex
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
                                            Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                            	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                            	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                            	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                            	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                            	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                            	... 25 more
                                            */
                                        /*
                                            Method dump skipped, instructions count: 277
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheet7.C409881.invoke(androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(TextFieldValue it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(Composer composer3, int i7) {
                                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2015609585, i7, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.MainContent.<anonymous>.<anonymous> (TradeLadderOrderSizeInputBottomSheet.kt:117)");
                                    }
                                    TradeLadderOrderSizeInputBottomSheet5.DecorationBox(ComposableLambda3.rememberComposableLambda(504344513, true, new C409881(focusRequester, orderSizeInputBottomSheetState), composer3, 54), orderSizeInputBottomSheetState.getInputValue(), orderSizeInputBottomSheetState.getPlaceholderText(), composer3, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 1);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i6).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                            OrderSizeInputBottomSheetState.SubtitleContent subtitleContent = orderSizeInputBottomSheetState.getSubtitleContent();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                                objRememberedValue3 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$$ExternalSyntheticLambda3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return TradeLadderOrderSizeInputBottomSheet5.MainContent$lambda$11$lambda$4$lambda$3((AnimatedContentTransitionScope) obj);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            AnimatedContentKt.AnimatedContent(subtitleContent, null, (Function1) objRememberedValue3, null, null, null, TradeLadderOrderSizeInputBottomSheet.INSTANCE.getLambda$2098765913$lib_trade_ladder_externalDebug(), composer2, 1573248, 58);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composer2, i6).m21590getDefaultD9Ej5fM()), composer2, 0);
                            composer2.startReplaceGroup(1129003127);
                            if (orderSizeInputBottomSheetState.getInputModeSegments() != null) {
                                Iterator<OrderSizeInputBottomSheetState.InputModeSegment> it = orderSizeInputBottomSheetState.getInputModeSegments().iterator();
                                int i7 = 0;
                                while (true) {
                                    if (!it.hasNext()) {
                                        i5 = -1;
                                        break;
                                    } else {
                                        if (it.next().getInputMode() == orderSizeInputBottomSheetState.getSelectedInputMode()) {
                                            i5 = i7;
                                            break;
                                        }
                                        i7++;
                                    }
                                }
                                if (i5 < 0) {
                                    throw new IllegalArgumentException((orderSizeInputBottomSheetState.getSelectedInputMode() + " is not contained in segments: " + orderSizeInputBottomSheetState.getInputModeSegments()).toString());
                                }
                                Modifier modifierM5174width3ABfNKs = SizeKt.m5174width3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(C2002Dp.m7995constructorimpl(128) * orderSizeInputBottomSheetState.getInputModeSegments().size()));
                                composer2.startReplaceGroup(1129018254);
                                ImmutableList<OrderSizeInputBottomSheetState.InputModeSegment> inputModeSegments = orderSizeInputBottomSheetState.getInputModeSegments();
                                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(inputModeSegments, 10));
                                Iterator<OrderSizeInputBottomSheetState.InputModeSegment> it2 = inputModeSegments.iterator();
                                while (it2.hasNext()) {
                                    arrayList.add(new Segment(null, StringResource2.getString(it2.next().getText(), composer2, StringResource.$stable), null, 5, null));
                                }
                                composer2.endReplaceGroup();
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChangedInstance = composer2.changedInstance(orderSizeInputBottomSheetState) | ((i3 & 896) == 256);
                                Object objRememberedValue4 = composer2.rememberedValue();
                                if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$$ExternalSyntheticLambda4
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return TradeLadderOrderSizeInputBottomSheet5.MainContent$lambda$11$lambda$9$lambda$8(function12, orderSizeInputBottomSheetState, ((Integer) obj).intValue());
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue4);
                                }
                                composer2.endReplaceGroup();
                                BentoSegmentedControl2.BentoSegmentedControl(arrayList, i5, (Function1) objRememberedValue4, modifierM5174width3ABfNKs, false, composer2, 0, 16);
                                composer2 = composer2;
                            }
                            composer2.endReplaceGroup();
                            Modifier.Companion companion4 = Modifier.INSTANCE;
                            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                            int i8 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion4, bentoTheme2.getSpacing(composer2, i8).m21595getXsmallD9Ej5fM()), composer2, 0);
                            BentoNumpad4.INSTANCE.BentoNumpadOnly(null, function1, false, false, true, null, composer2, (i3 & 112) | 24576 | (BentoNumpad4.$stable << 18), 45);
                            Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion4, 0.0f, bentoTheme2.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap2 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
                            ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor2 = companion5.getConstructor();
                            if (composer2.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                                composer2.useNode();
                            } else {
                                composer2.createNode(constructor2);
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion5.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion5.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion5.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion5.getSetModifier());
                            Row6 row6 = Row6.INSTANCE;
                            Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composer2, 0);
                            Composer composer3 = composer2;
                            BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C40888R.string.order_size_input_sheet_done_button, composer2, 0), Row5.weight$default(row6, PaddingKt.m5144paddingVpY3zN4$default(companion4, bentoTheme2.getSpacing(composer2, i8).m21593getSmallD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), null, BentoButtons.Type.Secondary, false, false, null, null, Color.m6701boximpl(bentoTheme2.getColors(composer2, i8).m21427getFg30d7_KjU()), TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composer2, i8).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), false, null, composer3, ((i3 >> 9) & 14) | 24576, 0, 6632);
                            composerStartRestartGroup = composer3;
                            Spacer2.Spacer(Row5.weight$default(row6, companion4, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                            composerStartRestartGroup.endNode();
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            composerStartRestartGroup.skipToGroupEnd();
                            modifier3 = modifier2;
                        }
                        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return TradeLadderOrderSizeInputBottomSheet5.MainContent$lambda$12(orderSizeInputBottomSheetState, function1, function12, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                                }
                            });
                            return;
                        }
                        return;
                    }
                    i3 |= 24576;
                    modifier2 = modifier;
                    if ((i3 & 9363) == 9362) {
                        if (i4 == 0) {
                        }
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        companion = Composer.INSTANCE;
                        if (objRememberedValue == companion.getEmpty()) {
                        }
                        final FocusRequester focusRequester2 = (FocusRequester) objRememberedValue;
                        composerStartRestartGroup.endReplaceGroup();
                        Unit unit2 = Unit.INSTANCE;
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue2 == companion.getEmpty()) {
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        EffectsKt.LaunchedEffect(unit2, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 6);
                        Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(modifier4, 0.0f, 1, null);
                        BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                        int i62 = BentoTheme.$stable;
                        Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Background3.m4872backgroundbw27NRU$default(modifierFillMaxWidth$default2, bentoTheme3.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), null, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21593getSmallD9Ej5fM(), 7, null);
                        MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                        currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                        CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                        ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor3 = companion22.getConstructor();
                        if (composerStartRestartGroup.getApplier() == null) {
                        }
                        composerStartRestartGroup.startReusableNode();
                        if (composerStartRestartGroup.getInserting()) {
                        }
                        composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap3, companion22.getSetResolvedCompositionLocals());
                        setCompositeKeyHash = companion22.getSetCompositeKeyHash();
                        if (!composerM6388constructorimpl.getInserting()) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier3, companion22.getSetModifier());
                            Column6 column62 = Column6.INSTANCE;
                            Modifier.Companion companion32 = Modifier.INSTANCE;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                            Modifier modifier52 = modifier4;
                            AnimateShake.AnimateShake(null, orderSizeInputBottomSheetState.getShakeInputKey(), ComposableLambda3.rememberComposableLambda(2015609585, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer32, Integer num) {
                                    invoke(composer32, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
                                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                                @SourceDebugExtension
                                /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1$1 */
                                static final class C409881 implements Function2<Composer, Integer, Unit> {
                                    final /* synthetic */ FocusRequester $focusRequester;
                                    final /* synthetic */ OrderSizeInputBottomSheetState $state;

                                    C409881(FocusRequester focusRequester, OrderSizeInputBottomSheetState orderSizeInputBottomSheetState) {
                                        this.$focusRequester = focusRequester;
                                        this.$state = orderSizeInputBottomSheetState;
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                                        invoke(composer, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    /*  JADX ERROR: Method code generation error
                                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x00e1: CONSTRUCTOR (r3v10 'objRememberedValue' java.lang.Object) =  A[MD:():void (m)] (LINE:1249) call: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1$1$$ExternalSyntheticLambda0.<init>():void type: CONSTRUCTOR in method: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1.1.invoke(androidx.compose.runtime.Composer, int):void, file: classes12.dex
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
                                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Expected class to be processed at this point, class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$MainContent$2$1$1$$ExternalSyntheticLambda0, state: NOT_LOADED
                                        	at jadx.core.dex.nodes.ClassNode.ensureProcessed(ClassNode.java:306)
                                        	at jadx.core.codegen.InsnGen.inlineAnonymousConstructor(InsnGen.java:807)
                                        	at jadx.core.codegen.InsnGen.makeConstructor(InsnGen.java:730)
                                        	at jadx.core.codegen.InsnGen.makeInsnBody(InsnGen.java:418)
                                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:303)
                                        	... 20 more
                                        */
                                    public final void invoke(androidx.compose.runtime.Composer r49, int r50) {
                                        /*
                                            Method dump skipped, instructions count: 277
                                            To view this dump add '--comments-level debug' option
                                        */
                                        throw new UnsupportedOperationException("Method not decompiled: com.robinhood.shared.tradeladder.p398ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheet7.C409881.invoke(androidx.compose.runtime.Composer, int):void");
                                    }

                                    /* JADX INFO: Access modifiers changed from: private */
                                    public static final Unit invoke$lambda$1$lambda$0(TextFieldValue it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return Unit.INSTANCE;
                                    }
                                }

                                public final void invoke(Composer composer32, int i72) {
                                    if ((i72 & 3) == 2 && composer32.getSkipping()) {
                                        composer32.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(2015609585, i72, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.MainContent.<anonymous>.<anonymous> (TradeLadderOrderSizeInputBottomSheet.kt:117)");
                                    }
                                    TradeLadderOrderSizeInputBottomSheet5.DecorationBox(ComposableLambda3.rememberComposableLambda(504344513, true, new C409881(focusRequester2, orderSizeInputBottomSheetState), composer32, 54), orderSizeInputBottomSheetState.getInputValue(), orderSizeInputBottomSheetState.getPlaceholderText(), composer32, 6);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 1);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme3.getSpacing(composerStartRestartGroup, i62).m21595getXsmallD9Ej5fM()), composerStartRestartGroup, 0);
                            OrderSizeInputBottomSheetState.SubtitleContent subtitleContent2 = orderSizeInputBottomSheetState.getSubtitleContent();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            composer2 = composerStartRestartGroup;
                            AnimatedContentKt.AnimatedContent(subtitleContent2, null, (Function1) objRememberedValue3, null, null, null, TradeLadderOrderSizeInputBottomSheet.INSTANCE.getLambda$2098765913$lib_trade_ladder_externalDebug(), composer2, 1573248, 58);
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme3.getSpacing(composer2, i62).m21590getDefaultD9Ej5fM()), composer2, 0);
                            composer2.startReplaceGroup(1129003127);
                            if (orderSizeInputBottomSheetState.getInputModeSegments() != null) {
                            }
                            composer2.endReplaceGroup();
                            Modifier.Companion companion42 = Modifier.INSTANCE;
                            BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                            int i82 = BentoTheme.$stable;
                            Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion42, bentoTheme22.getSpacing(composer2, i82).m21595getXsmallD9Ej5fM()), composer2, 0);
                            BentoNumpad4.INSTANCE.BentoNumpadOnly(null, function1, false, false, true, null, composer2, (i3 & 112) | 24576 | (BentoNumpad4.$stable << 18), 45);
                            Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion42, 0.0f, bentoTheme22.getSpacing(composer2, i82).m21593getSmallD9Ej5fM(), 1, null);
                            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getCenterVertically(), composer2, 48);
                            currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap22 = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default2);
                            ComposeUiNode.Companion companion52 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor22 = companion52.getConstructor();
                            if (composer2.getApplier() == null) {
                            }
                            composer2.startReusableNode();
                            if (composer2.getInserting()) {
                            }
                            composerM6388constructorimpl2 = Updater.m6388constructorimpl(composer2);
                            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy2, companion52.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion52.getSetResolvedCompositionLocals());
                            setCompositeKeyHash2 = companion52.getSetCompositeKeyHash();
                            if (!composerM6388constructorimpl2.getInserting()) {
                                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion52.getSetModifier());
                                Row6 row62 = Row6.INSTANCE;
                                Spacer2.Spacer(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), composer2, 0);
                                Composer composer32 = composer2;
                                BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C40888R.string.order_size_input_sheet_done_button, composer2, 0), Row5.weight$default(row62, PaddingKt.m5144paddingVpY3zN4$default(companion42, bentoTheme22.getSpacing(composer2, i82).m21593getSmallD9Ej5fM(), 0.0f, 2, null), 1.0f, false, 2, null), null, BentoButtons.Type.Secondary, false, false, null, null, Color.m6701boximpl(bentoTheme22.getColors(composer2, i82).m21427getFg30d7_KjU()), TextStyle.m7655copyp1EtxEg$default(bentoTheme22.getTypography(composer2, i82).getTextM(), 0L, 0L, FontWeight.INSTANCE.getBold(), null, null, null, null, 0L, null, null, null, 0L, null, null, null, 0, 0, 0L, null, null, null, 0, 0, null, 16777211, null), false, null, composer32, ((i3 >> 9) & 14) | 24576, 0, 6632);
                                composerStartRestartGroup = composer32;
                                Spacer2.Spacer(Row5.weight$default(row62, companion42, 1.0f, false, 2, null), composerStartRestartGroup, 0);
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                    scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i4 = i2 & 16;
                if (i4 == 0) {
                }
                modifier2 = modifier;
                if ((i3 & 9363) == 9362) {
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i2 & 4) == 0) {
            }
            if ((i2 & 8) == 0) {
            }
            i4 = i2 & 16;
            if (i4 == 0) {
            }
            modifier2 = modifier;
            if ((i3 & 9363) == 9362) {
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform MainContent$lambda$11$lambda$4$lambda$3(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit MainContent$lambda$11$lambda$9$lambda$8(Function1 function1, OrderSizeInputBottomSheetState orderSizeInputBottomSheetState, int i) {
            function1.invoke(orderSizeInputBottomSheetState.getInputModeSegments().get(i).getInputMode());
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void DecorationBox(final Function2<? super Composer, ? super Integer, Unit> function2, final OrderSizeInputBottomSheetState.InputValue inputValue, final String str, Composer composer, final int i) {
            int i2;
            Composer composer2;
            int i3;
            BentoTheme bentoTheme;
            int i4;
            Composer composer3;
            Composer composerStartRestartGroup = composer.startRestartGroup(883217394);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changedInstance(function2) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i & 48) == 0) {
                i2 |= composerStartRestartGroup.changedInstance(inputValue) ? 32 : 16;
            }
            if ((i & 384) == 0) {
                i2 |= composerStartRestartGroup.changed(str) ? 256 : 128;
            }
            if ((i2 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer3 = composerStartRestartGroup;
            } else {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(883217394, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.DecorationBox (TradeLadderOrderSizeInputBottomSheet.kt:224)");
                }
                Arrangement arrangement = Arrangement.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Arrangement.HorizontalOrVertical horizontalOrVerticalM5089spacedBy0680j_4 = arrangement.m5089spacedBy0680j_4(bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM());
                Alignment.Companion companion = Alignment.INSTANCE;
                Alignment.Vertical centerVertically = companion.getCenterVertically();
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(horizontalOrVerticalM5089spacedBy0680j_4, centerVertically, composerStartRestartGroup, 48);
                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(companion.getTopStart(), false);
                int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion2);
                Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
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
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyMaybeCachedBoxMeasurePolicy, companion3.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
                if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
                BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
                composerStartRestartGroup.startReplaceGroup(-1160718587);
                if (Intrinsics.areEqual(inputValue.getDisplayValue().getText(), "")) {
                    Modifier modifierM5155defaultMinSizeVpY3zN4$default = SizeKt.m5155defaultMinSizeVpY3zN4$default(companion2, bentoTheme2.getSpacing(composerStartRestartGroup, i5).m21590getDefaultD9Ej5fM(), 0.0f, 2, null);
                    long jM21427getFg30d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i5).m21427getFg30d7_KjU();
                    i3 = i2;
                    i4 = i5;
                    bentoTheme = bentoTheme2;
                    BentoText2.m20747BentoText38GnDrw(str, modifierM5155defaultMinSizeVpY3zN4$default, Color.m6701boximpl(jM21427getFg30d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleSmall(), composerStartRestartGroup, (i2 >> 6) & 14, 0, 8184);
                    composer2 = composerStartRestartGroup;
                } else {
                    composer2 = composerStartRestartGroup;
                    i3 = i2;
                    bentoTheme = bentoTheme2;
                    i4 = i5;
                }
                composer2.endReplaceGroup();
                function2.invoke(composer2, Integer.valueOf(i3 & 14));
                composer2.endNode();
                String trailingSymbol = inputValue.getTrailingSymbol();
                composer2.startReplaceGroup(919138613);
                if (trailingSymbol == null) {
                    composer3 = composer2;
                } else {
                    int i6 = i4;
                    Composer composer4 = composer2;
                    BentoText2.m20747BentoText38GnDrw(trailingSymbol, null, Color.m6701boximpl(bentoTheme.getColors(composer2, i6).m21427getFg30d7_KjU()), null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleSmall(), composer4, 0, 0, 8186);
                    composer3 = composer4;
                }
                composer3.endReplaceGroup();
                composer3.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradeLadderOrderSizeInputBottomSheet5.DecorationBox$lambda$16(function2, inputValue, str, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }

        /* compiled from: TradeLadderOrderSizeInputBottomSheet.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @SourceDebugExtension
        /* renamed from: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$PreviewTradeLadderOrderSizeInputBottomSheet$1 */
        static final class C409891 implements Function2<Composer, Integer, Unit> {
            final /* synthetic */ TradeLadderOrderSizeInputBottomSheet3.Parameters $parameters;

            C409891(TradeLadderOrderSizeInputBottomSheet3.Parameters parameters) {
                this.$parameters = parameters;
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
                    ComposerKt.traceEventStart(901797852, i, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.PreviewTradeLadderOrderSizeInputBottomSheet.<anonymous> (TradeLadderOrderSizeInputBottomSheet.kt:370)");
                }
                OrderSizeInputBottomSheetState state = this.$parameters.getState();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue = composer.rememberedValue();
                Composer.Companion companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$PreviewTradeLadderOrderSizeInputBottomSheet$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TradeLadderOrderSizeInputBottomSheet5.C409891.invoke$lambda$1$lambda$0((KeyEvent) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                Function1 function1 = (Function1) objRememberedValue;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue2 = composer.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$PreviewTradeLadderOrderSizeInputBottomSheet$1$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return TradeLadderOrderSizeInputBottomSheet5.C409891.invoke$lambda$3$lambda$2((LadderInputMode) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                Function1 function12 = (Function1) objRememberedValue2;
                composer.endReplaceGroup();
                composer.startReplaceGroup(1849434622);
                Object objRememberedValue3 = composer.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$PreviewTradeLadderOrderSizeInputBottomSheet$1$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.INSTANCE;
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                composer.endReplaceGroup();
                TradeLadderOrderSizeInputBottomSheet5.MainContent(state, function1, function12, (Function0) objRememberedValue3, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer, 3504, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$1$lambda$0(KeyEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.INSTANCE;
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final Unit invoke$lambda$3$lambda$2(LadderInputMode it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Unit.INSTANCE;
            }
        }

        public static final void PreviewTradeLadderOrderSizeInputBottomSheet(final TradeLadderOrderSizeInputBottomSheet3.Parameters parameters, Composer composer, final int i) {
            int i2;
            Intrinsics.checkNotNullParameter(parameters, "parameters");
            Composer composerStartRestartGroup = composer.startRestartGroup(-1571334787);
            if ((i & 6) == 0) {
                i2 = (composerStartRestartGroup.changedInstance(parameters) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1571334787, i2, -1, "com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.PreviewTradeLadderOrderSizeInputBottomSheet (TradeLadderOrderSizeInputBottomSheet.kt:368)");
                }
                PreviewLadderBentoTheme2.PreviewLadderBentoTheme(false, ComposableLambda3.rememberComposableLambda(901797852, true, new C409891(parameters), composerStartRestartGroup, 54), composerStartRestartGroup, 48, 1);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.tradeladder.ui.ladder.shared.bottombar.TradeLadderOrderSizeInputBottomSheetKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TradeLadderOrderSizeInputBottomSheet5.PreviewTradeLadderOrderSizeInputBottomSheet$lambda$17(parameters, i, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
    }
