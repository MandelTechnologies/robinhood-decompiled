package com.robinhood.android.margin.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.optionsupgrade.knowledgecheckneeded.OptionOnboardingKnowledgeCheckNeededComposable5;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiDayTradeInfoStep.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/margin/model/UiDayTradeInfoStep;", "Landroid/os/Parcelable;", "title", "", OptionOnboardingKnowledgeCheckNeededComposable5.DISCLOSURE, "Lcom/robinhood/android/margin/model/UiDayTradeDisclosure;", "variants", "", "Lcom/robinhood/android/margin/model/UiDayTradeInfoVariant;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/margin/model/UiDayTradeDisclosure;Ljava/util/List;)V", "getTitle", "()Ljava/lang/String;", "getDisclosure", "()Lcom/robinhood/android/margin/model/UiDayTradeDisclosure;", "getVariants", "()Ljava/util/List;", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class UiDayTradeInfoStep implements Parcelable {
    public static final int $stable = 8;
    public static final Parcelable.Creator<UiDayTradeInfoStep> CREATOR = new Creator();
    private final UiDayTradeDisclosure disclosure;
    private final String title;
    private final List<UiDayTradeInfoVariant> variants;

    /* compiled from: UiDayTradeInfoStep.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<UiDayTradeInfoStep> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeInfoStep createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            UiDayTradeDisclosure uiDayTradeDisclosureCreateFromParcel = parcel.readInt() == 0 ? null : UiDayTradeDisclosure.CREATOR.createFromParcel(parcel);
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(UiDayTradeInfoVariant.CREATOR.createFromParcel(parcel));
            }
            return new UiDayTradeInfoStep(string2, uiDayTradeDisclosureCreateFromParcel, arrayList);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final UiDayTradeInfoStep[] newArray(int i) {
            return new UiDayTradeInfoStep[i];
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
        UiDayTradeDisclosure uiDayTradeDisclosure = this.disclosure;
        if (uiDayTradeDisclosure == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            uiDayTradeDisclosure.writeToParcel(dest, flags);
        }
        List<UiDayTradeInfoVariant> list = this.variants;
        dest.writeInt(list.size());
        Iterator<UiDayTradeInfoVariant> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
    }

    public UiDayTradeInfoStep(String title, UiDayTradeDisclosure uiDayTradeDisclosure, List<UiDayTradeInfoVariant> variants) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(variants, "variants");
        this.title = title;
        this.disclosure = uiDayTradeDisclosure;
        this.variants = variants;
    }

    public final String getTitle() {
        return this.title;
    }

    public final UiDayTradeDisclosure getDisclosure() {
        return this.disclosure;
    }

    public final List<UiDayTradeInfoVariant> getVariants() {
        return this.variants;
    }
}
