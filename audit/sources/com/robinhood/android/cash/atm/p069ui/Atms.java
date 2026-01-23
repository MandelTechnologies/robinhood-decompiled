package com.robinhood.android.cash.atm.p069ui;

import android.content.res.Resources;
import android.location.Location;
import com.robinhood.android.cash.atm.C9956R;
import com.robinhood.models.api.minerva.Atm;
import java.text.NumberFormat;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.math.MathKt;

/* compiled from: Atms.kt */
@Metadata(m3635d1 = {"\u0000(\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0007*\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0003\u001a\n \u0005*\u0004\u0018\u00010\u00040\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, m3636d2 = {"FEET_PER_MILE", "", "FEET_PER_METER", "numberFormat", "Ljava/text/NumberFormat;", "kotlin.jvm.PlatformType", "getDistanceLabel", "", "Lcom/robinhood/models/api/minerva/Atm;", "userLocation", "Landroid/location/Location;", "res", "Landroid/content/res/Resources;", "feature-cash-atm_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.cash.atm.ui.AtmsKt, reason: use source file name */
/* loaded from: classes7.dex */
public final class Atms {
    private static final float FEET_PER_METER = 3.28084f;
    private static final float FEET_PER_MILE = 5280.0f;
    private static final NumberFormat numberFormat;

    static {
        NumberFormat numberFormat2 = NumberFormat.getInstance();
        numberFormat2.setMaximumFractionDigits(1);
        numberFormat = numberFormat2;
    }

    public static final CharSequence getDistanceLabel(Atm atm, Location location, Resources res) {
        Intrinsics.checkNotNullParameter(atm, "<this>");
        Intrinsics.checkNotNullParameter(res, "res");
        if (location == null) {
            return null;
        }
        Location location2 = new Location("");
        location2.setLatitude(atm.getLocation().getLatitude());
        location2.setLongitude(atm.getLocation().getLongitude());
        float fDistanceTo = location.distanceTo(location2) * FEET_PER_METER;
        if (fDistanceTo > 500.0f) {
            return res.getString(C9956R.string.atm_detail_distance_miles, numberFormat.format(Float.valueOf(fDistanceTo / FEET_PER_MILE)));
        }
        return res.getString(C9956R.string.atm_detail_distance_feet, numberFormat.format(Integer.valueOf(MathKt.roundToInt(fDistanceTo))));
    }
}
