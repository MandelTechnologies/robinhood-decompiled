package com.robinhood.android.iav.p154ui;

import androidx.fragment.app.FragmentActivity;
import com.plaid.link.result.LinkError;
import com.plaid.link.result.LinkErrorCode;
import com.plaid.link.result.LinkExit;
import com.robinhood.android.common.p088ui.BaseFragment;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: Extensions.kt */
@Metadata(m3635d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0004\u001a\u00020\u0005*\u00020\u0006H\u0000\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0000\u0010\u0003¨\u0006\u0007"}, m3636d2 = {"isInvalidLinkTokenError", "", "Lcom/plaid/link/result/LinkExit;", "(Lcom/plaid/link/result/LinkExit;)Z", "getSessionId", "Ljava/util/UUID;", "Lcom/robinhood/android/common/ui/BaseFragment;", "feature-iav_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class ExtensionsKt {
    public static final boolean isInvalidLinkTokenError(LinkExit linkExit) {
        Intrinsics.checkNotNullParameter(linkExit, "<this>");
        LinkError error = linkExit.getError();
        LinkErrorCode errorCode = error != null ? error.getErrorCode() : null;
        LinkErrorCode.UNKNOWN unknown = errorCode instanceof LinkErrorCode.UNKNOWN ? (LinkErrorCode.UNKNOWN) errorCode : null;
        return Intrinsics.areEqual(unknown != null ? unknown.getName() : null, "INVALID_LINK_TOKEN");
    }

    public static final UUID getSessionId(BaseFragment baseFragment) {
        Intrinsics.checkNotNullParameter(baseFragment, "<this>");
        FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
        Intrinsics.checkNotNull(fragmentActivityRequireActivity, "null cannot be cast to non-null type com.robinhood.android.iav.ui.CreateIavRelationshipActivity");
        return ((CreateIavRelationshipActivity) fragmentActivityRequireActivity).getSessionId$feature_iav_externalDebug();
    }
}
