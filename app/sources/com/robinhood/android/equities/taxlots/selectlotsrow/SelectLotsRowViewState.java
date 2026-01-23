package com.robinhood.android.equities.taxlots.selectlotsrow;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SelectLotsRowViewState.kt */
@Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0012\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003JA\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, m3636d2 = {"Lcom/robinhood/android/equities/taxlots/selectlotsrow/SelectLotsRowViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "metaTitle", "metaSubtitle", "hasSelectedLots", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Z)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "getMetaTitle", "getMetaSubtitle", "getHasSelectedLots", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "", "toString", "", "lib-tax-lots_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SelectLotsRowViewState {
    public static final int $stable = StringResource.$stable;
    private final boolean hasSelectedLots;
    private final StringResource metaSubtitle;
    private final StringResource metaTitle;
    private final StringResource subtitle;
    private final StringResource title;

    public static /* synthetic */ SelectLotsRowViewState copy$default(SelectLotsRowViewState selectLotsRowViewState, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, StringResource stringResource4, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = selectLotsRowViewState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = selectLotsRowViewState.subtitle;
        }
        if ((i & 4) != 0) {
            stringResource3 = selectLotsRowViewState.metaTitle;
        }
        if ((i & 8) != 0) {
            stringResource4 = selectLotsRowViewState.metaSubtitle;
        }
        if ((i & 16) != 0) {
            z = selectLotsRowViewState.hasSelectedLots;
        }
        boolean z2 = z;
        StringResource stringResource5 = stringResource3;
        return selectLotsRowViewState.copy(stringResource, stringResource2, stringResource5, stringResource4, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getMetaTitle() {
        return this.metaTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getMetaSubtitle() {
        return this.metaSubtitle;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getHasSelectedLots() {
        return this.hasSelectedLots;
    }

    public final SelectLotsRowViewState copy(StringResource title, StringResource subtitle, StringResource metaTitle, StringResource metaSubtitle, boolean hasSelectedLots) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new SelectLotsRowViewState(title, subtitle, metaTitle, metaSubtitle, hasSelectedLots);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectLotsRowViewState)) {
            return false;
        }
        SelectLotsRowViewState selectLotsRowViewState = (SelectLotsRowViewState) other;
        return Intrinsics.areEqual(this.title, selectLotsRowViewState.title) && Intrinsics.areEqual(this.subtitle, selectLotsRowViewState.subtitle) && Intrinsics.areEqual(this.metaTitle, selectLotsRowViewState.metaTitle) && Intrinsics.areEqual(this.metaSubtitle, selectLotsRowViewState.metaSubtitle) && this.hasSelectedLots == selectLotsRowViewState.hasSelectedLots;
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        StringResource stringResource = this.subtitle;
        int iHashCode2 = (iHashCode + (stringResource == null ? 0 : stringResource.hashCode())) * 31;
        StringResource stringResource2 = this.metaTitle;
        int iHashCode3 = (iHashCode2 + (stringResource2 == null ? 0 : stringResource2.hashCode())) * 31;
        StringResource stringResource3 = this.metaSubtitle;
        return ((iHashCode3 + (stringResource3 != null ? stringResource3.hashCode() : 0)) * 31) + Boolean.hashCode(this.hasSelectedLots);
    }

    public String toString() {
        return "SelectLotsRowViewState(title=" + this.title + ", subtitle=" + this.subtitle + ", metaTitle=" + this.metaTitle + ", metaSubtitle=" + this.metaSubtitle + ", hasSelectedLots=" + this.hasSelectedLots + ")";
    }

    public SelectLotsRowViewState(StringResource title, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, boolean z) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.subtitle = stringResource;
        this.metaTitle = stringResource2;
        this.metaSubtitle = stringResource3;
        this.hasSelectedLots = z;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final StringResource getMetaTitle() {
        return this.metaTitle;
    }

    public final StringResource getMetaSubtitle() {
        return this.metaSubtitle;
    }

    public final boolean getHasSelectedLots() {
        return this.hasSelectedLots;
    }
}
