package com.robinhood.android.acatsin.consolidatedintro;

import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.consolidatedintro.model.AcatsInConsolidatedIntroItemState;
import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: AcatsInConsolidatedIntroViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/acatsin/consolidatedintro/AcatsInConsolidatedIntroViewState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "content", "button", "items", "Lkotlinx/collections/immutable/ImmutableList;", "Lcom/robinhood/android/acatsin/consolidatedintro/model/AcatsInConsolidatedIntroItemState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lkotlinx/collections/immutable/ImmutableList;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getContent", "getButton", "getItems", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInConsolidatedIntroViewState {
    public static final int $stable = StringResource.$stable;
    private final StringResource button;
    private final StringResource content;
    private final ImmutableList<AcatsInConsolidatedIntroItemState> items;
    private final StringResource title;

    public AcatsInConsolidatedIntroViewState() {
        this(null, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AcatsInConsolidatedIntroViewState copy$default(AcatsInConsolidatedIntroViewState acatsInConsolidatedIntroViewState, StringResource stringResource, StringResource stringResource2, StringResource stringResource3, ImmutableList immutableList, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = acatsInConsolidatedIntroViewState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = acatsInConsolidatedIntroViewState.content;
        }
        if ((i & 4) != 0) {
            stringResource3 = acatsInConsolidatedIntroViewState.button;
        }
        if ((i & 8) != 0) {
            immutableList = acatsInConsolidatedIntroViewState.items;
        }
        return acatsInConsolidatedIntroViewState.copy(stringResource, stringResource2, stringResource3, immutableList);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final StringResource getContent() {
        return this.content;
    }

    /* renamed from: component3, reason: from getter */
    public final StringResource getButton() {
        return this.button;
    }

    public final ImmutableList<AcatsInConsolidatedIntroItemState> component4() {
        return this.items;
    }

    public final AcatsInConsolidatedIntroViewState copy(StringResource title, StringResource content, StringResource button, ImmutableList<AcatsInConsolidatedIntroItemState> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        return new AcatsInConsolidatedIntroViewState(title, content, button, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInConsolidatedIntroViewState)) {
            return false;
        }
        AcatsInConsolidatedIntroViewState acatsInConsolidatedIntroViewState = (AcatsInConsolidatedIntroViewState) other;
        return Intrinsics.areEqual(this.title, acatsInConsolidatedIntroViewState.title) && Intrinsics.areEqual(this.content, acatsInConsolidatedIntroViewState.content) && Intrinsics.areEqual(this.button, acatsInConsolidatedIntroViewState.button) && Intrinsics.areEqual(this.items, acatsInConsolidatedIntroViewState.items);
    }

    public int hashCode() {
        return (((((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.button.hashCode()) * 31) + this.items.hashCode();
    }

    public String toString() {
        return "AcatsInConsolidatedIntroViewState(title=" + this.title + ", content=" + this.content + ", button=" + this.button + ", items=" + this.items + ")";
    }

    public AcatsInConsolidatedIntroViewState(StringResource title, StringResource content, StringResource button, ImmutableList<AcatsInConsolidatedIntroItemState> items) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(button, "button");
        Intrinsics.checkNotNullParameter(items, "items");
        this.title = title;
        this.content = content;
        this.button = button;
        this.items = items;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ AcatsInConsolidatedIntroViewState(StringResource stringResource, StringResource stringResource2, StringResource stringResource3, ImmutableList immutableList, int i, DefaultConstructorMarker defaultConstructorMarker) {
        stringResource = (i & 1) != 0 ? StringResource.INSTANCE.invoke(C7725R.string.acats_in_intro_consolidated_title, new Object[0]) : stringResource;
        stringResource2 = (i & 2) != 0 ? StringResource.INSTANCE.invoke(C7725R.string.acats_in_intro_consolidated_content, new Object[0]) : stringResource2;
        stringResource3 = (i & 4) != 0 ? StringResource.INSTANCE.invoke(C7725R.string.acats_in_intro_consolidated_bottom_button, new Object[0]) : stringResource3;
        if ((i & 8) != 0) {
            StringResource.Companion companion = StringResource.INSTANCE;
            immutableList = extensions2.persistentListOf(new AcatsInConsolidatedIntroItemState(companion.invoke(C7725R.string.acats_in_intro_consolidated_item_account_title, new Object[0]), companion.invoke(C7725R.string.acats_in_intro_consolidated_item_account_description, new Object[0]), ServerToBentoAssetMapper2.TRANSFERS_24), new AcatsInConsolidatedIntroItemState(companion.invoke(C7725R.string.acats_in_intro_consolidated_item_assets_title, new Object[0]), companion.invoke(C7725R.string.acats_in_intro_consolidated_item_assets_description, new Object[0]), ServerToBentoAssetMapper2.SEARCH_24), new AcatsInConsolidatedIntroItemState(companion.invoke(C7725R.string.acats_in_intro_consolidated_item_manage_title, new Object[0]), companion.invoke(C7725R.string.acats_in_intro_consolidated_item_manage_description, new Object[0]), ServerToBentoAssetMapper2.BANKING_24));
        }
        this(stringResource, stringResource2, stringResource3, immutableList);
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getContent() {
        return this.content;
    }

    public final StringResource getButton() {
        return this.button;
    }

    public final ImmutableList<AcatsInConsolidatedIntroItemState> getItems() {
        return this.items;
    }
}
