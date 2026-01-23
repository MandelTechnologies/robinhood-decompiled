package com.robinhood.android.common.composebottomsheet;

import androidx.compose.material3.SheetState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job4;

/* compiled from: RhModalBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0016\u0010\u000b\u001a\u00020\f2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\b0\u0007J\u0016\u0010\u000e\u001a\u00020\f2\u000e\b\u0002\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\b0\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m3636d2 = {"Lcom/robinhood/android/common/composebottomsheet/RhModalBottomSheetScope;", "", "sheetState", "Landroidx/compose/material3/SheetState;", "coroutineScope", "Lkotlinx/coroutines/CoroutineScope;", "onDismissRequest", "Lkotlin/Function0;", "", "<init>", "(Landroidx/compose/material3/SheetState;Lkotlinx/coroutines/CoroutineScope;Lkotlin/jvm/functions/Function0;)V", "showBottomSheet", "Lkotlinx/coroutines/DisposableHandle;", "onShow", "hideBottomSheet", "onHide", "lib-compose-bottom-sheet_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope, reason: use source file name */
/* loaded from: classes2.dex */
public final class RhModalBottomSheet5 {
    public static final int $stable = 8;
    private final CoroutineScope coroutineScope;
    private final Function0<Unit> onDismissRequest;
    private final SheetState sheetState;

    public RhModalBottomSheet5(SheetState sheetState, CoroutineScope coroutineScope, Function0<Unit> onDismissRequest) {
        Intrinsics.checkNotNullParameter(sheetState, "sheetState");
        Intrinsics.checkNotNullParameter(coroutineScope, "coroutineScope");
        Intrinsics.checkNotNullParameter(onDismissRequest, "onDismissRequest");
        this.sheetState = sheetState;
        this.coroutineScope = coroutineScope;
        this.onDismissRequest = onDismissRequest;
    }

    /* compiled from: RhModalBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope$showBottomSheet$2", m3645f = "RhModalBottomSheet.kt", m3646l = {78}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope$showBottomSheet$2 */
    static final class C110832 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C110832(Continuation<? super C110832> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhModalBottomSheet5.this.new C110832(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C110832) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SheetState sheetState = RhModalBottomSheet5.this.sheetState;
                this.label = 1;
                if (sheetState.show(this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job4 showBottomSheet$default(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = new Function0() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Unit.INSTANCE;
                }
            };
        }
        return rhModalBottomSheet5.showBottomSheet(function0);
    }

    public final Job4 showBottomSheet(final Function0<Unit> onShow) {
        Intrinsics.checkNotNullParameter(onShow, "onShow");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C110832(null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhModalBottomSheet5.showBottomSheet$lambda$1(onShow, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit showBottomSheet$lambda$1(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }

    /* compiled from: RhModalBottomSheet.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope$hideBottomSheet$1", m3645f = "RhModalBottomSheet.kt", m3646l = {84}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope$hideBottomSheet$1 */
    static final class C110821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C110821(Continuation<? super C110821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return RhModalBottomSheet5.this.new C110821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C110821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SheetState sheetState = RhModalBottomSheet5.this.sheetState;
                this.label = 1;
                if (sheetState.hide(this) == coroutine_suspended) {
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

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Job4 hideBottomSheet$default(RhModalBottomSheet5 rhModalBottomSheet5, Function0 function0, int i, Object obj) {
        if ((i & 1) != 0) {
            function0 = rhModalBottomSheet5.onDismissRequest;
        }
        return rhModalBottomSheet5.hideBottomSheet(function0);
    }

    public final Job4 hideBottomSheet(final Function0<Unit> onHide) {
        Intrinsics.checkNotNullParameter(onHide, "onHide");
        return BuildersKt__Builders_commonKt.launch$default(this.coroutineScope, null, null, new C110821(null), 3, null).invokeOnCompletion(new Function1() { // from class: com.robinhood.android.common.composebottomsheet.RhModalBottomSheetScope$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RhModalBottomSheet5.hideBottomSheet$lambda$2(onHide, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit hideBottomSheet$lambda$2(Function0 function0, Throwable th) {
        function0.invoke();
        return Unit.INSTANCE;
    }
}
