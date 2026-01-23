package com.robinhood.shared.crypto.transfer.send.address.saved;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetState;
import androidx.compose.material3.SheetValue;
import androidx.compose.material3.SwipeToDismissBoxKt;
import androidx.compose.material3.SwipeToDismissBoxState;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.compose.autoeventlogging.ModifiersKt;
import com.robinhood.android.compose.autoeventlogging.UserInteractionEventDescriptors;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.compose.bento.component.alerts.BentoAlertButton;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog;
import com.robinhood.compose.bento.component.alerts.BentoAlertDialog2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.common.SwipeToDeleteRow2;
import com.robinhood.compose.common.SwipeToDeleteRowState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.address.UiSavedAddress;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.utils.resource.StringResources6;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContextImpl6;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: CryptoTransferAddressRowComposable.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\u001a_\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\u0018\u0010\n\u001a\u0014\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0007¢\u0006\u0002\u0010\u000f\u001aC\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00052\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0001\u0018\u00010\t2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u0016²\u0006\n\u0010\u0017\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0018\u001a\u00020\u0007X\u008a\u008e\u0002²\u0006\n\u0010\u0019\u001a\u00020\u0007X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferAddressRowComposable", "", "currencyCode", "", PlaceTypes.ADDRESS, "Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;", "isAllowlistEnabled", "", "onAddressRowClick", "Lkotlin/Function1;", "deleteSavedAddress", "Lkotlin/Function2;", "Ljava/util/UUID;", "modifier", "Landroidx/compose/ui/Modifier;", "(Ljava/lang/String;Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "BaseAddressRow", "onSaveButtonClick", "Lkotlin/Function0;", "(Lcom/robinhood/shared/crypto/transfer/send/address/UiSavedAddress;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "CryptoTransferAddressRowComposablePreview", "(Landroidx/compose/runtime/Composer;I)V", "feature-crypto-transfer_externalDebug", "showSavedAddressBottomSheet", "showDeleteAddressAlertDialog", "isSavingAddressBottomSheet"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferAddressRowComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseAddressRow$lambda$29(UiSavedAddress uiSavedAddress, Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        BaseAddressRow(uiSavedAddress, function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposable$lambda$24(String str, UiSavedAddress uiSavedAddress, boolean z, Function1 function1, Function2 function2, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTransferAddressRowComposable(str, uiSavedAddress, z, function1, function2, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposablePreview$lambda$30(int i, Composer composer, int i2) {
        CryptoTransferAddressRowComposablePreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01fd  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0299  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0375  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0516  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0521  */
    /* JADX WARN: Removed duplicated region for block: B:174:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x01a0  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x01ac  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01dd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferAddressRowComposable(final String currencyCode, final UiSavedAddress address, final boolean z, final Function1<? super String, Unit> function1, final Function2<? super UUID, ? super String, Unit> deleteSavedAddress, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final SnapshotState snapshotState;
        final SnapshotState snapshotState2;
        Composer composer2;
        int i4;
        CoroutineScope coroutineScope;
        int i5;
        Modifier modifier3;
        final SnapshotState snapshotState3;
        UserInteractionEventDescriptor userInteractionEventDescriptor;
        int i6;
        UiSavedAddress uiSavedAddress;
        UserInteractionEventDescriptor userInteractionEventDescriptor2;
        final SwipeToDismissBoxState swipeToDismissBoxState;
        int i7;
        final CoroutineScope coroutineScope2;
        int i8;
        final Modifier modifier4;
        String strStringResource;
        Object obj;
        int i9;
        final SnapshotState snapshotState4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(address, "address");
        Intrinsics.checkNotNullParameter(deleteSavedAddress, "deleteSavedAddress");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1201856301);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currencyCode) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(address) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(deleteSavedAddress) ? 16384 : 8192;
        }
        int i10 = i2 & 32;
        if (i10 == 0) {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            if ((74899 & i3) == 74898 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i10 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1201856301, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposable (CryptoTransferAddressRowComposable.kt:61)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                final SnapshotState snapshotState5 = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                SnapshotState snapshotState6 = (SnapshotState) objRememberedValue2;
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                    objRememberedValue3 = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                }
                SnapshotState snapshotState7 = (SnapshotState) objRememberedValue3;
                composerStartRestartGroup.endReplaceGroup();
                SwipeToDismissBoxState swipeToDismissBoxStateRememberSwipeToDismissBoxState = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(null, null, null, composerStartRestartGroup, 0, 7);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                    objRememberedValue4 = EffectsKt.createCompositionCoroutineScope(CoroutineContextImpl6.INSTANCE, composerStartRestartGroup);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                }
                CoroutineScope coroutineScope3 = (CoroutineScope) objRememberedValue4;
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor3 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Modifier modifier6 = modifier5;
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
                if (address.isValidSavedAddress()) {
                    snapshotState = snapshotState6;
                    composerStartRestartGroup.startReplaceGroup(296540762);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$23$lambda$12$lambda$11(snapshotState5);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState2 = snapshotState5;
                    composer2 = composerStartRestartGroup;
                    i4 = 5004770;
                    coroutineScope = coroutineScope3;
                    i5 = i3;
                    modifier3 = modifier6;
                    snapshotState3 = snapshotState7;
                    userInteractionEventDescriptor = userInteractionEventDescriptor3;
                    i6 = 0;
                    uiSavedAddress = address;
                    BaseAddressRow(uiSavedAddress, function1, (Function0) objRememberedValue5, null, composer2, ((i3 >> 3) & 14) | 384 | ((i3 >> 6) & 112), 8);
                    composer2.endReplaceGroup();
                } else {
                    composerStartRestartGroup.startReplaceGroup(294877829);
                    ComposableLambda composableLambdaRememberComposableLambda = ComposableLambda3.rememberComposableLambda(-2064405365, true, new CryptoTransferAddressRowComposable5(address, function1), composerStartRestartGroup, 54);
                    SwipeToDeleteRowState swipeToDeleteRowState = new SwipeToDeleteRowState(StringResources_androidKt.stringResource(C37934R.string.saved_address_row_remove_title, composerStartRestartGroup, 0), BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getNova(), null);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance = composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor3) | ((i3 & 896) == 256);
                    Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue6 == companion.getEmpty()) {
                        snapshotState = snapshotState6;
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$23$lambda$10$lambda$9(current, userInteractionEventDescriptor3, z, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    } else {
                        snapshotState = snapshotState6;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SwipeToDeleteRow2.SwipeToDeleteRow(composableLambdaRememberComposableLambda, null, swipeToDeleteRowState, swipeToDismissBoxStateRememberSwipeToDismissBoxState, (Function0) objRememberedValue6, composerStartRestartGroup, (SwipeToDeleteRowState.$stable << 6) | 6 | (SwipeToDismissBoxState.$stable << 9), 2);
                    swipeToDismissBoxStateRememberSwipeToDismissBoxState = swipeToDismissBoxStateRememberSwipeToDismissBoxState;
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState3 = snapshotState7;
                    i6 = 0;
                    coroutineScope = coroutineScope3;
                    userInteractionEventDescriptor = userInteractionEventDescriptor3;
                    i5 = i3;
                    snapshotState2 = snapshotState5;
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier6;
                    i4 = 5004770;
                    uiSavedAddress = address;
                }
                composer2.startReplaceGroup(1117953624);
                if (CryptoTransferAddressRowComposable$lambda$1(snapshotState2)) {
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    composerStartRestartGroup = composer2;
                    swipeToDismissBoxState = swipeToDismissBoxStateRememberSwipeToDismissBoxState;
                    i7 = i6;
                    coroutineScope2 = coroutineScope;
                    i8 = 1;
                } else {
                    composer2.startReplaceGroup(i4);
                    Object objRememberedValue7 = composer2.rememberedValue();
                    if (objRememberedValue7 == companion.getEmpty()) {
                        objRememberedValue7 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$23$lambda$14$lambda$13(snapshotState2);
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue7);
                    }
                    Function0 function0 = (Function0) objRememberedValue7;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(i4);
                    Object objRememberedValue8 = composer2.rememberedValue();
                    if (objRememberedValue8 == companion.getEmpty()) {
                        objRememberedValue8 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return Boolean.valueOf(CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$23$lambda$16$lambda$15(snapshotState3, (SheetValue) obj2));
                            }
                        };
                        composer2.updateRememberedValue(objRememberedValue8);
                    }
                    composer2.endReplaceGroup();
                    i8 = 1;
                    SheetState sheetStateRememberModalBottomSheetState = ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue8, composer2, 54, i6);
                    ComposableLambda composableLambdaRememberComposableLambda2 = ComposableLambda3.rememberComposableLambda(-677842124, true, new CryptoTransferAddressRowComposable6(currencyCode, uiSavedAddress, snapshotState2, snapshotState3), composer2, 54);
                    i7 = i6;
                    userInteractionEventDescriptor2 = userInteractionEventDescriptor;
                    Composer composer3 = composer2;
                    swipeToDismissBoxState = swipeToDismissBoxStateRememberSwipeToDismissBoxState;
                    coroutineScope2 = coroutineScope;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, sheetStateRememberModalBottomSheetState, null, 0L, composableLambdaRememberComposableLambda2, composer3, 1572870, 54);
                    composerStartRestartGroup = composer3;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1117985615);
                if (CryptoTransferAddressRowComposable$lambda$4(snapshotState)) {
                    String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.delete_saved_address_alert_dialog_title, composerStartRestartGroup, i7);
                    if (z) {
                        composerStartRestartGroup.startReplaceGroup(297963197);
                        strStringResource = StringResources_androidKt.stringResource(C37934R.string.delete_saved_address_alert_dialog_body_allowlisting, composerStartRestartGroup, i7);
                        composerStartRestartGroup.endReplaceGroup();
                    } else {
                        composerStartRestartGroup.startReplaceGroup(298091754);
                        strStringResource = StringResources_androidKt.stringResource(C37934R.string.delete_saved_address_alert_dialog_body, composerStartRestartGroup, i7);
                        composerStartRestartGroup.endReplaceGroup();
                    }
                    BentoAlertDialog2.Body.Text text = new BentoAlertDialog2.Body.Text(strStringResource);
                    Modifier.Companion companion3 = Modifier.INSTANCE;
                    UserInteractionEventData.Action action = UserInteractionEventData.Action.DELETE;
                    Component.ComponentType componentType = Component.ComponentType.BUTTON;
                    Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, action, null, new Component(componentType, z ? "allowlisted_address_delete_alert_delete" : "saved_address_delete_alert_delete", null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
                    String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.delete_saved_address_alert_dialog_remove_button, composerStartRestartGroup, i7);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    int i11 = (composerStartRestartGroup.changedInstance(coroutineScope2) ? 1 : 0) | (composerStartRestartGroup.changedInstance(swipeToDismissBoxState) ? 1 : 0);
                    if ((i5 & 57344) != 16384) {
                        i8 = i7;
                    }
                    int i12 = i11 | i8 | (composerStartRestartGroup.changedInstance(uiSavedAddress) ? 1 : 0);
                    Object objRememberedValue9 = composerStartRestartGroup.rememberedValue();
                    if (i12 != 0 || objRememberedValue9 == companion.getEmpty()) {
                        i9 = i7;
                        snapshotState4 = snapshotState;
                        obj = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$23$lambda$18$lambda$17(coroutineScope2, deleteSavedAddress, address, swipeToDismissBoxState, snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(obj);
                    } else {
                        i9 = i7;
                        obj = objRememberedValue9;
                        snapshotState4 = snapshotState;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton = new BentoAlertButton(strStringResource3, (Function0) obj, modifierAutoLogEvents$default, null, null, false, 56, null);
                    Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(companion3, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.CANCEL, null, new Component(componentType, z ? "allowlisted_address_delete_alert_cancel" : "saved_address_delete_alert_cancel", null, 4, null), null, 43, null)), true, false, false, true, false, null, 108, null);
                    String strStringResource4 = StringResources_androidKt.stringResource(C37934R.string.delete_saved_address_alert_dialog_cancel_button, composerStartRestartGroup, i9);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(swipeToDismissBoxState);
                    Object objRememberedValue10 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue10 == companion.getEmpty()) {
                        objRememberedValue10 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$23$lambda$20$lambda$19(coroutineScope2, swipeToDismissBoxState, snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue10);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoAlertButton bentoAlertButton2 = new BentoAlertButton(strStringResource4, (Function0) objRememberedValue10, modifierAutoLogEvents$default2, null, null, false, 56, null);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance3 = composerStartRestartGroup.changedInstance(coroutineScope2) | composerStartRestartGroup.changedInstance(swipeToDismissBoxState);
                    Object objRememberedValue11 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance3 || objRememberedValue11 == companion.getEmpty()) {
                        objRememberedValue11 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$23$lambda$22$lambda$21(coroutineScope2, swipeToDismissBoxState, snapshotState4);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue11);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i13 = BentoAlertDialog2.Body.Text.$stable << 3;
                    int i14 = BentoAlertButton.$stable;
                    Composer composer4 = composerStartRestartGroup;
                    BentoAlertDialog.BentoAlertDialog(strStringResource2, text, bentoAlertButton, null, bentoAlertButton2, null, false, null, (Function0) objRememberedValue11, composer4, i13 | (i14 << 6) | (i14 << 12), EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    composerStartRestartGroup = composer4;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier4 = modifier3;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier4 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj2, Object obj3) {
                        return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposable$lambda$24(currencyCode, address, z, function1, deleteSavedAddress, modifier4, i, i2, (Composer) obj2, ((Integer) obj3).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 196608;
        modifier2 = modifier;
        if ((74899 & i3) == 74898) {
            if (i10 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            final SnapshotState snapshotState52 = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue2 == companion.getEmpty()) {
            }
            SnapshotState snapshotState62 = (SnapshotState) objRememberedValue2;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue3 == companion.getEmpty()) {
            }
            SnapshotState snapshotState72 = (SnapshotState) objRememberedValue3;
            composerStartRestartGroup.endReplaceGroup();
            SwipeToDismissBoxState swipeToDismissBoxStateRememberSwipeToDismissBoxState2 = SwipeToDismissBoxKt.rememberSwipeToDismissBoxState(null, null, null, composerStartRestartGroup, 0, 7);
            objRememberedValue4 = composerStartRestartGroup.rememberedValue();
            if (objRememberedValue4 == companion.getEmpty()) {
            }
            CoroutineScope coroutineScope32 = (CoroutineScope) objRememberedValue4;
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor32 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifier5);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Modifier modifier62 = modifier5;
            Function0<ComposeUiNode> constructor2 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                if (address.isValidSavedAddress()) {
                }
                composer2.startReplaceGroup(1117953624);
                if (CryptoTransferAddressRowComposable$lambda$1(snapshotState2)) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.startReplaceGroup(1117985615);
                if (CryptoTransferAddressRowComposable$lambda$4(snapshotState)) {
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                }
                modifier4 = modifier3;
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferAddressRowComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final void CryptoTransferAddressRowComposable$lambda$5(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferAddressRowComposable$lambda$8(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    private static final boolean CryptoTransferAddressRowComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean CryptoTransferAddressRowComposable$lambda$4(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    private static final boolean CryptoTransferAddressRowComposable$lambda$7(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposable$lambda$23$lambda$10$lambda$9(EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, boolean z, SnapshotState snapshotState) {
        String str;
        CryptoTransferAddressRowComposable$lambda$5(snapshotState, true);
        UserInteractionEventData.Action action = UserInteractionEventData.Action.SWIPE_COMPLETED;
        Component.ComponentType componentType = Component.ComponentType.ROW;
        if (z) {
            str = "allowlisted";
        } else {
            str = "saved";
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, action, null, new Component(componentType, str, null, 4, null), null, 43, null), UserInteractionEventData.EventType.SWIPE), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposable$lambda$23$lambda$12$lambda$11(SnapshotState snapshotState) {
        CryptoTransferAddressRowComposable$lambda$2(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposable$lambda$23$lambda$14$lambda$13(SnapshotState snapshotState) {
        CryptoTransferAddressRowComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferAddressRowComposable$lambda$23$lambda$16$lambda$15(SnapshotState snapshotState, SheetValue targetSheetValue) {
        Intrinsics.checkNotNullParameter(targetSheetValue, "targetSheetValue");
        return (targetSheetValue == SheetValue.Hidden && CryptoTransferAddressRowComposable$lambda$7(snapshotState)) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposable$lambda$23$lambda$18$lambda$17(CoroutineScope coroutineScope, Function2 function2, UiSavedAddress uiSavedAddress, SwipeToDismissBoxState swipeToDismissBoxState, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoTransferAddressRowComposable7(swipeToDismissBoxState, null), 3, null);
        function2.invoke(uiSavedAddress.getId(), uiSavedAddress.getCurrencyCode());
        CryptoTransferAddressRowComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposable$lambda$23$lambda$20$lambda$19(CoroutineScope coroutineScope, SwipeToDismissBoxState swipeToDismissBoxState, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoTransferAddressRowComposable8(swipeToDismissBoxState, null), 3, null);
        CryptoTransferAddressRowComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferAddressRowComposable$lambda$23$lambda$22$lambda$21(CoroutineScope coroutineScope, SwipeToDismissBoxState swipeToDismissBoxState, SnapshotState snapshotState) {
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new CryptoTransferAddressRowComposable9(swipeToDismissBoxState, null), 3, null);
        CryptoTransferAddressRowComposable$lambda$5(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:92:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BaseAddressRow(final UiSavedAddress uiSavedAddress, final Function1<? super String, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        String str;
        BentoBaseRowState.Meta.Icon icon;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-170291602);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(uiSavedAddress) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function1) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
        }
        int i4 = i2 & 8;
        if (i4 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                if (i4 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-170291602, i3, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.BaseAddressRow (CryptoTransferAddressRowComposable.kt:223)");
                }
                Resources resources = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
                final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
                final UserInteractionEventDescriptor userInteractionEventDescriptor = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
                Component.ComponentType componentType = Component.ComponentType.ROW;
                if (!uiSavedAddress.getShouldShowSaveIcon()) {
                    str = "recent_address";
                } else {
                    str = "saved_address";
                }
                final Component component = new Component(componentType, str, null, 4, null);
                Modifier modifierAutoLogEvents$default = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.ENTER_TRANSFER_ADDRESS, null, component, null, 43, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
                Modifier modifier4 = modifier2;
                String primaryText = uiSavedAddress.getPrimaryText();
                Intrinsics.checkNotNull(resources);
                String textAsString = StringResources6.getTextAsString(uiSavedAddress.getSecondaryText(resources), composerStartRestartGroup, StringResource.$stable);
                composerStartRestartGroup.startReplaceGroup(-441435638);
                if (uiSavedAddress.getShouldShowSaveIcon()) {
                    icon = null;
                } else {
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.BUBBLE_PLUS_24;
                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_create_saved_address_button_content_description, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(-1746271574);
                    boolean zChangedInstance = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda9
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferAddressRowComposable4.BaseAddressRow$lambda$26$lambda$25(function0, current, userInteractionEventDescriptor);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    icon = new BentoBaseRowState.Meta.Icon(serverToBentoAssetMapper2, strStringResource, (Color) null, (Function0) objRememberedValue, 4, (DefaultConstructorMarker) null);
                }
                composerStartRestartGroup.endReplaceGroup();
                Function0 function02 = null;
                BentoBaseRowState.Meta.Icon icon2 = icon;
                boolean zIsValidAddress = uiSavedAddress.isValidAddress();
                composerStartRestartGroup.startReplaceGroup(-441404397);
                if (function1 != null) {
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(uiSavedAddress) | ((i3 & 112) == 32) | composerStartRestartGroup.changedInstance(current) | composerStartRestartGroup.changedInstance(userInteractionEventDescriptor) | composerStartRestartGroup.changedInstance(component);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!zChangedInstance2) {
                        Object obj = objRememberedValue2;
                        if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            Object obj2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda10
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTransferAddressRowComposable4.BaseAddressRow$lambda$28$lambda$27(function1, uiSavedAddress, current, userInteractionEventDescriptor, component);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(obj2);
                            obj = obj2;
                        }
                        function02 = (Function0) obj;
                        composerStartRestartGroup.endReplaceGroup();
                    }
                }
                Function0 function03 = function02;
                composerStartRestartGroup.endReplaceGroup();
                composer2 = composerStartRestartGroup;
                BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default, null, primaryText, textAsString, null, icon2, null, false, zIsValidAddress, false, 0L, function03, composer2, (BentoBaseRowState.Meta.Icon.$stable << 15) | 12582912, 0, 1618);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return CryptoTransferAddressRowComposable4.BaseAddressRow$lambda$29(uiSavedAddress, function1, function0, modifier3, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i4 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            Resources resources2 = ((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext())).getResources();
            final EventLogger current2 = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composerStartRestartGroup, AutoLoggingCompositionLocals4.$stable);
            final UserInteractionEventDescriptor userInteractionEventDescriptor2 = (UserInteractionEventDescriptor) composerStartRestartGroup.consume(AutoLoggingCompositionLocals.getLocalUserInteractionEventDescriptor());
            Component.ComponentType componentType2 = Component.ComponentType.ROW;
            if (!uiSavedAddress.getShouldShowSaveIcon()) {
            }
            final Component component2 = new Component(componentType2, str, null, 4, null);
            Modifier modifierAutoLogEvents$default2 = ModifiersKt.autoLogEvents$default(modifier2, UserInteractionEventDescriptors.updateWith(userInteractionEventDescriptor2, new UserInteractionEventDescriptor(null, null, UserInteractionEventData.Action.ENTER_TRANSFER_ADDRESS, null, component2, null, 43, null)), true, false, false, false, false, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE, null);
            Modifier modifier42 = modifier2;
            String primaryText2 = uiSavedAddress.getPrimaryText();
            Intrinsics.checkNotNull(resources2);
            String textAsString2 = StringResources6.getTextAsString(uiSavedAddress.getSecondaryText(resources2), composerStartRestartGroup, StringResource.$stable);
            composerStartRestartGroup.startReplaceGroup(-441435638);
            if (uiSavedAddress.getShouldShowSaveIcon()) {
            }
            composerStartRestartGroup.endReplaceGroup();
            Function0 function022 = null;
            BentoBaseRowState.Meta.Icon icon22 = icon;
            boolean zIsValidAddress2 = uiSavedAddress.isValidAddress();
            composerStartRestartGroup.startReplaceGroup(-441404397);
            if (function1 != null) {
            }
            Function0 function032 = function022;
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(modifierAutoLogEvents$default2, null, primaryText2, textAsString2, null, icon22, null, false, zIsValidAddress2, false, 0L, function032, composer2, (BentoBaseRowState.Meta.Icon.$stable << 15) | 12582912, 0, 1618);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier42;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseAddressRow$lambda$26$lambda$25(Function0 function0, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor) {
        function0.invoke();
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.SAVE, null, new Component(Component.ComponentType.ROW, "recent_address", null, 4, null), null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BaseAddressRow$lambda$28$lambda$27(Function1 function1, UiSavedAddress uiSavedAddress, EventLogger eventLogger, UserInteractionEventDescriptor userInteractionEventDescriptor, Component component) {
        function1.invoke(uiSavedAddress.getAddress());
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventDescriptors.toEventData(UserInteractionEventDescriptor.copy$default(userInteractionEventDescriptor, null, null, UserInteractionEventData.Action.ENTER_TRANSFER_ADDRESS, null, component, null, 43, null), UserInteractionEventData.EventType.TAP), false, false, 6, null);
        return Unit.INSTANCE;
    }

    private static final void CryptoTransferAddressRowComposablePreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1428523467);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1428523467, i, -1, "com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposablePreview (CryptoTransferAddressRowComposable.kt:290)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, CryptoTransferAddressRowComposable.INSTANCE.getLambda$679149949$feature_crypto_transfer_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.address.saved.CryptoTransferAddressRowComposableKt$$ExternalSyntheticLambda8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoTransferAddressRowComposable4.CryptoTransferAddressRowComposablePreview$lambda$30(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
