package com.robinhood.android.event.gamedetail.components.bottomsheet;

import com.robinhood.android.event.gamedetail.p130ui.DayNightImageUrl;
import com.robinhood.android.markdown.compose.MarkdownText4;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PositionDetailBottomSheet.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/bottomsheet/PositionContractDetailRowState;", "", "key", "", MarkdownText4.TagImageUrl, "Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;", "title", "subtitle", "Lcom/robinhood/utils/resource/StringResource;", "<init>", "(Ljava/lang/String;Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;Ljava/lang/String;Lcom/robinhood/utils/resource/StringResource;)V", "getKey", "()Ljava/lang/String;", "getImageUrl", "()Lcom/robinhood/android/event/gamedetail/ui/DayNightImageUrl;", "getTitle", "getSubtitle", "()Lcom/robinhood/utils/resource/StringResource;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PositionContractDetailRowState {
    public static final int $stable = 0;
    private final DayNightImageUrl imageUrl;
    private final String key;
    private final StringResource subtitle;
    private final String title;

    public static /* synthetic */ PositionContractDetailRowState copy$default(PositionContractDetailRowState positionContractDetailRowState, String str, DayNightImageUrl dayNightImageUrl, String str2, StringResource stringResource, int i, Object obj) {
        if ((i & 1) != 0) {
            str = positionContractDetailRowState.key;
        }
        if ((i & 2) != 0) {
            dayNightImageUrl = positionContractDetailRowState.imageUrl;
        }
        if ((i & 4) != 0) {
            str2 = positionContractDetailRowState.title;
        }
        if ((i & 8) != 0) {
            stringResource = positionContractDetailRowState.subtitle;
        }
        return positionContractDetailRowState.copy(str, dayNightImageUrl, str2, stringResource);
    }

    /* renamed from: component1, reason: from getter */
    public final String getKey() {
        return this.key;
    }

    /* renamed from: component2, reason: from getter */
    public final DayNightImageUrl getImageUrl() {
        return this.imageUrl;
    }

    /* renamed from: component3, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component4, reason: from getter */
    public final StringResource getSubtitle() {
        return this.subtitle;
    }

    public final PositionContractDetailRowState copy(String key, DayNightImageUrl imageUrl, String title, StringResource subtitle) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        return new PositionContractDetailRowState(key, imageUrl, title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PositionContractDetailRowState)) {
            return false;
        }
        PositionContractDetailRowState positionContractDetailRowState = (PositionContractDetailRowState) other;
        return Intrinsics.areEqual(this.key, positionContractDetailRowState.key) && Intrinsics.areEqual(this.imageUrl, positionContractDetailRowState.imageUrl) && Intrinsics.areEqual(this.title, positionContractDetailRowState.title) && Intrinsics.areEqual(this.subtitle, positionContractDetailRowState.subtitle);
    }

    public int hashCode() {
        int iHashCode = ((this.key.hashCode() * 31) + this.imageUrl.hashCode()) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        StringResource stringResource = this.subtitle;
        return iHashCode2 + (stringResource != null ? stringResource.hashCode() : 0);
    }

    public String toString() {
        return "PositionContractDetailRowState(key=" + this.key + ", imageUrl=" + this.imageUrl + ", title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    public PositionContractDetailRowState(String key, DayNightImageUrl imageUrl, String str, StringResource stringResource) {
        Intrinsics.checkNotNullParameter(key, "key");
        Intrinsics.checkNotNullParameter(imageUrl, "imageUrl");
        this.key = key;
        this.imageUrl = imageUrl;
        this.title = str;
        this.subtitle = stringResource;
    }

    public final String getKey() {
        return this.key;
    }

    public final DayNightImageUrl getImageUrl() {
        return this.imageUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final StringResource getSubtitle() {
        return this.subtitle;
    }
}
