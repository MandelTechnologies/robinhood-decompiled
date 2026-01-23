package com.robinhood.android.acatsin.confirmname;

import android.graphics.Bitmap;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameContract;
import com.robinhood.android.acatsin.util.names.FetchAccountNamesUseCase;
import com.robinhood.android.acatsin.util.names.NamesOnAccount;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.models.api.BrokerageAccountType;
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

/* compiled from: AcatsInConfirmAccountNameDuxo.kt */
@Metadata(m3635d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0014B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u000e\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012J\u0006\u0010\u0013\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "fetchAccountNamesUseCase", "Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/acatsin/util/names/FetchAccountNamesUseCase;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "setContraBrokerLogo", "bitmap", "Landroid/graphics/Bitmap;", "indicateLogoLoading", "Companion", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes24.dex */
public final class AcatsInConfirmAccountNameDuxo extends BaseDuxo4<AcatsInConfirmAccountNameViewState> implements HasSavedState {
    private final FetchAccountNamesUseCase fetchAccountNamesUseCase;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AcatsInConfirmAccountNameDuxo(FetchAccountNamesUseCase fetchAccountNamesUseCase, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(fetchAccountNamesUseCase, "fetchAccountNamesUseCase");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        NamesOnAccount namesOnAccount = null;
        Bitmap bitmap = null;
        boolean z = false;
        super(new AcatsInConfirmAccountNameViewState(((AcatsInConfirmAccountNameContract.Key) companion.getArgs(savedStateHandle)).getRhsAccount(), namesOnAccount, bitmap, z, ((AcatsInConfirmAccountNameContract.Key) companion.getArgs(savedStateHandle)).getBrokerageOrDtcNumber(), 14, null), duxoBundle);
        this.fetchAccountNamesUseCase = fetchAccountNamesUseCase;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onResume() {
        super.onResume();
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C78521(null), 3, null);
    }

    /* compiled from: AcatsInConfirmAccountNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$onResume$1", m3645f = "AcatsInConfirmAccountNameDuxo.kt", m3646l = {31}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$onResume$1 */
    static final class C78521 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C78521(Continuation<? super C78521> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return AcatsInConfirmAccountNameDuxo.this.new C78521(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C78521) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                FetchAccountNamesUseCase fetchAccountNamesUseCase = AcatsInConfirmAccountNameDuxo.this.fetchAccountNamesUseCase;
                Companion companion = AcatsInConfirmAccountNameDuxo.INSTANCE;
                String rhsAccountNumber = ((AcatsInConfirmAccountNameContract.Key) companion.getArgs((HasSavedState) AcatsInConfirmAccountNameDuxo.this)).getRhsAccount().getRhsAccountNumber();
                BrokerageAccountType brokerageAccountType = ((AcatsInConfirmAccountNameContract.Key) companion.getArgs((HasSavedState) AcatsInConfirmAccountNameDuxo.this)).getRhsAccount().getBrokerageAccountType();
                this.label = 1;
                obj = fetchAccountNamesUseCase.invoke(rhsAccountNumber, brokerageAccountType, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            AcatsInConfirmAccountNameDuxo.this.applyMutation(new AnonymousClass1((NamesOnAccount) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: AcatsInConfirmAccountNameDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$onResume$1$1", m3645f = "AcatsInConfirmAccountNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$onResume$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<AcatsInConfirmAccountNameViewState, Continuation<? super AcatsInConfirmAccountNameViewState>, Object> {
            final /* synthetic */ NamesOnAccount $accountNames;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(NamesOnAccount namesOnAccount, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountNames = namesOnAccount;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountNames, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState, Continuation<? super AcatsInConfirmAccountNameViewState> continuation) {
                return ((AnonymousClass1) create(acatsInConfirmAccountNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return AcatsInConfirmAccountNameViewState.copy$default((AcatsInConfirmAccountNameViewState) this.L$0, null, this.$accountNames, null, false, null, 29, null);
            }
        }
    }

    /* compiled from: AcatsInConfirmAccountNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$setContraBrokerLogo$1", m3645f = "AcatsInConfirmAccountNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$setContraBrokerLogo$1 */
    static final class C78531 extends ContinuationImpl7 implements Function2<AcatsInConfirmAccountNameViewState, Continuation<? super AcatsInConfirmAccountNameViewState>, Object> {
        final /* synthetic */ Bitmap $bitmap;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C78531(Bitmap bitmap, Continuation<? super C78531> continuation) {
            super(2, continuation);
            this.$bitmap = bitmap;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78531 c78531 = new C78531(this.$bitmap, continuation);
            c78531.L$0 = obj;
            return c78531;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState, Continuation<? super AcatsInConfirmAccountNameViewState> continuation) {
            return ((C78531) create(acatsInConfirmAccountNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInConfirmAccountNameViewState.copy$default((AcatsInConfirmAccountNameViewState) this.L$0, null, null, this.$bitmap, false, null, 27, null);
        }
    }

    public final void setContraBrokerLogo(Bitmap bitmap) {
        Intrinsics.checkNotNullParameter(bitmap, "bitmap");
        applyMutation(new C78531(bitmap, null));
    }

    /* compiled from: AcatsInConfirmAccountNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$indicateLogoLoading$1", m3645f = "AcatsInConfirmAccountNameDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.acatsin.confirmname.AcatsInConfirmAccountNameDuxo$indicateLogoLoading$1 */
    static final class C78511 extends ContinuationImpl7 implements Function2<AcatsInConfirmAccountNameViewState, Continuation<? super AcatsInConfirmAccountNameViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C78511(Continuation<? super C78511> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C78511 c78511 = new C78511(continuation);
            c78511.L$0 = obj;
            return c78511;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(AcatsInConfirmAccountNameViewState acatsInConfirmAccountNameViewState, Continuation<? super AcatsInConfirmAccountNameViewState> continuation) {
            return ((C78511) create(acatsInConfirmAccountNameViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return AcatsInConfirmAccountNameViewState.copy$default((AcatsInConfirmAccountNameViewState) this.L$0, null, null, null, true, null, 23, null);
        }
    }

    public final void indicateLogoLoading() {
        applyMutation(new C78511(null));
    }

    /* compiled from: AcatsInConfirmAccountNameDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameDuxo;", "Lcom/robinhood/android/acatsin/confirmname/AcatsInConfirmAccountNameContract$Key;", "<init>", "()V", "feature-acats-in_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<AcatsInConfirmAccountNameDuxo, AcatsInConfirmAccountNameContract.Key> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInConfirmAccountNameContract.Key getArgs(SavedStateHandle savedStateHandle) {
            return (AcatsInConfirmAccountNameContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public AcatsInConfirmAccountNameContract.Key getArgs(AcatsInConfirmAccountNameDuxo acatsInConfirmAccountNameDuxo) {
            return (AcatsInConfirmAccountNameContract.Key) DuxoCompanion.DefaultImpls.getArgs(this, acatsInConfirmAccountNameDuxo);
        }
    }
}
