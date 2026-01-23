package com.robinhood.shared.unverifiedaccountrecovery.email.confirmation;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.style.TextAlign;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextButton2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.unverifiedaccountrecovery.C41128R;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: EmailConfirmationComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a)\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0007¨\u0006\b"}, m3636d2 = {"EmailConfirmationComposable", "", "state", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationViewState;", "onClickUpdateInquiry", "Lkotlin/Function1;", "Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationInputOption;", "(Lcom/robinhood/shared/unverifiedaccountrecovery/email/confirmation/EmailConfirmationViewState;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V", "feature-unverified-account-recovery_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationComposableKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class EmailConfirmationComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailConfirmationComposable$lambda$8(EmailConfirmationViewState emailConfirmationViewState, Function1 function1, int i, Composer composer, int i2) {
        EmailConfirmationComposable(emailConfirmationViewState, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void EmailConfirmationComposable(final EmailConfirmationViewState state, Function1<? super EmailConfirmationInputOption, Unit> function1, Composer composer, final int i) {
        int i2;
        final Function1<? super EmailConfirmationInputOption, Unit> function12;
        int i3;
        Composer composer2;
        final Function1<? super EmailConfirmationInputOption, Unit> onClickUpdateInquiry = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onClickUpdateInquiry, "onClickUpdateInquiry");
        Composer composerStartRestartGroup = composer.startRestartGroup(2009676416);
        if ((i & 6) == 0) {
            i2 = i | (composerStartRestartGroup.changed(state) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onClickUpdateInquiry) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(2009676416, i2, -1, "com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationComposable (EmailConfirmationComposable.kt:23)");
            }
            EmailConfirmationInputOption updatingInputOption = state.getUpdatingInputOption();
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(companion, 0.0f, 1, null);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            Modifier modifierM5143paddingVpY3zN4 = PaddingKt.m5143paddingVpY3zN4(modifierFillMaxSize$default, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
            Alignment.Companion companion2 = Alignment.INSTANCE;
            Alignment.Horizontal centerHorizontally = companion2.getCenterHorizontally();
            Arrangement arrangement = Arrangement.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(arrangement.getTop(), centerHorizontally, composerStartRestartGroup, 48);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5143paddingVpY3zN4);
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
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
            Column6 column6 = Column6.INSTANCE;
            Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, "Heading"), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 5, null);
            String strStringResource = StringResources_androidKt.stringResource(C41128R.string.email_confirmation_heading, composerStartRestartGroup, 0);
            TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium();
            TextAlign.Companion companion4 = TextAlign.INSTANCE;
            int i5 = i2;
            boolean z = false;
            BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8124);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C41128R.string.email_confirmation_subheading, composerStartRestartGroup, 0), TestTag3.testTag(companion, "Subheading"), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, 0, 0, 16316);
            Modifier modifierWeight$default = Column5.weight$default(column6, SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getCenter(), companion2.getCenterHorizontally(), composerStartRestartGroup, 54);
            int currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierWeight$default);
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
            Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2 = companion3.getSetCompositeKeyHash();
            if (composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
            }
            Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion3.getSetModifier());
            BentoText2.m20747BentoText38GnDrw(state.getEmail(), PaddingKt.m5146paddingqDBjuR0$default(TestTag3.testTag(companion, "ObfuscatedEmail"), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), 7, null), null, null, null, null, TextAlign.m7912boximpl(companion4.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8124);
            composerStartRestartGroup.startReplaceGroup(1737094638);
            if (state.getShowRevealFullEmailCta()) {
                Modifier modifierTestTag = TestTag3.testTag(companion, "ShowFullEmailCta");
                String strStringResource2 = StringResources_androidKt.stringResource(C41128R.string.email_confirmation_show_full_email, composerStartRestartGroup, 0);
                boolean z2 = updatingInputOption == null;
                composerStartRestartGroup.startReplaceGroup(5004770);
                i3 = 32;
                boolean z3 = (i5 & 112) == 32;
                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    function12 = function1;
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return EmailConfirmationComposable.EmailConfirmationComposable$lambda$7$lambda$2$lambda$1$lambda$0(function12);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                } else {
                    function12 = function1;
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextButton2.m20715BentoTextButtonPIknLig((Function0) objRememberedValue, strStringResource2, modifierTestTag, null, null, z2, null, composerStartRestartGroup, 0, 88);
            } else {
                function12 = function1;
                i3 = 32;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            Modifier modifierTestTag2 = TestTag3.testTag(companion, "CtaButtonBar");
            String strStringResource3 = StringResources_androidKt.stringResource(C41128R.string.email_confirmation_primary_cta, composerStartRestartGroup, 0);
            EmailConfirmationInputOption emailConfirmationInputOption = EmailConfirmationInputOption.LOGIN;
            boolean z4 = updatingInputOption == emailConfirmationInputOption;
            boolean z5 = updatingInputOption == null || updatingInputOption == emailConfirmationInputOption;
            String strStringResource4 = StringResources_androidKt.stringResource(C41128R.string.email_confirmation_secondary_cta, composerStartRestartGroup, 0);
            EmailConfirmationInputOption emailConfirmationInputOption2 = EmailConfirmationInputOption.UPDATE_EMAIL;
            boolean z6 = updatingInputOption == emailConfirmationInputOption2;
            boolean z7 = updatingInputOption == null || updatingInputOption == emailConfirmationInputOption2;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i6 = i5 & 112;
            boolean z8 = i6 == i3;
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z8 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EmailConfirmationComposable.EmailConfirmationComposable$lambda$7$lambda$4$lambda$3(function12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(5004770);
            if (i6 == i3) {
                z = true;
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return EmailConfirmationComposable.EmailConfirmationComposable$lambda$7$lambda$6$lambda$5(function12);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            onClickUpdateInquiry = function12;
            BentoButtonBar2.BentoButtonBar(modifierTestTag2, null, null, false, null, null, function0, strStringResource3, z4, null, z5, (Function0) objRememberedValue3, strStringResource4, z6, null, z7, composerStartRestartGroup, 0, 0, 16958);
            composer2 = composerStartRestartGroup;
            composer2.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.unverifiedaccountrecovery.email.confirmation.EmailConfirmationComposableKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return EmailConfirmationComposable.EmailConfirmationComposable$lambda$8(state, onClickUpdateInquiry, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailConfirmationComposable$lambda$7$lambda$2$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(EmailConfirmationInputOption.SHOW_FULL_EMAIL);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailConfirmationComposable$lambda$7$lambda$4$lambda$3(Function1 function1) {
        function1.invoke(EmailConfirmationInputOption.LOGIN);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit EmailConfirmationComposable$lambda$7$lambda$6$lambda$5(Function1 function1) {
        function1.invoke(EmailConfirmationInputOption.UPDATE_EMAIL);
        return Unit.INSTANCE;
    }
}
