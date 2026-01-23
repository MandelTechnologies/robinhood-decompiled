package com.robinhood.android.advisory.history.fee;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: AdvisoryFeeDetailsViewState.kt */
@Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState;", "", "Loading", "Loaded", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState$Loaded;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState$Loading;", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public interface AdvisoryFeeDetailsViewState {

    /* compiled from: AdvisoryFeeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState$Loading;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements AdvisoryFeeDetailsViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        public boolean equals(Object other) {
            return this == other || (other instanceof Loading);
        }

        public int hashCode() {
            return 232838242;
        }

        public String toString() {
            return "Loading";
        }

        private Loading() {
        }
    }

    /* compiled from: AdvisoryFeeDetailsViewState.kt */
    @Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState$Loaded;", "Lcom/robinhood/android/advisory/history/fee/AdvisoryFeeDetailsViewState;", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "lineItems", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/advisory/history/fee/LineItem;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "getLineItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-advisory-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements AdvisoryFeeDetailsViewState {
        public static final int $stable = 8;
        private final ImmutableList<LineItem> lineItems;
        private final StringResource subtitle;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, StringResource stringResource, ImmutableList immutableList, int i, Object obj) {
            if ((i & 1) != 0) {
                stringResource = loaded.subtitle;
            }
            if ((i & 2) != 0) {
                immutableList = loaded.lineItems;
            }
            return loaded.copy(stringResource, immutableList);
        }

        /* renamed from: component1, reason: from getter */
        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final ImmutableList<LineItem> component2() {
            return this.lineItems;
        }

        public final Loaded copy(StringResource subtitle, ImmutableList<LineItem> lineItems) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            return new Loaded(subtitle, lineItems);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.subtitle, loaded.subtitle) && Intrinsics.areEqual(this.lineItems, loaded.lineItems);
        }

        public int hashCode() {
            return (this.subtitle.hashCode() * 31) + this.lineItems.hashCode();
        }

        public String toString() {
            return "Loaded(subtitle=" + this.subtitle + ", lineItems=" + this.lineItems + ")";
        }

        public Loaded(StringResource subtitle, ImmutableList<LineItem> lineItems) {
            Intrinsics.checkNotNullParameter(subtitle, "subtitle");
            Intrinsics.checkNotNullParameter(lineItems, "lineItems");
            this.subtitle = subtitle;
            this.lineItems = lineItems;
        }

        public final StringResource getSubtitle() {
            return this.subtitle;
        }

        public final ImmutableList<LineItem> getLineItems() {
            return this.lineItems;
        }
    }
}
