package com.robinhood.android.beneficiaries.p067ui.detail;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column5;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.WindowInsets;
import androidx.compose.material3.ScaffoldDefaults;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.models.api.SduiResponse;
import com.robinhood.android.beneficiaries.models.p066db.BeneficiaryDetail;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler3;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiColumns;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.models.serverdriven.experimental.p348ui.HorizontalPadding;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.utils.compose.extensions.WindowInsetsKt;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;

/* compiled from: BeneficiaryDetailCompose.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0007¢\u0006\u0002\u0010\b\u001a\u001d\u0010\t\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\f\u001a\u0015\u0010\r\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u000e\u001a\r\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0011\"\u000e\u0010\u0012\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0013X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"BeneficiaryDetailCompose", "", "viewState", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailCallbacks;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailViewState;Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailCallbacks;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BeneficiaryDetailRemoveAllAlertDialog", "removeAllAlert", "Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryDetail$RemoveAllAlert;", "(Lcom/robinhood/android/beneficiaries/models/db/BeneficiaryDetail$RemoveAllAlert;Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailCallbacks;Landroidx/compose/runtime/Composer;I)V", "BeneficiaryDetailRemoveConfirmationDialog", "(Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailCallbacks;Landroidx/compose/runtime/Composer;I)V", "removeButtonEventDescriptor", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "(Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON", "", "BENEFICIARY_DETAIL_SDUI_COLUMN", "BENEFICIARY_DETAIL_CONFIRMATION_DIALOG_REMOVE_CTA_BUTTON", "BENEFICIARY_DETAIL_CONFIRMATION_DIALOG_CANCEL_CTA_BUTTON", "feature-beneficiaries_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class BeneficiaryDetailCompose2 {
    public static final String BENEFICIARY_DETAIL_CONFIRMATION_DIALOG_CANCEL_CTA_BUTTON = "CancelCtaButton";
    public static final String BENEFICIARY_DETAIL_CONFIRMATION_DIALOG_REMOVE_CTA_BUTTON = "RemoveCtaButton";
    public static final String BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON = "CtaButton";
    public static final String BENEFICIARY_DETAIL_SDUI_COLUMN = "SduiColumn";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailCompose$lambda$1(BeneficiaryDetailViewState beneficiaryDetailViewState, BeneficiaryDetailCompose beneficiaryDetailCompose, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BeneficiaryDetailCompose(beneficiaryDetailViewState, beneficiaryDetailCompose, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveAllAlertDialog$lambda$8(BeneficiaryDetail.RemoveAllAlert removeAllAlert, BeneficiaryDetailCompose beneficiaryDetailCompose, int i, Composer composer, int i2) {
        BeneficiaryDetailRemoveAllAlertDialog(removeAllAlert, beneficiaryDetailCompose, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveConfirmationDialog$lambda$15(BeneficiaryDetailCompose beneficiaryDetailCompose, int i, Composer composer, int i2) {
        BeneficiaryDetailRemoveConfirmationDialog(beneficiaryDetailCompose, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BeneficiaryDetailCompose(final BeneficiaryDetailViewState viewState, final BeneficiaryDetailCompose callbacks, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        final SduiResponse sduiResponse;
        int i4;
        Modifier modifier3;
        BeneficiaryDetail.RemoveAllAlert removeAllAlert;
        BeneficiaryDetail.ViewModel viewModel;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(callbacks, "callbacks");
        Composer composerStartRestartGroup = composer.startRestartGroup(716120035);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(callbacks) : composerStartRestartGroup.changedInstance(callbacks) ? 32 : 16;
        }
        int i5 = i2 & 4;
        if (i5 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(716120035, i3, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailCompose (BeneficiaryDetailCompose.kt:47)");
                }
                sduiResponse = viewState.getSduiResponse();
                composerStartRestartGroup.startReplaceGroup(996593838);
                if (sduiResponse != null) {
                    i4 = i3;
                    modifier3 = modifier4;
                } else {
                    WindowInsets windowInsetsExcludeTop = WindowInsetsKt.excludeTop(ScaffoldDefaults.INSTANCE.getContentWindowInsets(composerStartRestartGroup, ScaffoldDefaults.$stable));
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2065326677, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$BeneficiaryDetailCompose$1$1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer2, Integer num) {
                            invoke(paddingValues, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(PaddingValues paddingValues, Composer composer2, int i6) {
                            int i7;
                            Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                            if ((i6 & 6) == 0) {
                                i7 = i6 | (composer2.changed(paddingValues) ? 4 : 2);
                            } else {
                                i7 = i6;
                            }
                            if ((i7 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2065326677, i7, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailCompose.<anonymous>.<anonymous> (BeneficiaryDetailCompose.kt:54)");
                            }
                            Modifier.Companion companion = Modifier.INSTANCE;
                            Modifier modifierPadding = PaddingKt.padding(companion, paddingValues);
                            SduiResponse sduiResponse2 = sduiResponse;
                            BeneficiaryDetailViewState beneficiaryDetailViewState = viewState;
                            BeneficiaryDetailCompose beneficiaryDetailCompose = callbacks;
                            Arrangement arrangement = Arrangement.INSTANCE;
                            Arrangement.Vertical top = arrangement.getTop();
                            Alignment.Companion companion2 = Alignment.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion2.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierPadding);
                            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion3.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion3.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion3.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion3.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion3.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            List<UIComponent<GenericAction>> components = sduiResponse2.getComponents();
                            Modifier modifierTestTag = TestTag3.testTag(Column5.weight$default(column6, companion, 1.0f, false, 2, null), BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_SDUI_COLUMN);
                            SduiActionHandler sduiActionHandlerCurrentActionHandler = SduiActionHandler3.currentActionHandler(composer2, 0);
                            composer2.startReplaceGroup(1510558093);
                            HorizontalPadding horizontalPadding = HorizontalPadding.Default;
                            ImmutableList3 persistentList = extensions2.toPersistentList(components);
                            composer2.startReplaceGroup(-1772220517);
                            SduiColumns.SduiColumn(persistentList, GenericAction.class, modifierTestTag, null, sduiActionHandlerCurrentActionHandler, horizontalPadding, arrangement.getTop(), companion2.getStart(), false, composer2, 100663296, 0);
                            composer2.endReplaceGroup();
                            composer2.endReplaceGroup();
                            BentoButtons.Type type2 = BentoButtons.Type.Secondary;
                            boolean z = !beneficiaryDetailViewState.isDeleteBeneficiaryLoading();
                            composer2.startReplaceGroup(5004770);
                            boolean zChangedInstance = composer2.changedInstance(beneficiaryDetailCompose);
                            Object objRememberedValue = composer2.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new BeneficiaryDetailCompose4(beneficiaryDetailCompose);
                                composer2.updateRememberedValue(objRememberedValue);
                            }
                            composer2.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) ((KFunction) objRememberedValue), StringResources_androidKt.stringResource(C9637R.string.beneficiary_remove, composer2, 0), ModifiersKt.autoLogEvents$default(TestTag3.testTag(com.robinhood.compose.bento.util.PaddingKt.m21618defaultFillMaxWidthPadding3ABfNKs(companion, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM()), BeneficiaryDetailCompose2.BENEFICIARY_DETAIL_REMOVE_CTA_BUTTON), BeneficiaryDetailCompose2.removeButtonEventDescriptor(composer2, 0), false, false, false, true, false, null, 110, null), null, type2, z, false, null, null, null, null, false, null, composer2, 24576, 0, 8136);
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54);
                    int i6 = ((i3 >> 6) & 14) | 805306368;
                    i4 = i3;
                    modifier3 = modifier4;
                    ScaffoldKt.m5939ScaffoldTvnljyQ(modifier3, null, null, null, null, 0, 0L, 0L, windowInsetsExcludeTop, composableLambdaRememberComposableLambda, composerStartRestartGroup, i6, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                BeneficiaryDetail beneficiaryDetail = viewState.getBeneficiaryDetail();
                removeAllAlert = (beneficiaryDetail != null || (viewModel = beneficiaryDetail.getViewModel()) == null) ? null : viewModel.getRemoveAllAlert();
                composerStartRestartGroup.startReplaceGroup(996637746);
                if (viewState.getShowRemoveAllAlertDialog() && removeAllAlert != null) {
                    BeneficiaryDetailRemoveAllAlertDialog(removeAllAlert, callbacks, composerStartRestartGroup, i4 & 112);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (viewState.getShowRemoveConfirmationDialog()) {
                    BeneficiaryDetailRemoveConfirmationDialog(callbacks, composerStartRestartGroup, (i4 >> 3) & 14);
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Modifier modifier5 = modifier3;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BeneficiaryDetailCompose2.BeneficiaryDetailCompose$lambda$1(viewState, callbacks, modifier5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            sduiResponse = viewState.getSduiResponse();
            composerStartRestartGroup.startReplaceGroup(996593838);
            if (sduiResponse != null) {
            }
            composerStartRestartGroup.endReplaceGroup();
            BeneficiaryDetail beneficiaryDetail2 = viewState.getBeneficiaryDetail();
            if (beneficiaryDetail2 != null) {
                composerStartRestartGroup.startReplaceGroup(996637746);
                if (viewState.getShowRemoveAllAlertDialog()) {
                    BeneficiaryDetailRemoveAllAlertDialog(removeAllAlert, callbacks, composerStartRestartGroup, i4 & 112);
                }
                composerStartRestartGroup.endReplaceGroup();
                if (viewState.getShowRemoveConfirmationDialog()) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void BeneficiaryDetailRemoveAllAlertDialog(final BeneficiaryDetail.RemoveAllAlert removeAllAlert, final BeneficiaryDetailCompose beneficiaryDetailCompose, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(1709125852);
        if ((i & 6) == 0) {
            i2 = (composerStartRestartGroup.changedInstance(removeAllAlert) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? composerStartRestartGroup.changed(beneficiaryDetailCompose) : composerStartRestartGroup.changedInstance(beneficiaryDetailCompose) ? 32 : 16;
        }
        if ((i2 & 19) == 18 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1709125852, i2, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailRemoveAllAlertDialog (BeneficiaryDetailCompose.kt:90)");
            }
            int i3 = i2;
            String title = removeAllAlert.getTitle();
            BentoAlertDialog2.Body.MarkdownText markdownText = new BentoAlertDialog2.Body.MarkdownText(removeAllAlert.getSubtitleMarkdown());
            ServerToBentoAssetMapper3 serverToBentoAssetMapper3 = ServerToBentoAssetMapper3.WARNING;
            Modifier.Companion companion = Modifier.INSTANCE;
            UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType = Component.ComponentType.BUTTON;
            Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, removeAllAlert.getRemoveAllCtaLoggingIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            String removeAllCtaTitle = removeAllAlert.getRemoveAllCtaTitle();
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i4 = i3 & 112;
            boolean z = i4 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryDetailCompose));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveAllAlertDialog$lambda$3$lambda$2(beneficiaryDetailCompose);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(removeAllCtaTitle, (Function0) objRememberedValue, modifierAutoLogEvents$default, type2, null, false, 48, null);
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion, UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(componentType, removeAllAlert.getCancelCtaLoggingIdentifier(), null, 4, null), null, 47, null)), true, false, false, true, false, null, 108, null);
            String cancelCtaTitle = removeAllAlert.getCancelCtaTitle();
            BentoButtons.Type type3 = BentoButtons.Type.Secondary;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z2 = i4 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryDetailCompose));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveAllAlertDialog$lambda$5$lambda$4(beneficiaryDetailCompose);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(cancelCtaTitle, (Function0) objRememberedValue2, modifierAutoLogEvents$default2, type3, null, false, 48, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = i4 == 32 || ((i3 & 64) != 0 && composerStartRestartGroup.changedInstance(beneficiaryDetailCompose));
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveAllAlertDialog$lambda$7$lambda$6(beneficiaryDetailCompose);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            int i5 = (BentoAlertDialog2.Body.MarkdownText.$stable << 3) | 196608;
            int i6 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(title, markdownText, bentoAlertButton, null, bentoAlertButton2, serverToBentoAssetMapper3, false, null, function0, composerStartRestartGroup, i5 | (i6 << 6) | (i6 << 12), 200);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveAllAlertDialog$lambda$8(removeAllAlert, beneficiaryDetailCompose, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveAllAlertDialog$lambda$3$lambda$2(BeneficiaryDetailCompose beneficiaryDetailCompose) {
        beneficiaryDetailCompose.onRemoveAllAlertDialogConfirm();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveAllAlertDialog$lambda$5$lambda$4(BeneficiaryDetailCompose beneficiaryDetailCompose) {
        beneficiaryDetailCompose.onRemoveAllAlertDialogCancel();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveAllAlertDialog$lambda$7$lambda$6(BeneficiaryDetailCompose beneficiaryDetailCompose) {
        beneficiaryDetailCompose.onRemoveAllAlertDialogDismiss();
        return Unit.INSTANCE;
    }

    private static final void BeneficiaryDetailRemoveConfirmationDialog(final BeneficiaryDetailCompose beneficiaryDetailCompose, Composer composer, final int i) {
        int i2;
        Composer composerStartRestartGroup = composer.startRestartGroup(823030631);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(beneficiaryDetailCompose) : composerStartRestartGroup.changedInstance(beneficiaryDetailCompose) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(823030631, i2, -1, "com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailRemoveConfirmationDialog (BeneficiaryDetailCompose.kt:134)");
            }
            boolean z = false;
            String strStringResource = StringResources_androidKt.stringResource(C9637R.string.beneficiary_delete_title, composerStartRestartGroup, 0);
            BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text("");
            Modifier.Companion companion = Modifier.INSTANCE;
            Modifier modifierTestTag = TestTag3.testTag(companion, BENEFICIARY_DETAIL_CONFIRMATION_DIALOG_REMOVE_CTA_BUTTON);
            String strStringResource2 = StringResources_androidKt.stringResource(C9637R.string.beneficiary_remove, composerStartRestartGroup, 0);
            BentoButtons.Type type2 = BentoButtons.Type.Primary;
            composerStartRestartGroup.startReplaceGroup(5004770);
            int i3 = i2 & 14;
            boolean z2 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(beneficiaryDetailCompose));
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveConfirmationDialog$lambda$10$lambda$9(beneficiaryDetailCompose);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource2, (Function0) objRememberedValue, modifierTestTag, type2, null, false, 48, null);
            Modifier modifierTestTag2 = TestTag3.testTag(companion, BENEFICIARY_DETAIL_CONFIRMATION_DIALOG_CANCEL_CTA_BUTTON);
            String strStringResource3 = StringResources_androidKt.stringResource(C9637R.string.beneficiary_cancel, composerStartRestartGroup, 0);
            BentoButtons.Type type3 = BentoButtons.Type.Secondary;
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean z3 = i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(beneficiaryDetailCompose));
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveConfirmationDialog$lambda$12$lambda$11(beneficiaryDetailCompose);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource3, (Function0) objRememberedValue2, modifierTestTag2, type3, null, false, 48, null);
            composerStartRestartGroup.startReplaceGroup(5004770);
            if (i3 == 4 || ((i2 & 8) != 0 && composerStartRestartGroup.changedInstance(beneficiaryDetailCompose))) {
                z = true;
            }
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveConfirmationDialog$lambda$14$lambda$13(beneficiaryDetailCompose);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            Function0 function0 = (Function0) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            int i4 = BentoAlertDialog2.Body.Text.$stable << 3;
            int i5 = BentoAlertButton.$stable;
            BentoAlertDialog.BentoAlertDialog(strStringResource, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, function0, composerStartRestartGroup, i4 | (i5 << 6) | (i5 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailComposeKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BeneficiaryDetailCompose2.BeneficiaryDetailRemoveConfirmationDialog$lambda$15(beneficiaryDetailCompose, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveConfirmationDialog$lambda$10$lambda$9(BeneficiaryDetailCompose beneficiaryDetailCompose) {
        beneficiaryDetailCompose.onRemoveConfirmationDialogConfirm();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveConfirmationDialog$lambda$12$lambda$11(BeneficiaryDetailCompose beneficiaryDetailCompose) {
        beneficiaryDetailCompose.onRemoveConfirmationDialogCancel();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BeneficiaryDetailRemoveConfirmationDialog$lambda$14$lambda$13(BeneficiaryDetailCompose beneficiaryDetailCompose) {
        beneficiaryDetailCompose.onRemoveConfirmationDialogDismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final UserInteractionEventDescriptor removeButtonEventDescriptor(Composer composer, int i) {
        composer.startReplaceGroup(578857525);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(578857525, i, -1, "com.robinhood.android.beneficiaries.ui.detail.removeButtonEventDescriptor (BeneficiaryDetailCompose.kt:153)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptorUpdateWith = UserInteractionEventDescriptors.updateWith((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), new UserInteractionEventDescriptor(null, null, null, null, new Component(Component.ComponentType.BUTTON, null, null, 6, null), null, 47, null));
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptorUpdateWith;
    }
}
