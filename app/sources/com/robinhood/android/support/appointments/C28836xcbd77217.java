package com.robinhood.android.support.appointments;

import androidx.compose.foundation.lazy.LazyListItemInfo;
import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: AppointmentsSchedulingDatetimePickerComposable.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DayOfWeekSelectorSection$2$1", m3645f = "AppointmentsSchedulingDatetimePickerComposable.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_NUMBER_SEARCH_VALUE}, m3647m = "invokeSuspend")
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.appointments.AppointmentsSchedulingDatetimePickerComposableKt$DayOfWeekSelectorSection$2$1 */
/* loaded from: classes9.dex */
final class C28836xcbd77217 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $listState;
    final /* synthetic */ Integer $selectedWeekIndex;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C28836xcbd77217(Integer num, LazyListState lazyListState, Continuation<? super C28836xcbd77217> continuation) {
        super(2, continuation);
        this.$selectedWeekIndex = num;
        this.$listState = lazyListState;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C28836xcbd77217(this.$selectedWeekIndex, this.$listState, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((C28836xcbd77217) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r4.animateScrollToItem(r5, r1, r10) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0079, code lost:
    
        if (androidx.compose.foundation.lazy.LazyListState.animateScrollToItem$default(r4, r5, 0, r10, 2, null) == r0) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x007b, code lost:
    
        return r0;
     */
    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object next;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Integer num = this.$selectedWeekIndex;
            if (num != null) {
                LazyListState lazyListState = this.$listState;
                int iIntValue = num.intValue();
                Iterator<T> it = lazyListState.getLayoutInfo().getVisibleItemsInfo().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((LazyListItemInfo) next).getIndex() == iIntValue) {
                        break;
                    }
                }
                LazyListItemInfo lazyListItemInfo = (LazyListItemInfo) next;
                if (lazyListItemInfo != null) {
                    int offset = lazyListItemInfo.getOffset() - ((((int) (lazyListState.getLayoutInfo().mo5206getViewportSizeYbymL2g() >> 32)) - lazyListItemInfo.getSize()) / 2);
                    this.label = 1;
                } else {
                    this.label = 2;
                }
            }
        } else {
            if (i != 1 && i != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
