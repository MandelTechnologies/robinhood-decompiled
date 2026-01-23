package com.robinhood.android.lists.p173ui.rhlist;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDuxo;
import com.robinhood.android.lists.p173ui.rhlist.CuratedListRhListDuxo2;
import com.robinhood.android.optionsexperiment.Experiments;
import com.robinhood.coroutines.flow.Operators;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: CuratedListRhListDuxo.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onCreate$1$1", m3645f = "CuratedListRhListDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEV_RAISE_INSTITUTION_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onCreate$1$1, reason: use source file name */
/* loaded from: classes8.dex */
final class CuratedListRhListDuxo2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ CuratedListRhListDuxo.FilterSet $filterSet;
    int label;
    final /* synthetic */ CuratedListRhListDuxo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CuratedListRhListDuxo2(CuratedListRhListDuxo.FilterSet filterSet, CuratedListRhListDuxo curatedListRhListDuxo, Continuation<? super CuratedListRhListDuxo2> continuation) {
        super(2, continuation);
        this.$filterSet = filterSet;
        this.this$0 = curatedListRhListDuxo;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CuratedListRhListDuxo2(this.$filterSet, this.this$0, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((CuratedListRhListDuxo2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow flowCombine = Operators.combine(this.$filterSet.getShowFilterSet(), ExperimentsProvider.DefaultImpls.streamStateFlow$default(this.this$0.experimentsStore, new Experiment[]{Experiments.IndexOptionsExtendedHoursCurb.INSTANCE}, false, null, 6, null));
            C208771 c208771 = new C208771(this.this$0, this.$filterSet, null);
            this.label = 1;
            if (FlowKt.collectLatest(flowCombine, c208771, this) == coroutine_suspended) {
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

    /* compiled from: CuratedListRhListDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0012\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00040\u0003H\n"}, m3636d2 = {"<anonymous>", "", "<destruct>", "Lkotlin/Pair;", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onCreate$1$1$1", m3645f = "CuratedListRhListDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onCreate$1$1$1 */
    static final class C208771 extends ContinuationImpl7 implements Function2<Tuples2<? extends Boolean, ? extends Boolean>, Continuation<? super Unit>, Object> {
        final /* synthetic */ CuratedListRhListDuxo.FilterSet $filterSet;
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ CuratedListRhListDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C208771(CuratedListRhListDuxo curatedListRhListDuxo, CuratedListRhListDuxo.FilterSet filterSet, Continuation<? super C208771> continuation) {
            super(2, continuation);
            this.this$0 = curatedListRhListDuxo;
            this.$filterSet = filterSet;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C208771 c208771 = new C208771(this.this$0, this.$filterSet, continuation);
            c208771.L$0 = obj;
            return c208771;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Tuples2<? extends Boolean, ? extends Boolean> tuples2, Continuation<? super Unit> continuation) {
            return invoke2((Tuples2<Boolean, Boolean>) tuples2, continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(Tuples2<Boolean, Boolean> tuples2, Continuation<? super Unit> continuation) {
            return ((C208771) create(tuples2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            Tuples2 tuples2 = (Tuples2) this.L$0;
            final boolean zBooleanValue = ((Boolean) tuples2.component1()).booleanValue();
            final boolean zBooleanValue2 = ((Boolean) tuples2.component2()).booleanValue();
            final CuratedListRhListDuxo curatedListRhListDuxo = this.this$0;
            final CuratedListRhListDuxo.FilterSet filterSet = this.$filterSet;
            curatedListRhListDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.lists.ui.rhlist.CuratedListRhListDuxo$onCreate$1$1$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return CuratedListRhListDuxo2.C208771.invokeSuspend$lambda$0(curatedListRhListDuxo, filterSet, zBooleanValue, zBooleanValue2, (CuratedListRhListViewState) obj2);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CuratedListRhListViewState invokeSuspend$lambda$0(CuratedListRhListDuxo curatedListRhListDuxo, CuratedListRhListDuxo.FilterSet filterSet, boolean z, boolean z2, CuratedListRhListViewState curatedListRhListViewState) {
            return CuratedListRhListViewState.copy$default(curatedListRhListViewState, null, null, 0, false, null, null, null, null, null, null, false, null, null, null, null, null, false, false, null, curatedListRhListDuxo.mutateFilters$feature_lists_externalDebug(curatedListRhListViewState.getFilters(), filterSet, z, z2), 524287, null);
        }
    }
}
