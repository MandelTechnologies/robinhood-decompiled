package com.robinhood.android.transfers.i18n.compose;

import androidx.compose.foundation.BorderStroke2;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.Row2;
import androidx.compose.foundation.layout.Row5;
import androidx.compose.foundation.layout.Row6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShape2;
import androidx.compose.material.CardKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.font.FontWeight;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.autoeventlogging.UserInteractionEventDescriptor;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.designsystem.compose.ScarletComposeInterop;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.i18n.InternationalTransfersHubViewState;
import com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposable4;
import com.robinhood.android.transfers.transferhub.C30556R;
import com.robinhood.compose.bento.component.BentoIcon2;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoBaseRowKt;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.scarlet.ScarletManager;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: TransferHubActionsComposable.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001ae\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0007¢\u0006\u0002\u0010\u0011\u001a9\u0010\u0012\u001a\u00020\u00012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u0013\u001a\r\u0010\u0014\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015\u001a5\u0010\u0016\u001a\u00020\u00012\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00010\n2\b\b\u0002\u0010\u000f\u001a\u00020\u0010H\u0003¢\u0006\u0002\u0010\u001c\u001a\r\u0010\u001d\u001a\u00020\u0001H\u0003¢\u0006\u0002\u0010\u0015¨\u0006\u001e"}, m3636d2 = {"TransferHubActionsComposable", "", "state", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;", "onTransferActionClick", "Lkotlin/Function1;", "Lcom/robinhood/models/api/bonfire/transfer/TransferDirectionV2;", "onActionRowClick", "Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState$ActionBarWithRows$ActionRow;", "onConvertClick", "Lkotlin/Function0;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "screen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/i18n/InternationalTransfersHubViewState$TransferHubActionsState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lcom/robinhood/scarlet/ScarletManager;Lcom/robinhood/rosetta/eventlogging/Screen;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TransferHubActionBar", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TransferHubActionBarPreview", "(Landroidx/compose/runtime/Composer;I)V", "TransferHubActionButton", "textResId", "", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "onClick", "(ILcom/robinhood/android/libdesignsystem/serverui/IconAsset;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "TransferHubActionButtonPreview", "feature-transfer-hub_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class TransferHubActionsComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferHubActionBar$lambda$6(Function1 function1, Function0 function0, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TransferHubActionBar(function1, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferHubActionBarPreview$lambda$7(int i, Composer composer, int i2) {
        TransferHubActionBarPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferHubActionButton$lambda$8(int i, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, Function0 function0, Modifier modifier, int i2, int i3, Composer composer, int i4) {
        TransferHubActionButton(i, serverToBentoAssetMapper2, function0, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i2 | 1), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferHubActionButtonPreview$lambda$9(int i, Composer composer, int i2) {
        TransferHubActionButtonPreview(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferHubActionsComposable$lambda$0(InternationalTransfersHubViewState.TransferHubActionsState transferHubActionsState, Function1 function1, Function1 function12, Function0 function0, ScarletManager scarletManager, Screen screen, Modifier modifier, int i, int i2, Composer composer, int i3) {
        TransferHubActionsComposable(transferHubActionsState, function1, function12, function0, scarletManager, screen, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0114  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0148  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0152  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferHubActionsComposable(final InternationalTransfersHubViewState.TransferHubActionsState state, final Function1<? super TransferDirectionV2, Unit> onTransferActionClick, final Function1<? super InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow, Unit> onActionRowClick, final Function0<Unit> onConvertClick, final ScarletManager scarletManager, final Screen screen, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onTransferActionClick, "onTransferActionClick");
        Intrinsics.checkNotNullParameter(onActionRowClick, "onActionRowClick");
        Intrinsics.checkNotNullParameter(onConvertClick, "onConvertClick");
        Intrinsics.checkNotNullParameter(scarletManager, "scarletManager");
        Intrinsics.checkNotNullParameter(screen, "screen");
        Composer composerStartRestartGroup = composer.startRestartGroup(111457462);
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
            i3 |= composerStartRestartGroup.changedInstance(onTransferActionClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onActionRowClick) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onConvertClick) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? composerStartRestartGroup.changed(scarletManager) : composerStartRestartGroup.changedInstance(scarletManager) ? 16384 : 8192;
        }
        if ((i2 & 32) != 0) {
            i3 |= 196608;
        } else if ((i & 196608) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(screen) ? 131072 : 65536;
        }
        int i4 = i2 & 64;
        if (i4 == 0) {
            if ((1572864 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 1048576 : 524288;
            }
            if ((599187 & i3) == 599186 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(111457462, i3, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposable (TransferHubActionsComposable.kt:44)");
                }
                composer2 = composerStartRestartGroup;
                final Modifier modifier5 = modifier4;
                AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-608790101, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt.TransferHubActionsComposable.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i5) {
                        if ((i5 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-608790101, i5, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposable.<anonymous> (TransferHubActionsComposable.kt:50)");
                        }
                        BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), null, ComposableLambda3.rememberComposableLambda(1376044893, true, new AnonymousClass1(state, onTransferActionClick, onConvertClick, modifier5, onActionRowClick), composer3, 54), composer3, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* compiled from: TransferHubActionsComposable.kt */
                    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                    @SourceDebugExtension
                    /* renamed from: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$TransferHubActionsComposable$1$1, reason: invalid class name */
                    static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                        final /* synthetic */ Modifier $modifier;
                        final /* synthetic */ Function1<InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow, Unit> $onActionRowClick;
                        final /* synthetic */ Function0<Unit> $onConvertClick;
                        final /* synthetic */ Function1<TransferDirectionV2, Unit> $onTransferActionClick;
                        final /* synthetic */ InternationalTransfersHubViewState.TransferHubActionsState $state;

                        /* JADX WARN: Multi-variable type inference failed */
                        AnonymousClass1(InternationalTransfersHubViewState.TransferHubActionsState transferHubActionsState, Function1<? super TransferDirectionV2, Unit> function1, Function0<Unit> function0, Modifier modifier, Function1<? super InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow, Unit> function12) {
                            this.$state = transferHubActionsState;
                            this.$onTransferActionClick = function1;
                            this.$onConvertClick = function0;
                            this.$modifier = modifier;
                            this.$onActionRowClick = function12;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i) {
                            Composer composer2 = composer;
                            if ((i & 3) == 2 && composer2.getSkipping()) {
                                composer2.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(1376044893, i, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposable.<anonymous>.<anonymous> (TransferHubActionsComposable.kt:53)");
                            }
                            InternationalTransfersHubViewState.TransferHubActionsState transferHubActionsState = this.$state;
                            if (transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.ActionBar) {
                                composer2.startReplaceGroup(-1709340699);
                                TransferHubActionsComposable4.TransferHubActionBar(this.$onTransferActionClick, this.$onConvertClick, this.$modifier, composer2, 0, 0);
                                composer2.endReplaceGroup();
                            } else if (transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows) {
                                composer2.startReplaceGroup(-1709002024);
                                Function1<TransferDirectionV2, Unit> function1 = this.$onTransferActionClick;
                                Function0<Unit> function0 = this.$onConvertClick;
                                InternationalTransfersHubViewState.TransferHubActionsState transferHubActionsState2 = this.$state;
                                final Function1<InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow, Unit> function12 = this.$onActionRowClick;
                                Modifier.Companion companion = Modifier.INSTANCE;
                                MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                                int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                                CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                                Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                                Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                                Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                                if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                                }
                                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                                Column6 column6 = Column6.INSTANCE;
                                TransferHubActionsComposable4.TransferHubActionBar(function1, function0, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer2, 0, 0);
                                composer2.startReplaceGroup(54163029);
                                for (final InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow actionRow : ((InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows) transferHubActionsState2).getRows()) {
                                    BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(actionRow.getIcon(), null, null, 6, null), StringResources_androidKt.stringResource(actionRow.getTitle(), composer2, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (DefaultConstructorMarker) null);
                                    composer2.startReplaceGroup(-1633490746);
                                    boolean zChanged = composer2.changed(function12) | composer2.changed(actionRow.ordinal());
                                    Object objRememberedValue = composer2.rememberedValue();
                                    if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                        objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$TransferHubActionsComposable$1$1$$ExternalSyntheticLambda0
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return TransferHubActionsComposable4.C302961.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(function12, actionRow);
                                            }
                                        };
                                        composer2.updateRememberedValue(objRememberedValue);
                                    }
                                    composer2.endReplaceGroup();
                                    BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.$stable << 3, 61);
                                    composer2 = composer;
                                }
                                composer2.endReplaceGroup();
                                composer2.endNode();
                                composer2.endReplaceGroup();
                            } else if (transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.Rows) {
                                composer2.startReplaceGroup(-1708070474);
                                I18nTransfersHubRowsComposable.UkTransfersHubRowsComposable(this.$onTransferActionClick, this.$modifier, composer2, 0, 0);
                                composer2.endReplaceGroup();
                            } else {
                                if (!(transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.Loading)) {
                                    composer2.startReplaceGroup(-470782916);
                                    composer2.endReplaceGroup();
                                    throw new NoWhenBranchMatchedException();
                                }
                                composer2.startReplaceGroup(-1707816925);
                                composer2.endReplaceGroup();
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow actionRow) {
                            function1.invoke(actionRow);
                            return Unit.INSTANCE;
                        }
                    }
                }, composer2, 54), composer2, 48);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TransferHubActionsComposable4.TransferHubActionsComposable$lambda$0(state, onTransferActionClick, onActionRowClick, onConvertClick, scarletManager, screen, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 1572864;
        modifier2 = modifier;
        if ((599187 & i3) == 599186) {
            if (i4 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            composer2 = composerStartRestartGroup;
            final Modifier modifier52 = modifier4;
            AutoLoggingCompositionLocals.EventLoggable(new UserInteractionEventDescriptor(null, screen, null, null, null, null, 61, null), ComposableLambda3.rememberComposableLambda(-608790101, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt.TransferHubActionsComposable.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i5) {
                    if ((i5 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-608790101, i5, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposable.<anonymous> (TransferHubActionsComposable.kt:50)");
                    }
                    BentoTheme2.BentoTheme(ScarletComposeInterop.themeChangesForCompose(scarletManager), null, ComposableLambda3.rememberComposableLambda(1376044893, true, new AnonymousClass1(state, onTransferActionClick, onConvertClick, modifier52, onActionRowClick), composer3, 54), composer3, 384, 2);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: TransferHubActionsComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$TransferHubActionsComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ Modifier $modifier;
                    final /* synthetic */ Function1<InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow, Unit> $onActionRowClick;
                    final /* synthetic */ Function0<Unit> $onConvertClick;
                    final /* synthetic */ Function1<TransferDirectionV2, Unit> $onTransferActionClick;
                    final /* synthetic */ InternationalTransfersHubViewState.TransferHubActionsState $state;

                    /* JADX WARN: Multi-variable type inference failed */
                    AnonymousClass1(InternationalTransfersHubViewState.TransferHubActionsState transferHubActionsState, Function1<? super TransferDirectionV2, Unit> function1, Function0<Unit> function0, Modifier modifier, Function1<? super InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow, Unit> function12) {
                        this.$state = transferHubActionsState;
                        this.$onTransferActionClick = function1;
                        this.$onConvertClick = function0;
                        this.$modifier = modifier;
                        this.$onActionRowClick = function12;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        Composer composer2 = composer;
                        if ((i & 3) == 2 && composer2.getSkipping()) {
                            composer2.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1376044893, i, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposable.<anonymous>.<anonymous> (TransferHubActionsComposable.kt:53)");
                        }
                        InternationalTransfersHubViewState.TransferHubActionsState transferHubActionsState = this.$state;
                        if (transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.ActionBar) {
                            composer2.startReplaceGroup(-1709340699);
                            TransferHubActionsComposable4.TransferHubActionBar(this.$onTransferActionClick, this.$onConvertClick, this.$modifier, composer2, 0, 0);
                            composer2.endReplaceGroup();
                        } else if (transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows) {
                            composer2.startReplaceGroup(-1709002024);
                            Function1<TransferDirectionV2, Unit> function1 = this.$onTransferActionClick;
                            Function0<Unit> function0 = this.$onConvertClick;
                            InternationalTransfersHubViewState.TransferHubActionsState transferHubActionsState2 = this.$state;
                            final Function1 function12 = this.$onActionRowClick;
                            Modifier.Companion companion = Modifier.INSTANCE;
                            MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer2, 0);
                            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer2, 0);
                            CompositionLocalMap currentCompositionLocalMap = composer2.getCurrentCompositionLocalMap();
                            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer2, companion);
                            ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                            Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                            }
                            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                            Column6 column6 = Column6.INSTANCE;
                            TransferHubActionsComposable4.TransferHubActionBar(function1, function0, PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, BentoTheme.INSTANCE.getSpacing(composer2, BentoTheme.$stable).m21592getMediumD9Ej5fM(), 7, null), composer2, 0, 0);
                            composer2.startReplaceGroup(54163029);
                            for (final InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow actionRow : ((InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows) transferHubActionsState2).getRows()) {
                                BentoBaseRowState bentoBaseRowState = new BentoBaseRowState((BentoBaseRowState.Start) new BentoBaseRowState.Start.Icon(actionRow.getIcon(), null, null, 6, null), StringResources_androidKt.stringResource(actionRow.getTitle(), composer2, 0), (String) null, (String) null, (BentoBaseRowState.Meta) null, (BentoBaseRowState.End) null, false, false, EnumC7081g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE, (DefaultConstructorMarker) null);
                                composer2.startReplaceGroup(-1633490746);
                                boolean zChanged = composer2.changed(function12) | composer2.changed(actionRow.ordinal());
                                Object objRememberedValue = composer2.rememberedValue();
                                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$TransferHubActionsComposable$1$1$$ExternalSyntheticLambda0
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return TransferHubActionsComposable4.C302961.AnonymousClass1.invoke$lambda$2$lambda$1$lambda$0(function12, actionRow);
                                        }
                                    };
                                    composer2.updateRememberedValue(objRememberedValue);
                                }
                                composer2.endReplaceGroup();
                                BentoBaseRowKt.m20915BentoBaseRowcd68TDI(null, bentoBaseRowState, false, false, false, 0L, (Function0) objRememberedValue, composer, BentoBaseRowState.$stable << 3, 61);
                                composer2 = composer;
                            }
                            composer2.endReplaceGroup();
                            composer2.endNode();
                            composer2.endReplaceGroup();
                        } else if (transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.Rows) {
                            composer2.startReplaceGroup(-1708070474);
                            I18nTransfersHubRowsComposable.UkTransfersHubRowsComposable(this.$onTransferActionClick, this.$modifier, composer2, 0, 0);
                            composer2.endReplaceGroup();
                        } else {
                            if (!(transferHubActionsState instanceof InternationalTransfersHubViewState.TransferHubActionsState.Loading)) {
                                composer2.startReplaceGroup(-470782916);
                                composer2.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer2.startReplaceGroup(-1707816925);
                            composer2.endReplaceGroup();
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: private */
                    public static final Unit invoke$lambda$2$lambda$1$lambda$0(Function1 function1, InternationalTransfersHubViewState.TransferHubActionsState.ActionBarWithRows.ActionRow actionRow) {
                        function1.invoke(actionRow);
                        return Unit.INSTANCE;
                    }
                }
            }, composer2, 54), composer2, 48);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x019c  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:84:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferHubActionBar(final Function1<? super TransferDirectionV2, Unit> function1, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function0<Unit> function02;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        boolean z;
        Object objRememberedValue;
        boolean z2;
        Object objRememberedValue2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(906813457);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i & 48) == 0) {
                i3 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
            }
        }
        int i4 = i2 & 4;
        if (i4 == 0) {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            if ((i3 & 147) == 146 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(906813457, i3, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionBar (TransferHubActionsComposable.kt:98)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
                MeasurePolicy measurePolicyRowMeasurePolicy = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
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
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy, companion.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                }
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
                Row6 row6 = Row6.INSTANCE;
                Modifier.Companion companion2 = Modifier.INSTANCE;
                Modifier modifierWeight$default = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                int i6 = C30556R.string.move_money_deposit;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper2 = ServerToBentoAssetMapper2.DEPOSIT_24;
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i7 = i3 & 14;
                z = i7 != 4;
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferHubActionsComposable4.TransferHubActionBar$lambda$5$lambda$2$lambda$1(function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                }
                composerStartRestartGroup.endReplaceGroup();
                TransferHubActionButton(i6, serverToBentoAssetMapper2, (Function0) objRememberedValue, modifierWeight$default, composerStartRestartGroup, 48, 0);
                float f = 12;
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
                Modifier modifierWeight$default2 = Row5.weight$default(row6, companion2, 1.0f, false, 2, null);
                int i8 = C30556R.string.move_money_withdraw;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = ServerToBentoAssetMapper2.WITHDRAW_24;
                composerStartRestartGroup.startReplaceGroup(5004770);
                z2 = i7 != 4;
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (!z2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferHubActionsComposable4.TransferHubActionBar$lambda$5$lambda$4$lambda$3(function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                }
                composerStartRestartGroup.endReplaceGroup();
                TransferHubActionButton(i8, serverToBentoAssetMapper22, (Function0) objRememberedValue2, modifierWeight$default2, composerStartRestartGroup, 48, 0);
                Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion2, C2002Dp.m7995constructorimpl(f)), composerStartRestartGroup, 6);
                TransferHubActionButton(C30556R.string.move_money_convert, ServerToBentoAssetMapper2.CONVERT_24, function02, Row5.weight$default(row6, companion2, 1.0f, false, 2, null), composerStartRestartGroup, ((i3 << 3) & 896) | 48, 0);
                composerStartRestartGroup.endNode();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                modifier3 = modifier4;
            } else {
                composerStartRestartGroup.skipToGroupEnd();
                modifier3 = modifier2;
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TransferHubActionsComposable4.TransferHubActionBar$lambda$6(function1, function0, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            int i52 = BentoTheme.$stable;
            Modifier modifierM5146paddingqDBjuR0$default2 = PaddingKt.m5146paddingqDBjuR0$default(PaddingKt.m5144paddingVpY3zN4$default(modifier4, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 2, null), 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 0.0f, 0.0f, 13, null);
            MeasurePolicy measurePolicyRowMeasurePolicy2 = Row2.rowMeasurePolicy(Arrangement.INSTANCE.getStart(), Alignment.INSTANCE.getTop(), composerStartRestartGroup, 0);
            currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierM5146paddingqDBjuR0$default2);
            ComposeUiNode.Companion companion3 = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor2 = companion3.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
            }
            composerStartRestartGroup.startReusableNode();
            if (!composerStartRestartGroup.getInserting()) {
            }
            composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyRowMeasurePolicy2, companion3.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion3.getSetResolvedCompositionLocals());
            setCompositeKeyHash = companion3.getSetCompositeKeyHash();
            if (!composerM6388constructorimpl.getInserting()) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion3.getSetModifier());
                Row6 row62 = Row6.INSTANCE;
                Modifier.Companion companion22 = Modifier.INSTANCE;
                Modifier modifierWeight$default3 = Row5.weight$default(row62, companion22, 1.0f, false, 2, null);
                int i62 = C30556R.string.move_money_deposit;
                ServerToBentoAssetMapper2 serverToBentoAssetMapper23 = ServerToBentoAssetMapper2.DEPOSIT_24;
                composerStartRestartGroup.startReplaceGroup(5004770);
                int i72 = i3 & 14;
                if (i72 != 4) {
                }
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return TransferHubActionsComposable4.TransferHubActionBar$lambda$5$lambda$2$lambda$1(function1);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    composerStartRestartGroup.endReplaceGroup();
                    TransferHubActionButton(i62, serverToBentoAssetMapper23, (Function0) objRememberedValue, modifierWeight$default3, composerStartRestartGroup, 48, 0);
                    float f2 = 12;
                    Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion22, C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6);
                    Modifier modifierWeight$default22 = Row5.weight$default(row62, companion22, 1.0f, false, 2, null);
                    int i82 = C30556R.string.move_money_withdraw;
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper222 = ServerToBentoAssetMapper2.WITHDRAW_24;
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if (i72 != 4) {
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z2) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TransferHubActionsComposable4.TransferHubActionBar$lambda$5$lambda$4$lambda$3(function1);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                        composerStartRestartGroup.endReplaceGroup();
                        TransferHubActionButton(i82, serverToBentoAssetMapper222, (Function0) objRememberedValue2, modifierWeight$default22, composerStartRestartGroup, 48, 0);
                        Spacer2.Spacer(SizeKt.m5174width3ABfNKs(companion22, C2002Dp.m7995constructorimpl(f2)), composerStartRestartGroup, 6);
                        TransferHubActionButton(C30556R.string.move_money_convert, ServerToBentoAssetMapper2.CONVERT_24, function02, Row5.weight$default(row62, companion22, 1.0f, false, 2, null), composerStartRestartGroup, ((i3 << 3) & 896) | 48, 0);
                        composerStartRestartGroup.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                        }
                        modifier3 = modifier4;
                    }
                }
            }
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferHubActionBar$lambda$5$lambda$2$lambda$1(Function1 function1) {
        function1.invoke(TransferDirectionV2.DEPOSIT);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TransferHubActionBar$lambda$5$lambda$4$lambda$3(Function1 function1) {
        function1.invoke(TransferDirectionV2.WITHDRAW);
        return Unit.INSTANCE;
    }

    private static final void TransferHubActionBarPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1919391381);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1919391381, i, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionBarPreview (TransferHubActionsComposable.kt:133)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TransferHubActionsComposable.INSTANCE.m19627getLambda$2080549811$feature_transfer_hub_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferHubActionsComposable4.TransferHubActionBarPreview$lambda$7(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TransferHubActionButton(final int i, final ServerToBentoAssetMapper2 serverToBentoAssetMapper2, final Function0<Unit> function0, Modifier modifier, Composer composer, final int i2, final int i3) {
        int i4;
        Function0<Unit> function02;
        Modifier modifier2;
        Composer composer2;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-2001365675);
        if ((i3 & 1) != 0) {
            i4 = i2 | 6;
        } else if ((i2 & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(i) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i3 & 2) != 0) {
            i4 |= 48;
        } else if ((i2 & 48) == 0) {
            i4 |= composerStartRestartGroup.changed(serverToBentoAssetMapper2.ordinal()) ? 32 : 16;
        }
        if ((i3 & 4) != 0) {
            i4 |= 384;
            function02 = function0;
        } else {
            function02 = function0;
            if ((i2 & 384) == 0) {
                i4 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
            }
        }
        int i5 = i3 & 8;
        if (i5 == 0) {
            if ((i2 & 3072) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            if ((i4 & 1171) != 1170 && composerStartRestartGroup.getSkipping()) {
                composerStartRestartGroup.skipToGroupEnd();
                composer2 = composerStartRestartGroup;
            } else {
                if (i5 != 0) {
                    modifier2 = Modifier.INSTANCE;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-2001365675, i4, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionButton (TransferHubActionsComposable.kt:150)");
                }
                RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_4 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
                float fM7995constructorimpl = C2002Dp.m7995constructorimpl(1);
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i6 = BentoTheme.$stable;
                int i7 = i4 >> 6;
                composer2 = composerStartRestartGroup;
                CardKt.m5549CardLPr_se0(function02, modifier2, false, roundedCornerShapeM5327RoundedCornerShape0680j_4, bentoTheme.getColors(composerStartRestartGroup, i6).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl, bentoTheme.getColors(composerStartRestartGroup, i6).m21425getFg0d7_KjU()), C2002Dp.m7995constructorimpl(0), null, ComposableLambda3.rememberComposableLambda(405983419, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt.TransferHubActionButton.1
                    public final void invoke(Composer composer3, int i8) {
                        if ((i8 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(405983419, i8, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionButton.<anonymous> (TransferHubActionsComposable.kt:162)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(12));
                        ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                        int i9 = i;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i10 = BentoTheme.$stable;
                        BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper22), null, bentoTheme2.getColors(composer3, i10).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 7, null), null, false, composer3, BentoIcon4.Size24.$stable | 48, 48);
                        BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i9, composer3, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer3, i10).getTextM(), composer3, 24576, 0, 8174);
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }
                }, composerStartRestartGroup, 54), composer2, (i7 & 14) | 817889280 | (i7 & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
            final Modifier modifier3 = modifier2;
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda6
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return TransferHubActionsComposable4.TransferHubActionButton$lambda$8(i, serverToBentoAssetMapper2, function0, modifier3, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i4 |= 3072;
        modifier2 = modifier;
        if ((i4 & 1171) != 1170) {
            if (i5 != 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            RoundedCornerShape roundedCornerShapeM5327RoundedCornerShape0680j_42 = RoundedCornerShape2.m5327RoundedCornerShape0680j_4(C2002Dp.m7995constructorimpl(8));
            float fM7995constructorimpl2 = C2002Dp.m7995constructorimpl(1);
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i62 = BentoTheme.$stable;
            int i72 = i4 >> 6;
            composer2 = composerStartRestartGroup;
            CardKt.m5549CardLPr_se0(function02, modifier2, false, roundedCornerShapeM5327RoundedCornerShape0680j_42, bentoTheme2.getColors(composerStartRestartGroup, i62).m21371getBg0d7_KjU(), 0L, BorderStroke2.m4886BorderStrokecXLIe8U(fM7995constructorimpl2, bentoTheme2.getColors(composerStartRestartGroup, i62).m21425getFg0d7_KjU()), C2002Dp.m7995constructorimpl(0), null, ComposableLambda3.rememberComposableLambda(405983419, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt.TransferHubActionButton.1
                public final void invoke(Composer composer3, int i8) {
                    if ((i8 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(405983419, i8, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionButton.<anonymous> (TransferHubActionsComposable.kt:162)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierM5142padding3ABfNKs = PaddingKt.m5142padding3ABfNKs(companion, C2002Dp.m7995constructorimpl(12));
                    ServerToBentoAssetMapper2 serverToBentoAssetMapper22 = serverToBentoAssetMapper2;
                    int i9 = i;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer3, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer3, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer3.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer3, modifierM5142padding3ABfNKs);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
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
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i10 = BentoTheme.$stable;
                    BentoIcon2.m20644BentoIconFU0evQE(new BentoIcon4.Size24(serverToBentoAssetMapper22), null, bentoTheme22.getColors(composer3, i10).m21425getFg0d7_KjU(), PaddingKt.m5146paddingqDBjuR0$default(companion, 0.0f, 0.0f, 0.0f, bentoTheme22.getSpacing(composer3, i10).m21590getDefaultD9Ej5fM(), 7, null), null, false, composer3, BentoIcon4.Size24.$stable | 48, 48);
                    BentoText2.m20747BentoText38GnDrw(StringResources_androidKt.stringResource(i9, composer3, 0), null, null, null, FontWeight.INSTANCE.getBold(), null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer3, i10).getTextM(), composer3, 24576, 0, 8174);
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }
            }, composerStartRestartGroup, 54), composer2, (i72 & 14) | 817889280 | (i72 & 112), EnumC7081g.SDK_ASSET_ILLUSTRATION_ERROR_BRUSHSTROKE_VALUE);
            if (ComposerKt.isTraceInProgress()) {
            }
        }
        final Modifier modifier32 = modifier2;
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final void TransferHubActionButtonPreview(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(56175282);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(56175282, i, -1, "com.robinhood.android.transfers.i18n.compose.TransferHubActionButtonPreview (TransferHubActionsComposable.kt:184)");
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, TransferHubActionsComposable.INSTANCE.getLambda$1675751930$feature_transfer_hub_externalDebug(), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.i18n.compose.TransferHubActionsComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return TransferHubActionsComposable4.TransferHubActionButtonPreview$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
