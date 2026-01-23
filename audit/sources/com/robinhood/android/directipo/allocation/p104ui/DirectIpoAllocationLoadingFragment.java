package com.robinhood.android.directipo.allocation.p104ui;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import com.airbnb.lottie.LottieComposition;
import com.airbnb.lottie.LottieCompositionFactory;
import com.airbnb.lottie.LottieResult;
import com.robinhood.android.directipo.allocation.p104ui.DirectIpoAllocationLoadingFragment;
import com.robinhood.android.lib.api.directipo.DirectIpoApi;
import com.robinhood.android.navigation.app.keys.LegacyIntentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.directipo.models.api.ApiDirectIpoAllocation;
import com.robinhood.directipo.models.p293ui.UiDirectIpoAllocation;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.BuildersKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineDispatcher;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Dispatchers;

/* compiled from: DirectIpoAllocationLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u00020\u00012\u00020\u0002:\u0002 !B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0016J\r\u0010\u0017\u001a\u00020\u0012H\u0017¢\u0006\u0002\u0010\u0018J\t\u0010\u0019\u001a\u00020\u001aH\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001f¨\u0006\""}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "api", "Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "getApi", "()Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;", "setApi", "(Lcom/robinhood/android/lib/api/directipo/DirectIpoApi;)V", "callbacks", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "ComposeContent", "(Landroidx/compose/runtime/Composer;I)V", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Companion", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoAllocationLoadingFragment extends GenericComposeFragment implements RegionGated {
    public DirectIpoApi api;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoAllocationLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;
    private final /* synthetic */ RegionGated2 $$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof DirectIpoAllocationLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* compiled from: DirectIpoAllocationLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment$Callbacks;", "", "onLoadAllocationSuccess", "", "allocation", "Lcom/robinhood/directipo/models/ui/UiDirectIpoAllocation;", "onLoadAllocationFailure", "throwable", "", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onLoadAllocationFailure(Throwable throwable);

        void onLoadAllocationSuccess(UiDirectIpoAllocation allocation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(DirectIpoAllocationLoadingFragment directIpoAllocationLoadingFragment, int i, Composer composer, int i2) {
        directIpoAllocationLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public final DirectIpoApi getApi() {
        DirectIpoApi directIpoApi = this.api;
        if (directIpoApi != null) {
            return directIpoApi;
        }
        Intrinsics.throwUninitializedPropertyAccessException("api");
        return null;
    }

    public final void setApi(DirectIpoApi directIpoApi) {
        Intrinsics.checkNotNullParameter(directIpoApi, "<set-?>");
        this.api = directIpoApi;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment, com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C142051(null), 3, null);
    }

    /* compiled from: DirectIpoAllocationLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$onViewCreated$1", m3645f = "DirectIpoAllocationLoadingFragment.kt", m3646l = {49}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$onViewCreated$1 */
    static final class C142051 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C142051(Continuation<? super C142051> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DirectIpoAllocationLoadingFragment.this.new C142051(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C142051) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DirectIpoAllocationLoadingFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$onViewCreated$1$1", m3645f = "DirectIpoAllocationLoadingFragment.kt", m3646l = {53, 56, 61}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            Object L$0;
            int label;
            final /* synthetic */ DirectIpoAllocationLoadingFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DirectIpoAllocationLoadingFragment directIpoAllocationLoadingFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = directIpoAllocationLoadingFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                ApiDirectIpoAllocation apiDirectIpoAllocation;
                UiDirectIpoAllocation uiModel;
                UiDirectIpoAllocation uiDirectIpoAllocation;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                try {
                } catch (Exception e) {
                    this.this$0.getCallbacks().onLoadAllocationFailure(e);
                }
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    LegacyIntentKey.DirectIpoAllocation directIpoAllocation = (LegacyIntentKey.DirectIpoAllocation) DirectIpoAllocationLoadingFragment.INSTANCE.getArgs((Fragment) this.this$0);
                    if (directIpoAllocation instanceof LegacyIntentKey.DirectIpoAllocation.Instrument) {
                        DirectIpoApi api = this.this$0.getApi();
                        UUID instrumentId = ((LegacyIntentKey.DirectIpoAllocation.Instrument) directIpoAllocation).getInstrumentId();
                        this.label = 1;
                        obj = api.getDirectIpoAllocationResultsV2(instrumentId, this);
                        if (obj == coroutine_suspended) {
                        }
                        apiDirectIpoAllocation = (ApiDirectIpoAllocation) obj;
                    } else {
                        if (!(directIpoAllocation instanceof LegacyIntentKey.DirectIpoAllocation.SharedOrder)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        DirectIpoApi api2 = this.this$0.getApi();
                        UUID orderId = ((LegacyIntentKey.DirectIpoAllocation.SharedOrder) directIpoAllocation).getOrderId();
                        this.label = 2;
                        obj = api2.getSharedDirectIpoAllocationResults(orderId, this);
                        if (obj == coroutine_suspended) {
                        }
                        apiDirectIpoAllocation = (ApiDirectIpoAllocation) obj;
                    }
                    return coroutine_suspended;
                }
                if (i == 1) {
                    ResultKt.throwOnFailure(obj);
                    apiDirectIpoAllocation = (ApiDirectIpoAllocation) obj;
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        uiDirectIpoAllocation = (UiDirectIpoAllocation) this.L$0;
                        ResultKt.throwOnFailure(obj);
                        uiModel = uiDirectIpoAllocation;
                        this.this$0.getCallbacks().onLoadAllocationSuccess(uiModel);
                        return Unit.INSTANCE;
                    }
                    ResultKt.throwOnFailure(obj);
                    apiDirectIpoAllocation = (ApiDirectIpoAllocation) obj;
                }
                uiModel = apiDirectIpoAllocation.toUiModel();
                if (uiModel instanceof UiDirectIpoAllocation.Allocated) {
                    CoroutineDispatcher io2 = Dispatchers.getIO();
                    C498521 c498521 = new C498521(this.this$0, uiModel, null);
                    this.L$0 = uiModel;
                    this.label = 3;
                    if (BuildersKt.withContext(io2, c498521, this) != coroutine_suspended) {
                        uiDirectIpoAllocation = uiModel;
                        uiModel = uiDirectIpoAllocation;
                        this.this$0.getCallbacks().onLoadAllocationSuccess(uiModel);
                        return Unit.INSTANCE;
                    }
                    return coroutine_suspended;
                }
                if (uiModel instanceof UiDirectIpoAllocation.NotAllocated) {
                    Unit unit = Unit.INSTANCE;
                    this.this$0.getCallbacks().onLoadAllocationSuccess(uiModel);
                    return Unit.INSTANCE;
                }
                throw new NoWhenBranchMatchedException();
            }

            /* compiled from: DirectIpoAllocationLoadingFragment.kt */
            @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a&\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002 \u0003*\u0012\u0012\f\u0012\n \u0003*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00010\u0001*\u00020\u0004H\n"}, m3636d2 = {"<anonymous>", "Lcom/airbnb/lottie/LottieResult;", "Lcom/airbnb/lottie/LottieComposition;", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$onViewCreated$1$1$1", m3645f = "DirectIpoAllocationLoadingFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$onViewCreated$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C498521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super LottieResult<LottieComposition>>, Object> {
                final /* synthetic */ UiDirectIpoAllocation $allocation;
                int label;
                final /* synthetic */ DirectIpoAllocationLoadingFragment this$0;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C498521(DirectIpoAllocationLoadingFragment directIpoAllocationLoadingFragment, UiDirectIpoAllocation uiDirectIpoAllocation, Continuation<? super C498521> continuation) {
                    super(2, continuation);
                    this.this$0 = directIpoAllocationLoadingFragment;
                    this.$allocation = uiDirectIpoAllocation;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    return new C498521(this.this$0, this.$allocation, continuation);
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(CoroutineScope coroutineScope, Continuation<? super LottieResult<LottieComposition>> continuation) {
                    return ((C498521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return LottieCompositionFactory.fromUrlSync(this.this$0.getContext(), ((UiDirectIpoAllocation.Allocated) this.$allocation).getAnimationUrl().getUrl());
                }
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = DirectIpoAllocationLoadingFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = Lifecycle.State.STARTED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DirectIpoAllocationLoadingFragment.this, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return Unit.INSTANCE;
        }
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1917912066);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1917912066, i, -1, "com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment.ComposeContent (DirectIpoAllocationLoadingFragment.kt:77)");
            }
            LoadingScreenComposablesKt.ListLoadingScreenComposable(WindowInsetsPadding_androidKt.navigationBarsPadding(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE)), true, true, 1, composerStartRestartGroup, 3504, 0);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.directipo.allocation.ui.DirectIpoAllocationLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return DirectIpoAllocationLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* compiled from: DirectIpoAllocationLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/ui/DirectIpoAllocationLoadingFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyIntentKey$DirectIpoAllocation;", "<init>", "()V", "feature-direct-ipo-allocation_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoAllocationLoadingFragment, LegacyIntentKey.DirectIpoAllocation> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyIntentKey.DirectIpoAllocation getArgs(DirectIpoAllocationLoadingFragment directIpoAllocationLoadingFragment) {
            return (LegacyIntentKey.DirectIpoAllocation) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoAllocationLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoAllocationLoadingFragment newInstance(LegacyIntentKey.DirectIpoAllocation directIpoAllocation) {
            return (DirectIpoAllocationLoadingFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, directIpoAllocation);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoAllocationLoadingFragment directIpoAllocationLoadingFragment, LegacyIntentKey.DirectIpoAllocation directIpoAllocation) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoAllocationLoadingFragment, directIpoAllocation);
        }
    }
}
