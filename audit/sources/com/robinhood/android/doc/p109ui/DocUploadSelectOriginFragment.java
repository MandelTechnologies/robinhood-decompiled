package com.robinhood.android.doc.p109ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadSelectOriginBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.android.doc.p109ui.docorigin.DocUploadSelectOriginDuxo;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.IdDocument;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.shared.documents.lib.docupload.UploadFlowDetails;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
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
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;

/* compiled from: DocUploadSelectOriginFragment.kt */
@Metadata(m3635d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u001aH\u0002J\u0016\u0010\u001c\u001a\u00020\u001a2\f\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001eH\u0002J\u001a\u0010 \u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010$H\u0016J\u0010\u0010%\u001a\u00020\u001a2\u0006\u0010&\u001a\u00020\u0012H\u0002R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\t\u001a\u0004\b\f\u0010\rR\u001a\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00120\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u0013\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0015\u0010\u0016¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSelectOriginFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectOriginBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectOriginBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/android/common/util/InternationalInfo;", "duxo", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo;", "getDuxo", "()Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "hideUi", "", "showUi", "bindUi", "options", "", "Lcom/robinhood/iso/countrycode/CountryCode;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onCountrySelected", "internationalInfo", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadSelectOriginFragment extends BaseFragment {
    private final GenericListAdapter<RdsRowView, InternationalInfo> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadSelectOriginFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectOriginBinding;", 0)), Reflection.property1(new PropertyReference1Impl(DocUploadSelectOriginFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DocUploadSelectOriginFragment() {
        super(C14254R.layout.fragment_doc_upload_select_origin);
        this.binding = ViewBinding5.viewBinding(this, DocUploadSelectOriginFragment2.INSTANCE);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.adapter = GenericListAdapter.INSTANCE.m2985of(C14254R.layout.row_doc_upload_item, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocUploadSelectOriginFragment.adapter$lambda$1(this.f$0, (RdsRowView) obj, (InternationalInfo) obj2);
            }
        });
        this.duxo = DuxosKt.duxo(this, DocUploadSelectOriginDuxo.class);
    }

    private final FragmentDocUploadSelectOriginBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadSelectOriginBinding) value;
    }

    private final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1(final DocUploadSelectOriginFragment docUploadSelectOriginFragment, RdsRowView of, final InternationalInfo internationalInfo) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(internationalInfo, "internationalInfo");
        of.setPrimaryText(internationalInfo.getDisplayCountry());
        of.setShowBottomDivider(true);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadSelectOriginFragment.adapter$lambda$1$lambda$0(this.f$0, internationalInfo);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$1$lambda$0(DocUploadSelectOriginFragment docUploadSelectOriginFragment, InternationalInfo internationalInfo) {
        docUploadSelectOriginFragment.onCountrySelected(internationalInfo);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DocUploadSelectOriginDuxo getDuxo() {
        return (DocUploadSelectOriginDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void hideUi() {
        getBinding().docUploadSelectOriginTitle.setVisibility(8);
        getBinding().docUploadSelectOriginSubtitle.setVisibility(8);
        getBinding().countriesRecyclerView.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void showUi() {
        getBinding().docUploadSelectOriginTitle.setVisibility(0);
        getBinding().docUploadSelectOriginSubtitle.setVisibility(0);
        getBinding().countriesRecyclerView.setVisibility(0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void bindUi(List<? extends CountryCode> options) {
        IdDocument.Type documentType = ((DocUploadDestination.SelectOrigin) INSTANCE.getArgs((Fragment) this)).getDocumentType();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String displayNameLowercase$default = UtilKt.getDisplayNameLowercase$default(documentType, resources, false, null, 4, null);
        getBinding().docUploadSelectOriginTitle.setText(getString(C14254R.string.doc_upload_select_origin_title));
        getBinding().docUploadSelectOriginSubtitle.setText(getString(C14254R.string.doc_upload_select_origin_prompt, displayNameLowercase$default));
        getBinding().countriesRecyclerView.setAdapter(this.adapter);
        GenericListAdapter<RdsRowView, InternationalInfo> genericListAdapter = this.adapter;
        List<? extends CountryCode> list = options;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(InternationalInfo.Companion.fromCountryCode$default(InternationalInfo.INSTANCE, null, (CountryCode) it.next(), 1, null));
        }
        genericListAdapter.submitList(arrayList);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C143261(null), 1, null);
    }

    /* compiled from: DocUploadSelectOriginFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$onViewCreated$1", m3645f = "DocUploadSelectOriginFragment.kt", m3646l = {EnumC7081g.SDK_ASSET_ICON_GLOBE_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$onViewCreated$1 */
    static final class C143261 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C143261(Continuation<? super C143261> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return DocUploadSelectOriginFragment.this.new C143261(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C143261) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: DocUploadSelectOriginFragment.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "viewState", "Lcom/robinhood/android/doc/ui/docorigin/DocUploadSelectOriginDuxo$ViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$onViewCreated$1$1", m3645f = "DocUploadSelectOriginFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.doc.ui.DocUploadSelectOriginFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<DocUploadSelectOriginDuxo.ViewState, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ DocUploadSelectOriginFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(DocUploadSelectOriginFragment docUploadSelectOriginFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = docUploadSelectOriginFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(DocUploadSelectOriginDuxo.ViewState viewState, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(viewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                DocUploadSelectOriginDuxo.ViewState viewState = (DocUploadSelectOriginDuxo.ViewState) this.L$0;
                if (viewState instanceof DocUploadSelectOriginDuxo.ViewState.Error) {
                    boxing.boxBoolean(AbsErrorHandler.handleError$default(this.this$0.getActivityErrorHandler(), ((DocUploadSelectOriginDuxo.ViewState.Error) viewState).getError(), false, 2, null));
                } else if (viewState instanceof DocUploadSelectOriginDuxo.ViewState.Loaded) {
                    this.this$0.showUi();
                    this.this$0.bindUi(((DocUploadSelectOriginDuxo.ViewState.Loaded) viewState).getOptions());
                } else if (Intrinsics.areEqual(viewState, DocUploadSelectOriginDuxo.ViewState.Loading.INSTANCE)) {
                    this.this$0.hideUi();
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                return Unit.INSTANCE;
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                StateFlow<DocUploadSelectOriginDuxo.ViewState> stateFlow = DocUploadSelectOriginFragment.this.getDuxo().getStateFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(DocUploadSelectOriginFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(stateFlow, anonymousClass1, this) == coroutine_suspended) {
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

    private final void onCountrySelected(InternationalInfo internationalInfo) {
        Companion companion = INSTANCE;
        DocUploadEventReceiver.DefaultImpls.onEvent$default(getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.OriginSelected(new UploadFlowDetails(((DocUploadDestination.SelectOrigin) companion.getArgs((Fragment) this)).getDocumentType(), ((DocUploadDestination.SelectOrigin) companion.getArgs((Fragment) this)).getRequestType(), false, null, null, internationalInfo.getCountryCode(), null, 88, null)), false, 2, null);
    }

    /* compiled from: DocUploadSelectOriginFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSelectOriginFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/DocUploadSelectOriginFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$SelectOrigin;", "<init>", "()V", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadSelectOriginFragment, DocUploadDestination.SelectOrigin> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.SelectOrigin getArgs(DocUploadSelectOriginFragment docUploadSelectOriginFragment) {
            return (DocUploadDestination.SelectOrigin) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadSelectOriginFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadSelectOriginFragment newInstance(DocUploadDestination.SelectOrigin selectOrigin) {
            return (DocUploadSelectOriginFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, selectOrigin);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadSelectOriginFragment docUploadSelectOriginFragment, DocUploadDestination.SelectOrigin selectOrigin) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadSelectOriginFragment, selectOrigin);
        }
    }
}
