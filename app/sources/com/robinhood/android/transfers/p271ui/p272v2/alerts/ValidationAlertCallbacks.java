package com.robinhood.android.transfers.p271ui.p272v2.alerts;

import bff_money_movement.service.p019v1.TransferActionDto;
import kotlin.Metadata;

/* compiled from: ValidationAlertCallbacks.kt */
@Metadata(m3635d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0018\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\bH&¨\u0006\t"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/v2/alerts/ValidationAlertCallbacks;", "", "onDismiss", "", "leavingEditMode", "", "onAlertSelected", "action", "Lbff_money_movement/service/v1/TransferActionDto;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* loaded from: classes9.dex */
public interface ValidationAlertCallbacks {
    void onAlertSelected(boolean leavingEditMode, TransferActionDto action);

    void onDismiss(boolean leavingEditMode);
}
