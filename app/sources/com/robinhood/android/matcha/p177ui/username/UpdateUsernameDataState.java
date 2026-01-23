package com.robinhood.android.matcha.p177ui.username;

import com.robinhood.compose.duxo.ComposeUiEvent;
import com.robinhood.models.p320db.Profile;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UpdateUsernameDataState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\nHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/username/UpdateUsernameDataState;", "", "profile", "Lcom/robinhood/models/db/Profile;", "updateComplete", "Lcom/robinhood/compose/duxo/ComposeUiEvent;", "", "isUpdating", "", "error", "", "<init>", "(Lcom/robinhood/models/db/Profile;Lcom/robinhood/compose/duxo/ComposeUiEvent;ZLjava/lang/Throwable;)V", "getProfile", "()Lcom/robinhood/models/db/Profile;", "getUpdateComplete", "()Lcom/robinhood/compose/duxo/ComposeUiEvent;", "()Z", "getError", "()Ljava/lang/Throwable;", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class UpdateUsernameDataState {
    public static final int $stable = 8;
    private final Throwable error;
    private final boolean isUpdating;
    private final Profile profile;
    private final ComposeUiEvent<Unit> updateComplete;

    public UpdateUsernameDataState() {
        this(null, null, false, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ UpdateUsernameDataState copy$default(UpdateUsernameDataState updateUsernameDataState, Profile profile, ComposeUiEvent composeUiEvent, boolean z, Throwable th, int i, Object obj) {
        if ((i & 1) != 0) {
            profile = updateUsernameDataState.profile;
        }
        if ((i & 2) != 0) {
            composeUiEvent = updateUsernameDataState.updateComplete;
        }
        if ((i & 4) != 0) {
            z = updateUsernameDataState.isUpdating;
        }
        if ((i & 8) != 0) {
            th = updateUsernameDataState.error;
        }
        return updateUsernameDataState.copy(profile, composeUiEvent, z, th);
    }

    /* renamed from: component1, reason: from getter */
    public final Profile getProfile() {
        return this.profile;
    }

    public final ComposeUiEvent<Unit> component2() {
        return this.updateComplete;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsUpdating() {
        return this.isUpdating;
    }

    /* renamed from: component4, reason: from getter */
    public final Throwable getError() {
        return this.error;
    }

    public final UpdateUsernameDataState copy(Profile profile, ComposeUiEvent<Unit> updateComplete, boolean isUpdating, Throwable error) {
        return new UpdateUsernameDataState(profile, updateComplete, isUpdating, error);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UpdateUsernameDataState)) {
            return false;
        }
        UpdateUsernameDataState updateUsernameDataState = (UpdateUsernameDataState) other;
        return Intrinsics.areEqual(this.profile, updateUsernameDataState.profile) && Intrinsics.areEqual(this.updateComplete, updateUsernameDataState.updateComplete) && this.isUpdating == updateUsernameDataState.isUpdating && Intrinsics.areEqual(this.error, updateUsernameDataState.error);
    }

    public int hashCode() {
        Profile profile = this.profile;
        int iHashCode = (profile == null ? 0 : profile.hashCode()) * 31;
        ComposeUiEvent<Unit> composeUiEvent = this.updateComplete;
        int iHashCode2 = (((iHashCode + (composeUiEvent == null ? 0 : composeUiEvent.hashCode())) * 31) + Boolean.hashCode(this.isUpdating)) * 31;
        Throwable th = this.error;
        return iHashCode2 + (th != null ? th.hashCode() : 0);
    }

    public String toString() {
        return "UpdateUsernameDataState(profile=" + this.profile + ", updateComplete=" + this.updateComplete + ", isUpdating=" + this.isUpdating + ", error=" + this.error + ")";
    }

    public UpdateUsernameDataState(Profile profile, ComposeUiEvent<Unit> composeUiEvent, boolean z, Throwable th) {
        this.profile = profile;
        this.updateComplete = composeUiEvent;
        this.isUpdating = z;
        this.error = th;
    }

    public /* synthetic */ UpdateUsernameDataState(Profile profile, ComposeUiEvent composeUiEvent, boolean z, Throwable th, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : profile, (i & 2) != 0 ? null : composeUiEvent, (i & 4) != 0 ? false : z, (i & 8) != 0 ? null : th);
    }

    public final Profile getProfile() {
        return this.profile;
    }

    public final ComposeUiEvent<Unit> getUpdateComplete() {
        return this.updateComplete;
    }

    public final boolean isUpdating() {
        return this.isUpdating;
    }

    public final Throwable getError() {
        return this.error;
    }
}
