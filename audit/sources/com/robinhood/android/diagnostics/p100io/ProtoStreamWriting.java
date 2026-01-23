package com.robinhood.android.diagnostics.p100io;

import androidx.lifecycle.viewmodel.internal.ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0;
import com.squareup.wire.ProtoAdapter;
import java.io.IOException;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* compiled from: ProtoStreamWriting.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\b\u0012\u0004\u0012\u0002H\u00010\u0003B1\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003\u0012\u001a\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00028\u0000H\u0016¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\fH\u0016J\b\u0010\u0010\u001a\u00020\fH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00050\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\"\u0010\u0006\u001a\u0016\u0012\u0004\u0012\u00028\u0000\u0012\f\u0012\n\u0012\u0006\b\u0000\u0012\u00028\u00000\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/io/DelegatedProtoStreamWriter;", "E", "", "Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "bytesWriter", "Lokio/ByteString;", "getAdapter", "Lkotlin/Function1;", "Lcom/squareup/wire/ProtoAdapter;", "<init>", "(Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;Lkotlin/jvm/functions/Function1;)V", "write", "", "value", "(Ljava/lang/Object;)V", "flush", "close", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.io.DelegatedProtoStreamWriter, reason: use source file name */
/* loaded from: classes16.dex */
public final class ProtoStreamWriting<E> implements ProtoStreamWriting2<E> {
    private final ProtoStreamWriting2<ByteString> bytesWriter;
    private final Function1<E, ProtoAdapter<? super E>> getAdapter;

    /* JADX WARN: Multi-variable type inference failed */
    public ProtoStreamWriting(ProtoStreamWriting2<? super ByteString> bytesWriter, Function1<? super E, ? extends ProtoAdapter<? super E>> getAdapter) {
        Intrinsics.checkNotNullParameter(bytesWriter, "bytesWriter");
        Intrinsics.checkNotNullParameter(getAdapter, "getAdapter");
        this.bytesWriter = bytesWriter;
        this.getAdapter = getAdapter;
    }

    @Override // com.robinhood.android.diagnostics.p100io.ProtoStreamWriting2
    public void write(E value) throws IOException {
        Intrinsics.checkNotNullParameter(value, "value");
        this.bytesWriter.write(this.getAdapter.invoke(value).encodeByteString(value));
    }

    @Override // com.robinhood.android.diagnostics.p100io.ProtoStreamWriting2
    public void flush() throws IOException {
        this.bytesWriter.flush();
    }

    @Override // java.lang.AutoCloseable
    public void close() throws Exception {
        ViewModelImpl$$ExternalSyntheticAutoCloseableDispatcher0.m529m(this.bytesWriter);
    }
}
