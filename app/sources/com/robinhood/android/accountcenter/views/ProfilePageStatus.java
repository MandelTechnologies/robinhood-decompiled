package com.robinhood.android.accountcenter.views;

import com.robinhood.android.accountcenter.views.AssetBreakdownCircleChartState;
import com.robinhood.android.accountcenter.views.ProfilePageStatus;
import com.robinhood.android.common.p088ui.CuratedListChipItem;
import com.robinhood.contentful.markdown.MarkdownContent;
import com.robinhood.models.api.ApiCuratedList;
import com.robinhood.models.p320db.ProfileAssetBreakdown;
import com.robinhood.models.p320db.ProfileAssetBreakdownEmptyState;
import com.robinhood.models.p320db.ProfileAssetBreakdownEntry;
import com.robinhood.models.p320db.ProfileInsights;
import com.robinhood.models.p320db.ProfileInsightsEntry;
import com.robinhood.models.p320db.ProfilePage;
import com.robinhood.models.p320db.ProfileSection2;
import com.robinhood.models.p320db.ProfileSection3;
import com.robinhood.models.serverdriven.p347db.RichText;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;

/* compiled from: ProfileViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0004\u0005\u0006B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfilePageStatus;", "", "<init>", "()V", "Loading", "Success", "Failed", "Lcom/robinhood/android/accountcenter/views/ProfilePageStatus$Failed;", "Lcom/robinhood/android/accountcenter/views/ProfilePageStatus$Loading;", "Lcom/robinhood/android/accountcenter/views/ProfilePageStatus$Success;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public abstract class ProfilePageStatus {
    public static final int $stable = 0;

    public /* synthetic */ ProfilePageStatus(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: ProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfilePageStatus$Loading;", "Lcom/robinhood/android/accountcenter/views/ProfilePageStatus;", "<init>", "()V", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading extends ProfilePageStatus {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
            super(null);
        }
    }

    private ProfilePageStatus() {
    }

    /* compiled from: ProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\f\u001a\u0004\u0018\u00010\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fJ\u0014\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\n\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u00118F¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u00188F¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u001f\u001a\u0004\u0018\u00010\u000f8F¢\u0006\u0006\u001a\u0004\b \u0010!¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfilePageStatus$Success;", "Lcom/robinhood/android/accountcenter/views/ProfilePageStatus;", "profilePage", "Lcom/robinhood/models/db/ProfilePage;", "<init>", "(Lcom/robinhood/models/db/ProfilePage;)V", "collapsedDisclosure", "Lcom/robinhood/contentful/markdown/MarkdownContent;", "getCollapsedDisclosure", "()Lcom/robinhood/contentful/markdown/MarkdownContent;", "expandedDisclosure", "getExpandedDisclosure", "createAssetTabsState", "Lcom/robinhood/android/accountcenter/views/AssetTabsState;", "selectedAssetId", "", "assetBreakdownListState", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownListState;", "getAssetBreakdownListState", "()Lcom/robinhood/android/accountcenter/views/AssetBreakdownListState;", "createProfileCircleChartState", "Lcom/robinhood/android/accountcenter/views/AssetBreakdownCircleChartState;", "selectedCircleId", "insightListState", "Lcom/robinhood/android/accountcenter/views/InsightListState;", "getInsightListState", "()Lcom/robinhood/android/accountcenter/views/InsightListState;", "assetBreakdownSection", "Lcom/robinhood/models/db/ProfileAssetBreakdownSection;", "getAssetBreakdownSection", "()Lcom/robinhood/models/db/ProfileAssetBreakdownSection;", "largestAssetId", "getLargestAssetId", "()Ljava/lang/String;", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Success extends ProfilePageStatus {
        public static final int $stable = 8;
        private final MarkdownContent collapsedDisclosure;
        private final MarkdownContent expandedDisclosure;
        private final ProfilePage profilePage;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Success(ProfilePage profilePage) {
            super(null);
            Intrinsics.checkNotNullParameter(profilePage, "profilePage");
            this.profilePage = profilePage;
            this.collapsedDisclosure = profilePage.getCollapsedDisclosure();
            this.expandedDisclosure = profilePage.getExpandedDisclosure();
        }

        public final MarkdownContent getCollapsedDisclosure() {
            return this.collapsedDisclosure;
        }

        public final MarkdownContent getExpandedDisclosure() {
            return this.expandedDisclosure;
        }

        public final AssetTabsState createAssetTabsState(String selectedAssetId) {
            ProfileSection2 assetBreakdownSection = getAssetBreakdownSection();
            if (assetBreakdownSection == null) {
                return null;
            }
            List list = SequencesKt.toList(SequencesKt.map(SequencesKt.sortedWith(CollectionsKt.asSequence(assetBreakdownSection.getBreakdown().getEntries()), new Comparator() { // from class: com.robinhood.android.accountcenter.views.ProfilePageStatus$Success$createAssetTabsState$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(((ProfileAssetBreakdownEntry) t2).getPercentage(), ((ProfileAssetBreakdownEntry) t).getPercentage());
                }
            }), new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfilePageStatus$Success$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return ProfilePageStatus.Success.createAssetTabsState$lambda$1((ProfileAssetBreakdownEntry) obj);
                }
            }));
            if (list.isEmpty()) {
                return null;
            }
            return new AssetTabsState(list, selectedAssetId);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AssetTabItem createAssetTabsState$lambda$1(ProfileAssetBreakdownEntry entry) {
            Intrinsics.checkNotNullParameter(entry, "entry");
            return new AssetTabItem(entry.getId(), entry.getDisplayText());
        }

        public final AssetBreakdownListState getAssetBreakdownListState() {
            EmptyAssetBreakdownState emptyAssetBreakdownState;
            ProfileSection2 assetBreakdownSection = getAssetBreakdownSection();
            if (assetBreakdownSection == null) {
                return null;
            }
            List<ProfileAssetBreakdownEntry> entries = assetBreakdownSection.getBreakdown().getEntries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            for (final ProfileAssetBreakdownEntry profileAssetBreakdownEntry : entries) {
                String id = profileAssetBreakdownEntry.getId();
                String displayText = profileAssetBreakdownEntry.getDisplayText();
                RichText displayDescription = profileAssetBreakdownEntry.getDisplayDescription();
                float fFloatValue = profileAssetBreakdownEntry.getPercentage().floatValue();
                String displayPercentage = profileAssetBreakdownEntry.getDisplayPercentage();
                List list = SequencesKt.toList(SequencesKt.sortedWith(SequencesKt.map(CollectionsKt.asSequence(profileAssetBreakdownEntry.getChildren()), new Function1() { // from class: com.robinhood.android.accountcenter.views.ProfilePageStatus$Success$$ExternalSyntheticLambda1
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ProfilePageStatus.Success._get_assetBreakdownListState_$lambda$6$lambda$2(profileAssetBreakdownEntry, (ProfileAssetBreakdownEntry) obj);
                    }
                }), new Comparator() { // from class: com.robinhood.android.accountcenter.views.ProfilePageStatus$Success$_get_assetBreakdownListState_$lambda$6$$inlined$sortedByDescending$1
                    /* JADX WARN: Multi-variable type inference failed */
                    @Override // java.util.Comparator
                    public final int compare(T t, T t2) {
                        return ComparisonsKt.compareValues(Float.valueOf(((AssetBreakdownItem) t2).getPercentage()), Float.valueOf(((AssetBreakdownItem) t).getPercentage()));
                    }
                }));
                ProfileAssetBreakdownEmptyState emptyState = profileAssetBreakdownEntry.getEmptyState();
                if (emptyState != null) {
                    String id2 = profileAssetBreakdownEntry.getId();
                    RichText displayDescription2 = emptyState.getDisplayDescription();
                    List<ProfileAssetBreakdownEmptyState.CuratedList> curatedLists = emptyState.getCuratedLists();
                    ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(curatedLists, 10));
                    for (ProfileAssetBreakdownEmptyState.CuratedList curatedList : curatedLists) {
                        arrayList2.add(new CuratedListChipItem(curatedList.getId(), curatedList.getDisplayName(), ApiCuratedList.OwnerType.ROBINHOOD, curatedList.getImageUrls(), null, Integer.valueOf(curatedList.getItemCount()), null, false, false, null, false, 2000, null));
                    }
                    emptyAssetBreakdownState = new EmptyAssetBreakdownState(id2, displayDescription2, arrayList2);
                } else {
                    emptyAssetBreakdownState = null;
                }
                arrayList.add(new AssetBreakdown(id, displayText, displayDescription, fFloatValue, displayPercentage, list, emptyAssetBreakdownState));
            }
            return new AssetBreakdownListState(arrayList);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AssetBreakdownItem _get_assetBreakdownListState_$lambda$6$lambda$2(ProfileAssetBreakdownEntry profileAssetBreakdownEntry, ProfileAssetBreakdownEntry subEntry) {
            Intrinsics.checkNotNullParameter(subEntry, "subEntry");
            return new AssetBreakdownItem(subEntry.getId(), subEntry.getDisplayText(), subEntry.getPercentage().floatValue(), subEntry.getDisplayPercentage(), subEntry.getDeeplink(), profileAssetBreakdownEntry.getId());
        }

        public static /* synthetic */ AssetBreakdownCircleChartState createProfileCircleChartState$default(Success success, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = null;
            }
            return success.createProfileCircleChartState(str);
        }

        public final AssetBreakdownCircleChartState createProfileCircleChartState(String selectedCircleId) {
            ProfileSection2 assetBreakdownSection = getAssetBreakdownSection();
            if (assetBreakdownSection == null) {
                return null;
            }
            List<ProfileAssetBreakdownEntry> entries = assetBreakdownSection.getBreakdown().getEntries();
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(entries, 10));
            for (ProfileAssetBreakdownEntry profileAssetBreakdownEntry : entries) {
                arrayList.add(new AssetBreakdownCircleChartState.Item(profileAssetBreakdownEntry.getId(), profileAssetBreakdownEntry.getDisplayText(), profileAssetBreakdownEntry.getPercentage().floatValue(), profileAssetBreakdownEntry.getDisplayPercentage(), Intrinsics.areEqual(profileAssetBreakdownEntry.getId(), selectedCircleId)));
            }
            return new AssetBreakdownCircleChartState(assetBreakdownSection.getDisplayText(), CollectionsKt.sortedWith(arrayList, new Comparator() { // from class: com.robinhood.android.accountcenter.views.ProfilePageStatus$Success$createProfileCircleChartState$$inlined$sortedByDescending$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // java.util.Comparator
                public final int compare(T t, T t2) {
                    return ComparisonsKt.compareValues(Float.valueOf(((AssetBreakdownCircleChartState.Item) t2).getPercentage()), Float.valueOf(((AssetBreakdownCircleChartState.Item) t).getPercentage()));
                }
            }));
        }

        public final InsightListState getInsightListState() {
            ArrayList arrayList;
            ProfileInsights data;
            List<ProfileInsightsEntry> entries;
            Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(this.profilePage.getSections()), new Function1<Object, Boolean>() { // from class: com.robinhood.android.accountcenter.views.ProfilePageStatus$Success$special$$inlined$filterIsInstance$1
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof ProfileSection3);
                }
            });
            Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            ProfileSection3 profileSection3 = (ProfileSection3) SequencesKt.firstOrNull(sequenceFilter);
            if (profileSection3 == null || (data = profileSection3.getData()) == null || (entries = data.getEntries()) == null) {
                arrayList = null;
            } else {
                List<ProfileInsightsEntry> list = entries;
                arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
                for (ProfileInsightsEntry profileInsightsEntry : list) {
                    arrayList.add(new InsightItem(profileInsightsEntry.getId(), profileInsightsEntry.getDisplayText(), profileInsightsEntry.getDisplayDescription(), profileInsightsEntry.getLink(), profileInsightsEntry.getImageUrls()));
                }
            }
            if (arrayList == null) {
                return null;
            }
            return new InsightListState(profileSection3.getDisplayText(), profileSection3.getData().getDisplayTitle(), profileSection3.getData().getDisplayDescription(), arrayList);
        }

        private final ProfileSection2 getAssetBreakdownSection() {
            Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(this.profilePage.getSections()), new Function1<Object, Boolean>() { // from class: com.robinhood.android.accountcenter.views.ProfilePageStatus$Success$special$$inlined$filterIsInstance$2
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function1
                public final Boolean invoke(Object obj) {
                    return Boolean.valueOf(obj instanceof ProfileSection2);
                }
            });
            Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
            return (ProfileSection2) SequencesKt.firstOrNull(sequenceFilter);
        }

        public final String getLargestAssetId() {
            ProfileAssetBreakdown breakdown;
            List<ProfileAssetBreakdownEntry> entries;
            Object next;
            ProfileSection2 assetBreakdownSection = getAssetBreakdownSection();
            if (assetBreakdownSection != null && (breakdown = assetBreakdownSection.getBreakdown()) != null && (entries = breakdown.getEntries()) != null) {
                Iterator<T> it = entries.iterator();
                if (it.hasNext()) {
                    next = it.next();
                    if (it.hasNext()) {
                        BigDecimal percentage = ((ProfileAssetBreakdownEntry) next).getPercentage();
                        do {
                            Object next2 = it.next();
                            BigDecimal percentage2 = ((ProfileAssetBreakdownEntry) next2).getPercentage();
                            if (percentage.compareTo(percentage2) < 0) {
                                next = next2;
                                percentage = percentage2;
                            }
                        } while (it.hasNext());
                    }
                } else {
                    next = null;
                }
                ProfileAssetBreakdownEntry profileAssetBreakdownEntry = (ProfileAssetBreakdownEntry) next;
                if (profileAssetBreakdownEntry != null) {
                    return profileAssetBreakdownEntry.getId();
                }
            }
            return null;
        }
    }

    /* compiled from: ProfileViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/accountcenter/views/ProfilePageStatus$Failed;", "Lcom/robinhood/android/accountcenter/views/ProfilePageStatus;", "<init>", "()V", "feature-account-center_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Failed extends ProfilePageStatus {
        public static final int $stable = 0;
        public static final Failed INSTANCE = new Failed();

        private Failed() {
            super(null);
        }
    }
}
