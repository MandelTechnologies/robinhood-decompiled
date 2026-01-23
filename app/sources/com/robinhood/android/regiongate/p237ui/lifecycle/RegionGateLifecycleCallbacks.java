package com.robinhood.android.regiongate.p237ui.lifecycle;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.robinhood.analytics.EventLogger;
import com.robinhood.android.common.p088ui.BaseActivity;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.RegionGateProvider;
import com.robinhood.android.regiongate.p237ui.lifecycle.UnsupportedFeatureDialogFragment;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.rosetta.eventlogging.Component;
import com.robinhood.rosetta.eventlogging.CountryGateErrorType;
import com.robinhood.rosetta.eventlogging.CountryGatingContext;
import com.robinhood.rosetta.eventlogging.Screen;
import com.robinhood.utils.lifecycle.ActivityLifecycleListener;
import com.robinhood.utils.logging.CrashReporter;
import com.robinhood.utils.p409ui.context.BaseContexts;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.boxing;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.Await2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.CoroutineScope2;

/* compiled from: RegionGateLifecycleCallbacks.kt */
@Metadata(m3635d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\"\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0082@¢\u0006\u0002\u0010\u0019J\u001e\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002J\u001e\u0010\u001d\u001a\u00020\n2\u0006\u0010\u001e\u001a\u00020\u001c2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGateLifecycleCallbacks;", "Landroidx/fragment/app/FragmentManager$FragmentLifecycleCallbacks;", "Lcom/robinhood/utils/lifecycle/ActivityLifecycleListener;", "regionGateProvider", "Lcom/robinhood/android/regiongate/RegionGateProvider;", "eventLogger", "Lcom/robinhood/analytics/EventLogger;", "<init>", "(Lcom/robinhood/android/regiongate/RegionGateProvider;Lcom/robinhood/analytics/EventLogger;)V", "onActivityPostCreated", "", "activity", "Landroid/app/Activity;", "savedInstanceState", "Landroid/os/Bundle;", "onFragmentCreated", "fm", "Landroidx/fragment/app/FragmentManager;", "f", "Landroidx/fragment/app/Fragment;", "inAllRegionGates", "", "regionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "(Ljava/util/Set;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "logAppear", "screenName", "", "reportNonFatal", "fragmentOrActivityName", "lib-region-gate-ui_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes17.dex */
public final class RegionGateLifecycleCallbacks extends FragmentManager.FragmentLifecycleCallbacks implements ActivityLifecycleListener {
    private final EventLogger eventLogger;
    private final RegionGateProvider regionGateProvider;

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivityCreated(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityDestroyed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityPaused(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityResumed(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        ActivityLifecycleListener.DefaultImpls.onActivitySaveInstanceState(this, activity, bundle);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStarted(this, activity);
    }

    @Override // com.robinhood.utils.lifecycle.ActivityLifecycleListener, android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        ActivityLifecycleListener.DefaultImpls.onActivityStopped(this, activity);
    }

    public RegionGateLifecycleCallbacks(RegionGateProvider regionGateProvider, EventLogger eventLogger) {
        Intrinsics.checkNotNullParameter(regionGateProvider, "regionGateProvider");
        Intrinsics.checkNotNullParameter(eventLogger, "eventLogger");
        this.regionGateProvider = regionGateProvider;
        this.eventLogger = eventLogger;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPostCreated(Activity activity, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        super.onActivityPostCreated(activity, savedInstanceState);
        if ((activity instanceof LifecycleHost) && (activity instanceof RegionGated)) {
            ((LifecycleHost) activity).getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C269201(activity, this, null));
        }
    }

    /* compiled from: RegionGateLifecycleCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$onActivityPostCreated$1", m3645f = "RegionGateLifecycleCallbacks.kt", m3646l = {56}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$onActivityPostCreated$1 */
    /* loaded from: classes5.dex */
    static final class C269201 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Activity $activity;
        Object L$0;
        int label;
        final /* synthetic */ RegionGateLifecycleCallbacks this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C269201(Activity activity, RegionGateLifecycleCallbacks regionGateLifecycleCallbacks, Continuation<? super C269201> continuation) {
            super(2, continuation);
            this.$activity = activity;
            this.this$0 = regionGateLifecycleCallbacks;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C269201(this.$activity, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C269201) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Set<RegionGate> set;
            String simpleName;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Set<RegionGate> requiresRegionGates = ((RegionGated) this.$activity).getRequiresRegionGates();
                RegionGateLifecycleCallbacks regionGateLifecycleCallbacks = this.this$0;
                this.L$0 = requiresRegionGates;
                this.label = 1;
                Object objInAllRegionGates = regionGateLifecycleCallbacks.inAllRegionGates(requiresRegionGates, this);
                if (objInAllRegionGates == coroutine_suspended) {
                    return coroutine_suspended;
                }
                set = requiresRegionGates;
                obj = objInAllRegionGates;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(this.$activity);
                Activity activity = this.$activity;
                BaseActivity baseActivity = activity instanceof BaseActivity ? (BaseActivity) activity : null;
                if (baseActivity == null || (simpleName = baseActivity.getScreenName()) == null) {
                    simpleName = this.$activity.getClass().getSimpleName();
                }
                RegionGateLifecycleCallbacks regionGateLifecycleCallbacks2 = this.this$0;
                Intrinsics.checkNotNull(simpleName);
                regionGateLifecycleCallbacks2.logAppear(simpleName, set);
                RegionGateLifecycleCallbacks regionGateLifecycleCallbacks3 = this.this$0;
                String simpleName2 = appCompatActivityRequireActivityBaseContext.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                regionGateLifecycleCallbacks3.reportNonFatal(simpleName2, set);
                UnsupportedFeatureDialogFragment.Companion companion = UnsupportedFeatureDialogFragment.INSTANCE;
                FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                companion.show(appCompatActivityRequireActivityBaseContext, supportFragmentManager);
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.FragmentLifecycleCallbacks
    public void onFragmentCreated(FragmentManager fm, Fragment f, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(fm, "fm");
        Intrinsics.checkNotNullParameter(f, "f");
        super.onFragmentCreated(fm, f, savedInstanceState);
        if ((f instanceof LifecycleHost) && (f instanceof RegionGated)) {
            ((LifecycleHost) f).getLifecycleScope().repeatOnLifecycle(LifecycleState.RESUMED, new C269211(f, this, null));
        }
    }

    /* compiled from: RegionGateLifecycleCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$onFragmentCreated$1", m3645f = "RegionGateLifecycleCallbacks.kt", m3646l = {81}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$onFragmentCreated$1 */
    /* loaded from: classes5.dex */
    static final class C269211 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {

        /* renamed from: $f */
        final /* synthetic */ Fragment f4885$f;
        Object L$0;
        int label;
        final /* synthetic */ RegionGateLifecycleCallbacks this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C269211(Fragment fragment, RegionGateLifecycleCallbacks regionGateLifecycleCallbacks, Continuation<? super C269211> continuation) {
            super(2, continuation);
            this.f4885$f = fragment;
            this.this$0 = regionGateLifecycleCallbacks;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C269211(this.f4885$f, this.this$0, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C269211) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Set<RegionGate> set;
            String simpleName;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                Set<RegionGate> requiresRegionGates = ((RegionGated) this.f4885$f).getRequiresRegionGates();
                RegionGateLifecycleCallbacks regionGateLifecycleCallbacks = this.this$0;
                this.L$0 = requiresRegionGates;
                this.label = 1;
                Object objInAllRegionGates = regionGateLifecycleCallbacks.inAllRegionGates(requiresRegionGates, this);
                if (objInAllRegionGates == coroutine_suspended) {
                    return coroutine_suspended;
                }
                set = requiresRegionGates;
                obj = objInAllRegionGates;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                set = (Set) this.L$0;
                ResultKt.throwOnFailure(obj);
            }
            if (!((Boolean) obj).booleanValue()) {
                Context contextRequireContext = this.f4885$f.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                AppCompatActivity appCompatActivityRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(contextRequireContext);
                Fragment fragment = this.f4885$f;
                BaseFragment baseFragment = fragment instanceof BaseFragment ? (BaseFragment) fragment : null;
                if (baseFragment == null || (simpleName = baseFragment.getScreenName()) == null) {
                    simpleName = this.f4885$f.getClass().getSimpleName();
                }
                RegionGateLifecycleCallbacks regionGateLifecycleCallbacks2 = this.this$0;
                Intrinsics.checkNotNull(simpleName);
                regionGateLifecycleCallbacks2.logAppear(simpleName, set);
                RegionGateLifecycleCallbacks regionGateLifecycleCallbacks3 = this.this$0;
                String simpleName2 = this.f4885$f.getClass().getSimpleName();
                Intrinsics.checkNotNullExpressionValue(simpleName2, "getSimpleName(...)");
                regionGateLifecycleCallbacks3.reportNonFatal(simpleName2, set);
                UnsupportedFeatureDialogFragment.Companion companion = UnsupportedFeatureDialogFragment.INSTANCE;
                FragmentManager supportFragmentManager = appCompatActivityRequireActivityBaseContext.getSupportFragmentManager();
                Intrinsics.checkNotNullExpressionValue(supportFragmentManager, "getSupportFragmentManager(...)");
                companion.show(appCompatActivityRequireActivityBaseContext, supportFragmentManager);
            }
            return Unit.INSTANCE;
        }
    }

    /* compiled from: RegionGateLifecycleCallbacks.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$inAllRegionGates$2", m3645f = "RegionGateLifecycleCallbacks.kt", m3646l = {98}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$inAllRegionGates$2 */
    /* loaded from: classes5.dex */
    static final class C269192 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Boolean>, Object> {
        final /* synthetic */ Set<RegionGate> $regionGates;
        private /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ RegionGateLifecycleCallbacks this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C269192(Set<? extends RegionGate> set, RegionGateLifecycleCallbacks regionGateLifecycleCallbacks, Continuation<? super C269192> continuation) {
            super(2, continuation);
            this.$regionGates = set;
            this.this$0 = regionGateLifecycleCallbacks;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            C269192 c269192 = new C269192(this.$regionGates, this.this$0, continuation);
            c269192.L$0 = obj;
            return c269192;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Boolean> continuation) {
            return ((C269192) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            boolean z = true;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                Set<RegionGate> set = this.$regionGates;
                RegionGateLifecycleCallbacks regionGateLifecycleCallbacks = this.this$0;
                ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
                Iterator<T> it = set.iterator();
                while (it.hasNext()) {
                    arrayList.add(BuildersKt__Builders_commonKt.async$default(coroutineScope, null, null, new RegionGateLifecycleCallbacks2(regionGateLifecycleCallbacks, (RegionGate) it.next(), null), 3, null));
                }
                this.label = 1;
                obj = Await2.awaitAll(arrayList, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
            }
            Iterable iterable = (Iterable) obj;
            if (!(iterable instanceof Collection) || !((Collection) iterable).isEmpty()) {
                Iterator it2 = iterable.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    if (!((Boolean) it2.next()).booleanValue()) {
                        z = false;
                        break;
                    }
                }
            }
            return boxing.boxBoolean(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object inAllRegionGates(Set<? extends RegionGate> set, Continuation<? super Boolean> continuation) {
        return CoroutineScope2.coroutineScope(new C269192(set, this, null), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void logAppear(String screenName, Set<? extends RegionGate> regionGates) {
        EventLogger.DefaultImpls.logAppear$default(this.eventLogger, null, new Screen(null, null, screenName, null, 11, null), new Component(Component.ComponentType.ERROR_ALERT, null, null, 6, null), null, new com.robinhood.rosetta.eventlogging.Context(0, 0, 0, null, null, null, null, null, 0, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, new CountryGatingContext(CollectionsKt.joinToString$default(regionGates, ",", null, null, 0, null, new Function1() { // from class: com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegionGateLifecycleCallbacks.logAppear$lambda$0((RegionGate) obj);
            }
        }, 30, null), CountryGateErrorType.APP_NAVIGATION, "", "", "", null, 32, null), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, -1, -1, -1, -524289, -1, 16383, null), 9, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence logAppear$lambda$0(RegionGate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportNonFatal(String fragmentOrActivityName, Set<? extends RegionGate> regionGates) {
        String strJoinToString$default = CollectionsKt.joinToString$default(regionGates, null, null, null, 0, null, new Function1() { // from class: com.robinhood.android.regiongate.ui.lifecycle.RegionGateLifecycleCallbacks$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return RegionGateLifecycleCallbacks.reportNonFatal$lambda$1((RegionGate) obj);
            }
        }, 31, null);
        CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new UnsupportedScreenRegionGateException("Trying to access " + fragmentOrActivityName + ", but region gates \"" + strJoinToString$default + "\" are not enabled for user"), true, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence reportNonFatal$lambda$1(RegionGate it) {
        Intrinsics.checkNotNullParameter(it, "it");
        String simpleName = it.getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        return simpleName;
    }
}
