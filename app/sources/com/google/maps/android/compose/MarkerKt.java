package com.google.maps.android.compose;

import androidx.compose.p011ui.geometry.Offset;
import androidx.compose.p011ui.geometry.OffsetKt;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composables;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.ComposerKt;
import androidx.compose.runtime.CompositionContext;
import androidx.compose.runtime.RecomposeScopeImpl4;
import androidx.compose.runtime.ScopeUpdateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambda3;
import androidx.compose.runtime.saveable.RememberSaveable;
import androidx.compose.runtime.saveable.Saver;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: Marker.kt */
@Metadata(m3635d1 = {"\u0000X\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\u001a%\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002H\u0007¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0080\u0002\u0010#\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001aH\u0007ø\u0001\u0000¢\u0006\u0004\b!\u0010\"\u001a\u0096\u0002\u0010*\u001a\u00020\u001d2\u0012\u0010%\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00150$\"\u00020\u00152\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\f\u0010'\u001a\b\u0012\u0004\u0012\u00020\u001d0&H\u0007ø\u0001\u0000¢\u0006\u0004\b(\u0010)\u001a°\u0002\u0010/\u001a\u00020\u001d2\b\b\u0002\u0010\u0007\u001a\u00020\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\t2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00002\b\b\u0002\u0010\u0018\u001a\u00020\r2\b\b\u0002\u0010\u0019\u001a\u00020\t2\u0014\b\u0002\u0010\u001c\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\r0\u001a2\u0014\b\u0002\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0014\b\u0002\u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d0\u001a2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001a2\u0016\b\u0002\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u001b\u0012\u0004\u0012\u00020\u001d\u0018\u00010\u001aH\u0003ø\u0001\u0000¢\u0006\u0004\b-\u0010.\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u00060"}, m3636d2 = {"", "key", "Lcom/google/android/gms/maps/model/LatLng;", "position", "Lcom/google/maps/android/compose/MarkerState;", "rememberMarkerState", "(Ljava/lang/String;Lcom/google/android/gms/maps/model/LatLng;Landroidx/compose/runtime/Composer;II)Lcom/google/maps/android/compose/MarkerState;", "state", "contentDescription", "", "alpha", "Landroidx/compose/ui/geometry/Offset;", "anchor", "", "draggable", "flat", "Lcom/google/android/gms/maps/model/BitmapDescriptor;", "icon", "infoWindowAnchor", "rotation", "snippet", "", "tag", "title", "visible", "zIndex", "Lkotlin/Function1;", "Lcom/google/android/gms/maps/model/Marker;", "onClick", "", "onInfoWindowClick", "onInfoWindowClose", "onInfoWindowLongClick", "Marker-qld6geY", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V", "Marker", "", "keys", "Lkotlin/Function0;", "content", "MarkerComposable-Khg_OnI", "([Ljava/lang/Object;Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZJFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;Landroidx/compose/runtime/Composer;III)V", "MarkerComposable", "infoWindow", "infoContent", "MarkerImpl-khPtz74", "(Lcom/google/maps/android/compose/MarkerState;Ljava/lang/String;FJZZLcom/google/android/gms/maps/model/BitmapDescriptor;JFLjava/lang/String;Ljava/lang/Object;Ljava/lang/String;ZFLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V", "MarkerImpl", "maps-compose_release"}, m3637k = 2, m3638mv = {1, 9, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes27.dex */
public final class MarkerKt {
    public static final MarkerState rememberMarkerState(String str, final LatLng latLng, Composer composer, int i, int i2) {
        composer.startReplaceableGroup(-665345564);
        if ((i2 & 1) != 0) {
            str = null;
        }
        String str2 = str;
        if ((i2 & 2) != 0) {
            latLng = new LatLng(0.0d, 0.0d);
        }
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(-665345564, i, -1, "com.google.maps.android.compose.rememberMarkerState (Marker.kt:180)");
        }
        Saver<MarkerState, LatLng> saver = MarkerState.INSTANCE.getSaver();
        Object[] objArr = new Object[0];
        composer.startReplaceableGroup(-352808759);
        boolean z = (((i & 112) ^ 48) > 32 && composer.changed(latLng)) || (i & 48) == 32;
        Object objRememberedValue = composer.rememberedValue();
        if (z || objRememberedValue == Composer.INSTANCE.getEmpty()) {
            objRememberedValue = new Function0<MarkerState>() { // from class: com.google.maps.android.compose.MarkerKt$rememberMarkerState$1$1
                {
                    super(0);
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // kotlin.jvm.functions.Function0
                public final MarkerState invoke() {
                    return new MarkerState(latLng);
                }
            };
            composer.updateRememberedValue(objRememberedValue);
        }
        composer.endReplaceableGroup();
        MarkerState markerState = (MarkerState) RememberSaveable.m6426rememberSaveable(objArr, (Saver) saver, str2, (Function0) objRememberedValue, composer, ((i << 6) & 896) | 72, 0);
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        composer.endReplaceableGroup();
        return markerState;
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x015d  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:149:0x01c8  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x01f6  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x022b  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x0289  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x0292  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:209:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:210:0x02d9  */
    /* JADX WARN: Removed duplicated region for block: B:212:0x02e0  */
    /* JADX WARN: Removed duplicated region for block: B:214:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02ea  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02f6  */
    /* JADX WARN: Removed duplicated region for block: B:221:0x02f9  */
    /* JADX WARN: Removed duplicated region for block: B:223:0x02fc  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0300  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0307  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x030b  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x0311  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x0313  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x031e  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0322  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x032a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x032e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0331  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x0338  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x033f  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:258:0x036a  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x038f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x03c9  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x03ec  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:271:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0130  */
    /* renamed from: Marker-qld6geY, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9322Markerqld6geY(MarkerState markerState, String str, float f, long j, boolean z, boolean z2, BitmapDescriptor bitmapDescriptor, long j2, float f2, String str2, Object obj, String str3, boolean z3, float f3, Function1<? super Marker, Boolean> function1, Function1<? super Marker, Unit> function12, Function1<? super Marker, Unit> function13, Function1<? super Marker, Unit> function14, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str4;
        int i5;
        float f4;
        int i6;
        long j3;
        int i7;
        boolean z4;
        int i8;
        boolean z5;
        int i9;
        BitmapDescriptor bitmapDescriptor2;
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
        int i28;
        boolean z6;
        MarkerState markerStateRememberMarkerState;
        String str5;
        int i29;
        Function1<? super Marker, Unit> function15;
        Function1<? super Marker, Unit> function16;
        float f5;
        Function1<? super Marker, Boolean> function17;
        String str6;
        Function1<? super Marker, Unit> function18;
        MarkerState markerState2;
        boolean z7;
        boolean z8;
        int i30;
        Object obj2;
        float f6;
        float f7;
        BitmapDescriptor bitmapDescriptor3;
        long j4;
        boolean z9;
        String str7;
        long j5;
        Composer composer2;
        Composer composer3;
        final MarkerState markerState3;
        final String str8;
        final float f8;
        final long j6;
        final boolean z10;
        final boolean z11;
        final BitmapDescriptor bitmapDescriptor4;
        final long j7;
        final float f9;
        final String str9;
        final Object obj3;
        final String str10;
        final boolean z12;
        final float f10;
        final Function1<? super Marker, Boolean> function19;
        final Function1<? super Marker, Unit> function110;
        final Function1<? super Marker, Unit> function111;
        final Function1<? super Marker, Unit> function112;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i31;
        Composer composerStartRestartGroup = composer.startRestartGroup(122922304);
        if ((i & 14) == 0) {
            i4 = (((i3 & 1) == 0 && composerStartRestartGroup.changed(markerState)) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i32 = i3 & 2;
        if (i32 != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                str4 = str;
                i4 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f4 = f;
                    i4 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                    j3 = j;
                } else {
                    j3 = j;
                    if ((i & 7168) == 0) {
                        i4 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    }
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & 57344) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                    z5 = z2;
                } else {
                    z5 = z2;
                    if ((i & 458752) == 0) {
                        i4 |= composerStartRestartGroup.changed(z5) ? 131072 : 65536;
                    }
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    bitmapDescriptor2 = bitmapDescriptor;
                } else {
                    bitmapDescriptor2 = bitmapDescriptor;
                    if ((i & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(bitmapDescriptor2) ? 1048576 : 524288;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 29360128) == 0) {
                        i11 = i4 | (composerStartRestartGroup.changed(j2) ? 8388608 : 4194304);
                    }
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i11 |= 100663296;
                    } else {
                        if ((i & 234881024) == 0) {
                            i13 = i12;
                            i11 |= composerStartRestartGroup.changed(f2) ? 67108864 : 33554432;
                        }
                        i14 = i3 & 512;
                        if (i14 != 0) {
                            i11 |= 805306368;
                        } else {
                            if ((i & 1879048192) == 0) {
                                i15 = i14;
                                i11 |= composerStartRestartGroup.changed(str2) ? 536870912 : 268435456;
                            }
                            i16 = i3 & 1024;
                            int i33 = i16 == 0 ? i2 | 2 : i2;
                            i17 = i3 & 2048;
                            if (i17 == 0) {
                                i33 |= 48;
                            } else {
                                if ((i2 & 112) == 0) {
                                    i33 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
                                }
                                int i34 = i33;
                                i18 = i3 & 4096;
                                if (i18 != 0) {
                                    i19 = i34 | 384;
                                } else if ((i2 & 896) == 0) {
                                    i19 = i34 | (composerStartRestartGroup.changed(z3) ? 256 : 128);
                                } else {
                                    i19 = i34;
                                }
                                i20 = i3 & 8192;
                                if (i20 != 0) {
                                    i21 = i19 | 3072;
                                } else {
                                    int i35 = i19;
                                    if ((i2 & 7168) == 0) {
                                        i35 |= composerStartRestartGroup.changed(f3) ? 2048 : 1024;
                                    }
                                    i21 = i35;
                                }
                                i22 = i3 & 16384;
                                if (i22 != 0) {
                                    i23 = i21 | 24576;
                                } else if ((i2 & 57344) == 0) {
                                    i23 = i21 | (composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192);
                                } else {
                                    i23 = i21;
                                }
                                i24 = i3 & 32768;
                                if (i24 != 0) {
                                    i23 |= 196608;
                                } else if ((i2 & 458752) == 0) {
                                    i23 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                                }
                                i25 = i3 & 65536;
                                if (i25 != 0) {
                                    i23 |= 1572864;
                                } else if ((i2 & 3670016) == 0) {
                                    i23 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                                }
                                i26 = i3 & 131072;
                                if (i26 == 0) {
                                    i31 = (i2 & 29360128) == 0 ? composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304 : 12582912;
                                    int i36 = i23;
                                    if (i16 != 1024) {
                                        i27 = i16;
                                        if ((i11 & 1533916891) == 306783378 && (23967451 & i36) == 4793490 && composerStartRestartGroup.getSkipping()) {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            markerState3 = markerState;
                                            str10 = str3;
                                            f10 = f3;
                                            function19 = function1;
                                            function110 = function12;
                                            function111 = function13;
                                            function112 = function14;
                                            composer3 = composerStartRestartGroup;
                                            z10 = z4;
                                            str8 = str4;
                                            j6 = j3;
                                            f8 = f4;
                                            j7 = j2;
                                            f9 = f2;
                                            str9 = str2;
                                            obj3 = obj;
                                            bitmapDescriptor4 = bitmapDescriptor2;
                                            z11 = z5;
                                            z12 = z3;
                                        }
                                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup != null) {
                                            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$Marker$5
                                                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                                /* JADX WARN: Multi-variable type inference failed */
                                                {
                                                    super(2);
                                                }

                                                @Override // kotlin.jvm.functions.Function2
                                                public /* bridge */ /* synthetic */ Unit invoke(Composer composer4, Integer num) {
                                                    invoke(composer4, num.intValue());
                                                    return Unit.INSTANCE;
                                                }

                                                public final void invoke(Composer composer4, int i37) {
                                                    MarkerKt.m9322Markerqld6geY(markerState3, str8, f8, j6, z10, z11, bitmapDescriptor4, j7, f9, str9, obj3, str10, z12, f10, function19, function110, function111, function112, composer4, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                                }
                                            });
                                            return;
                                        }
                                        return;
                                    }
                                    i27 = i16;
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) != 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                        if ((i3 & 1) == 0) {
                                            i28 = i22;
                                            z6 = false;
                                            markerStateRememberMarkerState = rememberMarkerState(null, null, composerStartRestartGroup, 0, 3);
                                            i11 &= -15;
                                        } else {
                                            i28 = i22;
                                            z6 = false;
                                            markerStateRememberMarkerState = markerState;
                                        }
                                        if (i32 != 0) {
                                            str4 = "";
                                        }
                                        if (i5 != 0) {
                                            f4 = 1.0f;
                                        }
                                        long jOffset = i6 == 0 ? OffsetKt.Offset(0.5f, 1.0f) : j3;
                                        if (i7 != 0) {
                                            z4 = z6;
                                        }
                                        if (i8 != 0) {
                                            z5 = z6;
                                        }
                                        if (i9 != 0) {
                                            bitmapDescriptor2 = null;
                                        }
                                        long jOffset2 = i10 == 0 ? OffsetKt.Offset(0.5f, 0.0f) : j2;
                                        float f11 = i13 == 0 ? 0.0f : f2;
                                        String str11 = i15 == 0 ? null : str2;
                                        Object obj4 = i27 == 0 ? null : obj;
                                        String str12 = i17 == 0 ? str3 : null;
                                        boolean z13 = i18 == 0 ? true : z3;
                                        float f12 = i20 == 0 ? f3 : 0.0f;
                                        Function1<? super Marker, Boolean> function113 = i28 == 0 ? new Function1<Marker, Boolean>() { // from class: com.google.maps.android.compose.MarkerKt$Marker$1
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Boolean invoke(Marker it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                return Boolean.FALSE;
                                            }
                                        } : function1;
                                        Function1<? super Marker, Unit> function114 = i24 == 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$Marker$2
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Marker it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                                                invoke2(marker);
                                                return Unit.INSTANCE;
                                            }
                                        } : function12;
                                        Function1<? super Marker, Unit> function115 = i25 == 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$Marker$3
                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(Marker it) {
                                                Intrinsics.checkNotNullParameter(it, "it");
                                            }

                                            @Override // kotlin.jvm.functions.Function1
                                            public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                                                invoke2(marker);
                                                return Unit.INSTANCE;
                                            }
                                        } : function13;
                                        if (i26 == 0) {
                                            Function1<? super Marker, Unit> function116 = function114;
                                            str5 = str12;
                                            i29 = 57344;
                                            function15 = function116;
                                            function17 = function113;
                                            str6 = str4;
                                            function18 = function115;
                                            function16 = new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$Marker$4
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Marker it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                                                    invoke2(marker);
                                                    return Unit.INSTANCE;
                                                }
                                            };
                                            f5 = f12;
                                            z7 = z4;
                                            z8 = z13;
                                            markerState2 = markerStateRememberMarkerState;
                                            obj2 = obj4;
                                            i30 = i11;
                                        } else {
                                            Function1<? super Marker, Unit> function117 = function114;
                                            str5 = str12;
                                            i29 = 57344;
                                            function15 = function117;
                                            function16 = function14;
                                            f5 = f12;
                                            function17 = function113;
                                            str6 = str4;
                                            function18 = function115;
                                            markerState2 = markerStateRememberMarkerState;
                                            z7 = z4;
                                            z8 = z13;
                                            i30 = i11;
                                            obj2 = obj4;
                                        }
                                        f6 = f11;
                                        f7 = f4;
                                        bitmapDescriptor3 = bitmapDescriptor2;
                                        j4 = jOffset;
                                        z9 = z5;
                                        str7 = str11;
                                        j5 = jOffset2;
                                    } else {
                                        composerStartRestartGroup.skipToGroupEnd();
                                        if ((i3 & 1) != 0) {
                                            i11 &= -15;
                                        }
                                        markerState2 = markerState;
                                        f6 = f2;
                                        obj2 = obj;
                                        str5 = str3;
                                        z8 = z3;
                                        f5 = f3;
                                        function17 = function1;
                                        function18 = function13;
                                        function16 = function14;
                                        str6 = str4;
                                        f7 = f4;
                                        z9 = z5;
                                        i29 = 57344;
                                        i30 = i11;
                                        str7 = str2;
                                        function15 = function12;
                                        z7 = z4;
                                        long j8 = j3;
                                        bitmapDescriptor3 = bitmapDescriptor2;
                                        j5 = j2;
                                        j4 = j8;
                                    }
                                    composerStartRestartGroup.endDefaults();
                                    int i37 = i29;
                                    if (ComposerKt.isTraceInProgress()) {
                                        composer2 = composerStartRestartGroup;
                                    } else {
                                        composer2 = composerStartRestartGroup;
                                        ComposerKt.traceEventStart(122922304, i30, i36, "com.google.maps.android.compose.Marker (Marker.kt:227)");
                                    }
                                    composer3 = composer2;
                                    m9324MarkerImplkhPtz74(markerState2, str6, f7, j4, z7, z9, bitmapDescriptor3, j5, f6, str7, obj2, str5, z8, f5, function17, function15, function18, function16, null, null, composer3, i30 & 2147483646, (i36 & 112) | 8 | (i36 & 896) | (i36 & 7168) | (i36 & i37) | (i36 & 458752) | (i36 & 3670016) | (i36 & 29360128), 786432);
                                    if (ComposerKt.isTraceInProgress()) {
                                        ComposerKt.traceEventEnd();
                                    }
                                    markerState3 = markerState2;
                                    str8 = str6;
                                    f8 = f7;
                                    j6 = j4;
                                    z10 = z7;
                                    z11 = z9;
                                    bitmapDescriptor4 = bitmapDescriptor3;
                                    j7 = j5;
                                    f9 = f6;
                                    str9 = str7;
                                    obj3 = obj2;
                                    str10 = str5;
                                    z12 = z8;
                                    f10 = f5;
                                    function19 = function17;
                                    function110 = function15;
                                    function111 = function18;
                                    function112 = function16;
                                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup != null) {
                                    }
                                }
                                i23 |= i31;
                                int i362 = i23;
                                if (i16 != 1024) {
                                }
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) != 0) {
                                    if ((i3 & 1) == 0) {
                                    }
                                    if (i32 != 0) {
                                    }
                                    if (i5 != 0) {
                                    }
                                    if (i6 == 0) {
                                    }
                                    if (i7 != 0) {
                                    }
                                    if (i8 != 0) {
                                    }
                                    if (i9 != 0) {
                                    }
                                    if (i10 == 0) {
                                    }
                                    if (i13 == 0) {
                                    }
                                    if (i15 == 0) {
                                    }
                                    if (i27 == 0) {
                                    }
                                    if (i17 == 0) {
                                    }
                                    if (i18 == 0) {
                                    }
                                    if (i20 == 0) {
                                    }
                                    if (i28 == 0) {
                                    }
                                    if (i24 == 0) {
                                    }
                                    if (i25 == 0) {
                                    }
                                    if (i26 == 0) {
                                    }
                                    f6 = f11;
                                    f7 = f4;
                                    bitmapDescriptor3 = bitmapDescriptor2;
                                    j4 = jOffset;
                                    z9 = z5;
                                    str7 = str11;
                                    j5 = jOffset2;
                                    composerStartRestartGroup.endDefaults();
                                    int i372 = i29;
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    composer3 = composer2;
                                    m9324MarkerImplkhPtz74(markerState2, str6, f7, j4, z7, z9, bitmapDescriptor3, j5, f6, str7, obj2, str5, z8, f5, function17, function15, function18, function16, null, null, composer3, i30 & 2147483646, (i362 & 112) | 8 | (i362 & 896) | (i362 & 7168) | (i362 & i372) | (i362 & 458752) | (i362 & 3670016) | (i362 & 29360128), 786432);
                                    if (ComposerKt.isTraceInProgress()) {
                                    }
                                    markerState3 = markerState2;
                                    str8 = str6;
                                    f8 = f7;
                                    j6 = j4;
                                    z10 = z7;
                                    z11 = z9;
                                    bitmapDescriptor4 = bitmapDescriptor3;
                                    j7 = j5;
                                    f9 = f6;
                                    str9 = str7;
                                    obj3 = obj2;
                                    str10 = str5;
                                    z12 = z8;
                                    f10 = f5;
                                    function19 = function17;
                                    function110 = function15;
                                    function111 = function18;
                                    function112 = function16;
                                }
                                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup != null) {
                                }
                            }
                            int i342 = i33;
                            i18 = i3 & 4096;
                            if (i18 != 0) {
                            }
                            i20 = i3 & 8192;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 16384;
                            if (i22 != 0) {
                            }
                            i24 = i3 & 32768;
                            if (i24 != 0) {
                            }
                            i25 = i3 & 65536;
                            if (i25 != 0) {
                            }
                            i26 = i3 & 131072;
                            if (i26 == 0) {
                            }
                            i23 |= i31;
                            int i3622 = i23;
                            if (i16 != 1024) {
                            }
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) != 0) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup != null) {
                            }
                        }
                        i15 = i14;
                        i16 = i3 & 1024;
                        if (i16 == 0) {
                        }
                        i17 = i3 & 2048;
                        if (i17 == 0) {
                        }
                        int i3422 = i33;
                        i18 = i3 & 4096;
                        if (i18 != 0) {
                        }
                        i20 = i3 & 8192;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 16384;
                        if (i22 != 0) {
                        }
                        i24 = i3 & 32768;
                        if (i24 != 0) {
                        }
                        i25 = i3 & 65536;
                        if (i25 != 0) {
                        }
                        i26 = i3 & 131072;
                        if (i26 == 0) {
                        }
                        i23 |= i31;
                        int i36222 = i23;
                        if (i16 != 1024) {
                        }
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) != 0) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup != null) {
                        }
                    }
                    i13 = i12;
                    i14 = i3 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i3 & 1024;
                    if (i16 == 0) {
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                    }
                    int i34222 = i33;
                    i18 = i3 & 4096;
                    if (i18 != 0) {
                    }
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 16384;
                    if (i22 != 0) {
                    }
                    i24 = i3 & 32768;
                    if (i24 != 0) {
                    }
                    i25 = i3 & 65536;
                    if (i25 != 0) {
                    }
                    i26 = i3 & 131072;
                    if (i26 == 0) {
                    }
                    i23 |= i31;
                    int i362222 = i23;
                    if (i16 != 1024) {
                    }
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) != 0) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup != null) {
                    }
                }
                i11 = i4;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i3 & 1024;
                if (i16 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                int i342222 = i33;
                i18 = i3 & 4096;
                if (i18 != 0) {
                }
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                i22 = i3 & 16384;
                if (i22 != 0) {
                }
                i24 = i3 & 32768;
                if (i24 != 0) {
                }
                i25 = i3 & 65536;
                if (i25 != 0) {
                }
                i26 = i3 & 131072;
                if (i26 == 0) {
                }
                i23 |= i31;
                int i3622222 = i23;
                if (i16 != 1024) {
                }
                composerStartRestartGroup.startDefaults();
                if ((i & 1) != 0) {
                }
                scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup != null) {
                }
            }
            f4 = f;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i4;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i3 & 1024;
            if (i16 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            int i3422222 = i33;
            i18 = i3 & 4096;
            if (i18 != 0) {
            }
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            i22 = i3 & 16384;
            if (i22 != 0) {
            }
            i24 = i3 & 32768;
            if (i24 != 0) {
            }
            i25 = i3 & 65536;
            if (i25 != 0) {
            }
            i26 = i3 & 131072;
            if (i26 == 0) {
            }
            i23 |= i31;
            int i36222222 = i23;
            if (i16 != 1024) {
            }
            composerStartRestartGroup.startDefaults();
            if ((i & 1) != 0) {
            }
            scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup != null) {
            }
        }
        str4 = str;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        f4 = f;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i4;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i3 & 1024;
        if (i16 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        int i34222222 = i33;
        i18 = i3 & 4096;
        if (i18 != 0) {
        }
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        i22 = i3 & 16384;
        if (i22 != 0) {
        }
        i24 = i3 & 32768;
        if (i24 != 0) {
        }
        i25 = i3 & 65536;
        if (i25 != 0) {
        }
        i26 = i3 & 131072;
        if (i26 == 0) {
        }
        i23 |= i31;
        int i362222222 = i23;
        if (i16 != 1024) {
        }
        composerStartRestartGroup.startDefaults();
        if ((i & 1) != 0) {
        }
        scopeUpdateScopeEndRestartGroup = composer3.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
        }
    }

    /* renamed from: MarkerComposable-Khg_OnI, reason: not valid java name */
    public static final void m9323MarkerComposableKhg_OnI(final Object[] keys, MarkerState markerState, String str, float f, long j, boolean z, boolean z2, long j2, float f2, String str2, Object obj, String str3, boolean z3, float f3, Function1<? super Marker, Boolean> function1, Function1<? super Marker, Unit> function12, Function1<? super Marker, Unit> function13, Function1<? super Marker, Unit> function14, final Function2<? super Composer, ? super Integer, Unit> content, Composer composer, final int i, final int i2, final int i3) {
        MarkerState markerStateRememberMarkerState;
        int i4;
        Intrinsics.checkNotNullParameter(keys, "keys");
        Intrinsics.checkNotNullParameter(content, "content");
        Composer composerStartRestartGroup = composer.startRestartGroup(228528826);
        if ((i3 & 2) != 0) {
            markerStateRememberMarkerState = rememberMarkerState(null, null, composerStartRestartGroup, 0, 3);
            i4 = i & (-113);
        } else {
            markerStateRememberMarkerState = markerState;
            i4 = i;
        }
        String str4 = (i3 & 4) != 0 ? "" : str;
        float f4 = (i3 & 8) != 0 ? 1.0f : f;
        long jOffset = (i3 & 16) != 0 ? OffsetKt.Offset(0.5f, 1.0f) : j;
        boolean z4 = (i3 & 32) != 0 ? false : z;
        boolean z5 = (i3 & 64) == 0 ? z2 : false;
        long jOffset2 = (i3 & 128) != 0 ? OffsetKt.Offset(0.5f, 0.0f) : j2;
        float f5 = (i3 & 256) != 0 ? 0.0f : f2;
        String str5 = (i3 & 512) != 0 ? null : str2;
        final Object obj2 = (i3 & 1024) != 0 ? null : obj;
        final String str6 = (i3 & 2048) != 0 ? null : str3;
        boolean z6 = (i3 & 4096) != 0 ? true : z3;
        float f6 = (i3 & 8192) != 0 ? 0.0f : f3;
        Function1<? super Marker, Boolean> function15 = (i3 & 16384) != 0 ? new Function1<Marker, Boolean>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerComposable$1
            @Override // kotlin.jvm.functions.Function1
            public final Boolean invoke(Marker it) {
                Intrinsics.checkNotNullParameter(it, "it");
                return Boolean.FALSE;
            }
        } : function1;
        Function1<? super Marker, Unit> function16 = (32768 & i3) != 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerComposable$2
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Marker it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                invoke2(marker);
                return Unit.INSTANCE;
            }
        } : function12;
        Function1<? super Marker, Unit> function17 = (65536 & i3) != 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerComposable$3
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Marker it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                invoke2(marker);
                return Unit.INSTANCE;
            }
        } : function13;
        Function1<? super Marker, Unit> function18 = (131072 & i3) != 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerComposable$4
            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Marker it) {
                Intrinsics.checkNotNullParameter(it, "it");
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                invoke2(marker);
                return Unit.INSTANCE;
            }
        } : function14;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventStart(228528826, i4, i2, "com.google.maps.android.compose.MarkerComposable (Marker.kt:297)");
        }
        final float f7 = f4;
        final boolean z7 = z5;
        final MarkerState markerState2 = markerStateRememberMarkerState;
        final String str7 = str4;
        final String str8 = str5;
        final boolean z8 = z4;
        final float f8 = f5;
        final long j3 = jOffset;
        final long j4 = jOffset2;
        m9324MarkerImplkhPtz74(markerState2, str7, f7, j3, z8, z7, RememberComposeBitmapDescriptor.rememberComposeBitmapDescriptor(Arrays.copyOf(keys, keys.length), ComposableLambda3.composableLambda(composerStartRestartGroup, 398603897, true, new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerComposable$icon$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(2);
            }

            @Override // kotlin.jvm.functions.Function2
            public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                invoke(composer2, num.intValue());
                return Unit.INSTANCE;
            }

            public final void invoke(Composer composer2, int i5) {
                if ((i5 & 11) == 2 && composer2.getSkipping()) {
                    composer2.skipToGroupEnd();
                    return;
                }
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventStart(398603897, i5, -1, "com.google.maps.android.compose.MarkerComposable.<anonymous> (Marker.kt:298)");
                }
                content.invoke(composer2, 0);
                if (ComposerKt.isTraceInProgress()) {
                    ComposerKt.traceEventEnd();
                }
            }
        }), composerStartRestartGroup, 56), j4, f8, str8, obj2, str6, z6, f6, function15, function16, function17, function18, null, null, composerStartRestartGroup, ((i4 >> 3) & 524286) | (i4 & 29360128) | (234881024 & i4) | (1879048192 & i4), (i2 & 112) | 8 | (i2 & 896) | (i2 & 7168) | (57344 & i2) | (458752 & i2) | (3670016 & i2) | (29360128 & i2), 786432);
        final float f9 = f6;
        if (ComposerKt.isTraceInProgress()) {
            ComposerKt.traceEventEnd();
        }
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup = composerStartRestartGroup.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup != null) {
            final Function1<? super Marker, Unit> function19 = function17;
            final boolean z9 = z6;
            final Function1<? super Marker, Boolean> function110 = function15;
            final Function1<? super Marker, Unit> function111 = function16;
            final Function1<? super Marker, Unit> function112 = function18;
            scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerComposable$5
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(Composer composer2, Integer num) {
                    invoke(composer2, num.intValue());
                    return Unit.INSTANCE;
                }

                public final void invoke(Composer composer2, int i5) {
                    Object[] objArr = keys;
                    MarkerKt.m9323MarkerComposableKhg_OnI(Arrays.copyOf(objArr, objArr.length), markerState2, str7, f7, j3, z8, z7, j4, f8, str8, obj2, str6, z9, f9, function110, function111, function19, function112, content, composer2, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:101:0x013d  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0158  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01c9  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x01d0  */
    /* JADX WARN: Removed duplicated region for block: B:158:0x01ec  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:168:0x020c  */
    /* JADX WARN: Removed duplicated region for block: B:169:0x0213  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x0277  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x02d0  */
    /* JADX WARN: Removed duplicated region for block: B:219:0x02da  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x0316  */
    /* JADX WARN: Removed duplicated region for block: B:229:0x031a  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x0325  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x032b  */
    /* JADX WARN: Removed duplicated region for block: B:234:0x0330  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:237:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0346  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:248:0x0355  */
    /* JADX WARN: Removed duplicated region for block: B:250:0x0359  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x035b  */
    /* JADX WARN: Removed duplicated region for block: B:253:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:254:0x0361  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0365  */
    /* JADX WARN: Removed duplicated region for block: B:257:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:262:0x0373  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x037b  */
    /* JADX WARN: Removed duplicated region for block: B:268:0x037e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:270:0x0382  */
    /* JADX WARN: Removed duplicated region for block: B:271:0x0385  */
    /* JADX WARN: Removed duplicated region for block: B:273:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:274:0x038c  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x0390  */
    /* JADX WARN: Removed duplicated region for block: B:277:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:280:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x03d6  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:290:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x0419  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x0425  */
    /* JADX WARN: Removed duplicated region for block: B:297:0x042e  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x04c4  */
    /* JADX WARN: Removed duplicated region for block: B:304:0x04f1  */
    /* JADX WARN: Removed duplicated region for block: B:306:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00f3  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0119  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0134  */
    /* renamed from: MarkerImpl-khPtz74, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m9324MarkerImplkhPtz74(MarkerState markerState, String str, float f, long j, boolean z, boolean z2, BitmapDescriptor bitmapDescriptor, long j2, float f2, String str2, Object obj, String str3, boolean z3, float f3, Function1<? super Marker, Boolean> function1, Function1<? super Marker, Unit> function12, Function1<? super Marker, Unit> function13, Function1<? super Marker, Unit> function14, Function3<? super Marker, ? super Composer, ? super Integer, Unit> function3, Function3<? super Marker, ? super Composer, ? super Integer, Unit> function32, Composer composer, final int i, final int i2, final int i3) {
        int i4;
        String str4;
        int i5;
        float f4;
        int i6;
        long j3;
        int i7;
        boolean z4;
        int i8;
        int i9;
        final BitmapDescriptor bitmapDescriptor2;
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
        boolean z5;
        int i20;
        int i21;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i30;
        MarkerState markerStateRememberMarkerState;
        final Function3<? super Marker, ? super Composer, ? super Integer, Unit> function33;
        final MarkerState markerState2;
        final boolean z6;
        final Function1<? super Marker, Boolean> function15;
        final boolean z7;
        final float f5;
        final BitmapDescriptor bitmapDescriptor3;
        final boolean z8;
        final String str5;
        final long j4;
        final float f6;
        final float f7;
        final String str6;
        final Object obj2;
        final Function1<? super Marker, Unit> function16;
        final Function1<? super Marker, Unit> function17;
        final String str7;
        final Function1<? super Marker, Unit> function18;
        final Function3<? super Marker, ? super Composer, ? super Integer, Unit> function34;
        final long j5;
        final Object obj3;
        final Function1<? super Marker, Unit> function19;
        final Function1<? super Marker, Unit> function110;
        final Function1<? super Marker, Unit> function111;
        Composer composer2;
        final Function1<? super Marker, Boolean> function112;
        final Function3<? super Marker, ? super Composer, ? super Integer, Unit> function35;
        final Function3<? super Marker, ? super Composer, ? super Integer, Unit> function36;
        final String str8;
        final String str9;
        final MarkerState markerState3;
        final String str10;
        final float f8;
        final long j6;
        final boolean z9;
        final boolean z10;
        final long j7;
        final float f9;
        final boolean z11;
        final float f10;
        ScopeUpdateScope scopeUpdateScopeEndRestartGroup;
        int i31;
        Composer composerStartRestartGroup = composer.startRestartGroup(2020144986);
        if ((i & 14) == 0) {
            i4 = (((i3 & 1) == 0 && composerStartRestartGroup.changed(markerState)) ? 4 : 2) | i;
        } else {
            i4 = i;
        }
        int i32 = i3 & 2;
        if (i32 != 0) {
            i4 |= 48;
        } else {
            if ((i & 112) == 0) {
                str4 = str;
                i4 |= composerStartRestartGroup.changed(str4) ? 32 : 16;
            }
            i5 = i3 & 4;
            if (i5 == 0) {
                i4 |= 384;
            } else {
                if ((i & 896) == 0) {
                    f4 = f;
                    i4 |= composerStartRestartGroup.changed(f4) ? 256 : 128;
                }
                i6 = i3 & 8;
                if (i6 != 0) {
                    i4 |= 3072;
                    j3 = j;
                } else {
                    j3 = j;
                    if ((i & 7168) == 0) {
                        i4 |= composerStartRestartGroup.changed(j3) ? 2048 : 1024;
                    }
                }
                i7 = i3 & 16;
                if (i7 != 0) {
                    i4 |= 24576;
                    z4 = z;
                } else {
                    z4 = z;
                    if ((i & 57344) == 0) {
                        i4 |= composerStartRestartGroup.changed(z4) ? 16384 : 8192;
                    }
                }
                i8 = i3 & 32;
                if (i8 != 0) {
                    i4 |= 196608;
                } else if ((i & 458752) == 0) {
                    i4 |= composerStartRestartGroup.changed(z2) ? 131072 : 65536;
                }
                i9 = i3 & 64;
                if (i9 != 0) {
                    i4 |= 1572864;
                    bitmapDescriptor2 = bitmapDescriptor;
                } else {
                    bitmapDescriptor2 = bitmapDescriptor;
                    if ((i & 3670016) == 0) {
                        i4 |= composerStartRestartGroup.changed(bitmapDescriptor2) ? 1048576 : 524288;
                    }
                }
                i10 = i3 & 128;
                if (i10 != 0) {
                    i4 |= 12582912;
                } else {
                    if ((i & 29360128) == 0) {
                        i11 = i4 | (composerStartRestartGroup.changed(j2) ? 8388608 : 4194304);
                    }
                    i12 = i3 & 256;
                    if (i12 == 0) {
                        i11 |= 100663296;
                    } else {
                        if ((i & 234881024) == 0) {
                            i13 = i12;
                            i11 |= composerStartRestartGroup.changed(f2) ? 67108864 : 33554432;
                        }
                        i14 = i3 & 512;
                        if (i14 != 0) {
                            i11 |= 805306368;
                        } else {
                            if ((i & 1879048192) == 0) {
                                i15 = i14;
                                i11 |= composerStartRestartGroup.changed(str2) ? 536870912 : 268435456;
                            }
                            i16 = i3 & 1024;
                            int i33 = i16 == 0 ? i2 | 2 : i2;
                            i17 = i3 & 2048;
                            if (i17 == 0) {
                                i33 |= 48;
                                i18 = i17;
                            } else if ((i2 & 112) == 0) {
                                i18 = i17;
                                i33 |= composerStartRestartGroup.changed(str3) ? 32 : 16;
                            } else {
                                i18 = i17;
                            }
                            int i34 = i33;
                            i19 = i3 & 4096;
                            if (i19 == 0) {
                                i34 |= 384;
                            } else {
                                if ((i2 & 896) == 0) {
                                    z5 = z3;
                                    i34 |= composerStartRestartGroup.changed(z5) ? 256 : 128;
                                }
                                i20 = i3 & 8192;
                                if (i20 != 0) {
                                    i21 = i34 | 3072;
                                } else {
                                    int i35 = i34;
                                    if ((i2 & 7168) == 0) {
                                        i21 = i35 | (composerStartRestartGroup.changed(f3) ? 2048 : 1024);
                                    } else {
                                        i21 = i35;
                                    }
                                }
                                i22 = i3 & 16384;
                                if (i22 != 0) {
                                    i21 |= 24576;
                                } else {
                                    if ((i2 & 57344) == 0) {
                                        i23 = i21 | (composerStartRestartGroup.changedInstance(function1) ? 16384 : 8192);
                                    }
                                    i24 = i3 & 32768;
                                    if (i24 == 0) {
                                        i23 |= 196608;
                                    } else if ((i2 & 458752) == 0) {
                                        i23 |= composerStartRestartGroup.changedInstance(function12) ? 131072 : 65536;
                                    }
                                    i25 = i3 & 65536;
                                    if (i25 == 0) {
                                        i23 |= 1572864;
                                    } else if ((i2 & 3670016) == 0) {
                                        i23 |= composerStartRestartGroup.changedInstance(function13) ? 1048576 : 524288;
                                    }
                                    i26 = i3 & 131072;
                                    if (i26 == 0) {
                                        i23 |= 12582912;
                                    } else if ((i2 & 29360128) == 0) {
                                        i23 |= composerStartRestartGroup.changedInstance(function14) ? 8388608 : 4194304;
                                    }
                                    i27 = i3 & 262144;
                                    if (i27 == 0) {
                                        i23 |= 100663296;
                                    } else if ((i2 & 234881024) == 0) {
                                        i23 |= composerStartRestartGroup.changedInstance(function3) ? 67108864 : 33554432;
                                    }
                                    i28 = i3 & 524288;
                                    if (i28 != 0) {
                                        i31 = (i2 & 1879048192) == 0 ? composerStartRestartGroup.changedInstance(function32) ? 536870912 : 268435456 : 805306368;
                                        int i36 = i23;
                                        if (i16 == 1024) {
                                            i29 = i16;
                                            if ((i11 & 1533916891) == 306783378 && (1533916891 & i36) == 306783378 && composerStartRestartGroup.getSkipping()) {
                                                composerStartRestartGroup.skipToGroupEnd();
                                                markerState3 = markerState;
                                                z10 = z2;
                                                f9 = f2;
                                                f10 = f3;
                                                function112 = function1;
                                                function19 = function12;
                                                function110 = function13;
                                                function111 = function14;
                                                function35 = function3;
                                                function36 = function32;
                                                composer2 = composerStartRestartGroup;
                                                z11 = z5;
                                                z9 = z4;
                                                str10 = str4;
                                                j6 = j3;
                                                f8 = f4;
                                                j7 = j2;
                                                str9 = str2;
                                                obj3 = obj;
                                                str8 = str3;
                                            }
                                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                            if (scopeUpdateScopeEndRestartGroup == null) {
                                                scopeUpdateScopeEndRestartGroup.updateScope(new Function2<Composer, Integer, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$7
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

                                                    public final void invoke(Composer composer3, int i37) {
                                                        MarkerKt.m9324MarkerImplkhPtz74(markerState3, str10, f8, j6, z9, z10, bitmapDescriptor2, j7, f9, str9, obj3, str8, z11, f10, function112, function19, function110, function111, function35, function36, composer3, RecomposeScopeImpl4.updateChangedFlags(i | 1), RecomposeScopeImpl4.updateChangedFlags(i2), i3);
                                                    }
                                                });
                                                return;
                                            }
                                            return;
                                        }
                                        i29 = i16;
                                        composerStartRestartGroup.startDefaults();
                                        if ((i & 1) == 0 || composerStartRestartGroup.getDefaultsInvalid()) {
                                            if ((i3 & 1) == 0) {
                                                i30 = i22;
                                                markerStateRememberMarkerState = rememberMarkerState(null, null, composerStartRestartGroup, 0, 3);
                                                i11 &= -15;
                                            } else {
                                                i30 = i22;
                                                markerStateRememberMarkerState = markerState;
                                            }
                                            if (i32 != 0) {
                                                str4 = "";
                                            }
                                            if (i5 != 0) {
                                                f4 = 1.0f;
                                            }
                                            long jOffset = i6 == 0 ? OffsetKt.Offset(0.5f, 1.0f) : j3;
                                            if (i7 != 0) {
                                                z4 = false;
                                            }
                                            boolean z12 = i8 == 0 ? false : z2;
                                            if (i9 != 0) {
                                                bitmapDescriptor2 = null;
                                            }
                                            long jOffset2 = i10 == 0 ? OffsetKt.Offset(0.5f, 0.0f) : j2;
                                            float f11 = i13 == 0 ? 0.0f : f2;
                                            String str11 = i15 == 0 ? null : str2;
                                            Object obj4 = i29 == 0 ? null : obj;
                                            String str12 = i18 == 0 ? null : str3;
                                            if (i19 != 0) {
                                                z5 = true;
                                            }
                                            float f12 = i20 == 0 ? f3 : 0.0f;
                                            Function1<? super Marker, Boolean> function113 = i30 == 0 ? new Function1<Marker, Boolean>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$1
                                                @Override // kotlin.jvm.functions.Function1
                                                public final Boolean invoke(Marker it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                    return Boolean.FALSE;
                                                }
                                            } : function1;
                                            Function1<? super Marker, Unit> function114 = i24 == 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$2
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Marker it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                                                    invoke2(marker);
                                                    return Unit.INSTANCE;
                                                }
                                            } : function12;
                                            Function1<? super Marker, Unit> function115 = i25 == 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$3
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Marker it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                                                    invoke2(marker);
                                                    return Unit.INSTANCE;
                                                }
                                            } : function13;
                                            Function1<? super Marker, Unit> function116 = i26 == 0 ? new Function1<Marker, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$4
                                                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                                public final void invoke2(Marker it) {
                                                    Intrinsics.checkNotNullParameter(it, "it");
                                                }

                                                @Override // kotlin.jvm.functions.Function1
                                                public /* bridge */ /* synthetic */ Unit invoke(Marker marker) {
                                                    invoke2(marker);
                                                    return Unit.INSTANCE;
                                                }
                                            } : function14;
                                            Function3<? super Marker, ? super Composer, ? super Integer, Unit> function37 = i27 == 0 ? null : function3;
                                            if (i28 == 0) {
                                                markerState2 = markerStateRememberMarkerState;
                                                function33 = null;
                                            } else {
                                                function33 = function32;
                                                markerState2 = markerStateRememberMarkerState;
                                            }
                                            z6 = z12;
                                            function15 = function113;
                                            z7 = z5;
                                            f5 = f12;
                                            bitmapDescriptor3 = bitmapDescriptor2;
                                            z8 = z4;
                                            str5 = str4;
                                            j4 = jOffset;
                                            f6 = f11;
                                            f7 = f4;
                                            str6 = str11;
                                            obj2 = obj4;
                                            function16 = function114;
                                            function17 = function115;
                                            str7 = str12;
                                            function18 = function116;
                                            function34 = function37;
                                            j5 = jOffset2;
                                        } else {
                                            composerStartRestartGroup.skipToGroupEnd();
                                            if ((i3 & 1) != 0) {
                                                i11 &= -15;
                                            }
                                            markerState2 = markerState;
                                            z6 = z2;
                                            j5 = j2;
                                            f6 = f2;
                                            str6 = str2;
                                            obj2 = obj;
                                            str7 = str3;
                                            f5 = f3;
                                            function15 = function1;
                                            function16 = function12;
                                            function17 = function13;
                                            function18 = function14;
                                            function34 = function3;
                                            function33 = function32;
                                            z7 = z5;
                                            bitmapDescriptor3 = bitmapDescriptor2;
                                            z8 = z4;
                                            str5 = str4;
                                            j4 = j3;
                                            f7 = f4;
                                        }
                                        int i37 = i11;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventStart(2020144986, i37, i36, "com.google.maps.android.compose.MarkerImpl (Marker.kt:513)");
                                        }
                                        Applier<?> applier = composerStartRestartGroup.getApplier();
                                        final MapApplier mapApplier = applier instanceof MapApplier ? (MapApplier) applier : null;
                                        final CompositionContext compositionContextRememberCompositionContext = Composables.rememberCompositionContext(composerStartRestartGroup, 0);
                                        final Function0<MarkerNode> function0 = new Function0<MarkerNode>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final MarkerNode invoke() {
                                                GoogleMap map;
                                                MapApplier mapApplier2 = mapApplier;
                                                if (mapApplier2 != null && (map = mapApplier2.getMap()) != null) {
                                                    String str13 = str5;
                                                    float f13 = f7;
                                                    long j8 = j4;
                                                    boolean z13 = z8;
                                                    boolean z14 = z6;
                                                    BitmapDescriptor bitmapDescriptor4 = bitmapDescriptor3;
                                                    long j9 = j5;
                                                    MarkerState markerState4 = markerState2;
                                                    float f14 = f6;
                                                    String str14 = str6;
                                                    String str15 = str7;
                                                    boolean z15 = z7;
                                                    float f15 = f5;
                                                    MarkerOptions markerOptions = new MarkerOptions();
                                                    markerOptions.contentDescription(str13);
                                                    markerOptions.alpha(f13);
                                                    markerOptions.anchor(Offset.m6543getXimpl(j8), Offset.m6544getYimpl(j8));
                                                    markerOptions.draggable(z13);
                                                    markerOptions.flat(z14);
                                                    markerOptions.icon(bitmapDescriptor4);
                                                    markerOptions.infoWindowAnchor(Offset.m6543getXimpl(j9), Offset.m6544getYimpl(j9));
                                                    markerOptions.position(markerState4.getPosition());
                                                    markerOptions.rotation(f14);
                                                    markerOptions.snippet(str14);
                                                    markerOptions.title(str15);
                                                    markerOptions.visible(z15);
                                                    markerOptions.zIndex(f15);
                                                    Marker markerAddMarker = map.addMarker(markerOptions);
                                                    if (markerAddMarker != null) {
                                                        markerAddMarker.setTag(obj2);
                                                        return new MarkerNode(compositionContextRememberCompositionContext, markerAddMarker, markerState2, function15, function16, function17, function18, function34, function33);
                                                    }
                                                }
                                                throw new IllegalStateException("Error adding marker");
                                            }
                                        };
                                        Object obj5 = obj2;
                                        Function1<? super Marker, Boolean> function117 = function15;
                                        Function1<? super Marker, Unit> function118 = function16;
                                        Function1<? super Marker, Unit> function119 = function17;
                                        Function1<? super Marker, Unit> function120 = function18;
                                        Function3<? super Marker, ? super Composer, ? super Integer, Unit> function38 = function34;
                                        Function3<? super Marker, ? super Composer, ? super Integer, Unit> function39 = function33;
                                        bitmapDescriptor2 = bitmapDescriptor3;
                                        String str13 = str6;
                                        String str14 = str7;
                                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                                        if (!(composerStartRestartGroup.getApplier() instanceof MapApplier)) {
                                            Composables.invalidApplier();
                                        }
                                        composerStartRestartGroup.startNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                            composerStartRestartGroup.createNode(new Function0<MarkerNode>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl-khPtz74$$inlined$ComposeNode$1
                                                {
                                                    super(0);
                                                }

                                                /* JADX WARN: Type inference failed for: r0v1, types: [com.google.maps.android.compose.MarkerNode, java.lang.Object] */
                                                @Override // kotlin.jvm.functions.Function0
                                                public final MarkerNode invoke() {
                                                    return function0.invoke();
                                                }
                                            });
                                        } else {
                                            composerStartRestartGroup.useNode();
                                        }
                                        Composer composerM6388constructorimpl = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6391updateimpl(composerM6388constructorimpl, function117, new Function2<MarkerNode, Function1<? super Marker, ? extends Boolean>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Boolean> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Boolean>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Boolean> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnMarkerClick(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, function118, new Function2<MarkerNode, Function1<? super Marker, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Unit> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Unit>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Unit> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnInfoWindowClick(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, function119, new Function2<MarkerNode, Function1<? super Marker, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Unit> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Unit>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Unit> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnInfoWindowClose(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, function120, new Function2<MarkerNode, Function1<? super Marker, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Unit> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Unit>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Unit> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnInfoWindowLongClick(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, function39, new Function2<MarkerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$5
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit> function310) {
                                                invoke2(markerNode, (Function3<? super Marker, ? super Composer, ? super Integer, Unit>) function310);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function3<? super Marker, ? super Composer, ? super Integer, Unit> function310) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.setInfoContent(function310);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, function38, new Function2<MarkerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$6
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit> function310) {
                                                invoke2(markerNode, (Function3<? super Marker, ? super Composer, ? super Integer, Unit>) function310);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function3<? super Marker, ? super Composer, ? super Integer, Unit> function310) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.setInfoWindow(function310);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Float.valueOf(f7), new Function2<MarkerNode, Float, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$7
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Float f13) {
                                                invoke(markerNode, f13.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, float f13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setAlpha(f13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Offset.m6534boximpl(j4), new Function2<MarkerNode, Offset, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$8
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Offset offset) {
                                                m9327invokeUv8p0NA(markerNode, offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                            public final void m9327invokeUv8p0NA(MarkerNode update, long j8) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setAnchor(Offset.m6543getXimpl(j8), Offset.m6544getYimpl(j8));
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Boolean.valueOf(z8), new Function2<MarkerNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$9
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Boolean bool) {
                                                invoke(markerNode, bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, boolean z13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setDraggable(z13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Boolean.valueOf(z6), new Function2<MarkerNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$10
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Boolean bool) {
                                                invoke(markerNode, bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, boolean z13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setFlat(z13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, bitmapDescriptor2, new Function2<MarkerNode, BitmapDescriptor, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$11
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, BitmapDescriptor bitmapDescriptor4) {
                                                invoke2(markerNode, bitmapDescriptor4);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, BitmapDescriptor bitmapDescriptor4) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setIcon(bitmapDescriptor4);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Offset.m6534boximpl(j5), new Function2<MarkerNode, Offset, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$12
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Offset offset) {
                                                m9326invokeUv8p0NA(markerNode, offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                            public final void m9326invokeUv8p0NA(MarkerNode update, long j8) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setInfoWindowAnchor(Offset.m6543getXimpl(j8), Offset.m6544getYimpl(j8));
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, markerState2.getPosition(), new Function2<MarkerNode, LatLng, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$13
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, LatLng latLng) {
                                                invoke2(markerNode, latLng);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, LatLng it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.getMarker().setPosition(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Float.valueOf(f6), new Function2<MarkerNode, Float, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$14
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Float f13) {
                                                invoke(markerNode, f13.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, float f13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setRotation(f13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, str13, new Function2<MarkerNode, String, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$15
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, String str15) {
                                                invoke2(markerNode, str15);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, String str15) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setSnippet(str15);
                                                if (update.getMarker().isInfoWindowShown()) {
                                                    update.getMarker().showInfoWindow();
                                                }
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, obj5, new Function2<MarkerNode, Object, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$16
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Object obj6) {
                                                invoke2(markerNode, obj6);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Object obj6) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setTag(obj6);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, str14, new Function2<MarkerNode, String, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$17
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, String str15) {
                                                invoke2(markerNode, str15);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, String str15) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setTitle(str15);
                                                if (update.getMarker().isInfoWindowShown()) {
                                                    update.getMarker().showInfoWindow();
                                                }
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Boolean.valueOf(z7), new Function2<MarkerNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$18
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Boolean bool) {
                                                invoke(markerNode, bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, boolean z13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setVisible(z13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl, Float.valueOf(f5), new Function2<MarkerNode, Float, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$19
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Float f13) {
                                                invoke(markerNode, f13.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, float f13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setZIndex(f13);
                                            }
                                        });
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                            ComposerKt.traceEventEnd();
                                        }
                                        obj3 = obj5;
                                        function19 = function118;
                                        function110 = function119;
                                        function111 = function120;
                                        composer2 = composerStartRestartGroup;
                                        function112 = function117;
                                        function35 = function38;
                                        function36 = function39;
                                        str8 = str14;
                                        str9 = str13;
                                        markerState3 = markerState2;
                                        str10 = str5;
                                        f8 = f7;
                                        j6 = j4;
                                        z9 = z8;
                                        z10 = z6;
                                        j7 = j5;
                                        f9 = f6;
                                        z11 = z7;
                                        f10 = f5;
                                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                        if (scopeUpdateScopeEndRestartGroup == null) {
                                        }
                                    }
                                    i23 |= i31;
                                    int i362 = i23;
                                    if (i16 == 1024) {
                                    }
                                    composerStartRestartGroup.startDefaults();
                                    if ((i & 1) == 0) {
                                        if ((i3 & 1) == 0) {
                                        }
                                        if (i32 != 0) {
                                        }
                                        if (i5 != 0) {
                                        }
                                        if (i6 == 0) {
                                        }
                                        if (i7 != 0) {
                                        }
                                        if (i8 == 0) {
                                        }
                                        if (i9 != 0) {
                                        }
                                        if (i10 == 0) {
                                        }
                                        if (i13 == 0) {
                                        }
                                        if (i15 == 0) {
                                        }
                                        if (i29 == 0) {
                                        }
                                        if (i18 == 0) {
                                        }
                                        if (i19 != 0) {
                                        }
                                        if (i20 == 0) {
                                        }
                                        if (i30 == 0) {
                                        }
                                        if (i24 == 0) {
                                        }
                                        if (i25 == 0) {
                                        }
                                        if (i26 == 0) {
                                        }
                                        if (i27 == 0) {
                                        }
                                        if (i28 == 0) {
                                        }
                                        z6 = z12;
                                        function15 = function113;
                                        z7 = z5;
                                        f5 = f12;
                                        bitmapDescriptor3 = bitmapDescriptor2;
                                        z8 = z4;
                                        str5 = str4;
                                        j4 = jOffset;
                                        f6 = f11;
                                        f7 = f4;
                                        str6 = str11;
                                        obj2 = obj4;
                                        function16 = function114;
                                        function17 = function115;
                                        str7 = str12;
                                        function18 = function116;
                                        function34 = function37;
                                        j5 = jOffset2;
                                        int i372 = i11;
                                        composerStartRestartGroup.endDefaults();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        Applier<?> applier2 = composerStartRestartGroup.getApplier();
                                        final MapApplier mapApplier2 = applier2 instanceof MapApplier ? (MapApplier) applier2 : null;
                                        final CompositionContext compositionContextRememberCompositionContext2 = Composables.rememberCompositionContext(composerStartRestartGroup, 0);
                                        final Function0 function02 = new Function0<MarkerNode>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$5
                                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                                            /* JADX WARN: Multi-variable type inference failed */
                                            {
                                                super(0);
                                            }

                                            /* JADX WARN: Can't rename method to resolve collision */
                                            @Override // kotlin.jvm.functions.Function0
                                            public final MarkerNode invoke() {
                                                GoogleMap map;
                                                MapApplier mapApplier22 = mapApplier2;
                                                if (mapApplier22 != null && (map = mapApplier22.getMap()) != null) {
                                                    String str132 = str5;
                                                    float f13 = f7;
                                                    long j8 = j4;
                                                    boolean z13 = z8;
                                                    boolean z14 = z6;
                                                    BitmapDescriptor bitmapDescriptor4 = bitmapDescriptor3;
                                                    long j9 = j5;
                                                    MarkerState markerState4 = markerState2;
                                                    float f14 = f6;
                                                    String str142 = str6;
                                                    String str15 = str7;
                                                    boolean z15 = z7;
                                                    float f15 = f5;
                                                    MarkerOptions markerOptions = new MarkerOptions();
                                                    markerOptions.contentDescription(str132);
                                                    markerOptions.alpha(f13);
                                                    markerOptions.anchor(Offset.m6543getXimpl(j8), Offset.m6544getYimpl(j8));
                                                    markerOptions.draggable(z13);
                                                    markerOptions.flat(z14);
                                                    markerOptions.icon(bitmapDescriptor4);
                                                    markerOptions.infoWindowAnchor(Offset.m6543getXimpl(j9), Offset.m6544getYimpl(j9));
                                                    markerOptions.position(markerState4.getPosition());
                                                    markerOptions.rotation(f14);
                                                    markerOptions.snippet(str142);
                                                    markerOptions.title(str15);
                                                    markerOptions.visible(z15);
                                                    markerOptions.zIndex(f15);
                                                    Marker markerAddMarker = map.addMarker(markerOptions);
                                                    if (markerAddMarker != null) {
                                                        markerAddMarker.setTag(obj2);
                                                        return new MarkerNode(compositionContextRememberCompositionContext2, markerAddMarker, markerState2, function15, function16, function17, function18, function34, function33);
                                                    }
                                                }
                                                throw new IllegalStateException("Error adding marker");
                                            }
                                        };
                                        Object obj52 = obj2;
                                        Function1<? super Marker, Boolean> function1172 = function15;
                                        Function1<? super Marker, Unit> function1182 = function16;
                                        Function1<? super Marker, Unit> function1192 = function17;
                                        Function1<? super Marker, Unit> function1202 = function18;
                                        Function3<? super Marker, ? super Composer, ? super Integer, Unit> function382 = function34;
                                        Function3<? super Marker, ? super Composer, ? super Integer, Unit> function392 = function33;
                                        bitmapDescriptor2 = bitmapDescriptor3;
                                        String str132 = str6;
                                        String str142 = str7;
                                        composerStartRestartGroup.startReplaceableGroup(1886828752);
                                        if (!(composerStartRestartGroup.getApplier() instanceof MapApplier)) {
                                        }
                                        composerStartRestartGroup.startNode();
                                        if (!composerStartRestartGroup.getInserting()) {
                                        }
                                        Composer composerM6388constructorimpl2 = Updater.m6388constructorimpl(composerStartRestartGroup);
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, function1172, new Function2<MarkerNode, Function1<? super Marker, ? extends Boolean>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$1
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Boolean> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Boolean>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Boolean> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnMarkerClick(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, function1182, new Function2<MarkerNode, Function1<? super Marker, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$2
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Unit> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Unit>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Unit> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnInfoWindowClick(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, function1192, new Function2<MarkerNode, Function1<? super Marker, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$3
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Unit> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Unit>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Unit> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnInfoWindowClose(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, function1202, new Function2<MarkerNode, Function1<? super Marker, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$4
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function1<? super Marker, ? extends Unit> function121) {
                                                invoke2(markerNode, (Function1<? super Marker, Unit>) function121);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function1<? super Marker, Unit> it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.setOnInfoWindowLongClick(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, function392, new Function2<MarkerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$5
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit> function310) {
                                                invoke2(markerNode, (Function3<? super Marker, ? super Composer, ? super Integer, Unit>) function310);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function3<? super Marker, ? super Composer, ? super Integer, Unit> function310) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.setInfoContent(function310);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, function382, new Function2<MarkerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit>, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$6
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Function3<? super Marker, ? super Composer, ? super Integer, ? extends Unit> function310) {
                                                invoke2(markerNode, (Function3<? super Marker, ? super Composer, ? super Integer, Unit>) function310);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Function3<? super Marker, ? super Composer, ? super Integer, Unit> function310) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.setInfoWindow(function310);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Float.valueOf(f7), new Function2<MarkerNode, Float, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$7
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Float f13) {
                                                invoke(markerNode, f13.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, float f13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setAlpha(f13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Offset.m6534boximpl(j4), new Function2<MarkerNode, Offset, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$8
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Offset offset) {
                                                m9327invokeUv8p0NA(markerNode, offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                            public final void m9327invokeUv8p0NA(MarkerNode update, long j8) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setAnchor(Offset.m6543getXimpl(j8), Offset.m6544getYimpl(j8));
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Boolean.valueOf(z8), new Function2<MarkerNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$9
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Boolean bool) {
                                                invoke(markerNode, bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, boolean z13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setDraggable(z13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Boolean.valueOf(z6), new Function2<MarkerNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$10
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Boolean bool) {
                                                invoke(markerNode, bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, boolean z13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setFlat(z13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, bitmapDescriptor2, new Function2<MarkerNode, BitmapDescriptor, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$11
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, BitmapDescriptor bitmapDescriptor4) {
                                                invoke2(markerNode, bitmapDescriptor4);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, BitmapDescriptor bitmapDescriptor4) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setIcon(bitmapDescriptor4);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Offset.m6534boximpl(j5), new Function2<MarkerNode, Offset, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$12
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Offset offset) {
                                                m9326invokeUv8p0NA(markerNode, offset.getPackedValue());
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke-Uv8p0NA, reason: not valid java name */
                                            public final void m9326invokeUv8p0NA(MarkerNode update, long j8) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setInfoWindowAnchor(Offset.m6543getXimpl(j8), Offset.m6544getYimpl(j8));
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, markerState2.getPosition(), new Function2<MarkerNode, LatLng, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$13
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, LatLng latLng) {
                                                invoke2(markerNode, latLng);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, LatLng it) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                Intrinsics.checkNotNullParameter(it, "it");
                                                update.getMarker().setPosition(it);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Float.valueOf(f6), new Function2<MarkerNode, Float, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$14
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Float f13) {
                                                invoke(markerNode, f13.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, float f13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setRotation(f13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, str132, new Function2<MarkerNode, String, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$15
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, String str15) {
                                                invoke2(markerNode, str15);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, String str15) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setSnippet(str15);
                                                if (update.getMarker().isInfoWindowShown()) {
                                                    update.getMarker().showInfoWindow();
                                                }
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, obj52, new Function2<MarkerNode, Object, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$16
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Object obj6) {
                                                invoke2(markerNode, obj6);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, Object obj6) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setTag(obj6);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, str142, new Function2<MarkerNode, String, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$17
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, String str15) {
                                                invoke2(markerNode, str15);
                                                return Unit.INSTANCE;
                                            }

                                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                                            public final void invoke2(MarkerNode update, String str15) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setTitle(str15);
                                                if (update.getMarker().isInfoWindowShown()) {
                                                    update.getMarker().showInfoWindow();
                                                }
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Boolean.valueOf(z7), new Function2<MarkerNode, Boolean, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$18
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Boolean bool) {
                                                invoke(markerNode, bool.booleanValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, boolean z13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setVisible(z13);
                                            }
                                        });
                                        Updater.m6391updateimpl(composerM6388constructorimpl2, Float.valueOf(f5), new Function2<MarkerNode, Float, Unit>() { // from class: com.google.maps.android.compose.MarkerKt$MarkerImpl$6$19
                                            @Override // kotlin.jvm.functions.Function2
                                            public /* bridge */ /* synthetic */ Unit invoke(MarkerNode markerNode, Float f13) {
                                                invoke(markerNode, f13.floatValue());
                                                return Unit.INSTANCE;
                                            }

                                            public final void invoke(MarkerNode update, float f13) {
                                                Intrinsics.checkNotNullParameter(update, "$this$update");
                                                update.getMarker().setZIndex(f13);
                                            }
                                        });
                                        composerStartRestartGroup.endNode();
                                        composerStartRestartGroup.endReplaceableGroup();
                                        if (ComposerKt.isTraceInProgress()) {
                                        }
                                        obj3 = obj52;
                                        function19 = function1182;
                                        function110 = function1192;
                                        function111 = function1202;
                                        composer2 = composerStartRestartGroup;
                                        function112 = function1172;
                                        function35 = function382;
                                        function36 = function392;
                                        str8 = str142;
                                        str9 = str132;
                                        markerState3 = markerState2;
                                        str10 = str5;
                                        f8 = f7;
                                        j6 = j4;
                                        z9 = z8;
                                        z10 = z6;
                                        j7 = j5;
                                        f9 = f6;
                                        z11 = z7;
                                        f10 = f5;
                                    }
                                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                    if (scopeUpdateScopeEndRestartGroup == null) {
                                    }
                                }
                                i23 = i21;
                                i24 = i3 & 32768;
                                if (i24 == 0) {
                                }
                                i25 = i3 & 65536;
                                if (i25 == 0) {
                                }
                                i26 = i3 & 131072;
                                if (i26 == 0) {
                                }
                                i27 = i3 & 262144;
                                if (i27 == 0) {
                                }
                                i28 = i3 & 524288;
                                if (i28 != 0) {
                                }
                                i23 |= i31;
                                int i3622 = i23;
                                if (i16 == 1024) {
                                }
                                composerStartRestartGroup.startDefaults();
                                if ((i & 1) == 0) {
                                }
                                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                                if (scopeUpdateScopeEndRestartGroup == null) {
                                }
                            }
                            z5 = z3;
                            i20 = i3 & 8192;
                            if (i20 != 0) {
                            }
                            i22 = i3 & 16384;
                            if (i22 != 0) {
                            }
                            i23 = i21;
                            i24 = i3 & 32768;
                            if (i24 == 0) {
                            }
                            i25 = i3 & 65536;
                            if (i25 == 0) {
                            }
                            i26 = i3 & 131072;
                            if (i26 == 0) {
                            }
                            i27 = i3 & 262144;
                            if (i27 == 0) {
                            }
                            i28 = i3 & 524288;
                            if (i28 != 0) {
                            }
                            i23 |= i31;
                            int i36222 = i23;
                            if (i16 == 1024) {
                            }
                            composerStartRestartGroup.startDefaults();
                            if ((i & 1) == 0) {
                            }
                            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                            if (scopeUpdateScopeEndRestartGroup == null) {
                            }
                        }
                        i15 = i14;
                        i16 = i3 & 1024;
                        if (i16 == 0) {
                        }
                        i17 = i3 & 2048;
                        if (i17 == 0) {
                        }
                        int i342 = i33;
                        i19 = i3 & 4096;
                        if (i19 == 0) {
                        }
                        z5 = z3;
                        i20 = i3 & 8192;
                        if (i20 != 0) {
                        }
                        i22 = i3 & 16384;
                        if (i22 != 0) {
                        }
                        i23 = i21;
                        i24 = i3 & 32768;
                        if (i24 == 0) {
                        }
                        i25 = i3 & 65536;
                        if (i25 == 0) {
                        }
                        i26 = i3 & 131072;
                        if (i26 == 0) {
                        }
                        i27 = i3 & 262144;
                        if (i27 == 0) {
                        }
                        i28 = i3 & 524288;
                        if (i28 != 0) {
                        }
                        i23 |= i31;
                        int i362222 = i23;
                        if (i16 == 1024) {
                        }
                        composerStartRestartGroup.startDefaults();
                        if ((i & 1) == 0) {
                        }
                        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                        if (scopeUpdateScopeEndRestartGroup == null) {
                        }
                    }
                    i13 = i12;
                    i14 = i3 & 512;
                    if (i14 != 0) {
                    }
                    i15 = i14;
                    i16 = i3 & 1024;
                    if (i16 == 0) {
                    }
                    i17 = i3 & 2048;
                    if (i17 == 0) {
                    }
                    int i3422 = i33;
                    i19 = i3 & 4096;
                    if (i19 == 0) {
                    }
                    z5 = z3;
                    i20 = i3 & 8192;
                    if (i20 != 0) {
                    }
                    i22 = i3 & 16384;
                    if (i22 != 0) {
                    }
                    i23 = i21;
                    i24 = i3 & 32768;
                    if (i24 == 0) {
                    }
                    i25 = i3 & 65536;
                    if (i25 == 0) {
                    }
                    i26 = i3 & 131072;
                    if (i26 == 0) {
                    }
                    i27 = i3 & 262144;
                    if (i27 == 0) {
                    }
                    i28 = i3 & 524288;
                    if (i28 != 0) {
                    }
                    i23 |= i31;
                    int i3622222 = i23;
                    if (i16 == 1024) {
                    }
                    composerStartRestartGroup.startDefaults();
                    if ((i & 1) == 0) {
                    }
                    scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                    if (scopeUpdateScopeEndRestartGroup == null) {
                    }
                }
                i11 = i4;
                i12 = i3 & 256;
                if (i12 == 0) {
                }
                i13 = i12;
                i14 = i3 & 512;
                if (i14 != 0) {
                }
                i15 = i14;
                i16 = i3 & 1024;
                if (i16 == 0) {
                }
                i17 = i3 & 2048;
                if (i17 == 0) {
                }
                int i34222 = i33;
                i19 = i3 & 4096;
                if (i19 == 0) {
                }
                z5 = z3;
                i20 = i3 & 8192;
                if (i20 != 0) {
                }
                i22 = i3 & 16384;
                if (i22 != 0) {
                }
                i23 = i21;
                i24 = i3 & 32768;
                if (i24 == 0) {
                }
                i25 = i3 & 65536;
                if (i25 == 0) {
                }
                i26 = i3 & 131072;
                if (i26 == 0) {
                }
                i27 = i3 & 262144;
                if (i27 == 0) {
                }
                i28 = i3 & 524288;
                if (i28 != 0) {
                }
                i23 |= i31;
                int i36222222 = i23;
                if (i16 == 1024) {
                }
                composerStartRestartGroup.startDefaults();
                if ((i & 1) == 0) {
                }
                scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
                if (scopeUpdateScopeEndRestartGroup == null) {
                }
            }
            f4 = f;
            i6 = i3 & 8;
            if (i6 != 0) {
            }
            i7 = i3 & 16;
            if (i7 != 0) {
            }
            i8 = i3 & 32;
            if (i8 != 0) {
            }
            i9 = i3 & 64;
            if (i9 != 0) {
            }
            i10 = i3 & 128;
            if (i10 != 0) {
            }
            i11 = i4;
            i12 = i3 & 256;
            if (i12 == 0) {
            }
            i13 = i12;
            i14 = i3 & 512;
            if (i14 != 0) {
            }
            i15 = i14;
            i16 = i3 & 1024;
            if (i16 == 0) {
            }
            i17 = i3 & 2048;
            if (i17 == 0) {
            }
            int i342222 = i33;
            i19 = i3 & 4096;
            if (i19 == 0) {
            }
            z5 = z3;
            i20 = i3 & 8192;
            if (i20 != 0) {
            }
            i22 = i3 & 16384;
            if (i22 != 0) {
            }
            i23 = i21;
            i24 = i3 & 32768;
            if (i24 == 0) {
            }
            i25 = i3 & 65536;
            if (i25 == 0) {
            }
            i26 = i3 & 131072;
            if (i26 == 0) {
            }
            i27 = i3 & 262144;
            if (i27 == 0) {
            }
            i28 = i3 & 524288;
            if (i28 != 0) {
            }
            i23 |= i31;
            int i362222222 = i23;
            if (i16 == 1024) {
            }
            composerStartRestartGroup.startDefaults();
            if ((i & 1) == 0) {
            }
            scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
            if (scopeUpdateScopeEndRestartGroup == null) {
            }
        }
        str4 = str;
        i5 = i3 & 4;
        if (i5 == 0) {
        }
        f4 = f;
        i6 = i3 & 8;
        if (i6 != 0) {
        }
        i7 = i3 & 16;
        if (i7 != 0) {
        }
        i8 = i3 & 32;
        if (i8 != 0) {
        }
        i9 = i3 & 64;
        if (i9 != 0) {
        }
        i10 = i3 & 128;
        if (i10 != 0) {
        }
        i11 = i4;
        i12 = i3 & 256;
        if (i12 == 0) {
        }
        i13 = i12;
        i14 = i3 & 512;
        if (i14 != 0) {
        }
        i15 = i14;
        i16 = i3 & 1024;
        if (i16 == 0) {
        }
        i17 = i3 & 2048;
        if (i17 == 0) {
        }
        int i3422222 = i33;
        i19 = i3 & 4096;
        if (i19 == 0) {
        }
        z5 = z3;
        i20 = i3 & 8192;
        if (i20 != 0) {
        }
        i22 = i3 & 16384;
        if (i22 != 0) {
        }
        i23 = i21;
        i24 = i3 & 32768;
        if (i24 == 0) {
        }
        i25 = i3 & 65536;
        if (i25 == 0) {
        }
        i26 = i3 & 131072;
        if (i26 == 0) {
        }
        i27 = i3 & 262144;
        if (i27 == 0) {
        }
        i28 = i3 & 524288;
        if (i28 != 0) {
        }
        i23 |= i31;
        int i3622222222 = i23;
        if (i16 == 1024) {
        }
        composerStartRestartGroup.startDefaults();
        if ((i & 1) == 0) {
        }
        scopeUpdateScopeEndRestartGroup = composer2.endRestartGroup();
        if (scopeUpdateScopeEndRestartGroup == null) {
        }
    }
}
