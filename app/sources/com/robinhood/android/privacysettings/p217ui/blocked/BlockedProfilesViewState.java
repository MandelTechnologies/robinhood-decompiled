package com.robinhood.android.privacysettings.p217ui.blocked;

import com.robinhood.models.api.bonfire.ApiSocialBlockedUser;
import com.robinhood.models.api.bonfire.ApiSocialBlockingResponse;
import com.robinhood.models.social.p351ui.SocialBlockedUser;
import com.robinhood.udf.UiEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: BlockedProfilesViewState.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010 \u001a\u00020\u0003HÆ\u0003J\t\u0010!\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0011\u0010#\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u000f\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00060\u000bHÆ\u0003J\u000f\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0003J[\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000bHÆ\u0001J\u0013\u0010'\u001a\u00020\u00032\b\u0010(\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010)\u001a\u00020*HÖ\u0001J\t\u0010+\u001a\u00020,HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017R\u0017\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b8F¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006-"}, m3636d2 = {"Lcom/robinhood/android/privacysettings/ui/blocked/BlockedProfilesViewState;", "", "isLoading", "", "showUnblockDialog", "unblockDialogUser", "Lcom/robinhood/models/social/ui/SocialBlockedUser;", "errorEvent", "Lcom/robinhood/udf/UiEvent;", "", "users", "", "blockingResponses", "Lcom/robinhood/models/api/bonfire/ApiSocialBlockingResponse;", "<init>", "(ZZLcom/robinhood/models/social/ui/SocialBlockedUser;Lcom/robinhood/udf/UiEvent;Ljava/util/List;Ljava/util/List;)V", "()Z", "getShowUnblockDialog", "getUnblockDialogUser", "()Lcom/robinhood/models/social/ui/SocialBlockedUser;", "getErrorEvent", "()Lcom/robinhood/udf/UiEvent;", "getUsers", "()Ljava/util/List;", "getBlockingResponses", "blockedUsers", "getBlockedUsers", "inactiveRelationships", "", "Ljava/util/UUID;", "getInactiveRelationships", "()Ljava/util/Set;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "other", "hashCode", "", "toString", "", "feature-privacy-settings_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class BlockedProfilesViewState {
    public static final int $stable = 8;
    private final List<ApiSocialBlockingResponse> blockingResponses;
    private final UiEvent<Throwable> errorEvent;
    private final boolean isLoading;
    private final boolean showUnblockDialog;
    private final SocialBlockedUser unblockDialogUser;
    private final List<SocialBlockedUser> users;

    public BlockedProfilesViewState() {
        this(false, false, null, null, null, null, 63, null);
    }

    public static /* synthetic */ BlockedProfilesViewState copy$default(BlockedProfilesViewState blockedProfilesViewState, boolean z, boolean z2, SocialBlockedUser socialBlockedUser, UiEvent uiEvent, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            z = blockedProfilesViewState.isLoading;
        }
        if ((i & 2) != 0) {
            z2 = blockedProfilesViewState.showUnblockDialog;
        }
        if ((i & 4) != 0) {
            socialBlockedUser = blockedProfilesViewState.unblockDialogUser;
        }
        if ((i & 8) != 0) {
            uiEvent = blockedProfilesViewState.errorEvent;
        }
        if ((i & 16) != 0) {
            list = blockedProfilesViewState.users;
        }
        if ((i & 32) != 0) {
            list2 = blockedProfilesViewState.blockingResponses;
        }
        List list3 = list;
        List list4 = list2;
        return blockedProfilesViewState.copy(z, z2, socialBlockedUser, uiEvent, list3, list4);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsLoading() {
        return this.isLoading;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getShowUnblockDialog() {
        return this.showUnblockDialog;
    }

    /* renamed from: component3, reason: from getter */
    public final SocialBlockedUser getUnblockDialogUser() {
        return this.unblockDialogUser;
    }

    public final UiEvent<Throwable> component4() {
        return this.errorEvent;
    }

    public final List<SocialBlockedUser> component5() {
        return this.users;
    }

    public final List<ApiSocialBlockingResponse> component6() {
        return this.blockingResponses;
    }

    public final BlockedProfilesViewState copy(boolean isLoading, boolean showUnblockDialog, SocialBlockedUser unblockDialogUser, UiEvent<Throwable> errorEvent, List<SocialBlockedUser> users, List<ApiSocialBlockingResponse> blockingResponses) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(blockingResponses, "blockingResponses");
        return new BlockedProfilesViewState(isLoading, showUnblockDialog, unblockDialogUser, errorEvent, users, blockingResponses);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BlockedProfilesViewState)) {
            return false;
        }
        BlockedProfilesViewState blockedProfilesViewState = (BlockedProfilesViewState) other;
        return this.isLoading == blockedProfilesViewState.isLoading && this.showUnblockDialog == blockedProfilesViewState.showUnblockDialog && Intrinsics.areEqual(this.unblockDialogUser, blockedProfilesViewState.unblockDialogUser) && Intrinsics.areEqual(this.errorEvent, blockedProfilesViewState.errorEvent) && Intrinsics.areEqual(this.users, blockedProfilesViewState.users) && Intrinsics.areEqual(this.blockingResponses, blockedProfilesViewState.blockingResponses);
    }

    public int hashCode() {
        int iHashCode = ((Boolean.hashCode(this.isLoading) * 31) + Boolean.hashCode(this.showUnblockDialog)) * 31;
        SocialBlockedUser socialBlockedUser = this.unblockDialogUser;
        int iHashCode2 = (iHashCode + (socialBlockedUser == null ? 0 : socialBlockedUser.hashCode())) * 31;
        UiEvent<Throwable> uiEvent = this.errorEvent;
        return ((((iHashCode2 + (uiEvent != null ? uiEvent.hashCode() : 0)) * 31) + this.users.hashCode()) * 31) + this.blockingResponses.hashCode();
    }

    public String toString() {
        return "BlockedProfilesViewState(isLoading=" + this.isLoading + ", showUnblockDialog=" + this.showUnblockDialog + ", unblockDialogUser=" + this.unblockDialogUser + ", errorEvent=" + this.errorEvent + ", users=" + this.users + ", blockingResponses=" + this.blockingResponses + ")";
    }

    public BlockedProfilesViewState(boolean z, boolean z2, SocialBlockedUser socialBlockedUser, UiEvent<Throwable> uiEvent, List<SocialBlockedUser> users, List<ApiSocialBlockingResponse> blockingResponses) {
        Intrinsics.checkNotNullParameter(users, "users");
        Intrinsics.checkNotNullParameter(blockingResponses, "blockingResponses");
        this.isLoading = z;
        this.showUnblockDialog = z2;
        this.unblockDialogUser = socialBlockedUser;
        this.errorEvent = uiEvent;
        this.users = users;
        this.blockingResponses = blockingResponses;
    }

    public final boolean isLoading() {
        return this.isLoading;
    }

    public final boolean getShowUnblockDialog() {
        return this.showUnblockDialog;
    }

    public final SocialBlockedUser getUnblockDialogUser() {
        return this.unblockDialogUser;
    }

    public final UiEvent<Throwable> getErrorEvent() {
        return this.errorEvent;
    }

    public /* synthetic */ BlockedProfilesViewState(boolean z, boolean z2, SocialBlockedUser socialBlockedUser, UiEvent uiEvent, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? false : z2, (i & 4) != 0 ? null : socialBlockedUser, (i & 8) != 0 ? null : uiEvent, (i & 16) != 0 ? CollectionsKt.emptyList() : list, (i & 32) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<SocialBlockedUser> getUsers() {
        return this.users;
    }

    public final List<ApiSocialBlockingResponse> getBlockingResponses() {
        return this.blockingResponses;
    }

    public final List<SocialBlockedUser> getBlockedUsers() {
        List<SocialBlockedUser> list = this.users;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!getInactiveRelationships().contains(((SocialBlockedUser) obj).getRelationshipId())) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final Set<UUID> getInactiveRelationships() {
        List<ApiSocialBlockingResponse> list = this.blockingResponses;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((ApiSocialBlockingResponse) obj).getState() == ApiSocialBlockedUser.State.INACTIVE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((ApiSocialBlockingResponse) it.next()).getRelationship_id());
        }
        return CollectionsKt.toSet(arrayList2);
    }
}
