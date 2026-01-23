package com.robinhood.android.lib.pathfinder;

import com.robinhood.analytics.SharedEventLogger;
import com.robinhood.android.lib.pathfinder.PathfinderDataState;
import com.robinhood.android.lib.pathfinder.PathfinderErrorState;
import com.robinhood.android.lib.pathfinder.PathfinderStateRegistry;
import com.robinhood.android.lib.pathfinder.PathfinderViewState;
import com.robinhood.android.lib.pathfinder.PathfinderWebViewState;
import com.robinhood.android.lib.webview.WebError;
import com.robinhood.android.lib.webview.view.WebErrorView;
import com.robinhood.android.navigation.keys.FragmentKey;
import com.robinhood.android.udf.StateProvider;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.rosetta.eventlogging.PathfinderFallbackToWebViewEventData;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Either;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: PathfinderStateProvider.kt */
@Metadata(m3635d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0002H\u0016J \u0010\f\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0002J \u0010\u0013\u001a\u00020\u0014*\u00020\r2\u0006\u0010\u000f\u001a\u00020\u00102\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u000eH\u0002J\u001f\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\r2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0002\u0010\u001aJ\f\u0010\u001b\u001a\u00020\u001c*\u00020\u001dH\u0002J\f\u0010\u001e\u001a\u00020\u001f*\u00020 H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006!"}, m3636d2 = {"Lcom/robinhood/android/lib/pathfinder/PathfinderStateProvider;", "Lcom/robinhood/android/udf/StateProvider;", "Lcom/robinhood/android/lib/pathfinder/PathfinderDataState;", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState;", "pathfinderStateRegistry", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;", "eventLogger", "Lcom/robinhood/analytics/SharedEventLogger;", "<init>", "(Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry;Lcom/robinhood/analytics/SharedEventLogger;)V", "reduce", "dataState", "toContent", "Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;", "Lcom/robinhood/models/ui/pathfinder/UserViewState$Page;", "inquiryId", "Ljava/util/UUID;", "webViewState", "Lcom/robinhood/android/lib/pathfinder/PathfinderWebViewState;", "log", "", "userView", "getRenderedPageSequence", "", "content", "latestPageSequence", "(Lcom/robinhood/android/lib/pathfinder/PathfinderViewState$Content;Ljava/lang/Integer;)I", "pageName", "", "Lcom/robinhood/models/ui/pathfinder/contexts/UserViewStatePageContext;", "toEventReason", "Lcom/robinhood/rosetta/eventlogging/PathfinderFallbackToWebViewEventData$Reason;", "Lcom/robinhood/android/lib/pathfinder/PathfinderStateRegistry$UnrenderableReason;", "lib-pathfinder_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class PathfinderStateProvider implements StateProvider<PathfinderDataState, PathfinderViewState> {
    public static final int $stable = 8;
    private final SharedEventLogger eventLogger;
    private final PathfinderStateRegistry pathfinderStateRegistry;

    /* compiled from: PathfinderStateProvider.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[PathfinderStateRegistry.UnrenderableReason.values().length];
            try {
                iArr[PathfinderStateRegistry.UnrenderableReason.DOES_NOT_EXIST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PathfinderStateRegistry.UnrenderableReason.INCOMPATIBLE_VERSION.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public PathfinderStateProvider(PathfinderStateRegistry pathfinderStateRegistry, SharedEventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(pathfinderStateRegistry, "pathfinderStateRegistry");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.pathfinderStateRegistry = pathfinderStateRegistry;
        this.eventLogger = eventLogger;
    }

    @Override // com.robinhood.android.udf.StateProvider
    public PathfinderViewState reduce(PathfinderDataState dataState) {
        PathfinderViewState.Content content;
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        boolean zAreEqual = Intrinsics.areEqual(dataState.getInquiryState(), PathfinderDataState.InquiryState.Updating.INSTANCE);
        UserViewState.Page<?> page = dataState.getPage();
        if (page == null || (content = toContent(page, dataState.getInquiryId(), dataState.getWebViewState())) == null) {
            content = PathfinderViewState.Content.None.INSTANCE;
        }
        PathfinderViewState.Content content2 = content;
        UserViewState.Page<?> page2 = dataState.getPage();
        Integer numValueOf = page2 != null ? Integer.valueOf(page2.getSequence()) : null;
        int renderedPageSequence = getRenderedPageSequence(content2, numValueOf);
        PathfinderDataState.InquiryState inquiryState = dataState.getInquiryState();
        PathfinderDataState.InquiryState.Error error = inquiryState instanceof PathfinderDataState.InquiryState.Error ? (PathfinderDataState.InquiryState.Error) inquiryState : null;
        return new PathfinderViewState(content2, error != null ? new UiEvent(error.getException()) : null, zAreEqual, numValueOf, renderedPageSequence);
    }

    private final PathfinderViewState.Content toContent(UserViewState.Page<?> page, UUID uuid, PathfinderWebViewState pathfinderWebViewState) {
        PathfinderViewState.Content web;
        PathfinderViewState.Content webError;
        Either<FragmentKey, PathfinderStateRegistry.UnrenderableReason> eitherFragmentKeyForUserView = this.pathfinderStateRegistry.fragmentKeyForUserView(uuid, page);
        if (eitherFragmentKeyForUserView instanceof Either.Right) {
            if ((pathfinderWebViewState instanceof PathfinderWebViewState.Initializing) || Intrinsics.areEqual(pathfinderWebViewState, PathfinderWebViewState.Uninitialized.INSTANCE)) {
                webError = PathfinderViewState.Content.WebLoading.INSTANCE;
            } else if (pathfinderWebViewState instanceof PathfinderWebViewState.Error) {
                PathfinderWebViewState.Error error = (PathfinderWebViewState.Error) pathfinderWebViewState;
                webError = new PathfinderViewState.Content.WebError(new PathfinderErrorState.WebErrorState(error.getError(), error.getErrorViewType()));
            } else if (Intrinsics.areEqual(pathfinderWebViewState, PathfinderWebViewState.Timeout.INSTANCE)) {
                webError = new PathfinderViewState.Content.WebError(new PathfinderErrorState.WebErrorState(WebError.Timeout.INSTANCE, WebErrorView.ErrorViewType.ROUTE_TO_EMAIL));
            } else {
                if (!Intrinsics.areEqual(pathfinderWebViewState, PathfinderWebViewState.Loaded.INSTANCE)) {
                    throw new NoWhenBranchMatchedException();
                }
                web = new PathfinderViewState.Content.Page.Web(uuid, page.getRawJson(), (PathfinderStateRegistry.UnrenderableReason) ((Either.Right) eitherFragmentKeyForUserView).getValue());
            }
            log(webError, uuid, page);
            return webError;
        }
        if (!(eitherFragmentKeyForUserView instanceof Either.Left)) {
            throw new NoWhenBranchMatchedException();
        }
        web = new PathfinderViewState.Content.Page.Native((FragmentKey) ((Either.Left) eitherFragmentKeyForUserView).getValue());
        webError = web;
        log(webError, uuid, page);
        return webError;
    }

    private final void log(PathfinderViewState.Content content, UUID uuid, UserViewState.Page<?> page) {
        if (content instanceof PathfinderViewState.Content.Page.Web) {
            SharedEventLogger sharedEventLogger = this.eventLogger;
            String strPageName = pageName(page.getTypeContext());
            PathfinderFallbackToWebViewEventData.Reason eventReason = toEventReason(((PathfinderViewState.Content.Page.Web) content).getUnrenderableReason());
            String string2 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            sharedEventLogger.logPathfinderFallbackToWebViewEvent(strPageName, eventReason, string2, page.getSequence());
            return;
        }
        if (content instanceof PathfinderViewState.Content.Page.Native) {
            SharedEventLogger sharedEventLogger2 = this.eventLogger;
            String strPageName2 = pageName(page.getTypeContext());
            PathfinderFallbackToWebViewEventData.Reason reason = PathfinderFallbackToWebViewEventData.Reason.DID_NOT_FALLBACK;
            String string3 = uuid.toString();
            Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
            sharedEventLogger2.logPathfinderFallbackToWebViewEvent(strPageName2, reason, string3, page.getSequence());
        }
    }

    private final int getRenderedPageSequence(PathfinderViewState.Content content, Integer latestPageSequence) {
        if (latestPageSequence == null || Intrinsics.areEqual(content, PathfinderViewState.Content.None.INSTANCE) || (content instanceof PathfinderViewState.Content.WebError) || Intrinsics.areEqual(content, PathfinderViewState.Content.WebLoading.INSTANCE)) {
            return -1;
        }
        if (!(content instanceof PathfinderViewState.Content.Page.Native) && !(content instanceof PathfinderViewState.Content.Page.Web)) {
            throw new NoWhenBranchMatchedException();
        }
        return latestPageSequence.intValue();
    }

    private final String pageName(UserViewStatePageContext userViewStatePageContext) {
        return userViewStatePageContext instanceof UserViewStatePageContext.Unknown ? ((UserViewStatePageContext.Unknown) userViewStatePageContext).getPageName() : userViewStatePageContext.getPage().getServerValue();
    }

    private final PathfinderFallbackToWebViewEventData.Reason toEventReason(PathfinderStateRegistry.UnrenderableReason unrenderableReason) {
        int i = WhenMappings.$EnumSwitchMapping$0[unrenderableReason.ordinal()];
        if (i == 1) {
            return PathfinderFallbackToWebViewEventData.Reason.PAGE_DOES_NOT_EXIST;
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return PathfinderFallbackToWebViewEventData.Reason.INCOMPATIBLE_CLIENT_VERSION;
    }
}
