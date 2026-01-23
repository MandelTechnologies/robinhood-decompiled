package com.robinhood.android.cash.atm.p069ui;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.OneShotPreDrawListener;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.Lifecycle;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.UiSettings;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.libraries.places.api.model.PlaceTypes;
import com.robinhood.android.cash.atm.C9956R;
import com.robinhood.android.cash.atm.databinding.FragmentAtmFinderBinding;
import com.robinhood.android.cash.atm.extensions.Locations;
import com.robinhood.android.cash.atm.p069ui.AtmFinderFragment;
import com.robinhood.android.cash.atm.p069ui.AtmFinderViewState;
import com.robinhood.android.cash.lib.atm.p072ui.cluster.AtmClusterItem;
import com.robinhood.android.cash.lib.atm.p072ui.cluster.AtmClusterManager;
import com.robinhood.android.common.p088ui.BaseFragment;
import com.robinhood.android.common.p088ui.BindResourcesKt;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.udf.OldDuxos;
import com.robinhood.android.common.util.Compat;
import com.robinhood.android.common.util.extensions.RecyclerViews;
import com.robinhood.android.common.view.StyleableMapView;
import com.robinhood.android.designsystem.C13997R;
import com.robinhood.android.designsystem.button.RdsButton;
import com.robinhood.android.designsystem.button.RdsIconButton;
import com.robinhood.android.regiongate.RegionGate;
import com.robinhood.android.regiongate.SpendingRegionGate;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated;
import com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated2;
import com.robinhood.disposer.LifecycleEvent;
import com.robinhood.disposer.LifecycleHost;
import com.robinhood.disposer.ScopedObservable;
import com.robinhood.models.api.minerva.Atm;
import com.robinhood.utils.Optional;
import com.robinhood.utils.Optional3;
import com.robinhood.utils.extensions.ObservablesAndroid;
import com.robinhood.utils.extensions.ObservablesKt;
import com.robinhood.utils.extensions.ViewsKt;
import com.robinhood.utils.p409ui.view.OnClickListeners;
import io.reactivex.Observable;
import io.reactivex.functions.Function;
import io.reactivex.schedulers.Schedulers;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;

/* compiled from: AtmFinderFragment.kt */
@Metadata(m3635d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 Q2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001QB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010,\u001a\u00020-2\u0006\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101H\u0017J\b\u00102\u001a\u00020-H\u0016J\b\u00103\u001a\u00020-H\u0016J\u0010\u00104\u001a\u00020-2\u0006\u00105\u001a\u000206H\u0016J\u0010\u00107\u001a\u00020-2\u0006\u00108\u001a\u000209H\u0002J$\u0010:\u001a\u00020-2\u0006\u0010;\u001a\u00020#2\b\b\u0002\u0010<\u001a\u00020%2\b\b\u0002\u0010=\u001a\u00020%H\u0002J\u0016\u0010>\u001a\u00020-2\f\u0010?\u001a\b\u0012\u0004\u0012\u0002060@H\u0002J\b\u0010A\u001a\u00020-H\u0003J-\u0010B\u001a\u00020-2\u0006\u0010C\u001a\u00020\u00132\u000e\u0010D\u001a\n\u0012\u0006\b\u0001\u0012\u00020F0E2\u0006\u0010G\u001a\u00020HH\u0017¢\u0006\u0002\u0010IJ\b\u0010J\u001a\u00020-H\u0007J\t\u0010K\u001a\u00020%H\u0096\u0001R\u001b\u0010\u0006\u001a\u00020\u00078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\b\u0010\tR\u001b\u0010\f\u001a\u00020\r8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u000e\u0010\u000fR\u001b\u0010\u0012\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0011\u001a\u0004\b\u0014\u0010\u0015R\u001b\u0010\u0017\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0019\u0010\u0011\u001a\u0004\b\u0018\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010\u0015R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010 \u001a\u0004\u0018\u00010!X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\"\u001a\u0004\u0018\u00010#X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010&\u001a\u00020%2\u0006\u0010$\u001a\u00020%@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b*\u0010+R\u0018\u0010L\u001a\b\u0012\u0004\u0012\u00020N0MX\u0096\u0005¢\u0006\u0006\u001a\u0004\bO\u0010P¨\u0006R"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmFinderFragment;", "Lcom/robinhood/android/common/ui/BaseFragment;", "Lcom/robinhood/android/regiongate/ui/lifecycle/RegionGated;", "Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager$Callbacks;", "<init>", "()V", "duxo", "Lcom/robinhood/android/cash/atm/ui/AtmFinderDuxo;", "getDuxo", "()Lcom/robinhood/android/cash/atm/ui/AtmFinderDuxo;", "duxo$delegate", "Lkotlin/Lazy;", "binding", "Lcom/robinhood/android/cash/atm/databinding/FragmentAtmFinderBinding;", "getBinding", "()Lcom/robinhood/android/cash/atm/databinding/FragmentAtmFinderBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "spacingDefault", "", "getSpacingDefault", "()I", "spacingDefault$delegate", "atmTextHeight", "getAtmTextHeight", "atmTextHeight$delegate", "atmRowHeight", "getAtmRowHeight", "atmAdapter", "Lcom/robinhood/android/cash/atm/ui/AtmAdapter;", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "clusterManager", "Lcom/robinhood/android/cash/lib/atm/ui/cluster/AtmClusterManager;", "lastLocation", "Landroid/location/Location;", "value", "", "hasScrolledAfterReset", "setHasScrolledAfterReset", "(Z)V", "toolbarVisible", "getToolbarVisible", "()Z", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "onDestroyView", "onResume", "onScrollToAtm", PlaceTypes.ATM, "Lcom/robinhood/models/api/minerva/Atm;", "setViewState", "viewState", "Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState;", "panMapToUserLocation", "location", "animate", "useCurrentZoom", "replacePoints", "atms", "", "checkLocationSettingsAndPermission", "onRequestPermissionsResult", "requestCode", "permissions", "", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "onLocationGranted", "onDismissUnsupportedFeatureDialog", "requiresRegionGates", "", "Lcom/robinhood/android/regiongate/RegionGate;", "getRequiresRegionGates", "()Ljava/util/Set;", "Companion", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final class AtmFinderFragment extends BaseFragment implements RegionGated, AtmClusterManager.Callbacks {
    private static final String PERMISSION = "android.permission.ACCESS_COARSE_LOCATION";
    private static final int PERMISSION_REQUEST_CODE = 0;
    private final /* synthetic */ RegionGated2 $$delegate_0;
    private final AtmAdapter atmAdapter;

    /* renamed from: atmTextHeight$delegate, reason: from kotlin metadata */
    private final Interfaces2 atmTextHeight;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;
    private AtmClusterManager clusterManager;

    /* renamed from: duxo$delegate, reason: from kotlin metadata */
    private final Lazy duxo;
    private boolean hasScrolledAfterReset;
    private Location lastLocation;
    private LinearLayoutManager layoutManager;

    /* renamed from: spacingDefault$delegate, reason: from kotlin metadata */
    private final Interfaces2 spacingDefault;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AtmFinderFragment.class, "binding", "getBinding()Lcom/robinhood/android/cash/atm/databinding/FragmentAtmFinderBinding;", 0)), Reflection.property1(new PropertyReference1Impl(AtmFinderFragment.class, "spacingDefault", "getSpacingDefault()I", 0)), Reflection.property1(new PropertyReference1Impl(AtmFinderFragment.class, "atmTextHeight", "getAtmTextHeight()I", 0))};

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AtmFinderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AtmFinderViewState.LoadState.values().length];
            try {
                iArr[AtmFinderViewState.LoadState.LOADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AtmFinderViewState.LoadState.EMPTY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AtmFinderViewState.LoadState.LOADED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AtmFinderViewState.LoadState.SETTING_DISABLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AtmFinderViewState.LoadState.NO_PERMISSION.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public Set<RegionGate> getRequiresRegionGates() {
        return this.$$delegate_0.getRequiresRegionGates();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment
    public boolean getToolbarVisible() {
        return false;
    }

    @Override // com.robinhood.android.regiongate.p237ui.lifecycle.RegionGated
    public boolean onDismissUnsupportedFeatureDialog() {
        return this.$$delegate_0.onDismissUnsupportedFeatureDialog();
    }

    public AtmFinderFragment() {
        super(C9956R.layout.fragment_atm_finder);
        this.$$delegate_0 = new RegionGated2(SpendingRegionGate.INSTANCE);
        this.duxo = OldDuxos.oldDuxo(this, AtmFinderDuxo.class);
        this.binding = ViewBinding5.viewBinding(this, AtmFinderFragment2.INSTANCE);
        this.spacingDefault = BindResourcesKt.bindDimenPixelSize(this, C13997R.dimen.rds_spacing_default);
        this.atmTextHeight = BindResourcesKt.bindDimenPixelSize(this, C9956R.dimen.atm_detail_text_height);
        this.atmAdapter = new AtmAdapter();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtmFinderDuxo getDuxo() {
        return (AtmFinderDuxo) this.duxo.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FragmentAtmFinderBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentAtmFinderBinding) value;
    }

    private final int getSpacingDefault() {
        return ((Number) this.spacingDefault.getValue(this, $$delegatedProperties[1])).intValue();
    }

    private final int getAtmTextHeight() {
        return ((Number) this.atmTextHeight.getValue(this, $$delegatedProperties[2])).intValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getAtmRowHeight() {
        return (getSpacingDefault() * 2) + getAtmTextHeight();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setHasScrolledAfterReset(boolean z) {
        this.hasScrolledAfterReset = z;
        AtmClusterManager atmClusterManager = this.clusterManager;
        if (atmClusterManager != null) {
            atmClusterManager.setHasScrolledAfterReset(z);
        }
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    @SuppressLint({"PotentialBehaviorOverride"})
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        Lifecycle registry = getLifecycle();
        StyleableMapView atmFinderMapView = getBinding().atmFinderMapView;
        Intrinsics.checkNotNullExpressionValue(atmFinderMapView, "atmFinderMapView");
        registry.addObserver(atmFinderMapView);
        getBinding().atmFinderMapView.getMapAsync(new OnMapReadyCallback() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment.onViewCreated.1
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(final GoogleMap map) {
                Intrinsics.checkNotNullParameter(map, "map");
                AtmFinderDuxo duxo = AtmFinderFragment.this.getDuxo();
                LatLngBounds latLngBounds = map.getProjection().getVisibleRegion().latLngBounds;
                Intrinsics.checkNotNullExpressionValue(latLngBounds, "latLngBounds");
                duxo.onMapScrolled(latLngBounds);
                AtmFinderFragment atmFinderFragment = AtmFinderFragment.this;
                Context contextRequireContext = AtmFinderFragment.this.requireContext();
                Intrinsics.checkNotNullExpressionValue(contextRequireContext, "requireContext(...)");
                StyleableMapView atmFinderMapView2 = AtmFinderFragment.this.getBinding().atmFinderMapView;
                Intrinsics.checkNotNullExpressionValue(atmFinderMapView2, "atmFinderMapView");
                atmFinderFragment.clusterManager = new AtmClusterManager(contextRequireContext, atmFinderMapView2, map, AtmFinderFragment.this);
                UiSettings uiSettings = map.getUiSettings();
                uiSettings.setMyLocationButtonEnabled(false);
                uiSettings.setCompassEnabled(false);
                uiSettings.setIndoorLevelPickerEnabled(false);
                uiSettings.setMapToolbarEnabled(false);
                map.setOnMarkerClickListener(AtmFinderFragment.this.clusterManager);
                final AtmFinderFragment atmFinderFragment2 = AtmFinderFragment.this;
                map.setOnCameraMoveListener(new GoogleMap.OnCameraMoveListener() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment.onViewCreated.1.2
                    @Override // com.google.android.gms.maps.GoogleMap.OnCameraMoveListener
                    public final void onCameraMove() {
                        AtmFinderDuxo duxo2 = atmFinderFragment2.getDuxo();
                        LatLngBounds latLngBounds2 = map.getProjection().getVisibleRegion().latLngBounds;
                        Intrinsics.checkNotNullExpressionValue(latLngBounds2, "latLngBounds");
                        duxo2.onMapScrolled(latLngBounds2);
                    }
                });
            }
        });
        RdsIconButton atmFinderCloseBtn = getBinding().atmFinderCloseBtn;
        Intrinsics.checkNotNullExpressionValue(atmFinderCloseBtn, "atmFinderCloseBtn");
        OnClickListeners.onClick(atmFinderCloseBtn, new Function0() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AtmFinderFragment.onViewCreated$lambda$0(this.f$0);
            }
        });
        RdsIconButton atmFinderLocationBtn = getBinding().atmFinderLocationBtn;
        Intrinsics.checkNotNullExpressionValue(atmFinderLocationBtn, "atmFinderLocationBtn");
        OnClickListeners.onClick(atmFinderLocationBtn, new Function0() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AtmFinderFragment.onViewCreated$lambda$1(this.f$0);
            }
        });
        this.layoutManager = new LinearLayoutManager(requireContext());
        RecyclerView recyclerView = getBinding().atmFinderRecyclerView;
        RecyclerView.ItemAnimator itemAnimator = recyclerView.getItemAnimator();
        Intrinsics.checkNotNull(itemAnimator, "null cannot be cast to non-null type androidx.recyclerview.widget.DefaultItemAnimator");
        ((DefaultItemAnimator) itemAnimator).setSupportsChangeAnimations(false);
        recyclerView.setHasFixedSize(true);
        LinearLayoutManager linearLayoutManager = this.layoutManager;
        if (linearLayoutManager == null) {
            Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
            linearLayoutManager = null;
        }
        recyclerView.setLayoutManager(linearLayoutManager);
        Intrinsics.checkNotNull(recyclerView);
        bindAdapter(recyclerView, this.atmAdapter);
        RecyclerViews.addAutoSelectingScrollListener(recyclerView, new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$$ExternalSyntheticLambda2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderFragment.onViewCreated$lambda$5$lambda$3(this.f$0, ((Integer) obj).intValue());
            }
        }, new AtmFinderFragment3(INSTANCE), new Function0() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AtmFinderFragment.onViewCreated$lambda$5$lambda$4(this.f$0);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$0(AtmFinderFragment atmFinderFragment) {
        atmFinderFragment.requireActivity().finish();
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$1(AtmFinderFragment atmFinderFragment) {
        Location location = atmFinderFragment.lastLocation;
        if (location == null) {
            return Unit.INSTANCE;
        }
        atmFinderFragment.panMapToUserLocation(location, true, true);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$3(AtmFinderFragment atmFinderFragment, int i) {
        AtmClusterManager atmClusterManager;
        if (i == 0) {
            i++;
        }
        Atm atmHighlightAtmFromPosition = atmFinderFragment.atmAdapter.highlightAtmFromPosition(i);
        if (atmHighlightAtmFromPosition != null && (atmClusterManager = atmFinderFragment.clusterManager) != null) {
            atmClusterManager.highlightFromAtmItem(atmHighlightAtmFromPosition);
        }
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onViewCreated$lambda$5$lambda$4(AtmFinderFragment atmFinderFragment) {
        atmFinderFragment.setHasScrolledAfterReset(true);
        return Unit.INSTANCE;
    }

    @Override // com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onDestroyView() {
        Lifecycle registry = getLifecycle();
        StyleableMapView atmFinderMapView = getBinding().atmFinderMapView;
        Intrinsics.checkNotNullExpressionValue(atmFinderMapView, "atmFinderMapView");
        registry.removeObserver(atmFinderMapView);
        super.onDestroyView();
    }

    @Override // com.robinhood.android.common.p088ui.BaseFragment, com.robinhood.android.common.p088ui.RxFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        Observable<R> map = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment.onResume.1
            @Override // io.reactivex.functions.Function
            public final Optional<Location> apply(AtmFinderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getUserLocation());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map, "map(...)");
        Observable observableTake = ObservablesKt.filterIsPresent(map).take(2L);
        Intrinsics.checkNotNullExpressionValue(observableTake, "take(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableTake), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderFragment.onResume$lambda$6(this.f$0, (Location) obj);
            }
        });
        Observable<R> map2 = getDuxo().getStates().map(new Function() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment.onResume.3
            @Override // io.reactivex.functions.Function
            public final Optional<Location> apply(AtmFinderViewState it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Optional3.asOptional(it.getUserLocation());
            }
        });
        Intrinsics.checkNotNullExpressionValue(map2, "map(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesKt.filterIsPresent(map2), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return AtmFinderFragment.onResume$lambda$7(this.f$0, (Location) obj);
            }
        });
        Observable<AtmFinderViewState> observableDistinctUntilChanged = getDuxo().getStates().throttleLast(100L, TimeUnit.MILLISECONDS, Schedulers.computation()).distinctUntilChanged();
        Intrinsics.checkNotNullExpressionValue(observableDistinctUntilChanged, "distinctUntilChanged(...)");
        LifecycleHost.DefaultImpls.bind$default(this, ObservablesAndroid.observeOnMainThread(observableDistinctUntilChanged), (LifecycleEvent) null, 1, (Object) null).subscribeKotlin(new C99625(this));
        checkLocationSettingsAndPermission();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$6(AtmFinderFragment atmFinderFragment, Location location) {
        Intrinsics.checkNotNull(location);
        panMapToUserLocation$default(atmFinderFragment, location, false, false, 6, null);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit onResume$lambda$7(AtmFinderFragment atmFinderFragment, Location location) {
        Intrinsics.checkNotNullParameter(location, "location");
        atmFinderFragment.lastLocation = location;
        return Unit.INSTANCE;
    }

    /* compiled from: AtmFinderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.cash.atm.ui.AtmFinderFragment$onResume$5 */
    /* synthetic */ class C99625 extends FunctionReferenceImpl implements Function1<AtmFinderViewState, Unit> {
        C99625(Object obj) {
            super(1, obj, AtmFinderFragment.class, "setViewState", "setViewState(Lcom/robinhood/android/cash/atm/ui/AtmFinderViewState;)V", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(AtmFinderViewState atmFinderViewState) {
            invoke2(atmFinderViewState);
            return Unit.INSTANCE;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(AtmFinderViewState p0) {
            Intrinsics.checkNotNullParameter(p0, "p0");
            ((AtmFinderFragment) this.receiver).setViewState(p0);
        }
    }

    @Override // com.robinhood.android.cash.lib.atm.ui.cluster.AtmClusterManager.Callbacks
    public void onScrollToAtm(Atm atm) {
        Intrinsics.checkNotNullParameter(atm, "atm");
        Integer atmPosition = this.atmAdapter.getAtmPosition(atm);
        if (atmPosition != null) {
            int iIntValue = atmPosition.intValue();
            LinearLayoutManager linearLayoutManager = this.layoutManager;
            if (linearLayoutManager == null) {
                Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                linearLayoutManager = null;
            }
            linearLayoutManager.smoothScrollToPosition(getBinding().atmFinderRecyclerView, null, iIntValue);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setViewState(final AtmFinderViewState viewState) {
        this.atmAdapter.updateViewState(viewState);
        if (viewState.getLoadState() != AtmFinderViewState.LoadState.LOADING) {
            replacePoints(viewState.getAtms());
        }
        getBinding().atmFinderMapView.setEnabled(viewState.getLoadState().getIsActiveState());
        RdsButton atmFinderEnableLocationBtn = getBinding().atmFinderEnableLocationBtn;
        Intrinsics.checkNotNullExpressionValue(atmFinderEnableLocationBtn, "atmFinderEnableLocationBtn");
        OnClickListeners.onClick(atmFinderEnableLocationBtn, new Function0() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return AtmFinderFragment.setViewState$lambda$9(viewState, this);
            }
        });
        int i = WhenMappings.$EnumSwitchMapping$0[viewState.getLoadState().ordinal()];
        if (i == 1) {
            ConstraintLayout atmFinderEmptyView = getBinding().atmFinderEmptyView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEmptyView, "atmFinderEmptyView");
            atmFinderEmptyView.setVisibility(8);
            ConstraintLayout atmFinderEnableLocationView = getBinding().atmFinderEnableLocationView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEnableLocationView, "atmFinderEnableLocationView");
            atmFinderEnableLocationView.setVisibility(8);
            RecyclerView atmFinderRecyclerView = getBinding().atmFinderRecyclerView;
            Intrinsics.checkNotNullExpressionValue(atmFinderRecyclerView, "atmFinderRecyclerView");
            atmFinderRecyclerView.setVisibility(0);
            return;
        }
        if (i == 2) {
            ConstraintLayout atmFinderEmptyView2 = getBinding().atmFinderEmptyView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEmptyView2, "atmFinderEmptyView");
            atmFinderEmptyView2.setVisibility(0);
            ConstraintLayout atmFinderEnableLocationView2 = getBinding().atmFinderEnableLocationView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEnableLocationView2, "atmFinderEnableLocationView");
            atmFinderEnableLocationView2.setVisibility(8);
            RecyclerView atmFinderRecyclerView2 = getBinding().atmFinderRecyclerView;
            Intrinsics.checkNotNullExpressionValue(atmFinderRecyclerView2, "atmFinderRecyclerView");
            atmFinderRecyclerView2.setVisibility(8);
            getBinding().atmFinderEmptyViewTitle.setText(C9956R.string.atm_finder_no_atms_title);
            getBinding().atmFinderEmptyViewSummary.setText(C9956R.string.atm_finder_no_atms_detail);
            return;
        }
        if (i != 3) {
            if (i != 4 && i != 5) {
                throw new NoWhenBranchMatchedException();
            }
            ConstraintLayout atmFinderEmptyView3 = getBinding().atmFinderEmptyView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEmptyView3, "atmFinderEmptyView");
            atmFinderEmptyView3.setVisibility(8);
            ConstraintLayout atmFinderEnableLocationView3 = getBinding().atmFinderEnableLocationView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEnableLocationView3, "atmFinderEnableLocationView");
            atmFinderEnableLocationView3.setVisibility(0);
            RecyclerView atmFinderRecyclerView3 = getBinding().atmFinderRecyclerView;
            Intrinsics.checkNotNullExpressionValue(atmFinderRecyclerView3, "atmFinderRecyclerView");
            atmFinderRecyclerView3.setVisibility(8);
            return;
        }
        if (viewState.getFilteredAtms().size() > 99) {
            ConstraintLayout atmFinderEmptyView4 = getBinding().atmFinderEmptyView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEmptyView4, "atmFinderEmptyView");
            atmFinderEmptyView4.setVisibility(0);
            RecyclerView atmFinderRecyclerView4 = getBinding().atmFinderRecyclerView;
            Intrinsics.checkNotNullExpressionValue(atmFinderRecyclerView4, "atmFinderRecyclerView");
            atmFinderRecyclerView4.setVisibility(8);
            getBinding().atmFinderEmptyViewTitle.setText(getString(C9956R.string.atm_finder_too_many_atms_title, 99));
            getBinding().atmFinderEmptyViewSummary.setText(C9956R.string.atm_finder_too_many_atms_summary);
        } else {
            ConstraintLayout atmFinderEmptyView5 = getBinding().atmFinderEmptyView;
            Intrinsics.checkNotNullExpressionValue(atmFinderEmptyView5, "atmFinderEmptyView");
            atmFinderEmptyView5.setVisibility(8);
            RecyclerView atmFinderRecyclerView5 = getBinding().atmFinderRecyclerView;
            Intrinsics.checkNotNullExpressionValue(atmFinderRecyclerView5, "atmFinderRecyclerView");
            atmFinderRecyclerView5.setVisibility(0);
        }
        RdsIconButton atmFinderLocationBtn = getBinding().atmFinderLocationBtn;
        Intrinsics.checkNotNullExpressionValue(atmFinderLocationBtn, "atmFinderLocationBtn");
        atmFinderLocationBtn.setVisibility(0);
        ConstraintLayout atmFinderEnableLocationView4 = getBinding().atmFinderEnableLocationView;
        Intrinsics.checkNotNullExpressionValue(atmFinderEnableLocationView4, "atmFinderEnableLocationView");
        atmFinderEnableLocationView4.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit setViewState$lambda$9(AtmFinderViewState atmFinderViewState, AtmFinderFragment atmFinderFragment) {
        if (atmFinderViewState.getLoadState() == AtmFinderViewState.LoadState.SETTING_DISABLED) {
            atmFinderFragment.startActivity(new Intent("android.settings.LOCATION_SOURCE_SETTINGS"));
        } else if (atmFinderViewState.getLoadState() == AtmFinderViewState.LoadState.NO_PERMISSION) {
            atmFinderFragment.requestPermissionsCompat(0, PERMISSION);
        }
        return Unit.INSTANCE;
    }

    static /* synthetic */ void panMapToUserLocation$default(AtmFinderFragment atmFinderFragment, Location location, boolean z, boolean z2, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = false;
        }
        atmFinderFragment.panMapToUserLocation(location, z, z2);
    }

    private final void panMapToUserLocation(Location location, final boolean animate, final boolean useCurrentZoom) {
        final LatLng latLng = Locations.toLatLng(location);
        getBinding().atmFinderMapView.getMapAsync(new OnMapReadyCallback() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment.panMapToUserLocation.1
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap map) {
                Intrinsics.checkNotNullParameter(map, "map");
                float fCoerceAtLeast = useCurrentZoom ? RangesKt.coerceAtLeast(map.getCameraPosition().zoom, 12.0f) : 12.0f;
                if (animate) {
                    map.animateCamera(CameraUpdateFactory.newLatLngZoom(latLng, fCoerceAtLeast));
                } else {
                    map.moveCamera(CameraUpdateFactory.newLatLngZoom(latLng, fCoerceAtLeast));
                }
                AtmFinderDuxo duxo = this.getDuxo();
                LatLngBounds latLngBounds = map.getProjection().getVisibleRegion().latLngBounds;
                Intrinsics.checkNotNullExpressionValue(latLngBounds, "latLngBounds");
                duxo.onMapScrolled(latLngBounds);
            }
        });
    }

    /* compiled from: AtmFinderFragment.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    @SourceDebugExtension
    /* renamed from: com.robinhood.android.cash.atm.ui.AtmFinderFragment$replacePoints$1 */
    static final class C99651 implements OnMapReadyCallback {
        final /* synthetic */ List<Atm> $atms;

        C99651(List<Atm> list) {
            this.$atms = list;
        }

        @Override // com.google.android.gms.maps.OnMapReadyCallback
        public final void onMapReady(GoogleMap googleMap) {
            Intrinsics.checkNotNullParameter(googleMap, "<unused var>");
            final AtmClusterManager atmClusterManager = AtmFinderFragment.this.clusterManager;
            if (atmClusterManager == null) {
                return;
            }
            atmClusterManager.clearItems();
            List<Atm> list = this.$atms;
            List<Atm> list2 = list;
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list2, 10));
            for (Atm atm : list2) {
                arrayList.add(new AtmClusterItem(atm, Intrinsics.areEqual(CollectionsKt.first((List) list), atm)));
            }
            atmClusterManager.addItems(arrayList);
            atmClusterManager.cluster();
            AtmFinderFragment.this.setHasScrolledAfterReset(false);
            final Atm atm2 = (Atm) CollectionsKt.firstOrNull((List) this.$atms);
            if (atm2 != null) {
                AtmFinderFragment atmFinderFragment = AtmFinderFragment.this;
                Observable<Long> observableTimer = Observable.timer(500L, TimeUnit.MILLISECONDS);
                Intrinsics.checkNotNullExpressionValue(observableTimer, "timer(...)");
                ScopedObservable scopedObservableBind$default = LifecycleHost.DefaultImpls.bind$default(atmFinderFragment, ObservablesAndroid.observeOnMainThread(observableTimer), (LifecycleEvent) null, 1, (Object) null);
                final AtmFinderFragment atmFinderFragment2 = AtmFinderFragment.this;
                scopedObservableBind$default.subscribeKotlin(new Function1() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$replacePoints$1$$ExternalSyntheticLambda0
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return AtmFinderFragment.C99651.onMapReady$lambda$1(atmFinderFragment2, atmClusterManager, atm2, (Long) obj);
                    }
                });
            }
            RecyclerView recyclerView = AtmFinderFragment.this.getBinding().atmFinderRecyclerView;
            final AtmFinderFragment atmFinderFragment3 = AtmFinderFragment.this;
            recyclerView.post(new Runnable() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment.replacePoints.1.3
                @Override // java.lang.Runnable
                public final void run() {
                    LinearLayoutManager linearLayoutManager = atmFinderFragment3.layoutManager;
                    if (linearLayoutManager == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("layoutManager");
                        linearLayoutManager = null;
                    }
                    linearLayoutManager.scrollToPosition(0);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit onMapReady$lambda$1(AtmFinderFragment atmFinderFragment, AtmClusterManager atmClusterManager, Atm atm, Long l) {
            if (!atmFinderFragment.hasScrolledAfterReset) {
                atmClusterManager.highlightFromAtmItem(atm);
            }
            return Unit.INSTANCE;
        }
    }

    private final void replacePoints(List<Atm> atms) {
        getBinding().atmFinderMapView.getMapAsync(new C99651(atms));
    }

    @SuppressLint({"MissingPermission"})
    private final void checkLocationSettingsAndPermission() {
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        Object systemService = fragmentActivityRequireActivity.getSystemService("location");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.location.LocationManager");
        LocationManager locationManager = (LocationManager) systemService;
        getDuxo().setLocationSettingEnabled(locationManager.isProviderEnabled("network") || locationManager.isProviderEnabled("gps"));
        if (Compat.INSTANCE.checkSelfPermission(fragmentActivityRequireActivity, PERMISSION)) {
            onLocationGranted();
        }
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"MissingPermission"})
    public void onRequestPermissionsResult(int requestCode, String[] permissions, int[] grantResults) {
        Integer numFirstOrNull;
        Intrinsics.checkNotNullParameter(permissions, "permissions");
        Intrinsics.checkNotNullParameter(grantResults, "grantResults");
        if (requestCode == 0 && (numFirstOrNull = ArraysKt.firstOrNull(grantResults)) != null && numFirstOrNull.intValue() == 0) {
            onLocationGranted();
        }
    }

    public final void onLocationGranted() {
        AtmFinderDuxo duxo = getDuxo();
        FragmentActivity fragmentActivityRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(fragmentActivityRequireActivity, "requireActivity(...)");
        duxo.locationPermissionGranted(fragmentActivityRequireActivity);
        getBinding().atmFinderMapView.getMapAsync(new OnMapReadyCallback() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment.onLocationGranted.1
            @Override // com.google.android.gms.maps.OnMapReadyCallback
            public final void onMapReady(GoogleMap map) {
                Intrinsics.checkNotNullParameter(map, "map");
                map.setMyLocationEnabled(true);
            }
        });
        ConstraintLayout atmFinderEnableLocationView = getBinding().atmFinderEnableLocationView;
        Intrinsics.checkNotNullExpressionValue(atmFinderEnableLocationView, "atmFinderEnableLocationView");
        atmFinderEnableLocationView.setVisibility(8);
        RecyclerView atmFinderRecyclerView = getBinding().atmFinderRecyclerView;
        Intrinsics.checkNotNullExpressionValue(atmFinderRecyclerView, "atmFinderRecyclerView");
        atmFinderRecyclerView.setVisibility(0);
        final RecyclerView atmFinderRecyclerView2 = getBinding().atmFinderRecyclerView;
        Intrinsics.checkNotNullExpressionValue(atmFinderRecyclerView2, "atmFinderRecyclerView");
        OneShotPreDrawListener.add(atmFinderRecyclerView2, new Runnable() { // from class: com.robinhood.android.cash.atm.ui.AtmFinderFragment$onLocationGranted$$inlined$doOnPreDraw$1
            @Override // java.lang.Runnable
            public final void run() {
                RecyclerView recyclerView = atmFinderRecyclerView2;
                ViewsKt.setBottomPadding(recyclerView, recyclerView.getHeight() - this.getAtmRowHeight());
            }
        });
    }

    /* compiled from: AtmFinderFragment.kt */
    @Metadata(m3635d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"Lcom/robinhood/android/cash/atm/ui/AtmFinderFragment$Companion;", "", "<init>", "()V", "PERMISSION", "", "PERMISSION_REQUEST_CODE", "", "newInstance", "Lcom/robinhood/android/cash/atm/ui/AtmFinderFragment;", "getSelectedItemIndex", "layoutManager", "Landroidx/recyclerview/widget/LinearLayoutManager;", "feature-cash-atm_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final AtmFinderFragment newInstance() {
            return new AtmFinderFragment();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final int getSelectedItemIndex(LinearLayoutManager layoutManager) {
            int iFindFirstVisibleItemPosition = layoutManager.findFirstVisibleItemPosition();
            View viewFindViewByPosition = layoutManager.findViewByPosition(iFindFirstVisibleItemPosition);
            if (viewFindViewByPosition == null) {
                return -1;
            }
            return Math.abs(Math.min(viewFindViewByPosition.getTop(), 0)) > viewFindViewByPosition.getHeight() / 2 ? iFindFirstVisibleItemPosition + 1 : iFindFirstVisibleItemPosition;
        }
    }
}
