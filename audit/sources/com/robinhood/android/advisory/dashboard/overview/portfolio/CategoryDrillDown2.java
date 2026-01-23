package com.robinhood.android.advisory.dashboard.overview.portfolio;

import androidx.compose.foundation.gestures.AnchoredDraggableState;
import androidx.compose.runtime.SnapshotIntState2;
import androidx.compose.runtime.SnapshotStateKt;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CategoryDrillDown.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$4$1", m3645f = "CategoryDrillDown.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_NAVBAR_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$4$1, reason: use source file name */
/* loaded from: classes7.dex */
final class CategoryDrillDown2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ SnapshotIntState2 $activeAssetIndexWithoutWraparound$delegate;
    final /* synthetic */ AnchoredDraggableState<CategoryDrillDown5> $swipeState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategoryDrillDown2(AnchoredDraggableState<CategoryDrillDown5> anchoredDraggableState, SnapshotIntState2 snapshotIntState2, Continuation<? super CategoryDrillDown2> continuation) {
        super(2, continuation);
        this.$swipeState = anchoredDraggableState;
        this.$activeAssetIndexWithoutWraparound$delegate = snapshotIntState2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CategoryDrillDown2(this.$swipeState, this.$activeAssetIndexWithoutWraparound$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CategoryDrillDown2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            final AnchoredDraggableState<CategoryDrillDown5> anchoredDraggableState = this.$swipeState;
            Flow flowSnapshotFlow = SnapshotStateKt.snapshotFlow(new Function0() { // from class: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$4$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return CategoryDrillDown2.invokeSuspend$lambda$0(anchoredDraggableState);
                }
            });
            C87122 c87122 = new C87122(this.$activeAssetIndexWithoutWraparound$delegate, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowSnapshotFlow, c87122, this) == coroutine_suspended) {
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

    /* compiled from: CategoryDrillDown.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "state", "Lcom/robinhood/android/advisory/dashboard/overview/portfolio/SwipeState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$4$1$2", m3645f = "CategoryDrillDown.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$4$1$2 */
    static final class C87122 extends ContinuationImpl7 implements Function2<CategoryDrillDown5, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotIntState2 $activeAssetIndexWithoutWraparound$delegate;
        /* synthetic */ Object L$0;
        int label;

        /* compiled from: CategoryDrillDown.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.advisory.dashboard.overview.portfolio.CategoryDrillDownKt$CategoryDrillDown$4$1$2$WhenMappings */
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[CategoryDrillDown5.values().length];
                try {
                    iArr[CategoryDrillDown5.RESTING.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[CategoryDrillDown5.LEFT.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[CategoryDrillDown5.RIGHT.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C87122(SnapshotIntState2 snapshotIntState2, Continuation<? super C87122> continuation) {
            super(2, continuation);
            this.$activeAssetIndexWithoutWraparound$delegate = snapshotIntState2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C87122 c87122 = new C87122(this.$activeAssetIndexWithoutWraparound$delegate, continuation);
            c87122.L$0 = obj;
            return c87122;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CategoryDrillDown5 categoryDrillDown5, Continuation<? super Unit> continuation) {
            return ((C87122) create(categoryDrillDown5, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            int i = WhenMappings.$EnumSwitchMapping$0[((CategoryDrillDown5) this.L$0).ordinal()];
            if (i == 1) {
                Unit unit = Unit.INSTANCE;
            } else if (i == 2) {
                int intValue = this.$activeAssetIndexWithoutWraparound$delegate.getIntValue();
                this.$activeAssetIndexWithoutWraparound$delegate.setIntValue(intValue - 1);
                boxing.boxInt(intValue);
            } else if (i == 3) {
                int intValue2 = this.$activeAssetIndexWithoutWraparound$delegate.getIntValue();
                this.$activeAssetIndexWithoutWraparound$delegate.setIntValue(intValue2 + 1);
                boxing.boxInt(intValue2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CategoryDrillDown5 invokeSuspend$lambda$0(AnchoredDraggableState anchoredDraggableState) {
        return (CategoryDrillDown5) anchoredDraggableState.getCurrentValue();
    }
}
