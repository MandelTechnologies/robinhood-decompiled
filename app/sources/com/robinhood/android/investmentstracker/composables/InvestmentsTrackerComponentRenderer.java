package com.robinhood.android.investmentstracker.composables;

import androidx.compose.animation.AnimatedVisibilityKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.EnterTransition;
import androidx.compose.animation.ExitTransition;
import androidx.compose.foundation.Background3;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScope;
import androidx.compose.foundation.lazy.LazyListScope;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.LazyListStateKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.internal.ComposableLambda3;
import bff_money_movement.service.p019v1.InvestmentsTrackerActionDto;
import bff_money_movement.service.p019v1.InvestmentsTrackerScrubPointDto;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.investmentstracker.InvestmentsTrackerNativeAction;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerButton;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategoryPercentage4;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerCategorySection;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerDisclosureMarkdownText;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerManageExternalAccounts;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerMetadata4;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerPerformanceChart3;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsell;
import com.robinhood.android.investmentstracker.composables.components.InvestmentsTrackerUpsellCard4;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerAllocationsBarViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerButtonViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategoryPercentageViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerCategorySectionViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerComponent;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerDisclosureMarkdownViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerMetadataViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceChartViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerPerformanceHeaderViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerSwitcherViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerUpsellCardViewModel;
import com.robinhood.android.investmentstracker.viewmodels.InvestmentsTrackerUpsellViewModel;
import com.robinhood.android.investmentstracker.viewmodels.ManageExternalAccountsViewModel;
import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.compose.bento.component.BentoDivider;
import com.robinhood.compose.bento.theme.BentoTheme;
import com.robinhood.models.serverdriven.experimental.api.PerformanceChartAction;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KClass;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InvestmentsTrackerComponentRenderer.kt */
@Metadata(m3635d1 = {"\u0000R\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\u001aµ\u0001\u0010\u0000\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u00062\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\t2\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00010\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0012\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00010\u00122\u0014\u0010\u0014\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0015\u0012\u0004\u0012\u00020\u00010\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0017H\u0007¢\u0006\u0002\u0010\u0018¨\u0006\u0019²\u0006\n\u0010\u001a\u001a\u00020\u001bX\u008a\u008e\u0002"}, m3636d2 = {"InvestmentsTrackerComponentRenderer", "", "components", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/investmentstracker/viewmodels/InvestmentsTrackerComponent;", "firstVisibleItemIndex", "", "firstOffset", "actionHandler", "Lkotlin/Function2;", "Lbff_money_movement/service/v1/InvestmentsTrackerActionDto;", "", "nativeActionHandler", "Lcom/robinhood/android/investmentstracker/InvestmentsTrackerNativeAction;", "chartActionHandler", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/PerformanceChartAction;", "onFirstVisibleItemChanged", "Lkotlin/Function1;", "onScrollOffsetChanges", "onScrub", "Lbff_money_movement/service/v1/InvestmentsTrackerScrubPointDto;", "modifier", "Landroidx/compose/ui/Modifier;", "(Lkotlinx/collections/immutable/ImmutableList;IILkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function2;Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V", "feature-investments-tracker_externalDebug", "visible", ""}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class InvestmentsTrackerComponentRenderer {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerComponentRenderer$lambda$10(ImmutableList immutableList, int i, int i2, Function2 function2, Function2 function22, SduiActionHandler sduiActionHandler, Function1 function1, Function1 function12, Function1 function13, Modifier modifier, int i3, int i4, Composer composer, int i5) {
        InvestmentsTrackerComponentRenderer(immutableList, i, i2, function2, function22, sduiActionHandler, function1, function12, function13, modifier, composer, RecomposeScopeImpl4.updateChangedFlags(i3 | 1), i4);
        return Unit.INSTANCE;
    }

    public static final void InvestmentsTrackerComponentRenderer(final ImmutableList<? extends InvestmentsTrackerComponent> components, final int i, final int i2, final Function2<? super InvestmentsTrackerActionDto, Object, Unit> actionHandler, final Function2<? super InvestmentsTrackerNativeAction, Object, Unit> nativeActionHandler, final SduiActionHandler<? super PerformanceChartAction> chartActionHandler, final Function1<? super Integer, Unit> onFirstVisibleItemChanged, final Function1<? super Integer, Unit> onScrollOffsetChanges, final Function1<? super InvestmentsTrackerScrubPointDto, Unit> onScrub, Modifier modifier, Composer composer, final int i3, final int i4) {
        int i5;
        char c;
        Modifier modifier2;
        Modifier modifier3;
        Composer composer2;
        Intrinsics.checkNotNullParameter(components, "components");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(nativeActionHandler, "nativeActionHandler");
        Intrinsics.checkNotNullParameter(chartActionHandler, "chartActionHandler");
        Intrinsics.checkNotNullParameter(onFirstVisibleItemChanged, "onFirstVisibleItemChanged");
        Intrinsics.checkNotNullParameter(onScrollOffsetChanges, "onScrollOffsetChanges");
        Intrinsics.checkNotNullParameter(onScrub, "onScrub");
        Composer composerStartRestartGroup = composer.startRestartGroup(-464901480);
        if ((i4 & 1) != 0) {
            i5 = i3 | 6;
        } else if ((i3 & 6) == 0) {
            i5 = ((i3 & 8) == 0 ? composerStartRestartGroup.changed(components) : composerStartRestartGroup.changedInstance(components) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i4 & 2) != 0) {
            i5 |= 48;
        } else if ((i3 & 48) == 0) {
            i5 |= composerStartRestartGroup.changed(i) ? 32 : 16;
        }
        if ((i4 & 4) != 0) {
            i5 |= 384;
            c = 2;
        } else {
            c = 2;
            if ((i3 & 384) == 0) {
                i5 |= composerStartRestartGroup.changed(i2) ? 256 : 128;
            }
        }
        if ((i4 & 8) != 0) {
            i5 |= 3072;
        } else if ((i3 & 3072) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(actionHandler) ? 2048 : 1024;
        }
        if ((i4 & 16) != 0) {
            i5 |= 24576;
        } else if ((i3 & 24576) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(nativeActionHandler) ? 16384 : 8192;
        }
        if ((i4 & 32) != 0) {
            i5 |= 196608;
        } else if ((i3 & 196608) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(chartActionHandler) ? 131072 : 65536;
        }
        if ((i4 & 64) != 0) {
            i5 |= 1572864;
        } else if ((i3 & 1572864) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onFirstVisibleItemChanged) ? 1048576 : 524288;
        }
        if ((i4 & 128) != 0) {
            i5 |= 12582912;
        } else if ((i3 & 12582912) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onScrollOffsetChanges) ? 8388608 : 4194304;
        }
        if ((i4 & 256) != 0) {
            i5 |= 100663296;
        } else if ((i3 & 100663296) == 0) {
            i5 |= composerStartRestartGroup.changedInstance(onScrub) ? 67108864 : 33554432;
        }
        int i6 = i4 & 512;
        if (i6 != 0) {
            i5 |= 805306368;
            modifier2 = modifier;
        } else {
            modifier2 = modifier;
            if ((i3 & 805306368) == 0) {
                i5 |= composerStartRestartGroup.changed(modifier2) ? 536870912 : 268435456;
            }
        }
        if ((i5 & 306783379) != 306783378 || !composerStartRestartGroup.getSkipping()) {
            Modifier modifier4 = i6 != 0 ? Modifier.INSTANCE : modifier2;
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-464901480, i5, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRenderer (InvestmentsTrackerComponentRenderer.kt:63)");
            }
            KClass orCreateKotlinClass = Reflection.getOrCreateKotlinClass(InvestmentsTrackerPerformanceHeaderViewModel.class);
            KClass orCreateKotlinClass2 = Reflection.getOrCreateKotlinClass(InvestmentsTrackerSwitcherViewModel.class);
            KClass orCreateKotlinClass3 = Reflection.getOrCreateKotlinClass(InvestmentsTrackerDisclosureMarkdownViewModel.class);
            KClass[] kClassArr = new KClass[3];
            kClassArr[0] = orCreateKotlinClass;
            kClassArr[1] = orCreateKotlinClass2;
            kClassArr[c] = orCreateKotlinClass3;
            final List listListOf = CollectionsKt.listOf((Object[]) kClassArr);
            LazyListState lazyListStateRememberLazyListState = LazyListStateKt.rememberLazyListState(i, i2, composerStartRestartGroup, (i5 >> 3) & EnumC7081g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | ((i5 & 3670016) == 1048576);
            Object objRememberedValue = composerStartRestartGroup.rememberedValue();
            if (zChanged || objRememberedValue == Composer.INSTANCE.getEmpty()) {
                objRememberedValue = new InvestmentsTrackerComponentRenderer2(lazyListStateRememberLazyListState, onFirstVisibleItemChanged, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue, composerStartRestartGroup, 0);
            composerStartRestartGroup.startReplaceGroup(-1633490746);
            boolean zChanged2 = composerStartRestartGroup.changed(lazyListStateRememberLazyListState) | ((29360128 & i5) == 8388608);
            Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
            if (zChanged2 || objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                objRememberedValue2 = new InvestmentsTrackerComponentRenderer3(lazyListStateRememberLazyListState, onScrollOffsetChanges, null);
                composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
            }
            composerStartRestartGroup.endReplaceGroup();
            EffectsKt.LaunchedEffect(lazyListStateRememberLazyListState, (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composerStartRestartGroup, 0);
            modifier3 = modifier4;
            Modifier modifierFillMaxHeight$default = SizeKt.fillMaxHeight$default(Background3.m4872backgroundbw27NRU$default(modifier4, BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).m21372getBg20d7_KjU(), null, 2, null), 0.0f, 1, null);
            composerStartRestartGroup.startReplaceGroup(-1224400529);
            boolean zChangedInstance = ((i5 & 14) == 4 || ((i5 & 8) != 0 && composerStartRestartGroup.changedInstance(components))) | ((i5 & 7168) == 2048) | ((57344 & i5) == 16384) | composerStartRestartGroup.changedInstance(chartActionHandler) | ((i5 & 234881024) == 67108864) | composerStartRestartGroup.changedInstance(listListOf);
            Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
            if (zChangedInstance || objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                Function1 function1 = new Function1() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return InvestmentsTrackerComponentRenderer.InvestmentsTrackerComponentRenderer$lambda$9$lambda$8(components, actionHandler, nativeActionHandler, chartActionHandler, onScrub, listListOf, (LazyListScope) obj);
                    }
                };
                composerStartRestartGroup.updateRememberedValue(function1);
                objRememberedValue3 = function1;
            }
            composerStartRestartGroup.endReplaceGroup();
            composer2 = composerStartRestartGroup;
            LazyDslKt.LazyColumn(modifierFillMaxHeight$default, lazyListStateRememberLazyListState, null, false, null, null, null, false, null, (Function1) objRememberedValue3, composer2, 0, 508);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
            composer2 = composerStartRestartGroup;
            modifier3 = modifier2;
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Modifier modifier5 = modifier3;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return InvestmentsTrackerComponentRenderer.InvestmentsTrackerComponentRenderer$lambda$10(components, i, i2, actionHandler, nativeActionHandler, chartActionHandler, onFirstVisibleItemChanged, onScrollOffsetChanges, onScrub, modifier5, i3, i4, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerComponentRenderer$lambda$9$lambda$8$lambda$7$lambda$4 */
    public static final boolean m2113x3e2ed084(SnapshotState<Boolean> snapshotState) {
        return snapshotState.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit InvestmentsTrackerComponentRenderer$lambda$9$lambda$8(final ImmutableList immutableList, final Function2 function2, final Function2 function22, final SduiActionHandler sduiActionHandler, final Function1 function1, final List list, LazyListScope LazyColumn) {
        Intrinsics.checkNotNullParameter(LazyColumn, "$this$LazyColumn");
        final Function2 function23 = new Function2() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return InvestmentsTrackerComponentRenderer.InvestmentsTrackerComponentRenderer$lambda$9$lambda$8$lambda$2(((Integer) obj).intValue(), (InvestmentsTrackerComponent) obj2);
            }
        };
        LazyColumn.items(immutableList.size(), new Function1<Integer, Object>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$lambda$9$lambda$8$$inlined$itemsIndexed$default$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                return function23.invoke(Integer.valueOf(i), immutableList.get(i));
            }
        }, new Function1<Integer, Object>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$lambda$9$lambda$8$$inlined$itemsIndexed$default$2
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Integer num) {
                return invoke(num.intValue());
            }

            public final Object invoke(int i) {
                immutableList.get(i);
                return null;
            }
        }, ComposableLambda3.composableLambdaInstance(-1091073711, true, new Function4<LazyItemScope, Integer, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$lambda$9$lambda$8$$inlined$itemsIndexed$default$3
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(4);
            }

            @Override // kotlin.jvm.functions.Function4
            public /* bridge */ /* synthetic */ Unit invoke(LazyItemScope lazyItemScope, Integer num, Composer composer, Integer num2) {
                invoke(lazyItemScope, num.intValue(), composer, num2.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(LazyItemScope lazyItemScope, int i, Composer composer, int i2) {
                int i3;
                Composer composer2 = composer;
                if ((i2 & 6) == 0) {
                    i3 = i2 | (composer2.changed(lazyItemScope) ? 4 : 2);
                } else {
                    i3 = i2;
                }
                if ((i2 & 48) == 0) {
                    i3 |= composer2.changed(i) ? 32 : 16;
                }
                if (!composer2.shouldExecute((i3 & 147) != 146, i3 & 1)) {
                    composer.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(-1091073711, i3, -1, "androidx.compose.foundation.lazy.itemsIndexed.<anonymous> (LazyDsl.kt:214)");
                }
                final InvestmentsTrackerComponent investmentsTrackerComponent = (InvestmentsTrackerComponent) immutableList.get(i);
                composer2.startReplaceGroup(-2117796435);
                if (investmentsTrackerComponent instanceof InvestmentsTrackerButtonViewModel) {
                    composer2.startReplaceGroup(70229828);
                    InvestmentsTrackerButton.InvestmentsTrackerButton((InvestmentsTrackerButtonViewModel) investmentsTrackerComponent, function2, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                    composer2.endReplaceGroup();
                } else if (investmentsTrackerComponent instanceof InvestmentsTrackerUpsellViewModel) {
                    composer2.startReplaceGroup(-2117577018);
                    InvestmentsTrackerUpsell.InvestmentsTrackerUpsell((InvestmentsTrackerUpsellViewModel) investmentsTrackerComponent, function2, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                    composer2.endReplaceGroup();
                } else if (investmentsTrackerComponent instanceof InvestmentsTrackerCategorySectionViewModel) {
                    composer2.startReplaceGroup(-2117246310);
                    InvestmentsTrackerCategorySection.InvestmentsTrackerCategorySection((InvestmentsTrackerCategorySectionViewModel) investmentsTrackerComponent, function2, function22, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (investmentsTrackerComponent instanceof ManageExternalAccountsViewModel) {
                    composer2.startReplaceGroup(-2116854966);
                    InvestmentsTrackerManageExternalAccounts.InvestmentsTrackerManageExternalAccounts((ManageExternalAccountsViewModel) investmentsTrackerComponent, function22, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                    composer2.endReplaceGroup();
                } else if (investmentsTrackerComponent instanceof InvestmentsTrackerPerformanceChartViewModel) {
                    composer2.startReplaceGroup(-2116494684);
                    InvestmentsTrackerPerformanceChart3.InvestmentsTrackerPerformanceChart((InvestmentsTrackerPerformanceChartViewModel) investmentsTrackerComponent, sduiActionHandler, function22, function1, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                    composer2 = composer2;
                    composer2.endReplaceGroup();
                } else if (investmentsTrackerComponent instanceof InvestmentsTrackerMetadataViewModel) {
                    composer2.startReplaceGroup(-2116047912);
                    InvestmentsTrackerMetadata4.InvestmentsTrackerMetadata((InvestmentsTrackerMetadataViewModel) investmentsTrackerComponent, function22, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer2, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer2, 0, 0);
                    composer2.endReplaceGroup();
                } else if (!(investmentsTrackerComponent instanceof InvestmentsTrackerCategoryPercentageViewModel)) {
                    if (investmentsTrackerComponent instanceof InvestmentsTrackerAllocationsBarViewModel) {
                        composer2.startReplaceGroup(-2114894309);
                        composer2.endReplaceGroup();
                    } else if (investmentsTrackerComponent instanceof InvestmentsTrackerDisclosureMarkdownViewModel) {
                        composer2.startReplaceGroup(-2114802270);
                        InvestmentsTrackerDisclosureMarkdownText.InvestmentsTrackerDisclosureMarkdownText((InvestmentsTrackerDisclosureMarkdownViewModel) investmentsTrackerComponent, null, composer2, 0, 2);
                        composer2.endReplaceGroup();
                    } else if (investmentsTrackerComponent instanceof InvestmentsTrackerUpsellCardViewModel) {
                        composer2.startReplaceGroup(-2114600181);
                        InvestmentsTrackerUpsellCard4.InvestmentsTrackerUpsellCard((InvestmentsTrackerUpsellCardViewModel) investmentsTrackerComponent, function22, null, composer2, 0, 4);
                        composer2.endReplaceGroup();
                    } else {
                        composer2.startReplaceGroup(-2114386932);
                        composer2.endReplaceGroup();
                    }
                } else {
                    composer2.startReplaceGroup(-2115687847);
                    composer2.startReplaceGroup(1849434622);
                    Object objRememberedValue = composer2.rememberedValue();
                    Composer.Companion companion = Composer.INSTANCE;
                    if (objRememberedValue == companion.getEmpty()) {
                        objRememberedValue = SnapshotState3.mutableStateOf$default(Boolean.TRUE, null, 2, null);
                        composer2.updateRememberedValue(objRememberedValue);
                    }
                    SnapshotState snapshotState = (SnapshotState) objRememberedValue;
                    composer2.endReplaceGroup();
                    composer2.startReplaceGroup(-1633490746);
                    boolean zChangedInstance = composer2.changedInstance(investmentsTrackerComponent);
                    Object objRememberedValue2 = composer2.rememberedValue();
                    if (zChangedInstance || objRememberedValue2 == companion.getEmpty()) {
                        objRememberedValue2 = new InvestmentsTrackerComponentRenderer4(investmentsTrackerComponent, snapshotState, null);
                        composer2.updateRememberedValue(objRememberedValue2);
                    }
                    composer2.endReplaceGroup();
                    EffectsKt.LaunchedEffect("animate", (Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object>) objRememberedValue2, composer2, 6);
                    boolean zM2113x3e2ed084 = InvestmentsTrackerComponentRenderer.m2113x3e2ed084(snapshotState);
                    EnterTransition enterTransitionExpandVertically$default = EnterExitTransitionKt.expandVertically$default(null, null, false, null, 15, null);
                    ExitTransition exitTransitionShrinkVertically$default = EnterExitTransitionKt.shrinkVertically$default(null, null, false, null, 15, null);
                    final Function2 function24 = function22;
                    AnimatedVisibilityKt.AnimatedVisibility(zM2113x3e2ed084, (Modifier) null, enterTransitionExpandVertically$default, exitTransitionShrinkVertically$default, (String) null, ComposableLambda3.rememberComposableLambda(-336215768, true, new Function3<AnimatedVisibilityScope, Composer, Integer, Unit>() { // from class: com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRendererKt$InvestmentsTrackerComponentRenderer$3$1$2$2
                        @Override // kotlin.jvm.functions.Function3
                        public /* bridge */ /* synthetic */ Unit invoke(AnimatedVisibilityScope animatedVisibilityScope, Composer composer3, Integer num) {
                            invoke(animatedVisibilityScope, composer3, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(AnimatedVisibilityScope AnimatedVisibility, Composer composer3, int i4) {
                            Intrinsics.checkNotNullParameter(AnimatedVisibility, "$this$AnimatedVisibility");
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-336215768, i4, -1, "com.robinhood.android.investmentstracker.composables.InvestmentsTrackerComponentRenderer.<anonymous>.<anonymous>.<anonymous>.<anonymous> (InvestmentsTrackerComponentRenderer.kt:155)");
                            }
                            InvestmentsTrackerCategoryPercentage4.InvestmentsTrackerCategoryPercentage((InvestmentsTrackerCategoryPercentageViewModel) investmentsTrackerComponent, function24, Background3.m4872backgroundbw27NRU$default(Modifier.INSTANCE, BentoTheme.INSTANCE.getColors(composer3, BentoTheme.$stable).m21371getBg0d7_KjU(), null, 2, null), composer3, 0, 0);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    }, composer2, 54), composer, 200064, 18);
                    composer2 = composer;
                    composer2.endReplaceGroup();
                }
                composer2.startReplaceGroup(70343941);
                if (!list.contains(Reflection.getOrCreateKotlinClass(investmentsTrackerComponent.getClass()))) {
                    Modifier.Companion companion2 = Modifier.INSTANCE;
                    BentoTheme bentoTheme = BentoTheme.INSTANCE;
                    int i4 = BentoTheme.$stable;
                    BentoDivider.m20635BentoHorizontalDivideraMcp0Q(SizeKt.m5156height3ABfNKs(companion2, bentoTheme.getSpacing(composer2, i4).m21595getXsmallD9Ej5fM()), bentoTheme.getColors(composer2, i4).m21372getBg20d7_KjU(), bentoTheme.getSpacing(composer2, i4).m21595getXsmallD9Ej5fM(), composer, 0, 0);
                }
                composer.endReplaceGroup();
                composer.endReplaceGroup();
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object InvestmentsTrackerComponentRenderer$lambda$9$lambda$8$lambda$2(int i, InvestmentsTrackerComponent item) {
        Intrinsics.checkNotNullParameter(item, "item");
        return item.getId();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: InvestmentsTrackerComponentRenderer$lambda$9$lambda$8$lambda$7$lambda$5 */
    public static final void m2114x3e2ed085(SnapshotState<Boolean> snapshotState, boolean z) {
        snapshotState.setValue(Boolean.valueOf(z));
    }
}
