package com.robinhood.android.employment.p114ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.employment.p114ui.ChooseEmploymentLoadingFragment;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.api.retrofit.BonfireApi;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.api.bonfire.ApiEmployerType;
import com.robinhood.models.p355ui.bonfire.UiEmployerType;
import com.robinhood.models.p355ui.bonfire.UiEmployerType2;
import kotlin.Metadata;
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
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChooseEmploymentLoadingDuxo.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00122\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0012B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0010H\u0016J\b\u0010\u0011\u001a\u00020\u0010H\u0002R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingViewState;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentErrorEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "bonfireApi", "Lcom/robinhood/api/retrofit/BonfireApi;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/api/retrofit/BonfireApi;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "loadEmployerTypes", "Companion", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChooseEmploymentLoadingDuxo extends BaseDuxo5<ChooseEmploymentLoadingViewState, ChooseEmploymentErrorEvent> implements HasSavedState {
    private final BonfireApi bonfireApi;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseEmploymentLoadingDuxo(BonfireApi bonfireApi, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new ChooseEmploymentLoadingViewState(null, 1, null), duxoBundle);
        Intrinsics.checkNotNullParameter(bonfireApi, "bonfireApi");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.bonfireApi = bonfireApi;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        loadEmployerTypes();
    }

    /* compiled from: ChooseEmploymentLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/models/ui/bonfire/UiEmployerType;", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentLoadingDuxo$loadEmployerTypes$1", m3645f = "ChooseEmploymentLoadingDuxo.kt", m3646l = {30}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentLoadingDuxo$loadEmployerTypes$1 */
    static final class C144851 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super UiEmployerType>, Object> {
        int label;

        C144851(Continuation<? super C144851> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChooseEmploymentLoadingDuxo.this.new C144851(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super UiEmployerType> continuation) {
            return ((C144851) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                BonfireApi bonfireApi = ChooseEmploymentLoadingDuxo.this.bonfireApi;
                boolean zIsRhdOnboarding = ((ChooseEmploymentLoadingFragment.Args) ChooseEmploymentLoadingDuxo.INSTANCE.getArgs((HasSavedState) ChooseEmploymentLoadingDuxo.this)).isRhdOnboarding();
                this.label = 1;
                obj = bonfireApi.getEmployerTypes(zIsRhdOnboarding, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            return UiEmployerType2.toDbModel((ApiEmployerType) obj);
        }
    }

    private final void loadEmployerTypes() {
        LifecycleHost.DefaultImpls.bind$default(this, RxFactory.DefaultImpls.rxSingle$default(this, null, new C144851(null), 1, null), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentLoadingDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmploymentLoadingDuxo.loadEmployerTypes$lambda$0(this.f$0, (UiEmployerType) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.employment.ui.ChooseEmploymentLoadingDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return ChooseEmploymentLoadingDuxo.loadEmployerTypes$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadEmployerTypes$lambda$0(ChooseEmploymentLoadingDuxo chooseEmploymentLoadingDuxo, UiEmployerType it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chooseEmploymentLoadingDuxo.applyMutation(new ChooseEmploymentLoadingDuxo3(it, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit loadEmployerTypes$lambda$1(ChooseEmploymentLoadingDuxo chooseEmploymentLoadingDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        chooseEmploymentLoadingDuxo.submit(new ChooseEmploymentErrorEvent(it));
        return Unit.INSTANCE;
    }

    /* compiled from: ChooseEmploymentLoadingDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingDuxo;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentLoadingFragment$Args;", "<init>", "()V", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ChooseEmploymentLoadingDuxo, ChooseEmploymentLoadingFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChooseEmploymentLoadingFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ChooseEmploymentLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ChooseEmploymentLoadingFragment.Args getArgs(ChooseEmploymentLoadingDuxo chooseEmploymentLoadingDuxo) {
            return (ChooseEmploymentLoadingFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, chooseEmploymentLoadingDuxo);
        }
    }
}
