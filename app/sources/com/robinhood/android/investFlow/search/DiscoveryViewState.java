package com.robinhood.android.investFlow.search;

import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.UIComponent;
import com.withpersona.sdk2.inquiry.network.dto.p421ui.components.Footer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;

/* compiled from: DiscoveryViewState.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/DiscoveryViewState;", "", "Loading", "Error", "Loaded", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Error;", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Loaded;", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Loading;", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public interface DiscoveryViewState {

    /* compiled from: DiscoveryViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Loading;", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Loading implements DiscoveryViewState {
        public static final int $stable = 0;
        public static final Loading INSTANCE = new Loading();

        private Loading() {
        }
    }

    /* compiled from: DiscoveryViewState.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Error;", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState;", "<init>", "()V", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Error implements DiscoveryViewState {
        public static final int $stable = 0;
        public static final Error INSTANCE = new Error();

        private Error() {
        }
    }

    /* compiled from: DiscoveryViewState.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0014\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003\u0012\u0014\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0003JY\u0010\u0016\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00032\u0016\b\u0002\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u00032\u000e\b\u0002\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0005\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001f\u0010\b\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u0006\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0017\u0010\t\u001a\b\u0012\u0004\u0012\u00020\n0\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/investFlow/search/DiscoveryViewState$Loaded;", "Lcom/robinhood/android/investFlow/search/DiscoveryViewState;", "selectedIds", "Lkotlinx/collections/immutable/ImmutableList;", "Ljava/util/UUID;", "header", "Lcom/robinhood/models/serverdriven/experimental/api/UIComponent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", Footer.f10637type, "sections", "Lcom/robinhood/android/investFlow/search/DiscoverySection;", "<init>", "(Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;Lkotlinx/collections/immutable/ImmutableList;)V", "getSelectedIds", "()Lkotlinx/collections/immutable/ImmutableList;", "getHeader", "getFooter", "getSections", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "feature-invest-flow_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Loaded implements DiscoveryViewState {
        public static final int $stable = 8;
        private final ImmutableList<UIComponent<GenericAction>> footer;
        private final ImmutableList<UIComponent<GenericAction>> header;
        private final ImmutableList<DiscoverySection> sections;
        private final ImmutableList<UUID> selectedIds;

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Loaded copy$default(Loaded loaded, ImmutableList immutableList, ImmutableList immutableList2, ImmutableList immutableList3, ImmutableList immutableList4, int i, Object obj) {
            if ((i & 1) != 0) {
                immutableList = loaded.selectedIds;
            }
            if ((i & 2) != 0) {
                immutableList2 = loaded.header;
            }
            if ((i & 4) != 0) {
                immutableList3 = loaded.footer;
            }
            if ((i & 8) != 0) {
                immutableList4 = loaded.sections;
            }
            return loaded.copy(immutableList, immutableList2, immutableList3, immutableList4);
        }

        public final ImmutableList<UUID> component1() {
            return this.selectedIds;
        }

        public final ImmutableList<UIComponent<GenericAction>> component2() {
            return this.header;
        }

        public final ImmutableList<UIComponent<GenericAction>> component3() {
            return this.footer;
        }

        public final ImmutableList<DiscoverySection> component4() {
            return this.sections;
        }

        public final Loaded copy(ImmutableList<UUID> selectedIds, ImmutableList<? extends UIComponent<? extends GenericAction>> header, ImmutableList<? extends UIComponent<? extends GenericAction>> footer, ImmutableList<DiscoverySection> sections) {
            Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
            Intrinsics.checkNotNullParameter(sections, "sections");
            return new Loaded(selectedIds, header, footer, sections);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loaded)) {
                return false;
            }
            Loaded loaded = (Loaded) other;
            return Intrinsics.areEqual(this.selectedIds, loaded.selectedIds) && Intrinsics.areEqual(this.header, loaded.header) && Intrinsics.areEqual(this.footer, loaded.footer) && Intrinsics.areEqual(this.sections, loaded.sections);
        }

        public int hashCode() {
            int iHashCode = this.selectedIds.hashCode() * 31;
            ImmutableList<UIComponent<GenericAction>> immutableList = this.header;
            int iHashCode2 = (iHashCode + (immutableList == null ? 0 : immutableList.hashCode())) * 31;
            ImmutableList<UIComponent<GenericAction>> immutableList2 = this.footer;
            return ((iHashCode2 + (immutableList2 != null ? immutableList2.hashCode() : 0)) * 31) + this.sections.hashCode();
        }

        public String toString() {
            return "Loaded(selectedIds=" + this.selectedIds + ", header=" + this.header + ", footer=" + this.footer + ", sections=" + this.sections + ")";
        }

        /* JADX WARN: Multi-variable type inference failed */
        public Loaded(ImmutableList<UUID> selectedIds, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList, ImmutableList<? extends UIComponent<? extends GenericAction>> immutableList2, ImmutableList<DiscoverySection> sections) {
            Intrinsics.checkNotNullParameter(selectedIds, "selectedIds");
            Intrinsics.checkNotNullParameter(sections, "sections");
            this.selectedIds = selectedIds;
            this.header = immutableList;
            this.footer = immutableList2;
            this.sections = sections;
        }

        public final ImmutableList<UUID> getSelectedIds() {
            return this.selectedIds;
        }

        public final ImmutableList<UIComponent<GenericAction>> getHeader() {
            return this.header;
        }

        public final ImmutableList<UIComponent<GenericAction>> getFooter() {
            return this.footer;
        }

        public final ImmutableList<DiscoverySection> getSections() {
            return this.sections;
        }
    }
}
