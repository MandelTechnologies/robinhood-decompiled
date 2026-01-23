package com.robinhood.android.margin.p174ui.limit;

import android.content.Context;
import android.os.Bundle;
import androidx.compose.material3.ScaffoldKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.lib.margin.LeveredMarginSettingsStore;
import com.robinhood.android.margin.p174ui.limit.MarginLimitSubmissionFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.models.util.Money;
import com.robinhood.p370rx.delay.CompletableDelay2;
import com.robinhood.utils.extensions.CompletablesAndroid;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: MarginLimitSubmissionFragment.kt */
@Metadata(m3635d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u0000 $2\u00020\u0001:\u0002#$B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\n\u001a\u00020\u000bH\u0017¢\u0006\u0002\u0010\fJ\b\u0010\"\u001a\u00020\u000bH\u0016R\u001e\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u0014\u0010\r\u001a\u00020\u000eX\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001b\u0010\u0011\u001a\u00020\u00128BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0013\u0010\u0014R\u001b\u0010\u0017\u001a\u00020\u00188BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u0019\u0010\u001aR\u001d\u0010\u001d\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\u001c\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "leveredMarginSettingsStore", "Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "getLeveredMarginSettingsStore", "()Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;", "setLeveredMarginSettingsStore", "(Lcom/robinhood/android/lib/margin/LeveredMarginSettingsStore;)V", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "callbacks", "Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "accountNumber", "", "getAccountNumber", "()Ljava/lang/String;", "accountNumber$delegate", "Lkotlin/Lazy;", MarginLimitSubmissionFragment.ARG_MARGIN_LIMIT, "Lcom/robinhood/models/util/Money;", "getMarginLimit", "()Lcom/robinhood/models/util/Money;", "marginLimit$delegate", "onStart", "Callbacks", "Companion", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes8.dex */
public final class MarginLimitSubmissionFragment extends GenericComposeFragment {
    private static final String ARG_ACCOUNT_NUMBER = "accountNumber";
    private static final String ARG_MARGIN_LIMIT = "marginLimit";
    private static final long MIN_TIME_IN_FLIGHT = 2000;
    public LeveredMarginSettingsStore leveredMarginSettingsStore;
    private final boolean toolbarVisible;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(MarginLimitSubmissionFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitSubmissionFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof MarginLimitSubmissionFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: accountNumber$delegate, reason: from kotlin metadata */
    private final Lazy accountNumber = Fragments2.argument(this, "accountNumber");

    /* renamed from: marginLimit$delegate, reason: from kotlin metadata */
    private final Lazy marginLimit = Fragments2.argument(this, ARG_MARGIN_LIMIT);

    /* compiled from: MarginLimitSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment$Callbacks;", "", "onMarginLimitSuccess", "", MarginLimitSubmissionFragment.ARG_MARGIN_LIMIT, "Lcom/robinhood/models/util/Money;", "onMarginLimitFailed", "throwable", "", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onMarginLimitFailed(Throwable throwable);

        void onMarginLimitSuccess(Money marginLimit);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(MarginLimitSubmissionFragment marginLimitSubmissionFragment, int i, Composer composer, int i2) {
        marginLimitSubmissionFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    public final LeveredMarginSettingsStore getLeveredMarginSettingsStore() {
        LeveredMarginSettingsStore leveredMarginSettingsStore = this.leveredMarginSettingsStore;
        if (leveredMarginSettingsStore != null) {
            return leveredMarginSettingsStore;
        }
        Intrinsics.throwUninitializedPropertyAccessException("leveredMarginSettingsStore");
        return null;
    }

    public final void setLeveredMarginSettingsStore(LeveredMarginSettingsStore leveredMarginSettingsStore) {
        Intrinsics.checkNotNullParameter(leveredMarginSettingsStore, "<set-?>");
        this.leveredMarginSettingsStore = leveredMarginSettingsStore;
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(62722508);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(62722508, i, -1, "com.robinhood.android.margin.ui.limit.MarginLimitSubmissionFragment.ComposeContent (MarginLimitSubmissionFragment.kt:30)");
            }
            ScaffoldKt.m5939ScaffoldTvnljyQ(null, null, null, null, null, 0, 0L, 0L, null, MarginLimitSubmissionFragment2.INSTANCE.m16199getLambda$1122672931$feature_margin_externalDebug(), composerStartRestartGroup, 805306368, 511);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitSubmissionFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return MarginLimitSubmissionFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final String getAccountNumber() {
        return (String) this.accountNumber.getValue();
    }

    private final Money getMarginLimit() {
        return (Money) this.marginLimit.getValue();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        final Money marginLimit = getMarginLimit();
        LifecycleHost.DefaultImpls.bind$default(this, CompletablesAndroid.observeOnMainThread(CompletableDelay2.minTimeInFlight$default(LeveredMarginSettingsStore.setMarginInvesting$default(getLeveredMarginSettingsStore(), getAccountNumber(), false, marginLimit, 2, null), 2000L, null, 2, null)), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function0() { // from class: com.robinhood.android.margin.ui.limit.MarginLimitSubmissionFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return MarginLimitSubmissionFragment.onStart$lambda$1(this.f$0, marginLimit);
            }
        }, new C210972(getCallbacks()));
    }

    /* compiled from: MarginLimitSubmissionFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.margin.ui.limit.MarginLimitSubmissionFragment$onStart$2 */
    /* synthetic */ class C210972 extends FunctionReferenceImpl implements Function1<Throwable, Unit> {
        C210972(Object obj) {
            super(1, obj, Callbacks.class, "onMarginLimitFailed", "onMarginLimitFailed(Ljava/lang/Throwable;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
            invoke2(th);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(Throwable p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onMarginLimitFailed(p0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onStart$lambda$1(MarginLimitSubmissionFragment marginLimitSubmissionFragment, Money money) {
        marginLimitSubmissionFragment.getCallbacks().onMarginLimitSuccess(money);
        return Unit.INSTANCE;
    }

    /* compiled from: MarginLimitSubmissionFragment.kt */
    @Metadata(m3635d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u00072\b\u0010\f\u001a\u0004\u0018\u00010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000e"}, m3636d2 = {"Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment$Companion;", "", "<init>", "()V", "MIN_TIME_IN_FLIGHT", "", "ARG_ACCOUNT_NUMBER", "", "ARG_MARGIN_LIMIT", "newFragment", "Lcom/robinhood/android/margin/ui/limit/MarginLimitSubmissionFragment;", "accountNumber", MarginLimitSubmissionFragment.ARG_MARGIN_LIMIT, "Lcom/robinhood/models/util/Money;", "feature-margin_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final MarginLimitSubmissionFragment newFragment(String accountNumber, Money marginLimit) {
            Intrinsics.checkNotNullParameter(accountNumber, "accountNumber");
            MarginLimitSubmissionFragment marginLimitSubmissionFragment = new MarginLimitSubmissionFragment();
            Bundle bundle = new Bundle();
            bundle.putString("accountNumber", accountNumber);
            bundle.putParcelable(MarginLimitSubmissionFragment.ARG_MARGIN_LIMIT, marginLimit);
            marginLimitSubmissionFragment.setArguments(bundle);
            return marginLimitSubmissionFragment;
        }
    }
}
