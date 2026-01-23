package com.robinhood.android.employment.p114ui;

import com.robinhood.android.employment.p114ui.ChooseEmploymentStatusDuxo3;
import com.robinhood.android.udf.BaseDuxo3;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.librobinhood.data.store.identi.EmploymentStore;
import com.robinhood.models.api.identi.ApiEmploymentInfo;
import com.robinhood.shared.app.type.AppType;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: ChooseEmploymentStatusDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\u000e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDuxo;", "Lcom/robinhood/android/udf/BaseEventDuxo;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDataState;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusViewState;", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusEvent;", "employmentStore", "Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;", "appType", "Lcom/robinhood/shared/app/type/AppType;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "stateProvider", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusStateProvider;", "<init>", "(Lcom/robinhood/librobinhood/data/store/identi/EmploymentStore;Lcom/robinhood/shared/app/type/AppType;Lcom/robinhood/android/udf/DuxoBundle;Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusStateProvider;)V", "submitEmploymentIfAvailable", "", "employmentStatus", "Lcom/robinhood/models/api/identi/ApiEmploymentInfo$EmploymentStatus;", "feature-employment_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class ChooseEmploymentStatusDuxo extends BaseDuxo3<ChooseEmploymentStatusDataState, ChooseEmploymentStatusViewState, ChooseEmploymentStatusDuxo3> {
    public static final int $stable = 8;
    private final EmploymentStore employmentStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ChooseEmploymentStatusDuxo(EmploymentStore employmentStore, AppType appType, DuxoBundle duxoBundle, ChooseEmploymentStatusDuxo4 stateProvider) {
        super(new ChooseEmploymentStatusDataState(appType, false, 2, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(employmentStore, "employmentStore");
        Intrinsics.checkNotNullParameter(appType, "appType");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        this.employmentStore = employmentStore;
    }

    public final void submitEmploymentIfAvailable(ApiEmploymentInfo.EmploymentStatus employmentStatus) {
        Intrinsics.checkNotNullParameter(employmentStatus, "employmentStatus");
        if (employmentStatus != ApiEmploymentInfo.EmploymentStatus.EMPLOYED && employmentStatus != ApiEmploymentInfo.EmploymentStatus.SELF_EMPLOYED) {
            BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C144911(employmentStatus, null), 3, null);
        } else {
            submit(new ChooseEmploymentStatusDuxo3.EmployerInfoRequired(employmentStatus));
        }
    }

    /* compiled from: ChooseEmploymentStatusDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1", m3645f = "ChooseEmploymentStatusDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1 */
    static final class C144911 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ ApiEmploymentInfo.EmploymentStatus $employmentStatus;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C144911(ApiEmploymentInfo.EmploymentStatus employmentStatus, Continuation<? super C144911> continuation) {
            super(2, continuation);
            this.$employmentStatus = employmentStatus;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return ChooseEmploymentStatusDuxo.this.new C144911(this.$employmentStatus, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C144911) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: ChooseEmploymentStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1$1", m3645f = "ChooseEmploymentStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<ChooseEmploymentStatusDataState, Continuation<? super ChooseEmploymentStatusDataState>, Object> {
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
            public final Object invoke(ChooseEmploymentStatusDataState chooseEmploymentStatusDataState, Continuation<? super ChooseEmploymentStatusDataState> continuation) {
                return ((AnonymousClass1) create(chooseEmploymentStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ChooseEmploymentStatusDataState.copy$default((ChooseEmploymentStatusDataState) this.L$0, null, true, 1, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            C144911 c144911;
            Throwable th;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                ChooseEmploymentStatusDuxo.this.applyMutation(new AnonymousClass1(null));
                try {
                    EmploymentStore employmentStore = ChooseEmploymentStatusDuxo.this.employmentStore;
                    ApiEmploymentInfo.EmploymentStatus employmentStatus = this.$employmentStatus;
                    this.label = 1;
                    c144911 = this;
                    try {
                        if (EmploymentStore.updateEmploymentInfoCo$default(employmentStore, employmentStatus, null, null, null, c144911, 8, null) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } catch (Throwable th2) {
                        th = th2;
                        th = th;
                        ChooseEmploymentStatusDuxo.this.submit(new ChooseEmploymentStatusDuxo3.Error(th));
                        ChooseEmploymentStatusDuxo.this.applyMutation(new AnonymousClass3(null));
                        return Unit.INSTANCE;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    c144911 = this;
                    th = th;
                    ChooseEmploymentStatusDuxo.this.submit(new ChooseEmploymentStatusDuxo3.Error(th));
                    ChooseEmploymentStatusDuxo.this.applyMutation(new AnonymousClass3(null));
                    return Unit.INSTANCE;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                try {
                    ResultKt.throwOnFailure(obj);
                    c144911 = this;
                } catch (Throwable th4) {
                    th = th4;
                    c144911 = this;
                    ChooseEmploymentStatusDuxo.this.submit(new ChooseEmploymentStatusDuxo3.Error(th));
                    ChooseEmploymentStatusDuxo.this.applyMutation(new AnonymousClass3(null));
                    return Unit.INSTANCE;
                }
            }
            ChooseEmploymentStatusDuxo.this.submit(new ChooseEmploymentStatusDuxo3.EmploymentSubmitted(c144911.$employmentStatus));
            ChooseEmploymentStatusDuxo.this.applyMutation(new AnonymousClass2(null));
            return Unit.INSTANCE;
        }

        /* compiled from: ChooseEmploymentStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1$2", m3645f = "ChooseEmploymentStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<ChooseEmploymentStatusDataState, Continuation<? super ChooseEmploymentStatusDataState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass2(Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(ChooseEmploymentStatusDataState chooseEmploymentStatusDataState, Continuation<? super ChooseEmploymentStatusDataState> continuation) {
                return ((AnonymousClass2) create(chooseEmploymentStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ChooseEmploymentStatusDataState.copy$default((ChooseEmploymentStatusDataState) this.L$0, null, false, 1, null);
            }
        }

        /* compiled from: ChooseEmploymentStatusDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/employment/ui/ChooseEmploymentStatusDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1$3", m3645f = "ChooseEmploymentStatusDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.employment.ui.ChooseEmploymentStatusDuxo$submitEmploymentIfAvailable$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<ChooseEmploymentStatusDataState, Continuation<? super ChooseEmploymentStatusDataState>, Object> {
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
            public final Object invoke(ChooseEmploymentStatusDataState chooseEmploymentStatusDataState, Continuation<? super ChooseEmploymentStatusDataState> continuation) {
                return ((AnonymousClass3) create(chooseEmploymentStatusDataState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ChooseEmploymentStatusDataState.copy$default((ChooseEmploymentStatusDataState) this.L$0, null, false, 1, null);
            }
        }
    }
}
