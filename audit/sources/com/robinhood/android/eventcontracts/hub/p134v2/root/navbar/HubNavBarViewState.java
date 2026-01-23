package com.robinhood.android.eventcontracts.hub.p134v2.root.navbar;

import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubNavNode;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcImageStyle;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;

/* compiled from: HubNavBarViewState.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001:\u000223B[\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\t\u0010&\u001a\u00020\u0003HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010)\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\fHÆ\u0003J\t\u0010,\u001a\u00020\u000eHÆ\u0003J_\u0010-\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\r\u001a\u00020\u000eHÆ\u0001J\u0013\u0010.\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u00020\u001eHÖ\u0001J\t\u00101\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0019\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\r\u001a\u00020\u000e¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u001bR\u0011\u0010\u001c\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\u001e8F¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0013\u0010!\u001a\u0004\u0018\u00010\b8F¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0011\u0010$\u001a\u00020\u00038F¢\u0006\u0006\u001a\u0004\b%\u0010\u0012¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState;", "", "identifier", "", "individualAccountNumber", "title", "childCategories", "Lkotlinx/collections/immutable/PersistentList;", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState$DisplayChildCategory;", "presentLayoutContent", "Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState$LayoutContent;", "backgroundImageStyle", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;", "isInPredictionMarketTestingExperiment", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/collections/immutable/PersistentList;Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState$LayoutContent;Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;Z)V", "getIdentifier", "()Ljava/lang/String;", "getIndividualAccountNumber", "getTitle", "getChildCategories", "()Lkotlinx/collections/immutable/PersistentList;", "getPresentLayoutContent", "()Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState$LayoutContent;", "getBackgroundImageStyle", "()Lcom/robinhood/android/models/event/db/predictionmarkets/EcImageStyle;", "()Z", "isLoading", "initialScrollChildCategoryIndex", "", "getInitialScrollChildCategoryIndex", "()I", "selectedCategory", "getSelectedCategory", "()Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState$DisplayChildCategory;", "description", "getDescription", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "DisplayChildCategory", "LayoutContent", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final /* data */ class HubNavBarViewState {
    public static final int $stable = 8;
    private final EcImageStyle backgroundImageStyle;
    private final ImmutableList3<DisplayChildCategory> childCategories;
    private final String identifier;
    private final String individualAccountNumber;
    private final boolean isInPredictionMarketTestingExperiment;
    private final LayoutContent presentLayoutContent;
    private final String title;

    public static /* synthetic */ HubNavBarViewState copy$default(HubNavBarViewState hubNavBarViewState, String str, String str2, String str3, ImmutableList3 immutableList3, LayoutContent layoutContent, EcImageStyle ecImageStyle, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hubNavBarViewState.identifier;
        }
        if ((i & 2) != 0) {
            str2 = hubNavBarViewState.individualAccountNumber;
        }
        if ((i & 4) != 0) {
            str3 = hubNavBarViewState.title;
        }
        if ((i & 8) != 0) {
            immutableList3 = hubNavBarViewState.childCategories;
        }
        if ((i & 16) != 0) {
            layoutContent = hubNavBarViewState.presentLayoutContent;
        }
        if ((i & 32) != 0) {
            ecImageStyle = hubNavBarViewState.backgroundImageStyle;
        }
        if ((i & 64) != 0) {
            z = hubNavBarViewState.isInPredictionMarketTestingExperiment;
        }
        EcImageStyle ecImageStyle2 = ecImageStyle;
        boolean z2 = z;
        LayoutContent layoutContent2 = layoutContent;
        String str4 = str3;
        return hubNavBarViewState.copy(str, str2, str4, immutableList3, layoutContent2, ecImageStyle2, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getIdentifier() {
        return this.identifier;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList3<DisplayChildCategory> component4() {
        return this.childCategories;
    }

    /* renamed from: component5, reason: from getter */
    public final LayoutContent getPresentLayoutContent() {
        return this.presentLayoutContent;
    }

    /* renamed from: component6, reason: from getter */
    public final EcImageStyle getBackgroundImageStyle() {
        return this.backgroundImageStyle;
    }

    /* renamed from: component7, reason: from getter */
    public final boolean getIsInPredictionMarketTestingExperiment() {
        return this.isInPredictionMarketTestingExperiment;
    }

    public final HubNavBarViewState copy(String identifier, String individualAccountNumber, String title, ImmutableList3<DisplayChildCategory> childCategories, LayoutContent presentLayoutContent, EcImageStyle backgroundImageStyle, boolean isInPredictionMarketTestingExperiment) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        return new HubNavBarViewState(identifier, individualAccountNumber, title, childCategories, presentLayoutContent, backgroundImageStyle, isInPredictionMarketTestingExperiment);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HubNavBarViewState)) {
            return false;
        }
        HubNavBarViewState hubNavBarViewState = (HubNavBarViewState) other;
        return Intrinsics.areEqual(this.identifier, hubNavBarViewState.identifier) && Intrinsics.areEqual(this.individualAccountNumber, hubNavBarViewState.individualAccountNumber) && Intrinsics.areEqual(this.title, hubNavBarViewState.title) && Intrinsics.areEqual(this.childCategories, hubNavBarViewState.childCategories) && Intrinsics.areEqual(this.presentLayoutContent, hubNavBarViewState.presentLayoutContent) && this.backgroundImageStyle == hubNavBarViewState.backgroundImageStyle && this.isInPredictionMarketTestingExperiment == hubNavBarViewState.isInPredictionMarketTestingExperiment;
    }

    public int hashCode() {
        int iHashCode = this.identifier.hashCode() * 31;
        String str = this.individualAccountNumber;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.title;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        ImmutableList3<DisplayChildCategory> immutableList3 = this.childCategories;
        int iHashCode4 = (iHashCode3 + (immutableList3 == null ? 0 : immutableList3.hashCode())) * 31;
        LayoutContent layoutContent = this.presentLayoutContent;
        int iHashCode5 = (iHashCode4 + (layoutContent == null ? 0 : layoutContent.hashCode())) * 31;
        EcImageStyle ecImageStyle = this.backgroundImageStyle;
        return ((iHashCode5 + (ecImageStyle != null ? ecImageStyle.hashCode() : 0)) * 31) + Boolean.hashCode(this.isInPredictionMarketTestingExperiment);
    }

    public String toString() {
        return "HubNavBarViewState(identifier=" + this.identifier + ", individualAccountNumber=" + this.individualAccountNumber + ", title=" + this.title + ", childCategories=" + this.childCategories + ", presentLayoutContent=" + this.presentLayoutContent + ", backgroundImageStyle=" + this.backgroundImageStyle + ", isInPredictionMarketTestingExperiment=" + this.isInPredictionMarketTestingExperiment + ")";
    }

    public HubNavBarViewState(String identifier, String str, String str2, ImmutableList3<DisplayChildCategory> immutableList3, LayoutContent layoutContent, EcImageStyle ecImageStyle, boolean z) {
        Intrinsics.checkNotNullParameter(identifier, "identifier");
        this.identifier = identifier;
        this.individualAccountNumber = str;
        this.title = str2;
        this.childCategories = immutableList3;
        this.presentLayoutContent = layoutContent;
        this.backgroundImageStyle = ecImageStyle;
        this.isInPredictionMarketTestingExperiment = z;
    }

    public /* synthetic */ HubNavBarViewState(String str, String str2, String str3, ImmutableList3 immutableList3, LayoutContent layoutContent, EcImageStyle ecImageStyle, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : immutableList3, (i & 16) != 0 ? null : layoutContent, (i & 32) != 0 ? null : ecImageStyle, (i & 64) != 0 ? false : z);
    }

    public final String getIdentifier() {
        return this.identifier;
    }

    public final String getIndividualAccountNumber() {
        return this.individualAccountNumber;
    }

    public final String getTitle() {
        return this.title;
    }

    public final ImmutableList3<DisplayChildCategory> getChildCategories() {
        return this.childCategories;
    }

    public final LayoutContent getPresentLayoutContent() {
        return this.presentLayoutContent;
    }

    public final EcImageStyle getBackgroundImageStyle() {
        return this.backgroundImageStyle;
    }

    public final boolean isInPredictionMarketTestingExperiment() {
        return this.isInPredictionMarketTestingExperiment;
    }

    public final boolean isLoading() {
        return this.title == null && this.presentLayoutContent == null;
    }

    public final int getInitialScrollChildCategoryIndex() {
        ImmutableList3<DisplayChildCategory> immutableList3 = this.childCategories;
        if (immutableList3 != null) {
            Iterator<DisplayChildCategory> it = immutableList3.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                if (it.next().getIsSelected()) {
                    break;
                }
                i++;
            }
            Integer numValueOf = Integer.valueOf(i);
            if (numValueOf.intValue() < 0) {
                numValueOf = null;
            }
            if (numValueOf != null) {
                return numValueOf.intValue();
            }
        }
        return 0;
    }

    public final DisplayChildCategory getSelectedCategory() {
        ImmutableList3<DisplayChildCategory> immutableList3 = this.childCategories;
        DisplayChildCategory displayChildCategory = null;
        if (immutableList3 == null) {
            return null;
        }
        Iterator<DisplayChildCategory> it = immutableList3.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            DisplayChildCategory next = it.next();
            if (next.getIsSelected()) {
                displayChildCategory = next;
                break;
            }
        }
        return displayChildCategory;
    }

    public final String getDescription() {
        String tabName;
        DisplayChildCategory selectedCategory = getSelectedCategory();
        if (selectedCategory == null || (tabName = selectedCategory.getTabName()) == null) {
            String str = this.title;
            return str == null ? "" : str;
        }
        String str2 = this.title;
        return (str2 != null ? str2 : "") + "_" + tabName;
    }

    /* compiled from: HubNavBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0004\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\r\u001a\u00020\u000e8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0011\u001a\u00020\u00128F¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState$DisplayChildCategory;", "", "node", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "isSelected", "", "fancyHighlight", "<init>", "(Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;ZZ)V", "getNode", "()Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "()Z", "getFancyHighlight", "key", "Ljava/util/UUID;", "getKey", "()Ljava/util/UUID;", "tabName", "", "getTabName", "()Ljava/lang/String;", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class DisplayChildCategory {
        public static final int $stable = 8;
        private final boolean fancyHighlight;
        private final boolean isSelected;
        private final EcHubNavNode node;

        public DisplayChildCategory(EcHubNavNode node, boolean z, boolean z2) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
            this.isSelected = z;
            this.fancyHighlight = z2;
        }

        public final EcHubNavNode getNode() {
            return this.node;
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        public final boolean getFancyHighlight() {
            return this.fancyHighlight;
        }

        public final UUID getKey() {
            return this.node.getId();
        }

        public final String getTabName() {
            return this.node.getDisplayTabText();
        }
    }

    /* compiled from: HubNavBarViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\b\u001a\u00020\t8F¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/eventcontracts/hub/v2/root/navbar/HubNavBarViewState$LayoutContent;", "", "node", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "<init>", "(Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;)V", "getNode", "()Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubNavNode;", "idToPresentInLayout", "Ljava/util/UUID;", "getIdToPresentInLayout", "()Ljava/util/UUID;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-hub-v2_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class LayoutContent {
        public static final int $stable = 8;
        private final EcHubNavNode node;

        public static /* synthetic */ LayoutContent copy$default(LayoutContent layoutContent, EcHubNavNode ecHubNavNode, int i, Object obj) {
            if ((i & 1) != 0) {
                ecHubNavNode = layoutContent.node;
            }
            return layoutContent.copy(ecHubNavNode);
        }

        /* renamed from: component1, reason: from getter */
        public final EcHubNavNode getNode() {
            return this.node;
        }

        public final LayoutContent copy(EcHubNavNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            return new LayoutContent(node);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof LayoutContent) && Intrinsics.areEqual(this.node, ((LayoutContent) other).node);
        }

        public int hashCode() {
            return this.node.hashCode();
        }

        public String toString() {
            return "LayoutContent(node=" + this.node + ")";
        }

        public LayoutContent(EcHubNavNode node) {
            Intrinsics.checkNotNullParameter(node, "node");
            this.node = node;
        }

        public final EcHubNavNode getNode() {
            return this.node;
        }

        public final UUID getIdToPresentInLayout() {
            return this.node.getId();
        }
    }
}
