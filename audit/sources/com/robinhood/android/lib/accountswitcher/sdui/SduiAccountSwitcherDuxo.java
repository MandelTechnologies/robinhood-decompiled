package com.robinhood.android.lib.accountswitcher.sdui;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.HasArgs;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.librobinhood.data.store.SduiAccountSwitcherStore;
import contracts.account_switcher.proto.p427v1.GetAccountSwitcherResponseDto;
import contracts.account_switcher.proto.p427v1.SurfaceDto;
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

/* compiled from: SduiAccountSwitcherDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\b\u0012\u0004\u0012\u00020\u00050\u0004B)\b\u0007\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\b\u0010\u0012\u001a\u00020\u0013H\u0016J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0016H\u0000¢\u0006\u0002\b\u0017R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0018"}, m3636d2 = {"Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherViewState;", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherEvent;", "Lcom/robinhood/android/udf/HasArgs;", "Lcontracts/account_switcher/proto/v1/SurfaceDto;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "sduiAccountSwitcherStore", "Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/android/lib/account/AccountProvider;Lcom/robinhood/librobinhood/data/store/SduiAccountSwitcherStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "", "onAccountSelected", "accountNumber", "", "onAccountSelected$lib_account_switcher_externalDebug", "lib-account-switcher_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes8.dex */
public final class SduiAccountSwitcherDuxo extends BaseDuxo5<SduiAccountSwitcherViewState, SduiAccountSwitcherEvent> implements HasArgs<SurfaceDto> {
    public static final int $stable = 8;
    private final AccountProvider accountProvider;
    private final SavedStateHandle savedStateHandle;
    private final SduiAccountSwitcherStore sduiAccountSwitcherStore;

    @Override // com.robinhood.android.udf.HasArgs
    public SurfaceDto getArgs(SavedStateHandle savedStateHandle) {
        return (SurfaceDto) HasArgs.DefaultImpls.getArgs(this, savedStateHandle);
    }

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SduiAccountSwitcherDuxo(AccountProvider accountProvider, SduiAccountSwitcherStore sduiAccountSwitcherStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(new SduiAccountSwitcherViewState(null, 1, 0 == true ? 1 : 0), duxoBundle);
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(sduiAccountSwitcherStore, "sduiAccountSwitcherStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.accountProvider = accountProvider;
        this.sduiAccountSwitcherStore = sduiAccountSwitcherStore;
        this.savedStateHandle = savedStateHandle;
    }

    /* compiled from: SduiAccountSwitcherDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherDuxo$onCreate$1", m3645f = "SduiAccountSwitcherDuxo.kt", m3646l = {34}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherDuxo$onCreate$1 */
    static final class C201991 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        int label;

        C201991(Continuation<? super C201991> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return SduiAccountSwitcherDuxo.this.new C201991(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C201991) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                SduiAccountSwitcherStore sduiAccountSwitcherStore = SduiAccountSwitcherDuxo.this.sduiAccountSwitcherStore;
                SduiAccountSwitcherDuxo sduiAccountSwitcherDuxo = SduiAccountSwitcherDuxo.this;
                SurfaceDto surfaceDto = (SurfaceDto) sduiAccountSwitcherDuxo.getArgs(sduiAccountSwitcherDuxo.getSavedStateHandle());
                this.label = 1;
                obj = sduiAccountSwitcherStore.getAccountSwitcher(surfaceDto, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            SduiAccountSwitcherDuxo.this.applyMutation(new AnonymousClass1((GetAccountSwitcherResponseDto) obj, null));
            return Unit.INSTANCE;
        }

        /* compiled from: SduiAccountSwitcherDuxo.kt */
        @Metadata(m3635d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0001H\n"}, m3636d2 = {"<anonymous>", "Lcom/robinhood/android/lib/accountswitcher/sdui/SduiAccountSwitcherViewState;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherDuxo$onCreate$1$1", m3645f = "SduiAccountSwitcherDuxo.kt", m3646l = {}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.lib.accountswitcher.sdui.SduiAccountSwitcherDuxo$onCreate$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<SduiAccountSwitcherViewState, Continuation<? super SduiAccountSwitcherViewState>, Object> {
            final /* synthetic */ GetAccountSwitcherResponseDto $accountSwitcher;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass1(GetAccountSwitcherResponseDto getAccountSwitcherResponseDto, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$accountSwitcher = getAccountSwitcherResponseDto;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$accountSwitcher, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(SduiAccountSwitcherViewState sduiAccountSwitcherViewState, Continuation<? super SduiAccountSwitcherViewState> continuation) {
                return ((AnonymousClass1) create(sduiAccountSwitcherViewState, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return ((SduiAccountSwitcherViewState) this.L$0).copy(this.$accountSwitcher);
            }
        }
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        getLifecycleScope().repeatOnLifecycle(LifecycleState.STARTED, new C201991(null));
    }

    public final void onAccountSelected$lib_account_switcher_externalDebug(String accountNumber) {
        Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
        BuildersKt__Builders_commonKt.launch$default(getLifecycleScope(), null, null, new SduiAccountSwitcherDuxo2(this, accountNumber, null), 3, null);
    }
}
