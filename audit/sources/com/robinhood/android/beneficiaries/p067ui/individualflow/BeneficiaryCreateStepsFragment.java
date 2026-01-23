package com.robinhood.android.beneficiaries.p067ui.individualflow;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.android.beneficiaries.C9637R;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySignedAgreement;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.p067ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.agreement.BeneficiaryCreateAgreementFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.dob.BeneficiaryCreateDobFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.email.BeneficiaryCreateEmailFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.name.BeneficiaryCreateNameFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.relationship.BeneficiaryCreateSpousalAgreementFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindSavedState2;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.options.portfolioriskanalyzer.components.topnavrow.OptionsPortfolioRiskAnalyzerTopNavRowComposable;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.utils.extensions.Lists4;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion;
import com.truelayer.payments.analytics.sender.EventSenderWorker;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces;
import kotlin.properties.Interfaces2;
import kotlin.properties.Interfaces3;
import kotlin.reflect.KProperty;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryCreateStepsFragment.kt */
@Metadata(m3635d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0007\n\u0002\u0010 \n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 |2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n:\u0003}~|B\u0007¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\fJ\u0019\u0010\u0011\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0017\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u001b2\u0006\u0010#\u001a\u00020\"2\b\u0010$\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b%\u0010&J\u001f\u0010*\u001a\u00020\r2\u0006\u0010(\u001a\u00020'2\u0006\u0010)\u001a\u00020'H\u0016¢\u0006\u0004\b*\u0010+J!\u0010/\u001a\u00020\r2\u0006\u0010,\u001a\u00020'2\b\u0010.\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\r2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u0017\u00107\u001a\u00020\r2\u0006\u00106\u001a\u000205H\u0016¢\u0006\u0004\b7\u00108J\u0017\u0010:\u001a\u00020\r2\u0006\u00109\u001a\u00020'H\u0016¢\u0006\u0004\b:\u0010;J+\u0010?\u001a\u00020\r2\f\u0010=\u001a\b\u0012\u0004\u0012\u00020'0<2\f\u0010>\u001a\b\u0012\u0004\u0012\u00020-0<H\u0016¢\u0006\u0004\b?\u0010@J\u001f\u00103\u001a\u00020\r2\u0006\u0010.\u001a\u00020-2\u0006\u0010A\u001a\u00020\"H\u0016¢\u0006\u0004\b3\u0010BJ\u001f\u0010F\u001a\u00020\r2\u000e\u0010E\u001a\n\u0012\u0004\u0012\u00020D\u0018\u00010CH\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\rH\u0016¢\u0006\u0004\bH\u0010\fJ\u0010\u0010I\u001a\u00020\u001bH\u0096\u0001¢\u0006\u0004\bI\u0010JR\u001b\u0010P\u001a\u00020K8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bL\u0010M\u001a\u0004\bN\u0010OR/\u0010(\u001a\u0004\u0018\u00010'2\b\u0010Q\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010;R/\u0010)\u001a\u0004\u0018\u00010'2\b\u0010Q\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bW\u0010S\u001a\u0004\bX\u0010U\"\u0004\bY\u0010;R/\u0010,\u001a\u0004\u0018\u00010'2\b\u0010Q\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bZ\u0010S\u001a\u0004\b[\u0010U\"\u0004\b\\\u0010;R/\u00106\u001a\u0004\u0018\u0001052\b\u0010Q\u001a\u0004\u0018\u0001058B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b]\u0010S\u001a\u0004\b^\u0010_\"\u0004\b`\u00108R/\u00109\u001a\u0004\u0018\u00010'2\b\u0010Q\u001a\u0004\u0018\u00010'8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\ba\u0010S\u001a\u0004\bb\u0010U\"\u0004\bc\u0010;RK\u0010=\u001a\u0012\u0012\u0004\u0012\u00020'0dj\b\u0012\u0004\u0012\u00020'`e2\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020'0dj\b\u0012\u0004\u0012\u00020'`e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bf\u0010S\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jRK\u0010>\u001a\u0012\u0012\u0004\u0012\u00020-0dj\b\u0012\u0004\u0012\u00020-`e2\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u00020-0dj\b\u0012\u0004\u0012\u00020-`e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bk\u0010S\u001a\u0004\bl\u0010h\"\u0004\bm\u0010jRK\u0010q\u001a\u0012\u0012\u0004\u0012\u0002010dj\b\u0012\u0004\u0012\u000201`e2\u0016\u0010Q\u001a\u0012\u0012\u0004\u0012\u0002010dj\b\u0012\u0004\u0012\u000201`e8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bn\u0010S\u001a\u0004\bo\u0010h\"\u0004\bp\u0010jR/\u0010v\u001a\u0004\u0018\u0001012\b\u0010Q\u001a\u0004\u0018\u0001018B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\br\u0010S\u001a\u0004\bs\u0010t\"\u0004\bu\u00104R\u001a\u0010{\u001a\b\u0012\u0004\u0012\u00020x0w8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\by\u0010z¨\u0006\u007f"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateSpousalAgreementFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/relationship/BeneficiaryCreateRelationshipFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/dob/BeneficiaryCreateDobFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/email/BeneficiaryCreateEmailFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/accounts/BeneficiaryCreateAdditionalAccountsFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/finalize/BeneficiaryCreateFinalizeFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/agreement/BeneficiaryCreateAgreementFragment$Callbacks;", "<init>", "()V", "", "submitBeneficiary", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/Menu;", "menu", "Landroid/view/MenuInflater;", "inflater", "createOptionsMenu", "(Landroid/view/Menu;Landroid/view/MenuInflater;)V", "Landroid/view/MenuItem;", OptionsPortfolioRiskAnalyzerTopNavRowComposable.TEST_TAG_NAV_ROW_ITEM, "", "onOptionsItemSelected", "(Landroid/view/MenuItem;)Z", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "toolbar", "configureToolbar", "(Lcom/robinhood/android/common/ui/view/RhToolbar;)V", "", "id", "passthroughArgs", "onPositiveButtonClicked", "(ILandroid/os/Bundle;)Z", "", "firstName", "lastName", "onNameCompleted", "(Ljava/lang/String;Ljava/lang/String;)V", "relationship", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "agreement", "onRelationshipSelected", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;)V", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;", "signedAgreement", "onAgreementCompleted", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;)V", "j$/time/LocalDate", "dob", "onDobCompleted", "(Lj$/time/LocalDate;)V", "email", "onSubmitEmail", "(Ljava/lang/String;)V", "", "additionalAccounts", "additionalAgreements", "onSubmitAdditionalAccounts", "(Ljava/util/List;Ljava/util/List;)V", "currentAgreementIndex", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;I)V", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "postSubmitAlert", "onBeneficiaryCreateSuccess", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "onBeneficiaryCreateFailure", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "getCallbacks", "()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Callbacks;", "callbacks", "<set-?>", "firstName$delegate", "Lkotlin/properties/ReadWriteProperty;", "getFirstName", "()Ljava/lang/String;", "setFirstName", "lastName$delegate", "getLastName", "setLastName", "relationship$delegate", "getRelationship", "setRelationship", "dob$delegate", "getDob", "()Lj$/time/LocalDate;", "setDob", "email$delegate", "getEmail", "setEmail", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "additionalAccounts$delegate", "getAdditionalAccounts", "()Ljava/util/ArrayList;", "setAdditionalAccounts", "(Ljava/util/ArrayList;)V", "additionalAgreements$delegate", "getAdditionalAgreements", "setAdditionalAgreements", "signedAdditionalAgreements$delegate", "getSignedAdditionalAgreements", "setSignedAdditionalAgreements", "signedAdditionalAgreements", "signedSpousalAgreement$delegate", "getSignedSpousalAgreement", "()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;", "setSignedSpousalAgreement", "signedSpousalAgreement", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "Callbacks", "Args", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryCreateStepsFragment extends BaseFragment implements RegionGated, BeneficiaryCreateNameFragment.Callbacks, BeneficiaryCreateSpousalAgreementFragment.Callbacks, BeneficiaryCreateRelationshipFragment.Callbacks, BeneficiaryCreateDobFragment.Callbacks, BeneficiaryCreateEmailFragment.Callbacks, BeneficiaryCreateAdditionalAccountsFragment.Callbacks, BeneficiaryCreateFinalizeFragment.Callbacks, BeneficiaryCreateAgreementFragment.Callbacks {
    private static final String TAG_ABORT_CONFIRMATION = "beneficiary-flow-abort-confirmation";
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: additionalAccounts$delegate, reason: from kotlin metadata */
    private final Interfaces3 additionalAccounts;

    /* renamed from: additionalAgreements$delegate, reason: from kotlin metadata */
    private final Interfaces3 additionalAgreements;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks;

    /* renamed from: dob$delegate, reason: from kotlin metadata */
    private final Interfaces3 dob;

    /* renamed from: email$delegate, reason: from kotlin metadata */
    private final Interfaces3 email;

    /* renamed from: firstName$delegate, reason: from kotlin metadata */
    private final Interfaces3 firstName;

    /* renamed from: lastName$delegate, reason: from kotlin metadata */
    private final Interfaces3 lastName;

    /* renamed from: relationship$delegate, reason: from kotlin metadata */
    private final Interfaces3 relationship;

    /* renamed from: signedAdditionalAgreements$delegate, reason: from kotlin metadata */
    private final Interfaces3 signedAdditionalAgreements;

    /* renamed from: signedSpousalAgreement$delegate, reason: from kotlin metadata */
    private final Interfaces3 signedSpousalAgreement;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Callbacks;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "firstName", "getFirstName()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "lastName", "getLastName()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "relationship", "getRelationship()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "dob", "getDob()Ljava/time/LocalDate;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "email", "getEmail()Ljava/lang/String;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "additionalAccounts", "getAdditionalAccounts()Ljava/util/ArrayList;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "additionalAgreements", "getAdditionalAgreements()Ljava/util/ArrayList;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "signedAdditionalAgreements", "getSignedAdditionalAgreements()Ljava/util/ArrayList;", 0)), Reflection.mutableProperty1(new MutablePropertyReference1Impl(BeneficiaryCreateStepsFragment.class, "signedSpousalAgreement", "getSignedSpousalAgreement()Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySignedAgreement;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: BeneficiaryCreateStepsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H&J\b\u0010\u0007\u001a\u00020\u0003H&¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Callbacks;", "", "onBeneficiaryFlowStepsCompleted", "", "postSubmitAlert", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onBeneficiaryFlowStepsAborted", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onBeneficiaryFlowStepsAborted();

        void onBeneficiaryFlowStepsCompleted(GenericAlertContent<? extends GenericAction> postSubmitAlert);
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public BeneficiaryCreateStepsFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);
        this.callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateStepsFragment$special$$inlined$parentFragmentCallbacks$1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Fragment CallbacksProperty) {
                Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
                Fragment fragmentRequireParentFragment = CallbacksProperty.requireParentFragment();
                Intrinsics.checkNotNullExpressionValue(fragmentRequireParentFragment, "requireParentFragment(...)");
                return fragmentRequireParentFragment;
            }
        });
        Interfaces<Object, Interfaces3<Object, String>> interfacesSavedString = BindSavedState2.savedString(this);
        KProperty<?>[] kPropertyArr = $$delegatedProperties;
        this.firstName = interfacesSavedString.provideDelegate(this, kPropertyArr[1]);
        this.lastName = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[2]);
        this.relationship = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[3]);
        this.dob = (Interfaces3) BindSavedState2.savedSerializable(this).provideDelegate(this, kPropertyArr[4]);
        this.email = BindSavedState2.savedString(this).provideDelegate(this, kPropertyArr[5]);
        this.additionalAccounts = BindSavedState2.savedStringArrayList(this, new ArrayList()).provideDelegate(this, kPropertyArr[6]);
        this.additionalAgreements = (Interfaces3) BindSavedState2.savedParcelableArrayList(this, new ArrayList()).provideDelegate(this, kPropertyArr[7]);
        this.signedAdditionalAgreements = (Interfaces3) BindSavedState2.savedParcelableArrayList(this, new ArrayList()).provideDelegate(this, kPropertyArr[8]);
        this.signedSpousalAgreement = (Interfaces3) BindSavedState2.savedParcelable(this).provideDelegate(this, kPropertyArr[9]);
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final String getFirstName() {
        return (String) this.firstName.getValue(this, $$delegatedProperties[1]);
    }

    private final void setFirstName(String str) {
        this.firstName.setValue(this, $$delegatedProperties[1], str);
    }

    private final String getLastName() {
        return (String) this.lastName.getValue(this, $$delegatedProperties[2]);
    }

    private final void setLastName(String str) {
        this.lastName.setValue(this, $$delegatedProperties[2], str);
    }

    private final String getRelationship() {
        return (String) this.relationship.getValue(this, $$delegatedProperties[3]);
    }

    private final void setRelationship(String str) {
        this.relationship.setValue(this, $$delegatedProperties[3], str);
    }

    private final LocalDate getDob() {
        return (LocalDate) this.dob.getValue(this, $$delegatedProperties[4]);
    }

    private final void setDob(LocalDate localDate) {
        this.dob.setValue(this, $$delegatedProperties[4], localDate);
    }

    private final String getEmail() {
        return (String) this.email.getValue(this, $$delegatedProperties[5]);
    }

    private final void setEmail(String str) {
        this.email.setValue(this, $$delegatedProperties[5], str);
    }

    private final ArrayList<String> getAdditionalAccounts() {
        return (ArrayList) this.additionalAccounts.getValue(this, $$delegatedProperties[6]);
    }

    private final void setAdditionalAccounts(ArrayList<String> arrayList) {
        this.additionalAccounts.setValue(this, $$delegatedProperties[6], arrayList);
    }

    private final ArrayList<ApiBeneficiaryAgreementViewModel> getAdditionalAgreements() {
        return (ArrayList) this.additionalAgreements.getValue(this, $$delegatedProperties[7]);
    }

    private final void setAdditionalAgreements(ArrayList<ApiBeneficiaryAgreementViewModel> arrayList) {
        this.additionalAgreements.setValue(this, $$delegatedProperties[7], arrayList);
    }

    private final ArrayList<ApiBeneficiarySignedAgreement> getSignedAdditionalAgreements() {
        return (ArrayList) this.signedAdditionalAgreements.getValue(this, $$delegatedProperties[8]);
    }

    private final void setSignedAdditionalAgreements(ArrayList<ApiBeneficiarySignedAgreement> arrayList) {
        this.signedAdditionalAgreements.setValue(this, $$delegatedProperties[8], arrayList);
    }

    private final ApiBeneficiarySignedAgreement getSignedSpousalAgreement() {
        return (ApiBeneficiarySignedAgreement) this.signedSpousalAgreement.getValue(this, $$delegatedProperties[9]);
    }

    private final void setSignedSpousalAgreement(ApiBeneficiarySignedAgreement apiBeneficiarySignedAgreement) {
        this.signedSpousalAgreement.setValue(this, $$delegatedProperties[9], apiBeneficiarySignedAgreement);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setHasOptionsMenu(true);
        if (savedInstanceState == null) {
            setFragment(C11048R.id.fragment_container, BeneficiaryCreateNameFragment.INSTANCE.newInstance((Parcelable) ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration()));
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.createOptionsMenu(menu, inflater);
        inflater.inflate(C9637R.menu.menu_beneficiary_steps, menu);
    }

    @Override // androidx.fragment.app.Fragment
    public boolean onOptionsItemSelected(MenuItem item) {
        Intrinsics.checkNotNullParameter(item, "item");
        if (item.getItemId() == C9637R.id.action_close) {
            RhDialogFragment.Companion companion = RhDialogFragment.INSTANCE;
            Context contextRequireContext = requireContext();
            Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
            RhDialogFragment.Builder negativeButton = companion.create(contextRequireContext).setId(C9637R.id.dialog_id_beneficiary_flow_abort_confirmation).setTitle(C9637R.string.beneficiary_create_abort_confirmation_title, new Object[0]).setMessage(C9637R.string.beneficiary_create_abort_confirmation_message, new Object[0]).setPositiveButton(C9637R.string.beneficiary_create_abort_confirmation_quit, new Object[0]).setNegativeButton(C11048R.string.general_label_cancel, new Object[0]);
            FragmentManager childFragmentManager = getChildFragmentManager();
            Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
            RhDialogFragment.Builder.show$default(negativeButton, childFragmentManager, TAG_ABORT_CONFIRMATION, false, 4, null);
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RhFragment
    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        super.configureToolbar(toolbar);
        toolbar.getProgressBar().setProgress(0, 0.0f, false);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        if (id == C9637R.id.dialog_id_beneficiary_flow_abort_confirmation) {
            getCallbacks().onBeneficiaryFlowStepsAborted();
            return true;
        }
        return super.onPositiveButtonClicked(id, passthroughArgs);
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameFragment.Callbacks
    public void onNameCompleted(String firstName, String lastName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        setFirstName(firstName);
        setLastName(lastName);
        replaceFragment(BeneficiaryCreateRelationshipFragment.INSTANCE.newInstance((Parcelable) ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration()));
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateRelationshipFragment.Callbacks
    public void onRelationshipSelected(String relationship, ApiBeneficiaryAgreementViewModel agreement) {
        Intrinsics.checkNotNullParameter(relationship, "relationship");
        setRelationship(relationship);
        if (agreement != null) {
            replaceFragment(BeneficiaryCreateSpousalAgreementFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryCreateSpousalAgreementFragment.Args(agreement, ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration())));
        } else {
            replaceFragment(BeneficiaryCreateDobFragment.INSTANCE.newInstance((Parcelable) ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration()));
        }
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.relationship.BeneficiaryCreateSpousalAgreementFragment.Callbacks
    public void onAgreementCompleted(ApiBeneficiarySignedAgreement signedAgreement) {
        Intrinsics.checkNotNullParameter(signedAgreement, "signedAgreement");
        setSignedSpousalAgreement(signedAgreement);
        replaceFragment(BeneficiaryCreateDobFragment.INSTANCE.newInstance((Parcelable) ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration()));
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.dob.BeneficiaryCreateDobFragment.Callbacks
    public void onDobCompleted(LocalDate dob) {
        Intrinsics.checkNotNullParameter(dob, "dob");
        setDob(dob);
        replaceFragment(BeneficiaryCreateEmailFragment.INSTANCE.newInstance((Parcelable) ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration()));
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.email.BeneficiaryCreateEmailFragment.Callbacks
    public void onSubmitEmail(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        setEmail(email);
        Companion companion = INSTANCE;
        if (((Args) companion.getArgs((Fragment) this)).getConfiguration().getAccount_view_model() == null) {
            submitBeneficiary();
            return;
        }
        BeneficiaryCreateAdditionalAccountsFragment.Companion companion2 = BeneficiaryCreateAdditionalAccountsFragment.INSTANCE;
        ApiCreateBeneficiaryConfiguration configuration = ((Args) companion.getArgs((Fragment) this)).getConfiguration();
        ApiCreateBeneficiaryAccountViewModel account_view_model = ((Args) companion.getArgs((Fragment) this)).getConfiguration().getAccount_view_model();
        if (account_view_model == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String relationship = getRelationship();
        if (relationship != null) {
            replaceFragment(companion2.newInstance((Parcelable) new BeneficiaryCreateAdditionalAccountsFragment.Args(configuration, account_view_model, relationship)));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.accounts.BeneficiaryCreateAdditionalAccountsFragment.Callbacks
    public void onSubmitAdditionalAccounts(List<String> additionalAccounts, List<ApiBeneficiaryAgreementViewModel> additionalAgreements) {
        Intrinsics.checkNotNullParameter(additionalAccounts, "additionalAccounts");
        Intrinsics.checkNotNullParameter(additionalAgreements, "additionalAgreements");
        setAdditionalAccounts(Lists4.toArrayList(additionalAccounts));
        setAdditionalAgreements(Lists4.toArrayList(additionalAgreements));
        if (additionalAgreements.isEmpty()) {
            submitBeneficiary();
        } else {
            replaceFragment(BeneficiaryCreateAgreementFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryCreateAgreementFragment.Args((ApiBeneficiaryAgreementViewModel) CollectionsKt.first((List) additionalAgreements), 0)));
        }
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.agreement.BeneficiaryCreateAgreementFragment.Callbacks
    public void onAgreementCompleted(ApiBeneficiaryAgreementViewModel agreement, int currentAgreementIndex) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        getSignedAdditionalAgreements().add(new ApiBeneficiarySignedAgreement(agreement.getContentful_id(), agreement.getAgreement_type(), agreement.getAgreement_context(), agreement.getAccount_number(), 0, 16, null));
        int i = currentAgreementIndex + 1;
        if (i > CollectionsKt.getLastIndex(getAdditionalAgreements())) {
            submitBeneficiary();
            return;
        }
        BeneficiaryCreateAgreementFragment.Companion companion = BeneficiaryCreateAgreementFragment.INSTANCE;
        ApiBeneficiaryAgreementViewModel apiBeneficiaryAgreementViewModel = getAdditionalAgreements().get(i);
        Intrinsics.checkNotNullExpressionValue(apiBeneficiaryAgreementViewModel, "get(...)");
        replaceFragment(companion.newInstance((Parcelable) new BeneficiaryCreateAgreementFragment.Args(apiBeneficiaryAgreementViewModel, i)));
    }

    private final void submitBeneficiary() {
        BeneficiaryCreateFinalizeFragment.Companion companion = BeneficiaryCreateFinalizeFragment.INSTANCE;
        ApiCreateBeneficiaryConfiguration configuration = ((Args) INSTANCE.getArgs((Fragment) this)).getConfiguration();
        String email = getEmail();
        if (email == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String firstName = getFirstName();
        if (firstName == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String lastName = getLastName();
        if (lastName == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        String relationship = getRelationship();
        if (relationship == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        LocalDate dob = getDob();
        if (dob != null) {
            replaceFragment(companion.newInstance((Parcelable) new BeneficiaryCreateFinalizeFragment.Args(configuration, email, firstName, lastName, relationship, dob, getSignedSpousalAgreement(), getAdditionalAccounts(), getSignedAdditionalAgreements())));
            return;
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment.Callbacks
    public void onBeneficiaryCreateSuccess(GenericAlertContent<? extends GenericAction> postSubmitAlert) {
        getCallbacks().onBeneficiaryFlowStepsCompleted(postSubmitAlert);
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.finalize.BeneficiaryCreateFinalizeFragment.Callbacks
    public void onBeneficiaryCreateFailure() {
        popLastFragment();
    }

    /* compiled from: BeneficiaryCreateStepsFragment.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0006\u0010\n\u001a\u00020\u000bJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u000bHÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\u0016\u0010\u0013\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u00162\u0006\u0010\u0017\u001a\u00020\u000bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Args;", "Landroid/os/Parcelable;", EventSenderWorker.INPUT_DATA_KEY_CONFIGURATION, "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "(Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;)V", "getConfiguration", "()Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "component1", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class Args implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<Args> CREATOR = new Creator();
        private final ApiCreateBeneficiaryConfiguration configuration;

        /* compiled from: BeneficiaryCreateStepsFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<Args> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new Args((ApiCreateBeneficiaryConfiguration) parcel.readParcelable(Args.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i) {
                return new Args[i];
            }
        }

        public static /* synthetic */ Args copy$default(Args args, ApiCreateBeneficiaryConfiguration apiCreateBeneficiaryConfiguration, int i, Object obj) {
            if ((i & 1) != 0) {
                apiCreateBeneficiaryConfiguration = args.configuration;
            }
            return args.copy(apiCreateBeneficiaryConfiguration);
        }

        /* renamed from: component1, reason: from getter */
        public final ApiCreateBeneficiaryConfiguration getConfiguration() {
            return this.configuration;
        }

        public final Args copy(ApiCreateBeneficiaryConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            return new Args(configuration);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Args) && Intrinsics.areEqual(this.configuration, ((Args) other).configuration);
        }

        public int hashCode() {
            return this.configuration.hashCode();
        }

        public String toString() {
            return "Args(configuration=" + this.configuration + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.configuration, flags);
        }

        public Args(ApiCreateBeneficiaryConfiguration configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.configuration = configuration;
        }

        public final ApiCreateBeneficiaryConfiguration getConfiguration() {
            return this.configuration;
        }
    }

    /* compiled from: BeneficiaryCreateStepsFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Args;", "<init>", "()V", "TAG_ABORT_CONFIRMATION", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithArgsCompanion<BeneficiaryCreateStepsFragment, Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public Args getArgs(BeneficiaryCreateStepsFragment beneficiaryCreateStepsFragment) {
            return (Args) FragmentWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryCreateStepsFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryCreateStepsFragment newInstance(Args args) {
            return (BeneficiaryCreateStepsFragment) FragmentWithArgsCompanion.DefaultImpls.newInstance(this, args);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryCreateStepsFragment beneficiaryCreateStepsFragment, Args args) {
            FragmentWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryCreateStepsFragment, args);
        }
    }
}
