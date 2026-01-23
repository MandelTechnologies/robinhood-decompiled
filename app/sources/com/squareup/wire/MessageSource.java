package com.squareup.wire;

import java.io.Closeable;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: MessageSource.kt */
@Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u0000*\n\b\u0000\u0010\u0001 \u0001*\u00020\u00022\u00020\u0003J\u000f\u0010\u0004\u001a\u0004\u0018\u00018\u0000H&¢\u0006\u0002\u0010\u0005ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m3636d2 = {"Lcom/squareup/wire/MessageSource;", "T", "", "Ljava/io/Closeable;", "read", "()Ljava/lang/Object;", "wire-runtime"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public interface MessageSource<T> extends Closeable {
    T read() throws IOException;
}
