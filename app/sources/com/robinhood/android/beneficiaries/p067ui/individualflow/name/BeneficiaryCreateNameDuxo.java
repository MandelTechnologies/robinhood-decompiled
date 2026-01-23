package com.robinhood.android.beneficiaries.p067ui.individualflow.name;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.beneficiaries.models.api.ApiCreateBeneficiaryConfiguration;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BeneficiaryCreateNameDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012J\u000e\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0012R\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDataState;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameStateProvider;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "setFirstName", "", "firstName", "", "setLastName", "lastName", "Companion", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class BeneficiaryCreateNameDuxo extends BaseDuxo<BeneficiaryCreateNameDataState, BeneficiaryCreateNameViewState> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BeneficiaryCreateNameDuxo(SavedStateHandle savedStateHandle, BeneficiaryCreateNameViewState3 stateProvider, DuxoBundle duxoBundle) {
        super(new BeneficiaryCreateNameDataState(null, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: BeneficiaryCreateNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameDuxo$setFirstName$1", m3645f = "BeneficiaryCreateNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameDuxo$setFirstName$1 */
    static final class C97291 extends ContinuationImpl7 implements Function2<BeneficiaryCreateNameDataState, Continuation<? super BeneficiaryCreateNameDataState>, Object> {
        final /* synthetic */ String $firstName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C97291(String str, Continuation<? super C97291> continuation) {
            super(2, continuation);
            this.$firstName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97291 c97291 = new C97291(this.$firstName, continuation);
            c97291.L$0 = obj;
            return c97291;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryCreateNameDataState beneficiaryCreateNameDataState, Continuation<? super BeneficiaryCreateNameDataState> continuation) {
            return ((C97291) create(beneficiaryCreateNameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryCreateNameDataState.copy$default((BeneficiaryCreateNameDataState) this.L$0, this.$firstName, null, 2, null);
        }
    }

    public final void setFirstName(String firstName) {
        Intrinsics.checkNotNullParameter(firstName, "firstName");
        applyMutation(new C97291(firstName, null));
    }

    /* compiled from: BeneficiaryCreateNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameDuxo$setLastName$1", m3645f = "BeneficiaryCreateNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.beneficiaries.ui.individualflow.name.BeneficiaryCreateNameDuxo$setLastName$1 */
    static final class C97301 extends ContinuationImpl7 implements Function2<BeneficiaryCreateNameDataState, Continuation<? super BeneficiaryCreateNameDataState>, Object> {
        final /* synthetic */ String $lastName;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C97301(String str, Continuation<? super C97301> continuation) {
            super(2, continuation);
            this.$lastName = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C97301 c97301 = new C97301(this.$lastName, continuation);
            c97301.L$0 = obj;
            return c97301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(BeneficiaryCreateNameDataState beneficiaryCreateNameDataState, Continuation<? super BeneficiaryCreateNameDataState> continuation) {
            return ((C97301) create(beneficiaryCreateNameDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return BeneficiaryCreateNameDataState.copy$default((BeneficiaryCreateNameDataState) this.L$0, null, this.$lastName, 1, null);
        }
    }

    public final void setLastName(String lastName) {
        Intrinsics.checkNotNullParameter(lastName, "lastName");
        applyMutation(new C97301(lastName, null));
    }

    /* compiled from: BeneficiaryCreateNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/beneficiaries/ui/individualflow/name/BeneficiaryCreateNameDuxo;", "Lcom/robinhood/android/beneficiaries/models/api/ApiCreateBeneficiaryConfiguration;", "<init>", "()V", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<BeneficiaryCreateNameDuxo, ApiCreateBeneficiaryConfiguration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(SavedStateHandle savedStateHandle) {
            return (ApiCreateBeneficiaryConfiguration) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ApiCreateBeneficiaryConfiguration getArgs(BeneficiaryCreateNameDuxo beneficiaryCreateNameDuxo) {
            return (ApiCreateBeneficiaryConfiguration) DuxoCompanion.DefaultImpls.getArgs(this, beneficiaryCreateNameDuxo);
        }
    }
}
