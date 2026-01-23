package com.robinhood.shared.agreements.agreementsscreen;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.analytics.AnalyticsLogger;
import com.robinhood.android.agreements.AgreementsStore;
import com.robinhood.android.agreements.models.UiAgreementWithContent;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoHasArgsCompanion;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementEvent;
import com.robinhood.shared.agreements.contracts.IdentiAgreementType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: IdentiAgreementDuxo.kt */
@Metadata(m3635d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 \u001c2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\b\u0012\u0004\u0012\u00020\u00060\u0005:\u0002\u001b\u001cB)\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f\u0012\u0006\u0010\r\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u000e\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0014J\u000e\u0010\u0019\u001a\u00020\u0014H\u0082@¢\u0006\u0002\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementViewState;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo$InitArgs;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "agreementsStore", "Lcom/robinhood/android/agreements/AgreementsStore;", "analyticsLogger", "Lcom/robinhood/analytics/AnalyticsLogger;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/agreements/AgreementsStore;Lcom/robinhood/analytics/AnalyticsLogger;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "onAgreeClicked", "agreement", "Lcom/robinhood/android/agreements/models/UiAgreementWithContent;", "onRetryClicked", "fetchAndSetAgreement", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "InitArgs", "Companion", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes26.dex */
public final class IdentiAgreementDuxo extends BaseDuxo3<IdentiAgreementDataState, IdentiAgreementViewState, IdentiAgreementEvent> implements HasArgs<InitArgs> {
    private final AgreementsStore agreementsStore;
    private final AnalyticsLogger analyticsLogger;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo", m3645f = "IdentiAgreementDuxo.kt", m3646l = {81}, m3647m = "fetchAndSetAgreement")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$fetchAndSetAgreement$1 */
    static final class C373251 extends ContinuationImpl {
        int label;
        /* synthetic */ Object result;

        C373251(Continuation<? super C373251> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return IdentiAgreementDuxo.this.fetchAndSetAgreement(this);
        }
    }

    @Override // com.robinhood.android.udf.HasArgs
    public InitArgs getArgs(SavedStateHandle savedStateHandle) {
        return (InitArgs) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IdentiAgreementDuxo(SavedStateHandle savedStateHandle, AgreementsStore agreementsStore, AnalyticsLogger analyticsLogger, DuxoBundle duxoBundle) {
        super(new IdentiAgreementDataState(((InitArgs) INSTANCE.getArgs(savedStateHandle)).getAgreementType(), null, null, false, 14, null), IdentiAgreementDataState.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(agreementsStore, "agreementsStore");
        Intrinsics.checkNotNullParameter(analyticsLogger, "analyticsLogger");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.savedStateHandle = savedStateHandle;
        this.agreementsStore = agreementsStore;
        this.analyticsLogger = analyticsLogger;
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0006\u0010\u000f\u001a\u00020\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0005HÖ\u0001J\u0016\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u001c"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo$InitArgs;", "Landroid/os/Parcelable;", "agreementType", "Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "accountNumber", "", "<init>", "(Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;Ljava/lang/String;)V", "getAgreementType", "()Lcom/robinhood/shared/agreements/contracts/IdentiAgreementType;", "getAccountNumber", "()Ljava/lang/String;", "component1", "component2", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "dest", "Landroid/os/Parcel;", "flags", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final /* data */ class InitArgs implements Parcelable {
        public static final int $stable = 8;
        public static final Parcelable.Creator<InitArgs> CREATOR = new Creator();
        private final String accountNumber;
        private final IdentiAgreementType agreementType;

        /* compiled from: IdentiAgreementDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        public static final class Creator implements Parcelable.Creator<InitArgs> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                return new InitArgs((IdentiAgreementType) parcel.readParcelable(InitArgs.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            public final InitArgs[] newArray(int i) {
                return new InitArgs[i];
            }
        }

        public static /* synthetic */ InitArgs copy$default(InitArgs initArgs, IdentiAgreementType identiAgreementType, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                identiAgreementType = initArgs.agreementType;
            }
            if ((i & 2) != 0) {
                str = initArgs.accountNumber;
            }
            return initArgs.copy(identiAgreementType, str);
        }

        /* renamed from: component1, reason: from getter */
        public final IdentiAgreementType getAgreementType() {
            return this.agreementType;
        }

        /* renamed from: component2, reason: from getter */
        public final String getAccountNumber() {
            return this.accountNumber;
        }

        public final InitArgs copy(IdentiAgreementType agreementType, String accountNumber) {
            Intrinsics.checkNotNullParameter(agreementType, "agreementType");
            return new InitArgs(agreementType, accountNumber);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof InitArgs)) {
                return false;
            }
            InitArgs initArgs = (InitArgs) other;
            return Intrinsics.areEqual(this.agreementType, initArgs.agreementType) && Intrinsics.areEqual(this.accountNumber, initArgs.accountNumber);
        }

        public int hashCode() {
            int iHashCode = this.agreementType.hashCode() * 31;
            String str = this.accountNumber;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "InitArgs(agreementType=" + this.agreementType + ", accountNumber=" + this.accountNumber + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel dest, int flags) {
            Intrinsics.checkNotNullParameter(dest, "dest");
            dest.writeParcelable(this.agreementType, flags);
            dest.writeString(this.accountNumber);
        }

        public InitArgs(IdentiAgreementType agreementType, String str) {
            Intrinsics.checkNotNullParameter(agreementType, "agreementType");
            this.agreementType = agreementType;
            this.accountNumber = str;
        }

        public /* synthetic */ InitArgs(IdentiAgreementType identiAgreementType, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this(identiAgreementType, (i & 2) != 0 ? null : str);
        }

        public final IdentiAgreementType getAgreementType() {
            return this.agreementType;
        }

        public final String getAccountNumber() {
            return this.accountNumber;
        }
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoHasArgsCompanion;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo;", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDuxo$InitArgs;", "<init>", "()V", "lib-agreements-screen_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoHasArgsCompanion<IdentiAgreementDuxo, InitArgs> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(SavedStateHandle savedStateHandle) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoHasArgsCompanion
        public InitArgs getArgs(IdentiAgreementDuxo identiAgreementDuxo) {
            return (InitArgs) DuxoHasArgsCompanion.DefaultImpls.getArgs(this, identiAgreementDuxo);
        }
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onStart$1", m3645f = "IdentiAgreementDuxo.kt", m3646l = {43}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onStart$1 */
    static final class C373321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C373321(Continuation<? super C373321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdentiAgreementDuxo.this.new C373321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C373321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IdentiAgreementDuxo identiAgreementDuxo = IdentiAgreementDuxo.this;
                this.label = 1;
                if (identiAgreementDuxo.fetchAndSetAgreement(this) == coroutine_suspended) {
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

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        getLifecycleScope().launchWhenStarted(new C373321(null));
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onAgreeClicked$1", m3645f = "IdentiAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onAgreeClicked$1 */
    static final class C373281 extends ContinuationImpl7 implements Function2<IdentiAgreementDataState, Continuation<? super IdentiAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C373281(Continuation<? super C373281> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373281 c373281 = new C373281(continuation);
            c373281.L$0 = obj;
            return c373281;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IdentiAgreementDataState identiAgreementDataState, Continuation<? super IdentiAgreementDataState> continuation) {
            return ((C373281) create(identiAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdentiAgreementDataState.copy$default((IdentiAgreementDataState) this.L$0, null, null, null, true, 7, null);
        }
    }

    public final void onAgreeClicked(UiAgreementWithContent agreement) {
        Intrinsics.checkNotNullParameter(agreement, "agreement");
        applyMutation(new C373281(null));
        submit(IdentiAgreementEvent.Submitting.INSTANCE);
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C373292(agreement, null), 3, null);
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onAgreeClicked$2", m3645f = "IdentiAgreementDuxo.kt", m3646l = {55}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onAgreeClicked$2 */
    static final class C373292 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ UiAgreementWithContent $agreement;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C373292(UiAgreementWithContent uiAgreementWithContent, Continuation<? super C373292> continuation) {
            super(2, continuation);
            this.$agreement = uiAgreementWithContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdentiAgreementDuxo.this.new C373292(this.$agreement, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C373292) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C373292 c373292;
            AgreementsStore agreementsStore;
            UiAgreementWithContent uiAgreementWithContent;
            String accountNumber;
            Exception exc;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                try {
                    agreementsStore = IdentiAgreementDuxo.this.agreementsStore;
                    uiAgreementWithContent = this.$agreement;
                    accountNumber = ((InitArgs) IdentiAgreementDuxo.INSTANCE.getArgs((HasArgs) IdentiAgreementDuxo.this)).getAccountNumber();
                    this.label = 1;
                    c373292 = this;
                } catch (Exception e) {
                    e = e;
                    c373292 = this;
                    exc = e;
                    IdentiAgreementDuxo.this.submit(new IdentiAgreementEvent.Error(exc));
                    IdentiAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
                try {
                    if (AgreementsStore.signAgreement$default(agreementsStore, uiAgreementWithContent, null, accountNumber, c373292, 2, null) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } catch (Exception e2) {
                    e = e2;
                    exc = e;
                    IdentiAgreementDuxo.this.submit(new IdentiAgreementEvent.Error(exc));
                    IdentiAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c373292 = this;
                } catch (Exception e3) {
                    exc = e3;
                    c373292 = this;
                    IdentiAgreementDuxo.this.submit(new IdentiAgreementEvent.Error(exc));
                    IdentiAgreementDuxo.this.applyMutation(new AnonymousClass1(null));
                    return Unit.INSTANCE;
                }
            }
            AnalyticsLogger analyticsLogger = IdentiAgreementDuxo.this.analyticsLogger;
            String string2 = c373292.$agreement.getApiAgreement().getId().toString();
            Intrinsics.checkNotNullExpressionValue(string2, "toString(...)");
            analyticsLogger.logUserAction(string2);
            IdentiAgreementDuxo.this.submit(IdentiAgreementEvent.Submitted.INSTANCE);
            return Unit.INSTANCE;
        }

        /* compiled from: IdentiAgreementDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onAgreeClicked$2$1", m3645f = "IdentiAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onAgreeClicked$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<IdentiAgreementDataState, Continuation<? super IdentiAgreementDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass1(Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(IdentiAgreementDataState identiAgreementDataState, Continuation<? super IdentiAgreementDataState> continuation) {
                return ((AnonymousClass1) create(identiAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return IdentiAgreementDataState.copy$default((IdentiAgreementDataState) this.L$0, null, null, null, false, 7, null);
            }
        }
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onRetryClicked$1", m3645f = "IdentiAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onRetryClicked$1 */
    static final class C373301 extends ContinuationImpl7 implements Function2<IdentiAgreementDataState, Continuation<? super IdentiAgreementDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C373301(Continuation<? super C373301> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373301 c373301 = new C373301(continuation);
            c373301.L$0 = obj;
            return c373301;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IdentiAgreementDataState identiAgreementDataState, Continuation<? super IdentiAgreementDataState> continuation) {
            return ((C373301) create(identiAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdentiAgreementDataState.copy$default((IdentiAgreementDataState) this.L$0, null, null, null, false, 11, null);
        }
    }

    public final void onRetryClicked() {
        applyMutation(new C373301(null));
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C373312(null), 3, null);
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onRetryClicked$2", m3645f = "IdentiAgreementDuxo.kt", m3646l = {75}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$onRetryClicked$2 */
    static final class C373312 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C373312(Continuation<? super C373312> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return IdentiAgreementDuxo.this.new C373312(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C373312) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                IdentiAgreementDuxo identiAgreementDuxo = IdentiAgreementDuxo.this;
                this.label = 1;
                if (identiAgreementDuxo.fetchAndSetAgreement(this) == coroutine_suspended) {
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

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object fetchAndSetAgreement(Continuation<? super Unit> continuation) {
        C373251 c373251;
        if (continuation instanceof C373251) {
            c373251 = (C373251) continuation;
            int i = c373251.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                c373251.label = i - Integer.MIN_VALUE;
            } else {
                c373251 = new C373251(continuation);
            }
        }
        Object agreementWithContent = c373251.result;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i2 = c373251.label;
        try {
            if (i2 == 0) {
                ResultKt.throwOnFailure(agreementWithContent);
                AgreementsStore agreementsStore = this.agreementsStore;
                String serverValue = ((InitArgs) INSTANCE.getArgs((HasArgs) this)).getAgreementType().getServerValue();
                c373251.label = 1;
                agreementWithContent = agreementsStore.getAgreementWithContent(serverValue, c373251);
                if (agreementWithContent == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(agreementWithContent);
            }
            applyMutation(new C373262((UiAgreementWithContent) agreementWithContent, null));
        } catch (Exception e) {
            applyMutation(new C373273(e, null));
        }
        return Unit.INSTANCE;
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$fetchAndSetAgreement$2", m3645f = "IdentiAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$fetchAndSetAgreement$2 */
    static final class C373262 extends ContinuationImpl7 implements Function2<IdentiAgreementDataState, Continuation<? super IdentiAgreementDataState>, Object> {
        final /* synthetic */ UiAgreementWithContent $agreement;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C373262(UiAgreementWithContent uiAgreementWithContent, Continuation<? super C373262> continuation) {
            super(2, continuation);
            this.$agreement = uiAgreementWithContent;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373262 c373262 = new C373262(this.$agreement, continuation);
            c373262.L$0 = obj;
            return c373262;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IdentiAgreementDataState identiAgreementDataState, Continuation<? super IdentiAgreementDataState> continuation) {
            return ((C373262) create(identiAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdentiAgreementDataState.copy$default((IdentiAgreementDataState) this.L$0, null, this.$agreement, null, false, 13, null);
        }
    }

    /* compiled from: IdentiAgreementDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/shared/agreements/agreementsscreen/IdentiAgreementDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$fetchAndSetAgreement$3", m3645f = "IdentiAgreementDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.shared.agreements.agreementsscreen.IdentiAgreementDuxo$fetchAndSetAgreement$3 */
    static final class C373273 extends ContinuationImpl7 implements Function2<IdentiAgreementDataState, Continuation<? super IdentiAgreementDataState>, Object> {

        /* renamed from: $e */
        final /* synthetic */ Exception f6197$e;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C373273(Exception exc, Continuation<? super C373273> continuation) {
            super(2, continuation);
            this.f6197$e = exc;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C373273 c373273 = new C373273(this.f6197$e, continuation);
            c373273.L$0 = obj;
            return c373273;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(IdentiAgreementDataState identiAgreementDataState, Continuation<? super IdentiAgreementDataState> continuation) {
            return ((C373273) create(identiAgreementDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return IdentiAgreementDataState.copy$default((IdentiAgreementDataState) this.L$0, null, null, this.f6197$e, false, 11, null);
        }
    }
}
