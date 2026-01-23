package com.robinhood.android.common.p088ui;

import android.view.View;
import androidx.fragment.app.Fragment;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.disposer.LifecycleEvent;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: ViewBinding.kt */
@Metadata(m3635d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0001*\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u0002H\u00010\u0003B9\u0012\u000e\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000b¢\u0006\u0004\b\r\u0010\u000eJ\"\u0010\u0013\u001a\u00028\u00002\u0006\u0010\u0014\u001a\u00020\u00042\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0016H\u0096\u0002¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0002R\u0016\u0010\u0005\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00028\u00000\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u000f\u001a\u0004\u0018\u00018\u0000X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u0010R\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/common/ui/FragmentViewBindingProperty;", "T", "", "Lkotlin/properties/ReadOnlyProperty;", "Landroidx/fragment/app/Fragment;", "callingClass", "Ljava/lang/Class;", "lifecycleEvents", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/disposer/LifecycleEvent;", "factory", "Lkotlin/Function1;", "Landroid/view/View;", "<init>", "(Ljava/lang/Class;Lcom/jakewharton/rxrelay2/BehaviorRelay;Lkotlin/jvm/functions/Function1;)V", "binding", "Ljava/lang/Object;", "disposable", "Lio/reactivex/disposables/Disposable;", "getValue", "thisRef", "property", "Lkotlin/reflect/KProperty;", "(Landroidx/fragment/app/Fragment;Lkotlin/reflect/KProperty;)Ljava/lang/Object;", "checkViewIsAvailable", "", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.common.ui.FragmentViewBindingProperty, reason: use source file name */
/* loaded from: classes17.dex */
public final class ViewBinding3<T> implements Interfaces2<Fragment, T> {
    public static final int $stable = 8;
    private T binding;
    private final Class<? extends Fragment> callingClass;
    private Disposable disposable;
    private final Function1<View, T> factory;
    private final BehaviorRelay<LifecycleEvent> lifecycleEvents;

    /* compiled from: ViewBinding.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.common.ui.FragmentViewBindingProperty$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LifecycleEvent.values().length];
            try {
                iArr[LifecycleEvent.ON_ATTACH.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LifecycleEvent.ON_CREATE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LifecycleEvent.ON_CREATE_VIEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LifecycleEvent.ON_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LifecycleEvent.ON_RESUME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LifecycleEvent.ON_PAUSE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LifecycleEvent.ON_STOP.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LifecycleEvent.ON_DESTROY_VIEW.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LifecycleEvent.ON_DESTROY.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LifecycleEvent.ON_DETACH.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewBinding3(Class<? extends Fragment> callingClass, BehaviorRelay<LifecycleEvent> lifecycleEvents, Function1<? super View, ? extends T> factory) {
        Intrinsics.checkNotNullParameter(callingClass, "callingClass");
        Intrinsics.checkNotNullParameter(lifecycleEvents, "lifecycleEvents");
        Intrinsics.checkNotNullParameter(factory, "factory");
        this.callingClass = callingClass;
        this.lifecycleEvents = lifecycleEvents;
        this.factory = factory;
    }

    @Override // kotlin.properties.Interfaces2
    public /* bridge */ /* synthetic */ Object getValue(Fragment fragment, KProperty kProperty) {
        return getValue2(fragment, (KProperty<?>) kProperty);
    }

    /* renamed from: getValue, reason: avoid collision after fix types in other method */
    public T getValue2(Fragment thisRef, KProperty<?> property) {
        Intrinsics.checkNotNullParameter(thisRef, "thisRef");
        Intrinsics.checkNotNullParameter(property, "property");
        T t = this.binding;
        if (t != null) {
            return t;
        }
        checkViewIsAvailable();
        Disposable disposable = this.disposable;
        if (disposable != null) {
            disposable.dispose();
        }
        this.disposable = this.lifecycleEvents.filter(new Predicate() { // from class: com.robinhood.android.common.ui.FragmentViewBindingProperty.getValue.2
            @Override // io.reactivex.functions.Predicate
            public final boolean test(LifecycleEvent it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return it == LifecycleEvent.ON_DESTROY_VIEW;
            }
        }).take(1L).subscribe(new Consumer(this) { // from class: com.robinhood.android.common.ui.FragmentViewBindingProperty.getValue.3
            final /* synthetic */ ViewBinding3<T> this$0;

            {
                this.this$0 = this;
            }

            @Override // io.reactivex.functions.Consumer
            public final void accept(LifecycleEvent lifecycleEvent) {
                ((ViewBinding3) this.this$0).binding = null;
            }
        });
        Function1<View, T> function1 = this.factory;
        View viewRequireView = thisRef.requireView();
        Intrinsics.checkNotNullExpressionValue(viewRequireView, "requireView(...)");
        T tInvoke = function1.invoke(viewRequireView);
        this.binding = tInvoke;
        return tInvoke;
    }

    private final void checkViewIsAvailable() {
        LifecycleEvent value = this.lifecycleEvents.getValue();
        switch (value == null ? -1 : WhenMappings.$EnumSwitchMapping$0[value.ordinal()]) {
            case -1:
            case 1:
            case 2:
                throw new ViewBinding4(this.callingClass, value, "Fragment hasn't initialized yet");
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
                return;
            case 8:
            case 9:
            case 10:
                throw new ViewBinding4(this.callingClass, value, "Fragment view is being destroyed; cannot bind view");
        }
    }
}
