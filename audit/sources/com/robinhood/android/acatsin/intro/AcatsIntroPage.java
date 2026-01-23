package com.robinhood.android.acatsin.intro;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.shared.education.order.OrderTypeEducationLearnMoreFragment;
import java.util.List;
import kotlin.Metadata;
import kotlin.Tuples2;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsIntroPage.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001Bk\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\tHÆ\u0003J\u0015\u0010!\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000bHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003Jo\u0010#\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u00032\u000e\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u00062\b\b\u0003\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010$\u001a\u00020\t2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020(HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00030\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0010R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0015R\u001d\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0011\u0010\u0019\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\u001a\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0010¨\u0006)"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsIntroPage;", "", OrderTypeEducationLearnMoreFragment.ARG_TITLE_RES, "", OrderTypeEducationLearnMoreFragment.ARG_DESCRIPTION_RES, "listItems", "", "ctaRes", "isTitlePage", "", "startToEndFrame", "Lkotlin/Pair;", "loopingFrames", "<init>", "(IILjava/util/List;IZLkotlin/Pair;Lkotlin/Pair;)V", "getTitleRes", "()I", "getDescriptionRes", "getListItems", "()Ljava/util/List;", "getCtaRes", "()Z", "getStartToEndFrame", "()Lkotlin/Pair;", "getLoopingFrames", "isListVisible", "titleTextAppearanceRes", "getTitleTextAppearanceRes", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsIntroPage {
    public static final int $stable = 8;
    private final int ctaRes;
    private final int descriptionRes;
    private final boolean isListVisible;
    private final boolean isTitlePage;
    private final List<Integer> listItems;
    private final Tuples2<Integer, Integer> loopingFrames;
    private final Tuples2<Integer, Integer> startToEndFrame;
    private final int titleRes;
    private final int titleTextAppearanceRes;

    public static /* synthetic */ AcatsIntroPage copy$default(AcatsIntroPage acatsIntroPage, int i, int i2, List list, int i3, boolean z, Tuples2 tuples2, Tuples2 tuples22, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = acatsIntroPage.titleRes;
        }
        if ((i4 & 2) != 0) {
            i2 = acatsIntroPage.descriptionRes;
        }
        if ((i4 & 4) != 0) {
            list = acatsIntroPage.listItems;
        }
        if ((i4 & 8) != 0) {
            i3 = acatsIntroPage.ctaRes;
        }
        if ((i4 & 16) != 0) {
            z = acatsIntroPage.isTitlePage;
        }
        if ((i4 & 32) != 0) {
            tuples2 = acatsIntroPage.startToEndFrame;
        }
        if ((i4 & 64) != 0) {
            tuples22 = acatsIntroPage.loopingFrames;
        }
        Tuples2 tuples23 = tuples2;
        Tuples2 tuples24 = tuples22;
        boolean z2 = z;
        List list2 = list;
        return acatsIntroPage.copy(i, i2, list2, i3, z2, tuples23, tuples24);
    }

    /* renamed from: component1, reason: from getter */
    public final int getTitleRes() {
        return this.titleRes;
    }

    /* renamed from: component2, reason: from getter */
    public final int getDescriptionRes() {
        return this.descriptionRes;
    }

    public final List<Integer> component3() {
        return this.listItems;
    }

    /* renamed from: component4, reason: from getter */
    public final int getCtaRes() {
        return this.ctaRes;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsTitlePage() {
        return this.isTitlePage;
    }

    public final Tuples2<Integer, Integer> component6() {
        return this.startToEndFrame;
    }

    public final Tuples2<Integer, Integer> component7() {
        return this.loopingFrames;
    }

    public final AcatsIntroPage copy(int titleRes, int descriptionRes, List<Integer> listItems, int ctaRes, boolean isTitlePage, Tuples2<Integer, Integer> startToEndFrame, Tuples2<Integer, Integer> loopingFrames) {
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        Intrinsics.checkNotNullParameter(startToEndFrame, "startToEndFrame");
        return new AcatsIntroPage(titleRes, descriptionRes, listItems, ctaRes, isTitlePage, startToEndFrame, loopingFrames);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsIntroPage)) {
            return false;
        }
        AcatsIntroPage acatsIntroPage = (AcatsIntroPage) other;
        return this.titleRes == acatsIntroPage.titleRes && this.descriptionRes == acatsIntroPage.descriptionRes && Intrinsics.areEqual(this.listItems, acatsIntroPage.listItems) && this.ctaRes == acatsIntroPage.ctaRes && this.isTitlePage == acatsIntroPage.isTitlePage && Intrinsics.areEqual(this.startToEndFrame, acatsIntroPage.startToEndFrame) && Intrinsics.areEqual(this.loopingFrames, acatsIntroPage.loopingFrames);
    }

    public int hashCode() {
        int iHashCode = ((((((((((Integer.hashCode(this.titleRes) * 31) + Integer.hashCode(this.descriptionRes)) * 31) + this.listItems.hashCode()) * 31) + Integer.hashCode(this.ctaRes)) * 31) + Boolean.hashCode(this.isTitlePage)) * 31) + this.startToEndFrame.hashCode()) * 31;
        Tuples2<Integer, Integer> tuples2 = this.loopingFrames;
        return iHashCode + (tuples2 == null ? 0 : tuples2.hashCode());
    }

    public String toString() {
        return "AcatsIntroPage(titleRes=" + this.titleRes + ", descriptionRes=" + this.descriptionRes + ", listItems=" + this.listItems + ", ctaRes=" + this.ctaRes + ", isTitlePage=" + this.isTitlePage + ", startToEndFrame=" + this.startToEndFrame + ", loopingFrames=" + this.loopingFrames + ")";
    }

    public AcatsIntroPage(int i, int i2, List<Integer> listItems, int i3, boolean z, Tuples2<Integer, Integer> startToEndFrame, Tuples2<Integer, Integer> tuples2) {
        int i4;
        Intrinsics.checkNotNullParameter(listItems, "listItems");
        Intrinsics.checkNotNullParameter(startToEndFrame, "startToEndFrame");
        this.titleRes = i;
        this.descriptionRes = i2;
        this.listItems = listItems;
        this.ctaRes = i3;
        this.isTitlePage = z;
        this.startToEndFrame = startToEndFrame;
        this.loopingFrames = tuples2;
        this.isListVisible = !listItems.isEmpty();
        if (z) {
            i4 = C20690R.attr.textAppearanceBookCoverSmall;
        } else {
            i4 = C20690R.attr.textAppearanceDisplayMedium;
        }
        this.titleTextAppearanceRes = i4;
    }

    public final int getTitleRes() {
        return this.titleRes;
    }

    public final int getDescriptionRes() {
        return this.descriptionRes;
    }

    public /* synthetic */ AcatsIntroPage(int i, int i2, List list, int i3, boolean z, Tuples2 tuples2, Tuples2 tuples22, int i4, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, i2, (i4 & 4) != 0 ? CollectionsKt.emptyList() : list, i3, (i4 & 16) != 0 ? false : z, tuples2, (i4 & 64) != 0 ? null : tuples22);
    }

    public final List<Integer> getListItems() {
        return this.listItems;
    }

    public final int getCtaRes() {
        return this.ctaRes;
    }

    public final boolean isTitlePage() {
        return this.isTitlePage;
    }

    public final Tuples2<Integer, Integer> getStartToEndFrame() {
        return this.startToEndFrame;
    }

    public final Tuples2<Integer, Integer> getLoopingFrames() {
        return this.loopingFrames;
    }

    /* renamed from: isListVisible, reason: from getter */
    public final boolean getIsListVisible() {
        return this.isListVisible;
    }

    public final int getTitleTextAppearanceRes() {
        return this.titleTextAppearanceRes;
    }
}
