package com.robinhood.android.investorprofile.p162ui.questionnaire.splash;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.investorprofile.experiments.InvestorProfileQuestionnaireImagesExperiment;
import com.robinhood.android.investorprofile.p162ui.questionnaire.splash.QuestionnaireSplashFragment;
import com.robinhood.android.udf.BaseDuxo4;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.experiments.Experiment;
import com.robinhood.experiments.ExperimentsProvider;
import com.robinhood.librobinhood.data.store.ExperimentsStore;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;

/* compiled from: QuestionnaireSplashDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00102\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u000e\u001a\u00020\u000fH\u0016R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashDuxo;", "Lcom/robinhood/android/udf/BaseIdentityDuxo;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "experimentsStore", "Lcom/robinhood/librobinhood/data/store/ExperimentsStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/ExperimentsStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "Companion", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class QuestionnaireSplashDuxo extends BaseDuxo4<QuestionnaireSplashViewState> implements HasSavedState {
    private final ExperimentsStore experimentsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public QuestionnaireSplashDuxo(ExperimentsStore experimentsStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        Intrinsics.checkNotNullParameter(experimentsStore, "experimentsStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        Companion companion = INSTANCE;
        super(new QuestionnaireSplashViewState(((QuestionnaireSplashFragment.Args) companion.getArgs(savedStateHandle)).isBlocking(), ((QuestionnaireSplashFragment.Args) companion.getArgs(savedStateHandle)).getLoggingInfo().getQuestionnaireContext(), ((QuestionnaireSplashFragment.Args) companion.getArgs(savedStateHandle)).getBrokerageAccountType(), null, 8, null), duxoBundle);
        this.experimentsStore = experimentsStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: QuestionnaireSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashDuxo$onCreate$1", m3645f = "QuestionnaireSplashDuxo.kt", m3646l = {33}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashDuxo$onCreate$1 */
    static final class C198321 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C198321(Continuation<? super C198321> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return QuestionnaireSplashDuxo.this.new C198321(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C198321) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Flow flowStreamStateFlow$default = ExperimentsProvider.DefaultImpls.streamStateFlow$default(QuestionnaireSplashDuxo.this.experimentsStore, new Experiment[]{InvestorProfileQuestionnaireImagesExperiment.INSTANCE}, false, null, 6, null);
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(QuestionnaireSplashDuxo.this, null);
                this.label = 1;
                if (FlowKt.collectLatest(flowStreamStateFlow$default, anonymousClass1, this) == coroutine_suspended) {
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

        /* compiled from: QuestionnaireSplashDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, m3636d2 = {"<anonymous>", "", "isInAssetRedesignExperiment", ""}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashDuxo$onCreate$1$1", m3645f = "QuestionnaireSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<Boolean, Continuation<? super Unit>, Object> {
            /* synthetic */ boolean Z$0;
            int label;
            final /* synthetic */ QuestionnaireSplashDuxo this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(QuestionnaireSplashDuxo questionnaireSplashDuxo, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.this$0 = questionnaireSplashDuxo;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$0, continuation);
                anonymousClass1.Z$0 = ((Boolean) obj).booleanValue();
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Object invoke(Boolean bool, Continuation<? super Unit> continuation) {
                return invoke(bool.booleanValue(), continuation);
            }

            public final Object invoke(boolean z, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(Boolean.valueOf(z), continuation)).invokeSuspend(Unit.INSTANCE);
            }

            /* compiled from: QuestionnaireSplashDuxo.kt */
            @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
            @DebugMetadata(m3644c = "com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashDuxo$onCreate$1$1$1", m3645f = "QuestionnaireSplashDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
            /* renamed from: com.robinhood.android.investorprofile.ui.questionnaire.splash.QuestionnaireSplashDuxo$onCreate$1$1$1, reason: invalid class name and collision with other inner class name */
            static final class C502361 extends ContinuationImpl7 implements Function2<QuestionnaireSplashViewState, Continuation<? super QuestionnaireSplashViewState>, Object> {
                final /* synthetic */ boolean $isInAssetRedesignExperiment;
                private /* synthetic */ Object L$0;
                int label;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C502361(boolean z, Continuation<? super C502361> continuation) {
                    super(2, continuation);
                    this.$isInAssetRedesignExperiment = z;
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                    C502361 c502361 = new C502361(this.$isInAssetRedesignExperiment, continuation);
                    c502361.L$0 = obj;
                    return c502361;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(QuestionnaireSplashViewState questionnaireSplashViewState, Continuation<? super QuestionnaireSplashViewState> continuation) {
                    return ((C502361) create(questionnaireSplashViewState, continuation)).invokeSuspend(Unit.INSTANCE);
                }

                @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
                public final Object invokeSuspend(Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    if (this.label != 0) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return QuestionnaireSplashViewState.copy$default((QuestionnaireSplashViewState) this.L$0, false, null, null, boxing.boxBoolean(this.$isInAssetRedesignExperiment), 7, null);
                }
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label == 0) {
                    ResultKt.throwOnFailure(obj);
                    this.this$0.applyMutation(new C502361(this.Z$0, null));
                    return Unit.INSTANCE;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.CREATED, new C198321(null));
    }

    /* compiled from: QuestionnaireSplashDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashDuxo;", "Lcom/robinhood/android/investorprofile/ui/questionnaire/splash/QuestionnaireSplashFragment$Args;", "<init>", "()V", "feature-investor-profile_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<QuestionnaireSplashDuxo, QuestionnaireSplashFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public QuestionnaireSplashFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (QuestionnaireSplashFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public QuestionnaireSplashFragment.Args getArgs(QuestionnaireSplashDuxo questionnaireSplashDuxo) {
            return (QuestionnaireSplashFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, questionnaireSplashDuxo);
        }
    }
}
