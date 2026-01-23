package com.robinhood.android.acatsin.accountcontents;

import android.graphics.Bitmap;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.hammer.android.GenerateMockLoadingState;
import com.robinhood.models.acats.p299db.bonfire.AccountContentItem;
import com.robinhood.models.api.bonfire.ApiAcatsAccountContentsResponse;
import com.robinhood.models.api.bonfire.ApiAccountContentItem;
import com.robinhood.utils.resource.StringResource;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsInAccountContentsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState;", "", "<init>", "()V", "Loading", "Error", "Ready", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Error;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Loading;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Ready;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class AcatsInAccountContentsViewState {
    public static final int $stable = 0;

    public /* synthetic */ AcatsInAccountContentsViewState(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: AcatsInAccountContentsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Loading;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading extends AcatsInAccountContentsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 219078640;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
            super(null);
        }
    }

    private AcatsInAccountContentsViewState() {
    }

    /* compiled from: AcatsInAccountContentsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Error;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Error extends AcatsInAccountContentsViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        public boolean equals(Object other) {
            return this == other || (other instanceof Error);
        }

        public int hashCode() {
            return 735767996;
        }

        public String toString() {
            return "Error";
        }

        private Error() {
            super(null);
        }
    }

    /* compiled from: AcatsInAccountContentsViewState.kt */
    @Metadata(m3635d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u00011BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010#\u001a\u00020\u0003HÆ\u0003J\u000b\u0010$\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J\u000f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010)\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00072\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010*\u001a\u00020+2\b\u0010,\u001a\u0004\u0018\u00010-HÖ\u0003J\t\u0010.\u001a\u00020/HÖ\u0001J\t\u00100\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0010R\u0011\u0010\u0018\u001a\u00020\u00198F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00078F¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u0014R\u0017\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020 0\u001f8F¢\u0006\u0006\u001a\u0004\b!\u0010\"¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Ready;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState;", "brokerageName", "", "brokerageLogo", "Landroid/graphics/Bitmap;", "items", "", "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "selectedItems", "supportedContentTypes", "Lcom/robinhood/models/api/bonfire/ApiAcatsAccountContentsResponse$SupportedContentType;", "buildPartialBannerContentfulId", "<init>", "(Ljava/lang/String;Landroid/graphics/Bitmap;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;)V", "getBrokerageName", "()Ljava/lang/String;", "getBrokerageLogo", "()Landroid/graphics/Bitmap;", "getItems", "()Ljava/util/List;", "getSelectedItems", "getSupportedContentTypes", "getBuildPartialBannerContentfulId", "containsMessage", "Lcom/robinhood/utils/resource/StringResource;", "getContainsMessage", "()Lcom/robinhood/utils/resource/StringResource;", "unsupportedContentItems", "getUnsupportedContentItems", "uiItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Ready$UiContentItem;", "getUiItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "UiContentItem", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @GenerateMockLoadingState
    @SourceDebugExtension
    public static final /* data */ class Ready extends AcatsInAccountContentsViewState {
        public static final int $stable = 8;
        private final Bitmap brokerageLogo;
        private final String brokerageName;
        private final String buildPartialBannerContentfulId;
        private final List<AccountContentItem> items;
        private final List<AccountContentItem> selectedItems;
        private final List<ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes;

        public static /* synthetic */ Ready copy$default(Ready ready, String str, Bitmap bitmap, List list, List list2, List list3, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = ready.brokerageName;
            }
            if ((i & 2) != 0) {
                bitmap = ready.brokerageLogo;
            }
            if ((i & 4) != 0) {
                list = ready.items;
            }
            if ((i & 8) != 0) {
                list2 = ready.selectedItems;
            }
            if ((i & 16) != 0) {
                list3 = ready.supportedContentTypes;
            }
            if ((i & 32) != 0) {
                str2 = ready.buildPartialBannerContentfulId;
            }
            List list4 = list3;
            String str3 = str2;
            return ready.copy(str, bitmap, list, list2, list4, str3);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBrokerageName() {
            return this.brokerageName;
        }

        /* renamed from: component2, reason: from getter */
        public final Bitmap getBrokerageLogo() {
            return this.brokerageLogo;
        }

        public final List<AccountContentItem> component3() {
            return this.items;
        }

        public final List<AccountContentItem> component4() {
            return this.selectedItems;
        }

        public final List<ApiAcatsAccountContentsResponse.SupportedContentType> component5() {
            return this.supportedContentTypes;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBuildPartialBannerContentfulId() {
            return this.buildPartialBannerContentfulId;
        }

        public final Ready copy(String brokerageName, Bitmap brokerageLogo, List<AccountContentItem> items, List<AccountContentItem> selectedItems, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String buildPartialBannerContentfulId) {
            Intrinsics.checkNotNullParameter(brokerageName, "brokerageName");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
            Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
            return new Ready(brokerageName, brokerageLogo, items, selectedItems, supportedContentTypes, buildPartialBannerContentfulId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.brokerageName, ready.brokerageName) && Intrinsics.areEqual(this.brokerageLogo, ready.brokerageLogo) && Intrinsics.areEqual(this.items, ready.items) && Intrinsics.areEqual(this.selectedItems, ready.selectedItems) && Intrinsics.areEqual(this.supportedContentTypes, ready.supportedContentTypes) && Intrinsics.areEqual(this.buildPartialBannerContentfulId, ready.buildPartialBannerContentfulId);
        }

        public int hashCode() {
            int iHashCode = this.brokerageName.hashCode() * 31;
            Bitmap bitmap = this.brokerageLogo;
            int iHashCode2 = (((((((iHashCode + (bitmap == null ? 0 : bitmap.hashCode())) * 31) + this.items.hashCode()) * 31) + this.selectedItems.hashCode()) * 31) + this.supportedContentTypes.hashCode()) * 31;
            String str = this.buildPartialBannerContentfulId;
            return iHashCode2 + (str != null ? str.hashCode() : 0);
        }

        public String toString() {
            return "Ready(brokerageName=" + this.brokerageName + ", brokerageLogo=" + this.brokerageLogo + ", items=" + this.items + ", selectedItems=" + this.selectedItems + ", supportedContentTypes=" + this.supportedContentTypes + ", buildPartialBannerContentfulId=" + this.buildPartialBannerContentfulId + ")";
        }

        public final String getBrokerageName() {
            return this.brokerageName;
        }

        public final Bitmap getBrokerageLogo() {
            return this.brokerageLogo;
        }

        public final List<AccountContentItem> getItems() {
            return this.items;
        }

        public final List<AccountContentItem> getSelectedItems() {
            return this.selectedItems;
        }

        public final List<ApiAcatsAccountContentsResponse.SupportedContentType> getSupportedContentTypes() {
            return this.supportedContentTypes;
        }

        public final String getBuildPartialBannerContentfulId() {
            return this.buildPartialBannerContentfulId;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public Ready(String brokerageName, Bitmap bitmap, List<AccountContentItem> items, List<AccountContentItem> selectedItems, List<? extends ApiAcatsAccountContentsResponse.SupportedContentType> supportedContentTypes, String str) {
            super(null);
            Intrinsics.checkNotNullParameter(brokerageName, "brokerageName");
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(selectedItems, "selectedItems");
            Intrinsics.checkNotNullParameter(supportedContentTypes, "supportedContentTypes");
            this.brokerageName = brokerageName;
            this.brokerageLogo = bitmap;
            this.items = items;
            this.selectedItems = selectedItems;
            this.supportedContentTypes = supportedContentTypes;
            this.buildPartialBannerContentfulId = str;
        }

        public final StringResource getContainsMessage() {
            return StringResource.INSTANCE.invoke(C7725R.string.contents_message, this.brokerageName);
        }

        public final List<String> getUnsupportedContentItems() {
            List<AccountContentItem> list = this.items;
            ArrayList arrayList = new ArrayList();
            for (Object obj : list) {
                if (((AccountContentItem) obj).getFlowType() == ApiAccountContentItem.FlowType.PARTIAL) {
                    arrayList.add(obj);
                }
            }
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(((AccountContentItem) it.next()).getName());
            }
            return arrayList2;
        }

        /* compiled from: AcatsInAccountContentsViewState.kt */
        @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\n¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/acatsin/accountcontents/AcatsInAccountContentsViewState$Ready$UiContentItem;", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "isSelected", "", "<init>", "(Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;Z)V", "getData", "()Lcom/robinhood/models/acats/db/bonfire/AccountContentItem;", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final /* data */ class UiContentItem {
            public static final int $stable = 8;
            private final AccountContentItem data;
            private final boolean isSelected;

            public static /* synthetic */ UiContentItem copy$default(UiContentItem uiContentItem, AccountContentItem accountContentItem, boolean z, int i, Object obj) {
                if ((i & 1) != 0) {
                    accountContentItem = uiContentItem.data;
                }
                if ((i & 2) != 0) {
                    z = uiContentItem.isSelected;
                }
                return uiContentItem.copy(accountContentItem, z);
            }

            /* renamed from: component1, reason: from getter */
            public final AccountContentItem getData() {
                return this.data;
            }

            /* renamed from: component2, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            public final UiContentItem copy(AccountContentItem data, boolean isSelected) {
                Intrinsics.checkNotNullParameter(data, "data");
                return new UiContentItem(data, isSelected);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof UiContentItem)) {
                    return false;
                }
                UiContentItem uiContentItem = (UiContentItem) other;
                return Intrinsics.areEqual(this.data, uiContentItem.data) && this.isSelected == uiContentItem.isSelected;
            }

            public int hashCode() {
                return (this.data.hashCode() * 31) + Boolean.hashCode(this.isSelected);
            }

            public String toString() {
                return "UiContentItem(data=" + this.data + ", isSelected=" + this.isSelected + ")";
            }

            public UiContentItem(AccountContentItem data, boolean z) {
                Intrinsics.checkNotNullParameter(data, "data");
                this.data = data;
                this.isSelected = z;
            }

            public final AccountContentItem getData() {
                return this.data;
            }

            public final boolean isSelected() {
                return this.isSelected;
            }
        }

        public final ImmutableList<UiContentItem> getUiItems() {
            List<AccountContentItem> list = this.selectedItems;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(((AccountContentItem) it.next()).getName());
            }
            HashSet hashSet = CollectionsKt.toHashSet(arrayList);
            List<AccountContentItem> list2 = this.items;
            ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (AccountContentItem accountContentItem : list2) {
                arrayList2.add(new UiContentItem(accountContentItem, hashSet.contains(accountContentItem.getName())));
            }
            return extensions2.toImmutableList(arrayList2);
        }
    }
}
