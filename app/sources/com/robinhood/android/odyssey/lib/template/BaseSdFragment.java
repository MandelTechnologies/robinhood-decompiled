package com.robinhood.android.odyssey.lib.template;

import android.content.Context;
import android.net.Uri;
import android.view.KeyEvent;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.snapshots.SnapshotStateMap;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.odyssey.lib.bottomsheet.SdBaseBottomSheet;
import com.robinhood.android.odyssey.lib.dialog.SdDialogFragment;
import com.robinhood.android.odyssey.lib.view.SdAlert;
import com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView;
import com.robinhood.android.odyssey.lib.view.SdBaseInputRow;
import com.robinhood.android.odyssey.lib.view.SdBaseView;
import com.robinhood.models.api.serverdrivenui.bottomsheet.ApiSdBaseBottomSheet;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdBaseIndividualComponentData;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdComponentDataChange;
import com.robinhood.models.api.serverdrivenui.component.ApiSdEntityComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.utils.extensions.Activity;
import io.noties.markwon.Markwon;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;

/* compiled from: BaseSdFragment.kt */
@Metadata(m3635d1 = {"\u0000þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005B\u0011\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010,\u001a\u00020-2\b\u0010.\u001a\u0004\u0018\u00010/2\u0006\u00100\u001a\u000201H\u0016J\u0010\u00102\u001a\u00020-2\u0006\u00103\u001a\u000204H\u0016J\u0010\u00105\u001a\u00020-2\u0006\u00106\u001a\u00020\u001eH\u0016J\u0010\u00107\u001a\u0002082\u0006\u00106\u001a\u00020\u001eH\u0016J\u0010\u00109\u001a\u00020-2\u0006\u00106\u001a\u00020\u001eH\u0016J\u0010\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020\u0007H\u0002J\u0010\u0010<\u001a\u00020-2\u0006\u0010;\u001a\u00020\u0007H\u0016J*\u0010=\u001a\u00020-2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020@0CH$J*\u0010D\u001a\u00020-2\u0012\u0010>\u001a\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?2\f\u0010B\u001a\b\u0012\u0004\u0012\u00020@0CH$J\b\u0010E\u001a\u00020-H$J\u0012\u0010J\u001a\u0004\u0018\u00010A2\u0006\u0010.\u001a\u00020/H$J\u0010\u0010T\u001a\u00020-2\u0006\u0010U\u001a\u00020VH$J6\u0010W\u001a\"\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020@\u0012\u0004\u0012\u00020A0?\u0012\n\u0012\b\u0012\u0004\u0012\u00020@0C\u0018\u00010X2\f\u0010Y\u001a\b\u0012\u0004\u0012\u00020[0ZH\u0014J\"\u0010\\\u001a\u0014\u0012\u0004\u0012\u00020^\u0012\u0004\u0012\u00020M\u0012\u0002\b\u0003\u0018\u00010]2\u0006\u0010_\u001a\u00020/H\u0004J\u0016\u0010`\u001a\u00020-2\f\u0010a\u001a\b\u0012\u0004\u0012\u00020V0ZH\u0004J\b\u0010b\u001a\u00020-H\u0014J\u0010\u0010c\u001a\u00020-2\u0006\u00100\u001a\u00020dH&J\u0010\u0010e\u001a\u00020-2\u0006\u00100\u001a\u00020fH&J\u0010\u0010g\u001a\u00020-2\u0006\u0010h\u001a\u00020iH&J\u0010\u0010j\u001a\u00020-2\u0006\u0010k\u001a\u00020lH\u0002J\u0010\u0010m\u001a\u00020-2\u0006\u0010n\u001a\u00020oH\u0002J\u0010\u0010p\u001a\u00020-2\u0006\u0010q\u001a\u00020rH\u0002J\u0010\u0010s\u001a\u00020-2\u0006\u0010t\u001a\u00020uH\u0002J\u0010\u0010v\u001a\u00020-2\u0006\u00100\u001a\u00020wH\u0002J\b\u0010x\u001a\u00020-H\u0002J\b\u0010y\u001a\u00020-H\u0002J\b\u0010z\u001a\u00020-H\u0002R\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bRc\u0010 \u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001dj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e`\u001f2\"\u0010\u001c\u001a\u001e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e0\u001dj\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e`\u001f8D@DX\u0084\u008e\u0002¢\u0006\u0012\n\u0004\b%\u0010&\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u0014\u0010'\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b+\u0010)R\u001d\u0010F\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020A0G¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u001d\u0010K\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020M0L¢\u0006\b\n\u0000\u001a\u0004\bN\u0010OR\u0017\u0010P\u001a\b\u0012\u0004\u0012\u00020/0Q¢\u0006\b\n\u0000\u001a\u0004\bR\u0010S¨\u0006{"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/template/BaseSdFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdAlert$Callbacks;", "Lcom/robinhood/android/odyssey/lib/view/SdBaseFlexibleComponentView$Callbacks;", "Lcom/robinhood/android/odyssey/lib/dialog/SdDialogFragment$OnCancelListener;", "layoutRes", "", "<init>", "(I)V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "getEventLogger", "()Lcom/robinhood/analytics/EventLogger;", "setEventLogger", "(Lcom/robinhood/analytics/EventLogger;)V", "<set-?>", "Ljava/util/HashMap;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "Lkotlin/collections/HashMap;", "recentPopups", "getRecentPopups", "()Ljava/util/HashMap;", "setRecentPopups", "(Ljava/util/HashMap;)V", "recentPopups$delegate", "Lkotlin/properties/ReadWriteProperty;", "screenWidth", "getScreenWidth", "()I", "screenHeight", "getScreenHeight", "onComponentAction", "", "componentId", "", "action", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction;", "handleDeepLink", "url", "Landroid/net/Uri;", "showPopup", "popup", "isPopupShowing", "", "dismissPopup", "handleSdAlertDialogDismissed", "id", "onDialogCancelled", "validateValuesAndHandlePostRequest", "newEntities", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "toBeValidatedWithEndpoint", "", "validateValuesAndHandleDeferredPostRequest", "handleUpdatePostRequest", "alternateComponentOnSubmitValueMap", "", "getAlternateComponentOnSubmitValueMap", "()Ljava/util/Map;", "alternateComponentOnSubmitValue", "composeComponentDataChangeMap", "Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdBaseIndividualComponentData;", "getComposeComponentDataChangeMap", "()Landroidx/compose/runtime/snapshots/SnapshotStateMap;", "composeComponentIds", "", "getComposeComponentIds", "()Ljava/util/Set;", "onComponentDataChangeTargetComponentNotFound", "change", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponentDataChange;", "getAndValidateChildEntityValues", "Lkotlin/Pair;", "payload", "", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdEntityComponent;", "findComponentByTag", "Lcom/robinhood/android/odyssey/lib/view/SdBaseView;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdComponent;", "componentTag", "handleComponentDataChanges", "changes", "handleNext", "handleGoBackAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$GoBack;", "handleDownloadAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Download;", "handleDismissAction", "dismissAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Dismiss;", "handlePost", "postAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Post;", "handleDeferredPost", "deferredPostAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$DeferredPost;", "handleDeepLinkAction", "deeplinkAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Deeplink;", "handleComponentDataChangeAction", "componentDataChangeAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$ComponentDataChange;", "handlePresentBottomSheetAction", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$PresentBottomSheet;", "handleDismissBottomSheetAction", "closePresentingBottomSheets", "handleUpdateAction", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class BaseSdFragment extends BaseFragment implements SdBaseView.Callbacks, SdAlert.Callbacks, SdBaseFlexibleComponentView.Callbacks, SdDialogFragment.OnCancelListener {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(BaseSdFragment.class, "recentPopups", "getRecentPopups()Ljava/util/HashMap;", 0))};
    public static final int $stable = 8;
    private final Map<String, ApiSdTypedValue> alternateComponentOnSubmitValueMap;
    public AnalyticsLogger analytics;
    private final SnapshotStateMap<String, ApiSdBaseIndividualComponentData> composeComponentDataChangeMap;
    private final Set<String> composeComponentIds;
    public EventLogger eventLogger;
    public Markwon markwon;

    /* renamed from: recentPopups$delegate, reason: from kotlin metadata */
    private final Interfaces3 recentPopups;

    protected abstract ApiSdTypedValue alternateComponentOnSubmitValue(String componentId);

    public abstract void handleDismissAction(ApiSdAction.Dismiss dismissAction);

    public abstract void handleDownloadAction(ApiSdAction.Download action);

    public abstract void handleGoBackAction(ApiSdAction.GoBack action);

    protected abstract void handleUpdatePostRequest();

    protected abstract void onComponentDataChangeTargetComponentNotFound(ApiSdComponentDataChange change);

    protected abstract void validateValuesAndHandleDeferredPostRequest(Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities, Set<SdBackendMetadata> toBeValidatedWithEndpoint);

    protected abstract void validateValuesAndHandlePostRequest(Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities, Set<SdBackendMetadata> toBeValidatedWithEndpoint);

    public BaseSdFragment(int i) {
        super(i);
        this.recentPopups = (Interfaces3) BindSavedState2.savedSerializable(this, new HashMap()).provideDelegate(this, $$delegatedProperties[0]);
        this.alternateComponentOnSubmitValueMap = new LinkedHashMap();
        this.composeComponentDataChangeMap = SnapshotStateKt.mutableStateMapOf();
        this.composeComponentIds = new LinkedHashSet();
    }

    public final AnalyticsLogger getAnalytics() {
        AnalyticsLogger analyticsLogger = this.analytics;
        if (analyticsLogger != null) {
            return analyticsLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("analytics");
        return null;
    }

    public final void setAnalytics(AnalyticsLogger analyticsLogger) {
        Intrinsics.checkNotNullParameter(analyticsLogger, "<set-?>");
        this.analytics = analyticsLogger;
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final EventLogger getEventLogger() {
        EventLogger eventLogger = this.eventLogger;
        if (eventLogger != null) {
            return eventLogger;
        }
        Intrinsics.throwUninitializedPropertyAccessException("eventLogger");
        return null;
    }

    public final void setEventLogger(EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(eventLogger, "<set-?>");
        this.eventLogger = eventLogger;
    }

    protected final HashMap<Integer, ApiSdPopup> getRecentPopups() {
        return (HashMap) this.recentPopups.getValue(this, $$delegatedProperties[0]);
    }

    protected final void setRecentPopups(HashMap<Integer, ApiSdPopup> map) {
        Intrinsics.checkNotNullParameter(map, "<set-?>");
        this.recentPopups.setValue(this, $$delegatedProperties[0], map);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView.Callbacks
    public int getScreenWidth() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return Activity.getDisplayMetrics(fragmentActivityRequireActivity).widthPixels;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseFlexibleComponentView.Callbacks
    public int getScreenHeight() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        return Activity.getDisplayMetrics(fragmentActivityRequireActivity).heightPixels;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks
    public void onComponentAction(String componentId, ApiSdAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof ApiSdAction.Post) {
            handlePost((ApiSdAction.Post) action);
            return;
        }
        if (action instanceof ApiSdAction.DeferredPost) {
            handleDeferredPost((ApiSdAction.DeferredPost) action);
            return;
        }
        if (action instanceof ApiSdAction.Deeplink) {
            handleDeepLinkAction((ApiSdAction.Deeplink) action);
            return;
        }
        if (action instanceof ApiSdAction.Back) {
            onBackPressed();
            return;
        }
        if (action instanceof ApiSdAction.Continue) {
            handleNext();
            return;
        }
        if (action instanceof ApiSdAction.ComponentDataChange) {
            handleComponentDataChangeAction((ApiSdAction.ComponentDataChange) action);
            return;
        }
        if (action instanceof ApiSdAction.Dismiss) {
            handleDismissAction((ApiSdAction.Dismiss) action);
            return;
        }
        if (action instanceof ApiSdAction.PresentBottomSheet) {
            handlePresentBottomSheetAction((ApiSdAction.PresentBottomSheet) action);
            return;
        }
        if (action instanceof ApiSdAction.DismissBottomSheet) {
            handleDismissBottomSheetAction();
            return;
        }
        if (action instanceof ApiSdAction.GoBack) {
            handleGoBackAction((ApiSdAction.GoBack) action);
        } else if (action instanceof ApiSdAction.Download) {
            handleDownloadAction((ApiSdAction.Download) action);
        } else {
            if (!(action instanceof ApiSdAction.Update)) {
                throw new NoWhenBranchMatchedException();
            }
            handleUpdateAction();
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdBaseView.Callbacks
    public void handleDeepLink(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Navigator navigator = getNavigator();
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, url, Boolean.FALSE, null, false, null, 56, null);
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdAlert.Callbacks
    public void showPopup(ApiSdPopup popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        HashMap<Integer, ApiSdPopup> recentPopups = getRecentPopups();
        String id = popup.getId();
        recentPopups.put(Integer.valueOf(id != null ? id.hashCode() : 0), popup);
        SdDialogFragment.Companion companion = SdDialogFragment.INSTANCE;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        SdDialogFragment.Builder builderCreate = companion.create(contextRequireContext, popup, new C226401(this));
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        RhDialogFragment.Builder.show$default(builderCreate, childFragmentManager, popup.getId(), false, 4, null);
    }

    /* compiled from: BaseSdFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.odyssey.lib.template.BaseSdFragment$showPopup$1 */
    /* synthetic */ class C226401 extends FunctionReferenceImpl implements Function1<Uri, Unit> {
        C226401(Object obj) {
            super(1, obj, BaseSdFragment.class, "handleDeepLink", "handleDeepLink(Landroid/net/Uri;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Uri uri) {
            invoke2(uri);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Uri p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((BaseSdFragment) this.receiver).handleDeepLink(p0);
        }
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdAlert.Callbacks
    public boolean isPopupShowing(ApiSdPopup popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        return getChildFragmentManager().findFragmentByTag(popup.getId()) != null;
    }

    @Override // com.robinhood.android.odyssey.lib.view.SdAlert.Callbacks
    public void dismissPopup(ApiSdPopup popup) {
        Intrinsics.checkNotNullParameter(popup, "popup");
        Fragment fragmentFindFragmentByTag = getChildFragmentManager().findFragmentByTag(popup.getId());
        if (fragmentFindFragmentByTag instanceof SdDialogFragment) {
            ((SdDialogFragment) fragmentFindFragmentByTag).dismiss();
        }
    }

    private final void handleSdAlertDialogDismissed(int id) {
        ApiSdPopup apiSdPopup = getRecentPopups().get(Integer.valueOf(id));
        String id2 = apiSdPopup != null ? apiSdPopup.getId() : null;
        if (id2 != null) {
            SdBaseView<ApiSdComponent, ApiSdBaseIndividualComponentData, ?> sdBaseViewFindComponentByTag = findComponentByTag(id2);
            SdAlert sdAlert = sdBaseViewFindComponentByTag instanceof SdAlert ? (SdAlert) sdBaseViewFindComponentByTag : null;
            if (sdAlert != null) {
                sdAlert.onDialogDismissed();
            }
        }
    }

    @Override // com.robinhood.android.odyssey.lib.dialog.SdDialogFragment.OnCancelListener
    public void onDialogCancelled(int id) {
        ApiSdPopup apiSdPopup = getRecentPopups().get(Integer.valueOf(id));
        handleSdAlertDialogDismissed(id);
        if (apiSdPopup != null) {
            onNegativeButtonClicked(id, null);
        }
    }

    public final Map<String, ApiSdTypedValue> getAlternateComponentOnSubmitValueMap() {
        return this.alternateComponentOnSubmitValueMap;
    }

    public final SnapshotStateMap<String, ApiSdBaseIndividualComponentData> getComposeComponentDataChangeMap() {
        return this.composeComponentDataChangeMap;
    }

    public final Set<String> getComposeComponentIds() {
        return this.composeComponentIds;
    }

    protected Tuples2<Map<SdBackendMetadata, ApiSdTypedValue>, Set<SdBackendMetadata>> getAndValidateChildEntityValues(List<ApiSdEntityComponent> payload) {
        boolean z;
        boolean z2;
        ApiSdTypedValue apiSdTypedValueAlternateComponentOnSubmitValue;
        Intrinsics.checkNotNullParameter(payload, "payload");
        HashMap map = new HashMap();
        HashSet hashSet = new HashSet();
        while (true) {
            for (ApiSdEntityComponent apiSdEntityComponent : payload) {
                ApiSdEntityComponent.ApiSdEntityValue value = apiSdEntityComponent.getValue();
                if (value instanceof ApiSdEntityComponent.ApiSdEntityValue.ValueFromComponent) {
                    ApiSdEntityComponent.ApiSdEntityValue.ValueFromComponent valueFromComponent = (ApiSdEntityComponent.ApiSdEntityValue.ValueFromComponent) value;
                    SdBaseView<ApiSdComponent, ApiSdBaseIndividualComponentData, ?> sdBaseViewFindComponentByTag = findComponentByTag(valueFromComponent.getComponent_id());
                    if (sdBaseViewFindComponentByTag == null || (apiSdTypedValueAlternateComponentOnSubmitValue = sdBaseViewFindComponentByTag.onSubmitValue()) == null) {
                        apiSdTypedValueAlternateComponentOnSubmitValue = alternateComponentOnSubmitValue(valueFromComponent.getComponent_id());
                    }
                    if (apiSdTypedValueAlternateComponentOnSubmitValue == null) {
                        z2 = false;
                        z = !z && z2;
                    } else {
                        map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), apiSdTypedValueAlternateComponentOnSubmitValue);
                        if ((sdBaseViewFindComponentByTag instanceof SdBaseInputRow) && ((SdBaseInputRow) sdBaseViewFindComponentByTag).getValidationEndpointRequired()) {
                            hashSet.add(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent));
                        }
                    }
                } else {
                    if (!(value instanceof ApiSdEntityComponent.ApiSdEntityValue.StaticValue)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    map.put(SdBackendMetadata2.getSdBackendMetaData(apiSdEntityComponent), ((ApiSdEntityComponent.ApiSdEntityValue.StaticValue) value).getTyped_value_object());
                }
                z2 = true;
                if (z) {
                }
            }
            if (z) {
                return Tuples4.m3642to(map, hashSet);
            }
            return null;
        }
    }

    protected final SdBaseView<ApiSdComponent, ApiSdBaseIndividualComponentData, ?> findComponentByTag(String componentTag) {
        Intrinsics.checkNotNullParameter(componentTag, "componentTag");
        KeyEvent.Callback callbackFindViewWithTag = requireView().findViewWithTag(componentTag);
        if (callbackFindViewWithTag instanceof SdBaseView) {
            return (SdBaseView) callbackFindViewWithTag;
        }
        return null;
    }

    protected final void handleComponentDataChanges(List<? extends ApiSdComponentDataChange> changes) {
        Intrinsics.checkNotNullParameter(changes, "changes");
        for (ApiSdComponentDataChange apiSdComponentDataChange : changes) {
            SdBaseView<ApiSdComponent, ApiSdBaseIndividualComponentData, ?> sdBaseViewFindComponentByTag = findComponentByTag(apiSdComponentDataChange.getTarget_component_id());
            if (sdBaseViewFindComponentByTag != null) {
                ApiSdBaseIndividualComponentData data = apiSdComponentDataChange.getData();
                Intrinsics.checkNotNull(data);
                sdBaseViewFindComponentByTag.update(data, SdBaseView.UpdateSource.COMPONENT_DATA_CHANGE);
            } else {
                onComponentDataChangeTargetComponentNotFound(apiSdComponentDataChange);
            }
        }
    }

    protected void handleNext() {
        closePresentingBottomSheets();
    }

    private final void handlePost(ApiSdAction.Post postAction) {
        closePresentingBottomSheets();
        Tuples2<Map<SdBackendMetadata, ApiSdTypedValue>, Set<SdBackendMetadata>> andValidateChildEntityValues = getAndValidateChildEntityValues(postAction.getPayload());
        if (andValidateChildEntityValues != null) {
            validateValuesAndHandlePostRequest(andValidateChildEntityValues.component1(), andValidateChildEntityValues.component2());
        }
    }

    private final void handleDeferredPost(ApiSdAction.DeferredPost deferredPostAction) {
        closePresentingBottomSheets();
        Tuples2<Map<SdBackendMetadata, ApiSdTypedValue>, Set<SdBackendMetadata>> andValidateChildEntityValues = getAndValidateChildEntityValues(deferredPostAction.getPayload());
        if (andValidateChildEntityValues != null) {
            validateValuesAndHandleDeferredPostRequest(andValidateChildEntityValues.component1(), andValidateChildEntityValues.component2());
        }
    }

    private final void handleDeepLinkAction(ApiSdAction.Deeplink deeplinkAction) {
        closePresentingBottomSheets();
        handleDeepLink(deeplinkAction.getPayload().getUrl());
    }

    private final void handleComponentDataChangeAction(ApiSdAction.ComponentDataChange componentDataChangeAction) {
        closePresentingBottomSheets();
        handleComponentDataChanges(componentDataChangeAction.getChanges());
    }

    private final void handlePresentBottomSheetAction(ApiSdAction.PresentBottomSheet action) {
        ApiSdBaseBottomSheet sheet = action.getPayload().getSheet();
        closePresentingBottomSheets();
        SdBaseBottomSheet.Companion companion = SdBaseBottomSheet.INSTANCE;
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        companion.show(childFragmentManager, sheet);
    }

    private final void handleDismissBottomSheetAction() {
        closePresentingBottomSheets();
    }

    private final void closePresentingBottomSheets() {
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        ArrayList arrayList = new ArrayList();
        for (Object obj : fragments) {
            if (obj instanceof SdBaseBottomSheet) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((SdBaseBottomSheet) it.next()).dismiss();
        }
    }

    private final void handleUpdateAction() {
        handleUpdatePostRequest();
    }
}
