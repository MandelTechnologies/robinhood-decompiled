package com.robinhood.android.optionschain;

import com.robinhood.models.api.simulatedreturns.ApiOptionSimulatedReturnsConfigurationV3Request;
import com.robinhood.models.p355ui.OptionLegBundle;
import com.robinhood.models.p355ui.OptionOrderBundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.extensions2;

/* compiled from: OptionEditLegRatioViewState.kt */
@Metadata(m3635d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000e\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0004J\u000e\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u000f\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\u0018\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\n2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0004HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\f\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u000e\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0011\u0010\u0010\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001d"}, m3636d2 = {"Lcom/robinhood/android/optionschain/OptionEditLegRatioViewState;", "", "editedLegRatios", "", "", "<init>", "(Ljava/util/List;)V", "getEditedLegRatios", "()Ljava/util/List;", "isAllSameNonOneRatio", "", "()Z", "hasZeroRatio", "getHasZeroRatio", "showRatioLimitErrorDialog", "getShowRatioLimitErrorDialog", "isSubmitButtomEnabled", "getEditedRatioString", "", ApiOptionSimulatedReturnsConfigurationV3Request.ApiOptionUnderlying.TYPE_INDEX, "getEditedOptionOrderBundle", "Lcom/robinhood/models/ui/OptionOrderBundle;", "originalBundle", "component1", "copy", "equals", "other", "hashCode", "toString", "feature-options-chain_externalDebug"}, m3637k = 1, m3638mv = {2, 1, 0}, m3640xi = 48)
@SourceDebugExtension
/* loaded from: classes11.dex */
public final /* data */ class OptionEditLegRatioViewState {
    public static final int $stable = 8;
    private final List<Integer> editedLegRatios;
    private final boolean hasZeroRatio;
    private final boolean isAllSameNonOneRatio;
    private final boolean isSubmitButtomEnabled;
    private final boolean showRatioLimitErrorDialog;

    /* JADX WARN: Multi-variable type inference failed */
    public OptionEditLegRatioViewState() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ OptionEditLegRatioViewState copy$default(OptionEditLegRatioViewState optionEditLegRatioViewState, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            list = optionEditLegRatioViewState.editedLegRatios;
        }
        return optionEditLegRatioViewState.copy(list);
    }

    public final List<Integer> component1() {
        return this.editedLegRatios;
    }

    public final OptionEditLegRatioViewState copy(List<Integer> editedLegRatios) {
        Intrinsics.checkNotNullParameter(editedLegRatios, "editedLegRatios");
        return new OptionEditLegRatioViewState(editedLegRatios);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof OptionEditLegRatioViewState) && Intrinsics.areEqual(this.editedLegRatios, ((OptionEditLegRatioViewState) other).editedLegRatios);
    }

    public int hashCode() {
        return this.editedLegRatios.hashCode();
    }

    public String toString() {
        return "OptionEditLegRatioViewState(editedLegRatios=" + this.editedLegRatios + ")";
    }

    public OptionEditLegRatioViewState(List<Integer> editedLegRatios) {
        boolean z;
        boolean z2;
        Intrinsics.checkNotNullParameter(editedLegRatios, "editedLegRatios");
        this.editedLegRatios = editedLegRatios;
        Object objSingleOrNull = CollectionsKt.singleOrNull((List<? extends Object>) CollectionsKt.distinct(editedLegRatios));
        Integer num = (Integer) objSingleOrNull;
        boolean z3 = true;
        if (num != null && num.intValue() == 1) {
            objSingleOrNull = null;
        }
        this.isAllSameNonOneRatio = objSingleOrNull != null;
        List<Integer> list = editedLegRatios;
        if ((list instanceof Collection) && list.isEmpty()) {
            z = false;
        } else {
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                if (((Number) it.next()).intValue() == 0) {
                    z = true;
                    break;
                }
            }
            z = false;
        }
        this.hasZeroRatio = z;
        List<Integer> list2 = this.editedLegRatios;
        if ((list2 instanceof Collection) && list2.isEmpty()) {
            z2 = false;
        } else {
            Iterator<T> it2 = list2.iterator();
            while (it2.hasNext()) {
                if (((Number) it2.next()).intValue() > 9) {
                    z2 = true;
                    break;
                }
            }
            z2 = false;
        }
        this.showRatioLimitErrorDialog = z2;
        List<Integer> list3 = this.editedLegRatios;
        if (!(list3 instanceof Collection) || !list3.isEmpty()) {
            Iterator<T> it3 = list3.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    break;
                } else if (((Number) it3.next()).intValue() == -1) {
                    z3 = false;
                    break;
                }
            }
        }
        this.isSubmitButtomEnabled = z3;
    }

    public /* synthetic */ OptionEditLegRatioViewState(List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<Integer> getEditedLegRatios() {
        return this.editedLegRatios;
    }

    /* renamed from: isAllSameNonOneRatio, reason: from getter */
    public final boolean getIsAllSameNonOneRatio() {
        return this.isAllSameNonOneRatio;
    }

    public final boolean getHasZeroRatio() {
        return this.hasZeroRatio;
    }

    public final boolean getShowRatioLimitErrorDialog() {
        return this.showRatioLimitErrorDialog;
    }

    /* renamed from: isSubmitButtomEnabled, reason: from getter */
    public final boolean getIsSubmitButtomEnabled() {
        return this.isSubmitButtomEnabled;
    }

    public final String getEditedRatioString(int index) {
        Integer num = this.editedLegRatios.get(index);
        if (num.intValue() < 0) {
            num = null;
        }
        Integer num2 = num;
        String string2 = num2 != null ? num2.toString() : null;
        return string2 == null ? "" : string2;
    }

    public final OptionOrderBundle getEditedOptionOrderBundle(OptionOrderBundle originalBundle) {
        Intrinsics.checkNotNullParameter(originalBundle, "originalBundle");
        ImmutableList<OptionLegBundle> legBundles = originalBundle.getLegBundles();
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(legBundles, 10));
        int i = 0;
        for (OptionLegBundle optionLegBundle : legBundles) {
            int i2 = i + 1;
            if (i < 0) {
                CollectionsKt.throwIndexOverflow();
            }
            arrayList.add(OptionLegBundle.copy$default(optionLegBundle, null, null, this.editedLegRatios.get(i).intValue(), 3, null));
            i = i2;
        }
        return OptionOrderBundle.copy$default(originalBundle, null, extensions2.toPersistentList(arrayList), null, null, null, null, 61, null);
    }
}
