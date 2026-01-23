package com.robinhood.android.diagnostics.event;

import com.robinhood.android.diagnostics.annotation.DiagnosticsBytesAdapter;
import com.robinhood.android.diagnostics.event.DiagnosticEventLoader2;
import com.robinhood.android.diagnostics.p100io.ProtoStream;
import com.robinhood.android.diagnostics.p100io.ProtoStreamReading;
import com.squareup.wire.ProtoAdapter;
import dispatch.core.Suspend;
import java.io.File;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.p481io.Closeable;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.CoroutineScope;
import okio.BufferedSource;
import okio.ByteString;
import okio.Okio;

/* compiled from: DiagnosticEventLoader.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0001\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001c\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\fR\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/event/RealDiagnosticEventLoader;", "Lcom/robinhood/android/diagnostics/event/DiagnosticEventLoader;", "diagnosticsBytesAdapter", "Lcom/squareup/wire/ProtoAdapter;", "Lokio/ByteString;", "<init>", "(Lcom/squareup/wire/ProtoAdapter;)V", "read", "", "Lcom/robinhood/android/diagnostics/event/DiagnosticEvent;", "file", "Ljava/io/File;", "(Ljava/io/File;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.event.RealDiagnosticEventLoader, reason: use source file name */
/* loaded from: classes16.dex */
public final class DiagnosticEventLoader2 implements DiagnosticEventLoader {
    private final ProtoAdapter<ByteString> diagnosticsBytesAdapter;

    public DiagnosticEventLoader2(@DiagnosticsBytesAdapter ProtoAdapter<ByteString> diagnosticsBytesAdapter) {
        Intrinsics.checkNotNullParameter(diagnosticsBytesAdapter, "diagnosticsBytesAdapter");
        this.diagnosticsBytesAdapter = diagnosticsBytesAdapter;
    }

    /* compiled from: DiagnosticEventLoader.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "Lcom/robinhood/android/diagnostics/event/DiagnosticEvent;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.event.RealDiagnosticEventLoader$read$2", m3645f = "DiagnosticEventLoader.kt", m3646l = {}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.diagnostics.event.RealDiagnosticEventLoader$read$2 */
    static final class C140332 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super List<? extends DiagnosticEvent>>, Object> {
        final /* synthetic */ File $file;
        int label;
        final /* synthetic */ DiagnosticEventLoader2 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C140332(File file, DiagnosticEventLoader2 diagnosticEventLoader2, Continuation<? super C140332> continuation) {
            super(2, continuation);
            this.$file = file;
            this.this$0 = diagnosticEventLoader2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C140332(this.$file, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super List<? extends DiagnosticEvent>> continuation) {
            return invoke2(coroutineScope, (Continuation<? super List<DiagnosticEvent>>) continuation);
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super List<DiagnosticEvent>> continuation) {
            return ((C140332) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            BufferedSource bufferedSourceBuffer = Okio.buffer(Okio.source(this.$file));
            try {
                List list = SequencesKt.toList(SequencesKt.flatMap(ProtoStreamReading.messageStreamSequence(bufferedSourceBuffer, ProtoStream.class, (ProtoAdapter<ByteString>) this.this$0.diagnosticsBytesAdapter), new Function1() { // from class: com.robinhood.android.diagnostics.event.RealDiagnosticEventLoader$read$2$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return DiagnosticEventLoader2.C140332.invokeSuspend$lambda$2$lambda$1((ProtoStream) obj2);
                    }
                }));
                Closeable.closeFinally(bufferedSourceBuffer, null);
                return list;
            } finally {
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Sequence invokeSuspend$lambda$2$lambda$1(ProtoStream protoStream) {
            return SequencesKt.map(CollectionsKt.asSequence(protoStream.getEntries()), new Function1() { // from class: com.robinhood.android.diagnostics.event.RealDiagnosticEventLoader$read$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return DiagnosticEventLoader2.C140332.invokeSuspend$lambda$2$lambda$1$lambda$0((ByteString) obj);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final DiagnosticEvent invokeSuspend$lambda$2$lambda$1$lambda$0(ByteString byteString) {
            return DiagnosticEvent.ADAPTER.decode(byteString);
        }
    }

    @Override // com.robinhood.android.diagnostics.event.DiagnosticEventLoader
    public Object read(File file, Continuation<? super List<DiagnosticEvent>> continuation) {
        return Suspend.withIO$default(null, new C140332(file, this, null), continuation, 1, null);
    }
}
