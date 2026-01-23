package com.withpersona.sdk2.inquiry.document.network;

import java.io.File;
import java.io.FileInputStream;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;
import kotlin.p481io.Closeable;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlow2;
import kotlinx.coroutines.flow.StateFlow4;
import okhttp3.MediaType;
import okhttp3.RequestBody;
import okio.BufferedSink;

/* compiled from: ProgressRequestBody.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\n\u0010\u000b\u001a\u0004\u0018\u00010\u0005H\u0016J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0016J\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\u0013R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/withpersona/sdk2/inquiry/document/network/ProgressRequestBody;", "Lokhttp3/RequestBody;", "file", "Ljava/io/File;", "mediaType", "Lokhttp3/MediaType;", "<init>", "(Ljava/io/File;Lokhttp3/MediaType;)V", "flow", "Lkotlinx/coroutines/flow/MutableStateFlow;", "", "contentType", "contentLength", "", "writeTo", "", "sink", "Lokio/BufferedSink;", "progressFlow", "Lkotlinx/coroutines/flow/StateFlow;", "Companion", "document_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes18.dex */
public final class ProgressRequestBody extends RequestBody {
    private final File file;
    private final StateFlow2<Integer> flow;
    private final MediaType mediaType;

    public ProgressRequestBody(File file, MediaType mediaType) {
        Intrinsics.checkNotNullParameter(file, "file");
        this.file = file;
        this.mediaType = mediaType;
        this.flow = StateFlow4.MutableStateFlow(0);
    }

    @Override // okhttp3.RequestBody
    /* renamed from: contentType, reason: from getter */
    public MediaType getContentType() {
        return this.mediaType;
    }

    @Override // okhttp3.RequestBody
    public long contentLength() {
        return this.file.length();
    }

    @Override // okhttp3.RequestBody
    public void writeTo(BufferedSink sink) {
        Intrinsics.checkNotNullParameter(sink, "sink");
        float length = this.file.length();
        byte[] bArr = new byte[2048];
        FileInputStream fileInputStream = new FileInputStream(this.file);
        try {
            int i = fileInputStream.read(bArr);
            long j = 0;
            int i2 = 0;
            while (i != -1) {
                j += i;
                sink.write(bArr, 0, i);
                i = fileInputStream.read(bArr);
                int iRoundToInt = MathKt.roundToInt((j / length) * 100.0f);
                if (iRoundToInt - i2 > 1 || iRoundToInt >= 100) {
                    this.flow.tryEmit(Integer.valueOf(iRoundToInt));
                    i2 = iRoundToInt;
                }
            }
            Unit unit = Unit.INSTANCE;
            Closeable.closeFinally(fileInputStream, null);
        } finally {
        }
    }

    public final StateFlow<Integer> progressFlow() {
        return FlowKt.asStateFlow(this.flow);
    }
}
