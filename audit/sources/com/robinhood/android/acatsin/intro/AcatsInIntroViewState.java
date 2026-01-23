package com.robinhood.android.acatsin.intro;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.robinhood.udf.UiEvent;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AcatsInIntroViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\n\u000bR \u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005X¦\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\u0007\u0082\u0001\u0002\f\r¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState;", "", "backEvent", "Lcom/robinhood/udf/UiEvent;", "", "Lcom/robinhood/android/acatsin/intro/NavEvent;", "getBackEvent", "()Lcom/robinhood/udf/UiEvent;", "forwardEvent", "getForwardEvent", "Loading", "Ready", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState$Loading;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState$Ready;", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public interface AcatsInIntroViewState {
    UiEvent<Integer> getBackEvent();

    UiEvent<Integer> getForwardEvent();

    /* compiled from: AcatsInIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0004HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\"\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\"\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003j\u0004\u0018\u0001`\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState$Loading;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState;", "backEvent", "Lcom/robinhood/udf/UiEvent;", "", "Lcom/robinhood/android/acatsin/intro/NavEvent;", "forwardEvent", "<init>", "(Lcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;)V", "getBackEvent", "()Lcom/robinhood/udf/UiEvent;", "getForwardEvent", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AcatsInIntroViewState {
        public static final int $stable = 8;
        private final UiEvent<Integer> backEvent;
        private final UiEvent<Integer> forwardEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loading copy$default(Loading loading, UiEvent uiEvent, UiEvent uiEvent2, int i, Object obj) {
            if ((i & 1) != 0) {
                uiEvent = loading.backEvent;
            }
            if ((i & 2) != 0) {
                uiEvent2 = loading.forwardEvent;
            }
            return loading.copy(uiEvent, uiEvent2);
        }

        public final UiEvent<Integer> component1() {
            return this.backEvent;
        }

        public final UiEvent<Integer> component2() {
            return this.forwardEvent;
        }

        public final Loading copy(UiEvent<Integer> backEvent, UiEvent<Integer> forwardEvent) {
            return new Loading(backEvent, forwardEvent);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loading)) {
                return false;
            }
            Loading loading = (Loading) other;
            return Intrinsics.areEqual(this.backEvent, loading.backEvent) && Intrinsics.areEqual(this.forwardEvent, loading.forwardEvent);
        }

        public int hashCode() {
            UiEvent<Integer> uiEvent = this.backEvent;
            int iHashCode = (uiEvent == null ? 0 : uiEvent.hashCode()) * 31;
            UiEvent<Integer> uiEvent2 = this.forwardEvent;
            return iHashCode + (uiEvent2 != null ? uiEvent2.hashCode() : 0);
        }

        public String toString() {
            return "Loading(backEvent=" + this.backEvent + ", forwardEvent=" + this.forwardEvent + ")";
        }

        public Loading(UiEvent<Integer> uiEvent, UiEvent<Integer> uiEvent2) {
            this.backEvent = uiEvent;
            this.forwardEvent = uiEvent2;
        }

        @Override // com.robinhood.android.acatsin.intro.AcatsInIntroViewState
        public UiEvent<Integer> getBackEvent() {
            return this.backEvent;
        }

        @Override // com.robinhood.android.acatsin.intro.AcatsInIntroViewState
        public UiEvent<Integer> getForwardEvent() {
            return this.forwardEvent;
        }
    }

    /* compiled from: AcatsInIntroViewState.kt */
    @Metadata(m3635d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0018\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\n\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u000e\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010$\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003HÆ\u0003J\t\u0010%\u001a\u00020\u0007HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003J\u0017\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\nHÆ\u0003J\t\u0010(\u001a\u00020\rHÆ\u0003J\t\u0010)\u001a\u00020\u000fHÆ\u0003J\u000f\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011HÆ\u0003J\u0011\u0010+\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011HÆ\u0003J\u0095\u0001\u0010,\u001a\u00020\u00002\u001a\b\u0002\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\n2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\n2\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\u000e\b\u0002\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0010\b\u0002\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011HÆ\u0001J\u0013\u0010-\u001a\u00020\r2\b\u0010.\u001a\u0004\u0018\u00010/HÖ\u0003J\t\u00100\u001a\u00020\u0007HÖ\u0001J\t\u00101\u001a\u00020\u000fHÖ\u0001R#\u0010\u0002\u001a\u0014\u0012\u0010\u0012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u00030\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\"\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\"\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tj\u0004\u0018\u0001`\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0019\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u000f0\u0011¢\u0006\b\n\u0000\u001a\u0004\b#\u0010\"¨\u00062"}, m3636d2 = {"Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState$Ready;", "Lcom/robinhood/android/acatsin/intro/AcatsInIntroViewState;", "pages", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "pageIndex", "", "backEvent", "Lcom/robinhood/udf/UiEvent;", "Lcom/robinhood/android/acatsin/intro/NavEvent;", "forwardEvent", "bonusShown", "", "lottieUrl", "", "lottieSpecs", "", "Lcom/robinhood/android/acatsin/intro/LottiePageSpecs;", "overrideImageUrls", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;ILcom/robinhood/udf/UiEvent;Lcom/robinhood/udf/UiEvent;ZLjava/lang/String;Ljava/util/List;Ljava/util/List;)V", "getPages", "()Lkotlinx/collections/immutable/ImmutableList;", "getPageIndex", "()I", "getBackEvent", "()Lcom/robinhood/udf/UiEvent;", "getForwardEvent", "getBonusShown", "()Z", "getLottieUrl", "()Ljava/lang/String;", "getLottieSpecs", "()Ljava/util/List;", "getOverrideImageUrls", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "", "hashCode", "toString", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Ready implements AcatsInIntroViewState {
        public static final int $stable = 8;
        private final UiEvent<Integer> backEvent;
        private final boolean bonusShown;
        private final UiEvent<Integer> forwardEvent;
        private final List<PagedLottie> lottieSpecs;
        private final String lottieUrl;
        private final List<String> overrideImageUrls;
        private final int pageIndex;
        private final ImmutableList<ImmutableList<UIComponent<GenericAction>>> pages;

        public static /* synthetic */ Ready copy$default(Ready ready, ImmutableList immutableList, int i, UiEvent uiEvent, UiEvent uiEvent2, boolean z, String str, List list, List list2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                immutableList = ready.pages;
            }
            if ((i2 & 2) != 0) {
                i = ready.pageIndex;
            }
            if ((i2 & 4) != 0) {
                uiEvent = ready.backEvent;
            }
            if ((i2 & 8) != 0) {
                uiEvent2 = ready.forwardEvent;
            }
            if ((i2 & 16) != 0) {
                z = ready.bonusShown;
            }
            if ((i2 & 32) != 0) {
                str = ready.lottieUrl;
            }
            if ((i2 & 64) != 0) {
                list = ready.lottieSpecs;
            }
            if ((i2 & 128) != 0) {
                list2 = ready.overrideImageUrls;
            }
            List list3 = list;
            List list4 = list2;
            boolean z2 = z;
            String str2 = str;
            return ready.copy(immutableList, i, uiEvent, uiEvent2, z2, str2, list3, list4);
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

        /* renamed from: component6, reason: from getter */
        public final String getLottieUrl() {
            return this.lottieUrl;
        }

        public final List<PagedLottie> component7() {
            return this.lottieSpecs;
        }

        public final List<String> component8() {
            return this.overrideImageUrls;
        }

        public final Ready copy(ImmutableList<? extends ImmutableList<? extends UIComponent<? extends GenericAction>>> pages, int pageIndex, UiEvent<Integer> backEvent, UiEvent<Integer> forwardEvent, boolean bonusShown, String lottieUrl, List<? extends PagedLottie> lottieSpecs, List<String> overrideImageUrls) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
            Intrinsics.checkNotNullParameter(lottieSpecs, "lottieSpecs");
            Intrinsics.checkNotNullParameter(overrideImageUrls, "overrideImageUrls");
            return new Ready(pages, pageIndex, backEvent, forwardEvent, bonusShown, lottieUrl, lottieSpecs, overrideImageUrls);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Ready)) {
                return false;
            }
            Ready ready = (Ready) other;
            return Intrinsics.areEqual(this.pages, ready.pages) && this.pageIndex == ready.pageIndex && Intrinsics.areEqual(this.backEvent, ready.backEvent) && Intrinsics.areEqual(this.forwardEvent, ready.forwardEvent) && this.bonusShown == ready.bonusShown && Intrinsics.areEqual(this.lottieUrl, ready.lottieUrl) && Intrinsics.areEqual(this.lottieSpecs, ready.lottieSpecs) && Intrinsics.areEqual(this.overrideImageUrls, ready.overrideImageUrls);
        }

        public int hashCode() {
            int iHashCode = ((this.pages.hashCode() * 31) + Integer.hashCode(this.pageIndex)) * 31;
            UiEvent<Integer> uiEvent = this.backEvent;
            int iHashCode2 = (iHashCode + (uiEvent == null ? 0 : uiEvent.hashCode())) * 31;
            UiEvent<Integer> uiEvent2 = this.forwardEvent;
            return ((((((((iHashCode2 + (uiEvent2 != null ? uiEvent2.hashCode() : 0)) * 31) + Boolean.hashCode(this.bonusShown)) * 31) + this.lottieUrl.hashCode()) * 31) + this.lottieSpecs.hashCode()) * 31) + this.overrideImageUrls.hashCode();
        }

        public String toString() {
            return "Ready(pages=" + this.pages + ", pageIndex=" + this.pageIndex + ", backEvent=" + this.backEvent + ", forwardEvent=" + this.forwardEvent + ", bonusShown=" + this.bonusShown + ", lottieUrl=" + this.lottieUrl + ", lottieSpecs=" + this.lottieSpecs + ", overrideImageUrls=" + this.overrideImageUrls + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Ready(ImmutableList<? extends ImmutableList<? extends UIComponent<? extends GenericAction>>> pages, int i, UiEvent<Integer> uiEvent, UiEvent<Integer> uiEvent2, boolean z, String lottieUrl, List<? extends PagedLottie> lottieSpecs, List<String> overrideImageUrls) {
            Intrinsics.checkNotNullParameter(pages, "pages");
            Intrinsics.checkNotNullParameter(lottieUrl, "lottieUrl");
            Intrinsics.checkNotNullParameter(lottieSpecs, "lottieSpecs");
            Intrinsics.checkNotNullParameter(overrideImageUrls, "overrideImageUrls");
            this.pages = pages;
            this.pageIndex = i;
            this.backEvent = uiEvent;
            this.forwardEvent = uiEvent2;
            this.bonusShown = z;
            this.lottieUrl = lottieUrl;
            this.lottieSpecs = lottieSpecs;
            this.overrideImageUrls = overrideImageUrls;
        }

        public /* synthetic */ Ready(ImmutableList immutableList, int i, UiEvent uiEvent, UiEvent uiEvent2, boolean z, String str, List list, List list2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this(immutableList, (i2 & 2) != 0 ? 0 : i, uiEvent, uiEvent2, z, str, list, list2);
        }

        public final ImmutableList<ImmutableList<UIComponent<GenericAction>>> getPages() {
            return this.pages;
        }

        public final int getPageIndex() {
            return this.pageIndex;
        }

        @Override // com.robinhood.android.acatsin.intro.AcatsInIntroViewState
        public UiEvent<Integer> getBackEvent() {
            return this.backEvent;
        }

        @Override // com.robinhood.android.acatsin.intro.AcatsInIntroViewState
        public UiEvent<Integer> getForwardEvent() {
            return this.forwardEvent;
        }

        public final boolean getBonusShown() {
            return this.bonusShown;
        }

        public final String getLottieUrl() {
            return this.lottieUrl;
        }

        public final List<PagedLottie> getLottieSpecs() {
            return this.lottieSpecs;
        }

        public final List<String> getOverrideImageUrls() {
            return this.overrideImageUrls;
        }
    }
}
