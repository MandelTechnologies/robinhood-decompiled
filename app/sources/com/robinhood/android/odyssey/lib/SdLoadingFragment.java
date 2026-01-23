package com.robinhood.android.odyssey.lib;

import android.content.Context;
import android.net.Uri;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.unit.C2002Dp;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.odyssey.lib.SdLoadingFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedMaybe;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.models.api.serverdrivenui.component.ApiSdDeeplinkConfig;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.MaybesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import io.reactivex.Maybe;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016J\u0010\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\r\u0010\u001e\u001a\u00020\u0017H\u0017¢\u0006\u0002\u0010\u001fJ\b\u0010 \u001a\u00020!H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013¨\u0006$"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/SdLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "setExperimentsStore", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;)V", "callbacks", "Lcom/robinhood/android/odyssey/lib/SdLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/odyssey/lib/SdLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onStart", "", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onDialogDismissed", "id", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onBackPressed", "", "Callbacks", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdLoadingFragment extends GenericComposeFragment {
    public AnalyticsLogger analytics;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.odyssey.lib.SdLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof SdLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public ExperimentsStore experimentsStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/odyssey/lib/SdLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: SdLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\u001e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nH&J\u0010\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0004H&J\u0018\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0010\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u0013H&J\u0018\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/SdLoadingFragment$Callbacks;", "", "getInitialFetchResponse", "Lio/reactivex/Maybe;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "onSdPagesLoaded", "", "odysseyFlowId", "", "sdPages", "", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "onInitialSdResponseReceived", "response", "onSdPopupResponseReceivedOnInitialLoading", "popup", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "onDeeplinkReceived", "url", "Landroid/net/Uri;", "onExitDeeplinkReceived", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        Maybe<ApiSdResponse> getInitialFetchResponse();

        void onDeeplinkReceived(Uri url);

        void onExitDeeplinkReceived(Uri url, String odysseyFlowId);

        void onInitialSdResponseReceived(ApiSdResponse response);

        void onSdPagesLoaded(String odysseyFlowId, List<? extends ApiSdPage> sdPages);

        void onSdPopupResponseReceivedOnInitialLoading(String odysseyFlowId, ApiSdPopup popup);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$2(SdLoadingFragment sdLoadingFragment, int i, Composer composer, int i2) {
        sdLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
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

    public final ExperimentsStore getExperimentsStore() {
        ExperimentsStore experimentsStore = this.experimentsStore;
        if (experimentsStore != null) {
            return experimentsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("experimentsStore");
        return null;
    }

    public final void setExperimentsStore(ExperimentsStore experimentsStore) {
        Intrinsics.checkNotNullParameter(experimentsStore, "<set-?>");
        this.experimentsStore = experimentsStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        ScopedMaybe.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, MaybesAndroid.observeOnMainThread(getCallbacks().getInitialFetchResponse()), (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.odyssey.lib.SdLoadingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdLoadingFragment.onStart$lambda$0(this.f$0, (ApiSdResponse) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.SdLoadingFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SdLoadingFragment.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SdLoadingFragment sdLoadingFragment, ApiSdResponse response) {
        Uri deeplink;
        Uri exit_deeplink;
        Intrinsics.checkNotNullParameter(response, "response");
        sdLoadingFragment.getCallbacks().onInitialSdResponseReceived(response);
        AnalyticsLogger.DefaultImpls.logUserAction$default(sdLoadingFragment.getAnalytics(), SdLoggingUtil.getUserAction(response), "started", null, null, 12, null);
        if (response instanceof ApiSdResponse.Pages) {
            ApiSdResponse.Pages pages = (ApiSdResponse.Pages) response;
            sdLoadingFragment.getCallbacks().onSdPagesLoaded(pages.getOdyssey_flow_id(), pages.getPages());
        } else if (response instanceof ApiSdResponse.ExitDeeplink) {
            ApiSdResponse.ExitDeeplink exitDeeplink = (ApiSdResponse.ExitDeeplink) response;
            ApiSdDeeplinkConfig deeplink_config = exitDeeplink.getDeeplink_config();
            if ((deeplink_config == null || (exit_deeplink = deeplink_config.getUrl()) == null) && (exit_deeplink = exitDeeplink.getExit_deeplink()) == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ApiSdDeeplinkConfig deeplink_config2 = exitDeeplink.getDeeplink_config();
            if (deeplink_config2 != null && !deeplink_config2.getShould_close_flow()) {
                sdLoadingFragment.getCallbacks().onDeeplinkReceived(exit_deeplink);
            } else {
                sdLoadingFragment.getCallbacks().onExitDeeplinkReceived(exit_deeplink, exitDeeplink.getOdyssey_flow_id());
            }
        } else if (response instanceof ApiSdResponse.Popup) {
            ApiSdResponse.Popup popup = (ApiSdResponse.Popup) response;
            sdLoadingFragment.getCallbacks().onSdPopupResponseReceivedOnInitialLoading(popup.getOdyssey_flow_id(), popup.getPopup());
        } else if (response instanceof ApiSdResponse.Deeplink) {
            ApiSdResponse.Deeplink deeplink2 = (ApiSdResponse.Deeplink) response;
            ApiSdDeeplinkConfig deeplink_config3 = deeplink2.getDeeplink_config();
            if ((deeplink_config3 == null || (deeplink = deeplink_config3.getUrl()) == null) && (deeplink = deeplink2.getDeeplink()) == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            ApiSdDeeplinkConfig deeplink_config4 = deeplink2.getDeeplink_config();
            if (deeplink_config4 != null && deeplink_config4.getShould_close_flow()) {
                sdLoadingFragment.getCallbacks().onExitDeeplinkReceived(deeplink, deeplink2.getOdyssey_flow_id());
            } else {
                sdLoadingFragment.getCallbacks().onDeeplinkReceived(deeplink);
            }
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(response);
            throw new ExceptionsH();
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SdLoadingFragment sdLoadingFragment, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        sdLoadingFragment.getAnalytics().logError(SdLoggingUtil2.INITIAL_LOAD_ERROR, SdLoggingUtil.getErrorTag());
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = sdLoadingFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setVisibility(8);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1382249382);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1382249382, i, -1, "com.robinhood.android.odyssey.lib.SdLoadingFragment.ComposeContent (SdLoadingFragment.kt:126)");
            }
            LoadingScreenComposablesKt.GenericLoadingScreenComposable(PaddingKt.m5146paddingqDBjuR0$default(Modifier.INSTANCE, 0.0f, C2002Dp.m7995constructorimpl(56), 0.0f, 0.0f, 13, null), false, composerStartRestartGroup, 6, 2);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.odyssey.lib.SdLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return SdLoadingFragment.ComposeContent$lambda$2(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        BaseActivity baseActivityRequireBaseActivity = requireBaseActivity();
        Intrinsics.checkNotNull(baseActivityRequireBaseActivity, "null cannot be cast to non-null type com.robinhood.android.odyssey.lib.BaseSdActivity");
        ((BaseSdActivity) baseActivityRequireBaseActivity).submitExit();
        return true;
    }

    /* compiled from: SdLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/SdLoadingFragment$Companion;", "", "<init>", "()V", "newInstance", "Lcom/robinhood/android/odyssey/lib/SdLoadingFragment;", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final SdLoadingFragment newInstance() {
            return new SdLoadingFragment();
        }
    }
}
