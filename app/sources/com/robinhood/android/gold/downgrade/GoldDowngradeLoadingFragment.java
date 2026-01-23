package com.robinhood.android.gold.downgrade;

import android.content.Context;
import android.os.Parcelable;
import androidx.compose.foundation.layout.WindowInsetsPadding_androidKt;
import androidx.compose.p011ui.Modifier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment;
import com.robinhood.compose.app.GenericComposeFragment;
import com.robinhood.compose.common.LoadingScreenComposablesKt;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.udf.UiEvent;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import com.robinhood.utils.p409ui.fragment.CallbacksProperty;
import com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion;
import io.reactivex.Observable;
import io.reactivex.Single;
import io.reactivex.functions.Function;
import java.util.NoSuchElementException;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.Unit;
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

/* compiled from: GoldDowngradeLoadingFragment.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00192\u00020\u0001:\u0002\u0018\u0019B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0010\u001a\u00020\u0011H\u0017¢\u0006\u0002\u0010\u0012J\b\u0010\u0017\u001a\u00020\u0011H\u0016R\u001b\u0010\u0004\u001a\u00020\u00058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0006\u0010\u0007R\u001b\u0010\n\u001a\u00020\u000b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0013\u001a\u00020\u00148VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment;", "Lcom/robinhood/compose/app/GenericComposeFragment;", "<init>", "()V", "callbacks", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment$Callbacks;", "getCallbacks", "()Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment$Callbacks;", "callbacks$delegate", "Lkotlin/properties/ReadOnlyProperty;", "duxo", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo;", "getDuxo", "()Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "ComposeContent", "", "(Landroidx/compose/runtime/Composer;I)V", "toolbarVisible", "", "getToolbarVisible", "()Z", "onResume", "Callbacks", "Companion", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class GoldDowngradeLoadingFragment extends GenericComposeFragment {

    /* renamed from: callbacks$delegate, reason: from kotlin metadata */
    private final Interfaces2 callbacks = new CallbacksProperty(Reflection.getOrCreateKotlinClass(Callbacks.class), new Function1<Fragment, Object>() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$special$$inlined$hostActivityCallbacks$1
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Fragment CallbacksProperty) {
            Intrinsics.checkNotNullParameter(CallbacksProperty, "$this$CallbacksProperty");
            FragmentActivity fragmentActivityRequireActivity = CallbacksProperty.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            for (Context context : BaseContexts.baseContexts(fragmentActivityRequireActivity)) {
                if (context instanceof GoldDowngradeLoadingFragment.Callbacks) {
                    return context;
                }
            }
            throw new NoSuchElementException("Sequence contains no element matching the predicate.");
        }
    });

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo = OldDuxos.oldDuxo(this, GoldDowngradeLoadingDuxo.class);
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(GoldDowngradeLoadingFragment.class, "callbacks", "getCallbacks()Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment$Callbacks;", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: GoldDowngradeLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b`\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\b\u0010\u0006\u001a\u00020\u0003H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment$Callbacks;", "", "onStateLoaded", "", "context", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;", "onAbortDowngrade", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface Callbacks {
        void onAbortDowngrade();

        void onStateLoaded(GoldDowngradeContext context);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit ComposeContent$lambda$0(GoldDowngradeLoadingFragment goldDowngradeLoadingFragment, int i, Composer composer, int i2) {
        goldDowngradeLoadingFragment.ComposeContent(composer, RecomposeScopeImpl4.updateChangedFlags(i | 1));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    private final Callbacks getCallbacks() {
        return (Callbacks) this.callbacks.getValue(this, $$delegatedProperties[0]);
    }

    private final GoldDowngradeLoadingDuxo getDuxo() {
        return (GoldDowngradeLoadingDuxo) this.duxo.getValue();
    }

    @Override // com.robinhood.compose.app.GenericComposeFragment
    public void ComposeContent(Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(1471317300);
        if ((i & 1) != 0 || !composerStartRestartGroup.getSkipping()) {
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventStart(1471317300, i, -1, "com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment.ComposeContent (GoldDowngradeLoadingFragment.kt:27)");
            }
            LoadingScreenComposablesKt.GenericHeroLoadingScreenComposable(WindowInsetsPadding_androidKt.systemBarsPadding(Modifier.INSTANCE), null, true, false, composerStartRestartGroup, 384, 10);
            if (ComposerKt.isTraceInProgress()) {
                ComposerKt.traceEventEnd();
            }
        } else {
            composerStartRestartGroup.skipToGroupEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return GoldDowngradeLoadingFragment.ComposeContent$lambda$0(this.f$0, i, (Composer) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable map = ObservablesAndroid.observeOnMainThread(getDuxo().getStates()).map(new Function() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$onResume$$inlined$mapNotNull$1
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<Throwable> errorEvent = ((GoldDowngradeLoadingState) it).getErrorEvent();
                return Optional3.asOptional(errorEvent != null ? errorEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((GoldDowngradeLoadingFragment$onResume$$inlined$mapNotNull$1<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDowngradeLoadingFragment.onResume$lambda$2(this.f$0, (Throwable) obj);
            }
        });
        Observable map2 = ObservablesAndroid.observeOnMainThread(getDuxo().getStates()).map(new Function() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$onResume$$inlined$mapNotNull$2
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                UiEvent<Unit> ineligibleToDowngradeEvent = ((GoldDowngradeLoadingState) it).getIneligibleToDowngradeEvent();
                return Optional3.asOptional(ineligibleToDowngradeEvent != null ? ineligibleToDowngradeEvent.consume() : null);
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((GoldDowngradeLoadingFragment$onResume$$inlined$mapNotNull$2<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return GoldDowngradeLoadingFragment.onResume$lambda$4(this.f$0, (Unit) obj);
            }
        });
        Observable map3 = ObservablesAndroid.observeOnMainThread(getDuxo().getStates()).map(new Function() { // from class: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$onResume$$inlined$mapNotNull$3
            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public final Optional<R> apply(T it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(((GoldDowngradeLoadingState) it).getOriginalContext());
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // io.reactivex.functions.Function
            public /* bridge */ /* synthetic */ Object apply(Object obj) {
                return apply((GoldDowngradeLoadingFragment$onResume$$inlined$mapNotNull$3<T, R>) obj);
            }
        });
        Intrinsics.checkNotNullExpressionValue(map3, "map(...)");
        Single singleFirstOrError = ObservablesKt.filterIsPresent(map3).firstOrError();
        Intrinsics.checkNotNullExpressionValue(singleFirstOrError, "firstOrError(...)");
        LifecycleHost.DefaultImpls.bind$default(this, singleFirstOrError, (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C177446(getCallbacks()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$2(GoldDowngradeLoadingFragment goldDowngradeLoadingFragment, Throwable it) throws Throwable {
        Intrinsics.checkNotNullParameter(it, "it");
        goldDowngradeLoadingFragment.getActivityErrorHandler().accept(it);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$4(GoldDowngradeLoadingFragment goldDowngradeLoadingFragment, Unit it) {
        Intrinsics.checkNotNullParameter(it, "it");
        goldDowngradeLoadingFragment.getCallbacks().onAbortDowngrade();
        return Unit.INSTANCE;
    }

    /* compiled from: GoldDowngradeLoadingFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.gold.downgrade.GoldDowngradeLoadingFragment$onResume$6 */
    /* synthetic */ class C177446 extends FunctionReferenceImpl implements Function1<GoldDowngradeContext, Unit> {
        C177446(Object obj) {
            super(1, obj, Callbacks.class, "onStateLoaded", "onStateLoaded(Lcom/robinhood/android/gold/downgrade/GoldDowngradeContext;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(GoldDowngradeContext goldDowngradeContext) {
            invoke2(goldDowngradeContext);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(GoldDowngradeContext p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((Callbacks) this.receiver).onStateLoaded(p0);
        }
    }

    /* compiled from: GoldDowngradeLoadingFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, m3636d2 = {"Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment$Companion;", "Lcom/robinhood/utils/ui/fragment/FragmentWithoutArgsCompanion;", "Lcom/robinhood/android/gold/downgrade/GoldDowngradeLoadingFragment;", "<init>", "()V", "feature-gold-downgrade_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion implements FragmentWithoutArgsCompanion<GoldDowngradeLoadingFragment> {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentCompanion
        public /* bridge */ /* synthetic */ Parcelable getArgs(Fragment fragment) {
            return (Parcelable) getArgs((GoldDowngradeLoadingFragment) fragment);
        }

        public Void getArgs(GoldDowngradeLoadingFragment goldDowngradeLoadingFragment) {
            return FragmentWithoutArgsCompanion.DefaultImpls.getArgs(this, goldDowngradeLoadingFragment);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCompanion, com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldDowngradeLoadingFragment newInstance() {
            return (GoldDowngradeLoadingFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this);
        }

        @Override // com.robinhood.utils.p409ui.fragment.FragmentWithoutArgsCreator
        public GoldDowngradeLoadingFragment newInstance(Void r1) {
            return (GoldDowngradeLoadingFragment) FragmentWithoutArgsCompanion.DefaultImpls.newInstance(this, r1);
        }
    }
}
