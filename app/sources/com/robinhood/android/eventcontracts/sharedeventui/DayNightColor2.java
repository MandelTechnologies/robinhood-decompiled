package com.robinhood.android.eventcontracts.sharedeventui;

import android.graphics.Color;
import androidx.compose.p011ui.graphics.Color2;
import com.robinhood.android.models.event.p186db.arsenal.EventContract;
import com.robinhood.android.models.event.p186db.predictionmarkets.EcHubLayout;
import com.robinhood.utils.logging.CrashReporter;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import timber.log.Timber;

/* compiled from: DayNightColor.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\f\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"getDayNightColor", "Lcom/robinhood/android/eventcontracts/sharedeventui/DayNightColor;", "Lcom/robinhood/android/models/event/db/arsenal/EventContract;", "Lcom/robinhood/android/models/event/db/predictionmarkets/EcHubLayout$EcHubLayoutComponent$EcHubEventCardComponent$ContractInfo;", "lib-shared-event-ui_externalDebug"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.eventcontracts.sharedeventui.DayNightColorKt, reason: use source file name */
/* loaded from: classes3.dex */
public final class DayNightColor2 {
    public static final DayNightColor getDayNightColor(EventContract eventContract) {
        Intrinsics.checkNotNullParameter(eventContract, "<this>");
        try {
            return new DayNightColor(Color2.Color(Color.parseColor(eventContract.getLightThemeColor())), Color2.Color(Color.parseColor(eventContract.getDarkThemeColor())), null);
        } catch (IllegalArgumentException e) {
            CrashReporter.DefaultImpls.reportNonFatal$default(CrashReporter.INSTANCE, new IllegalArgumentException("Could not parse color. Received " + eventContract.getLightThemeColor() + " for day color and " + eventContract.getDarkThemeColor() + " for night color", e), true, null, 4, null);
            return new DayNightColor(Color2.Color(4278190080L), Color2.Color(4294967295L), null);
        }
    }

    public static final DayNightColor getDayNightColor(EcHubLayout.EcHubLayoutComponent.EcHubEventCardComponent.ContractInfo contractInfo) {
        Intrinsics.checkNotNullParameter(contractInfo, "<this>");
        try {
            String lightHexColor = contractInfo.getLightHexColor();
            if (lightHexColor != null) {
                int color = Color.parseColor(lightHexColor);
                String darkHexColor = contractInfo.getDarkHexColor();
                if (darkHexColor != null) {
                    return new DayNightColor(Color2.Color(color), Color2.Color(Color.parseColor(darkHexColor)), null);
                }
            }
            return null;
        } catch (IllegalArgumentException unused) {
            Timber.INSTANCE.mo3353e("Could not parse color. Received " + contractInfo.getLightHexColor() + " for day color and " + contractInfo.getDarkHexColor() + " for night color", new Object[0]);
            return null;
        }
    }
}
