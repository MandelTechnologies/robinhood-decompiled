package com.robinhood.android.equityadvancedorder.composables;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.animation.core.AnimationSpecKt;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.interaction.InteractionSource2;
import androidx.compose.foundation.interaction.InteractionSource3;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.focus.FocusManager;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.graphics.RectangleShape2;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.advancedorderbottomsheet.EditingField;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetContentComposable;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderBottomSheetState;
import com.robinhood.android.advancedorderbottomsheet.EquityAdvancedOrderDropdownEditCallbacks;
import com.robinhood.android.equities.taxlots.selectlotsrow.SelectLotsRowComposable3;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderNumpadButtonState;
import com.robinhood.android.equityadvancedorder.EquityAdvancedOrderNumpadState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState;
import com.robinhood.android.equityadvancedorder.EquityOrderFormRowState2;
import com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout;
import com.robinhood.android.lib.accountswitcher.AccountSwitcherCallbacks3;
import com.robinhood.android.lib.trade.view.InstrumentAccountSwitcherState;
import com.robinhood.android.lib.trade.view.TradeAccountSwitcher2;
import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.waitlist.spot.WaitlistAnimationConstants;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV2;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScopeV22;
import com.robinhood.compose.bento.component.numpad.BentoNumpadScreenLayoutV2;
import com.robinhood.compose.bento.component.text.BentoMarkdownSpannedText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.theme.Styles;
import com.robinhood.compose.theme.Styles2;
import com.robinhood.shared.trading.tradeflow.OrderForm6;
import com.robinhood.utils.resource.StringResource;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AdvancedOrderNumpadLayout.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\f\u001a]\u0010\r\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0003\u001a\u00020\u00042\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\nH\u0003¢\u0006\u0002\u0010\u0012\u001a3\u0010\u0013\u001a\u00020\u00012\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001aH\u0003¢\u0006\u0002\u0010\u001b\u001a\u009d\u0001\u0010\u001c\u001a\u00020\u00012\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\u0006\u0010%\u001a\u00020&2\"\u0010'\u001a\u001e\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u001a0(\u0012\u0004\u0012\u00020\u0001\u0018\u00010!2\b\u0010*\u001a\u0004\u0018\u00010+2\b\b\u0002\u0010,\u001a\u00020-H\u0001¢\u0006\u0002\u0010.\u001a\u0091\u0002\u0010/\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u00042\u0012\u00100\u001a\u000e\u0012\u0004\u0012\u000201\u0012\u0004\u0012\u00020\u00010!2\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\n2 \u0010'\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0006\u0012\u0004\u0018\u00010)\u0012\u0004\u0012\u00020\u001a0(\u0012\u0004\u0012\u00020\u00010!2\u000e\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u001e2\b\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00010!2\u0012\u0010\"\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\u00010!2\f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u00102\u001a\u00020\u000f2\u0006\u00103\u001a\u0002042\b\b\u0002\u00105\u001a\u000206H\u0007¢\u0006\u0002\u00107\"\u000e\u00108\u001a\u000209X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010:\u001a\u000209X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010;\u001a\u000209X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010<\u001a\u000209X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010=\u001a\u000209X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010>\u001a\u00020-X\u0080T¢\u0006\u0002\n\u0000¨\u0006?"}, m3636d2 = {"AdvancedOrderFooter", "", "Landroidx/compose/animation/AnimatedContentScope;", "numpadState", "Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadState;", "accountSwitcherCallbacks", "Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;", "accountSwitcherState", "Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;", "textButtonOnClick", "Lkotlin/Function0;", "buttonOnClick", "(Landroidx/compose/animation/AnimatedContentScope;Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadState;Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AdvancedOrderKeyboardV2", "bentoNumpadScopeV2Impl", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2Impl;", "primaryButtonOnClick", "twentyFourHourButtonOnClick", "(Landroidx/compose/animation/AnimatedContentScope;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2Impl;Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "AdvancedOrderBottomSheet", "hideBottomSheet", "bottomSheetCallbacks", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;", "bottomSheetState", "Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;", "editingField", "Lcom/robinhood/android/advancedorderbottomsheet/EditingField;", "(Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;Landroidx/compose/runtime/Composer;I)V", "AdvancedOrderRows", "rowStates", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState;", "rowClicked", "Lkotlin/Function1;", "rowIconClicked", "Lcom/robinhood/android/equityadvancedorder/EquityOrderFormRowState$Icon$IconId;", "rowSecondaryIconClicked", "interactionSource", "Landroidx/compose/foundation/interaction/MutableInteractionSource;", "onNumberChange", "Lkotlin/Pair;", "Ljava/math/BigDecimal;", "bentoNumpadScopeV2", "Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;", "resetTooltip", "", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;Landroidx/compose/foundation/interaction/MutableInteractionSource;Lkotlin/jvm/functions/Function1;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2;ILandroidx/compose/runtime/Composer;II)V", "AdvancedOrderNumpadLayout", "hideKeyboard", "Landroidx/compose/ui/focus/FocusManager;", "numpadScope", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/equityadvancedorder/EquityAdvancedOrderNumpadState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlinx/collections/immutable/ImmutableList;Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderBottomSheetState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/lib/accountswitcher/AccountSwitcherCtaCallbacks;Lcom/robinhood/android/lib/trade/view/InstrumentAccountSwitcherState;Lcom/robinhood/android/advancedorderbottomsheet/EditingField;Lkotlin/jvm/functions/Function0;Lcom/robinhood/android/advancedorderbottomsheet/EquityAdvancedOrderDropdownEditCallbacks;Lcom/robinhood/compose/bento/component/numpad/BentoNumpadScopeV2Impl;Lkotlinx/coroutines/CoroutineScope;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;III)V", "HIDE_KEYBOARD_TEST_TAG", "", "KEYPAD_TEST_TAG", "NO_KEYPAD_BUTTON_TEST_TAG", "ACCOUNT_SWITCHER_TEST_TAG", "TEXT_BUTTON_TEST_TAG", "ANIMATION_DURATION", "lib-equity-advanced-order_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class AdvancedOrderNumpadLayout {
    public static final String ACCOUNT_SWITCHER_TEST_TAG = "account_switcher";
    public static final int ANIMATION_DURATION = 300;
    public static final String HIDE_KEYBOARD_TEST_TAG = "hide_keyboard";
    public static final String KEYPAD_TEST_TAG = "keypad";
    public static final String NO_KEYPAD_BUTTON_TEST_TAG = "no_keypad_button";
    public static final String TEXT_BUTTON_TEST_TAG = "text_button";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderBottomSheet$lambda$16(Function0 function0, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, EditingField editingField, int i, Composer composer, int i2) {
        AdvancedOrderBottomSheet(function0, equityAdvancedOrderDropdownEditCallbacks, equityAdvancedOrderBottomSheetState, editingField, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderFooter$lambda$9(AnimatedContentScope animatedContentScope, EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, AccountSwitcherCallbacks3 accountSwitcherCallbacks3, InstrumentAccountSwitcherState instrumentAccountSwitcherState, Function0 function0, Function0 function02, int i, Composer composer, int i2) throws Resources.NotFoundException {
        AdvancedOrderFooter(animatedContentScope, equityAdvancedOrderNumpadState, accountSwitcherCallbacks3, instrumentAccountSwitcherState, function0, function02, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderKeyboardV2$lambda$15(AnimatedContentScope animatedContentScope, BentoNumpadScopeV22 bentoNumpadScopeV22, AccountSwitcherCallbacks3 accountSwitcherCallbacks3, InstrumentAccountSwitcherState instrumentAccountSwitcherState, EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, Function0 function0, Function0 function02, Function0 function03, int i, Composer composer, int i2) {
        AdvancedOrderKeyboardV2(animatedContentScope, bentoNumpadScopeV22, accountSwitcherCallbacks3, instrumentAccountSwitcherState, equityAdvancedOrderNumpadState, function0, function02, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderNumpadLayout$lambda$33(EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, Function1 function1, Function0 function0, Function0 function02, Function0 function03, Function1 function12, ImmutableList immutableList, EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, Function1 function13, Function1 function14, Function0 function04, AccountSwitcherCallbacks3 accountSwitcherCallbacks3, InstrumentAccountSwitcherState instrumentAccountSwitcherState, EditingField editingField, Function0 function05, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, BentoNumpadScopeV22 bentoNumpadScopeV22, CoroutineScope coroutineScope, Modifier modifier, int i, int i2, int i3, Composer composer, int i4) {
        AdvancedOrderNumpadLayout(equityAdvancedOrderNumpadState, function1, function0, function02, function03, function12, immutableList, equityAdvancedOrderBottomSheetState, function13, function14, function04, accountSwitcherCallbacks3, instrumentAccountSwitcherState, editingField, function05, equityAdvancedOrderDropdownEditCallbacks, bentoNumpadScopeV22, coroutineScope, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderRows$lambda$29(ImmutableList immutableList, Function1 function1, Function1 function12, Function0 function0, EditingField editingField, InteractionSource3 interactionSource3, Function1 function13, BentoNumpadScopeV2 bentoNumpadScopeV2, int i, int i2, int i3, Composer composer, int i4) throws Resources.NotFoundException {
        AdvancedOrderRows(immutableList, function1, function12, function0, editingField, interactionSource3, function13, bentoNumpadScopeV2, i, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvancedOrderFooter(final AnimatedContentScope animatedContentScope, final EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, final AccountSwitcherCallbacks3 accountSwitcherCallbacks3, final InstrumentAccountSwitcherState instrumentAccountSwitcherState, final Function0<Unit> function0, final Function0<Unit> function02, Composer composer, final int i) throws Resources.NotFoundException {
        int i2;
        Modifier.Companion companion;
        Resources resources;
        int i3;
        int i4;
        CharSequence charSequence;
        int i5;
        CharSequence text;
        int i6;
        Resources resources2;
        BentoTheme bentoTheme;
        int i7;
        Modifier.Companion companion2;
        Column6 column6;
        CharSequence charSequence2;
        Composer composer2;
        int i8;
        Composer composerStartRestartGroup = composer.startRestartGroup(-196983792);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(animatedContentScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(equityAdvancedOrderNumpadState) : composerStartRestartGroup.changedInstance(equityAdvancedOrderNumpadState) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(accountSwitcherCallbacks3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(instrumentAccountSwitcherState) : composerStartRestartGroup.changedInstance(instrumentAccountSwitcherState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 131072 : 65536;
        }
        if ((74899 & i2) == 74898 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-196983792, i2, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderFooter (AdvancedOrderNumpadLayout.kt:73)");
            }
            Resources resources3 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            Modifier modifierPadding = PaddingKt.padding(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getNumpad(composerStartRestartGroup, 0).getSpacing().getCtaButtonPadding());
            TweenSpec tweenSpecTween$default = AnimationSpecKt.tween$default(300, 300, null, 4, null);
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion4 = Composer.INSTANCE;
            if (objRememberedValue == companion4.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Integer.valueOf(AdvancedOrderNumpadLayout.AdvancedOrderFooter$lambda$1$lambda$0(((Integer) obj).intValue()));
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifierAnimateEnterExit$default = AnimatedVisibilityScope.animateEnterExit$default(animatedContentScope, modifierPadding, EnterExitTransitionKt.slideInVertically(tweenSpecTween$default, (Function1) objRememberedValue), ExitTransition.INSTANCE.getNone(), null, 4, null);
            Alignment.Companion companion5 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), companion5.getCenterHorizontally(), composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAnimateEnterExit$default);
            ComposeUiNode.Companion companion6 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion6.getConstructor();
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion6.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion6.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion6.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion6.getSetModifier());
            Column6 column62 = Column6.INSTANCE;
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i9 = BentoTheme.$stable;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM() - ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getNumpad(composerStartRestartGroup, 0).getSpacing().getCtaButtonPadding().getTop());
            composerStartRestartGroup.startReplaceGroup(1281146882);
            if (instrumentAccountSwitcherState == null) {
                resources = resources3;
                i5 = i2;
                i3 = 0;
                i4 = 1;
                charSequence = null;
                companion = companion3;
            } else {
                companion = companion3;
                resources = resources3;
                i3 = 0;
                i4 = 1;
                charSequence = null;
                i5 = i2;
                TradeAccountSwitcher2.TradeAccountSwitcher(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM7995constructorimpl, 7, null), ACCOUNT_SWITCHER_TEST_TAG), instrumentAccountSwitcherState, accountSwitcherCallbacks3, composerStartRestartGroup, (InstrumentAccountSwitcherState.$stable << 3) | (i2 & 896), 0);
                Unit unit = Unit.INSTANCE;
            }
            composerStartRestartGroup.endReplaceGroup();
            StringResource footerTextMarkdown = equityAdvancedOrderNumpadState.getFooterTextMarkdown();
            if (footerTextMarkdown != null) {
                Intrinsics.checkNotNull(resources);
                text = footerTextMarkdown.getText(resources);
            } else {
                text = charSequence;
            }
            composerStartRestartGroup.startReplaceGroup(1281159008);
            if (text == null) {
                column6 = column62;
                i7 = i9;
                resources2 = resources;
                companion2 = companion;
                i6 = i4;
                charSequence2 = charSequence;
                composer2 = composerStartRestartGroup;
                bentoTheme = bentoTheme2;
            } else {
                String string2 = text.toString();
                int i10 = C20690R.attr.textAppearanceRegularSmall;
                long jM21426getFg20d7_KjU = bentoTheme2.getColors(composerStartRestartGroup, i9).m21426getFg20d7_KjU();
                i6 = i4;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i9).m21590getDefaultD9Ej5fM(), 7, null);
                Color colorM6701boximpl = Color.m6701boximpl(jM21426getFg20d7_KjU);
                resources2 = resources;
                bentoTheme = bentoTheme2;
                i7 = i9;
                companion2 = companion;
                column6 = column62;
                charSequence2 = charSequence;
                BentoMarkdownSpannedText2.m21101BentoMarkdownSpannedTextTHkziT8(string2, modifierM5146paddingqDBjuR0$default, colorM6701boximpl, null, i10, 17, 0, 0, null, composerStartRestartGroup, 196608, WaitlistAnimationConstants.MIDDLE_YAW_FRAME);
                composer2 = composerStartRestartGroup;
                Unit unit2 = Unit.INSTANCE;
            }
            composer2.endReplaceGroup();
            composer2.startReplaceGroup(1281171574);
            if (equityAdvancedOrderNumpadState.getTextButtonState().getState().getVisible()) {
                StringResource buttonText = equityAdvancedOrderNumpadState.getTextButtonState().getButtonText();
                Intrinsics.checkNotNull(resources2);
                String string3 = buttonText.getText(resources2).toString();
                boolean enabled = equityAdvancedOrderNumpadState.getTextButtonState().getState().getEnabled();
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(column6.align(companion2, companion5.getCenterHorizontally()), TEXT_BUTTON_TEST_TAG), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i7).m21592getMediumD9Ej5fM(), 7, null);
                composer2.startReplaceGroup(5004770);
                int i11 = (i5 & 57344) == 16384 ? i6 : i3;
                Object objRememberedValue2 = composer2.rememberedValue();
                if (i11 != 0 || objRememberedValue2 == companion4.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvancedOrderNumpadLayout.AdvancedOrderFooter$lambda$8$lambda$5$lambda$4(function0);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                i8 = 5004770;
                Composer composer3 = composer2;
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue2, string3, modifierM5146paddingqDBjuR0$default2, null, null, enabled, null, composer3, 0, 88);
                composerStartRestartGroup = composer3;
            } else {
                composerStartRestartGroup = composer2;
                i8 = 5004770;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1281189774);
            if (equityAdvancedOrderNumpadState.getPrimaryButtonState().getState().getVisible()) {
                StringResource buttonText2 = equityAdvancedOrderNumpadState.getPrimaryButtonState().getButtonText();
                Intrinsics.checkNotNull(resources2);
                String string4 = buttonText2.getText(resources2).toString();
                boolean enabled2 = equityAdvancedOrderNumpadState.getPrimaryButtonState().getState().getEnabled();
                boolean loading = equityAdvancedOrderNumpadState.getPrimaryButtonState().getState().getLoading();
                Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(TestTag3.testTag(companion2, NO_KEYPAD_BUTTON_TEST_TAG), 0.0f, i6, charSequence2);
                composerStartRestartGroup.startReplaceGroup(i8);
                if ((i5 & 458752) == 131072) {
                    i3 = i6;
                }
                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (i3 != 0 || objRememberedValue3 == companion4.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvancedOrderNumpadLayout.AdvancedOrderFooter$lambda$8$lambda$7$lambda$6(function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue3, string4, modifierFillMaxWidth$default, null, null, enabled2, loading, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8088);
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvancedOrderNumpadLayout.AdvancedOrderFooter$lambda$9(animatedContentScope, equityAdvancedOrderNumpadState, accountSwitcherCallbacks3, instrumentAccountSwitcherState, function0, function02, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int AdvancedOrderFooter$lambda$1$lambda$0(int i) {
        return i + (i / 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderFooter$lambda$8$lambda$5$lambda$4(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderFooter$lambda$8$lambda$7$lambda$6(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvancedOrderKeyboardV2(final AnimatedContentScope animatedContentScope, final BentoNumpadScopeV22 bentoNumpadScopeV22, final AccountSwitcherCallbacks3 accountSwitcherCallbacks3, final InstrumentAccountSwitcherState instrumentAccountSwitcherState, final EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, final Function0<Unit> function0, final Function0<Unit> function02, final Function0<Unit> function03, Composer composer, final int i) {
        int i2;
        Resources resources;
        boolean z;
        Modifier.Companion companion;
        boolean z2;
        int i3;
        Composer composerStartRestartGroup = composer.startRestartGroup(1718472879);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(animatedContentScope) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(bentoNumpadScopeV22) : composerStartRestartGroup.changedInstance(bentoNumpadScopeV22) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(accountSwitcherCallbacks3) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? composerStartRestartGroup.changed(instrumentAccountSwitcherState) : composerStartRestartGroup.changedInstance(instrumentAccountSwitcherState) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(equityAdvancedOrderNumpadState) : composerStartRestartGroup.changedInstance(equityAdvancedOrderNumpadState) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function0) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function02) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(function03) ? 8388608 : 4194304;
        }
        if ((4793491 & i2) == 4793490 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1718472879, i2, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderKeyboardV2 (AdvancedOrderNumpadLayout.kt:150)");
            }
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Modifier.Companion companion3 = Modifier.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), centerHorizontally, composerStartRestartGroup, 48);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion4.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion4.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion4.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion4.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            float fM7995constructorimpl = C2002Dp.m7995constructorimpl(bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM() - ((Styles) composerStartRestartGroup.consume(Styles2.getLocalStyles())).getNumpad(composerStartRestartGroup, 0).getSpacing().getCtaButtonPadding().getTop());
            composerStartRestartGroup.startReplaceGroup(1993689008);
            EquityAdvancedOrderNumpadButtonState textButtonState = equityAdvancedOrderNumpadState.getTextButtonState();
            composerStartRestartGroup.startReplaceGroup(1993689835);
            if (textButtonState.getState().getVisible()) {
                StringResource buttonText = textButtonState.getButtonText();
                Intrinsics.checkNotNull(resources2);
                String string2 = buttonText.getText(resources2).toString();
                boolean enabled = textButtonState.getState().getEnabled();
                resources = resources2;
                Modifier modifierTestTag = TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(PaddingKt.m5146paddingqDBjuR0$default(column6.align(companion3, companion2.getCenterHorizontally()), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 7, null), 0.0f, composerStartRestartGroup, 0, 1), TEXT_BUTTON_TEST_TAG);
                composerStartRestartGroup.startReplaceGroup(5004770);
                boolean z3 = (3670016 & i2) == 1048576;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda10
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return AdvancedOrderNumpadLayout.AdvancedOrderKeyboardV2$lambda$14$lambda$12$lambda$11$lambda$10(function02);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                Function0 function04 = (Function0) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                companion = companion3;
                z = true;
                BentoTextButton2.m20715BentoTextButtonPIknLig(function04, string2, modifierTestTag, null, null, enabled, null, composerStartRestartGroup, 0, 88);
            } else {
                resources = resources2;
                z = true;
                companion = companion3;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1993709877);
            if (instrumentAccountSwitcherState == null) {
                z2 = z;
                i3 = i4;
            } else {
                z2 = z;
                i3 = i4;
                TradeAccountSwitcher2.TradeAccountSwitcher(TestTag3.testTag(PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, fM7995constructorimpl, 7, null), ACCOUNT_SWITCHER_TEST_TAG), instrumentAccountSwitcherState, accountSwitcherCallbacks3, composerStartRestartGroup, (i2 & 896) | (InstrumentAccountSwitcherState.$stable << 3), 0);
            }
            composerStartRestartGroup.endReplaceGroup();
            long prime = bentoTheme.getColors(composerStartRestartGroup, i3).getPrime();
            ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-1114760885, z2, new AdvancedOrderNumpadLayout2(equityAdvancedOrderNumpadState, function03, focusManager, function0, resources, animatedContentScope, bentoNumpadScopeV22), composerStartRestartGroup, 54);
            composerStartRestartGroup = composerStartRestartGroup;
            BentoThemeOverlays.m21607CustomThemeOverlaywsPGbo(0L, prime, 0L, 0L, 0L, 0L, 0L, 0L, 0L, composableLambdaRememberComposableLambda, composerStartRestartGroup, 805306368, 509);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvancedOrderNumpadLayout.AdvancedOrderKeyboardV2$lambda$15(animatedContentScope, bentoNumpadScopeV22, accountSwitcherCallbacks3, instrumentAccountSwitcherState, equityAdvancedOrderNumpadState, function0, function02, function03, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderKeyboardV2$lambda$14$lambda$12$lambda$11$lambda$10(Function0 function0) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AdvancedOrderBottomSheet(final Function0<Unit> function0, final EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, final EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, final EditingField editingField, Composer composer, final int i) {
        int i2;
        Composer composer2;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1158172966);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(equityAdvancedOrderDropdownEditCallbacks) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? composerStartRestartGroup.changed(equityAdvancedOrderBottomSheetState) : composerStartRestartGroup.changedInstance(equityAdvancedOrderBottomSheetState) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changed(editingField.ordinal()) ? 2048 : 1024;
        }
        int i3 = i2;
        if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1158172966, i3, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderBottomSheet (AdvancedOrderNumpadLayout.kt:242)");
            }
            final SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, null, composerStartRestartGroup, 6, 2);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            composer2 = composerStartRestartGroup;
            ModalBottomSheetKt.m5886ModalBottomSheetdYc4hso(function0, null, sheetStateRememberModalBottomSheetState, 0.0f, RectangleShape2.getRectangleShape(), bentoTheme.getColors(composerStartRestartGroup, i4).m21372getBg20d7_KjU(), 0L, 0.0f, bentoTheme.getColors(composerStartRestartGroup, i4).m21464getScrimColor0d7_KjU(), AdvancedOrderNumpadLayout3.INSTANCE.m13765getLambda$1925191817$lib_equity_advanced_order_externalDebug(), null, null, ComposableLambda3.rememberComposableLambda(962017847, true, new Function3<Column5, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt.AdvancedOrderBottomSheet.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(Column5 column5, Composer composer3, Integer num) {
                    invoke(column5, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Column5 ModalBottomSheet, Composer composer3, int i5) {
                    Intrinsics.checkNotNullParameter(ModalBottomSheet, "$this$ModalBottomSheet");
                    if ((i5 & 17) == 16 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(962017847, i5, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderBottomSheet.<anonymous> (AdvancedOrderNumpadLayout.kt:252)");
                    }
                    EquityAdvancedOrderBottomSheetContentComposable.EquityAdvancedOrderBottomSheetContentComposable(equityAdvancedOrderBottomSheetState, editingField, equityAdvancedOrderDropdownEditCallbacks, sheetStateRememberModalBottomSheetState, function0, TestTag3.testTag(Modifier.INSTANCE, EquityOrderFormRowState2.DropdownEditBottomSheetTestTag), composer3, EquityAdvancedOrderBottomSheetState.$stable | 196608, 0);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, (i3 & 14) | 805330944, 384, 3274);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda13
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AdvancedOrderNumpadLayout.AdvancedOrderBottomSheet$lambda$16(function0, equityAdvancedOrderDropdownEditCallbacks, equityAdvancedOrderBottomSheetState, editingField, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x0465  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x010f  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0114  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvancedOrderRows(final ImmutableList<? extends EquityOrderFormRowState> immutableList, final Function1<? super EditingField, Unit> function1, final Function1<? super EquityOrderFormRowState.Icon.IconId, Unit> function12, final Function0<Unit> rowSecondaryIconClicked, final EditingField editingField, final InteractionSource3 interactionSource, final Function1<? super Tuples2<? extends BigDecimal, ? extends EditingField>, Unit> function13, final BentoNumpadScopeV2 bentoNumpadScopeV2, int i, Composer composer, final int i2, final int i3) throws Resources.NotFoundException {
        int i4;
        int i5;
        int i6;
        int i7;
        Composer composer2;
        Modifier modifier;
        float f;
        int i8;
        char c;
        final Function1<? super EditingField, Unit> function14;
        Composer composer3;
        int i9;
        Modifier modifier2;
        final int i10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        final Function1<? super EditingField, Unit> rowClicked = function1;
        Function1<? super EquityOrderFormRowState.Icon.IconId, Unit> rowIconClicked = function12;
        final EditingField editingField2 = editingField;
        Intrinsics.checkNotNullParameter(rowClicked, "rowClicked");
        Intrinsics.checkNotNullParameter(rowIconClicked, "rowIconClicked");
        Intrinsics.checkNotNullParameter(rowSecondaryIconClicked, "rowSecondaryIconClicked");
        Intrinsics.checkNotNullParameter(interactionSource, "interactionSource");
        Composer composerStartRestartGroup = composer.startRestartGroup(1703394713);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = ((i2 & 8) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(rowClicked) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
        } else if ((i2 & 384) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(rowIconClicked) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i4 |= 3072;
        } else if ((i2 & 3072) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(rowSecondaryIconClicked) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            i4 |= composerStartRestartGroup.changed(editingField2 == null ? -1 : editingField2.ordinal()) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i4 |= 196608;
        } else if ((i2 & 196608) == 0) {
            i4 |= composerStartRestartGroup.changed(interactionSource) ? 131072 : 65536;
        }
        int i11 = i4;
        if ((i3 & 64) != 0) {
            i5 = i11 | 1572864;
        } else if ((i2 & 1572864) == 0) {
            i5 = i11 | (composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288);
        } else {
            i5 = i11;
        }
        if ((i3 & 128) == 0) {
            if ((i2 & 12582912) == 0) {
                i5 |= composerStartRestartGroup.changedInstance(bentoNumpadScopeV2) ? 8388608 : 4194304;
            }
            i6 = i3 & 256;
            if (i6 == 0) {
                i5 |= 100663296;
                i7 = i;
            } else {
                i7 = i;
                if ((i2 & 100663296) == 0) {
                    i5 |= composerStartRestartGroup.changed(i7) ? 67108864 : 33554432;
                }
            }
            if ((i5 & 38347923) == 38347922 || !composerStartRestartGroup.getSkipping()) {
                int i12 = i6 == 0 ? 0 : i7;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1703394713, i5, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderRows (AdvancedOrderNumpadLayout.kt:275)");
                }
                final FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                composerStartRestartGroup.startReplaceGroup(579798716);
                Modifier modifier3 = null;
                if (immutableList != null) {
                    composer2 = composerStartRestartGroup;
                    modifier = null;
                    f = 0.0f;
                    i8 = 1;
                } else {
                    for (final EquityOrderFormRowState equityOrderFormRowState : immutableList) {
                        if (equityOrderFormRowState instanceof EquityOrderFormRowState.HeaderTitle) {
                            composerStartRestartGroup.startReplaceGroup(-443675438);
                            c = 2;
                            OrderCreateTitleComposable.OrderCreateTitleComposable((EquityOrderFormRowState.HeaderTitle) equityOrderFormRowState, modifier3, composerStartRestartGroup, StringResource.$stable, 2);
                            composerStartRestartGroup.endReplaceGroup();
                        } else {
                            c = 2;
                            if (equityOrderFormRowState instanceof EquityOrderFormRowState.HeaderSubtitle) {
                                composerStartRestartGroup.startReplaceGroup(-443543812);
                                OrderCreateSubtitleComposable.OrderCreateSubtitleComposable(((EquityOrderFormRowState.HeaderSubtitle) equityOrderFormRowState).getTitle(), modifier3, composerStartRestartGroup, StringResource.$stable, 2);
                                composerStartRestartGroup.endReplaceGroup();
                            } else {
                                if (equityOrderFormRowState instanceof EquityOrderFormRowState.EditableValue) {
                                    composerStartRestartGroup.startReplaceGroup(-443365376);
                                    EquityOrderFormRowState.EditableValue editableValue = (EquityOrderFormRowState.EditableValue) equityOrderFormRowState;
                                    Modifier.Companion companion = Modifier.INSTANCE;
                                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                                    boolean zChangedInstance = ((57344 & i5) == 16384) | composerStartRestartGroup.changedInstance(equityOrderFormRowState) | composerStartRestartGroup.changedInstance(focusManager) | ((i5 & 112) == 32);
                                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda4
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return AdvancedOrderNumpadLayout.AdvancedOrderRows$lambda$28$lambda$18$lambda$17(editingField2, equityOrderFormRowState, focusManager, rowClicked);
                                            }
                                        };
                                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                    }
                                    composerStartRestartGroup.endReplaceGroup();
                                    Composer composer4 = composerStartRestartGroup;
                                    FocusManager focusManager2 = focusManager;
                                    i9 = i5;
                                    Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(companion, interactionSource, null, false, null, null, (Function0) objRememberedValue, 28, null);
                                    composer4.startReplaceGroup(-1633490746);
                                    boolean zChangedInstance2 = ((i9 & 3670016) == 1048576) | composer4.changedInstance(equityOrderFormRowState);
                                    Object objRememberedValue2 = composer4.rememberedValue();
                                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue2 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda5
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return AdvancedOrderNumpadLayout.AdvancedOrderRows$lambda$28$lambda$20$lambda$19(function13, equityOrderFormRowState, (BigDecimal) obj);
                                            }
                                        };
                                        composer4.updateRememberedValue(objRememberedValue2);
                                    }
                                    composer4.endReplaceGroup();
                                    EquityAdvancedOrderEditableValueRowComposable.EquityAdvancedOrderEditableValueRowComposable(editableValue, function1, rowIconClicked, (Function1) objRememberedValue2, editingField2, bentoNumpadScopeV2, modifierM4891clickableO2vRcR0$default, composer4, (i9 & 58352) | ((i9 >> 6) & 458752), 0);
                                    function14 = function1;
                                    composer3 = composer4;
                                    composer3.endReplaceGroup();
                                    focusManager = focusManager2;
                                    modifier2 = null;
                                } else {
                                    function14 = rowClicked;
                                    composer3 = composerStartRestartGroup;
                                    FocusManager focusManager3 = focusManager;
                                    i9 = i5;
                                    if (equityOrderFormRowState instanceof EquityOrderFormRowState.DropdownEdit) {
                                        composer3.startReplaceGroup(-442383947);
                                        EquityOrderFormRowState.DropdownEdit dropdownEdit = (EquityOrderFormRowState.DropdownEdit) equityOrderFormRowState;
                                        composer3.startReplaceGroup(-1633490746);
                                        focusManager = focusManager3;
                                        boolean zChangedInstance3 = composer3.changedInstance(focusManager) | ((i9 & 112) == 32);
                                        Object objRememberedValue3 = composer3.rememberedValue();
                                        if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda6
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Object invoke(Object obj) {
                                                    return AdvancedOrderNumpadLayout.AdvancedOrderRows$lambda$28$lambda$22$lambda$21(focusManager, function14, (EditingField) obj);
                                                }
                                            };
                                            composer3.updateRememberedValue(objRememberedValue3);
                                        }
                                        composer3.endReplaceGroup();
                                        EquityAdvancedOrderDropdownEditRowComposable.EquityAdvancedOrderDropdownEditRowComposable(dropdownEdit, (Function1) objRememberedValue3, null, composer3, StringResource.$stable, 4);
                                        composer3.endReplaceGroup();
                                    } else {
                                        focusManager = focusManager3;
                                        if (equityOrderFormRowState instanceof EquityOrderFormRowState.Information) {
                                            composer3.startReplaceGroup(-442100111);
                                            int i13 = i9 >> 3;
                                            InformationRowComposable3.InformationRowComposable((EquityOrderFormRowState.Information) equityOrderFormRowState, function12, rowSecondaryIconClicked, composer3, StringResource.$stable | (i13 & 112) | (i13 & 896), 0);
                                            composer3.endReplaceGroup();
                                        } else {
                                            if (equityOrderFormRowState instanceof EquityOrderFormRowState.ExpandableEstimatedCost) {
                                                composer3.startReplaceGroup(-441800434);
                                                modifier2 = null;
                                                ExpandableEstimatedCostRow3.ExpandableEstimatedCostRow(EquityOrderFormRowState.ExpandableEstimatedCost.copy$default((EquityOrderFormRowState.ExpandableEstimatedCost) equityOrderFormRowState, null, null, null, null, null, null, false, null, i12, 255, null), PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer3, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null), composer3, 0, 0);
                                                composer3.endReplaceGroup();
                                            } else {
                                                modifier2 = null;
                                                if (equityOrderFormRowState instanceof EquityOrderFormRowState.Empty) {
                                                    composer3.startReplaceGroup(-441520597);
                                                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(Modifier.INSTANCE, ((EquityOrderFormRowState.Empty) equityOrderFormRowState).m13750getHeightD9Ej5fM()), composer3, 0);
                                                    composer3.endReplaceGroup();
                                                } else if (equityOrderFormRowState instanceof EquityOrderFormRowState.FloatingSelection) {
                                                    composer3.startReplaceGroup(-441376230);
                                                    EquityOrderFormRowState.FloatingSelection floatingSelection = (EquityOrderFormRowState.FloatingSelection) equityOrderFormRowState;
                                                    composer3.startReplaceGroup(-1633490746);
                                                    boolean zChangedInstance4 = composer3.changedInstance(equityOrderFormRowState) | ((i9 & 112) == 32);
                                                    Object objRememberedValue4 = composer3.rememberedValue();
                                                    if (zChangedInstance4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue4 = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda7
                                                            @Override // kotlin.jvm.functions.Function1
                                                            public final Object invoke(Object obj) {
                                                                return AdvancedOrderNumpadLayout.AdvancedOrderRows$lambda$28$lambda$25$lambda$24(equityOrderFormRowState, function14, (EditingField) obj);
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue4);
                                                    }
                                                    composer3.endReplaceGroup();
                                                    EquityAdvancedOrderFloatingSelectionRow5.EquityAdvancedOrderFloatingSelectionRow(floatingSelection, null, (Function1) objRememberedValue4, false, composer3, 0, 10);
                                                    composer3.endReplaceGroup();
                                                } else {
                                                    if (!(equityOrderFormRowState instanceof EquityOrderFormRowState.TaxLotsSelection)) {
                                                        composer3.startReplaceGroup(-1122690007);
                                                        composer3.endReplaceGroup();
                                                        throw new NoWhenBranchMatchedException();
                                                    }
                                                    composer3.startReplaceGroup(-441118000);
                                                    EquityOrderFormRowState.TaxLotsSelection taxLotsSelection = (EquityOrderFormRowState.TaxLotsSelection) equityOrderFormRowState;
                                                    String accountNumber = taxLotsSelection.getAccountNumber();
                                                    UUID instrumentId = taxLotsSelection.getInstrumentId();
                                                    UUID orderId = taxLotsSelection.getOrderId();
                                                    OrderForm6 orderFormState = taxLotsSelection.getOrderFormState();
                                                    composer3.startReplaceGroup(-1633490746);
                                                    boolean zChangedInstance5 = ((i9 & 112) == 32) | composer3.changedInstance(equityOrderFormRowState);
                                                    Object objRememberedValue5 = composer3.rememberedValue();
                                                    if (zChangedInstance5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda8
                                                            @Override // kotlin.jvm.functions.Function0
                                                            public final Object invoke() {
                                                                return AdvancedOrderNumpadLayout.AdvancedOrderRows$lambda$28$lambda$27$lambda$26(function14, equityOrderFormRowState);
                                                            }
                                                        };
                                                        composer3.updateRememberedValue(objRememberedValue5);
                                                    }
                                                    composer3.endReplaceGroup();
                                                    SelectLotsRowComposable3.SelectLotsRowComposable(accountNumber, instrumentId, orderId, orderFormState, (Function0) objRememberedValue5, null, null, composer3, 0, 96);
                                                    composer3.endReplaceGroup();
                                                }
                                            }
                                            rowIconClicked = function12;
                                            rowClicked = function14;
                                            composerStartRestartGroup = composer3;
                                            modifier3 = modifier2;
                                            i5 = i9;
                                            editingField2 = editingField;
                                        }
                                    }
                                    modifier2 = null;
                                }
                                rowIconClicked = function12;
                                rowClicked = function14;
                                composerStartRestartGroup = composer3;
                                modifier3 = modifier2;
                                i5 = i9;
                                editingField2 = editingField;
                            }
                        }
                        function14 = rowClicked;
                        composer3 = composerStartRestartGroup;
                        i9 = i5;
                        modifier2 = modifier3;
                        rowIconClicked = function12;
                        rowClicked = function14;
                        composerStartRestartGroup = composer3;
                        modifier3 = modifier2;
                        i5 = i9;
                        editingField2 = editingField;
                    }
                    composer2 = composerStartRestartGroup;
                    modifier = modifier3;
                    f = 0.0f;
                    i8 = 1;
                    Unit unit = Unit.INSTANCE;
                }
                composer2.endReplaceGroup();
                BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, f, i8, modifier), f, i8, modifier), composer2, 6);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                i10 = i12;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                i10 = i7;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AdvancedOrderNumpadLayout.AdvancedOrderRows$lambda$29(immutableList, function1, function12, rowSecondaryIconClicked, editingField, interactionSource, function13, bentoNumpadScopeV2, i10, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i5 |= 12582912;
        i6 = i3 & 256;
        if (i6 == 0) {
        }
        if ((i5 & 38347923) == 38347922) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            final FocusManager focusManager4 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
            composerStartRestartGroup.startReplaceGroup(579798716);
            Modifier modifier32 = null;
            if (immutableList != null) {
            }
            composer2.endReplaceGroup();
            BoxKt.Box(SizeKt.fillMaxWidth$default(SizeKt.fillMaxHeight$default(Modifier.INSTANCE, f, i8, modifier), f, i8, modifier), composer2, 6);
            if (ComposerKt.isTraceInProgress()) {
            }
            i10 = i12;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderRows$lambda$28$lambda$20$lambda$19(Function1 function1, EquityOrderFormRowState equityOrderFormRowState, BigDecimal bigDecimal) {
        if (function1 != null) {
            function1.invoke(Tuples4.m3642to(bigDecimal, ((EquityOrderFormRowState.EditableValue) equityOrderFormRowState).getRowType()));
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderRows$lambda$28$lambda$18$lambda$17(EditingField editingField, EquityOrderFormRowState equityOrderFormRowState, FocusManager focusManager, Function1 function1) {
        EquityOrderFormRowState.EditableValue editableValue = (EquityOrderFormRowState.EditableValue) equityOrderFormRowState;
        if (editingField != editableValue.getRowType()) {
            focusManager.clearFocus(true);
            function1.invoke(editableValue.getRowType());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderRows$lambda$28$lambda$22$lambda$21(FocusManager focusManager, Function1 function1, EditingField field) {
        Intrinsics.checkNotNullParameter(field, "field");
        focusManager.clearFocus(true);
        function1.invoke(field);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderRows$lambda$28$lambda$25$lambda$24(EquityOrderFormRowState equityOrderFormRowState, Function1 function1, EditingField editingField) {
        EditingField rowType = ((EquityOrderFormRowState.FloatingSelection) equityOrderFormRowState).getRowType();
        if (rowType != null) {
            function1.invoke(rowType);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AdvancedOrderRows$lambda$28$lambda$27$lambda$26(Function1 function1, EquityOrderFormRowState equityOrderFormRowState) {
        function1.invoke(((EquityOrderFormRowState.TaxLotsSelection) equityOrderFormRowState).getRowType());
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0197  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01e1  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01e6  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0208  */
    /* JADX WARN: Removed duplicated region for block: B:163:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0225  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:173:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0272  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x0295  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02b2  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02cd  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x02d2  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x03f5  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0400  */
    /* JADX WARN: Removed duplicated region for block: B:248:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0152  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x017f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AdvancedOrderNumpadLayout(final EquityAdvancedOrderNumpadState numpadState, final Function1<? super FocusManager, Unit> hideKeyboard, final Function0<Unit> primaryButtonOnClick, final Function0<Unit> textButtonOnClick, final Function0<Unit> twentyFourHourButtonOnClick, final Function1<? super Tuples2<? extends BigDecimal, ? extends EditingField>, Unit> onNumberChange, final ImmutableList<? extends EquityOrderFormRowState> immutableList, final EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, final Function1<? super EditingField, Unit> rowClicked, final Function1<? super EquityOrderFormRowState.Icon.IconId, Unit> rowIconClicked, final Function0<Unit> rowSecondaryIconClicked, final AccountSwitcherCallbacks3 accountSwitcherCallbacks, final InstrumentAccountSwitcherState instrumentAccountSwitcherState, final EditingField editingField, final Function0<Unit> hideBottomSheet, final EquityAdvancedOrderDropdownEditCallbacks bottomSheetCallbacks, final BentoNumpadScopeV22 numpadScope, final CoroutineScope coroutineScope, Modifier modifier, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        int i5;
        int i6;
        int i7;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        SnapshotState snapshotState;
        Object objRememberedValue3;
        Composer composer2;
        final Modifier modifier2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i8;
        Intrinsics.checkNotNullParameter(numpadState, "numpadState");
        Intrinsics.checkNotNullParameter(hideKeyboard, "hideKeyboard");
        Intrinsics.checkNotNullParameter(primaryButtonOnClick, "primaryButtonOnClick");
        Intrinsics.checkNotNullParameter(textButtonOnClick, "textButtonOnClick");
        Intrinsics.checkNotNullParameter(twentyFourHourButtonOnClick, "twentyFourHourButtonOnClick");
        Intrinsics.checkNotNullParameter(onNumberChange, "onNumberChange");
        Intrinsics.checkNotNullParameter(rowClicked, "rowClicked");
        Intrinsics.checkNotNullParameter(rowIconClicked, "rowIconClicked");
        Intrinsics.checkNotNullParameter(rowSecondaryIconClicked, "rowSecondaryIconClicked");
        Intrinsics.checkNotNullParameter(accountSwitcherCallbacks, "accountSwitcherCallbacks");
        Intrinsics.checkNotNullParameter(hideBottomSheet, "hideBottomSheet");
        Intrinsics.checkNotNullParameter(bottomSheetCallbacks, "bottomSheetCallbacks");
        Intrinsics.checkNotNullParameter(numpadScope, "numpadScope");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Composer composerStartRestartGroup = composer.startRestartGroup(2106185070);
        if ((i3 & 1) != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = i | ((i & 8) == 0 ? composerStartRestartGroup.changed(numpadState) : composerStartRestartGroup.changedInstance(numpadState) ? 4 : 2);
        } else {
            i4 = i;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i & 48) == 0) {
            i4 |= composerStartRestartGroup.changedInstance(hideKeyboard) ? 32 : 16;
        }
        int i9 = i4;
        if ((i3 & 4) != 0) {
            i9 |= 384;
        } else if ((i & 384) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(primaryButtonOnClick) ? 256 : 128;
        }
        if ((i3 & 8) != 0) {
            i9 |= 3072;
        } else if ((i & 3072) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(textButtonOnClick) ? 2048 : 1024;
        }
        if ((i3 & 16) != 0) {
            i9 |= 24576;
        } else if ((i & 24576) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(twentyFourHourButtonOnClick) ? 16384 : 8192;
        }
        if ((i3 & 32) != 0) {
            i9 |= 196608;
        } else if ((i & 196608) == 0) {
            i9 |= composerStartRestartGroup.changedInstance(onNumberChange) ? 131072 : 65536;
        }
        if ((i3 & 64) != 0) {
            i9 |= 1572864;
        } else {
            if ((i & 1572864) == 0) {
                i9 |= (2097152 & i) == 0 ? composerStartRestartGroup.changed(immutableList) : composerStartRestartGroup.changedInstance(immutableList) ? 1048576 : 524288;
            }
            if ((i3 & 128) == 0) {
                i9 |= 12582912;
            } else {
                if ((i & 12582912) == 0) {
                    i9 |= (16777216 & i) == 0 ? composerStartRestartGroup.changed(equityAdvancedOrderBottomSheetState) : composerStartRestartGroup.changedInstance(equityAdvancedOrderBottomSheetState) ? 8388608 : 4194304;
                }
                if ((i3 & 256) != 0) {
                    i9 |= 100663296;
                } else if ((i & 100663296) == 0) {
                    i9 |= composerStartRestartGroup.changedInstance(rowClicked) ? 67108864 : 33554432;
                }
                if ((i3 & 512) == 0) {
                    i8 = (805306368 & i) == 0 ? composerStartRestartGroup.changedInstance(rowIconClicked) ? 536870912 : 268435456 : 805306368;
                    if ((i3 & 1024) == 0) {
                        i5 = i2;
                        i6 = i5 | 6;
                    } else {
                        i5 = i2;
                        if ((i5 & 6) == 0) {
                            i6 = i5 | (composerStartRestartGroup.changedInstance(rowSecondaryIconClicked) ? 4 : 2);
                        } else {
                            i6 = i5;
                        }
                    }
                    if ((i3 & 2048) == 0) {
                        i6 |= 48;
                    } else if ((i5 & 48) == 0) {
                        i6 |= composerStartRestartGroup.changedInstance(accountSwitcherCallbacks) ? 32 : 16;
                    }
                    int i10 = i6;
                    if ((i3 & 4096) == 0) {
                        i10 |= 384;
                    } else {
                        if ((i5 & 384) == 0) {
                            i10 |= (i5 & 512) == 0 ? composerStartRestartGroup.changed(instrumentAccountSwitcherState) : composerStartRestartGroup.changedInstance(instrumentAccountSwitcherState) ? 256 : 128;
                        }
                        if ((i3 & 8192) != 0) {
                            i10 |= 3072;
                        } else if ((i5 & 3072) == 0) {
                            i10 |= composerStartRestartGroup.changed(editingField == null ? -1 : editingField.ordinal()) ? 2048 : 1024;
                        }
                        if ((i3 & 16384) != 0) {
                            i10 |= 24576;
                        } else if ((i5 & 24576) == 0) {
                            i10 |= composerStartRestartGroup.changedInstance(hideBottomSheet) ? 16384 : 8192;
                        }
                        if ((32768 & i3) != 0) {
                            i10 |= 196608;
                        } else if ((i5 & 196608) == 0) {
                            i10 |= composerStartRestartGroup.changedInstance(bottomSheetCallbacks) ? 131072 : 65536;
                        }
                        if ((65536 & i3) != 0) {
                            i10 |= 1572864;
                        } else if ((i5 & 1572864) == 0) {
                            i10 |= (2097152 & i5) == 0 ? composerStartRestartGroup.changed(numpadScope) : composerStartRestartGroup.changedInstance(numpadScope) ? 1048576 : 524288;
                        }
                        if ((i3 & 131072) == 0) {
                            if ((i5 & 12582912) == 0) {
                                i10 |= composerStartRestartGroup.changedInstance(coroutineScope) ? 8388608 : 4194304;
                            }
                            i7 = i3 & 262144;
                            if (i7 == 0) {
                                i10 |= 100663296;
                            } else if ((i5 & 100663296) == 0) {
                                i10 |= composerStartRestartGroup.changed(modifier) ? 67108864 : 33554432;
                            }
                            if ((i9 & 306783379) == 306783378 || (38347923 & i10) != 38347922 || !composerStartRestartGroup.getSkipping()) {
                                Modifier modifier3 = i7 == 0 ? Modifier.INSTANCE : modifier;
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(2106185070, i9, i10, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout (AdvancedOrderNumpadLayout.kt:383)");
                                }
                                FocusManager focusManager = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue = composerStartRestartGroup.rememberedValue();
                                companion = Composer.INSTANCE;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = InteractionSource2.MutableInteractionSource();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                InteractionSource3 interactionSource3 = (InteractionSource3) objRememberedValue;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                int i11 = i10;
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.valueOf(numpadState.isKeyboardVisible()), null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                snapshotState = (SnapshotState) objRememberedValue2;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue3 == companion.getEmpty()) {
                                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(0, null, 2, null);
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                }
                                SnapshotState snapshotState2 = (SnapshotState) objRememberedValue3;
                                composerStartRestartGroup.endReplaceGroup();
                                if (numpadState.isKeyboardVisible() != ((Boolean) snapshotState.getValue()).booleanValue()) {
                                    snapshotState2.setValue(Integer.valueOf(((Number) snapshotState2.getValue()).intValue() + 1));
                                }
                                int i12 = i11 >> 18;
                                Modifier modifier4 = modifier3;
                                BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(numpadScope, ComposableLambda3.rememberComposableLambda(930328893, true, new C152551(interactionSource3, numpadState, hideKeyboard, focusManager, editingField, equityAdvancedOrderBottomSheetState, hideBottomSheet, bottomSheetCallbacks, snapshotState2, immutableList, rowClicked, rowIconClicked, rowSecondaryIconClicked, onNumberChange, numpadScope), composerStartRestartGroup, 54), modifier4, coroutineScope, ComposableLambda3.rememberComposableLambda(-1669236582, true, new C152562(numpadState, numpadScope, accountSwitcherCallbacks, instrumentAccountSwitcherState, primaryButtonOnClick, textButtonOnClick, twentyFourHourButtonOnClick), composerStartRestartGroup, 54), composerStartRestartGroup, BentoNumpadScopeV22.$stable | 24624 | (i12 & 14) | (i12 & 896) | ((i11 >> 12) & 7168), 0);
                                composer2 = composerStartRestartGroup;
                                snapshotState.setValue(Boolean.valueOf(numpadState.isKeyboardVisible()));
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                modifier2 = modifier4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                modifier2 = modifier;
                                composer2 = composerStartRestartGroup;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$$ExternalSyntheticLambda12
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return AdvancedOrderNumpadLayout.AdvancedOrderNumpadLayout$lambda$33(numpadState, hideKeyboard, primaryButtonOnClick, textButtonOnClick, twentyFourHourButtonOnClick, onNumberChange, immutableList, equityAdvancedOrderBottomSheetState, rowClicked, rowIconClicked, rowSecondaryIconClicked, accountSwitcherCallbacks, instrumentAccountSwitcherState, editingField, hideBottomSheet, bottomSheetCallbacks, numpadScope, coroutineScope, modifier2, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i10 |= 12582912;
                        i7 = i3 & 262144;
                        if (i7 == 0) {
                        }
                        if ((i9 & 306783379) == 306783378) {
                            if (i7 == 0) {
                            }
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            FocusManager focusManager2 = (FocusManager) composerStartRestartGroup.consume(CompositionLocalsKt.getLocalFocusManager());
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            companion = Composer.INSTANCE;
                            if (objRememberedValue == companion.getEmpty()) {
                            }
                            InteractionSource3 interactionSource32 = (InteractionSource3) objRememberedValue;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                            int i112 = i10;
                            if (objRememberedValue2 == companion.getEmpty()) {
                            }
                            snapshotState = (SnapshotState) objRememberedValue2;
                            composerStartRestartGroup.endReplaceGroup();
                            composerStartRestartGroup.startReplaceGroup(1849434622);
                            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                            if (objRememberedValue3 == companion.getEmpty()) {
                            }
                            SnapshotState snapshotState22 = (SnapshotState) objRememberedValue3;
                            composerStartRestartGroup.endReplaceGroup();
                            if (numpadState.isKeyboardVisible() != ((Boolean) snapshotState.getValue()).booleanValue()) {
                            }
                            int i122 = i112 >> 18;
                            Modifier modifier42 = modifier3;
                            BentoNumpadScreenLayoutV2.BentoNumpadScreenLayoutV2(numpadScope, ComposableLambda3.rememberComposableLambda(930328893, true, new C152551(interactionSource32, numpadState, hideKeyboard, focusManager2, editingField, equityAdvancedOrderBottomSheetState, hideBottomSheet, bottomSheetCallbacks, snapshotState22, immutableList, rowClicked, rowIconClicked, rowSecondaryIconClicked, onNumberChange, numpadScope), composerStartRestartGroup, 54), modifier42, coroutineScope, ComposableLambda3.rememberComposableLambda(-1669236582, true, new C152562(numpadState, numpadScope, accountSwitcherCallbacks, instrumentAccountSwitcherState, primaryButtonOnClick, textButtonOnClick, twentyFourHourButtonOnClick), composerStartRestartGroup, 54), composerStartRestartGroup, BentoNumpadScopeV22.$stable | 24624 | (i122 & 14) | (i122 & 896) | ((i112 >> 12) & 7168), 0);
                            composer2 = composerStartRestartGroup;
                            snapshotState.setValue(Boolean.valueOf(numpadState.isKeyboardVisible()));
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier2 = modifier42;
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    if ((i3 & 8192) != 0) {
                    }
                    if ((i3 & 16384) != 0) {
                    }
                    if ((32768 & i3) != 0) {
                    }
                    if ((65536 & i3) != 0) {
                    }
                    if ((i3 & 131072) == 0) {
                    }
                    i7 = i3 & 262144;
                    if (i7 == 0) {
                    }
                    if ((i9 & 306783379) == 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i9 |= i8;
                if ((i3 & 1024) == 0) {
                }
                if ((i3 & 2048) == 0) {
                }
                int i102 = i6;
                if ((i3 & 4096) == 0) {
                }
                if ((i3 & 8192) != 0) {
                }
                if ((i3 & 16384) != 0) {
                }
                if ((32768 & i3) != 0) {
                }
                if ((65536 & i3) != 0) {
                }
                if ((i3 & 131072) == 0) {
                }
                i7 = i3 & 262144;
                if (i7 == 0) {
                }
                if ((i9 & 306783379) == 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            if ((i3 & 256) != 0) {
            }
            if ((i3 & 512) == 0) {
            }
            i9 |= i8;
            if ((i3 & 1024) == 0) {
            }
            if ((i3 & 2048) == 0) {
            }
            int i1022 = i6;
            if ((i3 & 4096) == 0) {
            }
            if ((i3 & 8192) != 0) {
            }
            if ((i3 & 16384) != 0) {
            }
            if ((32768 & i3) != 0) {
            }
            if ((65536 & i3) != 0) {
            }
            if ((i3 & 131072) == 0) {
            }
            i7 = i3 & 262144;
            if (i7 == 0) {
            }
            if ((i9 & 306783379) == 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        if ((i3 & 128) == 0) {
        }
        if ((i3 & 256) != 0) {
        }
        if ((i3 & 512) == 0) {
        }
        i9 |= i8;
        if ((i3 & 1024) == 0) {
        }
        if ((i3 & 2048) == 0) {
        }
        int i10222 = i6;
        if ((i3 & 4096) == 0) {
        }
        if ((i3 & 8192) != 0) {
        }
        if ((i3 & 16384) != 0) {
        }
        if ((32768 & i3) != 0) {
        }
        if ((65536 & i3) != 0) {
        }
        if ((i3 & 131072) == 0) {
        }
        i7 = i3 & 262144;
        if (i7 == 0) {
        }
        if ((i9 & 306783379) == 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: AdvancedOrderNumpadLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderNumpadLayout$1 */
    static final class C152551 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
        final /* synthetic */ EquityAdvancedOrderDropdownEditCallbacks $bottomSheetCallbacks;
        final /* synthetic */ EquityAdvancedOrderBottomSheetState $bottomSheetState;
        final /* synthetic */ EditingField $editingField;
        final /* synthetic */ FocusManager $focusManager;
        final /* synthetic */ Function0<Unit> $hideBottomSheet;
        final /* synthetic */ Function1<FocusManager, Unit> $hideKeyboard;
        final /* synthetic */ InteractionSource3 $interactionSource;
        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
        final /* synthetic */ EquityAdvancedOrderNumpadState $numpadState;
        final /* synthetic */ Function1<Tuples2<? extends BigDecimal, ? extends EditingField>, Unit> $onNumberChange;
        final /* synthetic */ SnapshotState<Integer> $resetTooltipCount;
        final /* synthetic */ Function1<EditingField, Unit> $rowClicked;
        final /* synthetic */ Function1<EquityOrderFormRowState.Icon.IconId, Unit> $rowIconClicked;
        final /* synthetic */ Function0<Unit> $rowSecondaryIconClicked;
        final /* synthetic */ ImmutableList<EquityOrderFormRowState> $rowStates;

        /* JADX WARN: Multi-variable type inference failed */
        C152551(InteractionSource3 interactionSource3, EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, Function1<? super FocusManager, Unit> function1, FocusManager focusManager, EditingField editingField, EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState, Function0<Unit> function0, EquityAdvancedOrderDropdownEditCallbacks equityAdvancedOrderDropdownEditCallbacks, SnapshotState<Integer> snapshotState, ImmutableList<? extends EquityOrderFormRowState> immutableList, Function1<? super EditingField, Unit> function12, Function1<? super EquityOrderFormRowState.Icon.IconId, Unit> function13, Function0<Unit> function02, Function1<? super Tuples2<? extends BigDecimal, ? extends EditingField>, Unit> function14, BentoNumpadScopeV22 bentoNumpadScopeV22) {
            this.$interactionSource = interactionSource3;
            this.$numpadState = equityAdvancedOrderNumpadState;
            this.$hideKeyboard = function1;
            this.$focusManager = focusManager;
            this.$editingField = editingField;
            this.$bottomSheetState = equityAdvancedOrderBottomSheetState;
            this.$hideBottomSheet = function0;
            this.$bottomSheetCallbacks = equityAdvancedOrderDropdownEditCallbacks;
            this.$resetTooltipCount = snapshotState;
            this.$rowStates = immutableList;
            this.$rowClicked = function12;
            this.$rowIconClicked = function13;
            this.$rowSecondaryIconClicked = function02;
            this.$onNumberChange = function14;
            this.$numpadScope = bentoNumpadScopeV22;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(bentoNumpadScopeV2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) throws Resources.NotFoundException {
            EquityAdvancedOrderBottomSheetState equityAdvancedOrderBottomSheetState;
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(930328893, i, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout.<anonymous> (AdvancedOrderNumpadLayout.kt:395)");
            }
            Modifier modifierTestTag = TestTag3.testTag(ScrollKt.verticalScroll$default(Modifier.INSTANCE, ScrollKt.rememberScrollState(0, composer, 0, 1), false, null, false, 14, null), "hide_keyboard");
            InteractionSource3 interactionSource3 = this.$interactionSource;
            composer.startReplaceGroup(-1224400529);
            boolean zChangedInstance = composer.changedInstance(this.$numpadState) | composer.changed(this.$hideKeyboard) | composer.changedInstance(this.$focusManager);
            final EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState = this.$numpadState;
            final Function1<FocusManager, Unit> function1 = this.$hideKeyboard;
            final FocusManager focusManager = this.$focusManager;
            final SnapshotState<Integer> snapshotState = this.$resetTooltipCount;
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderNumpadLayout$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return AdvancedOrderNumpadLayout.C152551.invoke$lambda$1$lambda$0(equityAdvancedOrderNumpadState, function1, focusManager, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            Modifier modifierM4891clickableO2vRcR0$default = ClickableKt.m4891clickableO2vRcR0$default(modifierTestTag, interactionSource3, null, false, null, null, (Function0) objRememberedValue, 28, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifierM4891clickableO2vRcR0$default, bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composer, i2).m21590getDefaultD9Ej5fM(), 0.0f, 8, null);
            SnapshotState<Integer> snapshotState2 = this.$resetTooltipCount;
            ImmutableList<EquityOrderFormRowState> immutableList = this.$rowStates;
            Function1<EditingField, Unit> function12 = this.$rowClicked;
            Function1<EquityOrderFormRowState.Icon.IconId, Unit> function13 = this.$rowIconClicked;
            Function0<Unit> function0 = this.$rowSecondaryIconClicked;
            EditingField editingField = this.$editingField;
            InteractionSource3 interactionSource32 = this.$interactionSource;
            Function1<Tuples2<? extends BigDecimal, ? extends EditingField>, Unit> function14 = this.$onNumberChange;
            BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer, 0);
            CompositionLocalMap currentCompositionLocalMap = composer.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer, modifierM5146paddingqDBjuR0$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer.startReusableNode();
            if (composer.getInserting()) {
                composer.createNode(constructor);
            } else {
                composer.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            AdvancedOrderNumpadLayout.AdvancedOrderRows(immutableList, function12, function13, function0, editingField, interactionSource32, function14, bentoNumpadScopeV22, snapshotState2.getValue().intValue(), composer, 196608 | (BentoNumpadScopeV22.$stable << 21), 0);
            composer.endNode();
            EditingField editingField2 = this.$editingField;
            if (editingField2 != null && editingField2.getUsesBottomSheet() && (equityAdvancedOrderBottomSheetState = this.$bottomSheetState) != null) {
                AdvancedOrderNumpadLayout.AdvancedOrderBottomSheet(this.$hideBottomSheet, this.$bottomSheetCallbacks, equityAdvancedOrderBottomSheetState, this.$editingField, composer, EquityAdvancedOrderBottomSheetState.$stable << 6);
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, Function1 function1, FocusManager focusManager, SnapshotState snapshotState) {
            if (equityAdvancedOrderNumpadState.isKeyboardVisible()) {
                function1.invoke(focusManager);
            }
            snapshotState.setValue(Integer.valueOf(((Number) snapshotState.getValue()).intValue() + 1));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: AdvancedOrderNumpadLayout.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderNumpadLayout$2 */
    static final class C152562 implements Function3<BentoNumpadScopeV2, Composer, Integer, Unit> {
        final /* synthetic */ AccountSwitcherCallbacks3 $accountSwitcherCallbacks;
        final /* synthetic */ InstrumentAccountSwitcherState $accountSwitcherState;
        final /* synthetic */ BentoNumpadScopeV22 $numpadScope;
        final /* synthetic */ EquityAdvancedOrderNumpadState $numpadState;
        final /* synthetic */ Function0<Unit> $primaryButtonOnClick;
        final /* synthetic */ Function0<Unit> $textButtonOnClick;
        final /* synthetic */ Function0<Unit> $twentyFourHourButtonOnClick;

        C152562(EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState, BentoNumpadScopeV22 bentoNumpadScopeV22, AccountSwitcherCallbacks3 accountSwitcherCallbacks3, InstrumentAccountSwitcherState instrumentAccountSwitcherState, Function0<Unit> function0, Function0<Unit> function02, Function0<Unit> function03) {
            this.$numpadState = equityAdvancedOrderNumpadState;
            this.$numpadScope = bentoNumpadScopeV22;
            this.$accountSwitcherCallbacks = accountSwitcherCallbacks3;
            this.$accountSwitcherState = instrumentAccountSwitcherState;
            this.$primaryButtonOnClick = function0;
            this.$textButtonOnClick = function02;
            this.$twentyFourHourButtonOnClick = function03;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoNumpadScopeV2 bentoNumpadScopeV2, Composer composer, Integer num) {
            invoke(bentoNumpadScopeV2, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoNumpadScopeV2 BentoNumpadScreenLayoutV2, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(BentoNumpadScreenLayoutV2, "$this$BentoNumpadScreenLayoutV2");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1669236582, i, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout.<anonymous> (AdvancedOrderNumpadLayout.kt:438)");
            }
            Boolean boolValueOf = Boolean.valueOf(this.$numpadState.isKeyboardVisible());
            composer.startReplaceGroup(1849434622);
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt$AdvancedOrderNumpadLayout$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AdvancedOrderNumpadLayout.C152562.invoke$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            composer.endReplaceGroup();
            final BentoNumpadScopeV22 bentoNumpadScopeV22 = this.$numpadScope;
            final AccountSwitcherCallbacks3 accountSwitcherCallbacks3 = this.$accountSwitcherCallbacks;
            final InstrumentAccountSwitcherState instrumentAccountSwitcherState = this.$accountSwitcherState;
            final EquityAdvancedOrderNumpadState equityAdvancedOrderNumpadState = this.$numpadState;
            final Function0<Unit> function0 = this.$primaryButtonOnClick;
            final Function0<Unit> function02 = this.$textButtonOnClick;
            final Function0<Unit> function03 = this.$twentyFourHourButtonOnClick;
            AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, "", null, ComposableLambda3.rememberComposableLambda(-2087655779, true, new Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit>() { // from class: com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayoutKt.AdvancedOrderNumpadLayout.2.2
                @Override // kotlin.jvm.functions.Function4
                public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer2, Integer num) throws Resources.NotFoundException {
                    invoke(animatedContentScope, bool.booleanValue(), composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer2, int i2) throws Resources.NotFoundException {
                    Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-2087655779, i2, -1, "com.robinhood.android.equityadvancedorder.composables.AdvancedOrderNumpadLayout.<anonymous>.<anonymous> (AdvancedOrderNumpadLayout.kt:442)");
                    }
                    if (z) {
                        composer2.startReplaceGroup(2068176085);
                        AdvancedOrderNumpadLayout.AdvancedOrderKeyboardV2(AnimatedContent, bentoNumpadScopeV22, accountSwitcherCallbacks3, instrumentAccountSwitcherState, equityAdvancedOrderNumpadState, function0, function02, function03, composer2, (i2 & 14) | (BentoNumpadScopeV22.$stable << 3) | (InstrumentAccountSwitcherState.$stable << 9) | (StringResource.$stable << 12));
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(2068732721);
                        AdvancedOrderNumpadLayout.AdvancedOrderFooter(AnimatedContent, equityAdvancedOrderNumpadState, accountSwitcherCallbacks3, instrumentAccountSwitcherState, function02, function0, composer2, (InstrumentAccountSwitcherState.$stable << 9) | (i2 & 14) | (StringResource.$stable << 3));
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composer, 54), composer, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final ContentTransform invoke$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            return AnimatedContentKt.togetherWith(EnterTransition.INSTANCE.getNone(), ExitTransition.INSTANCE.getNone());
        }
    }
}
