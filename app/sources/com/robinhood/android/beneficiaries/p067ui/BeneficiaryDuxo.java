package com.robinhood.android.beneficiaries.p067ui;

import androidx.lifecycle.ViewModel2;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAccountRow;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAccountViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowAgreementViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowDOBViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowEmailViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowLegalNameViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowRelationshipRow;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowRelationshipViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustDateViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustNameViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowTrustTaxIdentifierViewModel;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRelationship;
import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryRole;
import bonfire.proto.idl.beneficiaries.p031v1.IndividualBeneficiaryFlow;
import bonfire.proto.idl.beneficiaries.p031v1.TrustBeneficiaryFlow;
import com.robinhood.android.beneficiaries.models.api.ApiBeneficiaryAgreementViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountRow;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryAccountViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryDobViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryEmailViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryNameViewModel;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryRelationshipViewModel;
import com.robinhood.android.beneficiaries.p067ui.BeneficiaryEvent;
import com.robinhood.android.beneficiaries.p067ui.BeneficiaryParentViewState3;
import com.robinhood.android.beneficiaries.p067ui.introflow.BeneficiaryIntroFlowResult;
import com.robinhood.android.beneficiaries.p067ui.trustflow.BeneficiaryTrustFlowToolbarViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import com.robinhood.librobinhood.data.store.bonfire.beneficiaries.BeneficiaryStore;
import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.withpersona.sdk2.inquiry.network.dto.InquiryField;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import p479j$.time.LocalDate;

/* compiled from: BeneficiaryDuxo.kt */
@Metadata(m3635d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\b\u0011\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014JO\u0010!\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001dH\u0002¢\u0006\u0004\b!\u0010\"JC\u0010&\u001a\u00020\u000e2\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b&\u0010'J3\u0010(\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b(\u0010)J)\u0010*\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0016\u001a\u00020\u00152\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b*\u0010+J1\u0010-\u001a\u00020,2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0002¢\u0006\u0004\b-\u0010.J\u001b\u00102\u001a\u00020\u000e2\n\u00101\u001a\u00060/j\u0002`0H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00107\u001a\u0002062\u0006\u00105\u001a\u000204H\u0002¢\u0006\u0004\b7\u00108J\u0017\u0010<\u001a\u00020;2\u0006\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b<\u0010=J\u0017\u0010A\u001a\u00020@2\u0006\u0010?\u001a\u00020>H\u0002¢\u0006\u0004\bA\u0010BJ\u0017\u0010F\u001a\u00020E2\u0006\u0010D\u001a\u00020CH\u0002¢\u0006\u0004\bF\u0010GJ\u0017\u0010J\u001a\u00020I2\u0006\u0010D\u001a\u00020HH\u0002¢\u0006\u0004\bJ\u0010KJ\u001f\u0010N\u001a\u00020\u001f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010M\u001a\u00020LH\u0002¢\u0006\u0004\bN\u0010OJ\u001d\u0010R\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010Q\u001a\u00020P¢\u0006\u0004\bR\u0010SJ\u001d\u0010T\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bT\u0010UJ\u001d\u0010V\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\bV\u0010UJ\u0015\u0010W\u001a\u00020\u000e2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\bW\u0010XJ\u0015\u0010Z\u001a\u00020\u000e2\u0006\u0010Y\u001a\u00020\u0017¢\u0006\u0004\bZ\u0010[J\u0015\u0010]\u001a\u00020\u000e2\u0006\u0010\\\u001a\u00020\u0019¢\u0006\u0004\b]\u0010XJ\u0015\u0010`\u001a\u00020\u000e2\u0006\u0010_\u001a\u00020^¢\u0006\u0004\b`\u0010aJ\u0015\u0010c\u001a\u00020\u000e2\u0006\u0010b\u001a\u00020\u0019¢\u0006\u0004\bc\u0010XJ\u0015\u0010e\u001a\u00020\u000e2\u0006\u0010d\u001a\u00020\u0019¢\u0006\u0004\be\u0010XJ)\u0010f\u001a\u00020\u000e2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00190\u001d2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001d¢\u0006\u0004\bf\u0010gJ\u001d\u0010h\u001a\u00020\u000e2\u0006\u0010#\u001a\u00020\u001f2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\bh\u0010iJ\r\u0010j\u001a\u00020\u000e¢\u0006\u0004\bj\u0010kR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010lR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010m¨\u0006n"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/BeneficiaryDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryEvent;", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;", "beneficiaryStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "experimentsStore", "Lcom/robinhood/android/udf/DuxoBundle;", "duxoBundle", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Lcom/robinhood/android/udf/DuxoBundle;)V", "Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;", "trustBeneficiaryFlow", "", "beneficiaryTypeSelectedTrust", "(Lbonfire/proto/idl/beneficiaries/v1/TrustBeneficiaryFlow;)V", "Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;", "individualBeneficiaryFlow", "beneficiaryTypeSelectedIndividual", "(Lbonfire/proto/idl/beneficiaries/v1/IndividualBeneficiaryFlow;)V", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;", "trustFlow", "Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;", "introFlowResult", "", "accountNumber", "Ljava/util/UUID;", "beneficiaryId", "", "additionalAccounts", "Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "additionalAgreements", "beneficiaryAdditionalAccountsConfirmedTrust", "(Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;Ljava/lang/String;Ljava/util/UUID;Ljava/util/List;Ljava/util/List;)V", "agreement", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "beneficiaryAdditionalAgreementCompletedTrust", "(Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;I)V", "submitTrustBeneficiary", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;)V", "createTrustBeneficiary", "(Ljava/lang/String;Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;)V", "Lkotlinx/coroutines/Job;", "updateTrustBeneficiary", "(Ljava/lang/String;Ljava/util/UUID;Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;Lcom/robinhood/android/beneficiaries/ui/BeneficiaryFlowViewState$TrustFlow;)Lkotlinx/coroutines/Job;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "exception", "submitExceptionAlertDialog", "(Ljava/lang/Exception;)V", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModel;", "individualDateViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryDobViewModel;", "mapIndividualDateViewModelToV1", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowDOBViewModel;)Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryDobViewModel;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModel;", "individualNameViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryNameViewModel;", "mapIndividualNameViewModelToV1", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowLegalNameViewModel;)Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryNameViewModel;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModel;", "individualRelationshipViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRelationshipViewModel;", "mapIndividualRelationshipViewModelToV1", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowRelationshipViewModel;)Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryRelationshipViewModel;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;", "individualEmailViewModel", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryEmailViewModel;", "mapIndividualEmailViewModelToV1", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowEmailViewModel;)Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryEmailViewModel;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "mapIndividualAccountViewModelToV1", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAccountViewModel;)Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryAccountViewModel;", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;", "agreementViewModel", "mapAgreementViewModelToV1", "(Ljava/lang/String;Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowAgreementViewModel;)Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;", "", "hasMultipleAccounts", "onAccountSelected", "(Ljava/lang/String;Z)V", "onBeneficiaryClicked", "(Ljava/lang/String;Ljava/util/UUID;)V", "onUpdateBeneficiary", "onAddBeneficiary", "(Ljava/lang/String;)V", "beneficiaryIntroFlowResult", "onBeneficiaryIntroFlowCompleted", "(Lcom/robinhood/android/beneficiaries/ui/introflow/BeneficiaryIntroFlowResult;)V", "name", "beneficiaryTrustNameConfirmed", "j$/time/LocalDate", InquiryField.DateField.TYPE, "beneficiaryTrustDateConfirmed", "(Lj$/time/LocalDate;)V", "taxIdentifier", "beneficiaryTrustTaxIdentifierConfirmed", "email", "beneficiaryTrustEmailConfirmed", "beneficiaryAdditionAccountsConfirmed", "(Ljava/util/List;Ljava/util/List;)V", "beneficiaryAdditionalAgreementCompleted", "(Lcom/robinhood/android/beneficiaries/models/api/ApiBeneficiaryAgreementViewModel;I)V", "onBeneficiaryIndividualFlowStepsCompleted", "()V", "Lcom/robinhood/librobinhood/data/store/bonfire/beneficiaries/BeneficiaryStore;", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class BeneficiaryDuxo extends BaseDuxo5<BeneficiaryParentViewState, BeneficiaryEvent> {
    public static final int $stable = 8;
    private final BeneficiaryStore beneficiaryStore;
    private final ExperimentsStore experimentsStore;

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[BeneficiaryRelationship.values().length];
            try {
                iArr[BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_UNSPECIFIED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_OTHER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeneficiaryRelationship.BENEFICIARY_RELATIONSHIP_SPOUSE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryDuxo(BeneficiaryStore beneficiaryStore, ExperimentsStore experimentsStore, DuxoBundle duxoBundle) {
        super(new BeneficiaryParentViewState(false, false, null, null, null, null, 63, null), duxoBundle);
        Intrinsics.checkNotNullParameter(beneficiaryStore, "beneficiaryStore");
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.beneficiaryStore = beneficiaryStore;
        this.experimentsStore = experimentsStore;
        getLifecycleScope().launchWhenCreated(new C96531(null));
        getLifecycleScope().launchWhenCreated(new C96542(null));
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {47}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$1 */
    static final class C96531 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C96531(Continuation<? super C96531> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryDuxo.this.new C96531(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96531) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BeneficiaryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryDuxo beneficiaryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BeneficiaryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$1$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496321 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496321(boolean z, Continuation<? super C496321> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496321 c496321 = new C496321(this.$it, continuation);
                    c496321.L$0 = obj;
                    return c496321;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
                    return ((C496321) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, this.$it, false, null, null, null, null, 62, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496321(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BeneficiaryDuxo.this.experimentsStore, new Experiment[]{BeneficiaryExperiments2.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$2", m3645f = "BeneficiaryDuxo.kt", m3646l = {53}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$2 */
    static final class C96542 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C96542(Continuation<? super C96542> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BeneficiaryDuxo.this.new C96542(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96542) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BeneficiaryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "it", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$2$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ BeneficiaryDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(BeneficiaryDuxo beneficiaryDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = beneficiaryDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: BeneficiaryDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$2$1$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$2$1$1, reason: invalid class name and collision with other inner class name */
            static final class C496331 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
                final /* synthetic */ boolean $it;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C496331(boolean z, Continuation<? super C496331> continuation) {
                    super(2, continuation);
                    this.$it = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C496331 c496331 = new C496331(this.$it, continuation);
                    c496331.L$0 = obj;
                    return c496331;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
                    return ((C496331) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, this.$it, null, null, null, null, 61, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C496331(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(BeneficiaryDuxo.this.experimentsStore, new Experiment[]{BeneficiaryExperiments.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(BeneficiaryDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onAccountSelected$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$onAccountSelected$1 */
    static final class C96591 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
        final /* synthetic */ String $accountNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96591(String str, Continuation<? super C96591> continuation) {
            super(2, continuation);
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96591 c96591 = new C96591(this.$accountNumber, continuation);
            c96591.L$0 = obj;
            return c96591;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
            return ((C96591) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, this.$accountNumber, null, null, null, 59, null);
        }
    }

    public final void onAccountSelected(String accountNumber, boolean hasMultipleAccounts) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        applyMutation(new C96591(accountNumber, null));
        submit(new BeneficiaryEvent.NavigateToCreateParentBeneficiaryListFragment(accountNumber, hasMultipleAccounts));
    }

    public final void onBeneficiaryClicked(String accountNumber, UUID beneficiaryId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        submit(new BeneficiaryEvent.NavigateToCreateParentBeneficiaryDetailsFragment(accountNumber, beneficiaryId));
    }

    public final void onUpdateBeneficiary(final String accountNumber, final UUID beneficiaryId) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        Intrinsics.checkNotNullParameter(beneficiaryId, "beneficiaryId");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.onUpdateBeneficiary$lambda$0(this.f$0, accountNumber, beneficiaryId, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onUpdateBeneficiary$lambda$0(BeneficiaryDuxo beneficiaryDuxo, String str, UUID uuid, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (state.isTrustBeneficiaryExperiment()) {
            BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(beneficiaryDuxo), null, null, new BeneficiaryDuxo$onUpdateBeneficiary$1$1(beneficiaryDuxo, str, uuid, null), 3, null);
            return Unit.INSTANCE;
        }
        beneficiaryDuxo.submit(new BeneficiaryEvent.NavigateToCreateParentBeneficiaryUpdateFragment(str, uuid));
        return Unit.INSTANCE;
    }

    public final void onAddBeneficiary(final String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.onAddBeneficiary$lambda$1(this.f$0, accountNumber, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAddBeneficiary$lambda$1(BeneficiaryDuxo beneficiaryDuxo, String str, BeneficiaryParentViewState dataState) {
        Intrinsics.checkNotNullParameter(dataState, "dataState");
        if (dataState.isTrustBeneficiaryExperiment()) {
            BuildersKt__Builders_commonKt.launch$default(beneficiaryDuxo.getLifecycleScope(), null, null, new BeneficiaryDuxo$onAddBeneficiary$1$1(beneficiaryDuxo, str, null), 3, null);
            return Unit.INSTANCE;
        }
        beneficiaryDuxo.submit(new BeneficiaryEvent.NavigateToCreateParentBeneficiaryAddFragment(str));
        return Unit.INSTANCE;
    }

    public final void onBeneficiaryIntroFlowCompleted(final BeneficiaryIntroFlowResult beneficiaryIntroFlowResult) {
        Intrinsics.checkNotNullParameter(beneficiaryIntroFlowResult, "beneficiaryIntroFlowResult");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.onBeneficiaryIntroFlowCompleted$lambda$3(this.f$0, beneficiaryIntroFlowResult, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBeneficiaryIntroFlowCompleted$lambda$3(BeneficiaryDuxo beneficiaryDuxo, BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        String accountNumber = state.getAccountNumber();
        if (accountNumber == null) {
            throw new IllegalStateException("Account number shouldn't be null");
        }
        UUID beneficiaryId = state.getBeneficiaryId();
        beneficiaryDuxo.submit(BeneficiaryEvent.NavigateToLoadingScreen.INSTANCE);
        beneficiaryDuxo.applyMutation(new BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$2(beneficiaryIntroFlowResult, null));
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(beneficiaryDuxo), null, null, new BeneficiaryDuxo$onBeneficiaryIntroFlowCompleted$1$3(beneficiaryDuxo, accountNumber, beneficiaryId, beneficiaryIntroFlowResult, null), 3, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beneficiaryTypeSelectedTrust(TrustBeneficiaryFlow trustBeneficiaryFlow) {
        BeneficiaryFlowTrustNameViewModel name_view_model = trustBeneficiaryFlow.getName_view_model();
        if (name_view_model == null) {
            throw new IllegalStateException("Name ViewModel shouldn't be null");
        }
        BeneficiaryFlowTrustDateViewModel date_view_model = trustBeneficiaryFlow.getDate_view_model();
        if (date_view_model == null) {
            throw new IllegalStateException("Date ViewModel shouldn't be null");
        }
        BeneficiaryFlowTrustTaxIdentifierViewModel tax_identifier_view_model = trustBeneficiaryFlow.getTax_identifier_view_model();
        if (tax_identifier_view_model == null) {
            throw new IllegalStateException("TaxIdentifier ViewModel shouldn't be null");
        }
        BeneficiaryFlowEmailViewModel trustee_email_view_model = trustBeneficiaryFlow.getTrustee_email_view_model();
        if (trustee_email_view_model == null) {
            throw new IllegalStateException("Email ViewModel shouldn't be null");
        }
        BeneficiaryParentViewState3.TrustFlow trustFlow = new BeneficiaryParentViewState3.TrustFlow(name_view_model, null, date_view_model, null, tax_identifier_view_model, null, trustee_email_view_model, null, trustBeneficiaryFlow.getAccount_view_model(), null, 682, null);
        applyMutation(new C96571(trustFlow, null));
        submit(new BeneficiaryEvent.NavigateToTrustNameScreen(name_view_model, new BeneficiaryTrustFlowToolbarViewState(BeneficiaryDuxoKt.countSteps(trustFlow), 0, 0.0f, 4, null)));
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$beneficiaryTypeSelectedTrust$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$beneficiaryTypeSelectedTrust$1 */
    static final class C96571 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
        final /* synthetic */ BeneficiaryParentViewState3.TrustFlow $trustFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96571(BeneficiaryParentViewState3.TrustFlow trustFlow, Continuation<? super C96571> continuation) {
            super(2, continuation);
            this.$trustFlow = trustFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96571 c96571 = new C96571(this.$trustFlow, continuation);
            c96571.L$0 = obj;
            return c96571;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
            return ((C96571) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, null, null, null, this.$trustFlow, 31, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void beneficiaryTypeSelectedIndividual(final IndividualBeneficiaryFlow individualBeneficiaryFlow) {
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.beneficiaryTypeSelectedIndividual$lambda$15(individualBeneficiaryFlow, this, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryTypeSelectedIndividual$lambda$15(IndividualBeneficiaryFlow individualBeneficiaryFlow, BeneficiaryDuxo beneficiaryDuxo, BeneficiaryParentViewState state) {
        BeneficiaryRole beneficiaryRole;
        Intrinsics.checkNotNullParameter(state, "state");
        String accountNumber = state.getAccountNumber();
        if (accountNumber == null) {
            throw new IllegalStateException("Account number shouldn't be null");
        }
        BeneficiaryIntroFlowResult introFlowResult = state.getIntroFlowResult();
        BeneficiaryFlowAgreementViewModel agreementViewModel = introFlowResult != null ? introFlowResult.getAgreementViewModel() : null;
        BeneficiaryFlowAccountViewModel account_view_model = individualBeneficiaryFlow.getAccount_view_model();
        BeneficiaryFlowLegalNameViewModel legal_name_view_model = individualBeneficiaryFlow.getLegal_name_view_model();
        if (legal_name_view_model == null) {
            throw new IllegalStateException("Name ViewModel shouldn't be null");
        }
        BeneficiaryFlowRelationshipViewModel relationship_view_model = individualBeneficiaryFlow.getRelationship_view_model();
        if (relationship_view_model == null) {
            throw new IllegalStateException("Relationship ViewModel shouldn't be null");
        }
        BeneficiaryFlowDOBViewModel dob_view_model = individualBeneficiaryFlow.getDob_view_model();
        if (dob_view_model == null) {
            throw new IllegalStateException("Date ViewModel shouldn't be null");
        }
        BeneficiaryFlowEmailViewModel email_view_model = individualBeneficiaryFlow.getEmail_view_model();
        if (email_view_model == null) {
            throw new IllegalStateException("Email ViewModel shouldn't be null");
        }
        UUID beneficiaryId = state.getBeneficiaryId();
        BeneficiaryIntroFlowResult introFlowResult2 = state.getIntroFlowResult();
        beneficiaryDuxo.submit(new BeneficiaryEvent.NavigateToIndividualFlow(new ApiCreateBeneficiaryConfiguration(accountNumber, beneficiaryId, (introFlowResult2 == null || (beneficiaryRole = introFlowResult2.getBeneficiaryRole()) == null) ? null : beneficiaryRole.name(), null, agreementViewModel != null ? beneficiaryDuxo.mapAgreementViewModelToV1(accountNumber, agreementViewModel) : null, beneficiaryDuxo.mapIndividualNameViewModelToV1(legal_name_view_model), beneficiaryDuxo.mapIndividualRelationshipViewModelToV1(relationship_view_model), beneficiaryDuxo.mapIndividualDateViewModelToV1(dob_view_model), beneficiaryDuxo.mapIndividualEmailViewModelToV1(email_view_model), account_view_model != null ? beneficiaryDuxo.mapIndividualAccountViewModelToV1(account_view_model) : null)));
        return Unit.INSTANCE;
    }

    public final void beneficiaryTrustNameConfirmed(final String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.beneficiaryTrustNameConfirmed$lambda$17(this.f$0, name, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryTrustNameConfirmed$lambda$17(BeneficiaryDuxo beneficiaryDuxo, String str, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BeneficiaryParentViewState3 flowViewState = state.getFlowViewState();
        Intrinsics.checkNotNull(flowViewState, "null cannot be cast to non-null type com.robinhood.android.beneficiaries.ui.BeneficiaryFlowViewState.TrustFlow");
        BeneficiaryParentViewState3.TrustFlow trustFlow = (BeneficiaryParentViewState3.TrustFlow) flowViewState;
        beneficiaryDuxo.applyMutation(new BeneficiaryDuxo$beneficiaryTrustNameConfirmed$1$1(trustFlow, str, null));
        BeneficiaryFlowTrustDateViewModel dateViewModel = ((BeneficiaryParentViewState3.TrustFlow) state.getFlowViewState()).getDateViewModel();
        if (dateViewModel == null) {
            throw new IllegalStateException("Date ViewModel shouldn't be null");
        }
        beneficiaryDuxo.submit(new BeneficiaryEvent.NavigateToTrustDateScreen(dateViewModel, new BeneficiaryTrustFlowToolbarViewState(BeneficiaryDuxoKt.countSteps(trustFlow), 1, 0.0f, 4, null)));
        return Unit.INSTANCE;
    }

    public final void beneficiaryTrustDateConfirmed(final LocalDate date) {
        Intrinsics.checkNotNullParameter(date, "date");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.beneficiaryTrustDateConfirmed$lambda$19(this.f$0, date, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryTrustDateConfirmed$lambda$19(BeneficiaryDuxo beneficiaryDuxo, LocalDate localDate, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BeneficiaryParentViewState3 flowViewState = state.getFlowViewState();
        Intrinsics.checkNotNull(flowViewState, "null cannot be cast to non-null type com.robinhood.android.beneficiaries.ui.BeneficiaryFlowViewState.TrustFlow");
        BeneficiaryParentViewState3.TrustFlow trustFlow = (BeneficiaryParentViewState3.TrustFlow) flowViewState;
        beneficiaryDuxo.applyMutation(new BeneficiaryDuxo$beneficiaryTrustDateConfirmed$1$1(trustFlow, localDate, null));
        BeneficiaryFlowTrustTaxIdentifierViewModel taxIdentifierViewModel = trustFlow.getTaxIdentifierViewModel();
        if (taxIdentifierViewModel == null) {
            throw new IllegalStateException("TaxIdentifier ViewModel shouldn't be null");
        }
        beneficiaryDuxo.submit(new BeneficiaryEvent.NavigateToTrustTaxIdentifierScreen(taxIdentifierViewModel, new BeneficiaryTrustFlowToolbarViewState(BeneficiaryDuxoKt.countSteps(trustFlow), 2, 0.0f, 4, null)));
        return Unit.INSTANCE;
    }

    public final void beneficiaryTrustTaxIdentifierConfirmed(final String taxIdentifier) {
        Intrinsics.checkNotNullParameter(taxIdentifier, "taxIdentifier");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.beneficiaryTrustTaxIdentifierConfirmed$lambda$21(this.f$0, taxIdentifier, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryTrustTaxIdentifierConfirmed$lambda$21(BeneficiaryDuxo beneficiaryDuxo, String str, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BeneficiaryParentViewState3 flowViewState = state.getFlowViewState();
        Intrinsics.checkNotNull(flowViewState, "null cannot be cast to non-null type com.robinhood.android.beneficiaries.ui.BeneficiaryFlowViewState.TrustFlow");
        BeneficiaryParentViewState3.TrustFlow trustFlow = (BeneficiaryParentViewState3.TrustFlow) flowViewState;
        beneficiaryDuxo.applyMutation(new BeneficiaryDuxo$beneficiaryTrustTaxIdentifierConfirmed$1$1(trustFlow, str, null));
        BeneficiaryFlowEmailViewModel emailViewModel = trustFlow.getEmailViewModel();
        if (emailViewModel == null) {
            throw new IllegalStateException("Email ViewModel shouldn't be null");
        }
        beneficiaryDuxo.submit(new BeneficiaryEvent.NavigateToTrustEmailScreen(emailViewModel, new BeneficiaryTrustFlowToolbarViewState(BeneficiaryDuxoKt.countSteps(trustFlow), 3, 0.0f, 4, null)));
        return Unit.INSTANCE;
    }

    public final void beneficiaryTrustEmailConfirmed(final String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.beneficiaryTrustEmailConfirmed$lambda$22(this.f$0, email, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryTrustEmailConfirmed$lambda$22(BeneficiaryDuxo beneficiaryDuxo, String str, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BeneficiaryParentViewState3 flowViewState = state.getFlowViewState();
        Intrinsics.checkNotNull(flowViewState, "null cannot be cast to non-null type com.robinhood.android.beneficiaries.ui.BeneficiaryFlowViewState.TrustFlow");
        BeneficiaryParentViewState3.TrustFlow trustFlow = (BeneficiaryParentViewState3.TrustFlow) flowViewState;
        beneficiaryDuxo.applyMutation(new BeneficiaryDuxo$beneficiaryTrustEmailConfirmed$1$1(trustFlow, str, null));
        String accountNumber = state.getAccountNumber();
        if (accountNumber == null) {
            throw new IllegalStateException("Required value was null.");
        }
        BeneficiaryFlowAccountViewModel accountViewModel = trustFlow.getAccountViewModel();
        if (accountViewModel != null) {
            BeneficiaryTrustFlowToolbarViewState beneficiaryTrustFlowToolbarViewState = new BeneficiaryTrustFlowToolbarViewState(BeneficiaryDuxoKt.countSteps(trustFlow), 4, 0.0f, 4, null);
            beneficiaryDuxo.submit(new BeneficiaryEvent.NavigateToAdditionalAccountsScreen(accountNumber, state.getBeneficiaryId(), beneficiaryDuxo.mapIndividualAccountViewModelToV1(accountViewModel), beneficiaryTrustFlowToolbarViewState));
            return Unit.INSTANCE;
        }
        beneficiaryDuxo.submitTrustBeneficiary(accountNumber, state.getBeneficiaryId(), state.getIntroFlowResult(), trustFlow);
        return Unit.INSTANCE;
    }

    public final void beneficiaryAdditionAccountsConfirmed(final List<String> additionalAccounts, final List<ApiBeneficiaryAgreementViewModel> additionalAgreements) {
        Intrinsics.checkNotNullParameter(additionalAccounts, "additionalAccounts");
        Intrinsics.checkNotNullParameter(additionalAgreements, "additionalAgreements");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.beneficiaryAdditionAccountsConfirmed$lambda$24(this.f$0, additionalAccounts, additionalAgreements, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryAdditionAccountsConfirmed$lambda$24(BeneficiaryDuxo beneficiaryDuxo, List list, List list2, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BeneficiaryParentViewState3 flowViewState = state.getFlowViewState();
        if (flowViewState instanceof BeneficiaryParentViewState3.TrustFlow) {
            BeneficiaryParentViewState3.TrustFlow trustFlow = (BeneficiaryParentViewState3.TrustFlow) state.getFlowViewState();
            BeneficiaryIntroFlowResult introFlowResult = state.getIntroFlowResult();
            String accountNumber = state.getAccountNumber();
            if (accountNumber != null) {
                beneficiaryDuxo.beneficiaryAdditionalAccountsConfirmedTrust(trustFlow, introFlowResult, accountNumber, state.getBeneficiaryId(), list, list2);
            } else {
                throw new IllegalStateException("Account number shouldn't be null");
            }
        } else if (flowViewState != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    private final void beneficiaryAdditionalAccountsConfirmedTrust(BeneficiaryParentViewState3.TrustFlow trustFlow, BeneficiaryIntroFlowResult introFlowResult, String accountNumber, UUID beneficiaryId, List<String> additionalAccounts, List<ApiBeneficiaryAgreementViewModel> additionalAgreements) {
        BeneficiaryFlowAdditionalAccountsViewState beneficiaryFlowAdditionalAccountsViewStateCopy$default = BeneficiaryFlowAdditionalAccountsViewState.copy$default(trustFlow.getAdditionalAccountsViewState(), extensions2.toImmutableList(additionalAccounts), null, extensions2.toImmutableList(additionalAgreements), 2, null);
        BeneficiaryParentViewState3.TrustFlow trustFlowCopy$default = BeneficiaryParentViewState3.TrustFlow.copy$default(trustFlow, null, null, null, null, null, null, null, null, null, beneficiaryFlowAdditionalAccountsViewStateCopy$default, 511, null);
        applyMutation(new C96551(trustFlowCopy$default, null));
        if (beneficiaryFlowAdditionalAccountsViewStateCopy$default.getUnsignedAgreements().isEmpty()) {
            submitTrustBeneficiary(accountNumber, beneficiaryId, introFlowResult, trustFlowCopy$default);
        } else {
            submit(new BeneficiaryEvent.NavigateToAdditionalAgreementScreen((ApiBeneficiaryAgreementViewModel) CollectionsKt.first((List) beneficiaryFlowAdditionalAccountsViewStateCopy$default.getUnsignedAgreements()), 0));
        }
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$beneficiaryAdditionalAccountsConfirmedTrust$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$beneficiaryAdditionalAccountsConfirmedTrust$1 */
    static final class C96551 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
        final /* synthetic */ BeneficiaryParentViewState3.TrustFlow $updatedTrustFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96551(BeneficiaryParentViewState3.TrustFlow trustFlow, Continuation<? super C96551> continuation) {
            super(2, continuation);
            this.$updatedTrustFlow = trustFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96551 c96551 = new C96551(this.$updatedTrustFlow, continuation);
            c96551.L$0 = obj;
            return c96551;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
            return ((C96551) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, null, null, null, this.$updatedTrustFlow, 31, null);
        }
    }

    public final void beneficiaryAdditionalAgreementCompleted(final ApiBeneficiaryAgreementViewModel agreement, final int index) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.beneficiaryAdditionalAgreementCompleted$lambda$26(this.f$0, agreement, index, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit beneficiaryAdditionalAgreementCompleted$lambda$26(BeneficiaryDuxo beneficiaryDuxo, ApiBeneficiaryAgreementViewModel apiBeneficiaryAgreementViewModel, int i, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        BeneficiaryParentViewState3 flowViewState = state.getFlowViewState();
        if (flowViewState instanceof BeneficiaryParentViewState3.TrustFlow) {
            BeneficiaryParentViewState3.TrustFlow trustFlow = (BeneficiaryParentViewState3.TrustFlow) state.getFlowViewState();
            BeneficiaryIntroFlowResult introFlowResult = state.getIntroFlowResult();
            String accountNumber = state.getAccountNumber();
            if (accountNumber != null) {
                beneficiaryDuxo.beneficiaryAdditionalAgreementCompletedTrust(trustFlow, introFlowResult, accountNumber, state.getBeneficiaryId(), apiBeneficiaryAgreementViewModel, i);
            } else {
                throw new IllegalStateException("Account number shouldn't be null");
            }
        } else if (flowViewState != null) {
            throw new NoWhenBranchMatchedException();
        }
        return Unit.INSTANCE;
    }

    private final void beneficiaryAdditionalAgreementCompletedTrust(BeneficiaryParentViewState3.TrustFlow trustFlow, BeneficiaryIntroFlowResult introFlowResult, String accountNumber, UUID beneficiaryId, ApiBeneficiaryAgreementViewModel agreement, int index) {
        BeneficiaryFlowAdditionalAccountsViewState beneficiaryFlowAdditionalAccountsViewStateCopy$default = BeneficiaryFlowAdditionalAccountsViewState.copy$default(trustFlow.getAdditionalAccountsViewState(), null, extensions2.toImmutableList(CollectionsKt.plus((Collection<? extends ApiBeneficiaryAgreementViewModel>) trustFlow.getAdditionalAccountsViewState().getSignedAgreements(), agreement)), extensions2.toImmutableList(CollectionsKt.minus(trustFlow.getAdditionalAccountsViewState().getUnsignedAgreements(), agreement)), 1, null);
        BeneficiaryParentViewState3.TrustFlow trustFlowCopy$default = BeneficiaryParentViewState3.TrustFlow.copy$default(trustFlow, null, null, null, null, null, null, null, null, null, beneficiaryFlowAdditionalAccountsViewStateCopy$default, 511, null);
        applyMutation(new C96561(trustFlowCopy$default, null));
        if (beneficiaryFlowAdditionalAccountsViewStateCopy$default.getUnsignedAgreements().isEmpty()) {
            submitTrustBeneficiary(accountNumber, beneficiaryId, introFlowResult, trustFlowCopy$default);
        } else {
            submit(new BeneficiaryEvent.NavigateToAdditionalAgreementScreen((ApiBeneficiaryAgreementViewModel) CollectionsKt.first((List) beneficiaryFlowAdditionalAccountsViewStateCopy$default.getUnsignedAgreements()), index + 1));
        }
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$beneficiaryAdditionalAgreementCompletedTrust$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$beneficiaryAdditionalAgreementCompletedTrust$1 */
    static final class C96561 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
        final /* synthetic */ BeneficiaryParentViewState3.TrustFlow $newTrustFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96561(BeneficiaryParentViewState3.TrustFlow trustFlow, Continuation<? super C96561> continuation) {
            super(2, continuation);
            this.$newTrustFlow = trustFlow;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C96561 c96561 = new C96561(this.$newTrustFlow, continuation);
            c96561.L$0 = obj;
            return c96561;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
            return ((C96561) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, null, null, null, this.$newTrustFlow, 31, null);
        }
    }

    public final void onBeneficiaryIndividualFlowStepsCompleted() {
        withDataState(new Function1() { // from class: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BeneficiaryDuxo.onBeneficiaryIndividualFlowStepsCompleted$lambda$27(this.f$0, (BeneficiaryParentViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onBeneficiaryIndividualFlowStepsCompleted$lambda$27(BeneficiaryDuxo beneficiaryDuxo, BeneficiaryParentViewState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        beneficiaryDuxo.submit(BeneficiaryEvent.NavigateBackFromBeneficiaryFlowFragment.INSTANCE);
        return Unit.INSTANCE;
    }

    private final void submitTrustBeneficiary(String accountNumber, UUID beneficiaryId, BeneficiaryIntroFlowResult introFlowResult, BeneficiaryParentViewState3.TrustFlow trustFlow) {
        if (beneficiaryId != null) {
            updateTrustBeneficiary(accountNumber, beneficiaryId, introFlowResult, trustFlow);
        } else {
            createTrustBeneficiary(accountNumber, trustFlow, introFlowResult);
        }
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$createTrustBeneficiary$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {471}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$createTrustBeneficiary$1 */
    static final class C96581 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ BeneficiaryIntroFlowResult $introFlowResult;
        final /* synthetic */ BeneficiaryParentViewState3.TrustFlow $trustFlow;
        int label;
        final /* synthetic */ BeneficiaryDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96581(BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, BeneficiaryParentViewState3.TrustFlow trustFlow, BeneficiaryDuxo beneficiaryDuxo, String str, Continuation<? super C96581> continuation) {
            super(2, continuation);
            this.$introFlowResult = beneficiaryIntroFlowResult;
            this.$trustFlow = trustFlow;
            this.this$0 = beneficiaryDuxo;
            this.$accountNumber = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C96581(this.$introFlowResult, this.$trustFlow, this.this$0, this.$accountNumber, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96581) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            List<String> listEmptyList;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    BeneficiaryIntroFlowResult beneficiaryIntroFlowResult = this.$introFlowResult;
                    if (beneficiaryIntroFlowResult == null || (listEmptyList = beneficiaryIntroFlowResult.getSignedAgreementTypes()) == null) {
                        listEmptyList = CollectionsKt.emptyList();
                    }
                    ImmutableList<ApiBeneficiaryAgreementViewModel> signedAgreements = this.$trustFlow.getAdditionalAccountsViewState().getSignedAgreements();
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(signedAgreements, 10));
                    Iterator<ApiBeneficiaryAgreementViewModel> it = signedAgreements.iterator();
                    while (it.hasNext()) {
                        arrayList.add(it.next().getAgreement_type());
                    }
                    BeneficiaryStore beneficiaryStore = this.this$0.beneficiaryStore;
                    String str = this.$accountNumber;
                    String userNameInput = this.$trustFlow.getUserNameInput();
                    String str2 = "";
                    if (userNameInput == null) {
                        userNameInput = "";
                    }
                    LocalDate userDateInput = this.$trustFlow.getUserDateInput();
                    if (userDateInput == null) {
                        throw new IllegalStateException("Date should be presented");
                    }
                    String userTaxIdentifierInput = this.$trustFlow.getUserTaxIdentifierInput();
                    if (userTaxIdentifierInput == null) {
                        userTaxIdentifierInput = "";
                    }
                    String userEmailInput = this.$trustFlow.getUserEmailInput();
                    if (userEmailInput != null) {
                        str2 = userEmailInput;
                    }
                    List<String> listPlus = CollectionsKt.plus((Collection) listEmptyList, (Iterable) arrayList);
                    ImmutableList<String> userAdditionalAccountNumbersInput = this.$trustFlow.getAdditionalAccountsViewState().getUserAdditionalAccountNumbersInput();
                    BeneficiaryIntroFlowResult beneficiaryIntroFlowResult2 = this.$introFlowResult;
                    BeneficiaryRole beneficiaryRole = beneficiaryIntroFlowResult2 != null ? beneficiaryIntroFlowResult2.getBeneficiaryRole() : null;
                    this.label = 1;
                    if (beneficiaryStore.createTrustBeneficiary(str, userNameInput, userDateInput, userTaxIdentifierInput, str2, listPlus, userAdditionalAccountNumbersInput, beneficiaryRole, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                this.this$0.applyMutation(new AnonymousClass2(null));
                this.this$0.submit(BeneficiaryEvent.NavigateBackFromBeneficiaryFlowFragment.INSTANCE);
            } catch (Exception e) {
                this.this$0.submitExceptionAlertDialog(e);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiaryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$createTrustBeneficiary$1$2", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$createTrustBeneficiary$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
                return ((AnonymousClass2) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, null, null, null, null, 3, null);
            }
        }
    }

    private final void createTrustBeneficiary(String accountNumber, BeneficiaryParentViewState3.TrustFlow trustFlow, BeneficiaryIntroFlowResult introFlowResult) {
        BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C96581(introFlowResult, trustFlow, this, accountNumber, null), 3, null);
    }

    /* compiled from: BeneficiaryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$updateTrustBeneficiary$1", m3645f = "BeneficiaryDuxo.kt", m3646l = {506}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$updateTrustBeneficiary$1 */
    static final class C96621 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $accountNumber;
        final /* synthetic */ UUID $beneficiaryId;
        final /* synthetic */ BeneficiaryIntroFlowResult $introFlowResult;
        final /* synthetic */ BeneficiaryParentViewState3.TrustFlow $trustFlow;
        int label;
        final /* synthetic */ BeneficiaryDuxo this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C96621(BeneficiaryIntroFlowResult beneficiaryIntroFlowResult, BeneficiaryParentViewState3.TrustFlow trustFlow, BeneficiaryDuxo beneficiaryDuxo, String str, UUID uuid, Continuation<? super C96621> continuation) {
            super(2, continuation);
            this.$introFlowResult = beneficiaryIntroFlowResult;
            this.$trustFlow = trustFlow;
            this.this$0 = beneficiaryDuxo;
            this.$accountNumber = str;
            this.$beneficiaryId = uuid;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C96621(this.$introFlowResult, this.$trustFlow, this.this$0, this.$accountNumber, this.$beneficiaryId, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C96621) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Exception exc;
            C96621 c96621;
            List<String> listEmptyList;
            C96621 c966212;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                try {
                    if (i == 0) {
                        ResultKt.throwOnFailure(obj);
                        try {
                            BeneficiaryIntroFlowResult beneficiaryIntroFlowResult = this.$introFlowResult;
                            if (beneficiaryIntroFlowResult == null || (listEmptyList = beneficiaryIntroFlowResult.getSignedAgreementTypes()) == null) {
                                listEmptyList = CollectionsKt.emptyList();
                            }
                            ImmutableList<ApiBeneficiaryAgreementViewModel> signedAgreements = this.$trustFlow.getAdditionalAccountsViewState().getSignedAgreements();
                            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(signedAgreements, 10));
                            Iterator<ApiBeneficiaryAgreementViewModel> it = signedAgreements.iterator();
                            while (it.hasNext()) {
                                arrayList.add(it.next().getAgreement_type());
                            }
                            BeneficiaryStore beneficiaryStore = this.this$0.beneficiaryStore;
                            String str = this.$accountNumber;
                            UUID uuid = this.$beneficiaryId;
                            String userNameInput = this.$trustFlow.getUserNameInput();
                            if (userNameInput == null) {
                                userNameInput = "";
                            }
                            LocalDate userDateInput = this.$trustFlow.getUserDateInput();
                            if (userDateInput == null) {
                                throw new IllegalStateException("Date should be presented");
                            }
                            String userTaxIdentifierInput = this.$trustFlow.getUserTaxIdentifierInput();
                            if (userTaxIdentifierInput == null) {
                                userTaxIdentifierInput = "";
                            }
                            String userEmailInput = this.$trustFlow.getUserEmailInput();
                            if (userEmailInput == null) {
                                userEmailInput = "";
                            }
                            List<String> listPlus = CollectionsKt.plus((Collection) listEmptyList, (Iterable) arrayList);
                            ImmutableList<String> userAdditionalAccountNumbersInput = this.$trustFlow.getAdditionalAccountsViewState().getUserAdditionalAccountNumbersInput();
                            this.label = 1;
                            c966212 = this;
                            if (beneficiaryStore.updateTrustBeneficiary(str, uuid, userNameInput, userDateInput, userTaxIdentifierInput, userEmailInput, listPlus, userAdditionalAccountNumbersInput, c966212) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        } catch (Exception e) {
                            e = e;
                            c96621 = this;
                            exc = e;
                            c96621.this$0.submitExceptionAlertDialog(exc);
                            return Unit.INSTANCE;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ResultKt.throwOnFailure(obj);
                        c966212 = this;
                    }
                    c966212.this$0.applyMutation(new AnonymousClass2(null));
                    c966212.this$0.submit(BeneficiaryEvent.NavigateBackFromBeneficiaryFlowFragment.INSTANCE);
                } catch (Exception e2) {
                    e = e2;
                }
            } catch (Exception e3) {
                exc = e3;
                c96621 = this;
                c96621.this$0.submitExceptionAlertDialog(exc);
                return Unit.INSTANCE;
            }
            return Unit.INSTANCE;
        }

        /* compiled from: BeneficiaryDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/BeneficiaryParentViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$updateTrustBeneficiary$1$2", m3645f = "BeneficiaryDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.beneficiaries.ui.BeneficiaryDuxo$updateTrustBeneficiary$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<BeneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(BeneficiaryParentViewState beneficiaryParentViewState, Continuation<? super BeneficiaryParentViewState> continuation) {
                return ((AnonymousClass2) create(beneficiaryParentViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return BeneficiaryParentViewState.copy$default((BeneficiaryParentViewState) this.L$0, false, false, null, null, null, null, 3, null);
            }
        }
    }

    private final Job updateTrustBeneficiary(String accountNumber, UUID beneficiaryId, BeneficiaryIntroFlowResult introFlowResult, BeneficiaryParentViewState3.TrustFlow trustFlow) {
        return BuildersKt__Builders_commonKt.launch$default(ViewModel2.getViewModelScope(this), null, null, new C96621(introFlowResult, trustFlow, this, accountNumber, beneficiaryId, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void submitExceptionAlertDialog(Exception exception) {
        submit(new BeneficiaryEvent.ShowErrorAlertDialog(exception));
    }

    private final ApiCreateBeneficiaryDobViewModel mapIndividualDateViewModelToV1(BeneficiaryFlowDOBViewModel individualDateViewModel) {
        String title = individualDateViewModel.getTitle();
        String subtitle_markdown = individualDateViewModel.getSubtitle_markdown();
        String dob_hint = individualDateViewModel.getDob_hint();
        String dob_value = individualDateViewModel.getDob_value();
        return new ApiCreateBeneficiaryDobViewModel(title, subtitle_markdown, dob_hint, dob_value != null ? LocalDate.parse(dob_value) : null, individualDateViewModel.getDob_template(), individualDateViewModel.getAndroid_format_template(), individualDateViewModel.getLogging_identifier().name());
    }

    private final ApiCreateBeneficiaryNameViewModel mapIndividualNameViewModelToV1(BeneficiaryFlowLegalNameViewModel individualNameViewModel) {
        return new ApiCreateBeneficiaryNameViewModel(individualNameViewModel.getTitle(), individualNameViewModel.getSubtitle_markdown(), individualNameViewModel.getFirst_name_hint(), individualNameViewModel.getFirst_name_value(), individualNameViewModel.getLast_name_hint(), individualNameViewModel.getLast_name_value(), individualNameViewModel.getLogging_identifier().name());
    }

    private final ApiCreateBeneficiaryRelationshipViewModel mapIndividualRelationshipViewModelToV1(BeneficiaryFlowRelationshipViewModel individualRelationshipViewModel) {
        String str;
        String title = individualRelationshipViewModel.getTitle();
        String subtitle_markdown = individualRelationshipViewModel.getSubtitle_markdown();
        List<BeneficiaryFlowRelationshipRow> relationship_rows = individualRelationshipViewModel.getRelationship_rows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(relationship_rows, 10));
        for (BeneficiaryFlowRelationshipRow beneficiaryFlowRelationshipRow : relationship_rows) {
            String name = beneficiaryFlowRelationshipRow.getName();
            int i = WhenMappings.$EnumSwitchMapping$0[beneficiaryFlowRelationshipRow.getValue().ordinal()];
            if (i == 1) {
                str = "unspecified";
            } else if (i == 2) {
                str = "other";
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                str = "spouse";
            }
            arrayList.add(new ApiCreateBeneficiaryRelationshipViewModel.RelationshipRow(name, str));
        }
        return new ApiCreateBeneficiaryRelationshipViewModel(title, subtitle_markdown, arrayList, individualRelationshipViewModel.getLogging_identifier().name());
    }

    private final ApiCreateBeneficiaryEmailViewModel mapIndividualEmailViewModelToV1(BeneficiaryFlowEmailViewModel individualEmailViewModel) {
        return new ApiCreateBeneficiaryEmailViewModel(individualEmailViewModel.getTitle(), individualEmailViewModel.getSubtitle_markdown(), individualEmailViewModel.getEmail_hint(), individualEmailViewModel.getEmail_value(), individualEmailViewModel.getLogging_identifier().name());
    }

    private final ApiCreateBeneficiaryAccountViewModel mapIndividualAccountViewModelToV1(BeneficiaryFlowAccountViewModel individualEmailViewModel) {
        String title = individualEmailViewModel.getTitle();
        String subtitle_markdown = individualEmailViewModel.getSubtitle_markdown();
        List<BeneficiaryFlowAccountRow> account_rows = individualEmailViewModel.getAccount_rows();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(account_rows, 10));
        for (BeneficiaryFlowAccountRow beneficiaryFlowAccountRow : account_rows) {
            arrayList.add(new ApiCreateBeneficiaryAccountRow(beneficiaryFlowAccountRow.getName(), beneficiaryFlowAccountRow.getValue(), beneficiaryFlowAccountRow.getIs_selected(), beneficiaryFlowAccountRow.getIs_enabled(), beneficiaryFlowAccountRow.getSubtitle()));
        }
        return new ApiCreateBeneficiaryAccountViewModel(title, subtitle_markdown, arrayList, individualEmailViewModel.getLogging_identifier().name());
    }

    private final ApiBeneficiaryAgreementViewModel mapAgreementViewModelToV1(String accountNumber, BeneficiaryFlowAgreementViewModel agreementViewModel) {
        return new ApiBeneficiaryAgreementViewModel(agreementViewModel.getContentful_id(), agreementViewModel.getAgreement_type(), agreementViewModel.getAgreement_context(), agreementViewModel.getLogging_identifier().name(), accountNumber);
    }
}
