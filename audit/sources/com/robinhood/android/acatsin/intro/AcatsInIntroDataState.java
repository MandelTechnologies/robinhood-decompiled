package com.robinhood.android.acatsin.intro;

import com.robinhood.models.api.bonfire.ApiAcatsWelcomeContents;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AcatsInIntroDataState.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001c\b\u0087\b\u0018\u00002\u00020\u0001By\u0012\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001d\u0010!\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0018\u00010\u0003HÆ\u0003J\t\u0010\"\u001a\u00020\u0007HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\u0011\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\t\u0010%\u001a\u00020\fHÆ\u0003J\u0011\u0010&\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\u0011HÆ\u0003J}\u0010(\u001a\u00020\u00002\u001c\b\u0002\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\f2\u0010\b\u0002\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010)\u001a\u00020\f2\b\u0010*\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010+\u001a\u00020\u0007HÖ\u0001J\t\u0010,\u001a\u00020\u0011HÖ\u0001R%\u0010\u0002\u001a\u0016\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0003\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0019R\u0011\u0010\u000b\u001a\u00020\f¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\r\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 ¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroDataState;", "", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "pageIndex", "", "backEvent", "Lcom/robinhood/udf/UiEvent;", "forwardEvent", "bonusShown", "", "lottieSpecs", "", "Lcom/robinhood/models/api/bonfire/ApiAcatsWelcomeContents$LottieSpec;", "lottieUrl", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ILcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLjava/util/List;Ljava/lang/String;)V", "getPages", "()Lkotlinx/collections/immutable/ImmutableList;", "getPageIndex", "()I", "getBackEvent", "()Lcom/robinhood/udf/UiEvent;", "getForwardEvent", "getBonusShown", "()Z", "getLottieSpecs", "()Ljava/util/List;", "getLottieUrl", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInIntroDataState {
    public static final int $stable = 8;
    private final UiEvent<Integer> backEvent;
    private final boolean bonusShown;
    private final UiEvent<Integer> forwardEvent;
    private final List<ApiAcatsWelcomeContents.LottieSpec> lottieSpecs;
    private final String lottieUrl;
    private final int pageIndex;
    private final ImmutableList<ImmutableList<UIComponent<GenericAction>>> pages;

    public static /* synthetic */ AcatsInIntroDataState copy$default(AcatsInIntroDataState acatsInIntroDataState, ImmutableList immutableList, int i, UiEvent uiEvent, UiEvent uiEvent2, boolean z, List list, String str, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            immutableList = acatsInIntroDataState.pages;
        }
        if ((i2 & 2) != 0) {
            i = acatsInIntroDataState.pageIndex;
        }
        if ((i2 & 4) != 0) {
            uiEvent = acatsInIntroDataState.backEvent;
        }
        if ((i2 & 8) != 0) {
            uiEvent2 = acatsInIntroDataState.forwardEvent;
        }
        if ((i2 & 16) != 0) {
            z = acatsInIntroDataState.bonusShown;
        }
        if ((i2 & 32) != 0) {
            list = acatsInIntroDataState.lottieSpecs;
        }
        if ((i2 & 64) != 0) {
            str = acatsInIntroDataState.lottieUrl;
        }
        List list2 = list;
        String str2 = str;
        boolean z2 = z;
        UiEvent uiEvent3 = uiEvent;
        return acatsInIntroDataState.copy(immutableList, i, uiEvent3, uiEvent2, z2, list2, str2);
    }

    public final ImmutableList<ImmutableList<UIComponent<GenericAction>>> component1() {
        return this.pages;
    }

    /* renamed from: component2, reason: from getter */
    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final UiEvent<Integer> component3() {
        return this.backEvent;
    }

    public final UiEvent<Integer> component4() {
        return this.forwardEvent;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getBonusShown() {
        return this.bonusShown;
    }

    public final List<ApiAcatsWelcomeContents.LottieSpec> component6() {
        return this.lottieSpecs;
    }

    /* renamed from: component7, reason: from getter */
    public final String getLottieUrl() {
        return this.lottieUrl;
    }

    public final AcatsInIntroDataState copy(ImmutableList<? extends ImmutableList<? extends UIComponent<? extends GenericAction>>> pages, int pageIndex, UiEvent<Integer> backEvent, UiEvent<Integer> forwardEvent, boolean bonusShown, List<ApiAcatsWelcomeContents.LottieSpec> lottieSpecs, String lottieUrl) {
        return new AcatsInIntroDataState(pages, pageIndex, backEvent, forwardEvent, bonusShown, lottieSpecs, lottieUrl);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInIntroDataState)) {
            return false;
        }
        AcatsInIntroDataState acatsInIntroDataState = (AcatsInIntroDataState) other;
        return Intrinsics.areEqual(this.pages, acatsInIntroDataState.pages) && this.pageIndex == acatsInIntroDataState.pageIndex && Intrinsics.areEqual(this.backEvent, acatsInIntroDataState.backEvent) && Intrinsics.areEqual(this.forwardEvent, acatsInIntroDataState.forwardEvent) && this.bonusShown == acatsInIntroDataState.bonusShown && Intrinsics.areEqual(this.lottieSpecs, acatsInIntroDataState.lottieSpecs) && Intrinsics.areEqual(this.lottieUrl, acatsInIntroDataState.lottieUrl);
    }

    public int hashCode() {
        ImmutableList<ImmutableList<UIComponent<GenericAction>>> immutableList = this.pages;
        int iHashCode = (((immutableList == null ? 0 : immutableList.hashCode()) * 31) + Integer.hashCode(this.pageIndex)) * 31;
        UiEvent<Integer> uiEvent = this.backEvent;
        int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
        UiEvent<Integer> uiEvent2 = this.forwardEvent;
        int iHashCode3 = (((iHashCode2 + (uiEvent2 == null ? 0 : uiEvent2.hashCode())) * 31) + Boolean.hashCode(this.bonusShown)) * 31;
        List<ApiAcatsWelcomeContents.LottieSpec> list = this.lottieSpecs;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str = this.lottieUrl;
        return iHashCode4 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "AcatsInIntroDataState(pages=" + this.pages + ", pageIndex=" + this.pageIndex + ", backEvent=" + this.backEvent + ", forwardEvent=" + this.forwardEvent + ", bonusShown=" + this.bonusShown + ", lottieSpecs=" + this.lottieSpecs + ", lottieUrl=" + this.lottieUrl + ")";
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AcatsInIntroDataState(ImmutableList<? extends ImmutableList<? extends UIComponent<? extends GenericAction>>> immutableList, int i, UiEvent<Integer> uiEvent, UiEvent<Integer> uiEvent2, boolean z, List<ApiAcatsWelcomeContents.LottieSpec> list, String str) {
        this.pages = immutableList;
        this.pageIndex = i;
        this.backEvent = uiEvent;
        this.forwardEvent = uiEvent2;
        this.bonusShown = z;
        this.lottieSpecs = list;
        this.lottieUrl = str;
    }

    public /* synthetic */ AcatsInIntroDataState(ImmutableList immutableList, int i, UiEvent uiEvent, UiEvent uiEvent2, boolean z, List list, String str, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? null : immutableList, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : uiEvent, (i2 & 8) != 0 ? null : uiEvent2, z, (i2 & 32) != 0 ? null : list, (i2 & 64) != 0 ? null : str);
    }

    public final ImmutableList<ImmutableList<UIComponent<GenericAction>>> getPages() {
        return this.pages;
    }

    public final int getPageIndex() {
        return this.pageIndex;
    }

    public final UiEvent<Integer> getBackEvent() {
        return this.backEvent;
    }

    public final UiEvent<Integer> getForwardEvent() {
        return this.forwardEvent;
    }

    public final boolean getBonusShown() {
        return this.bonusShown;
    }

    public final List<ApiAcatsWelcomeContents.LottieSpec> getLottieSpecs() {
        return this.lottieSpecs;
    }

    public final String getLottieUrl() {
        return this.lottieUrl;
    }
}
