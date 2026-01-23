package com.robinhood.shared.crypto.p375ui.trade.input;

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
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import com.robinhood.android.navigation.LocalNavigator;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.shared.crypto.p375ui.trade.input.CryptoOrderInputQuantityState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderHeaderComposable4;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRow;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderInputRowState;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRow3;
import com.robinhood.shared.crypto.p375ui.trade.view.CryptoOrderReviewRowState;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: CryptoOrderInputQuantityComposable.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u0081\u0001\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\u00052\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\b\b\u0002\u0010\f\u001a\u00020\r2\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0005H\u0007¢\u0006\u0002\u0010\u000f\u001a\r\u0010\u0010\u001a\u00020\u0001H\u0001¢\u0006\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"CryptoOrderInputQuantityComposable", "", "state", "Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState;", "onInputRowTapped", "Lkotlin/Function1;", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderInputRowState;", "onInputFocusRequested", "onDataRowTapped", "Lcom/robinhood/shared/crypto/ui/trade/view/CryptoOrderReviewRowState$TapAction;", "headerInfoIconOnClick", "Lkotlin/Function0;", "modifier", "Landroidx/compose/ui/Modifier;", "onInputTooltipClick", "(Lcom/robinhood/shared/crypto/ui/trade/input/CryptoOrderInputQuantityState;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "PreviewCryptoOrderInputQuantityComposable", "(Landroidx/compose/runtime/Composer;I)V", "lib-crypto-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.shared.crypto.ui.trade.input.CryptoOrderInputQuantityComposableKt, reason: use source file name */
/* loaded from: classes6.dex */
public final class CryptoOrderInputQuantityComposable4 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit CryptoOrderInputQuantityComposable$lambda$8(CryptoOrderInputQuantityState cryptoOrderInputQuantityState, Function1 function1, Function1 function12, Function1 function13, Function0 function0, Modifier modifier, Function1 function14, int i, int i2, Composer composer, int i3) {
        CryptoOrderInputQuantityComposable(cryptoOrderInputQuantityState, function1, function12, function13, function0, modifier, function14, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewCryptoOrderInputQuantityComposable$lambda$9(int i, Composer composer, int i2) {
        PreviewCryptoOrderInputQuantityComposable(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:153:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fa  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0142  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void CryptoOrderInputQuantityComposable(final CryptoOrderInputQuantityState state, final Function1<? super CryptoOrderInputRowState, Unit> onInputRowTapped, final Function1<? super CryptoOrderInputRowState, Unit> onInputFocusRequested, final Function1<? super CryptoOrderReviewRowState.TapAction, Unit> function1, final Function0<Unit> headerInfoIconOnClick, Modifier modifier, Function1<? super CryptoOrderInputRowState, Unit> function12, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super CryptoOrderInputRowState, Unit> function13;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        Composer composer2;
        final Modifier modifier3;
        final Function1<? super CryptoOrderInputRowState, Unit> function14;
        boolean z;
        boolean z2;
        Function1<? super CryptoOrderInputRowState, Unit> function15;
        int i5;
        Composer composer3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Function1<? super CryptoOrderReviewRowState.TapAction, Unit> onDataRowTapped = function1;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(onInputRowTapped, "onInputRowTapped");
        Intrinsics.checkNotNullParameter(onInputFocusRequested, "onInputFocusRequested");
        Intrinsics.checkNotNullParameter(onDataRowTapped, "onDataRowTapped");
        Intrinsics.checkNotNullParameter(headerInfoIconOnClick, "headerInfoIconOnClick");
        Composer composerStartRestartGroup = composer.startRestartGroup(1475523813);
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
            i3 |= composerStartRestartGroup.changedInstance(onInputRowTapped) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onInputFocusRequested) ? 256 : 128;
        }
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onDataRowTapped) ? 2048 : 1024;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(headerInfoIconOnClick) ? 16384 : 8192;
        }
        int i6 = i2 & 32;
        if (i6 != 0) {
            i3 |= 196608;
        } else {
            if ((196608 & i) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 131072 : 65536;
            }
            i4 = i2 & 64;
            if (i4 != 0) {
                if ((1572864 & i) == 0) {
                    function13 = function12;
                    i3 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                }
                if ((i3 & 599187) != 599186 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    final Function1<? super CryptoOrderInputRowState, Unit> function16 = i4 == 0 ? null : function13;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(1475523813, i3, -1, "com.robinhood.shared.crypto.ui.trade.input.CryptoOrderInputQuantityComposable (CryptoOrderInputQuantityComposable.kt:42)");
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
                    boolean z3 = true;
                    Composer composer4 = composerStartRestartGroup;
                    Modifier modifier5 = modifier4;
                    boolean z4 = false;
                    CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(state.getHeaderState(), SizeKt.fillMaxWidth$default(companion2, 0.0f, 1, null), headerInfoIconOnClick, composer4, ((i3 >> 6) & 896) | 48, 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion2, BentoTheme.INSTANCE.getSpacing(composer4, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer4, 0);
                    composer4.startReplaceGroup(1823710222);
                    for (final CryptoOrderInputQuantityState.RowType rowType : state.getRowTypes()) {
                        if (rowType instanceof CryptoOrderInputQuantityState.RowType.Input) {
                            composer4.startReplaceGroup(-120997969);
                            CryptoOrderInputRowState state2 = ((CryptoOrderInputQuantityState.RowType.Input) rowType).getState();
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChangedInstance = ((i3 & 112) == 32 ? z3 : z4) | composer4.changedInstance(rowType);
                            Object objRememberedValue = composer4.rememberedValue();
                            if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue = new Function1() { // from class: com.robinhood.shared.crypto.ui.trade.input.CryptoOrderInputQuantityComposableKt$$ExternalSyntheticLambda0
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return CryptoOrderInputQuantityComposable4.m2798xc342f833(onInputRowTapped, rowType, (CryptoOrderInputRowState.TapAction) obj);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue);
                            }
                            Function1 function17 = (Function1) objRememberedValue;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChangedInstance2 = ((i3 & 896) == 256 ? z3 : z4) | composer4.changedInstance(rowType);
                            Object objRememberedValue2 = composer4.rememberedValue();
                            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue2 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.input.CryptoOrderInputQuantityComposableKt$$ExternalSyntheticLambda1
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoOrderInputQuantityComposable4.m2799xabd5da73(onInputFocusRequested, rowType);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue2);
                            }
                            Function0 function0 = (Function0) objRememberedValue2;
                            composer4.endReplaceGroup();
                            composer4.startReplaceGroup(-1633490746);
                            boolean zChangedInstance3 = ((3670016 & i3) == 1048576 ? z3 : z4) | composer4.changedInstance(rowType);
                            Object objRememberedValue3 = composer4.rememberedValue();
                            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue3 = new Function0() { // from class: com.robinhood.shared.crypto.ui.trade.input.CryptoOrderInputQuantityComposableKt$$ExternalSyntheticLambda2
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return CryptoOrderInputQuantityComposable4.m2800x9468bcb3(function16, rowType);
                                    }
                                };
                                composer4.updateRememberedValue(objRememberedValue3);
                            }
                            composer4.endReplaceGroup();
                            boolean z5 = z3;
                            composer3 = composer4;
                            function15 = function16;
                            z2 = z4;
                            z = z5;
                            CryptoOrderInputRow.CryptoOrderInputRow(state2, function17, function0, null, null, (Function0) objRememberedValue3, composer3, 0, 24);
                            composer3.endReplaceGroup();
                            i5 = i3;
                        } else {
                            z = z3;
                            z2 = z4;
                            function15 = function16;
                            if (!(rowType instanceof CryptoOrderInputQuantityState.RowType.Data)) {
                                Composer composer5 = composer4;
                                composer5.startReplaceGroup(-120999194);
                                composer5.endReplaceGroup();
                                throw new NoWhenBranchMatchedException();
                            }
                            composer4.startReplaceGroup(-120987087);
                            Composer composer6 = composer4;
                            i5 = i3;
                            CryptoOrderReviewRow3.CryptoOrderReviewRow(((CryptoOrderInputQuantityState.RowType.Data) rowType).getState(), null, onDataRowTapped, composer6, (i3 >> 3) & 896, 2);
                            composer3 = composer6;
                            composer3.endReplaceGroup();
                        }
                        onDataRowTapped = function1;
                        i3 = i5;
                        composer4 = composer3;
                        function16 = function15;
                        z4 = z2;
                        z3 = z;
                    }
                    composer2 = composer4;
                    Function1<? super CryptoOrderInputRowState, Unit> function18 = function16;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier5;
                    function14 = function18;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    composer2 = composerStartRestartGroup;
                    modifier3 = modifier2;
                    function14 = function13;
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.input.CryptoOrderInputQuantityComposableKt$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return CryptoOrderInputQuantityComposable4.CryptoOrderInputQuantityComposable$lambda$8(state, onInputRowTapped, onInputFocusRequested, function1, headerInfoIconOnClick, modifier3, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 1572864;
            function13 = function12;
            if ((i3 & 599187) != 599186) {
                if (i6 == 0) {
                }
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
                    boolean z32 = true;
                    Composer composer42 = composerStartRestartGroup;
                    Modifier modifier52 = modifier4;
                    boolean z42 = false;
                    CryptoOrderHeaderComposable4.CryptoOrderHeaderComposable(state.getHeaderState(), SizeKt.fillMaxWidth$default(companion22, 0.0f, 1, null), headerInfoIconOnClick, composer42, ((i3 >> 6) & 896) | 48, 0);
                    Spacer2.Spacer(SizeKt.m5156height3ABfNKs(companion22, BentoTheme.INSTANCE.getSpacing(composer42, BentoTheme.$stable).m21592getMediumD9Ej5fM()), composer42, 0);
                    composer42.startReplaceGroup(1823710222);
                    while (r19.hasNext()) {
                    }
                    composer2 = composer42;
                    Function1<? super CryptoOrderInputRowState, Unit> function182 = function16;
                    composer2.endReplaceGroup();
                    composer2.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                    }
                    modifier3 = modifier52;
                    function14 = function182;
                }
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 64;
        if (i4 != 0) {
        }
        function13 = function12;
        if ((i3 & 599187) != 599186) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoOrderInputQuantityComposable$lambda$7$lambda$6$lambda$1$lambda$0 */
    public static final Unit m2798xc342f833(Function1 function1, CryptoOrderInputQuantityState.RowType rowType, CryptoOrderInputRowState.TapAction it) {
        Intrinsics.checkNotNullParameter(it, "it");
        function1.invoke(((CryptoOrderInputQuantityState.RowType.Input) rowType).getState());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoOrderInputQuantityComposable$lambda$7$lambda$6$lambda$3$lambda$2 */
    public static final Unit m2799xabd5da73(Function1 function1, CryptoOrderInputQuantityState.RowType rowType) {
        function1.invoke(((CryptoOrderInputQuantityState.RowType.Input) rowType).getState());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: CryptoOrderInputQuantityComposable$lambda$7$lambda$6$lambda$5$lambda$4 */
    public static final Unit m2800x9468bcb3(Function1 function1, CryptoOrderInputQuantityState.RowType rowType) {
        if (function1 != null) {
            function1.invoke(((CryptoOrderInputQuantityState.RowType.Input) rowType).getState());
        }
        return Unit.INSTANCE;
    }

    public static final void PreviewCryptoOrderInputQuantityComposable(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-397946363);
        if (i != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-397946363, i, -1, "com.robinhood.shared.crypto.ui.trade.input.PreviewCryptoOrderInputQuantityComposable (CryptoOrderInputQuantityComposable.kt:82)");
            }
            CompositionLocal3.CompositionLocalProvider(LocalNavigator.getLocalNavigator().provides(Navigator.INSTANCE), CryptoOrderInputQuantityComposable.INSTANCE.m25258getLambda$902895931$lib_crypto_ui_externalDebug(), composerStartRestartGroup, ProvidedValue.$stable | 48);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.shared.crypto.ui.trade.input.CryptoOrderInputQuantityComposableKt$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return CryptoOrderInputQuantityComposable4.PreviewCryptoOrderInputQuantityComposable$lambda$9(i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }
}
