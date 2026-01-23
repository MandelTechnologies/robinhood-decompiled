package com.robinhood.android.privacysettings.p217ui.visibility;

import androidx.compose.foundation.ScrollKt;
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
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.privacysettings.C25869R;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.identi.OptOutConsentType;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: ProfileVisibilityComposable.kt */
@Metadata(m3635d1 = {"\u00008\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\u001a¢\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u000526\u0010\u0006\u001a2\u0012\u0013\u0012\u00110\b¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u00110\f¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\r\u0012\u0004\u0012\u00020\u00010\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052!\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0004\u0012\u00020\u00010\u00102\u0006\u0010\u0013\u001a\u00020\f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00010\u0005H\u0001¢\u0006\u0002\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"ProfileVisibilityComposable", "", "viewState", "Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityViewState;", "onAnyoneRowClicked", "Lkotlin/Function0;", "onConsentTypeRowClicked", "Lkotlin/Function2;", "Lcom/robinhood/models/api/identi/OptOutConsentType;", "Lkotlin/ParameterName;", "name", "type", "", "isChecked", "onNobodyRowClicked", "onPrivacyPolicyClicked", "Lkotlin/Function1;", "", "urlRes", "showSetupProfileButton", "onSetupProfileClicked", "(Lcom/robinhood/android/privacysettings/ui/visibility/ProfileVisibilityViewState;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;ZLkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;I)V", "feature-privacy-settings_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityComposableKt, reason: use source file name */
/* loaded from: classes11.dex */
public final class ProfileVisibilityComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileVisibilityComposable$lambda$10(ProfileVisibilityViewState profileVisibilityViewState, Function0 function0, Function2 function2, Function0 function02, Function1 function1, boolean z, Function0 function03, int i, Composer composer, int i2) {
        ProfileVisibilityComposable(profileVisibilityViewState, function0, function2, function02, function1, z, function03, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void ProfileVisibilityComposable(final ProfileVisibilityViewState viewState, final Function0<Unit> onAnyoneRowClicked, final Function2<? super OptOutConsentType, ? super Boolean, Unit> onConsentTypeRowClicked, final Function0<Unit> onNobodyRowClicked, final Function1<? super Integer, Unit> onPrivacyPolicyClicked, final boolean z, final Function0<Unit> onSetupProfileClicked, Composer composer, final int i) {
        int i2;
        int i3;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onAnyoneRowClicked, "onAnyoneRowClicked");
        Intrinsics.checkNotNullParameter(onConsentTypeRowClicked, "onConsentTypeRowClicked");
        Intrinsics.checkNotNullParameter(onNobodyRowClicked, "onNobodyRowClicked");
        Intrinsics.checkNotNullParameter(onPrivacyPolicyClicked, "onPrivacyPolicyClicked");
        Intrinsics.checkNotNullParameter(onSetupProfileClicked, "onSetupProfileClicked");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1741104567);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onAnyoneRowClicked) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onConsentTypeRowClicked) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onNobodyRowClicked) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onPrivacyPolicyClicked) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= composerStartRestartGroup.changed(z) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i2 |= composerStartRestartGroup.changedInstance(onSetupProfileClicked) ? 1048576 : 524288;
        }
        if ((599187 & i2) == 599186 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1741104567, i2, -1, "com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityComposable (ProfileVisibilityComposable.kt:30)");
            }
            Modifier.Companion companion = Modifier.INSTANCE;
            Arrangement arrangement = Arrangement.INSTANCE;
            Arrangement.Vertical top = arrangement.getTop();
            Alignment.Companion companion2 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composerStartRestartGroup, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, companion);
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
            Modifier modifierWeight$default = Column5.weight$default(Column6.INSTANCE, ScrollKt.verticalScroll$default(companion, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null), 1.0f, false, 2, null);
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion2.getStart(), composerStartRestartGroup, 0);
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
            String strStringResource = StringResources_androidKt.stringResource(C25869R.string.profile_visibility_title, composerStartRestartGroup, 0);
            BentoTheme bentoTheme = BentoTheme.INSTANCE;
            int i4 = BentoTheme.$stable;
            BentoText2.m20747BentoText38GnDrw(strStringResource, PaddingKt.m5146paddingqDBjuR0$default(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 8, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C25869R.string.profile_visibility_subtitle, composerStartRestartGroup, 0), PaddingKt.m5145paddingqDBjuR0(companion, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21593getSmallD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 0, 0, 8188);
            Composer composer2 = composerStartRestartGroup;
            BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
            int i5 = i2;
            BentoSelectionRow2.BentoSelectionRow(null, type2, StringResources_androidKt.stringResource(C25869R.string.profile_visibility_anyone_row_title, composer2, 0), viewState.isAnyoneRowChecked(), StringResources_androidKt.stringResource(C25869R.string.profile_visibility_anyone_row_subtitle, composer2, 0), !viewState.isUpdating(), null, !viewState.isAnyoneRowChecked(), false, false, onAnyoneRowClicked, composer2, 48, (i2 >> 3) & 14, 833);
            composer2.startReplaceGroup(668454680);
            if (viewState.isAnyoneRowChecked()) {
                BentoSelectionRowState.Type type3 = BentoSelectionRowState.Type.Checkbox;
                String strStringResource2 = StringResources_androidKt.stringResource(C25869R.string.profile_visibility_sticker_row_label, composer2, 0);
                boolean z2 = !viewState.isUpdating();
                boolean zIsStickerRowChecked = viewState.isStickerRowChecked();
                composer2.startReplaceGroup(-1633490746);
                i3 = i5;
                int i6 = i3 & 896;
                boolean zChangedInstance = (i6 == 256) | composer2.changedInstance(viewState);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileVisibilityComposable.ProfileVisibilityComposable$lambda$9$lambda$6$lambda$1$lambda$0(onConsentTypeRowClicked, viewState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, type3, strStringResource2, zIsStickerRowChecked, null, z2, null, false, false, false, (Function0) objRememberedValue, composer2, 48, 0, 977);
                String strStringResource3 = StringResources_androidKt.stringResource(C25869R.string.profile_visibility_phone_row_label, composer2, 0);
                boolean z3 = !viewState.isUpdating();
                boolean zIsPhoneRowChecked = viewState.isPhoneRowChecked();
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance2 = (i6 == 256) | composer2.changedInstance(viewState);
                Object objRememberedValue2 = composer2.rememberedValue();
                if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileVisibilityComposable.ProfileVisibilityComposable$lambda$9$lambda$6$lambda$3$lambda$2(onConsentTypeRowClicked, viewState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue2);
                }
                composer2.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, type3, strStringResource3, zIsPhoneRowChecked, null, z3, null, false, false, false, (Function0) objRememberedValue2, composer2, 48, 0, 977);
                String strStringResource4 = StringResources_androidKt.stringResource(C25869R.string.profile_visibility_email_row_label, composer2, 0);
                boolean z4 = !viewState.isUpdating();
                boolean zIsEmailRowChecked = viewState.isEmailRowChecked();
                composer2.startReplaceGroup(-1633490746);
                boolean zChangedInstance3 = (i6 == 256) | composer2.changedInstance(viewState);
                Object objRememberedValue3 = composer2.rememberedValue();
                if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityComposableKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return ProfileVisibilityComposable.ProfileVisibilityComposable$lambda$9$lambda$6$lambda$5$lambda$4(onConsentTypeRowClicked, viewState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue3);
                }
                composer2.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, type3, strStringResource4, zIsEmailRowChecked, null, z4, null, false, false, false, (Function0) objRememberedValue3, composer2, 48, 0, 977);
                composer2 = composer2;
            } else {
                i3 = i5;
            }
            composer2.endReplaceGroup();
            int i7 = i3;
            BentoSelectionRow2.BentoSelectionRow(null, type2, StringResources_androidKt.stringResource(C25869R.string.profile_visibility_nobody_row_title, composer2, 0), viewState.isNobodyRowChecked(), StringResources_androidKt.stringResource(C25869R.string.profile_visibility_nobody_row_subtitle, composer2, 0), !viewState.isUpdating(), null, false, false, false, onNobodyRowClicked, composer2, 48, (i7 >> 9) & 14, 961);
            composer2.endNode();
            String strStringResource5 = StringResources_androidKt.stringResource(C25869R.string.profile_visibility_footer, composer2, 0);
            String strStringResource6 = StringResources_androidKt.stringResource(C25869R.string.profile_visibility_footer_learn_more, composer2, 0);
            composer2.startReplaceGroup(5004770);
            boolean z5 = (i7 & 57344) == 16384;
            Object objRememberedValue4 = composer2.rememberedValue();
            if (z5 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue4 = new Function0() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return ProfileVisibilityComposable.ProfileVisibilityComposable$lambda$9$lambda$8$lambda$7(onPrivacyPolicyClicked);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue4);
            }
            composer2.endReplaceGroup();
            Composer composer3 = composer2;
            BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource5, strStringResource6, (Function0) objRememberedValue4, PaddingKt.m5143paddingVpY3zN4(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composer2, i4).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composer2, i4).m21590getDefaultD9Ej5fM()), bentoTheme.getColors(composer2, i4).m21426getFg20d7_KjU(), 0L, TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composer2, i4).getTextS(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, TextAlign.INSTANCE.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null), 0, composer3, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
            composerStartRestartGroup = composer3;
            composerStartRestartGroup.startReplaceGroup(-1231705728);
            if (z) {
                BentoButtonKt.m20586BentoButtonEikTQX8(onSetupProfileClicked, StringResources_androidKt.stringResource(C25869R.string.profile_visibility_setup_profile, composerStartRestartGroup, 0), PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(SizeKt.fillMaxWidth$default(companion, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 7, null), null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, (i7 >> 18) & 14, 0, 8184);
                composerStartRestartGroup = composerStartRestartGroup;
            }
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.privacysettings.ui.visibility.ProfileVisibilityComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ProfileVisibilityComposable.ProfileVisibilityComposable$lambda$10(viewState, onAnyoneRowClicked, onConsentTypeRowClicked, onNobodyRowClicked, onPrivacyPolicyClicked, z, onSetupProfileClicked, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileVisibilityComposable$lambda$9$lambda$6$lambda$1$lambda$0(Function2 function2, ProfileVisibilityViewState profileVisibilityViewState) {
        function2.invoke(OptOutConsentType.STICKER_DISCOVERABILITY_CONSENT, Boolean.valueOf(profileVisibilityViewState.isStickerRowChecked()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileVisibilityComposable$lambda$9$lambda$6$lambda$3$lambda$2(Function2 function2, ProfileVisibilityViewState profileVisibilityViewState) {
        function2.invoke(OptOutConsentType.PHONE_DISCOVERABILITY_CONSENT, Boolean.valueOf(profileVisibilityViewState.isPhoneRowChecked()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileVisibilityComposable$lambda$9$lambda$6$lambda$5$lambda$4(Function2 function2, ProfileVisibilityViewState profileVisibilityViewState) {
        function2.invoke(OptOutConsentType.EMAIL_DISCOVERABILITY_CONSENT, Boolean.valueOf(profileVisibilityViewState.isEmailRowChecked()));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ProfileVisibilityComposable$lambda$9$lambda$8$lambda$7(Function1 function1) {
        function1.invoke(Integer.valueOf(C32428R.string.url_privacy));
        return Unit.INSTANCE;
    }
}
