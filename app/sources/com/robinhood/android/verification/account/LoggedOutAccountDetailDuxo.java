package com.robinhood.android.verification.account;

import android.os.Parcelable;
import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.common.util.InternationalInfo;
import com.robinhood.android.eventcontracts.sharedeventui.PlaceholderUtils;
import com.robinhood.android.lib.pathfinder.utils.PhoneNumberFormatter;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.verification.account.LoggedOutAccountDetailEvent;
import com.robinhood.librobinhood.data.store.PathfinderStore;
import com.robinhood.models.api.pathfinder.UserViewInput;
import com.robinhood.models.p355ui.PhoneNumber;
import com.robinhood.models.p355ui.pathfinder.UserViewState;
import com.robinhood.models.p355ui.pathfinder.contexts.UserViewStatePageContext;
import com.robinhood.shared.crypto.contracts.CryptoAuthorizeWalletFragmentKey;
import com.robinhood.shared.support.contracts.pathfinder.LoggedOutAccountDetailFragmentKey;
import com.robinhood.utils.extensions.Throwables;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: LoggedOutAccountDetailDuxo.kt */
@Metadata(m3635d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0007\u0018\u0000 \"2\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00012\u00020\u0005:\u0001\"B1\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017J\u000e\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001aJ\u001e\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u001aJ\u0010\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000fX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006#"}, m3636d2 = {"Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDataState;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailViewState;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "pathfinderStore", "Lcom/robinhood/librobinhood/data/store/PathfinderStore;", "phoneNumberFormatter", "Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;", "stateProvider", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailStateProvider;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/PathfinderStore;Lcom/robinhood/android/lib/pathfinder/utils/PhoneNumberFormatter;Lcom/robinhood/android/verification/account/LoggedOutAccountDetailStateProvider;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "handleEmailChanged", "", "email", "", "handleNumberChanged", "phoneNumber", "Lcom/robinhood/models/ui/PhoneNumber;", "handleContinueClicked", "Lkotlinx/coroutines/Job;", CryptoAuthorizeWalletFragmentKey.QUERY_PARAM_DEVICE_ID, "handleInputError", "", "t", "", "Companion", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class LoggedOutAccountDetailDuxo extends BaseDuxo3<LoggedOutAccountDetailDataState, LoggedOutAccountDetailViewState, LoggedOutAccountDetailEvent> implements HasSavedState {
    private final PathfinderStore pathfinderStore;
    private final PhoneNumberFormatter phoneNumberFormatter;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoggedOutAccountDetailDuxo(PathfinderStore pathfinderStore, PhoneNumberFormatter phoneNumberFormatter, LoggedOutAccountDetailStateProvider stateProvider, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle) {
        super(new LoggedOutAccountDetailDataState(((LoggedOutAccountDetailFragmentKey) INSTANCE.getArgs(savedStateHandle)).getInquiryId(), null, null, false, 14, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(pathfinderStore, "pathfinderStore");
        Intrinsics.checkNotNullParameter(phoneNumberFormatter, "phoneNumberFormatter");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.pathfinderStore = pathfinderStore;
        this.phoneNumberFormatter = phoneNumberFormatter;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: LoggedOutAccountDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleEmailChanged$1", m3645f = "LoggedOutAccountDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleEmailChanged$1 */
    static final class C313801 extends ContinuationImpl7 implements Function2<LoggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState>, Object> {
        final /* synthetic */ String $email;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313801(String str, Continuation<? super C313801> continuation) {
            super(2, continuation);
            this.$email = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C313801 c313801 = new C313801(this.$email, continuation);
            c313801.L$0 = obj;
            return c313801;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LoggedOutAccountDetailDataState loggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState> continuation) {
            return ((C313801) create(loggedOutAccountDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LoggedOutAccountDetailDataState.copy$default((LoggedOutAccountDetailDataState) this.L$0, null, this.$email, null, false, 13, null);
        }
    }

    public final void handleEmailChanged(String email) {
        Intrinsics.checkNotNullParameter(email, "email");
        applyMutation(new C313801(email, null));
    }

    /* compiled from: LoggedOutAccountDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleNumberChanged$1", m3645f = "LoggedOutAccountDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleNumberChanged$1 */
    static final class C313811 extends ContinuationImpl7 implements Function2<LoggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState>, Object> {
        final /* synthetic */ PhoneNumber $phoneNumber;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313811(PhoneNumber phoneNumber, Continuation<? super C313811> continuation) {
            super(2, continuation);
            this.$phoneNumber = phoneNumber;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C313811 c313811 = new C313811(this.$phoneNumber, continuation);
            c313811.L$0 = obj;
            return c313811;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(LoggedOutAccountDetailDataState loggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState> continuation) {
            return ((C313811) create(loggedOutAccountDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return LoggedOutAccountDetailDataState.copy$default((LoggedOutAccountDetailDataState) this.L$0, null, null, this.$phoneNumber, false, 11, null);
        }
    }

    public final void handleNumberChanged(PhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        applyMutation(new C313811(phoneNumber, null));
    }

    /* compiled from: LoggedOutAccountDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleContinueClicked$1", m3645f = "LoggedOutAccountDetailDuxo.kt", m3646l = {64}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleContinueClicked$1 */
    static final class C313791 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $deviceId;
        final /* synthetic */ String $email;
        final /* synthetic */ PhoneNumber $phoneNumber;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C313791(PhoneNumber phoneNumber, String str, String str2, Continuation<? super C313791> continuation) {
            super(2, continuation);
            this.$phoneNumber = phoneNumber;
            this.$deviceId = str;
            this.$email = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return LoggedOutAccountDetailDuxo.this.new C313791(this.$phoneNumber, this.$deviceId, this.$email, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C313791) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C313791 c313791;
            UserViewState.Page<UserViewStatePageContext.LoggedOutAccountDetail> userViewState;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Parcelable args = LoggedOutAccountDetailDuxo.INSTANCE.getArgs((HasSavedState) LoggedOutAccountDetailDuxo.this);
                LoggedOutAccountDetailFragmentKey loggedOutAccountDetailFragmentKey = args instanceof LoggedOutAccountDetailFragmentKey ? (LoggedOutAccountDetailFragmentKey) args : null;
                Integer numBoxInt = (loggedOutAccountDetailFragmentKey == null || (userViewState = loggedOutAccountDetailFragmentKey.getUserViewState()) == null) ? null : boxing.boxInt(userViewState.getSequence());
                if (numBoxInt != null) {
                    int iIntValue = numBoxInt.intValue();
                    LoggedOutAccountDetailDuxo.this.applyMutation(new AnonymousClass1(null));
                    List<InternationalInfo> internationalInfos = InternationalInfo.INSTANCE.getInternationalInfos();
                    PhoneNumber phoneNumber = this.$phoneNumber;
                    for (InternationalInfo internationalInfo : internationalInfos) {
                        if (Intrinsics.areEqual(internationalInfo.getCountryCode().getIso3166CountryCode(), phoneNumber.getCountryCode().getCountry())) {
                            String displayNumberStrict = LoggedOutAccountDetailDuxo.this.phoneNumberFormatter.formatDisplayNumberStrict(this.$phoneNumber.getCountryCode(), "+" + internationalInfo.getCountryCallingCode() + PlaceholderUtils.XXShortPlaceholderText + this.$phoneNumber.getNumber());
                            PathfinderStore pathfinderStore = LoggedOutAccountDetailDuxo.this.pathfinderStore;
                            UUID inquiryId = ((LoggedOutAccountDetailFragmentKey) LoggedOutAccountDetailDuxo.INSTANCE.getArgs((HasSavedState) LoggedOutAccountDetailDuxo.this)).getInquiryId();
                            UserViewInput.LoggedOutAccountVerification loggedOutAccountVerification = new UserViewInput.LoggedOutAccountVerification(this.$deviceId, this.$email, displayNumberStrict);
                            AnonymousClass2 anonymousClass2 = new AnonymousClass2(LoggedOutAccountDetailDuxo.this);
                            this.label = 1;
                            c313791 = this;
                            if (pathfinderStore.handleUserInput(inquiryId, iIntValue, loggedOutAccountVerification, anonymousClass2, c313791) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                        }
                    }
                    throw new NoSuchElementException("Collection contains no element matching the predicate.");
                }
                throw new IllegalArgumentException("Required value was null.");
            }
            if (i != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            c313791 = this;
            LoggedOutAccountDetailDuxo.this.applyMutation(new AnonymousClass3(null));
            return Unit.INSTANCE;
        }

        /* compiled from: LoggedOutAccountDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleContinueClicked$1$1", m3645f = "LoggedOutAccountDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleContinueClicked$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<LoggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState>, Object> {
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
            public final Object invoke(LoggedOutAccountDetailDataState loggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState> continuation) {
                return ((AnonymousClass1) create(loggedOutAccountDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LoggedOutAccountDetailDataState.copy$default((LoggedOutAccountDetailDataState) this.L$0, null, null, null, true, 7, null);
            }
        }

        /* compiled from: LoggedOutAccountDetailDuxo.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleContinueClicked$1$2, reason: invalid class name */
        /* synthetic */ class AnonymousClass2 extends FunctionReferenceImpl implements Function1<Throwable, Boolean> {
            AnonymousClass2(Object obj) {
                super(1, obj, LoggedOutAccountDetailDuxo.class, "handleInputError", "handleInputError(Ljava/lang/Throwable;)Z", 0);
            }

            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Throwable p0) {
                Intrinsics.checkNotNullParameter(p0, "p0");
                return Boolean.valueOf(((LoggedOutAccountDetailDuxo) this.receiver).handleInputError(p0));
            }
        }

        /* compiled from: LoggedOutAccountDetailDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleContinueClicked$1$3", m3645f = "LoggedOutAccountDetailDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.verification.account.LoggedOutAccountDetailDuxo$handleContinueClicked$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<LoggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass3(Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(LoggedOutAccountDetailDataState loggedOutAccountDetailDataState, Continuation<? super LoggedOutAccountDetailDataState> continuation) {
                return ((AnonymousClass3) create(loggedOutAccountDetailDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return LoggedOutAccountDetailDataState.copy$default((LoggedOutAccountDetailDataState) this.L$0, null, null, null, false, 7, null);
            }
        }
    }

    public final Job handleContinueClicked(String deviceId, String email, PhoneNumber phoneNumber) {
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(email, "email");
        Intrinsics.checkNotNullParameter(phoneNumber, "phoneNumber");
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C313791(phoneNumber, deviceId, email, null), 3, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean handleInputError(Throwable t) {
        boolean zIsNetworkRelated = Throwables.isNetworkRelated(t);
        if (zIsNetworkRelated) {
            submit(new LoggedOutAccountDetailEvent.SendInputErrorEvent(t));
        }
        return zIsNetworkRelated;
    }

    /* compiled from: LoggedOutAccountDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/verification/account/LoggedOutAccountDetailDuxo;", "Lcom/robinhood/shared/support/contracts/pathfinder/LoggedOutAccountDetailFragmentKey;", "<init>", "()V", "feature-verification_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<LoggedOutAccountDetailDuxo, LoggedOutAccountDetailFragmentKey> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoggedOutAccountDetailFragmentKey getArgs(SavedStateHandle savedStateHandle) {
            return (LoggedOutAccountDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LoggedOutAccountDetailFragmentKey getArgs(LoggedOutAccountDetailDuxo loggedOutAccountDetailDuxo) {
            return (LoggedOutAccountDetailFragmentKey) DuxoCompanion.DefaultImpls.getArgs(this, loggedOutAccountDetailDuxo);
        }
    }
}
