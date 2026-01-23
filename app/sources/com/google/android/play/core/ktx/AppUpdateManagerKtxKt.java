package com.google.android.play.core.ktx;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.appupdate.AppUpdateInfo;
import com.google.android.play.core.appupdate.AppUpdateManager;
import com.google.android.play.core.install.InstallException;
import com.google.android.play.core.install.InstallState;
import com.google.android.play.core.install.InstallStateUpdatedListener;
import com.google.android.play.core.ktx.AppUpdateResult;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CancellableContinuationImpl;
import kotlinx.coroutines.channels.Channel5;
import kotlinx.coroutines.channels.Channel9;
import kotlinx.coroutines.channels.Produce;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u0017\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0086@ø\u0001\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a7\u0010\t\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00042\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00028\u00000\u00052\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00010\u0007H\u0080@ø\u0001\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u0017\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b*\u00020\u0000¢\u0006\u0004\b\r\u0010\u000e\u001a'\u0010\u0013\u001a\u00020\u0012\"\u0004\b\u0000\u0010\u000f*\b\u0012\u0004\u0012\u00028\u00000\u00102\u0006\u0010\u0011\u001a\u00028\u0000H\u0000¢\u0006\u0004\b\u0013\u0010\u0014\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0015"}, m3636d2 = {"Lcom/google/android/play/core/appupdate/AppUpdateManager;", "", "requestCompleteUpdate", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "T", "Lcom/google/android/gms/tasks/Task;", "task", "Lkotlin/Function0;", "onCanceled", "runTask", "(Lcom/google/android/gms/tasks/Task;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lkotlinx/coroutines/flow/Flow;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "requestUpdateFlow", "(Lcom/google/android/play/core/appupdate/AppUpdateManager;)Lkotlinx/coroutines/flow/Flow;", "E", "Lkotlinx/coroutines/channels/SendChannel;", "element", "", "tryOffer", "(Lkotlinx/coroutines/channels/SendChannel;Ljava/lang/Object;)Z", "java.com.google.android.apps.play.store.sdk.playcore.ktx_playcore_app_update_ktx"}, m3637k = 2, m3638mv = {1, 8, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class AppUpdateManagerKtxKt {

    /* compiled from: com.google.android.play:app-update-ktx@@2.1.0 */
    @Metadata(m3635d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@"}, m3636d2 = {"Lkotlinx/coroutines/channels/ProducerScope;", "Lcom/google/android/play/core/ktx/AppUpdateResult;", "", "<anonymous>"}, m3637k = 3, m3638mv = {1, 8, 0})
    @DebugMetadata(m3644c = "com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1", m3645f = "AppUpdateManagerKtx.kt", m3646l = {90}, m3647m = "invokeSuspend")
    /* renamed from: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1 */
    static final class C51641 extends ContinuationImpl7 implements Function2<Produce4<? super AppUpdateResult>, Continuation<? super Unit>, Object> {
        final /* synthetic */ AppUpdateManager $this_requestUpdateFlow;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C51641(AppUpdateManager appUpdateManager, Continuation<? super C51641> continuation) {
            super(2, continuation);
            this.$this_requestUpdateFlow = appUpdateManager;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C51641 c51641 = new C51641(this.$this_requestUpdateFlow, continuation);
            c51641.L$0 = obj;
            return c51641;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Produce4<? super AppUpdateResult> produce4, Continuation<? super Unit> continuation) {
            return ((C51641) create(produce4, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                final Produce4 produce4 = (Produce4) this.L$0;
                final AppUpdateManager appUpdateManager = this.$this_requestUpdateFlow;
                final AppUpdatePassthroughListener appUpdatePassthroughListener = new AppUpdatePassthroughListener(new InstallStateUpdatedListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$1
                    @Override // com.google.android.play.core.listener.StateUpdatedListener
                    public final void onStateUpdate(InstallState installState) {
                        Intrinsics.checkNotNullParameter(installState, "installState");
                        if (installState.installStatus() == 11) {
                            AppUpdateManagerKtxKt.tryOffer(produce4, new AppUpdateResult.Downloaded(appUpdateManager));
                        } else {
                            AppUpdateManagerKtxKt.tryOffer(produce4, new AppUpdateResult.InProgress(installState));
                        }
                    }
                }, new Function1<AppUpdatePassthroughListener, Unit>() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$requestUpdateFlow$1$globalUpdateListener$2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    /* JADX WARN: Multi-variable type inference failed */
                    {
                        super(1);
                    }

                    @Override // kotlin.jvm.functions.Function1
                    public final /* bridge */ /* synthetic */ Unit invoke(AppUpdatePassthroughListener appUpdatePassthroughListener2) {
                        invoke2(appUpdatePassthroughListener2);
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2(AppUpdatePassthroughListener $receiver) {
                        Intrinsics.checkNotNullParameter($receiver, "$this$$receiver");
                        Channel9.DefaultImpls.close$default(produce4, null, 1, null);
                    }
                });
                Task<AppUpdateInfo> appUpdateInfo = this.$this_requestUpdateFlow.getAppUpdateInfo();
                final AppUpdateManager appUpdateManager2 = this.$this_requestUpdateFlow;
                appUpdateInfo.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestUpdateFlow.1.1
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(AppUpdateInfo updateInfo) {
                        int iUpdateAvailability = updateInfo.updateAvailability();
                        if (iUpdateAvailability == 0) {
                            produce4.close(new InstallException(-2));
                            return;
                        }
                        if (iUpdateAvailability == 1) {
                            AppUpdateManagerKtxKt.tryOffer(produce4, AppUpdateResult.NotAvailable.INSTANCE);
                            Channel9.DefaultImpls.close$default(produce4, null, 1, null);
                        } else if (iUpdateAvailability == 2 || iUpdateAvailability == 3) {
                            Intrinsics.checkNotNullExpressionValue(updateInfo, "updateInfo");
                            if (updateInfo.installStatus() == 11) {
                                AppUpdateManagerKtxKt.tryOffer(produce4, new AppUpdateResult.Downloaded(appUpdateManager2));
                                Channel9.DefaultImpls.close$default(produce4, null, 1, null);
                            } else {
                                appUpdateManager2.registerListener(appUpdatePassthroughListener);
                                AppUpdateManagerKtxKt.tryOffer(produce4, new AppUpdateResult.Available(appUpdateManager2, updateInfo));
                            }
                        }
                    }
                }).addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestUpdateFlow.1.2
                    @Override // com.google.android.gms.tasks.OnFailureListener
                    public final void onFailure(Exception exception) {
                        Intrinsics.checkNotNullParameter(exception, "exception");
                        produce4.close(exception);
                    }
                });
                final AppUpdateManager appUpdateManager3 = this.$this_requestUpdateFlow;
                Function0<Unit> function0 = new Function0<Unit>() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.requestUpdateFlow.1.3
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super(0);
                    }

                    @Override // kotlin.jvm.functions.Function0
                    public final /* bridge */ /* synthetic */ Unit invoke() {
                        invoke2();
                        return Unit.INSTANCE;
                    }

                    /* renamed from: invoke, reason: avoid collision after fix types in other method */
                    public final void invoke2() {
                        appUpdateManager3.unregisterListener(appUpdatePassthroughListener);
                    }
                };
                this.label = 1;
                if (Produce.awaitClose(produce4, function0, this) == coroutine_suspended) {
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

    public static final Object requestCompleteUpdate(AppUpdateManager appUpdateManager, Continuation<? super Unit> continuation) {
        Task<Void> taskCompleteUpdate = appUpdateManager.completeUpdate();
        Intrinsics.checkNotNullExpressionValue(taskCompleteUpdate, "completeUpdate()");
        Object objRunTask$default = runTask$default(taskCompleteUpdate, null, continuation, 2, null);
        return objRunTask$default == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objRunTask$default : Unit.INSTANCE;
    }

    public static final <T> Object runTask(Task<T> task, final Function0<Unit> function0, Continuation<? super T> continuation) {
        final CancellableContinuationImpl cancellableContinuationImpl = new CancellableContinuationImpl(IntrinsicsKt.intercepted(continuation), 1);
        cancellableContinuationImpl.initCancellability();
        cancellableContinuationImpl.invokeOnCancellation(new Function1<Throwable, Unit>() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable th) {
                function0.invoke();
            }
        });
        if (task.isComplete()) {
            if (task.isSuccessful()) {
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(task.getResult()));
            } else {
                Exception exception = task.getException();
                Intrinsics.checkNotNull(exception);
                cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(exception)));
            }
        } else {
            task.addOnSuccessListener(new OnSuccessListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$2
                @Override // com.google.android.gms.tasks.OnSuccessListener
                public final void onSuccess(T t) {
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(t));
                }
            });
            task.addOnFailureListener(new OnFailureListener() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt$runTask$3$3
                @Override // com.google.android.gms.tasks.OnFailureListener
                public final void onFailure(Exception exception2) {
                    Intrinsics.checkNotNullParameter(exception2, "exception");
                    cancellableContinuationImpl.resumeWith(Result.m28550constructorimpl(ResultKt.createFailure(exception2)));
                }
            });
        }
        Object result = cancellableContinuationImpl.getResult();
        if (result == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbes.probeCoroutineSuspended(continuation);
        }
        return result;
    }

    public static /* synthetic */ Object runTask$default(Task task, Function0 function0, Continuation continuation, int i, Object obj) {
        if ((i & 2) != 0) {
            function0 = new Function0<Unit>() { // from class: com.google.android.play.core.ktx.AppUpdateManagerKtxKt.runTask.2
                @Override // kotlin.jvm.functions.Function0
                public final /* bridge */ /* synthetic */ Unit invoke() {
                    invoke2();
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2() {
                }
            };
        }
        return runTask(task, function0, continuation);
    }

    public static final Flow<AppUpdateResult> requestUpdateFlow(AppUpdateManager appUpdateManager) throws InstallException {
        Intrinsics.checkNotNullParameter(appUpdateManager, "<this>");
        return FlowKt.conflate(FlowKt.callbackFlow(new C51641(appUpdateManager, null)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> boolean tryOffer(Channel9<? super E> channel9, E e) {
        Intrinsics.checkNotNullParameter(channel9, "<this>");
        return Channel5.m28810isSuccessimpl(channel9.mo8337trySendJP2dKIU(e));
    }
}
