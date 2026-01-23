package com.squareup.wire.internal;

import com.robinhood.utils.http.ContentEncoding;
import com.squareup.wire.internal.GrpcDecoder;
import java.net.ProtocolException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GrpcDecoder.kt */
@Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u0000¨\u0006\u0003"}, m3636d2 = {"toGrpcDecoding", "Lcom/squareup/wire/internal/GrpcDecoder;", "", "wire-grpc-client"}, m3637k = 2, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.squareup.wire.internal.GrpcDecoderKt, reason: use source file name */
/* loaded from: classes12.dex */
public final class GrpcDecoder2 {
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:31)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:60)
     */
    public static final GrpcDecoder toGrpcDecoding(String str) throws ProtocolException {
        Intrinsics.checkNotNullParameter(str, "<this>");
        switch (str.hashCode()) {
            case -898026669:
                if (str.equals("snappy")) {
                    throw new ProtocolException("snappy not yet supported");
                }
                break;
            case -135761730:
                if (str.equals(ContentEncoding.IDENTITY)) {
                    return GrpcDecoder.IdentityGrpcDecoder.INSTANCE;
                }
                break;
            case 3189082:
                if (str.equals(ContentEncoding.GZIP)) {
                    return GrpcDecoder.GzipGrpcDecoder.INSTANCE;
                }
                break;
            case 1545112619:
                if (str.equals("deflate")) {
                    throw new ProtocolException("deflate not yet supported");
                }
                break;
        }
        throw new ProtocolException("unsupported grpc-encoding: " + str);
    }
}
