package com.robinhood.android.beneficiaries.p067ui.introflow.role;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryFlowBeneficiaryRoleViewModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;
import rh_server_driven_ui.p531v1.UIComponent;
import rh_server_driven_ui.p531v1.UIComponentDto;

/* compiled from: BeneficiaryRoleViewState.kt */
@Metadata(m3635d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0017\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\t8F¢\u0006\u0006\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/role/BeneficiaryRoleViewState;", "", "beneficiaryRoleViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;)V", "getBeneficiaryRoleViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryFlowBeneficiaryRoleViewModel;", "sduiComponents", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "getSduiComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryRoleViewState {
    public static final int $stable = 8;
    private final BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel;

    public static /* synthetic */ BeneficiaryRoleViewState copy$default(BeneficiaryRoleViewState beneficiaryRoleViewState, BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryFlowBeneficiaryRoleViewModel, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryFlowBeneficiaryRoleViewModel = beneficiaryRoleViewState.beneficiaryRoleViewModel;
        }
        return beneficiaryRoleViewState.copy(beneficiaryFlowBeneficiaryRoleViewModel);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryFlowBeneficiaryRoleViewModel getBeneficiaryRoleViewModel() {
        return this.beneficiaryRoleViewModel;
    }

    public final BeneficiaryRoleViewState copy(BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel) {
        Intrinsics.checkNotNullParameter(beneficiaryRoleViewModel, "beneficiaryRoleViewModel");
        return new BeneficiaryRoleViewState(beneficiaryRoleViewModel);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof BeneficiaryRoleViewState) && Intrinsics.areEqual(this.beneficiaryRoleViewModel, ((BeneficiaryRoleViewState) other).beneficiaryRoleViewModel);
    }

    public int hashCode() {
        return this.beneficiaryRoleViewModel.hashCode();
    }

    public String toString() {
        return "BeneficiaryRoleViewState(beneficiaryRoleViewModel=" + this.beneficiaryRoleViewModel + ")";
    }

    public BeneficiaryRoleViewState(BeneficiaryFlowBeneficiaryRoleViewModel beneficiaryRoleViewModel) {
        Intrinsics.checkNotNullParameter(beneficiaryRoleViewModel, "beneficiaryRoleViewModel");
        this.beneficiaryRoleViewModel = beneficiaryRoleViewModel;
    }

    public final BeneficiaryFlowBeneficiaryRoleViewModel getBeneficiaryRoleViewModel() {
        return this.beneficiaryRoleViewModel;
    }

    public final ImmutableList<UIComponentDto.ConcreteDto> getSduiComponents() {
        List<UIComponent> footer_components = this.beneficiaryRoleViewModel.getFooter_components();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = footer_components.iterator();
        while (it.hasNext()) {
            UIComponentDto.ConcreteDto concreteDtoFromProto = UIComponentDto.ConcreteDto.INSTANCE.fromProto((UIComponent) it.next());
            if (concreteDtoFromProto != null) {
                arrayList.add(concreteDtoFromProto);
            }
        }
        return extensions2.toImmutableList(arrayList);
    }
}
