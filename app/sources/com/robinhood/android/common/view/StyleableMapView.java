package com.robinhood.android.common.view;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.jakewharton.rxrelay2.BehaviorRelay;
import com.robinhood.android.common.C11048R;
import com.robinhood.android.util.style.MapViewMapOverlay;
import com.robinhood.disposer.ViewDisposerKt;
import com.robinhood.scarlet.ScarletContextWrapper;
import com.robinhood.scarlet.ScarletManager;
import com.robinhood.scarlet.ScarletManager2;
import com.robinhood.scarlet.util.resource.RawResource;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.Relays;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;

/* compiled from: StyleableMapView.kt */
@Metadata(m3635d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\b\u0010\u0014\u001a\u00020\u0015H\u0014J\b\u0010\u0016\u001a\u00020\u0015H\u0014J\u0010\u0010\u0017\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001a\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001b\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001c\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\u0010\u0010\u001e\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0019H\u0016R\u0014\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000R+\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000b8F@FX\u0086\u008e\u0002¢\u0006\u0012\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013*\u0004\b\u000e\u0010\u000f¨\u0006\u001f"}, m3636d2 = {"Lcom/robinhood/android/common/view/StyleableMapView;", "Lcom/google/android/gms/maps/MapView;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "mapStyleRelay", "Lcom/jakewharton/rxrelay2/BehaviorRelay;", "Lcom/robinhood/scarlet/util/resource/RawResource;", "<set-?>", "mapStyle", "getMapStyle$delegate", "(Lcom/robinhood/android/common/view/StyleableMapView;)Ljava/lang/Object;", "getMapStyle", "()Lcom/robinhood/scarlet/util/resource/RawResource;", "setMapStyle", "(Lcom/robinhood/scarlet/util/resource/RawResource;)V", "onAttachedToWindow", "", "drawableStateChanged", "onCreate", "owner", "Landroidx/lifecycle/LifecycleOwner;", "onStart", "onResume", "onPause", "onStop", "onDestroy", "lib-common_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes17.dex */
public final class StyleableMapView extends MapView implements DefaultLifecycleObserver {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.mutableProperty1(new MutablePropertyReference1Impl(StyleableMapView.class, "mapStyle", "getMapStyle()Lcom/robinhood/scarlet/util/resource/RawResource;", 0))};
    public static final int $stable = 8;
    private final BehaviorRelay<RawResource> mapStyleRelay;

    public /* synthetic */ StyleableMapView(Context context, AttributeSet attributeSet, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i & 2) != 0 ? null : attributeSet);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StyleableMapView(Context context, AttributeSet attributeSet) {
        super(new ScarletContextWrapper(context, null, null, 6, null), attributeSet);
        Intrinsics.checkNotNullParameter(context, "context");
        BehaviorRelay<RawResource> behaviorRelayCreate = BehaviorRelay.create();
        Intrinsics.checkNotNullExpressionValue(behaviorRelayCreate, "create(...)");
        this.mapStyleRelay = behaviorRelayCreate;
        int[] StyleableMapView = C11048R.styleable.StyleableMapView;
        Intrinsics.checkNotNullExpressionValue(StyleableMapView, "StyleableMapView");
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, StyleableMapView, 0, 0);
        behaviorRelayCreate.accept(new RawResource(typedArrayObtainStyledAttributes.getResourceId(C11048R.styleable.StyleableMapView_mapStyleResource, C11048R.raw.google_map_style_standard)));
        typedArrayObtainStyledAttributes.recycle();
    }

    public final RawResource getMapStyle() {
        return (RawResource) Relays.getValue(this.mapStyleRelay, this, $$delegatedProperties[0]);
    }

    public final void setMapStyle(RawResource rawResource) {
        Intrinsics.checkNotNullParameter(rawResource, "<set-?>");
        Relays.setValue(this.mapStyleRelay, this, $$delegatedProperties[0], rawResource);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        Observable<R> map = this.mapStyleRelay.distinctUntilChanged().observeOn(Schedulers.m3346io()).map(new Function() { // from class: com.robinhood.android.common.view.StyleableMapView.onAttachedToWindow.1
            @Override // io.reactivex.functions.Function
            public final MapStyleOptions apply(RawResource it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return MapStyleOptions.loadRawResourceStyle(StyleableMapView.this.getContext(), it.getResId());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        ViewDisposerKt.bindTo$default(ObservablesAndroid.observeOnMainThread(map), this, false, 2, null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.common.view.StyleableMapView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return StyleableMapView.onAttachedToWindow$lambda$1(this.f$0, (MapStyleOptions) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onAttachedToWindow$lambda$1(StyleableMapView styleableMapView, final MapStyleOptions mapStyleOptions) {
        styleableMapView.getMapAsync(new OnMapReadyCallback() { // from class: com.robinhood.android.common.view.StyleableMapView$onAttachedToWindow$2$1
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap map) {
                Intrinsics.checkNotNullParameter(map, "map");
                map.setMapStyle(mapStyleOptions);
            }
        });
        return Unit.INSTANCE;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        ScarletManager.putOverlay$default(ScarletManager2.getScarletManager(this), isEnabled() ? MapViewMapOverlay.ENABLED : MapViewMapOverlay.DISABLED, null, 2, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onCreate((Bundle) null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onStart();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onResume();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onPause(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onPause();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onStop();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(LifecycleOwner owner) {
        Intrinsics.checkNotNullParameter(owner, "owner");
        onDestroy();
    }
}
