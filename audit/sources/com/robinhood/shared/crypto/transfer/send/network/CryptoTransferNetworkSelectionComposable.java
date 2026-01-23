package com.robinhood.shared.crypto.transfer.send.network;

import android.content.Context;
import android.content.res.Resources;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material3.ModalBottomSheetKt;
import androidx.compose.material3.SheetValue;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.ColorFilter;
import androidx.compose.p011ui.layout.ContentScale;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.style.TextAlign;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import coil.compose.SingletonAsyncImagePainter;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet3;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.utils.web.WebUtils;
import com.robinhood.compose.bento.component.BentoButtonBar2;
import com.robinhood.compose.bento.component.BentoButtonBar3;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.common.HeaderButtonBarScreenLayout6;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.models.api.transfer.ApiCryptoSupportedNetworks;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable;
import com.robinhood.utils.extensions.Contexts8;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoTransferNetworkSelectionComposable.kt */
@Metadata(m3635d1 = {"\u00004\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\u001a3\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0001¢\u0006\u0002\u0010\t\u001a#\u0010\n\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\u000e¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\f\u0010\u0012\u001a\u0004\u0018\u00010\u0006X\u008a\u008e\u0002"}, m3636d2 = {"CryptoTransferNetworkSelectionComposable", "", "state", "Lcom/robinhood/shared/crypto/transfer/send/network/CryptoTransferNetworkSelectionState;", "continueButtonClick", "Lkotlin/Function1;", "Lcom/robinhood/models/api/transfer/ApiCryptoSupportedNetworks$CryptoNetwork;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/shared/crypto/transfer/send/network/CryptoTransferNetworkSelectionState;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "AbsentNetworkSheet", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "fallbackSubtitle", "", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug", "showAbsentNetworkBottomSheet", "", "selectedNetwork"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoTransferNetworkSelectionComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AbsentNetworkSheet$lambda$15(RhModalBottomSheet5 rhModalBottomSheet5, String str, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AbsentNetworkSheet(rhModalBottomSheet5, str, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean CryptoTransferNetworkSelectionComposable$lambda$10$lambda$9(SheetValue it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferNetworkSelectionComposable$lambda$11(CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable3, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        CryptoTransferNetworkSelectionComposable(cryptoTransferNetworkSelectionComposable3, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:40:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x017c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:72:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoTransferNetworkSelectionComposable(final CryptoTransferNetworkSelectionState state, final Function1<? super ApiCryptoSupportedNetworks.CryptoNetwork, Unit> continueButtonClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        boolean zChangedInstance;
        Object objRememberedValue2;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(continueButtonClick, "continueButtonClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(322213409);
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
            i3 |= composerStartRestartGroup.changedInstance(continueButtonClick) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(322213409, i3, -1, "com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable (CryptoTransferNetworkSelectionComposable.kt:55)");
                }
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                    objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                snapshotState = (SnapshotState) objRememberedValue;
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr = new Object[0];
                composerStartRestartGroup.startReplaceGroup(5004770);
                zChangedInstance = composerStartRestartGroup.changedInstance(state);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$4$lambda$3(state);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1045676383, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt.CryptoTransferNetworkSelectionComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1045676383, i5, -1, "com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable.<anonymous> (CryptoTransferNetworkSelectionComposable.kt:61)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable3 = state;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
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
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_selection_title, composer2, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleMedium(), composer2, 48, 0, 8188);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(cryptoTransferNetworkSelectionComposable3.getSubtitle(), composer2, StringResource.$stable), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16380);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1339927117, true, new C383542(state, continueButtonClick, snapshotState2), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1545878941, true, new C383553(state, snapshotState2, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 0);
                if (CryptoTransferNetworkSelectionComposable$lambda$1(snapshotState)) {
                    modifier3 = modifier5;
                } else {
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$8$lambda$7(snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    Function0 function0 = (Function0) objRememberedValue3;
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = new Function1() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return Boolean.valueOf(CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$10$lambda$9((SheetValue) obj));
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    modifier3 = modifier5;
                    RhModalBottomSheet3.m12185RhModalBottomSheetcd68TDI(function0, null, false, ModalBottomSheetKt.rememberModalBottomSheetState(true, (Function1) objRememberedValue4, composerStartRestartGroup, 54, 0), null, 0L, ComposableLambda3.rememberComposableLambda(-908111275, true, new Function3<RhModalBottomSheet5, Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt.CryptoTransferNetworkSelectionComposable.6
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(RhModalBottomSheet5 rhModalBottomSheet5, Composer composer2, Integer num) {
                            invoke(rhModalBottomSheet5, composer2, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(RhModalBottomSheet5 RhModalBottomSheet, Composer composer2, int i5) {
                            Intrinsics.checkNotNullParameter(RhModalBottomSheet, "$this$RhModalBottomSheet");
                            if ((i5 & 6) == 0) {
                                i5 |= (i5 & 8) == 0 ? composer2.changed(RhModalBottomSheet) : composer2.changedInstance(RhModalBottomSheet) ? 4 : 2;
                            }
                            if ((i5 & 19) == 18 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-908111275, i5, -1, "com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable.<anonymous> (CryptoTransferNetworkSelectionComposable.kt:139)");
                            }
                            CryptoTransferNetworkSelectionComposable.AbsentNetworkSheet(RhModalBottomSheet, StringResource2.getString(state.getFallbackSubtitle(), composer2, StringResource.$stable), null, composer2, RhModalBottomSheet5.$stable | (i5 & 14), 2);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composerStartRestartGroup, 54), composerStartRestartGroup, 1572870, 54);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$11(state, continueButtonClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 384;
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composerStartRestartGroup.startReplaceGroup(1849434622);
            objRememberedValue = composerStartRestartGroup.rememberedValue();
            companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
            }
            snapshotState = (SnapshotState) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            Object[] objArr2 = new Object[0];
            composerStartRestartGroup.startReplaceGroup(5004770);
            zChangedInstance = composerStartRestartGroup.changedInstance(state);
            objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (!zChangedInstance) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$4$lambda$3(state);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState22 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 0, 6);
                HeaderButtonBarScreenLayout6.HeaderButtonBarScreenLayout(SizeKt.fillMaxSize$default(modifier5, 0.0f, 1, null), ComposableLambda3.rememberComposableLambda(1045676383, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt.CryptoTransferNetworkSelectionComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                        invoke(composer2, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer2, int i5) {
                        if ((i5 & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1045676383, i5, -1, "com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable.<anonymous> (CryptoTransferNetworkSelectionComposable.kt:61)");
                        }
                        Modifier.Companion companion2 = Modifier.INSTANCE;
                        BentoTheme bentoTheme = BentoTheme.INSTANCE;
                        int i6 = BentoTheme.$stable;
                        Modifier modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default = PaddingKt.m21621defaultFillMaxWidthPaddingVpY3zN4$default(companion2, bentoTheme.getSpacing(composer2, i6).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                        CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable3 = state;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM21621defaultFillMaxWidthPaddingVpY3zN4$default);
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
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_selection_title, composer2, 0), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer2, i6).getDisplayCapsuleMedium(), composer2, 48, 0, 8188);
                        BentoText2.m20747BentoText38GnDrw(StringResource2.getString(cryptoTransferNetworkSelectionComposable3.getSubtitle(), composer2, StringResource.$stable), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, null, null, null, 0, false, 0, 0, null, 0, null, composer2, 48, 0, 16380);
                        composer2.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(-1339927117, true, new C383542(state, continueButtonClick, snapshotState22), composerStartRestartGroup, 54), ComposableLambda3.rememberComposableLambda(1545878941, true, new C383553(state, snapshotState22, snapshotState), composerStartRestartGroup, 54), composerStartRestartGroup, 3504, 0);
                if (CryptoTransferNetworkSelectionComposable$lambda$1(snapshotState)) {
                }
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
    public static final void CryptoTransferNetworkSelectionComposable$lambda$2(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState CryptoTransferNetworkSelectionComposable$lambda$4$lambda$3(CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable3) {
        return SnapshotState3.mutableStateOf$default(cryptoTransferNetworkSelectionComposable3.getDefaultSelectedNetwork(), null, 2, null);
    }

    /* compiled from: CryptoTransferNetworkSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$CryptoTransferNetworkSelectionComposable$3 */
    static final class C383553 implements Function2<Composer, Integer, Unit> {
        final /* synthetic */ SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> $selectedNetwork$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showAbsentNetworkBottomSheet$delegate;
        final /* synthetic */ CryptoTransferNetworkSelectionState $state;

        C383553(CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable3, SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> snapshotState, SnapshotState<Boolean> snapshotState2) {
            this.$state = cryptoTransferNetworkSelectionComposable3;
            this.$selectedNetwork$delegate = snapshotState;
            this.$showAbsentNetworkBottomSheet$delegate = snapshotState2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) throws Resources.NotFoundException {
            invoke(composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(Composer composer, int i) throws Resources.NotFoundException {
            Composer composer2 = composer;
            if ((i & 3) == 2 && composer2.getSkipping()) {
                composer2.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1545878941, i, -1, "com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable.<anonymous> (CryptoTransferNetworkSelectionComposable.kt:74)");
            }
            boolean z = true;
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21590getDefaultD9Ej5fM(), 1, null);
            CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable3 = this.$state;
            final SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> snapshotState = this.$selectedNetwork$delegate;
            SnapshotState<Boolean> snapshotState2 = this.$showAbsentNetworkBottomSheet$delegate;
            int i2 = 0;
            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, modifierM5144paddingVpY3zN4$default);
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
            composer2.startReplaceGroup(-1868616758);
            for (final ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork : cryptoTransferNetworkSelectionComposable3.getSupportedNetworks().getResults()) {
                CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable32 = cryptoTransferNetworkSelectionComposable3;
                BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_selection_network_title, new Object[]{cryptoNetwork.getNetwork_info().getName()}, composer2, i2);
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_selection_network_subtitle, new Object[]{cryptoTransferNetworkSelectionComposable32.getCurrencyCode(), cryptoNetwork.getNetwork_info().getType_name()}, composer2, i2);
                BentoSelectionRowState.IconPosition.Leading leading = new BentoSelectionRowState.IconPosition.Leading(ComposableLambda3.rememberComposableLambda(1862264234, z, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$CryptoTransferNetworkSelectionComposable$3$1$1$1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i3) {
                        if ((i3 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1862264234, i3, -1, "com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (CryptoTransferNetworkSelectionComposable.kt:89)");
                        }
                        ImageKt.Image(SingletonAsyncImagePainter.m9120rememberAsyncImagePainterEHKIwbg(BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).getIsDay() ? cryptoNetwork.getNetwork_info().getLogo_url_light() : cryptoNetwork.getNetwork_info().getLogo_url(), null, null, null, 0, null, composer3, 0, 62), (String) null, SizeKt.m5169size3ABfNKs(Modifier.INSTANCE, C2002Dp.m7995constructorimpl(24)), (Alignment) null, ContentScale.INSTANCE.getFit(), 0.0f, (ColorFilter) null, composer3, 25008, 104);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composer2, 54));
                boolean zIs_enabled_for_withdrawal = cryptoNetwork.is_enabled_for_withdrawal();
                boolean zAreEqual = Intrinsics.areEqual(CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$5(snapshotState), cryptoNetwork);
                composer2.startReplaceGroup(-1633490746);
                boolean zChanged = composer2.changed(snapshotState) | composer2.changedInstance(cryptoNetwork);
                Object objRememberedValue = composer2.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$CryptoTransferNetworkSelectionComposable$3$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return CryptoTransferNetworkSelectionComposable.C383553.invoke$lambda$5$lambda$2$lambda$1$lambda$0(cryptoNetwork, snapshotState);
                        }
                    };
                    composer2.updateRememberedValue(objRememberedValue);
                }
                composer2.endReplaceGroup();
                BentoSelectionRow2.BentoSelectionRow(null, type2, strStringResource, zAreEqual, strStringResource2, zIs_enabled_for_withdrawal, leading, false, false, false, (Function0) objRememberedValue, composer, (BentoSelectionRowState.IconPosition.Leading.$stable << 18) | 48, 0, 897);
                i2 = i2;
                composer2 = composer;
                cryptoTransferNetworkSelectionComposable3 = cryptoTransferNetworkSelectionComposable32;
                snapshotState2 = snapshotState2;
                z = z;
                snapshotState = snapshotState;
            }
            final SnapshotState<Boolean> snapshotState3 = snapshotState2;
            composer2.endReplaceGroup();
            BentoBaseRowState.Start.Icon icon = new BentoBaseRowState.Start.Icon(ServerToBentoAssetMapper2.ACTION_REMOVE_24, null, null, 6, null);
            String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_fallback, composer2, i2);
            composer2.startReplaceGroup(5004770);
            Object objRememberedValue2 = composer2.rememberedValue();
            if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$CryptoTransferNetworkSelectionComposable$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferNetworkSelectionComposable.C383553.invoke$lambda$5$lambda$4$lambda$3(snapshotState3);
                    }
                };
                composer2.updateRememberedValue(objRememberedValue2);
            }
            composer2.endReplaceGroup();
            BentoBaseRowKt.m20916BentoBaseRowygcbOzY(null, icon, strStringResource3, null, null, null, null, false, false, false, 0L, (Function0) objRememberedValue2, composer2, BentoBaseRowState.Start.Icon.$stable << 3, 48, 2041);
            composer.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$2$lambda$1$lambda$0(ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork, SnapshotState snapshotState) {
            CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$6(snapshotState, cryptoNetwork);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4$lambda$3(SnapshotState snapshotState) {
            CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$2(snapshotState, true);
            return Unit.INSTANCE;
        }
    }

    private static final boolean CryptoTransferNetworkSelectionComposable$lambda$1(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ApiCryptoSupportedNetworks.CryptoNetwork CryptoTransferNetworkSelectionComposable$lambda$5(SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void CryptoTransferNetworkSelectionComposable$lambda$6(SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> snapshotState, ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetwork) {
        snapshotState.setValue(cryptoNetwork);
    }

    /* compiled from: CryptoTransferNetworkSelectionComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$CryptoTransferNetworkSelectionComposable$2 */
    static final class C383542 implements Function3<BentoButtonBar3, Composer, Integer, Unit> {
        final /* synthetic */ Function1<ApiCryptoSupportedNetworks.CryptoNetwork, Unit> $continueButtonClick;
        final /* synthetic */ SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> $selectedNetwork$delegate;
        final /* synthetic */ CryptoTransferNetworkSelectionState $state;

        /* JADX WARN: Multi-variable type inference failed */
        C383542(CryptoTransferNetworkSelectionState cryptoTransferNetworkSelectionComposable3, Function1<? super ApiCryptoSupportedNetworks.CryptoNetwork, Unit> function1, SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> snapshotState) {
            this.$state = cryptoTransferNetworkSelectionComposable3;
            this.$continueButtonClick = function1;
            this.$selectedNetwork$delegate = snapshotState;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(BentoButtonBar3 bentoButtonBar3, Composer composer, Integer num) {
            invoke(bentoButtonBar3, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(BentoButtonBar3 HeaderButtonBarScreenLayout, Composer composer, int i) {
            Intrinsics.checkNotNullParameter(HeaderButtonBarScreenLayout, "$this$HeaderButtonBarScreenLayout");
            if ((i & 17) == 16 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1339927117, i, -1, "com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposable.<anonymous> (CryptoTransferNetworkSelectionComposable.kt:117)");
            }
            final Context context = (Context) composer.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            final String string2 = StringResource2.getString(this.$state.getUrl(), composer, StringResource.$stable);
            Modifier modifierM5144paddingVpY3zN4$default = androidx.compose.foundation.layout.PaddingKt.m5144paddingVpY3zN4$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getSpacing(composer, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
            String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_selection_helper, composer, 0);
            String strStringResource2 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composer, 0);
            boolean z = CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$5(this.$selectedNetwork$delegate) != null;
            String strStringResource3 = StringResources_androidKt.stringResource(C11048R.string.general_label_continue, composer, 0);
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance = composer.changedInstance(context) | composer.changed(string2);
            Object objRememberedValue = composer.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$CryptoTransferNetworkSelectionComposable$2$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferNetworkSelectionComposable.C383542.invoke$lambda$1$lambda$0(context, string2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            Function0 function0 = (Function0) objRememberedValue;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChanged = composer.changed(this.$continueButtonClick) | composer.changed(this.$selectedNetwork$delegate);
            final Function1<ApiCryptoSupportedNetworks.CryptoNetwork, Unit> function1 = this.$continueButtonClick;
            final SnapshotState<ApiCryptoSupportedNetworks.CryptoNetwork> snapshotState = this.$selectedNetwork$delegate;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$CryptoTransferNetworkSelectionComposable$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return CryptoTransferNetworkSelectionComposable.C383542.invoke$lambda$3$lambda$2(function1, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            composer.endReplaceGroup();
            BentoButtonBar2.BentoButtonBar(modifierM5144paddingVpY3zN4$default, strStringResource, strStringResource2, false, function0, null, (Function0) objRememberedValue2, strStringResource3, false, null, z, null, null, false, null, false, composer, 0, 0, 64296);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(Context context, String str) {
            WebUtils.viewUrl$default(context, str, 0, 4, (Object) null);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(Function1 function1, SnapshotState snapshotState) {
            ApiCryptoSupportedNetworks.CryptoNetwork cryptoNetworkCryptoTransferNetworkSelectionComposable$lambda$5 = CryptoTransferNetworkSelectionComposable.CryptoTransferNetworkSelectionComposable$lambda$5(snapshotState);
            Intrinsics.checkNotNull(cryptoNetworkCryptoTransferNetworkSelectionComposable$lambda$5);
            function1.invoke(cryptoNetworkCryptoTransferNetworkSelectionComposable$lambda$5);
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoTransferNetworkSelectionComposable$lambda$8$lambda$7(SnapshotState snapshotState) {
        CryptoTransferNetworkSelectionComposable$lambda$2(snapshotState, false);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:29:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01eb  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01ee  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x025d  */
    /* JADX WARN: Removed duplicated region for block: B:90:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void AbsentNetworkSheet(RhModalBottomSheet5 rhModalBottomSheet5, final String str, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        int i6;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        boolean z;
        Object objRememberedValue;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(672849256);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
            }
            i4 = i2 & 2;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    modifier2 = modifier;
                    i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
                }
                if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    rhModalBottomSheet52 = rhModalBottomSheet5;
                } else {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(672849256, i3, -1, "com.robinhood.shared.crypto.transfer.send.network.AbsentNetworkSheet (CryptoTransferNetworkSelectionComposable.kt:189)");
                    }
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default);
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
                    String strStringResource = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_fallback, composerStartRestartGroup, 0);
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default2 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    TextAlign.Companion companion3 = TextAlign.INSTANCE;
                    Modifier modifier5 = modifier4;
                    i5 = i3;
                    BentoText2.m20747BentoText38GnDrw(strStringResource, modifierFillMaxWidth$default2, null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall(), composerStartRestartGroup, 48, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion3.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, ((i5 >> 3) & 14) | 48, 0, 16316);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default3 = SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null);
                    if (!Contexts8.isRhcApp((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))) {
                        i6 = C37934R.string.crypto_transfer_send_network_fallback_cta_rhc;
                    } else {
                        i6 = C11048R.string.general_label_got_it;
                    }
                    String strStringResource2 = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i5 & 14) == 4) {
                        if ((i5 & 8) != 0) {
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                            if (composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                            }
                            objRememberedValue = composerStartRestartGroup.rememberedValue();
                            if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoTransferNetworkSelectionComposable.AbsentNetworkSheet$lambda$14$lambda$13$lambda$12(rhModalBottomSheet52);
                                    }
                                };
                                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            }
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierFillMaxWidth$default3, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8184);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                            modifier3 = modifier5;
                        } else {
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                        }
                        z = false;
                        objRememberedValue = composerStartRestartGroup.rememberedValue();
                        if (!z) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return CryptoTransferNetworkSelectionComposable.AbsentNetworkSheet$lambda$14$lambda$13$lambda$12(rhModalBottomSheet52);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoButtonKt.m20586BentoButtonEikTQX8((Function0) objRememberedValue, strStringResource2, modifierFillMaxWidth$default3, null, null, false, false, null, null, null, null, false, null, composerStartRestartGroup, 384, 0, 8184);
                            composer2 = composerStartRestartGroup;
                            composer2.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier5;
                        }
                    } else {
                        rhModalBottomSheet52 = rhModalBottomSheet5;
                    }
                    z = true;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                    }
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final RhModalBottomSheet5 rhModalBottomSheet53 = rhModalBottomSheet52;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.send.network.CryptoTransferNetworkSelectionComposableKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoTransferNetworkSelectionComposable.AbsentNetworkSheet$lambda$15(rhModalBottomSheet53, str, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            modifier2 = modifier;
            if ((i3 & 147) == 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                int i72 = BentoTheme.$stable;
                Modifier modifierFillMaxWidth$default4 = SizeKt.fillMaxWidth$default(androidx.compose.foundation.layout.PaddingKt.m5145paddingqDBjuR0(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM()), 0.0f, 1, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxWidth$default4);
                ComposeUiNode.Companion companion4 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion4.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion4.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion4.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion4.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion4.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String strStringResource3 = StringResources_androidKt.stringResource(C37934R.string.crypto_transfer_send_network_fallback, composerStartRestartGroup, 0);
                    Modifier.Companion companion22 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default22 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    TextAlign.Companion companion32 = TextAlign.INSTANCE;
                    Modifier modifier52 = modifier4;
                    i5 = i3;
                    BentoText2.m20747BentoText38GnDrw(strStringResource3, modifierFillMaxWidth$default22, null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleSmall(), composerStartRestartGroup, 48, 0, 8124);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21593getSmallD9Ej5fM()), composerStartRestartGroup, 0);
                    BentoText2.m20747BentoText38GnDrw(str, SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), null, null, null, null, TextAlign.m7912boximpl(companion32.m7919getCentere0LSkKk()), 0, false, 0, 0, null, 0, null, composerStartRestartGroup, ((i5 >> 3) & 14) | 48, 0, 16316);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                    Modifier modifierFillMaxWidth$default32 = SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null);
                    if (!Contexts8.isRhcApp((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()))) {
                    }
                    String strStringResource22 = StringResources_androidKt.stringResource(i6, composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if ((i5 & 14) == 4) {
                    }
                    z = true;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z) {
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        i4 = i2 & 2;
        if (i4 != 0) {
        }
        modifier2 = modifier;
        if ((i3 & 147) == 146) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AbsentNetworkSheet$lambda$14$lambda$13$lambda$12(RhModalBottomSheet5 rhModalBottomSheet5) {
        RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        return Unit.INSTANCE;
    }
}
