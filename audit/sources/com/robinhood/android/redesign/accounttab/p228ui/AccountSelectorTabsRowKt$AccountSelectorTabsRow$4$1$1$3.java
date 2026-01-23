package com.robinhood.android.redesign.accounttab.p228ui;

import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState4;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals;
import com.robinhood.android.compose.autoeventlogging.AutoLoggingCompositionLocals4;
import com.robinhood.android.redesign.accounttab.analytics.AccountTabAnalytics;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountSelectorTabsRow.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes5.dex */
final class AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3 implements Function4<LazyItemScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
    final /* synthetic */ SnapshotState4<Integer> $currentSelectedTabIndex$delegate;
    final /* synthetic */ SnapshotState<C2002Dp> $elementHeight$delegate;
    final /* synthetic */ boolean $hasPrivacy;
    final /* synthetic */ boolean $likelyCollapsed;
    final /* synthetic */ Function1<AccountTabInfo, Unit> $onTabLongPressed;
    final /* synthetic */ Function2<Integer, AccountTabInfo, Unit> $onTabReselected;
    final /* synthetic */ Function2<Integer, AccountTabInfo, Unit> $onTabSelected;
    final /* synthetic */ Function2<Integer, Integer, Unit> $onTabWidthMeasured;
    final /* synthetic */ float $scrollPercentage;
    final /* synthetic */ int $selectedTabIndex;
    final /* synthetic */ boolean $showSubtitles;

    /* JADX WARN: Multi-variable type inference failed */
    AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3(ImmutableList<AccountTabInfo.Account> immutableList, int i, boolean z, Function2<? super Integer, ? super Integer, Unit> function2, boolean z2, SnapshotState4<Integer> snapshotState4, Function2<? super Integer, ? super AccountTabInfo, Unit> function22, Function2<? super Integer, ? super AccountTabInfo, Unit> function23, Function1<? super AccountTabInfo, Unit> function1, boolean z3, float f, SnapshotState<C2002Dp> snapshotState) {
        this.$accountTabInfo = immutableList;
        this.$selectedTabIndex = i;
        this.$likelyCollapsed = z;
        this.$onTabWidthMeasured = function2;
        this.$showSubtitles = z2;
        this.$currentSelectedTabIndex$delegate = snapshotState4;
        this.$onTabSelected = function22;
        this.$onTabReselected = function23;
        this.$onTabLongPressed = function1;
        this.$hasPrivacy = z3;
        this.$scrollPercentage = f;
        this.$elementHeight$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
        invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(SnapshotState snapshotState, C2002Dp c2002Dp) {
        if (C2002Dp.m7994compareTo0680j_4(c2002Dp.getValue(), C2002Dp.m7995constructorimpl(0)) > 0 && !C2002Dp.m7996equalsimpl(AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$6(snapshotState), c2002Dp)) {
            AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$7(snapshotState, c2002Dp.getValue());
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(Function2 function2, int i, int i2) {
        if (i2 > 0) {
            function2.invoke(Integer.valueOf(i), Integer.valueOf(i2));
        }
        return Unit.INSTANCE;
    }

    public final void invoke(LazyItemScope items, final int i, Composer composer, int i2) {
        int i3;
        Function1 function1;
        boolean z;
        Object obj;
        int i4;
        Intrinsics.checkNotNullParameter(items, "$this$items");
        if ((i2 & 48) == 0) {
            i3 = i2 | (composer.changed(i) ? 32 : 16);
        } else {
            i3 = i2;
        }
        if ((i3 & EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) == 144 && composer.getSkipping()) {
            composer.skipToGroupEnd();
            return;
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(1470185835, i3, -1, "com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRow.<anonymous>.<anonymous>.<anonymous>.<anonymous> (AccountSelectorTabsRow.kt:180)");
        }
        boolean zAreEqual = Intrinsics.areEqual(CollectionsKt.getOrNull(this.$accountTabInfo, i), CollectionsKt.getOrNull(this.$accountTabInfo, this.$selectedTabIndex));
        composer.startReplaceGroup(-195645262);
        if (i != this.$selectedTabIndex || this.$likelyCollapsed) {
            function1 = null;
        } else {
            composer.startReplaceGroup(5004770);
            final SnapshotState<C2002Dp> snapshotState = this.$elementHeight$delegate;
            Object objRememberedValue = composer.rememberedValue();
            if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3.invoke$lambda$1$lambda$0(snapshotState, (C2002Dp) obj2);
                    }
                };
                composer.updateRememberedValue(objRememberedValue);
            }
            function1 = (Function1) objRememberedValue;
            composer.endReplaceGroup();
        }
        Function1 function12 = function1;
        composer.endReplaceGroup();
        composer.startReplaceGroup(-1633490746);
        int i5 = i3 & 112;
        boolean zChanged = (i5 == 32) | composer.changed(this.$onTabWidthMeasured);
        final Function2<Integer, Integer, Unit> function2 = this.$onTabWidthMeasured;
        Object objRememberedValue2 = composer.rememberedValue();
        if (zChanged || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue2 = new Function1() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3.invoke$lambda$3$lambda$2(function2, i, ((Integer) obj2).intValue());
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function1 function13 = (Function1) objRememberedValue2;
        composer.endReplaceGroup();
        final EventLogger current = AutoLoggingCompositionLocals.getLocalEventLogger().getCurrent(composer, AutoLoggingCompositionLocals4.$stable);
        AccountTabInfo.Account account = this.$accountTabInfo.get(i);
        boolean z2 = this.$showSubtitles;
        composer.startReplaceGroup(-1224400529);
        boolean zChanged2 = composer.changed(this.$currentSelectedTabIndex$delegate) | (i5 == 32) | composer.changedInstance(this.$accountTabInfo) | composer.changed(this.$onTabSelected) | composer.changed(this.$onTabReselected) | composer.changedInstance(current);
        final ImmutableList<AccountTabInfo.Account> immutableList = this.$accountTabInfo;
        final Function2<Integer, AccountTabInfo, Unit> function22 = this.$onTabSelected;
        final Function2<Integer, AccountTabInfo, Unit> function23 = this.$onTabReselected;
        final SnapshotState4<Integer> snapshotState4 = this.$currentSelectedTabIndex$delegate;
        Object objRememberedValue3 = composer.rememberedValue();
        if (zChanged2 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
            z = z2;
            i4 = -1224400529;
            obj = new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3.invoke$lambda$5$lambda$4(i, immutableList, function22, function23, current, snapshotState4);
                }
            };
            composer.updateRememberedValue(obj);
        } else {
            z = z2;
            obj = objRememberedValue3;
            i4 = -1224400529;
        }
        Function0 function0 = (Function0) obj;
        composer.endReplaceGroup();
        composer.startReplaceGroup(i4);
        boolean zChangedInstance = composer.changedInstance(this.$accountTabInfo) | (i5 == 32) | composer.changed(this.$onTabLongPressed) | composer.changedInstance(current);
        final ImmutableList<AccountTabInfo.Account> immutableList2 = this.$accountTabInfo;
        final Function1<AccountTabInfo, Unit> function14 = this.$onTabLongPressed;
        Object objRememberedValue4 = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.redesign.accounttab.ui.AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountSelectorTabsRowKt$AccountSelectorTabsRow$4$1$1$3.invoke$lambda$7$lambda$6(immutableList2, i, function14, current);
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        AccountSelectorTabsRowKt.AccountTab(z, zAreEqual, function0, (Function0) objRememberedValue4, account, this.$hasPrivacy, this.$scrollPercentage, null, function12, function13, composer, 0, 128);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$5$lambda$4(int i, ImmutableList immutableList, Function2 function2, Function2 function22, EventLogger eventLogger, SnapshotState4 snapshotState4) {
        boolean z = AccountSelectorTabsRowKt.AccountSelectorTabsRow$lambda$4(snapshotState4) == i;
        AccountTabInfo.Account account = (AccountTabInfo.Account) immutableList.get(i);
        if (!z) {
            function2.invoke(Integer.valueOf(i), account);
        } else {
            function22.invoke(Integer.valueOf(i), account);
        }
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventData.copy$default(AccountTabAnalytics.INSTANCE.getUserEventData(), UserInteractionEventData.EventType.TAP, null, new Component(Component.ComponentType.TAB, account.getAccountType().getAnalyticsIdentifier(), null, 4, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit invoke$lambda$7$lambda$6(ImmutableList immutableList, int i, Function1 function1, EventLogger eventLogger) {
        function1.invoke((AccountTabInfo.Account) immutableList.get(i));
        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventData.copy$default(AccountTabAnalytics.INSTANCE.getUserEventData(), UserInteractionEventData.EventType.LONG_PRESS, null, new Component(Component.ComponentType.TAB, AccountTabAnalytics.IDENTIFIER_REORDER, null, 4, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), false, false, 6, null);
        return Unit.INSTANCE;
    }
}
