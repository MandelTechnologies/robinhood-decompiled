package com.robinhood.android.diagnostics.p100io;

import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl5;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceBuilder2;
import kotlin.sequences.SequencesKt;
import okio.BufferedSource;
import okio.ByteString;

/* compiled from: ProtoStreamReading.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006\u001a7\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0012\b\u0000\u0010\u0002\u0018\u0001*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b*\u00020\u00042\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006H\u0086\b\u001a@\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b*\u00020\u00042\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u0002H\u00020\f2\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006\u001a@\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0010\b\u0000\u0010\u0002*\n\u0012\u0002\b\u0003\u0012\u0002\b\u00030\b*\u00020\u00042\f\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u00062\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0006¨\u0006\u000e"}, m3636d2 = {"protoStreamSequence", "Lkotlin/sequences/Sequence;", "E", "", "Lokio/BufferedSource;", "adapter", "Lcom/squareup/wire/ProtoAdapter;", "messageStreamSequence", "Lcom/squareup/wire/Message;", "bytesAdapter", "Lokio/ByteString;", "clazz", "Ljava/lang/Class;", "messageAdapter", "lib-diagnostics_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.io.ProtoStreamReadingKt, reason: use source file name */
/* loaded from: classes16.dex */
public final class ProtoStreamReading {

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: ProtoStreamReading.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "", "E", "", "Lkotlin/sequences/SequenceScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.diagnostics.io.ProtoStreamReadingKt$protoStreamSequence$1", m3645f = "ProtoStreamReading.kt", m3646l = {22}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.diagnostics.io.ProtoStreamReadingKt$protoStreamSequence$1 */
    static final class C140411<E> extends ContinuationImpl5 implements Function2<SequenceBuilder2<? super E>, Continuation<? super Unit>, Object> {
        final /* synthetic */ ProtoAdapter<E> $adapter;
        final /* synthetic */ BufferedSource $this_protoStreamSequence;
        long J$0;
        private /* synthetic */ Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C140411(BufferedSource bufferedSource, ProtoAdapter<E> protoAdapter, Continuation<? super C140411> continuation) {
            super(2, continuation);
            this.$this_protoStreamSequence = bufferedSource;
            this.$adapter = protoAdapter;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C140411 c140411 = new C140411(this.$this_protoStreamSequence, this.$adapter, continuation);
            c140411.L$0 = obj;
            return c140411;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceBuilder2<? super E> sequenceBuilder2, Continuation<? super Unit> continuation) {
            return ((C140411) create(sequenceBuilder2, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws IOException {
            SequenceBuilder2 sequenceBuilder2;
            ProtoReader protoReader;
            ProtoAdapter<E> protoAdapter;
            long j;
            ProtoReader protoReader2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceBuilder2 sequenceBuilder22 = (SequenceBuilder2) this.L$0;
                ProtoReader protoReader3 = new ProtoReader(this.$this_protoStreamSequence);
                ProtoAdapter<E> protoAdapter2 = this.$adapter;
                long jBeginMessage = protoReader3.beginMessage();
                sequenceBuilder2 = sequenceBuilder22;
                protoReader = protoReader3;
                protoAdapter = protoAdapter2;
                j = jBeginMessage;
                protoReader2 = protoReader;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j = this.J$0;
                protoAdapter = (ProtoAdapter) this.L$3;
                protoReader2 = (ProtoReader) this.L$2;
                protoReader = (ProtoReader) this.L$1;
                sequenceBuilder2 = (SequenceBuilder2) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            while (true) {
                int iNextTag = protoReader2.nextTag();
                if (iNextTag == -1) {
                    protoReader2.endMessageAndGetUnknownFields(j);
                    return Unit.INSTANCE;
                }
                if (iNextTag == 1) {
                    E eDecode = protoAdapter.decode(protoReader);
                    this.L$0 = sequenceBuilder2;
                    this.L$1 = protoReader;
                    this.L$2 = protoReader2;
                    this.L$3 = protoAdapter;
                    this.J$0 = j;
                    this.label = 1;
                    if (sequenceBuilder2.yield(eDecode, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    protoReader.skip();
                }
            }
        }
    }

    public static final <E> Sequence<E> protoStreamSequence(BufferedSource bufferedSource, ProtoAdapter<E> adapter) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(adapter, "adapter");
        return SequencesKt.sequence(new C140411(bufferedSource, adapter, null));
    }

    public static /* synthetic */ Sequence messageStreamSequence$default(BufferedSource bufferedSource, ProtoAdapter bytesAdapter, int i, Object obj) throws IOException {
        if ((i & 1) != 0) {
            bytesAdapter = ProtoAdapter.BYTES;
        }
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        Intrinsics.reifiedOperationMarker(4, "E");
        return messageStreamSequence(bufferedSource, Message.class, (ProtoAdapter<ByteString>) bytesAdapter);
    }

    public static final /* synthetic */ <E extends Message<?, ?>> Sequence<E> messageStreamSequence(BufferedSource bufferedSource, ProtoAdapter<ByteString> bytesAdapter) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        Intrinsics.reifiedOperationMarker(4, "E");
        return messageStreamSequence(bufferedSource, Message.class, bytesAdapter);
    }

    public static /* synthetic */ Sequence messageStreamSequence$default(BufferedSource bufferedSource, Class cls, ProtoAdapter protoAdapter, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            protoAdapter = ProtoAdapter.BYTES;
        }
        return messageStreamSequence(bufferedSource, cls, (ProtoAdapter<ByteString>) protoAdapter);
    }

    public static final <E extends Message<?, ?>> Sequence<E> messageStreamSequence(BufferedSource bufferedSource, Class<E> clazz, ProtoAdapter<ByteString> bytesAdapter) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(clazz, "clazz");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        return messageStreamSequence(bufferedSource, ProtoAdapter.INSTANCE.get(clazz), bytesAdapter);
    }

    /* JADX INFO: Add missing generic type declarations: [E] */
    /* compiled from: ProtoStreamReading.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.diagnostics.io.ProtoStreamReadingKt$messageStreamSequence$1 */
    /* synthetic */ class C140401<E> extends FunctionReferenceImpl implements Function1<ByteString, E> {
        C140401(Object obj) {
            super(1, obj, ProtoAdapter.class, "decode", "decode(Lokio/ByteString;)Ljava/lang/Object;", 0);
        }

        /* JADX WARN: Incorrect return type in method signature: (Lokio/ByteString;)TE; */
        @Override // kotlin.jvm.functions.Function1
        public final Message invoke(ByteString p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            return (Message) ((ProtoAdapter) this.receiver).decode(p0);
        }
    }

    public static /* synthetic */ Sequence messageStreamSequence$default(BufferedSource bufferedSource, ProtoAdapter protoAdapter, ProtoAdapter protoAdapter2, int i, Object obj) throws IOException {
        if ((i & 2) != 0) {
            protoAdapter2 = ProtoAdapter.BYTES;
        }
        return messageStreamSequence(bufferedSource, protoAdapter, (ProtoAdapter<ByteString>) protoAdapter2);
    }

    public static final <E extends Message<?, ?>> Sequence<E> messageStreamSequence(BufferedSource bufferedSource, ProtoAdapter<E> messageAdapter, ProtoAdapter<ByteString> bytesAdapter) throws IOException {
        Intrinsics.checkNotNullParameter(bufferedSource, "<this>");
        Intrinsics.checkNotNullParameter(messageAdapter, "messageAdapter");
        Intrinsics.checkNotNullParameter(bytesAdapter, "bytesAdapter");
        return SequencesKt.map(protoStreamSequence(bufferedSource, bytesAdapter), new C140401(messageAdapter));
    }
}
