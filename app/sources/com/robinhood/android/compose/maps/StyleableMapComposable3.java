package com.robinhood.android.compose.maps;

import android.content.Context;
import android.location.Location;
import androidx.compose.foundation.layout.PaddingKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.p011ui.Modifier;
import androidx.compose.p011ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.LocationSource;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;
import com.google.android.gms.maps.model.PointOfInterest;
import com.google.maps.android.compose.CameraPositionState;
import com.google.maps.android.compose.DefaultIndoorStateChangeListener;
import com.google.maps.android.compose.GoogleMap5;
import com.google.maps.android.compose.IndoorStateChangeListener;
import com.google.maps.android.compose.MapProperties;
import com.google.maps.android.compose.MapUiSettings;
import com.robinhood.compose.bento.theme.BentoTheme;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: StyleableMapComposable.kt */
@Metadata(m3635d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u0085\u0002\u0010!\u001a\u00020\u00132\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\u0014\b\u0002\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u0014\b\u0002\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00130\u00112\u000e\b\u0002\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00062\u0014\b\u0002\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u00130\u00112\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u00130\u00112\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\b\b\u0002\u0010\u001f\u001a\u00020\u00172\u000e\b\u0002\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00130\u0006H\u0007¢\u0006\u0004\b!\u0010\"¨\u0006#"}, m3636d2 = {"Landroidx/compose/ui/Modifier;", "modifier", "Lcom/google/maps/android/compose/CameraPositionState;", "cameraPositionState", "", "contentDescription", "Lkotlin/Function0;", "Lcom/google/android/gms/maps/GoogleMapOptions;", "googleMapOptionsFactory", "Lcom/google/maps/android/compose/MapProperties;", "properties", "Lcom/google/android/gms/maps/LocationSource;", "locationSource", "Lcom/google/maps/android/compose/MapUiSettings;", "uiSettings", "Lcom/google/maps/android/compose/IndoorStateChangeListener;", "indoorStateChangeListener", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/LatLng;", "", "onMapClick", "onMapLongClick", "onMapLoaded", "", "onMyLocationButtonClick", "Landroid/location/Location;", "onMyLocationClick", "Lcom/google/android/gms/maps/model/PointOfInterest;", "onPoiClick", "Landroidx/compose/foundation/layout/PaddingValues;", "contentPadding", "enabled", "content", "StyleableMapComposable", "(Landroidx/compose/ui/Modifier;Lcom/google/maps/android/compose/CameraPositionState;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lcom/google/maps/android/compose/MapProperties;Lcom/google/android/gms/maps/LocationSource;Lcom/google/maps/android/compose/MapUiSettings;Lcom/google/maps/android/compose/IndoorStateChangeListener;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/layout/PaddingValues;ZLkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "lib-maps_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.compose.maps.StyleableMapComposableKt, reason: use source file name */
/* loaded from: classes2.dex */
public final class StyleableMapComposable3 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StyleableMapComposable$lambda$14(Modifier modifier, CameraPositionState cameraPositionState, String str, Function0 function0, MapProperties mapProperties, LocationSource locationSource, MapUiSettings mapUiSettings, IndoorStateChangeListener indoorStateChangeListener, Function1 function1, Function1 function12, Function0 function02, Function0 function03, Function1 function13, Function1 function14, PaddingValues paddingValues, boolean z, Function2 function2, int i, int i2, int i3, Composer composer, int i4) {
        StyleableMapComposable(modifier, cameraPositionState, str, function0, mapProperties, locationSource, mapUiSettings, indoorStateChangeListener, function1, function12, function02, function03, function13, function14, paddingValues, z, function2, composer, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean StyleableMapComposable$lambda$9$lambda$8() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final GoogleMapOptions StyleableMapComposable$lambda$1$lambda$0() {
        return new GoogleMapOptions();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StyleableMapComposable$lambda$3$lambda$2(LatLng it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StyleableMapComposable$lambda$5$lambda$4(LatLng it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StyleableMapComposable$lambda$11$lambda$10(Location it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit StyleableMapComposable$lambda$13$lambda$12(PointOfInterest it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x013c  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0145  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0185  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x01cd  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:162:0x01e8  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0206  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0241  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0275  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02cb  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x02d4  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0309  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0310  */
    /* JADX WARN: Removed duplicated region for block: B:231:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0333  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x0358  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:240:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0380  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0386  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x0394  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03b1  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x03b5  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x03d2  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x03f4  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03f8  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0416  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x041a  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x043d  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x0466  */
    /* JADX WARN: Removed duplicated region for block: B:283:0x046c  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0479  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x0481  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x0483  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x0487  */
    /* JADX WARN: Removed duplicated region for block: B:291:0x04aa  */
    /* JADX WARN: Removed duplicated region for block: B:294:0x04be  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x04d4  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x04db  */
    /* JADX WARN: Removed duplicated region for block: B:301:0x04ed  */
    /* JADX WARN: Removed duplicated region for block: B:302:0x04f6  */
    /* JADX WARN: Removed duplicated region for block: B:305:0x0593  */
    /* JADX WARN: Removed duplicated region for block: B:309:0x05ba  */
    /* JADX WARN: Removed duplicated region for block: B:311:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0097  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x011a  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void StyleableMapComposable(Modifier modifier, CameraPositionState cameraPositionState, String str, Function0<GoogleMapOptions> function0, MapProperties mapProperties, LocationSource locationSource, MapUiSettings mapUiSettings, IndoorStateChangeListener indoorStateChangeListener, Function1<? super LatLng, Unit> function1, Function1<? super LatLng, Unit> function12, Function0<Unit> function02, Function0<Boolean> function03, Function1<? super Location, Unit> function13, Function1<? super PointOfInterest, Unit> function14, PaddingValues paddingValues, boolean z, Function2<? super Composer, ? super Integer, Unit> function2, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str2;
        int i5;
        Function0<GoogleMapOptions> function04;
        int i6;
        LocationSource locationSource2;
        IndoorStateChangeListener indoorStateChangeListener2;
        int i7;
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
        Function2<? super Composer, ? super Integer, Unit> function22;
        int i24;
        int i25;
        CameraPositionState cameraPositionState2;
        Function0<GoogleMapOptions> function05;
        MapProperties mapProperties2;
        MapUiSettings mapUiSettings2;
        IndoorStateChangeListener indoorStateChangeListener3;
        Function1<? super LatLng, Unit> function15;
        Function1<? super LatLng, Unit> function16;
        Function0<Unit> function06;
        Function0<Boolean> function07;
        Modifier modifier2;
        Function1<? super Location, Unit> function17;
        Function1<? super Location, Unit> function18;
        Function1<? super PointOfInterest, Unit> function19;
        Function1<? super PointOfInterest, Unit> function110;
        IndoorStateChangeListener indoorStateChangeListener4;
        PaddingValues paddingValuesM5137PaddingValuesYgX7TsA$default;
        boolean z2;
        Function1<? super Location, Unit> function111;
        Function1<? super PointOfInterest, Unit> function112;
        IndoorStateChangeListener indoorStateChangeListener5;
        Function2<? super Composer, ? super Integer, Unit> function2M12535getLambda$1565054885$lib_maps_externalDebug;
        PaddingValues paddingValues2;
        Function0<Unit> function08;
        Function0<Boolean> function09;
        Function0<GoogleMapOptions> function010;
        Function1<? super LatLng, Unit> function113;
        Function1<? super LatLng, Unit> function114;
        LocationSource locationSource3;
        int i26;
        MapUiSettings mapUiSettings3;
        CameraPositionState cameraPositionState3;
        String str3;
        Modifier modifier3;
        final boolean z3;
        final CameraPositionState cameraPositionState4;
        final Function1<? super LatLng, Unit> function115;
        final Function0<GoogleMapOptions> function011;
        final Modifier modifier4;
        final String str4;
        Composer composer2;
        final LocationSource locationSource4;
        final MapUiSettings mapUiSettings4;
        final IndoorStateChangeListener indoorStateChangeListener6;
        final Function1<? super LatLng, Unit> function116;
        final Function0<Unit> function012;
        final Function0<Boolean> function013;
        final Function1<? super Location, Unit> function117;
        final Function1<? super PointOfInterest, Unit> function118;
        final PaddingValues paddingValues3;
        final Function2<? super Composer, ? super Integer, Unit> function23;
        final MapProperties mapProperties3;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i27;
        int i28;
        int i29;
        Composer composerStartRestartGroup = composer.startRestartGroup(1866193256);
        int i30 = i3 & 1;
        if (i30 != 0) {
            i4 = i | 6;
        } else if ((i & 6) == 0) {
            i4 = (composerStartRestartGroup.changed(modifier) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        if ((i & 48) == 0) {
            if ((i3 & 2) != 0) {
                i29 = 16;
                i4 |= i29;
            } else {
                if ((i & 64) == 0 ? composerStartRestartGroup.changed(cameraPositionState) : composerStartRestartGroup.changedInstance(cameraPositionState)) {
                    i29 = 32;
                }
                i4 |= i29;
            }
        }
        int i31 = i3 & 4;
        if (i31 != 0) {
            i4 |= 384;
        } else {
            if ((i & 384) == 0) {
                str2 = str;
                i4 |= composerStartRestartGroup.changed(str2) ? 256 : 128;
            }
            i5 = i3 & 8;
            if (i5 == 0) {
                i4 |= 3072;
            } else {
                if ((i & 3072) == 0) {
                    function04 = function0;
                    i4 |= composerStartRestartGroup.changedInstance(function04) ? 2048 : 1024;
                }
                if ((i & 24576) == 0) {
                    if ((i3 & 16) != 0) {
                        i28 = 8192;
                        i4 |= i28;
                    } else {
                        if ((32768 & i) == 0 ? composerStartRestartGroup.changed(mapProperties) : composerStartRestartGroup.changedInstance(mapProperties)) {
                            i28 = 16384;
                        }
                        i4 |= i28;
                    }
                }
                i6 = i3 & 32;
                if (i6 != 0) {
                    i4 |= 196608;
                    locationSource2 = locationSource;
                } else {
                    locationSource2 = locationSource;
                    if ((i & 196608) == 0) {
                        i4 |= composerStartRestartGroup.changedInstance(locationSource2) ? 131072 : 65536;
                    }
                }
                if ((i & 1572864) == 0) {
                    if ((i3 & 64) != 0) {
                        i27 = 524288;
                        i4 |= i27;
                    } else {
                        if ((i & 2097152) == 0 ? composerStartRestartGroup.changed(mapUiSettings) : composerStartRestartGroup.changedInstance(mapUiSettings)) {
                            i27 = 1048576;
                        }
                        i4 |= i27;
                    }
                }
                if ((i & 12582912) == 0) {
                    i7 = 65536;
                    if ((i3 & 128) == 0) {
                        indoorStateChangeListener2 = indoorStateChangeListener;
                        int i32 = composerStartRestartGroup.changedInstance(indoorStateChangeListener2) ? 8388608 : 4194304;
                        i4 |= i32;
                    } else {
                        indoorStateChangeListener2 = indoorStateChangeListener;
                    }
                    i4 |= i32;
                } else {
                    indoorStateChangeListener2 = indoorStateChangeListener;
                    i7 = 65536;
                }
                i8 = i3 & 256;
                if (i8 != 0) {
                    i4 |= 100663296;
                } else {
                    if ((i & 100663296) == 0) {
                        i9 = i8;
                        i4 |= composerStartRestartGroup.changedInstance(function1) ? 67108864 : 33554432;
                    }
                    i10 = i3 & 512;
                    if (i10 == 0) {
                        i11 = i10;
                        i12 = i4 | 805306368;
                    } else {
                        if ((i & 805306368) == 0) {
                            i11 = i10;
                            i4 |= composerStartRestartGroup.changedInstance(function12) ? 536870912 : 268435456;
                        } else {
                            i11 = i10;
                        }
                        i12 = i4;
                    }
                    i13 = i3 & 1024;
                    if (i13 == 0) {
                        i14 = i2 | 6;
                    } else if ((i2 & 6) == 0) {
                        i14 = i2 | (composerStartRestartGroup.changedInstance(function02) ? 4 : 2);
                    } else {
                        i14 = i2;
                    }
                    i15 = i3 & 2048;
                    if (i15 == 0) {
                        i16 = i15;
                        i17 = i14 | 48;
                    } else {
                        if ((i2 & 48) == 0) {
                            i16 = i15;
                            i14 |= composerStartRestartGroup.changedInstance(function03) ? 32 : 16;
                        } else {
                            i16 = i15;
                        }
                        i17 = i14;
                    }
                    i18 = i3 & 4096;
                    if (i18 == 0) {
                        i17 |= 384;
                    } else {
                        if ((i2 & 384) == 0) {
                            i17 |= composerStartRestartGroup.changedInstance(function13) ? 256 : 128;
                        }
                        i19 = i3 & 8192;
                        if (i19 != 0) {
                            i17 |= 3072;
                        } else {
                            if ((i2 & 3072) == 0) {
                                i17 |= composerStartRestartGroup.changedInstance(function14) ? 2048 : 1024;
                            }
                            i20 = i3 & 16384;
                            if (i20 == 0) {
                                i17 |= 24576;
                            } else {
                                if ((i2 & 24576) == 0) {
                                    i17 |= composerStartRestartGroup.changed(paddingValues) ? 16384 : 8192;
                                }
                                i21 = i3 & 32768;
                                if (i21 == 0) {
                                    if ((i2 & 196608) == 0) {
                                        i22 = i20;
                                        i17 |= composerStartRestartGroup.changed(z) ? 131072 : i7;
                                    }
                                    i23 = i3 & i7;
                                    if (i23 == 0) {
                                        i17 |= 1572864;
                                        function22 = function2;
                                    } else {
                                        function22 = function2;
                                        if ((i2 & 1572864) == 0) {
                                            i17 |= composerStartRestartGroup.changedInstance(function22) ? 1048576 : 524288;
                                        }
                                    }
                                    if ((i12 & 306783379) != 306783378 && (599187 & i17) == 599186 && composerStartRestartGroup.getSkipping()) {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        modifier4 = modifier;
                                        mapProperties3 = mapProperties;
                                        function116 = function12;
                                        function117 = function13;
                                        paddingValues3 = paddingValues;
                                        z3 = z;
                                        str4 = str2;
                                        function011 = function04;
                                        function23 = function22;
                                        composer2 = composerStartRestartGroup;
                                        indoorStateChangeListener6 = indoorStateChangeListener2;
                                        locationSource4 = locationSource2;
                                        function115 = function1;
                                        function012 = function02;
                                        function013 = function03;
                                        function118 = function14;
                                        mapUiSettings4 = mapUiSettings;
                                        cameraPositionState4 = cameraPositionState;
                                    } else {
                                        composerStartRestartGroup.startDefaults();
                                        if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            Modifier modifier5 = i30 == 0 ? Modifier.INSTANCE : modifier;
                                            if ((i3 & 2) == 0) {
                                                composerStartRestartGroup.startReplaceableGroup(-1911106014);
                                                i24 = i13;
                                                i25 = i17;
                                                cameraPositionState2 = (CameraPositionState) RememberSaveable.m6426rememberSaveable(new Object[0], (Saver) CameraPositionState.INSTANCE.getSaver(), (String) null, (Function0) new Function0<CameraPositionState>() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$StyleableMapComposable$$inlined$rememberCameraPositionState$1
                                                    /* JADX WARN: Can't rename method to resolve collision */
                                                    @Override // kotlin.jvm.functions.Function0
                                                    public final CameraPositionState invoke() {
                                                        return new CameraPositionState(null, 1, null);
                                                    }
                                                }, composerStartRestartGroup, 72, 0);
                                                composerStartRestartGroup.endReplaceableGroup();
                                                i12 &= -113;
                                            } else {
                                                i24 = i13;
                                                i25 = i17;
                                                cameraPositionState2 = cameraPositionState;
                                            }
                                            String str5 = i31 == 0 ? null : str;
                                            if (i5 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue = new Function0() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda0
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return StyleableMapComposable3.StyleableMapComposable$lambda$1$lambda$0();
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue);
                                                }
                                                function05 = (Function0) objRememberedValue;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                function05 = function0;
                                            }
                                            if ((i3 & 16) == 0) {
                                                mapProperties2 = new MapProperties(false, false, false, false, null, null, null, 0.0f, 0.0f, 511, null);
                                                i12 &= -57345;
                                            } else {
                                                mapProperties2 = mapProperties;
                                            }
                                            if (i6 != 0) {
                                                locationSource2 = null;
                                            }
                                            if ((i3 & 64) == 0) {
                                                mapUiSettings2 = new MapUiSettings(false, false, false, false, false, false, false, false, false, false, 1023, null);
                                                i12 &= -3670017;
                                            } else {
                                                mapUiSettings2 = mapUiSettings;
                                            }
                                            if ((i3 & 128) == 0) {
                                                indoorStateChangeListener3 = DefaultIndoorStateChangeListener.INSTANCE;
                                                i12 &= -29360129;
                                            } else {
                                                indoorStateChangeListener3 = indoorStateChangeListener;
                                            }
                                            if (i9 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue2 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue2 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue2 = new Function1() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda1
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return StyleableMapComposable3.StyleableMapComposable$lambda$3$lambda$2((LatLng) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue2);
                                                }
                                                function15 = (Function1) objRememberedValue2;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                function15 = function1;
                                            }
                                            if (i11 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue3 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue3 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue3 = new Function1() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda2
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return StyleableMapComposable3.StyleableMapComposable$lambda$5$lambda$4((LatLng) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue3);
                                                }
                                                function16 = (Function1) objRememberedValue3;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                function16 = function12;
                                            }
                                            if (i24 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue4 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue4 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue4 = new Function0() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda3
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return Unit.INSTANCE;
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue4);
                                                }
                                                function06 = (Function0) objRememberedValue4;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                function06 = function02;
                                            }
                                            if (i16 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue5 = composerStartRestartGroup.rememberedValue();
                                                if (objRememberedValue5 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue5 = new Function0() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda4
                                                        @Override // kotlin.jvm.functions.Function0
                                                        public final Object invoke() {
                                                            return Boolean.valueOf(StyleableMapComposable3.StyleableMapComposable$lambda$9$lambda$8());
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue5);
                                                }
                                                function07 = (Function0) objRememberedValue5;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                function07 = function03;
                                            }
                                            if (i18 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue6 = composerStartRestartGroup.rememberedValue();
                                                modifier2 = modifier5;
                                                if (objRememberedValue6 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue6 = new Function1() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda5
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return StyleableMapComposable3.StyleableMapComposable$lambda$11$lambda$10((Location) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue6);
                                                }
                                                function17 = (Function1) objRememberedValue6;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                modifier2 = modifier5;
                                                function17 = function13;
                                            }
                                            if (i19 == 0) {
                                                composerStartRestartGroup.startReplaceGroup(1849434622);
                                                Object objRememberedValue7 = composerStartRestartGroup.rememberedValue();
                                                function18 = function17;
                                                if (objRememberedValue7 == Composer.INSTANCE.getEmpty()) {
                                                    objRememberedValue7 = new Function1() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda6
                                                        @Override // kotlin.jvm.functions.Function1
                                                        public final Object invoke(Object obj) {
                                                            return StyleableMapComposable3.StyleableMapComposable$lambda$13$lambda$12((PointOfInterest) obj);
                                                        }
                                                    };
                                                    composerStartRestartGroup.updateRememberedValue(objRememberedValue7);
                                                }
                                                function19 = (Function1) objRememberedValue7;
                                                composerStartRestartGroup.endReplaceGroup();
                                            } else {
                                                function18 = function17;
                                                function19 = function14;
                                            }
                                            if (i22 == 0) {
                                                function110 = function19;
                                                indoorStateChangeListener4 = indoorStateChangeListener3;
                                                paddingValuesM5137PaddingValuesYgX7TsA$default = PaddingKt.m5137PaddingValuesYgX7TsA$default(0.0f, 0.0f, 3, null);
                                            } else {
                                                function110 = function19;
                                                indoorStateChangeListener4 = indoorStateChangeListener3;
                                                paddingValuesM5137PaddingValuesYgX7TsA$default = paddingValues;
                                            }
                                            z2 = i21 == 0 ? true : z;
                                            if (i23 == 0) {
                                                function111 = function18;
                                                function112 = function110;
                                                indoorStateChangeListener5 = indoorStateChangeListener4;
                                                paddingValues2 = paddingValuesM5137PaddingValuesYgX7TsA$default;
                                                function2M12535getLambda$1565054885$lib_maps_externalDebug = StyleableMapComposable.INSTANCE.m12535getLambda$1565054885$lib_maps_externalDebug();
                                            } else {
                                                function111 = function18;
                                                function112 = function110;
                                                indoorStateChangeListener5 = indoorStateChangeListener4;
                                                function2M12535getLambda$1565054885$lib_maps_externalDebug = function2;
                                                paddingValues2 = paddingValuesM5137PaddingValuesYgX7TsA$default;
                                            }
                                            function08 = function06;
                                            function09 = function07;
                                            function010 = function05;
                                            function113 = function15;
                                            function114 = function16;
                                            locationSource3 = locationSource2;
                                            i26 = i12;
                                            mapUiSettings3 = mapUiSettings2;
                                            cameraPositionState3 = cameraPositionState2;
                                            str3 = str5;
                                            modifier3 = modifier2;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i3 & 2) != 0) {
                                                i12 &= -113;
                                            }
                                            if ((i3 & 16) != 0) {
                                                i12 &= -57345;
                                            }
                                            if ((i3 & 64) != 0) {
                                                i12 &= -3670017;
                                            }
                                            if ((i3 & 128) != 0) {
                                                i12 &= -29360129;
                                            }
                                            mapProperties2 = mapProperties;
                                            function113 = function1;
                                            function114 = function12;
                                            function08 = function02;
                                            function09 = function03;
                                            function111 = function13;
                                            function112 = function14;
                                            paddingValues2 = paddingValues;
                                            str3 = str2;
                                            function010 = function04;
                                            function2M12535getLambda$1565054885$lib_maps_externalDebug = function22;
                                            indoorStateChangeListener5 = indoorStateChangeListener2;
                                            i25 = i17;
                                            locationSource3 = locationSource2;
                                            i26 = i12;
                                            modifier3 = modifier;
                                            cameraPositionState3 = cameraPositionState;
                                            mapUiSettings3 = mapUiSettings;
                                            z2 = z;
                                        }
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(1866193256, i26, i25, "com.robinhood.android.compose.maps.StyleableMapComposable (StyleableMapComposable.kt:41)");
                                        }
                                        BentoMapStyle bentoMapStyleM12534default = !BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay() ? BentoMapDefaults.INSTANCE.m12534default() : BentoMapDefaults.INSTANCE.night();
                                        MapProperties mapPropertiesCopy$default = MapProperties.copy$default(mapProperties2, false, false, false, false, null, MapStyleOptions.loadRawResourceStyle((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), !z2 ? bentoMapStyleM12534default.getEnabled().getRawJsonResourceId() : bentoMapStyleM12534default.getDisabled().getRawJsonResourceId()), null, 0.0f, 0.0f, 479, null);
                                        int i33 = i26 << 3;
                                        Function0<GoogleMapOptions> function014 = function010;
                                        int i34 = (i26 >> 27) & 14;
                                        int i35 = i25 << 3;
                                        GoogleMap5.GoogleMap(false, modifier3, cameraPositionState3, str3, function014, mapPropertiesCopy$default, locationSource3, mapUiSettings3, indoorStateChangeListener5, function113, function114, function08, function09, function111, function112, paddingValues2, function2M12535getLambda$1565054885$lib_maps_externalDebug, composerStartRestartGroup, (i33 & 896) | (i33 & 112) | (CameraPositionState.$stable << 6) | (i33 & 7168) | (57344 & i33) | (MapProperties.$stable << 15) | (3670016 & i33) | (MapUiSettings.$stable << 21) | (29360128 & i33) | (234881024 & i33) | (i33 & 1879048192), i34 | (i35 & 112) | (i35 & 896) | (i35 & 7168) | (57344 & i35) | (i35 & 458752) | (i25 & 3670016), 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        Function1<? super LatLng, Unit> function119 = function113;
                                        z3 = z2;
                                        cameraPositionState4 = cameraPositionState3;
                                        function115 = function119;
                                        function011 = function014;
                                        modifier4 = modifier3;
                                        str4 = str3;
                                        composer2 = composerStartRestartGroup;
                                        locationSource4 = locationSource3;
                                        mapUiSettings4 = mapUiSettings3;
                                        indoorStateChangeListener6 = indoorStateChangeListener5;
                                        function116 = function114;
                                        function012 = function08;
                                        function013 = function09;
                                        function117 = function111;
                                        function118 = function112;
                                        paddingValues3 = paddingValues2;
                                        function23 = function2M12535getLambda$1565054885$lib_maps_externalDebug;
                                        mapProperties3 = mapProperties2;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                        scopeUpdateScopeEndRestartGroup.updateScope(new Function2() { // from class: com.robinhood.android.compose.maps.StyleableMapComposableKt$$ExternalSyntheticLambda7
                                            @Override // kotlin.jvm.functions.Function2
                                            public final Object invoke(Object obj, Object obj2) {
                                                return StyleableMapComposable3.StyleableMapComposable$lambda$14(modifier4, cameraPositionState4, str4, function011, mapProperties3, locationSource4, mapUiSettings4, indoorStateChangeListener6, function115, function116, function012, function013, function117, function118, paddingValues3, z3, function23, i, i2, i3, (Composer) obj, ((Integer) obj2).intValue());
                                            }
                                        });
                                        return;
                                    }
                                    return;
                                }
                                i17 |= 196608;
                                i22 = i20;
                                i23 = i3 & i7;
                                if (i23 == 0) {
                                }
                                if ((i12 & 306783379) != 306783378) {
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0) {
                                        if (i30 == 0) {
                                        }
                                        if ((i3 & 2) == 0) {
                                        }
                                        if (i31 == 0) {
                                        }
                                        if (i5 == 0) {
                                        }
                                        if ((i3 & 16) == 0) {
                                        }
                                        if (i6 != 0) {
                                        }
                                        if ((i3 & 64) == 0) {
                                        }
                                        if ((i3 & 128) == 0) {
                                        }
                                        if (i9 == 0) {
                                        }
                                        if (i11 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if (i16 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i19 == 0) {
                                        }
                                        if (i22 == 0) {
                                        }
                                        if (i21 == 0) {
                                        }
                                        if (i23 == 0) {
                                        }
                                        function08 = function06;
                                        function09 = function07;
                                        function010 = function05;
                                        function113 = function15;
                                        function114 = function16;
                                        locationSource3 = locationSource2;
                                        i26 = i12;
                                        mapUiSettings3 = mapUiSettings2;
                                        cameraPositionState3 = cameraPositionState2;
                                        str3 = str5;
                                        modifier3 = modifier2;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        if (!BentoTheme.INSTANCE.getColors(composerStartRestartGroup, BentoTheme.$stable).getIsDay()) {
                                        }
                                        MapProperties mapPropertiesCopy$default2 = MapProperties.copy$default(mapProperties2, false, false, false, false, null, MapStyleOptions.loadRawResourceStyle((Context) composerStartRestartGroup.consume(AndroidCompositionLocals_androidKt.getLocalContext()), !z2 ? bentoMapStyleM12534default.getEnabled().getRawJsonResourceId() : bentoMapStyleM12534default.getDisabled().getRawJsonResourceId()), null, 0.0f, 0.0f, 479, null);
                                        int i332 = i26 << 3;
                                        Function0<GoogleMapOptions> function0142 = function010;
                                        int i342 = (i26 >> 27) & 14;
                                        int i352 = i25 << 3;
                                        GoogleMap5.GoogleMap(false, modifier3, cameraPositionState3, str3, function0142, mapPropertiesCopy$default2, locationSource3, mapUiSettings3, indoorStateChangeListener5, function113, function114, function08, function09, function111, function112, paddingValues2, function2M12535getLambda$1565054885$lib_maps_externalDebug, composerStartRestartGroup, (i332 & 896) | (i332 & 112) | (CameraPositionState.$stable << 6) | (i332 & 7168) | (57344 & i332) | (MapProperties.$stable << 15) | (3670016 & i332) | (MapUiSettings.$stable << 21) | (29360128 & i332) | (234881024 & i332) | (i332 & 1879048192), i342 | (i352 & 112) | (i352 & 896) | (i352 & 7168) | (57344 & i352) | (i352 & 458752) | (i25 & 3670016), 1);
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Function1<? super LatLng, Unit> function1192 = function113;
                                        z3 = z2;
                                        cameraPositionState4 = cameraPositionState3;
                                        function115 = function1192;
                                        function011 = function0142;
                                        modifier4 = modifier3;
                                        str4 = str3;
                                        composer2 = composerStartRestartGroup;
                                        locationSource4 = locationSource3;
                                        mapUiSettings4 = mapUiSettings3;
                                        indoorStateChangeListener6 = indoorStateChangeListener5;
                                        function116 = function114;
                                        function012 = function08;
                                        function013 = function09;
                                        function117 = function111;
                                        function118 = function112;
                                        paddingValues3 = paddingValues2;
                                        function23 = function2M12535getLambda$1565054885$lib_maps_externalDebug;
                                        mapProperties3 = mapProperties2;
                                    }
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            i21 = i3 & 32768;
                            if (i21 == 0) {
                            }
                            i22 = i20;
                            i23 = i3 & i7;
                            if (i23 == 0) {
                            }
                            if ((i12 & 306783379) != 306783378) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i20 = i3 & 16384;
                        if (i20 == 0) {
                        }
                        i21 = i3 & 32768;
                        if (i21 == 0) {
                        }
                        i22 = i20;
                        i23 = i3 & i7;
                        if (i23 == 0) {
                        }
                        if ((i12 & 306783379) != 306783378) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i19 = i3 & 8192;
                    if (i19 != 0) {
                    }
                    i20 = i3 & 16384;
                    if (i20 == 0) {
                    }
                    i21 = i3 & 32768;
                    if (i21 == 0) {
                    }
                    i22 = i20;
                    i23 = i3 & i7;
                    if (i23 == 0) {
                    }
                    if ((i12 & 306783379) != 306783378) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i9 = i8;
                i10 = i3 & 512;
                if (i10 == 0) {
                }
                i13 = i3 & 1024;
                if (i13 == 0) {
                }
                i15 = i3 & 2048;
                if (i15 == 0) {
                }
                i18 = i3 & 4096;
                if (i18 == 0) {
                }
                i19 = i3 & 8192;
                if (i19 != 0) {
                }
                i20 = i3 & 16384;
                if (i20 == 0) {
                }
                i21 = i3 & 32768;
                if (i21 == 0) {
                }
                i22 = i20;
                i23 = i3 & i7;
                if (i23 == 0) {
                }
                if ((i12 & 306783379) != 306783378) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            function04 = function0;
            if ((i & 24576) == 0) {
            }
            i6 = i3 & 32;
            if (i6 != 0) {
            }
            if ((i & 1572864) == 0) {
            }
            if ((i & 12582912) == 0) {
            }
            i8 = i3 & 256;
            if (i8 != 0) {
            }
            i9 = i8;
            i10 = i3 & 512;
            if (i10 == 0) {
            }
            i13 = i3 & 1024;
            if (i13 == 0) {
            }
            i15 = i3 & 2048;
            if (i15 == 0) {
            }
            i18 = i3 & 4096;
            if (i18 == 0) {
            }
            i19 = i3 & 8192;
            if (i19 != 0) {
            }
            i20 = i3 & 16384;
            if (i20 == 0) {
            }
            i21 = i3 & 32768;
            if (i21 == 0) {
            }
            i22 = i20;
            i23 = i3 & i7;
            if (i23 == 0) {
            }
            if ((i12 & 306783379) != 306783378) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str2 = str;
        i5 = i3 & 8;
        if (i5 == 0) {
        }
        function04 = function0;
        if ((i & 24576) == 0) {
        }
        i6 = i3 & 32;
        if (i6 != 0) {
        }
        if ((i & 1572864) == 0) {
        }
        if ((i & 12582912) == 0) {
        }
        i8 = i3 & 256;
        if (i8 != 0) {
        }
        i9 = i8;
        i10 = i3 & 512;
        if (i10 == 0) {
        }
        i13 = i3 & 1024;
        if (i13 == 0) {
        }
        i15 = i3 & 2048;
        if (i15 == 0) {
        }
        i18 = i3 & 4096;
        if (i18 == 0) {
        }
        i19 = i3 & 8192;
        if (i19 != 0) {
        }
        i20 = i3 & 16384;
        if (i20 == 0) {
        }
        i21 = i3 & 32768;
        if (i21 == 0) {
        }
        i22 = i20;
        i23 = i3 & i7;
        if (i23 == 0) {
        }
        if ((i12 & 306783379) != 306783378) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
