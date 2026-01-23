package com.robinhood.android.investFlow.search.item;

import com.robinhood.android.common.util.analytics.AnalyticsStrings;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DiscoveryItemViewState.kt */
@Metadata(m3635d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u000e\u000fR\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0012\u0010\u0006\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u0012\u0010\n\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\tR\u0012\u0010\f\u001a\u00020\u0007X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\t\u0082\u0001\u0002\u0010\u0011¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;", "", "selected", "", "getSelected", "()Z", "symbol", "", "getSymbol", "()Ljava/lang/String;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "name", "getName", "Loading", "Loaded", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState$Loaded;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState$Loading;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface DiscoveryItemViewState {
    String getName();

    String getPrice();

    boolean getSelected();

    String getSymbol();

    /* compiled from: DiscoveryItemViewState.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00032\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\tHÖ\u0001R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\tX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState$Loading;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;", "selected", "", "<init>", "(Z)V", "getSelected", "()Z", "name", "", "getName", "()Ljava/lang/String;", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "getPrice", "symbol", "getSymbol", "component1", "copy", "equals", "other", "", "hashCode", "", "toString", "Companion", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loading implements DiscoveryItemViewState {
        public static final int $stable = 0;
        private static final String PlaceholderText = "N/A";
        private final boolean selected;
        private final String name = PlaceholderText;
        private final String price = PlaceholderText;
        private final String symbol = PlaceholderText;

        public static /* synthetic */ Loading copy$default(Loading loading, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                z = loading.selected;
            }
            return loading.copy(z);
        }

        /* renamed from: component1, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final Loading copy(boolean selected) {
            return new Loading(selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Loading) && this.selected == ((Loading) other).selected;
        }

        public int hashCode() {
            return Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Loading(selected=" + this.selected + ")";
        }

        public Loading(boolean z) {
            this.selected = z;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public boolean getSelected() {
            return this.selected;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public String getName() {
            return this.name;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public String getPrice() {
            return this.price;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public String getSymbol() {
            return this.symbol;
        }
    }

    /* compiled from: DiscoveryItemViewState.kt */
    @Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0018\u001a\u00020\tHÆ\u0003J;\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\t2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0006\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0014\u0010\b\u001a\u00020\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState$Loaded;", "Lcom/robinhood/android/investFlow/search/item/DiscoveryItemViewState;", "id", "Ljava/util/UUID;", "symbol", "", "name", AnalyticsStrings.TAG_SORT_ORDER_PRICE, "selected", "", "<init>", "(Ljava/util/UUID;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getId", "()Ljava/util/UUID;", "getSymbol", "()Ljava/lang/String;", "getName", "getPrice", "getSelected", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements DiscoveryItemViewState {
        public static final int $stable = 8;
        private final UUID id;
        private final String name;
        private final String price;
        private final boolean selected;
        private final String symbol;

        public static /* synthetic */ Loaded copy$default(Loaded loaded, UUID uuid, String str, String str2, String str3, boolean z, int i, Object obj) {
            if ((i & 1) != 0) {
                uuid = loaded.id;
            }
            if ((i & 2) != 0) {
                str = loaded.symbol;
            }
            if ((i & 4) != 0) {
                str2 = loaded.name;
            }
            if ((i & 8) != 0) {
                str3 = loaded.price;
            }
            if ((i & 16) != 0) {
                z = loaded.selected;
            }
            boolean z2 = z;
            String str4 = str2;
            return loaded.copy(uuid, str, str4, str3, z2);
        }

        /* renamed from: component1, reason: from getter */
        public final UUID getId() {
            return this.id;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSymbol() {
            return this.symbol;
        }

        /* renamed from: component3, reason: from getter */
        public final String getName() {
            return this.name;
        }

        /* renamed from: component4, reason: from getter */
        public final String getPrice() {
            return this.price;
        }

        /* renamed from: component5, reason: from getter */
        public final boolean getSelected() {
            return this.selected;
        }

        public final Loaded copy(UUID id, String symbol, String name, String price, boolean selected) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            return new Loaded(id, symbol, name, price, selected);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.id, loaded.id) && Intrinsics.areEqual(this.symbol, loaded.symbol) && Intrinsics.areEqual(this.name, loaded.name) && Intrinsics.areEqual(this.price, loaded.price) && this.selected == loaded.selected;
        }

        public int hashCode() {
            return (((((((this.id.hashCode() * 31) + this.symbol.hashCode()) * 31) + this.name.hashCode()) * 31) + this.price.hashCode()) * 31) + Boolean.hashCode(this.selected);
        }

        public String toString() {
            return "Loaded(id=" + this.id + ", symbol=" + this.symbol + ", name=" + this.name + ", price=" + this.price + ", selected=" + this.selected + ")";
        }

        public Loaded(UUID id, String symbol, String name, String price, boolean z) {
            Intrinsics.checkNotNullParameter(id, "id");
            Intrinsics.checkNotNullParameter(symbol, "symbol");
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(price, "price");
            this.id = id;
            this.symbol = symbol;
            this.name = name;
            this.price = price;
            this.selected = z;
        }

        public final UUID getId() {
            return this.id;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public String getSymbol() {
            return this.symbol;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public String getName() {
            return this.name;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public String getPrice() {
            return this.price;
        }

        @Override // com.robinhood.android.investFlow.search.item.DiscoveryItemViewState
        public boolean getSelected() {
            return this.selected;
        }
    }
}
