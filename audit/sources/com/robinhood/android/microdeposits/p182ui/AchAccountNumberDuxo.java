package com.robinhood.android.microdeposits.p182ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.microdeposits.p182ui.AchAccountNumberDuxo;
import com.robinhood.android.microdeposits.p182ui.AchAccountNumberFragment;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.api.retrofit.Midlands;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.models.api.AchBank;
import io.reactivex.Observable;
import kotlin.Metadata;
import kotlin.Result;
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

/* compiled from: AchAccountNumberDuxo.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0016B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012J\u0014\u0010\u0014\u001a\u00020\u000f2\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchAccountNumberDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "midlands", "Lcom/robinhood/api/retrofit/Midlands;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/api/retrofit/Midlands;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "routingNumber", "", "onCreate", "", "bindAccountNumberChanges", "accountNumberChanges", "Lio/reactivex/Observable;", "", "bindVerifyAccountNumberChanges", "verifyAccountNumberChanges", "Companion", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class AchAccountNumberDuxo extends OldBaseDuxo<AchAccountNumberViewState> implements HasSavedState {
    private final Midlands midlands;
    private final String routingNumber;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AchAccountNumberDuxo(Midlands midlands, SavedStateHandle savedStateHandle) {
        super(new AchAccountNumberViewState(null, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(midlands, "midlands");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.midlands = midlands;
        this.savedStateHandle = savedStateHandle;
        this.routingNumber = ((AchAccountNumberFragment.Args) INSTANCE.getArgs(getSavedStateHandle())).getRoutingNumber();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C218061(null));
    }

    /* compiled from: AchAccountNumberDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.microdeposits.ui.AchAccountNumberDuxo$onCreate$1", m3645f = "AchAccountNumberDuxo.kt", m3646l = {27}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.microdeposits.ui.AchAccountNumberDuxo$onCreate$1 */
    static final class C218061 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C218061(Continuation<? super C218061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C218061 c218061 = AchAccountNumberDuxo.this.new C218061(continuation);
            c218061.L$0 = obj;
            return c218061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C218061) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object objM28550constructorimpl;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    AchAccountNumberDuxo achAccountNumberDuxo = AchAccountNumberDuxo.this;
                    Result.Companion companion = Result.INSTANCE;
                    Midlands midlands = achAccountNumberDuxo.midlands;
                    String str = achAccountNumberDuxo.routingNumber;
                    this.label = 1;
                    obj = midlands.getBankName(str, this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                objM28550constructorimpl = Result.m28550constructorimpl(((AchBank) obj).getName());
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                objM28550constructorimpl = Result.m28550constructorimpl(ResultKt.createFailure(th));
            }
            AchAccountNumberDuxo achAccountNumberDuxo2 = AchAccountNumberDuxo.this;
            if (Result.m28556isSuccessimpl(objM28550constructorimpl)) {
                final String str2 = (String) objM28550constructorimpl;
                achAccountNumberDuxo2.applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberDuxo$onCreate$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return AchAccountNumberDuxo.C218061.invokeSuspend$lambda$2$lambda$1(str2, (AchAccountNumberViewState) obj2);
                    }
                });
            }
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final AchAccountNumberViewState invokeSuspend$lambda$2$lambda$1(String str, AchAccountNumberViewState achAccountNumberViewState) {
            return AchAccountNumberViewState.copy$default(achAccountNumberViewState, null, str, null, 5, null);
        }
    }

    public final void bindAccountNumberChanges(Observable<CharSequence> accountNumberChanges) {
        Intrinsics.checkNotNullParameter(accountNumberChanges, "accountNumberChanges");
        Observable<CharSequence> observableSkip = accountNumberChanges.skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSkip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountNumberDuxo.bindAccountNumberChanges$lambda$1(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindAccountNumberChanges$lambda$1(AchAccountNumberDuxo achAccountNumberDuxo, final CharSequence charSequence) {
        achAccountNumberDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountNumberDuxo.bindAccountNumberChanges$lambda$1$lambda$0(charSequence, (AchAccountNumberViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountNumberViewState bindAccountNumberChanges$lambda$1$lambda$0(CharSequence charSequence, AchAccountNumberViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountNumberViewState.copy$default(applyMutation, charSequence, null, null, 6, null);
    }

    public final void bindVerifyAccountNumberChanges(Observable<CharSequence> verifyAccountNumberChanges) {
        Intrinsics.checkNotNullParameter(verifyAccountNumberChanges, "verifyAccountNumberChanges");
        Observable<CharSequence> observableSkip = verifyAccountNumberChanges.skip(1L);
        Intrinsics.checkNotNullExpressionValue(observableSkip, "skip(...)");
        LifecycleHost.DefaultImpls.bind$default(this, observableSkip, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountNumberDuxo.bindVerifyAccountNumberChanges$lambda$3(this.f$0, (CharSequence) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit bindVerifyAccountNumberChanges$lambda$3(AchAccountNumberDuxo achAccountNumberDuxo, final CharSequence charSequence) {
        achAccountNumberDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.microdeposits.ui.AchAccountNumberDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AchAccountNumberDuxo.bindVerifyAccountNumberChanges$lambda$3$lambda$2(charSequence, (AchAccountNumberViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AchAccountNumberViewState bindVerifyAccountNumberChanges$lambda$3$lambda$2(CharSequence charSequence, AchAccountNumberViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return AchAccountNumberViewState.copy$default(applyMutation, null, null, charSequence, 3, null);
    }

    /* compiled from: AchAccountNumberDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/microdeposits/ui/AchAccountNumberDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberDuxo;", "Lcom/robinhood/android/microdeposits/ui/AchAccountNumberFragment$Args;", "<init>", "()V", "feature-microdeposits_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AchAccountNumberDuxo, AchAccountNumberFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchAccountNumberFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (AchAccountNumberFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AchAccountNumberFragment.Args getArgs(AchAccountNumberDuxo achAccountNumberDuxo) {
            return (AchAccountNumberFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, achAccountNumberDuxo);
        }
    }
}
