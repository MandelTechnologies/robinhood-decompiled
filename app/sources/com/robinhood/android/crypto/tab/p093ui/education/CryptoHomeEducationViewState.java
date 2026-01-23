package com.robinhood.android.crypto.tab.p093ui.education;

import com.robinhood.shared.models.p387db.bonfire.education.lesson.EducationLessonPreview;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: CryptoHomeEducationViewState.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0006HÆ\u0003J#\u0010\u000e\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/crypto/tab/ui/education/CryptoHomeEducationViewState;", "", "educationLessonPreviews", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/shared/models/db/bonfire/education/lesson/EducationLessonPreview;", "isContentVisible", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getEducationLessonPreviews", "()Lkotlinx/collections/immutable/ImmutableList;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-crypto-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class CryptoHomeEducationViewState {
    public static final int $stable = 8;
    private final ImmutableList<EducationLessonPreview> educationLessonPreviews;
    private final boolean isContentVisible;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CryptoHomeEducationViewState copy$default(CryptoHomeEducationViewState cryptoHomeEducationViewState, ImmutableList immutableList, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            immutableList = cryptoHomeEducationViewState.educationLessonPreviews;
        }
        if ((i & 2) != 0) {
            z = cryptoHomeEducationViewState.isContentVisible;
        }
        return cryptoHomeEducationViewState.copy(immutableList, z);
    }

    public final ImmutableList<EducationLessonPreview> component1() {
        return this.educationLessonPreviews;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getIsContentVisible() {
        return this.isContentVisible;
    }

    public final CryptoHomeEducationViewState copy(ImmutableList<EducationLessonPreview> educationLessonPreviews, boolean isContentVisible) {
        Intrinsics.checkNotNullParameter(educationLessonPreviews, "educationLessonPreviews");
        return new CryptoHomeEducationViewState(educationLessonPreviews, isContentVisible);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CryptoHomeEducationViewState)) {
            return false;
        }
        CryptoHomeEducationViewState cryptoHomeEducationViewState = (CryptoHomeEducationViewState) other;
        return Intrinsics.areEqual(this.educationLessonPreviews, cryptoHomeEducationViewState.educationLessonPreviews) && this.isContentVisible == cryptoHomeEducationViewState.isContentVisible;
    }

    public int hashCode() {
        return (this.educationLessonPreviews.hashCode() * 31) + Boolean.hashCode(this.isContentVisible);
    }

    public String toString() {
        return "CryptoHomeEducationViewState(educationLessonPreviews=" + this.educationLessonPreviews + ", isContentVisible=" + this.isContentVisible + ")";
    }

    public CryptoHomeEducationViewState(ImmutableList<EducationLessonPreview> educationLessonPreviews, boolean z) {
        Intrinsics.checkNotNullParameter(educationLessonPreviews, "educationLessonPreviews");
        this.educationLessonPreviews = educationLessonPreviews;
        this.isContentVisible = z;
    }

    public final ImmutableList<EducationLessonPreview> getEducationLessonPreviews() {
        return this.educationLessonPreviews;
    }

    public final boolean isContentVisible() {
        return this.isContentVisible;
    }
}
