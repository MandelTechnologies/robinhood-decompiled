package com.robinhood.android.beneficiaries.p067ui.introflow.info;

import bonfire.proto.idl.beneficiaries.p031v1.BeneficiaryInfoViewModel;
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

/* compiled from: BeneficiaryInfoViewState.kt */
@Metadata(m3635d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8F¢\u0006\u0006\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001a"}, m3636d2 = {"Lcom/robinhood/android/beneficiaries/ui/introflow/info/BeneficiaryInfoViewState;", "", "infoViewModel", "Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "bottomButtonText", "", "<init>", "(Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;Ljava/lang/String;)V", "getInfoViewModel", "()Lbonfire/proto/idl/beneficiaries/v1/BeneficiaryInfoViewModel;", "getBottomButtonText", "()Ljava/lang/String;", "sduiComponents", "Lkotlinx/collections/immutable/ImmutableList;", "Lrh_server_driven_ui/v1/UIComponentDto$ConcreteDto;", "getSduiComponents", "()Lkotlinx/collections/immutable/ImmutableList;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-beneficiaries_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes7.dex */
public final /* data */ class BeneficiaryInfoViewState {
    public static final int $stable = 8;
    private final String bottomButtonText;
    private final BeneficiaryInfoViewModel infoViewModel;

    public static /* synthetic */ BeneficiaryInfoViewState copy$default(BeneficiaryInfoViewState beneficiaryInfoViewState, BeneficiaryInfoViewModel beneficiaryInfoViewModel, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            beneficiaryInfoViewModel = beneficiaryInfoViewState.infoViewModel;
        }
        if ((i & 2) != 0) {
            str = beneficiaryInfoViewState.bottomButtonText;
        }
        return beneficiaryInfoViewState.copy(beneficiaryInfoViewModel, str);
    }

    /* renamed from: component1, reason: from getter */
    public final BeneficiaryInfoViewModel getInfoViewModel() {
        return this.infoViewModel;
    }

    /* renamed from: component2, reason: from getter */
    public final String getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final BeneficiaryInfoViewState copy(BeneficiaryInfoViewModel infoViewModel, String bottomButtonText) {
        Intrinsics.checkNotNullParameter(infoViewModel, "infoViewModel");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        return new BeneficiaryInfoViewState(infoViewModel, bottomButtonText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeneficiaryInfoViewState)) {
            return false;
        }
        BeneficiaryInfoViewState beneficiaryInfoViewState = (BeneficiaryInfoViewState) other;
        return Intrinsics.areEqual(this.infoViewModel, beneficiaryInfoViewState.infoViewModel) && Intrinsics.areEqual(this.bottomButtonText, beneficiaryInfoViewState.bottomButtonText);
    }

    public int hashCode() {
        return (this.infoViewModel.hashCode() * 31) + this.bottomButtonText.hashCode();
    }

    public String toString() {
        return "BeneficiaryInfoViewState(infoViewModel=" + this.infoViewModel + ", bottomButtonText=" + this.bottomButtonText + ")";
    }

    public BeneficiaryInfoViewState(BeneficiaryInfoViewModel infoViewModel, String bottomButtonText) {
        Intrinsics.checkNotNullParameter(infoViewModel, "infoViewModel");
        Intrinsics.checkNotNullParameter(bottomButtonText, "bottomButtonText");
        this.infoViewModel = infoViewModel;
        this.bottomButtonText = bottomButtonText;
    }

    public final BeneficiaryInfoViewModel getInfoViewModel() {
        return this.infoViewModel;
    }

    public final String getBottomButtonText() {
        return this.bottomButtonText;
    }

    public final ImmutableList<UIComponentDto.ConcreteDto> getSduiComponents() {
        List<UIComponent> components = this.infoViewModel.getComponents();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = components.iterator();
        while (it.hasNext()) {
            UIComponentDto.ConcreteDto concreteDtoFromProto = UIComponentDto.ConcreteDto.INSTANCE.fromProto((UIComponent) it.next());
            if (concreteDtoFromProto != null) {
                arrayList.add(concreteDtoFromProto);
            }
        }
        return extensions2.toImmutableList(arrayList);
    }
}
