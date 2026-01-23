package com.robinhood.android.odyssey.lib;

import com.robinhood.android.odyssey.lib.bottomsheet.SdBaseBottomSheet;
import com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.models.api.serverdrivenui.bottomsheet.ApiSdBaseBottomSheet;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SdLoggingUtil.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u0003H\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0001\"\b\b\u0000\u0010\u0006*\u00020\u0003*\b\u0012\u0004\u0012\u0002H\u00060\u0007H\u0000\u001a\u0014\u0010\b\u001a\u00020\u0001*\u00020\u00032\u0006\u0010\t\u001a\u00020\u0001H\u0000\u001a\f\u0010\n\u001a\u00020\u0001*\u00020\u000bH\u0000\u001a\u000e\u0010\n\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\u0001\u001a\b\u0010\r\u001a\u00020\u0001H\u0000\u001a\f\u0010\u0002\u001a\u00020\u0001*\u00020\u000eH\u0000\u001a\f\u0010\u0004\u001a\u00020\u0001*\u00020\u000eH\u0000\u001a\u001c\u0010\u0005\u001a\u00020\u0001\"\b\b\u0000\u0010\u0006*\u00020\u000e*\b\u0012\u0004\u0012\u0002H\u00060\u000fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0019\u0010\u0010\u001a\u00060\u0011j\u0002`\u0012*\u00020\u00138F¢\u0006\u0006\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m3636d2 = {"ODYSSEY_TAG", "", "getScreenName", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "getScreenDescription", "getScreenTag", "T", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment;", "getButtonTitle", "componentId", "getUserAction", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "odysseyFlowId", "getErrorTag", "Lcom/robinhood/models/api/serverdrivenui/bottomsheet/ApiSdBaseBottomSheet;", "Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet;", "eventAction", "Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "Lcom/robinhood/rosetta/eventlogging/EventAction;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction;", "getEventAction", "(Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction;)Lcom/robinhood/rosetta/eventlogging/UserInteractionEventData$Action;", "feature-lib-odyssey_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.odyssey.lib.SdLoggingUtilKt, reason: use source file name */
/* loaded from: classes10.dex */
public final class SdLoggingUtil {
    private static final String ODYSSEY_TAG = "odyssey";

    public static final String getScreenName(ApiSdPage apiSdPage) {
        Intrinsics.checkNotNullParameter(apiSdPage, "<this>");
        return "odyssey." + apiSdPage.getPage_key();
    }

    public static final String getScreenDescription(ApiSdPage apiSdPage) {
        Intrinsics.checkNotNullParameter(apiSdPage, "<this>");
        return "odyssey." + apiSdPage.getTemplateId();
    }

    public static final <T extends ApiSdPage> String getScreenTag(BaseSdTemplateFragment<T> baseSdTemplateFragment) {
        Intrinsics.checkNotNullParameter(baseSdTemplateFragment, "<this>");
        return "odyssey." + baseSdTemplateFragment.getCallbacks().getOdysseyFlowId();
    }

    public static final String getButtonTitle(ApiSdPage apiSdPage, String componentId) {
        Intrinsics.checkNotNullParameter(apiSdPage, "<this>");
        Intrinsics.checkNotNullParameter(componentId, "componentId");
        return "odyssey." + apiSdPage.getPage_key() + "." + componentId;
    }

    public static final String getUserAction(ApiSdResponse apiSdResponse) {
        Intrinsics.checkNotNullParameter(apiSdResponse, "<this>");
        return "odyssey." + apiSdResponse.getOdyssey_flow_id();
    }

    public static final String getUserAction(String odysseyFlowId) {
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
        return "odyssey." + odysseyFlowId;
    }

    public static final String getErrorTag() {
        return ODYSSEY_TAG;
    }

    public static final String getScreenName(ApiSdBaseBottomSheet apiSdBaseBottomSheet) {
        Intrinsics.checkNotNullParameter(apiSdBaseBottomSheet, "<this>");
        return "odyssey." + apiSdBaseBottomSheet.getId();
    }

    public static final String getScreenDescription(ApiSdBaseBottomSheet apiSdBaseBottomSheet) {
        Intrinsics.checkNotNullParameter(apiSdBaseBottomSheet, "<this>");
        return "odyssey." + apiSdBaseBottomSheet.getTemplate_id();
    }

    public static final <T extends ApiSdBaseBottomSheet> String getScreenTag(SdBaseBottomSheet<T> sdBaseBottomSheet) {
        Intrinsics.checkNotNullParameter(sdBaseBottomSheet, "<this>");
        return "odyssey." + sdBaseBottomSheet.getCallbacks().getOdysseyFlowId();
    }

    public static final UserInteractionEventData.Action getEventAction(ApiSdAction apiSdAction) {
        Intrinsics.checkNotNullParameter(apiSdAction, "<this>");
        if (apiSdAction instanceof ApiSdAction.Back) {
            return UserInteractionEventData.Action.BACK;
        }
        if (apiSdAction instanceof ApiSdAction.Continue) {
            return UserInteractionEventData.Action.CONTINUE;
        }
        if (apiSdAction instanceof ApiSdAction.Deeplink) {
            return UserInteractionEventData.Action.VIEW_DEEPLINK;
        }
        if (!(apiSdAction instanceof ApiSdAction.Dismiss) && !(apiSdAction instanceof ApiSdAction.DismissBottomSheet)) {
            if (apiSdAction instanceof ApiSdAction.Download) {
                return UserInteractionEventData.Action.DOWNLOAD;
            }
            if (apiSdAction instanceof ApiSdAction.GoBack) {
                return UserInteractionEventData.Action.BACK;
            }
            if (!(apiSdAction instanceof ApiSdAction.ComponentDataChange) && !(apiSdAction instanceof ApiSdAction.DeferredPost) && !(apiSdAction instanceof ApiSdAction.Post) && !(apiSdAction instanceof ApiSdAction.PresentBottomSheet) && !(apiSdAction instanceof ApiSdAction.Update)) {
                throw new NoWhenBranchMatchedException();
            }
            return UserInteractionEventData.Action.ACTION_UNSPECIFIED;
        }
        return UserInteractionEventData.Action.DISMISS;
    }
}
