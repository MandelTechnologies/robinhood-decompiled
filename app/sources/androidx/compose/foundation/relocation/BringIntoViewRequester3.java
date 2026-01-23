package androidx.compose.foundation.relocation;

import androidx.compose.p011ui.geometry.Rect;
import androidx.compose.p011ui.relocation.BringIntoViewModifierNode2;
import androidx.compose.runtime.collection.MutableVector;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BringIntoViewRequester.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0018\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bH\u0096@¢\u0006\u0002\u0010\fR\u0017\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\r"}, m3636d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterImpl;", "Landroidx/compose/foundation/relocation/BringIntoViewRequester;", "()V", "nodes", "Landroidx/compose/runtime/collection/MutableVector;", "Landroidx/compose/foundation/relocation/BringIntoViewRequesterNode;", "getNodes", "()Landroidx/compose/runtime/collection/MutableVector;", "bringIntoView", "", "rect", "Landroidx/compose/ui/geometry/Rect;", "(Landroidx/compose/ui/geometry/Rect;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "foundation_release"}, m3637k = 1, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl, reason: use source file name */
/* loaded from: classes.dex */
final class BringIntoViewRequester3 implements BringIntoViewRequester {
    private final MutableVector<BringIntoViewRequester6> nodes = new MutableVector<>(new BringIntoViewRequester6[16], 0);

    /* compiled from: BringIntoViewRequester.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "androidx.compose.foundation.relocation.BringIntoViewRequesterImpl", m3645f = "BringIntoViewRequester.kt", m3646l = {100}, m3647m = "bringIntoView")
    /* renamed from: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$1 */
    static final class C13161 extends ContinuationImpl {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        C13161(Continuation<? super C13161> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return BringIntoViewRequester3.this.bringIntoView(null, this);
        }
    }

    public final MutableVector<BringIntoViewRequester6> getNodes() {
        return this.nodes;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x0069 -> B:19:0x006c). Please report as a decompilation issue!!! */
    @Override // androidx.compose.foundation.relocation.BringIntoViewRequester
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object bringIntoView(Rect rect, Continuation<? super Unit> continuation) {
        C13161 c13161;
        final Rect rect2;
        int i;
        Object[] objArr;
        int i2;
        if (continuation instanceof C13161) {
            c13161 = (C13161) continuation;
            int i3 = c13161.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                c13161.label = i3 - Integer.MIN_VALUE;
            } else {
                c13161 = new C13161(continuation);
            }
        }
        Object obj = c13161.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i4 = c13161.label;
        if (i4 == 0) {
            ResultKt.throwOnFailure(obj);
            MutableVector<BringIntoViewRequester6> mutableVector = this.nodes;
            BringIntoViewRequester6[] bringIntoViewRequester6Arr = mutableVector.content;
            int size = mutableVector.getSize();
            rect2 = rect;
            i = size;
            objArr = bringIntoViewRequester6Arr;
            i2 = 0;
            if (i2 < i) {
            }
        } else {
            if (i4 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = c13161.I$1;
            i2 = c13161.I$0;
            objArr = (Object[]) c13161.L$1;
            Rect rect3 = (Rect) c13161.L$0;
            ResultKt.throwOnFailure(obj);
            rect2 = rect3;
            i2++;
            if (i2 < i) {
                BringIntoViewRequester6 bringIntoViewRequester6 = (BringIntoViewRequester6) objArr[i2];
                Function0<Rect> function0 = new Function0<Rect>() { // from class: androidx.compose.foundation.relocation.BringIntoViewRequesterImpl$bringIntoView$2$1
                    {
                        super(0);
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // kotlin.jvm.functions.Function0
                    public final Rect invoke() {
                        return rect2;
                    }
                };
                c13161.L$0 = rect2;
                c13161.L$1 = objArr;
                c13161.I$0 = i2;
                c13161.I$1 = i;
                c13161.label = 1;
                if (BringIntoViewModifierNode2.bringIntoView(bringIntoViewRequester6, function0, c13161) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i2++;
                if (i2 < i) {
                    return Unit.INSTANCE;
                }
            }
        }
    }
}
