package com.robinhood.android.redesign.feature.accounttab;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.redesign.accounttab.analytics.AccountTabAnalytics;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: AccountSelectorComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$7$1", m3645f = "AccountSelectorComposable.kt", m3646l = {513}, m3647m = "invokeSuspend")
/* loaded from: classes5.dex */
final class AccountSelectorComposableKt$AccountSelectorComposable$7$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $accountTabRowListState;
    final /* synthetic */ boolean $accountsLoading;
    final /* synthetic */ EventLogger $eventLogger;
    final /* synthetic */ SnapshotState<Boolean> $isProgrammaticallyScrollingTabRow$delegate;
    final /* synthetic */ PagerState $pagerState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AccountSelectorComposableKt$AccountSelectorComposable$7$1(PagerState pagerState, LazyListState lazyListState, boolean z, SnapshotState<Boolean> snapshotState, EventLogger eventLogger, Continuation<? super AccountSelectorComposableKt$AccountSelectorComposable$7$1> continuation) {
        super(2, continuation);
        this.$pagerState = pagerState;
        this.$accountTabRowListState = lazyListState;
        this.$accountsLoading = z;
        this.$isProgrammaticallyScrollingTabRow$delegate = snapshotState;
        this.$eventLogger = eventLogger;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new AccountSelectorComposableKt$AccountSelectorComposable$7$1(this.$pagerState, this.$accountTabRowListState, this.$accountsLoading, this.$isProgrammaticallyScrollingTabRow$delegate, this.$eventLogger, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((AccountSelectorComposableKt$AccountSelectorComposable$7$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final PagerState pagerState = this.$pagerState;
            final LazyListState lazyListState = this.$accountTabRowListState;
            final boolean z = this.$accountsLoading;
            final SnapshotState<Boolean> snapshotState = this.$isProgrammaticallyScrollingTabRow$delegate;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$7$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return AccountSelectorComposableKt$AccountSelectorComposable$7$1.invokeSuspend$lambda$0(pagerState, lazyListState, z, snapshotState);
                }
            });
            final EventLogger eventLogger = this.$eventLogger;
            FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.redesign.feature.accounttab.AccountSelectorComposableKt$AccountSelectorComposable$7$1.2
                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                    return emit((Tuples2<Boolean, Boolean>) obj2, (Continuation<? super Unit>) continuation);
                }

                public final Object emit(Tuples2<Boolean, Boolean> tuples2, Continuation<? super Unit> continuation) {
                    boolean zBooleanValue = tuples2.component1().booleanValue();
                    boolean zBooleanValue2 = tuples2.component2().booleanValue();
                    if (zBooleanValue && !zBooleanValue2) {
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventData.copy$default(AccountTabAnalytics.INSTANCE.getUserEventData(), UserInteractionEventData.EventType.SWIPE, null, new Component(null, AccountTabAnalytics.IDENTIFIER_PAGE, null, 5, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), false, false, 6, null);
                    } else if (zBooleanValue2 && !zBooleanValue) {
                        EventLogger.DefaultImpls.logUserInteractionEvent$default(eventLogger, UserInteractionEventData.copy$default(AccountTabAnalytics.INSTANCE.getUserEventData(), UserInteractionEventData.EventType.DRAG, null, new Component(Component.ComponentType.TAB, AccountTabAnalytics.IDENTIFIER_ACCOUNT_SELECTOR, null, 4, null), null, null, null, null, EnumC7081g.SDK_ASSET_ILLUSTRATION_DEPOSIT_VALUE, null), false, false, 6, null);
                    }
                    return Unit.INSTANCE;
                }
            };
            this.label = 1;
            if (flowSnapshotFlow.collect(flowCollector, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Tuples2 invokeSuspend$lambda$0(PagerState pagerState, LazyListState lazyListState, boolean z, SnapshotState snapshotState) {
        boolean zIsScrollInProgress = pagerState.isScrollInProgress();
        boolean z2 = lazyListState.isScrollInProgress() && !AccountSelectorComposableKt.AccountSelectorComposable$lambda$44(snapshotState);
        if (z) {
            Boolean bool = Boolean.FALSE;
            return Tuples4.m3642to(bool, bool);
        }
        return Tuples4.m3642to(Boolean.valueOf(zIsScrollInProgress), Boolean.valueOf(z2));
    }
}
