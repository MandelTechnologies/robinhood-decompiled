package com.squareup.wire;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.io.Serializable;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmField;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: GrpcStatus.kt */
@Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\b\u0018\u0000 \r2\u00060\u0001j\u0002`\u0002:\u0001\rB\u0019\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, m3636d2 = {"Lcom/squareup/wire/GrpcStatus;", "Ljava/io/Serializable;", "Lcom/squareup/wire/internal/Serializable;", "name", "", "code", "", "<init>", "(Ljava/lang/String;I)V", "getName", "()Ljava/lang/String;", "getCode", "()I", "Companion", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class GrpcStatus implements Serializable {

    @JvmField
    public static final GrpcStatus ABORTED;

    @JvmField
    public static final GrpcStatus ALREADY_EXISTS;

    @JvmField
    public static final GrpcStatus CANCELLED;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    @JvmField
    public static final GrpcStatus DATA_LOSS;

    @JvmField
    public static final GrpcStatus DEADLINE_EXCEEDED;

    @JvmField
    public static final GrpcStatus FAILED_PRECONDITION;
    private static final Map<Integer, GrpcStatus> INSTANCES;

    @JvmField
    public static final GrpcStatus INTERNAL;

    @JvmField
    public static final GrpcStatus INVALID_ARGUMENT;

    @JvmField
    public static final GrpcStatus NOT_FOUND;

    /* renamed from: OK */
    @JvmField
    public static final GrpcStatus f6394OK;

    @JvmField
    public static final GrpcStatus OUT_OF_RANGE;

    @JvmField
    public static final GrpcStatus PERMISSION_DENIED;

    @JvmField
    public static final GrpcStatus RESOURCE_EXHAUSTED;

    @JvmField
    public static final GrpcStatus UNAUTHENTICATED;

    @JvmField
    public static final GrpcStatus UNAVAILABLE;

    @JvmField
    public static final GrpcStatus UNIMPLEMENTED;

    @JvmField
    public static final GrpcStatus UNKNOWN;
    private final int code;
    private final String name;

    public /* synthetic */ GrpcStatus(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, i);
    }

    private GrpcStatus(String str, int i) {
        this.name = str;
        this.code = i;
    }

    public final String getName() {
        return this.name;
    }

    public final int getCode() {
        return this.code;
    }

    /* compiled from: GrpcStatus.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0006H\u0002J\u000e\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\n\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u000f\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0011\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0013\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0014\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0015\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0016\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0017\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0018\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u001e"}, m3636d2 = {"Lcom/squareup/wire/GrpcStatus$Companion;", "", "<init>", "()V", "INSTANCES", "", "", "Lcom/squareup/wire/GrpcStatus;", "OK", "CANCELLED", "UNKNOWN", "INVALID_ARGUMENT", "DEADLINE_EXCEEDED", "NOT_FOUND", "ALREADY_EXISTS", "PERMISSION_DENIED", "RESOURCE_EXHAUSTED", "FAILED_PRECONDITION", "ABORTED", "OUT_OF_RANGE", "UNIMPLEMENTED", "INTERNAL", "UNAVAILABLE", "DATA_LOSS", "UNAUTHENTICATED", AnalyticsStrings.BUTTON_NEW_LIST_CREATE, "name", "", "status", "get", "wire-grpc-client"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final GrpcStatus create(String name, int status) {
            GrpcStatus grpcStatus = new GrpcStatus(name, status, null);
            GrpcStatus.INSTANCES.put(Integer.valueOf(status), grpcStatus);
            return grpcStatus;
        }

        public final synchronized GrpcStatus get(int status) {
            Object grpcStatus;
            try {
                if (status < 0) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                Map map = GrpcStatus.INSTANCES;
                Integer numValueOf = Integer.valueOf(status);
                grpcStatus = map.get(numValueOf);
                if (grpcStatus == null) {
                    grpcStatus = new GrpcStatus("STATUS_" + status, status, null);
                    map.put(numValueOf, grpcStatus);
                }
            } catch (Throwable th) {
                throw th;
            }
            return (GrpcStatus) grpcStatus;
        }
    }

    static {
        Companion companion = new Companion(null);
        INSTANCE = companion;
        INSTANCES = new LinkedHashMap();
        f6394OK = companion.create("OK", 0);
        CANCELLED = companion.create("CANCELLED", 1);
        UNKNOWN = companion.create("UNKNOWN", 2);
        INVALID_ARGUMENT = companion.create("INVALID_ARGUMENT", 3);
        DEADLINE_EXCEEDED = companion.create("DEADLINE_EXCEEDED", 4);
        NOT_FOUND = companion.create("NOT_FOUND", 5);
        ALREADY_EXISTS = companion.create("ALREADY_EXISTS", 6);
        PERMISSION_DENIED = companion.create("PERMISSION_DENIED", 7);
        RESOURCE_EXHAUSTED = companion.create("RESOURCE_EXHAUSTED", 8);
        FAILED_PRECONDITION = companion.create("FAILED_PRECONDITION", 9);
        ABORTED = companion.create("ABORTED", 10);
        OUT_OF_RANGE = companion.create("OUT_OF_RANGE", 11);
        UNIMPLEMENTED = companion.create("UNIMPLEMENTED", 12);
        INTERNAL = companion.create("INTERNAL", 13);
        UNAVAILABLE = companion.create("UNAVAILABLE", 14);
        DATA_LOSS = companion.create("DATA_LOSS", 15);
        UNAUTHENTICATED = companion.create("UNAUTHENTICATED", 16);
    }
}
