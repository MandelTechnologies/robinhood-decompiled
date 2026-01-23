package com.robinhood.android.transfercelebration;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.api.retirement.RetirementApi;
import com.robinhood.android.retirement.contracts.RetirementTransferCelebration;
import com.robinhood.android.transfercelebration.IraTransferCelebrationDuxo2;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.bonfire.ApiPostTransferPage;
import com.robinhood.models.p355ui.bonfire.UiPostTransferPage2;
import java.util.UUID;
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
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IraTransferCelebrationDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfercelebration/IraTransferCelebrationDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/transfercelebration/IraTransferCelebrationEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "retirementApi", "Lcom/robinhood/android/api/retirement/RetirementApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/api/retirement/RetirementApi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "Companion", "feature-retirement-transfer-celebration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class IraTransferCelebrationDuxo extends BaseDuxo5<Unit, IraTransferCelebrationDuxo2> implements HasSavedState {
    private final RetirementApi retirementApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IraTransferCelebrationDuxo(RetirementApi retirementApi, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(retirementApi, "retirementApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.retirementApi = retirementApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C300381(null), 3, null);
    }

    /* compiled from: IraTransferCelebrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.transfercelebration.IraTransferCelebrationDuxo$onCreate$1", m3645f = "IraTransferCelebrationDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.transfercelebration.IraTransferCelebrationDuxo$onCreate$1 */
    static final class C300381 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C300381(Continuation<? super C300381> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IraTransferCelebrationDuxo.this.new C300381(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C300381) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    RetirementApi retirementApi = IraTransferCelebrationDuxo.this.retirementApi;
                    UUID transferId = ((RetirementTransferCelebration) IraTransferCelebrationDuxo.INSTANCE.getExtras((HasSavedState) IraTransferCelebrationDuxo.this)).getTransferId();
                    this.label = 1;
                    obj = retirementApi.getIraTransferCelebration(transferId, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                IraTransferCelebrationDuxo.this.submit(new IraTransferCelebrationDuxo2.Loaded(UiPostTransferPage2.toUiModel((ApiPostTransferPage.IraContributionCelebration.Data) obj)));
            } catch (Throwable th) {
                IraTransferCelebrationDuxo.this.submit(new IraTransferCelebrationDuxo2.Error(th));
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: IraTransferCelebrationDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfercelebration/IraTransferCelebrationDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/transfercelebration/IraTransferCelebrationDuxo;", "Lcom/robinhood/android/retirement/contracts/RetirementTransferCelebration;", "<init>", "()V", "feature-retirement-transfer-celebration_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<IraTransferCelebrationDuxo, RetirementTransferCelebration> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public RetirementTransferCelebration getExtras(SavedStateHandle savedStateHandle) {
            return (RetirementTransferCelebration) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public RetirementTransferCelebration getExtras(IraTransferCelebrationDuxo iraTransferCelebrationDuxo) {
            return (RetirementTransferCelebration) DuxoCompanion2.DefaultImpls.getExtras(this, iraTransferCelebrationDuxo);
        }
    }
}
