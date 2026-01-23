package com.robinhood.android.directipo.allocation.clarity.p103ui.postcob;

import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.directipo.allocation.clarity.C14172R;
import com.robinhood.android.directipo.allocation.clarity.databinding.FragmentPostCobFollowupBinding;
import com.robinhood.android.navigation.DialogFragmentResolver;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.regiongate.IpoAccessRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView;
import com.robinhood.models.p355ui.bonfire.UiDirectIpoPostCobFollowup;
import com.robinhood.models.serverdriven.p347db.GenericAction;
import com.robinhood.models.serverdriven.p347db.ServerDrivenButton;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.robinhood.utils.p409ui.view.recyclerview.DiffCallbacks;
import com.robinhood.utils.p409ui.view.recyclerview.GenericListAdapter;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: DirectIpoPostCobFollowupBottomSheetFragment.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 '2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001'B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u001a\u0010\u001b\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aH\u0016J\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\fH\u0016J\t\u0010!\u001a\u00020\u001fH\u0096\u0001R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\r\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0018\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#X\u0096\u0005¢\u0006\u0006\u001a\u0004\b%\u0010&¨\u0006("}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/postcob/DirectIpoPostCobFollowupBottomSheetFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/common/ui/BaseBottomSheetDialogFragment;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView$Callbacks;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "sectionAdapter", "Lcom/robinhood/android/directipo/allocation/clarity/ui/postcob/DirectIpoPostCobFollowupAdapter;", "buttonAdapter", "Lcom/robinhood/utils/ui/view/recyclerview/GenericListAdapter;", "Lcom/robinhood/android/serverclientcomponents/actionbutton/ClientComponentButtonView;", "Lcom/robinhood/models/serverdriven/db/ServerDrivenButton;", "binding", "Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentPostCobFollowupBinding;", "getBinding", "()Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentPostCobFollowupBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onViewCreated", "view", "Landroid/view/View;", "onActionClicked", "", "button", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class DirectIpoPostCobFollowupBottomSheetFragment extends BaseBottomSheetDialogFragment implements RegionGated, ClientComponentButtonView.Callbacks, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private final GenericListAdapter<ClientComponentButtonView, ServerDrivenButton> buttonAdapter;
    private final DirectIpoPostCobFollowupAdapter sectionAdapter;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DirectIpoPostCobFollowupBottomSheetFragment.class, "binding", "getBinding()Lcom/robinhood/android/directipo/allocation/clarity/databinding/FragmentPostCobFollowupBinding;", 0))};

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
    public Context getScreenEventContext() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventContext(this);
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public UserInteractionEventData getScreenEventData() {
        return AutoLoggableFragment.DefaultImpls.getScreenEventData(this);
    }

    public DirectIpoPostCobFollowupBottomSheetFragment() {
        super(C14172R.layout.fragment_post_cob_followup);
        this.$$delegate_0 = new RegionGated2(IpoAccessRegionGate.INSTANCE);
        this.sectionAdapter = new DirectIpoPostCobFollowupAdapter();
        GenericListAdapter.Companion companion = GenericListAdapter.INSTANCE;
        ClientComponentButtonView.Companion companion2 = ClientComponentButtonView.INSTANCE;
        DiffCallbacks diffCallbacks = DiffCallbacks.INSTANCE;
        this.buttonAdapter = companion.m2987of(companion2, DiffCallbacks.Equality.INSTANCE, new Function2() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.postcob.DirectIpoPostCobFollowupBottomSheetFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return DirectIpoPostCobFollowupBottomSheetFragment.buttonAdapter$lambda$0(this.f$0, (ClientComponentButtonView) obj, (ServerDrivenButton) obj2);
            }
        });
        this.binding = ViewBinding5.viewBinding(this, DirectIpoPostCobFollowupBottomSheetFragment2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit buttonAdapter$lambda$0(DirectIpoPostCobFollowupBottomSheetFragment directIpoPostCobFollowupBottomSheetFragment, ClientComponentButtonView of, ServerDrivenButton it) {
        Intrinsics.checkNotNullParameter(of, "$this$of");
        Intrinsics.checkNotNullParameter(it, "it");
        of.setCallbacks(directIpoPostCobFollowupBottomSheetFragment);
        of.bind(it);
        return Unit.INSTANCE;
    }

    private final FragmentPostCobFollowupBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentPostCobFollowupBinding) value;
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        Screen.Name name = Screen.Name.IPOA_COB_FOLLOW_UP;
        String string2 = ((UiDirectIpoPostCobFollowup) INSTANCE.getArgs((Fragment) this)).getOrderId().toString();
        Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
        return new Screen(name, null, string2, null, 10, null);
    }

    @Override // com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        DirectIpoPostCobFollowupAdapter directIpoPostCobFollowupAdapter = this.sectionAdapter;
        Companion companion = INSTANCE;
        directIpoPostCobFollowupAdapter.submitList(((UiDirectIpoPostCobFollowup) companion.getArgs((Fragment) this)).getSections());
        this.buttonAdapter.submitList(((UiDirectIpoPostCobFollowup) companion.getArgs((Fragment) this)).getFooterButtons());
    }

    @Override // com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        getBinding().fragmentPostCobFollowupSectionRecyclerView.setAdapter(this.sectionAdapter);
        getBinding().fragmentPostCobFollowupButtonRecyclerView.setAdapter(this.buttonAdapter);
    }

    @Override // com.robinhood.android.serverclientcomponents.actionbutton.ClientComponentButtonView.Callbacks
    public boolean onActionClicked(ServerDrivenButton button) {
        Intrinsics.checkNotNullParameter(button, "button");
        if (!Intrinsics.areEqual(button.getTypedAction(), GenericAction.DismissAction.INSTANCE)) {
            return false;
        }
        dismiss();
        return true;
    }

    /* compiled from: DirectIpoPostCobFollowupBottomSheetFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\u0005H\u0016¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/postcob/DirectIpoPostCobFollowupBottomSheetFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/postcob/DirectIpoPostCobFollowupBottomSheetFragment;", "Lcom/robinhood/models/ui/bonfire/UiDirectIpoPostCobFollowup;", "Lcom/robinhood/android/navigation/DialogFragmentResolver;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$DirectIpoPostCobFollowup;", "<init>", "()V", "createDialogFragment", "key", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<DirectIpoPostCobFollowupBottomSheetFragment, UiDirectIpoPostCobFollowup>, DialogFragmentResolver<LegacyDialogFragmentKey.DirectIpoPostCobFollowup> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public UiDirectIpoPostCobFollowup getArgs(DirectIpoPostCobFollowupBottomSheetFragment directIpoPostCobFollowupBottomSheetFragment) {
            return (UiDirectIpoPostCobFollowup) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, directIpoPostCobFollowupBottomSheetFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public DirectIpoPostCobFollowupBottomSheetFragment newInstance(UiDirectIpoPostCobFollowup uiDirectIpoPostCobFollowup) {
            return (DirectIpoPostCobFollowupBottomSheetFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, uiDirectIpoPostCobFollowup);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(DirectIpoPostCobFollowupBottomSheetFragment directIpoPostCobFollowupBottomSheetFragment, UiDirectIpoPostCobFollowup uiDirectIpoPostCobFollowup) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, directIpoPostCobFollowupBottomSheetFragment, uiDirectIpoPostCobFollowup);
        }

        @Override // com.robinhood.android.navigation.DialogFragmentResolver
        public DirectIpoPostCobFollowupBottomSheetFragment createDialogFragment(LegacyDialogFragmentKey.DirectIpoPostCobFollowup key) {
            Intrinsics.checkNotNullParameter(key, "key");
            return (DirectIpoPostCobFollowupBottomSheetFragment) newInstance((Parcelable) key.getPostCobFollowup());
        }
    }
}
