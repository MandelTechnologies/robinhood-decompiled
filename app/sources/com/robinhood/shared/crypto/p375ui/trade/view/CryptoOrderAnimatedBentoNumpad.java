package com.robinhood.shared.crypto.p375ui.trade.view;

import android.view.KeyEvent;
import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.compose.bento.component.numpad.BentoAccentNumpadOverlay;
import com.robinhood.compose.bento.component.numpad.BentoNumpad4;
import com.robinhood.compose.bento.component.numpad.CustomKeyConfig;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderAnimatedBentoNumpad.kt */
@Metadata(m3635d1 = {"\u00002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0016\u0010\u0004\u001a\u0012\u0012\b\u0012\u00060\u0006j\u0002`\u0007\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000bH\u0007¢\u0006\u0002\u0010\f\"\u0016\u0010\r\u001a\u00020\u000e8\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"CryptoOrderAnimatedBentoNumpad", "", "state", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;", "onKeyPress", "Lkotlin/Function1;", "Landroid/view/KeyEvent;", "Landroidx/compose/ui/input/key/NativeKeyEvent;", "modifier", "Landroidx/compose/ui/Modifier;", "onCustomBackspacePress", "Lkotlin/Function0;", "(Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderAnimatedBentoNumpadState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_ORDER_BENTO_NUMPAD_TEST_TAG", "", "getCRYPTO_ORDER_BENTO_NUMPAD_TEST_TAG$annotations", "()V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpadKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderAnimatedBentoNumpad {
    public static final String CRYPTO_ORDER_BENTO_NUMPAD_TEST_TAG = "crypto_order_bento_numpad_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderAnimatedBentoNumpad$lambda$2(CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState, Function1 function1, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        CryptoOrderAnimatedBentoNumpad(cryptoOrderAnimatedBentoNumpadState, function1, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static /* synthetic */ void getCRYPTO_ORDER_BENTO_NUMPAD_TEST_TAG$annotations() {
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x008c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:74:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderAnimatedBentoNumpad(final CryptoOrderAnimatedBentoNumpadState state, final Function1<? super KeyEvent, Unit> onKeyPress, Modifier modifier, Function0<Unit> function0, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function0<Unit> function02;
        final Function0<Unit> function03;
        final Modifier modifier3;
        final Function0<Unit> function04;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onKeyPress, "onKeyPress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-278777840);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onKeyPress) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function02 = function0;
                    i3 |= composerStartRestartGroup.changedInstance(function02) ? 2048 : 1024;
                }
                if ((i3 & 1171) != 1170 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpadKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function03 = (Function0) objRememberedValue;
                    } else {
                        function03 = function02;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-278777840, i3, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpad (CryptoOrderAnimatedBentoNumpad.kt:21)");
                    }
                    Modifier modifier5 = modifier4;
                    AnimatedVisibilityKt.AnimatedVisibility(state.isVisible(), modifier5, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (String) null, ComposableLambda3.rememberComposableLambda(-131022616, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpadKt.CryptoOrderAnimatedBentoNumpad.2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                            invoke(animatedVisibilityScope, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i6) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-131022616, i6, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpad.<anonymous> (CryptoOrderAnimatedBentoNumpad.kt:28)");
                            }
                            final CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState = state;
                            final Function1<KeyEvent, Unit> function1 = onKeyPress;
                            final Function0<Unit> function05 = function03;
                            BentoAccentNumpadOverlay.BentoAccentNumpadOverlay(ComposableLambda3.rememberComposableLambda(-991442473, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpadKt.CryptoOrderAnimatedBentoNumpad.2.1
                                @Override // kotlin.jvm.functions.Function3
                                public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer3, Integer num) {
                                    invoke(bentoNumpad4, composer3, num.intValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(BentoNumpad4 BentoAccentNumpadOverlay, Composer composer3, int i7) {
                                    int i8;
                                    Intrinsics.checkNotNullParameter(BentoAccentNumpadOverlay, "$this$BentoAccentNumpadOverlay");
                                    if ((i7 & 6) == 0) {
                                        i8 = i7 | ((i7 & 8) == 0 ? composer3.changed(BentoAccentNumpadOverlay) : composer3.changedInstance(BentoAccentNumpadOverlay) ? 4 : 2);
                                    } else {
                                        i8 = i7;
                                    }
                                    if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                        composer3.skipToGroupEnd();
                                        return;
                                    }
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventStart(-991442473, i8, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpad.<anonymous>.<anonymous> (CryptoOrderAnimatedBentoNumpad.kt:29)");
                                    }
                                    Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CryptoOrderAnimatedBentoNumpad.CRYPTO_ORDER_BENTO_NUMPAD_TEST_TAG);
                                    boolean delimiterLocalized = cryptoOrderAnimatedBentoNumpadState.getDelimiterLocalized();
                                    boolean showDelimiter = cryptoOrderAnimatedBentoNumpadState.getShowDelimiter();
                                    StringResource backspaceOverrideText = cryptoOrderAnimatedBentoNumpadState.getBackspaceOverrideText();
                                    composer3.startReplaceGroup(706534235);
                                    CustomKeyConfig customKeyConfig = backspaceOverrideText == null ? null : new CustomKeyConfig(StringResource2.getString(backspaceOverrideText, composer3, StringResource.$stable), null, 0, null, function05, 14, null);
                                    composer3.endReplaceGroup();
                                    BentoAccentNumpadOverlay.BentoNumpadOnly(modifierTestTag, function1, false, showDelimiter, delimiterLocalized, customKeyConfig, composer3, (CustomKeyConfig.$stable << 15) | 6 | (BentoNumpad4.$stable << 18) | ((i8 << 18) & 3670016), 4);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                }
                            }, composer2, 54), composer2, 6);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 200064, 16);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function04 = function03;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    function04 = function02;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpadKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoOrderAnimatedBentoNumpad.CryptoOrderAnimatedBentoNumpad$lambda$2(state, onKeyPress, modifier3, function04, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function02 = function0;
            if ((i3 & 1171) != 1170) {
                if (i5 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifier52 = modifier4;
                AnimatedVisibilityKt.AnimatedVisibility(state.isVisible(), modifier52, EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null), EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null), (String) null, ComposableLambda3.rememberComposableLambda(-131022616, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpadKt.CryptoOrderAnimatedBentoNumpad.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer2, Integer num) {
                        invoke(animatedVisibilityScope, composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer2, int i6) {
                        Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-131022616, i6, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpad.<anonymous> (CryptoOrderAnimatedBentoNumpad.kt:28)");
                        }
                        final CryptoOrderAnimatedBentoNumpadState cryptoOrderAnimatedBentoNumpadState = state;
                        final Function1<? super KeyEvent, Unit> function1 = onKeyPress;
                        final Function0<Unit> function05 = function03;
                        BentoAccentNumpadOverlay.BentoAccentNumpadOverlay(ComposableLambda3.rememberComposableLambda(-991442473, true, new Function3<BentoNumpad4, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpadKt.CryptoOrderAnimatedBentoNumpad.2.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoNumpad4 bentoNumpad4, Composer composer3, Integer num) {
                                invoke(bentoNumpad4, composer3, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoNumpad4 BentoAccentNumpadOverlay, Composer composer3, int i7) {
                                int i8;
                                Intrinsics.checkNotNullParameter(BentoAccentNumpadOverlay, "$this$BentoAccentNumpadOverlay");
                                if ((i7 & 6) == 0) {
                                    i8 = i7 | ((i7 & 8) == 0 ? composer3.changed(BentoAccentNumpadOverlay) : composer3.changedInstance(BentoAccentNumpadOverlay) ? 4 : 2);
                                } else {
                                    i8 = i7;
                                }
                                if ((i8 & 19) == 18 && composer3.getSkipping()) {
                                    composer3.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-991442473, i8, -1, "com.robinhood.shared.crypto.ui.trade.view.CryptoOrderAnimatedBentoNumpad.<anonymous>.<anonymous> (CryptoOrderAnimatedBentoNumpad.kt:29)");
                                }
                                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, CryptoOrderAnimatedBentoNumpad.CRYPTO_ORDER_BENTO_NUMPAD_TEST_TAG);
                                boolean delimiterLocalized = cryptoOrderAnimatedBentoNumpadState.getDelimiterLocalized();
                                boolean showDelimiter = cryptoOrderAnimatedBentoNumpadState.getShowDelimiter();
                                StringResource backspaceOverrideText = cryptoOrderAnimatedBentoNumpadState.getBackspaceOverrideText();
                                composer3.startReplaceGroup(706534235);
                                CustomKeyConfig customKeyConfig = backspaceOverrideText == null ? null : new CustomKeyConfig(StringResource2.getString(backspaceOverrideText, composer3, StringResource.$stable), null, 0, null, function05, 14, null);
                                composer3.endReplaceGroup();
                                BentoAccentNumpadOverlay.BentoNumpadOnly(modifierTestTag, function1, false, showDelimiter, delimiterLocalized, customKeyConfig, composer3, (CustomKeyConfig.$stable << 15) | 6 | (BentoNumpad4.$stable << 18) | ((i8 << 18) & 3670016), 4);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer2, 54), composer2, 6);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composerStartRestartGroup, ((i3 >> 3) & 112) | 200064, 16);
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier3 = modifier52;
                function04 = function03;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function02 = function0;
        if ((i3 & 1171) != 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }
}
