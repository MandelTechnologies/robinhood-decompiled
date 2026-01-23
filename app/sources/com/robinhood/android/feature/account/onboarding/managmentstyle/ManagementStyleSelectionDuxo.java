package com.robinhood.android.feature.account.onboarding.managmentstyle;

import accounts.onboarding.proto.p006v1.GetManagementStyleSelectionRequestDto;
import accounts.onboarding.proto.p006v1.GetManagementStyleSelectionResponseDto;
import accounts.onboarding.proto.p006v1.ManagementStyleRowDto;
import accounts.onboarding.proto.p006v1.ManagementStyleSelectionService;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.ViewModel2;
import com.robinhood.android.account.contracts.onboarding.ManagementStyleSelectionFragmentKey;
import com.robinhood.android.feature.account.onboarding.Microgram;
import com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionViewState;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.rosetta.converters.brokerage.BrokerageAccountTypes3;
import java.util.ArrayList;
import java.util.Iterator;
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
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList3;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.CoroutineScope;
import microgram.android.RemoteMicrogramApplication;
import microgram.android.inject.MicrogramComponent;
import rosetta.account.BrokerageAccountTypeDto;

/* compiled from: ManagementStyleSelectionDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0012\u001a\u00020\u0013H\u0016R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "microgramComponentFactory", "Lmicrogram/android/inject/MicrogramComponent$Factory;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;Lmicrogram/android/inject/MicrogramComponent$Factory;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "accountOnboardingComponent", "Lmicrogram/android/inject/MicrogramComponent;", "managementStyleSelectionService", "Laccounts/onboarding/proto/v1/ManagementStyleSelectionService;", "onCreate", "", "Companion", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes3.dex */
public final class ManagementStyleSelectionDuxo extends BaseDuxo4<ManagementStyleSelectionViewState> implements HasSavedState {
    private final MicrogramComponent accountOnboardingComponent;
    private final ManagementStyleSelectionService managementStyleSelectionService;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ManagementStyleSelectionDuxo(SavedStateHandle savedStateHandle, DuxoBundle duxoBundle, MicrogramComponent.Factory microgramComponentFactory) {
        super(ManagementStyleSelectionViewState.Loading.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(microgramComponentFactory, "microgramComponentFactory");
        this.savedStateHandle = savedStateHandle;
        MicrogramComponent microgramComponentCreate$default = MicrogramComponent.Factory.DefaultImpls.create$default(microgramComponentFactory, ViewModel2.getViewModelScope(this), new RemoteMicrogramApplication(Microgram.accountOnboardingAppId, null, 2, null), null, 4, null);
        this.accountOnboardingComponent = microgramComponentCreate$default;
        this.managementStyleSelectionService = (ManagementStyleSelectionService) microgramComponentCreate$default.getServiceLocator().getClient(ManagementStyleSelectionService.class);
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C166821(null));
    }

    /* compiled from: ManagementStyleSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionDuxo$onCreate$1", m3645f = "ManagementStyleSelectionDuxo.kt", m3646l = {50}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionDuxo$onCreate$1 */
    static final class C166821 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C166821(Continuation<? super C166821> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ManagementStyleSelectionDuxo.this.new C166821(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C166821) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                GetManagementStyleSelectionRequestDto getManagementStyleSelectionRequestDto = new GetManagementStyleSelectionRequestDto(BrokerageAccountTypeDto.INSTANCE.fromProto(BrokerageAccountTypes3.toProtobuf(((ManagementStyleSelectionFragmentKey) ManagementStyleSelectionDuxo.INSTANCE.getArgs((HasSavedState) ManagementStyleSelectionDuxo.this)).getBrokerageAccountType())));
                ManagementStyleSelectionService managementStyleSelectionService = ManagementStyleSelectionDuxo.this.managementStyleSelectionService;
                this.label = 1;
                obj = managementStyleSelectionService.GetManagementStyleSelection(getManagementStyleSelectionRequestDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            ManagementStyleSelectionDuxo managementStyleSelectionDuxo = ManagementStyleSelectionDuxo.this;
            managementStyleSelectionDuxo.applyMutation(new AnonymousClass1((GetManagementStyleSelectionResponseDto) obj, managementStyleSelectionDuxo, null));
            return Unit.INSTANCE;
        }

        /* compiled from: ManagementStyleSelectionDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionDuxo$onCreate$1$1", m3645f = "ManagementStyleSelectionDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.feature.account.onboarding.managmentstyle.ManagementStyleSelectionDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ManagementStyleSelectionViewState, Continuation<? super ManagementStyleSelectionViewState>, Object> {
            final /* synthetic */ GetManagementStyleSelectionResponseDto $response;
            int label;
            final /* synthetic */ ManagementStyleSelectionDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetManagementStyleSelectionResponseDto getManagementStyleSelectionResponseDto, ManagementStyleSelectionDuxo managementStyleSelectionDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$response = getManagementStyleSelectionResponseDto;
                this.this$0 = managementStyleSelectionDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.$response, this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ManagementStyleSelectionViewState managementStyleSelectionViewState, Continuation<? super ManagementStyleSelectionViewState> continuation) {
                return ((AnonymousClass1) create(managementStyleSelectionViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                String title = this.$response.getTitle();
                String subtitle = this.$response.getSubtitle();
                List<ManagementStyleRowDto> rows = this.$response.getRows();
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(rows, 10));
                Iterator<T> it = rows.iterator();
                while (it.hasNext()) {
                    arrayList.add(ManagementTypeSelectionRow2.toSelectionRow((ManagementStyleRowDto) it.next()));
                }
                ImmutableList3 persistentList = extensions2.toPersistentList(arrayList);
                String footer_disclosure_markdown = this.$response.getFooter_disclosure_markdown();
                Companion companion = ManagementStyleSelectionDuxo.INSTANCE;
                String source = ((ManagementStyleSelectionFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getSource();
                if (source == null) {
                    source = "";
                }
                return new ManagementStyleSelectionViewState.Loaded(title, subtitle, footer_disclosure_markdown, ((ManagementStyleSelectionFragmentKey) companion.getArgs((HasSavedState) this.this$0)).getBrokerageAccountType(), persistentList, source);
            }
        }
    }

    /* compiled from: ManagementStyleSelectionDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/feature/account/onboarding/managmentstyle/ManagementStyleSelectionDuxo;", "Lcom/robinhood/android/account/contracts/onboarding/ManagementStyleSelectionFragmentKey;", "<init>", "()V", "feature-account-onboarding_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ManagementStyleSelectionDuxo, ManagementStyleSelectionFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ManagementStyleSelectionFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (ManagementStyleSelectionFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ManagementStyleSelectionFragmentKey getArgs(ManagementStyleSelectionDuxo managementStyleSelectionDuxo) {
            return (ManagementStyleSelectionFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, managementStyleSelectionDuxo);
        }
    }
}
