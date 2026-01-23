package com.robinhood.android.lib.pathfinder.extensions;

import com.robinhood.android.lib.pathfinder.PathfinderStateRegistry;
import com.robinhood.models.api.pathfinder.userview.ApiUserViewStateResultContext2;
import com.robinhood.models.api.pathfinder.userview.UserViewPageType;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.utils.Either;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserViewStates.kt */
@Metadata(m3635d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\"\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0002\u001a \u0010\b\u001a\u00020\u0001*\u0006\u0012\u0002\b\u00030\t2\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¨\u0006\n"}, m3636d2 = {"isTheSameAs", "", "Lcom/robinhood/models/ui/pathfinder/UserViewState;", "inquiryId", "Ljava/util/UUID;", "pathfinderStateRegistry", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "other", "isRenderable", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "lib-pathfinder_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.lib.pathfinder.extensions.UserViewStatesKt, reason: use source file name */
/* loaded from: classes8.dex */
public final class UserViewStates {
    public static final boolean isTheSameAs(UserViewState userViewState, UUID inquiryId, PathfinderStateRegistry pathfinderStateRegistry, UserViewState other) {
        Intrinsics.checkNotNullParameter(userViewState, "<this>");
        Intrinsics.checkNotNullParameter(inquiryId, "inquiryId");
        Intrinsics.checkNotNullParameter(pathfinderStateRegistry, "pathfinderStateRegistry");
        Intrinsics.checkNotNullParameter(other, "other");
        if (userViewState.getSequence() != other.getSequence()) {
            return false;
        }
        if (userViewState instanceof UserViewState.AppLink) {
            return (other instanceof UserViewState.AppLink) && Intrinsics.areEqual(((UserViewState.AppLink) userViewState).getTypeContext(), ((UserViewState.AppLink) other).getTypeContext());
        }
        if (userViewState instanceof UserViewState.Inquiry) {
            return (other instanceof UserViewState.Inquiry) && Intrinsics.areEqual(((UserViewState.Inquiry) userViewState).getTypeContext(), ((UserViewState.Inquiry) other).getTypeContext());
        }
        if (userViewState instanceof UserViewState.Page) {
            if (other instanceof UserViewState.Page) {
                UserViewState.Page page = (UserViewState.Page) userViewState;
                UserViewState.Page page2 = (UserViewState.Page) other;
                if (page.getTypeContext().getPage() == page2.getTypeContext().getPage() && isRenderable(page, inquiryId, pathfinderStateRegistry) && page.getSequence() == page2.getSequence()) {
                    return true;
                }
            }
            return false;
        }
        if (!(userViewState instanceof UserViewState.Result)) {
            if (userViewState instanceof UserViewState.Unknown) {
                return Intrinsics.areEqual(other.getRawJson(), ((UserViewState.Unknown) userViewState).getRawJson());
            }
            throw new NoWhenBranchMatchedException();
        }
        if (other instanceof UserViewState.Result) {
            UserViewState.Result result = (UserViewState.Result) userViewState;
            UserViewState.Result result2 = (UserViewState.Result) other;
            if (result.getTypeContext().getResultType() == result2.getTypeContext().getResultType() && result.getTypeContext().getResultType() != ApiUserViewStateResultContext2.UNKNOWN && result.getSequence() == result2.getSequence()) {
                return true;
            }
        }
        return false;
    }

    private static final boolean isRenderable(UserViewState.Page<?> page, UUID uuid, PathfinderStateRegistry pathfinderStateRegistry) {
        if (page.getTypeContext().getPage() == UserViewPageType.UNKNOWN) {
            return false;
        }
        return pathfinderStateRegistry.fragmentKeyForUserView(uuid, page) instanceof Either.Left;
    }
}
