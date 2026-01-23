package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.models.serverdriven.experimental.api.GoldDepositBoostHubAction;
import com.robinhood.models.serverdriven.experimental.api.TextButton;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiDepositBoostHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u0011\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J?\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0006\u0010\u0019\u001a\u00020\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020\u001aHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001J\u0016\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$2\u0006\u0010%\u001a\u00020\u001aR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006&"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutSection;", "Landroid/os/Parcelable;", "title", "", "descriptionMarkdown", "payouts", "", "Lcom/robinhood/android/gold/lib/hub/api/GoldDepositBoostHubPayoutInfo;", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "Lcom/robinhood/models/serverdriven/experimental/api/GoldDepositBoostHubAction;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/robinhood/models/serverdriven/experimental/api/TextButton;)V", "getTitle", "()Ljava/lang/String;", "getDescriptionMarkdown", "getPayouts", "()Ljava/util/List;", "getCta", "()Lcom/robinhood/models/serverdriven/experimental/api/TextButton;", "component1", "component2", "component3", "component4", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class GoldDepositBoostHubPayoutSection implements Parcelable {
    public static final Parcelable.Creator<GoldDepositBoostHubPayoutSection> CREATOR = new Creator();
    private final TextButton<GoldDepositBoostHubAction> cta;
    private final String descriptionMarkdown;
    private final List<GoldDepositBoostHubPayoutInfo> payouts;
    private final String title;

    /* compiled from: ApiDepositBoostHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<GoldDepositBoostHubPayoutSection> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDepositBoostHubPayoutSection createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList.add(GoldDepositBoostHubPayoutInfo.CREATOR.createFromParcel(parcel));
            }
            return new GoldDepositBoostHubPayoutSection(string2, string3, arrayList, (TextButton) parcel.readParcelable(GoldDepositBoostHubPayoutSection.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final GoldDepositBoostHubPayoutSection[] newArray(int i) {
            return new GoldDepositBoostHubPayoutSection[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GoldDepositBoostHubPayoutSection copy$default(GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection, String str, String str2, List list, TextButton textButton, int i, Object obj) {
        if ((i & 1) != 0) {
            str = goldDepositBoostHubPayoutSection.title;
        }
        if ((i & 2) != 0) {
            str2 = goldDepositBoostHubPayoutSection.descriptionMarkdown;
        }
        if ((i & 4) != 0) {
            list = goldDepositBoostHubPayoutSection.payouts;
        }
        if ((i & 8) != 0) {
            textButton = goldDepositBoostHubPayoutSection.cta;
        }
        return goldDepositBoostHubPayoutSection.copy(str, str2, list, textButton);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    public final List<GoldDepositBoostHubPayoutInfo> component3() {
        return this.payouts;
    }

    public final TextButton<GoldDepositBoostHubAction> component4() {
        return this.cta;
    }

    public final GoldDepositBoostHubPayoutSection copy(String title, @Json(name = "description") String descriptionMarkdown, List<GoldDepositBoostHubPayoutInfo> payouts, TextButton<? extends GoldDepositBoostHubAction> cta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(payouts, "payouts");
        return new GoldDepositBoostHubPayoutSection(title, descriptionMarkdown, payouts, cta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GoldDepositBoostHubPayoutSection)) {
            return false;
        }
        GoldDepositBoostHubPayoutSection goldDepositBoostHubPayoutSection = (GoldDepositBoostHubPayoutSection) other;
        return Intrinsics.areEqual(this.title, goldDepositBoostHubPayoutSection.title) && Intrinsics.areEqual(this.descriptionMarkdown, goldDepositBoostHubPayoutSection.descriptionMarkdown) && Intrinsics.areEqual(this.payouts, goldDepositBoostHubPayoutSection.payouts) && Intrinsics.areEqual(this.cta, goldDepositBoostHubPayoutSection.cta);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.descriptionMarkdown.hashCode()) * 31) + this.payouts.hashCode()) * 31;
        TextButton<GoldDepositBoostHubAction> textButton = this.cta;
        return iHashCode + (textButton == null ? 0 : textButton.hashCode());
    }

    public String toString() {
        return "GoldDepositBoostHubPayoutSection(title=" + this.title + ", descriptionMarkdown=" + this.descriptionMarkdown + ", payouts=" + this.payouts + ", cta=" + this.cta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.descriptionMarkdown);
        List<GoldDepositBoostHubPayoutInfo> list = this.payouts;
        dest.writeInt(list.size());
        Iterator<GoldDepositBoostHubPayoutInfo> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeParcelable(this.cta, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public GoldDepositBoostHubPayoutSection(String title, @Json(name = "description") String descriptionMarkdown, List<GoldDepositBoostHubPayoutInfo> payouts, TextButton<? extends GoldDepositBoostHubAction> textButton) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(descriptionMarkdown, "descriptionMarkdown");
        Intrinsics.checkNotNullParameter(payouts, "payouts");
        this.title = title;
        this.descriptionMarkdown = descriptionMarkdown;
        this.payouts = payouts;
        this.cta = textButton;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getDescriptionMarkdown() {
        return this.descriptionMarkdown;
    }

    public final List<GoldDepositBoostHubPayoutInfo> getPayouts() {
        return this.payouts;
    }

    public final TextButton<GoldDepositBoostHubAction> getCta() {
        return this.cta;
    }
}
