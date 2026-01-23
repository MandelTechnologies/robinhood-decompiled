package com.robinhood.android.common.margin.p083ui;

import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.margin.C11223R;
import com.robinhood.android.common.margin.databinding.MarginDefinitionsBottomSheetFragmentBinding;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.coroutines.p287rx.RxFactory3;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.staticcontent.model.productmarketing.ProductMarketingContent;
import com.robinhood.staticcontent.store.ContentStore;
import com.robinhood.utils.extensions.SinglesAndroid;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.Single;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;

/* compiled from: MarginDefinitionsBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 $2\u00020\u00012\u00020\u0002:\u0001$B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010!H\u0016J\u0010\u0010\"\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\u0007H\u0002R$\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001e\u0010\f\u001a\u00020\r8\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u001b0\u0019X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/MarginDefinitionsBottomSheetFragment;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/coroutines/rx/RxFactoryHost;", "<init>", "()V", "productMarketingStore", "Lcom/robinhood/staticcontent/store/ContentStore;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent;", "getProductMarketingStore", "()Lcom/robinhood/staticcontent/store/ContentStore;", "setProductMarketingStore", "(Lcom/robinhood/staticcontent/store/ContentStore;)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "binding", "Lcom/robinhood/android/common/margin/databinding/MarginDefinitionsBottomSheetFragmentBinding;", "getBinding", "()Lcom/robinhood/android/common/margin/databinding/MarginDefinitionsBottomSheetFragmentBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/staticcontent/model/productmarketing/ProductMarketingContent$Feature;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bindUi", "content", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MarginDefinitionsBottomSheetFragment extends BaseBottomSheetDialogFragment implements RxFactory3 {
    private final GenericListAdapter<RdsRowView, ProductMarketingContent.Feature> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    public ContentStore<ProductMarketingContent> productMarketingStore;
    public RxFactory rxFactory;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginDefinitionsBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/common/margin/databinding/MarginDefinitionsBottomSheetFragmentBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.convertToObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxCompletable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxMaybe(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext coroutineContext, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxObservable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxSingle(this, coroutineContext, function2);
    }

    public MarginDefinitionsBottomSheetFragment() {
        super(C11223R.layout.margin_definitions_bottom_sheet_fragment);
        this.binding = ViewBinding5.viewBinding(this, MarginDefinitionsBottomSheetFragment2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        int i = C11223R.layout.include_margin_definition_rds_row_view;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2985of(i, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.common.margin.ui.MarginDefinitionsBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return MarginDefinitionsBottomSheetFragment.adapter$lambda$0((RdsRowView) obj, (ProductMarketingContent.Feature) obj2);
            }
        });
    }

    public final ContentStore<ProductMarketingContent> getProductMarketingStore() {
        ContentStore<ProductMarketingContent> contentStore = this.productMarketingStore;
        if (contentStore != null) {
            return contentStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("productMarketingStore");
        return null;
    }

    public final void setProductMarketingStore(ContentStore<ProductMarketingContent> contentStore) {
        Intrinsics.checkNotNullParameter(contentStore, "<set-?>");
        this.productMarketingStore = contentStore;
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3
    public RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    private final MarginDefinitionsBottomSheetFragmentBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (MarginDefinitionsBottomSheetFragmentBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$0(RdsRowView of, ProductMarketingContent.Feature feature) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(feature, "feature");
        RdsRowView.bind$default(of, feature.getTitle(), feature.getDescription(), null, null, null, 28, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().marginDefinitionsList.setAdapter(this.adapter);
        RdsButton gotItBtn = getBinding().gotItBtn;
        Intrinsics.checkNotNullExpressionValue(gotItBtn, "gotItBtn");
        OnClickListeners.onClick(gotItBtn, new Function0() { // from class: com.robinhood.android.common.margin.ui.MarginDefinitionsBottomSheetFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginDefinitionsBottomSheetFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        String contentfulId = ((LegacyDialogFragmentKey.MarginDefinitionBottomSheet) INSTANCE.getArgs((Fragment) this)).getContentfulId();
        if (contentfulId == null || LifecycleHost.DefaultImpls.bind$default(this, SinglesAndroid.observeOnMainThread(RxFactory.DefaultImpls.rxSingle$default(this, null, new MarginDefinitionsBottomSheetFragment3(this, contentfulId, null), 1, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new MarginDefinitionsBottomSheetFragment4(this), Fragments2.getActivityErrorHandler(this)) == null) {
            dismiss();
            Unit unit = Unit.INSTANCE;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(MarginDefinitionsBottomSheetFragment marginDefinitionsBottomSheetFragment) {
        marginDefinitionsBottomSheetFragment.dismiss();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindUi(ProductMarketingContent content) {
        getBinding().title.setText(content.getPageTitle());
        this.adapter.submitList(content.getFeatures());
    }

    /* compiled from: MarginDefinitionsBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/MarginDefinitionsBottomSheetFragment$Companion;", "Lcom/robinhood/android/navigation/DialogFragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/common/margin/ui/MarginDefinitionsBottomSheetFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$MarginDefinitionBottomSheet;", "<init>", "()V", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DialogFragmentResolverWithArgsCompanion<MarginDefinitionsBottomSheetFragment, LegacyDialogFragmentKey.MarginDefinitionBottomSheet> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolverWithArgsCompanion, com.robinhood.android.navigation.DialogFragmentResolver
        public MarginDefinitionsBottomSheetFragment createDialogFragment(LegacyDialogFragmentKey.MarginDefinitionBottomSheet marginDefinitionBottomSheet) {
            return (MarginDefinitionsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.createDialogFragment(this, marginDefinitionBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyDialogFragmentKey.MarginDefinitionBottomSheet getArgs(MarginDefinitionsBottomSheetFragment marginDefinitionsBottomSheetFragment) {
            return (LegacyDialogFragmentKey.MarginDefinitionBottomSheet) DialogFragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, marginDefinitionsBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public MarginDefinitionsBottomSheetFragment newInstance(LegacyDialogFragmentKey.MarginDefinitionBottomSheet marginDefinitionBottomSheet) {
            return (MarginDefinitionsBottomSheetFragment) DialogFragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, marginDefinitionBottomSheet);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(MarginDefinitionsBottomSheetFragment marginDefinitionsBottomSheetFragment, LegacyDialogFragmentKey.MarginDefinitionBottomSheet marginDefinitionBottomSheet) {
            DialogFragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, marginDefinitionsBottomSheetFragment, marginDefinitionBottomSheet);
        }
    }
}
