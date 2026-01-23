package com.robinhood.android.transfers.i18n.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.banking.lib.C9631R;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.crypto.costbasis.details.list.CryptoCostBasisDetailsListDuxo;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper3;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: I18nTransfersHubRowsComposable.kt */
@Metadata(m3635d1 = {"\u00006\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006H\u0007¢\u0006\u0002\u0010\u0007\u001a-\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"UkTransfersHubRowsComposable", "", "onTransferActionClick", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "createMaxTransferContext", "Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "sourceAccountType", "Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;", "sinkAccountType", "identifier", "", "locality", "Lcom/robinhood/iso/countrycode/CountryCode$Supported;", "(Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;Lcom/robinhood/rosetta/eventlogging/MAXTransferContext$TransferAccount$TransferAccountType;Ljava/lang/String;Lcom/robinhood/iso/countrycode/CountryCode$Supported;Landroidx/compose/runtime/Composer;I)Lcom/robinhood/android/autoeventlogging/UserInteractionEventDescriptor;", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubRowsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class I18nTransfersHubRowsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkTransfersHubRowsComposable$lambda$5(Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        UkTransfersHubRowsComposable(function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0141  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e0  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:75:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void UkTransfersHubRowsComposable(final Function1<? super TransferDirectionV2, Unit> onTransferActionClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onTransferActionClick, "onTransferActionClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1913558346);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onTransferActionClick) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 == 0) {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            i4 = i3;
            if ((i4 & 19) == 18 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier3 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1913558346, i4, -1, "com.robinhood.android.transfers.i18n.compose.UkTransfersHubRowsComposable (I18nTransfersHubRowsComposable.kt:25)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
                ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor = companion.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.createNode(constructor);
                } else {
                    composerStartRestartGroup.useNode();
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Column6 column6 = Column6.INSTANCE;
                BentoBaseRowState.Start.PictogramPog pictogramPog = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.CASH, null, null, 6, null);
                String strStringResource = StringResources_androidKt.stringResource(C9631R.string.uk_deposits_primary_text, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C30556R.string.uk_deposits_row_secondary_text, composerStartRestartGroup, 0);
                Modifier.Companion companion2 = Modifier.INSTANCE;
                MAXTransferContext.TransferAccount.TransferAccountType transferAccountType = MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
                MAXTransferContext.TransferAccount.TransferAccountType transferAccountType2 = MAXTransferContext.TransferAccount.TransferAccountType.RHS;
                CountryCode.Supported.UnitedKingdom unitedKingdom = CountryCode.Supported.UnitedKingdom.INSTANCE;
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion2, createMaxTransferContext(transferAccountType, transferAccountType2, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, unitedKingdom, composerStartRestartGroup, 438), false, false, false, true, false, null, 110, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i6 = i4 & 14;
                z = i6 != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubRowsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I18nTransfersHubRowsComposable.UkTransfersHubRowsComposable$lambda$4$lambda$1$lambda$0(onTransferActionClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                int i7 = BentoBaseRowState.Start.PictogramPog.$stable;
                Modifier modifier4 = modifier3;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, pictogramPog, strStringResource, strStringResource2, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, i7 << 3, 0, 2032);
                BentoBaseRowState.Start.PictogramPog pictogramPog2 = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.BANK, null, null, 6, null);
                String strStringResource3 = StringResources_androidKt.stringResource(C9631R.string.uk_withdrawals_primary_text, composerStartRestartGroup, 0);
                String strStringResource4 = StringResources_androidKt.stringResource(C30556R.string.uk_withdrawals_row_secondary_text, composerStartRestartGroup, 0);
                Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion2, createMaxTransferContext(transferAccountType2, transferAccountType, "withdraw", unitedKingdom, composerStartRestartGroup, 438), false, false, false, true, false, null, 110, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = i6 != 4;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubRowsComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I18nTransfersHubRowsComposable.UkTransfersHubRowsComposable$lambda$4$lambda$3$lambda$2(onTransferActionClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, pictogramPog2, strStringResource3, strStringResource4, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, i7 << 3, 0, 2032);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier2 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubRowsComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return I18nTransfersHubRowsComposable.UkTransfersHubRowsComposable$lambda$5(onTransferActionClick, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 48;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 19) == 18) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier3);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                BentoBaseRowState.Start.PictogramPog pictogramPog3 = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.CASH, null, null, 6, null);
                String strStringResource5 = StringResources_androidKt.stringResource(C9631R.string.uk_deposits_primary_text, composerStartRestartGroup, 0);
                String strStringResource22 = StringResources_androidKt.stringResource(C30556R.string.uk_deposits_row_secondary_text, composerStartRestartGroup, 0);
                Modifier.Companion companion22 = Modifier.INSTANCE;
                MAXTransferContext.TransferAccount.TransferAccountType transferAccountType3 = MAXTransferContext.TransferAccount.TransferAccountType.UK_BANK_ACCOUNT;
                MAXTransferContext.TransferAccount.TransferAccountType transferAccountType22 = MAXTransferContext.TransferAccount.TransferAccountType.RHS;
                CountryCode.Supported.UnitedKingdom unitedKingdom2 = CountryCode.Supported.UnitedKingdom.INSTANCE;
                Modifier modifierAutoLogEvents$default3 = ModifiersKt.autoLogEvents$default(companion22, createMaxTransferContext(transferAccountType3, transferAccountType22, CryptoCostBasisDetailsListDuxo.SOURCE_TYPE, unitedKingdom2, composerStartRestartGroup, 438), false, false, false, true, false, null, 110, null);
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i62 = i4 & 14;
                if (i62 != 4) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubRowsComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return I18nTransfersHubRowsComposable.UkTransfersHubRowsComposable$lambda$4$lambda$1$lambda$0(onTransferActionClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    int i72 = BentoBaseRowState.Start.PictogramPog.$stable;
                    Modifier modifier42 = modifier3;
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default3, pictogramPog3, strStringResource5, strStringResource22, null, null, null, false, false, false, 0L, (Function0) objRememberedValue, composerStartRestartGroup, i72 << 3, 0, 2032);
                    BentoBaseRowState.Start.PictogramPog pictogramPog22 = new BentoBaseRowState.Start.PictogramPog(ServerToBentoAssetMapper3.BANK, null, null, 6, null);
                    String strStringResource32 = StringResources_androidKt.stringResource(C9631R.string.uk_withdrawals_primary_text, composerStartRestartGroup, 0);
                    String strStringResource42 = StringResources_androidKt.stringResource(C30556R.string.uk_withdrawals_row_secondary_text, composerStartRestartGroup, 0);
                    Modifier modifierAutoLogEvents$default22 = ModifiersKt.autoLogEvents$default(companion22, createMaxTransferContext(transferAccountType22, transferAccountType3, "withdraw", unitedKingdom2, composerStartRestartGroup, 438), false, false, false, true, false, null, 110, null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if (i62 != 4) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.I18nTransfersHubRowsComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return I18nTransfersHubRowsComposable.UkTransfersHubRowsComposable$lambda$4$lambda$3$lambda$2(onTransferActionClick);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default22, pictogramPog22, strStringResource32, strStringResource42, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, i72 << 3, 0, 2032);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier2 = modifier42;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkTransfersHubRowsComposable$lambda$4$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(TransferDirectionV2.DEPOSIT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit UkTransfersHubRowsComposable$lambda$4$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(TransferDirectionV2.WITHDRAW);
        return Unit.INSTANCE;
    }

    public static final UserInteractionEventDescriptor createMaxTransferContext(MAXTransferContext.TransferAccount.TransferAccountType sourceAccountType, MAXTransferContext.TransferAccount.TransferAccountType sinkAccountType, String identifier, CountryCode.Supported locality, Composer composer, int i) {
        Intrinsics.checkNotNullParameter(sourceAccountType, "sourceAccountType");
        Intrinsics.checkNotNullParameter(sinkAccountType, "sinkAccountType");
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        Intrinsics.checkNotNullParameter(locality, "locality");
        composer.startReplaceGroup(1980645906);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1980645906, i, -1, "com.robinhood.android.transfers.i18n.compose.createMaxTransferContext (I18nTransfersHubRowsComposable.kt:75)");
        }
        UserInteractionEventDescriptor userInteractionEventDescriptorCopy$default = UserInteractionEventDescriptor.copy$default((UserInteractionEventDescriptor) composer.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor()), null, null, null, new Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new MAXTransferContext(null, null, new MAXTransferContext.TransferAccount(null, sourceAccountType, null, null, null, null, 61, null), new MAXTransferContext.TransferAccount(null, sinkAccountType, null, null, null, null, 61, null), null, null, null, null, null, null, null, null, null, null, locality.getIso3166CountryCode(), null, null, null, null, null, 1032179, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -131073, -1, -1, -1, -1, 16383, null), new Component(Component.ComponentType.ROW, identifier, null, 4, null), null, 39, null);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceGroup();
        return userInteractionEventDescriptorCopy$default;
    }
}
