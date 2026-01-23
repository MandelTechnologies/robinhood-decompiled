package kotlinx.coroutines.flow;

import com.plaid.internal.EnumC7081g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlinx.coroutines.flow.SharingStarted4;

/* compiled from: SharingStarted.kt */
@Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "kotlinx.coroutines.flow.StartedLazily$command$1$1", m3645f = "SharingStarted.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_UPLOAD_VALUE}, m3647m = "emit")
/* renamed from: kotlinx.coroutines.flow.StartedLazily$command$1$1$emit$1, reason: use source file name */
/* loaded from: classes14.dex */
final class SharingStarted5 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SharingStarted4.C461201.AnonymousClass1<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    SharingStarted5(SharingStarted4.C461201.AnonymousClass1<? super T> anonymousClass1, Continuation<? super SharingStarted5> continuation) {
        super(continuation);
        this.this$0 = anonymousClass1;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.emit(0, this);
    }
}
