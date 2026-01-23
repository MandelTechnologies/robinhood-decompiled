package com.robinhood.android.crypto.p094ui.detaillist;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.crypto.C12757R;
import com.robinhood.android.crypto.databinding.FragmentCryptoDetailListBinding;
import com.robinhood.android.crypto.p094ui.detail.CryptoDetailFragment;
import com.robinhood.android.designsystem.style.DirectionOverlay;
import com.robinhood.android.regiongate.CryptoDetailRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.crypto.p315ui.UiCurrencyPair;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.shared.crypto.contracts.detail.CryptoDetailFragmentKey;
import com.robinhood.userleap.SurveyManager3;
import com.robinhood.userleap.survey.Survey;
import com.robinhood.utils.extensions.FragmentManagers;
import com.robinhood.utils.extensions.FragmentManagers2;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import dispatch.core.Flow7;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: CryptoDetailListFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 :2\u00020\u00012\u00020\u0002:\u00029:B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020#H\u0016J\u001a\u0010$\u001a\u00020!2\u0006\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010(H\u0016J\u0010\u0010)\u001a\u00020!2\u0006\u0010*\u001a\u00020+H\u0002J\n\u0010,\u001a\u0004\u0018\u00010-H\u0016J\n\u0010.\u001a\u0004\u0018\u00010/H\u0002J\u000e\u00100\u001a\b\u0012\u0004\u0012\u00020/01H\u0002J\b\u00102\u001a\u00020!H\u0002J\t\u00103\u001a\u00020\u0010H\u0096\u0001R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\fX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u0010X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0018\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0018\u00104\u001a\b\u0012\u0004\u0012\u00020605X\u0096\u0005¢\u0006\u0006\u001a\u0004\b7\u00108¨\u0006;"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "<init>", "()V", "userLeapManager", "Lcom/robinhood/userleap/UserLeapManager;", "getUserLeapManager", "()Lcom/robinhood/userleap/UserLeapManager;", "setUserLeapManager", "(Lcom/robinhood/userleap/UserLeapManager;)V", "screenName", "", "getScreenName", "()Ljava/lang/String;", "isParentScreen", "", "()Z", "binding", "Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailListBinding;", "getBinding", "()Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListDuxo;", "getDuxo", "()Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "adapter", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListAdapter;", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", "viewState", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListViewState;", "getCurrentFragment", "Landroidx/fragment/app/Fragment;", "findCurrentFragment", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment;", "findCurrentFragmentFlow", "Lkotlinx/coroutines/flow/Flow;", "maybeLaunchPriceAlertSurvey", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Args", "Companion", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class CryptoDetailListFragment extends BaseFragment implements RegionGated {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private CryptoDetailListAdapter adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final boolean isParentScreen;
    private final String screenName;
    public SurveyManager3 userLeapManager;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(CryptoDetailListFragment.class, "binding", "getBinding()Lcom/robinhood/android/crypto/databinding/FragmentCryptoDetailListBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public CryptoDetailListFragment() {
        super(C12757R.layout.fragment_crypto_detail_list);
        this.$$delegate_0 = new RegionGated2(CryptoDetailRegionGate.INSTANCE);
        this.screenName = "ForexDetailListFragment";
        this.isParentScreen = true;
        this.binding = ViewBinding5.viewBinding(this, CryptoDetailListFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, CryptoDetailListDuxo.class);
    }

    public final SurveyManager3 getUserLeapManager() {
        SurveyManager3 surveyManager3 = this.userLeapManager;
        if (surveyManager3 != null) {
            return surveyManager3;
        }
        Intrinsics.throwUninitializedPropertyAccessException("userLeapManager");
        return null;
    }

    public final void setUserLeapManager(SurveyManager3 surveyManager3) {
        Intrinsics.checkNotNullParameter(surveyManager3, "<set-?>");
        this.userLeapManager = surveyManager3;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: isParentScreen, reason: from getter */
    public boolean getIsParentScreen() {
        return this.isParentScreen;
    }

    private final FragmentCryptoDetailListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentCryptoDetailListBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoDetailListDuxo getDuxo() {
        return (CryptoDetailListDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.adapter = new CryptoDetailListAdapter(this, null, 2, null);
        ViewPager2 viewPager2 = getBinding().cryptoViewPager;
        CryptoDetailListAdapter cryptoDetailListAdapter = this.adapter;
        if (cryptoDetailListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            cryptoDetailListAdapter = null;
        }
        viewPager2.setAdapter(cryptoDetailListAdapter);
        ViewPager2 cryptoViewPager = getBinding().cryptoViewPager;
        Intrinsics.checkNotNullExpressionValue(cryptoViewPager, "cryptoViewPager");
        LifecycleHost.DefaultImpls.bind$default(this, CryptoDetailListAdapter2.observeCurrentPosition(cryptoViewPager), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CryptoDetailListFragment.onViewCreated$lambda$1(this.f$0, ((Integer) obj).intValue());
            }
        });
        maybeLaunchPriceAlertSurvey();
        BaseFragment.collectDuxoState$default(this, null, new C135322(view, null), 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(CryptoDetailListFragment cryptoDetailListFragment, int i) {
        cryptoDetailListFragment.getDuxo().setPagerPosition(i);
        return Unit.INSTANCE;
    }

    /* compiled from: CryptoDetailListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2", m3645f = "CryptoDetailListFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2 */
    static final class C135322 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ View $view;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C135322(View view, Continuation<? super C135322> continuation) {
            super(2, continuation);
            this.$view = view;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135322 c135322 = CryptoDetailListFragment.this.new C135322(this.$view, continuation);
            c135322.L$0 = obj;
            return c135322;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C135322) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: CryptoDetailListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$1", m3645f = "CryptoDetailListFragment.kt", m3646l = {76}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ CryptoDetailListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(CryptoDetailListFragment cryptoDetailListFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailListFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: CryptoDetailListFragment.kt */
            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$1$1, reason: invalid class name and collision with other inner class name */
            /* synthetic */ class C498041 implements FlowCollector, FunctionAdapter {
                final /* synthetic */ CryptoDetailListFragment $tmp0;

                C498041(CryptoDetailListFragment cryptoDetailListFragment) {
                    this.$tmp0 = cryptoDetailListFragment;
                }

                public final boolean equals(Object obj) {
                    if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                        return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.FunctionAdapter
                public final Function<?> getFunctionDelegate() {
                    return new AdaptedFunctionReference(2, this.$tmp0, CryptoDetailListFragment.class, "bind", "bind(Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListViewState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }

                public final Object emit(CryptoDetailListViewState cryptoDetailListViewState, Continuation<? super Unit> continuation) {
                    Object objInvokeSuspend$bind = AnonymousClass1.invokeSuspend$bind(this.$tmp0, cryptoDetailListViewState, continuation);
                    return objInvokeSuspend$bind == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$bind : Unit.INSTANCE;
                }

                @Override // kotlinx.coroutines.flow.FlowCollector
                public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                    return emit((CryptoDetailListViewState) obj, (Continuation<? super Unit>) continuation);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    StateFlow<CryptoDetailListViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    C498041 c498041 = new C498041(this.this$0);
                    this.label = 1;
                    if (stateFlow.collect(c498041, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                throw new ExceptionsH();
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final /* synthetic */ Object invokeSuspend$bind(CryptoDetailListFragment cryptoDetailListFragment, CryptoDetailListViewState cryptoDetailListViewState, Continuation continuation) {
                cryptoDetailListFragment.bind(cryptoDetailListViewState);
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(CryptoDetailListFragment.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(CryptoDetailListFragment.this, this.$view, null), 3, null);
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: CryptoDetailListFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$2", m3645f = "CryptoDetailListFragment.kt", m3646l = {85}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ View $view;
            int label;
            final /* synthetic */ CryptoDetailListFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(CryptoDetailListFragment cryptoDetailListFragment, View view, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = cryptoDetailListFragment;
                this.$view = view;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, this.$view, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    final StateFlow<CryptoDetailListViewState> stateFlow = this.this$0.getDuxo().getStateFlow();
                    Flow flowTransformLatest = FlowKt.transformLatest(FlowKt.transformLatest(FlowKt.distinctUntilChanged(new Flow<Integer>() { // from class: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoDetailListFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$onViewCreated$2$2$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector) {
                                this.$this_unsafeFlow = flowCollector;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    Integer pagePosition = ((CryptoDetailListViewState) obj).getPagePosition();
                                    if (pagePosition != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(pagePosition, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }

                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super Integer> flowCollector, Continuation continuation) {
                            Object objCollect = stateFlow.collect(new AnonymousClass2(flowCollector), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }
                    }), new C13528x8636e202(null, this.this$0)), new C13529x8636e203(null));
                    final View view = this.$view;
                    FlowCollector flowCollector = new FlowCollector() { // from class: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment.onViewCreated.2.2.4
                        @Override // kotlinx.coroutines.flow.FlowCollector
                        public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                            return emit((DirectionOverlay) obj2, (Continuation<? super Unit>) continuation);
                        }

                        public final Object emit(DirectionOverlay directionOverlay, Continuation<? super Unit> continuation) {
                            ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(view), directionOverlay, null, 2, null);
                            return Unit.INSTANCE;
                        }
                    };
                    this.label = 1;
                    if (flowTransformLatest.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bind(CryptoDetailListViewState viewState) {
        CryptoDetailListAdapter cryptoDetailListAdapter = this.adapter;
        if (cryptoDetailListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            cryptoDetailListAdapter = null;
        }
        cryptoDetailListAdapter.submitList(viewState.getViewPagerListItems());
        Integer pagePosition = viewState.getPagePosition();
        if (pagePosition != null) {
            getBinding().cryptoViewPager.setCurrentItem(pagePosition.intValue(), false);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost
    public Fragment getCurrentFragment() {
        return findCurrentFragment();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final CryptoDetailFragment findCurrentFragment() {
        CryptoDetailListAdapter cryptoDetailListAdapter = this.adapter;
        Object obj = null;
        if (cryptoDetailListAdapter == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            cryptoDetailListAdapter = null;
        }
        if (cryptoDetailListAdapter.getSize() == 0) {
            return null;
        }
        int currentItem = getBinding().cryptoViewPager.getCurrentItem();
        CryptoDetailListAdapter cryptoDetailListAdapter2 = this.adapter;
        if (cryptoDetailListAdapter2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("adapter");
            cryptoDetailListAdapter2 = null;
        }
        UiCurrencyPair uiCurrencyPairAtPosition = cryptoDetailListAdapter2.getUiCurrencyPairAtPosition(currentItem);
        List<Fragment> fragments = getChildFragmentManager().getFragments();
        Intrinsics.checkNotNullExpressionValue(fragments, "getFragments(...)");
        Sequence sequenceFilter = SequencesKt.filter(CollectionsKt.asSequence(fragments), new Function1<Object, Boolean>() { // from class: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$findCurrentFragment$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj2) {
                return Boolean.valueOf(obj2 instanceof CryptoDetailFragment);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        Iterator itIterator2 = sequenceFilter.iterator2();
        while (true) {
            if (!itIterator2.hasNext()) {
                break;
            }
            Object next = itIterator2.next();
            if (Intrinsics.areEqual(((CryptoDetailFragment) next).getUiCurrencyPair$feature_crypto_externalDebug().getId(), uiCurrencyPairAtPosition.getId())) {
                obj = next;
                break;
            }
        }
        return (CryptoDetailFragment) obj;
    }

    /* compiled from: CryptoDetailListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00030\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/flow/FlowCollector;", "Lcom/robinhood/android/crypto/ui/detail/CryptoDetailFragment;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$findCurrentFragmentFlow$1", m3645f = "CryptoDetailListFragment.kt", m3646l = {117, 117}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$findCurrentFragmentFlow$1 */
    static final class C135311 extends ContinuationImpl7 implements Function2<FlowCollector<? super CryptoDetailFragment>, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C135311(Continuation<? super C135311> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C135311 c135311 = CryptoDetailListFragment.this.new C135311(continuation);
            c135311.L$0 = obj;
            return c135311;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(FlowCollector<? super CryptoDetailFragment> flowCollector, Continuation<? super Unit> continuation) {
            return ((C135311) create(flowCollector, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r7.emit(r1, r6) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x005d, code lost:
        
            if (kotlinx.coroutines.flow.FlowKt.emitAll(r7, r1, r6) == r0) goto L18;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x005f, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i != 0) {
                if (i == 1) {
                } else if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            } else {
                ResultKt.throwOnFailure(obj);
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CryptoDetailFragment cryptoDetailFragmentFindCurrentFragment = CryptoDetailListFragment.this.findCurrentFragment();
                if (cryptoDetailFragmentFindCurrentFragment != null) {
                    this.L$0 = flowCollector;
                    this.label = 1;
                } else {
                    FragmentManager childFragmentManager = CryptoDetailListFragment.this.getChildFragmentManager();
                    Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
                    final Flow<FragmentManagers> flowFragmentLifecycleEventsFlow = FragmentManagers2.fragmentLifecycleEventsFlow(childFragmentManager, false);
                    final CryptoDetailListFragment cryptoDetailListFragment = CryptoDetailListFragment.this;
                    Flow flowTake = FlowKt.take(new Flow<CryptoDetailFragment>() { // from class: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$findCurrentFragmentFlow$1$invokeSuspend$$inlined$mapNotNull$1
                        @Override // kotlinx.coroutines.flow.Flow
                        public Object collect(FlowCollector<? super CryptoDetailFragment> flowCollector2, Continuation continuation) {
                            Object objCollect = flowFragmentLifecycleEventsFlow.collect(new AnonymousClass2(flowCollector2, cryptoDetailListFragment), continuation);
                            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : Unit.INSTANCE;
                        }

                        /* compiled from: Emitters.kt */
                        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                        @SourceDebugExtension
                        /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$findCurrentFragmentFlow$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                        public static final class AnonymousClass2<T> implements FlowCollector {
                            final /* synthetic */ FlowCollector $this_unsafeFlow;
                            final /* synthetic */ CryptoDetailListFragment this$0;

                            @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
                            @DebugMetadata(m3644c = "com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$findCurrentFragmentFlow$1$invokeSuspend$$inlined$mapNotNull$1$2", m3645f = "CryptoDetailListFragment.kt", m3646l = {52}, m3647m = "emit")
                            /* renamed from: com.robinhood.android.crypto.ui.detaillist.CryptoDetailListFragment$findCurrentFragmentFlow$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                            public static final class AnonymousClass1 extends ContinuationImpl {
                                Object L$0;
                                int label;
                                /* synthetic */ Object result;

                                public AnonymousClass1(Continuation continuation) {
                                    super(continuation);
                                }

                                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                                public final Object invokeSuspend(Object obj) {
                                    this.result = obj;
                                    this.label |= Integer.MIN_VALUE;
                                    return AnonymousClass2.this.emit(null, this);
                                }
                            }

                            public AnonymousClass2(FlowCollector flowCollector, CryptoDetailListFragment cryptoDetailListFragment) {
                                this.$this_unsafeFlow = flowCollector;
                                this.this$0 = cryptoDetailListFragment;
                            }

                            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                            @Override // kotlinx.coroutines.flow.FlowCollector
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                            */
                            public final Object emit(Object obj, Continuation continuation) {
                                AnonymousClass1 anonymousClass1;
                                if (continuation instanceof AnonymousClass1) {
                                    anonymousClass1 = (AnonymousClass1) continuation;
                                    int i = anonymousClass1.label;
                                    if ((i & Integer.MIN_VALUE) != 0) {
                                        anonymousClass1.label = i - Integer.MIN_VALUE;
                                    } else {
                                        anonymousClass1 = new AnonymousClass1(continuation);
                                    }
                                }
                                Object obj2 = anonymousClass1.result;
                                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                                int i2 = anonymousClass1.label;
                                if (i2 == 0) {
                                    ResultKt.throwOnFailure(obj2);
                                    FlowCollector flowCollector = this.$this_unsafeFlow;
                                    CryptoDetailFragment cryptoDetailFragmentFindCurrentFragment = this.this$0.findCurrentFragment();
                                    if (cryptoDetailFragmentFindCurrentFragment != null) {
                                        anonymousClass1.label = 1;
                                        if (flowCollector.emit(cryptoDetailFragmentFindCurrentFragment, anonymousClass1) == coroutine_suspended) {
                                            return coroutine_suspended;
                                        }
                                    }
                                } else {
                                    if (i2 != 1) {
                                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                    }
                                    ResultKt.throwOnFailure(obj2);
                                }
                                return Unit.INSTANCE;
                            }
                        }
                    }, 1);
                    this.L$0 = null;
                    this.label = 2;
                }
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Flow<CryptoDetailFragment> findCurrentFragmentFlow() {
        return Flow7.flowOnMainImmediate(FlowKt.flow(new C135311(null)));
    }

    private final void maybeLaunchPriceAlertSurvey() {
        if (Intrinsics.areEqual(requireBaseActivity().getDeeplinkNotificationType(), "crypto_price_movement")) {
            getUserLeapManager().presentSurveyIfNecessary(this, Survey.FIVE_SEC_CRYPTO_ALERT_CDP);
        }
    }

    /* compiled from: CryptoDetailListFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListFragment$Args;", "Landroid/os/Parcelable;", "cryptoDetailFragmentKey", "Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailFragmentKey;", "<init>", "(Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailFragmentKey;)V", "getCryptoDetailFragmentKey", "()Lcom/robinhood/shared/crypto/contracts/detail/CryptoDetailFragmentKey;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final CryptoDetailFragmentKey cryptoDetailFragmentKey;

        /* compiled from: CryptoDetailListFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((CryptoDetailFragmentKey) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, CryptoDetailFragmentKey cryptoDetailFragmentKey, int i, Object obj) {
            if ((i & 1) != 0) {
                cryptoDetailFragmentKey = args.cryptoDetailFragmentKey;
            }
            return args.copy(cryptoDetailFragmentKey);
        }

        /* renamed from: component1, reason: from getter */
        public final CryptoDetailFragmentKey getCryptoDetailFragmentKey() {
            return this.cryptoDetailFragmentKey;
        }

        public final Args copy(CryptoDetailFragmentKey cryptoDetailFragmentKey) {
            Intrinsics.checkNotNullParameter(cryptoDetailFragmentKey, "cryptoDetailFragmentKey");
            return new Args(cryptoDetailFragmentKey);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.cryptoDetailFragmentKey, ((Args) other).cryptoDetailFragmentKey);
        }

        public int hashCode() {
            return this.cryptoDetailFragmentKey.hashCode();
        }

        public String toString() {
            return "Args(cryptoDetailFragmentKey=" + this.cryptoDetailFragmentKey + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.cryptoDetailFragmentKey, flags);
        }

        public Args(CryptoDetailFragmentKey cryptoDetailFragmentKey) {
            Intrinsics.checkNotNullParameter(cryptoDetailFragmentKey, "cryptoDetailFragmentKey");
            this.cryptoDetailFragmentKey = cryptoDetailFragmentKey;
        }

        public final CryptoDetailFragmentKey getCryptoDetailFragmentKey() {
            return this.cryptoDetailFragmentKey;
        }
    }

    /* compiled from: CryptoDetailListFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListFragment;", "Lcom/robinhood/android/crypto/ui/detaillist/CryptoDetailListFragment$Args;", "<init>", "()V", "feature-crypto_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<CryptoDetailListFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(CryptoDetailListFragment cryptoDetailListFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, cryptoDetailListFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public CryptoDetailListFragment newInstance(Args args) {
            return (CryptoDetailListFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(CryptoDetailListFragment cryptoDetailListFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, cryptoDetailListFragment, args);
        }
    }
}
