package com.robinhood.android.futures.trade.p147ui.shared;

import androidx.compose.foundation.layout.Arrangement;
import androidx.compose.foundation.layout.Column2;
import androidx.compose.foundation.layout.Column6;
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
import com.robinhood.android.futures.trade.C17462R;
import com.robinhood.android.models.futures.api.order.FuturesTimeInForce;
import com.robinhood.common.strings.C32428R;
import com.robinhood.compose.bento.component.rows.BentoBaseRowState;
import com.robinhood.compose.bento.component.rows.BentoSelectionRow2;
import com.robinhood.compose.bento.component.rows.BentoSelectionRowState;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableMap;

/* compiled from: TimeInForceSelectionContent.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u001aG\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u0007¢\u0006\u0002\u0010\f¨\u0006\r"}, m3636d2 = {"TimeInForceSelectionContent", "", "currentTimeInForce", "Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;", "gfdDescription", "", "onTimeInForceSelected", "Lkotlin/Function1;", "modifier", "Landroidx/compose/ui/Modifier;", "includeDivider", "", "(Lcom/robinhood/android/models/futures/api/order/FuturesTimeInForce;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLandroidx/compose/runtime/Composer;II)V", "feature-futures-trade_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.futures.trade.ui.shared.TimeInForceSelectionContentKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class TimeInForceSelectionContent {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceSelectionContent$lambda$5(FuturesTimeInForce futuresTimeInForce, String str, Function1 function1, Modifier modifier, boolean z, int i, int i2, Composer composer, int i3) {
        TimeInForceSelectionContent(futuresTimeInForce, str, function1, modifier, z, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01e5  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x01f4  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0089  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x00c2  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x014d  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0192  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void TimeInForceSelectionContent(final FuturesTimeInForce currentTimeInForce, final String str, final Function1<? super FuturesTimeInForce, Unit> onTimeInForceSelected, Modifier modifier, boolean z, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        boolean z2;
        int currentCompositeKeyHash;
        Composer composerM6388constructorimpl;
        Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash;
        int i5;
        boolean z3;
        Object objRememberedValue;
        boolean z4;
        Object objRememberedValue2;
        final Modifier modifier3;
        final boolean z5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(currentTimeInForce, "currentTimeInForce");
        Intrinsics.checkNotNullParameter(onTimeInForceSelected, "onTimeInForceSelected");
        Composer composerStartRestartGroup = composer.startRestartGroup(-1463072827);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changed(currentTimeInForce.ordinal()) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(str) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onTimeInForceSelected) ? 256 : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else {
            if ((i & 3072) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 2048 : 1024;
            }
            i4 = i2 & 16;
            if (i4 != 0) {
                if ((i & 24576) == 0) {
                    z2 = z;
                    i3 |= composerStartRestartGroup.changed(z2) ? 16384 : 8192;
                }
                if ((i3 & 9363) != 9362 || !composerStartRestartGroup.getSkipping()) {
                    Modifier modifier4 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    boolean z6 = i4 == 0 ? true : z2;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-1463072827, i3, -1, "com.robinhood.android.futures.trade.ui.shared.TimeInForceSelectionContent (TimeInForceSelectionContent.kt:20)");
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
                    String strStringResource = StringResources_androidKt.stringResource(C32428R.string.order_time_in_force_gfd, composerStartRestartGroup, 0);
                    BentoBaseRowState.Text.Plain plain = str == null ? new BentoBaseRowState.Text.Plain(str) : null;
                    BentoSelectionRowState.Type type2 = BentoSelectionRowState.Type.RadioButton;
                    BentoSelectionRowState bentoSelectionRowState = new BentoSelectionRowState(type2, strStringResource, currentTimeInForce != FuturesTimeInForce.GFD, (BentoBaseRowState.Text) plain, false, z6, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    i5 = i3 & 896;
                    z3 = i5 != 256;
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3 || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.shared.TimeInForceSelectionContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TimeInForceSelectionContent.TimeInForceSelectionContent$lambda$4$lambda$1$lambda$0(onTimeInForceSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    int i7 = BentoSelectionRowState.$stable;
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState, (Function0) objRememberedValue, composerStartRestartGroup, i7 << 3, 1);
                    z4 = false;
                    BentoSelectionRowState bentoSelectionRowState2 = new BentoSelectionRowState(type2, StringResources_androidKt.stringResource(C32428R.string.order_time_in_force_gtc_no_limit, composerStartRestartGroup, 0), currentTimeInForce != FuturesTimeInForce.GTC, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C17462R.string.futures_trade_gtc_desc, composerStartRestartGroup, 0)), false, z6, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    if (i5 == 256) {
                        z4 = true;
                    }
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (!z4 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.shared.TimeInForceSelectionContentKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TimeInForceSelectionContent.TimeInForceSelectionContent$lambda$4$lambda$3$lambda$2(onTimeInForceSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState2, (Function0) objRememberedValue2, composerStartRestartGroup, i7 << 3, 1);
                    composerStartRestartGroup.endNode();
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    modifier3 = modifier4;
                    z5 = z6;
                } else {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier3 = modifier2;
                    z5 = z2;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.futures.trade.ui.shared.TimeInForceSelectionContentKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return TimeInForceSelectionContent.TimeInForceSelectionContent$lambda$5(currentTimeInForce, str, onTimeInForceSelected, modifier3, z5, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 24576;
            z2 = z;
            if ((i3 & 9363) != 9362) {
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
                ComposeUiNode.Companion companion2 = ComposeUiNode.INSTANCE;
                Function0<ComposeUiNode> constructor2 = companion2.getConstructor();
                if (composerStartRestartGroup.getApplier() == null) {
                }
                composerStartRestartGroup.startReusableNode();
                if (!composerStartRestartGroup.getInserting()) {
                }
                composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyColumnMeasurePolicy2, companion2.getSetMeasurePolicy());
                Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap2, companion2.getSetResolvedCompositionLocals());
                setCompositeKeyHash = companion2.getSetCompositeKeyHash();
                if (!composerM6388constructorimpl.getInserting()) {
                    composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                    composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
                    Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier2, companion2.getSetModifier());
                    Column6 column62 = Column6.INSTANCE;
                    String strStringResource2 = StringResources_androidKt.stringResource(C32428R.string.order_time_in_force_gfd, composerStartRestartGroup, 0);
                    BentoBaseRowState.Text.Plain plain2 = str == null ? new BentoBaseRowState.Text.Plain(str) : null;
                    BentoSelectionRowState.Type type22 = BentoSelectionRowState.Type.RadioButton;
                    BentoSelectionRowState bentoSelectionRowState3 = new BentoSelectionRowState(type22, strStringResource2, currentTimeInForce != FuturesTimeInForce.GFD, (BentoBaseRowState.Text) plain2, false, z6, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
                    composerStartRestartGroup.startReplaceGroup(5004770);
                    i5 = i3 & 896;
                    if (i5 != 256) {
                    }
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    if (!z3) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.futures.trade.ui.shared.TimeInForceSelectionContentKt$$ExternalSyntheticLambda0
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return TimeInForceSelectionContent.TimeInForceSelectionContent$lambda$4$lambda$1$lambda$0(onTimeInForceSelected);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                        composerStartRestartGroup.endReplaceGroup();
                        int i72 = BentoSelectionRowState.$stable;
                        BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState3, (Function0) objRememberedValue, composerStartRestartGroup, i72 << 3, 1);
                        z4 = false;
                        BentoSelectionRowState bentoSelectionRowState22 = new BentoSelectionRowState(type22, StringResources_androidKt.stringResource(C32428R.string.order_time_in_force_gtc_no_limit, composerStartRestartGroup, 0), currentTimeInForce != FuturesTimeInForce.GTC, (BentoBaseRowState.Text) new BentoBaseRowState.Text.Plain(StringResources_androidKt.stringResource(C17462R.string.futures_trade_gtc_desc, composerStartRestartGroup, 0)), false, z6, (BentoSelectionRowState.IconPosition) null, false, false, (ImmutableMap) null, (Function0) null, 2000, (DefaultConstructorMarker) null);
                        composerStartRestartGroup.startReplaceGroup(5004770);
                        if (i5 == 256) {
                        }
                        objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                        if (!z4) {
                            objRememberedValue2 = new Function0() { // from class: com.robinhood.android.futures.trade.ui.shared.TimeInForceSelectionContentKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return TimeInForceSelectionContent.TimeInForceSelectionContent$lambda$4$lambda$3$lambda$2(onTimeInForceSelected);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                            composerStartRestartGroup.endReplaceGroup();
                            BentoSelectionRow2.BentoSelectionRow(null, bentoSelectionRowState22, (Function0) objRememberedValue2, composerStartRestartGroup, i72 << 3, 1);
                            composerStartRestartGroup.endNode();
                            if (ComposerKt.isTraceInProgress()) {
                            }
                            modifier3 = modifier4;
                            z5 = z6;
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 16;
        if (i4 != 0) {
        }
        z2 = z;
        if ((i3 & 9363) != 9362) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceSelectionContent$lambda$4$lambda$1$lambda$0(Function1 function1) {
        function1.invoke(FuturesTimeInForce.GFD);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit TimeInForceSelectionContent$lambda$4$lambda$3$lambda$2(Function1 function1) {
        function1.invoke(FuturesTimeInForce.GTC);
        return Unit.INSTANCE;
    }
}
