package com.robinhood.android.gold.lib.hub.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.models.serverdriven.experimental.api.Button;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGoldSweepHub.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0083\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\n\b\u0001\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0010\b\u0001\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006\u0012\u0010\b\u0001\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\n\b\u0001\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0001\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\u0011\u0010\u0012J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010'\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u008d\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0003\u0010\b\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0010\b\u0003\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u00062\u0010\b\u0003\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\n\b\u0003\u0010\u000f\u001a\u0004\u0018\u00010\u00032\u0010\b\u0003\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0006\u0010)\u001a\u00020*J\u0013\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010.HÖ\u0003J\t\u0010/\u001a\u00020*HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001J\u0016\u00101\u001a\u0002022\u0006\u00103\u001a\u0002042\u0006\u00105\u001a\u00020*R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0019\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\f\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0017R\u0019\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0017R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0019\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001a¨\u00066"}, m3636d2 = {"Lcom/robinhood/android/gold/lib/hub/api/ApiGoldSweepHub;", "Landroid/os/Parcelable;", "title", "", "amount", "rows", "", "Lcom/robinhood/android/gold/lib/hub/api/ApiSweepHubRowData;", "disclosureMarkdown", AccountOverviewOptionsSettingCard4.CTA, "Lcom/robinhood/models/serverdriven/experimental/api/Button;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "segmentedControl", "Lcom/robinhood/android/gold/lib/hub/api/GoldSegmentedControl;", "jointAccountRows", "jointAccountDisclosureMarkdown", "jointAccountCta", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Button;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/robinhood/models/serverdriven/experimental/api/Button;)V", "getTitle", "()Ljava/lang/String;", "getAmount", "getRows", "()Ljava/util/List;", "getDisclosureMarkdown", "getCta", "()Lcom/robinhood/models/serverdriven/experimental/api/Button;", "getSegmentedControl", "getJointAccountRows", "getJointAccountDisclosureMarkdown", "getJointAccountCta", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-gold-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ApiGoldSweepHub implements Parcelable {
    public static final Parcelable.Creator<ApiGoldSweepHub> CREATOR = new Creator();
    private final String amount;
    private final Button<GenericAction> cta;
    private final String disclosureMarkdown;
    private final Button<GenericAction> jointAccountCta;
    private final String jointAccountDisclosureMarkdown;
    private final List<ApiSweepHubRowData> jointAccountRows;
    private final List<ApiSweepHubRowData> rows;
    private final List<GoldSegmentedControl> segmentedControl;
    private final String title;

    /* compiled from: ApiGoldSweepHub.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGoldSweepHub> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldSweepHub createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i);
            for (int i2 = 0; i2 != i; i2++) {
                arrayList2.add(ApiSweepHubRowData.CREATOR.createFromParcel(parcel));
            }
            String string4 = parcel.readString();
            Button button = (Button) parcel.readParcelable(ApiGoldSweepHub.class.getClassLoader());
            ArrayList arrayList3 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i3 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList4.add(GoldSegmentedControl.CREATOR.createFromParcel(parcel));
                }
                arrayList = arrayList4;
            }
            if (parcel.readInt() != 0) {
                int i5 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList5.add(ApiSweepHubRowData.CREATOR.createFromParcel(parcel));
                }
                arrayList3 = arrayList5;
            }
            return new ApiGoldSweepHub(string2, string3, arrayList2, string4, button, arrayList, arrayList3, parcel.readString(), (Button) parcel.readParcelable(ApiGoldSweepHub.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGoldSweepHub[] newArray(int i) {
            return new ApiGoldSweepHub[i];
        }
    }

    public static /* synthetic */ ApiGoldSweepHub copy$default(ApiGoldSweepHub apiGoldSweepHub, String str, String str2, List list, String str3, Button button, List list2, List list3, String str4, Button button2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = apiGoldSweepHub.title;
        }
        if ((i & 2) != 0) {
            str2 = apiGoldSweepHub.amount;
        }
        if ((i & 4) != 0) {
            list = apiGoldSweepHub.rows;
        }
        if ((i & 8) != 0) {
            str3 = apiGoldSweepHub.disclosureMarkdown;
        }
        if ((i & 16) != 0) {
            button = apiGoldSweepHub.cta;
        }
        if ((i & 32) != 0) {
            list2 = apiGoldSweepHub.segmentedControl;
        }
        if ((i & 64) != 0) {
            list3 = apiGoldSweepHub.jointAccountRows;
        }
        if ((i & 128) != 0) {
            str4 = apiGoldSweepHub.jointAccountDisclosureMarkdown;
        }
        if ((i & 256) != 0) {
            button2 = apiGoldSweepHub.jointAccountCta;
        }
        String str5 = str4;
        Button button3 = button2;
        List list4 = list2;
        List list5 = list3;
        Button button4 = button;
        List list6 = list;
        return apiGoldSweepHub.copy(str, str2, list6, str3, button4, list4, list5, str5, button3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAmount() {
        return this.amount;
    }

    public final List<ApiSweepHubRowData> component3() {
        return this.rows;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final Button<GenericAction> component5() {
        return this.cta;
    }

    public final List<GoldSegmentedControl> component6() {
        return this.segmentedControl;
    }

    public final List<ApiSweepHubRowData> component7() {
        return this.jointAccountRows;
    }

    /* renamed from: component8, reason: from getter */
    public final String getJointAccountDisclosureMarkdown() {
        return this.jointAccountDisclosureMarkdown;
    }

    public final Button<GenericAction> component9() {
        return this.jointAccountCta;
    }

    public final ApiGoldSweepHub copy(String title, String amount, List<ApiSweepHubRowData> rows, @Json(name = "disclosure_markdown") String disclosureMarkdown, Button<? extends GenericAction> cta, @Json(name = "segmented_control") List<GoldSegmentedControl> segmentedControl, @Json(name = "rows_ja") List<ApiSweepHubRowData> jointAccountRows, @Json(name = "disclosure_markdown_ja") String jointAccountDisclosureMarkdown, @Json(name = "cta_ja") Button<? extends GenericAction> jointAccountCta) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(rows, "rows");
        return new ApiGoldSweepHub(title, amount, rows, disclosureMarkdown, cta, segmentedControl, jointAccountRows, jointAccountDisclosureMarkdown, jointAccountCta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGoldSweepHub)) {
            return false;
        }
        ApiGoldSweepHub apiGoldSweepHub = (ApiGoldSweepHub) other;
        return Intrinsics.areEqual(this.title, apiGoldSweepHub.title) && Intrinsics.areEqual(this.amount, apiGoldSweepHub.amount) && Intrinsics.areEqual(this.rows, apiGoldSweepHub.rows) && Intrinsics.areEqual(this.disclosureMarkdown, apiGoldSweepHub.disclosureMarkdown) && Intrinsics.areEqual(this.cta, apiGoldSweepHub.cta) && Intrinsics.areEqual(this.segmentedControl, apiGoldSweepHub.segmentedControl) && Intrinsics.areEqual(this.jointAccountRows, apiGoldSweepHub.jointAccountRows) && Intrinsics.areEqual(this.jointAccountDisclosureMarkdown, apiGoldSweepHub.jointAccountDisclosureMarkdown) && Intrinsics.areEqual(this.jointAccountCta, apiGoldSweepHub.jointAccountCta);
    }

    public int hashCode() {
        int iHashCode = ((((this.title.hashCode() * 31) + this.amount.hashCode()) * 31) + this.rows.hashCode()) * 31;
        String str = this.disclosureMarkdown;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        Button<GenericAction> button = this.cta;
        int iHashCode3 = (iHashCode2 + (button == null ? 0 : button.hashCode())) * 31;
        List<GoldSegmentedControl> list = this.segmentedControl;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        List<ApiSweepHubRowData> list2 = this.jointAccountRows;
        int iHashCode5 = (iHashCode4 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str2 = this.jointAccountDisclosureMarkdown;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Button<GenericAction> button2 = this.jointAccountCta;
        return iHashCode6 + (button2 != null ? button2.hashCode() : 0);
    }

    public String toString() {
        return "ApiGoldSweepHub(title=" + this.title + ", amount=" + this.amount + ", rows=" + this.rows + ", disclosureMarkdown=" + this.disclosureMarkdown + ", cta=" + this.cta + ", segmentedControl=" + this.segmentedControl + ", jointAccountRows=" + this.jointAccountRows + ", jointAccountDisclosureMarkdown=" + this.jointAccountDisclosureMarkdown + ", jointAccountCta=" + this.jointAccountCta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeString(this.title);
        dest.writeString(this.amount);
        List<ApiSweepHubRowData> list = this.rows;
        dest.writeInt(list.size());
        Iterator<ApiSweepHubRowData> it = list.iterator();
        while (it.hasNext()) {
            it.next().writeToParcel(dest, flags);
        }
        dest.writeString(this.disclosureMarkdown);
        dest.writeParcelable(this.cta, flags);
        List<GoldSegmentedControl> list2 = this.segmentedControl;
        if (list2 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list2.size());
            Iterator<GoldSegmentedControl> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().writeToParcel(dest, flags);
            }
        }
        List<ApiSweepHubRowData> list3 = this.jointAccountRows;
        if (list3 == null) {
            dest.writeInt(0);
        } else {
            dest.writeInt(1);
            dest.writeInt(list3.size());
            Iterator<ApiSweepHubRowData> it3 = list3.iterator();
            while (it3.hasNext()) {
                it3.next().writeToParcel(dest, flags);
            }
        }
        dest.writeString(this.jointAccountDisclosureMarkdown);
        dest.writeParcelable(this.jointAccountCta, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGoldSweepHub(String title, String amount, List<ApiSweepHubRowData> rows, @Json(name = "disclosure_markdown") String str, Button<? extends GenericAction> button, @Json(name = "segmented_control") List<GoldSegmentedControl> list, @Json(name = "rows_ja") List<ApiSweepHubRowData> list2, @Json(name = "disclosure_markdown_ja") String str2, @Json(name = "cta_ja") Button<? extends GenericAction> button2) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(amount, "amount");
        Intrinsics.checkNotNullParameter(rows, "rows");
        this.title = title;
        this.amount = amount;
        this.rows = rows;
        this.disclosureMarkdown = str;
        this.cta = button;
        this.segmentedControl = list;
        this.jointAccountRows = list2;
        this.jointAccountDisclosureMarkdown = str2;
        this.jointAccountCta = button2;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getAmount() {
        return this.amount;
    }

    public final List<ApiSweepHubRowData> getRows() {
        return this.rows;
    }

    public final String getDisclosureMarkdown() {
        return this.disclosureMarkdown;
    }

    public final Button<GenericAction> getCta() {
        return this.cta;
    }

    public final List<GoldSegmentedControl> getSegmentedControl() {
        return this.segmentedControl;
    }

    public final List<ApiSweepHubRowData> getJointAccountRows() {
        return this.jointAccountRows;
    }

    public final String getJointAccountDisclosureMarkdown() {
        return this.jointAccountDisclosureMarkdown;
    }

    public final Button<GenericAction> getJointAccountCta() {
        return this.jointAccountCta;
    }
}
