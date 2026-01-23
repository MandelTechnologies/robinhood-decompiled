package com.robinhood.android.common.p088ui;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.transition.Transition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewPropertyAnimator;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import androidx.core.view.KeyEventDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleOwner2;
import androidx.lifecycle.RepeatOnLifecycle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.BackEventCompat;
import androidx.view.result.ActivityResultCaller;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragment;
import com.robinhood.android.common.p088ui.RhBottomSheetDialogFragmentHost;
import com.robinhood.android.common.p088ui.RhDialogFragment;
import com.robinhood.android.common.p088ui.p089di.BaseFragmentSingletons;
import com.robinhood.android.common.p088ui.view.RhToolbar;
import com.robinhood.android.common.tabs.TabManager;
import com.robinhood.android.common.util.TransitionReason;
import com.robinhood.android.common.util.TypefaceUtils;
import com.robinhood.android.common.util.UiCallbacks;
import com.robinhood.android.common.util.extensions.Contexts7;
import com.robinhood.android.common.util.extensions.Fragments2;
import com.robinhood.android.common.util.p090rx.ActivityErrorHandler;
import com.robinhood.android.common.util.transition.Interpolators;
import com.robinhood.android.common.util.transition.SimpleSlide;
import com.robinhood.android.designsystem.colorscheme.ColorSchemeManager;
import com.robinhood.android.designsystem.style.AchromaticOverlay;
import com.robinhood.android.designsystem.style.ColorScheme;
import com.robinhood.android.designsystem.style.DayNightOverlay;
import com.robinhood.android.designsystem.style.DesignSystemOverlay;
import com.robinhood.android.designsystem.style.GoldOverlay;
import com.robinhood.android.navigation.C22231R;
import com.robinhood.android.navigation.Navigator;
import com.robinhood.android.navigation.fragment.ReplaceFragmentBuilder;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.test.idler.IdlingResourceCounters2;
import com.robinhood.test.idler.IdlingResourceType;
import com.robinhood.utils.RhProcessLifecycleOwner;
import com.robinhood.utils.RxGlobalErrorHandler;
import com.robinhood.utils.extensions.ContextSystemServices;
import com.robinhood.utils.extensions.ContextsUiExtensions;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost;
import com.robinhood.utils.p409ui.view.LifecycleViewBindings;
import dagger.Lazy;
import dispatch.core.DispatcherProvider;
import io.reactivex.Observable;
import java.util.Iterator;
import java.util.concurrent.TimeUnit;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Tuples2;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequencesKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;

/* compiled from: BaseFragment.kt */
@Metadata(m3635d1 = {"\u0000´\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0017\u0018\u0000 Â\u00012\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0004Á\u0001Â\u0001B\u0011\u0012\b\b\u0001\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ(\u00100\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u0002H201\"\n\b\u0000\u00102*\u0004\u0018\u0001032\u0006\u00104\u001a\u00020\nH\u0005J\u0012\u0010`\u001a\u00020a2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u0012\u0010d\u001a\u00020e2\b\u0010b\u001a\u0004\u0018\u00010cH\u0016J\u001a\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u0002032\b\u0010b\u001a\u0004\u0018\u00010cH\u0017J\b\u0010h\u001a\u00020eH\u0016J\b\u0010i\u001a\u00020GH\u0016J\u000e\u0010j\u001a\u00020e2\u0006\u0010k\u001a\u00020lJ\u0018\u0010m\u001a\u00020e2\u0006\u0010n\u001a\u00020o2\b\b\u0002\u0010p\u001a\u00020GJ\u0016\u0010q\u001a\u00020e2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020uJ\u0018\u0010v\u001a\u00020e2\u0006\u0010r\u001a\u00020s2\u0006\u0010t\u001a\u00020uH\u0014J\u0010\u0010w\u001a\u00020e2\u0006\u0010x\u001a\u00020CH\u0017J\"\u0010y\u001a\u0004\u0018\u00010z2\u0006\u0010{\u001a\u00020\n2\u0006\u0010|\u001a\u00020G2\u0006\u0010}\u001a\u00020\nH\u0016J\t\u0010\u0081\u0001\u001a\u00020lH\u0016J\u0007\u0010\u0082\u0001\u001a\u000206J\u0007\u0010\u0083\u0001\u001a\u00020CJ\t\u0010\u0084\u0001\u001a\u00020eH\u0004J\u0011\u0010\u0085\u0001\u001a\u00020e2\u0006\u0010,\u001a\u00020lH\u0004J\u001e\u0010\u0086\u0001\u001a\u00020e2\t\b\u0001\u0010\u0087\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001H\u0004J\u0011\u0010\u008a\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u0011\u0010\u008b\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u001c\u0010\u008c\u0001\u001a\u00020e2\t\b\u0001\u0010\u0087\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u0011\u0010\u008d\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u0011\u0010\u008e\u0001\u001a\u00020\n2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u0011\u0010\u008f\u0001\u001a\u00020e2\b\u0010\u0088\u0001\u001a\u00030\u0089\u0001J\u0012\u0010\u0090\u0001\u001a\u00020e2\u0007\u0010\u0091\u0001\u001a\u00020\nH\u0004J\t\u0010\u0092\u0001\u001a\u00020eH\u0016J\u0012\u0010\u0093\u0001\u001a\u00020e2\t\b\u0002\u0010\u0094\u0001\u001a\u00020GJ\t\u0010\u0095\u0001\u001a\u00020GH\u0004J\f\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0089\u0001H\u0016J\u0013\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0089\u00012\u0007\u0010\u0087\u0001\u001a\u00020\nJ\u0007\u0010\u0097\u0001\u001a\u00020GJ\t\u0010\u009d\u0001\u001a\u00020eH\u0004J\f\u0010\u009e\u0001\u001a\u0005\u0018\u00010\u009f\u0001H\u0002J\f\u0010 \u0001\u001a\u0005\u0018\u00010¡\u0001H\u0002J\u000b\u0010¢\u0001\u001a\u0004\u0018\u00010TH\u0002J\u0011\u0010£\u0001\u001a\u00020e2\u0006\u00104\u001a\u00020\nH\u0016J\u001c\u0010¤\u0001\u001a\u00020G2\u0006\u00104\u001a\u00020\n2\t\u0010¥\u0001\u001a\u0004\u0018\u00010cH\u0016J\u001c\u0010¦\u0001\u001a\u00020G2\u0006\u00104\u001a\u00020\n2\t\u0010¥\u0001\u001a\u0004\u0018\u00010cH\u0016J%\u0010§\u0001\u001a\u00020G2\u0006\u00104\u001a\u00020\n2\t\u0010¥\u0001\u001a\u0004\u0018\u00010c2\u0007\u0010¨\u0001\u001a\u00020lH\u0016J\u001d\u0010©\u0001\u001a\u00020G2\u0007\u0010ª\u0001\u001a\u00020\n2\t\u0010¥\u0001\u001a\u0004\u0018\u00010cH\u0016J\u001d\u0010«\u0001\u001a\u00020G2\u0007\u0010ª\u0001\u001a\u00020\n2\t\u0010¥\u0001\u001a\u0004\u0018\u00010cH\u0016J\r\u0010¬\u0001\u001a\u00020e*\u00020TH\u0004J\r\u0010\u00ad\u0001\u001a\u00020e*\u00020TH\u0004J\r\u0010®\u0001\u001a\u00020e*\u00020TH\u0004J\u001b\u0010¯\u0001\u001a\u00020e2\u000b\b\u0001\u0010°\u0001\u001a\u0004\u0018\u00010\nH\u0004¢\u0006\u0002\u0010^JK\u0010±\u0001\u001a\u00030²\u00012\n\b\u0002\u0010³\u0001\u001a\u00030´\u00012-\u0010µ\u0001\u001a(\b\u0001\u0012\u0005\u0012\u00030·\u0001\u0012\u000b\u0012\t\u0012\u0004\u0012\u00020e0¸\u0001\u0012\u0007\u0012\u0005\u0018\u00010¹\u00010¶\u0001¢\u0006\u0003\bº\u0001H\u0004¢\u0006\u0003\u0010»\u0001J,\u0010¼\u0001\u001a\u00020e2\u0007\u0010½\u0001\u001a\u00020\n2\u0014\u0010¾\u0001\u001a\u000b\u0012\u0006\b\u0001\u0012\u00020l0¿\u0001\"\u00020l¢\u0006\u0003\u0010À\u0001R\u001e\u0010\r\u001a\u00020\u000e8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\u0010\"\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0013\u001a\u00020\u00148F¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0017\u001a\u00020\u00188BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u0010\u001fR\u0014\u0010 \u001a\u00020!8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010#R\u0014\u0010$\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020)8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u000e\u0010,\u001a\u00020-X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00000/X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u00105\u001a\u0004\u0018\u0001068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b7\u00108R\u0017\u00109\u001a\b\u0012\u0004\u0012\u00020;0:8F¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0011\u0010>\u001a\u00020?8F¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0013\u0010B\u001a\u0004\u0018\u00010C8F¢\u0006\u0006\u001a\u0004\bD\u0010ER\u0014\u0010F\u001a\u00020GX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bH\u0010IR\u0014\u0010J\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bJ\u0010IR\u0014\u0010K\u001a\u00020G8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bL\u0010IR\u0014\u0010M\u001a\u00020GX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bN\u0010IR\u0014\u0010O\u001a\u00020GX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bP\u0010IR\u0014\u0010Q\u001a\u00020GX\u0096D¢\u0006\b\n\u0000\u001a\u0004\bR\u0010IR(\u0010U\u001a\u0004\u0018\u00010T2\b\u0010S\u001a\u0004\u0018\u00010T@DX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bV\u0010W\"\u0004\bX\u0010YR\"\u0010Z\u001a\u0004\u0018\u00010\n8\u0006@\u0006X\u0087\u000e¢\u0006\u0010\n\u0002\u0010_\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R\u0015\u0010~\u001a\u00020lX\u0096\u0004¢\u0006\t\n\u0000\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0013\u0010\u0098\u0001\u001a\u00020G8F¢\u0006\u0007\u001a\u0005\b\u0099\u0001\u0010IR\u0013\u0010\u009a\u0001\u001a\u00020G8F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010IR\u0013\u0010\u009c\u0001\u001a\u00020G8F¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010I¨\u0006Ã\u0001"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/common/ui/RxFragment;", "Lcom/robinhood/utils/ui/view/LifecycleViewBindings;", "Lcom/robinhood/android/common/util/UiCallbacks$ScreenViewAnalyticable;", "Lcom/robinhood/android/common/ui/RhFragment;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnDismissListener;", "Lcom/robinhood/android/common/ui/RhDialogFragment$OnClickListener;", "Lcom/robinhood/android/common/ui/RhBottomSheetDialogFragment$OnClickListener;", "Lcom/robinhood/utils/ui/fragment/PrimaryFragmentHost;", "layoutRes", "", "<init>", "(I)V", "singletons", "Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "getSingletons", "()Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;", "setSingletons", "(Lcom/robinhood/android/common/ui/di/BaseFragmentSingletons;)V", "navigator", "Lcom/robinhood/android/navigation/Navigator;", "getNavigator", "()Lcom/robinhood/android/navigation/Navigator;", "colorSchemeManager", "Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "getColorSchemeManager", "()Lcom/robinhood/android/designsystem/colorscheme/ColorSchemeManager;", "rhProcessLifecycleOwner", "Ldagger/Lazy;", "Lcom/robinhood/utils/RhProcessLifecycleOwner;", "getRhProcessLifecycleOwner", "()Ldagger/Lazy;", "dispatcherProvider", "Ldispatch/core/DispatcherProvider;", "getDispatcherProvider", "()Ldispatch/core/DispatcherProvider;", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "rxGlobalErrorHandler", "Lcom/robinhood/utils/RxGlobalErrorHandler;", "getRxGlobalErrorHandler", "()Lcom/robinhood/utils/RxGlobalErrorHandler;", "transitionReason", "Lcom/robinhood/android/common/util/TransitionReason;", "bindViewDelegate", "Lcom/robinhood/android/common/ui/BindViewDelegate;", "bindView", "Lkotlin/properties/ReadOnlyProperty;", "V", "Landroid/view/View;", "id", "baseActivity", "Lcom/robinhood/android/common/ui/BaseActivity;", "getBaseActivity", "()Lcom/robinhood/android/common/ui/BaseActivity;", "activityErrorHandler", "Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "", "getActivityErrorHandler", "()Lcom/robinhood/android/common/util/rx/ActivityErrorHandler;", "scarletManager", "Lcom/robinhood/scarlet/ScarletManager;", "getScarletManager", "()Lcom/robinhood/scarlet/ScarletManager;", "rhToolbar", "Lcom/robinhood/android/common/ui/view/RhToolbar;", "getRhToolbar", "()Lcom/robinhood/android/common/ui/view/RhToolbar;", "childFragmentsShouldNotConfigureToolbar", "", "getChildFragmentsShouldNotConfigureToolbar", "()Z", "isCrypto", "hasBottomBar", "getHasBottomBar", "useDesignSystemToolbar", "getUseDesignSystemToolbar", "toolbarVisible", "getToolbarVisible", "animateToolbarVisibility", "getAnimateToolbarVisibility", "value", "Lcom/robinhood/scarlet/ScarletContextWrapper;", "scarletContextWrapper", "getScarletContextWrapper", "()Lcom/robinhood/scarlet/ScarletContextWrapper;", "setScarletContextWrapper", "(Lcom/robinhood/scarlet/ScarletContextWrapper;)V", "menuIconTint", "getMenuIconTint", "()Ljava/lang/Integer;", "setMenuIconTint", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "onGetLayoutInflater", "Landroid/view/LayoutInflater;", "savedInstanceState", "Landroid/os/Bundle;", "onCreate", "", "onViewCreated", "view", "onResume", "onBackPressed", "setTransitionReason", "reason", "", "keyboardFocusOn", "editText", "Landroid/widget/EditText;", "showKeyboard", "onCreateOptionsMenu", "menu", "Landroid/view/Menu;", "inflater", "Landroid/view/MenuInflater;", "createOptionsMenu", "configureToolbar", "toolbar", "onCreateAnimation", "Landroid/view/animation/Animation;", "transit", "enter", "nextAnim", "screenName", "getScreenName", "()Ljava/lang/String;", "getAndResetTransitionReason", "requireBaseActivity", "requireToolbar", "setCurrentFragmentTransitionSuccess", "setCurrentFragmentTransitionReason", "setFragment", "containerId", "fragment", "Landroidx/fragment/app/Fragment;", "replaceFragment", "replaceFragmentWithoutAnimation", "setOrReplaceFragment", "replaceFragmentWithoutBackStack", "replaceFragmentWithoutAnimationAndBackStack", "replaceFragmentWithBackTransitionWithoutBackStack", "popFragments", "numberToPop", "popLastFragment", "popEntireFragmentBackstack", "immediate", "popNearestParentBackStack", "getCurrentFragment", "isCurrentFragmentCrypto", "useDesignSystemToolbarForCurrentFragment", "getUseDesignSystemToolbarForCurrentFragment", "currentFragmentHasBottomBar", "getCurrentFragmentHasBottomBar", "isInTabFragment", "notifyFragmentChanged", "getAnimationOverrider", "Lcom/robinhood/android/common/ui/BaseFragment$ChildFragmentAnimationOverrider;", "getParentTabFragment", "Lcom/robinhood/android/common/ui/BaseTabFragment;", "findParentScarletContextWrapper", "onDialogDismissed", "onPositiveButtonClicked", "passthroughArgs", "onNegativeButtonClicked", "onLinkTextClicked", "url", "onPrimaryButtonClicked", "dialogId", "onSecondaryButtonClicked", "putDesignSystemOverlay", "putAchromaticOverlay", "putGoldOverlay", "overrideMenuItemTint", "tint", "collectDuxoState", "Lkotlinx/coroutines/Job;", "state", "Landroidx/lifecycle/Lifecycle$State;", "block", "Lkotlin/Function2;", "Lkotlinx/coroutines/CoroutineScope;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/ExtensionFunctionType;", "(Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function2;)Lkotlinx/coroutines/Job;", "requestPermissionsCompat", "requestCode", "permissions", "", "(I[Ljava/lang/String;)V", "ChildFragmentAnimationOverrider", "Companion", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public class BaseFragment extends RxFragment implements LifecycleViewBindings, UiCallbacks.ScreenViewAnalyticable, RhFragment, RhDialogFragment.OnDismissListener, RhDialogFragment.OnClickListener, RhBottomSheetDialogFragment.OnClickListener, PrimaryFragmentHost {
    private static final String TAG_ROOT_FRAGMENT = "rootFrag";
    private final boolean animateToolbarVisibility;
    private final BindViewDelegate<BaseFragment> bindViewDelegate;
    private final boolean childFragmentsShouldNotConfigureToolbar;
    private Integer menuIconTint;
    private ScarletContextWrapper scarletContextWrapper;
    private final String screenName;
    public BaseFragmentSingletons singletons;
    private final boolean toolbarVisible;
    private final TransitionReason transitionReason;
    private final boolean useDesignSystemToolbar;
    public static final int $stable = 8;

    /* compiled from: BaseFragment.kt */
    @Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001R\u0014\u0010\u0002\u001a\u00020\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005R\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m3636d2 = {"Lcom/robinhood/android/common/ui/BaseFragment$ChildFragmentAnimationOverrider;", "", "shouldOverrideChildFragmentAnimation", "", "getShouldOverrideChildFragmentAnimation", "()Z", "forcedChildAnimationResId", "", "getForcedChildAnimationResId", "()Ljava/lang/Integer;", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public interface ChildFragmentAnimationOverrider {

        /* compiled from: BaseFragment.kt */
        @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        /* loaded from: classes2.dex */
        public static final class DefaultImpls {
            public static Integer getForcedChildAnimationResId(ChildFragmentAnimationOverrider childFragmentAnimationOverrider) {
                return null;
            }

            public static boolean getShouldOverrideChildFragmentAnimation(ChildFragmentAnimationOverrider childFragmentAnimationOverrider) {
                return false;
            }
        }

        Integer getForcedChildAnimationResId();

        boolean getShouldOverrideChildFragmentAnimation();
    }

    protected void createOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
    }

    public boolean getHasBottomBar() {
        return false;
    }

    /* renamed from: isCrypto */
    public boolean getIsCrypto() {
        return false;
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void addLifecycleAwareUpdateListener(ValueAnimator valueAnimator, ValueAnimator.AnimatorUpdateListener animatorUpdateListener) {
        LifecycleViewBindings.DefaultImpls.addLifecycleAwareUpdateListener(this, valueAnimator, animatorUpdateListener);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public ViewPropertyAnimator bind(ViewPropertyAnimator viewPropertyAnimator) {
        return LifecycleViewBindings.DefaultImpls.bind(this, viewPropertyAnimator);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bind(AnimatorSet animatorSet) {
        LifecycleViewBindings.DefaultImpls.bind(this, animatorSet);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bind(ValueAnimator valueAnimator) {
        LifecycleViewBindings.DefaultImpls.bind(this, valueAnimator);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bindAdapter(RecyclerView recyclerView, RecyclerView.Adapter<?> adapter) {
        LifecycleViewBindings.DefaultImpls.bindAdapter(this, recyclerView, adapter);
    }

    @Override // com.robinhood.utils.p409ui.view.LifecycleViewBindings
    public void bindAdapter(ViewPager2 viewPager2, FragmentStateAdapter fragmentStateAdapter) {
        LifecycleViewBindings.DefaultImpls.bindAdapter(this, viewPager2, fragmentStateAdapter);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getEntityId() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getEntityId(this);
    }

    public boolean getExcludeFromAnalyticsLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromAnalyticsLogging(this);
    }

    public boolean getExcludeFromSourceLogging() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getExcludeFromSourceLogging(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public Integer getScreenDepth() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDepth(this);
    }

    public String getScreenDescription() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenDescription(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenMessageType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenMessageType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenSource() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenSource(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenTag() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenTag(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getScreenType() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.getScreenType(this);
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    /* renamed from: isParentScreen */
    public boolean getIsParentScreen() {
        return UiCallbacks.ScreenViewAnalyticable.DefaultImpls.isParentScreen(this);
    }

    public boolean onLearnMoreActionClicked(int i, Bundle bundle) {
        return RhBottomSheetDialogFragment.OnClickListener.DefaultImpls.onLearnMoreActionClicked(this, i, bundle);
    }

    public BaseFragment(int i) {
        super(i);
        this.transitionReason = new TransitionReason();
        this.bindViewDelegate = new BindViewDelegate<>(new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.bindViewDelegate$lambda$0(this.f$0, ((Integer) obj).intValue());
            }
        });
        this.toolbarVisible = true;
        String simpleName = getClass().getSimpleName();
        Intrinsics.checkNotNullExpressionValue(simpleName, "getSimpleName(...)");
        this.screenName = simpleName;
    }

    public final BaseFragmentSingletons getSingletons() {
        BaseFragmentSingletons baseFragmentSingletons = this.singletons;
        if (baseFragmentSingletons != null) {
            return baseFragmentSingletons;
        }
        Intrinsics.throwUninitializedPropertyAccessException("singletons");
        return null;
    }

    public final void setSingletons(BaseFragmentSingletons baseFragmentSingletons) {
        Intrinsics.checkNotNullParameter(baseFragmentSingletons, "<set-?>");
        this.singletons = baseFragmentSingletons;
    }

    public final Navigator getNavigator() {
        return getSingletons().getNavigator();
    }

    private final ColorSchemeManager getColorSchemeManager() {
        return getSingletons().getColorSchemeManager();
    }

    private final Lazy<RhProcessLifecycleOwner> getRhProcessLifecycleOwner() {
        return getSingletons().getRhProcessLifecycleOwner$lib_common_externalRelease();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment
    public DispatcherProvider getDispatcherProvider() {
        return getSingletons().getDispatcherProvider();
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3
    public RxFactory getRxFactory() {
        return getSingletons().getRxFactory();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment
    public RxGlobalErrorHandler getRxGlobalErrorHandler() {
        return getSingletons().getRxGlobalErrorHandler();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final View bindViewDelegate$lambda$0(BaseFragment baseFragment, int i) {
        return baseFragment.requireView().findViewById(i);
    }

    @Deprecated
    protected final <V extends View> Interfaces2<BaseFragment, V> bindView(int id) {
        return this.bindViewDelegate.getView(id);
    }

    public BaseActivity getBaseActivity() {
        return (BaseActivity) getActivity();
    }

    public final ActivityErrorHandler getActivityErrorHandler() {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        return baseActivity.getActivityErrorHandler();
    }

    public final ScarletManager getScarletManager() {
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        return ScarletManager2.getScarletManager(contextRequireContext);
    }

    public final RhToolbar getRhToolbar() {
        BaseActivity baseActivity = getBaseActivity();
        Intrinsics.checkNotNull(baseActivity);
        return baseActivity.getRhToolbar();
    }

    public boolean getChildFragmentsShouldNotConfigureToolbar() {
        return this.childFragmentsShouldNotConfigureToolbar;
    }

    public boolean getUseDesignSystemToolbar() {
        return this.useDesignSystemToolbar;
    }

    public boolean getToolbarVisible() {
        return this.toolbarVisible;
    }

    public boolean getAnimateToolbarVisibility() {
        return this.animateToolbarVisibility;
    }

    public final ScarletContextWrapper getScarletContextWrapper() {
        return this.scarletContextWrapper;
    }

    protected final void setScarletContextWrapper(ScarletContextWrapper scarletContextWrapper) {
        this.scarletContextWrapper = scarletContextWrapper;
    }

    public final Integer getMenuIconTint() {
        return this.menuIconTint;
    }

    public final void setMenuIconTint(Integer num) {
        this.menuIconTint = num;
    }

    @Override // androidx.fragment.app.Fragment
    public LayoutInflater onGetLayoutInflater(Bundle savedInstanceState) {
        LayoutInflater layoutInflater;
        requireHost();
        ScarletContextWrapper scarletContextWrapper = this.scarletContextWrapper;
        if (scarletContextWrapper != null && (layoutInflater = ContextSystemServices.getLayoutInflater(scarletContextWrapper)) != null) {
            return layoutInflater;
        }
        ScarletContextWrapper scarletContextWrapperFindParentScarletContextWrapper = findParentScarletContextWrapper();
        if (scarletContextWrapperFindParentScarletContextWrapper != null) {
            return ContextSystemServices.getLayoutInflater(scarletContextWrapperFindParentScarletContextWrapper);
        }
        LayoutInflater layoutInflaterOnGetLayoutInflater = super.onGetLayoutInflater(savedInstanceState);
        Intrinsics.checkNotNullExpressionValue(layoutInflaterOnGetLayoutInflater, "onGetLayoutInflater(...)");
        return layoutInflaterOnGetLayoutInflater;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (isInTabFragment()) {
            getChildFragmentManager().addOnBackStackChangedListener(new FragmentManager.OnBackStackChangedListener() { // from class: com.robinhood.android.common.ui.BaseFragment.onCreate.1
                @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
                public /* bridge */ /* synthetic */ void onBackStackChangeCancelled() {
                    super.onBackStackChangeCancelled();
                }

                @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
                public /* bridge */ /* synthetic */ void onBackStackChangeCommitted(Fragment fragment, boolean z) {
                    super.onBackStackChangeCommitted(fragment, z);
                }

                @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
                public /* bridge */ /* synthetic */ void onBackStackChangeProgressed(BackEventCompat backEventCompat) {
                    super.onBackStackChangeProgressed(backEventCompat);
                }

                @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
                public /* bridge */ /* synthetic */ void onBackStackChangeStarted(Fragment fragment, boolean z) {
                    super.onBackStackChangeStarted(fragment, z);
                }

                @Override // androidx.fragment.app.FragmentManager.OnBackStackChangedListener
                public final void onBackStackChanged() {
                    BaseFragment.this.notifyFragmentChanged();
                }
            });
        }
        LifecycleHost.DefaultImpls.bind$default(this, getColorSchemeManager().getChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.onCreate$lambda$1(this.f$0, (Tuples2) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onCreate$lambda$1(BaseFragment baseFragment, Tuples2 tuples2) {
        ScarletManager scarletManager;
        Intrinsics.checkNotNullParameter(tuples2, "<destruct>");
        ColorScheme colorScheme = (ColorScheme) tuples2.component1();
        boolean zBooleanValue = ((Boolean) tuples2.component2()).booleanValue();
        ScarletContextWrapper scarletContextWrapper = baseFragment.scarletContextWrapper;
        if (scarletContextWrapper == null || (scarletManager = ScarletManager2.getScarletManager(scarletContextWrapper)) == null) {
            return Unit.INSTANCE;
        }
        scarletManager.putOverlay(colorScheme, Boolean.valueOf(!zBooleanValue));
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        this.bindViewDelegate.onViewAvailable();
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Fragment parentFragment = getParentFragment();
        if (parentFragment != null && (parentFragment instanceof BaseFragment) && ((BaseFragment) parentFragment).getChildFragmentsShouldNotConfigureToolbar()) {
            return;
        }
        FragmentActivity activity = getActivity();
        if (activity instanceof BaseActivity) {
            BaseActivity baseActivity = (BaseActivity) activity;
            baseActivity.invalidateOptionsMenu();
            RhToolbar rhToolbar = baseActivity.getRhToolbar();
            if (rhToolbar != null) {
                configureToolbar(rhToolbar);
            }
        }
    }

    public boolean onBackPressed() {
        ActivityResultCaller currentFragment = getCurrentFragment();
        RhFragment rhFragment = currentFragment instanceof RhFragment ? (RhFragment) currentFragment : null;
        if (rhFragment != null && rhFragment.onBackPressed()) {
            return true;
        }
        setCurrentFragmentTransitionReason("cancel");
        return !getChildFragmentManager().isStateSaved() && getChildFragmentManager().popBackStackImmediate();
    }

    public final void setTransitionReason(String reason) {
        Intrinsics.checkNotNullParameter(reason, "reason");
        this.transitionReason.setTransitionReason(reason);
    }

    public static /* synthetic */ void keyboardFocusOn$default(BaseFragment baseFragment, EditText editText, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: keyboardFocusOn");
        }
        if ((i & 2) != 0) {
            z = true;
        }
        baseFragment.keyboardFocusOn(editText, z);
    }

    public final void keyboardFocusOn(final EditText editText, final boolean showKeyboard) {
        Intrinsics.checkNotNullParameter(editText, "editText");
        Observable<Long> observableTimer = Observable.timer(100L, TimeUnit.MILLISECONDS);
        Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.keyboardFocusOn$lambda$2(editText, showKeyboard, this, (Long) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit keyboardFocusOn$lambda$2(EditText editText, boolean z, BaseFragment baseFragment, Long l) {
        editText.requestFocus();
        if (z) {
            FragmentActivity fragmentActivityRequireActivity = baseFragment.requireActivity();
            Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
            ContextsUiExtensions.showKeyboard$default(fragmentActivityRequireActivity, editText, false, 2, null);
        }
        return Unit.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreateOptionsMenu(Menu menu, MenuInflater inflater) {
        Intrinsics.checkNotNullParameter(menu, "menu");
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        super.onCreateOptionsMenu(menu, inflater);
        createOptionsMenu(menu, inflater);
        TypefaceUtils typefaceUtils = TypefaceUtils.INSTANCE;
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        TypefaceUtils.applyFontToMenu$default(typefaceUtils, fragmentActivityRequireActivity, menu, null, 4, null);
    }

    public void configureToolbar(RhToolbar toolbar) {
        Intrinsics.checkNotNullParameter(toolbar, "toolbar");
        boolean toolbarVisible = getToolbarVisible();
        if (toolbarVisible != (toolbar.getVisibility() == 0)) {
            ViewParent parent = toolbar.getParent();
            Intrinsics.checkNotNull(parent, "null cannot be cast to non-null type android.view.ViewGroup");
            ViewGroup viewGroup = (ViewGroup) parent;
            if (getAnimateToolbarVisibility()) {
                SimpleSlide simpleSlide = new SimpleSlide(48);
                simpleSlide.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.ui.BaseFragment$configureToolbar$$inlined$beginDelayedTransition$1
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                        IdlingResourceCounters2.increment(IdlingResourceType.DELAYED_TRANSITION);
                    }
                });
                simpleSlide.addListener(new Transition.TransitionListener() { // from class: com.robinhood.android.common.ui.BaseFragment$configureToolbar$$inlined$beginDelayedTransition$2
                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionCancel(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionPause(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionResume(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionStart(Transition transition) {
                    }

                    @Override // android.transition.Transition.TransitionListener
                    public void onTransitionEnd(Transition transition) {
                        IdlingResourceCounters2.decrement(IdlingResourceType.DELAYED_TRANSITION);
                    }
                });
                simpleSlide.addTarget(toolbar);
                simpleSlide.setInterpolator(Interpolators.INSTANCE.getFastOutSlowIn());
                TransitionManager.beginDelayedTransition(viewGroup, simpleSlide);
            }
            toolbar.setVisibility(toolbarVisible ? 0 : 8);
        }
        toolbar.setVisibility(getToolbarVisible() ? 0 : 8);
        toolbar.reset();
    }

    @Override // androidx.fragment.app.Fragment
    public Animation onCreateAnimation(int transit, boolean enter, int nextAnim) throws Resources.NotFoundException {
        ChildFragmentAnimationOverrider animationOverrider = getAnimationOverrider();
        boolean shouldOverrideChildFragmentAnimation = animationOverrider != null ? animationOverrider.getShouldOverrideChildFragmentAnimation() : false;
        Integer forcedChildAnimationResId = animationOverrider != null ? animationOverrider.getForcedChildAnimationResId() : null;
        if (!shouldOverrideChildFragmentAnimation) {
            return super.onCreateAnimation(transit, enter, nextAnim);
        }
        if (forcedChildAnimationResId != null) {
            Animation animationLoadAnimation = AnimationUtils.loadAnimation(getContext(), forcedChildAnimationResId.intValue());
            if (animationLoadAnimation != null) {
                return animationLoadAnimation;
            }
        }
        return new Animation() { // from class: com.robinhood.android.common.ui.BaseFragment.onCreateAnimation.2
        };
    }

    public String getScreenName() {
        return this.screenName;
    }

    @Override // com.robinhood.android.common.util.UiCallbacks.ScreenViewAnalyticable
    public String getAndResetTransitionReason() {
        return this.transitionReason.getAndResetTransitionReason();
    }

    public final BaseActivity requireBaseActivity() {
        BaseActivity baseActivity = getBaseActivity();
        if (baseActivity != null) {
            return baseActivity;
        }
        throw new IllegalArgumentException(("Fragment " + this + " not attached to a BaseActivity.").toString());
    }

    public final RhToolbar requireToolbar() {
        RhToolbar rhToolbar = getRhToolbar();
        if (rhToolbar != null) {
            return rhToolbar;
        }
        throw new IllegalArgumentException(("Fragment " + this + " does not have a toolbar").toString());
    }

    protected final void setCurrentFragmentTransitionSuccess() {
        setCurrentFragmentTransitionReason("success");
    }

    protected final void setCurrentFragmentTransitionReason(String transitionReason) {
        Intrinsics.checkNotNullParameter(transitionReason, "transitionReason");
        Fragment currentFragment = getCurrentFragment();
        BaseFragment baseFragment = currentFragment instanceof BaseFragment ? (BaseFragment) currentFragment : null;
        if (baseFragment != null) {
            baseFragment.setTransitionReason(transitionReason);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void setFragment(int containerId, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (isRemoving() || getChildFragmentManager().isStateSaved()) {
            return;
        }
        getChildFragmentManager().beginTransaction().add(containerId, fragment, TAG_ROOT_FRAGMENT).commit();
    }

    public final int replaceFragment(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new ReplaceFragmentBuilder(fragment).buildAndExecute(this);
    }

    public final int replaceFragmentWithoutAnimation(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new ReplaceFragmentBuilder(fragment).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    public final void setOrReplaceFragment(int containerId, Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        if (getChildFragmentManager().getFragments().isEmpty()) {
            setFragment(containerId, fragment);
        } else {
            replaceFragment(fragment);
        }
    }

    public final int replaceFragmentWithoutBackStack(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new ReplaceFragmentBuilder(fragment).setAddToBackstack(false).buildAndExecute(this);
    }

    public final int replaceFragmentWithoutAnimationAndBackStack(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        return new ReplaceFragmentBuilder(fragment).setAddToBackstack(false).setUseDefaultAnimation(false).buildAndExecute(this);
    }

    public final void replaceFragmentWithBackTransitionWithoutBackStack(Fragment fragment) {
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        new ReplaceFragmentBuilder(fragment).setAddToBackstack(false).setUseDefaultAnimation(false).setModifier(new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.replaceFragmentWithBackTransitionWithoutBackStack$lambda$7((FragmentTransaction) obj);
            }
        }).buildAndExecute(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit replaceFragmentWithBackTransitionWithoutBackStack$lambda$7(FragmentTransaction ft) {
        Intrinsics.checkNotNullParameter(ft, "ft");
        ft.setCustomAnimations(C22231R.anim.frag_enter_left, C22231R.anim.frag_exit_right);
        return Unit.INSTANCE;
    }

    protected final void popFragments(int numberToPop) {
        if (numberToPop == 0) {
            throw new IllegalArgumentException("Can't pop 0 fragments");
        }
        if (isRemoving() || getChildFragmentManager().isStateSaved()) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        int backStackEntryCount = childFragmentManager.getBackStackEntryCount();
        if (backStackEntryCount >= numberToPop) {
            setCurrentFragmentTransitionReason("cancel");
            FragmentManager.BackStackEntry backStackEntryAt = childFragmentManager.getBackStackEntryAt(backStackEntryCount - numberToPop);
            Intrinsics.checkNotNullExpressionValue(backStackEntryAt, "getBackStackEntryAt(...)");
            childFragmentManager.popBackStack(backStackEntryAt.getId(), 1);
        }
    }

    public void popLastFragment() {
        if (isRemoving() || getChildFragmentManager().isStateSaved()) {
            return;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        if (childFragmentManager.getBackStackEntryCount() > 0) {
            setCurrentFragmentTransitionReason("cancel");
            childFragmentManager.popBackStack();
        }
    }

    public static /* synthetic */ void popEntireFragmentBackstack$default(BaseFragment baseFragment, boolean z, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: popEntireFragmentBackstack");
        }
        if ((i & 1) != 0) {
            z = false;
        }
        baseFragment.popEntireFragmentBackstack(z);
    }

    public final void popEntireFragmentBackstack(boolean immediate) {
        if (getChildFragmentManager().isStateSaved()) {
            return;
        }
        if (immediate) {
            getChildFragmentManager().popBackStackImmediate((String) null, 1);
        } else {
            getChildFragmentManager().popBackStack((String) null, 1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean popNearestParentBackStack() {
        Fragment next;
        Iterator<Fragment> it = Fragments2.parentFragments(this).iterator2();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (next.getParentFragmentManager().getBackStackEntryCount() > 0) {
                break;
            }
        }
        Fragment fragment = next;
        if (fragment == null) {
            return false;
        }
        fragment.getParentFragmentManager().popBackStack();
        return true;
    }

    @Override // com.robinhood.utils.p409ui.fragment.PrimaryFragmentHost
    public Fragment getCurrentFragment() {
        return getCurrentFragment(C11048R.id.fragment_container);
    }

    public final Fragment getCurrentFragment(int containerId) {
        if (getContext() == null) {
            return null;
        }
        FragmentManager childFragmentManager = getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(childFragmentManager, "getChildFragmentManager(...)");
        Fragment fragmentFindFragmentById = childFragmentManager.findFragmentById(containerId);
        return fragmentFindFragmentById == null ? childFragmentManager.findFragmentByTag(TAG_ROOT_FRAGMENT) : fragmentFindFragmentById;
    }

    public final boolean isCurrentFragmentCrypto() {
        Fragment currentFragment = getCurrentFragment();
        BaseFragment baseFragment = currentFragment instanceof BaseFragment ? (BaseFragment) currentFragment : null;
        if (baseFragment != null) {
            return baseFragment.getIsCrypto();
        }
        return false;
    }

    public final boolean getUseDesignSystemToolbarForCurrentFragment() {
        Fragment currentFragment = getCurrentFragment();
        BaseFragment baseFragment = currentFragment instanceof BaseFragment ? (BaseFragment) currentFragment : null;
        if (baseFragment != null) {
            return baseFragment.getUseDesignSystemToolbar();
        }
        return false;
    }

    public final boolean getCurrentFragmentHasBottomBar() {
        Fragment currentFragment = getCurrentFragment();
        BaseFragment baseFragment = currentFragment instanceof BaseFragment ? (BaseFragment) currentFragment : null;
        if (baseFragment != null) {
            return baseFragment.getHasBottomBar();
        }
        return false;
    }

    public final boolean isInTabFragment() {
        return getParentTabFragment() != null;
    }

    protected final void notifyFragmentChanged() {
        BaseTabFragment parentTabFragment;
        if (this instanceof BaseTabFragment) {
            parentTabFragment = (BaseTabFragment) this;
        } else {
            parentTabFragment = getParentTabFragment();
            Intrinsics.checkNotNull(parentTabFragment);
        }
        KeyEventDispatcher.Component componentRequireActivity = requireActivity();
        Intrinsics.checkNotNull(componentRequireActivity, "null cannot be cast to non-null type com.robinhood.android.common.tabs.TabManager");
        ((TabManager) componentRequireActivity).onFragmentChanged(parentTabFragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final ChildFragmentAnimationOverrider getAnimationOverrider() {
        Fragment parentFragment = getParentFragment();
        while (!(parentFragment instanceof ChildFragmentAnimationOverrider)) {
            parentFragment = parentFragment != 0 ? parentFragment.getParentFragment() : 0;
            if (parentFragment == 0) {
                return null;
            }
        }
        return (ChildFragmentAnimationOverrider) parentFragment;
    }

    private final BaseTabFragment getParentTabFragment() {
        Fragment parentFragment = getParentFragment();
        while (!(parentFragment instanceof BaseTabFragment)) {
            parentFragment = parentFragment != null ? parentFragment.getParentFragment() : null;
            if (parentFragment == null) {
                return null;
            }
        }
        return (BaseTabFragment) parentFragment;
    }

    private final ScarletContextWrapper findParentScarletContextWrapper() {
        Sequence sequenceFilter = SequencesKt.filter(Fragments2.parentFragments(this), new Function1<Object, Boolean>() { // from class: com.robinhood.android.common.ui.BaseFragment$findParentScarletContextWrapper$$inlined$filterIsInstance$1
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Object obj) {
                return Boolean.valueOf(obj instanceof BaseFragment);
            }
        });
        Intrinsics.checkNotNull(sequenceFilter, "null cannot be cast to non-null type kotlin.sequences.Sequence<R of kotlin.sequences.SequencesKt___SequencesKt.filterIsInstance>");
        BaseFragment baseFragment = (BaseFragment) SequencesKt.firstOrNull(SequencesKt.filter(sequenceFilter, new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(BaseFragment.findParentScarletContextWrapper$lambda$9((BaseFragment) obj));
            }
        }));
        if (baseFragment != null) {
            return baseFragment.scarletContextWrapper;
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean findParentScarletContextWrapper$lambda$9(BaseFragment it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return it.scarletContextWrapper != null;
    }

    public void onDialogDismissed(int id) {
        ActivityResultCaller currentFragment = getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof RhDialogFragment.OnDismissListener)) {
            ((RhDialogFragment.OnDismissListener) currentFragment).onDialogDismissed(id);
        }
    }

    public boolean onPositiveButtonClicked(int id, Bundle passthroughArgs) {
        ActivityResultCaller currentFragment = getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof RhDialogFragment.OnClickListener)) {
            return ((RhDialogFragment.OnClickListener) currentFragment).onPositiveButtonClicked(id, passthroughArgs);
        }
        return false;
    }

    public boolean onNegativeButtonClicked(int id, Bundle passthroughArgs) {
        ActivityResultCaller currentFragment = getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof RhDialogFragment.OnClickListener)) {
            return ((RhDialogFragment.OnClickListener) currentFragment).onNegativeButtonClicked(id, passthroughArgs);
        }
        return false;
    }

    @Override // com.robinhood.android.common.ui.RhDialogFragment.OnClickListener
    public boolean onLinkTextClicked(int id, Bundle passthroughArgs, String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        ActivityResultCaller currentFragment = getCurrentFragment();
        if (currentFragment != null && (currentFragment instanceof RhDialogFragment.OnClickListener)) {
            return ((RhDialogFragment.OnClickListener) currentFragment).onLinkTextClicked(id, passthroughArgs, url);
        }
        return false;
    }

    public boolean onPrimaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        ActivityResultCaller currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        boolean zOnPrimaryButtonClicked = currentFragment instanceof RhBottomSheetDialogFragment.OnClickListener ? ((RhBottomSheetDialogFragment.OnClickListener) currentFragment).onPrimaryButtonClicked(dialogId, passthroughArgs) : false;
        if (zOnPrimaryButtonClicked || !(currentFragment instanceof RhBottomSheetDialogFragmentHost)) {
            return zOnPrimaryButtonClicked;
        }
        RhBottomSheetDialogFragmentHost.SheetListener sheetListener = ((RhBottomSheetDialogFragmentHost) currentFragment).getSheetListener();
        if (sheetListener != null) {
            return sheetListener.onPrimaryButtonClicked(dialogId, passthroughArgs);
        }
        return false;
    }

    public boolean onSecondaryButtonClicked(int dialogId, Bundle passthroughArgs) {
        ActivityResultCaller currentFragment = getCurrentFragment();
        if (currentFragment == null) {
            return false;
        }
        boolean zOnSecondaryButtonClicked = currentFragment instanceof RhBottomSheetDialogFragment.OnClickListener ? ((RhBottomSheetDialogFragment.OnClickListener) currentFragment).onSecondaryButtonClicked(dialogId, passthroughArgs) : false;
        if (zOnSecondaryButtonClicked || !(currentFragment instanceof RhBottomSheetDialogFragmentHost)) {
            return zOnSecondaryButtonClicked;
        }
        RhBottomSheetDialogFragmentHost.SheetListener sheetListener = ((RhBottomSheetDialogFragmentHost) currentFragment).getSheetListener();
        if (sheetListener != null) {
            return sheetListener.onSecondaryButtonClicked(dialogId, passthroughArgs);
        }
        return false;
    }

    protected final void putDesignSystemOverlay(final ScarletContextWrapper scarletContextWrapper) {
        Intrinsics.checkNotNullParameter(scarletContextWrapper, "<this>");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), DesignSystemOverlay.INSTANCE, null, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.putDesignSystemOverlay$lambda$10(scarletContextWrapper, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit putDesignSystemOverlay$lambda$10(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    protected final void putAchromaticOverlay(final ScarletContextWrapper scarletContextWrapper) {
        Intrinsics.checkNotNullParameter(scarletContextWrapper, "<this>");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), AchromaticOverlay.INSTANCE, null, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.putAchromaticOverlay$lambda$11(scarletContextWrapper, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit putAchromaticOverlay$lambda$11(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    protected final void putGoldOverlay(final ScarletContextWrapper scarletContextWrapper) {
        Intrinsics.checkNotNullParameter(scarletContextWrapper, "<this>");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), GoldOverlay.INSTANCE, null, 2, null);
        LifecycleHost.DefaultImpls.bind$default(this, Contexts7.requireBaseActivityBaseContext(scarletContextWrapper).getDayNightStyleChanges(), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.ui.BaseFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return BaseFragment.putGoldOverlay$lambda$12(scarletContextWrapper, (DayNightOverlay) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit putGoldOverlay$lambda$12(ScarletContextWrapper scarletContextWrapper, DayNightOverlay dayNightOverlay) {
        Intrinsics.checkNotNullParameter(dayNightOverlay, "dayNightOverlay");
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(scarletContextWrapper), dayNightOverlay, null, 2, null);
        return Unit.INSTANCE;
    }

    protected final void overrideMenuItemTint(Integer tint) {
        this.menuIconTint = tint;
        Context contextRequireContext = requireContext();
        Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
        Contexts7.requireBaseActivityBaseContext(contextRequireContext).invalidateMenuItemTint();
    }

    public static /* synthetic */ Job collectDuxoState$default(BaseFragment baseFragment, Lifecycle.State state, Function2 function2, int i, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: collectDuxoState");
        }
        if ((i & 1) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return baseFragment.collectDuxoState(state, function2);
    }

    /* compiled from: BaseFragment.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseFragment$collectDuxoState$1", m3645f = "BaseFragment.kt", m3646l = {603}, m3647m = "invokeSuspend")
    /* renamed from: com.robinhood.android.common.ui.BaseFragment$collectDuxoState$1 */
    static final class C118311 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
        final /* synthetic */ Lifecycle.State $state;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C118311(Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super C118311> continuation) {
            super(2, continuation);
            this.$state = state;
            this.$block = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return BaseFragment.this.new C118311(this.$state, this.$block, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C118311) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        /* compiled from: BaseFragment.kt */
        @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
        @DebugMetadata(m3644c = "com.robinhood.android.common.ui.BaseFragment$collectDuxoState$1$1", m3645f = "BaseFragment.kt", m3646l = {603}, m3647m = "invokeSuspend")
        /* renamed from: com.robinhood.android.common.ui.BaseFragment$collectDuxoState$1$1, reason: invalid class name */
        static final class AnonymousClass1 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
            final /* synthetic */ Function2<CoroutineScope, Continuation<? super Unit>, Object> $block;
            private /* synthetic */ Object L$0;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2, Continuation<? super AnonymousClass1> continuation) {
                super(2, continuation);
                this.$block = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, continuation);
                anonymousClass1.L$0 = obj;
                return anonymousClass1;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
                return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
            public final Object invokeSuspend(Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i = this.label;
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                    Function2<CoroutineScope, Continuation<? super Unit>, Object> function2 = this.$block;
                    this.label = 1;
                    if (function2.invoke(coroutineScope, this) == coroutine_suspended) {
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

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            if (i == 0) {
                ResultKt.throwOnFailure(obj);
                LifecycleOwner viewLifecycleOwner = BaseFragment.this.getViewLifecycleOwner();
                Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
                Lifecycle.State state = this.$state;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$block, null);
                this.label = 1;
                if (RepeatOnLifecycle.repeatOnLifecycle(viewLifecycleOwner, state, anonymousClass1, this) == coroutine_suspended) {
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

    protected final Job collectDuxoState(Lifecycle.State state, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> block) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(block, "block");
        LifecycleOwner viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        return BuildersKt__Builders_commonKt.launch$default(LifecycleOwner2.getLifecycleScope(viewLifecycleOwner), null, null, new C118311(state, block, null), 3, null);
    }

    public final void requestPermissionsCompat(int requestCode, String... permissions) {
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        getRhProcessLifecycleOwner().get().useExtendedTimeout();
        requestPermissions(permissions, requestCode);
    }
}
