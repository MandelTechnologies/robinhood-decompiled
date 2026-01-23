package com.robinhood.android.transfers.p271ui.max.wires;

import com.robinhood.android.transfers.C30065R;
import com.robinhood.android.transfers.p271ui.max.wires.models.ConfirmModeDisplayInfo;
import com.robinhood.android.transfers.p271ui.max.wires.models.DetailItem;
import com.robinhood.android.transfers.p271ui.max.wires.models.SectionInfo;
import com.robinhood.utils.resource.StringResource;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;

/* compiled from: WireRoutingDetailsInputStateProvider.kt */
@Metadata(m3635d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u0012\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u0002¨\u0006\u0004"}, m3636d2 = {"getConfirmModeDisplayInfo", "Lcom/robinhood/android/transfers/ui/max/wires/models/ConfirmModeDisplayInfo;", "dataState", "Lcom/robinhood/android/transfers/ui/max/wires/WireRoutingDetailsInputDataState;", "feature-transfers_externalRelease"}, m3637k = 2, m3638mv = {2, 1, 0}, m3640xi = 48)
/* renamed from: com.robinhood.android.transfers.ui.max.wires.WireRoutingDetailsInputStateProviderKt, reason: use source file name */
/* loaded from: classes9.dex */
public final class WireRoutingDetailsInputStateProvider2 {
    /* JADX INFO: Access modifiers changed from: private */
    public static final ConfirmModeDisplayInfo getConfirmModeDisplayInfo(WireRoutingDetailsInputDataState wireRoutingDetailsInputDataState) {
        if (wireRoutingDetailsInputDataState.getConfirmModeData() == null || wireRoutingDetailsInputDataState.getRoutingNumber() == null || wireRoutingDetailsInputDataState.getAccountNumber() == null || wireRoutingDetailsInputDataState.getMode() != WireRoutingDetailsInputDataState3.CONFIRM_INFORMATION) {
            return null;
        }
        StringResource.Companion companion = StringResource.INSTANCE;
        return new ConfirmModeDisplayInfo(companion.invoke(C30065R.string.wire_routing_number_input_confirm_mode_title_outgoing_wire_v2, new Object[0]), wireRoutingDetailsInputDataState.getConfirmModeData().getDetailsConfirmed(), false, wireRoutingDetailsInputDataState.getConfirmModeData().getDetailsConfirmed(), CollectionsKt.listOf((Object[]) new SectionInfo[]{new SectionInfo(companion.invoke(C30065R.string.wire_routing_input_confirm_mode_bank_info, new Object[0]), CollectionsKt.listOf((Object[]) new DetailItem[]{new DetailItem(companion.invoke(C30065R.string.wire_routing_input_confirm_mode_bank_name_small_header, new Object[0]), companion.invoke(wireRoutingDetailsInputDataState.getConfirmModeData().getTemporaryBankName())), new DetailItem(companion.invoke(C30065R.string.wire_routing_input_confirm_mode_bank_name_small_routing_number, new Object[0]), companion.invoke(wireRoutingDetailsInputDataState.getRoutingNumber())), new DetailItem(companion.invoke(C30065R.string.wire_routing_input_confirm_mode_bank_name_small_account_number, new Object[0]), companion.invoke(wireRoutingDetailsInputDataState.getAccountNumber()))})), new SectionInfo(companion.invoke(C30065R.string.wire_routing_input_confirm_mode_recipient_info, new Object[0]), CollectionsKt.listOf((Object[]) new DetailItem[]{new DetailItem(companion.invoke(C30065R.string.wire_routing_input_confirm_mode_recipient_info_name_small_header, new Object[0]), companion.invoke(wireRoutingDetailsInputDataState.getConfirmModeData().getUsername())), new DetailItem(companion.invoke(C30065R.string.f4997xf074b7e6, new Object[0]), companion.invoke(wireRoutingDetailsInputDataState.getConfirmModeData().getAddress()))}))}));
    }
}
