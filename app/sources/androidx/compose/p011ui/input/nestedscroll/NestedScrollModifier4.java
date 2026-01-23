package androidx.compose.p011ui.input.nestedscroll;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NestedScrollModifier.kt */
@Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher", m3645f = "NestedScrollModifier.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_ACCOUNT_CIRCLE_VALUE, 225}, m3647m = "dispatchPostFling-RZ2iAVY")
/* renamed from: androidx.compose.ui.input.nestedscroll.NestedScrollDispatcher$dispatchPostFling$1, reason: use source file name */
/* loaded from: classes4.dex */
final class NestedScrollModifier4 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NestedScrollModifier2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NestedScrollModifier4(NestedScrollModifier2 nestedScrollModifier2, Continuation<? super NestedScrollModifier4> continuation) {
        super(continuation);
        this.this$0 = nestedScrollModifier2;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.m7128dispatchPostFlingRZ2iAVY(0L, 0L, this);
    }
}
