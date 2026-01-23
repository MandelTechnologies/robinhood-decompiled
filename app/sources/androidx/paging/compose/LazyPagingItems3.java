package androidx.paging.compose;

import androidx.paging.PagingData;
import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: LazyPagingItems.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u00032\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0005H\u008a@"}, m3636d2 = {"<anonymous>", "", "T", "", "it", "Landroidx/paging/PagingData;"}, m3637k = 3, m3638mv = {1, 8, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.paging.compose.LazyPagingItems$collectPagingData$2", m3645f = "LazyPagingItems.kt", m3646l = {EnumC7081g.f2780x600b66fe}, m3647m = "invokeSuspend")
/* renamed from: androidx.paging.compose.LazyPagingItems$collectPagingData$2, reason: use source file name */
/* loaded from: classes4.dex */
final class LazyPagingItems3<T> extends ContinuationImpl7 implements Function2<PagingData<T>, Continuation<? super Unit>, Object> {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ LazyPagingItems<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LazyPagingItems3(LazyPagingItems<T> lazyPagingItems, Continuation<? super LazyPagingItems3> continuation) {
        super(2, continuation);
        this.this$0 = lazyPagingItems;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        LazyPagingItems3 lazyPagingItems3 = new LazyPagingItems3(this.this$0, continuation);
        lazyPagingItems3.L$0 = obj;
        return lazyPagingItems3;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(PagingData<T> pagingData, Continuation<? super Unit> continuation) {
        return ((LazyPagingItems3) create(pagingData, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            PagingData<T> pagingData = (PagingData) this.L$0;
            LazyPagingItems4 lazyPagingItems4 = ((LazyPagingItems) this.this$0).pagingDataPresenter;
            this.label = 1;
            if (lazyPagingItems4.collectFrom(pagingData, this) == coroutine_suspended) {
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
}
