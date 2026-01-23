package com.robinhood.android.transfers.p271ui.deeplink;

import androidx.lifecycle.SavedStateHandle;
import com.robinhood.android.navigation.keys.IntentKey;
import com.robinhood.android.transfers.contracts.InternationalTransfer;
import com.robinhood.android.transfers.contracts.Transfer;
import com.robinhood.android.transfers.contracts.UkTransfer;
import com.robinhood.android.transfers.contracts.WithdrawFundsDeeplink;
import com.robinhood.android.transfers.contracts.transfercontext.TransferContext;
import com.robinhood.android.transfers.p271ui.deeplink.WithdrawFundsDeeplinkEvent;
import com.robinhood.android.udf.BaseDuxo5;
import com.robinhood.android.udf.DuxoBundle;
import com.robinhood.android.udf.DuxoCompanion2;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.iso.countrycode.Affiliate;
import com.robinhood.iso.countrycode.CountryCode;
import com.robinhood.models.api.bonfire.transfer.TransferDirectionV2;
import com.robinhood.models.p320db.TransferDirection;
import com.robinhood.models.p320db.sheriff.User;
import com.robinhood.shared.store.user.UserStore;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WithdrawFundsDeeplinkDuxo.kt */
@Metadata(m3635d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00102\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0010B!\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u000f\u001a\u00020\u0002H\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0011"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkDuxo;", "Lcom/robinhood/android/udf/BaseIdentityEventDuxo;", "", "Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkEvent;", "Lcom/robinhood/android/udf/HasSavedState;", "userStore", "Lcom/robinhood/shared/store/user/UserStore;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "duxoBundle", "Lcom/robinhood/android/udf/DuxoBundle;", "<init>", "(Lcom/robinhood/shared/store/user/UserStore;Landroidx/lifecycle/SavedStateHandle;Lcom/robinhood/android/udf/DuxoBundle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "onCreate", "Companion", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public final class WithdrawFundsDeeplinkDuxo extends BaseDuxo5<Unit, WithdrawFundsDeeplinkEvent> implements HasSavedState {
    private final SavedStateHandle savedStateHandle;
    private final UserStore userStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public WithdrawFundsDeeplinkDuxo(UserStore userStore, SavedStateHandle savedStateHandle, DuxoBundle duxoBundle) {
        super(Unit.INSTANCE, duxoBundle);
        Intrinsics.checkNotNullParameter(userStore, "userStore");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        Intrinsics.checkNotNullParameter(duxoBundle, "duxoBundle");
        this.userStore = userStore;
        this.savedStateHandle = savedStateHandle;
    }

    @Override // com.robinhood.android.udf.BaseDuxo, com.robinhood.android.udf.Duxo
    public void onCreate() {
        super.onCreate();
        this.userStore.refresh(false);
        Single<R> map = this.userStore.getUser().firstOrError().map(new Function() { // from class: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkDuxo.onCreate.1
            @Override // io.reactivex.functions.Function
            public final Object apply(User user) {
                Intrinsics.checkNotNullParameter(user, "user");
                CountryCode.Supported locality = user.getOrigin().getLocality();
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedStates.INSTANCE)) {
                    TransferDirection transferDirection = TransferDirection.WITHDRAW;
                    Companion companion = WithdrawFundsDeeplinkDuxo.INSTANCE;
                    return new Transfer(new TransferContext.Normal(transferDirection, ((WithdrawFundsDeeplink) companion.getExtras((HasSavedState) WithdrawFundsDeeplinkDuxo.this)).getAccountType(), ((WithdrawFundsDeeplink) companion.getExtras((HasSavedState) WithdrawFundsDeeplinkDuxo.this)).getAmount()));
                }
                if (Intrinsics.areEqual(locality, CountryCode.Supported.UnitedKingdom.INSTANCE)) {
                    return new UkTransfer(TransferDirectionV2.WITHDRAW, ((WithdrawFundsDeeplink) WithdrawFundsDeeplinkDuxo.INSTANCE.getExtras((HasSavedState) WithdrawFundsDeeplinkDuxo.this)).getAmount(), null, null, null, 28, null);
                }
                if (Affiliate.RHSG.INSTANCE.contains(locality)) {
                    return new InternationalTransfer(TransferDirection.WITHDRAW, ((WithdrawFundsDeeplink) WithdrawFundsDeeplinkDuxo.INSTANCE.getExtras((HasSavedState) WithdrawFundsDeeplinkDuxo.this)).getAmount(), null, null, 12, null);
                }
                throw new IllegalStateException(("Unsupported country code: " + locality).toString());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, map, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1<?, Unit>() { // from class: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkDuxo.onCreate.2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Object obj) {
                invoke2((Object) obj);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Object obj) {
                WithdrawFundsDeeplinkDuxo.this.submit(new WithdrawFundsDeeplinkEvent.NavigateAndFinish((IntentKey) obj));
            }
        }, new Function1() { // from class: com.robinhood.android.transfers.ui.deeplink.WithdrawFundsDeeplinkDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return WithdrawFundsDeeplinkDuxo.onCreate$lambda$0(this.f$0, (Throwable) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$0(WithdrawFundsDeeplinkDuxo withdrawFundsDeeplinkDuxo, Throwable t) {
        Intrinsics.checkNotNullParameter(t, "t");
        withdrawFundsDeeplinkDuxo.submit(new WithdrawFundsDeeplinkEvent.Error(t));
        return Unit.INSTANCE;
    }

    /* compiled from: WithdrawFundsDeeplinkDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoActivityCompanion;", "Lcom/robinhood/android/transfers/ui/deeplink/WithdrawFundsDeeplinkDuxo;", "Lcom/robinhood/android/transfers/contracts/WithdrawFundsDeeplink;", "<init>", "()V", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion2<WithdrawFundsDeeplinkDuxo, WithdrawFundsDeeplink> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public WithdrawFundsDeeplink getExtras(SavedStateHandle savedStateHandle) {
            return (WithdrawFundsDeeplink) DuxoCompanion2.DefaultImpls.getExtras(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion2
        public WithdrawFundsDeeplink getExtras(WithdrawFundsDeeplinkDuxo withdrawFundsDeeplinkDuxo) {
            return (WithdrawFundsDeeplink) DuxoCompanion2.DefaultImpls.getExtras(this, withdrawFundsDeeplinkDuxo);
        }
    }
}
