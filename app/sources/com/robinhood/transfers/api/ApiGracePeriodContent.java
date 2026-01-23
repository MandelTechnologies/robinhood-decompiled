package com.robinhood.transfers.api;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.account.p060ui.AccountOverviewOptionsSettingCard4;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ApiGracePeriodContent.kt */
@JsonClass(generateAdapter = true)
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J;\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0006\u0010\u0011\u001a\u00020\u0012J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\u0016\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u0012R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\n¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/transfers/api/ApiGracePeriodContent;", "Landroid/os/Parcelable;", "banner_sdui", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "details_sdui", AccountOverviewOptionsSettingCard4.CTA, "<init>", "(Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;)V", "getBanner_sdui", "()Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "getDetails_sdui", "getCta", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-models-transfer-api_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ApiGracePeriodContent implements Parcelable {
    public static final Parcelable.Creator<ApiGracePeriodContent> CREATOR = new Creator();
    private final UIComponent<GenericAction> banner_sdui;
    private final UIComponent<GenericAction> cta;
    private final UIComponent<GenericAction> details_sdui;

    /* compiled from: ApiGracePeriodContent.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Creator implements Parcelable.Creator<ApiGracePeriodContent> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGracePeriodContent createFromParcel(Parcel parcel) {
            Intrinsics.checkNotNullParameter(parcel, "parcel");
            return new ApiGracePeriodContent((UIComponent) parcel.readParcelable(ApiGracePeriodContent.class.getClassLoader()), (UIComponent) parcel.readParcelable(ApiGracePeriodContent.class.getClassLoader()), (UIComponent) parcel.readParcelable(ApiGracePeriodContent.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public final ApiGracePeriodContent[] newArray(int i) {
            return new ApiGracePeriodContent[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ApiGracePeriodContent copy$default(ApiGracePeriodContent apiGracePeriodContent, UIComponent uIComponent, UIComponent uIComponent2, UIComponent uIComponent3, int i, Object obj) {
        if ((i & 1) != 0) {
            uIComponent = apiGracePeriodContent.banner_sdui;
        }
        if ((i & 2) != 0) {
            uIComponent2 = apiGracePeriodContent.details_sdui;
        }
        if ((i & 4) != 0) {
            uIComponent3 = apiGracePeriodContent.cta;
        }
        return apiGracePeriodContent.copy(uIComponent, uIComponent2, uIComponent3);
    }

    public final UIComponent<GenericAction> component1() {
        return this.banner_sdui;
    }

    public final UIComponent<GenericAction> component2() {
        return this.details_sdui;
    }

    public final UIComponent<GenericAction> component3() {
        return this.cta;
    }

    public final ApiGracePeriodContent copy(UIComponent<? extends GenericAction> banner_sdui, UIComponent<? extends GenericAction> details_sdui, UIComponent<? extends GenericAction> cta) {
        Intrinsics.checkNotNullParameter(banner_sdui, "banner_sdui");
        Intrinsics.checkNotNullParameter(details_sdui, "details_sdui");
        return new ApiGracePeriodContent(banner_sdui, details_sdui, cta);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ApiGracePeriodContent)) {
            return false;
        }
        ApiGracePeriodContent apiGracePeriodContent = (ApiGracePeriodContent) other;
        return Intrinsics.areEqual(this.banner_sdui, apiGracePeriodContent.banner_sdui) && Intrinsics.areEqual(this.details_sdui, apiGracePeriodContent.details_sdui) && Intrinsics.areEqual(this.cta, apiGracePeriodContent.cta);
    }

    public int hashCode() {
        int iHashCode = ((this.banner_sdui.hashCode() * 31) + this.details_sdui.hashCode()) * 31;
        UIComponent<GenericAction> uIComponent = this.cta;
        return iHashCode + (uIComponent == null ? 0 : uIComponent.hashCode());
    }

    public String toString() {
        return "ApiGracePeriodContent(banner_sdui=" + this.banner_sdui + ", details_sdui=" + this.details_sdui + ", cta=" + this.cta + ")";
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel dest, int flags) {
        Intrinsics.checkNotNullParameter(dest, "dest");
        dest.writeParcelable(this.banner_sdui, flags);
        dest.writeParcelable(this.details_sdui, flags);
        dest.writeParcelable(this.cta, flags);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ApiGracePeriodContent(UIComponent<? extends GenericAction> banner_sdui, UIComponent<? extends GenericAction> details_sdui, UIComponent<? extends GenericAction> uIComponent) {
        Intrinsics.checkNotNullParameter(banner_sdui, "banner_sdui");
        Intrinsics.checkNotNullParameter(details_sdui, "details_sdui");
        this.banner_sdui = banner_sdui;
        this.details_sdui = details_sdui;
        this.cta = uIComponent;
    }

    public final UIComponent<GenericAction> getBanner_sdui() {
        return this.banner_sdui;
    }

    public final UIComponent<GenericAction> getDetails_sdui() {
        return this.details_sdui;
    }

    public final UIComponent<GenericAction> getCta() {
        return this.cta;
    }
}
