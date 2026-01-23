package com.robinhood.android.investmentstracker.composables.components;

import androidx.compose.foundation.BorderKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material3.Divider5;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.TextStyle;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountContainerDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerAccountRowDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerDisconnectedDataDto;
import com.robinhood.android.investmentstracker.C19501R;
import com.robinhood.android.investmentstracker.linking.models.AccountListContainerViewModel;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.shared.serverui.utils.SduiColors2;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtonState;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import rh_server_driven_ui.p531v1.ColorDto;
import rh_server_driven_ui.p531v1.ThemedColorDto;

/* compiled from: InvestmentsTrackerAccountContainer.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0012\u0010\u0000\u001a\u00020\u00012\b\b\u0002\u0010\u0002\u001a\u00020\u0003H\u0002\u001a\r\u0010\u0004\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0006\u001aG\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\t2\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00050\u000b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00050\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\u000fH\u0007¢\u0006\u0002\u0010\u0010¨\u0006\u0011"}, m3636d2 = {"getTestAccount", "Lbff_money_movement/service/v1/InvestmentsTrackerAccountContainerDto;", "useDisconnectData", "", "InvestmentsTrackerAccountContainerPreview", "", "(Landroidx/compose/runtime/Composer;I)V", "InvestmentsTrackerAccountContainer", "account", "Lcom/robinhood/android/investmentstracker/linking/models/AccountListContainerViewModel;", "reconnectSelected", "Lkotlin/Function1;", "", "unlinkSelected", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/investmentstracker/linking/models/AccountListContainerViewModel;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainerKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerAccountContainer6 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerAccountContainer$lambda$11(AccountListContainerViewModel accountListContainerViewModel, Function1 function1, Function1 function12, Modifier modifier, int i, int i2, Composer composer, int i3) {
        InvestmentsTrackerAccountContainer(accountListContainerViewModel, function1, function12, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerAccountContainerPreview$lambda$0(int i, Composer composer, int i2) {
        InvestmentsTrackerAccountContainerPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    static /* synthetic */ InvestmentsTrackerAccountContainerDto getTestAccount$default(boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = false;
        }
        return getTestAccount(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final InvestmentsTrackerAccountContainerDto getTestAccount(boolean z) {
        InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto;
        List listListOf = CollectionsKt.listOf((Object[]) new InvestmentsTrackerAccountRowDto[]{new InvestmentsTrackerAccountRowDto("Total Value", "$10,000", null, null, 12, null), new InvestmentsTrackerAccountRowDto("Available Cash", "$2,000", null, null, 12, null)});
        if (z) {
            ColorDto colorDto = ColorDto.COLOR_FG;
            investmentsTrackerDisconnectedDataDto = new InvestmentsTrackerDisconnectedDataDto("Disconnected", new ThemedColorDto(colorDto, colorDto), "inst_12345");
        } else {
            investmentsTrackerDisconnectedDataDto = null;
        }
        return new InvestmentsTrackerAccountContainerDto(null, "Investment Account", "Investment Account Subtitle", null, listListOf, null, investmentsTrackerDisconnectedDataDto, 41, null);
    }

    private static final void InvestmentsTrackerAccountContainerPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-352207098);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-352207098, i, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainerPreview (InvestmentsTrackerAccountContainer.kt:66)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, InvestmentsTrackerAccountContainer3.INSTANCE.m15585getLambda$1540980146$feature_investments_tracker_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainerKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerAccountContainer6.InvestmentsTrackerAccountContainerPreview$lambda$0(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:100:0x0320  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0348  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0362  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x048d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x061d  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0621  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x06cb  */
    /* JADX WARN: Removed duplicated region for block: B:183:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00a2  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f9  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x024c  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0310  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void InvestmentsTrackerAccountContainer(final AccountListContainerViewModel account, final Function1<? super String, Unit> reconnectSelected, final Function1<? super InvestmentsTrackerAccountContainerDto, Unit> unlinkSelected, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        BentoTheme bentoTheme;
        int i4;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int currentCompositeKeyHash2;
        Composer composerM6388constructorimpl2;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash2;
        int currentCompositeKeyHash3;
        Composer composerM6388constructorimpl3;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash3;
        InvestmentsTrackerDisconnectedDataDto disconnected_data;
        Iterator<InvestmentsTrackerAccountRowDto> it;
        final InvestmentsTrackerDisconnectedDataDto disconnected_data2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(account, "account");
        Intrinsics.checkNotNullParameter(reconnectSelected, "reconnectSelected");
        Intrinsics.checkNotNullParameter(unlinkSelected, "unlinkSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(1092067349);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(account) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(reconnectSelected) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(unlinkSelected) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i3 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(1092067349, i3, -1, "com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainer (InvestmentsTrackerAccountContainer.kt:121)");
                }
                bentoTheme = BentoTheme.INSTANCE;
                i4 = BentoTheme.$stable;
                float f = 1;
                Modifier modifierM4876borderxT4_qwU = BorderKt.m4876borderxT4_qwU(PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), C2002Dp.m7995constructorimpl(f), bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), RoundedCornerShape2.RoundedCornerShape(2));
                Arrangement arrangement = Arrangement.INSTANCE;
                Arrangement.Vertical top = arrangement.getTop();
                Alignment.Companion companion = Alignment.INSTANCE;
                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(top, companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4876borderxT4_qwU);
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
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
                Modifier.Companion companion3 = Modifier.INSTANCE;
                Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion3, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs);
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor2);
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl2.rememberedValue(), Integer.valueOf(currentCompositeKeyHash2))) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                }
                Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier2, companion2.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier modifier5 = modifier4;
                InvestmentsTrackerLogoIconFallback.InvestmentsTrackerLogoIconFallback(row6.align(companion3, companion.getCenterVertically()), account.getDetails().getIcon(), account.getDetails().getLogo_url(), composerStartRestartGroup, 0, 0);
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row6, row6.align(companion3, companion.getCenterVertically()), 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(arrangement.getTop(), companion.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap3 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier3 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default);
                Function0<ComposeUiNode> constructor3 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                    Composables.invalidApplier();
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                    composerStartRestartGroup.useNode();
                } else {
                    composerStartRestartGroup.createNode(constructor3);
                }
                composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap3, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash3 = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl3.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl3.rememberedValue(), Integer.valueOf(currentCompositeKeyHash3))) {
                    composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                    composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                }
                Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier3, companion2.getSetModifier());
                int i6 = 0;
                BentoText2.m20747BentoText38GnDrw(account.getDetails().getName(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
                composerStartRestartGroup = composerStartRestartGroup;
                composerStartRestartGroup.startReplaceGroup(-1656509949);
                if (account.getDetails().getDisconnected_data() == null || account.getDetails().getSubtitle().length() > 0) {
                    disconnected_data = account.getDetails().getDisconnected_data();
                    if (disconnected_data != null || (subtitle = disconnected_data.getDisplay_text()) == null) {
                        String subtitle = account.getDetails().getSubtitle();
                    }
                    TextStyle textS = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
                    InvestmentsTrackerDisconnectedDataDto disconnected_data3 = account.getDetails().getDisconnected_data();
                    ThemedColorDto color = disconnected_data3 == null ? disconnected_data3.getColor() : null;
                    composerStartRestartGroup.startReplaceGroup(-1656498731);
                    Color composeColor = color != null ? null : SduiColors2.toComposeColor(color, composerStartRestartGroup, 0);
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.startReplaceGroup(-1656500008);
                    long jM21426getFg20d7_KjU = composeColor != null ? bentoTheme.getColors(composerStartRestartGroup, i4).m21426getFg20d7_KjU() : composeColor.getValue();
                    composerStartRestartGroup.endReplaceGroup();
                    BentoText2.m20747BentoText38GnDrw(subtitle, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS, composerStartRestartGroup, 0, 0, 8186);
                    composerStartRestartGroup = composerStartRestartGroup;
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                composerStartRestartGroup.startReplaceGroup(673055022);
                if (account.getDetails().getConnection_id().length() <= 0) {
                    Modifier modifierAlign = row6.align(companion3, companion.getCenterVertically());
                    MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(arrangement.getStart(), companion.getTop(), composerStartRestartGroup, 0);
                    int currentCompositeKeyHash4 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap4 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier4 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierAlign);
                    Function0<ComposeUiNode> constructor4 = companion2.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor4);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl4 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl4, measurePolicyRowMeasurePolicy2, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl4, currentCompositionLocalMap4, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash4 = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl4.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl4.rememberedValue(), Integer.valueOf(currentCompositeKeyHash4))) {
                        composerM6388constructorimpl4.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash4));
                        composerM6388constructorimpl4.apply(Integer.valueOf(currentCompositeKeyHash4), setCompositeKeyHash4);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl4, modifierMaterializeModifier4, companion2.getSetModifier());
                    BentoIcon4.Size24 size24 = new BentoIcon4.Size24(ServerToBentoAssetMapper2.DOTS_24);
                    long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU();
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = ((i3 & 896) == 256) | composerStartRestartGroup.changedInstance(account);
                    Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainerKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentsTrackerAccountContainer6.m2126x5fa6cea2(unlinkSelected, account);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Composer composer2 = composerStartRestartGroup;
                    BentoIcon2.m20644BentoIconFU0evQE(size24, "", jM21425getFg0d7_KjU, null, (Function0) objRememberedValue, false, composer2, BentoIcon4.Size24.$stable | 48, 40);
                    composerStartRestartGroup = composer2;
                    composerStartRestartGroup.endNode();
                }
                composerStartRestartGroup.endReplaceGroup();
                composerStartRestartGroup.endNode();
                float f2 = 0.0f;
                Object obj = null;
                boolean z = true;
                Divider5.m5851HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion3, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f), bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), composerStartRestartGroup, 54, 0);
                composerStartRestartGroup.startReplaceGroup(-1562836229);
                for (it = account.getDetails().getAccount_rows().iterator(); it.hasNext(); it = it) {
                    InvestmentsTrackerAccountRowDto next = it.next();
                    Modifier.Companion companion4 = Modifier.INSTANCE;
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i7 = BentoTheme.$stable;
                    Modifier modifierM5145paddingqDBjuR0 = PaddingKt.m5145paddingqDBjuR0(companion4, bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21590getDefaultD9Ej5fM(), bentoTheme2.getSpacing(composerStartRestartGroup, i7).m21593getSmallD9Ej5fM());
                    MeasurePolicy measurePolicyRowMeasurePolicy3 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, i6);
                    int currentCompositeKeyHash5 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, i6);
                    CompositionLocalMap currentCompositionLocalMap5 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier5 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5145paddingqDBjuR0);
                    ComposeUiNode.Companion companion5 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor5 = companion5.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                        composerStartRestartGroup.createNode(constructor5);
                    } else {
                        composerStartRestartGroup.useNode();
                    }
                    Composer composerM6388constructorimpl5 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl5, measurePolicyRowMeasurePolicy3, companion5.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl5, currentCompositionLocalMap5, companion5.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash5 = companion5.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl5.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl5.rememberedValue(), Integer.valueOf(currentCompositeKeyHash5))) {
                        composerM6388constructorimpl5.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash5));
                        composerM6388constructorimpl5.apply(Integer.valueOf(currentCompositeKeyHash5), setCompositeKeyHash5);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl5, modifierMaterializeModifier5, companion5.getSetModifier());
                    Row6 row62 = Row6.INSTANCE;
                    String left = next.getLeft();
                    Modifier modifierWeight$default = Row5.weight$default(row62, companion4, 1.0f, false, 2, null);
                    TextStyle textM = bentoTheme2.getTypography(composerStartRestartGroup, i7).getTextM();
                    long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i7).m21425getFg0d7_KjU();
                    FontWeight.Companion companion6 = FontWeight.INSTANCE;
                    Composer composer3 = composerStartRestartGroup;
                    BentoText2.m20747BentoText38GnDrw(left, modifierWeight$default, Color.m6701boximpl(jM21425getFg0d7_KjU2), null, companion6.getW400(), null, null, 0, false, 0, 0, null, 0, textM, composer3, 24576, 0, 8168);
                    BentoText2.m20747BentoText38GnDrw(next.getRight(), null, Color.m6701boximpl(bentoTheme2.getColors(composer3, i7).m21426getFg20d7_KjU()), null, companion6.getW400(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i7).getTextM(), composer3, 24576, 0, 8170);
                    composerStartRestartGroup = composer3;
                    composerStartRestartGroup.endNode();
                    f2 = 0.0f;
                    obj = null;
                    z = z;
                    i6 = 0;
                }
                float f3 = f2;
                Object obj2 = obj;
                boolean z2 = z;
                composerStartRestartGroup.endReplaceGroup();
                disconnected_data2 = account.getDetails().getDisconnected_data();
                composerStartRestartGroup.startReplaceGroup(-1562805728);
                if (disconnected_data2 == null) {
                    Modifier.Companion companion7 = Modifier.INSTANCE;
                    Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(companion7, f3, z2 ? 1 : 0, obj2);
                    float fM7995constructorimpl = C2002Dp.m7995constructorimpl(f);
                    BentoTheme bentoTheme3 = BentoTheme.INSTANCE;
                    int i8 = BentoTheme.$stable;
                    Divider5.m5851HorizontalDivider9IZ8Weo(modifierFillMaxWidth$default, fM7995constructorimpl, bentoTheme3.getColors(composerStartRestartGroup, i8).m21373getBg30d7_KjU(), composerStartRestartGroup, 54, 0);
                    Modifier modifierM5142padding3ABfNKs2 = PaddingKt.m5142padding3ABfNKs(SizeKt.fillMaxWidth$default(companion7, f3, z2 ? 1 : 0, obj2), bentoTheme3.getSpacing(composerStartRestartGroup, i8).m21590getDefaultD9Ej5fM());
                    BentoButtonState bentoButtonState = new BentoButtonState(StringResources_androidKt.stringResource(C19501R.string.reconnect_button, composerStartRestartGroup, 0), (BentoButtons.Icon.Size16) null, BentoButtons.Type.Secondary, account.getReconnectButtonEnabled(), account.getReconnecting(), (Color) null, (Color) null, (Color) null, (TextStyle) null, (Color) null, false, 2018, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(-1633490746);
                    boolean zChangedInstance2 = composerStartRestartGroup.changedInstance(disconnected_data2) | ((i3 & 112) == 32 ? z2 ? 1 : 0 : false);
                    Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainerKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return InvestmentsTrackerAccountContainer6.m2127xd23b617b(reconnectSelected, disconnected_data2);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoButtonKt.BentoButton(bentoButtonState, (Function0<Unit>) objRememberedValue2, modifierM5142padding3ABfNKs2, (String) null, composerStartRestartGroup, BentoButtonState.$stable, 8);
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
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerAccountContainerKt$$ExternalSyntheticLambda3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj3, Object obj4) {
                        return InvestmentsTrackerAccountContainer6.InvestmentsTrackerAccountContainer$lambda$11(account, reconnectSelected, unlinkSelected, modifier3, i, i2, (Composer) obj3, ((Integer) obj4).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        if ((i3 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            bentoTheme = BentoTheme.INSTANCE;
            i4 = BentoTheme.$stable;
            float f4 = 1;
            Modifier modifierM4876borderxT4_qwU2 = BorderKt.m4876borderxT4_qwU(PaddingKt.m5142padding3ABfNKs(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM()), C2002Dp.m7995constructorimpl(f4), bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), RoundedCornerShape2.RoundedCornerShape(2));
            Arrangement arrangement2 = Arrangement.INSTANCE;
            Arrangement.Vertical top2 = arrangement2.getTop();
            Alignment.Companion companion8 = Alignment.INSTANCE;
            MeasurePolicy measurePolicyColumnMeasurePolicy3 = Column2.columnMeasurePolicy(top2, companion8.getStart(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap6 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier6 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM4876borderxT4_qwU2);
            ComposeUiNode.Companion companion22 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor6 = companion22.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy3, companion22.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap6, companion22.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion22.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier6, companion22.getSetModifier());
                Column6 column62 = Column6.INSTANCE;
                Modifier.Companion companion32 = Modifier.INSTANCE;
                Modifier modifierM5142padding3ABfNKs3 = PaddingKt.m5142padding3ABfNKs(companion32, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM());
                MeasurePolicy measurePolicyRowMeasurePolicy4 = Row2.rowMeasurePolicy(arrangement2.getStart(), companion8.getTop(), composerStartRestartGroup, 0);
                currentCompositeKeyHash2 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap22 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier22 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5142padding3ABfNKs3);
                Function0<ComposeUiNode> constructor22 = companion22.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl2, measurePolicyRowMeasurePolicy4, companion22.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl2, currentCompositionLocalMap22, companion22.getSetResolvedCompositionLocals());
                setCompositeKeyHash2 = companion22.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl2.getInserting()) {
                    composerM6388constructorimpl2.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash2));
                    composerM6388constructorimpl2.apply(Integer.valueOf(currentCompositeKeyHash2), setCompositeKeyHash2);
                    Updater.m6390setimpl(composerM6388constructorimpl2, modifierMaterializeModifier22, companion22.getSetModifier());
                    Row6 row63 = Row6.INSTANCE;
                    Modifier modifier52 = modifier4;
                    InvestmentsTrackerLogoIconFallback.InvestmentsTrackerLogoIconFallback(row63.align(companion32, companion8.getCenterVertically()), account.getDetails().getIcon(), account.getDetails().getLogo_url(), composerStartRestartGroup, 0, 0);
                    Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(Row5.weight$default(row63, row63.align(companion32, companion8.getCenterVertically()), 1.0f, false, 2, null), bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i4).m21590getDefaultD9Ej5fM(), 0.0f, 10, null);
                    MeasurePolicy measurePolicyColumnMeasurePolicy22 = Column2.columnMeasurePolicy(arrangement2.getTop(), companion8.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash3 = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap32 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier32 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
                    Function0<ComposeUiNode> constructor32 = companion22.getConstructor();
                    if (composerStartRestartGroup.getApplier() == null) {
                    }
                    composerStartRestartGroup.startReusableNode();
                    if (composerStartRestartGroup.getInserting()) {
                    }
                    composerM6388constructorimpl3 = Updater.m6388constructorimpl(composerStartRestartGroup);
                    Updater.m6390setimpl(composerM6388constructorimpl3, measurePolicyColumnMeasurePolicy22, companion22.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl3, currentCompositionLocalMap32, companion22.getSetResolvedCompositionLocals());
                    setCompositeKeyHash3 = companion22.getSetCompositeKeyHash();
                    if (!composerM6388constructorimpl3.getInserting()) {
                        composerM6388constructorimpl3.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash3));
                        composerM6388constructorimpl3.apply(Integer.valueOf(currentCompositeKeyHash3), setCompositeKeyHash3);
                        Updater.m6390setimpl(composerM6388constructorimpl3, modifierMaterializeModifier32, companion22.getSetModifier());
                        int i62 = 0;
                        BentoText2.m20747BentoText38GnDrw(account.getDetails().getName(), null, Color.m6701boximpl(bentoTheme.getColors(composerStartRestartGroup, i4).m21425getFg0d7_KjU()), null, FontWeight.INSTANCE.getW700(), null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i4).getTextM(), composerStartRestartGroup, 24576, 0, 8170);
                        composerStartRestartGroup = composerStartRestartGroup;
                        composerStartRestartGroup.startReplaceGroup(-1656509949);
                        if (account.getDetails().getDisconnected_data() == null) {
                            disconnected_data = account.getDetails().getDisconnected_data();
                            if (disconnected_data != null) {
                                String subtitle2 = account.getDetails().getSubtitle();
                                TextStyle textS2 = bentoTheme.getTypography(composerStartRestartGroup, i4).getTextS();
                                InvestmentsTrackerDisconnectedDataDto disconnected_data32 = account.getDetails().getDisconnected_data();
                                if (disconnected_data32 == null) {
                                }
                                composerStartRestartGroup.startReplaceGroup(-1656498731);
                                if (color != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.startReplaceGroup(-1656500008);
                                if (composeColor != null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                BentoText2.m20747BentoText38GnDrw(subtitle2, null, Color.m6701boximpl(jM21426getFg20d7_KjU), null, null, null, null, 0, false, 0, 0, null, 0, textS2, composerStartRestartGroup, 0, 0, 8186);
                                composerStartRestartGroup = composerStartRestartGroup;
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                composerStartRestartGroup.startReplaceGroup(673055022);
                                if (account.getDetails().getConnection_id().length() <= 0) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                float f22 = 0.0f;
                                Object obj3 = null;
                                boolean z3 = true;
                                Divider5.m5851HorizontalDivider9IZ8Weo(SizeKt.fillMaxWidth$default(companion32, 0.0f, 1, null), C2002Dp.m7995constructorimpl(f4), bentoTheme.getColors(composerStartRestartGroup, i4).m21373getBg30d7_KjU(), composerStartRestartGroup, 54, 0);
                                composerStartRestartGroup.startReplaceGroup(-1562836229);
                                while (it.hasNext()) {
                                }
                                float f32 = f22;
                                Object obj22 = obj3;
                                boolean z22 = z3;
                                composerStartRestartGroup.endReplaceGroup();
                                disconnected_data2 = account.getDetails().getDisconnected_data();
                                composerStartRestartGroup.startReplaceGroup(-1562805728);
                                if (disconnected_data2 == null) {
                                }
                                composerStartRestartGroup.endReplaceGroup();
                                composerStartRestartGroup.endNode();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                modifier3 = modifier52;
                            }
                        }
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerAccountContainer$lambda$10$lambda$5$lambda$4$lambda$3$lambda$2 */
    public static final Unit m2126x5fa6cea2(Function1 function1, AccountListContainerViewModel accountListContainerViewModel) {
        function1.invoke(accountListContainerViewModel.getDetails());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerAccountContainer$lambda$10$lambda$9$lambda$8$lambda$7 */
    public static final Unit m2127xd23b617b(Function1 function1, InvestmentsTrackerDisconnectedDataDto investmentsTrackerDisconnectedDataDto) {
        function1.invoke(investmentsTrackerDisconnectedDataDto.getInstitution_id());
        return Unit.INSTANCE;
    }
}
