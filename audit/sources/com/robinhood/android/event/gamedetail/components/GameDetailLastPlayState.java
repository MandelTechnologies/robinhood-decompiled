package com.robinhood.android.event.gamedetail.components;

import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailLastPlay.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/GameDetailLastPlayState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "description", "", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/lang/String;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getDescription", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GameDetailLastPlayState {
    public static final int $stable = 0;
    private final String description;
    private final StringResource title;

    public static /* synthetic */ GameDetailLastPlayState copy$default(GameDetailLastPlayState gameDetailLastPlayState, StringResource stringResource, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = gameDetailLastPlayState.title;
        }
        if ((i & 2) != 0) {
            str = gameDetailLastPlayState.description;
        }
        return gameDetailLastPlayState.copy(stringResource, str);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    public final GameDetailLastPlayState copy(StringResource title, String description) {
        Intrinsics.checkNotNullParameter(title, "title");
        return new GameDetailLastPlayState(title, description);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GameDetailLastPlayState)) {
            return false;
        }
        GameDetailLastPlayState gameDetailLastPlayState = (GameDetailLastPlayState) other;
        return Intrinsics.areEqual(this.title, gameDetailLastPlayState.title) && Intrinsics.areEqual(this.description, gameDetailLastPlayState.description);
    }

    public int hashCode() {
        int iHashCode = this.title.hashCode() * 31;
        String str = this.description;
        return iHashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "GameDetailLastPlayState(title=" + this.title + ", description=" + this.description + ")";
    }

    public GameDetailLastPlayState(StringResource title, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        this.title = title;
        this.description = str;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final String getDescription() {
        return this.description;
    }
}
