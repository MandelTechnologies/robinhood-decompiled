package com.robinhood.android.beneficiaries.p067ui.introflow.agreement;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.View;
import androidx.fragment.app.Fragment;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModel;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.autoeventlogging.AutoLoggableFragment;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateAgreementBinding;
import com.robinhood.android.beneficiaries.p067ui.individualflow.agreement.Agreements2;
import com.robinhood.android.beneficiaries.p067ui.introflow.agreement.BeneficiaryAgreementFragment;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DisclosureView;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.Context;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.rosetta.eventlogging.UserInteractionEventData;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import io.noties.markwon.Markwon;
import java.util.Set;
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

/* compiled from: BeneficiaryAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 32\u00020\u00012\u00020\u00022\u00020\u0003:\u0003123B\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010!\u001a\u00020\"2\u0006\u0010#\u001a\u00020$H\u0016J\u001a\u0010%\u001a\u00020\"2\u0006\u0010&\u001a\u00020'2\b\u0010(\u001a\u0004\u0018\u00010)H\u0016J\t\u0010*\u001a\u00020+H\u0096\u0001R\u0014\u0010\u0006\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001e\u0010\n\u001a\u00020\u000b8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0016\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u0018\u0010\u0019R\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010\u001b\u001a\u0004\b\u001e\u0010\u001fR\u0018\u0010,\u001a\b\u0012\u0004\u0012\u00020.0-X\u0096\u0005¢\u0006\u0006\u001a\u0004\b/\u00100¨\u00064"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/autoeventlogging/AutoLoggableFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "getAgreementsStore", "()Lcom/robinhood/android/agreements/AgreementsStore;", "setAgreementsStore", "(Lcom/robinhood/android/agreements/AgreementsStore;)V", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAgreementBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAgreementBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Callbacks;", "callbacks$delegate", "configureToolbar", "", "toolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "onViewCreated", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDismissUnsupportedFeatureDialog", "", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Callbacks", "Args", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryAgreementFragment extends BaseFragment implements RegionGated, AutoLoggableFragment {
    private final /* synthetic */ RegionGated2 $$delegate_0;
    public AgreementsStore agreementsStore;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public Markwon markwon;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryAgreementFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAgreementBinding;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Callbacks;", "", "beneficiaryAgreementButtonClicked", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void beneficiaryAgreementButtonClicked();
    }

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

    public BeneficiaryAgreementFragment() {
        super(C9637R.layout.fragment_beneficiary_create_agreement);
        this.$$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryAgreementFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.introflow.agreement.BeneficiaryAgreementFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
    }

    @Override // com.robinhood.android.autoeventlogging.AutoLoggableFragment
    public Screen getEventScreen() {
        return new Screen(Screen.Name.BENEFICIARY_DISCLOSURE, null, String.valueOf(((Args) INSTANCE.getArgs((Fragment) this)).getAgreementViewModel().getLogging_identifier().getValue()), null, 10, null);
    }

    public final Markwon getMarkwon() {
        Markwon markwon = this.markwon;
        if (markwon != null) {
            return markwon;
        }
        Intrinsics.throwUninitializedPropertyAccessException("markwon");
        return null;
    }

    public final void setMarkwon(Markwon markwon) {
        Intrinsics.checkNotNullParameter(markwon, "<set-?>");
        this.markwon = markwon;
    }

    public final AgreementsStore getAgreementsStore() {
        AgreementsStore agreementsStore = this.agreementsStore;
        if (agreementsStore != null) {
            return agreementsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("agreementsStore");
        return null;
    }

    public final void setAgreementsStore(AgreementsStore agreementsStore) {
        Intrinsics.checkNotNullParameter(agreementsStore, "<set-?>");
        this.agreementsStore = agreementsStore;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentBeneficiaryCreateAgreementBinding getViewBinding() {
        Object value = this.viewBinding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBeneficiaryCreateAgreementBinding) value;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[1]);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.setTitle(C9637R.string.beneficiary_create_disclosure_title);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getLifecycleScope().launchWhenCreated(new C97561(null));
    }

    /* compiled from: BeneficiaryAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.introflow.agreement.BeneficiaryAgreementFragment$onViewCreated$1", m3645f = "BeneficiaryAgreementFragment.kt", m3646l = {67}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.introflow.agreement.BeneficiaryAgreementFragment$onViewCreated$1 */
    static final class C97561 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97561(Continuation<? super C97561> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryAgreementFragment.this.new C97561(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97561) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BeneficiaryAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementAccept.setLoading(true);
                AgreementsStore agreementsStore = BeneficiaryAgreementFragment.this.getAgreementsStore();
                String agreement_type = ((Args) BeneficiaryAgreementFragment.INSTANCE.getArgs((Fragment) BeneficiaryAgreementFragment.this)).getAgreementViewModel().getAgreement_type();
                this.label = 1;
                obj = agreementsStore.getAgreementWithContent(agreement_type, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Spanned markdown = BeneficiaryAgreementFragment.this.getMarkwon().toMarkdown(((UiAgreementWithContent) obj).getContent());
            Intrinsics.checkNotNullExpressionValue(markdown, "toMarkdown(...)");
            DisclosureView beneficiaryCreateAgreementView = BeneficiaryAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementView;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateAgreementView, "beneficiaryCreateAgreementView");
            RhTextView beneficiaryCreateAgreementText = BeneficiaryAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementText;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateAgreementText, "beneficiaryCreateAgreementText");
            RdsButton beneficiaryCreateAgreementAccept = BeneficiaryAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementAccept;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateAgreementAccept, "beneficiaryCreateAgreementAccept");
            final BeneficiaryAgreementFragment beneficiaryAgreementFragment = BeneficiaryAgreementFragment.this;
            Agreements2.setUpAgreementView(beneficiaryCreateAgreementView, beneficiaryCreateAgreementText, beneficiaryCreateAgreementAccept, markdown, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.introflow.agreement.BeneficiaryAgreementFragment$onViewCreated$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeneficiaryAgreementFragment.C97561.invokeSuspend$lambda$0(beneficiaryAgreementFragment);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(BeneficiaryAgreementFragment beneficiaryAgreementFragment) {
            beneficiaryAgreementFragment.getCallbacks().beneficiaryAgreementButtonClicked();
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BeneficiaryAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Args;", "Landroid/os/Parcelable;", "agreementViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;)V", "getAgreementViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final BeneficiaryFlowAgreementViewModel agreementViewModel;

        /* compiled from: BeneficiaryAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((BeneficiaryFlowAgreementViewModel) parcel.readSerializable());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, BeneficiaryFlowAgreementViewModel beneficiaryFlowAgreementViewModel, int i, Object obj) {
            if ((i & 1) != 0) {
                beneficiaryFlowAgreementViewModel = args.agreementViewModel;
            }
            return args.copy(beneficiaryFlowAgreementViewModel);
        }

        /* renamed from: component1, reason: from getter */
        public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
            return this.agreementViewModel;
        }

        public final Args copy(BeneficiaryFlowAgreementViewModel agreementViewModel) {
            Intrinsics.checkNotNullParameter(agreementViewModel, "agreementViewModel");
            return new Args(agreementViewModel);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.agreementViewModel, ((Args) other).agreementViewModel);
        }

        public int hashCode() {
            return this.agreementViewModel.hashCode();
        }

        public String toString() {
            return "Args(agreementViewModel=" + this.agreementViewModel + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeSerializable(this.agreementViewModel);
        }

        public Args(BeneficiaryFlowAgreementViewModel agreementViewModel) {
            Intrinsics.checkNotNullParameter(agreementViewModel, "agreementViewModel");
            this.agreementViewModel = agreementViewModel;
        }

        public final BeneficiaryFlowAgreementViewModel getAgreementViewModel() {
            return this.agreementViewModel;
        }
    }

    /* compiled from: BeneficiaryAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment;", "Lcom/robinhood/android/beneficiaries/ui/introflow/agreement/BeneficiaryAgreementFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryAgreementFragment beneficiaryAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryAgreementFragment newInstance(Args args) {
            return (BeneficiaryAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryAgreementFragment beneficiaryAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryAgreementFragment, args);
        }
    }
}
