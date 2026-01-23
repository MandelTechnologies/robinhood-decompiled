package com.robinhood.android.rollover401k.steps.accountdetails;

import androidx.lifecycle.SavedStateHandle;
import bonfire.proto.idl.retirement.p038v1.GetAccountDetailsRequestDto;
import bonfire.proto.idl.retirement.p038v1.GetAccountDetailsResponseDto;
import bonfire.proto.idl.retirement.p038v1.RetirementRolloverService;
import com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.librobinhood.data.store.bonfire.AcatsPlaidStore;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidAccountNumberResponse;
import com.robinhood.models.api.bonfire.plaid.ApiAcatsInPlaidTokenRequest;
import java.util.List;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: FoundAccountDetailsDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00132\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0013B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/accountdetails/FoundAccountDetailsDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/rollover401k/steps/accountdetails/FoundAccountDetailsViewState;", "Lcom/robinhood/android/rollover401k/steps/accountdetails/FoundAccountDetailsErrorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "acatsPlaidStore", "Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;", "retirementRolloverService", "Lbonfire/proto/idl/retirement/v1/RetirementRolloverService;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/AcatsPlaidStore;Lbonfire/proto/idl/retirement/v1/RetirementRolloverService;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class FoundAccountDetailsDuxo extends BaseDuxo5<FoundAccountDetailsViewState, FoundAccountDetailsErrorEvent> implements HasSavedState {
    private final AcatsPlaidStore acatsPlaidStore;
    private final RetirementRolloverService retirementRolloverService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FoundAccountDetailsDuxo(AcatsPlaidStore acatsPlaidStore, RetirementRolloverService retirementRolloverService, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new FoundAccountDetailsViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(acatsPlaidStore, "acatsPlaidStore");
        Intrinsics.checkNotNullParameter(retirementRolloverService, "retirementRolloverService");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.acatsPlaidStore = acatsPlaidStore;
        this.retirementRolloverService = retirementRolloverService;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C277341(null), 3, null);
    }

    /* compiled from: FoundAccountDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsDuxo$onCreate$1", m3645f = "FoundAccountDetailsDuxo.kt", m3646l = {33, 40}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsDuxo$onCreate$1 */
    static final class C277341 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C277341(Continuation<? super C277341> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return FoundAccountDetailsDuxo.this.new C277341(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C277341) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
        
            if (r10 == r0) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
            } catch (Throwable th) {
                FoundAccountDetailsDuxo.this.submit(new FoundAccountDetailsErrorEvent(th));
            }
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                AcatsPlaidStore acatsPlaidStore = FoundAccountDetailsDuxo.this.acatsPlaidStore;
                Companion companion = FoundAccountDetailsDuxo.INSTANCE;
                ApiAcatsInPlaidTokenRequest apiAcatsInPlaidTokenRequest = new ApiAcatsInPlaidTokenRequest(((FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey) companion.getArgs((HasSavedState) FoundAccountDetailsDuxo.this)).getAccountNumber(), ((FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey) companion.getArgs((HasSavedState) FoundAccountDetailsDuxo.this)).getPlaidPublicToken());
                this.label = 1;
                obj = acatsPlaidStore.postPlaidLinkToken(apiAcatsInPlaidTokenRequest, this);
                if (obj == coroutine_suspended) {
                }
                return coroutine_suspended;
            }
            if (i != 1) {
                if (i != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                FoundAccountDetailsDuxo.this.applyMutation(new AnonymousClass1((GetAccountDetailsResponseDto) obj, null));
                return Unit.INSTANCE;
            }
            ResultKt.throwOnFailure(obj);
            ApiAcatsInPlaidAccountNumberResponse apiAcatsInPlaidAccountNumberResponse = (ApiAcatsInPlaidAccountNumberResponse) obj;
            RetirementRolloverService retirementRolloverService = FoundAccountDetailsDuxo.this.retirementRolloverService;
            String access_token_id = apiAcatsInPlaidAccountNumberResponse.getAccess_token_id();
            String rh_account_number = (String) CollectionsKt.firstOrNull((List) apiAcatsInPlaidAccountNumberResponse.getContra_account_numbers());
            if (rh_account_number == null) {
                rh_account_number = apiAcatsInPlaidAccountNumberResponse.getRh_account_number();
            }
            GetAccountDetailsRequestDto getAccountDetailsRequestDto = new GetAccountDetailsRequestDto(access_token_id, null, rh_account_number, 2, null);
            this.label = 2;
            obj = retirementRolloverService.GetAccountDetails(getAccountDetailsRequestDto, this);
        }

        /* compiled from: FoundAccountDetailsDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/rollover401k/steps/accountdetails/FoundAccountDetailsViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsDuxo$onCreate$1$1", m3645f = "FoundAccountDetailsDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.rollover401k.steps.accountdetails.FoundAccountDetailsDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<FoundAccountDetailsViewState, Continuation<? super FoundAccountDetailsViewState>, Object> {
            final /* synthetic */ GetAccountDetailsResponseDto $accountDetailsResponse;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetAccountDetailsResponseDto getAccountDetailsResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountDetailsResponse = getAccountDetailsResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountDetailsResponse, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(FoundAccountDetailsViewState foundAccountDetailsViewState, Continuation<? super FoundAccountDetailsViewState> continuation) {
                return ((AnonymousClass1) create(foundAccountDetailsViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((FoundAccountDetailsViewState) this.L$0).copy(FoundAccountDetailsMappers.toAccountDetailsViewModel(this.$accountDetailsResponse));
            }
        }
    }

    /* compiled from: FoundAccountDetailsDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/rollover401k/steps/accountdetails/FoundAccountDetailsDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/rollover401k/steps/accountdetails/FoundAccountDetailsDuxo;", "Lcom/robinhood/android/rollover401k/steps/accountdetails/FoundAccountDetailsFragment$FoundAccountDetailsFragmentKey;", "<init>", "()V", "feature-rollover-401k_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<FoundAccountDetailsDuxo, FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey getArgs(FoundAccountDetailsDuxo foundAccountDetailsDuxo) {
            return (FoundAccountDetailsFragment.FoundAccountDetailsFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, foundAccountDetailsDuxo);
        }
    }
}
