package com.robinhood.android.sentry;

import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import okio.Path;

/* compiled from: CrashStore.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "Lio/sentry/SentryEvent;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
@DebugMetadata(m3644c = "com.robinhood.android.sentry.CrashStoreIntegration$readAll$2$2$1", m3645f = "CrashStore.kt", m3646l = {}, m3647m = "invokeSuspend")
/* renamed from: com.robinhood.android.sentry.CrashStoreIntegration$readAll$2$2$1, reason: use source file name */
/* loaded from: classes5.dex */
final class CrashStore4 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super SentryEvent>, Object> {
    final /* synthetic */ Path $path;
    int label;
    final /* synthetic */ CrashStore2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CrashStore4(CrashStore2 crashStore2, Path path, Continuation<? super CrashStore4> continuation) {
        super(2, continuation);
        this.this$0 = crashStore2;
        this.$path = path;
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new CrashStore4(this.this$0, this.$path, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(CoroutineScope coroutineScope, Continuation<? super SentryEvent> continuation) {
        return ((CrashStore4) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        return CrashStore2.INSTANCE.deserialize(this.this$0.fileSystem, this.$path, CrashStore2.eventDeserializer);
    }
}
