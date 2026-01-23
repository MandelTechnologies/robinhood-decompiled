package com.robinhood.android.crypto.tab.p093ui.education;

import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CryptoHomeEducationDataState.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÀ\u0003¢\u0006\u0002\b\rJ\u0019\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\n2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u001c\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038AX\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n8F¢\u0006\u0006\u001a\u0004\b\t\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationDataState;", "", "educationLessonPreviews", "", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "<init>", "(Ljava/util/List;)V", "getEducationLessonPreviews$feature_crypto_tab_externalDebug", "()Ljava/util/List;", "isContentVisible", "", "()Z", "component1", "component1$feature_crypto_tab_externalDebug", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeEducationDataState {
    public static final int $stable = 8;
    private final List<EducationLessonPreview> educationLessonPreviews;

    /* JADX WARN: Multi-variable type inference failed */
    public CryptoHomeEducationDataState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHomeEducationDataState copy$default(CryptoHomeEducationDataState cryptoHomeEducationDataState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = cryptoHomeEducationDataState.educationLessonPreviews;
        }
        return cryptoHomeEducationDataState.copy(list);
    }

    public final List<EducationLessonPreview> component1$feature_crypto_tab_externalDebug() {
        return this.educationLessonPreviews;
    }

    public final CryptoHomeEducationDataState copy(List<EducationLessonPreview> educationLessonPreviews) {
        Intrinsics.checkNotNullParameter(educationLessonPreviews, "educationLessonPreviews");
        return new CryptoHomeEducationDataState(educationLessonPreviews);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof CryptoHomeEducationDataState) && Intrinsics.areEqual(this.educationLessonPreviews, ((CryptoHomeEducationDataState) other).educationLessonPreviews);
    }

    public int hashCode() {
        return this.educationLessonPreviews.hashCode();
    }

    public String toString() {
        return "CryptoHomeEducationDataState(educationLessonPreviews=" + this.educationLessonPreviews + ")";
    }

    public CryptoHomeEducationDataState(List<EducationLessonPreview> educationLessonPreviews) {
        Intrinsics.checkNotNullParameter(educationLessonPreviews, "educationLessonPreviews");
        this.educationLessonPreviews = educationLessonPreviews;
    }

    public /* synthetic */ CryptoHomeEducationDataState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<EducationLessonPreview> getEducationLessonPreviews$feature_crypto_tab_externalDebug() {
        return this.educationLessonPreviews;
    }

    public final boolean isContentVisible() {
        return !this.educationLessonPreviews.isEmpty();
    }
}
