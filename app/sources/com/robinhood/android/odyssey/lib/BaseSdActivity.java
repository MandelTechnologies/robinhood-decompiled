package com.robinhood.android.odyssey.lib;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.view.result.ActivityResultCaller;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.databinding.ActivityFragmentContainerBinding;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.RhFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.navigation.C22231R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.odyssey.lib.SdLoadingFragment;
import com.robinhood.android.odyssey.lib.experiments.OdysseyRemoveUnvisitedPageInBlockExperiment;
import com.robinhood.android.odyssey.lib.navigation.SdNavigationInfo;
import com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment;
import com.robinhood.android.odyssey.lib.template.SdBackendMetadata;
import com.robinhood.android.odyssey.lib.utils.GzipExt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.IacStatusBannerStore;
import com.robinhood.librobinhood.data.store.identi.ServerDrivenStore;
import com.robinhood.models.api.serverdrivenui.ApiSdComponentDataChangeResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdPayloadValue;
import com.robinhood.models.api.serverdrivenui.ApiSdResponse;
import com.robinhood.models.api.serverdrivenui.ApiSdSubmitPayloadRequest;
import com.robinhood.models.api.serverdrivenui.component.ApiSdAction;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPopup;
import com.robinhood.models.api.serverdrivenui.component.ApiSdTypedValue;
import com.robinhood.models.api.serverdrivenui.page.ApiSdPage;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.Preconditions;
import com.robinhood.utils.extensions.TypeToken;
import com.robinhood.utils.extensions.Types;
import com.robinhood.utils.moshi.LazyMoshi;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import io.reactivex.Maybe;
import io.reactivex.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Deprecated;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: BaseSdActivity.kt */
@Metadata(m3635d1 = {"\u0000\u0082\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\u0006\b'\u0018\u0000 \u008b\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u008a\u0001\u008b\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010F\u001a\u00020G2\b\u0010H\u001a\u0004\u0018\u00010IH\u0014J\b\u0010J\u001a\u00020GH\u0014J\u001e\u0010K\u001a\u00020G2\u0006\u0010*\u001a\u00020+2\f\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MH\u0016J\u0018\u0010O\u001a\u00020G2\u0006\u0010*\u001a\u00020+2\u0006\u0010P\u001a\u00020QH\u0016J\u0014\u0010R\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0SH\u0016J\u0010\u0010V\u001a\u00020N2\u0006\u0010W\u001a\u00020XH\u0016J2\u0010Y\u001a\u00020G2\f\u0010Z\u001a\b\u0012\u0004\u0012\u00020N0M2\u0006\u0010W\u001a\u00020X2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0SH\u0016J$\u0010\\\u001a\u00020G2\u0006\u0010W\u001a\u00020X2\u0012\u0010[\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020U0SH\u0016J\b\u0010]\u001a\u00020GH\u0016J\u0010\u0010^\u001a\u00020G2\u0006\u0010W\u001a\u00020XH\u0016J\u0010\u0010_\u001a\u00020G2\u0006\u0010`\u001a\u00020aH\u0016J\u0010\u0010b\u001a\u00020G2\u0006\u0010`\u001a\u00020cH\u0016J\b\u0010d\u001a\u00020GH\u0017J\u000e\u0010e\u001a\b\u0012\u0004\u0012\u00020g0fH\u0016J\u001a\u0010h\u001a\u0014\u0012\u0004\u0012\u00020j\u0012\n\u0012\b\u0012\u0004\u0012\u00020g0f0iH\u0016J\u001a\u0010k\u001a\u0014\u0012\u0004\u0012\u00020j\u0012\n\u0012\b\u0012\u0004\u0012\u00020l0f0iH\u0016J\u0010\u0010m\u001a\u00020G2\u0006\u0010n\u001a\u00020gH\u0016J\u0010\u0010o\u001a\u00020G2\u0006\u0010p\u001a\u00020IH\u0014J\u0010\u0010q\u001a\u00020G2\u0006\u0010H\u001a\u00020IH\u0002J\b\u0010r\u001a\u00020GH\u0016J\u0010\u0010s\u001a\u00020G2\u0006\u0010t\u001a\u00020CH\u0016J\u0018\u0010u\u001a\u00020G2\u0006\u0010t\u001a\u00020C2\u0006\u0010*\u001a\u00020+H\u0016J\u0018\u0010v\u001a\u00020G2\u0006\u0010t\u001a\u00020C2\u0006\u0010*\u001a\u00020+H\u0016J!\u0010w\u001a\u00020G2\u0017\u0010x\u001a\u0013\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020/0i¢\u0006\u0002\byH\u0002J\b\u0010z\u001a\u00020/H\u0002J\b\u0010{\u001a\u00020GH\u0002J#\u0010|\u001a\u00020G2\u0006\u0010}\u001a\u00020~2\u0006\u0010\u007f\u001a\u00020+2\t\b\u0002\u0010\u0080\u0001\u001a\u00020'H\u0002J\u0013\u0010\u0081\u0001\u001a\u00020G2\b\u0010\u0082\u0001\u001a\u00030\u0083\u0001H\u0002J\u0012\u0010\u0081\u0001\u001a\u00020G2\u0007\u0010\u0084\u0001\u001a\u00020+H\u0002J\u001f\u0010\u0085\u0001\u001a\u00030\u0086\u00012\u0013\u0010\u0087\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M0MH\u0002J!\u0010\u0088\u0001\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020N0M\u0018\u00010M2\b\u0010\u0089\u0001\u001a\u00030\u0086\u0001H\u0002R\u001e\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0014\u001a\u00020\u00158BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010 \u001a\u00020!8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0014\u0010&\u001a\u00020'X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020+8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b,\u0010-R\u0010\u0010.\u001a\u0004\u0018\u00010/X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u00100\u001a\b\u0012\u0004\u0012\u00020+01X\u0082\u000e¢\u0006\u0002\n\u0000R\u0016\u00102\u001a\u0004\u0018\u000103X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b4\u00105R\u0016\u00106\u001a\u0004\u0018\u00010+X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b7\u0010-R\u0016\u00108\u001a\u0004\u0018\u000109X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u0014\u0010<\u001a\u00020'X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b=\u0010)R\u0014\u0010>\u001a\u00020'X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b?\u0010)R\u0014\u0010@\u001a\u00020'X\u0096D¢\u0006\b\n\u0000\u001a\u0004\bA\u0010)R\u0016\u0010B\u001a\u0004\u0018\u00010CX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\bD\u0010E¨\u0006\u008c\u0001"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/BaseSdActivity;", "Lcom/robinhood/android/common/ui/BaseActivity;", "Lcom/robinhood/android/odyssey/lib/SdLoadingFragment$Callbacks;", "Lcom/robinhood/android/odyssey/lib/template/BaseSdTemplateFragment$Callbacks;", "<init>", "()V", "sdSingletons", "Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "getSdSingletons", "()Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;", "setSdSingletons", "(Lcom/robinhood/android/odyssey/lib/BaseSdActivitySingletons;)V", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "getExperimentsStore", "()Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "iacStatusBannerStore", "Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "getIacStatusBannerStore", "()Lcom/robinhood/librobinhood/data/store/IacStatusBannerStore;", "moshi", "Lcom/robinhood/utils/moshi/LazyMoshi;", "getMoshi", "()Lcom/robinhood/utils/moshi/LazyMoshi;", "sdStore", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;", "getSdStore", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore;", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "bindings", "Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", "getBindings", "()Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", "bindings$delegate", "Lkotlin/properties/ReadOnlyProperty;", "excludeFromAnalyticsLogging", "", "getExcludeFromAnalyticsLogging", "()Z", "odysseyFlowId", "", "getOdysseyFlowId", "()Ljava/lang/String;", "sdNavigationInfo", "Lcom/robinhood/android/odyssey/lib/navigation/SdNavigationInfo;", "pastFragmentTags", "", "odysseyFlowConfiguration", "Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "getOdysseyFlowConfiguration", "()Lcom/robinhood/librobinhood/data/store/identi/ServerDrivenStore$FlowConfiguration;", "entryPointIdentifier", "getEntryPointIdentifier", "productTag", "Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "getProductTag", "()Lcom/robinhood/rosetta/eventlogging/Context$ProductTag;", "useAchromaticTheme", "getUseAchromaticTheme", "flowIsBlocking", "getFlowIsBlocking", "forceDarkTheme", "getForceDarkTheme", "exitDeeplinkOverride", "Landroid/net/Uri;", "getExitDeeplinkOverride", "()Landroid/net/Uri;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onPause", "onSdPagesLoaded", "sdPages", "", "Lcom/robinhood/models/api/serverdrivenui/page/ApiSdPage;", "onSdPopupResponseReceivedOnInitialLoading", "popup", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdPopup;", "getUpdatedEntitiesSinceLastCheckpoint", "", "Lcom/robinhood/android/odyssey/lib/template/SdBackendMetadata;", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdTypedValue;", "getPage", "pageId", "Ljava/util/UUID;", "submitUpdateInfo", "newPagesBlock", "newEntities", "submitNext", "submitExit", "submitBack", "submitGoBackAction", "action", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$GoBack;", "submitDismiss", "Lcom/robinhood/models/api/serverdrivenui/component/ApiSdAction$Dismiss;", "onBackPressed", "getInitialFetchResponse", "Lio/reactivex/Maybe;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdResponse;", "getPostEndpoint", "Lkotlin/Function1;", "Lcom/robinhood/models/api/serverdrivenui/ApiSdSubmitPayloadRequest;", "getValidationEndpoint", "Lcom/robinhood/models/api/serverdrivenui/ApiSdComponentDataChangeResponse;", "onInitialSdResponseReceived", "response", "onSaveInstanceState", "outState", "restoreSavedInstanceState", "onExitFlow", "onDeeplinkReceived", "url", "doOnExitDeeplinkReceived", "onExitDeeplinkReceived", "applyMutationToNavigationInfo", "mutator", "Lkotlin/ExtensionFunctionType;", "requireNavigationInfo", "showNextPageFragment", "addFragmentWithTag", "fragment", "Landroidx/fragment/app/Fragment;", "tag", "cleanBackstack", "popSdFragments", "numberToPop", "", "pageKeyToPopUntil", "compressSdPage", "", "pages", "decompressSdPage", "bytes", "SavedState", "Companion", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public abstract class BaseSdActivity extends BaseActivity implements SdLoadingFragment.Callbacks, BaseSdTemplateFragment.Callbacks {
    private static final int BACKSTACK_MAX_SIZE = 12;
    public static final String ODYSSEY_DISMISS_RESULT_KEY = "odyssey_dismiss_result_key";
    private static final String SAVE_BACKSTACK_PAGE_LIST = "backstack_page_list";
    private static final String SAVE_COMPRESSED_PAGES = "save_compressed_pages";
    private static final String SAVE_NAVIGATION_INFO = "save_navigation_info";

    /* renamed from: bindings$delegate, reason: from kotlin metadata */
    private final Interfaces2 bindings;
    private final String entryPointIdentifier;
    private final boolean excludeFromAnalyticsLogging;
    private final Uri exitDeeplinkOverride;
    private final boolean flowIsBlocking;
    private final boolean forceDarkTheme;
    private final ServerDrivenStore.FlowConfiguration odysseyFlowConfiguration;
    private List<String> pastFragmentTags;
    private final Context.ProductTag productTag;
    private SdNavigationInfo sdNavigationInfo;
    public BaseSdActivitySingletons sdSingletons;
    private final boolean useAchromaticTheme;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BaseSdActivity.class, "bindings", "getBindings()Lcom/robinhood/android/common/databinding/ActivityFragmentContainerBinding;", 0))};
    public static final int $stable = 8;

    public void doOnExitDeeplinkReceived(Uri url, String odysseyFlowId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
    }

    @Override // com.robinhood.android.odyssey.lib.SdLoadingFragment.Callbacks
    public void onInitialSdResponseReceived(ApiSdResponse response) {
        Intrinsics.checkNotNullParameter(response, "response");
    }

    private final void addFragmentWithTag(Fragment fragment, String tag, boolean cleanBackstack) {
        FragmentTransaction fragmentTransactionAdd;
        if (!isFinishing() && !getSupportFragmentManager().isStateSaved()) {
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
            if (cleanBackstack) {
                while (this.pastFragmentTags.size() > 0) {
                    Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag((String) CollectionsKt.removeLastOrNull(this.pastFragmentTags));
                    if (fragmentFindFragmentByTag != null) {
                        fragmentTransactionBeginTransaction = fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag).remove(fragmentFindFragmentByTag);
                        Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "remove(...)");
                    }
                }
            }
            if (this.pastFragmentTags.size() >= 12) {
                Fragment fragmentFindFragmentByTag2 = getSupportFragmentManager().findFragmentByTag((String) CollectionsKt.removeFirstOrNull(this.pastFragmentTags));
                if (fragmentFindFragmentByTag2 != null) {
                    fragmentTransactionBeginTransaction = fragmentTransactionBeginTransaction.remove(fragmentFindFragmentByTag2);
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "remove(...)");
                }
            }
            Fragment fragmentFindFragmentByTag3 = getSupportFragmentManager().findFragmentByTag((String) CollectionsKt.lastOrNull((List) this.pastFragmentTags));
            if (fragmentFindFragmentByTag3 != null) {
                fragmentTransactionBeginTransaction = fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag3).detach(fragmentFindFragmentByTag3);
                Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "detach(...)");
            }
            if (this.pastFragmentTags.size() == 0) {
                fragmentTransactionAdd = fragmentTransactionBeginTransaction.replace(C20335R.id.fragment_container, fragment, tag);
                Intrinsics.checkNotNull(fragmentTransactionAdd);
            } else {
                fragmentTransactionAdd = fragmentTransactionBeginTransaction.add(C20335R.id.fragment_container, fragment, tag);
                Intrinsics.checkNotNull(fragmentTransactionAdd);
            }
            FragmentTransaction customAnimations = fragmentTransactionAdd.setReorderingAllowed(true).setCustomAnimations(C22231R.anim.frag_enter_right, C22231R.anim.frag_exit_left, C22231R.anim.frag_enter_left, C22231R.anim.frag_exit_right);
            Intrinsics.checkNotNullExpressionValue(customAnimations, "setCustomAnimations(...)");
            customAnimations.commitAllowingStateLoss();
        }
        this.pastFragmentTags.add(tag);
    }

    public BaseSdActivity() {
        super(C11048R.layout.activity_fragment_container);
        this.bindings = ViewBinding5.viewBinding(this, BaseSdActivity2.INSTANCE);
        this.excludeFromAnalyticsLogging = true;
        this.pastFragmentTags = new ArrayList();
    }

    public final BaseSdActivitySingletons getSdSingletons() {
        BaseSdActivitySingletons baseSdActivitySingletons = this.sdSingletons;
        if (baseSdActivitySingletons != null) {
            return baseSdActivitySingletons;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sdSingletons");
        return null;
    }

    public final void setSdSingletons(BaseSdActivitySingletons baseSdActivitySingletons) {
        Intrinsics.checkNotNullParameter(baseSdActivitySingletons, "<set-?>");
        this.sdSingletons = baseSdActivitySingletons;
    }

    private final ExperimentsStore getExperimentsStore() {
        return getSdSingletons().getExperimentsStore();
    }

    private final IacStatusBannerStore getIacStatusBannerStore() {
        return getSdSingletons().getIacStatusBannerStore();
    }

    private final LazyMoshi getMoshi() {
        return getSdSingletons().getMoshi();
    }

    private final ServerDrivenStore getSdStore() {
        return getSdSingletons().getSdStore();
    }

    private final AnalyticsLogger getAnalytics() {
        return getSdSingletons().getAnalytics();
    }

    private final ActivityFragmentContainerBinding getBindings() {
        Object value = this.bindings.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (ActivityFragmentContainerBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public boolean getExcludeFromAnalyticsLogging() {
        return this.excludeFromAnalyticsLogging;
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public String getOdysseyFlowId() {
        return requireNavigationInfo().getOdysseyFlowId();
    }

    public ServerDrivenStore.FlowConfiguration getOdysseyFlowConfiguration() {
        return this.odysseyFlowConfiguration;
    }

    public String getEntryPointIdentifier() {
        return this.entryPointIdentifier;
    }

    public Context.ProductTag getProductTag() {
        return this.productTag;
    }

    public boolean getUseAchromaticTheme() {
        return this.useAchromaticTheme;
    }

    public boolean getFlowIsBlocking() {
        return this.flowIsBlocking;
    }

    public boolean getForceDarkTheme() {
        return this.forceDarkTheme;
    }

    public Uri getExitDeeplinkOverride() {
        return this.exitDeeplinkOverride;
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getForceDarkTheme()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), DayNightOverlay.NIGHT, null, 2, null);
        }
        if (savedInstanceState != null) {
            restoreSavedInstanceState(savedInstanceState);
        }
        FrameLayout root = getBindings().getRoot();
        Intrinsics.checkNotNullExpressionValue(root, "getRoot(...)");
        ApplyWindowInsets.m26663applyWindowInsetsAsMarginqNU9l24(root, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        if (this.sdNavigationInfo == null) {
            IdlingResourceCounters2.setBusy(IdlingResourceType.ODYSSEY_LOADING, true);
            setFragment(C20335R.id.fragment_container, SdLoadingFragment.INSTANCE.newInstance());
        }
        if (getUseAchromaticTheme()) {
            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), AchromaticOverlay.INSTANCE, null, 2, null);
        }
    }

    @Override // com.robinhood.android.common.p088ui.RxActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        if (isFinishing()) {
            onExitFlow();
        }
        super.onPause();
    }

    @Override // com.robinhood.android.odyssey.lib.SdLoadingFragment.Callbacks
    public void onSdPagesLoaded(String odysseyFlowId, List<? extends ApiSdPage> sdPages) {
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
        Intrinsics.checkNotNullParameter(sdPages, "sdPages");
        this.sdNavigationInfo = SdNavigationInfo.INSTANCE.buildInitialInfo(odysseyFlowId, sdPages);
        showNextPageFragment();
        IdlingResourceCounters2.setBusy(IdlingResourceType.ODYSSEY_LOADING, false);
    }

    @Override // com.robinhood.android.odyssey.lib.SdLoadingFragment.Callbacks
    public void onSdPopupResponseReceivedOnInitialLoading(String odysseyFlowId, ApiSdPopup popup) {
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
        Intrinsics.checkNotNullParameter(popup, "popup");
        this.sdNavigationInfo = SdNavigationInfo.INSTANCE.buildInitialInfo(odysseyFlowId, CollectionsKt.listOf(popup.toPage()));
        showNextPageFragment();
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public Map<SdBackendMetadata, ApiSdTypedValue> getUpdatedEntitiesSinceLastCheckpoint() {
        return requireNavigationInfo().getUpdatedPageEntities();
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public ApiSdPage getPage(UUID pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        return requireNavigationInfo().getPage(pageId);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void submitUpdateInfo(final List<? extends ApiSdPage> newPagesBlock, final UUID pageId, final Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities) {
        Intrinsics.checkNotNullParameter(newPagesBlock, "newPagesBlock");
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(newEntities, "newEntities");
        Single singleFirstOrError = ExperimentsProvider.DefaultImpls.streamState$default(getExperimentsStore(), new Experiment[]{OdysseyRemoveUnvisitedPageInBlockExperiment.INSTANCE}, false, null, 6, null).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.submitUpdateInfo$lambda$2(this.f$0, pageId, newEntities, newPagesBlock, (Boolean) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.submitUpdateInfo$lambda$4(this.f$0, pageId, newEntities, newPagesBlock, (Throwable) obj);
            }
        });
        showNextPageFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitUpdateInfo$lambda$2(BaseSdActivity baseSdActivity, final UUID uuid, final Map map, final List list, final Boolean bool) {
        baseSdActivity.applyMutationToNavigationInfo(new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.submitUpdateInfo$lambda$2$lambda$1(uuid, map, list, bool, (SdNavigationInfo) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdNavigationInfo submitUpdateInfo$lambda$2$lambda$1(UUID uuid, Map map, List list, Boolean bool, SdNavigationInfo applyMutationToNavigationInfo) {
        Intrinsics.checkNotNullParameter(applyMutationToNavigationInfo, "$this$applyMutationToNavigationInfo");
        SdNavigationInfo sdNavigationInfoSubmitCurrentPageEntities = applyMutationToNavigationInfo.submitCurrentPageEntities(uuid, map, true);
        Intrinsics.checkNotNull(bool);
        return sdNavigationInfoSubmitCurrentPageEntities.addNewPages(list, uuid, bool.booleanValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit submitUpdateInfo$lambda$4(BaseSdActivity baseSdActivity, final UUID uuid, final Map map, final List list, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        baseSdActivity.applyMutationToNavigationInfo(new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.submitUpdateInfo$lambda$4$lambda$3(uuid, map, list, (SdNavigationInfo) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdNavigationInfo submitUpdateInfo$lambda$4$lambda$3(UUID uuid, Map map, List list, SdNavigationInfo applyMutationToNavigationInfo) {
        Intrinsics.checkNotNullParameter(applyMutationToNavigationInfo, "$this$applyMutationToNavigationInfo");
        return applyMutationToNavigationInfo.submitCurrentPageEntities(uuid, map, true).addNewPages(list, uuid, false);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void submitNext(final UUID pageId, final Map<SdBackendMetadata, ? extends ApiSdTypedValue> newEntities) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        Intrinsics.checkNotNullParameter(newEntities, "newEntities");
        applyMutationToNavigationInfo(new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.submitNext$lambda$5(pageId, newEntities, (SdNavigationInfo) obj);
            }
        });
        showNextPageFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdNavigationInfo submitNext$lambda$5(UUID uuid, Map map, SdNavigationInfo applyMutationToNavigationInfo) {
        Intrinsics.checkNotNullParameter(applyMutationToNavigationInfo, "$this$applyMutationToNavigationInfo");
        return applyMutationToNavigationInfo.submitCurrentPageEntities(uuid, map, false);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void submitExit() {
        if (getFlowIsBlocking()) {
            return;
        }
        setCurrentFragmentTransitionSuccess();
        finish();
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void submitBack(final UUID pageId) {
        Intrinsics.checkNotNullParameter(pageId, "pageId");
        applyMutationToNavigationInfo(new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.submitBack$lambda$6(pageId, (SdNavigationInfo) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdNavigationInfo submitBack$lambda$6(UUID uuid, SdNavigationInfo applyMutationToNavigationInfo) {
        Intrinsics.checkNotNullParameter(applyMutationToNavigationInfo, "$this$applyMutationToNavigationInfo");
        return applyMutationToNavigationInfo.removeVisitedPage(uuid);
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void submitGoBackAction(ApiSdAction.GoBack action) {
        Intrinsics.checkNotNullParameter(action, "action");
        Integer page_count = action.getPayload().getPage_count();
        String page_key = action.getPayload().getPage_key();
        if (page_count != null) {
            popSdFragments(page_count.intValue());
        } else if (page_key != null) {
            popSdFragments(page_key);
        } else {
            Preconditions.INSTANCE.failUnexpectedItemKotlin(action);
            throw new ExceptionsH();
        }
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void submitDismiss(ApiSdAction.Dismiss action) {
        Uri exitDeeplinkOverride;
        String result_key;
        Intrinsics.checkNotNullParameter(action, "action");
        ApiSdAction.Dismiss.Payload payload = action.getPayload();
        if (payload != null && (result_key = payload.getResult_key()) != null) {
            setResult(-1, new Intent().putExtra(ODYSSEY_DISMISS_RESULT_KEY, result_key));
        }
        ApiSdAction.Dismiss.Payload payload2 = action.getPayload();
        if (payload2 == null || (exitDeeplinkOverride = payload2.getUrl()) == null) {
            exitDeeplinkOverride = getExitDeeplinkOverride();
        }
        if (exitDeeplinkOverride != null) {
            onExitDeeplinkReceived(exitDeeplinkOverride, getOdysseyFlowId());
        } else {
            finish();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseActivity, androidx.view.ComponentActivity, android.app.Activity
    @Deprecated
    public void onBackPressed() {
        ActivityResultCaller currentFragment = getCurrentFragment();
        RhFragment rhFragment = currentFragment instanceof RhFragment ? (RhFragment) currentFragment : null;
        if (rhFragment != null && !rhFragment.onBackPressed()) {
            if (this.pastFragmentTags.size() <= 1) {
                if (getFlowIsBlocking()) {
                    return;
                }
                finish();
                return;
            }
            FragmentManager supportFragmentManager = getSupportFragmentManager();
            List<String> list = this.pastFragmentTags;
            Fragment fragmentFindFragmentByTag = supportFragmentManager.findFragmentByTag(list.remove(CollectionsKt.getLastIndex(list)));
            Fragment fragmentFindFragmentByTag2 = getSupportFragmentManager().findFragmentByTag((String) CollectionsKt.last((List) this.pastFragmentTags));
            if (fragmentFindFragmentByTag == null || fragmentFindFragmentByTag2 == null) {
                return;
            }
            getSupportFragmentManager().beginTransaction().hide(fragmentFindFragmentByTag).remove(fragmentFindFragmentByTag).attach(fragmentFindFragmentByTag2).show(fragmentFindFragmentByTag2).commitNow();
            return;
        }
        super.onBackPressed();
    }

    @Override // com.robinhood.android.odyssey.lib.SdLoadingFragment.Callbacks
    public Maybe<ApiSdResponse> getInitialFetchResponse() {
        Maybe<ApiSdResponse> maybeFetchSdFlow;
        ServerDrivenStore.FlowConfiguration odysseyFlowConfiguration = getOdysseyFlowConfiguration();
        if (odysseyFlowConfiguration != null) {
            String deeplinkCompletionCheckpoint = odysseyFlowConfiguration.getDeeplinkCompletionCheckpoint();
            if (deeplinkCompletionCheckpoint != null) {
                maybeFetchSdFlow = getSdStore().submitSdFlowEntities(new ApiSdSubmitPayloadRequest(CollectionsKt.listOf(new ApiSdPayloadValue.StringPayloadValue("checkpoint", "checkpoint", deeplinkCompletionCheckpoint)), null, null, null, 14, null), odysseyFlowConfiguration);
            } else {
                maybeFetchSdFlow = getSdStore().fetchSdFlow(odysseyFlowConfiguration);
            }
            if (maybeFetchSdFlow != null) {
                return maybeFetchSdFlow;
            }
        }
        throw new Error("Please define odysseyFlowConfiguration or override getInitialFetchResponse in child activity");
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public Function1<ApiSdSubmitPayloadRequest, Maybe<ApiSdResponse>> getPostEndpoint() {
        return new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.getPostEndpoint$lambda$10(this.f$0, (ApiSdSubmitPayloadRequest) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe getPostEndpoint$lambda$10(BaseSdActivity baseSdActivity, ApiSdSubmitPayloadRequest request) {
        Maybe<ApiSdResponse> maybeSubmitSdFlowEntities;
        Intrinsics.checkNotNullParameter(request, "request");
        ServerDrivenStore.FlowConfiguration odysseyFlowConfiguration = baseSdActivity.getOdysseyFlowConfiguration();
        if (odysseyFlowConfiguration == null || (maybeSubmitSdFlowEntities = baseSdActivity.getSdStore().submitSdFlowEntities(request, odysseyFlowConfiguration)) == null) {
            throw new Error("Please define odysseyFlowConfiguration or override getPostEndpoint in child activity");
        }
        return maybeSubmitSdFlowEntities;
    }

    @Override // com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public Function1<ApiSdSubmitPayloadRequest, Maybe<ApiSdComponentDataChangeResponse>> getValidationEndpoint() {
        return new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseSdActivity.getValidationEndpoint$lambda$12(this.f$0, (ApiSdSubmitPayloadRequest) obj);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe getValidationEndpoint$lambda$12(BaseSdActivity baseSdActivity, ApiSdSubmitPayloadRequest request) {
        Maybe<ApiSdComponentDataChangeResponse> maybeValidateSdFlowEntities;
        Intrinsics.checkNotNullParameter(request, "request");
        ServerDrivenStore.FlowConfiguration odysseyFlowConfiguration = baseSdActivity.getOdysseyFlowConfiguration();
        if (odysseyFlowConfiguration == null || (maybeValidateSdFlowEntities = baseSdActivity.getSdStore().validateSdFlowEntities(ApiSdSubmitPayloadRequest.copy$default(request, null, null, null, baseSdActivity.getOdysseyFlowId(), 7, null), odysseyFlowConfiguration)) == null) {
            throw new Error("Please define odysseyFlowConfiguration or override getValidationEndpoint in child activity");
        }
        return maybeValidateSdFlowEntities;
    }

    @Override // androidx.view.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    protected void onSaveInstanceState(Bundle outState) {
        Intrinsics.checkNotNullParameter(outState, "outState");
        super.onSaveInstanceState(outState);
        SdNavigationInfo sdNavigationInfo = this.sdNavigationInfo;
        List<List<ApiSdPage>> pages$feature_lib_odyssey_externalDebug = sdNavigationInfo != null ? sdNavigationInfo.getPages$feature_lib_odyssey_externalDebug() : null;
        if (pages$feature_lib_odyssey_externalDebug == null) {
            pages$feature_lib_odyssey_externalDebug = CollectionsKt.emptyList();
        }
        byte[] bArrCompressSdPage = compressSdPage(pages$feature_lib_odyssey_externalDebug);
        SdNavigationInfo sdNavigationInfo2 = this.sdNavigationInfo;
        outState.putParcelable(SAVE_NAVIGATION_INFO, sdNavigationInfo2 != null ? sdNavigationInfo2.clearPages() : null);
        outState.putParcelable(SAVE_COMPRESSED_PAGES, new SavedState(bArrCompressSdPage));
        outState.putStringArrayList(SAVE_BACKSTACK_PAGE_LIST, new ArrayList<>(this.pastFragmentTags));
    }

    private final void restoreSavedInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        SavedState savedState = (SavedState) savedInstanceState.getParcelable(SAVE_COMPRESSED_PAGES);
        SdNavigationInfo sdNavigationInfoWithPages = null;
        byte[] compressedPages = savedState != null ? savedState.getCompressedPages() : null;
        SdNavigationInfo sdNavigationInfo = (SdNavigationInfo) savedInstanceState.getParcelable(SAVE_NAVIGATION_INFO);
        List<List<ApiSdPage>> listDecompressSdPage = compressedPages != null ? decompressSdPage(compressedPages) : null;
        if (sdNavigationInfo != null) {
            if (listDecompressSdPage == null) {
                listDecompressSdPage = CollectionsKt.emptyList();
            }
            sdNavigationInfoWithPages = sdNavigationInfo.withPages(listDecompressSdPage);
        }
        this.sdNavigationInfo = sdNavigationInfoWithPages;
        Collection stringArrayList = savedInstanceState.getStringArrayList(SAVE_BACKSTACK_PAGE_LIST);
        if (stringArrayList == null) {
            stringArrayList = CollectionsKt.emptyList();
        }
        this.pastFragmentTags = CollectionsKt.toMutableList(stringArrayList);
    }

    public void onExitFlow() {
        getIacStatusBannerStore().refresh(true);
    }

    @Override // com.robinhood.android.odyssey.lib.SdLoadingFragment.Callbacks, com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void onDeeplinkReceived(Uri url) {
        Intrinsics.checkNotNullParameter(url, "url");
        Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, url, null, null, false, null, 60, null);
    }

    @Override // com.robinhood.android.odyssey.lib.SdLoadingFragment.Callbacks, com.robinhood.android.odyssey.lib.template.BaseSdTemplateFragment.Callbacks
    public void onExitDeeplinkReceived(Uri url, String odysseyFlowId) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(odysseyFlowId, "odysseyFlowId");
        Uri exitDeeplinkOverride = getExitDeeplinkOverride();
        Uri uri = exitDeeplinkOverride == null ? url : exitDeeplinkOverride;
        AnalyticsLogger.DefaultImpls.logUserAction$default(getAnalytics(), SdLoggingUtil.getUserAction(odysseyFlowId), "finished", null, uri.toString(), 4, null);
        doOnExitDeeplinkReceived(uri, odysseyFlowId);
        Navigator.DefaultImpls.handleDeepLink$default(getNavigator(), this, uri, null, null, false, null, 60, null);
        finish();
    }

    private final void applyMutationToNavigationInfo(Function1<? super SdNavigationInfo, SdNavigationInfo> mutator) {
        this.sdNavigationInfo = mutator.invoke(requireNavigationInfo());
    }

    private final SdNavigationInfo requireNavigationInfo() {
        SdNavigationInfo sdNavigationInfo = this.sdNavigationInfo;
        if (sdNavigationInfo != null) {
            return sdNavigationInfo;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    private final void showNextPageFragment() {
        setCurrentFragmentTransitionSuccess();
        final ApiSdPage nextPage = requireNavigationInfo().getNextPage();
        BaseSdTemplateFragment.Companion companion = BaseSdTemplateFragment.INSTANCE;
        ServerDrivenStore.FlowConfiguration odysseyFlowConfiguration = getOdysseyFlowConfiguration();
        BaseSdTemplateFragment<? extends ApiSdPage> baseSdTemplateFragmentNewInstance = companion.newInstance(nextPage, odysseyFlowConfiguration != null ? odysseyFlowConfiguration.getPhoneNumber() : null, getEntryPointIdentifier(), getProductTag());
        if (nextPage.getDisableBack()) {
            applyMutationToNavigationInfo(new Function1() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$$ExternalSyntheticLambda7
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return BaseSdActivity.showNextPageFragment$lambda$13(nextPage, (SdNavigationInfo) obj);
                }
            });
            String string2 = nextPage.getPageId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            addFragmentWithTag(baseSdTemplateFragmentNewInstance, string2, true);
            return;
        }
        String string3 = nextPage.getPageId().toString();
        Intrinsics.checkNotNullExpressionValue(string3, "toString(...)");
        addFragmentWithTag$default(this, baseSdTemplateFragmentNewInstance, string3, false, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final SdNavigationInfo showNextPageFragment$lambda$13(ApiSdPage apiSdPage, SdNavigationInfo applyMutationToNavigationInfo) {
        Intrinsics.checkNotNullParameter(applyMutationToNavigationInfo, "$this$applyMutationToNavigationInfo");
        return applyMutationToNavigationInfo.clearPreviousPageBlocks(apiSdPage.getPageId());
    }

    static /* synthetic */ void addFragmentWithTag$default(BaseSdActivity baseSdActivity, Fragment fragment, String str, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: addFragmentWithTag");
        }
        if ((i & 4) != 0) {
            z = false;
        }
        baseSdActivity.addFragmentWithTag(fragment, str, z);
    }

    private final void popSdFragments(int numberToPop) {
        if (numberToPop == 0) {
            throw new IllegalArgumentException("Can't pop 0 fragment");
        }
        if (numberToPop < this.pastFragmentTags.size()) {
            if (isFinishing() || getSupportFragmentManager().isStateSaved()) {
                return;
            }
            FragmentTransaction fragmentTransactionBeginTransaction = getSupportFragmentManager().beginTransaction();
            Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "beginTransaction(...)");
            for (int i = 0; i < numberToPop; i++) {
                List<String> list = this.pastFragmentTags;
                Fragment fragmentFindFragmentByTag = getSupportFragmentManager().findFragmentByTag(list.remove(CollectionsKt.getLastIndex(list)));
                if (fragmentFindFragmentByTag != null) {
                    fragmentTransactionBeginTransaction = fragmentTransactionBeginTransaction.hide(fragmentFindFragmentByTag).remove(fragmentFindFragmentByTag);
                    Intrinsics.checkNotNullExpressionValue(fragmentTransactionBeginTransaction, "remove(...)");
                }
            }
            fragmentTransactionBeginTransaction.commitAllowingStateLoss();
            return;
        }
        finish();
    }

    private final void popSdFragments(String pageKeyToPopUntil) {
        if (this.pastFragmentTags.indexOf(pageKeyToPopUntil) == -1) {
            finish();
        } else {
            popSdFragments((this.pastFragmentTags.size() - r2) - 1);
        }
    }

    private final byte[] compressSdPage(List<? extends List<? extends ApiSdPage>> pages) {
        LazyMoshi moshi = getMoshi();
        Types types = Types.INSTANCE;
        String json = moshi.adapter(new TypeToken<List<? extends List<? extends ApiSdPage>>>() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$compressSdPage$$inlined$getAdapter$1
        }.getType()).toJson(pages);
        Intrinsics.checkNotNullExpressionValue(json, "toJson(...)");
        return GzipExt.gzipCompress(json);
    }

    private final List<List<ApiSdPage>> decompressSdPage(byte[] bytes) {
        LazyMoshi moshi = getMoshi();
        Types types = Types.INSTANCE;
        return (List) moshi.adapter(new TypeToken<List<? extends List<? extends ApiSdPage>>>() { // from class: com.robinhood.android.odyssey.lib.BaseSdActivity$decompressSdPage$$inlined$getAdapter$1
        }.getType()).fromJson(GzipExt.gzipDecompress(bytes));
    }

    /* compiled from: BaseSdActivity.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u000f"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/BaseSdActivity$SavedState;", "Landroid/os/Parcelable;", "compressedPages", "", "<init>", "([B)V", "getCompressedPages", "()[B", "describeContents", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    private static final class SavedState implements Parcelable {
        public static final Parcelable.Creator<SavedState> CREATOR = new Creator();
        private final byte[] compressedPages;

        /* compiled from: BaseSdActivity.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<SavedState> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new SavedState(parcel.createByteArray());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final SavedState[] newArray(int i) {
                return new SavedState[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeByteArray(this.compressedPages);
        }

        public SavedState(byte[] bArr) {
            this.compressedPages = bArr;
        }

        public final byte[] getCompressedPages() {
            return this.compressedPages;
        }
    }
}
