package com.robinhood.android.iav.p154ui;

import android.os.Bundle;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.p011ui.Alignment;
import androidx.compose.p011ui.ComposedModifier2;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.layout.MeasurePolicy;
import androidx.compose.p011ui.node.ComposeUiNode;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionLocalMap;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.bento.component.BentoProgressIndicator2;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.cashier.IavStore;
import com.robinhood.models.api.IavAccount;
import com.robinhood.models.api.cashier.ApiPlaidAccessToken;
import com.robinhood.models.api.cashier.ApiPlaidPublicToken;
import com.robinhood.shared.transfers.contracts.context.PlaidIavMetadata;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.UUID;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: PlaidExchangeTokenFragment.kt */
@Metadata(m3635d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u0001:\u000223B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010(\u001a\u00020)H\u0016J\r\u0010*\u001a\u00020)H\u0017¢\u0006\u0002\u0010+J\u0010\u0010,\u001a\u00020)2\u0006\u0010-\u001a\u00020.H\u0016J\b\u0010/\u001a\u00020%H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0012\u0010\u0013R\u001b\u0010\u0016\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0015\u001a\u0004\b\u0017\u0010\u0013R\u001b\u0010\u0019\u001a\u00020\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\u001e\u001a\u00020\u001f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u00100\u001a\u00020\u00118VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b1\u0010\u0013¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "analytics", "Lcom/robinhood/analytics/AnalyticsLogger;", "getAnalytics", "()Lcom/robinhood/analytics/AnalyticsLogger;", "setAnalytics", "(Lcom/robinhood/analytics/AnalyticsLogger;)V", "iavStore", "Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "getIavStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;", "setIavStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/cashier/IavStore;)V", PlaidExchangeTokenFragment.ARG_PLAID_PUBLIC_TOKEN, "", "getPlaidPublicToken", "()Ljava/lang/String;", "plaidPublicToken$delegate", "Lkotlin/Lazy;", PlaidExchangeTokenFragment.ARG_IAV_ACCOUNT_ID, "getIavAccountId", "iavAccountId$delegate", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "getPlaidIavMetadata", "()Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "plaidIavMetadata$delegate", "callbacks", "Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "toolbarVisible", "", "getToolbarVisible", "()Z", "onStart", "", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDialogDismissed", "id", "", "onBackPressed", "screenDescription", "getScreenDescription", "Callbacks", "Companion", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class PlaidExchangeTokenFragment extends GenericComposeFragment {
    public static final String ARG_IAV_ACCOUNT_ID = "iavAccountId";
    public static final String ARG_PLAID_IAV_METADATA = "plaidIavMetadata";
    public static final String ARG_PLAID_PUBLIC_TOKEN = "plaidPublicToken";
    public AnalyticsLogger analytics;
    public IavStore iavStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(PlaidExchangeTokenFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: plaidPublicToken$delegate, reason: from kotlin metadata */
    private final Lazy plaidPublicToken = Fragments2.argument(this, ARG_PLAID_PUBLIC_TOKEN);

    /* renamed from: iavAccountId$delegate, reason: from kotlin metadata */
    private final Lazy iavAccountId = Fragments2.argument(this, ARG_IAV_ACCOUNT_ID);

    /* renamed from: plaidIavMetadata$delegate, reason: from kotlin metadata */
    private final Lazy plaidIavMetadata = Fragments2.argument(this, ARG_PLAID_IAV_METADATA);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.iav.ui.PlaidExchangeTokenFragment$special$$inlined$parentFragmentCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
            Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
            return fragmentRequireParentFragment;
        }
    });

    /* compiled from: PlaidExchangeTokenFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J \u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH&¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment$Callbacks;", "", "onTokenExchanged", "", "accessToken", "", "iavAccount", "Lcom/robinhood/models/api/IavAccount;", PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onTokenExchanged(String accessToken, IavAccount iavAccount, PlaidIavMetadata plaidIavMetadata);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$3(PlaidExchangeTokenFragment plaidExchangeTokenFragment, int i, Composer composer, int i2) {
        plaidExchangeTokenFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
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

    public final IavStore getIavStore() {
        IavStore iavStore = this.iavStore;
        if (iavStore != null) {
            return iavStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("iavStore");
        return null;
    }

    public final void setIavStore(IavStore iavStore) {
        Intrinsics.checkNotNullParameter(iavStore, "<set-?>");
        this.iavStore = iavStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getPlaidPublicToken() {
        return (String) this.plaidPublicToken.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String getIavAccountId() {
        return (String) this.iavAccountId.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PlaidIavMetadata getPlaidIavMetadata() {
        return (PlaidIavMetadata) this.plaidIavMetadata.getValue();
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(this, null, new C184981(null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.iav.ui.PlaidExchangeTokenFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidExchangeTokenFragment.onStart$lambda$0(this.f$0, (ApiPlaidAccessToken) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.iav.ui.PlaidExchangeTokenFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return PlaidExchangeTokenFragment.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: PlaidExchangeTokenFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/api/cashier/ApiPlaidAccessToken;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.iav.ui.PlaidExchangeTokenFragment$onStart$1", m3645f = "PlaidExchangeTokenFragment.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.iav.ui.PlaidExchangeTokenFragment$onStart$1 */
    static final class C184981 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super ApiPlaidAccessToken>, Object> {
        int label;

        C184981(Continuation<? super C184981> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return PlaidExchangeTokenFragment.this.new C184981(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super ApiPlaidAccessToken> continuation) {
            return ((C184981) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            IavStore iavStore = PlaidExchangeTokenFragment.this.getIavStore();
            ApiPlaidPublicToken apiPlaidPublicToken = new ApiPlaidPublicToken(PlaidExchangeTokenFragment.this.getPlaidPublicToken(), PlaidExchangeTokenFragment.this.getPlaidIavMetadata().getInstitutionId(), PlaidExchangeTokenFragment.this.getIavAccountId());
            PlaidIavMetadata plaidIavMetadata = PlaidExchangeTokenFragment.this.getPlaidIavMetadata();
            UUID sessionId = ExtensionsKt.getSessionId(PlaidExchangeTokenFragment.this);
            this.label = 1;
            Object objExchangeToken = iavStore.exchangeToken(apiPlaidPublicToken, plaidIavMetadata, sessionId, this);
            return objExchangeToken == coroutine_suspended ? coroutine_suspended : objExchangeToken;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(PlaidExchangeTokenFragment plaidExchangeTokenFragment, ApiPlaidAccessToken response) {
        Intrinsics.checkNotNullParameter(response, "response");
        plaidExchangeTokenFragment.getCallbacks().onTokenExchanged(response.getAccess_token(), response.getBank_account(), plaidExchangeTokenFragment.getPlaidIavMetadata());
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(PlaidExchangeTokenFragment plaidExchangeTokenFragment, Throwable throwable) throws Throwable {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        ActivityErrorHandler.Companion companion = ActivityErrorHandler.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = plaidExchangeTokenFragment.requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        ActivityErrorHandler.Companion.handle$default(companion, fragmentActivityRequireActivity, throwable, true, false, 0, null, 56, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1727991049);
        if ((i & 1) == 0 && composerStartRestartGroup.getSkipping()) {
            composerStartRestartGroup.skipToGroupEnd();
        } else {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(-1727991049, i, -1, "com.robinhood.android.iav.ui.PlaidExchangeTokenFragment.ComposeContent (PlaidExchangeTokenFragment.kt:86)");
            }
            Modifier modifierFillMaxSize$default = SizeKt.fillMaxSize$default(Modifier.INSTANCE, 0.0f, 1, null);
            MeasurePolicy measurePolicyMaybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.INSTANCE.getCenter(), false);
            int currentCompositeKeyHash = Composables.getCurrentCompositeKeyHash(composerStartRestartGroup, 0);
            CompositionLocalMap currentCompositionLocalMap = composerStartRestartGroup.getCurrentCompositionLocalMap();
            Modifier modifierMaterializeModifier = ComposedModifier2.materializeModifier(composerStartRestartGroup, modifierFillMaxSize$default);
            ComposeUiNode.Companion companion = ComposeUiNode.INSTANCE;
            Function0<ComposeUiNode> constructor = companion.getConstructor();
            if (composerStartRestartGroup.getApplier() == null) {
                Composables.invalidApplier();
            }
            composerStartRestartGroup.startReusableNode();
            if (composerStartRestartGroup.getInserting()) {
                composerStartRestartGroup.createNode(constructor);
            } else {
                composerStartRestartGroup.useNode();
            }
            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
            Updater.m6390setimpl(composerM6388constructorimpl, measurePolicyMaybeCachedBoxMeasurePolicy, companion.getSetMeasurePolicy());
            Updater.m6390setimpl(composerM6388constructorimpl, currentCompositionLocalMap, companion.getSetResolvedCompositionLocals());
            Function2<ComposeUiNode, Integer, Unit> setCompositeKeyHash = companion.getSetCompositeKeyHash();
            if (composerM6388constructorimpl.getInserting() || !Intrinsics.areEqual(composerM6388constructorimpl.rememberedValue(), Integer.valueOf(currentCompositeKeyHash))) {
                composerM6388constructorimpl.updateRememberedValue(Integer.valueOf(currentCompositeKeyHash));
                composerM6388constructorimpl.apply(Integer.valueOf(currentCompositeKeyHash), setCompositeKeyHash);
            }
            Updater.m6390setimpl(composerM6388constructorimpl, modifierMaterializeModifier, companion.getSetModifier());
            BoxScopeInstance boxScopeInstance = BoxScopeInstance.INSTANCE;
            BentoProgressIndicator2.m20700BentoCircularProgressIndicatorFNF3uiM(null, null, 0L, composerStartRestartGroup, 0, 7);
            composerStartRestartGroup.endNode();
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.iav.ui.PlaidExchangeTokenFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PlaidExchangeTokenFragment.ComposeContent$lambda$3(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnDismissListener
    public void onDialogDismissed(int id) {
        if (id == C11048R.id.dialog_id_generic_error) {
            requireActivity().finish();
        } else {
            super.onDialogDismissed(id);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        requireActivity().finish();
        return true;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenDescription() {
        Fragment fragmentRequireParentFragment = requireParentFragment();
        Intrinsics.checkNotNull(fragmentRequireParentFragment, "null cannot be cast to non-null type com.robinhood.android.iav.ui.PlaidConnectionFragment");
        return ((PlaidConnectionFragment) fragmentRequireParentFragment).getScreenDescription();
    }

    /* compiled from: PlaidExchangeTokenFragment.kt */
    @Metadata(m3635d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment$Companion;", "", "<init>", "()V", "ARG_PLAID_PUBLIC_TOKEN", "", "ARG_PLAID_IAV_METADATA", "ARG_IAV_ACCOUNT_ID", "newInstance", "Lcom/robinhood/android/iav/ui/PlaidExchangeTokenFragment;", PlaidExchangeTokenFragment.ARG_PLAID_PUBLIC_TOKEN, PlaidExchangeTokenFragment.ARG_IAV_ACCOUNT_ID, PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, "Lcom/robinhood/shared/transfers/contracts/context/PlaidIavMetadata;", "feature-iav_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final PlaidExchangeTokenFragment newInstance(String plaidPublicToken, String iavAccountId, PlaidIavMetadata plaidIavMetadata) {
            Intrinsics.checkNotNullParameter(plaidPublicToken, "plaidPublicToken");
            Intrinsics.checkNotNullParameter(iavAccountId, "iavAccountId");
            Intrinsics.checkNotNullParameter(plaidIavMetadata, "plaidIavMetadata");
            PlaidExchangeTokenFragment plaidExchangeTokenFragment = new PlaidExchangeTokenFragment();
            Bundle bundle = new Bundle();
            bundle.putString(PlaidExchangeTokenFragment.ARG_PLAID_PUBLIC_TOKEN, plaidPublicToken);
            bundle.putString(PlaidExchangeTokenFragment.ARG_IAV_ACCOUNT_ID, iavAccountId);
            bundle.putParcelable(PlaidExchangeTokenFragment.ARG_PLAID_IAV_METADATA, plaidIavMetadata);
            plaidExchangeTokenFragment.setArguments(bundle);
            return plaidExchangeTokenFragment;
        }
    }
}
