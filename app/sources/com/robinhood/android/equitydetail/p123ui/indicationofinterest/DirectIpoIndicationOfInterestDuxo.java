package com.robinhood.android.equitydetail.p123ui.indicationofinterest;

import androidx.lifecycle.SavedStateHandle;
import com.plaid.internal.EnumC7081g;
import com.robinhood.android.equitydetail.p123ui.indicationofinterest.DirectIpoIndicationOfInterestBottomSheetFragment;
import com.robinhood.android.equitydetail.p123ui.indicationofinterest.DirectIpoIndicationOfInterestViewState;
import com.robinhood.android.lib.account.AccountProvider;
import com.robinhood.android.udf.DuxoCompanion;
import com.robinhood.android.udf.HasSavedState;
import com.robinhood.android.udf.OldBaseDuxo;
import com.robinhood.directipo.models.p292db.DirectIpoEnrollment;
import com.robinhood.directipo.models.p292db.DirectIpoIndicationOfInterest;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.librobinhood.data.store.bonfire.DirectIpoIndicationOfInterestStore;
import com.robinhood.librobinhood.data.store.bonfire.StockDetailStore;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import io.reactivex.Observable;
import io.reactivex.SingleSource;
import io.reactivex.functions.Function;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DirectIpoIndicationOfInterestDuxo.kt */
@Metadata(m3635d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u0000 \u001a2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u0003:\u0001\u001aB)\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\b\u0010\u0014\u001a\u00020\u0015H\u0016J\u0006\u0010\u0016\u001a\u00020\u0015J\u000e\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0010\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001b"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestDuxo;", "Lcom/robinhood/android/udf/OldBaseDuxo;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestViewState;", "Lcom/robinhood/android/udf/HasSavedState;", "indicationOfInterestStore", "Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore;", "stockDetailStore", "Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;", "accountProvider", "Lcom/robinhood/android/lib/account/AccountProvider;", "savedStateHandle", "Landroidx/lifecycle/SavedStateHandle;", "<init>", "(Lcom/robinhood/librobinhood/data/store/bonfire/DirectIpoIndicationOfInterestStore;Lcom/robinhood/librobinhood/data/store/bonfire/StockDetailStore;Lcom/robinhood/android/lib/account/AccountProvider;Landroidx/lifecycle/SavedStateHandle;)V", "getSavedStateHandle", "()Landroidx/lifecycle/SavedStateHandle;", "instrumentId", "Ljava/util/UUID;", "getInstrumentId", "()Ljava/util/UUID;", "onResume", "", "expressIndicationOfInterest", "setReviewed", "reviewed", "", "Companion", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes3.dex */
public final class DirectIpoIndicationOfInterestDuxo extends OldBaseDuxo<DirectIpoIndicationOfInterestViewState> implements HasSavedState {
    private final AccountProvider accountProvider;
    private final DirectIpoIndicationOfInterestStore indicationOfInterestStore;
    private final SavedStateHandle savedStateHandle;
    private final StockDetailStore stockDetailStore;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Override // com.robinhood.android.udf.HasSavedState
    public SavedStateHandle getSavedStateHandle() {
        return this.savedStateHandle;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DirectIpoIndicationOfInterestDuxo(DirectIpoIndicationOfInterestStore indicationOfInterestStore, StockDetailStore stockDetailStore, AccountProvider accountProvider, SavedStateHandle savedStateHandle) {
        super(new DirectIpoIndicationOfInterestViewState(false, false, null, null, null, null, null, null, null, 511, null), null, 2, 0 == true ? 1 : 0);
        Intrinsics.checkNotNullParameter(indicationOfInterestStore, "indicationOfInterestStore");
        Intrinsics.checkNotNullParameter(stockDetailStore, "stockDetailStore");
        Intrinsics.checkNotNullParameter(accountProvider, "accountProvider");
        Intrinsics.checkNotNullParameter(savedStateHandle, "savedStateHandle");
        this.indicationOfInterestStore = indicationOfInterestStore;
        this.stockDetailStore = stockDetailStore;
        this.accountProvider = accountProvider;
        this.savedStateHandle = savedStateHandle;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final UUID getInstrumentId() {
        return ((DirectIpoIndicationOfInterestBottomSheetFragment.Args) INSTANCE.getArgs((HasSavedState) this)).getInstrumentId();
    }

    @Override // com.robinhood.android.udf.OldBaseDuxo, com.robinhood.android.udf.OldDuxo
    public void onResume() {
        super.onResume();
        LifecycleHost.DefaultImpls.bind$default(this, this.indicationOfInterestStore.getIndicationOfInterest(getInstrumentId()), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestDuxo.onResume$lambda$1(this.f$0, (DirectIpoIndicationOfInterest) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$1(DirectIpoIndicationOfInterestDuxo directIpoIndicationOfInterestDuxo, final DirectIpoIndicationOfInterest directIpoIndicationOfInterest) {
        Intrinsics.checkNotNullParameter(directIpoIndicationOfInterest, "directIpoIndicationOfInterest");
        directIpoIndicationOfInterestDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestDuxo.onResume$lambda$1$lambda$0(directIpoIndicationOfInterest, (DirectIpoIndicationOfInterestViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoIndicationOfInterestViewState onResume$lambda$1$lambda$0(DirectIpoIndicationOfInterest directIpoIndicationOfInterest, DirectIpoIndicationOfInterestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        String title = directIpoIndicationOfInterest.getTitle();
        String subtitleMarkdown = directIpoIndicationOfInterest.getSubtitleMarkdown();
        String acceptButtonTitle = directIpoIndicationOfInterest.getAcceptButtonTitle();
        return DirectIpoIndicationOfInterestViewState.copy$default(applyMutation, false, true, title, subtitleMarkdown, directIpoIndicationOfInterest.getFooterMarkdown(), directIpoIndicationOfInterest.getDismissButtonTitle(), directIpoIndicationOfInterest.getRows(), null, acceptButtonTitle, EnumC7081g.SDK_ASSET_ILLUSTRATION_FORM_VALUE, null);
    }

    public final void expressIndicationOfInterest() {
        Observable observableStartWith = this.accountProvider.getIndividualAccountNumber().flatMap(new Function() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo.expressIndicationOfInterest.1
            @Override // io.reactivex.functions.Function
            public final SingleSource<? extends DirectIpoEnrollment> apply(Optional<String> optional) {
                Intrinsics.checkNotNullParameter(optional, "<destruct>");
                String strComponent1 = optional.component1();
                if (strComponent1 == null) {
                    return null;
                }
                DirectIpoIndicationOfInterestDuxo directIpoIndicationOfInterestDuxo = DirectIpoIndicationOfInterestDuxo.this;
                return directIpoIndicationOfInterestDuxo.indicationOfInterestStore.enrollInDirectIpoInstrument(directIpoIndicationOfInterestDuxo.getInstrumentId(), strComponent1);
            }
        }).map(new Function() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo.expressIndicationOfInterest.2
            @Override // io.reactivex.functions.Function
            public final DirectIpoIndicationOfInterestViewState.ExpressInterestResult apply(DirectIpoEnrollment directIpoEnrollment) {
                Intrinsics.checkNotNullParameter(directIpoEnrollment, "directIpoEnrollment");
                return new DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Success(directIpoEnrollment.getAlert());
            }
        }).toObservable().startWith((Observable) DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Loading.INSTANCE);
        Intrinsics.checkNotNullExpressionValue(observableStartWith, "startWith(...)");
        ScopedObservable.subscribeKotlin$default(LifecycleHost.DefaultImpls.bind$default(this, observableStartWith, (LifecycleEvent) null, 1, (Object) null), new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestDuxo.expressIndicationOfInterest$lambda$3(this.f$0, (DirectIpoIndicationOfInterestViewState.ExpressInterestResult) obj);
            }
        }, new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestDuxo.expressIndicationOfInterest$lambda$5(this.f$0, (Throwable) obj);
            }
        }, null, null, 12, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit expressIndicationOfInterest$lambda$3(DirectIpoIndicationOfInterestDuxo directIpoIndicationOfInterestDuxo, final DirectIpoIndicationOfInterestViewState.ExpressInterestResult expressInterestResult) {
        directIpoIndicationOfInterestDuxo.stockDetailStore.refresh(((DirectIpoIndicationOfInterestBottomSheetFragment.Args) INSTANCE.getArgs((HasSavedState) directIpoIndicationOfInterestDuxo)).getInstrumentId(), true);
        directIpoIndicationOfInterestDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestDuxo.expressIndicationOfInterest$lambda$3$lambda$2(expressInterestResult, (DirectIpoIndicationOfInterestViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoIndicationOfInterestViewState expressIndicationOfInterest$lambda$3$lambda$2(DirectIpoIndicationOfInterestViewState.ExpressInterestResult expressInterestResult, DirectIpoIndicationOfInterestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoIndicationOfInterestViewState.copy$default(applyMutation, false, false, null, null, null, null, null, new UiEvent(expressInterestResult), null, 383, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit expressIndicationOfInterest$lambda$5(DirectIpoIndicationOfInterestDuxo directIpoIndicationOfInterestDuxo, final Throwable throwable) {
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        directIpoIndicationOfInterestDuxo.applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestDuxo.expressIndicationOfInterest$lambda$5$lambda$4(throwable, (DirectIpoIndicationOfInterestViewState) obj);
            }
        });
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoIndicationOfInterestViewState expressIndicationOfInterest$lambda$5$lambda$4(Throwable th, DirectIpoIndicationOfInterestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoIndicationOfInterestViewState.copy$default(applyMutation, false, false, null, null, null, null, null, new UiEvent(new DirectIpoIndicationOfInterestViewState.ExpressInterestResult.Failure(th)), null, 383, null);
    }

    public final void setReviewed(final boolean reviewed) {
        applyMutation(new Function1() { // from class: com.robinhood.android.equitydetail.ui.indicationofinterest.DirectIpoIndicationOfInterestDuxo$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return DirectIpoIndicationOfInterestDuxo.setReviewed$lambda$6(reviewed, (DirectIpoIndicationOfInterestViewState) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DirectIpoIndicationOfInterestViewState setReviewed$lambda$6(boolean z, DirectIpoIndicationOfInterestViewState applyMutation) {
        Intrinsics.checkNotNullParameter(applyMutation, "$this$applyMutation");
        return DirectIpoIndicationOfInterestViewState.copy$default(applyMutation, z, false, null, null, null, null, null, null, null, 510, null);
    }

    /* compiled from: DirectIpoIndicationOfInterestDuxo.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestDuxo$Companion;", "Lcom/robinhood/android/udf/DuxoCompanion;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestDuxo;", "Lcom/robinhood/android/equitydetail/ui/indicationofinterest/DirectIpoIndicationOfInterestBottomSheetFragment$Args;", "<init>", "()V", "feature-equity-detail_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements DuxoCompanion<DirectIpoIndicationOfInterestDuxo, DirectIpoIndicationOfInterestBottomSheetFragment.Args> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectIpoIndicationOfInterestBottomSheetFragment.Args getArgs(SavedStateHandle savedStateHandle) {
            return (DirectIpoIndicationOfInterestBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, savedStateHandle);
        }

        @Override // com.robinhood.android.udf.DuxoCompanion
        public DirectIpoIndicationOfInterestBottomSheetFragment.Args getArgs(DirectIpoIndicationOfInterestDuxo directIpoIndicationOfInterestDuxo) {
            return (DirectIpoIndicationOfInterestBottomSheetFragment.Args) DuxoCompanion.DefaultImpls.getArgs(this, directIpoIndicationOfInterestDuxo);
        }
    }
}
