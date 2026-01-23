package com.robinhood.android.support.supporthub;

import com.plaid.internal.EnumC7081g;
import com.robinhood.android.support.supporthub.SupportHubEvent;
import com.robinhood.android.support.supporthub.SupportHubViewState;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.supporthub.SupportHubStore;
import com.robinhood.models.p355ui.supporthub.GetSupportAction;
import com.robinhood.models.p355ui.supporthub.PrioritySupportChannelAvailability;
import com.robinhood.models.p355ui.supporthub.RecommendedActions;
import com.robinhood.models.p355ui.supporthub.SupportHub;
import com.robinhood.utils.ReleaseVersion;
import com.robinhood.utils.extensions.Throwables;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.logging.EventMetadata;
import com.robinhood.utils.logging.SentryTeam;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples4;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.collections.immutable.extensions2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: SupportHubDuxo.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\rJ\u0006\u0010\u0012\u001a\u00020\rJ\b\u0010\u0013\u001a\u00020\rH\u0002J\u000e\u0010\u0014\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\rH\u0082@¢\u0006\u0002\u0010\u0015J\u0006\u0010\u0017\u001a\u00020\u0018R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0019"}, m3636d2 = {"Lcom/robinhood/android/support/supporthub/SupportHubDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;", "Lcom/robinhood/android/support/supporthub/SupportHubEvent;", "supportHubStore", "Lcom/robinhood/librobinhood/data/store/supporthub/SupportHubStore;", "releaseVersion", "Lcom/robinhood/utils/ReleaseVersion;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/supporthub/SupportHubStore;Lcom/robinhood/utils/ReleaseVersion;Lcom/robinhood/android/udf/DuxoBundle;)V", "onCreate", "", "handleAlertAction", "action", "Lcom/robinhood/models/ui/supporthub/GetSupportAction$Alert;", "closeBottomSheet", "closeDialog", "refresh", "streamSupportHub", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "streamRecommendedActions", "openPrioritySupport", "Lkotlinx/coroutines/Job;", "feature-support_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class SupportHubDuxo extends BaseDuxo5<SupportHubViewState, SupportHubEvent> {
    public static final int $stable = 8;
    private final ReleaseVersion releaseVersion;
    private final SupportHubStore supportHubStore;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SupportHubDuxo(SupportHubStore supportHubStore, ReleaseVersion releaseVersion, DuxoBundle duxoBundle) {
        super(new SupportHubViewState(null, null, null, null, 15, null), duxoBundle);
        Intrinsics.checkNotNullParameter(supportHubStore, "supportHubStore");
        Intrinsics.checkNotNullParameter(releaseVersion, "releaseVersion");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.supportHubStore = supportHubStore;
        this.releaseVersion = releaseVersion;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C290891(null));
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$onCreate$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$onCreate$1 */
    static final class C290891 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C290891(Continuation<? super C290891> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290891 c290891 = SupportHubDuxo.this.new C290891(continuation);
            c290891.L$0 = obj;
            return c290891;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C290891) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$onCreate$1$1", m3645f = "SupportHubDuxo.kt", m3646l = {38}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SupportHubDuxo supportHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = supportHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass1(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SupportHubDuxo supportHubDuxo = this.this$0;
                    this.label = 1;
                    if (supportHubDuxo.streamSupportHub(this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass1(SupportHubDuxo.this, null), 3, null);
                BuildersKt__Builders_commonKt.launch$default(coroutineScope, null, null, new AnonymousClass2(SupportHubDuxo.this, null), 3, null);
                SupportHubDuxo.this.refresh();
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$onCreate$1$2", m3645f = "SupportHubDuxo.kt", m3646l = {41}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$onCreate$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            int label;
            final /* synthetic */ SupportHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(SupportHubDuxo supportHubDuxo, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.this$0 = supportHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                return new AnonymousClass2(this.this$0, continuation);
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SupportHubDuxo supportHubDuxo = this.this$0;
                    this.label = 1;
                    if (supportHubDuxo.streamRecommendedActions(this) == coroutine_suspended) {
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
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$handleAlertAction$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$handleAlertAction$1 */
    static final class C290881 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
        final /* synthetic */ GetSupportAction.Alert $action;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C290881(GetSupportAction.Alert alert, Continuation<? super C290881> continuation) {
            super(2, continuation);
            this.$action = alert;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290881 c290881 = new C290881(this.$action, continuation);
            c290881.L$0 = obj;
            return c290881;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
            return ((C290881) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, new SupportHubViewState.BottomSheetData.Menu(this.$action.getTitle(), null, extensions2.toImmutableList(this.$action.getSubActions()), 2, null), null, 11, null);
        }
    }

    public final void handleAlertAction(GetSupportAction.Alert action) {
        Intrinsics.checkNotNullParameter(action, "action");
        applyMutation(new C290881(action, null));
        submit(SupportHubEvent.OpenBottomSheet.INSTANCE);
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$closeBottomSheet$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$closeBottomSheet$1 */
    static final class C290861 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C290861(Continuation<? super C290861> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290861 c290861 = new C290861(continuation);
            c290861.L$0 = obj;
            return c290861;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
            return ((C290861) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, SupportHubViewState.BottomSheetData.None.INSTANCE, null, 11, null);
        }
    }

    public final void closeBottomSheet() {
        applyMutation(new C290861(null));
        submit(SupportHubEvent.CloseBottomSheet.INSTANCE);
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$closeDialog$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$closeDialog$1 */
    static final class C290871 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C290871(Continuation<? super C290871> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290871 c290871 = new C290871(continuation);
            c290871.L$0 = obj;
            return c290871;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
            return ((C290871) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, null, SupportHubViewState.DialogData.None.INSTANCE, 7, null);
        }
    }

    public final void closeDialog() {
        applyMutation(new C290871(null));
        submit(SupportHubEvent.CloseDialog.INSTANCE);
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$refresh$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$refresh$1 */
    static final class C290911 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C290911(Continuation<? super C290911> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290911 c290911 = new C290911(continuation);
            c290911.L$0 = obj;
            return c290911;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
            return ((C290911) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, SupportHubViewState.InitialLoadingState.Updating.INSTANCE, null, null, null, 14, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void refresh() {
        try {
            if (!this.supportHubStore.hasSupportHubCache()) {
                applyMutation(new C290911(null));
            }
            this.supportHubStore.refresh();
        } catch (Throwable th) {
            if (th instanceof CancellationException) {
                throw th;
            }
            if (!Throwables.isNetworkRelated(th)) {
                CrashReporter.INSTANCE.reportNonFatal(th, true, new EventMetadata(SentryTeam.SUPPORT_X, MapsKt.mapOf(Tuples4.m3642to("feature", "support_hub")), null, 4, null));
            }
            if (this.supportHubStore.hasSupportHubCache()) {
                return;
            }
            applyMutation(new C290922(th, null));
            submit(SupportHubEvent.OpenDialog.INSTANCE);
        }
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$refresh$2", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$refresh$2 */
    static final class C290922 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {

        /* renamed from: $t */
        final /* synthetic */ Throwable f4976$t;
        private /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C290922(Throwable th, Continuation<? super C290922> continuation) {
            super(2, continuation);
            this.f4976$t = th;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290922 c290922 = new C290922(this.f4976$t, continuation);
            c290922.L$0 = obj;
            return c290922;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
            return ((C290922) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, null, new SupportHubViewState.DialogData.Error(this.f4976$t, null, 2, 0 == true ? 1 : 0), 7, null);
        }
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/supporthub/SupportHub;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$streamSupportHub$2", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$streamSupportHub$2 */
    static final class C290942 extends ContinuationImpl7 implements Function2<SupportHub, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C290942(Continuation<? super C290942> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290942 c290942 = SupportHubDuxo.this.new C290942(continuation);
            c290942.L$0 = obj;
            return c290942;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SupportHub supportHub, Continuation<? super Unit> continuation) {
            return ((C290942) create(supportHub, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            SupportHub supportHub = (SupportHub) this.L$0;
            if (supportHub.isConcierge() && !supportHub.getHasSeenConciergeOnboarding()) {
                SupportHubDuxo.this.submit(SupportHubEvent.ShowConciergeOnboarding.INSTANCE);
            }
            SupportHubDuxo supportHubDuxo = SupportHubDuxo.this;
            supportHubDuxo.applyMutation(new AnonymousClass1(supportHub, supportHubDuxo, null));
            return Unit.INSTANCE;
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$streamSupportHub$2$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$streamSupportHub$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
            final /* synthetic */ SupportHub $data;
            private /* synthetic */ Object L$0;
            int label;
            final /* synthetic */ SupportHubDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(SupportHub supportHub, SupportHubDuxo supportHubDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$data = supportHub;
                this.this$0 = supportHubDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, this.this$0, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
                return ((AnonymousClass1) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, new SupportHubViewState.InitialLoadingState.Loaded(this.$data.getTitle(), this.$data.getGetSupport(), this.$data.getPrioritySupport(), extensions2.toImmutableList(this.$data.getAlertBanners()), extensions2.toImmutableList(this.$data.getSections()), "Version " + this.this$0.releaseVersion.getVersionName(), this.$data.isConcierge(), this.$data.getHasSeenConciergeOnboarding(), this.$data.getAppointment(), this.$data.getAssignedAgent()), null, null, null, 14, null);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamSupportHub(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.supportHubStore.streamSupportHub(), new C290942(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", WebsocketGatewayConstants.DATA_KEY, "Lcom/robinhood/models/ui/supporthub/RecommendedActions;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$streamRecommendedActions$2", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$streamRecommendedActions$2 */
    static final class C290932 extends ContinuationImpl7 implements Function2<RecommendedActions, Continuation<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        int label;

        C290932(Continuation<? super C290932> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C290932 c290932 = SupportHubDuxo.this.new C290932(continuation);
            c290932.L$0 = obj;
            return c290932;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(RecommendedActions recommendedActions, Continuation<? super Unit> continuation) {
            return ((C290932) create(recommendedActions, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$streamRecommendedActions$2$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$streamRecommendedActions$2$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
            final /* synthetic */ RecommendedActions $data;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(RecommendedActions recommendedActions, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$data = recommendedActions;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$data, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
                return ((AnonymousClass1) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, this.$data, null, null, 13, null);
            }
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label == 0) {
                ResultKt.throwOnFailure(obj);
                SupportHubDuxo.this.applyMutation(new AnonymousClass1((RecommendedActions) this.L$0, null));
                return Unit.INSTANCE;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object streamRecommendedActions(Continuation<? super Unit> continuation) {
        Object objCollectLatest = FlowKt.collectLatest(this.supportHubStore.streamRecommendedActions(), new C290932(null), continuation);
        return objCollectLatest == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollectLatest : Unit.INSTANCE;
    }

    /* compiled from: SupportHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1", m3645f = "SupportHubDuxo.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_INCOME_PAYROLL_URL_VALUE}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1 */
    static final class C290901 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C290901(Continuation<? super C290901> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SupportHubDuxo.this.new C290901(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C290901) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    SupportHubDuxo.this.applyMutation(new AnonymousClass1(null));
                    SupportHubDuxo.this.submit(SupportHubEvent.OpenBottomSheet.INSTANCE);
                    SupportHubStore supportHubStore = SupportHubDuxo.this.supportHubStore;
                    this.label = 1;
                    obj = supportHubStore.getPrioritySupportChannelAvailability(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                SupportHubDuxo.this.applyMutation(new AnonymousClass2((PrioritySupportChannelAvailability) obj, null));
            } catch (Throwable th) {
                SupportHubDuxo.this.applyMutation(new AnonymousClass3(th, null));
                SupportHubDuxo.this.submit(SupportHubEvent.OpenDialog.INSTANCE);
                SupportHubDuxo.this.applyMutation(new AnonymousClass4(null));
                SupportHubDuxo.this.submit(SupportHubEvent.CloseBottomSheet.INSTANCE);
            }
            return Unit.INSTANCE;
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$1", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
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
            public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
                return ((AnonymousClass1) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, new SupportHubViewState.BottomSheetData.Loading("Get priority support", "Checking available channels…"), null, 11, null);
            }
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$2", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$2, reason: invalid class name */
        static final class AnonymousClass2 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
            final /* synthetic */ PrioritySupportChannelAvailability $availability;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(PrioritySupportChannelAvailability prioritySupportChannelAvailability, Continuation<? super AnonymousClass2> continuation) {
                super(2, continuation);
                this.$availability = prioritySupportChannelAvailability;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.$availability, continuation);
                anonymousClass2.L$0 = obj;
                return anonymousClass2;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
                return ((AnonymousClass2) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, new SupportHubViewState.BottomSheetData.Menu(this.$availability.getTitle(), this.$availability.getSubtitle(), extensions2.toImmutableList(this.$availability.getRows())), null, 11, null);
            }
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$3", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$3, reason: invalid class name */
        static final class AnonymousClass3 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {

            /* renamed from: $t */
            final /* synthetic */ Throwable f4975$t;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass3(Throwable th, Continuation<? super AnonymousClass3> continuation) {
                super(2, continuation);
                this.f4975$t = th;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass3 anonymousClass3 = new AnonymousClass3(this.f4975$t, continuation);
                anonymousClass3.L$0 = obj;
                return anonymousClass3;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
                return ((AnonymousClass3) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, null, new SupportHubViewState.DialogData.Error(this.f4975$t, SupportHubViewState.DialogData.Kind.CHANNEL_AVAILABILITY), 7, null);
            }
        }

        /* compiled from: SupportHubDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/support/supporthub/SupportHubViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$4", m3645f = "SupportHubDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.support.supporthub.SupportHubDuxo$openPrioritySupport$1$4, reason: invalid class name */
        static final class AnonymousClass4 extends ContinuationImpl7 implements Function2<SupportHubViewState, Continuation<? super SupportHubViewState>, Object> {
            private /* synthetic */ Object L$0;
            int label;

            AnonymousClass4(Continuation<? super AnonymousClass4> continuation) {
                super(2, continuation);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(continuation);
                anonymousClass4.L$0 = obj;
                return anonymousClass4;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SupportHubViewState supportHubViewState, Continuation<? super SupportHubViewState> continuation) {
                return ((AnonymousClass4) create(supportHubViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return SupportHubViewState.copy$default((SupportHubViewState) this.L$0, null, null, SupportHubViewState.BottomSheetData.None.INSTANCE, null, 11, null);
            }
        }
    }

    public final Job openPrioritySupport() {
        return BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new C290901(null), 3, null);
    }
}
