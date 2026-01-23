package com.robinhood.android.odyssey.lib.bottomsheet;

import android.os.Bundle;
import android.view.View;
import com.robinhood.android.common.p088ui.ViewBinding5;
import com.robinhood.android.common.util.extensions.BaseBottomSheetDialogFragments;
import com.robinhood.android.designsystem.pog.RdsPogView;
import com.robinhood.android.lib.odyssey.C20335R;
import com.robinhood.android.lib.odyssey.databinding.FragmentBottomSheetInformationalListBinding;
import com.robinhood.android.odyssey.lib.template.TemplateUtil;
import com.robinhood.android.odyssey.lib.view.SdInformationalRowContainer;
import com.robinhood.models.api.serverdrivenui.bottomsheet.ApiSdInformationalListBottomSheet;
import com.robinhood.models.api.serverdrivenui.component.ApiSdInformationalRowComponent;
import com.robinhood.models.api.serverdrivenui.component.ApiSdPictogramPog;
import com.robinhood.utils.p409ui.view.FocusSafeNestedScrollView;
import com.robinhood.websocket.gateway.WebsocketGatewayConstants;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.properties.Interfaces2;
import kotlin.reflect.KProperty;

/* compiled from: SdInformationalListBottomSheet.kt */
@Metadata(m3635d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u001a\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0012\u001a\u00020\u0002H\u0016R\u001b\u0010\u0005\u001a\u00020\u00068BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\t\u0010\n\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, m3636d2 = {"Lcom/robinhood/android/odyssey/lib/bottomsheet/SdInformationalListBottomSheet;", "Lcom/robinhood/android/odyssey/lib/bottomsheet/SdBaseBottomSheet;", "Lcom/robinhood/models/api/serverdrivenui/bottomsheet/ApiSdInformationalListBottomSheet;", "<init>", "()V", "binding", "Lcom/robinhood/android/lib/odyssey/databinding/FragmentBottomSheetInformationalListBinding;", "getBinding", "()Lcom/robinhood/android/lib/odyssey/databinding/FragmentBottomSheetInformationalListBinding;", "binding$delegate", "Lkotlin/properties/ReadOnlyProperty;", "onViewCreated", "", "view", "Landroid/view/View;", "savedInstanceState", "Landroid/os/Bundle;", "bind", WebsocketGatewayConstants.DATA_KEY, "feature-lib-odyssey_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes10.dex */
public final class SdInformationalListBottomSheet extends SdBaseBottomSheet<ApiSdInformationalListBottomSheet> {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SdInformationalListBottomSheet.class, "binding", "getBinding()Lcom/robinhood/android/lib/odyssey/databinding/FragmentBottomSheetInformationalListBinding;", 0))};
    public static final int $stable = 8;

    /* renamed from: binding$delegate, reason: from kotlin metadata */
    private final Interfaces2 binding;

    public SdInformationalListBottomSheet() {
        super(C20335R.layout.fragment_bottom_sheet_informational_list);
        this.binding = ViewBinding5.viewBinding(this, SdInformationalListBottomSheet2.INSTANCE);
    }

    private final FragmentBottomSheetInformationalListBinding getBinding() {
        Object value = this.binding.getValue(this, $$delegatedProperties[0]);
        Intrinsics.checkNotNullExpressionValue(value, "getValue(...)");
        return (FragmentBottomSheetInformationalListBinding) value;
    }

    @Override // com.robinhood.android.odyssey.lib.bottomsheet.SdBaseBottomSheet, com.robinhood.android.common.p088ui.BaseBottomSheetDialogFragment, com.robinhood.android.common.p088ui.BaseDialogFragment, androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle savedInstanceState) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, savedInstanceState);
        FocusSafeNestedScrollView sdInformationalListScroll = getBinding().sdInformationalListScroll;
        Intrinsics.checkNotNullExpressionValue(sdInformationalListScroll, "sdInformationalListScroll");
        BaseBottomSheetDialogFragments.enforceMaxHeight(this, sdInformationalListScroll, 0.6f);
    }

    @Override // com.robinhood.android.odyssey.lib.bottomsheet.SdBaseBottomSheet
    public void bind(ApiSdInformationalListBottomSheet data) throws IllegalArgumentException {
        Intrinsics.checkNotNullParameter(data, "data");
        FragmentBottomSheetInformationalListBinding binding = getBinding();
        if (data.getComponents().getContent() == null) {
            SdInformationalRowContainer sdInformationalListContainer = binding.sdInformationalListContainer;
            Intrinsics.checkNotNullExpressionValue(sdInformationalListContainer, "sdInformationalListContainer");
            sdInformationalListContainer.setVisibility(4);
        }
        ApiSdInformationalListBottomSheet.Components components = data.getComponents();
        ApiSdPictogramPog pog = components.getPog();
        ApiSdPictogramPog.Data data2 = pog != null ? pog.getData() : null;
        if (data2 == null) {
            RdsPogView pogView = binding.pogView;
            Intrinsics.checkNotNullExpressionValue(pogView, "pogView");
            pogView.setVisibility(8);
        } else {
            RdsPogView pogView2 = binding.pogView;
            Intrinsics.checkNotNullExpressionValue(pogView2, "pogView");
            pogView2.setVisibility(0);
            binding.pogView.setPictogram(getResources().getDrawable(data2.getPictogram().getResourceId(), null));
            binding.pogView.setHero(data2.getSize().isHero());
        }
        TemplateUtil.bindOnNotNull(binding.sdInformationalListTitle, components.getTitle());
        TemplateUtil.bindOnNotNull(binding.sdInformationalListSubtitle, components.getSubtitle());
        List<ApiSdInformationalRowComponent> content = components.getContent();
        if (content != null) {
            binding.sdInformationalListContainer.bindList(content);
        }
        TemplateUtil.bindOnNotNull(binding.sdInformationalListDisclosure, components.getDisclosure());
        TemplateUtil.bindOnNotNull(binding.sdInformationalListPrimaryCta, components.getPrimary_cta());
        TemplateUtil.bindOnNotNull(binding.sdInformationalListSecondaryCta, components.getSecondary_cta());
    }
}
