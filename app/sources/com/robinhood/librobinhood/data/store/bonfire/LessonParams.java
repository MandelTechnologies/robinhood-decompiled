package com.robinhood.librobinhood.data.store.bonfire;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: EducationLessonsStore.kt */
@Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/bonfire/LessonParams;", "", "lessonId", "", "source", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getLessonId", "()Ljava/lang/String;", "getSource", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "lib-store-education_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class LessonParams {
    private final String lessonId;
    private final String source;

    public static /* synthetic */ LessonParams copy$default(LessonParams lessonParams, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = lessonParams.lessonId;
        }
        if ((i & 2) != 0) {
            str2 = lessonParams.source;
        }
        return lessonParams.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLessonId() {
        return this.lessonId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    public final LessonParams copy(String lessonId, String source) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(source, "source");
        return new LessonParams(lessonId, source);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LessonParams)) {
            return false;
        }
        LessonParams lessonParams = (LessonParams) other;
        return Intrinsics.areEqual(this.lessonId, lessonParams.lessonId) && Intrinsics.areEqual(this.source, lessonParams.source);
    }

    public int hashCode() {
        return (this.lessonId.hashCode() * 31) + this.source.hashCode();
    }

    public String toString() {
        return "LessonParams(lessonId=" + this.lessonId + ", source=" + this.source + ")";
    }

    public LessonParams(String lessonId, String source) {
        Intrinsics.checkNotNullParameter(lessonId, "lessonId");
        Intrinsics.checkNotNullParameter(source, "source");
        this.lessonId = lessonId;
        this.source = source;
    }

    public final String getLessonId() {
        return this.lessonId;
    }

    public final String getSource() {
        return this.source;
    }
}
