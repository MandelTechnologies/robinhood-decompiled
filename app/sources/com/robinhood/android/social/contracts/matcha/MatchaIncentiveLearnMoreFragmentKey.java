package com.robinhood.android.social.contracts.matcha;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.navigation.keys.FragmentKey;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntries2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MatchaIncentiveLearnMoreFragmentKey.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey;", "Lcom/robinhood/android/navigation/keys/FragmentKey;", "footerContext", "Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "<init>", "(Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;)V", "getFooterContext", "()Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "FooterContext", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes20.dex */
public final /* data */ class MatchaIncentiveLearnMoreFragmentKey implements FragmentKey {
    public static final Parcelable.Creator<MatchaIncentiveLearnMoreFragmentKey> CREATOR = new Creator();
    private final FooterContext footerContext;

    /* compiled from: MatchaIncentiveLearnMoreFragmentKey.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class Creator implements Parcelable.Creator<MatchaIncentiveLearnMoreFragmentKey> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatchaIncentiveLearnMoreFragmentKey createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new MatchaIncentiveLearnMoreFragmentKey(FooterContext.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MatchaIncentiveLearnMoreFragmentKey[] newArray(int i) {
            return new MatchaIncentiveLearnMoreFragmentKey[i];
        }
    }

    public static /* synthetic */ MatchaIncentiveLearnMoreFragmentKey copy$default(MatchaIncentiveLearnMoreFragmentKey matchaIncentiveLearnMoreFragmentKey, FooterContext footerContext, int i, Object obj) {
        if ((i & 1) != 0) {
            footerContext = matchaIncentiveLearnMoreFragmentKey.footerContext;
        }
        return matchaIncentiveLearnMoreFragmentKey.copy(footerContext);
    }

    /* renamed from: component1, reason: from getter */
    public final FooterContext getFooterContext() {
        return this.footerContext;
    }

    public final MatchaIncentiveLearnMoreFragmentKey copy(FooterContext footerContext) {
        Intrinsics.checkNotNullParameter(footerContext, "footerContext");
        return new MatchaIncentiveLearnMoreFragmentKey(footerContext);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof MatchaIncentiveLearnMoreFragmentKey) && this.footerContext == ((MatchaIncentiveLearnMoreFragmentKey) other).footerContext;
    }

    public int hashCode() {
        return this.footerContext.hashCode();
    }

    public String toString() {
        return "MatchaIncentiveLearnMoreFragmentKey(footerContext=" + this.footerContext + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.footerContext.name());
    }

    public MatchaIncentiveLearnMoreFragmentKey(FooterContext footerContext) {
        Intrinsics.checkNotNullParameter(footerContext, "footerContext");
        this.footerContext = footerContext;
    }

    public final FooterContext getFooterContext() {
        return this.footerContext;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MatchaIncentiveLearnMoreFragmentKey.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/social/contracts/matcha/MatchaIncentiveLearnMoreFragmentKey$FooterContext;", "", "<init>", "(Ljava/lang/String;I)V", "DISMISS", "PAY_AND_REQUEST", "contracts_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes5.dex */
    public static final class FooterContext {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ FooterContext[] $VALUES;
        public static final FooterContext DISMISS = new FooterContext("DISMISS", 0);
        public static final FooterContext PAY_AND_REQUEST = new FooterContext("PAY_AND_REQUEST", 1);

        private static final /* synthetic */ FooterContext[] $values() {
            return new FooterContext[]{DISMISS, PAY_AND_REQUEST};
        }

        public static EnumEntries<FooterContext> getEntries() {
            return $ENTRIES;
        }

        private FooterContext(String str, int i) {
        }

        static {
            FooterContext[] footerContextArr$values = $values();
            $VALUES = footerContextArr$values;
            $ENTRIES = EnumEntries2.enumEntries(footerContextArr$values);
        }

        public static FooterContext valueOf(String str) {
            return (FooterContext) Enum.valueOf(FooterContext.class, str);
        }

        public static FooterContext[] values() {
            return (FooterContext[]) $VALUES.clone();
        }
    }
}
