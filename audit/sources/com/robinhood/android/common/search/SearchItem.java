package com.robinhood.android.common.search;

import android.os.Parcel;
import android.os.Parcelable;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.models.crypto.p314db.Currency;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.models.p320db.Instrument;
import com.robinhood.models.p320db.Position;
import com.robinhood.models.p320db.Position5;
import java.math.BigDecimal;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SearchItem.kt */
@Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\t\f\r\u000e\u000f\u0010\u0011\u0012\u0013\u0014B\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H&J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0000H&R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\t\u0015\u0016\u0017\u0018\u0019\u001a\u001b\u001c\u001d¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem;", "", "viewType", "", "<init>", "(I)V", "getViewType", "()I", "areItemsTheSame", "", "other", "areContentsTheSame", "SearchHeader", "SearchHeaderWithIcon", "InstrumentResult", "InstrumentPositionResult", "CryptoResult", "CryptoHoldingResult", "SearchLearnMoreRow", "Disclaimer", "RurSavingsChoice", "Lcom/robinhood/android/common/search/SearchItem$CryptoHoldingResult;", "Lcom/robinhood/android/common/search/SearchItem$CryptoResult;", "Lcom/robinhood/android/common/search/SearchItem$Disclaimer;", "Lcom/robinhood/android/common/search/SearchItem$InstrumentPositionResult;", "Lcom/robinhood/android/common/search/SearchItem$InstrumentResult;", "Lcom/robinhood/android/common/search/SearchItem$RurSavingsChoice;", "Lcom/robinhood/android/common/search/SearchItem$SearchHeader;", "Lcom/robinhood/android/common/search/SearchItem$SearchHeaderWithIcon;", "Lcom/robinhood/android/common/search/SearchItem$SearchLearnMoreRow;", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes2.dex */
public abstract class SearchItem {
    public static final int $stable = 0;
    private final int viewType;

    public /* synthetic */ SearchItem(int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(i);
    }

    public abstract boolean areContentsTheSame(SearchItem other);

    public abstract boolean areItemsTheSame(SearchItem other);

    private SearchItem(int i) {
        this.viewType = i;
    }

    public final int getViewType() {
        return this.viewType;
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016J\u0010\u0010\u000b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u0001H\u0016J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$SearchHeader;", "Lcom/robinhood/android/common/search/SearchItem;", "headerText", "", "<init>", "(Ljava/lang/CharSequence;)V", "getHeaderText", "()Ljava/lang/CharSequence;", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "copy", "equals", "", "hashCode", "", "toString", "", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SearchHeader extends SearchItem {
        public static final int $stable = 8;
        private final CharSequence headerText;

        public static /* synthetic */ SearchHeader copy$default(SearchHeader searchHeader, CharSequence charSequence, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = searchHeader.headerText;
            }
            return searchHeader.copy(charSequence);
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return true;
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getHeaderText() {
            return this.headerText;
        }

        public final SearchHeader copy(CharSequence headerText) {
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            return new SearchHeader(headerText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SearchHeader) && Intrinsics.areEqual(this.headerText, ((SearchHeader) other).headerText);
        }

        public int hashCode() {
            return this.headerText.hashCode();
        }

        public String toString() {
            return "SearchHeader(headerText=" + ((Object) this.headerText) + ")";
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchHeader(CharSequence headerText) {
            super(0, null);
            Intrinsics.checkNotNullParameter(headerText, "headerText");
            this.headerText = headerText;
        }

        public final CharSequence getHeaderText() {
            return this.headerText;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            SearchHeader searchHeader = other instanceof SearchHeader ? (SearchHeader) other : null;
            if (searchHeader == null) {
                return false;
            }
            return Intrinsics.areEqual(this.headerText, searchHeader.headerText);
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J\u0010\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\bHÆ\u0003J3\u0010\u001a\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$SearchHeaderWithIcon;", "Lcom/robinhood/android/common/search/SearchItem;", "headerTextRes", "", "linkStringRes", "iconAsset", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "contentDescription", "", "<init>", "(IILcom/robinhood/android/libdesignsystem/serverui/IconAsset;Ljava/lang/String;)V", "getHeaderTextRes", "()I", "getLinkStringRes", "getIconAsset", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "getContentDescription", "()Ljava/lang/String;", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "toString", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SearchHeaderWithIcon extends SearchItem {
        public static final int $stable = 0;
        private final String contentDescription;
        private final int headerTextRes;
        private final ServerToBentoAssetMapper2 iconAsset;
        private final int linkStringRes;

        public static /* synthetic */ SearchHeaderWithIcon copy$default(SearchHeaderWithIcon searchHeaderWithIcon, int i, int i2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = searchHeaderWithIcon.headerTextRes;
            }
            if ((i3 & 2) != 0) {
                i2 = searchHeaderWithIcon.linkStringRes;
            }
            if ((i3 & 4) != 0) {
                serverToBentoAssetMapper2 = searchHeaderWithIcon.iconAsset;
            }
            if ((i3 & 8) != 0) {
                str = searchHeaderWithIcon.contentDescription;
            }
            return searchHeaderWithIcon.copy(i, i2, serverToBentoAssetMapper2, str);
        }

        /* renamed from: component1, reason: from getter */
        public final int getHeaderTextRes() {
            return this.headerTextRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getLinkStringRes() {
            return this.linkStringRes;
        }

        /* renamed from: component3, reason: from getter */
        public final ServerToBentoAssetMapper2 getIconAsset() {
            return this.iconAsset;
        }

        /* renamed from: component4, reason: from getter */
        public final String getContentDescription() {
            return this.contentDescription;
        }

        public final SearchHeaderWithIcon copy(int headerTextRes, int linkStringRes, ServerToBentoAssetMapper2 iconAsset, String contentDescription) {
            Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
            return new SearchHeaderWithIcon(headerTextRes, linkStringRes, iconAsset, contentDescription);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchHeaderWithIcon)) {
                return false;
            }
            SearchHeaderWithIcon searchHeaderWithIcon = (SearchHeaderWithIcon) other;
            return this.headerTextRes == searchHeaderWithIcon.headerTextRes && this.linkStringRes == searchHeaderWithIcon.linkStringRes && this.iconAsset == searchHeaderWithIcon.iconAsset && Intrinsics.areEqual(this.contentDescription, searchHeaderWithIcon.contentDescription);
        }

        public int hashCode() {
            int iHashCode = ((((Integer.hashCode(this.headerTextRes) * 31) + Integer.hashCode(this.linkStringRes)) * 31) + this.iconAsset.hashCode()) * 31;
            String str = this.contentDescription;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "SearchHeaderWithIcon(headerTextRes=" + this.headerTextRes + ", linkStringRes=" + this.linkStringRes + ", iconAsset=" + this.iconAsset + ", contentDescription=" + this.contentDescription + ")";
        }

        public /* synthetic */ SearchHeaderWithIcon(int i, int i2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, String str, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, serverToBentoAssetMapper2, (i3 & 8) != 0 ? null : str);
        }

        public final int getHeaderTextRes() {
            return this.headerTextRes;
        }

        public final int getLinkStringRes() {
            return this.linkStringRes;
        }

        public final ServerToBentoAssetMapper2 getIconAsset() {
            return this.iconAsset;
        }

        public final String getContentDescription() {
            return this.contentDescription;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchHeaderWithIcon(int i, int i2, ServerToBentoAssetMapper2 iconAsset, String str) {
            super(5, null);
            Intrinsics.checkNotNullParameter(iconAsset, "iconAsset");
            this.headerTextRes = i;
            this.linkStringRes = i2;
            this.iconAsset = iconAsset;
            this.contentDescription = str;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            SearchHeaderWithIcon searchHeaderWithIcon = other instanceof SearchHeaderWithIcon ? (SearchHeaderWithIcon) other : null;
            return searchHeaderWithIcon != null && this.headerTextRes == searchHeaderWithIcon.headerTextRes;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            SearchHeaderWithIcon searchHeaderWithIcon = other instanceof SearchHeaderWithIcon ? (SearchHeaderWithIcon) other : null;
            return searchHeaderWithIcon != null && this.headerTextRes == searchHeaderWithIcon.headerTextRes;
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B#\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0016J\u0010\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u0011\u001a\u00020\u0001H\u0016J\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J'\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001J\u0006\u0010\u0017\u001a\u00020\u0018J\u0013\u0010\u0019\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u0018HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\u0016\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u0018R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\f\"\u0004\b\r\u0010\u000eR\u001a\u0010\u0007\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\f\"\u0004\b\u000f\u0010\u000e¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$InstrumentResult;", "Lcom/robinhood/android/common/search/SearchItem;", "Landroid/os/Parcelable;", "instrument", "Lcom/robinhood/models/db/Instrument;", "isEnabled", "", "isChecked", "<init>", "(Lcom/robinhood/models/db/Instrument;ZZ)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "()Z", "setEnabled", "(Z)V", "setChecked", "areItemsTheSame", "other", "areContentsTheSame", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InstrumentResult extends SearchItem implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InstrumentResult> CREATOR = new Creator();
        private final Instrument instrument;
        private boolean isChecked;
        private boolean isEnabled;

        /* compiled from: SearchItem.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InstrumentResult> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentResult createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InstrumentResult((Instrument) parcel.readParcelable(InstrumentResult.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InstrumentResult[] newArray(int i) {
                return new InstrumentResult[i];
            }
        }

        public static /* synthetic */ InstrumentResult copy$default(InstrumentResult instrumentResult, Instrument instrument, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = instrumentResult.instrument;
            }
            if ((i & 2) != 0) {
                z = instrumentResult.isEnabled;
            }
            if ((i & 4) != 0) {
                z2 = instrumentResult.isChecked;
            }
            return instrumentResult.copy(instrument, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final InstrumentResult copy(Instrument instrument, boolean isEnabled, boolean isChecked) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            return new InstrumentResult(instrument, isEnabled, isChecked);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentResult)) {
                return false;
            }
            InstrumentResult instrumentResult = (InstrumentResult) other;
            return Intrinsics.areEqual(this.instrument, instrumentResult.instrument) && this.isEnabled == instrumentResult.isEnabled && this.isChecked == instrumentResult.isChecked;
        }

        public int hashCode() {
            return (((this.instrument.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "InstrumentResult(instrument=" + this.instrument + ", isEnabled=" + this.isEnabled + ", isChecked=" + this.isChecked + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.instrument, flags);
            dest.writeInt(this.isEnabled ? 1 : 0);
            dest.writeInt(this.isChecked ? 1 : 0);
        }

        public /* synthetic */ InstrumentResult(Instrument instrument, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(instrument, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final void setEnabled(boolean z) {
            this.isEnabled = z;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentResult(Instrument instrument, boolean z, boolean z2) {
            super(2, null);
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            this.instrument = instrument;
            this.isEnabled = z;
            this.isChecked = z2;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            InstrumentResult instrumentResult = other instanceof InstrumentResult ? (InstrumentResult) other : null;
            if (instrumentResult == null) {
                return false;
            }
            return Intrinsics.areEqual(this.instrument.getId(), instrumentResult.instrument.getId());
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            InstrumentResult instrumentResult = other instanceof InstrumentResult ? (InstrumentResult) other : null;
            return instrumentResult != null && Intrinsics.areEqual(this.instrument.getSymbol(), instrumentResult.instrument.getSymbol()) && Intrinsics.areEqual(this.instrument.getSimpleName(), instrumentResult.instrument.getSimpleName()) && this.isEnabled == instrumentResult.isEnabled && this.isChecked == instrumentResult.isChecked;
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\u0010\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0001H\u0016J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0007HÆ\u0003J1\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00072\b\u0010\u0013\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000fR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$InstrumentPositionResult;", "Lcom/robinhood/android/common/search/SearchItem;", "instrument", "Lcom/robinhood/models/db/Instrument;", "position", "Lcom/robinhood/models/db/Position;", "isEnabled", "", "isChecked", "<init>", "(Lcom/robinhood/models/db/Instrument;Lcom/robinhood/models/db/Position;ZZ)V", "getInstrument", "()Lcom/robinhood/models/db/Instrument;", "getPosition", "()Lcom/robinhood/models/db/Position;", "()Z", "setChecked", "(Z)V", "areItemsTheSame", "other", "areContentsTheSame", "component1", "component2", "component3", "component4", "copy", "equals", "", "hashCode", "", "toString", "", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InstrumentPositionResult extends SearchItem {
        public static final int $stable = 8;
        private final Instrument instrument;
        private boolean isChecked;
        private final boolean isEnabled;
        private final Position position;

        public static /* synthetic */ InstrumentPositionResult copy$default(InstrumentPositionResult instrumentPositionResult, Instrument instrument, Position position, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                instrument = instrumentPositionResult.instrument;
            }
            if ((i & 2) != 0) {
                position = instrumentPositionResult.position;
            }
            if ((i & 4) != 0) {
                z = instrumentPositionResult.isEnabled;
            }
            if ((i & 8) != 0) {
                z2 = instrumentPositionResult.isChecked;
            }
            return instrumentPositionResult.copy(instrument, position, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final Instrument getInstrument() {
            return this.instrument;
        }

        /* renamed from: component2, reason: from getter */
        public final Position getPosition() {
            return this.position;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component4, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final InstrumentPositionResult copy(Instrument instrument, Position position, boolean isEnabled, boolean isChecked) {
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(position, "position");
            return new InstrumentPositionResult(instrument, position, isEnabled, isChecked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InstrumentPositionResult)) {
                return false;
            }
            InstrumentPositionResult instrumentPositionResult = (InstrumentPositionResult) other;
            return Intrinsics.areEqual(this.instrument, instrumentPositionResult.instrument) && Intrinsics.areEqual(this.position, instrumentPositionResult.position) && this.isEnabled == instrumentPositionResult.isEnabled && this.isChecked == instrumentPositionResult.isChecked;
        }

        public int hashCode() {
            return (((((this.instrument.hashCode() * 31) + this.position.hashCode()) * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "InstrumentPositionResult(instrument=" + this.instrument + ", position=" + this.position + ", isEnabled=" + this.isEnabled + ", isChecked=" + this.isChecked + ")";
        }

        public /* synthetic */ InstrumentPositionResult(Instrument instrument, Position position, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(instrument, position, (i & 4) != 0 ? true : z, (i & 8) != 0 ? false : z2);
        }

        public final Instrument getInstrument() {
            return this.instrument;
        }

        public final Position getPosition() {
            return this.position;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InstrumentPositionResult(Instrument instrument, Position position, boolean z, boolean z2) {
            super(1, null);
            Intrinsics.checkNotNullParameter(instrument, "instrument");
            Intrinsics.checkNotNullParameter(position, "position");
            this.instrument = instrument;
            this.position = position;
            this.isEnabled = z;
            this.isChecked = z2;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            InstrumentPositionResult instrumentPositionResult = other instanceof InstrumentPositionResult ? (InstrumentPositionResult) other : null;
            return instrumentPositionResult != null && Intrinsics.areEqual(this.instrument.getId(), instrumentPositionResult.instrument.getId()) && Intrinsics.areEqual(this.position.getInstrument(), instrumentPositionResult.position.getInstrument());
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            InstrumentPositionResult instrumentPositionResult = other instanceof InstrumentPositionResult ? (InstrumentPositionResult) other : null;
            return instrumentPositionResult != null && Intrinsics.areEqual(this.instrument.getSymbol(), instrumentPositionResult.instrument.getSymbol()) && Intrinsics.areEqual(this.instrument.getSimpleName(), instrumentPositionResult.instrument.getSimpleName()) && Intrinsics.areEqual(Position5.getPositionDisplayQuantity(this.position), Position5.getPositionDisplayQuantity(instrumentPositionResult.position)) && this.isEnabled == instrumentPositionResult.isEnabled && this.isChecked == instrumentPositionResult.isChecked;
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u0013\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J\u0010\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0014\u001a\u00020\u0001H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J'\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00052\b\u0010\u0014\u001a\u0004\u0018\u00010\u001bHÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0004\u0010\u000b\"\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u000b\"\u0004\b\u000e\u0010\rR\u0011\u0010\u000f\u001a\u00020\u0010¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$CryptoResult;", "Lcom/robinhood/android/common/search/SearchItem;", "currencyPair", "Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "isEnabled", "", "isChecked", "<init>", "(Lcom/robinhood/models/crypto/ui/UiCurrencyPair;ZZ)V", "getCurrencyPair", "()Lcom/robinhood/models/crypto/ui/UiCurrencyPair;", "()Z", "setEnabled", "(Z)V", "setChecked", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "getCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "areItemsTheSame", "other", "areContentsTheSame", "component1", "component2", "component3", "copy", "equals", "", "hashCode", "", "toString", "", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoResult extends SearchItem {
        public static final int $stable = 8;
        private final Currency currency;
        private final UiCurrencyPair currencyPair;
        private boolean isChecked;
        private boolean isEnabled;

        public static /* synthetic */ CryptoResult copy$default(CryptoResult cryptoResult, UiCurrencyPair uiCurrencyPair, boolean z, boolean z2, int i, Object obj) {
            if ((i & 1) != 0) {
                uiCurrencyPair = cryptoResult.currencyPair;
            }
            if ((i & 2) != 0) {
                z = cryptoResult.isEnabled;
            }
            if ((i & 4) != 0) {
                z2 = cryptoResult.isChecked;
            }
            return cryptoResult.copy(uiCurrencyPair, z, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getIsEnabled() {
            return this.isEnabled;
        }

        /* renamed from: component3, reason: from getter */
        public final boolean getIsChecked() {
            return this.isChecked;
        }

        public final CryptoResult copy(UiCurrencyPair currencyPair, boolean isEnabled, boolean isChecked) {
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            return new CryptoResult(currencyPair, isEnabled, isChecked);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoResult)) {
                return false;
            }
            CryptoResult cryptoResult = (CryptoResult) other;
            return Intrinsics.areEqual(this.currencyPair, cryptoResult.currencyPair) && this.isEnabled == cryptoResult.isEnabled && this.isChecked == cryptoResult.isChecked;
        }

        public int hashCode() {
            return (((this.currencyPair.hashCode() * 31) + Boolean.hashCode(this.isEnabled)) * 31) + Boolean.hashCode(this.isChecked);
        }

        public String toString() {
            return "CryptoResult(currencyPair=" + this.currencyPair + ", isEnabled=" + this.isEnabled + ", isChecked=" + this.isChecked + ")";
        }

        public /* synthetic */ CryptoResult(UiCurrencyPair uiCurrencyPair, boolean z, boolean z2, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(uiCurrencyPair, (i & 2) != 0 ? true : z, (i & 4) != 0 ? false : z2);
        }

        public final UiCurrencyPair getCurrencyPair() {
            return this.currencyPair;
        }

        public final boolean isEnabled() {
            return this.isEnabled;
        }

        public final void setEnabled(boolean z) {
            this.isEnabled = z;
        }

        public final boolean isChecked() {
            return this.isChecked;
        }

        public final void setChecked(boolean z) {
            this.isChecked = z;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoResult(UiCurrencyPair currencyPair, boolean z, boolean z2) {
            super(3, null);
            Intrinsics.checkNotNullParameter(currencyPair, "currencyPair");
            this.currencyPair = currencyPair;
            this.isEnabled = z;
            this.isChecked = z2;
            this.currency = currencyPair.getAssetCurrency();
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            CryptoResult cryptoResult = other instanceof CryptoResult ? (CryptoResult) other : null;
            if (cryptoResult == null) {
                return false;
            }
            return Intrinsics.areEqual(this.currency.getId(), cryptoResult.currency.getId());
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            CryptoResult cryptoResult = other instanceof CryptoResult ? (CryptoResult) other : null;
            return cryptoResult != null && Intrinsics.areEqual(this.currency.getId(), cryptoResult.currency.getId()) && this.isEnabled == cryptoResult.isEnabled && this.isChecked == cryptoResult.isChecked;
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0016J\u0010\u0010\u0013\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0001H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J'\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0019HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$CryptoHoldingResult;", "Lcom/robinhood/android/common/search/SearchItem;", "currencyPairId", "Ljava/util/UUID;", "currency", "Lcom/robinhood/models/crypto/db/Currency;", "quantity", "Ljava/math/BigDecimal;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/crypto/db/Currency;Ljava/math/BigDecimal;)V", "getCurrencyPairId", "()Ljava/util/UUID;", "getCurrency", "()Lcom/robinhood/models/crypto/db/Currency;", "getQuantity", "()Ljava/math/BigDecimal;", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "component2", "component3", "copy", "equals", "", "hashCode", "", "toString", "", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class CryptoHoldingResult extends SearchItem {
        public static final int $stable = 8;
        private final Currency currency;
        private final UUID currencyPairId;
        private final BigDecimal quantity;

        public static /* synthetic */ CryptoHoldingResult copy$default(CryptoHoldingResult cryptoHoldingResult, UUID uuid, Currency currency, BigDecimal bigDecimal, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = cryptoHoldingResult.currencyPairId;
            }
            if ((i & 2) != 0) {
                currency = cryptoHoldingResult.currency;
            }
            if ((i & 4) != 0) {
                bigDecimal = cryptoHoldingResult.quantity;
            }
            return cryptoHoldingResult.copy(uuid, currency, bigDecimal);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        /* renamed from: component2, reason: from getter */
        public final Currency getCurrency() {
            return this.currency;
        }

        /* renamed from: component3, reason: from getter */
        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        public final CryptoHoldingResult copy(UUID currencyPairId, Currency currency, BigDecimal quantity) {
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            return new CryptoHoldingResult(currencyPairId, currency, quantity);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CryptoHoldingResult)) {
                return false;
            }
            CryptoHoldingResult cryptoHoldingResult = (CryptoHoldingResult) other;
            return Intrinsics.areEqual(this.currencyPairId, cryptoHoldingResult.currencyPairId) && Intrinsics.areEqual(this.currency, cryptoHoldingResult.currency) && Intrinsics.areEqual(this.quantity, cryptoHoldingResult.quantity);
        }

        public int hashCode() {
            return (((this.currencyPairId.hashCode() * 31) + this.currency.hashCode()) * 31) + this.quantity.hashCode();
        }

        public String toString() {
            return "CryptoHoldingResult(currencyPairId=" + this.currencyPairId + ", currency=" + this.currency + ", quantity=" + this.quantity + ")";
        }

        public final UUID getCurrencyPairId() {
            return this.currencyPairId;
        }

        public final Currency getCurrency() {
            return this.currency;
        }

        public final BigDecimal getQuantity() {
            return this.quantity;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CryptoHoldingResult(UUID currencyPairId, Currency currency, BigDecimal quantity) {
            super(3, null);
            Intrinsics.checkNotNullParameter(currencyPairId, "currencyPairId");
            Intrinsics.checkNotNullParameter(currency, "currency");
            Intrinsics.checkNotNullParameter(quantity, "quantity");
            this.currencyPairId = currencyPairId;
            this.currency = currency;
            this.quantity = quantity;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            CryptoHoldingResult cryptoHoldingResult = other instanceof CryptoHoldingResult ? (CryptoHoldingResult) other : null;
            if (cryptoHoldingResult == null) {
                return false;
            }
            return Intrinsics.areEqual(this.currency.getId(), cryptoHoldingResult.currency.getId());
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            CryptoHoldingResult cryptoHoldingResult = other instanceof CryptoHoldingResult ? (CryptoHoldingResult) other : null;
            return cryptoHoldingResult != null && Intrinsics.areEqual(this.currency.getId(), cryptoHoldingResult.currency.getId()) && Intrinsics.areEqual(this.quantity, cryptoHoldingResult.quantity);
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$SearchLearnMoreRow;", "Lcom/robinhood/android/common/search/SearchItem;", "learnMoreStr", "", "learnMoreBtnStr", "", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/String;)V", "getLearnMoreStr", "()Ljava/lang/CharSequence;", "getLearnMoreBtnStr", "()Ljava/lang/String;", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "component2", "copy", "equals", "", "hashCode", "", "toString", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class SearchLearnMoreRow extends SearchItem {
        public static final int $stable = 8;
        private final String learnMoreBtnStr;
        private final CharSequence learnMoreStr;

        public static /* synthetic */ SearchLearnMoreRow copy$default(SearchLearnMoreRow searchLearnMoreRow, CharSequence charSequence, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = searchLearnMoreRow.learnMoreStr;
            }
            if ((i & 2) != 0) {
                str = searchLearnMoreRow.learnMoreBtnStr;
            }
            return searchLearnMoreRow.copy(charSequence, str);
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return true;
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getLearnMoreStr() {
            return this.learnMoreStr;
        }

        /* renamed from: component2, reason: from getter */
        public final String getLearnMoreBtnStr() {
            return this.learnMoreBtnStr;
        }

        public final SearchLearnMoreRow copy(CharSequence learnMoreStr, String learnMoreBtnStr) {
            Intrinsics.checkNotNullParameter(learnMoreStr, "learnMoreStr");
            Intrinsics.checkNotNullParameter(learnMoreBtnStr, "learnMoreBtnStr");
            return new SearchLearnMoreRow(learnMoreStr, learnMoreBtnStr);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SearchLearnMoreRow)) {
                return false;
            }
            SearchLearnMoreRow searchLearnMoreRow = (SearchLearnMoreRow) other;
            return Intrinsics.areEqual(this.learnMoreStr, searchLearnMoreRow.learnMoreStr) && Intrinsics.areEqual(this.learnMoreBtnStr, searchLearnMoreRow.learnMoreBtnStr);
        }

        public int hashCode() {
            return (this.learnMoreStr.hashCode() * 31) + this.learnMoreBtnStr.hashCode();
        }

        public String toString() {
            CharSequence charSequence = this.learnMoreStr;
            return "SearchLearnMoreRow(learnMoreStr=" + ((Object) charSequence) + ", learnMoreBtnStr=" + this.learnMoreBtnStr + ")";
        }

        public final CharSequence getLearnMoreStr() {
            return this.learnMoreStr;
        }

        public final String getLearnMoreBtnStr() {
            return this.learnMoreBtnStr;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public SearchLearnMoreRow(CharSequence learnMoreStr, String learnMoreBtnStr) {
            super(4, null);
            Intrinsics.checkNotNullParameter(learnMoreStr, "learnMoreStr");
            Intrinsics.checkNotNullParameter(learnMoreBtnStr, "learnMoreBtnStr");
            this.learnMoreStr = learnMoreStr;
            this.learnMoreBtnStr = learnMoreBtnStr;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            SearchLearnMoreRow searchLearnMoreRow = other instanceof SearchLearnMoreRow ? (SearchLearnMoreRow) other : null;
            return searchLearnMoreRow != null && Intrinsics.areEqual(this.learnMoreStr, searchLearnMoreRow.learnMoreStr) && Intrinsics.areEqual(this.learnMoreBtnStr, searchLearnMoreRow.learnMoreBtnStr);
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0016J\u0010\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0001H\u0016J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$Disclaimer;", "Lcom/robinhood/android/common/search/SearchItem;", "messageRes", "", "buttonTextRes", "<init>", "(II)V", "getMessageRes", "()I", "getButtonTextRes", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "component2", "copy", "equals", "", "hashCode", "toString", "", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Disclaimer extends SearchItem {
        public static final int $stable = 0;
        private final int buttonTextRes;
        private final int messageRes;

        public static /* synthetic */ Disclaimer copy$default(Disclaimer disclaimer, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = disclaimer.messageRes;
            }
            if ((i3 & 2) != 0) {
                i2 = disclaimer.buttonTextRes;
            }
            return disclaimer.copy(i, i2);
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return true;
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageRes() {
            return this.messageRes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getButtonTextRes() {
            return this.buttonTextRes;
        }

        public final Disclaimer copy(int messageRes, int buttonTextRes) {
            return new Disclaimer(messageRes, buttonTextRes);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Disclaimer)) {
                return false;
            }
            Disclaimer disclaimer = (Disclaimer) other;
            return this.messageRes == disclaimer.messageRes && this.buttonTextRes == disclaimer.buttonTextRes;
        }

        public int hashCode() {
            return (Integer.hashCode(this.messageRes) * 31) + Integer.hashCode(this.buttonTextRes);
        }

        public String toString() {
            return "Disclaimer(messageRes=" + this.messageRes + ", buttonTextRes=" + this.buttonTextRes + ")";
        }

        public final int getMessageRes() {
            return this.messageRes;
        }

        public final int getButtonTextRes() {
            return this.buttonTextRes;
        }

        public Disclaimer(int i, int i2) {
            super(6, null);
            this.messageRes = i;
            this.buttonTextRes = i2;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            Disclaimer disclaimer = other instanceof Disclaimer ? (Disclaimer) other : null;
            return disclaimer != null && this.messageRes == disclaimer.messageRes && this.buttonTextRes == disclaimer.buttonTextRes;
        }
    }

    /* compiled from: SearchItem.kt */
    @Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\u0010\u0010\u000f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u0001H\u0016J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J'\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0015HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/search/SearchItem$RurSavingsChoice;", "Lcom/robinhood/android/common/search/SearchItem;", "interestRate", "", "primaryText", "secondaryText", "<init>", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "getInterestRate", "()Ljava/lang/CharSequence;", "getPrimaryText", "getSecondaryText", "areItemsTheSame", "", "other", "areContentsTheSame", "component1", "component2", "component3", "copy", "equals", "", "hashCode", "", "toString", "", "lib-investment-search_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class RurSavingsChoice extends SearchItem {
        public static final int $stable = 8;
        private final CharSequence interestRate;
        private final CharSequence primaryText;
        private final CharSequence secondaryText;

        public static /* synthetic */ RurSavingsChoice copy$default(RurSavingsChoice rurSavingsChoice, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, Object obj) {
            if ((i & 1) != 0) {
                charSequence = rurSavingsChoice.interestRate;
            }
            if ((i & 2) != 0) {
                charSequence2 = rurSavingsChoice.primaryText;
            }
            if ((i & 4) != 0) {
                charSequence3 = rurSavingsChoice.secondaryText;
            }
            return rurSavingsChoice.copy(charSequence, charSequence2, charSequence3);
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areContentsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            return true;
        }

        /* renamed from: component1, reason: from getter */
        public final CharSequence getInterestRate() {
            return this.interestRate;
        }

        /* renamed from: component2, reason: from getter */
        public final CharSequence getPrimaryText() {
            return this.primaryText;
        }

        /* renamed from: component3, reason: from getter */
        public final CharSequence getSecondaryText() {
            return this.secondaryText;
        }

        public final RurSavingsChoice copy(CharSequence interestRate, CharSequence primaryText, CharSequence secondaryText) {
            Intrinsics.checkNotNullParameter(interestRate, "interestRate");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            return new RurSavingsChoice(interestRate, primaryText, secondaryText);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RurSavingsChoice)) {
                return false;
            }
            RurSavingsChoice rurSavingsChoice = (RurSavingsChoice) other;
            return Intrinsics.areEqual(this.interestRate, rurSavingsChoice.interestRate) && Intrinsics.areEqual(this.primaryText, rurSavingsChoice.primaryText) && Intrinsics.areEqual(this.secondaryText, rurSavingsChoice.secondaryText);
        }

        public int hashCode() {
            return (((this.interestRate.hashCode() * 31) + this.primaryText.hashCode()) * 31) + this.secondaryText.hashCode();
        }

        public String toString() {
            return "RurSavingsChoice(interestRate=" + ((Object) this.interestRate) + ", primaryText=" + ((Object) this.primaryText) + ", secondaryText=" + ((Object) this.secondaryText) + ")";
        }

        public final CharSequence getInterestRate() {
            return this.interestRate;
        }

        public final CharSequence getPrimaryText() {
            return this.primaryText;
        }

        public final CharSequence getSecondaryText() {
            return this.secondaryText;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RurSavingsChoice(CharSequence interestRate, CharSequence primaryText, CharSequence secondaryText) {
            super(7, null);
            Intrinsics.checkNotNullParameter(interestRate, "interestRate");
            Intrinsics.checkNotNullParameter(primaryText, "primaryText");
            Intrinsics.checkNotNullParameter(secondaryText, "secondaryText");
            this.interestRate = interestRate;
            this.primaryText = primaryText;
            this.secondaryText = secondaryText;
        }

        @Override // com.robinhood.android.common.search.SearchItem
        public boolean areItemsTheSame(SearchItem other) {
            Intrinsics.checkNotNullParameter(other, "other");
            CharSequence charSequence = this.interestRate;
            RurSavingsChoice rurSavingsChoice = other instanceof RurSavingsChoice ? (RurSavingsChoice) other : null;
            if (!Intrinsics.areEqual(charSequence, rurSavingsChoice != null ? rurSavingsChoice.interestRate : null)) {
                return false;
            }
            RurSavingsChoice rurSavingsChoice2 = (RurSavingsChoice) other;
            return Intrinsics.areEqual(this.primaryText, rurSavingsChoice2.primaryText) && Intrinsics.areEqual(this.secondaryText, rurSavingsChoice2.secondaryText);
        }
    }
}
