package com.robinhood.android.common.margin.p083ui.spending;

import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.margin.p083ui.MarginSpendingProduct;
import com.robinhood.android.common.margin.p083ui.spending.MarginSpendingPromptFragment;
import com.robinhood.android.common.margin.p083ui.withdrawal.MarginWithdrawalPromptFragment;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithConstantArgsCompanion;
import io.reactivex.Completable;
import io.reactivex.functions.Action;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginSpendingPromptFragment.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00192\u00020\u00012\u00020\u0002:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0017H\u0016R\u001e\u0010\u0005\u001a\u00020\u00068\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00028TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/spending/MarginSpendingPromptFragment;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment;", "Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Callbacks;", "<init>", "()V", "marginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "getMarginSettingsStore", "()Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "setMarginSettingsStore", "(Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;)V", "callbacks", "Lcom/robinhood/android/common/margin/ui/spending/MarginSpendingPromptFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/common/margin/ui/spending/MarginSpendingPromptFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "promptCallbacks", "getPromptCallbacks", "()Lcom/robinhood/android/common/margin/ui/withdrawal/MarginWithdrawalPromptFragment$Callbacks;", "onConfigureMarginWithdrawal", "", "enable", "", "Callbacks", "Companion", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class MarginSpendingPromptFragment extends MarginWithdrawalPromptFragment implements MarginWithdrawalPromptFragment.Callbacks {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.common.margin.ui.spending.MarginSpendingPromptFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginSpendingPromptFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });
    public LeveredMarginSettingsStore marginSettingsStore;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginSpendingPromptFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/common/margin/ui/spending/MarginSpendingPromptFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: MarginSpendingPromptFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&¨\u0006\u0004"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/spending/MarginSpendingPromptFragment$Callbacks;", "", "onMarginSpendingConfigured", "", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMarginSpendingConfigured();
    }

    @Override // com.robinhood.android.common.margin.p083ui.withdrawal.MarginWithdrawalPromptFragment
    protected MarginWithdrawalPromptFragment.Callbacks getPromptCallbacks() {
        return this;
    }

    public final LeveredMarginSettingsStore getMarginSettingsStore() {
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.marginSettingsStore;
        if (leveredMarginSettingsStore != null) {
            return leveredMarginSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("marginSettingsStore");
        return null;
    }

    public final void setMarginSettingsStore(LeveredMarginSettingsStore leveredMarginSettingsStore) {
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "<set-?>");
        this.marginSettingsStore = leveredMarginSettingsStore;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    @Override // com.robinhood.android.common.margin.ui.withdrawal.MarginWithdrawalPromptFragment.Callbacks
    public void onConfigureMarginWithdrawal(boolean enable) {
        setAreButtonsLoading(true);
        Completable completableDoFinally = CompletablesAndroid.observeOnMainThread(LeveredMarginSettingsStore.toggleMarginWithdrawal$default(getMarginSettingsStore(), null, enable, 1, null)).doFinally(new Action() { // from class: com.robinhood.android.common.margin.ui.spending.MarginSpendingPromptFragment.onConfigureMarginWithdrawal.1
            @Override // io.reactivex.functions.Action
            public final void run() {
                MarginSpendingPromptFragment.this.setAreButtonsLoading(false);
            }
        });
        Intrinsics.checkNotNullExpressionValue(completableDoFinally, "doFinally(...)");
        LifecycleHost.DefaultImpls.bind$default(this, completableDoFinally, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.common.margin.ui.spending.MarginSpendingPromptFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginSpendingPromptFragment.onConfigureMarginWithdrawal$lambda$0(this.f$0);
            }
        }, getActivityErrorHandler());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onConfigureMarginWithdrawal$lambda$0(MarginSpendingPromptFragment marginSpendingPromptFragment) {
        marginSpendingPromptFragment.getCallbacks().onMarginSpendingConfigured();
        return Unit.INSTANCE;
    }

    /* compiled from: MarginSpendingPromptFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0006\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/common/margin/ui/spending/MarginSpendingPromptFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithConstantArgsCompanion;", "Lcom/robinhood/android/common/margin/ui/spending/MarginSpendingPromptFragment;", "Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "<init>", "()V", "constantArgs", "getConstantArgs", "()Lcom/robinhood/android/common/margin/ui/MarginSpendingProduct;", "feature-lib-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithConstantArgsCompanion<MarginSpendingPromptFragment, MarginSpendingProduct> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public MarginSpendingProduct getArgs(MarginSpendingPromptFragment marginSpendingPromptFragment) {
            return (MarginSpendingProduct) FragmentWithConstantArgsCompanion.DefaultImpls.getArgs(this, marginSpendingPromptFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithConstantArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public MarginSpendingPromptFragment newInstance() {
            return (MarginSpendingPromptFragment) FragmentWithConstantArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public MarginSpendingPromptFragment newInstance(Void r1) {
            return (MarginSpendingPromptFragment) FragmentWithConstantArgsCompanion.DefaultImpls.newInstance(this, r1);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithConstantArgsCompanion
        public MarginSpendingProduct getConstantArgs() {
            return MarginSpendingProduct.CASH_MANAGEMENT;
        }
    }
}
