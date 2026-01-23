package com.robinhood.android.directipo.allocation.clarity.p103ui.learninghub;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.directipo.models.p292db.IpoAccessLearningHub;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.IpoAccessLearningHubStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional2;
import com.robinhood.utils.extensions.Completables;
import com.robinhood.utils.extensions.SinglesKt;
import io.reactivex.Maybe;
import io.reactivex.Single;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoLearningHubDuxo.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00152\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0015B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0002J\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "ipoAccessLearningHubStore", "Lcom/robinhood/librobinhood/data/store/IpoAccessLearningHubStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/IpoAccessLearningHubStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onResume", "", "fetchIpoLearningHub", "updateDayNightOverlay", "overlay", "Lcom/robinhood/android/designsystem/style/DayNightOverlay;", "setSelectedTabKey", "selectedTabKey", "", "Companion", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes27.dex */
public final class DirectIpoLearningHubDuxo extends OldBaseDuxo<DirectIpoLearningHubViewState> implements HasSavedState {
    private final IpoAccessLearningHubStore ipoAccessLearningHubStore;
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
    public DirectIpoLearningHubDuxo(IpoAccessLearningHubStore ipoAccessLearningHubStore, SavedStateHandle savedStateHandle) {
        super(new DirectIpoLearningHubViewState(null, null, false, null, ((LegacyFragmentKey.IpoLearningHub) INSTANCE.getArgs(savedStateHandle)).getStartingTabKey(), 15, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(ipoAccessLearningHubStore, "ipoAccessLearningHubStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.ipoAccessLearningHubStore = ipoAccessLearningHubStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        fetchIpoLearningHub();
    }

    private final void fetchIpoLearningHub() {
        applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$0((DirectIpoLearningHubViewState) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, this.ipoAccessLearningHubStore.streamIpoAccessLearningHub(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$2(this.f$0, (Optional) obj);
            }
        });
        LifecycleHost.DefaultImpls.bind$default(this, Completables.checkFallbackOrError(this.ipoAccessLearningHubStore.refreshIpoAccessLearningHub(true), new Function0() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$3(this.f$0);
            }
        }), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$5(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$7(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoLearningHubViewState fetchIpoLearningHub$lambda$0(DirectIpoLearningHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoLearningHubViewState.copy$default(applyMutation, null, null, true, null, null, 19, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchIpoLearningHub$lambda$2(DirectIpoLearningHubDuxo directIpoLearningHubDuxo, Optional optional) {
        Intrinsics.checkNotNullParameter(optional, "<destruct>");
        final IpoAccessLearningHub ipoAccessLearningHub = (IpoAccessLearningHub) optional.component1();
        directIpoLearningHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$2$lambda$1(ipoAccessLearningHub, (DirectIpoLearningHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoLearningHubViewState fetchIpoLearningHub$lambda$2$lambda$1(IpoAccessLearningHub ipoAccessLearningHub, DirectIpoLearningHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoLearningHubViewState.copy$default(applyMutation, ipoAccessLearningHub, null, false, null, null, 26, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Maybe fetchIpoLearningHub$lambda$3(DirectIpoLearningHubDuxo directIpoLearningHubDuxo) {
        Single<Optional<IpoAccessLearningHub>> singleFirst = directIpoLearningHubDuxo.ipoAccessLearningHubStore.streamIpoAccessLearningHub().first(Optional2.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(singleFirst, "first(...)");
        return SinglesKt.unwrapOptional(singleFirst);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchIpoLearningHub$lambda$5(DirectIpoLearningHubDuxo directIpoLearningHubDuxo) {
        directIpoLearningHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda9
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$5$lambda$4((DirectIpoLearningHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoLearningHubViewState fetchIpoLearningHub$lambda$5$lambda$4(DirectIpoLearningHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoLearningHubViewState.copy$default(applyMutation, null, null, false, null, null, 27, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit fetchIpoLearningHub$lambda$7(DirectIpoLearningHubDuxo directIpoLearningHubDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        directIpoLearningHubDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.fetchIpoLearningHub$lambda$7$lambda$6(throwable, (DirectIpoLearningHubViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoLearningHubViewState fetchIpoLearningHub$lambda$7$lambda$6(Throwable th, DirectIpoLearningHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoLearningHubViewState.copy$default(applyMutation, null, null, false, new UiEvent(th), null, 19, null);
    }

    public final void updateDayNightOverlay(final DayNightOverlay overlay) {
        Intrinsics.checkNotNullParameter(overlay, "overlay");
        applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.updateDayNightOverlay$lambda$8(overlay, (DirectIpoLearningHubViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoLearningHubViewState updateDayNightOverlay$lambda$8(DayNightOverlay dayNightOverlay, DirectIpoLearningHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoLearningHubViewState.copy$default(applyMutation, null, dayNightOverlay, false, null, null, 29, null);
    }

    public final void setSelectedTabKey(final String selectedTabKey) {
        Intrinsics.checkNotNullParameter(selectedTabKey, "selectedTabKey");
        applyMutation(new Function1() { // from class: com.robinhood.android.directipo.allocation.clarity.ui.learninghub.DirectIpoLearningHubDuxo$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoLearningHubDuxo.setSelectedTabKey$lambda$9(selectedTabKey, (DirectIpoLearningHubViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoLearningHubViewState setSelectedTabKey$lambda$9(String str, DirectIpoLearningHubViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoLearningHubViewState.copy$default(applyMutation, null, null, false, null, str, 15, null);
    }

    /* compiled from: DirectIpoLearningHubDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/directipo/allocation/clarity/ui/learninghub/DirectIpoLearningHubDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$IpoLearningHub;", "<init>", "()V", "feature-direct-ipo-allocation-clarity_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DirectIpoLearningHubDuxo, LegacyFragmentKey.IpoLearningHub> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.IpoLearningHub getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.IpoLearningHub) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.IpoLearningHub getArgs(DirectIpoLearningHubDuxo directIpoLearningHubDuxo) {
            return (LegacyFragmentKey.IpoLearningHub) DuxoCompanion.DefaultImpls.getArgs(this, directIpoLearningHubDuxo);
        }
    }
}
