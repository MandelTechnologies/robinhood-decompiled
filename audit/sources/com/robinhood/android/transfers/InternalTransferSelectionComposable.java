package com.robinhood.android.transfers;

import androidx.compose.foundation.ClickableKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.assettransfers.contracts.InternalAssetTransfer;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.TransferConfiguration;
import com.robinhood.android.transfers.contracts.TransferV2;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.MAXTransferContext;
import com.robinhood.rosetta.eventlogging.Screen;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: InternalTransferSelectionComposable.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\nH\u0007¢\u0006\u0002\u0010\u000b¨\u0006\f"}, m3636d2 = {"InternalTransferSelectionComposable", "", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "onRowClick", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/keys/IntentKey;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/rosetta/eventlogging/Screen;Lcom/robinhood/analytics/EventLogger;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.InternalTransferSelectionComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class InternalTransferSelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTransferSelectionComposable$lambda$5(Screen screen, EventLogger eventLogger, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InternalTransferSelectionComposable(screen, eventLogger, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0220  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x027c  */
    /* JADX WARN: Removed duplicated region for block: B:94:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InternalTransferSelectionComposable(final Screen screen, final EventLogger eventLogger, final Function1<? super IntentKey, Unit> onRowClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(screen, "screen");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        Intrinsics.checkNotNullParameter(onRowClick, "onRowClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(-395131022);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(screen) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(eventLogger) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onRowClick) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-395131022, i3, -1, "com.robinhood.android.transfers.InternalTransferSelectionComposable (InternalTransferSelectionComposable.kt:28)");
                }
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Modifier.Companion companion2 = Modifier.INSTANCE;
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21593getSmallD9Ej5fM(), 7, null);
                String strStringResource = StringResources_androidKt.stringResource(C30556R.string.internal_transfer_title, composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium = bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium();
                Modifier modifier5 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen);
                int i6 = i3 & 896;
                z = zChangedInstance2 | (i6 != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.InternalTransferSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalTransferSelectionComposable.InternalTransferSelectionComposable$lambda$4$lambda$1$lambda$0(eventLogger, screen, onRowClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue, 7, null), null, StringResources_androidKt.stringResource(C30556R.string.internal_transfer_money_row_primary_text, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, 0, 0, 4090);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen) | (i6 != 256);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.InternalTransferSelectionComposableKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalTransferSelectionComposable.InternalTransferSelectionComposable$lambda$4$lambda$3$lambda$2(eventLogger, screen, onRowClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ClickableKt.m4893clickableXHw0xAI$default(companion2, false, null, null, (Function0) objRememberedValue2, 7, null), null, StringResources_androidKt.stringResource(C30556R.string.internal_transfer_assets_row_primary_text, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composer2, 0, 0, 4090);
                composer2.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.InternalTransferSelectionComposableKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return InternalTransferSelectionComposable.InternalTransferSelectionComposable$lambda$5(screen, eventLogger, onRowClick, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier4);
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
                Modifier.Companion companion22 = Modifier.INSTANCE;
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i52 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21593getSmallD9Ej5fM(), 7, null);
                String strStringResource2 = StringResources_androidKt.stringResource(C30556R.string.internal_transfer_title, composerStartRestartGroup, 0);
                TextStyle displayCapsuleMedium2 = bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium();
                Modifier modifier52 = modifier4;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, modifierM5146paddingqDBjuR0$default2, null, null, null, null, null, 0, false, 0, 0, null, 0, displayCapsuleMedium2, composerStartRestartGroup, 0, 0, 8188);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                boolean zChangedInstance22 = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen);
                int i62 = i3 & 896;
                z = zChangedInstance22 | (i62 != 256);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.InternalTransferSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return InternalTransferSelectionComposable.InternalTransferSelectionComposable$lambda$4$lambda$1$lambda$0(eventLogger, screen, onRowClick);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ClickableKt.m4893clickableXHw0xAI$default(companion22, false, null, null, (Function0) objRememberedValue, 7, null), null, StringResources_androidKt.stringResource(C30556R.string.internal_transfer_money_row_primary_text, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composerStartRestartGroup, 0, 0, 4090);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    zChangedInstance = composerStartRestartGroup.changedInstance(eventLogger) | composerStartRestartGroup.changedInstance(screen) | (i62 != 256);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.InternalTransferSelectionComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InternalTransferSelectionComposable.InternalTransferSelectionComposable$lambda$4$lambda$3$lambda$2(eventLogger, screen, onRowClick);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        composer2 = composerStartRestartGroup;
                        BentoBaseRowKt.m20916BentoBaseRowygcbOzY(ClickableKt.m4893clickableXHw0xAI$default(companion22, false, null, null, (Function0) objRememberedValue2, 7, null), null, StringResources_androidKt.stringResource(C30556R.string.internal_transfer_assets_row_primary_text, composerStartRestartGroup, 0), null, null, null, null, false, false, false, 0L, null, composer2, 0, 0, 4090);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier52;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTransferSelectionComposable$lambda$4$lambda$1$lambda$0(EventLogger eventLogger, Screen screen, Function1 function1) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.ROW, "inter_entity", null, 4, null), null, null, false, 57, null);
        function1.invoke(new TransferV2(TransferDirectionV2.INTER_ENTITY, new TransferConfiguration.Standard(null, null, false, null, null, null, MAXTransferContext.EntryPoint.TRANSFER_HUB, null, false, false, null, null, false, 8127, null), null, 4, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InternalTransferSelectionComposable$lambda$4$lambda$3$lambda$2(EventLogger eventLogger, Screen screen, Function1 function1) {
        EventLogger.DefaultImpls.logTap$default(eventLogger, null, screen, new Component(Component.ComponentType.ROW, "internal_asset_transfer", null, 4, null), null, null, false, 57, null);
        function1.invoke(new InternalAssetTransfer("transfer_hub", false, null, null, 14, null));
        return Unit.INSTANCE;
    }
}
