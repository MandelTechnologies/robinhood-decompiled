package com.robinhood.android.redesign.feature.accounttab;

import android.content.Context;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.AnimationVectors2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.ZIndexModifier2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.robinhood.android.account.contracts.onboarding.GeneralAccountOnboardingFragmentKey;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.duxo.AccountSelectorViewState;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabDuxo;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.p228ui.AccountSelectorTabsRowKt;
import com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorExpansionState;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.RangesKt;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.ImmutableMap;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ AccountTabDuxo $accountTabDuxo;
    final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
    final /* synthetic */ LazyListState $accountTabRowListState;
    final /* synthetic */ Context $context;
    final /* synthetic */ CoroutineScope $coroutineScope;
    final /* synthetic */ SnapshotState<Boolean> $isGestureActive$delegate;
    final /* synthetic */ SnapshotState<AccountTabInfo> $lastSelectedTabInfoBeforeReorder$delegate;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function2<Integer, AccountTabInfo, Unit> $onTabReselected;
    final /* synthetic */ PagerState $pagerState;
    final /* synthetic */ SnapshotState<Boolean> $showReorderBottomSheet$delegate;
    final /* synthetic */ Animatable<Float, AnimationVectors2> $tabExpansionProgress;
    final /* synthetic */ ImmutableMap<String, Integer> $tabInfoIndexMap;
    final /* synthetic */ SnapshotState<Map<Integer, Integer>> $tabItemWidths$delegate;
    final /* synthetic */ SnapshotIntState2 $tabSpacing$delegate;
    final /* synthetic */ SnapshotState<AccountSelectorExpansionState> $uiExpansionState$delegate;
    final /* synthetic */ SnapshotState4<AccountSelectorViewState> $viewState$delegate;

    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1(Animatable<Float, AnimationVectors2> animatable, PagerState pagerState, ImmutableList<AccountTabInfo.Account> immutableList, CoroutineScope coroutineScope, AccountTabDuxo accountTabDuxo, Function2<? super Integer, ? super AccountTabInfo, Unit> function2, Navigator navigator, Context context, LazyListState lazyListState, SnapshotState4<AccountSelectorViewState> snapshotState4, SnapshotState<Boolean> snapshotState, SnapshotState<AccountTabInfo> snapshotState2, ImmutableMap<String, Integer> immutableMap, SnapshotState<AccountSelectorExpansionState> snapshotState3, SnapshotState<Boolean> snapshotState5, SnapshotState<Map<Integer, Integer>> snapshotState6, SnapshotIntState2 snapshotIntState2) {
        this.$tabExpansionProgress = animatable;
        this.$pagerState = pagerState;
        this.$accountTabInfo = immutableList;
        this.$coroutineScope = coroutineScope;
        this.$accountTabDuxo = accountTabDuxo;
        this.$onTabReselected = function2;
        this.$navigator = navigator;
        this.$context = context;
        this.$accountTabRowListState = lazyListState;
        this.$viewState$delegate = snapshotState4;
        this.$showReorderBottomSheet$delegate = snapshotState;
        this.$lastSelectedTabInfoBeforeReorder$delegate = snapshotState2;
        this.$tabInfoIndexMap = immutableMap;
        this.$uiExpansionState$delegate = snapshotState3;
        this.$isGestureActive$delegate = snapshotState5;
        this.$tabItemWidths$delegate = snapshotState6;
        this.$tabSpacing$delegate = snapshotIntState2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
        invoke(composer, num.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(Composer composer, int i) {
        AccountTabInfo accountTabInfoAccountSelectorComposable$lambda$53;
        String id;
        Integer num;
        if ((i & 3) == 2 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1448713285, i, -1, "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposable.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelectorComposable.kt:766)");
        }
        Modifier modifierFillMaxWidth$default = SizeKt.fillMaxWidth$default(ZIndexModifier2.zIndex(Modifier.INSTANCE, 1.0f), 0.0f, 1, null);
        boolean accountsLoading = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getAccountsLoading();
        boolean hasPrivacy = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getHasPrivacy();
        float fCoerceIn = RangesKt.coerceIn(this.$tabExpansionProgress.getValue().floatValue(), 0.0f, 1.0f);
        int currentPage = (!AccountSelectorComposableKt.AccountSelectorComposable$lambda$47(this.$showReorderBottomSheet$delegate) || (accountTabInfoAccountSelectorComposable$lambda$53 = AccountSelectorComposableKt.AccountSelectorComposable$lambda$53(this.$lastSelectedTabInfoBeforeReorder$delegate)) == null || (id = accountTabInfoAccountSelectorComposable$lambda$53.getId()) == null || (num = this.$tabInfoIndexMap.get(id)) == null) ? this.$pagerState.getCurrentPage() : num.intValue();
        NewUserExperienceStage newUserExperienceStage = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getNewUserExperienceStage();
        boolean showSubtitles = AccountSelectorComposableKt.AccountSelectorComposable$lambda$0(this.$viewState$delegate).getShowSubtitles();
        int i2 = currentPage;
        ImmutableList<AccountTabInfo.Account> immutableList = this.$accountTabInfo;
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance = composer.changedInstance(this.$coroutineScope) | composer.changed(this.$pagerState);
        final CoroutineScope coroutineScope = this.$coroutineScope;
        final PagerState pagerState = this.$pagerState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1.invoke$lambda$2$lambda$1(coroutineScope, pagerState, ((Integer) obj).intValue(), (AccountTabInfo) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1224400529);
        boolean zChangedInstance2 = composer.changedInstance(this.$coroutineScope) | composer.changedInstance(this.$tabExpansionProgress) | composer.changedInstance(this.$accountTabDuxo) | composer.changed(this.$onTabReselected);
        final Function2<Integer, AccountTabInfo, Unit> function22 = this.$onTabReselected;
        final SnapshotState<AccountSelectorExpansionState> snapshotState = this.$uiExpansionState$delegate;
        final CoroutineScope coroutineScope2 = this.$coroutineScope;
        final SnapshotState<Boolean> snapshotState2 = this.$isGestureActive$delegate;
        final Animatable<Float, AnimationVectors2> animatable = this.$tabExpansionProgress;
        final AccountTabDuxo accountTabDuxo = this.$accountTabDuxo;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            Function2 function23 = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1.invoke$lambda$4$lambda$3(function22, snapshotState, coroutineScope2, snapshotState2, animatable, accountTabDuxo, ((Integer) obj).intValue(), (AccountTabInfo) obj2);
                }
            };
            composer.updateRememberedValue(function23);
            objRememberedValue2 = function23;
        }
        Function2 function24 = (Function2) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        final SnapshotState<Boolean> snapshotState3 = this.$showReorderBottomSheet$delegate;
        Object objRememberedValue3 = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1.invoke$lambda$6$lambda$5(snapshotState3, (AccountTabInfo) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function1 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        boolean zChangedInstance3 = composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
        final Navigator navigator = this.$navigator;
        final Context context = this.$context;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance3 || objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1.invoke$lambda$8$lambda$7(navigator, context);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        Function0 function0 = (Function0) objRememberedValue4;
        composer.endReplaceGroup();
        LazyListState lazyListState = this.$accountTabRowListState;
        composer.startReplaceGroup(5004770);
        final SnapshotState<Map<Integer, Integer>> snapshotState4 = this.$tabItemWidths$delegate;
        Object objRememberedValue5 = composer.rememberedValue();
        if (objRememberedValue5 == companion.getEmpty()) {
            objRememberedValue5 = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1.invoke$lambda$10$lambda$9(snapshotState4, ((Integer) obj).intValue(), ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue5);
        }
        Function2 function25 = (Function2) objRememberedValue5;
        composer.endReplaceGroup();
        composer.startReplaceGroup(5004770);
        final SnapshotIntState2 snapshotIntState2 = this.$tabSpacing$delegate;
        Object objRememberedValue6 = composer.rememberedValue();
        if (objRememberedValue6 == companion.getEmpty()) {
            objRememberedValue6 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountSelectorComposableKt$AccountSelectorComposable$15$1$1$1.invoke$lambda$12$lambda$11(snapshotIntState2, ((Integer) obj).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue6);
        }
        composer.endReplaceGroup();
        AccountSelectorTabsRowKt.AccountSelectorTabsRow(i2, immutableList, accountsLoading, hasPrivacy, fCoerceIn, newUserExperienceStage, showSubtitles, function2, function24, function1, function0, modifierFillMaxWidth$default, lazyListState, function25, (Function1) objRememberedValue6, composer, (AccountTabInfo.Account.$stable << 3) | 805306368, 27696, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(CoroutineScope coroutineScope, PagerState pagerState, int i, AccountTabInfo tabInfo) {
        Intrinsics.checkNotNullParameter(tabInfo, "tabInfo");
        BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new C26428x2f4056e0(pagerState, i, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(Function2 function2, SnapshotState snapshotState, CoroutineScope coroutineScope, SnapshotState snapshotState2, Animatable animatable, AccountTabDuxo accountTabDuxo, int i, AccountTabInfo tabInfo) {
        Intrinsics.checkNotNullParameter(tabInfo, "tabInfo");
        AccountSelectorComposableKt.AccountSelectorComposable$animateExpansionState(coroutineScope, snapshotState, snapshotState2, animatable, accountTabDuxo, AccountSelectorComposableKt.AccountSelectorComposable$determineToggledTargetState(AccountSelectorComposableKt.AccountSelectorComposable$lambda$9(snapshotState)));
        function2.invoke(Integer.valueOf(i), tabInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$6$lambda$5(SnapshotState snapshotState, AccountTabInfo tabInfo) {
        Intrinsics.checkNotNullParameter(tabInfo, "tabInfo");
        AccountSelectorComposableKt.AccountSelectorComposable$lambda$48(snapshotState, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$8$lambda$7(Navigator navigator, Context context) {
        Navigator.DefaultImpls.showFragmentInStandaloneRdsActivity$default(navigator, context, new GeneralAccountOnboardingFragmentKey(null, "home-add-account-button", 1, null), false, false, false, false, null, false, null, null, 1020, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$10$lambda$9(SnapshotState snapshotState, int i, int i2) {
        snapshotState.setValue(MapsKt.plus(AccountSelectorComposableKt.AccountSelectorComposable$lambda$2(snapshotState), Tuples4.m3642to(Integer.valueOf(i), Integer.valueOf(i2))));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$12$lambda$11(SnapshotIntState2 snapshotIntState2, int i) {
        snapshotIntState2.setIntValue(i);
        return Unit.INSTANCE;
    }
}
