package com.robinhood.android.designsystem.sparkle;

import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.Xfermode;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.shapes.Shape;
import android.util.AttributeSet;
import android.util.SizeF;
import android.view.View;
import androidx.core.view.KeyEventDispatcher;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.gold.sparkle.SparkleManager;
import com.robinhood.android.graphics.Gradient;
import com.robinhood.android.graphics.Gradient3;
import com.robinhood.android.graphics.Matrices;
import com.robinhood.coroutines.p287rx.RxFactory;
import com.robinhood.coroutines.p287rx.RxFactory3;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.LifecycleState;
import com.robinhood.hammer.android.application.ApplicationComponentManagerHolder;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.p409ui.context.BaseContexts;
import io.reactivex.Completable;
import io.reactivex.Maybe;
import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.Single;
import io.reactivex.disposables.Disposable;
import io.reactivex.disposables.Disposables;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.rxkotlin.Observables;
import kotlin.Inference;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.channels.Produce4;
import kotlinx.coroutines.flow.Flow;

/* compiled from: SparkleDrawable.kt */
@Metadata(m3635d1 = {"\u0000Â\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 d2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0002cdB+\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\b\u0003\u0010\u000b\u001a\u00020\f¢\u0006\u0004\b\r\u0010\u000eJ\b\u0010F\u001a\u00020GH\u0002J\b\u0010H\u001a\u00020GH\u0002J\b\u0010I\u001a\u00020GH\u0002J\b\u0010J\u001a\u00020\"H\u0016J\b\u0010K\u001a\u00020\fH\u0016J\u0010\u0010L\u001a\u00020G2\u0006\u0010M\u001a\u00020\fH\u0016J\u0012\u0010N\u001a\u00020G2\b\u0010O\u001a\u0004\u0018\u00010PH\u0016J\u0012\u0010Q\u001a\u00020G2\b\u0010R\u001a\u0004\u0018\u00010SH\u0016J\u0012\u0010T\u001a\u00020G2\b\u0010U\u001a\u0004\u0018\u00010@H\u0016J\u0010\u0010V\u001a\u00020G2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010W\u001a\u00020G2\u0006\u0010\u0005\u001a\u00020\u0006H\u0016J\u0010\u0010X\u001a\u00020G2\u0006\u0010Y\u001a\u00020ZH\u0014J\u0010\u0010[\u001a\u00020G2\u0006\u0010\\\u001a\u00020]H\u0016J\u0010\u0010^\u001a\u00020\"2\u0006\u0010_\u001a\u00020.H\u0014J\u0010\u0010`\u001a\u00020G2\u0006\u0010a\u001a\u00020bH\u0016R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010\u000f\u001a\u00020\u00108\u0016@\u0016X\u0097.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001e\u0010\u0015\u001a\u00020\u00168\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010 \u001a\u0010\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"0!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0082\u000e¢\u0006\u0002\n\u0000R2\u0010&\u001a&\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\" #*\u0012\u0012\f\u0012\n #*\u0004\u0018\u00010\"0\"\u0018\u00010\u001c0\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010*\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R$\u0010\u0007\u001a\u00020\b2\u0006\u0010/\u001a\u00020\b@FX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R(\u00105\u001a\u0004\u0018\u0001042\b\u0010/\u001a\u0004\u0018\u0001048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b6\u00107\"\u0004\b8\u00109R(\u0010;\u001a\u0004\u0018\u00010:2\b\u0010/\u001a\u0004\u0018\u00010:@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b<\u0010=\"\u0004\b>\u0010?R(\u0010A\u001a\u0004\u0018\u00010@2\b\u0010/\u001a\u0004\u0018\u00010@@VX\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bB\u0010C\"\u0004\bD\u0010E¨\u0006e"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "Landroid/graphics/drawable/Drawable;", "Lcom/robinhood/android/designsystem/sparkle/Sparkleable;", "Landroid/view/View$OnAttachStateChangeListener;", "Lcom/robinhood/coroutines/rx/RxFactoryHost;", "view", "Landroid/view/View;", "shape", "Landroid/graphics/drawable/shapes/Shape;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/view/View;Landroid/graphics/drawable/shapes/Shape;Landroid/util/AttributeSet;I)V", "rxFactory", "Lcom/robinhood/coroutines/rx/RxFactory;", "getRxFactory", "()Lcom/robinhood/coroutines/rx/RxFactory;", "setRxFactory", "(Lcom/robinhood/coroutines/rx/RxFactory;)V", "sparkleManager", "Lcom/robinhood/android/gold/sparkle/SparkleManager;", "getSparkleManager", "()Lcom/robinhood/android/gold/sparkle/SparkleManager;", "setSparkleManager", "(Lcom/robinhood/android/gold/sparkle/SparkleManager;)V", "translation", "Lio/reactivex/Observable;", "Landroid/graphics/PointF;", "displayDimensions", "Landroid/util/SizeF;", "isSparkling", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "", "kotlin.jvm.PlatformType", "sensorDisposable", "Lio/reactivex/disposables/Disposable;", "sensorValve", "sparklePaint", "Landroid/graphics/Paint;", "overridePaint", "sensorTranslation", "shaderMatrix", "Landroid/graphics/Matrix;", "locationInWindow", "", "value", "getShape", "()Landroid/graphics/drawable/shapes/Shape;", "setShape", "(Landroid/graphics/drawable/shapes/Shape;)V", "Landroid/graphics/Xfermode;", "xfermode", "getXfermode", "()Landroid/graphics/Xfermode;", "setXfermode", "(Landroid/graphics/Xfermode;)V", "Lcom/robinhood/android/graphics/Gradient;", "sparkleGradient", "getSparkleGradient", "()Lcom/robinhood/android/graphics/Gradient;", "setSparkleGradient", "(Lcom/robinhood/android/graphics/Gradient;)V", "Landroid/content/res/ColorStateList;", "sparkleOverride", "getSparkleOverride", "()Landroid/content/res/ColorStateList;", "setSparkleOverride", "(Landroid/content/res/ColorStateList;)V", "refreshGradient", "", "refreshShape", "refreshState", "isStateful", "getOpacity", "setAlpha", "alpha", "setColorFilter", "colorFilter", "Landroid/graphics/ColorFilter;", "setTintMode", "tintMode", "Landroid/graphics/PorterDuff$Mode;", "setTintList", "tint", "onViewAttachedToWindow", "onViewDetachedFromWindow", "onBoundsChange", "bounds", "Landroid/graphics/Rect;", "getOutline", "outline", "Landroid/graphics/Outline;", "onStateChange", "state", "draw", "canvas", "Landroid/graphics/Canvas;", "SparkleDrawableEntryPoint", "Companion", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes2.dex */
public final class SparkleDrawable extends Drawable implements Sparkleable, View.OnAttachStateChangeListener, RxFactory3 {
    private static final int COLOR_UNDEFINED = -559038737;
    private final SizeF displayDimensions;
    private final BehaviorRelay<Boolean> isSparkling;
    private final int[] locationInWindow;
    private final Paint overridePaint;
    public RxFactory rxFactory;
    private Disposable sensorDisposable;
    private final PointF sensorTranslation;
    private final Observable<Boolean> sensorValve;
    private final Matrix shaderMatrix;
    private Shape shape;
    private Gradient sparkleGradient;
    public SparkleManager sparkleManager;
    private ColorStateList sparkleOverride;
    private final Paint sparklePaint;
    private final Observable<PointF> translation;
    private final View view;

    /* compiled from: SparkleDrawable.kt */
    @Metadata(m3635d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, m3636d2 = {"Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable$SparkleDrawableEntryPoint;", "", "inject", "", "obj", "Lcom/robinhood/android/designsystem/sparkle/SparkleDrawable;", "lib-design-system_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* loaded from: classes17.dex */
    public interface SparkleDrawableEntryPoint {
        void inject(SparkleDrawable obj);
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int alpha) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList tint) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode tintMode) {
    }

    public /* synthetic */ SparkleDrawable(View view, Shape shape, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(view, shape, attributeSet, (i2 & 8) != 0 ? 0 : i);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> asObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.asObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> convertToObservable(Flow<? extends T> flow) {
        return RxFactory3.DefaultImpls.convertToObservable(this, flow);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public Completable rxCompletable(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxCompletable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Maybe<T> rxMaybe(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxMaybe(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Observable<T> rxObservable(CoroutineContext coroutineContext, @Inference Function2<? super Produce4<? super T>, ? super Continuation<? super Unit>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxObservable(this, coroutineContext, function2);
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3, com.robinhood.coroutines.p287rx.RxFactory
    public <T> Single<T> rxSingle(CoroutineContext coroutineContext, Function2<? super CoroutineScope, ? super Continuation<? super T>, ? extends Object> function2) {
        return RxFactory3.DefaultImpls.rxSingle(this, coroutineContext, function2);
    }

    public SparkleDrawable(View view, Shape shape, AttributeSet attributeSet, int i) {
        ComponentCallbacks2 componentCallbacks2;
        Observable<Boolean> observableCombineLatest;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(shape, "shape");
        this.view = view;
        if (view.isInEditMode()) {
            Observable<PointF> observableNever = Observable.never();
            Intrinsics.checkNotNullExpressionValue(observableNever, "never(...)");
            this.translation = observableNever;
            this.displayDimensions = new SizeF(1000.0f, 1000.0f);
        } else {
            Context context = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            if (context instanceof Application) {
                componentCallbacks2 = (Application) context;
            } else {
                Context applicationContext = context.getApplicationContext();
                Intrinsics.checkNotNull(applicationContext, "null cannot be cast to non-null type android.app.Application");
                componentCallbacks2 = (Application) applicationContext;
            }
            ((SparkleDrawableEntryPoint) ((ApplicationComponentManagerHolder) componentCallbacks2).getComponentManager().get()).inject(this);
            this.translation = asObservable(getSparkleManager().getTranslation());
            this.displayDimensions = getSparkleManager().getDisplayDimensions();
        }
        Boolean bool = Boolean.FALSE;
        BehaviorRelay<Boolean> behaviorRelayCreateDefault = BehaviorRelay.createDefault(bool);
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreateDefault, "createDefault(...)");
        this.isSparkling = behaviorRelayCreateDefault;
        Disposable disposableDisposed = Disposables.disposed();
        Intrinsics.checkNotNullExpressionValue(disposableDisposed, "disposed(...)");
        this.sensorDisposable = disposableDisposed;
        if (view.isInEditMode()) {
            observableCombineLatest = Observable.just(bool).concatWith(Observable.never());
        } else {
            Context context2 = view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            KeyEventDispatcher.Component componentRequireActivityBaseContext = BaseContexts.requireActivityBaseContext(context2);
            Intrinsics.checkNotNull(componentRequireActivityBaseContext, "null cannot be cast to non-null type com.robinhood.disposer.LifecycleHost");
            ObservableSource map = ((LifecycleHost) componentRequireActivityBaseContext).getLifecycleState().map(new Function() { // from class: com.robinhood.android.designsystem.sparkle.SparkleDrawable$sensorValve$activityResumed$1
                @Override // io.reactivex.functions.Function
                public final Boolean apply(LifecycleState it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    return Boolean.valueOf(it == LifecycleState.RESUMED);
                }
            });
            Observables observables = Observables.INSTANCE;
            Intrinsics.checkNotNull(map);
            observableCombineLatest = Observable.combineLatest(map, behaviorRelayCreateDefault, new BiFunction<T1, T2, R>() { // from class: com.robinhood.android.designsystem.sparkle.SparkleDrawable$special$$inlined$combineLatest$1
                /* JADX WARN: Multi-variable type inference failed */
                @Override // io.reactivex.functions.BiFunction
                public final R apply(T1 t1, T2 t2) {
                    Intrinsics.checkParameterIsNotNull(t1, "t1");
                    Intrinsics.checkParameterIsNotNull(t2, "t2");
                    return (R) Boolean.valueOf(((Boolean) t1).booleanValue() & ((Boolean) t2).booleanValue());
                }
            });
            Intrinsics.checkExpressionValueIsNotNull(observableCombineLatest, "Observable.combineLatest…ombineFunction(t1, t2) })");
        }
        this.sensorValve = observableCombineLatest;
        this.sparklePaint = new Paint(1);
        this.overridePaint = new Paint(1);
        this.sensorTranslation = new PointF();
        this.shaderMatrix = new Matrix();
        this.locationInWindow = new int[2];
        this.shape = shape;
        super.setTintMode(PorterDuff.Mode.DST);
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        int[] Sparkleable = C13997R.styleable.Sparkleable;
        Intrinsics.checkNotNullExpressionValue(Sparkleable, "Sparkleable");
        TypedArray typedArrayObtainStyledAttributes = context3.obtainStyledAttributes(attributeSet, Sparkleable, i, 0);
        int i2 = C13997R.styleable.Sparkleable_sparkleGradient;
        Resources.Theme theme = view.getContext().getTheme();
        Intrinsics.checkNotNullExpressionValue(theme, "getTheme(...)");
        setSparkleGradient(Gradient3.getGradient(typedArrayObtainStyledAttributes, i2, theme));
        setSparkleOverride(typedArrayObtainStyledAttributes.getColorStateList(C13997R.styleable.Sparkleable_sparkleOverride));
        typedArrayObtainStyledAttributes.recycle();
        view.addOnAttachStateChangeListener(this);
        view.postInvalidate();
    }

    @Override // com.robinhood.coroutines.p287rx.RxFactory3
    public RxFactory getRxFactory() {
        RxFactory rxFactory = this.rxFactory;
        if (rxFactory != null) {
            return rxFactory;
        }
        Intrinsics.throwUninitializedPropertyAccessException("rxFactory");
        return null;
    }

    public void setRxFactory(RxFactory rxFactory) {
        Intrinsics.checkNotNullParameter(rxFactory, "<set-?>");
        this.rxFactory = rxFactory;
    }

    public final SparkleManager getSparkleManager() {
        SparkleManager sparkleManager = this.sparkleManager;
        if (sparkleManager != null) {
            return sparkleManager;
        }
        Intrinsics.throwUninitializedPropertyAccessException("sparkleManager");
        return null;
    }

    public final void setSparkleManager(SparkleManager sparkleManager) {
        Intrinsics.checkNotNullParameter(sparkleManager, "<set-?>");
        this.sparkleManager = sparkleManager;
    }

    public final Shape getShape() {
        return this.shape;
    }

    public final void setShape(Shape value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.shape = value;
        refreshShape();
    }

    public final Xfermode getXfermode() {
        return this.sparklePaint.getXfermode();
    }

    public final void setXfermode(Xfermode xfermode) {
        this.sparklePaint.setXfermode(xfermode);
        this.overridePaint.setXfermode(xfermode);
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public Gradient getSparkleGradient() {
        return this.sparkleGradient;
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleGradient(Gradient gradient) {
        if (Intrinsics.areEqual(this.sparkleGradient, gradient)) {
            return;
        }
        this.sparkleGradient = gradient;
        refreshGradient();
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public ColorStateList getSparkleOverride() {
        return this.sparkleOverride;
    }

    @Override // com.robinhood.android.designsystem.sparkle.Sparkleable
    public void setSparkleOverride(ColorStateList colorStateList) {
        if (Intrinsics.areEqual(this.sparkleOverride, colorStateList)) {
            return;
        }
        this.sparkleOverride = colorStateList;
        refreshState();
        invalidateSelf();
    }

    private final void refreshGradient() {
        Gradient3.setTo$default(this.sparklePaint, getSparkleGradient(), this.displayDimensions, null, 4, null);
        refreshState();
    }

    private final void refreshShape() {
        Intrinsics.checkNotNullExpressionValue(getBounds(), "getBounds(...)");
        this.shape.resize(r0.width(), r0.height());
        refreshState();
    }

    private final void refreshState() {
        this.view.refreshDrawableState();
        int[] drawableState = this.view.getDrawableState();
        Intrinsics.checkNotNullExpressionValue(drawableState, "getDrawableState(...)");
        onStateChange(drawableState);
        invalidateSelf();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(final View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Observable<PointF> observable = this.translation;
        Observable<Boolean> sensorValve = this.sensorValve;
        Intrinsics.checkNotNullExpressionValue(sensorValve, "sensorValve");
        Disposable disposableSubscribe = ObservablesAndroid.observeOnMainThread(ObservablesKt.connectWhen$default(observable, sensorValve, null, 2, null)).subscribe(new Consumer() { // from class: com.robinhood.android.designsystem.sparkle.SparkleDrawable.onViewAttachedToWindow.1
            @Override // io.reactivex.functions.Consumer
            public final void accept(PointF pointF) {
                SparkleDrawable.this.sensorTranslation.set(pointF);
                SparkleDrawable.this.invalidateSelf();
            }
        });
        Intrinsics.checkNotNullExpressionValue(disposableSubscribe, "subscribe(...)");
        this.sensorDisposable = disposableSubscribe;
        invalidateSelf();
        view.post(new Runnable() { // from class: com.robinhood.android.designsystem.sparkle.SparkleDrawable.onViewAttachedToWindow.2
            @Override // java.lang.Runnable
            public final void run() {
                view.refreshDrawableState();
            }
        });
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        this.sensorDisposable.dispose();
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect bounds) {
        Intrinsics.checkNotNullParameter(bounds, "bounds");
        super.onBoundsChange(bounds);
        refreshShape();
    }

    @Override // android.graphics.drawable.Drawable
    public void getOutline(Outline outline) {
        Intrinsics.checkNotNullParameter(outline, "outline");
        this.shape.getOutline(outline);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] state) {
        Intrinsics.checkNotNullParameter(state, "state");
        Paint paint = this.overridePaint;
        int color = paint.getColor();
        ColorStateList sparkleOverride = getSparkleOverride();
        int colorForState = COLOR_UNDEFINED;
        if (sparkleOverride != null) {
            colorForState = sparkleOverride.getColorForState(state, COLOR_UNDEFINED);
        }
        if (colorForState == color) {
            return false;
        }
        paint.setColor(colorForState);
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        Paint paint = this.sparklePaint;
        Paint paint2 = this.overridePaint;
        boolean z = false;
        if (paint2.getColor() != COLOR_UNDEFINED) {
            paint = paint2;
        } else {
            Shader shader = paint.getShader();
            if (shader instanceof LinearGradient) {
                int[] iArr = this.locationInWindow;
                this.view.getLocationInWindow(iArr);
                int i = iArr[0];
                z = true;
                int i2 = iArr[1];
                Matrix matrix = this.shaderMatrix;
                Matrices.setTranslate(matrix, this.sensorTranslation);
                matrix.postTranslate(-i, -i2);
                ((LinearGradient) shader).setLocalMatrix(matrix);
            }
        }
        this.shape.draw(canvas, paint);
        this.isSparkling.accept(Boolean.valueOf(z));
    }
}
