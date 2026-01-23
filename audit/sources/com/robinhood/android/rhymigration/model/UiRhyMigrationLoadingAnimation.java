package com.robinhood.android.rhymigration.model;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiRhyMigrationLoadingAnimation.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\bHÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\fHÆ\u0003JY\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\fHÆ\u0001J\u0006\u0010#\u001a\u00020$J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(HÖ\u0003J\t\u0010)\u001a\u00020$HÖ\u0001J\t\u0010*\u001a\u00020\u0003HÖ\u0001J\u0016\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020$R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\n\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/rhymigration/model/UiRhyMigrationLoadingAnimation;", "Landroid/os/Parcelable;", "animationAsset", "", "phraseOneText", "phraseTwoText", "phraseThreeText", "phraseOneLoop", "Lcom/robinhood/android/rhymigration/model/Bound;", "phraseTwoTransition", "phraseThreeLoop", "pollingTimeoutSeconds", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/robinhood/android/rhymigration/model/Bound;Lcom/robinhood/android/rhymigration/model/Bound;Lcom/robinhood/android/rhymigration/model/Bound;J)V", "getAnimationAsset", "()Ljava/lang/String;", "getPhraseOneText", "getPhraseTwoText", "getPhraseThreeText", "getPhraseOneLoop", "()Lcom/robinhood/android/rhymigration/model/Bound;", "getPhraseTwoTransition", "getPhraseThreeLoop", "getPollingTimeoutSeconds", "()J", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-rhy-migration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UiRhyMigrationLoadingAnimation implements Parcelable {
    public static final int $stable = 0;
    public static final Parcelable.Creator<UiRhyMigrationLoadingAnimation> CREATOR = new Creator();
    private final String animationAsset;
    private final Bound phraseOneLoop;
    private final String phraseOneText;
    private final Bound phraseThreeLoop;
    private final String phraseThreeText;
    private final String phraseTwoText;
    private final Bound phraseTwoTransition;
    private final long pollingTimeoutSeconds;

    /* compiled from: UiRhyMigrationLoadingAnimation.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiRhyMigrationLoadingAnimation> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationLoadingAnimation createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            Parcelable.Creator<Bound> creator = Bound.CREATOR;
            return new UiRhyMigrationLoadingAnimation(string2, string3, string4, string5, creator.createFromParcel(parcel), creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readLong());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiRhyMigrationLoadingAnimation[] newArray(int i) {
            return new UiRhyMigrationLoadingAnimation[i];
        }
    }

    public static /* synthetic */ UiRhyMigrationLoadingAnimation copy$default(UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation, String str, String str2, String str3, String str4, Bound bound, Bound bound2, Bound bound3, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = uiRhyMigrationLoadingAnimation.animationAsset;
        }
        if ((i & 2) != 0) {
            str2 = uiRhyMigrationLoadingAnimation.phraseOneText;
        }
        if ((i & 4) != 0) {
            str3 = uiRhyMigrationLoadingAnimation.phraseTwoText;
        }
        if ((i & 8) != 0) {
            str4 = uiRhyMigrationLoadingAnimation.phraseThreeText;
        }
        if ((i & 16) != 0) {
            bound = uiRhyMigrationLoadingAnimation.phraseOneLoop;
        }
        if ((i & 32) != 0) {
            bound2 = uiRhyMigrationLoadingAnimation.phraseTwoTransition;
        }
        if ((i & 64) != 0) {
            bound3 = uiRhyMigrationLoadingAnimation.phraseThreeLoop;
        }
        if ((i & 128) != 0) {
            j = uiRhyMigrationLoadingAnimation.pollingTimeoutSeconds;
        }
        long j2 = j;
        Bound bound4 = bound2;
        Bound bound5 = bound3;
        Bound bound6 = bound;
        String str5 = str3;
        return uiRhyMigrationLoadingAnimation.copy(str, str2, str5, str4, bound6, bound4, bound5, j2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAnimationAsset() {
        return this.animationAsset;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPhraseOneText() {
        return this.phraseOneText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPhraseTwoText() {
        return this.phraseTwoText;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPhraseThreeText() {
        return this.phraseThreeText;
    }

    /* renamed from: component5, reason: from getter */
    public final Bound getPhraseOneLoop() {
        return this.phraseOneLoop;
    }

    /* renamed from: component6, reason: from getter */
    public final Bound getPhraseTwoTransition() {
        return this.phraseTwoTransition;
    }

    /* renamed from: component7, reason: from getter */
    public final Bound getPhraseThreeLoop() {
        return this.phraseThreeLoop;
    }

    /* renamed from: component8, reason: from getter */
    public final long getPollingTimeoutSeconds() {
        return this.pollingTimeoutSeconds;
    }

    public final UiRhyMigrationLoadingAnimation copy(String animationAsset, String phraseOneText, String phraseTwoText, String phraseThreeText, Bound phraseOneLoop, Bound phraseTwoTransition, Bound phraseThreeLoop, long pollingTimeoutSeconds) {
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(phraseOneText, "phraseOneText");
        Intrinsics.checkNotNullParameter(phraseTwoText, "phraseTwoText");
        Intrinsics.checkNotNullParameter(phraseThreeText, "phraseThreeText");
        Intrinsics.checkNotNullParameter(phraseOneLoop, "phraseOneLoop");
        Intrinsics.checkNotNullParameter(phraseTwoTransition, "phraseTwoTransition");
        Intrinsics.checkNotNullParameter(phraseThreeLoop, "phraseThreeLoop");
        return new UiRhyMigrationLoadingAnimation(animationAsset, phraseOneText, phraseTwoText, phraseThreeText, phraseOneLoop, phraseTwoTransition, phraseThreeLoop, pollingTimeoutSeconds);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UiRhyMigrationLoadingAnimation)) {
            return false;
        }
        UiRhyMigrationLoadingAnimation uiRhyMigrationLoadingAnimation = (UiRhyMigrationLoadingAnimation) other;
        return Intrinsics.areEqual(this.animationAsset, uiRhyMigrationLoadingAnimation.animationAsset) && Intrinsics.areEqual(this.phraseOneText, uiRhyMigrationLoadingAnimation.phraseOneText) && Intrinsics.areEqual(this.phraseTwoText, uiRhyMigrationLoadingAnimation.phraseTwoText) && Intrinsics.areEqual(this.phraseThreeText, uiRhyMigrationLoadingAnimation.phraseThreeText) && Intrinsics.areEqual(this.phraseOneLoop, uiRhyMigrationLoadingAnimation.phraseOneLoop) && Intrinsics.areEqual(this.phraseTwoTransition, uiRhyMigrationLoadingAnimation.phraseTwoTransition) && Intrinsics.areEqual(this.phraseThreeLoop, uiRhyMigrationLoadingAnimation.phraseThreeLoop) && this.pollingTimeoutSeconds == uiRhyMigrationLoadingAnimation.pollingTimeoutSeconds;
    }

    public int hashCode() {
        return (((((((((((((this.animationAsset.hashCode() * 31) + this.phraseOneText.hashCode()) * 31) + this.phraseTwoText.hashCode()) * 31) + this.phraseThreeText.hashCode()) * 31) + this.phraseOneLoop.hashCode()) * 31) + this.phraseTwoTransition.hashCode()) * 31) + this.phraseThreeLoop.hashCode()) * 31) + Long.hashCode(this.pollingTimeoutSeconds);
    }

    public String toString() {
        return "UiRhyMigrationLoadingAnimation(animationAsset=" + this.animationAsset + ", phraseOneText=" + this.phraseOneText + ", phraseTwoText=" + this.phraseTwoText + ", phraseThreeText=" + this.phraseThreeText + ", phraseOneLoop=" + this.phraseOneLoop + ", phraseTwoTransition=" + this.phraseTwoTransition + ", phraseThreeLoop=" + this.phraseThreeLoop + ", pollingTimeoutSeconds=" + this.pollingTimeoutSeconds + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.animationAsset);
        dest.writeString(this.phraseOneText);
        dest.writeString(this.phraseTwoText);
        dest.writeString(this.phraseThreeText);
        this.phraseOneLoop.writeToParcel(dest, flags);
        this.phraseTwoTransition.writeToParcel(dest, flags);
        this.phraseThreeLoop.writeToParcel(dest, flags);
        dest.writeLong(this.pollingTimeoutSeconds);
    }

    public UiRhyMigrationLoadingAnimation(String animationAsset, String phraseOneText, String phraseTwoText, String phraseThreeText, Bound phraseOneLoop, Bound phraseTwoTransition, Bound phraseThreeLoop, long j) {
        Intrinsics.checkNotNullParameter(animationAsset, "animationAsset");
        Intrinsics.checkNotNullParameter(phraseOneText, "phraseOneText");
        Intrinsics.checkNotNullParameter(phraseTwoText, "phraseTwoText");
        Intrinsics.checkNotNullParameter(phraseThreeText, "phraseThreeText");
        Intrinsics.checkNotNullParameter(phraseOneLoop, "phraseOneLoop");
        Intrinsics.checkNotNullParameter(phraseTwoTransition, "phraseTwoTransition");
        Intrinsics.checkNotNullParameter(phraseThreeLoop, "phraseThreeLoop");
        this.animationAsset = animationAsset;
        this.phraseOneText = phraseOneText;
        this.phraseTwoText = phraseTwoText;
        this.phraseThreeText = phraseThreeText;
        this.phraseOneLoop = phraseOneLoop;
        this.phraseTwoTransition = phraseTwoTransition;
        this.phraseThreeLoop = phraseThreeLoop;
        this.pollingTimeoutSeconds = j;
    }

    public final String getAnimationAsset() {
        return this.animationAsset;
    }

    public final String getPhraseOneText() {
        return this.phraseOneText;
    }

    public final String getPhraseTwoText() {
        return this.phraseTwoText;
    }

    public final String getPhraseThreeText() {
        return this.phraseThreeText;
    }

    public final Bound getPhraseOneLoop() {
        return this.phraseOneLoop;
    }

    public final Bound getPhraseTwoTransition() {
        return this.phraseTwoTransition;
    }

    public final Bound getPhraseThreeLoop() {
        return this.phraseThreeLoop;
    }

    public final long getPollingTimeoutSeconds() {
        return this.pollingTimeoutSeconds;
    }
}
