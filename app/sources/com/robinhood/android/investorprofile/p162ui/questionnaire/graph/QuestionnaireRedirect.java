package com.robinhood.android.investorprofile.p162ui.questionnaire.graph;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: RedirectManager.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/graph/QuestionnaireRedirect;", "Landroid/os/Parcelable;", "originatingQuestionId", "Ljava/util/UUID;", "redirect", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;)V", "getOriginatingQuestionId", "()Ljava/util/UUID;", "getRedirect", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class QuestionnaireRedirect implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<QuestionnaireRedirect> CREATOR = new Creator();
    private final UUID originatingQuestionId;
    private final String redirect;

    /* compiled from: RedirectManager.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<QuestionnaireRedirect> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireRedirect createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new QuestionnaireRedirect((UUID) parcel.readSerializable(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final QuestionnaireRedirect[] newArray(int i) {
            return new QuestionnaireRedirect[i];
        }
    }

    public static /* synthetic */ QuestionnaireRedirect copy$default(QuestionnaireRedirect questionnaireRedirect, UUID uuid, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = questionnaireRedirect.originatingQuestionId;
        }
        if ((i & 2) != 0) {
            str = questionnaireRedirect.redirect;
        }
        return questionnaireRedirect.copy(uuid, str);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getOriginatingQuestionId() {
        return this.originatingQuestionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRedirect() {
        return this.redirect;
    }

    public final QuestionnaireRedirect copy(UUID originatingQuestionId, String redirect) {
        Intrinsics.checkNotNullParameter(originatingQuestionId, "originatingQuestionId");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        return new QuestionnaireRedirect(originatingQuestionId, redirect);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuestionnaireRedirect)) {
            return false;
        }
        QuestionnaireRedirect questionnaireRedirect = (QuestionnaireRedirect) other;
        return Intrinsics.areEqual(this.originatingQuestionId, questionnaireRedirect.originatingQuestionId) && Intrinsics.areEqual(this.redirect, questionnaireRedirect.redirect);
    }

    public int hashCode() {
        return (this.originatingQuestionId.hashCode() * 31) + this.redirect.hashCode();
    }

    public String toString() {
        return "QuestionnaireRedirect(originatingQuestionId=" + this.originatingQuestionId + ", redirect=" + this.redirect + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeSerializable(this.originatingQuestionId);
        dest.writeString(this.redirect);
    }

    public QuestionnaireRedirect(UUID originatingQuestionId, String redirect) {
        Intrinsics.checkNotNullParameter(originatingQuestionId, "originatingQuestionId");
        Intrinsics.checkNotNullParameter(redirect, "redirect");
        this.originatingQuestionId = originatingQuestionId;
        this.redirect = redirect;
    }

    public final UUID getOriginatingQuestionId() {
        return this.originatingQuestionId;
    }

    public final String getRedirect() {
        return this.redirect;
    }
}
