package com.robinhood.android.cash.rhy.tab.p077v2.p078ui.carousel;

import com.robinhood.models.p320db.rhy.RhyTabCarouselItem;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: RhyOverviewCarouselViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "", "Loading", "Hidden", "Loaded", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState$Loaded;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState$Loading;", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface RhyOverviewCarouselViewState {

    /* compiled from: RhyOverviewCarouselViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState$Loading;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements RhyOverviewCarouselViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: RhyOverviewCarouselViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState$Hidden;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "<init>", "()V", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Hidden implements RhyOverviewCarouselViewState {
        public static final int $stable = 0;
        public static final Hidden INSTANCE = new Hidden();

        private Hidden() {
        }
    }

    /* compiled from: RhyOverviewCarouselViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0006HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00062\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState$Loaded;", "Lcom/robinhood/android/cash/rhy/tab/v2/ui/carousel/RhyOverviewCarouselViewState;", "carouselItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/models/db/rhy/RhyTabCarouselItem;", "creditCardWaitlistFlowSimplified", "", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Z)V", "getCarouselItems", "()Lkotlinx/collections/immutable/ImmutableList;", "getCreditCardWaitlistFlowSimplified", "()Z", "component1", "component2", "copy", "equals", "other", "", "hashCode", "", "toString", "", "feature-cash-rhy-tab_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements RhyOverviewCarouselViewState {
        public static final int $stable = 8;
        private final ImmutableList<RhyTabCarouselItem> carouselItems;
        private final boolean creditCardWaitlistFlowSimplified;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, ImmutableList immutableList, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = loaded.carouselItems;
            }
            if ((i & 2) != 0) {
                z = loaded.creditCardWaitlistFlowSimplified;
            }
            return loaded.copy(immutableList, z);
        }

        public final ImmutableList<RhyTabCarouselItem> component1() {
            return this.carouselItems;
        }

        /* renamed from: component2, reason: from getter */
        public final boolean getCreditCardWaitlistFlowSimplified() {
            return this.creditCardWaitlistFlowSimplified;
        }

        public final Loaded copy(ImmutableList<RhyTabCarouselItem> carouselItems, boolean creditCardWaitlistFlowSimplified) {
            Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
            return new Loaded(carouselItems, creditCardWaitlistFlowSimplified);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.carouselItems, loaded.carouselItems) && this.creditCardWaitlistFlowSimplified == loaded.creditCardWaitlistFlowSimplified;
        }

        public int hashCode() {
            return (this.carouselItems.hashCode() * 31) + Boolean.hashCode(this.creditCardWaitlistFlowSimplified);
        }

        public String toString() {
            return "Loaded(carouselItems=" + this.carouselItems + ", creditCardWaitlistFlowSimplified=" + this.creditCardWaitlistFlowSimplified + ")";
        }

        public Loaded(ImmutableList<RhyTabCarouselItem> carouselItems, boolean z) {
            Intrinsics.checkNotNullParameter(carouselItems, "carouselItems");
            this.carouselItems = carouselItems;
            this.creditCardWaitlistFlowSimplified = z;
        }

        public final ImmutableList<RhyTabCarouselItem> getCarouselItems() {
            return this.carouselItems;
        }

        public final boolean getCreditCardWaitlistFlowSimplified() {
            return this.creditCardWaitlistFlowSimplified;
        }
    }
}
