package com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentScope;
import androidx.compose.animation.AnimatedContentTransitionScope;
import androidx.compose.animation.ContentTransform;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import bonfire.proto.idl.crypto.p033v1.GetCryptoUserAgreementsResponseDto;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.p094ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBar;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.extensions.AutomationTestTagModifierExt;
import com.robinhood.rosetta.eventlogging.Component;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoUpgradeDisclosureBottomBar.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\"\u000e\u0010\n\u001a\u00020\u000bX\u0082T¢\u0006\u0002\n\u0000¨\u0006\f"}, m3636d2 = {"CryptoUpgradeDisclosureBottomBar", "", "state", "Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;", "onScrolledButtonClicked", "Lkotlin/Function0;", "onScrollToBottomRequested", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/crypto/ui/upgrade/disclosureV2/views/CryptoUpgradeDisclosureBottomBarState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CRYPTO_UPGRADE_DISCLOSURE_BOTTOM_BAR_CTA_TEST_TAG", "", "feature-crypto_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class CryptoUpgradeDisclosureBottomBar {
    private static final String CRYPTO_UPGRADE_DISCLOSURE_BOTTOM_BAR_CTA_TEST_TAG = "crypto_upgrade_disclosure_bottom_bar_cta_test_tag";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoUpgradeDisclosureBottomBar$lambda$2(CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoUpgradeDisclosureBottomBar(cryptoUpgradeDisclosureBottomBarState, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:67:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoUpgradeDisclosureBottomBar(final CryptoUpgradeDisclosureBottomBarState state, final Function0<Unit> onScrolledButtonClicked, final Function0<Unit> onScrollToBottomRequested, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onScrolledButtonClicked, "onScrolledButtonClicked");
        Intrinsics.checkNotNullParameter(onScrollToBottomRequested, "onScrollToBottomRequested");
        Composer composerStartRestartGroup = composer.startRestartGroup(-752734590);
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
            i3 |= composerStartRestartGroup.changedInstance(onScrolledButtonClicked) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onScrollToBottomRequested) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-752734590, i3, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBar (CryptoUpgradeDisclosureBottomBar.kt:32)");
                }
                Boolean boolValueOf = Boolean.valueOf(state.getHasScrolledToBottom());
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function1() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return CryptoUpgradeDisclosureBottomBar.CryptoUpgradeDisclosureBottomBar$lambda$1$lambda$0((AnimatedContentTransitionScope) obj);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                Modifier modifier5 = modifier4;
                AnimatedContentKt.AnimatedContent(boolValueOf, null, (Function1) objRememberedValue, null, "bottom_bar_transition", null, ComposableLambda3.rememberComposableLambda(-542818465, true, new C136182(state, modifier4, onScrollToBottomRequested, onScrolledButtonClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 1597824, 42);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoUpgradeDisclosureBottomBar.CryptoUpgradeDisclosureBottomBar$lambda$2(state, onScrolledButtonClicked, onScrollToBottomRequested, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Boolean boolValueOf2 = Boolean.valueOf(state.getHasScrolledToBottom());
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Modifier modifier52 = modifier4;
            AnimatedContentKt.AnimatedContent(boolValueOf2, null, (Function1) objRememberedValue, null, "bottom_bar_transition", null, ComposableLambda3.rememberComposableLambda(-542818465, true, new C136182(state, modifier4, onScrollToBottomRequested, onScrolledButtonClicked), composerStartRestartGroup, 54), composerStartRestartGroup, 1597824, 42);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ContentTransform CryptoUpgradeDisclosureBottomBar$lambda$1$lambda$0(AnimatedContentTransitionScope AnimatedContent) {
        Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
        EnterTransition enterTransitionFadeIn$default = EnterExitTransitionKt.fadeIn$default(null, 0.0f, 3, null);
        Alignment.Companion companion = Alignment.INSTANCE;
        return AnimatedContentKt.togetherWith(enterTransitionFadeIn$default.plus(EnterExitTransitionKt.expandVertically$default(null, companion.getTop(), false, null, 13, null)), EnterExitTransitionKt.fadeOut$default(null, 0.0f, 3, null).plus(EnterExitTransitionKt.shrinkVertically$default(null, companion.getTop(), false, null, 13, null)));
    }

    /* compiled from: CryptoUpgradeDisclosureBottomBar.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarKt$CryptoUpgradeDisclosureBottomBar$2 */
    static final class C136182 implements Function4<AnimatedContentScope, Boolean, Composer, Integer, Unit> {
        final /* synthetic */ Modifier $modifier;
        final /* synthetic */ Function0<Unit> $onScrollToBottomRequested;
        final /* synthetic */ Function0<Unit> $onScrolledButtonClicked;
        final /* synthetic */ CryptoUpgradeDisclosureBottomBarState $state;

        C136182(CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState, Modifier modifier, Function0<Unit> function0, Function0<Unit> function02) {
            this.$state = cryptoUpgradeDisclosureBottomBarState;
            this.$modifier = modifier;
            this.$onScrollToBottomRequested = function0;
            this.$onScrolledButtonClicked = function02;
        }

        @Override // kotlin.jvm.functions.Function4
        public /* bridge */ /* synthetic */ Unit invoke(AnimatedContentScope animatedContentScope, Boolean bool, Composer composer, Integer num) {
            invoke(animatedContentScope, bool.booleanValue(), composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(AnimatedContentScope AnimatedContent, boolean z, Composer composer, int i) {
            GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto unscrolledButton;
            CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState;
            boolean z2;
            Function0<Unit> function0;
            Function0<Unit> function02;
            Object obj;
            Composer composer2 = composer;
            Intrinsics.checkNotNullParameter(AnimatedContent, "$this$AnimatedContent");
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-542818465, i, -1, "com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBar.<anonymous> (CryptoUpgradeDisclosureBottomBar.kt:41)");
            }
            boolean z3 = this.$state.getUnscrolledButton() == null || z;
            if (z3) {
                unscrolledButton = this.$state.getScrolledButton();
                if (unscrolledButton == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            } else {
                unscrolledButton = this.$state.getUnscrolledButton();
                if (unscrolledButton == null) {
                    throw new IllegalArgumentException("Required value was null.");
                }
            }
            GetCryptoUserAgreementsResponseDto.CryptoAgreementDto.ButtonDto buttonDto = unscrolledButton;
            Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(this.$modifier, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i2 = BentoTheme.$stable;
            Modifier modifierM21619defaultFillMaxWidthPadding3ABfNKs$default = PaddingKt.m21619defaultFillMaxWidthPadding3ABfNKs$default(androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(modifierFillMaxWidth$default, 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 1, null), 0.0f, 1, null);
            CryptoUpgradeDisclosureBottomBarState cryptoUpgradeDisclosureBottomBarState2 = this.$state;
            Function0<Unit> function03 = this.$onScrollToBottomRequested;
            Function0<Unit> function04 = this.$onScrolledButtonClicked;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21619defaultFillMaxWidthPadding3ABfNKs$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composer2.getApplier() == null) {
                Composables.invalidApplier();
            }
            composer2.startReusableNode();
            if (composer2.getInserting()) {
                composer2.createNode(constructor);
            } else {
                composer2.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer2);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            boolean z4 = z3;
            String helper_text = buttonDto.getHelper_text();
            composer2.startReplaceGroup(701728912);
            if (helper_text == null) {
                z2 = z4;
                obj = null;
                cryptoUpgradeDisclosureBottomBarState = cryptoUpgradeDisclosureBottomBarState2;
                function0 = function03;
                function02 = function04;
            } else {
                cryptoUpgradeDisclosureBottomBarState = cryptoUpgradeDisclosureBottomBarState2;
                z2 = z4;
                function0 = function03;
                function02 = function04;
                obj = null;
                BentoText2.m20747BentoText38GnDrw(helper_text, androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composer2, i2).m21590getDefaultD9Ej5fM(), 7, null), Color.m6701boximpl(bentoTheme.getColors(composer2, i2).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getBold(), null, TextAlign.m7912boximpl(TextAlign.INSTANCE.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i2).getTextS(), composer, 24576, 0, 8104);
                composer2 = composer;
            }
            composer2.endReplaceGroup();
            String text = buttonDto.getText();
            boolean zIsButtonEnabled = cryptoUpgradeDisclosureBottomBarState.isButtonEnabled();
            boolean zIsLoading = cryptoUpgradeDisclosureBottomBarState.isLoading();
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(AutomationTestTagModifierExt.automationTestTag(SizeKt.fillMaxWidth$default(Modifier.INSTANCE, 0.0f, 1, obj), CryptoUpgradeDisclosureBottomBar.CRYPTO_UPGRADE_DISCLOSURE_BOTTOM_BAR_CTA_TEST_TAG), UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer2.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, null, new Component(Component.ComponentType.BUTTON, buttonDto.getAnalytics_identifier(), null, 4, null), null, 47, null), false, false, false, true, false, null, 110, null);
            composer2.startReplaceGroup(-1746271574);
            final boolean z5 = z2;
            final Function0<Unit> function05 = function0;
            final Function0<Unit> function06 = function02;
            boolean zChanged = composer2.changed(z5) | composer2.changed(function05) | composer2.changed(function06);
            Object objRememberedValue = composer2.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.crypto.ui.upgrade.disclosureV2.views.CryptoUpgradeDisclosureBottomBarKt$CryptoUpgradeDisclosureBottomBar$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoUpgradeDisclosureBottomBar.C136182.invoke$lambda$3$lambda$2$lambda$1(z5, function05, function06);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue);
            }
            composer2.endReplaceGroup();
            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, text, modifierAutoLogEvents$default, null, null, zIsButtonEnabled, zIsLoading, null, null, null, null, false, null, composer2, 0, 0, 8088);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2$lambda$1(boolean z, Function0 function0, Function0 function02) {
            if (!z) {
                function0.invoke();
            } else {
                function02.invoke();
            }
            return Unit.INSTANCE;
        }
    }
}
