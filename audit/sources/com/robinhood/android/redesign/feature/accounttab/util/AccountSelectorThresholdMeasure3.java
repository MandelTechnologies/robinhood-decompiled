package com.robinhood.android.redesign.feature.accounttab.util;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import com.robinhood.android.redesign.accounttab.common.NewUserExperienceStage;
import com.robinhood.android.redesign.accounttab.duxo.AccountTabInfo;
import com.robinhood.android.redesign.accounttab.p228ui.AccountSelectorTabsRowKt;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AccountSelectorThresholdMeasure.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$AccountSelectorThresholdMeasure$2$1$expandedMeasurables$1, reason: use source file name */
/* loaded from: classes5.dex */
final class AccountSelectorThresholdMeasure3 implements Function2<Composer, Integer, Unit> {
    final /* synthetic */ ImmutableList<AccountTabInfo.Account> $accountTabInfo;
    final /* synthetic */ boolean $hasPrivacy;

    AccountSelectorThresholdMeasure3(ImmutableList<AccountTabInfo.Account> immutableList, boolean z) {
        this.$accountTabInfo = immutableList;
        this.$hasPrivacy = z;
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
            ComposerKt.traceEventStart(105653336, i, -1, "com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasure.<anonymous>.<anonymous>.<anonymous> (AccountSelectorThresholdMeasure.kt:30)");
        }
        NewUserExperienceStage newUserExperienceStage = NewUserExperienceStage.DONE;
        ImmutableList<AccountTabInfo.Account> immutableList = this.$accountTabInfo;
        boolean z = this.$hasPrivacy;
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue = composer.rememberedValue();
        Composer.Companion companion = Composer.INSTANCE;
        if (objRememberedValue == companion.getEmpty()) {
            objRememberedValue = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$AccountSelectorThresholdMeasure$2$1$expandedMeasurables$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorThresholdMeasure3.invoke$lambda$1$lambda$0(((Integer) obj).intValue(), (AccountTabInfo) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        Function2 function2 = (Function2) objRememberedValue;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue2 = composer.rememberedValue();
        if (objRememberedValue2 == companion.getEmpty()) {
            objRememberedValue2 = new Function2() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$AccountSelectorThresholdMeasure$2$1$expandedMeasurables$1$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return AccountSelectorThresholdMeasure3.invoke$lambda$3$lambda$2(((Integer) obj).intValue(), (AccountTabInfo) obj2);
                }
            };
            composer.updateRememberedValue(objRememberedValue2);
        }
        Function2 function22 = (Function2) objRememberedValue2;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue3 = composer.rememberedValue();
        if (objRememberedValue3 == companion.getEmpty()) {
            objRememberedValue3 = new Function1() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$AccountSelectorThresholdMeasure$2$1$expandedMeasurables$1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return AccountSelectorThresholdMeasure3.invoke$lambda$5$lambda$4((AccountTabInfo) obj);
                }
            };
            composer.updateRememberedValue(objRememberedValue3);
        }
        Function1 function1 = (Function1) objRememberedValue3;
        composer.endReplaceGroup();
        composer.startReplaceGroup(1849434622);
        Object objRememberedValue4 = composer.rememberedValue();
        if (objRememberedValue4 == companion.getEmpty()) {
            objRememberedValue4 = new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.util.AccountSelectorThresholdMeasureKt$AccountSelectorThresholdMeasure$2$1$expandedMeasurables$1$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
            composer.updateRememberedValue(objRememberedValue4);
        }
        composer.endReplaceGroup();
        AccountSelectorTabsRowKt.AccountSelectorTabsRow(0, immutableList, false, z, 0.0f, newUserExperienceStage, false, function2, function22, function1, (Function0) objRememberedValue4, null, null, null, null, composer, (AccountTabInfo.Account.$stable << 3) | 920347014, 6, 30720);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$1$lambda$0(int i, AccountTabInfo accountTabInfo) {
        Intrinsics.checkNotNullParameter(accountTabInfo, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$3$lambda$2(int i, AccountTabInfo accountTabInfo) {
        Intrinsics.checkNotNullParameter(accountTabInfo, "<unused var>");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$5$lambda$4(AccountTabInfo accountTabInfo) {
        Intrinsics.checkNotNullParameter(accountTabInfo, "<unused var>");
        return Unit.INSTANCE;
    }
}
