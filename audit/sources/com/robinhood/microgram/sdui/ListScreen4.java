package com.robinhood.microgram.sdui;

import androidx.compose.foundation.lazy.LazyListState;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.shared.serverui.utils.UiObject;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import microgram.p507ui.p508v1.StandardScreenContentDto;

/* compiled from: ListScreen.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.microgram.sdui.ListScreenKt$Content$1$3$2$1$1", m3645f = "ListScreen.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_SUPPORT_VALUE}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.microgram.sdui.ListScreenKt$Content$1$3$2$1$1, reason: use source file name */
/* loaded from: classes13.dex */
final class ListScreen4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ LazyListState $lazyListState;
    final /* synthetic */ Function0<Unit> $onScrollRequestComplete;
    final /* synthetic */ UiObject<StandardScreen, StandardScreenContentDto> $screen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ListScreen4(LazyListState lazyListState, UiObject<StandardScreen, StandardScreenContentDto> uiObject, Function0<Unit> function0, Continuation<? super ListScreen4> continuation) {
        super(2, continuation);
        this.$lazyListState = lazyListState;
        this.$screen = uiObject;
        this.$onScrollRequestComplete = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ListScreen4(this.$lazyListState, this.$screen, this.$onScrollRequestComplete, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ListScreen4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        ListScreen4 listScreen4;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            LazyListState lazyListState = this.$lazyListState;
            int bodyLastIndex = StandardScreen4.getBodyLastIndex(this.$screen);
            this.label = 1;
            listScreen4 = this;
            if (LazyListState.animateScrollToItem$default(lazyListState, bodyLastIndex, 0, listScreen4, 2, null) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            listScreen4 = this;
        }
        listScreen4.$onScrollRequestComplete.invoke();
        return Unit.INSTANCE;
    }
}
