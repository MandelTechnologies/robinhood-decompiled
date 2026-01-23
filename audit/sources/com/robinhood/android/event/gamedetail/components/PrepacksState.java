package com.robinhood.android.event.gamedetail.components;

import com.robinhood.utils.resource.StringResource;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GameDetailPrepacks.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/event/gamedetail/components/PrepacksState;", "", "title", "Lcom/robinhood/utils/resource/StringResource;", "prepacks", "", "Lcom/robinhood/android/event/gamedetail/components/PrepackOptionState;", "<init>", "(Lcom/robinhood/utils/resource/StringResource;Ljava/util/List;)V", "getTitle", "()Lcom/robinhood/utils/resource/StringResource;", "getPrepacks", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-game-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PrepacksState {
    public static final int $stable = 0;
    private final List<PrepackOptionState> prepacks;
    private final StringResource title;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PrepacksState copy$default(PrepacksState prepacksState, StringResource stringResource, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            stringResource = prepacksState.title;
        }
        if ((i & 2) != 0) {
            list = prepacksState.prepacks;
        }
        return prepacksState.copy(stringResource, list);
    }

    /* renamed from: component1, reason: from getter */
    public final StringResource getTitle() {
        return this.title;
    }

    public final List<PrepackOptionState> component2() {
        return this.prepacks;
    }

    public final PrepacksState copy(StringResource title, List<PrepackOptionState> prepacks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(prepacks, "prepacks");
        return new PrepacksState(title, prepacks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PrepacksState)) {
            return false;
        }
        PrepacksState prepacksState = (PrepacksState) other;
        return Intrinsics.areEqual(this.title, prepacksState.title) && Intrinsics.areEqual(this.prepacks, prepacksState.prepacks);
    }

    public int hashCode() {
        return (this.title.hashCode() * 31) + this.prepacks.hashCode();
    }

    public String toString() {
        return "PrepacksState(title=" + this.title + ", prepacks=" + this.prepacks + ")";
    }

    public PrepacksState(StringResource title, List<PrepackOptionState> prepacks) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(prepacks, "prepacks");
        this.title = title;
        this.prepacks = prepacks;
    }

    public final StringResource getTitle() {
        return this.title;
    }

    public final List<PrepackOptionState> getPrepacks() {
        return this.prepacks;
    }
}
