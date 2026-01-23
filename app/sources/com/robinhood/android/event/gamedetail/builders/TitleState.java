package com.robinhood.android.event.gamedetail.builders;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BuildGameDetailTitle.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/builders/TitleState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "subtitle", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getSubtitle", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TitleState {
    public static final int $stable = StringResource.$stable;
    private final String subtitle;
    private final StringResource title;

    /* JADX WARN: Multi-variable type inference failed */
    public TitleState() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ TitleState copy$default(TitleState titleState, StringResource stringResource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = titleState.title;
        }
        if ((i & 2) != 0) {
            str = titleState.subtitle;
        }
        return titleState.copy(stringResource, str);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    public final TitleState copy(StringResource title, String subtitle) {
        return new TitleState(title, subtitle);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TitleState)) {
            return false;
        }
        TitleState titleState = (TitleState) other;
        return Intrinsics.areEqual(this.title, titleState.title) && Intrinsics.areEqual(this.subtitle, titleState.subtitle);
    }

    public int hashCode() {
        StringResource stringResource = this.title;
        int iHashCode = (stringResource == null ? 0 : stringResource.hashCode()) * 31;
        String str = this.subtitle;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        return "TitleState(title=" + this.title + ", subtitle=" + this.subtitle + ")";
    }

    public TitleState(StringResource stringResource, String str) {
        this.title = stringResource;
        this.subtitle = str;
    }

    public /* synthetic */ TitleState(StringResource stringResource, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : stringResource, (i & 2) != 0 ? null : str);
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final String getSubtitle() {
        return this.subtitle;
    }
}
