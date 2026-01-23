package com.robinhood.android.diagnostics.p100io;

import java.io.IOException;
import kotlin.Metadata;

/* compiled from: ProtoStreamWriting.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0000*\u00020\u00022\u00060\u0003j\u0002`\u0004J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00028\u0000H'¢\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\u0006H'¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/diagnostics/io/ProtoStreamWriter;", "E", "", "Ljava/lang/AutoCloseable;", "Lkotlin/AutoCloseable;", "write", "", "value", "(Ljava/lang/Object;)V", "flush", "lib-diagnostics_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.diagnostics.io.ProtoStreamWriter, reason: use source file name */
/* loaded from: classes16.dex */
public interface ProtoStreamWriting2<E> extends AutoCloseable {
    void flush() throws IOException;

    void write(E value) throws IOException;
}
