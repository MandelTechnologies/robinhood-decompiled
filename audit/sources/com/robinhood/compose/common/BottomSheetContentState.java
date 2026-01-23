package com.robinhood.compose.common;

import androidx.compose.material.ModalBottomSheetState;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.saveable.ListSaver;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.Saver5;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BottomSheetContentState.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u000b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 \u0014*\u0004\b\u0000\u0010\u00012\u00020\u0002:\u0001\u0014B\u0013\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00018\u0000¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0086@¢\u0006\u0002\u0010\u0012J\u0006\u0010\u0013\u001a\u00020\u000eR/\u0010\u0007\u001a\u0004\u0018\u00018\u00002\b\u0010\u0006\u001a\u0004\u0018\u00018\u00008F@BX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b\u000b\u0010\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0005¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/compose/common/BottomSheetContentState;", "T", "", "initialSheetContent", "<init>", "(Ljava/lang/Object;)V", "<set-?>", "sheetContent", "getSheetContent", "()Ljava/lang/Object;", "setSheetContent", "sheetContent$delegate", "Landroidx/compose/runtime/MutableState;", "show", "", "bottomSheetState", "Landroidx/compose/material/ModalBottomSheetState;", "content", "(Landroidx/compose/material/ModalBottomSheetState;Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reset", "Companion", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes15.dex */
public final class BottomSheetContentState<T> {
    public static final int $stable = 0;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final Saver<BottomSheetContentState<Object>, ?> SAVER = ListSaver.listSaver(new Function2() { // from class: com.robinhood.compose.common.BottomSheetContentState$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return BottomSheetContentState.SAVER$lambda$0((Saver5) obj, (BottomSheetContentState) obj2);
        }
    }, new Function1() { // from class: com.robinhood.compose.common.BottomSheetContentState$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return BottomSheetContentState.SAVER$lambda$1((List) obj);
        }
    });

    /* renamed from: sheetContent$delegate, reason: from kotlin metadata */
    private final SnapshotState sheetContent;

    /* compiled from: BottomSheetContentState.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.compose.common.BottomSheetContentState", m3645f = "BottomSheetContentState.kt", m3646l = {30, 33}, m3647m = "show")
    /* renamed from: com.robinhood.compose.common.BottomSheetContentState$show$1 */
    static final class C326751 extends ContinuationImpl {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BottomSheetContentState<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C326751(BottomSheetContentState<T> bottomSheetContentState, Continuation<? super C326751> continuation) {
            super(continuation);
            this.this$0 = bottomSheetContentState;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.show(null, null, this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public BottomSheetContentState() {
        DefaultConstructorMarker defaultConstructorMarker = null;
        this(defaultConstructorMarker, 1, defaultConstructorMarker);
    }

    public BottomSheetContentState(T t) {
        this.sheetContent = SnapshotState3.mutableStateOf$default(t, null, 2, null);
    }

    public /* synthetic */ BottomSheetContentState(Object obj, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : obj);
    }

    private final void setSheetContent(T t) {
        this.sheetContent.setValue(t);
    }

    public final T getSheetContent() {
        return this.sheetContent.getValue();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0062, code lost:
    
        if (r6.show(r0) == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object show(ModalBottomSheetState modalBottomSheetState, T t, Continuation<? super Unit> continuation) {
        C326751 c326751;
        if (continuation instanceof C326751) {
            c326751 = (C326751) continuation;
            int i = c326751.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c326751.label = i - Integer.MIN_VALUE;
            } else {
                c326751 = new C326751(this, continuation);
            }
        }
        Object obj = c326751.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c326751.label;
        if (i2 == 0) {
            ResultKt.throwOnFailure(obj);
            if (modalBottomSheetState.isVisible()) {
                c326751.L$0 = modalBottomSheetState;
                c326751.L$1 = t;
                c326751.label = 1;
                if (modalBottomSheetState.hide(c326751) != coroutine_suspended) {
                }
                return coroutine_suspended;
            }
        } else {
            if (i2 != 1) {
                if (i2 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            }
            t = (T) c326751.L$1;
            modalBottomSheetState = (ModalBottomSheetState) c326751.L$0;
            ResultKt.throwOnFailure(obj);
        }
        setSheetContent(t);
        c326751.L$0 = null;
        c326751.L$1 = null;
        c326751.label = 2;
    }

    public final void reset() {
        setSheetContent(null);
    }

    /* compiled from: BottomSheetContentState.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R#\u0010\u0004\u001a\u0014\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0006\u0012\u0002\b\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/compose/common/BottomSheetContentState$Companion;", "", "<init>", "()V", "SAVER", "Landroidx/compose/runtime/saveable/Saver;", "Lcom/robinhood/compose/common/BottomSheetContentState;", "getSAVER", "()Landroidx/compose/runtime/saveable/Saver;", "lib-compose-common_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final Saver<BottomSheetContentState<Object>, ?> getSAVER() {
            return BottomSheetContentState.SAVER;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List SAVER$lambda$0(Saver5 listSaver, BottomSheetContentState it) {
        Intrinsics.checkNotNullParameter(listSaver, "$this$listSaver");
        Intrinsics.checkNotNullParameter(it, "it");
        return CollectionsKt.listOf(it.getSheetContent());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final BottomSheetContentState SAVER$lambda$1(List it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new BottomSheetContentState(CollectionsKt.firstOrNull(it));
    }
}
