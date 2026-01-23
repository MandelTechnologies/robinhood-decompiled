package com.robinhood.shared.store.lists.store;

import com.robinhood.models.PaginatedResult;
import com.robinhood.models.api.ApiCuratedListItem;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.flow.FlowCollector;

/* compiled from: CuratedListItemsStore.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\u0010\u0000\u001a\u00020\u0001*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0005\u001a\u00020\u0006H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/models/PaginatedResult;", "Lcom/robinhood/models/api/ApiCuratedListItem;", "t", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.shared.store.lists.store.CuratedListItemsStore$refreshListItems$completable$1", m3645f = "CuratedListItemsStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.shared.store.lists.store.CuratedListItemsStore$refreshListItems$completable$1, reason: use source file name */
/* loaded from: classes6.dex */
final class CuratedListItemsStore5 extends ContinuationImpl7 implements Function3<FlowCollector<? super PaginatedResult<? extends ApiCuratedListItem>>, Throwable, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;

    CuratedListItemsStore5(Continuation<? super CuratedListItemsStore5> continuation) {
        super(3, continuation);
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Object invoke(FlowCollector<? super PaginatedResult<? extends ApiCuratedListItem>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        return invoke2((FlowCollector<? super PaginatedResult<ApiCuratedListItem>>) flowCollector, th, continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(FlowCollector<? super PaginatedResult<ApiCuratedListItem>> flowCollector, Throwable th, Continuation<? super Unit> continuation) {
        CuratedListItemsStore5 curatedListItemsStore5 = new CuratedListItemsStore5(continuation);
        curatedListItemsStore5.L$0 = th;
        return curatedListItemsStore5.invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) throws Throwable {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        Throwable th = (Throwable) this.L$0;
        if (!Throwables.isNetworkRelated(th)) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, th, false, null, 4, null);
            throw th;
        }
        throw th;
    }
}
