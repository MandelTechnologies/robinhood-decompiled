package com.robinhood.staticcontent.model.margin;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MarginInterestRateComparisonContent.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001aB3\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\n\u0010\u000bJ\u0006\u0010\u0013\u001a\u00020\u0014J\u0016\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonContent;", "Landroid/os/Parcelable;", "title", "", "description", "", "brokerageInterestRate", "", "Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonContent$BrokerageInterestRateItem;", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "<init>", "(Ljava/lang/String;Ljava/lang/CharSequence;Ljava/util/List;Ljava/lang/CharSequence;)V", "getTitle", "()Ljava/lang/String;", "getDescription", "()Ljava/lang/CharSequence;", "getBrokerageInterestRate", "()Ljava/util/List;", "getDisclosure", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "BrokerageInterestRateItem", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final class MarginInterestRateComparisonContent implements Parcelable {
    public static final Parcelable.Creator<MarginInterestRateComparisonContent> CREATOR = new Creator();
    private final List<BrokerageInterestRateItem> brokerageInterestRate;
    private final CharSequence description;
    private final CharSequence disclosure;
    private final String title;

    /* compiled from: MarginInterestRateComparisonContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<MarginInterestRateComparisonContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInterestRateComparisonContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            CharSequence charSequence = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(BrokerageInterestRateItem.CREATOR.createFromParcel(parcel));
            }
            return new MarginInterestRateComparisonContent(string2, charSequence, arrayList, (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final MarginInterestRateComparisonContent[] newArray(int i) {
            return new MarginInterestRateComparisonContent[i];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        TextUtils.writeToParcel(this.description, dest, flags);
        List<BrokerageInterestRateItem> list = this.brokerageInterestRate;
        dest.writeInt(list.size());
        Iterator<BrokerageInterestRateItem> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        TextUtils.writeToParcel(this.disclosure, dest, flags);
    }

    public MarginInterestRateComparisonContent(String str, CharSequence charSequence, List<BrokerageInterestRateItem> brokerageInterestRate, CharSequence charSequence2) {
        Intrinsics.checkNotNullParameter(brokerageInterestRate, "brokerageInterestRate");
        this.title = str;
        this.description = charSequence;
        this.brokerageInterestRate = brokerageInterestRate;
        this.disclosure = charSequence2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final CharSequence getDescription() {
        return this.description;
    }

    public final List<BrokerageInterestRateItem> getBrokerageInterestRate() {
        return this.brokerageInterestRate;
    }

    public final CharSequence getDisclosure() {
        return this.disclosure;
    }

    /* compiled from: MarginInterestRateComparisonContent.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J)\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0006\u0010\u0013\u001a\u00020\u0014J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0014R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/staticcontent/model/margin/MarginInterestRateComparisonContent$BrokerageInterestRateItem;", "Landroid/os/Parcelable;", "title", "", "interestRate", "", "isBold", "", "<init>", "(Ljava/lang/String;FZ)V", "getTitle", "()Ljava/lang/String;", "getInterestRate", "()F", "()Z", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-static-content_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class BrokerageInterestRateItem implements Parcelable {
        public static final Parcelable.Creator<BrokerageInterestRateItem> CREATOR = new Creator();
        private final float interestRate;
        private final boolean isBold;
        private final String title;

        /* compiled from: MarginInterestRateComparisonContent.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<BrokerageInterestRateItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BrokerageInterestRateItem createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new BrokerageInterestRateItem(parcel.readString(), parcel.readFloat(), parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final BrokerageInterestRateItem[] newArray(int i) {
                return new BrokerageInterestRateItem[i];
            }
        }

        public static /* synthetic */ BrokerageInterestRateItem copy$default(BrokerageInterestRateItem brokerageInterestRateItem, String str, float f, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                str = brokerageInterestRateItem.title;
            }
            if ((i & 2) != 0) {
                f = brokerageInterestRateItem.interestRate;
            }
            if ((i & 4) != 0) {
                z = brokerageInterestRateItem.isBold;
            }
            return brokerageInterestRateItem.copy(str, f, z);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final float getInterestRate() {
            return this.interestRate;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsBold() {
            return this.isBold;
        }

        public final BrokerageInterestRateItem copy(String title, float interestRate, boolean isBold) {
            return new BrokerageInterestRateItem(title, interestRate, isBold);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof BrokerageInterestRateItem)) {
                return false;
            }
            BrokerageInterestRateItem brokerageInterestRateItem = (BrokerageInterestRateItem) other;
            return Intrinsics.areEqual(this.title, brokerageInterestRateItem.title) && Float.compare(this.interestRate, brokerageInterestRateItem.interestRate) == 0 && this.isBold == brokerageInterestRateItem.isBold;
        }

        public int hashCode() {
            String str = this.title;
            return ((((str == null ? 0 : str.hashCode()) * 31) + Float.hashCode(this.interestRate)) * 31) + Boolean.hashCode(this.isBold);
        }

        public String toString() {
            return "BrokerageInterestRateItem(title=" + this.title + ", interestRate=" + this.interestRate + ", isBold=" + this.isBold + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeString(this.title);
            dest.writeFloat(this.interestRate);
            dest.writeInt(this.isBold ? 1 : 0);
        }

        public BrokerageInterestRateItem(String str, float f, boolean z) {
            this.title = str;
            this.interestRate = f;
            this.isBold = z;
        }

        public final String getTitle() {
            return this.title;
        }

        public final float getInterestRate() {
            return this.interestRate;
        }

        public final boolean isBold() {
            return this.isBold;
        }
    }
}
