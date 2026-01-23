package com.robinhood.android.cash.transaction.p079ui.category;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.cash.transaction.p079ui.category.MerchantChangeCategoryDuxo;
import com.robinhood.android.navigation.app.keys.LegacyDialogFragmentKey;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.android.util.notification.RhGcmListenerService;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.librobinhood.data.store.MerchantStore;
import com.robinhood.udf.UiEvent;
import io.reactivex.Completable;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Action;
import io.reactivex.functions.Consumer;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: MerchantChangeCategoryDuxo.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u00122\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u0012B\u0019\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u0010\u001a\u00020\r2\u0006\u0010\u0011\u001a\u00020\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0006\u001a\u00020\u0007X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "merchantStore", "Lcom/robinhood/librobinhood/data/store/MerchantStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/MerchantStore;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "selectCategory", "", RhGcmListenerService.EXTRA_CATEGORY, "Lcom/robinhood/android/cash/transaction/ui/category/MerchantCategory;", "saveCategory", "selectedCategory", "Companion", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes7.dex */
public final class MerchantChangeCategoryDuxo extends OldBaseDuxo<MerchantChangeCategoryViewState> implements HasSavedState {
    private final MerchantStore merchantStore;
    private final SavedStateHandle savedStateHandle;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public MerchantChangeCategoryDuxo(MerchantStore merchantStore, SavedStateHandle savedStateHandle) {
        Intrinsics.checkNotNullParameter(merchantStore, "merchantStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        MerchantCategory merchantCategory = (MerchantCategory) MerchantCategory.INSTANCE.fromServerValue(((LegacyDialogFragmentKey.MerchantChangeCategory) INSTANCE.getArgs(savedStateHandle)).getCurrentCategory());
        super(new MerchantChangeCategoryViewState(false, null, merchantCategory == null ? MerchantCategory.OTHER : merchantCategory, null, 11, null), null, 2, 0 == true ? 1 : 0);
        this.merchantStore = merchantStore;
        this.savedStateHandle = savedStateHandle;
    }

    public final void selectCategory(final MerchantCategory category) {
        Intrinsics.checkNotNullParameter(category, "category");
        applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantChangeCategoryDuxo.selectCategory$lambda$0(category, (MerchantChangeCategoryViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantChangeCategoryViewState selectCategory$lambda$0(MerchantCategory merchantCategory, MerchantChangeCategoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return MerchantChangeCategoryViewState.copy$default(applyMutation, false, null, merchantCategory, null, 11, null);
    }

    /* compiled from: MerchantChangeCategoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$saveCategory$1", m3645f = "MerchantChangeCategoryDuxo.kt", m3646l = {32}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$saveCategory$1 */
    static final class C104541 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ MerchantCategory $selectedCategory;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C104541(MerchantCategory merchantCategory, Continuation<? super C104541> continuation) {
            super(2, continuation);
            this.$selectedCategory = merchantCategory;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return MerchantChangeCategoryDuxo.this.new C104541(this.$selectedCategory, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C104541) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                MerchantStore merchantStore = MerchantChangeCategoryDuxo.this.merchantStore;
                UUID merchant = ((LegacyDialogFragmentKey.MerchantChangeCategory) MerchantChangeCategoryDuxo.INSTANCE.getArgs((HasSavedState) MerchantChangeCategoryDuxo.this)).getMerchant();
                String serverValue = this.$selectedCategory.getServerValue();
                this.label = 1;
                if (merchantStore.setMerchantUserCategory(merchant, serverValue, this) == coroutine_suspended) {
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

    public final void saveCategory(MerchantCategory selectedCategory) {
        Intrinsics.checkNotNullParameter(selectedCategory, "selectedCategory");
        Completable completableDoOnTerminate = RxFactory.DefaultImpls.rxCompletable$default(this, null, new C104541(selectedCategory, null), 1, null).doOnSubscribe(new C104552()).doOnTerminate(new C104563());
        Intrinsics.checkNotNullExpressionValue(completableDoOnTerminate, "doOnTerminate(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoOnTerminate, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MerchantChangeCategoryDuxo.saveCategory$lambda$2(this.f$0);
            }
        }, new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantChangeCategoryDuxo.saveCategory$lambda$4(this.f$0, (Throwable) obj);
            }
        });
    }

    /* compiled from: MerchantChangeCategoryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$saveCategory$2 */
    static final class C104552<T> implements Consumer {
        C104552() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MerchantChangeCategoryViewState accept$lambda$0(MerchantChangeCategoryViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return MerchantChangeCategoryViewState.copy$default(applyMutation, true, null, null, null, 14, null);
        }

        @Override // io.reactivex.functions.Consumer
        public final void accept(Disposable disposable) {
            MerchantChangeCategoryDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$saveCategory$2$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantChangeCategoryDuxo.C104552.accept$lambda$0((MerchantChangeCategoryViewState) obj);
                }
            });
        }
    }

    /* compiled from: MerchantChangeCategoryDuxo.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$saveCategory$3 */
    static final class C104563 implements Action {
        C104563() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final MerchantChangeCategoryViewState run$lambda$0(MerchantChangeCategoryViewState applyMutation) {
            Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
            return MerchantChangeCategoryViewState.copy$default(applyMutation, false, null, null, null, 14, null);
        }

        @Override // io.reactivex.functions.Action
        public final void run() {
            MerchantChangeCategoryDuxo.this.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$saveCategory$3$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return MerchantChangeCategoryDuxo.C104563.run$lambda$0((MerchantChangeCategoryViewState) obj);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveCategory$lambda$2(MerchantChangeCategoryDuxo merchantChangeCategoryDuxo) {
        merchantChangeCategoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantChangeCategoryDuxo.saveCategory$lambda$2$lambda$1((MerchantChangeCategoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantChangeCategoryViewState saveCategory$lambda$2$lambda$1(MerchantChangeCategoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return MerchantChangeCategoryViewState.copy$default(applyMutation, false, null, null, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(Unit.INSTANCE))), 7, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit saveCategory$lambda$4(MerchantChangeCategoryDuxo merchantChangeCategoryDuxo, final Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        merchantChangeCategoryDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.cash.transaction.ui.category.MerchantChangeCategoryDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return MerchantChangeCategoryDuxo.saveCategory$lambda$4$lambda$3(it, (MerchantChangeCategoryViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MerchantChangeCategoryViewState saveCategory$lambda$4$lambda$3(Throwable th, MerchantChangeCategoryViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        Result.Companion companion = Result.INSTANCE;
        return MerchantChangeCategoryViewState.copy$default(applyMutation, false, null, null, new UiEvent(Result.m28549boximpl(Result.m28550constructorimpl(ResultKt.createFailure(th)))), 7, null);
    }

    /* compiled from: MerchantChangeCategoryDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/cash/transaction/ui/category/MerchantChangeCategoryDuxo;", "Lcom/robinhood/android/navigation/app/keys/LegacyDialogFragmentKey$MerchantChangeCategory;", "<init>", "()V", "feature-cash-transaction_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<MerchantChangeCategoryDuxo, LegacyDialogFragmentKey.MerchantChangeCategory> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.MerchantChangeCategory getArgs(SavedStateHandle savedStateHandle) {
            return (LegacyDialogFragmentKey.MerchantChangeCategory) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public LegacyDialogFragmentKey.MerchantChangeCategory getArgs(MerchantChangeCategoryDuxo merchantChangeCategoryDuxo) {
            return (LegacyDialogFragmentKey.MerchantChangeCategory) DuxoCompanion.DefaultImpls.getArgs(this, merchantChangeCategoryDuxo);
        }
    }
}
