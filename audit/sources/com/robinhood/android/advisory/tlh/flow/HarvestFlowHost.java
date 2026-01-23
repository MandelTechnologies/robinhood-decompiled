package com.robinhood.android.advisory.tlh.flow;

import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.TestTag3;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.view.compose.BackHandler;
import com.robinhood.android.advisory.tlh.flow.HarvestFlowHost;
import com.robinhood.android.advisory.tlh.flow.accounts.HarvestFlowAccountSelectionScreen3;
import com.robinhood.android.advisory.tlh.flow.intro.HarvestFlowIntroScreen3;
import com.robinhood.android.advisory.tlh.strategy.celebration.HarvestStrategyCelebrationScreen4;
import com.robinhood.android.advisory.tlh.strategy.intro.HarvestStrategyIntroScreen;
import com.robinhood.android.advisory.tlh.strategy.review.HarvestStrategyReviewScreen4;
import com.robinhood.android.advisory.tlh.strategy.selection.StrategySelectionScreen4;
import com.robinhood.android.navigation.compose.destination.ComposableDestination;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategy;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyReview;
import com.robinhood.models.advisory.p304db.tlh.TaxLossHarvestStrategyType;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: HarvestFlowHost.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u001aI\u0010\u0004\u001a\u00020\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\fH\u0007¢\u0006\u0002\u0010\u000e\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000¨\u0006\u000f²\u0006\n\u0010\u0010\u001a\u00020\u0011X\u008a\u008e\u0002²\u0006\n\u0010\u0012\u001a\u00020\u0013X\u008a\u008e\u0002²\u0006\f\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u008a\u008e\u0002²\u0006\n\u0010\u0016\u001a\u00020\u0013X\u008a\u008e\u0002"}, m3636d2 = {"HarvestFlowIntroTestTag", "", "HarvestFlowAccountSelectionTestTag", "HarvestFlowStrategyIntroTestTag", "HarvestFlowHost", "", "onFinish", "Lkotlin/Function0;", "onExit", "modifier", "Landroidx/compose/ui/Modifier;", "onInternalNavigate", "Lkotlin/Function1;", "Lcom/robinhood/android/navigation/compose/destination/ComposableDestination;", "(Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V", "feature-tax-loss-harvesting_externalDebug", "step", "Lcom/robinhood/android/advisory/tlh/flow/HarvestStep;", "showTitleBar", "", "selectedStrategy", "Lcom/robinhood/models/advisory/db/tlh/TaxLossHarvestStrategy;", "showCelebration"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class HarvestFlowHost {
    public static final String HarvestFlowAccountSelectionTestTag = "harvest_flow_account_selection";
    public static final String HarvestFlowIntroTestTag = "harvest_flow_intro";
    public static final String HarvestFlowStrategyIntroTestTag = "harvest_flow_strategy_intro";

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestFlowHost$lambda$23(Function0 function0, Function0 function02, Modifier modifier, Function1 function1, int i, int i2, Composer composer, int i3) {
        HarvestFlowHost(function0, function02, modifier, function1, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit HarvestFlowHost$lambda$1$lambda$0(ComposableDestination it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x021e  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x022f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x023f  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0257  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0259  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026d  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:134:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x00df  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01c1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01d1  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x020c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void HarvestFlowHost(final Function0<Unit> onFinish, final Function0<Unit> onExit, Modifier modifier, Function1<? super ComposableDestination, Unit> function1, Composer composer, final int i, final int i2) {
        int i3;
        Modifier modifier2;
        int i4;
        Function1<? super ComposableDestination, Unit> function12;
        Modifier modifier3;
        Function1<? super ComposableDestination, Unit> function13;
        Object objRememberedValue;
        Composer.Companion companion;
        final SnapshotState snapshotState;
        final EnumEntries<HarvestFlowHost2> entries;
        final int iIndexOf;
        Object objRememberedValue2;
        Object objRememberedValue3;
        Object objRememberedValue4;
        Object objRememberedValue5;
        final SnapshotState snapshotState2;
        boolean z;
        Object objRememberedValue6;
        Modifier modifier4;
        boolean z2;
        boolean zHarvestFlowHost$lambda$10;
        HarvestFlowHost2 harvestFlowHost2HarvestFlowHost$lambda$4;
        HarvestFlowHost2 harvestFlowHost2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean zChanged;
        Object objRememberedValue7;
        int i5;
        SnapshotState snapshotState3;
        SnapshotState snapshotState4;
        final Function1<? super ComposableDestination, Unit> function14;
        final Modifier modifier5;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Intrinsics.checkNotNullParameter(onFinish, "onFinish");
        Intrinsics.checkNotNullParameter(onExit, "onExit");
        Composer composerStartRestartGroup = composer.startRestartGroup(-744577183);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = (composerStartRestartGroup.changedInstance(onFinish) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onExit) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i3 |= 384;
        } else {
            if ((i & 384) == 0) {
                modifier2 = modifier;
                i3 |= composerStartRestartGroup.changed(modifier2) ? 256 : 128;
            }
            i4 = i2 & 8;
            if (i4 != 0) {
                if ((i & 3072) == 0) {
                    function12 = function1;
                    i3 |= composerStartRestartGroup.changedInstance(function12) ? 2048 : 1024;
                }
                if ((i3 & 1171) == 1170 && composerStartRestartGroup.getSkipping()) {
                    composerStartRestartGroup.skipToGroupEnd();
                    modifier5 = modifier2;
                    function14 = function12;
                } else {
                    modifier3 = i6 == 0 ? Modifier.INSTANCE : modifier2;
                    if (i4 == 0) {
                        composerStartRestartGroup.startReplaceGroup(1849434622);
                        Object objRememberedValue8 = composerStartRestartGroup.rememberedValue();
                        if (objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function1() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda0
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return HarvestFlowHost.HarvestFlowHost$lambda$1$lambda$0((ComposableDestination) obj);
                                }
                            };
                            composerStartRestartGroup.updateRememberedValue(objRememberedValue8);
                        }
                        composerStartRestartGroup.endReplaceGroup();
                        function13 = (Function1) objRememberedValue8;
                    } else {
                        function13 = function12;
                    }
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventStart(-744577183, i3, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowHost (HarvestFlowHost.kt:41)");
                    }
                    Object[] objArr = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue = composerStartRestartGroup.rememberedValue();
                    companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda1
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HarvestFlowHost.HarvestFlowHost$lambda$3$lambda$2();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                    int i7 = i3;
                    entries = HarvestFlowHost2.getEntries();
                    iIndexOf = entries.indexOf(HarvestFlowHost$lambda$4(snapshotState));
                    Object[] objArr2 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda2
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HarvestFlowHost.HarvestFlowHost$lambda$7$lambda$6();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState5 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr2, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                    Object[] objArr3 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue3 == companion.getEmpty()) {
                        objRememberedValue3 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda3
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HarvestFlowHost.HarvestFlowHost$lambda$9$lambda$8();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    SnapshotState snapshotState6 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr3, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue4 == companion.getEmpty()) {
                        objRememberedValue4 = SnapshotState3.mutableStateOf$default(null, null, 2, null);
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                    }
                    SnapshotState snapshotState7 = (SnapshotState) objRememberedValue4;
                    composerStartRestartGroup.endReplaceGroup();
                    Object[] objArr4 = new Object[0];
                    composerStartRestartGroup.startReplaceGroup(1849434622);
                    objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                    if (objRememberedValue5 == companion.getEmpty()) {
                        objRememberedValue5 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HarvestFlowHost.HarvestFlowHost$lambda$16$lambda$15();
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr4, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    boolean zChanged2 = composerStartRestartGroup.changed(iIndexOf) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(entries);
                    int i8 = i7 & 112;
                    z = zChanged2 | (i8 != 32);
                    objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                    if (!z || objRememberedValue6 == companion.getEmpty()) {
                        objRememberedValue6 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda5
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HarvestFlowHost.HarvestFlowHost$lambda$20$lambda$19(iIndexOf, entries, onExit, snapshotState);
                            }
                        };
                        composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandler.BackHandler(false, (Function0) objRememberedValue6, composerStartRestartGroup, 0, 1);
                    int size = entries.size();
                    if (HarvestFlowHost$lambda$4(snapshotState) != HarvestFlowHost2.INTRO || HarvestFlowHost$lambda$4(snapshotState) == HarvestFlowHost2.STRATEGY_INTRO) {
                        modifier4 = modifier3;
                        z2 = true;
                    } else {
                        modifier4 = modifier3;
                        z2 = false;
                    }
                    zHarvestFlowHost$lambda$10 = HarvestFlowHost$lambda$4(snapshotState) != HarvestFlowHost2.STRATEGY_INTRO ? HarvestFlowHost$lambda$10(snapshotState6) : true;
                    harvestFlowHost2HarvestFlowHost$lambda$4 = HarvestFlowHost$lambda$4(snapshotState);
                    harvestFlowHost2 = HarvestFlowHost2.STRATEGY_CONFIRM;
                    if (harvestFlowHost2HarvestFlowHost$lambda$4 == harvestFlowHost2 || !HarvestFlowHost$lambda$17(snapshotState2)) {
                        z3 = zHarvestFlowHost$lambda$10;
                        z4 = false;
                    } else {
                        z3 = zHarvestFlowHost$lambda$10;
                        z4 = true;
                    }
                    if (HarvestFlowHost$lambda$4(snapshotState) == harvestFlowHost2 || !HarvestFlowHost$lambda$17(snapshotState2)) {
                        z5 = z3;
                        z6 = false;
                    } else {
                        z5 = z3;
                        z6 = true;
                    }
                    composerStartRestartGroup.startReplaceGroup(-1224400529);
                    zChanged = composerStartRestartGroup.changed(snapshotState2) | ((i7 & 14) != 4) | composerStartRestartGroup.changed(iIndexOf) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(entries) | (i8 != 32);
                    objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                    if (!zChanged || objRememberedValue7 == companion.getEmpty()) {
                        Function0 function0 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda6
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return HarvestFlowHost.HarvestFlowHost$lambda$22$lambda$21(onFinish, iIndexOf, entries, onExit, snapshotState2, snapshotState);
                            }
                        };
                        i5 = iIndexOf;
                        snapshotState3 = snapshotState2;
                        snapshotState4 = snapshotState;
                        composerStartRestartGroup.updateRememberedValue(function0);
                        objRememberedValue7 = function0;
                    } else {
                        snapshotState3 = snapshotState2;
                        snapshotState4 = snapshotState;
                        i5 = iIndexOf;
                    }
                    composerStartRestartGroup.endReplaceGroup();
                    Function1<? super ComposableDestination, Unit> function15 = function13;
                    HarvestFlowScaffold3.HarvestFlowScaffold(i5, size, (Function0) objRememberedValue7, modifier4, z5, z4, z6, z2, ComposableLambda3.rememberComposableLambda(-1299857000, true, new C93924(snapshotState4, snapshotState5, snapshotState3, snapshotState6, function15, onFinish, snapshotState7), composerStartRestartGroup, 54), composerStartRestartGroup, ((i7 << 3) & 7168) | 100663296, 0);
                    composerStartRestartGroup = composerStartRestartGroup;
                    if (ComposerKt.isTraceInProgress()) {
                        ComposerKt.traceEventEnd();
                    }
                    function14 = function15;
                    modifier5 = modifier4;
                }
                scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda7
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return HarvestFlowHost.HarvestFlowHost$lambda$23(onFinish, onExit, modifier5, function14, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            i3 |= 3072;
            function12 = function1;
            if ((i3 & 1171) == 1170) {
                if (i6 == 0) {
                }
                if (i4 == 0) {
                }
                if (ComposerKt.isTraceInProgress()) {
                }
                Object[] objArr5 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue = composerStartRestartGroup.rememberedValue();
                companion = Composer.INSTANCE;
                if (objRememberedValue == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr5, (Saver) null, (String) null, (Function0) objRememberedValue, composerStartRestartGroup, 3072, 6);
                int i72 = i3;
                entries = HarvestFlowHost2.getEntries();
                iIndexOf = entries.indexOf(HarvestFlowHost$lambda$4(snapshotState));
                Object[] objArr22 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue2 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState52 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr22, (Saver) null, (String) null, (Function0) objRememberedValue2, composerStartRestartGroup, 3072, 6);
                Object[] objArr32 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue3 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                SnapshotState snapshotState62 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr32, (Saver) null, (String) null, (Function0) objRememberedValue3, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue4 == companion.getEmpty()) {
                }
                SnapshotState snapshotState72 = (SnapshotState) objRememberedValue4;
                composerStartRestartGroup.endReplaceGroup();
                Object[] objArr42 = new Object[0];
                composerStartRestartGroup.startReplaceGroup(1849434622);
                objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                if (objRememberedValue5 == companion.getEmpty()) {
                }
                composerStartRestartGroup.endReplaceGroup();
                snapshotState2 = (SnapshotState) RememberSaveable.m6426rememberSaveable(objArr42, (Saver) null, (String) null, (Function0) objRememberedValue5, composerStartRestartGroup, 3072, 6);
                composerStartRestartGroup.startReplaceGroup(-1224400529);
                boolean zChanged22 = composerStartRestartGroup.changed(iIndexOf) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(entries);
                int i82 = i72 & 112;
                z = zChanged22 | (i82 != 32);
                objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                if (!z) {
                    objRememberedValue6 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda5
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HarvestFlowHost.HarvestFlowHost$lambda$20$lambda$19(iIndexOf, entries, onExit, snapshotState);
                        }
                    };
                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                    composerStartRestartGroup.endReplaceGroup();
                    BackHandler.BackHandler(false, (Function0) objRememberedValue6, composerStartRestartGroup, 0, 1);
                    int size2 = entries.size();
                    if (HarvestFlowHost$lambda$4(snapshotState) != HarvestFlowHost2.INTRO) {
                        modifier4 = modifier3;
                        z2 = true;
                        if (HarvestFlowHost$lambda$4(snapshotState) != HarvestFlowHost2.STRATEGY_INTRO) {
                        }
                        harvestFlowHost2HarvestFlowHost$lambda$4 = HarvestFlowHost$lambda$4(snapshotState);
                        harvestFlowHost2 = HarvestFlowHost2.STRATEGY_CONFIRM;
                        if (harvestFlowHost2HarvestFlowHost$lambda$4 == harvestFlowHost2) {
                            z3 = zHarvestFlowHost$lambda$10;
                            z4 = false;
                            if (HarvestFlowHost$lambda$4(snapshotState) == harvestFlowHost2) {
                                z5 = z3;
                                z6 = false;
                                composerStartRestartGroup.startReplaceGroup(-1224400529);
                                zChanged = composerStartRestartGroup.changed(snapshotState2) | ((i72 & 14) != 4) | composerStartRestartGroup.changed(iIndexOf) | composerStartRestartGroup.changed(snapshotState) | composerStartRestartGroup.changedInstance(entries) | (i82 != 32);
                                objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                if (zChanged) {
                                    Function0 function02 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$$ExternalSyntheticLambda6
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return HarvestFlowHost.HarvestFlowHost$lambda$22$lambda$21(onFinish, iIndexOf, entries, onExit, snapshotState2, snapshotState);
                                        }
                                    };
                                    i5 = iIndexOf;
                                    snapshotState3 = snapshotState2;
                                    snapshotState4 = snapshotState;
                                    composerStartRestartGroup.updateRememberedValue(function02);
                                    objRememberedValue7 = function02;
                                    composerStartRestartGroup.endReplaceGroup();
                                    Function1<? super ComposableDestination, Unit> function152 = function13;
                                    HarvestFlowScaffold3.HarvestFlowScaffold(i5, size2, (Function0) objRememberedValue7, modifier4, z5, z4, z6, z2, ComposableLambda3.rememberComposableLambda(-1299857000, true, new C93924(snapshotState4, snapshotState52, snapshotState3, snapshotState62, function152, onFinish, snapshotState72), composerStartRestartGroup, 54), composerStartRestartGroup, ((i72 << 3) & 7168) | 100663296, 0);
                                    composerStartRestartGroup = composerStartRestartGroup;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    function14 = function152;
                                    modifier5 = modifier4;
                                }
                            }
                        }
                    }
                }
            }
            scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        modifier2 = modifier;
        i4 = i2 & 8;
        if (i4 != 0) {
        }
        function12 = function1;
        if ((i3 & 1171) == 1170) {
        }
        scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState HarvestFlowHost$lambda$3$lambda$2() {
        return SnapshotState3.mutableStateOf$default(HarvestFlowHost2.INTRO, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState HarvestFlowHost$lambda$7$lambda$6() {
        return SnapshotState3.mutableStateOf$default(CollectionsKt.emptyList(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HarvestFlowHost$lambda$11(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState HarvestFlowHost$lambda$9$lambda$8() {
        return SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SnapshotState HarvestFlowHost$lambda$16$lambda$15() {
        return SnapshotState3.mutableStateOf$default(Boolean.FALSE, null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HarvestFlowHost$lambda$18(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit HarvestFlowHost$lambda$20$lambda$19(int i, EnumEntries enumEntries, Function0 function0, SnapshotState snapshotState) {
        if (i > 0) {
            snapshotState.setValue((HarvestFlowHost2) enumEntries.get(i - 1));
        } else {
            function0.invoke();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit HarvestFlowHost$lambda$22$lambda$21(Function0 function0, int i, EnumEntries enumEntries, Function0 function02, SnapshotState snapshotState, SnapshotState snapshotState2) {
        if (HarvestFlowHost$lambda$17(snapshotState)) {
            function0.invoke();
        } else if (i <= 0) {
            function02.invoke();
        } else {
            snapshotState2.setValue((HarvestFlowHost2) enumEntries.get(i - 1));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: HarvestFlowHost.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4 */
    static final class C93924 implements Function3<PaddingValues, Composer, Integer, Unit> {
        final /* synthetic */ Function0<Unit> $onFinish;
        final /* synthetic */ Function1<ComposableDestination, Unit> $onInternalNavigate;
        final /* synthetic */ SnapshotState<List<String>> $selectedAccountNumbers;
        final /* synthetic */ SnapshotState<TaxLossHarvestStrategy> $selectedStrategy$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showCelebration$delegate;
        final /* synthetic */ SnapshotState<Boolean> $showTitleBar$delegate;
        final /* synthetic */ SnapshotState<HarvestFlowHost2> $step$delegate;

        /* compiled from: HarvestFlowHost.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[HarvestFlowHost2.values().length];
                try {
                    iArr[HarvestFlowHost2.INTRO.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[HarvestFlowHost2.SELECT_ACCOUNTS.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[HarvestFlowHost2.STRATEGY_INTRO.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[HarvestFlowHost2.STRATEGY_SELECTION.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[HarvestFlowHost2.STRATEGY_CONFIRM.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        C93924(SnapshotState<HarvestFlowHost2> snapshotState, SnapshotState<List<String>> snapshotState2, SnapshotState<Boolean> snapshotState3, SnapshotState<Boolean> snapshotState4, Function1<? super ComposableDestination, Unit> function1, Function0<Unit> function0, SnapshotState<TaxLossHarvestStrategy> snapshotState5) {
            this.$step$delegate = snapshotState;
            this.$selectedAccountNumbers = snapshotState2;
            this.$showCelebration$delegate = snapshotState3;
            this.$showTitleBar$delegate = snapshotState4;
            this.$onInternalNavigate = function1;
            this.$onFinish = function0;
            this.$selectedStrategy$delegate = snapshotState5;
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Unit invoke(PaddingValues paddingValues, Composer composer, Integer num) {
            invoke(paddingValues, composer, num.intValue());
            return Unit.INSTANCE;
        }

        public final void invoke(PaddingValues padding, Composer composer, int i) {
            int i2;
            Intrinsics.checkNotNullParameter(padding, "padding");
            if ((i & 6) == 0) {
                i2 = (composer.changed(padding) ? 4 : 2) | i;
            } else {
                i2 = i;
            }
            if ((i2 & 19) == 18 && composer.getSkipping()) {
                composer.skipToGroupEnd();
                return;
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1299857000, i2, -1, "com.robinhood.android.advisory.tlh.flow.HarvestFlowHost.<anonymous> (HarvestFlowHost.kt:70)");
            }
            int i3 = WhenMappings.$EnumSwitchMapping$0[HarvestFlowHost.HarvestFlowHost$lambda$4(this.$step$delegate).ordinal()];
            if (i3 == 1) {
                composer.startReplaceGroup(-614672296);
                Modifier modifierTestTag = TestTag3.testTag(Modifier.INSTANCE, HarvestFlowHost.HarvestFlowIntroTestTag);
                composer.startReplaceGroup(5004770);
                boolean zChanged = composer.changed(this.$step$delegate);
                final SnapshotState<HarvestFlowHost2> snapshotState = this.$step$delegate;
                Object objRememberedValue = composer.rememberedValue();
                if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return HarvestFlowHost.C93924.invoke$lambda$1$lambda$0(snapshotState);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue);
                }
                composer.endReplaceGroup();
                HarvestFlowIntroScreen3.HarvestFlowIntroScreen(padding, (Function0) objRememberedValue, modifierTestTag, null, composer, (i2 & 14) | 384, 8);
                composer.endReplaceGroup();
            } else if (i3 == 2) {
                composer.startReplaceGroup(-614414190);
                Modifier modifierTestTag2 = TestTag3.testTag(PaddingKt.padding(Modifier.INSTANCE, padding), HarvestFlowHost.HarvestFlowAccountSelectionTestTag);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged2 = composer.changed(this.$selectedAccountNumbers) | composer.changed(this.$step$delegate);
                final SnapshotState<List<String>> snapshotState2 = this.$selectedAccountNumbers;
                final SnapshotState<HarvestFlowHost2> snapshotState3 = this.$step$delegate;
                Object objRememberedValue2 = composer.rememberedValue();
                if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HarvestFlowHost.C93924.invoke$lambda$3$lambda$2(snapshotState2, snapshotState3, (List) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue2);
                }
                composer.endReplaceGroup();
                HarvestFlowAccountSelectionScreen3.HarvestFlowAccountSelectionScreen((Function1) objRememberedValue2, modifierTestTag2, null, composer, 0, 4);
                composer.endReplaceGroup();
            } else if (i3 == 3) {
                composer.startReplaceGroup(-613984995);
                ImmutableList immutableList = extensions2.toImmutableList(this.$selectedAccountNumbers.getValue());
                Modifier modifierTestTag3 = TestTag3.testTag(Modifier.INSTANCE, HarvestFlowHost.HarvestFlowStrategyIntroTestTag);
                composer.startReplaceGroup(-1633490746);
                boolean zChanged3 = composer.changed(this.$step$delegate) | composer.changed(this.$showCelebration$delegate);
                final SnapshotState<HarvestFlowHost2> snapshotState4 = this.$step$delegate;
                final SnapshotState<Boolean> snapshotState5 = this.$showCelebration$delegate;
                Object objRememberedValue3 = composer.rememberedValue();
                if (zChanged3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HarvestFlowHost.C93924.invoke$lambda$5$lambda$4(snapshotState4, snapshotState5, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue3);
                }
                Function1 function1 = (Function1) objRememberedValue3;
                composer.endReplaceGroup();
                composer.startReplaceGroup(5004770);
                boolean zChanged4 = composer.changed(this.$showTitleBar$delegate);
                final SnapshotState<Boolean> snapshotState6 = this.$showTitleBar$delegate;
                Object objRememberedValue4 = composer.rememberedValue();
                if (zChanged4 || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue4 = new Function1() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HarvestFlowHost.C93924.invoke$lambda$7$lambda$6(snapshotState6, ((Boolean) obj).booleanValue());
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue4);
                }
                composer.endReplaceGroup();
                HarvestStrategyIntroScreen.HarvestStrategyIntroScreen(immutableList, function1, padding, modifierTestTag3, (Function1) objRememberedValue4, this.$onInternalNavigate, null, composer, ((i2 << 6) & 896) | 3072, 64);
                composer.endReplaceGroup();
            } else if (i3 == 4) {
                composer.startReplaceGroup(672956837);
                ImmutableList immutableList2 = extensions2.toImmutableList(this.$selectedAccountNumbers.getValue());
                composer.startReplaceGroup(-1746271574);
                boolean zChanged5 = composer.changed(this.$showCelebration$delegate) | composer.changed(this.$step$delegate);
                final SnapshotState<TaxLossHarvestStrategy> snapshotState7 = this.$selectedStrategy$delegate;
                final SnapshotState<Boolean> snapshotState8 = this.$showCelebration$delegate;
                final SnapshotState<HarvestFlowHost2> snapshotState9 = this.$step$delegate;
                Object objRememberedValue5 = composer.rememberedValue();
                if (zChanged5 || objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                    objRememberedValue5 = new Function1() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda4
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return HarvestFlowHost.C93924.invoke$lambda$9$lambda$8(snapshotState7, snapshotState8, snapshotState9, (TaxLossHarvestStrategy) obj);
                        }
                    };
                    composer.updateRememberedValue(objRememberedValue5);
                }
                composer.endReplaceGroup();
                StrategySelectionScreen4.HarvestStrategySelectionScreen(immutableList2, padding, (Function1) objRememberedValue5, null, null, composer, (i2 << 3) & 112, 24);
                composer.endReplaceGroup();
            } else {
                if (i3 != 5) {
                    composer.startReplaceGroup(672910643);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-612690621);
                TaxLossHarvestStrategy taxLossHarvestStrategyHarvestFlowHost$lambda$13 = HarvestFlowHost.HarvestFlowHost$lambda$13(this.$selectedStrategy$delegate);
                if (taxLossHarvestStrategyHarvestFlowHost$lambda$13 != null) {
                    composer.startReplaceGroup(-612621212);
                    TaxLossHarvestStrategyType type2 = taxLossHarvestStrategyHarvestFlowHost$lambda$13.getType();
                    TaxLossHarvestStrategyReview review = taxLossHarvestStrategyHarvestFlowHost$lambda$13.getReview();
                    if (HarvestFlowHost.HarvestFlowHost$lambda$17(this.$showCelebration$delegate)) {
                        composer.startReplaceGroup(-612507721);
                        Modifier modifierPadding = PaddingKt.padding(Modifier.INSTANCE, padding);
                        ImmutableList immutableList3 = extensions2.toImmutableList(this.$selectedAccountNumbers.getValue());
                        composer.startReplaceGroup(5004770);
                        boolean zChanged6 = composer.changed(this.$onFinish);
                        final Function0<Unit> function0 = this.$onFinish;
                        Object objRememberedValue6 = composer.rememberedValue();
                        if (zChanged6 || objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue6 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda5
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HarvestFlowHost.C93924.invoke$lambda$11$lambda$10(function0);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue6);
                        }
                        composer.endReplaceGroup();
                        HarvestStrategyCelebrationScreen4.HarvestStrategyCelebrationScreen(type2, immutableList3, (Function0) objRememberedValue6, modifierPadding, null, composer, 0, 16);
                        composer.endReplaceGroup();
                    } else {
                        composer.startReplaceGroup(-612123011);
                        if (review == null) {
                            HarvestFlowHost.HarvestFlowHost$lambda$18(this.$showCelebration$delegate, true);
                        } else {
                            Modifier modifierPadding2 = PaddingKt.padding(Modifier.INSTANCE, padding);
                            composer.startReplaceGroup(-1633490746);
                            boolean zChanged7 = composer.changed(this.$showCelebration$delegate) | composer.changed(this.$step$delegate);
                            final SnapshotState<Boolean> snapshotState10 = this.$showCelebration$delegate;
                            final SnapshotState<HarvestFlowHost2> snapshotState11 = this.$step$delegate;
                            Object objRememberedValue7 = composer.rememberedValue();
                            if (zChanged7 || objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                objRememberedValue7 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda6
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return HarvestFlowHost.C93924.invoke$lambda$13$lambda$12(snapshotState10, snapshotState11);
                                    }
                                };
                                composer.updateRememberedValue(objRememberedValue7);
                            }
                            composer.endReplaceGroup();
                            HarvestStrategyReviewScreen4.HarvestStrategyReviewScreen(review, (Function0) objRememberedValue7, modifierPadding2, composer, 0, 0);
                        }
                        composer.endReplaceGroup();
                    }
                    composer.endReplaceGroup();
                } else {
                    composer.startReplaceGroup(-611395627);
                    if (HarvestFlowHost.HarvestFlowHost$lambda$17(this.$showCelebration$delegate)) {
                        Modifier modifierPadding3 = PaddingKt.padding(Modifier.INSTANCE, padding);
                        TaxLossHarvestStrategyType taxLossHarvestStrategyType = TaxLossHarvestStrategyType.DO_NOT_HARVEST;
                        ImmutableList immutableList4 = extensions2.toImmutableList(this.$selectedAccountNumbers.getValue());
                        composer.startReplaceGroup(5004770);
                        boolean zChanged8 = composer.changed(this.$onFinish);
                        final Function0<Unit> function02 = this.$onFinish;
                        Object objRememberedValue8 = composer.rememberedValue();
                        if (zChanged8 || objRememberedValue8 == Composer.INSTANCE.getEmpty()) {
                            objRememberedValue8 = new Function0() { // from class: com.robinhood.android.advisory.tlh.flow.HarvestFlowHostKt$HarvestFlowHost$4$$ExternalSyntheticLambda7
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return HarvestFlowHost.C93924.invoke$lambda$15$lambda$14(function02);
                                }
                            };
                            composer.updateRememberedValue(objRememberedValue8);
                        }
                        composer.endReplaceGroup();
                        HarvestStrategyCelebrationScreen4.HarvestStrategyCelebrationScreen(taxLossHarvestStrategyType, immutableList4, (Function0) objRememberedValue8, modifierPadding3, null, composer, 6, 16);
                    }
                    composer.endReplaceGroup();
                }
                composer.endReplaceGroup();
            }
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState) {
            HarvestFlowHost.HarvestFlowHost$lambda$5(snapshotState, HarvestFlowHost2.SELECT_ACCOUNTS);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$3$lambda$2(SnapshotState snapshotState, SnapshotState snapshotState2, List accountNumbers) {
            Intrinsics.checkNotNullParameter(accountNumbers, "accountNumbers");
            snapshotState.setValue(accountNumbers);
            HarvestFlowHost.HarvestFlowHost$lambda$5(snapshotState2, HarvestFlowHost2.STRATEGY_INTRO);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$5$lambda$4(SnapshotState snapshotState, SnapshotState snapshotState2, boolean z) {
            if (z) {
                HarvestFlowHost.HarvestFlowHost$lambda$5(snapshotState, HarvestFlowHost2.STRATEGY_SELECTION);
            } else {
                HarvestFlowHost.HarvestFlowHost$lambda$18(snapshotState2, true);
                HarvestFlowHost.HarvestFlowHost$lambda$5(snapshotState, HarvestFlowHost2.STRATEGY_CONFIRM);
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$7$lambda$6(SnapshotState snapshotState, boolean z) {
            HarvestFlowHost.HarvestFlowHost$lambda$11(snapshotState, !z);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$9$lambda$8(SnapshotState snapshotState, SnapshotState snapshotState2, SnapshotState snapshotState3, TaxLossHarvestStrategy strategy) {
            Intrinsics.checkNotNullParameter(strategy, "strategy");
            HarvestFlowHost.HarvestFlowHost$lambda$14(snapshotState, strategy);
            HarvestFlowHost.HarvestFlowHost$lambda$18(snapshotState2, strategy.getReview() == null);
            HarvestFlowHost.HarvestFlowHost$lambda$5(snapshotState3, HarvestFlowHost2.STRATEGY_CONFIRM);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$11$lambda$10(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$13$lambda$12(SnapshotState snapshotState, SnapshotState snapshotState2) {
            HarvestFlowHost.HarvestFlowHost$lambda$18(snapshotState, true);
            HarvestFlowHost.HarvestFlowHost$lambda$5(snapshotState2, HarvestFlowHost2.STRATEGY_CONFIRM);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invoke$lambda$15$lambda$14(Function0 function0) {
            function0.invoke();
            return Unit.INSTANCE;
        }
    }

    private static final boolean HarvestFlowHost$lambda$10(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TaxLossHarvestStrategy HarvestFlowHost$lambda$13(SnapshotState<TaxLossHarvestStrategy> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean HarvestFlowHost$lambda$17(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final HarvestFlowHost2 HarvestFlowHost$lambda$4(SnapshotState<HarvestFlowHost2> snapshotState) {
        return snapshotState.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HarvestFlowHost$lambda$14(SnapshotState<TaxLossHarvestStrategy> snapshotState, TaxLossHarvestStrategy taxLossHarvestStrategy) {
        snapshotState.setValue(taxLossHarvestStrategy);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void HarvestFlowHost$lambda$5(SnapshotState<HarvestFlowHost2> snapshotState, HarvestFlowHost2 harvestFlowHost2) {
        snapshotState.setValue(harvestFlowHost2);
    }
}
