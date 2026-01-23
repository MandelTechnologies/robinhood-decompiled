package com.google.maps.android.compose;

import android.content.ComponentCallbacks;
import android.content.Context;
import android.content.res.Configuration;
import android.location.Location;
import android.os.Bundle;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.p011ui.platform.CompositionLocalsKt;
import androidx.compose.p011ui.platform.InspectionMode;
import androidx.compose.p011ui.unit.Density;
import androidx.compose.p011ui.unit.LayoutDirection;
import androidx.compose.p011ui.viewinterop.AndroidView_androidKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.Composition;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.CompositionKt;
import androidx.compose.runtime.CompositionLocal3;
import androidx.compose.runtime.DisposableEffectResult;
import androidx.compose.runtime.DisposableEffectScope;
import androidx.compose.runtime.EffectsKt;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.SnapshotState;
import androidx.compose.runtime.SnapshotState3;
import androidx.compose.runtime.SnapshotState4;
import androidx.compose.runtime.SnapshotStateKt;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.plaid.internal.EnumC7081g;
import kotlin.ExceptionsH;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuationJvm;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl7;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.DebugProbes;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.DelayKt;

/* compiled from: GoogleMap.kt */
@Metadata(m3635d1 = {"\u0000\u0080\u0001\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\u001a\u0091\u0002\u0010!\u001a\u00020\u00152\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u000e\b\u0002\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\u0016\b\u0002\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0014\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\b2\u0010\b\u0002\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0000\u0018\u00010\b2\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00132\b\b\u0002\u0010\u001f\u001a\u00020\u001e2\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150\bH\u0007¢\u0006\u0004\b!\u0010\"\u001a\u0017\u0010%\u001a\u00020\u00152\u0006\u0010$\u001a\u00020#H\u0003¢\u0006\u0004\b%\u0010&\u001a!\u0010+\u001a\u00020**\u00020#2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020(0'H\u0002¢\u0006\u0004\b+\u0010,\u001a\u0013\u0010.\u001a\u00020-*\u00020#H\u0002¢\u0006\u0004\b.\u0010/*\u0016\u00100\"\b\u0012\u0004\u0012\u00020\u00150\b2\b\u0012\u0004\u0012\u00020\u00150\b¨\u0006:²\u0006\u000e\u00101\u001a\u0004\u0018\u00010\u00068\nX\u008a\u0084\u0002²\u0006\u000e\u00102\u001a\u0004\u0018\u00010\r8\nX\u008a\u0084\u0002²\u0006\f\u00103\u001a\u00020\u00048\nX\u008a\u0084\u0002²\u0006\f\u00104\u001a\u00020\u001e8\nX\u008a\u0084\u0002²\u0006\f\u00105\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u00106\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\u0012\u00107\u001a\b\u0012\u0004\u0012\u00020\u00150\b8\nX\u008a\u0084\u0002²\u0006\f\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002²\u0006\f\u00108\u001a\u00020\u000b8\nX\u008a\u0084\u0002²\u0006\f\u00109\u001a\u00020\u00008\nX\u008a\u0084\u0002"}, m3636d2 = {"", "mergeDescendants", "Landroidx/compose/ui/Modifier;", "modifier", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "", "contentDescription", "Lkotlin/Function0;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "googleMapOptionsFactory", "Lcom/google/maps/android/compose/MapProperties;", "properties", "Lcom/google/android/gms/maps/LocationSource;", "locationSource", "Lcom/google/maps/android/compose/MapUiSettings;", "uiSettings", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "", "onMapClick", "onMapLongClick", "onMapLoaded", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick", "Lcom/google/android/gms/maps/model/PointOfInterest;", "onPOIClick", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "content", "GoogleMap", "(ZLandroidx/compose/ui/Modifier;Lcom/google/maps/android/compose/CameraPositionState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/google/maps/android/compose/MapProperties;Lcom/google/android/gms/maps/LocationSource;Lcom/google/maps/android/compose/MapUiSettings;Lcom/google/maps/android/compose/IndoorStateChangeListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/PaddingValues;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "Lcom/google/android/gms/maps/MapView;", "mapView", "MapLifecycle", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/runtime/Composer;I)V", "Landroidx/compose/runtime/MutableState;", "Landroidx/lifecycle/Lifecycle$Event;", "previousState", "Landroidx/lifecycle/LifecycleEventObserver;", "lifecycleObserver", "(Lcom/google/android/gms/maps/MapView;Landroidx/compose/runtime/MutableState;)Landroidx/lifecycle/LifecycleEventObserver;", "Landroid/content/ComponentCallbacks;", "componentCallbacks", "(Lcom/google/android/gms/maps/MapView;)Landroid/content/ComponentCallbacks;", "GoogleMapFactory", "currentContentDescription", "currentLocationSource", "currentCameraPositionState", "currentContentPadding", "currentUiSettings", "currentMapProperties", "currentContent", "mapProperties", "mapVisible", "maps-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.google.maps.android.compose.GoogleMapKt, reason: use source file name */
/* loaded from: classes27.dex */
public final class GoogleMap5 {

    /* compiled from: GoogleMap.kt */
    @Metadata(m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    /* renamed from: com.google.maps.android.compose.GoogleMapKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_CREATE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_START.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Lifecycle.Event.ON_STOP.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Lifecycle.Event.ON_DESTROY.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x013f  */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0190  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01b8  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01de  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x01fa  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x021a  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x02b1  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x02b3  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x02b6  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:202:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:206:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02fd  */
    /* JADX WARN: Removed duplicated region for block: B:213:0x02ff  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0303  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0308  */
    /* JADX WARN: Removed duplicated region for block: B:218:0x030c  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:225:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:228:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x0329  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0342  */
    /* JADX WARN: Removed duplicated region for block: B:243:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:246:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03e0  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x051a  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:272:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d7  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0124  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void GoogleMap(boolean z, Modifier modifier, CameraPositionState cameraPositionState, String str, Function0<GoogleMapOptions> function0, MapProperties mapProperties, LocationSource locationSource, MapUiSettings mapUiSettings, IndoorStateChangeListener indoorStateChangeListener, Function1<? super LatLng, Unit> function1, Function1<? super LatLng, Unit> function12, Function0<Unit> function02, Function0<Boolean> function03, Function1<? super Location, Unit> function13, Function1<? super PointOfInterest, Unit> function14, PaddingValues paddingValues, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        boolean z2;
        int i4;
        Modifier modifier2;
        CameraPositionState cameraPositionState2;
        int i5;
        String str2;
        int i6;
        Function0<GoogleMapOptions> function04;
        int i7;
        MapProperties defaultMapProperties;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        Function2<? super Composer, ? super Integer, Unit> function22;
        Function1<? super LatLng, Unit> function15;
        PaddingValues defaultMapContentPadding;
        boolean z3;
        int i28;
        CameraPositionState cameraPositionState3;
        final Function1<? super Location, Unit> function16;
        MapUiSettings mapUiSettings2;
        final Modifier modifier3;
        final Function0<Boolean> function05;
        Function1<? super PointOfInterest, Unit> function17;
        String str3;
        final Function0<GoogleMapOptions> function06;
        Function1<? super LatLng, Unit> function18;
        IndoorStateChangeListener indoorStateChangeListener2;
        final LocationSource locationSource2;
        final MapProperties mapProperties2;
        final Function0<Unit> function07;
        final Function2<? super Composer, ? super Integer, Unit> function2M9314getLambda1$maps_compose_release;
        String str4;
        final CameraPositionState cameraPositionState4;
        final String str5;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final Function0<GoogleMapOptions> function08;
        final boolean z4;
        Composer composer2;
        final LocationSource locationSource3;
        final MapUiSettings mapUiSettings3;
        final IndoorStateChangeListener indoorStateChangeListener3;
        final Function1<? super LatLng, Unit> function19;
        final Function0<Unit> function09;
        final Function0<Boolean> function010;
        final Function1<? super LatLng, Unit> function110;
        final Function1<? super PointOfInterest, Unit> function111;
        final Function1<? super Location, Unit> function112;
        final PaddingValues paddingValues2;
        final Modifier modifier4;
        final MapProperties mapProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        Composer composerStartRestartGroup = composer.startRestartGroup(-779704634);
        int i29 = i3 & 1;
        if (i29 != 0) {
            i4 = i | 6;
            z2 = z;
        } else if ((i & 14) == 0) {
            z2 = z;
            i4 = (composerStartRestartGroup.changed(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i4 = i;
        }
        int i30 = i3 & 2;
        if (i30 != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                modifier2 = modifier;
                i4 |= composerStartRestartGroup.changed(modifier2) ? 32 : 16;
            }
            if ((i & 896) != 0) {
                if ((i3 & 4) == 0) {
                    cameraPositionState2 = cameraPositionState;
                    int i31 = composerStartRestartGroup.changed(cameraPositionState2) ? 256 : 128;
                    i4 |= i31;
                } else {
                    cameraPositionState2 = cameraPositionState;
                }
                i4 |= i31;
            } else {
                cameraPositionState2 = cameraPositionState;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 7168) == 0) {
                    str2 = str;
                    i4 |= composerStartRestartGroup.changed(str2) ? 2048 : 1024;
                }
                i6 = i3 & 16;
                if (i6 != 0) {
                    i4 |= 24576;
                    function04 = function0;
                } else {
                    function04 = function0;
                    if ((i & 57344) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(function04) ? 16384 : 8192;
                    }
                }
                i7 = i3 & 32;
                if (i7 != 0) {
                    i4 |= 196608;
                    defaultMapProperties = mapProperties;
                } else {
                    defaultMapProperties = mapProperties;
                    if ((i & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(defaultMapProperties) ? 131072 : 65536;
                    }
                }
                i8 = i3 & 64;
                if (i8 != 0) {
                    i4 |= 524288;
                }
                i9 = i3 & 128;
                if (i9 != 0) {
                    i4 |= 12582912;
                } else if ((i & 29360128) == 0) {
                    i4 |= composerStartRestartGroup.changed(mapUiSettings) ? 8388608 : 4194304;
                }
                i10 = i3 & 256;
                if (i10 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 234881024) == 0) {
                        i11 = i10;
                        i4 |= composerStartRestartGroup.changed(indoorStateChangeListener) ? 67108864 : 33554432;
                    }
                    i12 = i3 & 512;
                    if (i12 == 0) {
                        i4 |= 805306368;
                    } else {
                        if ((i & 1879048192) == 0) {
                            i13 = i12;
                            i4 |= composerStartRestartGroup.changedInstance(function1) ? 536870912 : 268435456;
                        }
                        i14 = i3 & 1024;
                        if (i14 != 0) {
                            i16 = i2 | 6;
                            i15 = i14;
                        } else if ((i2 & 14) == 0) {
                            i15 = i14;
                            i16 = i2 | (composerStartRestartGroup.changedInstance(function12) ? 4 : 2);
                        } else {
                            i15 = i14;
                            i16 = i2;
                        }
                        i17 = i3 & 2048;
                        if (i17 != 0) {
                            i18 = i17;
                            i19 = i16 | 48;
                        } else {
                            if ((i2 & 112) == 0) {
                                i18 = i17;
                                i16 |= composerStartRestartGroup.changedInstance(function02) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            i19 = i16;
                        }
                        i20 = i3 & 4096;
                        if (i20 != 0) {
                            i21 = i19 | 384;
                        } else {
                            int i32 = i19;
                            if ((i2 & 896) == 0) {
                                i21 = i32 | (composerStartRestartGroup.changedInstance(function03) ? 256 : 128);
                            } else {
                                i21 = i32;
                            }
                        }
                        i22 = i3 & 8192;
                        if (i22 != 0) {
                            i23 = i21 | 3072;
                        } else {
                            int i33 = i21;
                            if ((i2 & 7168) == 0) {
                                i23 = i33 | (composerStartRestartGroup.changedInstance(function13) ? 2048 : 1024);
                            } else {
                                i23 = i33;
                            }
                        }
                        i24 = i3 & 16384;
                        if (i24 == 0) {
                            if ((i2 & 57344) == 0) {
                                i25 = i24;
                                i23 |= composerStartRestartGroup.changedInstance(function14) ? 16384 : 8192;
                            }
                            i26 = i3 & 32768;
                            if (i26 == 0) {
                                i23 |= 196608;
                            } else if ((i2 & 458752) == 0) {
                                i23 |= composerStartRestartGroup.changed(paddingValues) ? 131072 : 65536;
                            }
                            i27 = i3 & 65536;
                            if (i27 == 0) {
                                i23 |= 1572864;
                                function22 = function2;
                            } else {
                                function22 = function2;
                                if ((i2 & 3670016) == 0) {
                                    i23 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                                }
                            }
                            if (i8 == 64 || (1533916891 & i4) != 306783378 || (2995931 & i23) != 599186 || !composerStartRestartGroup.getSkipping()) {
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                    boolean z5 = i29 == 0 ? false : z2;
                                    if (i30 != 0) {
                                        modifier2 = Modifier.INSTANCE;
                                    }
                                    if ((i3 & 4) == 0) {
                                        composerStartRestartGroup.startReplaceableGroup(-1911106014);
                                        final CameraPositionStateKt$rememberCameraPositionState$1 cameraPositionStateKt$rememberCameraPositionState$1 = new Function1<CameraPositionState, Unit>() { // from class: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$1
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(CameraPositionState cameraPositionState5) {
                                                Intrinsics.checkNotNullParameter(cameraPositionState5, "$this$null");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(CameraPositionState cameraPositionState5) {
                                                invoke2(cameraPositionState5);
                                                return Unit.INSTANCE;
                                            }
                                        };
                                        CameraPositionState cameraPositionState5 = (CameraPositionState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) CameraPositionState.INSTANCE.getSaver(), (String) null, (Function0) new Function0<CameraPositionState>() { // from class: com.google.maps.android.compose.CameraPositionStateKt$rememberCameraPositionState$2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final CameraPositionState invoke() {
                                                CameraPositionState cameraPositionState6 = new CameraPositionState(null, 1, null);
                                                cameraPositionStateKt$rememberCameraPositionState$1.invoke(cameraPositionState6);
                                                return cameraPositionState6;
                                            }
                                        }, composerStartRestartGroup, 72, 0);
                                        composerStartRestartGroup.endReplaceableGroup();
                                        i4 &= -897;
                                        cameraPositionState2 = cameraPositionState5;
                                    }
                                    String str6 = i5 == 0 ? null : str;
                                    if (i6 != 0) {
                                        function04 = new Function0<GoogleMapOptions>() { // from class: com.google.maps.android.compose.GoogleMapKt.GoogleMap.1
                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final GoogleMapOptions invoke() {
                                                return new GoogleMapOptions();
                                            }
                                        };
                                    }
                                    if (i7 != 0) {
                                        defaultMapProperties = MapProperties2.getDefaultMapProperties();
                                    }
                                    LocationSource locationSource4 = i8 == 0 ? null : locationSource;
                                    MapUiSettings defaultMapUiSettings = i9 == 0 ? MapUiSettings2.getDefaultMapUiSettings() : mapUiSettings;
                                    IndoorStateChangeListener indoorStateChangeListener4 = i11 == 0 ? DefaultIndoorStateChangeListener.INSTANCE : indoorStateChangeListener;
                                    Function1<? super LatLng, Unit> function113 = i13 == 0 ? null : function1;
                                    function15 = i15 == 0 ? null : function12;
                                    Function0<Unit> function011 = i18 == 0 ? null : function02;
                                    Function0<Boolean> function012 = i20 == 0 ? null : function03;
                                    Function1<? super Location, Unit> function114 = i22 == 0 ? null : function13;
                                    Function1<? super PointOfInterest, Unit> function115 = i25 == 0 ? function14 : null;
                                    defaultMapContentPadding = i26 == 0 ? MapUpdaterKt.getDefaultMapContentPadding() : paddingValues;
                                    if (i27 == 0) {
                                        z3 = z5;
                                        i28 = i4;
                                        cameraPositionState3 = cameraPositionState2;
                                        function16 = function114;
                                        mapUiSettings2 = defaultMapUiSettings;
                                        modifier3 = modifier2;
                                        function05 = function012;
                                        function17 = function115;
                                        str3 = str6;
                                        function06 = function04;
                                        function18 = function113;
                                        indoorStateChangeListener2 = indoorStateChangeListener4;
                                        locationSource2 = locationSource4;
                                        mapProperties2 = defaultMapProperties;
                                        function07 = function011;
                                        function2M9314getLambda1$maps_compose_release = GoogleMap2.INSTANCE.m9314getLambda1$maps_compose_release();
                                    } else {
                                        z3 = z5;
                                        i28 = i4;
                                        cameraPositionState3 = cameraPositionState2;
                                        function16 = function114;
                                        mapUiSettings2 = defaultMapUiSettings;
                                        modifier3 = modifier2;
                                        function05 = function012;
                                        function17 = function115;
                                        str3 = str6;
                                        function06 = function04;
                                        function18 = function113;
                                        indoorStateChangeListener2 = indoorStateChangeListener4;
                                        locationSource2 = locationSource4;
                                        mapProperties2 = defaultMapProperties;
                                        function07 = function011;
                                        function2M9314getLambda1$maps_compose_release = function2;
                                    }
                                } else {
                                    composerStartRestartGroup.skipToGroupEnd();
                                    if ((i3 & 4) != 0) {
                                        i4 &= -897;
                                    }
                                    indoorStateChangeListener2 = indoorStateChangeListener;
                                    function15 = function12;
                                    function17 = function14;
                                    defaultMapContentPadding = paddingValues;
                                    str3 = str2;
                                    function2M9314getLambda1$maps_compose_release = function22;
                                    z3 = z2;
                                    i28 = i4;
                                    function06 = function04;
                                    mapProperties2 = defaultMapProperties;
                                    modifier3 = modifier2;
                                    cameraPositionState3 = cameraPositionState2;
                                    locationSource2 = locationSource;
                                    mapUiSettings2 = mapUiSettings;
                                    function18 = function1;
                                    function07 = function02;
                                    function05 = function03;
                                    function16 = function13;
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                    str4 = str3;
                                } else {
                                    str4 = str3;
                                    ComposerKt.traceEventStart(-779704634, i28, i23, "com.google.maps.android.compose.GoogleMap (GoogleMap.kt:92)");
                                }
                                composerStartRestartGroup.startReplaceableGroup(1548707096);
                                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                                    BoxKt.Box(modifier3, composerStartRestartGroup, (i28 >> 3) & 14);
                                    composerStartRestartGroup.endReplaceableGroup();
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    ScopeUpdateScope scopeUpdateScopeEndRestartGroup2 = composerStartRestartGroup.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup2 != null) {
                                        final CameraPositionState cameraPositionState6 = cameraPositionState3;
                                        final String str7 = str4;
                                        final MapUiSettings mapUiSettings4 = mapUiSettings2;
                                        final IndoorStateChangeListener indoorStateChangeListener5 = indoorStateChangeListener2;
                                        final Function1<? super LatLng, Unit> function116 = function18;
                                        final Function1<? super LatLng, Unit> function117 = function15;
                                        final Function1<? super PointOfInterest, Unit> function118 = function17;
                                        final PaddingValues paddingValues3 = defaultMapContentPadding;
                                        final boolean z6 = z3;
                                        scopeUpdateScopeEndRestartGroup2.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.GoogleMapKt.GoogleMap.2
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(2);
                                            }

                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                                invoke(composer3, num.intValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(Composer composer3, int i34) {
                                                GoogleMap5.GoogleMap(z6, modifier3, cameraPositionState6, str7, function06, mapProperties2, locationSource2, mapUiSettings4, indoorStateChangeListener5, function116, function117, function07, function05, function16, function118, paddingValues3, function2M9314getLambda1$maps_compose_release, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                Function1<? super PointOfInterest, Unit> function119 = function17;
                                int i34 = i28;
                                cameraPositionState4 = cameraPositionState3;
                                str5 = str4;
                                int i35 = i23;
                                Modifier modifier5 = modifier3;
                                Function0<GoogleMapOptions> function013 = function06;
                                Function1<? super Location, Unit> function120 = function16;
                                PaddingValues paddingValues4 = defaultMapContentPadding;
                                Function0<Boolean> function014 = function05;
                                Function0<Unit> function015 = function07;
                                Function1<? super LatLng, Unit> function121 = function18;
                                IndoorStateChangeListener indoorStateChangeListener6 = indoorStateChangeListener2;
                                MapUiSettings mapUiSettings5 = mapUiSettings2;
                                LocationSource locationSource5 = locationSource2;
                                boolean z7 = z3;
                                composerStartRestartGroup.endReplaceableGroup();
                                Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
                                composerStartRestartGroup.startReplaceableGroup(1548707243);
                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                Composer.Companion companion = Composer.INSTANCE;
                                MapProperties mapProperties4 = mapProperties2;
                                if (objRememberedValue == companion.getEmpty()) {
                                    objRememberedValue = new MapView(context, function013.invoke());
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                }
                                final MapView mapView = (MapView) objRememberedValue;
                                composerStartRestartGroup.endReplaceableGroup();
                                AndroidView_androidKt.AndroidView(new Function1<Context, MapView>() { // from class: com.google.maps.android.compose.GoogleMapKt.GoogleMap.3
                                    {
                                        super(1);
                                    }

                                    @Override // kotlin.jvm.functions.Function1
                                    public final MapView invoke(Context it) {
                                        Intrinsics.checkNotNullParameter(it, "it");
                                        return mapView;
                                    }
                                }, modifier5, null, composerStartRestartGroup, i34 & 112, 4);
                                MapLifecycle(mapView, composerStartRestartGroup, 8);
                                composerStartRestartGroup.startReplaceableGroup(1548707591);
                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                if (objRememberedValue2 == companion.getEmpty()) {
                                    objRememberedValue2 = new MapClickListeners();
                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                }
                                MapClickListeners mapClickListeners = (MapClickListeners) objRememberedValue2;
                                composerStartRestartGroup.endReplaceableGroup();
                                mapClickListeners.setIndoorStateChangeListener(indoorStateChangeListener6);
                                mapClickListeners.setOnMapClick(function121);
                                mapClickListeners.setOnMapLongClick(function15);
                                mapClickListeners.setOnMapLoaded(function015);
                                mapClickListeners.setOnMyLocationButtonClick(function014);
                                mapClickListeners.setOnMyLocationClick(function120);
                                mapClickListeners.setOnPOIClick(function119);
                                Function2<? super Composer, ? super Integer, Unit> function24 = function2M9314getLambda1$maps_compose_release;
                                function23 = function24;
                                EffectsKt.LaunchedEffect(Unit.INSTANCE, new C56264(mapView, Composables.rememberCompositionContext(composerStartRestartGroup, 0), mapClickListeners, z7, SnapshotStateKt.rememberUpdatedState(str5, composerStartRestartGroup, (i34 >> 9) & 14), SnapshotStateKt.rememberUpdatedState(cameraPositionState4, composerStartRestartGroup, (i34 >> 6) & 14), SnapshotStateKt.rememberUpdatedState(paddingValues4, composerStartRestartGroup, (i35 >> 15) & 14), SnapshotStateKt.rememberUpdatedState(locationSource5, composerStartRestartGroup, 8), SnapshotStateKt.rememberUpdatedState(mapProperties4, composerStartRestartGroup, (i34 >> 15) & 14), SnapshotStateKt.rememberUpdatedState(mapUiSettings5, composerStartRestartGroup, (i34 >> 21) & 14), SnapshotStateKt.rememberUpdatedState(function24, composerStartRestartGroup, (i35 >> 18) & 14), null), composerStartRestartGroup, 70);
                                if (ComposerKt.isTraceInProgress()) {
                                    ComposerKt.traceEventEnd();
                                }
                                function08 = function013;
                                z4 = z7;
                                composer2 = composerStartRestartGroup;
                                locationSource3 = locationSource5;
                                mapUiSettings3 = mapUiSettings5;
                                indoorStateChangeListener3 = indoorStateChangeListener6;
                                function19 = function121;
                                function09 = function015;
                                function010 = function014;
                                function110 = function15;
                                function111 = function119;
                                function112 = function120;
                                paddingValues2 = paddingValues4;
                                modifier4 = modifier5;
                                mapProperties3 = mapProperties4;
                            } else {
                                composerStartRestartGroup.skipToGroupEnd();
                                indoorStateChangeListener3 = indoorStateChangeListener;
                                function19 = function1;
                                function111 = function14;
                                paddingValues2 = paddingValues;
                                str5 = str2;
                                function23 = function22;
                                z4 = z2;
                                composer2 = composerStartRestartGroup;
                                function08 = function04;
                                mapProperties3 = defaultMapProperties;
                                modifier4 = modifier2;
                                cameraPositionState4 = cameraPositionState2;
                                locationSource3 = locationSource;
                                mapUiSettings3 = mapUiSettings;
                                function110 = function12;
                                function09 = function02;
                                function010 = function03;
                                function112 = function13;
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.GoogleMapKt.GoogleMap.5
                                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                    /* JADX WARN: Multi-variable type inference failed */
                                    {
                                        super(2);
                                    }

                                    @Override // kotlin.jvm.functions.Function2
                                    public /* bridge */ /* synthetic */ Unit invoke(Composer composer3, Integer num) {
                                        invoke(composer3, num.intValue());
                                        return Unit.INSTANCE;
                                    }

                                    public final void invoke(Composer composer3, int i36) {
                                        GoogleMap5.GoogleMap(z4, modifier4, cameraPositionState4, str5, function08, mapProperties3, locationSource3, mapUiSettings3, indoorStateChangeListener3, function19, function110, function09, function010, function112, function111, paddingValues2, function23, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                    }
                                });
                                return;
                            }
                            return;
                        }
                        i23 |= 24576;
                        i25 = i24;
                        i26 = i3 & 32768;
                        if (i26 == 0) {
                        }
                        i27 = i3 & 65536;
                        if (i27 == 0) {
                        }
                        if (i8 == 64) {
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                                if (i29 == 0) {
                                }
                                if (i30 != 0) {
                                }
                                if ((i3 & 4) == 0) {
                                }
                                if (i5 == 0) {
                                }
                                if (i6 != 0) {
                                }
                                if (i7 != 0) {
                                }
                                if (i8 == 0) {
                                }
                                if (i9 == 0) {
                                }
                                if (i11 == 0) {
                                }
                                if (i13 == 0) {
                                }
                                if (i15 == 0) {
                                }
                                if (i18 == 0) {
                                }
                                if (i20 == 0) {
                                }
                                if (i22 == 0) {
                                }
                                if (i25 == 0) {
                                }
                                if (i26 == 0) {
                                }
                                if (i27 == 0) {
                                }
                                composerStartRestartGroup.endDefaults();
                                if (ComposerKt.isTraceInProgress()) {
                                }
                                composerStartRestartGroup.startReplaceableGroup(1548707096);
                                if (!((Boolean) composerStartRestartGroup.consume(InspectionMode.getLocalInspectionMode())).booleanValue()) {
                                }
                            }
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i3 & 1024;
                    if (i14 != 0) {
                    }
                    i17 = i3 & 2048;
                    if (i17 != 0) {
                    }
                    i20 = i3 & 4096;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 8192;
                    if (i22 != 0) {
                    }
                    i24 = i3 & 16384;
                    if (i24 == 0) {
                    }
                    i25 = i24;
                    i26 = i3 & 32768;
                    if (i26 == 0) {
                    }
                    i27 = i3 & 65536;
                    if (i27 == 0) {
                    }
                    if (i8 == 64) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i11 = i10;
                i12 = i3 & 512;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 1024;
                if (i14 != 0) {
                }
                i17 = i3 & 2048;
                if (i17 != 0) {
                }
                i20 = i3 & 4096;
                if (i20 != 0) {
                }
                i22 = i3 & 8192;
                if (i22 != 0) {
                }
                i24 = i3 & 16384;
                if (i24 == 0) {
                }
                i25 = i24;
                i26 = i3 & 32768;
                if (i26 == 0) {
                }
                i27 = i3 & 65536;
                if (i27 == 0) {
                }
                if (i8 == 64) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            str2 = str;
            i6 = i3 & 16;
            if (i6 != 0) {
            }
            i7 = i3 & 32;
            if (i7 != 0) {
            }
            i8 = i3 & 64;
            if (i8 != 0) {
            }
            i9 = i3 & 128;
            if (i9 != 0) {
            }
            i10 = i3 & 256;
            if (i10 != 0) {
            }
            i11 = i10;
            i12 = i3 & 512;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 1024;
            if (i14 != 0) {
            }
            i17 = i3 & 2048;
            if (i17 != 0) {
            }
            i20 = i3 & 4096;
            if (i20 != 0) {
            }
            i22 = i3 & 8192;
            if (i22 != 0) {
            }
            i24 = i3 & 16384;
            if (i24 == 0) {
            }
            i25 = i24;
            i26 = i3 & 32768;
            if (i26 == 0) {
            }
            i27 = i3 & 65536;
            if (i27 == 0) {
            }
            if (i8 == 64) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        if ((i & 896) != 0) {
        }
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        str2 = str;
        i6 = i3 & 16;
        if (i6 != 0) {
        }
        i7 = i3 & 32;
        if (i7 != 0) {
        }
        i8 = i3 & 64;
        if (i8 != 0) {
        }
        i9 = i3 & 128;
        if (i9 != 0) {
        }
        i10 = i3 & 256;
        if (i10 != 0) {
        }
        i11 = i10;
        i12 = i3 & 512;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 1024;
        if (i14 != 0) {
        }
        i17 = i3 & 2048;
        if (i17 != 0) {
        }
        i20 = i3 & 4096;
        if (i20 != 0) {
        }
        i22 = i3 & 8192;
        if (i22 != 0) {
        }
        i24 = i3 & 16384;
        if (i24 == 0) {
        }
        i25 = i24;
        i26 = i3 & 32768;
        if (i26 == 0) {
        }
        i27 = i3 & 65536;
        if (i27 == 0) {
        }
        if (i8 == 64) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }

    /* compiled from: GoogleMap.kt */
    @Metadata(m3635d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@"}, m3636d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, m3637k = 3, m3638mv = {1, 9, 0}, m3640xi = 48)
    @DebugMetadata(m3644c = "com.google.maps.android.compose.GoogleMapKt$GoogleMap$4", m3645f = "GoogleMap.kt", m3646l = {EnumC7081g.SDK_ASSET_ILLUSTRATION_DEBIT_CARD_OVERLAY_PIGGY_SOLID_VALUE, EnumC7081g.SDK_ASSET_ILLUSTRATION_CODE_ACCOUNT_VERIFICATION_3_VALUE}, m3647m = "invokeSuspend")
    @SourceDebugExtension
    /* renamed from: com.google.maps.android.compose.GoogleMapKt$GoogleMap$4 */
    static final class C56264 extends ContinuationImpl7 implements Function2<CoroutineScope, Continuation<? super Unit>, Object> {
        final /* synthetic */ SnapshotState4<CameraPositionState> $currentCameraPositionState$delegate;
        final /* synthetic */ SnapshotState4<Function2<Composer, Integer, Unit>> $currentContent$delegate;
        final /* synthetic */ SnapshotState4<String> $currentContentDescription$delegate;
        final /* synthetic */ SnapshotState4<PaddingValues> $currentContentPadding$delegate;
        final /* synthetic */ SnapshotState4<LocationSource> $currentLocationSource$delegate;
        final /* synthetic */ SnapshotState4<MapProperties> $currentMapProperties$delegate;
        final /* synthetic */ SnapshotState4<MapUiSettings> $currentUiSettings$delegate;
        final /* synthetic */ MapClickListeners $mapClickListeners;
        final /* synthetic */ MapView $mapView;
        final /* synthetic */ boolean $mergeDescendants;
        final /* synthetic */ CompositionContext $parentComposition;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C56264(MapView mapView, CompositionContext compositionContext, MapClickListeners mapClickListeners, boolean z, SnapshotState4<String> snapshotState4, SnapshotState4<CameraPositionState> snapshotState42, SnapshotState4<? extends PaddingValues> snapshotState43, SnapshotState4<? extends LocationSource> snapshotState44, SnapshotState4<MapProperties> snapshotState45, SnapshotState4<MapUiSettings> snapshotState46, SnapshotState4<? extends Function2<? super Composer, ? super Integer, Unit>> snapshotState47, Continuation<? super C56264> continuation) {
            super(2, continuation);
            this.$mapView = mapView;
            this.$parentComposition = compositionContext;
            this.$mapClickListeners = mapClickListeners;
            this.$mergeDescendants = z;
            this.$currentContentDescription$delegate = snapshotState4;
            this.$currentCameraPositionState$delegate = snapshotState42;
            this.$currentContentPadding$delegate = snapshotState43;
            this.$currentLocationSource$delegate = snapshotState44;
            this.$currentMapProperties$delegate = snapshotState45;
            this.$currentUiSettings$delegate = snapshotState46;
            this.$currentContent$delegate = snapshotState47;
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new C56264(this.$mapView, this.$parentComposition, this.$mapClickListeners, this.$mergeDescendants, this.$currentContentDescription$delegate, this.$currentCameraPositionState$delegate, this.$currentContentPadding$delegate, this.$currentLocationSource$delegate, this.$currentMapProperties$delegate, this.$currentUiSettings$delegate, this.$currentContent$delegate, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(CoroutineScope coroutineScope, Continuation<? super Unit> continuation) {
            return ((C56264) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.ContinuationImpl2
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object orThrow;
            MapView mapView;
            Function2<? super Composer, ? super Integer, Unit> function2;
            CompositionContext compositionContext;
            MapClickListeners mapClickListeners;
            Composition Composition;
            Composition composition;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i = this.label;
            try {
                if (i == 0) {
                    ResultKt.throwOnFailure(obj);
                    MapView mapView2 = this.$mapView;
                    CompositionContext compositionContext2 = this.$parentComposition;
                    MapClickListeners mapClickListeners2 = this.$mapClickListeners;
                    final boolean z = this.$mergeDescendants;
                    final SnapshotState4<String> snapshotState4 = this.$currentContentDescription$delegate;
                    final SnapshotState4<CameraPositionState> snapshotState42 = this.$currentCameraPositionState$delegate;
                    final SnapshotState4<PaddingValues> snapshotState43 = this.$currentContentPadding$delegate;
                    final SnapshotState4<LocationSource> snapshotState44 = this.$currentLocationSource$delegate;
                    final SnapshotState4<MapProperties> snapshotState45 = this.$currentMapProperties$delegate;
                    final SnapshotState4<MapUiSettings> snapshotState46 = this.$currentUiSettings$delegate;
                    final SnapshotState4<Function2<Composer, Integer, Unit>> snapshotState47 = this.$currentContent$delegate;
                    ComposableLambda composableLambdaComposableLambdaInstance = ComposableLambda3.composableLambdaInstance(-1029672939, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.GoogleMapKt$GoogleMap$4$1$1
                        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                        /* JADX WARN: Multi-variable type inference failed */
                        {
                            super(2);
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public /* bridge */ /* synthetic */ Unit invoke(Composer composer, Integer num) {
                            invoke(composer, num.intValue());
                            return Unit.INSTANCE;
                        }

                        public final void invoke(Composer composer, int i2) {
                            if ((i2 & 11) == 2 && composer.getSkipping()) {
                                composer.skipToGroupEnd();
                                return;
                            }
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventStart(-1029672939, i2, -1, "com.google.maps.android.compose.GoogleMap.<anonymous>.<anonymous>.<anonymous> (GoogleMap.kt:128)");
                            }
                            boolean z2 = z;
                            final String strGoogleMap$lambda$3 = GoogleMap5.GoogleMap$lambda$3(snapshotState4);
                            final CameraPositionState cameraPositionStateGoogleMap$lambda$5 = GoogleMap5.GoogleMap$lambda$5(snapshotState42);
                            PaddingValues paddingValuesGoogleMap$lambda$6 = GoogleMap5.GoogleMap$lambda$6(snapshotState43);
                            LocationSource locationSourceGoogleMap$lambda$4 = GoogleMap5.GoogleMap$lambda$4(snapshotState44);
                            MapProperties mapPropertiesGoogleMap$lambda$8 = GoogleMap5.GoogleMap$lambda$8(snapshotState45);
                            MapUiSettings mapUiSettingsGoogleMap$lambda$7 = GoogleMap5.GoogleMap$lambda$7(snapshotState46);
                            composer.startReplaceableGroup(1782787885);
                            Applier<?> applier = composer.getApplier();
                            Intrinsics.checkNotNull(applier, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                            final GoogleMap map = ((MapApplier) applier).getMap();
                            Applier<?> applier2 = composer.getApplier();
                            Intrinsics.checkNotNull(applier2, "null cannot be cast to non-null type com.google.maps.android.compose.MapApplier");
                            MapView mapView3 = ((MapApplier) applier2).getMapView();
                            if (z2) {
                                mapView3.setImportantForAccessibility(4);
                            }
                            final Density density = (Density) composer.consume(CompositionLocalsKt.getLocalDensity());
                            final LayoutDirection layoutDirection = (LayoutDirection) composer.consume(CompositionLocalsKt.getLocalLayoutDirection());
                            final Function0<MapPropertiesNode> function0 = new Function0<MapPropertiesNode>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$1
                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                {
                                    super(0);
                                }

                                /* JADX WARN: Can't rename method to resolve collision */
                                @Override // kotlin.jvm.functions.Function0
                                public final MapPropertiesNode invoke() {
                                    return new MapPropertiesNode(map, cameraPositionStateGoogleMap$lambda$5, strGoogleMap$lambda$3, density, layoutDirection);
                                }
                            };
                            composer.startReplaceableGroup(1886828752);
                            if (!(composer.getApplier() instanceof MapApplier)) {
                                Composables.invalidApplier();
                            }
                            composer.startNode();
                            if (composer.getInserting()) {
                                composer.createNode(new Function0<MapPropertiesNode>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$$inlined$ComposeNode$1
                                    {
                                        super(0);
                                    }

                                    /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.MapPropertiesNode, java.lang.Object] */
                                    @Override // kotlin.jvm.functions.Function0
                                    public final MapPropertiesNode invoke() {
                                        return function0.invoke();
                                    }
                                });
                            } else {
                                composer.useNode();
                            }
                            Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composer);
                            Updater.m6391updateimpl(composerM6388constructorimpl, density, new Function2<MapPropertiesNode, Density, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$1
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Density density2) {
                                    invoke2(mapPropertiesNode, density2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode update, Density it) {
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    update.setDensity(it);
                                }
                            });
                            Updater.m6391updateimpl(composerM6388constructorimpl, layoutDirection, new Function2<MapPropertiesNode, LayoutDirection, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$2
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, LayoutDirection layoutDirection2) {
                                    invoke2(mapPropertiesNode, layoutDirection2);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode update, LayoutDirection it) {
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    update.setLayoutDirection(it);
                                }
                            });
                            Updater.m6391updateimpl(composerM6388constructorimpl, strGoogleMap$lambda$3, new Function2<MapPropertiesNode, String, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$3
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, String str) {
                                    invoke2(mapPropertiesNode, str);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode update, String str) {
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    update.setContentDescription(str);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, locationSourceGoogleMap$lambda$4, new Function2<MapPropertiesNode, LocationSource, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$4
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, LocationSource locationSource) {
                                    invoke2(mapPropertiesNode, locationSource);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode set, LocationSource locationSource) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setLocationSource(locationSource);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapPropertiesGoogleMap$lambda$8.getIsBuildingEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$5
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setBuildingsEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapPropertiesGoogleMap$lambda$8.getIsIndoorEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$6
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setIndoorEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapPropertiesGoogleMap$lambda$8.getIsMyLocationEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$7
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setMyLocationEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapPropertiesGoogleMap$lambda$8.getIsTrafficEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$8
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setTrafficEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, mapPropertiesGoogleMap$lambda$8.getLatLngBoundsForCameraTarget(), new Function2<MapPropertiesNode, LatLngBounds, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$9
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, LatLngBounds latLngBounds) {
                                    invoke2(mapPropertiesNode, latLngBounds);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode set, LatLngBounds latLngBounds) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setLatLngBoundsForCameraTarget(latLngBounds);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, mapPropertiesGoogleMap$lambda$8.getMapStyleOptions(), new Function2<MapPropertiesNode, MapStyleOptions, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$10
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, MapStyleOptions mapStyleOptions) {
                                    invoke2(mapPropertiesNode, mapStyleOptions);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode set, MapStyleOptions mapStyleOptions) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setMapStyle(mapStyleOptions);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, mapPropertiesGoogleMap$lambda$8.getMapType(), new Function2<MapPropertiesNode, MapType, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$11
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, MapType mapType) {
                                    invoke2(mapPropertiesNode, mapType);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode set, MapType it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    map.setMapType(it.getValue());
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Float.valueOf(mapPropertiesGoogleMap$lambda$8.getMaxZoomPreference()), new Function2<MapPropertiesNode, Float, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$12
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Float f) {
                                    invoke(mapPropertiesNode, f.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, float f) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setMaxZoomPreference(f);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Float.valueOf(mapPropertiesGoogleMap$lambda$8.getMinZoomPreference()), new Function2<MapPropertiesNode, Float, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$13
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Float f) {
                                    invoke(mapPropertiesNode, f.floatValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, float f) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.setMinZoomPreference(f);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, paddingValuesGoogleMap$lambda$6, new Function2<MapPropertiesNode, PaddingValues, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$14
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, PaddingValues paddingValues) {
                                    invoke2(mapPropertiesNode, paddingValues);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode set, PaddingValues it) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    Density density2 = set.getDensity();
                                    map.setPadding(density2.mo5010roundToPx0680j_4(it.mo5118calculateLeftPaddingu2uoSUM(set.getLayoutDirection())), density2.mo5010roundToPx0680j_4(it.getTop()), density2.mo5010roundToPx0680j_4(it.mo5119calculateRightPaddingu2uoSUM(set.getLayoutDirection())), density2.mo5010roundToPx0680j_4(it.getBottom()));
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getCompassEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$15
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setCompassEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getIndoorLevelPickerEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$16
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setIndoorLevelPickerEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getMapToolbarEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$17
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setMapToolbarEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getMyLocationButtonEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$18
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setMyLocationButtonEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getRotationGesturesEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$19
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setRotateGesturesEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getScrollGesturesEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$20
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setScrollGesturesEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getScrollGesturesEnabledDuringRotateOrZoom()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$21
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setScrollGesturesEnabledDuringRotateOrZoom(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getTiltGesturesEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$22
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setTiltGesturesEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getZoomControlsEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$23
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setZoomControlsEnabled(z3);
                                }
                            });
                            Updater.m6390setimpl(composerM6388constructorimpl, Boolean.valueOf(mapUiSettingsGoogleMap$lambda$7.getZoomGesturesEnabled()), new Function2<MapPropertiesNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$24
                                {
                                    super(2);
                                }

                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, Boolean bool) {
                                    invoke(mapPropertiesNode, bool.booleanValue());
                                    return Unit.INSTANCE;
                                }

                                public final void invoke(MapPropertiesNode set, boolean z3) {
                                    Intrinsics.checkNotNullParameter(set, "$this$set");
                                    map.getUiSettings().setZoomGesturesEnabled(z3);
                                }
                            });
                            Updater.m6391updateimpl(composerM6388constructorimpl, cameraPositionStateGoogleMap$lambda$5, new Function2<MapPropertiesNode, CameraPositionState, Unit>() { // from class: com.google.maps.android.compose.MapUpdaterKt$MapUpdater$2$25
                                @Override // kotlin.jvm.functions.Function2
                                public /* bridge */ /* synthetic */ Unit invoke(MapPropertiesNode mapPropertiesNode, CameraPositionState cameraPositionState) {
                                    invoke2(mapPropertiesNode, cameraPositionState);
                                    return Unit.INSTANCE;
                                }

                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                public final void invoke2(MapPropertiesNode update, CameraPositionState it) {
                                    Intrinsics.checkNotNullParameter(update, "$this$update");
                                    Intrinsics.checkNotNullParameter(it, "it");
                                    update.setCameraPositionState(it);
                                }
                            });
                            composer.endNode();
                            composer.endReplaceableGroup();
                            composer.endReplaceableGroup();
                            MapClickListenersKt.MapClickListenerUpdater(composer, 0);
                            CompositionLocal3.CompositionLocalProvider(CameraPositionStateKt.getLocalCameraPositionState().provides(GoogleMap5.GoogleMap$lambda$5(snapshotState42)), (Function2<? super Composer, ? super Integer, Unit>) GoogleMap5.GoogleMap$lambda$9(snapshotState47), composer, ProvidedValue.$stable);
                            if (ComposerKt.isTraceInProgress()) {
                                ComposerKt.traceEventEnd();
                            }
                        }
                    });
                    this.L$0 = compositionContext2;
                    this.L$1 = mapClickListeners2;
                    this.L$2 = mapView2;
                    this.L$3 = composableLambdaComposableLambdaInstance;
                    this.L$4 = this;
                    this.L$5 = mapView2;
                    this.label = 1;
                    final SafeContinuationJvm safeContinuationJvm = new SafeContinuationJvm(IntrinsicsKt.intercepted(this));
                    mapView2.getMapAsync(new OnMapReadyCallback() { // from class: com.google.maps.android.compose.GoogleMapKt$newComposition$$inlined$awaitMap$1
                        @Override // com.google.android.gms.maps.OnMapReadyCallback
                        public final void onMapReady(GoogleMap it) {
                            Intrinsics.checkNotNullParameter(it, "it");
                            safeContinuationJvm.resumeWith(Result.m28550constructorimpl(it));
                        }
                    });
                    orThrow = safeContinuationJvm.getOrThrow();
                    if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        DebugProbes.probeCoroutineSuspended(this);
                    }
                    if (orThrow != coroutine_suspended) {
                        mapView = mapView2;
                        function2 = composableLambdaComposableLambdaInstance;
                        compositionContext = compositionContext2;
                        mapClickListeners = mapClickListeners2;
                    }
                    return coroutine_suspended;
                }
                if (i != 1) {
                    if (i != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    composition = (Composition) this.L$0;
                    try {
                        ResultKt.throwOnFailure(obj);
                        throw new ExceptionsH();
                    } catch (Throwable th) {
                        th = th;
                        composition.dispose();
                        throw th;
                    }
                }
                function2 = (Function2) this.L$3;
                MapView mapView3 = (MapView) this.L$2;
                MapClickListeners mapClickListeners3 = (MapClickListeners) this.L$1;
                CompositionContext compositionContext3 = (CompositionContext) this.L$0;
                ResultKt.throwOnFailure(obj);
                compositionContext = compositionContext3;
                mapClickListeners = mapClickListeners3;
                mapView = mapView3;
                orThrow = obj;
                this.L$0 = Composition;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.L$4 = null;
                this.L$5 = null;
                this.label = 2;
                if (DelayKt.awaitCancellation(this) != coroutine_suspended) {
                    composition = Composition;
                    throw new ExceptionsH();
                }
                return coroutine_suspended;
            } catch (Throwable th2) {
                th = th2;
                composition = Composition;
                composition.dispose();
                throw th;
            }
            Composition = CompositionKt.Composition(new MapApplier((GoogleMap) orThrow, mapView, mapClickListeners), compositionContext);
            Composition.setContent(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MapLifecycle(final MapView mapView, Composer composer, final int i) {
        Composer composerStartRestartGroup = composer.startRestartGroup(-1013003870);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-1013003870, i, -1, "com.google.maps.android.compose.MapLifecycle (GoogleMap.kt:175)");
        }
        final Context context = (Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext());
        final Lifecycle lifecycle = ((LifecycleOwner) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalLifecycleOwner())).getLifecycle();
        composerStartRestartGroup.startReplaceableGroup(-733871286);
        Object objRememberedValue = composerStartRestartGroup.rememberedValue();
        if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = SnapshotState3.mutableStateOf$default(Lifecycle.Event.ON_CREATE, null, 2, null);
            composerStartRestartGroup.updateRememberedValue(objRememberedValue);
        }
        final SnapshotState snapshotState = (SnapshotState) objRememberedValue;
        composerStartRestartGroup.endReplaceableGroup();
        EffectsKt.DisposableEffect(context, lifecycle, mapView, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.maps.android.compose.GoogleMapKt.MapLifecycle.1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final LifecycleEventObserver lifecycleEventObserverLifecycleObserver = GoogleMap5.lifecycleObserver(mapView, snapshotState);
                final ComponentCallbacks componentCallbacks = GoogleMap5.componentCallbacks(mapView);
                lifecycle.addObserver(lifecycleEventObserverLifecycleObserver);
                context.registerComponentCallbacks(componentCallbacks);
                final Lifecycle lifecycle2 = lifecycle;
                final Context context2 = context;
                return new DisposableEffectResult() { // from class: com.google.maps.android.compose.GoogleMapKt$MapLifecycle$1$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        lifecycle2.removeObserver(lifecycleEventObserverLifecycleObserver);
                        context2.unregisterComponentCallbacks(componentCallbacks);
                    }
                };
            }
        }, composerStartRestartGroup, 584);
        EffectsKt.DisposableEffect(mapView, new Function1<DisposableEffectScope, DisposableEffectResult>() { // from class: com.google.maps.android.compose.GoogleMapKt.MapLifecycle.2
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public final DisposableEffectResult invoke(DisposableEffectScope DisposableEffect) {
                Intrinsics.checkNotNullParameter(DisposableEffect, "$this$DisposableEffect");
                final MapView mapView2 = mapView;
                return new DisposableEffectResult() { // from class: com.google.maps.android.compose.GoogleMapKt$MapLifecycle$2$invoke$$inlined$onDispose$1
                    @Override // androidx.compose.runtime.DisposableEffectResult
                    public void dispose() {
                        mapView2.onDestroy();
                        mapView2.removeAllViews();
                    }
                };
            }
        }, composerStartRestartGroup, 8);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.GoogleMapKt.MapLifecycle.3
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i2) {
                    GoogleMap5.MapLifecycle(mapView, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1));
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LifecycleEventObserver lifecycleObserver(final MapView mapView, final SnapshotState<Lifecycle.Event> snapshotState) {
        return new LifecycleEventObserver() { // from class: com.google.maps.android.compose.GoogleMapKt$$ExternalSyntheticLambda0
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                GoogleMap5.lifecycleObserver$lambda$12(snapshotState, mapView, lifecycleOwner, event);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lifecycleObserver$lambda$12(SnapshotState previousState, MapView this_lifecycleObserver, LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        Intrinsics.checkNotNullParameter(previousState, "$previousState");
        Intrinsics.checkNotNullParameter(this_lifecycleObserver, "$this_lifecycleObserver");
        Intrinsics.checkNotNullParameter(lifecycleOwner, "<anonymous parameter 0>");
        Intrinsics.checkNotNullParameter(event, "event");
        event.getTargetState();
        switch (WhenMappings.$EnumSwitchMapping$0[event.ordinal()]) {
            case 1:
                if (previousState.getValue() != Lifecycle.Event.ON_STOP) {
                    this_lifecycleObserver.onCreate(new Bundle());
                    break;
                }
                break;
            case 2:
                this_lifecycleObserver.onStart();
                break;
            case 3:
                this_lifecycleObserver.onResume();
                break;
            case 4:
                this_lifecycleObserver.onPause();
                break;
            case 5:
                this_lifecycleObserver.onStop();
                break;
            case 6:
                break;
            default:
                throw new IllegalStateException();
        }
        previousState.setValue(event);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ComponentCallbacks componentCallbacks(final MapView mapView) {
        return new ComponentCallbacks() { // from class: com.google.maps.android.compose.GoogleMapKt.componentCallbacks.1
            @Override // android.content.ComponentCallbacks
            public void onConfigurationChanged(Configuration config) {
                Intrinsics.checkNotNullParameter(config, "config");
            }

            @Override // android.content.ComponentCallbacks
            public void onLowMemory() {
                mapView.onLowMemory();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String GoogleMap$lambda$3(SnapshotState4<String> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final LocationSource GoogleMap$lambda$4(SnapshotState4<? extends LocationSource> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CameraPositionState GoogleMap$lambda$5(SnapshotState4<CameraPositionState> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final PaddingValues GoogleMap$lambda$6(SnapshotState4<? extends PaddingValues> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapUiSettings GoogleMap$lambda$7(SnapshotState4<MapUiSettings> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final MapProperties GoogleMap$lambda$8(SnapshotState4<MapProperties> snapshotState4) {
        return snapshotState4.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Function2<Composer, Integer, Unit> GoogleMap$lambda$9(SnapshotState4<? extends Function2<? super Composer, ? super Integer, Unit>> snapshotState4) {
        return (Function2) snapshotState4.getValue();
    }
}
