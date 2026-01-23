package com.robinhood.android.acatsin.consolidatedintro.model;

import com.robinhood.android.libdesignsystem.serverui.ServerToBentoAssetMapper2;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AcatsInConsolidatedIntroItemState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/acatsin/consolidatedintro/model/AcatsInConsolidatedIntroItemState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "content", "icon", "Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/utils/resource/StringResource;Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getContent", "getIcon", "()Lcom/robinhood/android/libdesignsystem/serverui/IconAsset;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final /* data */ class AcatsInConsolidatedIntroItemState {
    public static final int $stable = StringResource.$stable;
    private final StringResource content;
    private final ServerToBentoAssetMapper2 icon;
    private final StringResource title;

    public static /* synthetic */ AcatsInConsolidatedIntroItemState copy$default(AcatsInConsolidatedIntroItemState acatsInConsolidatedIntroItemState, StringResource stringResource, StringResource stringResource2, ServerToBentoAssetMapper2 serverToBentoAssetMapper2, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = acatsInConsolidatedIntroItemState.title;
        }
        if ((i & 2) != 0) {
            stringResource2 = acatsInConsolidatedIntroItemState.content;
        }
        if ((i & 4) != 0) {
            serverToBentoAssetMapper2 = acatsInConsolidatedIntroItemState.icon;
        }
        return acatsInConsolidatedIntroItemState.copy(stringResource, stringResource2, serverToBentoAssetMapper2);
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
    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }

    public final AcatsInConsolidatedIntroItemState copy(StringResource title, StringResource content, ServerToBentoAssetMapper2 icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new AcatsInConsolidatedIntroItemState(title, content, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AcatsInConsolidatedIntroItemState)) {
            return false;
        }
        AcatsInConsolidatedIntroItemState acatsInConsolidatedIntroItemState = (AcatsInConsolidatedIntroItemState) other;
        return Intrinsics.areEqual(this.title, acatsInConsolidatedIntroItemState.title) && Intrinsics.areEqual(this.content, acatsInConsolidatedIntroItemState.content) && this.icon == acatsInConsolidatedIntroItemState.icon;
    }

    public int hashCode() {
        return (((this.title.hashCode() * 31) + this.content.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "AcatsInConsolidatedIntroItemState(title=" + this.title + ", content=" + this.content + ", icon=" + this.icon + ")";
    }

    public AcatsInConsolidatedIntroItemState(StringResource title, StringResource content, ServerToBentoAssetMapper2 icon) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(content, "content");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.title = title;
        this.content = content;
        this.icon = icon;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final StringResource getContent() {
        return this.content;
    }

    public final ServerToBentoAssetMapper2 getIcon() {
        return this.icon;
    }
}
