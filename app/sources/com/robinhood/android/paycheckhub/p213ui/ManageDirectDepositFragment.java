package com.robinhood.android.paycheckhub.p213ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.view.View;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.row.RdsRowView;
import com.robinhood.android.designsystem.style.ThemeAttributes;
import com.robinhood.android.designsystem.text.ThemableColorSpans3;
import com.robinhood.android.navigation.FragmentResolver;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.paycheckhub.C25434R;
import com.robinhood.android.paycheckhub.databinding.FragmentManageDirectDepositBinding;
import com.robinhood.android.transfers.contracts.DirectDepositShimKey;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.DirectDepositRelationshipStore;
import com.robinhood.models.entity.RhEntity;
import com.robinhood.models.p320db.bonfire.DirectDepositRelationship;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.util.resource.ResourceReferences5;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ManageDirectDepositFragment.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 '2\u00020\u0001:\u0001'B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u001a\u0010\u001e\u001a\u00020\u001b2\u0006\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u001bH\u0016J\u0010\u0010$\u001a\u00020\u001b2\u0006\u0010%\u001a\u00020&H\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u001a\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0014\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0018\u001a\u00020\u0015X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0017¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/ManageDirectDepositFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "<init>", "()V", "directDepositRelationshipStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "getDirectDepositRelationshipStore", "()Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;", "setDirectDepositRelationshipStore", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectDepositRelationshipStore;)V", "binding", "Lcom/robinhood/android/paycheckhub/databinding/FragmentManageDirectDepositBinding;", "getBinding", "()Lcom/robinhood/android/paycheckhub/databinding/FragmentManageDirectDepositBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "adapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/designsystem/row/RdsRowView;", "Lcom/robinhood/models/db/bonfire/DirectDepositRelationship;", "useDesignSystemToolbar", "", "getUseDesignSystemToolbar", "()Z", "childFragmentsShouldNotConfigureToolbar", "getChildFragmentsShouldNotConfigureToolbar", "onAttach", "", "context", "Landroid/content/Context;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "configureToolbar", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "Companion", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final class ManageDirectDepositFragment extends BaseFragment {
    private final GenericListAdapter<RdsRowView, DirectDepositRelationship> adapter;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    public DirectDepositRelationshipStore directDepositRelationshipStore;
    private final boolean useDesignSystemToolbar;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(ManageDirectDepositFragment.class, "binding", "getBinding()Lcom/robinhood/android/paycheckhub/databinding/FragmentManageDirectDepositBinding;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    public ManageDirectDepositFragment() {
        super(C25434R.layout.fragment_manage_direct_deposit);
        this.binding = ViewBinding5.viewBinding(this, ManageDirectDepositFragment2.INSTANCE);
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        RdsRowView.Companion companion2 = RdsRowView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.adapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.paycheckhub.ui.ManageDirectDepositFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return ManageDirectDepositFragment.adapter$lambda$2((RdsRowView) obj, (DirectDepositRelationship) obj2);
            }
        });
        this.useDesignSystemToolbar = true;
        this.childFragmentsShouldNotConfigureToolbar = true;
    }

    public final DirectDepositRelationshipStore getDirectDepositRelationshipStore() {
        DirectDepositRelationshipStore directDepositRelationshipStore = this.directDepositRelationshipStore;
        if (directDepositRelationshipStore != null) {
            return directDepositRelationshipStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("directDepositRelationshipStore");
        return null;
    }

    public final void setDirectDepositRelationshipStore(DirectDepositRelationshipStore directDepositRelationshipStore) {
        Intrinsics.checkNotNullParameter(directDepositRelationshipStore, "<set-?>");
        this.directDepositRelationshipStore = directDepositRelationshipStore;
    }

    private final FragmentManageDirectDepositBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentManageDirectDepositBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit adapter$lambda$2(RdsRowView of, DirectDepositRelationship item) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(item, "item");
        of.setPrimaryText(item.getOriginatorName());
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ThemableColorSpans3 themableColorSpans3 = new ThemableColorSpans3(ResourceReferences5.toColor(ThemeAttributes.INSTANCE.getCOLOR_POSITIVE()));
        int length = spannableStringBuilder.length();
        spannableStringBuilder.append((CharSequence) ViewsKt.getString(of, C11048R.string.general_label_verified));
        spannableStringBuilder.setSpan(themableColorSpans3, length, spannableStringBuilder.length(), 17);
        of.setMetadataPrimaryText(new SpannedString(spannableStringBuilder));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
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
        if (savedInstanceState == null) {
            getChildFragmentManager().beginTransaction().add(C25434R.id.ach_account_info_fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), new LegacyFragmentKey.AchAccountInfo(false, false, false, 4, null), null, 2, null), "achAccountInfoFragment").commit();
            getChildFragmentManager().beginTransaction().add(C25434R.id.early_pay_toggle_fragment_container, Navigator.DefaultImpls.createFragment$default(getNavigator(), LegacyFragmentKey.EarlyPayToggle.INSTANCE, null, 2, null), "earlyPayToggleFragment").commit();
        }
        FragmentManageDirectDepositBinding binding = getBinding();
        binding.directDepositRecyclerView.setAdapter(this.adapter);
        RdsButton addDirectDepositButton = binding.addDirectDepositButton;
        Intrinsics.checkNotNullExpressionValue(addDirectDepositButton, "addDirectDepositButton");
        OnClickListeners.onClick(addDirectDepositButton, new Function0() { // from class: com.robinhood.android.paycheckhub.ui.ManageDirectDepositFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return ManageDirectDepositFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(ManageDirectDepositFragment manageDirectDepositFragment) {
        Navigator navigator = manageDirectDepositFragment.getNavigator();
        Context contextRequireContext = manageDirectDepositFragment.requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Navigator.DefaultImpls.startActivity$default(navigator, contextRequireContext, new DirectDepositShimKey(false, false, false, false, false, false, false, false, 255, null), null, false, null, null, 60, null);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(getDirectDepositRelationshipStore().getDirectDepositRelationships(RhEntity.RHY)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C254421(this.adapter));
    }

    /* compiled from: ManageDirectDepositFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.paycheckhub.ui.ManageDirectDepositFragment$onResume$1 */
    /* synthetic */ class C254421 extends FunctionReferenceImpl implements Function1<List<? extends DirectDepositRelationship>, Unit> {
        C254421(Object obj) {
            super(1, obj, GenericListAdapter.class, "submitList", "submitList(Ljava/util/List;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(List<? extends DirectDepositRelationship> list) {
            invoke2((List<DirectDepositRelationship>) list);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(List<DirectDepositRelationship> list) {
            ((GenericListAdapter) this.receiver).submitList(list);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setElevation(0.0f);
    }

    /* compiled from: ManageDirectDepositFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00030\u0004B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0003H\u0016¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/paycheckhub/ui/ManageDirectDepositFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/paycheckhub/ui/ManageDirectDepositFragment;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$ManageDirectDeposit;", "Lcom/robinhood/android/navigation/FragmentResolver;", "<init>", "()V", "createFragment", "key", "feature-paycheck-hub_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<ManageDirectDepositFragment, LegacyFragmentKey.ManageDirectDeposit>, FragmentResolver<LegacyFragmentKey.ManageDirectDeposit> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public LegacyFragmentKey.ManageDirectDeposit getArgs(ManageDirectDepositFragment manageDirectDepositFragment) {
            return (LegacyFragmentKey.ManageDirectDeposit) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, manageDirectDepositFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public ManageDirectDepositFragment newInstance(LegacyFragmentKey.ManageDirectDeposit manageDirectDeposit) {
            return (ManageDirectDepositFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, manageDirectDeposit);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(ManageDirectDepositFragment manageDirectDepositFragment, LegacyFragmentKey.ManageDirectDeposit manageDirectDeposit) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, manageDirectDepositFragment, manageDirectDeposit);
        }

        @Override // com.robinhood.android.navigation.FragmentResolver
        public ManageDirectDepositFragment createFragment(LegacyFragmentKey.ManageDirectDeposit key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (ManageDirectDepositFragment) newInstance((Parcelable) key);
        }
    }
}
