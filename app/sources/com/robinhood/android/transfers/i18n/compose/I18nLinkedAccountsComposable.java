package com.robinhood.android.transfers.i18n.compose;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
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
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.BentoThemeOverlays;
import com.robinhood.compose.bento.util.ModifiersKt;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.scarlet.ScarletManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: I18nLinkedAccountsComposable.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a'\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007H\u0001¢\u0006\u0002\u0010\b¨\u0006\t"}, m3636d2 = {"LinkedAccountsComposable", "", "state", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$LinkedAccountsState;Lcom/robinhood/scarlet/ScarletManager;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.i18n.compose.I18nLinkedAccountsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class I18nLinkedAccountsComposable {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit LinkedAccountsComposable$lambda$0(InternationalTransfersHubViewState.LinkedAccountsState linkedAccountsState, ScarletManager scarletManager, Modifier modifier, int i, int i2, Composer composer, int i3) {
        LinkedAccountsComposable(linkedAccountsState, scarletManager, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void LinkedAccountsComposable(final InternationalTransfersHubViewState.LinkedAccountsState state, final ScarletManager scarletManager, final Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Composer composerStartRestartGroup = composer.startRestartGroup(1055399780);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(state) : composerStartRestartGroup.changedInstance(state) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= (i & 64) == 0 ? composerStartRestartGroup.changed(scarletManager) : composerStartRestartGroup.changedInstance(scarletManager) ? 32 : 16;
        }
        int i4 = i2 & 4;
        if (i4 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            if (i4 != 0) {
                modifier = Modifier.INSTANCE;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1055399780, i3, -1, "com.robinhood.android.transfers.i18n.compose.LinkedAccountsComposable (I18nLinkedAccountsComposable.kt:26)");
            }
            BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), null, ComposableLambda3.rememberComposableLambda(1880226838, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.compose.I18nLinkedAccountsComposableKt.LinkedAccountsComposable.1
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
                        ComposerKt.traceEventStart(1880226838, i5, -1, "com.robinhood.android.transfers.i18n.compose.LinkedAccountsComposable.<anonymous> (I18nLinkedAccountsComposable.kt:28)");
                    }
                    final Modifier modifier2 = modifier;
                    final InternationalTransfersHubViewState.LinkedAccountsState linkedAccountsState = state;
                    BentoThemeOverlays.AchromaticThemeOverlay(ComposableLambda3.rememberComposableLambda(-1179413599, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.compose.I18nLinkedAccountsComposableKt.LinkedAccountsComposable.1.1
                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                            invoke(composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer3, int i6) {
                            if ((i6 & 3) == 2 && composer3.getSkipping()) {
                                composer3.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1179413599, i6, -1, "com.robinhood.android.transfers.i18n.compose.LinkedAccountsComposable.<anonymous>.<anonymous> (I18nLinkedAccountsComposable.kt:29)");
                            }
                            Modifier modifier3 = modifier2;
                            InternationalTransfersHubViewState.LinkedAccountsState linkedAccountsState2 = linkedAccountsState;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifier3);
                            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion.getConstructor();
                            if (composer3.getApplier() == null) {
                                Composables.invalidApplier();
                            }
                            composer3.startReusableNode();
                            if (composer3.getInserting()) {
                                composer3.createNode(constructor);
                            } else {
                                composer3.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer3);
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            Modifier.Companion companion2 = Modifier.INSTANCE;
                            BentoTheme bentoTheme = BentoTheme.INSTANCE;
                            int i7 = BentoTheme.$stable;
                            BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30556R.string.move_money_ach_relationships_section_label, composer3, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(companion2, bentoTheme.getSpacing(composer3, i7).m21594getXlargeD9Ej5fM(), bentoTheme.getSpacing(composer3, i7).m21593getSmallD9Ej5fM(), composer3, 6, 0), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getDisplayCapsuleMedium(), composer3, 0, 0, 8188);
                            if (linkedAccountsState2 instanceof InternationalTransfersHubViewState.LinkedAccountsState.Loaded) {
                                composer3.startReplaceGroup(1694416442);
                                for (InternationalTransfersHubViewState.AccountRow accountRow : ((InternationalTransfersHubViewState.LinkedAccountsState.Loaded) linkedAccountsState2).getAccountRows()) {
                                    String primaryText = accountRow.getPrimaryText();
                                    String secondaryText = accountRow.getSecondaryText();
                                    Integer metadata = accountRow.getMetadata();
                                    ServerToBentoAssetMapper2 icon = accountRow.getIcon();
                                    BentoBaseRowState.Start.Icon icon2 = icon != null ? new BentoBaseRowState.Start.Icon(icon, null, null, 6, null) : null;
                                    composer3.startReplaceGroup(1301599412);
                                    BentoBaseRowState.Meta.SingleLine singleLine = metadata == null ? null : new BentoBaseRowState.Meta.SingleLine(StringResources_androidKt.stringResource(metadata.intValue(), composer3, 0));
                                    composer3.endReplaceGroup();
                                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, new BentoBaseRowState((BentoBaseRowState.Start) icon2, primaryText, secondaryText, (String) null, (BentoBaseRowState.Meta) singleLine, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE, (DefaultConstructorMarker) null), false, false, false, 0L, null, composer3, BentoBaseRowState.$stable << 3, 125);
                                }
                                composer3.endReplaceGroup();
                            } else if (linkedAccountsState2 instanceof InternationalTransfersHubViewState.LinkedAccountsState.Loading) {
                                composer3.startReplaceGroup(1695148135);
                                BoxKt.Box(ModifiersKt.bentoPlaceholder$default(PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(SizeKt.m5156height3ABfNKs(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composer3, i7).m21591getLargeD9Ej5fM()), 0.0f, composer3, 0, 1), true, null, 2, null), composer3, 0);
                                composer3.endReplaceGroup();
                            } else if (linkedAccountsState2 instanceof InternationalTransfersHubViewState.LinkedAccountsState.Empty) {
                                composer3.startReplaceGroup(1695587529);
                                BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(C30556R.string.linked_accounts_empty_state_message, composer3, 0), PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composer3, 6, 1), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composer3, i7).getTextM(), composer3, 0, 0, 8188);
                                composer3.endReplaceGroup();
                            } else {
                                if (!(linkedAccountsState2 instanceof InternationalTransfersHubViewState.LinkedAccountsState.Hidden)) {
                                    composer3.startReplaceGroup(1301582413);
                                    composer3.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer3.startReplaceGroup(1695987088);
                                composer3.endReplaceGroup();
                            }
                            composer3.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer2, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 384, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.I18nLinkedAccountsComposableKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return I18nLinkedAccountsComposable.LinkedAccountsComposable$lambda$0(state, scarletManager, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
