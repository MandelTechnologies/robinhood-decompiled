package com.robinhood.android.beneficiaries.p067ui.individualflow.relationship;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Spanned;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.databinding.FragmentBeneficiaryCreateAgreementBinding;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySignedAgreement;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStep;
import com.robinhood.android.beneficiaries.p067ui.individualflow.agreement.Agreements2;
import com.robinhood.android.beneficiaries.p067ui.individualflow.relationship.BeneficiaryCreateSpousalAgreementFragment;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.p088ui.view.DisclosureView;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.text.RhTextView;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.p409ui.edge2edge.ApplyWindowInsets;
import com.robinhood.utils.p409ui.edge2edge.InsetSides;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import io.noties.markwon.Markwon;
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

/* compiled from: BeneficiaryCreateSpousalAgreementFragment.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 /2\u00020\u0001:\u0003-./B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010'\u001a\u00020(2\u0006\u0010)\u001a\u00020*2\b\u0010+\u001a\u0004\u0018\u00010,H\u0016R\u0014\u0010\u0004\u001a\u00020\u00058VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0007R\u0014\u0010\b\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001e\u0010\u0016\u001a\u00020\u00178\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001b\u0010\u001c\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\u001e\u0010\u001fR\u001b\u0010\"\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b$\u0010%¨\u00060"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BaseBeneficiaryCreateStepFragment;", "<init>", "()V", "eventScreen", "Lcom/robinhood/rosetta/eventlogging/Screen;", "getEventScreen", "()Lcom/robinhood/rosetta/eventlogging/Screen;", "step", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", "getStep", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStep;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "getAgreementsStore", "()Lcom/robinhood/android/agreements/AgreementsStore;", "setAgreementsStore", "(Lcom/robinhood/android/agreements/AgreementsStore;)V", "viewBinding", "Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAgreementBinding;", "getViewBinding", "()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAgreementBinding;", "viewBinding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "callbacks", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Callbacks;", "callbacks$delegate", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "Callbacks", "Args", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateSpousalAgreementFragment extends BaseBeneficiaryCreateStepFragment {
    public AgreementsStore agreementsStore;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;
    public Markwon markwon;

    /* renamed from: viewBinding$delegate, reason: from kotlin metadata */
    private final Interfaces2 viewBinding;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateSpousalAgreementFragment.class, "viewBinding", "getViewBinding()Lcom/robinhood/android/beneficiaries/databinding/FragmentBeneficiaryCreateAgreementBinding;", 0)), Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateSpousalAgreementFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateSpousalAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Callbacks;", "", "onAgreementCompleted", "", "signedAgreement", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAgreementCompleted(ApiBeneficiarySignedAgreement signedAgreement);
    }

    public BeneficiaryCreateSpousalAgreementFragment() {
        super(C9637R.layout.fragment_beneficiary_create_agreement);
        this.viewBinding = ViewBinding5.viewBinding(this, BeneficiaryCreateSpousalAgreementFragment2.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateSpousalAgreementFragment$special$$inlined$parentFragmentCallbacks$1
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
        return new Screen(Screen.Name.BENEFICIARY_SPOUSAL_AGREEMENT, null, null, null, 14, null);
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public BeneficiaryCreateStep getStep() {
        return BeneficiaryCreateStep.RELATIONSHIP_AGREEMENT;
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.individualflow.BaseBeneficiaryCreateStepFragment
    public ApiCreateBeneficiaryConfiguration getConfiguration() {
        return ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
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

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        ApplyWindowInsets.m26664applyWindowInsetsAsPaddingqNU9l24(view, InsetSides.INSTANCE.m26679getBottomXedK2Rk());
        getLifecycleScope().launchWhenCreated(new C97451(null));
    }

    /* compiled from: BeneficiaryCreateSpousalAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateSpousalAgreementFragment$onViewCreated$1", m3645f = "BeneficiaryCreateSpousalAgreementFragment.kt", m3646l = {60}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateSpousalAgreementFragment$onViewCreated$1 */
    static final class C97451 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C97451(Continuation<? super C97451> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryCreateSpousalAgreementFragment.this.new C97451(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C97451) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BeneficiaryCreateSpousalAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementAccept.setLoading(true);
                AgreementsStore agreementsStore = BeneficiaryCreateSpousalAgreementFragment.this.getAgreementsStore();
                String agreement_type = ((Args) BeneficiaryCreateSpousalAgreementFragment.INSTANCE.getArgs((Fragment) BeneficiaryCreateSpousalAgreementFragment.this)).getAgreement().getAgreement_type();
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
            Spanned markdown = BeneficiaryCreateSpousalAgreementFragment.this.getMarkwon().toMarkdown(((UiAgreementWithContent) obj).getContent());
            Intrinsics.checkNotNullExpressionValue(markdown, "toMarkdown(...)");
            DisclosureView beneficiaryCreateAgreementView = BeneficiaryCreateSpousalAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementView;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateAgreementView, "beneficiaryCreateAgreementView");
            RhTextView beneficiaryCreateAgreementText = BeneficiaryCreateSpousalAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementText;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateAgreementText, "beneficiaryCreateAgreementText");
            RdsButton beneficiaryCreateAgreementAccept = BeneficiaryCreateSpousalAgreementFragment.this.getViewBinding().beneficiaryCreateAgreementAccept;
            Intrinsics.checkNotNullExpressionValue(beneficiaryCreateAgreementAccept, "beneficiaryCreateAgreementAccept");
            final BeneficiaryCreateSpousalAgreementFragment beneficiaryCreateSpousalAgreementFragment = BeneficiaryCreateSpousalAgreementFragment.this;
            Agreements2.setUpAgreementView(beneficiaryCreateAgreementView, beneficiaryCreateAgreementText, beneficiaryCreateAgreementAccept, markdown, new Function0() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateSpousalAgreementFragment$onViewCreated$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return BeneficiaryCreateSpousalAgreementFragment.C97451.invokeSuspend$lambda$0(beneficiaryCreateSpousalAgreementFragment);
                }
            });
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit invokeSuspend$lambda$0(BeneficiaryCreateSpousalAgreementFragment beneficiaryCreateSpousalAgreementFragment) {
            Callbacks callbacks = beneficiaryCreateSpousalAgreementFragment.getCallbacks();
            Companion companion = BeneficiaryCreateSpousalAgreementFragment.INSTANCE;
            callbacks.onAgreementCompleted(new ApiBeneficiarySignedAgreement(((Args) companion.getArgs((Fragment) beneficiaryCreateSpousalAgreementFragment)).getAgreement().getContentful_id(), ((Args) companion.getArgs((Fragment) beneficiaryCreateSpousalAgreementFragment)).getAgreement().getAgreement_type(), ((Args) companion.getArgs((Fragment) beneficiaryCreateSpousalAgreementFragment)).getAgreement().getAgreement_context(), ((Args) companion.getArgs((Fragment) beneficiaryCreateSpousalAgreementFragment)).getAgreement().getAccount_number(), 0, 16, null));
            return Unit.INSTANCE;
        }
    }

    /* compiled from: BeneficiaryCreateSpousalAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\u0016\u0010\u0018\u001a\u00020\u00192\u0006\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Args;", "Landroid/os/Parcelable;", "agreement", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;)V", "getAgreement", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiBeneficiaryAgreementViewModel agreement;
        private final ApiCreateBeneficiaryConfiguration configuration;

        /* compiled from: BeneficiaryCreateSpousalAgreementFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiBeneficiaryAgreementViewModel) parcel.readParcelable(Args.class.getClassLoader()), (ApiCreateBeneficiaryConfiguration) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiBeneficiaryAgreementViewModel apiBeneficiaryAgreementViewModel, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                apiBeneficiaryAgreementViewModel = args.agreement;
            }
            if ((i & 2) != 0) {
                apiCreateBeneficiaryConfiguration = args.configuration;
            }
            return args.copy(apiBeneficiaryAgreementViewModel, apiCreateBeneficiaryConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiBeneficiaryAgreementViewModel getAgreement() {
            return this.agreement;
        }

        /* renamed from: component2, reason: from getter */
        public final ApiCreateBeneficiaryConfiguration getConfiguration() {
            return this.configuration;
        }

        public final Args copy(ApiBeneficiaryAgreementViewModel agreement, ApiCreateBeneficiaryConfiguration configuration) {
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Args(agreement, configuration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Args)) {
                return false;
            }
            Args args = (Args) other;
            return Intrinsics.areEqual(this.agreement, args.agreement) && Intrinsics.areEqual(this.configuration, args.configuration);
        }

        public int hashCode() {
            return (this.agreement.hashCode() * 31) + this.configuration.hashCode();
        }

        public String toString() {
            return "Args(agreement=" + this.agreement + ", configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.agreement, flags);
            dest.writeParcelable(this.configuration, flags);
        }

        public Args(ApiBeneficiaryAgreementViewModel agreement, ApiCreateBeneficiaryConfiguration configuration) {
            Intrinsics.checkNotNullParameter(agreement, "agreement");
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.agreement = agreement;
            this.configuration = configuration;
        }

        public final ApiBeneficiaryAgreementViewModel getAgreement() {
            return this.agreement;
        }

        public final ApiCreateBeneficiaryConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: BeneficiaryCreateSpousalAgreementFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Args;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateSpousalAgreementFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryCreateSpousalAgreementFragment beneficiaryCreateSpousalAgreementFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateSpousalAgreementFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateSpousalAgreementFragment newInstance(Args args) {
            return (BeneficiaryCreateSpousalAgreementFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateSpousalAgreementFragment beneficiaryCreateSpousalAgreementFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateSpousalAgreementFragment, args);
        }
    }
}
