package com.robinhood.android.plt.contract;

import android.view.View;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: Views.kt */
@Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.plt.contract.ViewsKt$trackLoadingStateForLoadingViews$1$job$1", m3645f = "Views.kt", m3646l = {23}, m3647m = "invokeSuspend")
/* loaded from: classes11.dex */
final class ViewsKt$trackLoadingStateForLoadingViews$1$job$1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
    final /* synthetic */ String $identifier;
    final /* synthetic */ PltManager $pltManager;
    final /* synthetic */ View $this_trackLoadingStateForLoadingViews;
    final /* synthetic */ Flow<Boolean> $visibilityFlow;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ViewsKt$trackLoadingStateForLoadingViews$1$job$1(Flow<Boolean> flow, View view, PltManager pltManager, String str, Continuation<? super ViewsKt$trackLoadingStateForLoadingViews$1$job$1> continuation) {
        super(2, continuation);
        this.$visibilityFlow = flow;
        this.$this_trackLoadingStateForLoadingViews = view;
        this.$pltManager = pltManager;
        this.$identifier = str;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new ViewsKt$trackLoadingStateForLoadingViews$1$job$1(this.$visibilityFlow, this.$this_trackLoadingStateForLoadingViews, this.$pltManager, this.$identifier, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
        return ((ViewsKt$trackLoadingStateForLoadingViews$1$job$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* compiled from: Views.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isVisible", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.plt.contract.ViewsKt$trackLoadingStateForLoadingViews$1$job$1$1", m3645f = "Views.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.plt.contract.ViewsKt$trackLoadingStateForLoadingViews$1$job$1$1 */
    static final class C255481 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $identifier;
        final /* synthetic */ PltManager $pltManager;
        final /* synthetic */ View $this_trackLoadingStateForLoadingViews;
        /* synthetic */ boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C255481(View view, PltManager pltManager, String str, Continuation<? super C255481> continuation) {
            super(2, continuation);
            this.$this_trackLoadingStateForLoadingViews = view;
            this.$pltManager = pltManager;
            this.$identifier = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C255481 c255481 = new C255481(this.$this_trackLoadingStateForLoadingViews, this.$pltManager, this.$identifier, continuation);
            c255481.Z$0 = ((Boolean) obj).booleanValue();
            return c255481;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
            return invoke(bool.booleanValue(), continuation);
        }

        public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
            return ((C255481) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            ViewsKt.recordLoadingState(this.$this_trackLoadingStateForLoadingViews, this.Z$0, this.$pltManager, this.$identifier);
            return Unit.INSTANCE;
        }
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i = this.label;
        if (i == 0) {
            ResultKt.throwOnFailure(obj);
            Flow<Boolean> flow = this.$visibilityFlow;
            C255481 c255481 = new C255481(this.$this_trackLoadingStateForLoadingViews, this.$pltManager, this.$identifier, null);
            this.label = 1;
            if (FlowKt.collectLatest(flow, c255481, this) == coroutine_suspended) {
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
