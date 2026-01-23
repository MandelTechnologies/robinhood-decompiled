package com.robinhood.android.matcha.p177ui.reporting.submit;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.matcha.p177ui.reporting.submit.ReportSubmitFragment;
import com.robinhood.android.models.matcha.api.ApiCreateAbuseReportRequest;
import com.robinhood.android.store.matcha.ModerationStore;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ReportSubmitDuxo.kt */
@Metadata(m3635d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0015B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitDataState;", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "moderationStore", "Lcom/robinhood/android/store/matcha/ModerationStore;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "stateProvider", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitStateProvider;", "<init>", "(Lcom/robinhood/android/store/matcha/ModerationStore;Lcom/robinhood/android/udf/DuxoBundle;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitStateProvider;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "submitReport", "", "description", "", "Companion", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class ReportSubmitDuxo extends BaseDuxo<ReportSubmitDataState, ReportSubmitViewState> implements HasSavedState {
    private final ModerationStore moderationStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReportSubmitDuxo(ModerationStore moderationStore, DuxoBundle duxoBundle, SavedStateHandle savedStateHandle, ReportSubmitStateProvider stateProvider) {
        super(new ReportSubmitDataState(false, null, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(moderationStore, "moderationStore");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.moderationStore = moderationStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: ReportSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.reporting.submit.ReportSubmitDuxo$submitReport$1", m3645f = "ReportSubmitDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.matcha.ui.reporting.submit.ReportSubmitDuxo$submitReport$1 */
    static final class C214331 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ String $description;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C214331(String str, Continuation<? super C214331> continuation) {
            super(2, continuation);
            this.$description = str;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ReportSubmitDuxo.this.new C214331(this.$description, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C214331) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ReportSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.reporting.submit.ReportSubmitDuxo$submitReport$1$1", m3645f = "ReportSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.matcha.ui.reporting.submit.ReportSubmitDuxo$submitReport$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ReportSubmitDataState, Continuation<? super ReportSubmitDataState>, Object> {
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
            public final Object invoke(ReportSubmitDataState reportSubmitDataState, Continuation<? super ReportSubmitDataState> continuation) {
                return ((AnonymousClass1) create(reportSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ReportSubmitDataState.copy$default((ReportSubmitDataState) this.L$0, true, null, 2, null);
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x0089  */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) throws Throwable {
            C214331 c214331;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ReportSubmitDuxo.this.applyMutation(new AnonymousClass1(null));
                try {
                    ModerationStore moderationStore = ReportSubmitDuxo.this.moderationStore;
                    Companion companion = ReportSubmitDuxo.INSTANCE;
                    String reporteeId = ((ReportSubmitFragment.Args) companion.getArgs((HasSavedState) ReportSubmitDuxo.this)).getReporteeId();
                    String objectId = ((ReportSubmitFragment.Args) companion.getArgs((HasSavedState) ReportSubmitDuxo.this)).getObjectId();
                    ApiCreateAbuseReportRequest.ObjectType objectType = ((ReportSubmitFragment.Args) companion.getArgs((HasSavedState) ReportSubmitDuxo.this)).getObjectType();
                    ApiCreateAbuseReportRequest.ReportCategory reportCategory = ((ReportSubmitFragment.Args) companion.getArgs((HasSavedState) ReportSubmitDuxo.this)).getReportCategory();
                    String str = this.$description;
                    this.label = 1;
                    c214331 = this;
                    try {
                        if (moderationStore.reportUser(reporteeId, objectId, objectType, reportCategory, str, c214331) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        th = null;
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        if (!Throwables.isNetworkRelated(th)) {
                            throw th;
                        }
                        ReportSubmitDuxo.this.applyMutation(new AnonymousClass2(th, null));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c214331 = this;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c214331 = this;
                    th = null;
                } catch (Throwable th4) {
                    th = th4;
                    c214331 = this;
                    if (!Throwables.isNetworkRelated(th)) {
                    }
                    ReportSubmitDuxo.this.applyMutation(new AnonymousClass2(th, null));
                    return Unit.INSTANCE;
                }
            }
            ReportSubmitDuxo.this.applyMutation(new AnonymousClass2(th, null));
            return Unit.INSTANCE;
        }

        /* compiled from: ReportSubmitDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.matcha.ui.reporting.submit.ReportSubmitDuxo$submitReport$1$2", m3645f = "ReportSubmitDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        @SourceDebugExtension
        /* renamed from: com.robinhood.android.matcha.ui.reporting.submit.ReportSubmitDuxo$submitReport$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ReportSubmitDataState, Continuation<? super ReportSubmitDataState>, Object> {
            final /* synthetic */ Throwable $error;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(Throwable th, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$error = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$error, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ReportSubmitDataState reportSubmitDataState, Continuation<? super ReportSubmitDataState> continuation) {
                return ((AnonymousClass2) create(reportSubmitDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object objCreateFailure;
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                ReportSubmitDataState reportSubmitDataState = (ReportSubmitDataState) this.L$0;
                Throwable th = this.$error;
                if (th != null) {
                    Result.Companion companion = Result.INSTANCE;
                    objCreateFailure = ResultKt.createFailure(th);
                } else {
                    Result.Companion companion2 = Result.INSTANCE;
                    objCreateFailure = Unit.INSTANCE;
                }
                return reportSubmitDataState.copy(false, new UiEvent<>(Result.m28549boximpl(Result.m28550constructorimpl(objCreateFailure))));
            }
        }
    }

    public final void submitReport(String description) {
        Intrinsics.checkNotNullParameter(description, "description");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C214331(description, null), 3, null);
    }

    /* compiled from: ReportSubmitDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitDuxo;", "Lcom/robinhood/android/matcha/ui/reporting/submit/ReportSubmitFragment$Args;", "<init>", "()V", "feature-p2p_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<ReportSubmitDuxo, ReportSubmitFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReportSubmitFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (ReportSubmitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public ReportSubmitFragment.Args getArgs(ReportSubmitDuxo reportSubmitDuxo) {
            return (ReportSubmitFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, reportSubmitDuxo);
        }
    }
}
