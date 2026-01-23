package com.robinhood.android.acatsin.brokeragesearch;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.DiffUtil;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.jakewharton.rxbinding3.widget.RxTextView;
import com.robinhood.android.acatsin.AcatsInActivity;
import com.robinhood.android.acatsin.C7725R;
import com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchContract;
import com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchEvent;
import com.robinhood.android.acatsin.databinding.FragmentAcatsInBrokerageSearchBinding;
import com.robinhood.android.acatsin.p058ui.AcatsFlowStepFragment3;
import com.robinhood.android.acatsin.util.AcatsFlowStep;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ShimmerLoadingView;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.banner.RdsInfoBannerView;
import com.robinhood.android.designsystem.textinput.RdsTextInputEditText;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.rhimage.ImageLoader;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiBrokerage;
import com.robinhood.models.p320db.IacInfoBanner;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.shared.iac.extensions.IacInfoBanners;
import com.robinhood.shared.iac.infobanner.InfoBannerCallbacks;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.view.Inflater;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.CompositeAdapter;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericViewHolder;
import com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.ExceptionsH;
import kotlin.Function;
import kotlin.Lazy;
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
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: AcatsInBrokerageSearchFragment.kt */
@Metadata(m3635d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0002'*\b\u0007\u0018\u0000 G2\u00020\u00012\u00020\u0002:\u0001GB\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010:\u001a\u00020\u001f2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\u001a\u0010=\u001a\u00020\u001f2\u0006\u0010>\u001a\u00020\u001e2\b\u0010;\u001a\u0004\u0018\u00010<H\u0016J\b\u0010?\u001a\u00020@H\u0016J\u0010\u0010A\u001a\u00020\u001f2\u0006\u0010B\u001a\u00020CH\u0002J\u000e\u0010D\u001a\u00020\u001f2\u0006\u0010E\u001a\u00020FR\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\bR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\n\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0016\u001a\u00020\u0017X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u001f0\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010 \u001a\u00020!X\u0080.¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0010\u0010&\u001a\u00020'X\u0082\u0004¢\u0006\u0004\n\u0002\u0010(R\u0010\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0004\n\u0002\u0010+R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00102\u001a\u0002038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u00106\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006H"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchFragment;", "Lcom/robinhood/android/acatsin/ui/BaseAcatsFlowStepFragment;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInBrokerageSearchBinding;", "getBinding", "()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInBrokerageSearchBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo;", "getDuxo", "()Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "callbacks", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Callbacks;", "callbacks$delegate", "compositeAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "getCompositeAdapter", "()Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;", "setCompositeAdapter", "(Lcom/robinhood/utils/ui/view/recyclerview/CompositeAdapter;)V", "anchorAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/SingleItemAdapter;", "Landroid/view/View;", "", "brokerageAdapter", "Lcom/robinhood/android/acatsin/brokeragesearch/BrokerageAdapter;", "getBrokerageAdapter$feature_acats_in_externalDebug", "()Lcom/robinhood/android/acatsin/brokeragesearch/BrokerageAdapter;", "setBrokerageAdapter$feature_acats_in_externalDebug", "(Lcom/robinhood/android/acatsin/brokeragesearch/BrokerageAdapter;)V", "cantFindBrokerageAdapter", "com/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchFragment$cantFindBrokerageAdapter$1", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchFragment$cantFindBrokerageAdapter$1;", "iacInfoBannerCallbacks", "com/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchFragment$iacInfoBannerCallbacks$1", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchFragment$iacInfoBannerCallbacks$1;", "imageLoader", "Lcom/robinhood/android/rhimage/ImageLoader;", "getImageLoader", "()Lcom/robinhood/android/rhimage/ImageLoader;", "setImageLoader", "(Lcom/robinhood/android/rhimage/ImageLoader;)V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "screenEventContext", "Lcom/robinhood/rosetta/eventlogging/Context;", "getScreenEventContext", "()Lcom/robinhood/rosetta/eventlogging/Context;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "onBackPressed", "", "setState", "state", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchViewState;", "handleEvent", "event", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchEvent;", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes24.dex */
public final class AcatsInBrokerageSearchFragment extends AcatsFlowStepFragment3 implements AutoLoggableFragment {
    private final SingleItemAdapter<View, Unit> anchorAdapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public BrokerageAdapter brokerageAdapter;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    private final AcatsInBrokerageSearchFragment3 cantFindBrokerageAdapter;
    public CompositeAdapter compositeAdapter;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private final AcatsInBrokerageSearchFragment5 iacInfoBannerCallbacks;
    public ImageLoader imageLoader;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AcatsInBrokerageSearchFragment.class, "binding", "getBinding()Lcom/robinhood/android/acatsin/databinding/FragmentAcatsInBrokerageSearchBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AcatsInBrokerageSearchFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenAppearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenAppearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenDisappearEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenDisappearEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public boolean getExcludeFromAutoScreenSourceEventLogging() {
        return AutoLoggableFragment.DefaultImpls.getExcludeFromAutoScreenSourceEventLogging(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Component getScreenEventComponent() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventComponent(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    /* JADX WARN: Type inference failed for: r1v9, types: [com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$iacInfoBannerCallbacks$1] */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$cantFindBrokerageAdapter$1] */
    public AcatsInBrokerageSearchFragment() {
        super(C7725R.layout.fragment_acats_in_brokerage_search, null, AcatsFlowStep.BROKERAGE_SEARCH, 2, null);
        this.binding = ViewBinding5.viewBinding(this, AcatsInBrokerageSearchFragment2.INSTANCE);
        this.duxo = DuxosKt.duxo(this, AcatsInBrokerageSearchDuxo.class);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(AcatsInBrokerageSearchContract.Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$special$$inlined$hostActivityCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
                Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
                for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                    if (context instanceof AcatsInBrokerageSearchContract.Callbacks) {
                        return context;
                    }
                }
                throw new NoSuchElementException("Sequence contains no element matching the predicate.");
            }
        });
        this.anchorAdapter = SingleItemAdapter.Companion.ofUnit$default(SingleItemAdapter.INSTANCE, C7725R.layout.row_anchor, (DiffUtil.ItemCallback) null, (Function1) null, 6, (Object) null);
        final Inflater inflaterInclude = Inflater.INSTANCE.include(C7725R.layout.row_cant_find_broker);
        final DiffCallbacks.Single single = DiffCallbacks.Single.INSTANCE;
        this.cantFindBrokerageAdapter = new SingleItemAdapter<View, Unit>(inflaterInclude, single) { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$cantFindBrokerageAdapter$1
            {
                setData(Unit.INSTANCE);
            }

            @Override // com.robinhood.utils.p409ui.view.recyclerview.SingleItemAdapter
            public /* bridge */ /* synthetic */ void onBindViewHolder(GenericViewHolder genericViewHolder, Unit unit) {
                onBindViewHolder2((GenericViewHolder<? extends View>) genericViewHolder, unit);
            }

            /* renamed from: onBindViewHolder, reason: avoid collision after fix types in other method */
            protected void onBindViewHolder2(GenericViewHolder<? extends View> holder, Unit item) {
                Intrinsics.checkNotNullParameter(holder, "holder");
                Intrinsics.checkNotNullParameter(item, "item");
                super.onBindViewHolder(holder, (GenericViewHolder<? extends View>) item);
                OnClickListeners.onClick(holder.getView(), new AcatsInBrokerageSearchFragment4(this.this$0.getDuxo()));
            }
        };
        this.iacInfoBannerCallbacks = new InfoBannerCallbacks() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$iacInfoBannerCallbacks$1
            @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
            public void onClickInfoBanner(IacInfoBanner banner) {
                Intrinsics.checkNotNullParameter(banner, "banner");
                GenericAction ctaAction = banner.getCtaAction();
                if (ctaAction instanceof GenericAction.DeeplinkAction) {
                    Navigator navigator = this.this$0.getNavigator();
                    Context contextRequireContext = this.this$0.requireContext();
                    Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                    GenericAction.DeeplinkAction deeplinkAction = (GenericAction.DeeplinkAction) ctaAction;
                    Navigator.DefaultImpls.handleDeepLink$default(navigator, contextRequireContext, deeplinkAction.getUri(), Boolean.FALSE, null, false, null, 56, null);
                    AcatsInBrokerageSearchDuxo duxo = this.this$0.getDuxo();
                    UUID receiptUuid = banner.getReceiptUuid();
                    String string2 = deeplinkAction.getUri().toString();
                    Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
                    duxo.onBannerClicked(receiptUuid, string2);
                }
            }

            @Override // com.robinhood.shared.iac.infobanner.InfoBannerCallbacks
            public void onDismissInfoBanner(IacInfoBanner banner) {
                Intrinsics.checkNotNullParameter(banner, "banner");
                this.this$0.getDuxo().onBannerDismissed(banner.getReceiptUuid());
            }
        };
    }

    private final FragmentAcatsInBrokerageSearchBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAcatsInBrokerageSearchBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AcatsInBrokerageSearchDuxo getDuxo() {
        return (AcatsInBrokerageSearchDuxo) this.duxo.getValue();
    }

    private final AcatsInBrokerageSearchContract.Callbacks getCallbacks() {
        return (AcatsInBrokerageSearchContract.Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    public final CompositeAdapter getCompositeAdapter() {
        CompositeAdapter compositeAdapter = this.compositeAdapter;
        if (compositeAdapter != null) {
            return compositeAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("compositeAdapter");
        return null;
    }

    public final void setCompositeAdapter(CompositeAdapter compositeAdapter) {
        Intrinsics.checkNotNullParameter(compositeAdapter, "<set-?>");
        this.compositeAdapter = compositeAdapter;
    }

    public final BrokerageAdapter getBrokerageAdapter$feature_acats_in_externalDebug() {
        BrokerageAdapter brokerageAdapter = this.brokerageAdapter;
        if (brokerageAdapter != null) {
            return brokerageAdapter;
        }
        Intrinsics.throwUninitializedPropertyAccessException("brokerageAdapter");
        return null;
    }

    public final void setBrokerageAdapter$feature_acats_in_externalDebug(BrokerageAdapter brokerageAdapter) {
        Intrinsics.checkNotNullParameter(brokerageAdapter, "<set-?>");
        this.brokerageAdapter = brokerageAdapter;
    }

    public final ImageLoader getImageLoader() {
        ImageLoader imageLoader = this.imageLoader;
        if (imageLoader != null) {
            return imageLoader;
        }
        Intrinsics.throwUninitializedPropertyAccessException("imageLoader");
        return null;
    }

    public final void setImageLoader(ImageLoader imageLoader) {
        Intrinsics.checkNotNullParameter(imageLoader, "<set-?>");
        this.imageLoader = imageLoader;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.ACATS_IN_SELECT_BROKERAGE, ((AcatsInBrokerageSearchContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().getSource(), null, null, 12, null);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public com.robinhood.rosetta.eventlogging.Context getScreenEventContext() {
        return ((AcatsInBrokerageSearchContract.Key) INSTANCE.getArgs((Fragment) this)).getScreenContext().toEventContext();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setBrokerageAdapter$feature_acats_in_externalDebug(new BrokerageAdapter(getImageLoader(), new C78331(getDuxo())));
        setCompositeAdapter(new CompositeAdapter((RecyclerView.Adapter<?>[]) new RecyclerView.Adapter[]{this.anchorAdapter, getBrokerageAdapter$feature_acats_in_externalDebug(), this.cantFindBrokerageAdapter}));
    }

    /* compiled from: AcatsInBrokerageSearchFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onCreate$1 */
    /* synthetic */ class C78331 extends FunctionReferenceImpl implements Function1<ApiBrokerage, Unit> {
        C78331(Object obj) {
            super(1, obj, AcatsInBrokerageSearchDuxo.class, "onBrokerageSelected", "onBrokerageSelected(Lcom/robinhood/models/api/bonfire/ApiBrokerage;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(ApiBrokerage apiBrokerage) {
            invoke2(apiBrokerage);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(ApiBrokerage p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AcatsInBrokerageSearchDuxo) this.receiver).onBrokerageSelected(p0);
        }
    }

    /* compiled from: AcatsInBrokerageSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onViewCreated$1", m3645f = "AcatsInBrokerageSearchFragment.kt", m3646l = {112}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onViewCreated$1 */
    static final class C78341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C78341(Continuation<? super C78341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInBrokerageSearchFragment.this.new C78341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: AcatsInBrokerageSearchFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onViewCreated$1$1, reason: invalid class name */
        /* synthetic */ class AnonymousClass1 implements FlowCollector, FunctionAdapter {
            final /* synthetic */ AcatsInBrokerageSearchFragment $tmp0;

            AnonymousClass1(AcatsInBrokerageSearchFragment acatsInBrokerageSearchFragment) {
                this.$tmp0 = acatsInBrokerageSearchFragment;
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof FlowCollector) && (obj instanceof FunctionAdapter)) {
                    return Intrinsics.areEqual(getFunctionDelegate(), ((FunctionAdapter) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.FunctionAdapter
            public final Function<?> getFunctionDelegate() {
                return new AdaptedFunctionReference(2, this.$tmp0, AcatsInBrokerageSearchFragment.class, "setState", "setState(Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchViewState;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(AcatsInBrokerageSearchViewState acatsInBrokerageSearchViewState, Continuation<? super Unit> continuation) {
                Object objInvokeSuspend$setState = C78341.invokeSuspend$setState(this.$tmp0, acatsInBrokerageSearchViewState, continuation);
                return objInvokeSuspend$setState == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objInvokeSuspend$setState : Unit.INSTANCE;
            }

            @Override // kotlinx.coroutines.flow.FlowCollector
            public /* bridge */ /* synthetic */ Object emit(Object obj, Continuation continuation) {
                return emit((AcatsInBrokerageSearchViewState) obj, (Continuation<? super Unit>) continuation);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$setState(AcatsInBrokerageSearchFragment acatsInBrokerageSearchFragment, AcatsInBrokerageSearchViewState acatsInBrokerageSearchViewState, Continuation continuation) {
            acatsInBrokerageSearchFragment.setState(acatsInBrokerageSearchViewState);
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<AcatsInBrokerageSearchViewState> stateFlow = AcatsInBrokerageSearchFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(AcatsInBrokerageSearchFragment.this);
                this.label = 1;
                if (stateFlow.collect(anonymousClass1, this) == coroutine_suspended) {
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
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C78341(null), 1, null);
        BaseFragment.collectDuxoState$default(this, null, new C78352(null), 1, null);
        RdsTextInputEditText searchToolbarEdt = getBinding().searchToolbarEdt;
        Intrinsics.checkNotNullExpressionValue(searchToolbarEdt, "searchToolbarEdt");
        LifecycleHost.DefaultImpls.bind$default(this, RxTextView.textChanges(searchToolbarEdt), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C78363(getDuxo()));
        RecyclerView recyclerView = getBinding().recyclerview;
        Intrinsics.checkNotNull(recyclerView);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(recyclerView, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        recyclerView.hasFixedSize();
        recyclerView.setLayoutManager(new LinearLayoutManager(requireContext()));
        recyclerView.setAdapter(getCompositeAdapter());
    }

    /* compiled from: AcatsInBrokerageSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onViewCreated$2", m3645f = "AcatsInBrokerageSearchFragment.kt", m3646l = {114}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onViewCreated$2 */
    static final class C78352 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C78352(Continuation<? super C78352> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInBrokerageSearchFragment.this.new C78352(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78352) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<Event<AcatsInBrokerageSearchEvent>> eventFlow = AcatsInBrokerageSearchFragment.this.getDuxo().getEventFlow();
                final AcatsInBrokerageSearchFragment acatsInBrokerageSearchFragment = AcatsInBrokerageSearchFragment.this;
                FlowCollector<? super Event<AcatsInBrokerageSearchEvent>> flowCollector = new FlowCollector() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment.onViewCreated.2.1
                    @Override // kotlinx.coroutines.flow.FlowCollector
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, Continuation continuation) {
                        return emit((Event<AcatsInBrokerageSearchEvent>) obj2, (Continuation<? super Unit>) continuation);
                    }

                    public final Object emit(final Event<AcatsInBrokerageSearchEvent> event, Continuation<? super Unit> continuation) {
                        EventConsumer<AcatsInBrokerageSearchEvent> eventConsumerInvoke;
                        if (event != null) {
                            final AcatsInBrokerageSearchFragment acatsInBrokerageSearchFragment2 = acatsInBrokerageSearchFragment;
                            if ((event.getData() instanceof AcatsInBrokerageSearchEvent) && (eventConsumerInvoke = event.getGetEventConsumer().invoke()) != null) {
                                eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onViewCreated$2$1$emit$$inlined$consumeIfType$1
                                    @Override // kotlin.jvm.functions.Function1
                                    public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                        m10716invoke(obj2);
                                        return Unit.INSTANCE;
                                    }

                                    /* renamed from: invoke, reason: collision with other method in class */
                                    public final void m10716invoke(Object it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        acatsInBrokerageSearchFragment2.handleEvent((AcatsInBrokerageSearchEvent) event.getData());
                                    }
                                });
                            }
                        }
                        return Unit.INSTANCE;
                    }
                };
                this.label = 1;
                if (eventFlow.collect(flowCollector, this) == coroutine_suspended) {
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
    }

    /* compiled from: AcatsInBrokerageSearchFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.acatsin.brokeragesearch.AcatsInBrokerageSearchFragment$onViewCreated$3 */
    /* synthetic */ class C78363 extends FunctionReferenceImpl implements Function1<CharSequence, Unit> {
        C78363(Object obj) {
            super(1, obj, AcatsInBrokerageSearchDuxo.class, "onQueryUpdated", "onQueryUpdated(Ljava/lang/CharSequence;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(CharSequence charSequence) {
            invoke2(charSequence);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(CharSequence p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AcatsInBrokerageSearchDuxo) this.receiver).onQueryUpdated(p0);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public boolean onBackPressed() {
        Companion companion = INSTANCE;
        if (!((AcatsInBrokerageSearchContract.Key) companion.getArgs((Fragment) this)).getScreenContext().getIntroShown() && ((AcatsInBrokerageSearchContract.Key) companion.getArgs((Fragment) this)).getAvailableAccountsSkipped()) {
            requireBaseActivity().finish();
            return true;
        }
        return super.onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setState(AcatsInBrokerageSearchViewState state) {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            rhToolbar.setLoadingViewVisible(state.isCheckingAccountEligibility());
        }
        FragmentAcatsInBrokerageSearchBinding binding = getBinding();
        ShimmerLoadingView loadingView = binding.loadingView;
        Intrinsics.checkNotNullExpressionValue(loadingView, "loadingView");
        loadingView.setVisibility(state.getLoadingViewIsVisible() ? 0 : 8);
        RecyclerView recyclerview = binding.recyclerview;
        Intrinsics.checkNotNullExpressionValue(recyclerview, "recyclerview");
        recyclerview.setVisibility(state.getRecyclerViewIsVisible() ? 0 : 8);
        binding.recyclerview.setEnabled(!state.isCheckingAccountEligibility());
        binding.recyclerview.setAlpha(state.isCheckingAccountEligibility() ? 0.7f : 1.0f);
        RdsInfoBannerView iacInfoBannerView = binding.iacInfoBannerView;
        Intrinsics.checkNotNullExpressionValue(iacInfoBannerView, "iacInfoBannerView");
        IacInfoBanners.bindIacInfoBanner(iacInfoBannerView, state.getIacInfoBanner(), this.iacInfoBannerCallbacks);
        getBrokerageAdapter$feature_acats_in_externalDebug().submitList(state.getBrokerageList());
    }

    public final void handleEvent(AcatsInBrokerageSearchEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        if (event instanceof AcatsInBrokerageSearchEvent.Error) {
            AbsErrorHandler.handleError$default(getActivityErrorHandler(), ((AcatsInBrokerageSearchEvent.Error) event).getError(), false, 2, null);
            return;
        }
        if (event instanceof AcatsInBrokerageSearchEvent.BrokerageSelected) {
            getCallbacks().onBrokerageSelected(((AcatsInBrokerageSearchEvent.BrokerageSelected) event).getBrokerage());
            return;
        }
        if (Intrinsics.areEqual(event, AcatsInBrokerageSearchEvent.ManualEntryBrokerageEntrySelected.INSTANCE)) {
            getCallbacks().onManualBrokerageEntrySelected();
        } else {
            if (!(event instanceof AcatsInBrokerageSearchEvent.AccountIneligibleEvent)) {
                throw new NoWhenBranchMatchedException();
            }
            Navigator.DefaultImpls.createDialogFragment$default(getNavigator(), new LegacyDialogFragmentKey.ClientComponentAlert(((AcatsInBrokerageSearchEvent.AccountIneligibleEvent) event).getAlert(), false, false, C7725R.id.dialog_id_acats_ineligible, 6, (DefaultConstructorMarker) null), null, 2, null).show(getParentFragmentManager(), AcatsInActivity.INELIGIBLE_DIALOG_ID);
        }
    }

    /* compiled from: AcatsInBrokerageSearchFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchFragment;", "Lcom/robinhood/android/acatsin/brokeragesearch/AcatsInBrokerageSearchContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<AcatsInBrokerageSearchFragment, AcatsInBrokerageSearchContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(AcatsInBrokerageSearchContract.Key key) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public AcatsInBrokerageSearchContract.Key getArgs(AcatsInBrokerageSearchFragment acatsInBrokerageSearchFragment) {
            return (AcatsInBrokerageSearchContract.Key) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, acatsInBrokerageSearchFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public AcatsInBrokerageSearchFragment newInstance(AcatsInBrokerageSearchContract.Key key) {
            return (AcatsInBrokerageSearchFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, key);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(AcatsInBrokerageSearchFragment acatsInBrokerageSearchFragment, AcatsInBrokerageSearchContract.Key key) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, acatsInBrokerageSearchFragment, key);
        }
    }
}
