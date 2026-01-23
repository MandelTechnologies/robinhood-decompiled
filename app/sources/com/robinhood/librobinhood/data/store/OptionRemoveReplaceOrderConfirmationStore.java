package com.robinhood.librobinhood.data.store;

import com.robinhood.librobinhood.data.prefs.HasShownReplaceConfirmationDialogPref;
import com.robinhood.models.p320db.OptionChain;
import com.robinhood.models.p355ui.OptionBundles;
import com.robinhood.models.p355ui.OptionOrderBundle;
import com.robinhood.models.p355ui.UiOptionChain;
import com.robinhood.models.p355ui.UiOptionOrder;
import com.robinhood.models.p355ui.UiOptionUnderlier;
import com.robinhood.prefs.BooleanPreference;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesKt;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Tuples2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptionRemoveReplaceOrderConfirmationStore.kt */
@Metadata(m3635d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B#\b\u0007\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0006\u0010\n\u001a\u00020\u000bJ\u001a\u0010\f\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0012\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u001a\u0010\u0013\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000f0\u000e0\r2\u0006\u0010\u0010\u001a\u00020\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, m3636d2 = {"Lcom/robinhood/librobinhood/data/store/OptionRemoveReplaceOrderConfirmationStore;", "", "hasShownReplaceConfirmationDialogPref", "Lcom/robinhood/prefs/BooleanPreference;", "optionChainStore", "Lcom/robinhood/librobinhood/data/store/OptionChainStore;", "optionOrderStore", "Lcom/robinhood/librobinhood/data/store/OptionOrderStore;", "<init>", "(Lcom/robinhood/prefs/BooleanPreference;Lcom/robinhood/librobinhood/data/store/OptionChainStore;Lcom/robinhood/librobinhood/data/store/OptionOrderStore;)V", "markReplaceOrderConfirmationDialogShown", "", "maybeCancelAndGetOrderBundle", "Lio/reactivex/Observable;", "Lcom/robinhood/utils/Optional;", "Lcom/robinhood/models/ui/OptionOrderBundle;", "uiOptionOrder", "Lcom/robinhood/models/ui/UiOptionOrder;", "maybeCancelAndGetEquityOptionOrderBundle", "maybeCancelAndGetIndexOptionOrderBundle", "lib-store-options_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes13.dex */
public final class OptionRemoveReplaceOrderConfirmationStore {
    private final BooleanPreference hasShownReplaceConfirmationDialogPref;
    private final OptionChainStore optionChainStore;
    private final OptionOrderStore optionOrderStore;

    /* compiled from: OptionRemoveReplaceOrderConfirmationStore.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[OptionChain.UnderlyingType.values().length];
            try {
                iArr[OptionChain.UnderlyingType.EQUITY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OptionChain.UnderlyingType.INDEX.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public OptionRemoveReplaceOrderConfirmationStore(@HasShownReplaceConfirmationDialogPref BooleanPreference hasShownReplaceConfirmationDialogPref, OptionChainStore optionChainStore, OptionOrderStore optionOrderStore) {
        Intrinsics.checkNotNullParameter(hasShownReplaceConfirmationDialogPref, "hasShownReplaceConfirmationDialogPref");
        Intrinsics.checkNotNullParameter(optionChainStore, "optionChainStore");
        Intrinsics.checkNotNullParameter(optionOrderStore, "optionOrderStore");
        this.hasShownReplaceConfirmationDialogPref = hasShownReplaceConfirmationDialogPref;
        this.optionChainStore = optionChainStore;
        this.optionOrderStore = optionOrderStore;
    }

    public final void markReplaceOrderConfirmationDialogShown() {
        this.hasShownReplaceConfirmationDialogPref.set(true);
    }

    public final Observable<Optional<OptionOrderBundle>> maybeCancelAndGetOrderBundle(UiOptionOrder uiOptionOrder) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        this.optionOrderStore.refresh(false, uiOptionOrder.getId());
        int i = WhenMappings.$EnumSwitchMapping$0[uiOptionOrder.getUnderlyingType().ordinal()];
        if (i == 1) {
            return maybeCancelAndGetEquityOptionOrderBundle(uiOptionOrder);
        }
        if (i != 2) {
            throw new NoWhenBranchMatchedException();
        }
        return maybeCancelAndGetIndexOptionOrderBundle(uiOptionOrder);
    }

    public final Observable<Optional<OptionOrderBundle>> maybeCancelAndGetEquityOptionOrderBundle(final UiOptionOrder uiOptionOrder) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        Observable<Optional<OptionOrderBundle>> observableTake = Observables.INSTANCE.combineLatest(ObservablesKt.filterIsPresent(this.optionChainStore.getStreamActiveUiOptionUnderlierByOptionChain().asObservable(uiOptionOrder.getOptionChain().getId())), this.optionChainStore.getStreamUiOptionChain().asObservable(uiOptionOrder.getOptionChain().getId())).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore.maybeCancelAndGetEquityOptionOrderBundle.1
            @Override // io.reactivex.functions.Function
            public final Optional<OptionOrderBundle> apply(Tuples2<UiOptionUnderlier, UiOptionChain> tuples2) {
                Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
                UiOptionUnderlier uiOptionUnderlierComponent1 = tuples2.component1();
                return Optional3.asOptional(OptionBundles.toOrderBundle(uiOptionOrder, uiOptionUnderlierComponent1.getInstrument().getId(), tuples2.component2()));
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        return observableTake;
    }

    public final Observable<Optional<OptionOrderBundle>> maybeCancelAndGetIndexOptionOrderBundle(final UiOptionOrder uiOptionOrder) {
        Intrinsics.checkNotNullParameter(uiOptionOrder, "uiOptionOrder");
        Observable<Optional<OptionOrderBundle>> observableTake = this.optionChainStore.getStreamUiOptionChain().asObservable(uiOptionOrder.getOptionChain().getId()).map(new Function() { // from class: com.robinhood.librobinhood.data.store.OptionRemoveReplaceOrderConfirmationStore.maybeCancelAndGetIndexOptionOrderBundle.1
            @Override // io.reactivex.functions.Function
            public final Optional<OptionOrderBundle> apply(UiOptionChain uiOptionChain) {
                Intrinsics.checkNotNullParameter(uiOptionChain, "uiOptionChain");
                return Optional3.asOptional(OptionBundles.toOrderBundle(uiOptionOrder, null, uiOptionChain));
            }
        }).take(1L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        return observableTake;
    }
}
