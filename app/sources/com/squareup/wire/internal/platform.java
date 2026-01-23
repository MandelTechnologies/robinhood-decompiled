package com.squareup.wire.internal;

import com.squareup.wire.GrpcResponse;
import java.io.IOException;
import kotlin.Metadata;

/* compiled from: platform.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b`\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0005H&ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u0006À\u0006\u0001"}, m3636d2 = {"Lcom/squareup/wire/internal/Call;", "", "cancel", "", "execute", "Lcom/squareup/wire/GrpcResponse;", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.internal.Call, reason: use source file name */
/* loaded from: classes12.dex */
public interface platform {
    void cancel();

    GrpcResponse execute() throws IOException;
}
