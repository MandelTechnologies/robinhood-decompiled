package com.robinhood.android.transfers.history;

import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.material.ScaffoldKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.graphics.Color;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.compose.FlowExtKt;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.android.transfers.history.PaymentIntentHistoryDetailViewState;
import com.robinhood.compose.bento.component.BentoAppBarKt;
import com.robinhood.compose.bento.component.BentoAppBarScope;
import com.robinhood.compose.bento.component.BentoIcon4;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PaymentIntentHistoryDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\u001a;\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0007¢\u0006\u0002\u0010\t\u001a;\u0010\n\u001a\u00020\u00012\u0006\u0010\u000b\u001a\u00020\f2\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0003¢\u0006\u0002\u0010\r¨\u0006\u000e²\u0006\n\u0010\u000f\u001a\u00020\u0010X\u008a\u0084\u0002"}, m3636d2 = {"PaymentIntentHistoryDetailComposable", "", "duxo", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDuxo;", "onBackClick", "Lkotlin/Function0;", "onExchangeRateInfoClick", "modifier", "Landroidx/compose/ui/Modifier;", "(Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailDuxo;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "MainScreen", "state", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$Content;", "(Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState$Content;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-transfers_externalRelease", "viewState", "Lcom/robinhood/android/transfers/history/PaymentIntentHistoryDetailViewState;"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class PaymentIntentHistoryDetailComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit MainScreen$lambda$2(PaymentIntentHistoryDetailViewState.Content content, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        MainScreen(content, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PaymentIntentHistoryDetailComposable$lambda$1(PaymentIntentHistoryDetailDuxo paymentIntentHistoryDetailDuxo, Function0 function0, Function0 function02, Modifier modifier, int i, int i2, Composer composer, int i3) {
        PaymentIntentHistoryDetailComposable(paymentIntentHistoryDetailDuxo, function0, function02, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:51:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:73:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void PaymentIntentHistoryDetailComposable(final PaymentIntentHistoryDetailDuxo duxo, final Function0<Unit> onBackClick, final Function0<Unit> onExchangeRateInfoClick, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        PaymentIntentHistoryDetailViewState paymentIntentHistoryDetailViewStatePaymentIntentHistoryDetailComposable$lambda$0;
        Modifier modifier3;
        final Modifier modifier4;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(duxo, "duxo");
        Intrinsics.checkNotNullParameter(onBackClick, "onBackClick");
        Intrinsics.checkNotNullParameter(onExchangeRateInfoClick, "onExchangeRateInfoClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(436918212);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(duxo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onBackClick) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExchangeRateInfoClick) ? 256 : 128;
        }
        int i5 = i2 & 8;
        if (i5 == 0) {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i3;
            if ((i4 & 1171) == 1170 || !composerStartRestartGroup.getSkipping()) {
                Modifier modifier5 = i5 == 0 ? Modifier.INSTANCE : modifier2;
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(436918212, i4, -1, "com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposable (PaymentIntentHistoryDetailComposable.kt:32)");
                }
                paymentIntentHistoryDetailViewStatePaymentIntentHistoryDetailComposable$lambda$0 = PaymentIntentHistoryDetailComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
                if (!(paymentIntentHistoryDetailViewStatePaymentIntentHistoryDetailComposable$lambda$0 instanceof PaymentIntentHistoryDetailViewState.Loading)) {
                    modifier3 = modifier5;
                } else {
                    if (!(paymentIntentHistoryDetailViewStatePaymentIntentHistoryDetailComposable$lambda$0 instanceof PaymentIntentHistoryDetailViewState.Content)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    modifier3 = modifier5;
                    MainScreen((PaymentIntentHistoryDetailViewState.Content) paymentIntentHistoryDetailViewStatePaymentIntentHistoryDetailComposable$lambda$0, onBackClick, onExchangeRateInfoClick, modifier3, composerStartRestartGroup, i4 & 8176, 0);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentIntentHistoryDetailComposable3.PaymentIntentHistoryDetailComposable$lambda$1(duxo, onBackClick, onExchangeRateInfoClick, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                    }
                });
                return;
            }
            return;
        }
        i3 |= 3072;
        modifier2 = modifier;
        i4 = i3;
        if ((i4 & 1171) == 1170) {
            if (i5 == 0) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            paymentIntentHistoryDetailViewStatePaymentIntentHistoryDetailComposable$lambda$0 = PaymentIntentHistoryDetailComposable$lambda$0(FlowExtKt.collectAsStateWithLifecycle(duxo.getStateFlow(), (LifecycleOwner) null, (Lifecycle.State) null, (CoroutineContext) null, composerStartRestartGroup, 0, 7));
            if (!(paymentIntentHistoryDetailViewStatePaymentIntentHistoryDetailComposable$lambda$0 instanceof PaymentIntentHistoryDetailViewState.Loading)) {
            }
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier4 = modifier3;
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00f0  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:64:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private static final void MainScreen(final PaymentIntentHistoryDetailViewState.Content content, final Function0<Unit> function0, final Function0<Unit> function02, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        Composer composer2;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1934666539);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(content) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function0) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(function02) ? 256 : 128;
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
                    ComposerKt.traceEventStart(-1934666539, i3, -1, "com.robinhood.android.transfers.history.MainScreen (PaymentIntentHistoryDetailComposable.kt:52)");
                }
                BentoTheme bentoTheme = BentoTheme.INSTANCE;
                int i5 = BentoTheme.$stable;
                long jM21371getBg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21371getBg0d7_KjU();
                long jM21425getFg0d7_KjU = bentoTheme.getColors(composerStartRestartGroup, i5).m21425getFg0d7_KjU();
                int i6 = ((i3 >> 9) & 14) | 384;
                Modifier modifier5 = modifier4;
                composer2 = composerStartRestartGroup;
                ScaffoldKt.m5625Scaffold27mzLpw(modifier5, null, ComposableLambda3.rememberComposableLambda(-1600762470, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt.MainScreen.1
                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                        invoke(composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer3, int i7) {
                        if ((i7 & 3) == 2 && composer3.getSkipping()) {
                            composer3.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-1600762470, i7, -1, "com.robinhood.android.transfers.history.MainScreen.<anonymous> (PaymentIntentHistoryDetailComposable.kt:58)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Function2<Composer, Integer, Unit> lambda$1031691527$feature_transfers_externalRelease = PaymentIntentHistoryDetailComposable.INSTANCE.getLambda$1031691527$feature_transfers_externalRelease();
                        final Function0<Unit> function03 = function0;
                        BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1031691527$feature_transfers_externalRelease, companion, ComposableLambda3.rememberComposableLambda(-2035750309, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt.MainScreen.1.1
                            @Override // kotlin.jvm.functions.Function3
                            public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                                invoke(bentoAppBarScope, composer4, num.intValue());
                                return Unit.INSTANCE;
                            }

                            public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                                Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                                if ((i8 & 6) == 0) {
                                    i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                                }
                                if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                    composer4.skipToGroupEnd();
                                    return;
                                }
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventStart(-2035750309, i8, -1, "com.robinhood.android.transfers.history.MainScreen.<anonymous>.<anonymous> (PaymentIntentHistoryDetailComposable.kt:62)");
                                }
                                BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                            }
                        }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU, jM21425getFg0d7_KjU, ComposableLambda3.rememberComposableLambda(-362173037, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt.MainScreen.2
                    @Override // kotlin.jvm.functions.Function3
                    public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                        invoke(paddingValues, composer3, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                        Composer composer4 = composer3;
                        Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                        int i8 = (i7 & 6) == 0 ? i7 | (composer4.changed(paddingValues) ? 4 : 2) : i7;
                        if ((i8 & 19) == 18 && composer4.getSkipping()) {
                            composer4.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-362173037, i8, -1, "com.robinhood.android.transfers.history.MainScreen.<anonymous> (PaymentIntentHistoryDetailComposable.kt:69)");
                        }
                        Modifier.Companion companion = Modifier.INSTANCE;
                        Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                        PaymentIntentHistoryDetailViewState.Content content2 = content;
                        Function0<Unit> function03 = function02;
                        MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                        int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                        CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                        Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                        ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                        Function0<ComposeUiNode> constructor = companion2.getConstructor();
                        if (composer4.getApplier() == null) {
                            Composables.invalidApplier();
                        }
                        composer4.startReusableNode();
                        if (composer4.getInserting()) {
                            composer4.createNode(constructor);
                        } else {
                            composer4.useNode();
                        }
                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                        Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                        Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                        if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                            composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                            composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                        }
                        Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                        Column6 column6 = Column6.INSTANCE;
                        float f = 24;
                        Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                        String title = content2.getTitle();
                        BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                        int i9 = BentoTheme.$stable;
                        BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i9).getDisplayCapsuleLarge(), composer4, 48, 0, 8188);
                        BentoText2.m20747BentoText38GnDrw(content2.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composer4, i9).getTextM(), composer4, 48, 0, 8188);
                        Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(32)), composer4, 6);
                        composer4.startReplaceGroup(-1947000370);
                        for (PaymentIntentHistoryDetailViewState.DataRow dataRow : content2.getRows()) {
                            BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(dataRow.getLabel(), null, 2, null), null, dataRow.getShowExchangeRateInfo() ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16) : null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21426getFg20d7_KjU()), new AnnotatedString(dataRow.getValue(), null, 2, null), null, null, null, null, false, false, 4037, null), null, function03, composer4, BentoDataRowState.$stable, 2);
                            composer4 = composer3;
                        }
                        composer3.endReplaceGroup();
                        composer3.endNode();
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }, composerStartRestartGroup, 54), composer2, i6, 12582912, 32762);
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
                scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PaymentIntentHistoryDetailComposable3.MainScreen$lambda$2(content, function0, function02, modifier3, i, i2, (Composer) obj, ((Integer) obj2).intValue());
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
            BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
            int i52 = BentoTheme.$stable;
            long jM21371getBg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21371getBg0d7_KjU();
            long jM21425getFg0d7_KjU2 = bentoTheme2.getColors(composerStartRestartGroup, i52).m21425getFg0d7_KjU();
            int i62 = ((i3 >> 9) & 14) | 384;
            Modifier modifier52 = modifier4;
            composer2 = composerStartRestartGroup;
            ScaffoldKt.m5625Scaffold27mzLpw(modifier52, null, ComposableLambda3.rememberComposableLambda(-1600762470, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt.MainScreen.1
                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                    invoke(composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer3, int i7) {
                    if ((i7 & 3) == 2 && composer3.getSkipping()) {
                        composer3.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1600762470, i7, -1, "com.robinhood.android.transfers.history.MainScreen.<anonymous> (PaymentIntentHistoryDetailComposable.kt:58)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Function2<Composer, Integer, Unit> lambda$1031691527$feature_transfers_externalRelease = PaymentIntentHistoryDetailComposable.INSTANCE.getLambda$1031691527$feature_transfers_externalRelease();
                    final Function0<Unit> function03 = function0;
                    BentoAppBarKt.m20573BentoAppBarSGdaT3c(lambda$1031691527$feature_transfers_externalRelease, companion, ComposableLambda3.rememberComposableLambda(-2035750309, true, new Function3<BentoAppBarScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt.MainScreen.1.1
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(BentoAppBarScope bentoAppBarScope, Composer composer4, Integer num) {
                            invoke(bentoAppBarScope, composer4, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(BentoAppBarScope BentoAppBar, Composer composer4, int i8) {
                            Intrinsics.checkNotNullParameter(BentoAppBar, "$this$BentoAppBar");
                            if ((i8 & 6) == 0) {
                                i8 |= (i8 & 8) == 0 ? composer4.changed(BentoAppBar) : composer4.changedInstance(BentoAppBar) ? 4 : 2;
                            }
                            if ((i8 & 19) == 18 && composer4.getSkipping()) {
                                composer4.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-2035750309, i8, -1, "com.robinhood.android.transfers.history.MainScreen.<anonymous>.<anonymous> (PaymentIntentHistoryDetailComposable.kt:62)");
                            }
                            BentoAppBar.m20575BentoBackButtondrOMvmE(null, false, null, function03, composer4, (BentoAppBarScope.$stable << 12) | ((i8 << 12) & 57344), 7);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer3, 54), null, null, false, false, null, null, 0L, null, composer3, 438, 0, 2040);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), null, null, null, 0, false, null, false, null, 0.0f, 0L, 0L, 0L, jM21371getBg0d7_KjU2, jM21425getFg0d7_KjU2, ComposableLambda3.rememberComposableLambda(-362173037, true, new Function3<PaddingValues, Composer, Integer, Unit>() { // from class: com.robinhood.android.transfers.history.PaymentIntentHistoryDetailComposableKt.MainScreen.2
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer3, Integer num) {
                    invoke(paddingValues, composer3, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(PaddingValues paddingValues, Composer composer3, int i7) {
                    Composer composer4 = composer3;
                    Intrinsics.checkNotNullParameter(paddingValues, "paddingValues");
                    int i8 = (i7 & 6) == 0 ? i7 | (composer4.changed(paddingValues) ? 4 : 2) : i7;
                    if ((i8 & 19) == 18 && composer4.getSkipping()) {
                        composer4.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-362173037, i8, -1, "com.robinhood.android.transfers.history.MainScreen.<anonymous> (PaymentIntentHistoryDetailComposable.kt:69)");
                    }
                    Modifier.Companion companion = Modifier.INSTANCE;
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(SizeKt.fillMaxSize$default(PaddingKt.padding(companion, paddingValues), 0.0f, 1, null), ScrollKt.rememberScrollState(0, composer4, 0, 1), false, null, false, 14, null);
                    PaymentIntentHistoryDetailViewState.Content content2 = content;
                    Function0<Unit> function03 = function02;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composer4, 0);
                    int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composer4, 0);
                    CompositionLocalMap currentCompositionLocalMap = composer4.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composer4, modifierVerticalScroll$default);
                    ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                    Function0<ComposeUiNode> constructor = companion2.getConstructor();
                    if (composer4.getApplier() == null) {
                        Composables.invalidApplier();
                    }
                    composer4.startReusableNode();
                    if (composer4.getInserting()) {
                        composer4.createNode(constructor);
                    } else {
                        composer4.useNode();
                    }
                    Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer4);
                    Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy, companion2.getSetMeasurePolicy());
                    Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion2.getSetResolvedCompositionLocals());
                    Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                    if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                        composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                        composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    }
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion2.getSetModifier());
                    Column6 column6 = Column6.INSTANCE;
                    float f = 24;
                    Modifier modifierM5146paddingqDBjuR0$default = PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null);
                    String title = content2.getTitle();
                    BentoTheme bentoTheme22 = BentoTheme.INSTANCE;
                    int i9 = BentoTheme.$stable;
                    BentoText2.m20747BentoText38GnDrw(title, modifierM5146paddingqDBjuR0$default, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer4, i9).getDisplayCapsuleLarge(), composer4, 48, 0, 8188);
                    BentoText2.m20747BentoText38GnDrw(content2.getSubtitle(), PaddingKt.m5146paddingqDBjuR0$default(companion, C2002Dp.m7995constructorimpl(f), 0.0f, 0.0f, 0.0f, 14, null), null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme22.getTypography(composer4, i9).getTextM(), composer4, 48, 0, 8188);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion, C2002Dp.m7995constructorimpl(32)), composer4, 6);
                    composer4.startReplaceGroup(-1947000370);
                    for (PaymentIntentHistoryDetailViewState.DataRow dataRow : content2.getRows()) {
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(dataRow.getLabel(), null, 2, null), null, dataRow.getShowExchangeRateInfo() ? new BentoIcon4.Size16(ServerToBentoAssetMapper2.INFO_16) : null, Color.m6701boximpl(BentoTheme.INSTANCE.getColors(composer4, BentoTheme.$stable).m21426getFg20d7_KjU()), new AnnotatedString(dataRow.getValue(), null, 2, null), null, null, null, null, false, false, 4037, null), null, function03, composer4, BentoDataRowState.$stable, 2);
                        composer4 = composer3;
                    }
                    composer3.endReplaceGroup();
                    composer3.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composer2, i62, 12582912, 32762);
            if (ComposerKt.isTraceInProgress()) {
            }
            modifier3 = modifier52;
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    private static final PaymentIntentHistoryDetailViewState PaymentIntentHistoryDetailComposable$lambda$0(SnapshotState4<? extends PaymentIntentHistoryDetailViewState> snapshotState4) {
        return snapshotState4.getValue();
    }
}
