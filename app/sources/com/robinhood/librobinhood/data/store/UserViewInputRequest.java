package com.robinhood.librobinhood.data.store;

import com.robinhood.android.car.result.CarResultComposable2;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: PathfinderStore.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/UserViewInputRequest;", "", "inquiryId", "Ljava/util/UUID;", CarResultComposable2.BODY, "Lcom/robinhood/models/api/pathfinder/UserViewInputRequest;", "<init>", "(Ljava/util/UUID;Lcom/robinhood/models/api/pathfinder/UserViewInputRequest;)V", "getInquiryId", "()Ljava/util/UUID;", "getBody", "()Lcom/robinhood/models/api/pathfinder/UserViewInputRequest;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "lib-store-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
final /* data */ class UserViewInputRequest {
    private final com.robinhood.models.api.pathfinder.UserViewInputRequest body;
    private final UUID inquiryId;

    public static /* synthetic */ UserViewInputRequest copy$default(UserViewInputRequest userViewInputRequest, UUID uuid, com.robinhood.models.api.pathfinder.UserViewInputRequest userViewInputRequest2, int i, Object obj) {
        if ((i & 1) != 0) {
            uuid = userViewInputRequest.inquiryId;
        }
        if ((i & 2) != 0) {
            userViewInputRequest2 = userViewInputRequest.body;
        }
        return userViewInputRequest.copy(uuid, userViewInputRequest2);
    }

    /* renamed from: component1, reason: from getter */
    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    /* renamed from: component2, reason: from getter */
    public final com.robinhood.models.api.pathfinder.UserViewInputRequest getBody() {
        return this.body;
    }

    public final UserViewInputRequest copy(UUID inquiryId, com.robinhood.models.api.pathfinder.UserViewInputRequest body) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(body, "body");
        return new UserViewInputRequest(inquiryId, body);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserViewInputRequest)) {
            return false;
        }
        UserViewInputRequest userViewInputRequest = (UserViewInputRequest) other;
        return Intrinsics.areEqual(this.inquiryId, userViewInputRequest.inquiryId) && Intrinsics.areEqual(this.body, userViewInputRequest.body);
    }

    public int hashCode() {
        return (this.inquiryId.hashCode() * 31) + this.body.hashCode();
    }

    public String toString() {
        return "UserViewInputRequest(inquiryId=" + this.inquiryId + ", body=" + this.body + ")";
    }

    public UserViewInputRequest(UUID inquiryId, com.robinhood.models.api.pathfinder.UserViewInputRequest body) {
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(body, "body");
        this.inquiryId = inquiryId;
        this.body = body;
    }

    public final UUID getInquiryId() {
        return this.inquiryId;
    }

    public final com.robinhood.models.api.pathfinder.UserViewInputRequest getBody() {
        return this.body;
    }
}
