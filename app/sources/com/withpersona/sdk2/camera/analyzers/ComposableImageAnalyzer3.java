package com.withpersona.sdk2.camera.analyzers;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: ComposableImageAnalyzer.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "Ljava/lang/RuntimeException;", "<init>", "()V", "NoAnalyzerError", "DetectorError", "GooglePlayError", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$DetectorError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$GooglePlayError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$NoAnalyzerError;", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisError, reason: use source file name */
/* loaded from: classes26.dex */
public abstract class ComposableImageAnalyzer3 extends RuntimeException {
    public /* synthetic */ ComposableImageAnalyzer3(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$NoAnalyzerError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisError$NoAnalyzerError */
    public static final class NoAnalyzerError extends ComposableImageAnalyzer3 {
        public NoAnalyzerError() {
            super(null);
        }
    }

    private ComposableImageAnalyzer3() {
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$DetectorError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisError$DetectorError */
    public static final class DetectorError extends ComposableImageAnalyzer3 {
        public DetectorError() {
            super(null);
        }
    }

    /* compiled from: ComposableImageAnalyzer.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/analyzers/AnalysisError$GooglePlayError;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisError;", "<init>", "()V", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
    /* renamed from: com.withpersona.sdk2.camera.analyzers.AnalysisError$GooglePlayError */
    public static final class GooglePlayError extends ComposableImageAnalyzer3 {
        public GooglePlayError() {
            super(null);
        }
    }
}
