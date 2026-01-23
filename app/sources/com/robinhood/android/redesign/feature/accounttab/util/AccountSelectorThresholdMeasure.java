package com.robinhood.android.redesign.feature.accounttab.util;

import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.Measurable;
import androidx.compose.p011ui.layout.MeasureResult;
import androidx.compose.p011ui.layout.MeasureScope;
import androidx.compose.p011ui.layout.Placeable;
import androidx.compose.p011ui.layout.SubcomposeLayoutKt;
import androidx.compose.p011ui.layout.SubcomposeMeasureScope;
import androidx.compose.p011ui.unit.Constraints;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotFloatState2;
import androidx.compose.runtime.SnapshotFloatState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorThresholdMeasure.kt */
@Metadata(m3635d1 = {"\u00000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aP\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062!\u0010\u0007\u001a\u001d\u0012\u0013\u0012\u00110\t¢\u0006\f\b\n\u0012\b\b\u000b\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00010\b2\b\b\u0002\u0010\r\u001a\u00020\u000eH\u0001¢\u0006\u0002\u0010\u000f¨\u0006\u0010²\u0006\n\u0010\u0011\u001a\u00020\tX\u008a\u008e\u0002"}, m3636d2 = {"AccountSelectorThresholdMeasure", "", "accountTabInfo", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/redesign/accounttab/duxo/TabInfo$Account;", "hasPrivacy", "", "onThresholdMeasured", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "threshold", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-account-selector_externalRelease", "measuredThreshold"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt, reason: use source file name */
/* loaded from: classes5.dex */
public final class AccountSelectorThresholdMeasure {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorThresholdMeasure$lambda$0(ImmutableList immutableList, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectorThresholdMeasure(immutableList, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorThresholdMeasure$lambda$12(ImmutableList immutableList, boolean z, Function1 function1, Modifier modifier, int i, int i2, Composer composer, int i3) {
        AccountSelectorThresholdMeasure(immutableList, z, function1, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), i2);
        return Unit.INSTANCE;
    }

    public static final void AccountSelectorThresholdMeasure(final ImmutableList<AccountTabInfo.Account> accountTabInfo, final boolean z, final Function1<? super Float, Unit> onThresholdMeasured, Modifier modifier, Composer composer, final int i, final int i2) {
        int i3;
        Function1<? super Float, Unit> function1;
        final Modifier modifier2;
        Intrinsics.checkNotNullParameter(accountTabInfo, "accountTabInfo");
        Intrinsics.checkNotNullParameter(onThresholdMeasured, "onThresholdMeasured");
        Composer composerStartRestartGroup = composer.startRestartGroup(-586020523);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            i3 = ((i & 8) == 0 ? composerStartRestartGroup.changed(accountTabInfo) : composerStartRestartGroup.changedInstance(accountTabInfo) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= composerStartRestartGroup.changed(z) ? 32 : 16;
        }
        if ((i2 & 4) != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            i3 |= composerStartRestartGroup.changedInstance(onThresholdMeasured) ? 256 : 128;
        }
        if ((i3 & 147) == 146 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
            modifier2 = modifier;
            function1 = onThresholdMeasured;
        } else {
            Modifier modifier3 = (i2 & 8) != 0 ? Modifier.INSTANCE : modifier;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-586020523, i3, -1, "com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasure (AccountSelectorThresholdMeasure.kt:21)");
            }
            if (accountTabInfo.isEmpty()) {
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
                ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                    final Modifier modifier4 = modifier3;
                    scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$$ExternalSyntheticLambda1
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return AccountSelectorThresholdMeasure.AccountSelectorThresholdMeasure$lambda$0(accountTabInfo, z, onThresholdMeasured, modifier4, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                        }
                    });
                    return;
                }
                return;
            }
            function1 = onThresholdMeasured;
            composerStartRestartGroup.startReplaceGroup(1849434622);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            Composer.Companion companion = Composer.INSTANCE;
            if (objRememberedValue == companion.getEmpty()) {
                objRememberedValue = SnapshotFloatState3.mutableFloatStateOf(0.0f);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            final SnapshotFloatState2 snapshotFloatState2 = (SnapshotFloatState2) objRememberedValue;
            composerStartRestartGroup.endReplaceGroup();
            composerStartRestartGroup.startReplaceGroup(-1746271574);
            boolean z2 = ((i3 & 14) == 4 || ((i3 & 8) != 0 && composerStartRestartGroup.changedInstance(accountTabInfo))) | ((i3 & 112) == 32);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (z2 || objRememberedValue2 == companion.getEmpty()) {
                objRememberedValue2 = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$$ExternalSyntheticLambda2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return AccountSelectorThresholdMeasure.AccountSelectorThresholdMeasure$lambda$10$lambda$9(accountTabInfo, z, snapshotFloatState2, (SubcomposeMeasureScope) obj, (Constraints) obj2);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            SubcomposeLayoutKt.SubcomposeLayout(null, (Function2) objRememberedValue2, composerStartRestartGroup, 0, 1);
            Float fValueOf = Float.valueOf(snapshotFloatState2.getFloatValue());
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean z3 = (i3 & 896) == 256;
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (z3 || objRememberedValue3 == companion.getEmpty()) {
                objRememberedValue3 = new AccountSelectorThresholdMeasure4(function1, snapshotFloatState2, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(fValueOf, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue3, composerStartRestartGroup, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
            modifier2 = modifier3;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup2 != null) {
            final Function1<? super Float, Unit> function12 = function1;
            scopeUpdateScopeEndRestartGroup2.updateScope(new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorThresholdMeasure.AccountSelectorThresholdMeasure$lambda$12(accountTabInfo, z, function12, modifier2, i, i2, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MeasureResult AccountSelectorThresholdMeasure$lambda$10$lambda$9(ImmutableList immutableList, boolean z, SnapshotFloatState2 snapshotFloatState2, SubcomposeMeasureScope SubcomposeLayout, Constraints constraints) {
        Integer numValueOf;
        Intrinsics.checkNotNullParameter(SubcomposeLayout, "$this$SubcomposeLayout");
        List<Measurable> listSubcompose = SubcomposeLayout.subcompose("expanded", ComposableLambda3.composableLambdaInstance(105653336, true, new AccountSelectorThresholdMeasure3(immutableList, z)));
        List<Measurable> listSubcompose2 = SubcomposeLayout.subcompose("collapsed", ComposableLambda3.composableLambdaInstance(-254710318, true, new AccountSelectorThresholdMeasure2(immutableList, z)));
        List<Measurable> list = listSubcompose;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Measurable) it.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        List<Measurable> list2 = listSubcompose2;
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            arrayList2.add(((Measurable) it2.next()).mo7239measureBRTryo0(constraints.getValue()));
        }
        Iterator it3 = arrayList.iterator();
        Integer numValueOf2 = null;
        if (it3.hasNext()) {
            numValueOf = Integer.valueOf(((Placeable) it3.next()).getHeight());
            while (it3.hasNext()) {
                Integer numValueOf3 = Integer.valueOf(((Placeable) it3.next()).getHeight());
                if (numValueOf.compareTo(numValueOf3) < 0) {
                    numValueOf = numValueOf3;
                }
            }
        } else {
            numValueOf = null;
        }
        int iIntValue = numValueOf != null ? numValueOf.intValue() : 0;
        Iterator it4 = arrayList2.iterator();
        if (it4.hasNext()) {
            numValueOf2 = Integer.valueOf(((Placeable) it4.next()).getHeight());
            while (it4.hasNext()) {
                Integer numValueOf4 = Integer.valueOf(((Placeable) it4.next()).getHeight());
                if (numValueOf2.compareTo(numValueOf4) < 0) {
                    numValueOf2 = numValueOf4;
                }
            }
        }
        float fIntValue = iIntValue - (numValueOf2 != null ? numValueOf2.intValue() : 0);
        if (fIntValue > 0.0f && fIntValue != snapshotFloatState2.getFloatValue()) {
            snapshotFloatState2.setFloatValue(fIntValue);
        }
        return MeasureScope.layout$default(SubcomposeLayout, 0, 0, null, new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AccountSelectorThresholdMeasure.AccountSelectorThresholdMeasure$lambda$10$lambda$9$lambda$8((Placeable.PlacementScope) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit AccountSelectorThresholdMeasure$lambda$10$lambda$9$lambda$8(Placeable.PlacementScope layout) {
        Intrinsics.checkNotNullParameter(layout, "$this$layout");
        return Unit.INSTANCE;
    }
}
