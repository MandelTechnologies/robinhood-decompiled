package com.withpersona.sdk2.camera;

import kotlin.Metadata;
import kotlin.Result;

/* compiled from: GovernmentIdFeed.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0006\u0010\u0016¨\u0006\u0017"}, m3636d2 = {"Lcom/withpersona/sdk2/camera/AnalyzerResult;", "", "Lkotlin/Result;", "Lcom/withpersona/sdk2/camera/analyzers/AnalysisData;", "result", "", "isActiveAnalyzer", "<init>", "(Ljava/lang/Object;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Object;", "getResult-d1pmJ48", "()Ljava/lang/Object;", "Z", "()Z", "camera_release"}, m3637k = 1, m3638mv = {2, 0, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final /* data */ class AnalyzerResult {
    private final boolean isActiveAnalyzer;
    private final Object result;

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AnalyzerResult)) {
            return false;
        }
        AnalyzerResult analyzerResult = (AnalyzerResult) other;
        return Result.m28552equalsimpl0(this.result, analyzerResult.result) && this.isActiveAnalyzer == analyzerResult.isActiveAnalyzer;
    }

    public int hashCode() {
        return (Result.m28554hashCodeimpl(this.result) * 31) + Boolean.hashCode(this.isActiveAnalyzer);
    }

    public String toString() {
        return "AnalyzerResult(result=" + Result.m28557toStringimpl(this.result) + ", isActiveAnalyzer=" + this.isActiveAnalyzer + ")";
    }

    public AnalyzerResult(Object obj, boolean z) {
        this.result = obj;
        this.isActiveAnalyzer = z;
    }

    /* renamed from: getResult-d1pmJ48, reason: not valid java name and from getter */
    public final Object getResult() {
        return this.result;
    }

    /* renamed from: isActiveAnalyzer, reason: from getter */
    public final boolean getIsActiveAnalyzer() {
        return this.isActiveAnalyzer;
    }
}
