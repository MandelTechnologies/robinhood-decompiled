package com.robinhood.android.transfers.p271ui.max.iradistribution;

import com.robinhood.android.libdesignsystem.serverui.experimental.compose.SduiActionHandler;
import com.robinhood.models.api.bonfire.IraDistributionType;
import com.robinhood.models.serverdriven.experimental.api.GenericAction;
import kotlin.Metadata;

/* compiled from: IraDistributionQuestionnaireDistributionTypeScreen.kt */
@Metadata(m3635d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H&¨\u0006\u0007"}, m3636d2 = {"Lcom/robinhood/android/transfers/ui/max/iradistribution/IraDistributionQuestionnaireDistributionTypeCallbacks;", "Lcom/robinhood/android/libdesignsystem/serverui/experimental/compose/ActionHandler;", "Lcom/robinhood/models/serverdriven/experimental/api/GenericAction;", "onDistributionTypeSelected", "", "distributionType", "Lcom/robinhood/models/api/bonfire/IraDistributionType;", "feature-transfers_externalRelease"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.iradistribution.IraDistributionQuestionnaireDistributionTypeCallbacks, reason: use source file name */
/* loaded from: classes9.dex */
public interface IraDistributionQuestionnaireDistributionTypeScreen extends SduiActionHandler<GenericAction> {
    void onDistributionTypeSelected(IraDistributionType distributionType);
}
