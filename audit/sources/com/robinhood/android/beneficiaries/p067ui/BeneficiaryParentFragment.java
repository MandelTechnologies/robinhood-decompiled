package com.robinhood.android.beneficiaries.p067ui;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.robinhood.android.beneficiaries.contracts.BeneficiariesFragmentKey;
import com.robinhood.android.beneficiaries.extension.Fragments;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiarySplashViewModel;
import com.robinhood.android.beneficiaries.p067ui.BeneficiaryEvent;
import com.robinhood.android.beneficiaries.p067ui.detail.BeneficiaryDetailFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateParentFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.BeneficiaryCreateStepsFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.agreement.BeneficiaryCreateAgreementFragment;
import com.robinhood.android.beneficiaries.p067ui.individualflow.intro.BeneficiaryValuePropFragment;
import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowFragment;
import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowResult;
import com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListCallbacks;
import com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListFragment;
import com.robinhood.android.beneficiaries.p067ui.selectaccount.BeneficiarySelectAccountFragment;
import com.robinhood.android.beneficiaries.p067ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment;
import com.robinhood.android.beneficiaries.p067ui.trustflow.date.BeneficiaryTrustDateFragment;
import com.robinhood.android.beneficiaries.p067ui.trustflow.email.BeneficiaryTrustEmailFragment;
import com.robinhood.android.beneficiaries.p067ui.trustflow.loading.BeneficiaryTrustLoadingFragment;
import com.robinhood.android.beneficiaries.p067ui.trustflow.name.BeneficiaryTrustNameFragment;
import com.robinhood.android.beneficiaries.p067ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierFragment;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BaseRhBottomSheetDialogHostFragment;
import com.robinhood.android.common.udf.DuxosKt;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.navigation.FragmentResolverWithArgsCompanion;
import com.robinhood.android.regiongate.BeneficiariesRegionGate;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.android.udf.event.Event;
import com.robinhood.android.udf.event.EventConsumer;
import com.robinhood.android.util.p275rx.AbsErrorHandler;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import com.robinhood.models.serverdriven.experimental.api.GenericAlertContent;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import io.noties.markwon.Markwon;
import java.util.List;
import java.util.Set;
import java.util.UUID;
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
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.StateFlow;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryParentFragment.kt */
@Metadata(m3635d1 = {"\u0000Ø\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\b\b\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 p2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t2\u00020\n2\u00020\u000b2\u00020\f2\u00020\r2\u00020\u000e2\u00020\u000f:\u0001pB\u0007¢\u0006\u0004\b\u0010\u0010\u0011J\u001f\u0010\u0016\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0018\u001a\u00020\u00152\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0017J\u000f\u0010\u0019\u001a\u00020\u0015H\u0002¢\u0006\u0004\b\u0019\u0010\u0011J\u0017\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u0019\u0010 \u001a\u00020\u00152\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b \u0010!J!\u0010$\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\"2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001eH\u0016¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\u00152\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0016¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0015H\u0016¢\u0006\u0004\b+\u0010\u0011J\u0017\u0010.\u001a\u00020\u00152\u0006\u0010-\u001a\u00020,H\u0016¢\u0006\u0004\b.\u0010/J\u0017\u00102\u001a\u00020\u00152\u0006\u00101\u001a\u000200H\u0016¢\u0006\u0004\b2\u00103J\u0017\u00106\u001a\u00020\u00152\u0006\u00105\u001a\u000204H\u0016¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00152\u0006\u00108\u001a\u000200H\u0016¢\u0006\u0004\b9\u00103J\u0017\u0010;\u001a\u00020\u00152\u0006\u0010:\u001a\u000200H\u0016¢\u0006\u0004\b;\u00103J+\u0010@\u001a\u00020\u00152\f\u0010=\u001a\b\u0012\u0004\u0012\u0002000<2\f\u0010?\u001a\b\u0012\u0004\u0012\u00020>0<H\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020\u00152\u0006\u0010B\u001a\u00020>2\u0006\u0010D\u001a\u00020CH\u0016¢\u0006\u0004\bE\u0010FJ\u001f\u0010J\u001a\u00020\u00152\u0006\u0010G\u001a\u0002002\u0006\u0010I\u001a\u00020HH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0015H\u0016¢\u0006\u0004\bL\u0010\u0011J\u0017\u0010M\u001a\u00020\u00152\u0006\u0010G\u001a\u000200H\u0016¢\u0006\u0004\bM\u00103J\u001f\u0010P\u001a\u00020\u00152\u0006\u0010G\u001a\u0002002\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bP\u0010QJ\u001f\u0010R\u001a\u00020\u00152\u0006\u0010G\u001a\u0002002\u0006\u0010O\u001a\u00020NH\u0016¢\u0006\u0004\bR\u0010QJ\u001f\u0010S\u001a\u00020\u00152\u000e\u0010(\u001a\n\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0016¢\u0006\u0004\bS\u0010*J\u000f\u0010T\u001a\u00020\u0015H\u0016¢\u0006\u0004\bT\u0010\u0011J\u0017\u0010W\u001a\u00020\u00152\u0006\u0010V\u001a\u00020UH\u0016¢\u0006\u0004\bW\u0010XJ\u000f\u0010Y\u001a\u00020\u0015H\u0016¢\u0006\u0004\bY\u0010\u0011J\u0010\u0010Z\u001a\u00020HH\u0096\u0001¢\u0006\u0004\bZ\u0010[R\u001b\u0010a\u001a\u00020\\8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b]\u0010^\u001a\u0004\b_\u0010`R\"\u0010c\u001a\u00020b8\u0006@\u0006X\u0087.¢\u0006\u0012\n\u0004\bc\u0010d\u001a\u0004\be\u0010f\"\u0004\bg\u0010hR\u0014\u0010j\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bi\u0010[R\u001a\u0010o\u001a\b\u0012\u0004\u0012\u00020l0k8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bm\u0010n¨\u0006q"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentFragment;", "Lcom/robinhood/android/common/ui/BaseRhBottomSheetDialogHostFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/beneficiaries/ui/list/BeneficiaryListCallbacks;", "Lcom/robinhood/android/beneficiaries/ui/selectaccount/BeneficiarySelectAccountFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateParentFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/detail/BeneficiaryDetailFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/intro/BeneficiaryValuePropFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/name/BeneficiaryTrustNameFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/date/BeneficiaryTrustDateFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/taxidentifier/BeneficiaryTrustTaxIdentifierFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/email/BeneficiaryTrustEmailFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/trustflow/accounts/BeneficiaryAdditionalAccountsFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/BeneficiaryCreateStepsFragment$Callbacks;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/agreement/BeneficiaryCreateAgreementFragment$Callbacks;", "<init>", "()V", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "event", "", "collectV2BeneficiaryIndividualFlowEvent", "(Lcom/robinhood/android/udf/event/Event;)V", "collectV2BeneficiaryTrustFlowEvent", "setRootFragment", "Landroid/content/Context;", "context", "onAttach", "(Landroid/content/Context;)V", "Landroid/os/Bundle;", "savedInstanceState", "onCreate", "(Landroid/os/Bundle;)V", "Landroid/view/View;", "view", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "postSubmitAlert", "onBeneficiaryFlowStepsCompleted", "(Lcom/robinhood/models/serverdriven/experimental/api/GenericAlertContent;)V", "onBeneficiaryFlowStepsAborted", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;", "beneficiaryIntroFlowResult", "beneficiaryIntroFlowComplete", "(Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;)V", "", "name", "beneficiaryTrustNameConfirmed", "(Ljava/lang/String;)V", "j$/time/LocalDate", InquiryField.DateField.TYPE, "beneficiaryTrustDateConfirmed", "(Lj$/time/LocalDate;)V", "taxIdentifier", "beneficiaryTrustTaxIdentifierConfirmed", "email", "beneficiaryTrustEmailConfirmed", "", "additionalAccounts", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "additionalAgreements", "onSubmitAdditionalAccounts", "(Ljava/util/List;Ljava/util/List;)V", "agreement", "", "currentAgreementIndex", "onAgreementCompleted", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;I)V", "accountNumber", "", "hasMultipleAccounts", "onAccountSelected", "(Ljava/lang/String;Z)V", "onLoadAccountsFailed", "onAddBeneficiary", "Ljava/util/UUID;", "beneficiaryId", "onUpdateBeneficiary", "(Ljava/lang/String;Ljava/util/UUID;)V", "onBeneficiaryClicked", "onBeneficiaryFlowCompleted", "onBeneficiaryFlowAborted", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;", "splashViewModel", "onValuePropsClicked", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiarySplashViewModel;)V", "onValuePropCompleted", "onDismissUnsupportedFeatureDialog", "()Z", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "getDuxo", "()Lcom/robinhood/android/beneficiaries/ui/BeneficiaryDuxo;", "duxo", "Lio/noties/markwon/Markwon;", "markwon", "Lio/noties/markwon/Markwon;", "getMarkwon", "()Lio/noties/markwon/Markwon;", "setMarkwon", "(Lio/noties/markwon/Markwon;)V", "getUseDesignSystemToolbar", "useDesignSystemToolbar", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "requiresRegionGates", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryParentFragment extends BaseRhBottomSheetDialogHostFragment implements RegionGated, BeneficiaryListCallbacks, BeneficiarySelectAccountFragment.Callbacks, BeneficiaryCreateParentFragment.Callbacks, BeneficiaryDetailFragment.Callbacks, BeneficiaryValuePropFragment.Callbacks, BeneficiaryIntroFlowFragment.Callbacks, BeneficiaryTrustNameFragment.Callbacks, BeneficiaryTrustDateFragment.Callbacks, BeneficiaryTrustTaxIdentifierFragment.Callbacks, BeneficiaryTrustEmailFragment.Callbacks, BeneficiaryAdditionalAccountsFragment.Callbacks, BeneficiaryCreateStepsFragment.Callbacks, BeneficiaryCreateAgreementFragment.Callbacks {
    private final /* synthetic */ RegionGated2 $$delegate_0;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    public Markwon markwon;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getUseDesignSystemToolbar() {
        return true;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collectV2BeneficiaryIndividualFlowEvent(final Event<BeneficiaryEvent> event) {
        EventConsumer<BeneficiaryEvent> eventConsumerInvoke;
        if (event == null || !(event.getData() instanceof BeneficiaryEvent.NavigateToIndividualFlow) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$collectV2BeneficiaryIndividualFlowEvent$$inlined$consumeIfType$1
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m11368invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11368invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BeneficiaryEvent.NavigateToIndividualFlow navigateToIndividualFlow = (BeneficiaryEvent.NavigateToIndividualFlow) event.getData();
                this.popLastFragment();
                this.replaceFragment(BeneficiaryCreateStepsFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryCreateStepsFragment.Args(navigateToIndividualFlow.getApiCreateBeneficiaryConfiguration())));
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void collectV2BeneficiaryTrustFlowEvent(final Event<BeneficiaryEvent> event) {
        EventConsumer<BeneficiaryEvent> eventConsumerInvoke;
        EventConsumer<BeneficiaryEvent> eventConsumerInvoke2;
        EventConsumer<BeneficiaryEvent> eventConsumerInvoke3;
        EventConsumer<BeneficiaryEvent> eventConsumerInvoke4;
        if (event != null && (event.getData() instanceof BeneficiaryEvent.NavigateToTrustNameScreen) && (eventConsumerInvoke4 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke4.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$collectV2BeneficiaryTrustFlowEvent$$inlined$consumeIfType$1
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11369invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11369invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BeneficiaryEvent.NavigateToTrustNameScreen navigateToTrustNameScreen = (BeneficiaryEvent.NavigateToTrustNameScreen) event.getData();
                    this.popLastFragment();
                    this.replaceFragmentWithoutAnimation(BeneficiaryTrustNameFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryTrustNameFragment.Args(navigateToTrustNameScreen.getTrustNameViewState(), navigateToTrustNameScreen.getToolbarViewState())));
                }
            });
        }
        if (event != null && (event.getData() instanceof BeneficiaryEvent.NavigateToTrustDateScreen) && (eventConsumerInvoke3 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke3.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$collectV2BeneficiaryTrustFlowEvent$$inlined$consumeIfType$2
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11370invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11370invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BeneficiaryEvent.NavigateToTrustDateScreen navigateToTrustDateScreen = (BeneficiaryEvent.NavigateToTrustDateScreen) event.getData();
                    this.replaceFragment(BeneficiaryTrustDateFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryTrustDateFragment.Args(navigateToTrustDateScreen.getTrustDateViewState(), navigateToTrustDateScreen.getToolbarViewState())));
                }
            });
        }
        if (event != null && (event.getData() instanceof BeneficiaryEvent.NavigateToTrustTaxIdentifierScreen) && (eventConsumerInvoke2 = event.getGetEventConsumer().invoke()) != null) {
            eventConsumerInvoke2.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$collectV2BeneficiaryTrustFlowEvent$$inlined$consumeIfType$3
                @Override // kotlin.jvm.functions.Function1
                public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                    m11371invoke(obj);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: collision with other method in class */
                public final void m11371invoke(Object it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    BeneficiaryEvent.NavigateToTrustTaxIdentifierScreen navigateToTrustTaxIdentifierScreen = (BeneficiaryEvent.NavigateToTrustTaxIdentifierScreen) event.getData();
                    this.replaceFragment(BeneficiaryTrustTaxIdentifierFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryTrustTaxIdentifierFragment.Args(navigateToTrustTaxIdentifierScreen.getTaxIdentifierViewModel(), navigateToTrustTaxIdentifierScreen.getToolbarViewState())));
                }
            });
        }
        if (event == null || !(event.getData() instanceof BeneficiaryEvent.NavigateToTrustEmailScreen) || (eventConsumerInvoke = event.getGetEventConsumer().invoke()) == null) {
            return;
        }
        eventConsumerInvoke.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$collectV2BeneficiaryTrustFlowEvent$$inlined$consumeIfType$4
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                m11372invoke(obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m11372invoke(Object it) {
                Intrinsics.checkNotNullParameter(it, "it");
                BeneficiaryEvent.NavigateToTrustEmailScreen navigateToTrustEmailScreen = (BeneficiaryEvent.NavigateToTrustEmailScreen) event.getData();
                this.replaceFragment(BeneficiaryTrustEmailFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryTrustEmailFragment.Args(navigateToTrustEmailScreen.getEmailViewModel(), navigateToTrustEmailScreen.getToolbarViewState())));
            }
        });
    }

    public BeneficiaryParentFragment() {
        super(C11048R.layout.parent_fragment_container);
        this.$$delegate_0 = new RegionGated2(BeneficiariesRegionGate.INSTANCE);
        this.duxo = DuxosKt.duxo(this, BeneficiaryDuxo.class);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BeneficiaryDuxo getDuxo() {
        return (BeneficiaryDuxo) this.duxo.getValue();
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

    @Override // com.robinhood.android.common.p088ui.RxFragment, com.robinhood.hammer.android.fragment.HammerFragment, androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super.onAttach(context);
        ScarletContextWrapper scarletContextWrapper = new ScarletContextWrapper(context, null, null, 6, null);
        putDesignSystemOverlay(scarletContextWrapper);
        ScarletManager.putOverlay$default(getScarletManager(), AchromaticOverlay.INSTANCE, null, 2, null);
        setScarletContextWrapper(scarletContextWrapper);
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requireActivity().getWindow().setSoftInputMode(16);
        if (savedInstanceState == null) {
            setRootFragment();
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        BaseFragment.collectDuxoState$default(this, null, new C96781(null), 1, null);
    }

    /* compiled from: BeneficiaryParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1", m3645f = "BeneficiaryParentFragment.kt", m3646l = {93}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1 */
    static final class C96781 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C96781(Continuation<? super C96781> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryParentFragment.this.new C96781(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96781) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryParentFragment.kt */
        @Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003H\n"}, m3636d2 = {"<anonymous>", "", "event", "Lcom/robinhood/android/udf/event/Event;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1", m3645f = "BeneficiaryParentFragment.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Event<BeneficiaryEvent>, Continuation<? super Unit>, Object> {
            /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ BeneficiaryParentFragment this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryParentFragment beneficiaryParentFragment, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryParentFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Event<BeneficiaryEvent> event, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(event, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                EventConsumer eventConsumer;
                EventConsumer eventConsumer2;
                EventConsumer eventConsumer3;
                EventConsumer eventConsumer4;
                EventConsumer eventConsumer5;
                EventConsumer eventConsumer6;
                EventConsumer eventConsumer7;
                EventConsumer eventConsumer8;
                EventConsumer eventConsumer9;
                EventConsumer eventConsumer10;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                final Event event = (Event) this.L$0;
                this.this$0.collectV2BeneficiaryIndividualFlowEvent(event);
                this.this$0.collectV2BeneficiaryTrustFlowEvent(event);
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToBeneficiaryIntroFlow) && (eventConsumer10 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer10.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$1
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11373invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11373invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryParentFragment.replaceFragment(BeneficiaryIntroFlowFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryIntroFlowFragment.Args(((BeneficiaryEvent.NavigateToBeneficiaryIntroFlow) event.getData()).getAccountNumber())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment2 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToCreateParentBeneficiaryListFragment) && (eventConsumer9 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer9.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$2
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11375invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11375invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BeneficiaryEvent.NavigateToCreateParentBeneficiaryListFragment navigateToCreateParentBeneficiaryListFragment = (BeneficiaryEvent.NavigateToCreateParentBeneficiaryListFragment) event.getData();
                                BeneficiaryListFragment beneficiaryListFragment = (BeneficiaryListFragment) BeneficiaryListFragment.INSTANCE.newInstance((Parcelable) new BeneficiariesFragmentKey.List(navigateToCreateParentBeneficiaryListFragment.getAccountNumber()));
                                if (navigateToCreateParentBeneficiaryListFragment.getHasMultipleAccounts()) {
                                    beneficiaryParentFragment2.replaceFragment(beneficiaryListFragment);
                                } else {
                                    beneficiaryParentFragment2.replaceFragmentWithoutAnimationAndBackStack(beneficiaryListFragment);
                                }
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment3 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToCreateParentBeneficiaryAddFragment) && (eventConsumer8 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer8.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$3
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11376invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11376invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryParentFragment3.replaceFragment(BeneficiaryCreateParentFragment.INSTANCE.newInstance((Parcelable) new BeneficiariesFragmentKey.UpdateBeneficiary(((BeneficiaryEvent.NavigateToCreateParentBeneficiaryAddFragment) event.getData()).getAccountNumber(), null, 2, null)));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment4 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToCreateParentBeneficiaryUpdateFragment) && (eventConsumer7 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer7.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$4
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11377invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11377invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BeneficiaryEvent.NavigateToCreateParentBeneficiaryUpdateFragment navigateToCreateParentBeneficiaryUpdateFragment = (BeneficiaryEvent.NavigateToCreateParentBeneficiaryUpdateFragment) event.getData();
                                beneficiaryParentFragment4.replaceFragment(BeneficiaryCreateParentFragment.INSTANCE.newInstance((Parcelable) new BeneficiariesFragmentKey.UpdateBeneficiary(navigateToCreateParentBeneficiaryUpdateFragment.getAccountNumber(), navigateToCreateParentBeneficiaryUpdateFragment.getBeneficiaryId())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment5 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToCreateParentBeneficiaryDetailsFragment) && (eventConsumer6 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer6.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$5
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11378invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11378invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BeneficiaryEvent.NavigateToCreateParentBeneficiaryDetailsFragment navigateToCreateParentBeneficiaryDetailsFragment = (BeneficiaryEvent.NavigateToCreateParentBeneficiaryDetailsFragment) event.getData();
                                beneficiaryParentFragment5.replaceFragment(BeneficiaryDetailFragment.INSTANCE.newInstance((Parcelable) new BeneficiariesFragmentKey.Detail(navigateToCreateParentBeneficiaryDetailsFragment.getAccountNumber(), navigateToCreateParentBeneficiaryDetailsFragment.getBeneficiaryId())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment6 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToAdditionalAccountsScreen) && (eventConsumer5 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer5.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$6
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11379invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11379invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BeneficiaryEvent.NavigateToAdditionalAccountsScreen navigateToAdditionalAccountsScreen = (BeneficiaryEvent.NavigateToAdditionalAccountsScreen) event.getData();
                                beneficiaryParentFragment6.replaceFragment(BeneficiaryAdditionalAccountsFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryAdditionalAccountsFragment.Args(navigateToAdditionalAccountsScreen.getAccountNumber(), navigateToAdditionalAccountsScreen.getBeneficiaryUuid(), navigateToAdditionalAccountsScreen.getAccountViewModel(), navigateToAdditionalAccountsScreen.getToolbarViewState())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment7 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToAdditionalAgreementScreen) && (eventConsumer4 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer4.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$7
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11380invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11380invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                BeneficiaryEvent.NavigateToAdditionalAgreementScreen navigateToAdditionalAgreementScreen = (BeneficiaryEvent.NavigateToAdditionalAgreementScreen) event.getData();
                                beneficiaryParentFragment7.replaceFragment(BeneficiaryCreateAgreementFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryCreateAgreementFragment.Args(navigateToAdditionalAgreementScreen.getAgreement(), navigateToAdditionalAgreementScreen.getIndex())));
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment8 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.ShowErrorAlertDialog) && (eventConsumer3 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer3.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$8
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11381invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11381invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                AbsErrorHandler.handleError$default(beneficiaryParentFragment8.getActivityErrorHandler(), ((BeneficiaryEvent.ShowErrorAlertDialog) event.getData()).getException(), false, 2, null);
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment9 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateToLoadingScreen) && (eventConsumer2 = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer2.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$9
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11382invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11382invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryParentFragment9.replaceFragment(new BeneficiaryTrustLoadingFragment());
                            }
                        });
                    }
                }
                if (event != null) {
                    final BeneficiaryParentFragment beneficiaryParentFragment10 = this.this$0;
                    if ((event.getData() instanceof BeneficiaryEvent.NavigateBackFromBeneficiaryFlowFragment) && (eventConsumer = (EventConsumer) event.getGetEventConsumer().invoke()) != null) {
                        eventConsumer.consume(event, new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryParentFragment$onViewCreated$1$1$invokeSuspend$$inlined$consumeIfType$10
                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Object invoke(Object obj2) {
                                m11374invoke(obj2);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: collision with other method in class */
                            public final void m11374invoke(Object it) {
                                Intrinsics.checkNotNullParameter(it, "it");
                                beneficiaryParentFragment10.popEntireFragmentBackstack(false);
                            }
                        });
                    }
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
                StateFlow<Event<BeneficiaryEvent>> eventFlow = BeneficiaryParentFragment.this.getDuxo().getEventFlow();
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryParentFragment.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(eventFlow, anonymousClass1, this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateStepsFragment.Callbacks
    public void onBeneficiaryFlowStepsCompleted(GenericAlertContent<? extends GenericAction> postSubmitAlert) {
        getDuxo().onBeneficiaryIndividualFlowStepsCompleted();
        if (postSubmitAlert != null) {
            setSheetListener(Fragments.showSduiAlertSheet(this, postSubmitAlert, getMarkwon()));
        }
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateStepsFragment.Callbacks
    public void onBeneficiaryFlowStepsAborted() {
        popLastFragment();
    }

    @Override // com.robinhood.android.beneficiaries.ui.introflow.BeneficiaryIntroFlowFragment.Callbacks
    public void beneficiaryIntroFlowComplete(BeneficiaryIntroFlowResult beneficiaryIntroFlowResult) {
        Intrinsics.checkNotNullParameter(beneficiaryIntroFlowResult, "beneficiaryIntroFlowResult");
        getDuxo().onBeneficiaryIntroFlowCompleted(beneficiaryIntroFlowResult);
    }

    @Override // com.robinhood.android.beneficiaries.ui.trustflow.name.BeneficiaryTrustNameFragment.Callbacks
    public void beneficiaryTrustNameConfirmed(String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        getDuxo().beneficiaryTrustNameConfirmed(name);
    }

    @Override // com.robinhood.android.beneficiaries.ui.trustflow.date.BeneficiaryTrustDateFragment.Callbacks
    public void beneficiaryTrustDateConfirmed(LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        getDuxo().beneficiaryTrustDateConfirmed(date);
    }

    @Override // com.robinhood.android.beneficiaries.ui.trustflow.taxidentifier.BeneficiaryTrustTaxIdentifierFragment.Callbacks
    public void beneficiaryTrustTaxIdentifierConfirmed(String taxIdentifier) {
        Intrinsics.checkNotNullParameter(taxIdentifier, "taxIdentifier");
        getDuxo().beneficiaryTrustTaxIdentifierConfirmed(taxIdentifier);
    }

    @Override // com.robinhood.android.beneficiaries.ui.trustflow.email.BeneficiaryTrustEmailFragment.Callbacks
    public void beneficiaryTrustEmailConfirmed(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        getDuxo().beneficiaryTrustEmailConfirmed(email);
    }

    @Override // com.robinhood.android.beneficiaries.ui.trustflow.accounts.BeneficiaryAdditionalAccountsFragment.Callbacks
    public void onSubmitAdditionalAccounts(List<String> additionalAccounts, List<ApiBeneficiaryAgreementViewModel> additionalAgreements) {
        Intrinsics.checkNotNullParameter(additionalAccounts, "additionalAccounts");
        Intrinsics.checkNotNullParameter(additionalAgreements, "additionalAgreements");
        getDuxo().beneficiaryAdditionAccountsConfirmed(additionalAccounts, additionalAgreements);
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.agreement.BeneficiaryCreateAgreementFragment.Callbacks
    public void onAgreementCompleted(ApiBeneficiaryAgreementViewModel agreement, int currentAgreementIndex) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        getDuxo().beneficiaryAdditionalAgreementCompleted(agreement, currentAgreementIndex);
    }

    @Override // com.robinhood.android.beneficiaries.ui.selectaccount.BeneficiarySelectAccountFragment.Callbacks
    public void onAccountSelected(String accountNumber, boolean hasMultipleAccounts) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().onAccountSelected(accountNumber, hasMultipleAccounts);
    }

    @Override // com.robinhood.android.beneficiaries.ui.selectaccount.BeneficiarySelectAccountFragment.Callbacks
    public void onLoadAccountsFailed() {
        requireActivity().onBackPressed();
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListCallbacks
    public void onAddBeneficiary(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        getDuxo().onAddBeneficiary(accountNumber);
    }

    @Override // com.robinhood.android.beneficiaries.ui.detail.BeneficiaryDetailFragment.Callbacks
    public void onUpdateBeneficiary(String accountNumber, UUID beneficiaryId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        getDuxo().onUpdateBeneficiary(accountNumber, beneficiaryId);
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListCallbacks
    public void onBeneficiaryClicked(String accountNumber, UUID beneficiaryId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        getDuxo().onBeneficiaryClicked(accountNumber, beneficiaryId);
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateParentFragment.Callbacks
    public void onBeneficiaryFlowCompleted(GenericAlertContent<? extends GenericAction> postSubmitAlert) {
        popLastFragment();
        if (postSubmitAlert != null) {
            setSheetListener(Fragments.showSduiAlertSheet(this, postSubmitAlert, getMarkwon()));
        }
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.BeneficiaryCreateParentFragment.Callbacks
    public void onBeneficiaryFlowAborted() {
        popLastFragment();
    }

    @Override // com.robinhood.android.beneficiaries.p067ui.list.BeneficiaryListCallbacks
    public void onValuePropsClicked(ApiBeneficiarySplashViewModel splashViewModel) {
        Intrinsics.checkNotNullParameter(splashViewModel, "splashViewModel");
        replaceFragment(BeneficiaryValuePropFragment.INSTANCE.newInstance((Parcelable) new BeneficiaryValuePropFragment.Args(splashViewModel)));
    }

    @Override // com.robinhood.android.beneficiaries.ui.individualflow.intro.BeneficiaryValuePropFragment.Callbacks
    public void onValuePropCompleted() {
        requireActivity().onBackPressed();
    }

    private final void setRootFragment() {
        BeneficiariesFragmentKey beneficiariesFragmentKey = (BeneficiariesFragmentKey) INSTANCE.getArgs((Fragment) this);
        if (beneficiariesFragmentKey instanceof BeneficiariesFragmentKey.Detail) {
            setFragment(C11048R.id.fragment_container, BeneficiaryListFragment.INSTANCE.newInstance((Parcelable) new BeneficiariesFragmentKey.List(((BeneficiariesFragmentKey.Detail) beneficiariesFragmentKey).getAccountNumber())));
            replaceFragment(BeneficiaryDetailFragment.INSTANCE.newInstance((Parcelable) beneficiariesFragmentKey));
        } else {
            if (beneficiariesFragmentKey instanceof BeneficiariesFragmentKey.List) {
                setFragment(C11048R.id.fragment_container, BeneficiaryListFragment.INSTANCE.newInstance((Parcelable) beneficiariesFragmentKey));
                return;
            }
            if (beneficiariesFragmentKey instanceof BeneficiariesFragmentKey.SelectAccount) {
                setFragment(C11048R.id.fragment_container, BeneficiarySelectAccountFragment.INSTANCE.newInstance());
            } else {
                if (!(beneficiariesFragmentKey instanceof BeneficiariesFragmentKey.UpdateBeneficiary)) {
                    throw new NoWhenBranchMatchedException();
                }
                setFragment(C11048R.id.fragment_container, BeneficiaryListFragment.INSTANCE.newInstance((Parcelable) new BeneficiariesFragmentKey.List(((BeneficiariesFragmentKey.UpdateBeneficiary) beneficiariesFragmentKey).getAccountNumber())));
                replaceFragment(BeneficiaryCreateParentFragment.INSTANCE.newInstance((Parcelable) beneficiariesFragmentKey));
            }
        }
    }

    /* compiled from: BeneficiaryParentFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentFragment$Companion;", "Lcom/robinhood/android/navigation/FragmentResolverWithArgsCompanion;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentFragment;", "Lcom/robinhood/android/beneficiaries/contracts/BeneficiariesFragmentKey;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentResolverWithArgsCompanion<BeneficiaryParentFragment, BeneficiariesFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.navigation.FragmentResolverWithArgsCompanion, com.robinhood.android.navigation.FragmentResolver
        public Fragment createFragment(BeneficiariesFragmentKey beneficiariesFragmentKey) {
            return FragmentResolverWithArgsCompanion.DefaultImpls.createFragment(this, beneficiariesFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public BeneficiariesFragmentKey getArgs(BeneficiaryParentFragment beneficiaryParentFragment) {
            return (BeneficiariesFragmentKey) FragmentResolverWithArgsCompanion.DefaultImpls.getArgs(this, beneficiaryParentFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCreator
        public BeneficiaryParentFragment newInstance(BeneficiariesFragmentKey beneficiariesFragmentKey) {
            return (BeneficiaryParentFragment) FragmentResolverWithArgsCompanion.DefaultImpls.newInstance(this, beneficiariesFragmentKey);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithArgsCompanion
        public void setArgs(BeneficiaryParentFragment beneficiaryParentFragment, BeneficiariesFragmentKey beneficiariesFragmentKey) {
            FragmentResolverWithArgsCompanion.DefaultImpls.setArgs(this, beneficiaryParentFragment, beneficiariesFragmentKey);
        }
    }
}
