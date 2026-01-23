package com.robinhood.android.history.p153ui.check;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.history.p153ui.check.CheckPaymentDetailDuxo;
import com.robinhood.android.navigation.app.keys.LegacyFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.CheckPaymentStore;
import com.robinhood.models.p320db.mcduckling.p321ui.UiCheckPaymentDetails;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.extensions.Throwables;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CheckPaymentDetailDuxo.kt */
@Metadata(m3635d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0011B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\b\u0010\f\u001a\u00020\rH\u0016J\u000e\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0010R\u0014\u0010\u0004\u001a\u00020\u0005X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, m3636d2 = {"Lcom/robinhood/android/history/ui/check/CheckPaymentDetailDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/history/ui/check/CheckPaymentDetailViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "checkPaymentStore", "Lcom/robinhood/librobinhood/data/store/CheckPaymentStore;", "<init>", "(Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/librobinhood/data/store/CheckPaymentStore;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "cancelCheck", "id", "Ljava/util/UUID;", "Companion", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes10.dex */
public final class CheckPaymentDetailDuxo extends OldBaseDuxo<CheckPaymentDetailViewState> implements HasSavedState {
    private final CheckPaymentStore checkPaymentStore;
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
    public CheckPaymentDetailDuxo(SavedStateHandle savedStateHandle, CheckPaymentStore checkPaymentStore) {
        super(new CheckPaymentDetailViewState(false, null, null, 7, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(checkPaymentStore, "checkPaymentStore");
        this.savedStateHandle = savedStateHandle;
        this.checkPaymentStore = checkPaymentStore;
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onCreate() {
        super.onCreate();
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, this.checkPaymentStore.getCheckDetails(((LegacyFragmentKey.CheckPaymentDetail) INSTANCE.getArgs((HasSavedState) this)).getCheckId()), (LifecycleEvent) null, 1, (Object) null), new C184281(), new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckPaymentDetailDuxo.onCreate$lambda$1(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* compiled from: CheckPaymentDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$onCreate$1 */
    static final class C184281 implements Function1<?, Unit> {
        C184281() {
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
            invoke((UiCheckPaymentDetails) obj);
            return Unit.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CheckPaymentDetailViewState invoke$lambda$0(UiCheckPaymentDetails uiCheckPaymentDetails, CheckPaymentDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CheckPaymentDetailViewState.copy$default(applyMutation, false, uiCheckPaymentDetails, null, 5, null);
        }

        public final void invoke(final UiCheckPaymentDetails response) {
            Intrinsics.checkNotNullParameter(response, "response");
            CheckPaymentDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$onCreate$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CheckPaymentDetailDuxo.C184281.invoke$lambda$0(response, (CheckPaymentDetailViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(CheckPaymentDetailDuxo checkPaymentDetailDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            checkPaymentDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CheckPaymentDetailDuxo.onCreate$lambda$1$lambda$0(t, (CheckPaymentDetailViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckPaymentDetailViewState onCreate$lambda$1$lambda$0(Throwable th, CheckPaymentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CheckPaymentDetailViewState.copy$default(applyMutation, false, null, new UiEvent(th), 3, null);
    }

    public final void cancelCheck(UUID id) {
        Intrinsics.checkNotNullParameter(id, "id");
        Completable completableDoOnSubscribe = this.checkPaymentStore.cancelCheck(id).doOnSubscribe(new C184271());
        Intrinsics.checkNotNullExpressionValue(completableDoOnSubscribe, "doOnSubscribe(...)");
        Completable completableSubscribeOn = CompletableDelay2.minTimeInFlight$default(completableDoOnSubscribe, 1000L, null, 2, null).subscribeOn(Schedulers.m3346io());
        Intrinsics.checkNotNullExpressionValue(completableSubscribeOn, "subscribeOn(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableSubscribeOn, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return CheckPaymentDetailDuxo.cancelCheck$lambda$3(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckPaymentDetailDuxo.cancelCheck$lambda$5(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: CheckPaymentDetailDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$cancelCheck$1 */
    static final class C184271<T> implements Consumer {
        C184271() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final CheckPaymentDetailViewState accept$lambda$0(CheckPaymentDetailViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return CheckPaymentDetailViewState.copy$default(applyMutation, true, null, null, 6, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            CheckPaymentDetailDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$cancelCheck$1$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CheckPaymentDetailDuxo.C184271.accept$lambda$0((CheckPaymentDetailViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelCheck$lambda$3(CheckPaymentDetailDuxo checkPaymentDetailDuxo) {
        checkPaymentDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return CheckPaymentDetailDuxo.cancelCheck$lambda$3$lambda$2((CheckPaymentDetailViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckPaymentDetailViewState cancelCheck$lambda$3$lambda$2(CheckPaymentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CheckPaymentDetailViewState.copy$default(applyMutation, false, null, null, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit cancelCheck$lambda$5(CheckPaymentDetailDuxo checkPaymentDetailDuxo, final Throwable t) throws Throwable {
        Intrinsics.checkNotNullParameter(t, "t");
        if (Throwables.isNetworkRelated(t)) {
            checkPaymentDetailDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.history.ui.check.CheckPaymentDetailDuxo$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return CheckPaymentDetailDuxo.cancelCheck$lambda$5$lambda$4(t, (CheckPaymentDetailViewState) obj);
                }
            });
            return Unit.INSTANCE;
        }
        throw t;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CheckPaymentDetailViewState cancelCheck$lambda$5$lambda$4(Throwable th, CheckPaymentDetailViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return CheckPaymentDetailViewState.copy$default(applyMutation, false, null, new UiEvent(th), 2, null);
    }

    /* compiled from: CheckPaymentDetailDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/history/ui/check/CheckPaymentDetailDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/history/ui/check/CheckPaymentDetailDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyFragmentKey$CheckPaymentDetail;", "<init>", "()V", "feature-history_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<CheckPaymentDetailDuxo, LegacyFragmentKey.CheckPaymentDetail> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.CheckPaymentDetail getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyFragmentKey.CheckPaymentDetail) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyFragmentKey.CheckPaymentDetail getArgs(CheckPaymentDetailDuxo checkPaymentDetailDuxo) {
            return (LegacyFragmentKey.CheckPaymentDetail) DuxoCompanion.DefaultImpls.getArgs(this, checkPaymentDetailDuxo);
        }
    }
}
