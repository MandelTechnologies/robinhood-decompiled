package com.robinhood.android.cash.transaction.p079ui.rhytransaction;

import android.content.Context;
import androidx.compose.animation.Crossfade;
import androidx.compose.animation.core.FiniteAnimationSpec;
import androidx.compose.foundation.ScrollKt;
import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.Spacer2;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.p011ui.res.StringResources_androidKt;
import androidx.compose.p011ui.text.AnnotatedString;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.cash.transaction.C10421R;
import com.robinhood.android.cash.transaction.p079ui.rhytransaction.RhyTransactionDetailViewState;
import com.robinhood.compose.bento.component.BentoButtonKt;
import com.robinhood.compose.bento.component.BentoButtons;
import com.robinhood.compose.bento.component.BentoText2;
import com.robinhood.compose.bento.component.rows.BentoDataRowKt;
import com.robinhood.compose.bento.component.rows.BentoDataRowState;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.compose.bento.theme.BentoTheme2;
import com.robinhood.compose.bento.theme.LocalShowPlaceholder;
import com.robinhood.compose.bento.util.PaddingKt;
import com.robinhood.compose.util.StringResource2;
import com.robinhood.utils.datetime.format.TemporalFormatter;
import com.robinhood.utils.resource.StringResource;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KFunction;

/* compiled from: RhyTransactionDetailComposable.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a-\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0007¢\u0006\u0002\u0010\n\u001a-\u0010\u000b\u001a\u00020\u00032\u0006\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u0006\u001a\u00020\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00030\tH\u0003¢\u0006\u0002\u0010\u000e\u001a\u0017\u0010\u000f\u001a\u00020\u00032\b\b\u0001\u0010\f\u001a\u00020\u0005H\u0003¢\u0006\u0002\u0010\u0010\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"RhyTransactionDetailLoading", "", "RhyTransactionDetailComposable", "", "viewState", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;", "modifier", "Landroidx/compose/ui/Modifier;", "onClickViewOriginalTransaction", "Lkotlin/Function0;", "(Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RhyTransactionDetail", "state", "Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;", "(Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState$Loaded;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function0;Landroidx/compose/runtime/Composer;II)V", "RhyTransactionDetailPreview", "(Lcom/robinhood/android/cash/transaction/ui/rhytransaction/RhyTransactionDetailViewState;Landroidx/compose/runtime/Composer;I)V", "feature-cash-transaction_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class RhyTransactionDetailComposable {
    public static final String RhyTransactionDetailLoading = "rhy_transaction_detail_loading";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyTransactionDetail$lambda$6(RhyTransactionDetailViewState.Loaded loaded, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        RhyTransactionDetail(loaded, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyTransactionDetailComposable$lambda$0(RhyTransactionDetailViewState rhyTransactionDetailViewState, Modifier modifier, Function0 function0, int i, int i2, Composer composer, int i3) {
        RhyTransactionDetailComposable(rhyTransactionDetailViewState, modifier, function0, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit RhyTransactionDetailPreview$lambda$8(RhyTransactionDetailViewState rhyTransactionDetailViewState, int i, Composer composer, int i2) {
        RhyTransactionDetailPreview(rhyTransactionDetailViewState, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public static final void RhyTransactionDetailComposable(final RhyTransactionDetailViewState viewState, Modifier modifier, final Function0<Unit> onClickViewOriginalTransaction, Composer composer, final int i, final int i2) {
        int i3;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(viewState, "viewState");
        Intrinsics.checkNotNullParameter(onClickViewOriginalTransaction, "onClickViewOriginalTransaction");
        Composer composerStartRestartGroup = composer.startRestartGroup(-302667605);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(viewState) : composerStartRestartGroup.changedInstance(viewState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(modifier) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onClickViewOriginalTransaction) ? 256 : 128;
        }
        if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
            final Modifier modifier3 = i4 != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-302667605, i3, -1, "com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposable (RhyTransactionDetailComposable.kt:47)");
            }
            Crossfade.Crossfade(viewState, (Modifier) null, (FiniteAnimationSpec<Float>) null, "RhyTransactionDetailComposable", ComposableLambda3.rememberComposableLambda(-1666105932, true, new Function3<RhyTransactionDetailViewState, Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt.RhyTransactionDetailComposable.1
                @Override // kotlin.jvm.functions.Function3
                public /* bridge */ /* synthetic */ Unit invoke(RhyTransactionDetailViewState rhyTransactionDetailViewState, Composer composer2, Integer num) {
                    invoke(rhyTransactionDetailViewState, composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(RhyTransactionDetailViewState state, Composer composer2, int i5) {
                    int i6;
                    Intrinsics.checkNotNullParameter(state, "state");
                    if ((i5 & 6) == 0) {
                        i6 = ((i5 & 8) == 0 ? composer2.changed(state) : composer2.changedInstance(state) ? 4 : 2) | i5;
                    } else {
                        i6 = i5;
                    }
                    if ((i6 & 19) == 18 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1666105932, i6, -1, "com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposable.<anonymous> (RhyTransactionDetailComposable.kt:49)");
                    }
                    if (state instanceof RhyTransactionDetailViewState.Loading) {
                        composer2.startReplaceGroup(1975320257);
                        LocalShowPlaceholder.Loadable(true, TestTag3.testTag(modifier3, RhyTransactionDetailComposable.RhyTransactionDetailLoading), null, ComposableLambda3.rememberComposableLambda(1993490348, true, new AnonymousClass1(state), composer2, 54), composer2, 3078, 4);
                        composer2.endReplaceGroup();
                    } else {
                        if (!(state instanceof RhyTransactionDetailViewState.Loaded)) {
                            composer2.startReplaceGroup(895002099);
                            composer2.endReplaceGroup();
                            throw new NoWhenBranchMatchedException();
                        }
                        composer2.startReplaceGroup(1975734758);
                        RhyTransactionDetailComposable.RhyTransactionDetail((RhyTransactionDetailViewState.Loaded) state, modifier3, onClickViewOriginalTransaction, composer2, 0, 0);
                        composer2.endReplaceGroup();
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }

                /* compiled from: RhyTransactionDetailComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$RhyTransactionDetailComposable$1$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ RhyTransactionDetailViewState $state;

                    AnonymousClass1(RhyTransactionDetailViewState rhyTransactionDetailViewState) {
                        this.$state = rhyTransactionDetailViewState;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(1993490348, i, -1, "com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposable.<anonymous>.<anonymous> (RhyTransactionDetailComposable.kt:55)");
                        }
                        RhyTransactionDetailViewState.Loaded mock = ((RhyTransactionDetailViewState.Loading) this.$state).getMock();
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$RhyTransactionDetailComposable$1$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        RhyTransactionDetailComposable.RhyTransactionDetail(mock, null, (Function0) objRememberedValue, composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, (i3 & 14) | 27648, 6);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyTransactionDetailComposable.RhyTransactionDetailComposable$lambda$0(viewState, modifier2, onClickViewOriginalTransaction, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x026c  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x039c  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void RhyTransactionDetail(final RhyTransactionDetailViewState.Loaded loaded, Modifier modifier, final Function0<Unit> function0, Composer composer, final int i, final int i2) {
        RhyTransactionDetailViewState.Loaded loaded2;
        int i3;
        Modifier modifier2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        StringResource status;
        StringResource adjustmentType;
        String originalTransactionAmount;
        String originalTransactionDetails;
        final Modifier modifier3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-3604257);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
            loaded2 = loaded;
        } else if ((i & 6) == 0) {
            loaded2 = loaded;
            i3 = (composerStartRestartGroup.changedInstance(loaded2) ? 4 : 2) | i;
        } else {
            loaded2 = loaded;
            i3 = i;
        }
        int i4 = i2 & 2;
        if (i4 != 0) {
            i3 |= 48;
        } else {
            if ((i & 48) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i2 & 4) != 0) {
                if ((i & 384) == 0) {
                    i3 |= composerStartRestartGroup.changedInstance(function0) ? 256 : 128;
                }
                if ((i3 & 147) != 146 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i4 == 0 ? Modifier.INSTANCE : modifier2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-3604257, i3, -1, "com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetail (RhyTransactionDetailComposable.kt:78)");
                    }
                    Modifier modifierVerticalScroll$default = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                    Modifier modifier5 = modifier4;
                    MeasurePolicy measurePolicyColumnMeasurePolicy = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                    currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                    CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
                    Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default);
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
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                    String amount = loaded2.getAmount();
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i5 = BentoTheme.$stable;
                    int i6 = i3;
                    BentoText2.m20747BentoText38GnDrw(amount, modifierM21623defaultHorizontalPaddingrAjV9yQ, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ2 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion2, 0.0f, composerStartRestartGroup, 6, 1);
                    StringResource subtitle = loaded.getSubtitle();
                    int i7 = StringResource.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(subtitle, composerStartRestartGroup, i7), modifierM21623defaultHorizontalPaddingrAjV9yQ2, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme.getTypography(composerStartRestartGroup, i5).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion2, 0.0f, 0.0f, 0.0f, bentoTheme.getSpacing(composerStartRestartGroup, i5).m21592getMediumD9Ej5fM(), 7, null), composerStartRestartGroup, 0);
                    status = loaded.getStatus();
                    composerStartRestartGroup.startReplaceGroup(861779026);
                    if (status != null) {
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10421R.string.rhy_transaction_detail_status_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResource2.getString(status, composerStartRestartGroup, i7), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    adjustmentType = loaded.getAdjustmentType();
                    composerStartRestartGroup.startReplaceGroup(861789147);
                    if (adjustmentType != null) {
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10421R.string.rhy_transaction_detail_adjustment_type_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(StringResource2.getString(adjustmentType, composerStartRestartGroup, i7), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    originalTransactionAmount = loaded.getOriginalTransactionAmount();
                    composerStartRestartGroup.startReplaceGroup(861799890);
                    if (originalTransactionAmount != null) {
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10421R.string.rhy_transaction_detail_transaction_amount_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(originalTransactionAmount, null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    originalTransactionDetails = loaded.getOriginalTransactionDetails();
                    composerStartRestartGroup.startReplaceGroup(861810435);
                    if (originalTransactionDetails != null) {
                        BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10421R.string.rhy_transaction_detail_original_transaction_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(originalTransactionDetails, null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10421R.string.rhy_transaction_detail_date_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(loaded.getDate(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    composerStartRestartGroup.startReplaceGroup(861829204);
                    if (loaded.getShowOriginalTransactionCta()) {
                        BentoButtonKt.m20586BentoButtonEikTQX8(function0, StringResources_androidKt.stringResource(C10421R.string.rhy_transaction_detail_original_transaction_cta, composerStartRestartGroup, 0), PaddingKt.m21622defaultHorizontalPaddingWMci_g0(SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), bentoTheme.getSpacing(composerStartRestartGroup, i5).m21594getXlargeD9Ej5fM(), 0.0f, composerStartRestartGroup, 6, 2), null, BentoButtons.Type.Secondary, false, false, null, null, null, null, false, null, composerStartRestartGroup, ((i6 >> 6) & 14) | 24576, 0, 8168);
                        composerStartRestartGroup = composerStartRestartGroup;
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
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return RhyTransactionDetailComposable.RhyTransactionDetail$lambda$6(loaded, modifier3, function0, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 384;
            if ((i3 & 147) != 146) {
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Modifier modifierVerticalScroll$default2 = ScrollKt.verticalScroll$default(modifier4, ScrollKt.rememberScrollState(0, composerStartRestartGroup, 0, 1), false, null, false, 14, null);
                Modifier modifier52 = modifier4;
                MeasurePolicy measurePolicyColumnMeasurePolicy2 = Column2.columnMeasurePolicy(Arrangement.INSTANCE.getTop(), Alignment.INSTANCE.getStart(), composerStartRestartGroup, 0);
                currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
                CompositionLocalMap currentCompositionLocalMap2 = composerStartRestartGroup.getCurrentCompositionLocalMap();
                Modifier modifierMaterializeModifier2 = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierVerticalScroll$default2);
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
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ3 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1);
                    String amount2 = loaded2.getAmount();
                    BentoTheme bentoTheme2 = BentoTheme.INSTANCE;
                    int i52 = BentoTheme.$stable;
                    int i62 = i3;
                    BentoText2.m20747BentoText38GnDrw(amount2, modifierM21623defaultHorizontalPaddingrAjV9yQ3, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getDisplayCapsuleMedium(), composerStartRestartGroup, 0, 0, 8188);
                    Modifier modifierM21623defaultHorizontalPaddingrAjV9yQ22 = PaddingKt.m21623defaultHorizontalPaddingrAjV9yQ(companion22, 0.0f, composerStartRestartGroup, 6, 1);
                    StringResource subtitle2 = loaded.getSubtitle();
                    int i72 = StringResource.$stable;
                    BentoText2.m20747BentoText38GnDrw(StringResource2.getString(subtitle2, composerStartRestartGroup, i72), modifierM21623defaultHorizontalPaddingrAjV9yQ22, null, null, null, null, null, 0, false, 0, 0, null, 0, bentoTheme2.getTypography(composerStartRestartGroup, i52).getTextM(), composerStartRestartGroup, 0, 0, 8188);
                    composerStartRestartGroup = composerStartRestartGroup;
                    Spacer2.Spacer(androidx.compose.foundation.layout.PaddingKt.m5146paddingqDBjuR0$default(companion22, 0.0f, 0.0f, 0.0f, bentoTheme2.getSpacing(composerStartRestartGroup, i52).m21592getMediumD9Ej5fM(), 7, null), composerStartRestartGroup, 0);
                    status = loaded.getStatus();
                    composerStartRestartGroup.startReplaceGroup(861779026);
                    if (status != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    adjustmentType = loaded.getAdjustmentType();
                    composerStartRestartGroup.startReplaceGroup(861789147);
                    if (adjustmentType != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    originalTransactionAmount = loaded.getOriginalTransactionAmount();
                    composerStartRestartGroup.startReplaceGroup(861799890);
                    if (originalTransactionAmount != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    originalTransactionDetails = loaded.getOriginalTransactionDetails();
                    composerStartRestartGroup.startReplaceGroup(861810435);
                    if (originalTransactionDetails != null) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoDataRowKt.BentoDataRow(new BentoDataRowState(null, new AnnotatedString(StringResources_androidKt.stringResource(C10421R.string.rhy_transaction_detail_date_label, composerStartRestartGroup, 0), null, 2, null), null, null, null, new AnnotatedString(loaded.getDate(), null, 2, null), null, null, null, null, false, false, 4061, null), null, null, composerStartRestartGroup, BentoDataRowState.$stable, 6);
                    composerStartRestartGroup.startReplaceGroup(861829204);
                    if (loaded.getShowOriginalTransactionCta()) {
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        if ((i2 & 4) != 0) {
        }
        if ((i3 & 147) != 146) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    private static final void RhyTransactionDetailPreview(final RhyTransactionDetailViewState rhyTransactionDetailViewState, Composer composer, final int i) {
        int i2;
        final RhyTransactionDetailViewState.Loaded mock;
        Composer composerStartRestartGroup = composer.startRestartGroup(-1772233547);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? composerStartRestartGroup.changed(rhyTransactionDetailViewState) : composerStartRestartGroup.changedInstance(rhyTransactionDetailViewState) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) != 2 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1772233547, i2, -1, "com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailPreview (RhyTransactionDetailComposable.kt:153)");
            }
            Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
            TemporalFormatter.Companion companion = TemporalFormatter.INSTANCE;
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            composerStartRestartGroup.startReplaceGroup(5004770);
            boolean zChangedInstance = composerStartRestartGroup.changedInstance(context);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new RhyTransactionDetailComposable2(context);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            companion.init(US, (Function1) ((KFunction) objRememberedValue));
            final boolean z = rhyTransactionDetailViewState instanceof RhyTransactionDetailViewState.Loading;
            if (z) {
                mock = ((RhyTransactionDetailViewState.Loading) rhyTransactionDetailViewState).getMock();
            } else {
                if (!(rhyTransactionDetailViewState instanceof RhyTransactionDetailViewState.Loaded)) {
                    throw new NoWhenBranchMatchedException();
                }
                mock = (RhyTransactionDetailViewState.Loaded) rhyTransactionDetailViewState;
            }
            BentoTheme2.BentoTheme(null, null, null, null, null, null, null, null, ComposableLambda3.rememberComposableLambda(-580928515, true, new Function2<Composer, Integer, Unit>() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt.RhyTransactionDetailPreview.2

                /* compiled from: RhyTransactionDetailComposable.kt */
                @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                @SourceDebugExtension
                /* renamed from: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$RhyTransactionDetailPreview$2$1, reason: invalid class name */
                static final class AnonymousClass1 implements Function2<Composer, Integer, Unit> {
                    final /* synthetic */ RhyTransactionDetailViewState.Loaded $viewState;

                    AnonymousClass1(RhyTransactionDetailViewState.Loaded loaded) {
                        this.$viewState = loaded;
                    }

                    @Override // kotlin.jvm.functions.Function2
                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                        invoke(composer, num.intValue());
                        return Unit.INSTANCE;
                    }

                    public final void invoke(Composer composer, int i) {
                        if ((i & 3) == 2 && composer.getSkipping()) {
                            composer.skipToGroupEnd();
                            return;
                        }
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventStart(-221085587, i, -1, "com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailPreview.<anonymous>.<anonymous> (RhyTransactionDetailComposable.kt:164)");
                        }
                        RhyTransactionDetailViewState.Loaded loaded = this.$viewState;
                        composer.startReplaceGroup(1849434622);
                        Object objRememberedValue = composer.rememberedValue();
                        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue = new Function0() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$RhyTransactionDetailPreview$2$1$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.INSTANCE;
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue);
                        }
                        composer.endReplaceGroup();
                        RhyTransactionDetailComposable.RhyTransactionDetail(loaded, null, (Function0) objRememberedValue, composer, 384, 2);
                        if (ComposerKt.isTraceInProgress()) {
                            ComposerKt.traceEventEnd();
                        }
                    }
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i3) {
                    if ((i3 & 3) == 2 && composer2.getSkipping()) {
                        composer2.skipToGroupEnd();
                        return;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-580928515, i3, -1, "com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailPreview.<anonymous> (RhyTransactionDetailComposable.kt:163)");
                    }
                    LocalShowPlaceholder.Loadable(z, null, null, ComposableLambda3.rememberComposableLambda(-221085587, true, new AnonymousClass1(mock), composer2, 54), composer2, 3072, 6);
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                }
            }, composerStartRestartGroup, 54), composerStartRestartGroup, 100663296, 255);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.cash.transaction.ui.rhytransaction.RhyTransactionDetailComposableKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return RhyTransactionDetailComposable.RhyTransactionDetailPreview$lambda$8(rhyTransactionDetailViewState, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
