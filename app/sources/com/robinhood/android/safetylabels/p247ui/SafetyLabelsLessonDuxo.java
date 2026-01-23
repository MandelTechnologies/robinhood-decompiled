package com.robinhood.android.safetylabels.p247ui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.BaseDuxo;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.bonfire.SafetyLabelsStore;
import com.robinhood.shared.models.p387db.bonfire.education.safetylabels.SafetyLabelsLesson;
import com.robinhood.utils.logging.CrashReporter;
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

/* compiled from: SafetyLabelsLessonDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00142\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0014B)\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010\u0011\u001a\u00020\u0012H\u0016J\u0006\u0010\u0013\u001a\u00020\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\nX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDuxo;", "Lcom/robinhood/android/udf/BaseDuxo;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "safetyLabelsStore", "Lcom/robinhood/librobinhood/data/store/bonfire/SafetyLabelsStore;", "stateProvider", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonStateProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/SafetyLabelsStore;Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonStateProvider;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onStart", "", "toggleDisclosureState", "Companion", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes5.dex */
public final class SafetyLabelsLessonDuxo extends BaseDuxo<SafetyLabelsLessonDataState, SafetyLabelsLessonViewState> implements HasSavedState {
    private final SafetyLabelsStore safetyLabelsStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafetyLabelsLessonDuxo(SafetyLabelsStore safetyLabelsStore, SafetyLabelsLessonStateProvider stateProvider, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new SafetyLabelsLessonDataState(null, false, 3, null), stateProvider, duxoBundle);
        Intrinsics.checkNotNullParameter(safetyLabelsStore, "safetyLabelsStore");
        Intrinsics.checkNotNullParameter(stateProvider, "stateProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.safetyLabelsStore = safetyLabelsStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onStart() {
        super.onStart();
        LifecycleHost.DefaultImpls.bind$default(this, this.safetyLabelsStore.loadSafetyLabelsLesson(((LegacyFragmentKey.SafetyLabelsLesson) INSTANCE.getArgs((HasSavedState) this)).getLessonId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SafetyLabelsLessonDuxo.onStart$lambda$0(this.f$0, (SafetyLabelsLesson) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return SafetyLabelsLessonDuxo.onStart$lambda$1(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$0(SafetyLabelsLessonDuxo safetyLabelsLessonDuxo, SafetyLabelsLesson lesson) {
        Intrinsics.checkNotNullParameter(lesson, "lesson");
        safetyLabelsLessonDuxo.applyMutation(new SafetyLabelsLessonDuxo2(lesson, null));
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(SafetyLabelsLessonDuxo safetyLabelsLessonDuxo, Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, it, false, null, 6, null);
        safetyLabelsLessonDuxo.applyMutation(new SafetyLabelsLessonDuxo3(null));
        return Unit.INSTANCE;
    }

    /* compiled from: SafetyLabelsLessonDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDataState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.safetylabels.ui.SafetyLabelsLessonDuxo$toggleDisclosureState$1", m3645f = "SafetyLabelsLessonDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.safetylabels.ui.SafetyLabelsLessonDuxo$toggleDisclosureState$1 */
    static final class C278061 extends ContinuationImpl7 implements Function2<SafetyLabelsLessonDataState, Continuation<? super SafetyLabelsLessonDataState>, Object> {
        private /* synthetic */ Object L$0;
        int label;

        C278061(Continuation<? super C278061> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C278061 c278061 = new C278061(continuation);
            c278061.L$0 = obj;
            return c278061;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SafetyLabelsLessonDataState safetyLabelsLessonDataState, Continuation<? super SafetyLabelsLessonDataState> continuation) {
            return ((C278061) create(safetyLabelsLessonDataState, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return SafetyLabelsLessonDataState.copy$default((SafetyLabelsLessonDataState) this.L$0, null, !r4.getExpandDisclosure(), 1, null);
        }
    }

    public final void toggleDisclosureState() {
        applyMutation(new C278061(null));
    }

    /* compiled from: SafetyLabelsLessonDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/safetylabels/ui/SafetyLabelsLessonDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$SafetyLabelsLesson;", "<init>", "()V", "feature-safety-labels_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<SafetyLabelsLessonDuxo, LegacyFragmentKey.SafetyLabelsLesson> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SafetyLabelsLesson getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.SafetyLabelsLesson) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.SafetyLabelsLesson getArgs(SafetyLabelsLessonDuxo safetyLabelsLessonDuxo) {
            return (LegacyFragmentKey.SafetyLabelsLesson) DuxoCompanion.DefaultImpls.getArgs(this, safetyLabelsLessonDuxo);
        }
    }
}
