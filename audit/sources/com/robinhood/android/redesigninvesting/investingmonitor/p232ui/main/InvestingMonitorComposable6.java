package com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main;

import android.content.Context;
import androidx.compose.foundation.pager.PagerScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.SnapshotState;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorAsset;
import com.robinhood.android.redesigninvesting.investingmonitor.model.InvestingMonitorPage;
import com.robinhood.android.redesigninvesting.investingmonitor.modes.InvestingMonitorViewMode;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.empty.InvestingMonitorEmptyPageContent;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.main.InvestingMonitorViewState;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.pagecontent.InvestingMonitorGridPageContent;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.pagecontent.InvestingMonitorHeatMapPageContent;
import com.robinhood.android.redesigninvesting.investingmonitor.p232ui.pagecontent.InvestingMonitorListPageContent;
import com.robinhood.android.redesigninvesting.investingmonitor.utils.InvestingMonitorUiUtils;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: InvestingMonitorComposable.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$3, reason: use source file name */
/* loaded from: classes5.dex */
final class InvestingMonitorComposable6 implements Function4<PagerScope, Integer, Composer, Integer, Unit> {
    final /* synthetic */ SnapshotState<InvestingMonitorPage> $activeAssetPageActionsTarget$delegate;
    final /* synthetic */ Context $context;
    final /* synthetic */ Navigator $navigator;
    final /* synthetic */ Function2<InvestingMonitorPage, List<InvestingMonitorAsset>, Job> $onAssetMoved;
    final /* synthetic */ ImmutableList3<InvestingMonitorPage> $pages;
    final /* synthetic */ InvestingMonitorViewState.Loaded $viewState;

    /* compiled from: InvestingMonitorComposable.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$3$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InvestingMonitorViewMode.values().length];
            try {
                iArr[InvestingMonitorViewMode.HEAT_MAP.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InvestingMonitorViewMode.GRID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InvestingMonitorViewMode.LIST.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    InvestingMonitorComposable6(ImmutableList3<InvestingMonitorPage> immutableList3, InvestingMonitorViewState.Loaded loaded, Function2<? super InvestingMonitorPage, ? super List<InvestingMonitorAsset>, ? extends Job> function2, Navigator navigator, Context context, SnapshotState<InvestingMonitorPage> snapshotState) {
        this.$pages = immutableList3;
        this.$viewState = loaded;
        this.$onAssetMoved = function2;
        this.$navigator = navigator;
        this.$context = context;
        this.$activeAssetPageActionsTarget$delegate = snapshotState;
    }

    @Override // kotlin.jvm.functions.Function4
    public /* bridge */ /* synthetic */ Unit invoke(PagerScope pagerScope, Integer num, Composer composer, Integer num2) {
        invoke(pagerScope, num.intValue(), composer, num2.intValue());
        return Unit.INSTANCE;
    }

    public final void invoke(PagerScope HorizontalPager, int i, Composer composer, int i2) {
        Intrinsics.checkNotNullParameter(HorizontalPager, "$this$HorizontalPager");
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(2087685842, i2, -1, "com.robinhood.android.redesigninvesting.investingmonitor.ui.main.MainContent.<anonymous>.<anonymous>.<anonymous> (InvestingMonitorComposable.kt:321)");
        }
        InvestingMonitorPage investingMonitorPage = this.$pages.get(i);
        composer.startReplaceGroup(-1746271574);
        boolean zChangedInstance = ((((i2 & 112) ^ 48) > 32 && composer.changed(i)) || (i2 & 48) == 32) | composer.changedInstance(this.$pages) | composer.changedInstance(this.$viewState);
        ImmutableList3<InvestingMonitorPage> immutableList3 = this.$pages;
        InvestingMonitorViewState.Loaded loaded = this.$viewState;
        Object objRememberedValue = composer.rememberedValue();
        if (zChangedInstance || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new InvestingMonitorComposable7(immutableList3, i, loaded, null);
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceGroup();
        EffectsKt.LaunchedEffect(investingMonitorPage, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composer, 0);
        final InvestingMonitorPage investingMonitorPage2 = this.$viewState.getPages().get(i);
        if (!investingMonitorPage2.getAssets().isEmpty()) {
            composer.startReplaceGroup(-1171994601);
            int i3 = WhenMappings.$EnumSwitchMapping$0[this.$viewState.getViewMode().ordinal()];
            if (i3 == 1) {
                composer.startReplaceGroup(-1171900640);
                InvestingMonitorHeatMapPageContent.HeatMapPageContent(investingMonitorPage2, null, composer, 0, 2);
                composer.endReplaceGroup();
            } else if (i3 == 2) {
                composer.startReplaceGroup(-1171761326);
                InvestingMonitorGridPageContent.GridPageContent(investingMonitorPage2, this.$onAssetMoved, this.$viewState.getSortingInProgressListId(), null, composer, 0, 8);
                composer.endReplaceGroup();
            } else {
                if (i3 != 3) {
                    composer.startReplaceGroup(516383715);
                    composer.endReplaceGroup();
                    throw new NoWhenBranchMatchedException();
                }
                composer.startReplaceGroup(-1171577806);
                InvestingMonitorListPageContent.ListPageContent(investingMonitorPage2, this.$onAssetMoved, this.$viewState.getSortingInProgressListId(), composer, 0);
                composer.endReplaceGroup();
            }
            composer.endReplaceGroup();
        } else {
            composer.startReplaceGroup(-1171395123);
            composer.startReplaceGroup(-1746271574);
            boolean zChangedInstance2 = composer.changedInstance(investingMonitorPage2) | composer.changedInstance(this.$navigator) | composer.changedInstance(this.$context);
            final Navigator navigator = this.$navigator;
            final Context context = this.$context;
            Object objRememberedValue2 = composer.rememberedValue();
            if (zChangedInstance2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$3$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestingMonitorComposable6.invoke$lambda$2$lambda$1(investingMonitorPage2, navigator, context);
                    }
                };
                composer.updateRememberedValue(objRememberedValue2);
            }
            Function0 function0 = (Function0) objRememberedValue2;
            composer.endReplaceGroup();
            composer.startReplaceGroup(-1633490746);
            boolean zChangedInstance3 = composer.changedInstance(investingMonitorPage2);
            final SnapshotState<InvestingMonitorPage> snapshotState = this.$activeAssetPageActionsTarget$delegate;
            Object objRememberedValue3 = composer.rememberedValue();
            if (zChangedInstance3 || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue3 = new Function0() { // from class: com.robinhood.android.redesigninvesting.investingmonitor.ui.main.InvestingMonitorComposableKt$MainContent$3$1$3$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return InvestingMonitorComposable6.invoke$lambda$4$lambda$3(investingMonitorPage2, snapshotState);
                    }
                };
                composer.updateRememberedValue(objRememberedValue3);
            }
            composer.endReplaceGroup();
            InvestingMonitorEmptyPageContent.EmptyPageContent(function0, (Function0) objRememberedValue3, composer, 0);
            composer.endReplaceGroup();
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2$lambda$1(InvestingMonitorPage investingMonitorPage, Navigator navigator, Context context) {
        InvestingMonitorUiUtils.launchAssetAddAction(investingMonitorPage.getCuratedList(), navigator, context);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$4$lambda$3(InvestingMonitorPage investingMonitorPage, SnapshotState snapshotState) {
        InvestingMonitorComposable5.MainContent$lambda$4(snapshotState, investingMonitorPage);
        return Unit.INSTANCE;
    }
}
