package com.squareup.wire;

import java.io.IOException;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcException.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0002\b\f\u0018\u00002\u00060\u0001j\u0002`\u0002B1\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bB'\b\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\fR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/squareup/wire/GrpcException;", "Ljava/io/IOException;", "Lokio/IOException;", "grpcStatus", "Lcom/squareup/wire/GrpcStatus;", "grpcMessage", "", "grpcStatusDetails", "", "url", "<init>", "(Lcom/squareup/wire/GrpcStatus;Ljava/lang/String;[BLjava/lang/String;)V", "(Lcom/squareup/wire/GrpcStatus;Ljava/lang/String;[B)V", "getGrpcStatus", "()Lcom/squareup/wire/GrpcStatus;", "getGrpcMessage", "()Ljava/lang/String;", "getGrpcStatusDetails", "()[B", "getUrl", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class GrpcException extends IOException {
    private final String grpcMessage;
    private final GrpcStatus grpcStatus;
    private final byte[] grpcStatusDetails;
    private final String url;

    public /* synthetic */ GrpcException(GrpcStatus grpcStatus, String str, byte[] bArr, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(grpcStatus, str, (i & 4) != 0 ? null : bArr, (i & 8) != 0 ? null : str2);
    }

    public final GrpcStatus getGrpcStatus() {
        return this.grpcStatus;
    }

    public final String getGrpcMessage() {
        return this.grpcMessage;
    }

    public final byte[] getGrpcStatusDetails() {
        return this.grpcStatusDetails;
    }

    public final String getUrl() {
        return this.url;
    }

    public GrpcException(GrpcStatus grpcStatus, String str, byte[] bArr, String str2) {
        Intrinsics.checkNotNullParameter(grpcStatus, "grpcStatus");
        StringBuilder sb = new StringBuilder();
        sb.append("grpc-status=" + grpcStatus.getCode() + " grpc-status-name=" + grpcStatus.getName());
        if (str != null) {
            sb.append(" grpc-message=" + str);
        }
        if (str2 != null) {
            sb.append(" url=" + str2);
        }
        String string2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        super(string2);
        this.grpcStatus = grpcStatus;
        this.grpcMessage = str;
        this.grpcStatusDetails = bArr;
        this.url = str2;
    }

    public /* synthetic */ GrpcException(GrpcStatus grpcStatus, String str, byte[] bArr, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(grpcStatus, str, (i & 4) != 0 ? null : bArr);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public /* synthetic */ GrpcException(GrpcStatus grpcStatus, String str, byte[] bArr) {
        this(grpcStatus, str, bArr, null, 8, null);
        Intrinsics.checkNotNullParameter(grpcStatus, "grpcStatus");
    }
}
