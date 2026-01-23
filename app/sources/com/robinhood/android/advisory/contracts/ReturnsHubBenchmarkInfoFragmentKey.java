package com.robinhood.android.advisory.contracts;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvisoryFragmentKeys.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\u0010\u001a\u00020\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0011R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/advisory/contracts/ReturnsHubBenchmarkInfoFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "content", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "loggingIdentifier", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getDisclosure", "getLoggingIdentifier", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class ReturnsHubBenchmarkInfoFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<ReturnsHubBenchmarkInfoFragmentKey> CREATOR = new Creator();
    private final String content;
    private final String disclosure;
    private final String loggingIdentifier;

    /* compiled from: AdvisoryFragmentKeys.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ReturnsHubBenchmarkInfoFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnsHubBenchmarkInfoFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ReturnsHubBenchmarkInfoFragmentKey(parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ReturnsHubBenchmarkInfoFragmentKey[] newArray(int i) {
            return new ReturnsHubBenchmarkInfoFragmentKey[i];
        }
    }

    public static /* synthetic */ ReturnsHubBenchmarkInfoFragmentKey copy$default(ReturnsHubBenchmarkInfoFragmentKey returnsHubBenchmarkInfoFragmentKey, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = returnsHubBenchmarkInfoFragmentKey.content;
        }
        if ((i & 2) != 0) {
            str2 = returnsHubBenchmarkInfoFragmentKey.disclosure;
        }
        if ((i & 4) != 0) {
            str3 = returnsHubBenchmarkInfoFragmentKey.loggingIdentifier;
        }
        return returnsHubBenchmarkInfoFragmentKey.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDisclosure() {
        return this.disclosure;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }

    public final ReturnsHubBenchmarkInfoFragmentKey copy(String content, String disclosure, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        return new ReturnsHubBenchmarkInfoFragmentKey(content, disclosure, loggingIdentifier);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReturnsHubBenchmarkInfoFragmentKey)) {
            return false;
        }
        ReturnsHubBenchmarkInfoFragmentKey returnsHubBenchmarkInfoFragmentKey = (ReturnsHubBenchmarkInfoFragmentKey) other;
        return Intrinsics.areEqual(this.content, returnsHubBenchmarkInfoFragmentKey.content) && Intrinsics.areEqual(this.disclosure, returnsHubBenchmarkInfoFragmentKey.disclosure) && Intrinsics.areEqual(this.loggingIdentifier, returnsHubBenchmarkInfoFragmentKey.loggingIdentifier);
    }

    public int hashCode() {
        return (((this.content.hashCode() * 31) + this.disclosure.hashCode()) * 31) + this.loggingIdentifier.hashCode();
    }

    public String toString() {
        return "ReturnsHubBenchmarkInfoFragmentKey(content=" + this.content + ", disclosure=" + this.disclosure + ", loggingIdentifier=" + this.loggingIdentifier + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.content);
        dest.writeString(this.disclosure);
        dest.writeString(this.loggingIdentifier);
    }

    public ReturnsHubBenchmarkInfoFragmentKey(String content, String disclosure, String loggingIdentifier) {
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(disclosure, "disclosure");
        Intrinsics.checkNotNullParameter(loggingIdentifier, "loggingIdentifier");
        this.content = content;
        this.disclosure = disclosure;
        this.loggingIdentifier = loggingIdentifier;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getDisclosure() {
        return this.disclosure;
    }

    public final String getLoggingIdentifier() {
        return this.loggingIdentifier;
    }
}
