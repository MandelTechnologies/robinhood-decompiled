package com.robinhood.android.support.call.extensions;

import com.robinhood.android.libdesignsystem.C20690R;
import com.robinhood.android.support.call.channelavailability.ChannelAvailabilityActionData;
import com.robinhood.android.support.call.channelavailability.UnavailableChannelData;
import com.robinhood.models.api.AlertButtonStyle;
import com.robinhood.models.p355ui.AlertButtonDetails;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;

/* compiled from: UnavailableChannelDatas.kt */
@Metadata(m3635d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\u0010\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003¨\u0006\u0004"}, m3636d2 = {"toButtonDataList", "", "Lcom/robinhood/android/support/call/channelavailability/ChannelAvailabilityActionData;", "Lcom/robinhood/android/support/call/channelavailability/UnavailableChannelData;", "feature-support_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* renamed from: com.robinhood.android.support.call.extensions.UnavailableChannelDatasKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class UnavailableChannelDatas {

    /* compiled from: UnavailableChannelDatas.kt */
    @Metadata(m3637k = 3, m3638mv = {2, 1, 0}, m3640xi = 48)
    /* renamed from: com.robinhood.android.support.call.extensions.UnavailableChannelDatasKt$WhenMappings */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[AlertButtonStyle.values().length];
            try {
                iArr[AlertButtonStyle.GHOST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlertButtonStyle.FILLED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlertButtonStyle.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final List<ChannelAvailabilityActionData> toButtonDataList(UnavailableChannelData unavailableChannelData) {
        int i;
        Intrinsics.checkNotNullParameter(unavailableChannelData, "<this>");
        List<AlertButtonDetails> buttons = unavailableChannelData.getAlertDetails().getButtons();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(buttons, 10));
        for (AlertButtonDetails alertButtonDetails : buttons) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[alertButtonDetails.getStyle().ordinal()];
            if (i2 == 1) {
                i = C20690R.attr.secondaryMonochromeButtonStyle;
            } else {
                if (i2 != 2 && i2 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                i = C20690R.attr.primaryMonochromeButtonStyle;
            }
            arrayList.add(new ChannelAvailabilityActionData(alertButtonDetails.getText(), i, alertButtonDetails.getAction(), unavailableChannelData.getReason()));
        }
        return arrayList;
    }
}
