package com.robinhood.shared.crypto.transfer.unified.sheet;

import android.content.Context;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
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
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.composebottomsheet.RhModalBottomSheet5;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.extensions.Navigators3;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.BentoTextWithLink;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.api.transfer.ApiCryptoTransferDepositDetails;
import com.robinhood.shared.crypto.transfer.C37934R;
import com.robinhood.utils.extensions.Contexts8;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: MultiChainNetworkSelectorSheetContent.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\fH\u0001¢\u0006\u0002\u0010\r¨\u0006\u000e"}, m3636d2 = {"MultiChainNetworkSelectorSheetContent", "", "Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "currencyCode", "", "supportedNetworksForReceive", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/api/transfer/ApiCryptoTransferDepositDetails$ApiCryptoTransferDepositDetail;", "onNetworkSelected", "Lkotlin/Function1;", "", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;Ljava/lang/String;Lkotlinx/collections/immutable/ImmutableList;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-crypto-transfer_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.transfer.unified.sheet.MultiChainNetworkSelectorSheetContentKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class MultiChainNetworkSelectorSheetContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiChainNetworkSelectorSheetContent$lambda$6(RhModalBottomSheet5 rhModalBottomSheet5, String str, ImmutableList immutableList, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MultiChainNetworkSelectorSheetContent(rhModalBottomSheet5, str, immutableList, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:145:0x0422  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x042d  */
    /* JADX WARN: Removed duplicated region for block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0126  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x021d  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02a8  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02e5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void MultiChainNetworkSelectorSheetContent(final RhModalBottomSheet5 rhModalBottomSheet5, final String currencyCode, final ImmutableList<ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail> immutableList, final Function1<? super Integer, Unit> onNetworkSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        final Context context;
        int i4;
        final String strStringResource;
        final Navigator navigator;
        int i5;
        boolean zChangedInstance;
        Object objRememberedValue;
        Function1<? super Integer, Unit> function1;
        String logo_url;
        boolean z;
        final RhModalBottomSheet5 rhModalBottomSheet52;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(rhModalBottomSheet5, "<this>");
        Intrinsics.checkNotNullParameter(currencyCode, "currencyCode");
        Intrinsics.checkNotNullParameter(onNetworkSelected, "onNetworkSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1806179033);
        if ((i2 & Integer.MIN_VALUE) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhModalBottomSheet5) : composerStartRestartGroup.changedInstance(rhModalBottomSheet5) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 1) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(currencyCode) ? 32 : 16;
        }
        if ((i2 & 2) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(immutableList) ? 256 : 128;
        }
        if ((i2 & 4) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onNetworkSelected) ? 2048 : 1024;
        }
        int i6 = i2 & 8;
        if (i6 == 0) {
            if ((i & 24576) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 16384 : 8192;
            }
            if ((i3 & 9363) == 9362 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1806179033, i3, -1, "com.robinhood.shared.crypto.transfer.unified.sheet.MultiChainNetworkSelectorSheetContent (MultiChainNetworkSelectorSheetContent.kt:32)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i7 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), 5, null);
                Modifier modifier5 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
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
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (!Contexts8.isRhcApp(context)) {
                    i4 = C37934R.string.crypto_transfer_support_url_rhc;
                } else {
                    i4 = C37934R.string.crypto_transfer_support_url;
                }
                strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                String strStringResource2 = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_network_selection_title, new Object[]{currencyCode}, composerStartRestartGroup, 0);
                TextStyle displayCapsuleSmall = bentoTheme.getTypography(composerStartRestartGroup, i7).getDisplayCapsuleSmall();
                TextAlign.Companion companion2 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk = companion2.m7919getCentere0LSkKk();
                Modifier.Companion companion3 = Modifier.INSTANCE;
                int i8 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource2, PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk), 0, false, 0, 0, null, 0, displayCapsuleSmall, composerStartRestartGroup, 0, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                if (!Contexts8.isRhcApp(context)) {
                    i5 = C37934R.string.crypto_receive_network_selection_subtitle_rhc;
                } else {
                    i5 = C37934R.string.crypto_receive_network_selection_subtitle;
                }
                String strStringResource3 = StringResources_androidKt.stringResource(i5, new Object[]{currencyCode}, composerStartRestartGroup, 0);
                String strStringResource4 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                TextStyle textStyleM7655copyp1EtxEg$default = TextStyle.m7655copyp1EtxEg$default(bentoTheme.getTypography(composerStartRestartGroup, i7).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion2.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                Modifier modifierM5144paddingVpY3zN4$default = PaddingKt.m5144paddingVpY3zN4$default(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.MultiChainNetworkSelectorSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MultiChainNetworkSelectorSheetContent.MultiChainNetworkSelectorSheetContent$lambda$5$lambda$1$lambda$0(navigator, context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource3, strStringResource4, (Function0) objRememberedValue, modifierM5144paddingVpY3zN4$default, jM21425getFg0d7_KjU, 0L, textStyleM7655copyp1EtxEg$default, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                composerStartRestartGroup = composerStartRestartGroup;
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                composerStartRestartGroup.startReplaceGroup(1756948167);
                if (immutableList != null) {
                    function1 = onNetworkSelected;
                } else {
                    final int i9 = 0;
                    for (ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail : immutableList) {
                        int i10 = i9 + 1;
                        if (i9 < 0) {
                            CollectionsKt.throwIndexOverflow();
                        }
                        final ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail2 = apiCryptoTransferDepositDetail;
                        if (BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                            logo_url = apiCryptoTransferDepositDetail2.getNetwork_info().getLogo_url_light();
                        } else {
                            logo_url = apiCryptoTransferDepositDetail2.getNetwork_info().getLogo_url();
                        }
                        BentoBaseRowState.Start.Image image = new BentoBaseRowState.Start.Image(logo_url, apiCryptoTransferDepositDetail2.getNetwork_info().getName(), BentoBaseRowState.Start.Image.ImageSize.Small, null, null, null, 56, null);
                        String network_row_title = apiCryptoTransferDepositDetail2.getNetwork_row_title();
                        composerStartRestartGroup.startReplaceGroup(1756966193);
                        if (network_row_title == null) {
                            network_row_title = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_network_selection_row_title, new Object[]{apiCryptoTransferDepositDetail2.getNetwork_info().getName()}, composerStartRestartGroup, 0);
                        }
                        String str = network_row_title;
                        composerStartRestartGroup.endReplaceGroup();
                        String network_row_subtitle = apiCryptoTransferDepositDetail2.getNetwork_row_subtitle();
                        composerStartRestartGroup.startReplaceGroup(1756973675);
                        if (network_row_subtitle == null) {
                            z = false;
                            network_row_subtitle = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_network_selection_row_subtitle, new Object[]{apiCryptoTransferDepositDetail2.getCurrency_code(), apiCryptoTransferDepositDetail2.getNetwork_info().getType_name()}, composerStartRestartGroup, 0);
                        } else {
                            z = false;
                        }
                        String str2 = network_row_subtitle;
                        composerStartRestartGroup.endReplaceGroup();
                        BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) image, str, str2, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, apiCryptoTransferDepositDetail2.is_enabled_for_deposit(), false, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_PINWHEEL_TEXT_VALUE, (DefaultConstructorMarker) null);
                        boolean z2 = true;
                        boolean z3 = i9 != CollectionsKt.getLastIndex(immutableList) ? true : z;
                        composerStartRestartGroup.startReplaceGroup(-1224400529);
                        int i11 = i8;
                        boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(apiCryptoTransferDepositDetail2) | ((i11 & 7168) == 2048 ? true : z) | composerStartRestartGroup.changed(i9);
                        if ((i11 & 14) != 4) {
                            if ((i11 & 8) != 0) {
                                rhModalBottomSheet52 = rhModalBottomSheet5;
                                if (!composerStartRestartGroup.changedInstance(rhModalBottomSheet52)) {
                                }
                            } else {
                                rhModalBottomSheet52 = rhModalBottomSheet5;
                            }
                            z2 = z;
                        } else {
                            rhModalBottomSheet52 = rhModalBottomSheet5;
                        }
                        boolean z4 = zChangedInstance2 | z2;
                        Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.MultiChainNetworkSelectorSheetContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return MultiChainNetworkSelectorSheetContent.m2793xcde3981d(apiCryptoTransferDepositDetail2, onNetworkSelected, i9, rhModalBottomSheet52);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, z3, false, false, 0L, (Function0) objRememberedValue2, composerStartRestartGroup, BentoBaseRowState.$stable << 3, 57);
                        i9 = i10;
                        i8 = i11;
                    }
                    function1 = onNetworkSelected;
                    Unit unit = Unit.INSTANCE;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier5;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                function1 = onNetworkSelected;
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                final Function1<? super Integer, Unit> function12 = function1;
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.MultiChainNetworkSelectorSheetContentKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return MultiChainNetworkSelectorSheetContent.MultiChainNetworkSelectorSheetContent$lambda$6(rhModalBottomSheet5, currencyCode, immutableList, function12, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 24576;
        modifier2 = modifier;
        if ((i3 & 9363) == 9362) {
            if (i6 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i72 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(modifier4, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM(), 5, null);
            Modifier modifier52 = modifier4;
            MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getCenterHorizontally(), composerStartRestartGroup, 48);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
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
                context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                if (!Contexts8.isRhcApp(context)) {
                }
                strStringResource = StringResources_androidKt.stringResource(i4, composerStartRestartGroup, 0);
                String strStringResource22 = StringResources_androidKt.stringResource(C37934R.string.crypto_receive_network_selection_title, new Object[]{currencyCode}, composerStartRestartGroup, 0);
                TextStyle displayCapsuleSmall2 = bentoTheme2.getTypography(composerStartRestartGroup, i72).getDisplayCapsuleSmall();
                TextAlign.Companion companion22 = TextAlign.INSTANCE;
                int iM7919getCentere0LSkKk2 = companion22.m7919getCentere0LSkKk();
                Modifier.Companion companion32 = Modifier.INSTANCE;
                int i82 = i3;
                BentoText2.m20747BentoText38GnDrw(strStringResource22, PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, 2, null), null, null, null, null, TextAlign.m7912boximpl(iM7919getCentere0LSkKk2), 0, false, 0, 0, null, 0, displayCapsuleSmall2, composerStartRestartGroup, 0, 0, 8124);
                Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM()), composerStartRestartGroup, 0);
                navigator = (Navigator) composerStartRestartGroup.consume(LocalNavigator.getLocalNavigator());
                if (!Contexts8.isRhcApp(context)) {
                }
                String strStringResource32 = StringResources_androidKt.stringResource(i5, new Object[]{currencyCode}, composerStartRestartGroup, 0);
                String strStringResource42 = StringResources_androidKt.stringResource(C11048R.string.general_action_learn_more, composerStartRestartGroup, 0);
                long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i72).m21425getFg0d7_KjU();
                TextStyle textStyleM7655copyp1EtxEg$default2 = TextStyle.m7655copyp1EtxEg$default(bentoTheme2.getTypography(composerStartRestartGroup, i72).getTextM(), 0L, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, null, companion22.m7919getCentere0LSkKk(), 0, 0L, null, null, null, 0, 0, null, 16744447, null);
                Modifier modifierM5144paddingVpY3zN4$default2 = PaddingKt.m5144paddingVpY3zN4$default(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21592getMediumD9Ej5fM(), 0.0f, 2, null);
                composerStartRestartGroup.startReplaceGroup(-1746271574);
                zChangedInstance = composerStartRestartGroup.changedInstance(navigator) | composerStartRestartGroup.changedInstance(context) | composerStartRestartGroup.changed(strStringResource);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!zChangedInstance) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.shared.crypto.transfer.unified.sheet.MultiChainNetworkSelectorSheetContentKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return MultiChainNetworkSelectorSheetContent.MultiChainNetworkSelectorSheetContent$lambda$5$lambda$1$lambda$0(navigator, context, strStringResource);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    BentoTextWithLink.m20752BentoTextWithLinkXkG1Q0A(strStringResource32, strStringResource42, (Function0) objRememberedValue, modifierM5144paddingVpY3zN4$default2, jM21425getFg0d7_KjU2, 0L, textStyleM7655copyp1EtxEg$default2, 0, composerStartRestartGroup, 0, EnumC7081g.SDK_ASSET_ILLUSTRATION_SECURE_TOKENIZATION_VALUE);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion32, bentoTheme2.getSpacing(composerStartRestartGroup, i72).m21590getDefaultD9Ej5fM()), composerStartRestartGroup, 0);
                    composerStartRestartGroup.startReplaceGroup(1756948167);
                    if (immutableList != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MultiChainNetworkSelectorSheetContent$lambda$5$lambda$1$lambda$0(Navigator navigator, Context context, String str) {
        Navigators3.showHelpCenterWebViewFragment(navigator, context, str);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: MultiChainNetworkSelectorSheetContent$lambda$5$lambda$4$lambda$3$lambda$2 */
    public static final Unit m2793xcde3981d(ApiCryptoTransferDepositDetails.ApiCryptoTransferDepositDetail apiCryptoTransferDepositDetail, Function1 function1, int i, RhModalBottomSheet5 rhModalBottomSheet5) {
        if (apiCryptoTransferDepositDetail.is_enabled_for_deposit()) {
            function1.invoke(Integer.valueOf(i));
            RhModalBottomSheet5.hideBottomSheet$default(rhModalBottomSheet5, null, 1, null);
        }
        return Unit.INSTANCE;
    }
}
