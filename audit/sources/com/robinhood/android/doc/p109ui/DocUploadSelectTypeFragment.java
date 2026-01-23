package com.robinhood.android.doc.p109ui;

import android.content.res.Resources;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.doc.C14254R;
import com.robinhood.android.doc.databinding.FragmentDocUploadSelectTypeBinding;
import com.robinhood.android.doc.event.DocUploadDestination;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.identi.AddressStore;
import com.robinhood.models.api.IdDocument;
import com.robinhood.models.p355ui.identi.ResidentialAddress;
import com.robinhood.shared.documents.lib.docupload.DocUploadEvent;
import com.robinhood.shared.documents.lib.docupload.DocUploadEventReceiver;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import io.reactivex.Observable;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
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

/* compiled from: DocUploadSelectTypeFragment.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\b\u0010\u001b\u001a\u00020\u0016H\u0002R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001b\u0010\u0010\u001a\u00020\u00118BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u000f\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSelectTypeFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "addressStore", "Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "getAddressStore", "()Lcom/robinhood/librobinhood/data/store/identi/AddressStore;", "setAddressStore", "(Lcom/robinhood/librobinhood/data/store/identi/AddressStore;)V", "eventReceiver", "Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "getEventReceiver", "()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", "eventReceiver$delegate", "Lkotlin/properties/ReadOnlyProperty;", "binding", "Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectTypeBinding;", "getBinding", "()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectTypeBinding;", "binding$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "setCustomPrompt", "Companion", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class DocUploadSelectTypeFragment extends BaseFragment {
    private static final List<IdDocument.Type> CRYPTO_TYPES;
    private static final List<IdDocument.Type> JUMIO_TYPES;
    public AddressStore addressStore;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    /* renamed from: eventReceiver$delegate, reason: from kotlin metadata */
    private final Interfaces2 eventReceiver;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DocUploadSelectTypeFragment.class, "eventReceiver", "getEventReceiver()Lcom/robinhood/shared/documents/lib/docupload/DocUploadEventReceiver;", 0)), Reflection.property1(new PropertyReference1Impl(DocUploadSelectTypeFragment.class, "binding", "getBinding()Lcom/robinhood/android/doc/databinding/FragmentDocUploadSelectTypeBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public DocUploadSelectTypeFragment() {
        super(C14254R.layout.fragment_doc_upload_select_type);
        this.eventReceiver = new CallbacksProperty(Reflection.getOrCreateKotlinClass(DocUploadEventReceiver.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.doc.ui.DocUploadSelectTypeFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        this.binding = ViewBinding5.viewBinding(this, DocUploadSelectTypeFragment2.INSTANCE);
    }

    public final AddressStore getAddressStore() {
        AddressStore addressStore = this.addressStore;
        if (addressStore != null) {
            return addressStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("addressStore");
        return null;
    }

    public final void setAddressStore(AddressStore addressStore) {
        Intrinsics.checkNotNullParameter(addressStore, "<set-?>");
        this.addressStore = addressStore;
    }

    static {
        IdDocument.Type type2 = IdDocument.Type.PASSPORT;
        IdDocument.Type type3 = IdDocument.Type.DRIVING_LICENSE;
        IdDocument.Type type4 = IdDocument.Type.ID_CARD;
        JUMIO_TYPES = CollectionsKt.listOf((Object[]) new IdDocument.Type[]{type2, type3, type4});
        CRYPTO_TYPES = CollectionsKt.listOf((Object[]) new IdDocument.Type[]{type3, type4});
    }

    private final DocUploadEventReceiver getEventReceiver() {
        return (DocUploadEventReceiver) this.eventReceiver.getValue(this, $$delegatedProperties[0]);
    }

    private final FragmentDocUploadSelectTypeBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[1]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentDocUploadSelectTypeBinding) value;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        final boolean forCrypto = ((DocUploadDestination.SelectType) INSTANCE.getArgs((Fragment) this)).getForCrypto();
        GenericListAdapter genericListAdapterM2985of = GenericListAdapter.INSTANCE.m2985of(C14254R.layout.row_doc_upload_item, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.doc.ui.DocUploadSelectTypeFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DocUploadSelectTypeFragment.onViewCreated$lambda$1(forCrypto, this, (RdsRowView) obj, (IdDocument.Type) obj2);
            }
        });
        getBinding().idTypeRecyclerView.setAdapter(genericListAdapterM2985of);
        if (forCrypto) {
            genericListAdapterM2985of.submitList(CRYPTO_TYPES);
            setCustomPrompt();
        } else {
            genericListAdapterM2985of.submitList(JUMIO_TYPES);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(final boolean z, final DocUploadSelectTypeFragment docUploadSelectTypeFragment, RdsRowView of, final IdDocument.Type idType) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(idType, "idType");
        of.setShowBottomDivider(!z);
        Resources resources = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String displayNameTitleCase$default = UtilKt.getDisplayNameTitleCase$default(idType, resources, z, null, 4, null);
        Resources resources2 = of.getResources();
        Intrinsics.checkNotNullExpressionValue(resources2, "getResources(...)");
        RdsRowView.bind$default(of, displayNameTitleCase$default, UtilKt.getDescription(idType, resources2, z), null, null, null, 28, null);
        OnClickListeners.onClick(of, new Function0() { // from class: com.robinhood.android.doc.ui.DocUploadSelectTypeFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DocUploadSelectTypeFragment.onViewCreated$lambda$1$lambda$0(this.f$0, idType, z);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1$lambda$0(DocUploadSelectTypeFragment docUploadSelectTypeFragment, IdDocument.Type type2, boolean z) {
        DocUploadEventReceiver.DefaultImpls.onEvent$default(docUploadSelectTypeFragment.getEventReceiver(), new DocUploadEvent.ActiveDocRequestEvent.TypeSelected(type2, ((DocUploadDestination.SelectType) INSTANCE.getArgs((Fragment) docUploadSelectTypeFragment)).getRequestType(), z), false, 2, null);
        return Unit.INSTANCE;
    }

    private final void setCustomPrompt() {
        getAddressStore().refreshResidentialAddress(true);
        Observable<ResidentialAddress> observableTake = getAddressStore().streamResidentialAddress().take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.doc.ui.DocUploadSelectTypeFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DocUploadSelectTypeFragment.setCustomPrompt$lambda$2(this.f$0, (ResidentialAddress) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setCustomPrompt$lambda$2(DocUploadSelectTypeFragment docUploadSelectTypeFragment, ResidentialAddress residentialAddress) throws Resources.NotFoundException {
        Intrinsics.checkNotNull(residentialAddress);
        Resources resources = docUploadSelectTypeFragment.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        String fullStateName = UtilKt.getFullStateName(residentialAddress, resources);
        if (fullStateName == null) {
            fullStateName = "";
        }
        docUploadSelectTypeFragment.getBinding().docUploadSelectTypeSubtitle.setText(docUploadSelectTypeFragment.getString(C14254R.string.doc_upload_crypto_doc_type_prompt, fullStateName));
        return Unit.INSTANCE;
    }

    /* compiled from: DocUploadSelectTypeFragment.kt */
    @Metadata(m3635d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/doc/ui/DocUploadSelectTypeFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/doc/ui/DocUploadSelectTypeFragment;", "Lcom/robinhood/android/doc/event/DocUploadDestination$SelectType;", "<init>", "()V", "JUMIO_TYPES", "", "Lcom/robinhood/models/api/IdDocument$Type;", "CRYPTO_TYPES", "feature-doc-upload_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DocUploadSelectTypeFragment, DocUploadDestination.SelectType> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public DocUploadDestination.SelectType getArgs(DocUploadSelectTypeFragment docUploadSelectTypeFragment) {
            return (DocUploadDestination.SelectType) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, docUploadSelectTypeFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DocUploadSelectTypeFragment newInstance(DocUploadDestination.SelectType selectType) {
            return (DocUploadSelectTypeFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, selectType);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DocUploadSelectTypeFragment docUploadSelectTypeFragment, DocUploadDestination.SelectType selectType) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, docUploadSelectTypeFragment, selectType);
        }
    }
}
